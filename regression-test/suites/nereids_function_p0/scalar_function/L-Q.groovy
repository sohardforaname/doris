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

suite("nereids_scalar_fn_3") {
    sql "use regression_test_nereids_function_p0"
    sql "set enable_nereids_planner=true"
    sql "set enable_fallback_to_original_planner=false"

    qt_sql "select last_day(kdtm) from fn_test order by kdtm"
    qt_sql "select last_day(kdt) from fn_test order by kdt"
    qt_sql "select last_day(kdtmv2s1) from fn_test order by kdtmv2s1"
    qt_sql "select last_day(kdtv2) from fn_test order by kdtv2"
    qt_sql "select least(ktint) from fn_test order by ktint"
    qt_sql "select least(ksint) from fn_test order by ksint"
    qt_sql "select least(kint) from fn_test order by kint"
    qt_sql "select least(kbint) from fn_test order by kbint"
    qt_sql "select least(klint) from fn_test order by klint"
    qt_sql "select least(kfloat) from fn_test order by kfloat"
    qt_sql "select least(kdbl) from fn_test order by kdbl"
    qt_sql "select least(kdtm) from fn_test order by kdtm"
    qt_sql "select least(kdcmls1) from fn_test order by kdcmls1"
    qt_sql "select least(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select least(kstr) from fn_test order by kstr"
    qt_sql "select left(kvchrs1, kint) from fn_test order by kvchrs1, kint"
    qt_sql "select left(kstr, kint) from fn_test order by kstr, kint"
    qt_sql "select length(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select length(kstr) from fn_test order by kstr"
    qt_sql "select ln(kdbl) from fn_test order by kdbl"
    // core
    // sql "select local_time() from fn_test"
    // qt_sql "select local_time(kint) from fn_test order by kint"
    // sql "select local_timestamp() from fn_test"
    // qt_sql "select local_timestamp(kint) from fn_test order by kint"
    qt_sql "select locate(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
    qt_sql "select locate(kstr, kstr) from fn_test order by kstr, kstr"
    qt_sql "select locate(kvchrs1, kvchrs1, kint) from fn_test order by kvchrs1, kvchrs1, kint"
    qt_sql "select locate(kstr, kstr, kint) from fn_test order by kstr, kstr, kint"
    qt_sql "select log(kdbl, kdbl) from fn_test order by kdbl, kdbl"
    qt_sql "select log10(kdbl) from fn_test order by kdbl"
    qt_sql "select log2(kdbl) from fn_test order by kdbl"
    qt_sql "select lower(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select lower(kstr) from fn_test order by kstr"
    // timeout
    // qt_sql "select lpad(kvchrs1, kint, kvchrs1) from fn_test order by kvchrs1, kint, kvchrs1"
    // qt_sql "select lpad(kstr, kint, kstr) from fn_test order by kstr, kint, kstr"
    qt_sql "select ltrim(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select ltrim(kstr) from fn_test order by kstr"
    // cannot find function
    // qt_sql "select make_date(kint, kint) from fn_test order by kint, kint"
    qt_sql "select mask(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select mask(kstr) from fn_test order by kstr"
    qt_sql "select mask_first_n(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select mask_first_n(kstr) from fn_test order by kstr"
    // core
    // qt_sql "select mask_first_n(kvchrs1, kint) from fn_test order by kvchrs1, kint"
    // qt_sql "select mask_first_n(kstr, kint) from fn_test order by kstr, kint"
    qt_sql "select mask_last_n(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select mask_last_n(kstr) from fn_test order by kstr"
    // core
    // qt_sql "select mask_last_n(kvchrs1, kint) from fn_test order by kvchrs1, kint"
    // qt_sql "select mask_last_n(kstr, kint) from fn_test order by kstr, kint"
    qt_sql "select md5(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select md5(kstr) from fn_test order by kstr"
    // cannot find function
    // qt_sql "select md5_sum(kvchrs1) from fn_test order by kvchrs1"
    // qt_sql "select md5_sum(kstr) from fn_test order by kstr"
    qt_sql "select minute(kdtm) from fn_test order by kdtm"
    qt_sql "select minute(kdtmv2s1) from fn_test order by kdtmv2s1"
    qt_sql "select minute(kdtv2) from fn_test order by kdtv2"
    qt_sql "select minute_ceil(kdtm) from fn_test order by kdtm"
    qt_sql "select minute_ceil(kdtmv2s1) from fn_test order by kdtmv2s1"
    // core
    // qt_sql "select minute_ceil(kdtv2) from fn_test order by kdtv2"
    qt_sql "select minute_ceil(kdtm, kdtm) from fn_test order by kdtm, kdtm"
    qt_sql "select minute_ceil(kdtm, kint) from fn_test order by kdtm, kint"
    qt_sql "select minute_ceil(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
    qt_sql "select minute_ceil(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
    // core
    // qt_sql "select minute_ceil(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
    // qt_sql "select minute_ceil(kdtv2, kint) from fn_test order by kdtv2, kint"
    qt_sql "select minute_ceil(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
    qt_sql "select minute_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
    // core
    // qt_sql "select minute_ceil(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
    qt_sql "select minute_floor(kdtm) from fn_test order by kdtm"
    qt_sql "select minute_floor(kdtmv2s1) from fn_test order by kdtmv2s1"
    // core
    // qt_sql "select minute_floor(kdtv2) from fn_test order by kdtv2"
    qt_sql "select minute_floor(kdtm, kdtm) from fn_test order by kdtm, kdtm"
    qt_sql "select minute_floor(kdtm, kint) from fn_test order by kdtm, kint"
    qt_sql "select minute_floor(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
    qt_sql "select minute_floor(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
    // core
    // qt_sql "select minute_floor(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
    // qt_sql "select minute_floor(kdtv2, kint) from fn_test order by kdtv2, kint"
    qt_sql "select minute_floor(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
    qt_sql "select minute_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
    // core
    // qt_sql "select minute_floor(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
    // cannot find function
    // qt_sql "select minutes_add(kdtm, kint) from fn_test order by kdtm, kint"
    // qt_sql "select minutes_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
    // qt_sql "select minutes_add(kdt, kint) from fn_test order by kdt, kint"
    // qt_sql "select minutes_add(kdtv2, kint) from fn_test order by kdtv2, kint"
    qt_sql "select minutes_diff(kdtm, kdtm) from fn_test order by kdtm, kdtm"
    qt_sql "select minutes_diff(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
    qt_sql "select minutes_diff(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
    qt_sql "select minutes_diff(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
    qt_sql "select minutes_diff(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
    qt_sql "select minutes_diff(kdtv2, kdtm) from fn_test order by kdtv2, kdtm"
    qt_sql "select minutes_diff(kdtm, kdtv2) from fn_test order by kdtm, kdtv2"
    qt_sql "select minutes_diff(kdtmv2s1, kdtm) from fn_test order by kdtmv2s1, kdtm"
    qt_sql "select minutes_diff(kdtm, kdtmv2s1) from fn_test order by kdtm, kdtmv2s1"
    // cannot find function
    // qt_sql "select minutes_sub(kdtm, kint) from fn_test order by kdtm, kint"
    // qt_sql "select minutes_sub(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
    // qt_sql "select minutes_sub(kdt, kint) from fn_test order by kdt, kint"
    // qt_sql "select minutes_sub(kdtv2, kint) from fn_test order by kdtv2, kint"
    qt_sql "select money_format(kbint) from fn_test order by kbint"
    qt_sql "select money_format(klint) from fn_test order by klint"
    qt_sql "select money_format(kdbl) from fn_test order by kdbl"
    qt_sql "select money_format(kdcmls1) from fn_test order by kdcmls1"
    qt_sql "select month(kdtm) from fn_test order by kdtm"
    qt_sql "select month(kdtmv2s1) from fn_test order by kdtmv2s1"
    qt_sql "select month(kdtv2) from fn_test order by kdtv2"
    qt_sql "select month_ceil(kdtm) from fn_test order by kdtm"
    qt_sql "select month_ceil(kdtmv2s1) from fn_test order by kdtmv2s1"
    qt_sql "select month_ceil(kdtv2) from fn_test order by kdtv2"
    qt_sql "select month_ceil(kdtm, kdtm) from fn_test order by kdtm, kdtm"
    qt_sql "select month_ceil(kdtm, kint) from fn_test order by kdtm, kint"
    qt_sql "select month_ceil(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
    qt_sql "select month_ceil(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
    qt_sql "select month_ceil(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
    qt_sql "select month_ceil(kdtv2, kint) from fn_test order by kdtv2, kint"
    qt_sql "select month_ceil(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
    qt_sql "select month_ceil(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
    qt_sql "select month_ceil(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
    qt_sql "select month_floor(kdtm) from fn_test order by kdtm"
    qt_sql "select month_floor(kdtmv2s1) from fn_test order by kdtmv2s1"
    qt_sql "select month_floor(kdtv2) from fn_test order by kdtv2"
    qt_sql "select month_floor(kdtm, kdtm) from fn_test order by kdtm, kdtm"
    qt_sql "select month_floor(kdtm, kint) from fn_test order by kdtm, kint"
    qt_sql "select month_floor(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
    qt_sql "select month_floor(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
    qt_sql "select month_floor(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
    qt_sql "select month_floor(kdtv2, kint) from fn_test order by kdtv2, kint"
    qt_sql "select month_floor(kdtm, kint, kdtm) from fn_test order by kdtm, kint, kdtm"
    qt_sql "select month_floor(kdtmv2s1, kint, kdtmv2s1) from fn_test order by kdtmv2s1, kint, kdtmv2s1"
    qt_sql "select month_floor(kdtv2, kint, kdtv2) from fn_test order by kdtv2, kint, kdtv2"
    // cannot find function
    // qt_sql "select month_name(kdtm) from fn_test order by kdtm"
    // qt_sql "select month_name(kdtmv2s1) from fn_test order by kdtmv2s1"
    // qt_sql "select month_name(kdtv2) from fn_test order by kdtv2"
    // qt_sql "select months_add(kdtm, kint) from fn_test order by kdtm, kint"
    // qt_sql "select months_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
    // qt_sql "select months_add(kdt, kint) from fn_test order by kdt, kint"
    // qt_sql "select months_add(kdtv2, kint) from fn_test order by kdtv2, kint"
    qt_sql "select months_diff(kdtm, kdtm) from fn_test order by kdtm, kdtm"
    qt_sql "select months_diff(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
    qt_sql "select months_diff(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
    qt_sql "select months_diff(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
    qt_sql "select months_diff(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
    // result error
    // qt_sql "select months_diff(kdtv2, kdtm) from fn_test order by kdtv2, kdtm"
    // qt_sql "select months_diff(kdtm, kdtv2) from fn_test order by kdtm, kdtv2"
    qt_sql "select months_diff(kdtmv2s1, kdtm) from fn_test order by kdtmv2s1, kdtm"
    qt_sql "select months_diff(kdtm, kdtmv2s1) from fn_test order by kdtm, kdtmv2s1"
    // cannot find function
    // qt_sql "select months_sub(kdtm, kint) from fn_test order by kdtm, kint"
    // qt_sql "select months_sub(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
    // qt_sql "select months_sub(kdt, kint) from fn_test order by kdt, kint"
    // qt_sql "select months_sub(kdtv2, kint) from fn_test order by kdtv2, kint"
    // qt_sql "select murmur_hash332(kvchrs1) from fn_test order by kvchrs1"
    // qt_sql "select murmur_hash332(kstr) from fn_test order by kstr"
    // qt_sql "select murmur_hash364(kvchrs1) from fn_test order by kvchrs1"
    // qt_sql "select murmur_hash364(kstr) from fn_test order by kstr"
    qt_sql "select negative(kbint) from fn_test order by kbint"
    qt_sql "select negative(kdbl) from fn_test order by kdbl"
    qt_sql "select negative(kdcmls1) from fn_test order by kdcmls1"
    qt_sql "select not_null_or_empty(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select not_null_or_empty(kstr) from fn_test order by kstr"
    sql "select now() from fn_test"
    // core
    // qt_sql "select now(kint) from fn_test order by kint"
    // cannot find function
    // qt_sql "select null_if(kbool, kbool) from fn_test order by kbool, kbool"
    // qt_sql "select null_if(ktint, ktint) from fn_test order by ktint, ktint"
    // qt_sql "select null_if(ksint, ksint) from fn_test order by ksint, ksint"
    // qt_sql "select null_if(kint, kint) from fn_test order by kint, kint"
    // qt_sql "select null_if(kbint, kbint) from fn_test order by kbint, kbint"
    // qt_sql "select null_if(klint, klint) from fn_test order by klint, klint"
    // qt_sql "select null_if(kfloat, kfloat) from fn_test order by kfloat, kfloat"
    // qt_sql "select null_if(kdbl, kdbl) from fn_test order by kdbl, kdbl"
    // qt_sql "select null_if(kdtm, kdtm) from fn_test order by kdtm, kdtm"
    // qt_sql "select null_if(kdt, kdt) from fn_test order by kdt, kdt"
    // qt_sql "select null_if(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
    // qt_sql "select null_if(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
    // qt_sql "select null_if(kdcmls1, kdcmls1) from fn_test order by kdcmls1, kdcmls1"
    // qt_sql "select null_if(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
    // qt_sql "select null_if(kstr, kstr) from fn_test order by kstr, kstr"
    qt_sql "select null_or_empty(kvchrs1) from fn_test order by kvchrs1"
    qt_sql "select null_or_empty(kstr) from fn_test order by kstr"
    qt_sql "select nvl(kbool, kbool) from fn_test order by kbool, kbool"
    qt_sql "select nvl(ktint, ktint) from fn_test order by ktint, ktint"
    qt_sql "select nvl(ksint, ksint) from fn_test order by ksint, ksint"
    qt_sql "select nvl(kint, kint) from fn_test order by kint, kint"
    qt_sql "select nvl(kbint, kbint) from fn_test order by kbint, kbint"
    qt_sql "select nvl(klint, klint) from fn_test order by klint, klint"
    qt_sql "select nvl(kfloat, kfloat) from fn_test order by kfloat, kfloat"
    qt_sql "select nvl(kdbl, kdbl) from fn_test order by kdbl, kdbl"
    qt_sql "select nvl(kdt, kdt) from fn_test order by kdt, kdt"
    qt_sql "select nvl(kdtm, kdtm) from fn_test order by kdtm, kdtm"
    // result error
    // qt_sql "select nvl(kdt, kdtm) from fn_test order by kdt, kdtm"
    qt_sql "select nvl(kdtm, kdt) from fn_test order by kdtm, kdt"
    qt_sql "select nvl(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
    // result error
    // qt_sql "select nvl(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
    // qt_sql "select nvl(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
    qt_sql "select nvl(kdcmls1, kdcmls1) from fn_test order by kdcmls1, kdcmls1"
// function nvl(bitmap, bitmap) is unsupported for the test suite.
    qt_sql "select nvl(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
    qt_sql "select nvl(kstr, kstr) from fn_test order by kstr, kstr"
    // data out of style
    // qt_sql "select parse_url(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
    // qt_sql "select parse_url(kstr, kstr) from fn_test order by kstr, kstr"
    // qt_sql "select parse_url(kvchrs1, kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1, kvchrs1"
    // qt_sql "select parse_url(kstr, kstr, kstr) from fn_test order by kstr, kstr, kstr"
    qt_sql "select pi() from fn_test"
    qt_sql "select pmod(kbint, kbint) from fn_test order by kbint, kbint"
    qt_sql "select pmod(kdbl, kdbl) from fn_test order by kdbl, kdbl"
    qt_sql "select positive(kbint) from fn_test order by kbint"
    qt_sql "select positive(kdbl) from fn_test order by kdbl"
    // core
    // qt_sql "select positive(kdcmls1) from fn_test order by kdcmls1"
    // data out of double range
    // qt_sql "select pow(kdbl, kdbl) from fn_test order by kdbl, kdbl"
    // qt_sql "select power(kdbl, kdbl) from fn_test order by kdbl, kdbl"
    qt_sql "select protocol(kstr) from fn_test order by kstr"
// function quantile_percent(quantilestate, float) is unsupported for the test suite.
    qt_sql "select quarter(kdtm) from fn_test order by kdtm"
    qt_sql "select quarter(kdtmv2s1) from fn_test order by kdtmv2s1"
    qt_sql "select quarter(kdtv2) from fn_test order by kdtv2"
}