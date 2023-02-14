
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

suite("nereids_scalar_fn_W") {
	sql 'use regression_test_nereids_function_p0'
	sql 'set enable_nereids_planner=true'
	sql 'set enable_fallback_to_original_planner=false'
	qt_sql_week_DateTime "select week(kdtm) from fn_test order by kdtm"
	qt_sql_week_DateTime_n "select week(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_week_DateTimeV2 "select week(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_week_DateTimeV2_n "select week(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_week_DateV2 "select week(kdtv2) from fn_test order by kdtv2"
	qt_sql_week_DateV2_n "select week(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_week_DateTime_Integer "select week(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_week_DateTime_Integer_n "select week(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_week_DateTimeV2_Integer "select week(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_week_DateTimeV2_Integer_n "select week(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_week_DateV2_Integer "select week(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_week_DateV2_Integer_n "select week(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_week_ceil_DateTime "select week_ceil(kdtm) from fn_test order by kdtm"
	qt_sql_week_ceil_DateTime_n "select week_ceil(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_week_ceil_DateTimeV2 "select week_ceil(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_week_ceil_DateTimeV2_n "select week_ceil(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_week_ceil_DateV2 "select week_ceil(kdtv2) from fn_test order by kdtv2"
	qt_sql_week_ceil_DateV2_n "select week_ceil(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_week_ceil_DateTime_DateTime "select week_ceil(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_week_ceil_DateTime_DateTime_n "select week_ceil(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_week_ceil_DateTime_Integer "select week_ceil(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_week_ceil_DateTime_Integer_n "select week_ceil(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_week_ceil_DateTimeV2_DateTimeV2 "select week_ceil(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	qt_sql_week_ceil_DateTimeV2_DateTimeV2_n "select week_ceil(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_week_ceil_DateTimeV2_Integer "select week_ceil(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_week_ceil_DateTimeV2_Integer_n "select week_ceil(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_week_ceil_DateV2_DateV2 "select week_ceil(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	qt_sql_week_ceil_DateV2_DateV2_n "select week_ceil(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_week_ceil_DateV2_Integer "select week_ceil(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_week_ceil_DateV2_Integer_n "select week_ceil(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_week_ceil_DateTime_Integer_DateTime "select week_ceil(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_week_ceil_DateTime_Integer_DateTime_n "select week_ceil(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_week_ceil_DateTimeV2_Integer_DateTimeV2 "select week_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	qt_sql_week_ceil_DateTimeV2_Integer_DateTimeV2_n "select week_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	qt_sql_week_ceil_DateV2_Integer_DateV2 "select week_ceil(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
	qt_sql_week_ceil_DateV2_Integer_DateV2_n "select week_ceil(kdtv2, kint, kdtv2) from fn_test_not_nullable order by kdtv2, kint, kdtv2"
	qt_sql_week_floor_DateTime "select week_floor(kdtm) from fn_test order by kdtm"
	qt_sql_week_floor_DateTime_n "select week_floor(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_week_floor_DateTimeV2 "select week_floor(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_week_floor_DateTimeV2_n "select week_floor(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_week_floor_DateV2 "select week_floor(kdtv2) from fn_test order by kdtv2"
	qt_sql_week_floor_DateV2_n "select week_floor(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_week_floor_DateTime_DateTime "select week_floor(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_week_floor_DateTime_DateTime_n "select week_floor(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_week_floor_DateTime_Integer "select week_floor(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_week_floor_DateTime_Integer_n "select week_floor(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_week_floor_DateTimeV2_DateTimeV2 "select week_floor(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	qt_sql_week_floor_DateTimeV2_DateTimeV2_n "select week_floor(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_week_floor_DateTimeV2_Integer "select week_floor(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_week_floor_DateTimeV2_Integer_n "select week_floor(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_week_floor_DateV2_DateV2 "select week_floor(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	qt_sql_week_floor_DateV2_DateV2_n "select week_floor(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_week_floor_DateV2_Integer "select week_floor(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_week_floor_DateV2_Integer_n "select week_floor(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_week_floor_DateTime_Integer_DateTime "select week_floor(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
	qt_sql_week_floor_DateTime_Integer_DateTime_n "select week_floor(kdtm, kint, kdtm) from fn_test_not_nullable order by kdtm, kint, kdtm"
	qt_sql_week_floor_DateTimeV2_Integer_DateTimeV2 "select week_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
	qt_sql_week_floor_DateTimeV2_Integer_DateTimeV2_n "select week_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kint, kdtmv2s1"
	qt_sql_week_floor_DateV2_Integer_DateV2 "select week_floor(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
	qt_sql_week_floor_DateV2_Integer_DateV2_n "select week_floor(kdtv2, kint, kdtv2) from fn_test_not_nullable order by kdtv2, kint, kdtv2"
	qt_sql_weekday_DateTime "select weekday(kdtm) from fn_test order by kdtm"
	qt_sql_weekday_DateTime_n "select weekday(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_weekday_DateTimeV2 "select weekday(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_weekday_DateTimeV2_n "select weekday(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_weekday_DateV2 "select weekday(kdtv2) from fn_test order by kdtv2"
	qt_sql_weekday_DateV2_n "select weekday(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_weekofyear_DateTime "select weekofyear(kdtm) from fn_test order by kdtm"
	qt_sql_weekofyear_DateTime_n "select weekofyear(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_weekofyear_DateTimeV2 "select weekofyear(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_weekofyear_DateTimeV2_n "select weekofyear(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_weekofyear_DateV2 "select weekofyear(kdtv2) from fn_test order by kdtv2"
	qt_sql_weekofyear_DateV2_n "select weekofyear(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_weeks_add_DateTimeV2_Integer "select weeks_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_weeks_add_DateTimeV2_Integer_n "select weeks_add(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_weeks_add_DateV2_Integer "select weeks_add(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_weeks_add_DateV2_Integer_n "select weeks_add(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_weeks_add_DateTime_Integer "select weeks_add(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_weeks_add_DateTime_Integer_n "select weeks_add(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_weeks_add_Date_Integer "select weeks_add(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_weeks_add_Date_Integer_n "select weeks_add(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_weeks_add_DateTime_Integer "select weeks_add(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_weeks_add_DateTime_Integer_n "select weeks_add(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_weeks_add_Date_Integer "select weeks_add(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_weeks_add_Date_Integer_n "select weeks_add(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_weeks_add_DateTimeV2_Integer "select weeks_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_weeks_add_DateTimeV2_Integer_n "select weeks_add(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_weeks_add_DateV2_Integer "select weeks_add(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_weeks_add_DateV2_Integer_n "select weeks_add(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_weeks_diff_DateTime_DateTime "select weeks_diff(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_weeks_diff_DateTime_DateTime_n "select weeks_diff(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_weeks_diff_DateTimeV2_DateTimeV2 "select weeks_diff(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	qt_sql_weeks_diff_DateTimeV2_DateTimeV2_n "select weeks_diff(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_weeks_diff_DateV2_DateTimeV2 "select weeks_diff(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
	qt_sql_weeks_diff_DateV2_DateTimeV2_n "select weeks_diff(kdtv2, kdtmv2s1) from fn_test_not_nullable order by kdtv2, kdtmv2s1"
	qt_sql_weeks_diff_DateTimeV2_DateV2 "select weeks_diff(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
	qt_sql_weeks_diff_DateTimeV2_DateV2_n "select weeks_diff(kdtmv2s1, kdtv2) from fn_test_not_nullable order by kdtmv2s1, kdtv2"
	qt_sql_weeks_diff_DateV2_DateV2 "select weeks_diff(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	qt_sql_weeks_diff_DateV2_DateV2_n "select weeks_diff(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_weeks_diff_DateV2_DateTime "select weeks_diff(kdtv2, kdtm) from fn_test order by kdtv2, kdtm"
	qt_sql_weeks_diff_DateV2_DateTime_n "select weeks_diff(kdtv2, kdtm) from fn_test_not_nullable order by kdtv2, kdtm"
	qt_sql_weeks_diff_DateTime_DateV2 "select weeks_diff(kdtm, kdtv2) from fn_test order by kdtm, kdtv2"
	qt_sql_weeks_diff_DateTime_DateV2_n "select weeks_diff(kdtm, kdtv2) from fn_test_not_nullable order by kdtm, kdtv2"
	qt_sql_weeks_diff_DateTimeV2_DateTime "select weeks_diff(kdtmv2s1, kdtm) from fn_test order by kdtmv2s1, kdtm"
	qt_sql_weeks_diff_DateTimeV2_DateTime_n "select weeks_diff(kdtmv2s1, kdtm) from fn_test_not_nullable order by kdtmv2s1, kdtm"
	qt_sql_weeks_diff_DateTime_DateTimeV2 "select weeks_diff(kdtm, kdtmv2s1) from fn_test order by kdtm, kdtmv2s1"
	qt_sql_weeks_diff_DateTime_DateTimeV2_n "select weeks_diff(kdtm, kdtmv2s1) from fn_test_not_nullable order by kdtm, kdtmv2s1"
	qt_sql_weeks_sub_DateTimeV2_Integer "select weeks_sub(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_weeks_sub_DateTimeV2_Integer_n "select weeks_sub(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_weeks_sub_DateV2_Integer "select weeks_sub(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_weeks_sub_DateV2_Integer_n "select weeks_sub(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_weeks_sub_DateTime_Integer "select weeks_sub(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_weeks_sub_DateTime_Integer_n "select weeks_sub(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_weeks_sub_Date_Integer "select weeks_sub(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_weeks_sub_Date_Integer_n "select weeks_sub(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_weeks_sub_DateTime_Integer "select weeks_sub(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_weeks_sub_DateTime_Integer_n "select weeks_sub(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_weeks_sub_Date_Integer "select weeks_sub(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_weeks_sub_Date_Integer_n "select weeks_sub(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_weeks_sub_DateTimeV2_Integer "select weeks_sub(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_weeks_sub_DateTimeV2_Integer_n "select weeks_sub(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_weeks_sub_DateV2_Integer "select weeks_sub(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_weeks_sub_DateV2_Integer_n "select weeks_sub(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_width_bucket_TinyInt_TinyInt_TinyInt_TinyInt "select width_bucket(ktint, ktint, ktint, ktint) from fn_test order by ktint, ktint, ktint, ktint"
	qt_sql_width_bucket_TinyInt_TinyInt_TinyInt_TinyInt_n "select width_bucket(ktint, ktint, ktint, ktint) from fn_test_not_nullable order by ktint, ktint, ktint, ktint"
	qt_sql_width_bucket_SmallInt_SmallInt_SmallInt_SmallInt "select width_bucket(ksint, ksint, ksint, ksint) from fn_test order by ksint, ksint, ksint, ksint"
	qt_sql_width_bucket_SmallInt_SmallInt_SmallInt_SmallInt_n "select width_bucket(ksint, ksint, ksint, ksint) from fn_test_not_nullable order by ksint, ksint, ksint, ksint"
	qt_sql_width_bucket_Integer_Integer_Integer_Integer "select width_bucket(kint, kint, kint, kint) from fn_test order by kint, kint, kint, kint"
	qt_sql_width_bucket_Integer_Integer_Integer_Integer_n "select width_bucket(kint, kint, kint, kint) from fn_test_not_nullable order by kint, kint, kint, kint"
	qt_sql_width_bucket_BigInt_BigInt_BigInt_BigInt "select width_bucket(kbint, kbint, kbint, kbint) from fn_test order by kbint, kbint, kbint, kbint"
	qt_sql_width_bucket_BigInt_BigInt_BigInt_BigInt_n "select width_bucket(kbint, kbint, kbint, kbint) from fn_test_not_nullable order by kbint, kbint, kbint, kbint"
	qt_sql_width_bucket_Float_Float_Float_TinyInt "select width_bucket(kfloat, kfloat, kfloat, ktint) from fn_test order by kfloat, kfloat, kfloat, ktint"
	qt_sql_width_bucket_Float_Float_Float_TinyInt_n "select width_bucket(kfloat, kfloat, kfloat, ktint) from fn_test_not_nullable order by kfloat, kfloat, kfloat, ktint"
	qt_sql_width_bucket_Double_Double_Double_TinyInt "select width_bucket(kdbl, kdbl, kdbl, ktint) from fn_test order by kdbl, kdbl, kdbl, ktint"
	qt_sql_width_bucket_Double_Double_Double_TinyInt_n "select width_bucket(kdbl, kdbl, kdbl, ktint) from fn_test_not_nullable order by kdbl, kdbl, kdbl, ktint"
	qt_sql_width_bucket_DecimalV2_DecimalV2_DecimalV2_TinyInt "select width_bucket(kdcmls1, kdcmls1, kdcmls1, ktint) from fn_test order by kdcmls1, kdcmls1, kdcmls1, ktint"
	qt_sql_width_bucket_DecimalV2_DecimalV2_DecimalV2_TinyInt_n "select width_bucket(kdcmls1, kdcmls1, kdcmls1, ktint) from fn_test_not_nullable order by kdcmls1, kdcmls1, kdcmls1, ktint"
	qt_sql_width_bucket_Date_Date_Date_TinyInt "select width_bucket(kdt, kdt, kdt, ktint) from fn_test order by kdt, kdt, kdt, ktint"
	qt_sql_width_bucket_Date_Date_Date_TinyInt_n "select width_bucket(kdt, kdt, kdt, ktint) from fn_test_not_nullable order by kdt, kdt, kdt, ktint"
	qt_sql_width_bucket_DateV2_DateV2_DateV2_TinyInt "select width_bucket(kdtv2, kdtv2, kdtv2, ktint) from fn_test order by kdtv2, kdtv2, kdtv2, ktint"
	qt_sql_width_bucket_DateV2_DateV2_DateV2_TinyInt_n "select width_bucket(kdtv2, kdtv2, kdtv2, ktint) from fn_test_not_nullable order by kdtv2, kdtv2, kdtv2, ktint"
	qt_sql_width_bucket_DateTime_DateTime_DateTime_TinyInt "select width_bucket(kdtm, kdtm, kdtm, ktint) from fn_test order by kdtm, kdtm, kdtm, ktint"
	qt_sql_width_bucket_DateTime_DateTime_DateTime_TinyInt_n "select width_bucket(kdtm, kdtm, kdtm, ktint) from fn_test_not_nullable order by kdtm, kdtm, kdtm, ktint"
	qt_sql_width_bucket_DateTimeV2_DateTimeV2_DateTimeV2_TinyInt "select width_bucket(kdtmv2s1, kdtmv2s1, kdtmv2s1, ktint) from fn_test order by kdtmv2s1, kdtmv2s1, kdtmv2s1, ktint"
	qt_sql_width_bucket_DateTimeV2_DateTimeV2_DateTimeV2_TinyInt_n "select width_bucket(kdtmv2s1, kdtmv2s1, kdtmv2s1, ktint) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1, kdtmv2s1, ktint"
}