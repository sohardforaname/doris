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

suite("type_check") {
    sql 'drop table type_tb'

    sql '''
        create table type_tb (
            id int NOT NULL, 
            kjsonb jsonb,
            kdcml decimalv3(15, 2),
            karr array<int>,
            kmap map<string, string>,
            kstruct struct<a: int, b: int>,
            `date` bigint(20) NOT NULL
        )
        DUPLICATE KEY(id) 
        distributed by hash(id) buckets 2
        properties (
            "replication_num"="1"
        )
    '''

    sql 'set enable_nereids_planner=true'
    sql 'set enable_fallback_to_original_planner=false'
    sql 'set group_by_and_having_use_alias_first=false'

    sql 'insert into type_tb values(1, null, null, null, null, null, 20221111)'

    test {
        sql 'select id from type_tb'
        result([[1]])
    }

    // jsonb
    test {
        sql 'select kjsonb from type_tb'
        exception 'type unsupported for nereids planner'
    }

    test {
        sql 'select jsonb_parse(\'{"k1":"v31","k2":300}\')'
        exception 'type unsupported for nereids planner'
    }

    // array
    test {
        sql 'select karr from type_tb'
        exception 'type unsupported for nereids planner'
    }

    test {
        sql 'select array_range(10)'
        exception 'type unsupported for nereids planner'
    }

    // decimalv3
    test {
        sql 'select kdcml from type_tb'
        exception 'type unsupported for nereids planner'
    }

    test {
        sql 'select cast(0.3 as decimalv3(12, 2))'
        exception 'type unsupported for nereids planner'
    }

    // map
    test {
        sql 'select kmap from type_tb'
        exception 'Nereids do not support map type.'
    }

    // struct
    test {
        sql 'select kstruct from type_tb'
        exception 'Nereids do not support map type.'
    }

    //sv
    test {
        sql '''
            SELECT
            date_format(date, '%x%v') AS `date`,
            count(date) AS `diff_days`
            FROM type_tb
            GROUP BY date
            HAVING date = 20221111
            ORDER BY date;
        '''
        result([[202245, 1]])
    }

    sql 'set group_by_and_having_use_alias_first=true'

    test {
        sql '''
            SELECT
            date_format(date, '%x%v') AS `date`,
            count(date) AS `diff_days`
            FROM type_tb
            GROUP BY date
            HAVING date = 20221111
            ORDER BY date;
        '''
        exception 'group_by_and_having_use_alias=true is unsupported for Nereids'
    }
}