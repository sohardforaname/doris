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

suite("nereids_scalar_fn_1") {
    sql "use regression_test_nereids_function_p0"
    sql "set enable_nereids_planner=true"
    sql "set enable_fallback_to_original_planner=false"
    
    def tableList = ["fn_test", "fn_test_not_nullable"]
    tableList.each {
        qt_sql "select abs(kdbl) from ${it} order by kdbl"
        qt_sql "select abs(kfloat) from ${it} order by kfloat"
        qt_sql "select abs(klint) from ${it} order by klint"
        qt_sql "select abs(kbint) from ${it} order by kbint"
        qt_sql "select abs(ksint) from ${it} order by ksint"
        qt_sql "select abs(kint) from ${it} order by kint"
        qt_sql "select abs(ktint) from ${it} order by ktint"
        qt_sql "select abs(kdcmls1) from ${it} order by kdcmls1"
        qt_sql "select acos(kdbl) from ${it} order by kdbl"
        sql "select aes_decrypt(kvchrs1, kvchrs1) from ${it} order by kvchrs1, kvchrs1"
        sql "select aes_decrypt(kstr, kstr) from ${it} order by kstr, kstr"
        sql "select aes_decrypt(kvchrs1, kvchrs1, kvchrs1) from ${it} order by kvchrs1, kvchrs1, kvchrs1"
        sql "select aes_decrypt(kstr, kstr, kstr) from ${it} order by kstr, kstr, kstr"
        sql "select aes_decrypt(kvchrs1, kvchrs1, kvchrs1, " AES_128_ECB ") from ${it} order by kvchrs1, kvchrs1, kvchrs1, kvchrs1"
        sql "select aes_decrypt(kstr, kstr, kstr, " AES_128_ECB ") from ${it} order by kstr, kstr, kstr, kstr"
        sql "select aes_encrypt(kvchrs1, kvchrs1) from ${it} order by kvchrs1, kvchrs1"
        sql "select aes_encrypt(kstr, kstr) from ${it} order by kstr, kstr"
        sql "select aes_encrypt(kvchrs1, kvchrs1, kvchrs1) from ${it} order by kvchrs1, kvchrs1, kvchrs1"
        sql "select aes_encrypt(kstr, kstr, kstr) from ${it} order by kstr, kstr, kstr"
        sql "select aes_encrypt(kvchrs1, kvchrs1, kvchrs1, " AES_128_ECB ") from ${it} order by kvchrs1, kvchrs1, kvchrs1, kvchrs1"
        sql "select aes_encrypt(kstr, kstr, kstr, " AES_128_ECB ") from ${it} order by kstr, kstr, kstr, kstr"
        qt_sql "select append_trailing_char_if_absent(kvchrs1, kvchrs1) from ${it} order by kvchrs1, kvchrs1"
        qt_sql "select append_trailing_char_if_absent(kstr, kstr) from ${it} order by kstr, kstr"
        qt_sql "select ascii(kvchrs1) from ${it} order by kvchrs1"
        qt_sql "select ascii(kstr) from ${it} order by kstr"
        qt_sql "select asin(kdbl) from ${it} order by kdbl"
        qt_sql "select atan(kdbl) from ${it} order by kdbl"
        qt_sql "select bin(kbint) from ${it} order by kbint"
        qt_sql "select bit_length(kvchrs1) from ${it} order by kvchrs1"
        qt_sql "select bit_length(kstr) from ${it} order by kstr"
        // bitmap test in nereids_p0/sql_functions/bitmap_functions/test_bitmap_function.groovy
        qt_sql "select bitmap_empty() from ${it}"
        qt_sql "select bitmap_from_string(kvchrs1) from ${it} order by kvchrs1"
        qt_sql "select bitmap_from_string(kstr) from ${it} order by kstr"
        qt_sql "select bitmap_hash(kvchrs1) from ${it} order by kvchrs1"
        qt_sql "select bitmap_hash(kstr) from ${it} order by kstr"
        qt_sql "select bitmap_hash64(kvchrs1) from ${it} order by kvchrs1"
        qt_sql "select bitmap_hash64(kstr) from ${it} order by kstr"
        qt_sql "select cbrt(kdbl) from ${it} order by kdbl"
        qt_sql "select ceil(kdbl) from ${it} order by kdbl"
        qt_sql "select ceiling(kdbl) from ${it} order by kdbl"
        qt_sql "select character_length(kvchrs1) from ${it} order by kvchrs1"
        qt_sql "select character_length(kstr) from ${it} order by kstr"
        qt_sql "select coalesce(kbool) from ${it} order by kbool"
        qt_sql "select coalesce(ktint) from ${it} order by ktint"
        qt_sql "select coalesce(ksint) from ${it} order by ksint"
        qt_sql "select coalesce(kint) from ${it} order by kint"
        qt_sql "select coalesce(kbint) from ${it} order by kbint"
        qt_sql "select coalesce(klint) from ${it} order by klint"
        qt_sql "select coalesce(kfloat) from ${it} order by kfloat"
        qt_sql "select coalesce(kdbl) from ${it} order by kdbl"
        qt_sql "select coalesce(kdtm) from ${it} order by kdtm"
        qt_sql "select coalesce(kdt) from ${it} order by kdt"
        qt_sql "select coalesce(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select coalesce(kdtv2) from ${it} order by kdtv2"
        qt_sql "select coalesce(kdcmls1) from ${it} order by kdcmls1"
        qt_sql "select coalesce(kvchrs1) from ${it} order by kvchrs1"
        qt_sql "select coalesce(kstr) from ${it} order by kstr"
        qt_sql "select concat(kvchrs1) from ${it} order by kvchrs1"
        qt_sql "select concat(kstr) from ${it} order by kstr"
        sql "select connection_id() from ${it}"
        qt_sql "select conv(kbint, ktint, ktint) from ${it} order by kbint, ktint, ktint"
        qt_sql "select conv(kvchrs1, ktint, ktint) from ${it} order by kvchrs1, ktint, ktint"
        qt_sql "select conv(kstr, ktint, ktint) from ${it} order by kstr, ktint, ktint"
        qt_sql "select convert_to(kvchrs1, 'gbk') from ${it} order by kvchrs1, kvchrs1"
        qt_sql "select convert_tz(kdtm, 'Asia/Shanghai', 'Europe/Sofia') from ${it} order by kdtm, kvchrs1, kvchrs1"
        qt_sql "select convert_tz(kdtmv2s1, 'Asia/Shanghai', 'Europe/Sofia') from ${it} order by kdtmv2s1, kvchrs1, kvchrs1"
        qt_sql "select convert_tz(kdtv2, 'Asia/Shanghai', 'Europe/Sofia') from ${it} order by kdtv2, kvchrs1, kvchrs1"
        qt_sql "select cos(kdbl) from ${it} order by kdbl"
        sql "select current_date() from ${it}"
        sql "select current_time() from ${it}"
        sql "select current_timestamp() from ${it}"
        sql "select current_timestamp(coalesce(kint, 0)) from ${it}"
        sql "select current_user() from ${it}"
        sql "select curtime() from ${it}"
        sql "select database() from ${it}"
        qt_sql "select date(kdtm) from ${it} order by kdtm"
        qt_sql "select date(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select datediff(kdtm, kdtm) from ${it} order by kdtm, kdtm"
        qt_sql "select datediff(kdtmv2s1, kdtmv2s1) from ${it} order by kdtmv2s1, kdtmv2s1"
        qt_sql "select datediff(kdtmv2s1, kdtv2) from ${it} order by kdtmv2s1, kdtv2"
        qt_sql "select datediff(kdtv2, kdtmv2s1) from ${it} order by kdtv2, kdtmv2s1"
        qt_sql "select datediff(kdtv2, kdtv2) from ${it} order by kdtv2, kdtv2"
        qt_sql "select datediff(kdtmv2s1, kdtm) from ${it} order by kdtmv2s1, kdtm"
        qt_sql "select datediff(kdtv2, kdtm) from ${it} order by kdtv2, kdtm"
        qt_sql "select date_format(kdtm, '2006-01-02 12:00:00') from ${it} order by kdtm"
        qt_sql "select date_format(kdt, '2006-01-02') from ${it} order by kdt"
        qt_sql "select date_format(kdtmv2s1, '2006-01-02 12:00:00') from ${it} order by kdtmv2s1"
        qt_sql "select date_format(kdtv2, '2006-01-02') from ${it} order by kdtv2"
        qt_sql "select date_trunc(kdtm, kvchrs1) from ${it} order by kdtm, kvchrs1"
        qt_sql "select date_trunc(kdtmv2s1, kvchrs1) from ${it} order by kdtmv2s1, kvchrs1"
        qt_sql "select datev2(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select day(kdtm) from ${it} order by kdtm"
        qt_sql "select day(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select day(kdtv2) from ${it} order by kdtv2"
        qt_sql "select day_ceil(kdtm) from ${it} order by kdtm"
        qt_sql "select day_ceil(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select day_ceil(kdtv2) from ${it} order by kdtv2"
        qt_sql "select day_ceil(kdtm, kdtm) from ${it} order by kdtm, kdtm"
        qt_sql "select day_ceil(kdtm, kint) from ${it} order by kdtm, kint"
        qt_sql "select day_ceil(kdtmv2s1, kdtmv2s1) from ${it} order by kdtmv2s1, kdtmv2s1"
        qt_sql "select day_ceil(kdtmv2s1, kint) from ${it} order by kdtmv2s1, kint"
        qt_sql "select day_ceil(kdtv2, kdtv2) from ${it} order by kdtv2, kdtv2"
        qt_sql "select day_ceil(kdtv2, kint) from ${it} order by kdtv2, kint"
        qt_sql "select day_ceil(kdtm, kint, kdtm) from ${it} order by kdtm, kint, kdtm"
        qt_sql "select day_ceil(kdtmv2s1, kint, kdtmv2s1) from ${it} order by kdtmv2s1, kint, kdtmv2s1"
        qt_sql "select day_ceil(kdtv2, kint, kdtv2) from ${it} order by kdtv2, kint, kdtv2"
        qt_sql "select day_floor(kdtm) from ${it} order by kdtm"
        qt_sql "select day_floor(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select day_floor(kdtv2) from ${it} order by kdtv2"
        qt_sql "select day_floor(kdtm, kdtm) from ${it} order by kdtm, kdtm"
        qt_sql "select day_floor(kdtm, kint) from ${it} order by kdtm, kint"
        qt_sql "select day_floor(kdtmv2s1, kdtmv2s1) from ${it} order by kdtmv2s1, kdtmv2s1"
        qt_sql "select day_floor(kdtmv2s1, kint) from ${it} order by kdtmv2s1, kint"
        qt_sql "select day_floor(kdtv2, kdtv2) from ${it} order by kdtv2, kdtv2"
        qt_sql "select day_floor(kdtv2, kint) from ${it} order by kdtv2, kint"
        qt_sql "select day_floor(kdtm, kint, kdtm) from ${it} order by kdtm, kint, kdtm"
        qt_sql "select day_floor(kdtmv2s1, kint, kdtmv2s1) from ${it} order by kdtmv2s1, kint, kdtmv2s1"
        qt_sql "select day_floor(kdtv2, kint, kdtv2) from ${it} order by kdtv2, kint, kdtv2"
        qt_sql "select dayname(kdtm) from ${it} order by kdtm"
        qt_sql "select dayname(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select dayname(kdtv2) from ${it} order by kdtv2"
        qt_sql "select dayofmonth(kdtm) from ${it} order by kdtm"
        qt_sql "select dayofmonth(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select dayofmonth(kdtv2) from ${it} order by kdtv2"
        qt_sql "select dayofweek(kdtm) from ${it} order by kdtm"
        qt_sql "select dayofweek(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select dayofweek(kdtv2) from ${it} order by kdtv2"
        qt_sql "select dayofyear(kdtm) from ${it} order by kdtm"
        qt_sql "select dayofyear(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select dayofyear(kdtv2) from ${it} order by kdtv2"
        qt_sql "select days_add(kdtm, kint) from ${it} order by kdtm, kint"
        qt_sql "select days_add(kdtmv2s1, kint) from ${it} order by kdtmv2s1, kint"
        qt_sql "select days_add(kdt, kint) from ${it} order by kdt, kint"
        qt_sql "select days_add(kdtv2, kint) from ${it} order by kdtv2, kint"
        qt_sql "select days_diff(kdtm, kdtm) from ${it} order by kdtm, kdtm"
        qt_sql "select days_diff(kdtmv2s1, kdtmv2s1) from ${it} order by kdtmv2s1, kdtmv2s1"
        qt_sql "select days_diff(kdtv2, kdtmv2s1) from ${it} order by kdtv2, kdtmv2s1"
        qt_sql "select days_diff(kdtmv2s1, kdtv2) from ${it} order by kdtmv2s1, kdtv2"
        qt_sql "select days_diff(kdtv2, kdtv2) from ${it} order by kdtv2, kdtv2"
        qt_sql "select days_diff(kdtv2, kdtm) from ${it} order by kdtv2, kdtm"
        qt_sql "select days_diff(kdtm, kdtv2) from ${it} order by kdtm, kdtv2"
        qt_sql "select days_diff(kdtmv2s1, kdtm) from ${it} order by kdtmv2s1, kdtm"
        qt_sql "select days_diff(kdtm, kdtmv2s1) from ${it} order by kdtm, kdtmv2s1"
        qt_sql "select days_sub(kdtm, kint) from ${it} order by kdtm, kint"
        qt_sql "select days_sub(kdtmv2s1, kint) from ${it} order by kdtmv2s1, kint"
        qt_sql "select days_sub(kdt, kint) from ${it} order by kdt, kint"
        qt_sql "select days_sub(kdtv2, kint) from ${it} order by kdtv2, kint"
        qt_sql "select dceil(kdbl) from ${it} order by kdbl"
        qt_sql "select degrees(kdbl) from ${it} order by kdbl"
        qt_sql "select dexp(kdbl) from ${it} order by kdbl"
        qt_sql "select dfloor(kdbl) from ${it} order by kdbl"
        qt_sql "select digital_masking(kbint) from ${it} order by kbint"
        qt_sql "select dlog1(kdbl) from ${it} order by kdbl"
        qt_sql "select dlog10(kdbl) from ${it} order by kdbl"
        qt_sql "select domain(kstr) from ${it} order by kstr"
        qt_sql "select domain_without_www(kstr) from ${it} order by kstr"
        qt_sql "select dpow(kdbl, kdbl) from ${it} order by kdbl, kdbl"
        qt_sql "select dround(kdbl) from ${it} order by kdbl"
        qt_sql "select dround(kdbl, 2) from ${it} order by kdbl, kint"
        qt_sql "select dsqrt(kdbl) from ${it} order by kdbl"
        qt_sql "select e() from ${it}"
        // result error
        // qt_sql "select elt(kint, kvchrs1) from ${it} order by kint, kvchrs1"
        // qt_sql "select elt(kint, kstr) from ${it} order by kint, kstr"
        qt_sql "select ends_with(kvchrs1, kvchrs1) from ${it} order by kvchrs1, kvchrs1"
        qt_sql "select ends_with(kstr, kstr) from ${it} order by kstr, kstr"
        // cannot find function
        // qt_sql "select es_query(kvchrs1, kvchrs1) from ${it} order by kvchrs1, kvchrs1"
        qt_sql "select exp(kdbl) from ${it} order by kdbl"
        qt_sql "select extract_url_parameter(kvchrs1, kvchrs1) from ${it} order by kvchrs1, kvchrs1"
        qt_sql "select field(ktint, 1, 2) from ${it} order by ktint"
        qt_sql "select field(ksint, 1, 2) from ${it} order by ksint"
        qt_sql "select field(kint, 1, 2) from ${it} order by kint"
        qt_sql "select field(kbint, 1, 2) from ${it} order by kbint"
        qt_sql "select field(klint, 1, 2) from ${it} order by klint"
        qt_sql "select field(kfloat, 1, 2) from ${it} order by kfloat"
        qt_sql "select field(kdbl, 1, 2) from ${it} order by kdbl"
        qt_sql "select field(kdcmls1, 1, 2) from ${it} order by kdcmls1"
        qt_sql "select field(kdtv2, 1, 2) from ${it} order by kdtv2"
        qt_sql "select field(kdtmv2s1, 1, 2) from ${it} order by kdtmv2s1"
        qt_sql "select field(kvchrs1, 1, 2) from ${it} order by kvchrs1"
        qt_sql "select field(kstr, 1, 2) from ${it} order by kstr"
        qt_sql "select find_in_set(kvchrs1, kvchrs1) from ${it} order by kvchrs1, kvchrs1"
        qt_sql "select find_in_set(kstr, kstr) from ${it} order by kstr, kstr"
        qt_sql "select floor(kdbl) from ${it} order by kdbl"
        qt_sql "select fmod(kfloat, kfloat) from ${it} order by kfloat, kfloat"
        qt_sql "select fmod(kdbl, kdbl) from ${it} order by kdbl, kdbl"
        qt_sql "select fpow(kdbl, kdbl) from ${it} order by kdbl, kdbl"
        sql "select from_base64(kvchrs1) from ${it} order by kvchrs1"
        sql "select from_base64(kstr) from ${it} order by kstr"
        qt_sql "select from_days(kint) from ${it} order by kint"
        qt_sql "select from_unixtime(kint) from ${it} order by kint"
        qt_sql "select from_unixtime(kint, 'varchar') from ${it} order by kint, kvchrs1"
        qt_sql "select from_unixtime(kint, 'string') from ${it} order by kint, kstr"
    }
}