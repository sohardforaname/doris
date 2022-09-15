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

package org.apache.doris.nereids.rules.rewrite.logical;

import org.apache.doris.nereids.analyzer.NereidsAnalyzer;
import org.apache.doris.nereids.rules.expression.rewrite.ExpressionRuleExecutor;
import org.apache.doris.nereids.trees.expressions.Cast;
import org.apache.doris.nereids.trees.expressions.EqualTo;
import org.apache.doris.nereids.trees.expressions.SlotReference;
import org.apache.doris.nereids.trees.expressions.literal.IntegerLiteral;
import org.apache.doris.nereids.trees.expressions.literal.StringLiteral;
import org.apache.doris.nereids.trees.expressions.literal.TinyIntLiteral;
import org.apache.doris.nereids.trees.plans.logical.LogicalPlan;
import org.apache.doris.nereids.types.BigIntType;
import org.apache.doris.nereids.types.VarcharType;
import org.apache.doris.utframe.TestWithFeService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EliminateCastRuleTest extends TestWithFeService {

    @Test
    public void testEliminateIntCast() {
        EqualTo expr = new EqualTo(new SlotReference("a", BigIntType.INSTANCE),
                new Cast(new TinyIntLiteral((byte) 2), BigIntType.INSTANCE));
        expr = (EqualTo) new ExpressionRuleExecutor(EliminateCastRule.INSTANCE).rewrite(expr);
        Assertions.assertFalse(expr.anyMatch(Cast.class::isInstance));
    }

    @Test
    public void testEliminateStringCast() {
        EqualTo expr = new EqualTo(new SlotReference("a", VarcharType.INSTANCE),
                new Cast(new StringLiteral("str"), VarcharType.INSTANCE));
        expr = (EqualTo) new ExpressionRuleExecutor(EliminateCastRule.INSTANCE).rewrite(expr);
        Assertions.assertFalse(expr.anyMatch(Cast.class::isInstance));
    }

    @Test
    public void testCannotEliminate() {
        EqualTo expr = new EqualTo(new SlotReference("a", VarcharType.INSTANCE),
                new Cast(new IntegerLiteral(2), BigIntType.INSTANCE));
        expr = (EqualTo) new ExpressionRuleExecutor(EliminateCastRule.INSTANCE).rewrite(expr);
        Assertions.assertTrue(expr.anyMatch(Cast.class::isInstance));
    }

    @Test
    public void testRewriteSQL() throws Exception {
        createDatabase("test");
        connectContext.setDatabase("default_cluster:test");

        createTables(
                "CREATE TABLE IF NOT EXISTS T1 (\n"
                        + "    id bigint,\n"
                        + "    score bigint\n"
                        + ")\n"
                        + "DUPLICATE KEY(id)\n"
                        + "DISTRIBUTED BY HASH(id) BUCKETS 1\n"
                        + "PROPERTIES (\n"
                        + "  \"replication_num\" = \"1\"\n"
                        + ")\n",
                "CREATE TABLE IF NOT EXISTS T2 (\n"
                        + "    id bigint,\n"
                        + "    score bigint\n"
                        + ")\n"
                        + "DUPLICATE KEY(id)\n"
                        + "DISTRIBUTED BY HASH(id) BUCKETS 1\n"
                        + "PROPERTIES (\n"
                        + "  \"replication_num\" = \"1\"\n"
                        + ")\n"
        );
        String sql = "select * from T1 join T2 on T1.id + 1 = T2.id where T2.score < 20";
        NereidsAnalyzer analyzer = new NereidsAnalyzer(createCascadesContext(sql));
        analyzer.analyze();
        LogicalPlan plan = ((LogicalPlan) analyzer.getCascadesContext().getMemo().copyOut());
        Assertions.assertFalse(plan.anyMatch(Cast.class::isInstance));
    }
}
