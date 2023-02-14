
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

suite("nereids_scalar_fn_M") {
	sql 'use regression_test_nereids_function_p0'
	sql 'set enable_nereids_planner=true'
	sql 'set enable_fallback_to_original_planner=false'
	qt_sql_makedate_Integer_Integer "select makedate(kint, kint) from fn_test order by kint, kint"
	qt_sql_makedate_Integer_Integer_notnull "select makedate(kint, kint) from fn_test_not_nullable order by kint, kint"
	qt_sql_mask_Varchar "select mask(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_mask_Varchar_notnull "select mask(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_mask_String "select mask(kstr) from fn_test order by kstr"
	qt_sql_mask_String_notnull "select mask(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_mask_first_n_Varchar "select mask_first_n(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_mask_first_n_Varchar_notnull "select mask_first_n(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_mask_first_n_String "select mask_first_n(kstr) from fn_test order by kstr"
	qt_sql_mask_first_n_String_notnull "select mask_first_n(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_mask_first_n_Varchar_Integer "select mask_first_n(kvchrs1, kint) from fn_test order by kvchrs1, kint"
	qt_sql_mask_first_n_Varchar_Integer_notnull "select mask_first_n(kvchrs1, kint) from fn_test_not_nullable order by kvchrs1, kint"
	qt_sql_mask_first_n_String_Integer "select mask_first_n(kstr, kint) from fn_test order by kstr, kint"
	qt_sql_mask_first_n_String_Integer_notnull "select mask_first_n(kstr, kint) from fn_test_not_nullable order by kstr, kint"
	qt_sql_mask_last_n_Varchar "select mask_last_n(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_mask_last_n_Varchar_notnull "select mask_last_n(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_mask_last_n_String "select mask_last_n(kstr) from fn_test order by kstr"
	qt_sql_mask_last_n_String_notnull "select mask_last_n(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_mask_last_n_Varchar_Integer "select mask_last_n(kvchrs1, kint) from fn_test order by kvchrs1, kint"
	qt_sql_mask_last_n_Varchar_Integer_notnull "select mask_last_n(kvchrs1, kint) from fn_test_not_nullable order by kvchrs1, kint"
	qt_sql_mask_last_n_String_Integer "select mask_last_n(kstr, kint) from fn_test order by kstr, kint"
	qt_sql_mask_last_n_String_Integer_notnull "select mask_last_n(kstr, kint) from fn_test_not_nullable order by kstr, kint"
	qt_sql_md5_Varchar "select md5(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_md5_Varchar_notnull "select md5(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_md5_String "select md5(kstr) from fn_test order by kstr"
	qt_sql_md5_String_notnull "select md5(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_md5sum_Varchar "select md5sum(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_md5sum_Varchar_notnull "select md5sum(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_md5sum_String "select md5sum(kstr) from fn_test order by kstr"
	qt_sql_md5sum_String_notnull "select md5sum(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_minute_DateTime "select minute(kdtm) from fn_test order by kdtm"
	qt_sql_minute_DateTime_notnull "select minute(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_minute_DateTimeV2 "select minute(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_minute_DateTimeV2_notnull "select minute(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_minute_DateV2 "select minute(kdtv2) from fn_test order by kdtv2"
	qt_sql_minute_DateV2_notnull "select minute(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_minute_ceil_DateTime "select minute_ceil(kdtm) from fn_test order by kdtm"
	qt_sql_minute_ceil_DateTime_notnull "select minute_ceil(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_minute_ceil_DateTimeV2 "select minute_ceil(kdtmv2s1) from fn_test order by kdtmv2s1"
	// qt_sql_minute_ceil_DateTimeV2_notnull "select minute_ceil(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_minute_ceil_DateTime_DateTime "select minute_ceil(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_minute_ceil_DateTime_DateTime_notnull "select minute_ceil(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_minute_ceil_DateTime_Integer "select minute_ceil(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_minute_ceil_DateTime_Integer_notnull "select minute_ceil(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_minute_ceil_DateTimeV2_DateTimeV2 "select minute_ceil(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	// qt_sql_minute_ceil_DateTimeV2_DateTimeV2_notnull "select minute_ceil(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_minute_ceil_DateTimeV2_Integer "select minute_ceil(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	// qt_sql_minute_ceil_DateTimeV2_Integer_notnull "select minute_ceil(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_minute_ceil_DateTime_Integer_DateTime "select minute_ceil(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_minute_ceil_DateTime_Integer_DateTime_notnull "select minute_ceil(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_minute_ceil_DateTimeV2_Integer_DateTimeV2 "select minute_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	// qt_sql_minute_ceil_DateTimeV2_Integer_DateTimeV2_notnull "select minute_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	qt_sql_minute_floor_DateTime "select minute_floor(kdtm) from fn_test order by kdtm"
	qt_sql_minute_floor_DateTime_notnull "select minute_floor(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_minute_floor_DateTimeV2 "select minute_floor(kdtmv2s1) from fn_test order by kdtmv2s1"
	// qt_sql_minute_floor_DateTimeV2_notnull "select minute_floor(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_minute_floor_DateTime_DateTime "select minute_floor(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_minute_floor_DateTime_DateTime_notnull "select minute_floor(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_minute_floor_DateTime_Integer "select minute_floor(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_minute_floor_DateTime_Integer_notnull "select minute_floor(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_minute_floor_DateTimeV2_DateTimeV2 "select minute_floor(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	// qt_sql_minute_floor_DateTimeV2_DateTimeV2_notnull "select minute_floor(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_minute_floor_DateTimeV2_Integer "select minute_floor(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	// qt_sql_minute_floor_DateTimeV2_Integer_notnull "select minute_floor(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_minute_floor_DateTime_Integer_DateTime "select minute_floor(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_minute_floor_DateTime_Integer_DateTime_notnull "select minute_floor(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_minute_floor_DateTimeV2_Integer_DateTimeV2 "select minute_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	// qt_sql_minute_floor_DateTimeV2_Integer_DateTimeV2_notnull "select minute_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	qt_sql_minutes_add_DateTime_Integer "select minutes_add(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_minutes_add_DateTime_Integer_notnull "select minutes_add(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_minutes_add_DateTimeV2_Integer "select minutes_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_minutes_add_DateTimeV2_Integer_notnull "select minutes_add(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_minutes_add_Date_Integer "select minutes_add(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_minutes_add_Date_Integer_notnull "select minutes_add(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_minutes_add_DateV2_Integer "select minutes_add(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_minutes_add_DateV2_Integer_notnull "select minutes_add(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_minutes_diff_DateTime_DateTime "select minutes_diff(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_minutes_diff_DateTime_DateTime_notnull "select minutes_diff(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_minutes_diff_DateTimeV2_DateTimeV2 "select minutes_diff(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	qt_sql_minutes_diff_DateTimeV2_DateTimeV2_notnull "select minutes_diff(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_minutes_diff_DateV2_DateTimeV2 "select minutes_diff(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
	qt_sql_minutes_diff_DateV2_DateTimeV2_notnull "select minutes_diff(kdtv2, kdtmv2s1) from fn_test_not_nullable order by kdtv2, kdtmv2s1"
	qt_sql_minutes_diff_DateTimeV2_DateV2 "select minutes_diff(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
	qt_sql_minutes_diff_DateTimeV2_DateV2_notnull "select minutes_diff(kdtmv2s1, kdtv2) from fn_test_not_nullable order by kdtmv2s1, kdtv2"
	qt_sql_minutes_diff_DateV2_DateV2 "select minutes_diff(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	qt_sql_minutes_diff_DateV2_DateV2_notnull "select minutes_diff(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_minutes_diff_DateV2_DateTime "select minutes_diff(kdtv2, kdtm) from fn_test order by kdtv2, kdtm"
	qt_sql_minutes_diff_DateV2_DateTime_notnull "select minutes_diff(kdtv2, kdtm) from fn_test_not_nullable order by kdtv2, kdtm"
	qt_sql_minutes_diff_DateTime_DateV2 "select minutes_diff(kdtm, kdtv2) from fn_test order by kdtm, kdtv2"
	qt_sql_minutes_diff_DateTime_DateV2_notnull "select minutes_diff(kdtm, kdtv2) from fn_test_not_nullable order by kdtm, kdtv2"
	qt_sql_minutes_diff_DateTimeV2_DateTime "select minutes_diff(kdtmv2s1, kdtm) from fn_test order by kdtmv2s1, kdtm"
	qt_sql_minutes_diff_DateTimeV2_DateTime_notnull "select minutes_diff(kdtmv2s1, kdtm) from fn_test_not_nullable order by kdtmv2s1, kdtm"
	qt_sql_minutes_diff_DateTime_DateTimeV2 "select minutes_diff(kdtm, kdtmv2s1) from fn_test order by kdtm, kdtmv2s1"
	qt_sql_minutes_diff_DateTime_DateTimeV2_notnull "select minutes_diff(kdtm, kdtmv2s1) from fn_test_not_nullable order by kdtm, kdtmv2s1"
	qt_sql_minutes_sub_DateTime_Integer "select minutes_sub(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_minutes_sub_DateTime_Integer_notnull "select minutes_sub(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_minutes_sub_DateTimeV2_Integer "select minutes_sub(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_minutes_sub_DateTimeV2_Integer_notnull "select minutes_sub(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_minutes_sub_Date_Integer "select minutes_sub(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_minutes_sub_Date_Integer_notnull "select minutes_sub(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_minutes_sub_DateV2_Integer "select minutes_sub(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_minutes_sub_DateV2_Integer_notnull "select minutes_sub(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_money_format_BigInt "select money_format(kbint) from fn_test order by kbint"
	qt_sql_money_format_BigInt_notnull "select money_format(kbint) from fn_test_not_nullable order by kbint"
	qt_sql_money_format_LargeInt "select money_format(klint) from fn_test order by klint"
	qt_sql_money_format_LargeInt_notnull "select money_format(klint) from fn_test_not_nullable order by klint"
	qt_sql_money_format_Double "select money_format(kdbl) from fn_test order by kdbl"
	qt_sql_money_format_Double_notnull "select money_format(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_money_format_DecimalV2 "select money_format(kdcmls1) from fn_test order by kdcmls1"
	qt_sql_money_format_DecimalV2_notnull "select money_format(kdcmls1) from fn_test_not_nullable order by kdcmls1"
	qt_sql_month_DateTime "select month(kdtm) from fn_test order by kdtm"
	qt_sql_month_DateTime_notnull "select month(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_month_DateTimeV2 "select month(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_month_DateTimeV2_notnull "select month(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_month_DateV2 "select month(kdtv2) from fn_test order by kdtv2"
	qt_sql_month_DateV2_notnull "select month(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_month_ceil_DateTime "select month_ceil(kdtm) from fn_test order by kdtm"
	qt_sql_month_ceil_DateTime_notnull "select month_ceil(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_month_ceil_DateTimeV2 "select month_ceil(kdtmv2s1) from fn_test order by kdtmv2s1"
	// qt_sql_month_ceil_DateTimeV2_notnull "select month_ceil(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_month_ceil_DateV2 "select month_ceil(kdtv2) from fn_test order by kdtv2"
	// qt_sql_month_ceil_DateV2_notnull "select month_ceil(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_month_ceil_DateTime_DateTime "select month_ceil(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_month_ceil_DateTime_DateTime_notnull "select month_ceil(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_month_ceil_DateTime_Integer "select month_ceil(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_month_ceil_DateTime_Integer_notnull "select month_ceil(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_month_ceil_DateTimeV2_DateTimeV2 "select month_ceil(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	// qt_sql_month_ceil_DateTimeV2_DateTimeV2_notnull "select month_ceil(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_month_ceil_DateTimeV2_Integer "select month_ceil(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	// qt_sql_month_ceil_DateTimeV2_Integer_notnull "select month_ceil(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_month_ceil_DateV2_DateV2 "select month_ceil(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	// qt_sql_month_ceil_DateV2_DateV2_notnull "select month_ceil(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_month_ceil_DateV2_Integer "select month_ceil(kdtv2, kint) from fn_test order by kdtv2, kint"
	// qt_sql_month_ceil_DateV2_Integer_notnull "select month_ceil(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_month_ceil_DateTime_Integer_DateTime "select month_ceil(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_month_ceil_DateTime_Integer_DateTime_notnull "select month_ceil(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_month_ceil_DateTimeV2_Integer_DateTimeV2 "select month_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	// qt_sql_month_ceil_DateTimeV2_Integer_DateTimeV2_notnull "select month_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	qt_sql_month_ceil_DateV2_Integer_DateV2 "select month_ceil(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
	// qt_sql_month_ceil_DateV2_Integer_DateV2_notnull "select month_ceil(kdtv2, kint, kdtv2) from fn_test_not_nullable order by kdtv2, kint, kdtv2"
	qt_sql_month_floor_DateTime "select month_floor(kdtm) from fn_test order by kdtm"
	qt_sql_month_floor_DateTime_notnull "select month_floor(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_month_floor_DateTimeV2 "select month_floor(kdtmv2s1) from fn_test order by kdtmv2s1"
	// qt_sql_month_floor_DateTimeV2_notnull "select month_floor(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_month_floor_DateV2 "select month_floor(kdtv2) from fn_test order by kdtv2"
	// qt_sql_month_floor_DateV2_notnull "select month_floor(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_month_floor_DateTime_DateTime "select month_floor(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_month_floor_DateTime_DateTime_notnull "select month_floor(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_month_floor_DateTime_Integer "select month_floor(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_month_floor_DateTime_Integer_notnull "select month_floor(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_month_floor_DateTimeV2_DateTimeV2 "select month_floor(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	// qt_sql_month_floor_DateTimeV2_DateTimeV2_notnull "select month_floor(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_month_floor_DateTimeV2_Integer "select month_floor(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	// qt_sql_month_floor_DateTimeV2_Integer_notnull "select month_floor(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_month_floor_DateV2_DateV2 "select month_floor(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	// qt_sql_month_floor_DateV2_DateV2_notnull "select month_floor(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_month_floor_DateV2_Integer "select month_floor(kdtv2, kint) from fn_test order by kdtv2, kint"
	// qt_sql_month_floor_DateV2_Integer_notnull "select month_floor(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_month_floor_DateTime_Integer_DateTime "select month_floor(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_month_floor_DateTime_Integer_DateTime_notnull "select month_floor(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_month_floor_DateTimeV2_Integer_DateTimeV2 "select month_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	// qt_sql_month_floor_DateTimeV2_Integer_DateTimeV2_notnull "select month_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	qt_sql_month_floor_DateV2_Integer_DateV2 "select month_floor(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
	// qt_sql_month_floor_DateV2_Integer_DateV2_notnull "select month_floor(kdtv2, kint, kdtv2) from fn_test_not_nullable order by kdtv2, kint, kdtv2"
	qt_sql_monthname_DateTime "select monthname(kdtm) from fn_test order by kdtm"
	qt_sql_monthname_DateTime_notnull "select monthname(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_monthname_DateTimeV2 "select monthname(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_monthname_DateTimeV2_notnull "select monthname(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_monthname_DateV2 "select monthname(kdtv2) from fn_test order by kdtv2"
	qt_sql_monthname_DateV2_notnull "select monthname(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_months_add_DateTime_Integer "select months_add(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_months_add_DateTime_Integer_notnull "select months_add(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_months_add_DateTimeV2_Integer "select months_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_months_add_DateTimeV2_Integer_notnull "select months_add(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_months_add_Date_Integer "select months_add(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_months_add_Date_Integer_notnull "select months_add(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_months_add_DateV2_Integer "select months_add(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_months_add_DateV2_Integer_notnull "select months_add(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_months_diff_DateTime_DateTime "select months_diff(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_months_diff_DateTime_DateTime_notnull "select months_diff(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_months_diff_DateTimeV2_DateTimeV2 "select months_diff(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	qt_sql_months_diff_DateTimeV2_DateTimeV2_notnull "select months_diff(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_months_diff_DateV2_DateTimeV2 "select months_diff(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
	qt_sql_months_diff_DateV2_DateTimeV2_notnull "select months_diff(kdtv2, kdtmv2s1) from fn_test_not_nullable order by kdtv2, kdtmv2s1"
	qt_sql_months_diff_DateTimeV2_DateV2 "select months_diff(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
	qt_sql_months_diff_DateTimeV2_DateV2_notnull "select months_diff(kdtmv2s1, kdtv2) from fn_test_not_nullable order by kdtmv2s1, kdtv2"
	qt_sql_months_diff_DateV2_DateV2 "select months_diff(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	qt_sql_months_diff_DateV2_DateV2_notnull "select months_diff(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_months_diff_DateV2_DateTime "select months_diff(kdtv2, kdtm) from fn_test order by kdtv2, kdtm"
	qt_sql_months_diff_DateV2_DateTime_notnull "select months_diff(kdtv2, kdtm) from fn_test_not_nullable order by kdtv2, kdtm"
	qt_sql_months_diff_DateTime_DateV2 "select months_diff(kdtm, kdtv2) from fn_test order by kdtm, kdtv2"
	qt_sql_months_diff_DateTime_DateV2_notnull "select months_diff(kdtm, kdtv2) from fn_test_not_nullable order by kdtm, kdtv2"
	qt_sql_months_diff_DateTimeV2_DateTime "select months_diff(kdtmv2s1, kdtm) from fn_test order by kdtmv2s1, kdtm"
	qt_sql_months_diff_DateTimeV2_DateTime_notnull "select months_diff(kdtmv2s1, kdtm) from fn_test_not_nullable order by kdtmv2s1, kdtm"
	qt_sql_months_diff_DateTime_DateTimeV2 "select months_diff(kdtm, kdtmv2s1) from fn_test order by kdtm, kdtmv2s1"
	qt_sql_months_diff_DateTime_DateTimeV2_notnull "select months_diff(kdtm, kdtmv2s1) from fn_test_not_nullable order by kdtm, kdtmv2s1"
	qt_sql_months_sub_DateTime_Integer "select months_sub(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_months_sub_DateTime_Integer_notnull "select months_sub(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_months_sub_DateTimeV2_Integer "select months_sub(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_months_sub_DateTimeV2_Integer_notnull "select months_sub(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_months_sub_Date_Integer "select months_sub(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_months_sub_Date_Integer_notnull "select months_sub(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_months_sub_DateV2_Integer "select months_sub(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_months_sub_DateV2_Integer_notnull "select months_sub(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_murmur_hash3_32_Varchar "select murmur_hash3_32(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_murmur_hash3_32_Varchar_notnull "select murmur_hash3_32(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_murmur_hash3_32_String "select murmur_hash3_32(kstr) from fn_test order by kstr"
	qt_sql_murmur_hash3_32_String_notnull "select murmur_hash3_32(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_murmur_hash3_64_Varchar "select murmur_hash3_64(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_murmur_hash3_64_Varchar_notnull "select murmur_hash3_64(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_murmur_hash3_64_String "select murmur_hash3_64(kstr) from fn_test order by kstr"
	qt_sql_murmur_hash3_64_String_notnull "select murmur_hash3_64(kstr) from fn_test_not_nullable order by kstr"
}