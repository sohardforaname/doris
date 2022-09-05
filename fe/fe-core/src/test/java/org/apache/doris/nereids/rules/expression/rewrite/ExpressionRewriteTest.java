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

package org.apache.doris.nereids.rules.expression.rewrite;

import org.apache.doris.nereids.parser.NereidsParser;
import org.apache.doris.nereids.rules.expression.rewrite.rules.BetweenToCompoundRule;
import org.apache.doris.nereids.rules.expression.rewrite.rules.DistinctPredicatesRule;
import org.apache.doris.nereids.rules.expression.rewrite.rules.ExtractCommonFactorRule;
import org.apache.doris.nereids.rules.expression.rewrite.rules.InPredicateToEqualToRule;
import org.apache.doris.nereids.rules.expression.rewrite.rules.NormalizeBinaryPredicatesRule;
import org.apache.doris.nereids.rules.expression.rewrite.rules.SimplifyCastRule;
import org.apache.doris.nereids.rules.expression.rewrite.rules.SimplifyNotExprRule;
import org.apache.doris.nereids.trees.expressions.Expression;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * all expr rewrite rule test case.
 */
public class ExpressionRewriteTest {
    private static final NereidsParser PARSER = new NereidsParser();
    private ExpressionRuleExecutor executor;

    @Test
    public void testNotRewrite() {
        executor = new ExpressionRuleExecutor(SimplifyNotExprRule.INSTANCE);

        assertRewrite("not x", "not x");
        assertRewrite("not not x", "x");
        assertRewrite("not not not x", "not x");
        assertRewrite("not not not not x", "x");
        assertRewrite("not (x > y)", "x <= y");
        assertRewrite("not (x < y)", "x >= y");
        assertRewrite("not (x >= y)", "x < y");
        assertRewrite("not (x <= y)", "x > y");
        assertRewrite("not (x = y)", "not (x = y)");
        assertRewrite("not not (x > y)", "x > y");
        assertRewrite("not not not (x > y)", "x <= y");
        assertRewrite("not not not (x > (not not y))", "x <= y");
        assertRewrite("not (x > (not not y))", "x <= y");

        assertRewrite("not (a and b)", "(not a) or (not b)");
        assertRewrite("not (a or b)", "(not a) and (not b)");

        assertRewrite("not (a and b and (c or d))", "(not a) or (not b) or ((not c) and (not d))");

    }

    @Test
    public void testNormalizeExpressionRewrite() {
        executor = new ExpressionRuleExecutor(NormalizeBinaryPredicatesRule.INSTANCE);

        assertRewrite("1 = 1", "1 = 1");
        assertRewrite("2 > x", "x < 2");
        assertRewrite("y > x", "y > x");
        assertRewrite("1 + 2 > x", "x < 1 + 2");
        assertRewrite("1 + 2 > x + 1", "x + 1 < 1 + 2");
        assertRewrite("y + 2 > x + 1", "y + 2 > x + 1");
    }

    @Test
    public void testDistinctPredicatesRewrite() {
        executor = new ExpressionRuleExecutor(DistinctPredicatesRule.INSTANCE);

        assertRewrite("a = 1", "a = 1");
        assertRewrite("a = 1 and a = 1", "a = 1");
        assertRewrite("a = 1 and b > 2 and a = 1", "a = 1 and b > 2");
        assertRewrite("a = 1 and a = 1 and b > 2 and a = 1 and a = 1", "a = 1 and b > 2");
        assertRewrite("a = 1 or a = 1", "a = 1");
        assertRewrite("a = 1 or a = 1 or b >= 1", "a = 1 or b >= 1");
    }


