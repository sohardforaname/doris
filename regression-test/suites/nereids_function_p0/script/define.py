#!/usr/bin/env python
# encoding: utf-8

# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
# This file is copied from
# https://github.com/apache/impala/blob/branch-2.9.0/common/function-registry/impala_functions.py
# and modified by Doris

const_sql = {
    'aes_decrypt_kvchrs1_kvchrs1_kvchrs1_kvchrs1': "select aes_decrypt(kvchrs1, kvchrs1, kvchrs1, 'AES_128_ECB') from ${t} order by kvchrs1, kvchrs1, kvchrs1",
    'aes_decrypt_kstr_kstr_kstr_kstr': "select aes_decrypt(kstr, kstr, kstr, 'AES_128_ECB') from ${t} order by kstr, kstr, kstr, kstr",
    'aes_encrypt_kvchrs1_kvchrs1_kvchrs1_kvchrs1': "select aes_encrypt(kvchrs1, kvchrs1, kvchrs1, 'AES_128_ECB') from ${t} order by kvchrs1, kvchrs1, kvchrs1",
    'aes_encrypt_kstr_kstr_kstr_kstr': "select aes_encrypt(kstr, kstr, kstr, 'AES_128_ECB') from ${t} order by kstr, kstr, kstr, kstr",
    'convert_to_kvchrs1_kvchrs1': "select convert_to(kvchrs1, 'gbk') from ${t} order by kvchrs1",
    'convert_tz_kdtm_kvchrs1_kvchrs1': "select convert_tz(kdtm, 'Asia/Shanghai', 'Europe/Sofia') from ${t} order by kdtm",
    'convert_tz_kdtmv2s1_kvchrs1_kvchrs1': "select convert_tz(kdtmv2s1, 'Asia/Shanghai', 'Europe/Sofia') from ${t} order by kdtmv2s1",
    'date_format_kdtm_kvchrs1': "select date_format(kdtm, '2006-01-02 12:00:00') from ${t} order by kdtm",
    'date_format_kdt_kvchrs1': "select date_format(kdt, '2006-01-02') from ${t} order by kdt",
    'date_format_kdtmv2s1_kvchrs1': "select date_format(kdtmv2s1, '2006-01-02 12:00:00') from ${t} order by kdtmv2s1",
    'date_format_kdtv2_kvchrs1': "select date_format(kdtv2, '2006-01-02') from ${t} order by kdtv2",
    'dround_kdbl_kint': "select dround(kdbl, 2) from ${t} order by kdbl",
    'field_ktint': "select field(ktint, 1, 2) from ${t} order by ktint",
    'field_ksint': "select field(ksint, 1, 2) from ${t} order by ksint",
    'field_kint': "select field(kint, 1, 2) from ${t} order by kint",
    'field_kbint': "select field(kbint, 1, 2) from ${t} order by kbint",
    'field_klint': "select field(klint, 1, 2) from ${t} order by klint",
    'field_kfloat': "select field(kfloat, 1, 2) from ${t} order by kfloat",
    'field_kdbl': "select field(kdbl, 1, 2) from ${t} order by kdbl",
    'field_kdcmls1': "select field(kdcmls1, 1, 2) from ${t} order by kdcmls1",
    'field_kdtv2': "select field(kdtv2, 1, 2) from ${t} order by kdtv2",
    'field_kdtmv2s1': "select field(kdtmv2s1, 1, 2) from ${t} order by kdtmv2s1",
    'field_kvchrs1': "select field(kvchrs1, 1, 2) from ${t} order by kvchrs1",
    'field_kstr': "select field(kstr, 1, 2) from ${t} order by kstr",
    'from_unixtime_kint_kvchrs1': "select from_unixtime(kint, 'varchar') from ${t} order by kint",
    'from_unixtime_kint_kstr': "select from_unixtime(kint, 'string') from ${t} order by kint",
    'mask_first_n_kstr_kint': "select mask_first_n('asd123', 54)",
    'round_kdbl_kint': "select round(kdbl, 2) from ${t} order by kdbl",
    'round_bankers_kdbl_kint': "select round_bankers(kdbl, 2) from ${t} order by kdbl",
    'sleep_kint': "select sleep(0.1) from ${t} order by kint",
    'sm4_decrypt_kvchrs1_kvchrs1_kvchrs1_kvchrs1': "select sm4_decrypt(kvchrs1, kvchrs1, kvchrs1, 'SM4_128_ECB') from ${t} order by kvchrs1, kvchrs1, kvchrs1",
    'sm4_decrypt_kstr_kstr_kstr_kstr': "select sm4_decrypt(kstr, kstr, kstr, 'SM4_128_ECB') from ${t} order by kstr, kstr, kstr",
    'sm4_encrypt_kvchrs1_kvchrs1_kvchrs1_kvchrs1': "select sm4_encrypt(kvchrs1, kvchrs1, kvchrs1, 'SM4_128_ECB') from ${t} order by kvchrs1, kvchrs1, kvchrs1",
    'sm4_encrypt_kstr_kstr_kstr_kstr': "select sm4_encrypt(kstr, kstr, kstr, 'SM4_128_ECB') from ${t} order by kstr, kstr, kstr",
    'space_kint': "select space(10) from ${t} order by kint",
    'split_part_kvchrs1_kvchrs1_kint': "select split_part(kvchrs1, ' ', 1) from ${t} order by kvchrs1",
    'split_part_kstr_kstr_kint': "select split_part(kstr, ' ', 1) from ${t} order by kstr",
    'substring_index_kvchrs1_kvchrs1_kint': "select substring_index(kvchrs1, ' ', 2) from ${t} order by kvchrs1",
    'substring_index_kstr_kstr_kint': "select substring_index(kstr, ' ', 2) from ${t} order by kstr",
    'truncate_kdbl_kint': "select truncate(kdbl, 2) from ${t} order by kdbl",
    'random': "select random() from ${t}",
    'random_kbint': "select random(1000) from ${t} order by kbint",
    'to_quantile_state_kvchrs1_kfloat': 'select to_quantile_state(kvchrs1, 2048) from ${t} order by kvchrs1'
}

