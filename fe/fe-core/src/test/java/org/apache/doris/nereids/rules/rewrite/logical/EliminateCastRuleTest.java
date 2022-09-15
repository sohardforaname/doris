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

import org.apache.doris.nereids.rules.expression.rewrite.ExpressionRuleExecutor;
import org.apache.doris.nereids.trees.expressions.Cast;
import org.apache.doris.nereids.trees.expressions.EqualTo;
import org.apache.doris.nereids.trees.expressions.SlotReference;
import org.apache.doris.nereids.trees.expressions.literal.IntegerLiteral;
import org.apache.doris.nereids.trees.expressions.literal.StringLiteral;
import org.apache.doris.nereids.trees.expressions.literal.TinyIntLiteral;
import org.apache.doris.nereids.types.BigIntType;
import org.apache.doris.nereids.types.VarcharType;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EliminateCastRuleTest {

    @Test
    public void testEliminateIntCast() {
        EqualTo expr = new EqualTo(new SlotReference("a", BigIntType.INSTANCE), new TinyIntLiteral((byte) 2));
        expr = (EqualTo) new ExpressionRuleExecutor(EliminateCastRule.INSTANCE).rewrite(expr);
        Assertions.assertFalse(expr.anyMatch(Cast.class::isInstance));
    }

    @Test
    public void testEliminateStringCast() {
        EqualTo expr = new EqualTo(new SlotReference("a", VarcharType.INSTANCE), new StringLiteral("str"));
        expr = (EqualTo) new ExpressionRuleExecutor(EliminateCastRule.INSTANCE).rewrite(expr);
        Assertions.assertFalse(expr.anyMatch(Cast.class::isInstance));
    }

    @Test
    public void testCannotEliminate() {
        EqualTo expr = new EqualTo(new SlotReference("a", VarcharType.INSTANCE), new IntegerLiteral(2));
        expr = (EqualTo) new ExpressionRuleExecutor(EliminateCastRule.INSTANCE).rewrite(expr);
        Assertions.assertTrue(expr.anyMatch(Cast.class::isInstance));
    }
}