    @Test
    public void testExtractCommonFactorRewrite() {
        executor = new ExpressionRuleExecutor(ExtractCommonFactorRule.INSTANCE);

        assertRewrite("a", "a");

        assertRewrite("a = 1", "a = 1");
        assertRewrite("a and b", "a and b");
        assertRewrite("a = 1 and b > 2", "a = 1 and b > 2");


        assertRewrite("(a and b) or (c and d)", "(a and b) or (c and d)");
        assertRewrite("(a and b) and (c and d)", "((a and b) and c) and d");

        assertRewrite("(a or b) and (a or c)", "a or (b and c)");
        assertRewrite("(a and b) or (a and c)", "a and (b or c)");


        assertRewrite("(a or b) and (a or c) and (a or d)", "a or (b and c and d)");
        assertRewrite("(a and b) or (a and c) or (a and d)", "a and (b or c or d)");
        assertRewrite("(a and b) or (a or c) or (a and d)", "((((a and b) or a) or c) or (a and d))");
        assertRewrite("(a and b) or (a and c) or (a or d)", "(((a and b) or (a and c) or a) or d))");
        assertRewrite("(a or b) or (a and c) or (a and d)", "(a or b) or (a and c) or (a and d)");
        assertRewrite("(a or b) or (a and c) or (a or d)", "(((a or b) or (a and c)) or d)");
        assertRewrite("(a or b) or (a or c) or (a and d)", "((a or b) or c) or (a and d)");
        assertRewrite("(a or b) or (a or c) or (a or d)", "(((a or b) or c) or d)");

        assertRewrite("(a and b) or (d and c) or (d and e)", "(a and b) or (d and c) or (d and e)");
        assertRewrite("(a or b) and (d or c) and (d or e)", "(a or b) and (d or c) and (d or e)");

        assertRewrite("(a and b) or ((d and c) and (d and e))", "(a and b) or (d and c and e)");
        assertRewrite("(a or b) and ((d or c) or (d or e))", "(a or b) and (d or c or e)");

        assertRewrite("(a and b) or (a and b and c)",  "a and b");
        assertRewrite("(a or b) and (a or b or c)",  "a or b");

        assertRewrite("a and true",  "a");
        assertRewrite("a or false",  "a");

        assertRewrite("a and false",  "false");
        assertRewrite("a or true",  "true");

        assertRewrite("a or false or false or false",  "a");
        assertRewrite("a and true and true and true",  "a");

        assertRewrite("(a and b) or a ", "a");
        assertRewrite("(a or b) and a ", "a");

        assertRewrite("(a and b) or (a and true)", "a");
        assertRewrite("(a or b) and (a and true)", "a");

        assertRewrite("(a or b) and (a or true)", "a or b");

    }

    @Test
    public void testBetweenToCompoundRule() {
        executor = new ExpressionRuleExecutor(ImmutableList.of(BetweenToCompoundRule.INSTANCE, SimplifyNotExprRule.INSTANCE));

        assertRewrite("a between c and d", "(a >= c) and (a <= d)");
        assertRewrite("a not between c and d)", "(a < c) or (a > d)");

    }

    @Test
    public void testInPredicateToEqualToRule() {
        executor = new ExpressionRuleExecutor(ImmutableList.of(InPredicateToEqualToRule.INSTANCE));

        assertRewrite("a in (1)", "a = 1");
        assertRewrite("a in (1, 2)", "a in (1, 2)");
        assertRewrite("a not in (1)", "not a = 1");
        assertRewrite("a not in (1, 2)", "not a in (1, 2)");
        assertRewrite("a in (a in (1))", "a = (a = 1)");
        assertRewrite("a in (a in (1, 2))", "a = (a in (1, 2))");
        assertRewrite("(a in (1)) in (1)", "(a = 1) = 1");
        assertRewrite("(a in (1, 2)) in (1)", "(a in (1, 2)) = 1");
        assertRewrite("(a in (1)) in (1, 2)", "(a = 1) in (1, 2)");
        assertRewrite("case a when b in (1) then a else c end in (1)",
                "case a when b = 1 then a else c end = 1");
        assertRewrite("case a when b not in (1) then a else c end not in (1)",
                "not case a when not b = 1 then a else c end = 1");
        assertRewrite("case a when b not in (1) then a else c end in (1, 2)",
                "case a when not b = 1 then a else c end in (1, 2)");

    }

    @Test
    public void testSimplifyCastRule() {
        executor = new ExpressionRuleExecutor(ImmutableList.of(SimplifyCastRule.INSTANCE));

        // deduplicate
        assertRewrite("CAST(1 AS int)", "1");
        assertRewrite("CAST('str' AS string)", "'str'");
        assertRewrite("CAST(CAST(1 AS int) AS int)", "1");

        // deduplicate inside
        assertRewrite("CAST(CAST('str' AS string) AS double)", "CAST('str' AS double)");
        assertRewrite("CAST(CAST(1 AS int) AS double)", "CAST(1 AS double)");
    }


    private void assertRewrite(String expression, String expected) {
        Expression needRewriteExpression = PARSER.parseExpression(expression);
        Expression expectedExpression = PARSER.parseExpression(expected);
        Expression rewrittenExpression = executor.rewrite(needRewriteExpression);
        Assertions.assertEquals(expectedExpression, rewrittenExpression);
    }
}
