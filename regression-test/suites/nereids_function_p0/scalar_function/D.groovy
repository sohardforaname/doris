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

suite("nereids_scalar_fn_D") {
	sql 'use regression_test_nereids_function_p0'
	sql 'set enable_nereids_planner=true'
	sql 'set enable_fallback_to_original_planner=false'
	sql "select database() from fn_test"
	sql "select database() from fn_test_not_nullable"
	qt_sql_date_DateTime "select date(kdtm) from fn_test order by kdtm"
	qt_sql_date_DateTime "select date(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_date_DateTimeV2 "select date(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_date_DateTimeV2 "select date(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_date_format_DateTime_Varchar "select date_format(kdtm, '2006-01-02 12:00:00') from fn_test order by kdtm"
	qt_sql_date_format_DateTime_Varchar "select date_format(kdtm, '2006-01-02 12:00:00') from fn_test_not_nullable order by kdtm"
	qt_sql_date_format_Date_Varchar "select date_format(kdt, '2006-01-02') from fn_test order by kdt"
	qt_sql_date_format_Date_Varchar "select date_format(kdt, '2006-01-02') from fn_test_not_nullable order by kdt"
	qt_sql_date_format_DateTimeV2_Varchar "select date_format(kdtmv2s1, '2006-01-02 12:00:00') from fn_test order by kdtmv2s1"
	qt_sql_date_format_DateTimeV2_Varchar "select date_format(kdtmv2s1, '2006-01-02 12:00:00') from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_date_format_DateV2_Varchar "select date_format(kdtv2, '2006-01-02') from fn_test order by kdtv2"
	qt_sql_date_format_DateV2_Varchar "select date_format(kdtv2, '2006-01-02') from fn_test_not_nullable order by kdtv2"
	qt_sql_date_trunc_DateTime_Varchar "select date_trunc(kdtm, kvchrs1) from fn_test order by kdtm, kvchrs1"
	qt_sql_date_trunc_DateTime_Varchar "select date_trunc(kdtm, kvchrs1) from fn_test_not_nullable order by kdtm, kvchrs1"
	qt_sql_date_trunc_DateTimeV2_Varchar "select date_trunc(kdtmv2s1, kvchrs1) from fn_test order by kdtmv2s1, kvchrs1"
	qt_sql_date_trunc_DateTimeV2_Varchar "select date_trunc(kdtmv2s1, kvchrs1) from fn_test_not_nullable order by kdtmv2s1, kvchrs1"
	qt_sql_datediff_DateTime_DateTime "select datediff(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_datediff_DateTime_DateTime "select datediff(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_datediff_DateTimeV2_DateTimeV2 "select datediff(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	qt_sql_datediff_DateTimeV2_DateTimeV2 "select datediff(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_datediff_DateTimeV2_DateV2 "select datediff(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
	qt_sql_datediff_DateTimeV2_DateV2 "select datediff(kdtmv2s1, kdtv2) from fn_test_not_nullable order by kdtmv2s1, kdtv2"
	qt_sql_datediff_DateV2_DateTimeV2 "select datediff(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
	qt_sql_datediff_DateV2_DateTimeV2 "select datediff(kdtv2, kdtmv2s1) from fn_test_not_nullable order by kdtv2, kdtmv2s1"
	qt_sql_datediff_DateV2_DateV2 "select datediff(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	qt_sql_datediff_DateV2_DateV2 "select datediff(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_datediff_DateTimeV2_DateTime "select datediff(kdtmv2s1, kdtm) from fn_test order by kdtmv2s1, kdtm"
	qt_sql_datediff_DateTimeV2_DateTime "select datediff(kdtmv2s1, kdtm) from fn_test_not_nullable order by kdtmv2s1, kdtm"
	qt_sql_datediff_DateV2_DateTime "select datediff(kdtv2, kdtm) from fn_test order by kdtv2, kdtm"
	qt_sql_datediff_DateV2_DateTime "select datediff(kdtv2, kdtm) from fn_test_not_nullable order by kdtv2, kdtm"
	qt_sql_datev2_DateTimeV2 "select datev2(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_datev2_DateTimeV2 "select datev2(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_day_ceil_DateTime "select day_ceil(kdtm) from fn_test order by kdtm"
	qt_sql_day_ceil_DateTime "select day_ceil(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_day_ceil_DateTimeV2 "select day_ceil(kdtmv2s1) from fn_test order by kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_ceil_DateTimeV2 "select day_ceil(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_ceil_DateV2 "select day_ceil(kdtv2) from fn_test order by kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_ceil_DateV2 "select day_ceil(kdtv2) from fn_test_not_nullable order by kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_ceil_DateTime_DateTime "select day_ceil(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_day_ceil_DateTime_DateTime "select day_ceil(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_day_ceil_DateTime_Integer "select day_ceil(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_day_ceil_DateTime_Integer "select day_ceil(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_day_ceil_DateTimeV2_DateTimeV2 "select day_ceil(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_ceil_DateTimeV2_DateTimeV2 "select day_ceil(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_ceil_DateTimeV2_Integer "select day_ceil(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_ceil_DateTimeV2_Integer "select day_ceil(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_ceil_DateV2_DateV2 "select day_ceil(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_ceil_DateV2_DateV2 "select day_ceil(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_ceil_DateV2_Integer "select day_ceil(kdtv2, kint) from fn_test order by kdtv2, kint"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_ceil_DateV2_Integer "select day_ceil(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_ceil_DateTime_Integer_DateTime "select day_ceil(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_day_ceil_DateTime_Integer_DateTime "select day_ceil(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_day_ceil_DateTimeV2_Integer_DateTimeV2 "select day_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_ceil_DateTimeV2_Integer_DateTimeV2 "select day_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_ceil_DateV2_Integer_DateV2 "select day_ceil(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_ceil_DateV2_Integer_DateV2 "select day_ceil(kdtv2, kint, kdtv2) from fn_test_not_nullable order by kdtv2, kint, kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_floor_DateTime "select day_floor(kdtm) from fn_test order by kdtm"
	qt_sql_day_floor_DateTime "select day_floor(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_day_floor_DateTimeV2 "select day_floor(kdtmv2s1) from fn_test order by kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_floor_DateTimeV2 "select day_floor(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_floor_DateV2 "select day_floor(kdtv2) from fn_test order by kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_floor_DateV2 "select day_floor(kdtv2) from fn_test_not_nullable order by kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_floor_DateTime_DateTime "select day_floor(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_day_floor_DateTime_DateTime "select day_floor(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_day_floor_DateTime_Integer "select day_floor(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_day_floor_DateTime_Integer "select day_floor(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_day_floor_DateTimeV2_DateTimeV2 "select day_floor(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_floor_DateTimeV2_DateTimeV2 "select day_floor(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_floor_DateTimeV2_Integer "select day_floor(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_floor_DateTimeV2_Integer "select day_floor(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_floor_DateV2_DateV2 "select day_floor(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_floor_DateV2_DateV2 "select day_floor(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_floor_DateV2_Integer "select day_floor(kdtv2, kint) from fn_test order by kdtv2, kint"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_floor_DateV2_Integer "select day_floor(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_floor_DateTime_Integer_DateTime "select day_floor(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_day_floor_DateTime_Integer_DateTime "select day_floor(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_day_floor_DateTimeV2_Integer_DateTimeV2 "select day_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_floor_DateTimeV2_Integer_DateTimeV2 "select day_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	sql 'set enable_nereids_planner=true'
	qt_sql_day_floor_DateV2_Integer_DateV2 "select day_floor(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
	sql 'set enable_nereids_planner=false'
	qt_sql_day_floor_DateV2_Integer_DateV2 "select day_floor(kdtv2, kint, kdtv2) from fn_test_not_nullable order by kdtv2, kint, kdtv2"
	sql 'set enable_nereids_planner=true'
	qt_sql_dayname_DateTime "select dayname(kdtm) from fn_test order by kdtm"
	qt_sql_dayname_DateTime "select dayname(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_dayname_DateTimeV2 "select dayname(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_dayname_DateTimeV2 "select dayname(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_dayname_DateV2 "select dayname(kdtv2) from fn_test order by kdtv2"
	qt_sql_dayname_DateV2 "select dayname(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_dayofmonth_DateTime "select dayofmonth(kdtm) from fn_test order by kdtm"
	qt_sql_dayofmonth_DateTime "select dayofmonth(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_dayofmonth_DateTimeV2 "select dayofmonth(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_dayofmonth_DateTimeV2 "select dayofmonth(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_dayofmonth_DateV2 "select dayofmonth(kdtv2) from fn_test order by kdtv2"
	qt_sql_dayofmonth_DateV2 "select dayofmonth(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_dayofweek_DateTime "select dayofweek(kdtm) from fn_test order by kdtm"
	qt_sql_dayofweek_DateTime "select dayofweek(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_dayofweek_DateTimeV2 "select dayofweek(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_dayofweek_DateTimeV2 "select dayofweek(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_dayofweek_DateV2 "select dayofweek(kdtv2) from fn_test order by kdtv2"
	qt_sql_dayofweek_DateV2 "select dayofweek(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_dayofyear_DateTime "select dayofyear(kdtm) from fn_test order by kdtm"
	qt_sql_dayofyear_DateTime "select dayofyear(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_dayofyear_DateTimeV2 "select dayofyear(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_dayofyear_DateTimeV2 "select dayofyear(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_dayofyear_DateV2 "select dayofyear(kdtv2) from fn_test order by kdtv2"
	qt_sql_dayofyear_DateV2 "select dayofyear(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_days_add_DateTimeV2_Integer "select days_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_days_add_DateTimeV2_Integer "select days_add(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_days_add_DateV2_Integer "select days_add(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_days_add_DateV2_Integer "select days_add(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_days_add_DateTime_Integer "select days_add(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_days_add_DateTime_Integer "select days_add(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_days_add_Date_Integer "select days_add(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_days_add_Date_Integer "select days_add(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_days_add_DateTime_Integer "select days_add(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_days_add_DateTime_Integer "select days_add(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_days_add_Date_Integer "select days_add(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_days_add_Date_Integer "select days_add(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_days_add_DateTimeV2_Integer "select days_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_days_add_DateTimeV2_Integer "select days_add(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_days_add_DateV2_Integer "select days_add(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_days_add_DateV2_Integer "select days_add(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_days_diff_DateTime_DateTime "select days_diff(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_days_diff_DateTime_DateTime "select days_diff(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_days_diff_DateTimeV2_DateTimeV2 "select days_diff(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	qt_sql_days_diff_DateTimeV2_DateTimeV2 "select days_diff(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_days_diff_DateV2_DateTimeV2 "select days_diff(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
	qt_sql_days_diff_DateV2_DateTimeV2 "select days_diff(kdtv2, kdtmv2s1) from fn_test_not_nullable order by kdtv2, kdtmv2s1"
	qt_sql_days_diff_DateTimeV2_DateV2 "select days_diff(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
	qt_sql_days_diff_DateTimeV2_DateV2 "select days_diff(kdtmv2s1, kdtv2) from fn_test_not_nullable order by kdtmv2s1, kdtv2"
	qt_sql_days_diff_DateV2_DateV2 "select days_diff(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	qt_sql_days_diff_DateV2_DateV2 "select days_diff(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_days_diff_DateV2_DateTime "select days_diff(kdtv2, kdtm) from fn_test order by kdtv2, kdtm"
	qt_sql_days_diff_DateV2_DateTime "select days_diff(kdtv2, kdtm) from fn_test_not_nullable order by kdtv2, kdtm"
	qt_sql_days_diff_DateTime_DateV2 "select days_diff(kdtm, kdtv2) from fn_test order by kdtm, kdtv2"
	qt_sql_days_diff_DateTime_DateV2 "select days_diff(kdtm, kdtv2) from fn_test_not_nullable order by kdtm, kdtv2"
	qt_sql_days_diff_DateTimeV2_DateTime "select days_diff(kdtmv2s1, kdtm) from fn_test order by kdtmv2s1, kdtm"
	qt_sql_days_diff_DateTimeV2_DateTime "select days_diff(kdtmv2s1, kdtm) from fn_test_not_nullable order by kdtmv2s1, kdtm"
	qt_sql_days_diff_DateTime_DateTimeV2 "select days_diff(kdtm, kdtmv2s1) from fn_test order by kdtm, kdtmv2s1"
	qt_sql_days_diff_DateTime_DateTimeV2 "select days_diff(kdtm, kdtmv2s1) from fn_test_not_nullable order by kdtm, kdtmv2s1"
	qt_sql_days_sub_DateTimeV2_Integer "select days_sub(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_days_sub_DateTimeV2_Integer "select days_sub(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_days_sub_DateV2_Integer "select days_sub(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_days_sub_DateV2_Integer "select days_sub(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_days_sub_DateTime_Integer "select days_sub(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_days_sub_DateTime_Integer "select days_sub(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_days_sub_Date_Integer "select days_sub(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_days_sub_Date_Integer "select days_sub(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_days_sub_DateTime_Integer "select days_sub(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_days_sub_DateTime_Integer "select days_sub(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_days_sub_Date_Integer "select days_sub(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_days_sub_Date_Integer "select days_sub(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_days_sub_DateTimeV2_Integer "select days_sub(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_days_sub_DateTimeV2_Integer "select days_sub(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_days_sub_DateV2_Integer "select days_sub(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_days_sub_DateV2_Integer "select days_sub(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_dceil_Double "select dceil(kdbl) from fn_test order by kdbl"
	qt_sql_dceil_Double "select dceil(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_degrees_Double "select degrees(kdbl) from fn_test order by kdbl"
	qt_sql_degrees_Double "select degrees(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_dexp_Double "select dexp(kdbl) from fn_test order by kdbl"
	qt_sql_dexp_Double "select dexp(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_dfloor_Double "select dfloor(kdbl) from fn_test order by kdbl"
	qt_sql_dfloor_Double "select dfloor(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_digital_masking_BigInt "select digital_masking(kbint) from fn_test order by kbint"
	qt_sql_digital_masking_BigInt "select digital_masking(kbint) from fn_test_not_nullable order by kbint"
	qt_sql_dlog1_Double "select dlog1(kdbl) from fn_test order by kdbl"
	qt_sql_dlog1_Double "select dlog1(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_dlog10_Double "select dlog10(kdbl) from fn_test order by kdbl"
	qt_sql_dlog10_Double "select dlog10(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_domain_String "select domain(kstr) from fn_test order by kstr"
	qt_sql_domain_String "select domain(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_domain_without_www_String "select domain_without_www(kstr) from fn_test order by kstr"
	qt_sql_domain_without_www_String "select domain_without_www(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_dpow_Double_Double "select dpow(kdbl, kdbl) from fn_test order by kdbl, kdbl"
	qt_sql_dpow_Double_Double "select dpow(kdbl, kdbl) from fn_test_not_nullable order by kdbl, kdbl"
	qt_sql_dround_Double "select dround(kdbl) from fn_test order by kdbl"
	qt_sql_dround_Double "select dround(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_dround_Double_Integer "select dround(kdbl, 2) from fn_test order by kdbl"
	qt_sql_dround_Double_Integer "select dround(kdbl, 2) from fn_test_not_nullable order by kdbl"
	qt_sql_dsqrt_Double "select dsqrt(kdbl) from fn_test order by kdbl"
	qt_sql_dsqrt_Double "select dsqrt(kdbl) from fn_test_not_nullable order by kdbl"
}