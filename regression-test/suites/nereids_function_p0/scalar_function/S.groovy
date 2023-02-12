suite("nereids_scalar_fn_S") {
	sql 'use regression_test_nereids_function_p0'
	sql 'set enable_nereids_planner=false'
	sql 'set enable_fallback_to_original_planner=false'
	qt_sql_second_DateTime "select second(kdtm) from fn_test order by kdtm"
	qt_sql_second_DateTime "select second(kdtm) from fn_test_not_nullable order by kdtm"
	qt_sql_second_DateTimeV2 "select second(kdtmv2s1) from fn_test order by kdtmv2s1"
	qt_sql_second_DateTimeV2 "select second(kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1"
	qt_sql_second_DateV2 "select second(kdtv2) from fn_test order by kdtv2"
	qt_sql_second_DateV2 "select second(kdtv2) from fn_test_not_nullable order by kdtv2"
	qt_sql_seconds_add_DateTime_Integer "select seconds_add(kdtm, kint) from fn_test order by kdtm, kint"
	qt_sql_seconds_add_DateTime_Integer "select seconds_add(kdtm, kint) from fn_test_not_nullable order by kdtm, kint"
	qt_sql_seconds_add_DateTimeV2_Integer "select seconds_add(kdtmv2s1, kint) from fn_test order by kdtmv2s1, kint"
	qt_sql_seconds_add_DateTimeV2_Integer "select seconds_add(kdtmv2s1, kint) from fn_test_not_nullable order by kdtmv2s1, kint"
	qt_sql_seconds_add_Date_Integer "select seconds_add(kdt, kint) from fn_test order by kdt, kint"
	qt_sql_seconds_add_Date_Integer "select seconds_add(kdt, kint) from fn_test_not_nullable order by kdt, kint"
	qt_sql_seconds_add_DateV2_Integer "select seconds_add(kdtv2, kint) from fn_test order by kdtv2, kint"
	qt_sql_seconds_add_DateV2_Integer "select seconds_add(kdtv2, kint) from fn_test_not_nullable order by kdtv2, kint"
	qt_sql_seconds_diff_DateTime_DateTime "select seconds_diff(kdtm, kdtm) from fn_test order by kdtm, kdtm"
	qt_sql_seconds_diff_DateTime_DateTime "select seconds_diff(kdtm, kdtm) from fn_test_not_nullable order by kdtm, kdtm"
	qt_sql_seconds_diff_DateTimeV2_DateTimeV2 "select seconds_diff(kdtmv2s1, kdtmv2s1) from fn_test order by kdtmv2s1, kdtmv2s1"
	qt_sql_seconds_diff_DateTimeV2_DateTimeV2 "select seconds_diff(kdtmv2s1, kdtmv2s1) from fn_test_not_nullable order by kdtmv2s1, kdtmv2s1"
	qt_sql_seconds_diff_DateV2_DateTimeV2 "select seconds_diff(kdtv2, kdtmv2s1) from fn_test order by kdtv2, kdtmv2s1"
	qt_sql_seconds_diff_DateV2_DateTimeV2 "select seconds_diff(kdtv2, kdtmv2s1) from fn_test_not_nullable order by kdtv2, kdtmv2s1"
	qt_sql_seconds_diff_DateTimeV2_DateV2 "select seconds_diff(kdtmv2s1, kdtv2) from fn_test order by kdtmv2s1, kdtv2"
	qt_sql_seconds_diff_DateTimeV2_DateV2 "select seconds_diff(kdtmv2s1, kdtv2) from fn_test_not_nullable order by kdtmv2s1, kdtv2"
	qt_sql_seconds_diff_DateV2_DateV2 "select seconds_diff(kdtv2, kdtv2) from fn_test order by kdtv2, kdtv2"
	qt_sql_seconds_diff_DateV2_DateV2 "select seconds_diff(kdtv2, kdtv2) from fn_test_not_nullable order by kdtv2, kdtv2"
	qt_sql_seconds_diff_DateV2_DateTime "select seconds_diff(kdtv2, kdtm) from fn_test order by kdtv2, kdtm"
	qt_sql_seconds_diff_DateV2_DateTime "select seconds_diff(kdtv2, kdtm) from fn_test_not_nullable order by kdtv2, kdtm"
	qt_sql_seconds_diff_DateTime_DateV2 "select seconds_diff(kdtm, kdtv2) from fn_test order by kdtm, kdtv2"
	qt_sql_seconds_diff_DateTime_DateV2 "select seconds_diff(kdtm, kdtv2) from fn_test_not_nullable order by kdtm, kdtv2"
	qt_sql_seconds_diff_DateTimeV2_DateTime "select seconds_diff(kdtmv2s1, kdtm) from fn_test order by kdtmv2s1, kdtm"
	qt_sql_seconds_diff_DateTimeV2_DateTime "select seconds_diff(kdtmv2s1, kdtm) from fn_test_not_nullable order by kdtmv2s1, kdtm"
	qt_sql_seconds_diff_DateTime_DateTimeV2 "select seconds_diff(kdtm, kdtmv2s1) from fn_test order by kdtm, kdtmv2s1"
	qt_sql_seconds_diff_DateTime_DateTimeV2 "select seconds_diff(kdtm, kdtmv2s1) from fn_test_not_nullable order by kdtm, kdtmv2s1"
	qt_sql_sign_Double "select sign(kdbl) from fn_test order by kdbl"
	qt_sql_sign_Double "select sign(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_sin_Double "select sin(kdbl) from fn_test order by kdbl"
	qt_sql_sin_Double "select sin(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_sleep_Integer "select sleep(0.1) from fn_test order by kint"
	qt_sql_sleep_Integer "select sleep(0.1) from fn_test_not_nullable order by kint"
	qt_sql_sm3_Varchar "select sm3(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_sm3_Varchar "select sm3(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_sm3_String "select sm3(kstr) from fn_test order by kstr"
	qt_sql_sm3_String "select sm3(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_sm3sum_Varchar "select sm3sum(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_sm3sum_Varchar "select sm3sum(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_sm3sum_String "select sm3sum(kstr) from fn_test order by kstr"
	qt_sql_sm3sum_String "select sm3sum(kstr) from fn_test_not_nullable order by kstr"
	sql "select sm4_decrypt(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
	sql "select sm4_decrypt(kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1"
	sql "select sm4_decrypt(kstr, kstr) from fn_test order by kstr, kstr"
	sql "select sm4_decrypt(kstr, kstr) from fn_test_not_nullable order by kstr, kstr"
	sql "select sm4_decrypt(kvchrs1, kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1, kvchrs1"
	sql "select sm4_decrypt(kvchrs1, kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1, kvchrs1"
	sql "select sm4_decrypt(kstr, kstr, kstr) from fn_test order by kstr, kstr, kstr"
	sql "select sm4_decrypt(kstr, kstr, kstr) from fn_test_not_nullable order by kstr, kstr, kstr"
	sql "select sm4_decrypt(kvchrs1, kvchrs1, kvchrs1, 'SM4_128_ECB') from fn_test order by kvchrs1, kvchrs1, kvchrs1"
	sql "select sm4_decrypt(kvchrs1, kvchrs1, kvchrs1, 'SM4_128_ECB') from fn_test_not_nullable order by kvchrs1, kvchrs1, kvchrs1"
	sql "select sm4_decrypt(kstr, kstr, kstr, 'SM4_128_ECB') from fn_test order by kstr, kstr, kstr"
	sql "select sm4_decrypt(kstr, kstr, kstr, 'SM4_128_ECB') from fn_test_not_nullable order by kstr, kstr, kstr"
	sql "select sm4_encrypt(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
	sql "select sm4_encrypt(kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1"
	sql "select sm4_encrypt(kstr, kstr) from fn_test order by kstr, kstr"
	sql "select sm4_encrypt(kstr, kstr) from fn_test_not_nullable order by kstr, kstr"
	sql "select sm4_encrypt(kvchrs1, kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1, kvchrs1"
	sql "select sm4_encrypt(kvchrs1, kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1, kvchrs1"
	sql "select sm4_encrypt(kstr, kstr, kstr) from fn_test order by kstr, kstr, kstr"
	sql "select sm4_encrypt(kstr, kstr, kstr) from fn_test_not_nullable order by kstr, kstr, kstr"
	sql "select sm4_encrypt(kvchrs1, kvchrs1, kvchrs1, 'SM4_128_ECB') from fn_test order by kvchrs1, kvchrs1, kvchrs1"
	sql "select sm4_encrypt(kvchrs1, kvchrs1, kvchrs1, 'SM4_128_ECB') from fn_test_not_nullable order by kvchrs1, kvchrs1, kvchrs1"
	sql "select sm4_encrypt(kstr, kstr, kstr, 'SM4_128_ECB') from fn_test order by kstr, kstr, kstr"
	sql "select sm4_encrypt(kstr, kstr, kstr, 'SM4_128_ECB') from fn_test_not_nullable order by kstr, kstr, kstr"
	sql "select space(10) from fn_test order by kint"
	sql "select space(10) from fn_test_not_nullable order by kint"
	qt_sql_split_part_Varchar_Varchar_Integer "select split_part(kvchrs1, ' ', 1) from fn_test order by kvchrs1"
	qt_sql_split_part_Varchar_Varchar_Integer "select split_part(kvchrs1, ' ', 1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_split_part_String_String_Integer "select split_part(kstr, ' ', 1) from fn_test order by kstr"
	qt_sql_split_part_String_String_Integer "select split_part(kstr, ' ', 1) from fn_test_not_nullable order by kstr"
	qt_sql_sqrt_Double "select sqrt(kdbl) from fn_test order by kdbl"
	qt_sql_sqrt_Double "select sqrt(kdbl) from fn_test_not_nullable order by kdbl"
	qt_sql_st_astext_Varchar "select st_astext(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_astext_Varchar "select st_astext(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_astext_String "select st_astext(kstr) from fn_test order by kstr"
	qt_sql_st_astext_String "select st_astext(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_aswkt_Varchar "select st_aswkt(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_aswkt_Varchar "select st_aswkt(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_aswkt_String "select st_aswkt(kstr) from fn_test order by kstr"
	qt_sql_st_aswkt_String "select st_aswkt(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_circle_Double_Double_Double "select st_circle(kdbl, kdbl, kdbl) from fn_test order by kdbl, kdbl, kdbl"
	qt_sql_st_circle_Double_Double_Double "select st_circle(kdbl, kdbl, kdbl) from fn_test_not_nullable order by kdbl, kdbl, kdbl"
	qt_sql_st_contains_Varchar_Varchar "select st_contains(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
	qt_sql_st_contains_Varchar_Varchar "select st_contains(kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1"
	qt_sql_st_distance_sphere_Double_Double_Double_Double "select st_distance_sphere(kdbl, kdbl, kdbl, kdbl) from fn_test order by kdbl, kdbl, kdbl, kdbl"
	qt_sql_st_distance_sphere_Double_Double_Double_Double "select st_distance_sphere(kdbl, kdbl, kdbl, kdbl) from fn_test_not_nullable order by kdbl, kdbl, kdbl, kdbl"
	qt_sql_st_geometryfromtext_Varchar "select st_geometryfromtext(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_geometryfromtext_Varchar "select st_geometryfromtext(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_geometryfromtext_String "select st_geometryfromtext(kstr) from fn_test order by kstr"
	qt_sql_st_geometryfromtext_String "select st_geometryfromtext(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_geomfromtext_Varchar "select st_geomfromtext(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_geomfromtext_Varchar "select st_geomfromtext(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_geomfromtext_String "select st_geomfromtext(kstr) from fn_test order by kstr"
	qt_sql_st_geomfromtext_String "select st_geomfromtext(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_linefromtext_Varchar "select st_linefromtext(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_linefromtext_Varchar "select st_linefromtext(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_linefromtext_String "select st_linefromtext(kstr) from fn_test order by kstr"
	qt_sql_st_linefromtext_String "select st_linefromtext(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_linestringfromtext_Varchar "select st_linestringfromtext(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_linestringfromtext_Varchar "select st_linestringfromtext(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_linestringfromtext_String "select st_linestringfromtext(kstr) from fn_test order by kstr"
	qt_sql_st_linestringfromtext_String "select st_linestringfromtext(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_point_Double_Double "select st_point(kdbl, kdbl) from fn_test order by kdbl, kdbl"
	qt_sql_st_point_Double_Double "select st_point(kdbl, kdbl) from fn_test_not_nullable order by kdbl, kdbl"
	qt_sql_st_polyfromtext_Varchar "select st_polyfromtext(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_polyfromtext_Varchar "select st_polyfromtext(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_polyfromtext_String "select st_polyfromtext(kstr) from fn_test order by kstr"
	qt_sql_st_polyfromtext_String "select st_polyfromtext(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_polygon_Varchar "select st_polygon(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_polygon_Varchar "select st_polygon(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_polygon_String "select st_polygon(kstr) from fn_test order by kstr"
	qt_sql_st_polygon_String "select st_polygon(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_polygonfromtext_Varchar "select st_polygonfromtext(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_polygonfromtext_Varchar "select st_polygonfromtext(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_polygonfromtext_String "select st_polygonfromtext(kstr) from fn_test order by kstr"
	qt_sql_st_polygonfromtext_String "select st_polygonfromtext(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_x_Varchar "select st_x(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_x_Varchar "select st_x(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_x_String "select st_x(kstr) from fn_test order by kstr"
	qt_sql_st_x_String "select st_x(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_st_y_Varchar "select st_y(kvchrs1) from fn_test order by kvchrs1"
	qt_sql_st_y_Varchar "select st_y(kvchrs1) from fn_test_not_nullable order by kvchrs1"
	qt_sql_st_y_String "select st_y(kstr) from fn_test order by kstr"
	qt_sql_st_y_String "select st_y(kstr) from fn_test_not_nullable order by kstr"
	qt_sql_starts_with_Varchar_Varchar "select starts_with(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
	qt_sql_starts_with_Varchar_Varchar "select starts_with(kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1"
	qt_sql_starts_with_String_String "select starts_with(kstr, kstr) from fn_test order by kstr, kstr"
	qt_sql_starts_with_String_String "select starts_with(kstr, kstr) from fn_test_not_nullable order by kstr, kstr"
	qt_sql_str_to_date_Varchar_Varchar "select str_to_date(kvchrs1, kvchrs1) from fn_test order by kvchrs1, kvchrs1"
	qt_sql_str_to_date_Varchar_Varchar "select str_to_date(kvchrs1, kvchrs1) from fn_test_not_nullable order by kvchrs1, kvchrs1"
	qt_sql_str_to_date_String_String "select str_to_date(kstr, kstr) from fn_test order by kstr, kstr"
	qt_sql_str_to_date_String_String "select str_to_date(kstr, kstr) from fn_test_not_nullable order by kstr, kstr"
	qt_sql_strleft_Varchar_Integer "select strleft(kvchrs1, kint) from fn_test order by kvchrs1, kint"
	qt_sql_strleft_Varchar_Integer "select strleft(kvchrs1, kint) from fn_test_not_nullable order by kvchrs1, kint"
	qt_sql_strleft_String_Integer "select strleft(kstr, kint) from fn_test order by kstr, kint"
	qt_sql_strleft_String_Integer "select strleft(kstr, kint) from fn_test_not_nullable order by kstr, kint"
	qt_sql_strright_Varchar_Integer "select strright(kvchrs1, kint) from fn_test order by kvchrs1, kint"
	qt_sql_strright_Varchar_Integer "select strright(kvchrs1, kint) from fn_test_not_nullable order by kvchrs1, kint"
	qt_sql_strright_String_Integer "select strright(kstr, kint) from fn_test order by kstr, kint"
	qt_sql_strright_String_Integer "select strright(kstr, kint) from fn_test_not_nullable order by kstr, kint"
	qt_sql_sub_replace_Varchar_Varchar_Integer "select sub_replace(kvchrs1, kvchrs1, kint) from fn_test order by kvchrs1, kvchrs1, kint"
	qt_sql_sub_replace_Varchar_Varchar_Integer "select sub_replace(kvchrs1, kvchrs1, kint) from fn_test_not_nullable order by kvchrs1, kvchrs1, kint"
	qt_sql_sub_replace_String_String_Integer "select sub_replace(kstr, kstr, kint) from fn_test order by kstr, kstr, kint"
	qt_sql_sub_replace_String_String_Integer "select sub_replace(kstr, kstr, kint) from fn_test_not_nullable order by kstr, kstr, kint"
	qt_sql_sub_replace_Varchar_Varchar_Integer_Integer "select sub_replace(kvchrs1, kvchrs1, kint, kint) from fn_test order by kvchrs1, kvchrs1, kint, kint"
	qt_sql_sub_replace_Varchar_Varchar_Integer_Integer "select sub_replace(kvchrs1, kvchrs1, kint, kint) from fn_test_not_nullable order by kvchrs1, kvchrs1, kint, kint"
	qt_sql_sub_replace_String_String_Integer_Integer "select sub_replace(kstr, kstr, kint, kint) from fn_test order by kstr, kstr, kint, kint"
	qt_sql_sub_replace_String_String_Integer_Integer "select sub_replace(kstr, kstr, kint, kint) from fn_test_not_nullable order by kstr, kstr, kint, kint"
	qt_sql_substring_Varchar_Integer "select substring(kvchrs1, kint) from fn_test order by kvchrs1, kint"
	qt_sql_substring_Varchar_Integer "select substring(kvchrs1, kint) from fn_test_not_nullable order by kvchrs1, kint"
	qt_sql_substring_String_Integer "select substring(kstr, kint) from fn_test order by kstr, kint"
	qt_sql_substring_String_Integer "select substring(kstr, kint) from fn_test_not_nullable order by kstr, kint"
	qt_sql_substring_Varchar_Integer_Integer "select substring(kvchrs1, kint, kint) from fn_test order by kvchrs1, kint, kint"
	qt_sql_substring_Varchar_Integer_Integer "select substring(kvchrs1, kint, kint) from fn_test_not_nullable order by kvchrs1, kint, kint"
	qt_sql_substring_String_Integer_Integer "select substring(kstr, kint, kint) from fn_test order by kstr, kint, kint"
	qt_sql_substring_String_Integer_Integer "select substring(kstr, kint, kint) from fn_test_not_nullable order by kstr, kint, kint"
	qt_sql_substring_index_Varchar_Varchar_Integer "select substring_index(kvchrs1, ' ', 2) from fn_test order by kvchrs1"
	qt_sql_substring_index_Varchar_Varchar_Integer "select substring_index(kvchrs1, ' ', 2) from fn_test_not_nullable order by kvchrs1"
	qt_sql_substring_index_String_String_Integer "select substring_index(kstr, ' ', 2) from fn_test order by kstr"
	qt_sql_substring_index_String_String_Integer "select substring_index(kstr, ' ', 2) from fn_test_not_nullable order by kstr"
}