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

package org.apache.doris.nereids.rules.analysis;

import org.apache.doris.analysis.Expr;
import org.apache.doris.analysis.FunctionCallExpr;
import org.apache.doris.catalog.AliasFunction;
import org.apache.doris.nereids.CascadesContext;
import org.apache.doris.nereids.analyzer.UnboundAlias;
import org.apache.doris.nereids.analyzer.UnboundFunction;
import org.apache.doris.nereids.analyzer.UnboundSlot;
import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.parser.NereidsParser;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.visitor.DefaultExpressionRewriter;
import org.apache.doris.nereids.trees.plans.logical.LogicalPlan;
import org.apache.doris.nereids.trees.plans.logical.LogicalProject;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import java.util.List;
import java.util.Map;

/**
 * replace alias function to builtin function expression
 */
public class AliasFunctionRewriter extends DefaultExpressionRewriter<CascadesContext> {
    /**
     * In the rule, we change alias function to builtin function.
     * Firstly, when we find an unbound function and check whether it's an alias function.
     * Secondly, we ensure it is an alias function, it's a original planner style expression, we get its sql-style,
     * but the NereidsParser cannot parser an expression, so we parse a one-row relation sql like:
     *      select {the alias function}
     * TODO: cache the catalog type of alias function object.
     */

    public Expression rewriteFunction(UnboundFunction unboundFunction, AliasFunction catalogFunction) {
        Expr originalFunction = catalogFunction.getOriginFunction();
        if (!(originalFunction instanceof FunctionCallExpr)) {
            throw new AnalysisException(String.format("unsupported type of originalFunction in aliasFunction: %s",
                    originalFunction.getType()));
        }
        Expression nereidsFunction = translateToNereidsFunction(((FunctionCallExpr) originalFunction));
        return replaceParameter(nereidsFunction, catalogFunction.getParameters(), unboundFunction.children());
    }

    private Expression translateToNereidsFunction(FunctionCallExpr function) {
        String functionSql = function.toSql();
        LogicalPlan containerPlan = new NereidsParser().parseSingle(
                String.format("select %s from virt_tbl", functionSql));
        Preconditions.checkArgument(containerPlan instanceof LogicalProject);
        return ((LogicalProject<?>) containerPlan).getProjects().get(0);
    }

    private Expression replaceParameter(Expression nereidsFunction,
            List<String> parameters, List<Expression> realParameters) {
        Preconditions.checkArgument(parameters.size() == realParameters.size());
        return new ParameterRewriter(parameters, realParameters).replace(nereidsFunction);
    }

    private static class ParameterRewriter extends DefaultExpressionRewriter<Void> {
        private final Map<String, Expression> placeHolderToRealParams;

        public ParameterRewriter(List<String> params, List<Expression> real) {
            ImmutableMap.Builder<String, Expression> builder = new Builder<>();
            for (int i = 0; i < params.size(); ++i) {
                builder.put(params.get(i), real.get(i));
            }
            placeHolderToRealParams = builder.build();
        }

        public Expression replace(Expression expression) {
            return expression.accept(this, null);
        }

        @Override
        public Expression visitUnboundSlot(UnboundSlot slot, Void unused) {
            return placeHolderToRealParams.getOrDefault(slot.getName(), slot);
        }

        @Override
        public Expression visitUnboundAlias(UnboundAlias alias, Void unused) {
            alias = ((UnboundAlias) super.visit(alias, null));
            return alias.child();
        }
    }
}