// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

#include "olap/reader.h"

#include <parallel_hashmap/phmap.h>

#include "common/status.h"
#include "olap/bloom_filter_predicate.h"
#include "olap/collect_iterator.h"
#include "olap/comparison_predicate.h"
#include "olap/in_list_predicate.h"
#include "olap/like_column_predicate.h"
#include "olap/null_predicate.h"
#include "olap/olap_common.h"
#include "olap/predicate_creator.h"
#include "olap/row.h"
#include "olap/row_cursor.h"
#include "olap/schema.h"
#include "olap/tablet.h"
#include "runtime/mem_pool.h"
#include "util/mem_util.hpp"
#include "util/string_util.h"
#include "vec/data_types/data_type_decimal.h"

namespace doris {

void TabletReader::ReaderParams::check_validation() const {
    if (UNLIKELY(version.first == -1)) {
        LOG(FATAL) << "version is not set. tablet=" << tablet->full_name();
    }
}

std::string TabletReader::ReaderParams::to_string() const {
    std::stringstream ss;
    ss << "tablet=" << tablet->full_name() << " reader_type=" << reader_type
       << " aggregation=" << aggregation << " version=" << version
       << " start_key_include=" << start_key_include << " end_key_include=" << end_key_include;

    for (const auto& key : start_key) {
        ss << " keys=" << key;
    }

    for (const auto& key : end_key) {
        ss << " end_keys=" << key;
    }

    for (auto& condition : conditions) {
        ss << " conditions=" << apache::thrift::ThriftDebugString(condition);
    }

    return ss.str();
}

std::string TabletReader::KeysParam::to_string() const {
    std::stringstream ss;
    ss << "start_key_include=" << start_key_include << " end_key_include=" << end_key_include;

    for (auto& start_key : start_keys) {
        ss << " keys=" << start_key.to_string();
    }
    for (auto& end_key : end_keys) {
        ss << " end_keys=" << end_key.to_string();
    }

    return ss.str();
}

TabletReader::~TabletReader() {
    VLOG_NOTICE << "merged rows:" << _merged_rows;
    _conditions.finalize();
    if (!_all_conditions.empty()) {
        _all_conditions.finalize();
    }
    _delete_handler.finalize();

    for (auto pred : _col_predicates) {
        delete pred;
    }
    for (auto pred : _value_col_predicates) {
        delete pred;
    }
}

Status TabletReader::init(const ReaderParams& read_params) {
#ifndef NDEBUG
    _predicate_mem_pool.reset(new MemPool());
#else
    _predicate_mem_pool.reset(new MemPool());
#endif

    Status res = _init_params(read_params);
    if (!res.ok()) {
        LOG(WARNING) << "fail to init reader when init params. res:" << res
                     << ", tablet_id:" << read_params.tablet->tablet_id()
                     << ", schema_hash:" << read_params.tablet->schema_hash()
                     << ", reader type:" << read_params.reader_type
                     << ", version:" << read_params.version;
    }
    return res;
}

// When only one rowset has data, and this rowset is nonoverlapping, we can read directly without aggregation
bool TabletReader::_optimize_for_single_rowset(
        const std::vector<RowsetReaderSharedPtr>& rs_readers) {
    bool has_delete_rowset = false;
    bool has_overlapping = false;
    int nonoverlapping_count = 0;
    for (const auto& rs_reader : rs_readers) {
        if (rs_reader->rowset()->rowset_meta()->delete_flag()) {
            has_delete_rowset = true;
            break;
        }
        if (rs_reader->rowset()->rowset_meta()->num_rows() > 0) {
            if (rs_reader->rowset()->rowset_meta()->is_segments_overlapping()) {
                // when there are overlapping segments, can not do directly read
                has_overlapping = true;
                break;
            } else if (++nonoverlapping_count > 1) {
                break;
            }
        }
    }

    return !has_overlapping && nonoverlapping_count == 1 && !has_delete_rowset;
}

Status TabletReader::_capture_rs_readers(const ReaderParams& read_params,
                                         std::vector<RowsetReaderSharedPtr>* valid_rs_readers) {
    const std::vector<RowsetReaderSharedPtr>* rs_readers = &read_params.rs_readers;
    if (rs_readers->empty()) {
        LOG(WARNING) << "fail to acquire data sources. tablet=" << _tablet->full_name();
        return Status::OLAPInternalError(OLAP_ERR_WRITE_PROTOBUF_ERROR);
    }

    bool eof = false;
    bool is_lower_key_included = _keys_param.start_key_include;
    bool is_upper_key_included = _keys_param.end_key_include;

    for (int i = 0; i < _keys_param.start_keys.size(); ++i) {
        // lower bound
        RowCursor& start_key = _keys_param.start_keys[i];
        RowCursor& end_key = _keys_param.end_keys[i];

        if (!is_lower_key_included) {
            if (compare_row_key(start_key, end_key) >= 0) {
                VLOG_NOTICE << "return EOF when lower key not include"
                            << ", start_key=" << start_key.to_string()
                            << ", end_key=" << end_key.to_string();
                eof = true;
                break;
            }
        } else {
            if (compare_row_key(start_key, end_key) > 0) {
                VLOG_NOTICE << "return EOF when lower key include="
                            << ", start_key=" << start_key.to_string()
                            << ", end_key=" << end_key.to_string();
                eof = true;
                break;
            }
        }

        _is_lower_keys_included.push_back(is_lower_key_included);
        _is_upper_keys_included.push_back(is_upper_key_included);
    }

    if (eof) {
        return Status::OK();
    }

    bool need_ordered_result = true;
    if (read_params.reader_type == READER_QUERY) {
        if (_tablet_schema->keys_type() == DUP_KEYS) {
            // duplicated keys are allowed, no need to merge sort keys in rowset
            need_ordered_result = false;
        }
        if (_tablet_schema->keys_type() == UNIQUE_KEYS &&
            _tablet->enable_unique_key_merge_on_write()) {
            // unique keys with merge on write, no need to merge sort keys in rowset
            need_ordered_result = false;
        }
        if (_aggregation) {
            // compute engine will aggregate rows with the same key,
            // it's ok for rowset to return unordered result
            need_ordered_result = false;
        }

        if (read_params.read_orderby_key) {
            need_ordered_result = true;
        }
    }

    _reader_context.reader_type = read_params.reader_type;
    _reader_context.version = read_params.version;
    _reader_context.tablet_schema = _tablet_schema;
    _reader_context.need_ordered_result = need_ordered_result;
    _reader_context.read_orderby_key_reverse = read_params.read_orderby_key_reverse;
    _reader_context.return_columns = &_return_columns;
    _reader_context.read_orderby_key_columns =
            _orderby_key_columns.size() > 0 ? &_orderby_key_columns : nullptr;
    _reader_context.seek_columns = &_seek_columns;
    _reader_context.load_bf_columns = &_load_bf_columns;
    _reader_context.load_bf_all_columns = &_load_bf_all_columns;
    _reader_context.conditions = &_conditions;
    _reader_context.all_conditions = &_all_conditions;
    _reader_context.predicates = &_col_predicates;
    _reader_context.value_predicates = &_value_col_predicates;
    _reader_context.lower_bound_keys = &_keys_param.start_keys;
    _reader_context.is_lower_keys_included = &_is_lower_keys_included;
    _reader_context.upper_bound_keys = &_keys_param.end_keys;
    _reader_context.is_upper_keys_included = &_is_upper_keys_included;
    _reader_context.delete_handler = &_delete_handler;
    _reader_context.stats = &_stats;
    _reader_context.runtime_state = read_params.runtime_state;
    _reader_context.use_page_cache = read_params.use_page_cache;
    _reader_context.sequence_id_idx = _sequence_col_idx;
    _reader_context.batch_size = _batch_size;
    _reader_context.is_unique = tablet()->keys_type() == UNIQUE_KEYS;
    _reader_context.merged_rows = &_merged_rows;
    _reader_context.delete_bitmap = read_params.delete_bitmap;
    _reader_context.enable_unique_key_merge_on_write = tablet()->enable_unique_key_merge_on_write();
    _reader_context.record_rowids = read_params.record_rowids;

    *valid_rs_readers = *rs_readers;

    return Status::OK();
}

Status TabletReader::_init_params(const ReaderParams& read_params) {
    read_params.check_validation();

    _direct_mode = read_params.direct_mode;
    _aggregation = read_params.aggregation;
    _need_agg_finalize = read_params.need_agg_finalize;
    _reader_type = read_params.reader_type;
    _tablet = read_params.tablet;
    _tablet_schema = read_params.tablet_schema;

    _init_conditions_param(read_params);
    _init_load_bf_columns(read_params);

    Status res = _init_delete_condition(read_params);
    if (!res.ok()) {
        LOG(WARNING) << "fail to init delete param. res = " << res;
        return res;
    }

    res = _init_return_columns(read_params);
    if (!res.ok()) {
        LOG(WARNING) << "fail to init return columns. res = " << res;
        return res;
    }

    res = _init_keys_param(read_params);
    if (!res.ok()) {
        LOG(WARNING) << "fail to init keys param. res=" << res;
        return res;
    }

    res = _init_orderby_keys_param(read_params);
    if (!res.ok()) {
        LOG(WARNING) << "fail to init orderby keys param. res=" << res;
        return res;
    }

    _init_seek_columns();

    if (_tablet_schema->has_sequence_col()) {
        auto sequence_col_idx = _tablet_schema->sequence_col_idx();
        DCHECK_NE(sequence_col_idx, -1);
        for (auto col : _return_columns) {
            // query has sequence col
            if (col == sequence_col_idx) {
                _sequence_col_idx = sequence_col_idx;
                break;
            }
        }
    }

    return res;
}

Status TabletReader::_init_return_columns(const ReaderParams& read_params) {
    if (read_params.reader_type == READER_QUERY) {
        _return_columns = read_params.return_columns;
        _tablet_columns_convert_to_null_set = read_params.tablet_columns_convert_to_null_set;

        if (!_delete_handler.empty()) {
            // We need to fetch columns which there are deletion conditions on them.
            std::set<uint32_t> column_set(_return_columns.begin(), _return_columns.end());
            for (const auto& conds : _delete_handler.get_delete_conditions()) {
                for (const auto& cond_column : conds.del_cond->columns()) {
                    if (column_set.find(cond_column.first) == column_set.end()) {
                        column_set.insert(cond_column.first);
                        _return_columns.push_back(cond_column.first);
                    }
                }
            }
        }
        for (auto id : read_params.return_columns) {
            if (_tablet_schema->column(id).is_key()) {
                _key_cids.push_back(id);
            } else {
                _value_cids.push_back(id);
            }
        }
    } else if (read_params.return_columns.empty()) {
        for (size_t i = 0; i < _tablet_schema->num_columns(); ++i) {
            _return_columns.push_back(i);
            if (_tablet_schema->column(i).is_key()) {
                _key_cids.push_back(i);
            } else {
                _value_cids.push_back(i);
            }
        }
        VLOG_NOTICE << "return column is empty, using full column as default.";
    } else if ((read_params.reader_type == READER_CUMULATIVE_COMPACTION ||
                read_params.reader_type == READER_BASE_COMPACTION ||
                read_params.reader_type == READER_ALTER_TABLE) &&
               !read_params.return_columns.empty()) {
        _return_columns = read_params.return_columns;
        for (auto id : read_params.return_columns) {
            if (_tablet_schema->column(id).is_key()) {
                _key_cids.push_back(id);
            } else {
                _value_cids.push_back(id);
            }
        }
    } else if (read_params.reader_type == READER_CHECKSUM) {
        _return_columns = read_params.return_columns;
        for (auto id : read_params.return_columns) {
            if (_tablet_schema->column(id).is_key()) {
                _key_cids.push_back(id);
            } else {
                _value_cids.push_back(id);
            }
        }
    } else {
        LOG(WARNING) << "fail to init return columns. [reader_type=" << read_params.reader_type
                     << " return_columns_size=" << read_params.return_columns.size() << "]";
        return Status::OLAPInternalError(OLAP_ERR_INPUT_PARAMETER_ERROR);
    }

    std::sort(_key_cids.begin(), _key_cids.end(), std::greater<uint32_t>());

    return Status::OK();
}

void TabletReader::_init_seek_columns() {
    std::unordered_set<uint32_t> column_set(_return_columns.begin(), _return_columns.end());
    for (auto& it : _conditions.columns()) {
        column_set.insert(it.first);
    }
    size_t max_key_column_count = 0;
    for (const auto& key : _keys_param.start_keys) {
        max_key_column_count = std::max(max_key_column_count, key.field_count());
    }
    for (const auto& key : _keys_param.end_keys) {
        max_key_column_count = std::max(max_key_column_count, key.field_count());
    }

    for (size_t i = 0; i < _tablet_schema->num_columns(); i++) {
        if (i < max_key_column_count || column_set.find(i) != column_set.end()) {
            _seek_columns.push_back(i);
        }
    }
}

Status TabletReader::_init_keys_param(const ReaderParams& read_params) {
    if (read_params.start_key.empty()) {
        return Status::OK();
    }

    _keys_param.start_key_include = read_params.start_key_include;
    _keys_param.end_key_include = read_params.end_key_include;

    size_t start_key_size = read_params.start_key.size();
    //_keys_param.start_keys.resize(start_key_size);
    std::vector<RowCursor>(start_key_size).swap(_keys_param.start_keys);

    size_t scan_key_size = read_params.start_key.front().size();
    if (scan_key_size > _tablet_schema->num_columns()) {
        LOG(WARNING)
                << "Input param are invalid. Column count is bigger than num_columns of schema. "
                << "column_count=" << scan_key_size
                << ", schema.num_columns=" << _tablet_schema->num_columns();
        return Status::OLAPInternalError(OLAP_ERR_INPUT_PARAMETER_ERROR);
    }

    std::vector<uint32_t> columns(scan_key_size);
    std::iota(columns.begin(), columns.end(), 0);

    std::shared_ptr<Schema> schema = std::make_shared<Schema>(_tablet_schema->columns(), columns);

    for (size_t i = 0; i < start_key_size; ++i) {
        if (read_params.start_key[i].size() != scan_key_size) {
            LOG(WARNING) << "The start_key.at(" << i
                         << ").size == " << read_params.start_key[i].size() << ", not equals the "
                         << scan_key_size;
            return Status::OLAPInternalError(OLAP_ERR_INPUT_PARAMETER_ERROR);
        }

        Status res = _keys_param.start_keys[i].init_scan_key(
                _tablet_schema, read_params.start_key[i].values(), schema);
        if (!res.ok()) {
            LOG(WARNING) << "fail to init row cursor. res = " << res;
            return res;
        }
        res = _keys_param.start_keys[i].from_tuple(read_params.start_key[i]);
        if (!res.ok()) {
            LOG(WARNING) << "fail to init row cursor from Keys. res=" << res << "key_index=" << i;
            return res;
        }
    }

    size_t end_key_size = read_params.end_key.size();
    //_keys_param.end_keys.resize(end_key_size);
    std::vector<RowCursor>(end_key_size).swap(_keys_param.end_keys);
    for (size_t i = 0; i < end_key_size; ++i) {
        if (read_params.end_key[i].size() != scan_key_size) {
            LOG(WARNING) << "The end_key.at(" << i << ").size == " << read_params.end_key[i].size()
                         << ", not equals the " << scan_key_size;
            return Status::OLAPInternalError(OLAP_ERR_INPUT_PARAMETER_ERROR);
        }

        Status res = _keys_param.end_keys[i].init_scan_key(_tablet_schema,
                                                           read_params.end_key[i].values(), schema);
        if (!res.ok()) {
            LOG(WARNING) << "fail to init row cursor. res = " << res;
            return res;
        }

        res = _keys_param.end_keys[i].from_tuple(read_params.end_key[i]);
        if (!res.ok()) {
            LOG(WARNING) << "fail to init row cursor from Keys. res=" << res << " key_index=" << i;
            return res;
        }
    }

    //TODO:check the valid of start_key and end_key.(eg. start_key <= end_key)

    return Status::OK();
}

Status TabletReader::_init_orderby_keys_param(const ReaderParams& read_params) {
    if (read_params.start_key.empty()) {
        return Status::OK();
    }

    // UNIQUE_KEYS will compare all keys as before
    if (_tablet_schema->keys_type() == DUP_KEYS) {
        // find index in vector _return_columns
        //   for the read_orderby_key_num_prefix_columns orderby keys
        for (uint32_t i = 0; i < read_params.read_orderby_key_num_prefix_columns; i++) {
            for (uint32_t idx = 0; idx < _return_columns.size(); idx++) {
                if (_return_columns[idx] == i) {
                    _orderby_key_columns.push_back(idx);
                    break;
                }
            }
        }
        if (read_params.read_orderby_key_num_prefix_columns != _orderby_key_columns.size()) {
            LOG(WARNING) << "read_orderby_key_num_prefix_columns != _orderby_key_columns.size "
                         << read_params.read_orderby_key_num_prefix_columns << " vs. "
                         << _orderby_key_columns.size();
            return Status::OLAPInternalError(OLAP_ERR_OTHER_ERROR);
        }
    }

    return Status::OK();
}

void TabletReader::_init_conditions_param(const ReaderParams& read_params) {
    _conditions.set_tablet_schema(_tablet_schema);
    _all_conditions.set_tablet_schema(_tablet_schema);
    for (const auto& condition : read_params.conditions) {
        ColumnPredicate* predicate = _parse_to_predicate(condition);
        if (predicate != nullptr) {
            if (_tablet_schema->column(_tablet_schema->field_index(condition.column_name))
                        .aggregation() != FieldAggregationMethod::OLAP_FIELD_AGGREGATION_NONE) {
                _value_col_predicates.push_back(predicate);
            } else {
                _col_predicates.push_back(predicate);
                Status status = _conditions.append_condition(condition);
                DCHECK_EQ(Status::OK(), status);
            }
            Status status = _all_conditions.append_condition(condition);
            DCHECK_EQ(Status::OK(), status);
        }
    }

    // Only key column bloom filter will push down to storage engine
    for (const auto& filter : read_params.bloom_filters) {
        _col_predicates.emplace_back(_parse_to_predicate(filter));
    }

    // Function filter push down to storage engine
    for (const auto& filter : read_params.function_filters) {
        _col_predicates.emplace_back(_parse_to_predicate(filter));
    }
}

ColumnPredicate* TabletReader::_parse_to_predicate(
        const std::pair<std::string, std::shared_ptr<IBloomFilterFuncBase>>& bloom_filter) {
    int32_t index = _tablet_schema->field_index(bloom_filter.first);
    if (index < 0) {
        return nullptr;
    }
    const TabletColumn& column = _tablet_schema->column(index);
    return BloomFilterColumnPredicateFactory::create_column_predicate(index, bloom_filter.second,
                                                                      column.type());
}

ColumnPredicate* TabletReader::_parse_to_predicate(const FunctionFilter& function_filter) {
    int32_t index = _tablet->field_index(function_filter._col_name);
    if (index < 0) {
        return nullptr;
    }

    // currently only support like predicate
    return new LikeColumnPredicate<false>(function_filter._opposite, index, function_filter._fn_ctx,
                                          function_filter._string_param);
}

ColumnPredicate* TabletReader::_parse_to_predicate(const TCondition& condition,
                                                   bool opposite) const {
    // TODO: not equal and not in predicate is not pushed down
    int32_t index = _tablet_schema->field_index(condition.column_name);
    if (index < 0) {
        return nullptr;
    }

    const TabletColumn& column = _tablet_schema->column(index);

    if (to_lower(condition.condition_op) == "is") {
        return new NullPredicate(index, to_lower(condition.condition_values[0]) == "null",
                                 opposite);
    }

    if ((condition.condition_op == "*=" || condition.condition_op == "!*=") &&
        condition.condition_values.size() > 1) {
        decltype(create_list_predicate<PredicateType::UNKNOWN>)* create = nullptr;

        if (condition.condition_op == "*=") {
            create = create_list_predicate<PredicateType::IN_LIST>;
        } else {
            create = create_list_predicate<PredicateType::NOT_IN_LIST>;
        }
        return create(column, index, condition.condition_values, opposite,
                      _predicate_mem_pool.get());
    }

    decltype(create_comparison_predicate<PredicateType::UNKNOWN>)* create = nullptr;
    if (condition.condition_op == "*=" || condition.condition_op == "=") {
        create = create_comparison_predicate<PredicateType::EQ>;
    } else if (condition.condition_op == "!*=" || condition.condition_op == "!=") {
        create = create_comparison_predicate<PredicateType::NE>;
    } else if (condition.condition_op == "<<") {
        create = create_comparison_predicate<PredicateType::LT>;
    } else if (condition.condition_op == "<=") {
        create = create_comparison_predicate<PredicateType::LE>;
    } else if (condition.condition_op == ">>") {
        create = create_comparison_predicate<PredicateType::GT>;
    } else if (condition.condition_op == ">=") {
        create = create_comparison_predicate<PredicateType::GE>;
    }
    return create(column, index, condition.condition_values[0], opposite,
                  _predicate_mem_pool.get());
}
void TabletReader::_init_load_bf_columns(const ReaderParams& read_params) {
    _init_load_bf_columns(read_params, &_conditions, &_load_bf_columns);
    _init_load_bf_columns(read_params, &_all_conditions, &_load_bf_all_columns);
}

void TabletReader::_init_load_bf_columns(const ReaderParams& read_params, Conditions* conditions,
                                         std::set<uint32_t>* load_bf_columns) {
    // add all columns with condition to load_bf_columns
    for (const auto& cond_column : conditions->columns()) {
        int32_t column_id = _tablet_schema->field_index(cond_column.first);
        if (!_tablet_schema->column(column_id).is_bf_column()) {
            continue;
        }
        for (const auto& cond : cond_column.second->conds()) {
            if (cond->op == OP_EQ ||
                (cond->op == OP_IN && cond->operand_set.size() < MAX_OP_IN_FIELD_NUM)) {
                load_bf_columns->insert(column_id);
            }
        }
    }

    // remove columns which have same value between start_key and end_key
    int min_scan_key_len = _tablet_schema->num_columns();
    for (const auto& start_key : read_params.start_key) {
        min_scan_key_len = std::min(min_scan_key_len, static_cast<int>(start_key.size()));
    }
    for (const auto& end_key : read_params.end_key) {
        min_scan_key_len = std::min(min_scan_key_len, static_cast<int>(end_key.size()));
    }

    int max_equal_index = -1;
    for (int i = 0; i < read_params.start_key.size(); ++i) {
        int j = 0;
        for (; j < min_scan_key_len; ++j) {
            if (read_params.start_key[i].get_value(j) != read_params.end_key[i].get_value(j)) {
                break;
            }
        }

        if (max_equal_index < j - 1) {
            max_equal_index = j - 1;
        }
    }

    for (int i = 0; i < max_equal_index; ++i) {
        load_bf_columns->erase(i);
    }

    // remove the max_equal_index column when it's not varchar
    // or longer than number of short key fields
    if (max_equal_index == -1) {
        return;
    }
    FieldType type = _tablet_schema->column(max_equal_index).type();
    if ((type != OLAP_FIELD_TYPE_VARCHAR && type != OLAP_FIELD_TYPE_STRING) ||
        max_equal_index + 1 > _tablet->num_short_key_columns()) {
        load_bf_columns->erase(max_equal_index);
    }
}

Status TabletReader::_init_delete_condition(const ReaderParams& read_params) {
    if (read_params.reader_type == READER_CUMULATIVE_COMPACTION) {
        return Status::OK();
    }
    // Only BASE_COMPACTION need set filter_delete = true
    // other reader type:
    // QUERY will filter the row in query layer to keep right result use where clause.
    // CUMULATIVE_COMPACTION will lost the filter_delete info of base rowset
    if (read_params.reader_type == READER_BASE_COMPACTION) {
        _filter_delete = true;
    }

    return _delete_handler.init(_tablet_schema, read_params.delete_predicates,
                                read_params.version.second, this);
}

} // namespace doris
