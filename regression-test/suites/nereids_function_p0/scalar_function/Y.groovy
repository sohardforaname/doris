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

suite("nereids_scalar_fn_Y") {
	sql 'use regression_test_nereids_function_p0'
	sql 'set enable_nereids_planner=true'
	sql 'set enable_fallback_to_original_planner=false'
	qt_sql_year_DateV2 "select year(kdtv2) from fn_test order by kdtv2"
	qt_sql_year_DateV2 "select year(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_year_DateTime "select year(kdtm) from fn_test order by kdtm"
	qt_sql_year_DateTime "select year(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_year_DateTimeV2 "select year(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_year_DateTimeV2 "select year(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_year_ceil_DateTime "select year_ceil(kdtm) from fn_test order by kdtm"
	qt_sql_year_ceil_DateTime "select year_ceil(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_year_ceil_DateTimeV2 "select year_ceil(kdtmv2s1) from fn_test order by kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_ceil_DateTimeV2 "select year_ceil(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_ceil_DateV2 "select year_ceil(kdtv2) from fn_test order by kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_ceil_DateV2 "select year_ceil(kdtv2) from fn_test_not_nullable order by kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_ceil_DateTime_DateTime "select year_ceil(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_year_ceil_DateTime_DateTime "select year_ceil(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_year_ceil_DateTime_Integer "select year_ceil(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_year_ceil_DateTime_Integer "select year_ceil(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_year_ceil_DateTimeV2_DateTimeV2 "select year_ceil(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_ceil_DateTimeV2_DateTimeV2 "select year_ceil(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_ceil_DateTimeV2_Integer "select year_ceil(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_ceil_DateTimeV2_Integer "select year_ceil(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_ceil_DateV2_DateV2 "select year_ceil(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_ceil_DateV2_DateV2 "select year_ceil(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_ceil_DateV2_Integer "select year_ceil(kdtv2, kint) from fn_test order by kdtv2, kint"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_ceil_DateV2_Integer "select year_ceil(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_ceil_DateTime_Integer_DateTime "select year_ceil(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_year_ceil_DateTime_Integer_DateTime "select year_ceil(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_year_ceil_DateTimeV2_Integer_DateTimeV2 "select year_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_ceil_DateTimeV2_Integer_DateTimeV2 "select year_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_ceil_DateV2_Integer_DateV2 "select year_ceil(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_ceil_DateV2_Integer_DateV2 "select year_ceil(kdtv2, kint, kdtv2) from fn_test_not_nullable order by kdtv2, kint, kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_floor_DateTime "select year_floor(kdtm) from fn_test order by kdtm"
	qt_sql_year_floor_DateTime "select year_floor(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_year_floor_DateTimeV2 "select year_floor(kdtmv2s1) from fn_test order by kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_floor_DateTimeV2 "select year_floor(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_floor_DateV2 "select year_floor(kdtv2) from fn_test order by kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_floor_DateV2 "select year_floor(kdtv2) from fn_test_not_nullable order by kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_floor_DateTime_DateTime "select year_floor(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_year_floor_DateTime_DateTime "select year_floor(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_year_floor_DateTime_Integer "select year_floor(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_year_floor_DateTime_Integer "select year_floor(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_year_floor_DateTimeV2_DateTimeV2 "select year_floor(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_floor_DateTimeV2_DateTimeV2 "select year_floor(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_floor_DateTimeV2_Integer "select year_floor(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_floor_DateTimeV2_Integer "select year_floor(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_floor_DateV2_DateV2 "select year_floor(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_floor_DateV2_DateV2 "select year_floor(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_floor_DateV2_Integer "select year_floor(kdtv2, kint) from fn_test order by kdtv2, kint"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_floor_DateV2_Integer "select year_floor(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_floor_DateTime_Integer_DateTime "select year_floor(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_year_floor_DateTime_Integer_DateTime "select year_floor(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_year_floor_DateTimeV2_Integer_DateTimeV2 "select year_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_floor_DateTimeV2_Integer_DateTimeV2 "select year_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_year_floor_DateV2_Integer_DateV2 "select year_floor(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_year_floor_DateV2_Integer_DateV2 "select year_floor(kdtv2, kint, kdtv2) from fn_test_not_nullable order by kdtv2, kint, kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_years_add_DateTime_Integer "select years_add(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_years_add_DateTime_Integer "select years_add(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_years_add_DateTimeV2_Integer "select years_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_years_add_DateTimeV2_Integer "select years_add(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_years_add_Date_Integer "select years_add(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_years_add_Date_Integer "select years_add(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_years_add_DateV2_Integer "select years_add(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_years_add_DateV2_Integer "select years_add(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_years_diff_DateTime_DateTime "select years_diff(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_years_diff_DateTime_DateTime "select years_diff(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_years_diff_DateTimeV2_DateTimeV2 "select years_diff(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	qt_sql_years_diff_DateTimeV2_DateTimeV2 "select years_diff(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_years_diff_DateV2_DateTimeV2 "select years_diff(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
	qt_sql_years_diff_DateV2_DateTimeV2 "select years_diff(kdtv2, kdtmv2s1) from fn_test_not_nullable order by kdtv2, kdtmv2s1"
	qt_sql_years_diff_DateTimeV2_DateV2 "select years_diff(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
	qt_sql_years_diff_DateTimeV2_DateV2 "select years_diff(kdtmv2s1, kdtv2) from fn_test_not_nullable order by kdtmv2s1, kdtv2"
	qt_sql_years_diff_DateV2_DateV2 "select years_diff(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	qt_sql_years_diff_DateV2_DateV2 "select years_diff(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_years_diff_DateV2_DateTime "select years_diff(kdtv2, kdtm) from fn_test order by kdtv2, kdtm"
	qt_sql_years_diff_DateV2_DateTime "select years_diff(kdtv2, kdtm) from fn_test_not_nullable order by kdtv2, kdtm"
	qt_sql_years_diff_DateTime_DateV2 "select years_diff(kdtm, kdtv2) from fn_test order by kdtm, kdtv2"
	qt_sql_years_diff_DateTime_DateV2 "select years_diff(kdtm, kdtv2) from fn_test_not_nullable order by kdtm, kdtv2"
	qt_sql_years_diff_DateTimeV2_DateTime "select years_diff(kdtmv2s1, kdtm) from fn_test order by kdtmv2s1, kdtm"
	qt_sql_years_diff_DateTimeV2_DateTime "select years_diff(kdtmv2s1, kdtm) from fn_test_not_nullable order by kdtmv2s1, kdtm"
	qt_sql_years_diff_DateTime_DateTimeV2 "select years_diff(kdtm, kdtmv2s1) from fn_test order by kdtm, kdtmv2s1"
	qt_sql_years_diff_DateTime_DateTimeV2 "select years_diff(kdtm, kdtmv2s1) from fn_test_not_nullable order by kdtm, kdtmv2s1"
	qt_sql_years_sub_DateTime_Integer "select years_sub(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_years_sub_DateTime_Integer "select years_sub(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_years_sub_DateTimeV2_Integer "select years_sub(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_years_sub_DateTimeV2_Integer "select years_sub(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_years_sub_Date_Integer "select years_sub(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_years_sub_Date_Integer "select years_sub(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_years_sub_DateV2_Integer "select years_sub(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_years_sub_DateV2_Integer "select years_sub(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_yearweek_DateTime "select yearweek(kdtm) from fn_test order by kdtm"
	qt_sql_yearweek_DateTime "select yearweek(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_yearweek_DateTimeV2 "select yearweek(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_yearweek_DateTimeV2 "select yearweek(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_yearweek_DateV2 "select yearweek(kdtv2) from fn_test order by kdtv2"
	qt_sql_yearweek_DateV2 "select yearweek(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_yearweek_DateTime_Integer "select yearweek(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_yearweek_DateTime_Integer "select yearweek(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_yearweek_DateTimeV2_Integer "select yearweek(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_yearweek_DateTimeV2_Integer "select yearweek(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_yearweek_DateV2_Integer "select yearweek(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_yearweek_DateV2_Integer "select yearweek(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
}