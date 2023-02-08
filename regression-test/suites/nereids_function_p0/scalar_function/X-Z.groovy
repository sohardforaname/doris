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

suite("nereids_scalar_fn_5") {
    sql "use regression_test_nereids_function_p0"
    sql "set enable_nereids_planner=true"
    sql "set enable_fallback_to_original_planner=false"

    def tableList = ["fn_test", "fn_test_not_nullable"]
    tableList.each {
        qt_sql "select year(kdtv2) from ${it} order by kdtv2"
        qt_sql "select year(kdtm) from ${it} order by kdtm"
        qt_sql "select year(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select year_ceil(kdtm) from ${it} order by kdtm"
        qt_sql "select year_ceil(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select year_ceil(kdtv2) from ${it} order by kdtv2"
        qt_sql "select year_ceil(kdtm, kdtm) from ${it} order by kdtm, kdtm"
        qt_sql "select year_ceil(kdtm, kint) from ${it} order by kdtm, kint"
        qt_sql "select year_ceil(kdtmv2s1, kdtmv2s1) from ${it} order by kdtmv2s1, kdtmv2s1"
        qt_sql "select year_ceil(kdtmv2s1, kint) from ${it} order by kdtmv2s1, kint"
        qt_sql "select year_ceil(kdtv2, kdtv2) from ${it} order by kdtv2, kdtv2"
        qt_sql "select year_ceil(kdtv2, kint) from ${it} order by kdtv2, kint"
        qt_sql "select year_ceil(kdtm, kint, kdtm) from ${it} order by kdtm, kint, kdtm"
        qt_sql "select year_ceil(kdtmv2s1, kint, kdtmv2s1) from ${it} order by kdtmv2s1, kint, kdtmv2s1"
        qt_sql "select year_ceil(kdtv2, kint, kdtv2) from ${it} order by kdtv2, kint, kdtv2"
        qt_sql "select year_floor(kdtm) from ${it} order by kdtm"
        qt_sql "select year_floor(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select year_floor(kdtv2) from ${it} order by kdtv2"
        qt_sql "select year_floor(kdtm, kdtm) from ${it} order by kdtm, kdtm"
        qt_sql "select year_floor(kdtm, kint) from ${it} order by kdtm, kint"
        qt_sql "select year_floor(kdtmv2s1, kdtmv2s1) from ${it} order by kdtmv2s1, kdtmv2s1"
        qt_sql "select year_floor(kdtmv2s1, kint) from ${it} order by kdtmv2s1, kint"
        qt_sql "select year_floor(kdtv2, kdtv2) from ${it} order by kdtv2, kdtv2"
        qt_sql "select year_floor(kdtv2, kint) from ${it} order by kdtv2, kint"
        qt_sql "select year_floor(kdtm, kint, kdtm) from ${it} order by kdtm, kint, kdtm"
        qt_sql "select year_floor(kdtmv2s1, kint, kdtmv2s1) from ${it} order by kdtmv2s1, kint, kdtmv2s1"
        qt_sql "select year_floor(kdtv2, kint, kdtv2) from ${it} order by kdtv2, kint, kdtv2"
        qt_sql "select yearweek(kdtm) from ${it} order by kdtm"
        qt_sql "select yearweek(kdtmv2s1) from ${it} order by kdtmv2s1"
        qt_sql "select yearweek(kdtv2) from ${it} order by kdtv2"
        qt_sql "select yearweek(kdtm, kint) from ${it} order by kdtm, kint"
        qt_sql "select yearweek(kdtmv2s1, kint) from ${it} order by kdtmv2s1, kint"
        qt_sql "select yearweek(kdtv2, kint) from ${it} order by kdtv2, kint"
        qt_sql "select years_add(kdtm, kint) from ${it} order by kdtm, kint"
        qt_sql "select years_add(kdtmv2s1, kint) from ${it} order by kdtmv2s1, kint"
        qt_sql "select years_add(kdt, kint) from ${it} order by kdt, kint"
        qt_sql "select years_add(kdtv2, kint) from ${it} order by kdtv2, kint"
        qt_sql "select years_diff(kdtm, kdtm) from ${it} order by kdtm, kdtm"
        qt_sql "select years_diff(kdtmv2s1, kdtmv2s1) from ${it} order by kdtmv2s1, kdtmv2s1"
        qt_sql "select years_diff(kdtv2, kdtmv2s1) from ${it} order by kdtv2, kdtmv2s1"
        qt_sql "select years_diff(kdtmv2s1, kdtv2) from ${it} order by kdtmv2s1, kdtv2"
        qt_sql "select years_diff(kdtv2, kdtv2) from ${it} order by kdtv2, kdtv2"
        qt_sql "select years_diff(kdtv2, kdtm) from ${it} order by kdtv2, kdtm"
        qt_sql "select years_diff(kdtm, kdtv2) from ${it} order by kdtm, kdtv2"
        qt_sql "select years_diff(kdtmv2s1, kdtm) from ${it} order by kdtmv2s1, kdtm"
        qt_sql "select years_diff(kdtm, kdtmv2s1) from ${it} order by kdtm, kdtmv2s1"
        qt_sql "select years_sub(kdtm, kint) from ${it} order by kdtm, kint"
        qt_sql "select years_sub(kdtmv2s1, kint) from ${it} order by kdtmv2s1, kint"
        qt_sql "select years_sub(kdt, kint) from ${it} order by kdt, kint"
        qt_sql "select years_sub(kdtv2, kint) from ${it} order by kdtv2, kint"
    }
}