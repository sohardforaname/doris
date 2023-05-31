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

suite('test_cast') {
    def date = "date '2020-01-01'"
    def datev2 = "datev2 '2020-01-01'"
    def datetime = "timestamp '2020-01-01 12:34:45'"
    test {
        sql "select cast(${date} as int), cast(${date} as bigint), cast(${date} as float), cast(${date} as double), cast(${date} as decimalv3(20, 4))"
        result([[20000101, 20000101, 20000101, 20000101, 20000101]])
    }
    test {
        sql "select cast(${datev2} as int), cast(${datev2} as bigint), cast(${datev2} as float), cast(${datev2} as double), cast(${datev2} as decimalv3(20, 4))"
        result([[]])
    }
    test {
        sql "select cast(${datetime} as int), cast(${datetime} as bigint), cast(${datetime} as float), cast(${datetime} as double), cast(${datetime} as decimalv3(20, 4))"
        result([[]])
    }
}