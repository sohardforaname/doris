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

import org.apache.doris.nereids.rules.expression.rewrite.AbstractExpressionRewriteRule;
import org.apache.doris.nereids.rules.expression.rewrite.ExpressionRewriteContext;
import org.apache.doris.nereids.trees.expressions.Cast;
import org.apache.doris.nereids.trees.expressions.ComparisonPredicate;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.SlotReference;
import org.apache.doris.nereids.trees.expressions.literal.Literal;
import org.apache.doris.nereids.types.BigIntType;
import org.apache.doris.nereids.types.CharType;
import org.apache.doris.nereids.types.DataType;
import org.apache.doris.nereids.types.IntegerType;
import org.apache.doris.nereids.types.SmallIntType;
import org.apache.doris.nereids.types.StringType;
import org.apache.doris.nereids.types.TinyIntType;
import org.apache.doris.nereids.types.VarcharType;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * to eliminate useless cast so that the predicate can be push down to storage engine.
 */
public class EliminateCastRule extends AbstractExpressionRewriteRule {

    public static final EliminateCastRule INSTANCE = new EliminateCastRule();

    private static final Map<DataType, Integer> typeGroupMap = new ImmutableMap.Builder<DataType, Integer>()
            .put(TinyIntType.INSTANCE, 0)
            .put(SmallIntType.INSTANCE, 0)
            .put(IntegerType.INSTANCE, 0)
            .put(BigIntType.INSTANCE, 0)
            .put(VarcharType.INSTANCE, 1)
            .put(StringType.INSTANCE, 1)
            .put(CharType.INSTANCE, 1)
            .build();

    @Override
    public Expression visitComparisonPredicate(ComparisonPredicate predicate, ExpressionRewriteContext context) {
        int tag = checkIfNeedHandle(predicate);
        if (tag == -1) {
            return predicate;
        }
        SlotReference slot = ((SlotReference) predicate.child(tag));
        Literal literal = ((Literal) ((Cast) predicate.child(1 ^ tag)).child());
        // can handle: int <-> int, string <-> string, and LargeInt can't be represented by 64-bit integer
        if (typeGroupMap.get(slot.getDataType()) == null || typeGroupMap.get(literal.getDataType()) == null
                || !typeGroupMap.get(slot.getDataType()).equals(typeGroupMap.get(literal.getDataType()))) {
            return predicate;
        }
        Expression[] exprs = new Expression[] {literal, slot};
        return predicate.withChildren(exprs[tag], exprs[1 ^ tag]);
    }

    private int checkIfNeedHandle(ComparisonPredicate predicate) {
        if (predicate.left() instanceof SlotReference && checkLiteralCast(predicate.right())) {
            return 0;
        } else if (checkLiteralCast(predicate.left()) && predicate.right() instanceof SlotReference) {
            return 1;
        }
        return -1;
    }

    private boolean checkLiteralCast(Expression expr) {
        return expr instanceof Cast && ((Cast) expr).child() instanceof Literal;
    }
}
