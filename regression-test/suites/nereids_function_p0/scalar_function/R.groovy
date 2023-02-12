suite("nereids_scalar_fn_R") {
	sql 'use regression_test_nereids_function_p0'
	sql 'set enable_nereids_planner=true'
	sql 'set enable_fallback_to_original_planner=false'
	qt_sql_radians_Double "select radians(kdbl) from fn_test order by kdbl"
	qt_sql_radians_Double "select radians(kdbl) from fn_test_not_nullable order by kdbl"
	sql "select random() from fn_test"
	sql "select random() from fn_test_not_nullable"
	sql "select random(1000) from fn_test order by kbint"
	sql "select random(1000) from fn_test_not_nullable order by kbint"
	qt_sql_regexp_extract_Varchar_Varchar_BigInt "select regexp_extract(kvchrs1, kvchrs1, kbint) from fn_test order by kvchrs1, kvchrs1, kbint"
	qt_sql_regexp_extract_Varchar_Varchar_BigInt "select regexp_extract(kvchrs1, kvchrs1, kbint) from fn_test_not_nullable order by kvchrs1, kvchrs1, kbint"
	qt_sql_regexp_extract_String_String_BigInt "select regexp_extract(kstr, kstr, kbint) from fn_test order by kstr, kstr, kbint"
	qt_sql_regexp_extract_String_String_BigInt "select regexp_extract(kstr, kstr, kbint) from fn_test_not_nullable order by kstr, kstr, kbint"
	qt_sql_regexp_extract_all_Varchar_Varchar "select regexp_extract_all(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
	qt_sql_regexp_extract_all_Varchar_Varchar "select regexp_extract_all(kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1"
	qt_sql_regexp_extract_all_String_String "select regexp_extract_all(kstr, kstr) from fn_test order by kstr, kstr"
	qt_sql_regexp_extract_all_String_String "select regexp_extract_all(kstr, kstr) from fn_test_not_nullable order by kstr, kstr"
	qt_sql_regexp_replace_Varchar_Varchar_Varchar "select regexp_replace(kvchrs1, kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1, kvchrs1"
	qt_sql_regexp_replace_Varchar_Varchar_Varchar "select regexp_replace(kvchrs1, kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1, kvchrs1"
	qt_sql_regexp_replace_String_String_String "select regexp_replace(kstr, kstr, kstr) from fn_test order by kstr, kstr, kstr"
	qt_sql_regexp_replace_String_String_String "select regexp_replace(kstr, kstr, kstr) from fn_test_not_nullable order by kstr, kstr, kstr"
	qt_sql_regexp_replace_one_Varchar_Varchar_Varchar "select regexp_replace_one(kvchrs1, kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1, kvchrs1"
	qt_sql_regexp_replace_one_Varchar_Varchar_Varchar "select regexp_replace_one(kvchrs1, kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1, kvchrs1"
	qt_sql_regexp_replace_one_String_String_String "select regexp_replace_one(kstr, kstr, kstr) from fn_test order by kstr, kstr, kstr"
	qt_sql_regexp_replace_one_String_String_String "select regexp_replace_one(kstr, kstr, kstr) from fn_test_not_nullable order by kstr, kstr, kstr"
	qt_sql_repeat_Varchar_Integer "select repeat(kvchrs1, kint) from fn_test order by kvchrs1, kint"
	qt_sql_repeat_Varchar_Integer "select repeat(kvchrs1, kint) from fn_test_not_nullable order by kvchrs1, kint"
	qt_sql_repeat_String_Integer "select repeat(kstr, kint) from fn_test order by kstr, kint"
	qt_sql_repeat_String_Integer "select repeat(kstr, kint) from fn_test_not_nullable order by kstr, kint"
	qt_sql_replace_Varchar_Varchar_Varchar "select replace(kvchrs1, kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1, kvchrs1"
	qt_sql_replace_Varchar_Varchar_Varchar "select replace(kvchrs1, kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1, kvchrs1"
	qt_sql_replace_String_String_String "select replace(kstr, kstr, kstr) from fn_test order by kstr, kstr, kstr"
	qt_sql_replace_String_String_String "select replace(kstr, kstr, kstr) from fn_test_not_nullable order by kstr, kstr, kstr"
	qt_sql_right_Varchar_Integer "select right(kvchrs1, kint) from fn_test order by kvchrs1, kint"
	qt_sql_right_Varchar_Integer "select right(kvchrs1, kint) from fn_test_not_nullable order by kvchrs1, kint"
	qt_sql_right_String_Integer "select right(kstr, kint) from fn_test order by kstr, kint"
	qt_sql_right_String_Integer "select right(kstr, kint) from fn_test_not_nullable order by kstr, kint"
	qt_sql_round_Double "select round(kdbl) from fn_test order by kdbl"
	qt_sql_round_Double "select round(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_round_Double_Integer "select round(kdbl, 2) from fn_test order by kdbl"
	qt_sql_round_Double_Integer "select round(kdbl, 2) from fn_test_not_nullable order by kdbl"
	qt_sql_round_bankers_Double "select round_bankers(kdbl) from fn_test order by kdbl"
	qt_sql_round_bankers_Double "select round_bankers(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_round_bankers_Double_Integer "select round_bankers(kdbl, 2) from fn_test order by kdbl"
	qt_sql_round_bankers_Double_Integer "select round_bankers(kdbl, 2) from fn_test_not_nullable order by kdbl"
	qt_sql_rpad_Varchar_Integer_Varchar "select rpad(kvchrs1, kint, kvchrs1) from fn_test order by kvchrs1, kint, kvchrs1"
	qt_sql_rpad_Varchar_Integer_Varchar "select rpad(kvchrs1, kint, kvchrs1) from fn_test_not_nullable order by kvchrs1, kint, kvchrs1"
	qt_sql_rpad_String_Integer_String "select rpad(kstr, kint, kstr) from fn_test order by kstr, kint, kstr"
	qt_sql_rpad_String_Integer_String "select rpad(kstr, kint, kstr) from fn_test_not_nullable order by kstr, kint, kstr"
	qt_sql_rtrim_Varchar "select rtrim(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_rtrim_Varchar "select rtrim(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_rtrim_String "select rtrim(kstr) from fn_test order by kstr"
	qt_sql_rtrim_String "select rtrim(kstr) from fn_test_not_nullable order by kstr"
}