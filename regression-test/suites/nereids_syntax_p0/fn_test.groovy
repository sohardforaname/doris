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

import org.slf4j.Logger
import org.slf4j.LoggerFactory

suite("nereids_fn") {
    sql "set enable_nereids_planner=true"
    sql "set enable_fallback_to_original_planner=false"

    final Logger logger = LoggerFactory.getLogger(this.class)

    // ddl begin
    sql "drop table if exists t"

    sql """
        CREATE TABLE IF NOT EXISTS `t` (
            `kbool` boolean null,
            `ktint` tinyint(4) null,
            `ksint` smallint(6) null,
            `kint` int(11) null,
            `kbint` bigint(20) null,
            `klint` largeint(40) null,
            `kfloat` float null,
            `kdbl` double null,
            `kdcmls1` decimal(9, 3) null,
            `kdcmls2` decimal(15, 5) null,
            `kdcmls3` decimal(27, 9) null,
            `kdcmlv3s1` decimalv3(9, 3) null,
            `kdcmlv3s2` decimalv3(15, 5) null,
            `kdcmlv3s3` decimalv3(27, 9) null,
            `kchrs1` char(5) null,
            `kchrs2` char(20) null,
            `kchrs3` char(50) null,
            `kvchrs1` varchar(10) null,
            `kvchrs2` varchar(20) null,
            `kvchrs3` varchar(50) null,
            `kstr` string null,
            `kdt` date null,
            `kdtv2` datev2 null,
            `kdtm` datetime null,
            `kdtmv2s1` datetimev2(0) null,
            `kdtmv2s2` datetimev2(4) null,
            `kdtmv2s3` datetimev2(6) null,
            `kabool` array<boolean> null,
            `katint` array<tinyint> null,
            `kasint` array<smallint> null,
            `kaint` array<int> null,
            `kabint` array<bigint> null,
            `kalint` array<largeint> null,
            `kafloat` array<float> null,
            `kadbl` array<double> null,
            `kadt` array<date> null,
            `kadtm` array<datetime> null,
            `kadtv2` array<datev2> null,
            `kadtmv2` array<datetimev2> null,
            `kachr` array<char> null,
            `kavchr` array<varchar> null,
            `kastr` array<string> null,
            `kadcml` array<decimal> null
        ) engine=olap
        DISTRIBUTED BY HASH(`ktint`) BUCKETS 5
        properties("replication_num" = "1")
    """

    /*sql """
    insert into t values
    (0, 1, 1989, 1001, 11011902, 123.123, true, 1989-03-21, 1989-03-21 13:00:00, wangjuoo4, 0.1, 6.333, string12345, 170141183460469231731687303715884105727),
    (0, 2, 1986, 1001, 11011903, 1243.5, false, 1901-12-31, 1989-03-21 13:00:00, wangynnsf, 20.268, 789.25, string12345, -170141183460469231731687303715884105727),
    (0, 3, 1989, 1002, 11011905, 24453.325, false, 2012-03-14, 2000-01-01 00:00:00, yunlj8@nk, 78945, 3654.0, string12345, 0),
    (0, 4, 1991, 3021, -11011907, 243243.325, false, 3124-10-10, 2015-03-13 10:30:00, yanvjldjlll, 2.06, -0.001, string12345, 20220101),
    (0, 5, 1985, 5014, -11011903, 243.325, true, 2015-01-01, 2015-03-13 12:36:38, du3lnvl, -0.000, -365, string12345, 20220102),
    (0, 6, 32767, 3021, 123456, 604587.000, true, 2014-11-11, 2015-03-13 12:36:38, yanavnd, 0.1, 80699, string12345, 20220104),
    (0, 7, -32767, 1002, 7210457, 3.141, false, 1988-03-21, 1901-01-01 00:00:00, jiw3n4, 0.0, 6058, string12345, -20220101),
    (1, 8, 255, 2147483647, 11011920, -0.123, true, 1989-03-21, 9999-11-11 12:12:00, wangjuoo5, 987456.123, 12.14, string12345, -2022),
    (1, 9, 1991, -2147483647, 11011902, -654.654, true, 1991-08-11, 1989-03-21 13:11:00, wangjuoo4, 0.000, 69.123, string12345, 11011903),
    (1, 10, 1991, 5014, 9223372036854775807, -258.369, false, 2015-04-02, 2013-04-02 15:16:52, wangynnsf, -123456.54, 0.235, string12345, -11011903),
    (1, 11, 1989, 25699, -9223372036854775807, 0.666, true, 2015-04-02, 1989-03-21 13:11:00, yunlj8@nk, -987.001, 4.336, string12345, 1701411834604692317316873037158),
    (1, 12, 32767, -2147483647, 9223372036854775807, 243.325, false, 1991-08-11, 2013-04-02 15:16:52, lifsno, -564.898, 3.141592654, string12345, 1701604692317316873037158),
    (1, 13, -32767, 2147483647, -9223372036854775807, 100.001, false, 2015-04-02, 2015-04-02 00:00:00, wenlsfnl, 123.456, 3.141592653, string12345, 701411834604692317316873037158),
    (1, 14, 255, 103, 11011902, -0.000, false, 2015-04-02, 2015-04-02 00:00:00, , 3.141592654, 2.036, string12345, 701411834604692317316873),
    (1, 15, 1992, 3021, 11011920, 0.00, true, 9999-12-12, 2015-04-02 00:00:00,, 3.141592653, 20.456, string12345, 701411834604692317),
    (null, null, null, null, null, null, null, null, null, null, null, null, null, null)
    """*/
    // ddl end
    
    // function table begin
    // usage: write the new function in the list and construct answer.
    def scalar_function = [
        'abs' : [['double', 'double'], ['float', 'float'], ['largeint', 'largeint'], ['largeint', 'bigint'], ['integer', 'smallint'], ['bigint', 'integer'], ['smallint', 'tinyint'], ['decimalv2', 'decimalv2']],
        'acos' : [['double', 'double']],
        'aes_decrypt' : [['varchar', 'varchar', 'varchar'], ['string', 'string', 'string'], ['varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string'], ['varchar', 'varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string', 'string']],
        'aes_encrypt' : [['varchar', 'varchar', 'varchar'], ['string', 'string', 'string'], ['varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string'], ['varchar', 'varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string', 'string']],
        'append_trailing_char_if_absent' : [['varchar', 'varchar', 'varchar'], ['string', 'string', 'string']],
        'ascii' : [['integer', 'varchar'], ['integer', 'string']],
        'asin' : [['double', 'double']],
        'atan' : [['double', 'double']],
        'bin' : [['varchar', 'bigint']],
        'bit_length' : [['integer', 'varchar'], ['integer', 'string']],
        'bitmap_and' : [['bitmap', 'bitmap', 'bitmap']],
        'bitmap_and_count' : [['bigint', 'bitmap', 'bitmap']],
        'bitmap_and_not' : [['bitmap', 'bitmap', 'bitmap']],
        'bitmap_and_not_count' : [['bigint', 'bitmap', 'bitmap']],
        'bitmap_contains' : [['boolean', 'bitmap', 'bigint']],
        'bitmap_count' : [['bigint', 'bitmap']],
        'bitmap_empty' : [['bitmap', '']],
        'bitmap_from_string' : [['bitmap', 'varchar'], ['bitmap', 'string']],
        'bitmap_has_all' : [['boolean', 'bitmap', 'bitmap']],
        'bitmap_has_any' : [['boolean', 'bitmap', 'bitmap']],
        'bitmap_hash' : [['bitmap', 'varchar'], ['bitmap', 'string']],
        'bitmap_hash64' : [['bitmap', 'varchar'], ['bitmap', 'string']],
        'bitmap_max' : [['bigint', 'bitmap']],
        'bitmap_min' : [['bigint', 'bitmap']],
        'bitmap_not' : [['bitmap', 'bitmap', 'bitmap']],
        'bitmap_or' : [['bitmap', 'bitmap', 'bitmap']],
        'bitmap_or_count' : [['bigint', 'bitmap', 'bitmap']],
        'bitmap_subset_in_range' : [['bitmap', 'bitmap', 'bigint', 'bigint']],
        'bitmap_subset_limit' : [['bitmap', 'bitmap', 'bigint', 'bigint']],
        'bitmap_to_string' : [['string', 'bitmap']],
        'bitmap_xor' : [['bitmap', 'bitmap', 'bitmap']],
        'bitmap_xor_count' : [['bigint', 'bitmap', 'bitmap']],
        'cbrt' : [['double', 'double']],
        'ceil' : [['double', 'double']],
        'ceiling' : [['bigint', 'double']],
        'character_length' : [['integer', 'varchar'], ['integer', 'string']],
        'coalesce' : [['boolean', 'boolean'], ['tinyint', 'tinyint'], ['smallint', 'smallint'], ['integer', 'integer'], ['bigint', 'bigint'], ['largeint', 'largeint'], ['float', 'float'], ['double', 'double'], ['datetime', 'datetime'], ['date', 'date'], ['datetimev2', 'datetimev2'], ['datev2', 'datev2'], ['decimalv2', 'decimalv2'], ['bitmap', 'bitmap'], ['varchar', 'varchar'], ['string', 'string']],
        'concat' : [['varchar', 'varchar'], ['string', 'string']],
        'connection_id' : [['varchar', '']],
        'conv' : [['varchar', 'bigint', 'tinyint', 'tinyint'], ['varchar', 'varchar', 'tinyint', 'tinyint'], ['varchar', 'string', 'tinyint', 'tinyint']],
        'convert_to' : [['varchar', 'varchar', 'varchar']],
        'convert_tz' : [['datetime', 'datetime', 'varchar', 'varchar'], ['datetimev2', 'datetimev2', 'varchar', 'varchar'], ['datev2', 'datev2', 'varchar', 'varchar']],
        'cos' : [['double', 'double']],
        'current_date' : [['date', '']],
        'current_time' : [['time', '']],
        'current_timestamp' : [['datetime', ''], ['datetimev2', 'integer']],
        'current_user' : [['bigint', '']],
        'curtime' : [['time', '']],
        'database' : [['varchar', '']],
        'date' : [['date', 'datetime'], ['datev2', 'datetimev2']],
        'date_diff' : [['integer', 'datetime', 'datetime'], ['integer', 'datetimev2', 'datetimev2'], ['integer', 'datetimev2', 'datev2'], ['integer', 'datev2', 'datetimev2'], ['integer', 'datev2', 'datev2'], ['integer', 'datetimev2', 'datetime'], ['integer', 'datev2', 'datetime']],
        'date_format' : [['varchar', 'datetime', 'varchar'], ['varchar', 'date', 'varchar'], ['varchar', 'datetimev2', 'varchar'], ['varchar', 'datev2', 'varchar']],
        'date_trunc' : [['datetime', 'datetime', 'varchar'], ['datetimev2', 'datetimev2', 'varchar']],
        'date_v2' : [['datev2', 'datetimev2']],
        'day' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'day_ceil' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datev2', 'datev2', 'datev2'], ['datev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datev2', 'datev2', 'integer', 'datev2']],
        'day_floor' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datev2', 'datev2', 'datev2'], ['datev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datev2', 'datev2', 'integer', 'datev2']],
        'day_name' : [['varchar', 'datetime'], ['varchar', 'datetimev2'], ['varchar', 'datev2']],
        'day_of_month' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'day_of_week' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'day_of_year' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'days_add' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['date', 'date', 'integer'], ['datev2', 'datev2', 'integer']],
        'days_diff' : [['bigint', 'datetime', 'datetime'], ['bigint', 'datetimev2', 'datetimev2'], ['bigint', 'datev2', 'datetimev2'], ['bigint', 'datetimev2', 'datev2'], ['bigint', 'datev2', 'datev2'], ['bigint', 'datev2', 'datetime'], ['bigint', 'datetime', 'datev2'], ['bigint', 'datetimev2', 'datetime'], ['bigint', 'datetime', 'datetimev2']],
        'days_sub' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['date', 'date', 'integer'], ['datev2', 'datev2', 'integer']],
        'dceil' : [['bigint', 'double']],
        'degrees' : [['double', 'double']],
        'dexp' : [['double', 'double']],
        'dfloor' : [['bigint', 'double']],
        'digital_masking' : [['varchar', 'bigint']],
        'dlog1' : [['double', 'double']],
        'dlog10' : [['double', 'double']],
        'domain' : [['string', 'string']],
        'domain_without_www' : [['string', 'string']],
        'dpow' : [['double', 'double', 'double']],
        'dround' : [['bigint', 'double'], ['double', 'double', 'integer']],
        'dsqrt' : [['double', 'double']],
        'e' : [['double', '']],
        'elt' : [['varchar', 'integer', 'varchar'], ['string', 'integer', 'string']],
        'ends_with' : [['boolean', 'varchar', 'varchar'], ['boolean', 'string', 'string']],
        'es_query' : [['boolean', 'varchar', 'varchar']],
        'exp' : [['double', 'double']],
        'extract_url_parameter' : [['varchar', 'varchar', 'varchar']],
        'field' : [['integer', 'tinyint'], ['integer', 'smallint'], ['integer', 'integer'], ['integer', 'bigint'], ['integer', 'largeint'], ['integer', 'float'], ['integer', 'double'], ['integer', 'decimalv2'], ['integer', 'datev2'], ['integer', 'datetimev2'], ['integer', 'varchar'], ['integer', 'string']],
        'find_in_set' : [['integer', 'varchar', 'varchar'], ['integer', 'string', 'string']],
        'floor' : [['double', 'double']],
        'fmod' : [['float', 'float', 'float'], ['double', 'double', 'double']],
        'fpow' : [['double', 'double', 'double']],
        'from_base64' : [['varchar', 'varchar'], ['string', 'string']],
        'from_days' : [['date', 'integer']],
        'from_unixtime' : [['varchar', 'integer'], ['varchar', 'integer', 'varchar'], ['varchar', 'integer', 'string']],
        'get_json_double' : [['double', 'varchar', 'varchar'], ['double', 'string', 'string']],
        'get_json_int' : [['integer', 'varchar', 'varchar'], ['integer', 'string', 'string']],
        'get_json_string' : [['varchar', 'varchar', 'varchar'], ['string', 'string', 'string']],
        'greatest' : [['tinyint', 'tinyint'], ['smallint', 'smallint'], ['integer', 'integer'], ['bigint', 'bigint'], ['largeint', 'largeint'], ['float', 'float'], ['double', 'double'], ['decimalv2', 'decimalv2'], ['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['varchar', 'varchar'], ['string', 'string']],
        'hex' : [['varchar', 'bigint'], ['varchar', 'varchar'], ['string', 'string']],
        'hll_cardinality' : [['bigint', 'hll']],
        'hll_empty' : [['hll', '']],
        'hll_hash' : [['hll', 'varchar'], ['hll', 'string']],
        'hour' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'hour_ceil' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datetimev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datetimev2', 'datev2', 'datev2'], ['datetimev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datetimev2', 'datev2', 'integer', 'datev2']],
        'hour_floor' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datetimev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datetimev2', 'datev2', 'datev2'], ['datetimev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datetimev2', 'datev2', 'integer', 'datev2']],
        'hours_add' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['datetime', 'date', 'integer'], ['datetimev2', 'datev2', 'integer']],
        'hours_diff' : [['bigint', 'datetime', 'datetime'], ['bigint', 'datetimev2', 'datetimev2'], ['bigint', 'datev2', 'datetimev2'], ['bigint', 'datetimev2', 'datev2'], ['bigint', 'datev2', 'datev2'], ['bigint', 'datev2', 'datetime'], ['bigint', 'datetime', 'datev2'], ['bigint', 'datetimev2', 'datetime'], ['bigint', 'datetime', 'datetimev2']],
        'hours_sub' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['datetime', 'date', 'integer'], ['datetimev2', 'datev2', 'integer']],
        'initcap' : [['varchar', 'varchar']],
        'instr' : [['integer', 'varchar', 'varchar'], ['integer', 'string', 'string']],
        'json_array' : [['varchar', 'varchar']],
        'json_object' : [['varchar', 'varchar']],
        'json_quote' : [['varchar', 'varchar']],
        'jsonb_exists_path' : [['boolean', 'json', 'varchar'], ['boolean', 'json', 'string']],
        'jsonb_extract' : [['json', 'json', 'varchar'], ['json', 'json', 'string']],
        'jsonb_extract_bigint' : [['bigint', 'json', 'varchar'], ['bigint', 'json', 'string']],
        'jsonb_extract_bool' : [['boolean', 'json', 'varchar'], ['boolean', 'json', 'string']],
        'jsonb_extract_double' : [['double', 'json', 'varchar'], ['double', 'json', 'string']],
        'jsonb_extract_int' : [['integer', 'json', 'varchar'], ['integer', 'json', 'string']],
        'jsonb_extract_isnull' : [['boolean', 'json', 'varchar'], ['boolean', 'json', 'string']],
        'jsonb_extract_string' : [['string', 'json', 'varchar'], ['string', 'json', 'string']],
        'jsonb_parse' : [['json', 'varchar']],
        'jsonb_parse_error_to_invalid' : [['json', 'varchar']],
        'jsonb_parse_error_to_null' : [['json', 'varchar']],
        'jsonb_parse_error_to_value' : [['json', 'varchar', 'varchar']],
        'jsonb_parse_notnull' : [['json', 'varchar']],
        'jsonb_parse_notnull_error_to_invalid' : [['json', 'varchar']],
        'jsonb_parse_notnull_error_to_value' : [['json', 'varchar', 'varchar']],
        'jsonb_parse_nullable' : [['json', 'varchar']],
        'jsonb_parse_nullable_error_to_invalid' : [['json', 'varchar']],
        'jsonb_parse_nullable_error_to_null' : [['json', 'varchar']],
        'jsonb_parse_nullable_error_to_value' : [['json', 'varchar', 'varchar']],
        'jsonb_type' : [['string', 'json', 'string']],
        'last_day' : [['date', 'datetime'], ['date', 'date'], ['datev2', 'datetimev2'], ['datev2', 'datev2']],
        'least' : [['tinyint', 'tinyint'], ['smallint', 'smallint'], ['integer', 'integer'], ['bigint', 'bigint'], ['largeint', 'largeint'], ['float', 'float'], ['double', 'double'], ['datetime', 'datetime'], ['decimalv2', 'decimalv2'], ['varchar', 'varchar'], ['string', 'string']],
        'left' : [['varchar', 'varchar', 'integer'], ['string', 'string', 'integer']],
        'length' : [['integer', 'varchar'], ['integer', 'string']],
        'ln' : [['double', 'double']],
        'local_time' : [['datetime', ''], ['datetimev2', 'integer']],
        'local_timestamp' : [['datetime', ''], ['datetimev2', 'integer']],
        'locate' : [['integer', 'varchar', 'varchar'], ['integer', 'string', 'string'], ['integer', 'varchar', 'varchar', 'integer'], ['integer', 'string', 'string', 'integer']],
        'log' : [['double', 'double', 'double']],
        'log10' : [['double', 'double']],
        'log2' : [['double', 'double']],
        'lower' : [['varchar', 'varchar'], ['string', 'string']],
        'lpad' : [['varchar', 'varchar', 'integer', 'varchar'], ['string', 'string', 'integer', 'string']],
        'ltrim' : [['varchar', 'varchar'], ['string', 'string']],
        'make_date' : [['date', 'integer', 'integer']],
        'mask' : [['varchar', 'varchar'], ['string', 'string']],
        'mask_first_n' : [['varchar', 'varchar'], ['string', 'string'], ['varchar', 'varchar', 'integer'], ['string', 'string', 'integer']],
        'mask_last_n' : [['varchar', 'varchar'], ['string', 'string'], ['varchar', 'varchar', 'integer'], ['string', 'string', 'integer']],
        'md5' : [['varchar', 'varchar'], ['varchar', 'string']],
        'md5_sum' : [['varchar', 'varchar'], ['varchar', 'string']],
        'minute' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'minute_ceil' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datetimev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datetimev2', 'datev2', 'datev2'], ['datetimev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datetimev2', 'datev2', 'integer', 'datev2']],
        'minute_floor' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datetimev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datetimev2', 'datev2', 'datev2'], ['datetimev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datetimev2', 'datev2', 'integer', 'datev2']],
        'minutes_add' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['datetime', 'date', 'integer'], ['datetimev2', 'datev2', 'integer']],
        'minutes_diff' : [['bigint', 'datetime', 'datetime'], ['bigint', 'datetimev2', 'datetimev2'], ['bigint', 'datev2', 'datetimev2'], ['bigint', 'datetimev2', 'datev2'], ['bigint', 'datev2', 'datev2'], ['bigint', 'datev2', 'datetime'], ['bigint', 'datetime', 'datev2'], ['bigint', 'datetimev2', 'datetime'], ['bigint', 'datetime', 'datetimev2']],
        'minutes_sub' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['datetime', 'date', 'integer'], ['datetimev2', 'datev2', 'integer']],
        'money_format' : [['varchar', 'bigint'], ['varchar', 'largeint'], ['varchar', 'double'], ['varchar', 'decimalv2']],
        'month' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'month_ceil' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datev2', 'datev2', 'datev2'], ['datev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datev2', 'datev2', 'integer', 'datev2']],
        'month_floor' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datev2', 'datev2', 'datev2'], ['datev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datev2', 'datev2', 'integer', 'datev2']],
        'month_name' : [['varchar', 'datetime'], ['varchar', 'datetimev2'], ['varchar', 'datev2']],
        'months_add' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['date', 'date', 'integer'], ['datev2', 'datev2', 'integer']],
        'months_diff' : [['bigint', 'datetime', 'datetime'], ['bigint', 'datetimev2', 'datetimev2'], ['bigint', 'datev2', 'datetimev2'], ['bigint', 'datetimev2', 'datev2'], ['bigint', 'datev2', 'datev2'], ['bigint', 'datev2', 'datetime'], ['bigint', 'datetime', 'datev2'], ['bigint', 'datetimev2', 'datetime'], ['bigint', 'datetime', 'datetimev2']],
        'months_sub' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['date', 'date', 'integer'], ['datev2', 'datev2', 'integer']],
        'murmur_hash332' : [['integer', 'varchar'], ['integer', 'string']],
        'murmur_hash364' : [['bigint', 'varchar'], ['bigint', 'string']],
        'negative' : [['bigint', 'bigint'], ['double', 'double'], ['decimalv2', 'decimalv2']],
        'not_null_or_empty' : [['boolean', 'varchar'], ['boolean', 'string']],
        'now' : [['datetime', ''], ['datetimev2', 'integer']],
        'null_if' : [['boolean', 'boolean', 'boolean'], ['tinyint', 'tinyint', 'tinyint'], ['smallint', 'smallint', 'smallint'], ['integer', 'integer', 'integer'], ['bigint', 'bigint', 'bigint'], ['largeint', 'largeint', 'largeint'], ['float', 'float', 'float'], ['double', 'double', 'double'], ['datetime', 'datetime', 'datetime'], ['date', 'date', 'date'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datev2', 'datev2', 'datev2'], ['decimalv2', 'decimalv2', 'decimalv2'], ['varchar', 'varchar', 'varchar'], ['string', 'string', 'string']],
        'null_or_empty' : [['boolean', 'varchar'], ['boolean', 'string']],
        'nvl' : [['boolean', 'boolean', 'boolean'], ['tinyint', 'tinyint', 'tinyint'], ['smallint', 'smallint', 'smallint'], ['integer', 'integer', 'integer'], ['bigint', 'bigint', 'bigint'], ['largeint', 'largeint', 'largeint'], ['float', 'float', 'float'], ['double', 'double', 'double'], ['date', 'date', 'date'], ['datetime', 'datetime', 'datetime'], ['datetime', 'date', 'datetime'], ['datetime', 'datetime', 'date'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'datev2'], ['decimalv2', 'decimalv2', 'decimalv2'], ['bitmap', 'bitmap', 'bitmap'], ['varchar', 'varchar', 'varchar'], ['string', 'string', 'string']],
        'parse_url' : [['varchar', 'varchar', 'varchar'], ['string', 'string', 'string'], ['varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string']],
        'pi' : [['double', '']],
        'pmod' : [['bigint', 'bigint', 'bigint'], ['double', 'double', 'double']],
        'positive' : [['bigint', 'bigint'], ['double', 'double'], ['decimalv2', 'decimalv2']],
        'pow' : [['double', 'double', 'double']],
        'power' : [['double', 'double', 'double']],
        'protocol' : [['string', 'string']],
        'quantile_percent' : [['double', 'quantilestate', 'float']],
        'quarter' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'radians' : [['double', 'double']],
        'random' : [['double', ''], ['double', 'bigint']],
        'regexp_extract' : [['varchar', 'varchar', 'varchar', 'bigint'], ['string', 'string', 'string', 'bigint']],
        'regexp_extract_all' : [['varchar', 'varchar', 'varchar'], ['string', 'string', 'string']],
        'regexp_replace' : [['varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string']],
        'regexp_replace_one' : [['varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string']],
        'repeat' : [['varchar', 'varchar', 'integer'], ['string', 'string', 'integer']],
        'replace' : [['varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string']],
        'right' : [['varchar', 'varchar', 'integer'], ['string', 'string', 'integer']],
        'round' : [['double', 'double'], ['double', 'double', 'integer']],
        'round_bankers' : [['double', 'double'], ['double', 'double', 'integer']],
        'rpad' : [['varchar', 'varchar', 'integer', 'varchar'], ['string', 'string', 'integer', 'string']],
        'rtrim' : [['varchar', 'varchar'], ['string', 'string']],
        'running_difference' : [['smallint', 'tinyint'], ['integer', 'smallint'], ['bigint', 'integer'], ['largeint', 'bigint'], ['largeint', 'largeint'], ['double', 'float'], ['double', 'double'], ['decimalv2', 'decimalv2'], ['decimalv3.defaultdecimal32', 'decimalv3.defaultdecimal32'], ['decimalv3.defaultdecimal64', 'decimalv3.defaultdecimal64'], ['decimalv3.defaultdecimal128', 'decimalv3.defaultdecimal128'], ['integer', 'date'], ['integer', 'datev2'], ['double', 'datetime'], ['double', 'datetimev2']],
        'second' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'second_ceil' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datetimev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datetimev2', 'datev2', 'datev2'], ['datetimev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datetimev2', 'datev2', 'integer', 'datev2']],
        'second_floor' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datetimev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datetimev2', 'datev2', 'datev2'], ['datetimev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datetimev2', 'datev2', 'integer', 'datev2']],
        'seconds_add' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['datetime', 'date', 'integer'], ['datetimev2', 'datev2', 'integer']],
        'seconds_diff' : [['bigint', 'datetime', 'datetime'], ['bigint', 'datetimev2', 'datetimev2'], ['bigint', 'datev2', 'datetimev2'], ['bigint', 'datetimev2', 'datev2'], ['bigint', 'datev2', 'datev2'], ['bigint', 'datev2', 'datetime'], ['bigint', 'datetime', 'datev2'], ['bigint', 'datetimev2', 'datetime'], ['bigint', 'datetime', 'datetimev2']],
        'seconds_sub' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['datetime', 'date', 'integer'], ['datetimev2', 'datev2', 'integer']],
        'sign' : [['tinyint', 'double']],
        'sin' : [['double', 'double']],
        'sleep' : [['boolean', 'integer']],
        'sm3' : [['varchar', 'varchar'], ['varchar', 'string']],
        'sm3sum' : [['varchar', 'varchar'], ['varchar', 'string']],
        'sm4_decrypt' : [['varchar', 'varchar', 'varchar'], ['string', 'string', 'string'], ['varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string'], ['varchar', 'varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string', 'string']],
        'sm4_encrypt' : [['varchar', 'varchar', 'varchar'], ['string', 'string', 'string'], ['varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string'], ['varchar', 'varchar', 'varchar', 'varchar', 'varchar'], ['string', 'string', 'string', 'string', 'string']],
        'space' : [['varchar', 'integer']],
        'split_part' : [['varchar', 'varchar', 'varchar', 'integer'], ['string', 'string', 'string', 'integer']],
        'sqrt' : [['double', 'double']],
        'st_astext' : [['varchar', 'varchar'], ['varchar', 'string']],
        'st_aswkt' : [['varchar', 'varchar'], ['varchar', 'string']],
        'st_circle' : [['varchar', 'double', 'double', 'double']],
        'st_contains' : [['boolean', 'varchar', 'varchar']],
        'st_distance_sphere' : [['double', 'double', 'double', 'double', 'double']],
        'st_geometryfromtext' : [['varchar', 'varchar'], ['varchar', 'string']],
        'st_geomfromtext' : [['varchar', 'varchar'], ['varchar', 'string']],
        'st_linefromtext' : [['varchar', 'varchar'], ['varchar', 'string']],
        'st_linestringfromtext' : [['varchar', 'varchar'], ['varchar', 'string']],
        'st_point' : [['varchar', 'double', 'double']],
        'st_polyfromtext' : [['varchar', 'varchar'], ['varchar', 'string']],
        'st_polygon' : [['varchar', 'varchar'], ['varchar', 'string']],
        'st_polygonfromtext' : [['varchar', 'varchar'], ['varchar', 'string']],
        'st_x' : [['double', 'varchar'], ['double', 'string']],
        'st_y' : [['double', 'varchar'], ['double', 'string']],
        'starts_with' : [['boolean', 'varchar', 'varchar'], ['boolean', 'string', 'string']],
        'str_left' : [['varchar', 'varchar', 'integer'], ['string', 'string', 'integer']],
        'str_right' : [['varchar', 'varchar', 'integer'], ['string', 'string', 'integer']],
        'str_to_date' : [['datetime', 'varchar', 'varchar'], ['datetime', 'string', 'string']],
        'sub_bitmap' : [['bitmap', 'bitmap', 'bigint', 'bigint']],
        'sub_replace' : [['varchar', 'varchar', 'varchar', 'integer'], ['string', 'string', 'string', 'integer'], ['varchar', 'varchar', 'varchar', 'integer', 'integer'], ['string', 'string', 'string', 'integer', 'integer']],
        'substring' : [['varchar', 'varchar', 'integer'], ['string', 'string', 'integer'], ['varchar', 'varchar', 'integer', 'integer'], ['string', 'string', 'integer', 'integer']],
        'substring_index' : [['varchar', 'varchar', 'varchar', 'integer'], ['string', 'string', 'string', 'integer']],
        'tan' : [['double', 'double']],
        'time_diff' : [['time', 'datetime', 'datetime'], ['timev2', 'datetimev2', 'datetimev2'], ['timev2', 'datetimev2', 'datev2'], ['timev2', 'datev2', 'datetimev2'], ['timev2', 'datev2', 'datev2'], ['timev2', 'datetimev2', 'datetime'], ['timev2', 'datev2', 'datetime']],
        'timestamp' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2']],
        'to_base64' : [['string', 'string']],
        'to_bitmap' : [['bitmap', 'varchar'], ['bitmap', 'string']],
        'to_bitmap_with_check' : [['bitmap', 'varchar'], ['bitmap', 'string']],
        'to_date' : [['date', 'datetime'], ['datev2', 'datetimev2']],
        'to_date_v2' : [['datev2', 'datetimev2']],
        'to_days' : [['integer', 'date'], ['integer', 'datev2']],
        'to_monday' : [['datev2', 'datetimev2'], ['datev2', 'datev2'], ['date', 'datetime'], ['date', 'date']],
        'to_quantile_state' : [['quantilestate', 'varchar', 'float']],
        'trim' : [['varchar', 'varchar'], ['string', 'string']],
        'truncate' : [['double', 'double', 'integer']],
        'unhex' : [['varchar', 'varchar'], ['string', 'string']],
        'unix_timestamp' : [['integer', ''], ['integer', 'datetime'], ['integer', 'date'], ['integer', 'datetimev2'], ['integer', 'datev2'], ['integer', 'varchar', 'varchar'], ['integer', 'string', 'string']],
        'upper' : [['varchar', 'varchar'], ['string', 'string']],
        'user' : [['varchar', '']],
        'utc_timestamp' : [['datetime', '']],
        'uuid' : [['varchar', '']],
        'version' : [['varchar', '']],
        'week' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2'], ['integer', 'datetime', 'integer'], ['integer', 'datetimev2', 'integer'], ['integer', 'datev2', 'integer']],
        'week_ceil' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datev2', 'datev2', 'datev2'], ['datev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datev2', 'datev2', 'integer', 'datev2']],
        'week_floor' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datev2', 'datev2', 'datev2'], ['datev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datev2', 'datev2', 'integer', 'datev2']],
        'week_of_year' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'weekday' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2']],
        'weeks_diff' : [['bigint', 'datetime', 'datetime'], ['bigint', 'datetimev2', 'datetimev2'], ['bigint', 'datev2', 'datetimev2'], ['bigint', 'datetimev2', 'datev2'], ['bigint', 'datev2', 'datev2'], ['bigint', 'datev2', 'datetime'], ['bigint', 'datetime', 'datev2'], ['bigint', 'datetimev2', 'datetime'], ['bigint', 'datetime', 'datetimev2']],
        'year' : [['integer', 'datev2'], ['integer', 'datetime'], ['integer', 'datetimev2']],
        'year_ceil' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datev2', 'datev2', 'datev2'], ['datev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datev2', 'datev2', 'integer', 'datev2']],
        'year_floor' : [['datetime', 'datetime'], ['datetimev2', 'datetimev2'], ['datev2', 'datev2'], ['datetime', 'datetime', 'datetime'], ['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'datetimev2'], ['datetimev2', 'datetimev2', 'integer'], ['datev2', 'datev2', 'datev2'], ['datev2', 'datev2', 'integer'], ['datetime', 'datetime', 'integer', 'datetime'], ['datetimev2', 'datetimev2', 'integer', 'datetimev2'], ['datev2', 'datev2', 'integer', 'datev2']],
        'year_week' : [['integer', 'datetime'], ['integer', 'datetimev2'], ['integer', 'datev2'], ['integer', 'datetime', 'integer'], ['integer', 'datetimev2', 'integer'], ['integer', 'datev2', 'integer']],
        'years_add' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['date', 'date', 'integer'], ['datev2', 'datev2', 'integer']],
        'years_diff' : [['bigint', 'datetime', 'datetime'], ['bigint', 'datetimev2', 'datetimev2'], ['bigint', 'datev2', 'datetimev2'], ['bigint', 'datetimev2', 'datev2'], ['bigint', 'datev2', 'datev2'], ['bigint', 'datev2', 'datetime'], ['bigint', 'datetime', 'datev2'], ['bigint', 'datetimev2', 'datetime'], ['bigint', 'datetime', 'datetimev2']],
        'years_sub' : [['datetime', 'datetime', 'integer'], ['datetimev2', 'datetimev2', 'integer'], ['date', 'date', 'integer'], ['datev2', 'datev2', 'integer']]
    ]

    def agg_function = [: ]
    def array_scalar_function = [: ]
    def array_agg_function = [: ]
    // function table end

    // test begin
    def typeToColumn = [
        'tinyint' : ['ktint'],
        'smallint' : ['ksint'],
        'integer' : ['kint'],
        'bigint' : ['kbint'],
        'largeint' : ['klint'],
        'float' : ['kfloat'],
        'double' : ['kdbl'],
        'decimalv2' : ['kdcmls1'],
        'decimalv3_32' : ['kdcmlv3s1', 'kdcmlv3s2', 'kdcmlv3s3'],
        'decimalv3_64' : ['kdcmlv3s2'],
        'decimalv3_128' : ['kdcmlv3s3'],
        'char' : ['kchrs1'],
        'varchar' : ['kvchrs1'],
        'string' : ['kstr'],
        'date' : ['kdt'],
        'datetime' : ['kdtm'],
        'datev2' : ['kdtv2'],
        'datetimev2' : ['kdtmv2s1']
    ]

    def isError = false

    // key is string, value is array
    scalar_function.each { fn_name, v ->
        v.each {
            List<String> types
            try {
                types = it.subList(1, it.size()).collect {
                    typeToColumn[it][0]
                }
            } catch (Exception ignored) {
                logger.warn "${fn_name} with argument ${it} is not test, because framework does not support yet"
                return
            }
            def args = String.join(',', types)
            def fn = "${fn_name}(${args})"
            def scalar_sql = "select ${fn} from t order by ${args}"
            try {
                sql scalar_sql
            } catch (Exception e) {
                logger.error e.getMessage()
                isError = true
            }
        }
    }
    if (isError) {
        throw new IllegalStateException("TestError, please check log")
    }
    // test end
}