not_check_result = {
    'aes_decrypt_kvchrs1_kvchrs1',
    'aes_decrypt_kstr_kstr',
    'aes_decrypt_kvchrs1_kvchrs1_kvchrs1',
    'aes_decrypt_kstr_kstr_kstr',
    'aes_decrypt_kvchrs1_kvchrs1_kvchrs1_kvchrs1',
    'aes_decrypt_kstr_kstr_kstr_kstr',
    'aes_encrypt_kvchrs1_kvchrs1',
    'aes_encrypt_kstr_kstr',
    'aes_encrypt_kvchrs1_kvchrs1_kvchrs1',
    'aes_encrypt_kstr_kstr_kstr',
    'aes_encrypt_kvchrs1_kvchrs1_kvchrs1_kvchrs1',
    'aes_encrypt_kstr_kstr_kstr_kstr',
    'connection_id',
    'current_user',
    'database',
    'from_base64_kvchrs1',
    'from_base64_kstr',
    'random',
    'random_kbint',
    'running_difference_ktint',
    'running_difference_ksint',
    'running_difference_kint',
    'running_difference_kbint',
    'running_difference_klint',
    'running_difference_kfloat',
    'running_difference_kdbl',
    'running_difference_kdcmls1',
    'running_difference_kdt',
    'running_difference_kdtv2',
    'running_difference_kdtm',
    'running_difference_kdtmv2s1',
    'sm4_decrypt_kvchrs1_kvchrs1',
    'sm4_decrypt_kstr_kstr',
    'sm4_decrypt_kvchrs1_kvchrs1_kvchrs1',
    'sm4_decrypt_kstr_kstr_kstr',
    'sm4_decrypt_kvchrs1_kvchrs1_kvchrs1_kvchrs1',
    'sm4_decrypt_kstr_kstr_kstr_kstr',
    'sm4_encrypt_kvchrs1_kvchrs1',
    'sm4_encrypt_kstr_kstr',
    'sm4_encrypt_kvchrs1_kvchrs1_kvchrs1',
    'sm4_encrypt_kstr_kstr_kstr',
    'sm4_encrypt_kvchrs1_kvchrs1_kvchrs1_kvchrs1',
    'sm4_encrypt_kstr_kstr_kstr_kstr',
    'space_kint',
    'user',
    'unix_timestamp'
}

denied_tag = {
    'esquery',
    'hll_cardinality',
    'json_object',
    'parse_url',
    'quantile_percent',
    'running_difference',
    'now',
    'second_ceil',
    'second_floor',
    'sub_bitmap',
    'to_quantile_state'
}

header = '''
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

'''
