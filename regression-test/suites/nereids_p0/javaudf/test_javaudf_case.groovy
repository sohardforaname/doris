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

import org.codehaus.groovy.runtime.IOGroovyMethods

import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths

suite("nereids_test_javaudf_case") {
    sql 'set enable_nereids_planner=true'
    sql 'set enable_fallback_to_original_planner=false'

    def tableName = "test_javaudf_datecasetest"
    File path = new File("${context.file.parent}")
    def jarPath = "${context.file.parent}/jars/java-udf-case-jar-with-dependencies.jar"

    log.info("Jar path: ${jarPath}".toString())
    try {
        sql """ DROP TABLE IF EXISTS ${tableName} """
        sql """
        CREATE TABLE IF NOT EXISTS ${tableName} (
            `starttime` Date NOT NULL COMMENT "",
            `start`     int NOT NULL COMMENT "",
            `end`       int COMMENT ""
            )
            DISTRIBUTED BY HASH(starttime) PROPERTIES("replication_num" = "1");
        """
        
        
        sql """ INSERT INTO ${tableName} (`starttime`,`start`,`end`) VALUES
                ("2022-10-21",-3,0),
                ("2022-10-25",-7,-3),
                ("2022-10-26",-7,null)
            """
        qt_select_default """ SELECT * FROM ${tableName} t ORDER BY starttime; """

        File path1 = new File(jarPath)
        if (!path1.exists()) {
            throw new IllegalStateException("""${jarPath} doesn't exist! """)
        }

        sql """ CREATE FUNCTION java_udf_dateCase_test(date,int,int) RETURNS String PROPERTIES (
            "file"="file://${jarPath}",
            "symbol"="org.apache.doris.udf.DateCaseTest",
            "type"="JAVA_UDF"
        ); """

        qt_select """ SELECT java_udf_dateCase_test("2022-10-24",-7,0) as result; """
        qt_select """ SELECT java_udf_dateCase_test(null,-7,0) as result ; """
        qt_select """ SELECT starttime,java_udf_dateCase_test(starttime,start,end) as sum FROM ${tableName} order by starttime; """
        


    } finally {
        try_sql("DROP FUNCTION IF EXISTS java_udf_dateCase_test(date,int,int);")
        try_sql("DROP TABLE IF EXISTS ${tableName}")
    }
}
