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

package org.apache.doris.nereids.trees.plans.commands;

import org.apache.doris.catalog.Database;
import org.apache.doris.common.AnalysisException;
import org.apache.doris.nereids.NereidsPlanner;
import org.apache.doris.nereids.analyzer.UnboundOneRowRelation;
import org.apache.doris.nereids.analyzer.UnboundSlot;
import org.apache.doris.nereids.glue.LogicalPlanAdapter;
import org.apache.doris.nereids.trees.expressions.Alias;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.PlaceholderSlot;
import org.apache.doris.nereids.trees.expressions.visitor.DefaultExpressionRewriter;
import org.apache.doris.nereids.trees.plans.PlanType;
import org.apache.doris.nereids.trees.plans.physical.PhysicalOneRowRelation;
import org.apache.doris.nereids.trees.plans.visitor.PlanVisitor;
import org.apache.doris.nereids.types.DataType;
import org.apache.doris.nereids.util.RelationUtil;
import org.apache.doris.qe.ConnectContext;
import org.apache.doris.qe.StmtExecutor;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * create function
 */
public class CreateFunctionCommand extends Command implements ForwardWithSync {
    // field from parsing.
    private final boolean isGlobal;
    private final boolean isAggregate;
    private final boolean isAliasFunction;
    private final List<String> functionNameParts;
    private final List<String> argTypeStrings;
    private final String retTypeString;
    private final String intermediateTypeString;
    private final List<String> paramStrings;
    private final Expression originalFunction;
    private final Map<String, String> properties;
    // field when running
    private Database database;

    /**
     * constructor
     */
    public CreateFunctionCommand(boolean isGlobal, boolean isAggregate, boolean isAliasFunction,
            List<String> functionNameParts, List<String> argTypeStrings, String retTypeString,
            String intermediateTypeString, List<String> paramStrings, Expression originalFunction,
            Map<String, String> properties) {
        super(PlanType.CREATE_FUNCTION_COMMAND);
        this.isGlobal = isGlobal;
        this.isAggregate = isAggregate;
        this.isAliasFunction = isAliasFunction;
        this.functionNameParts = ImmutableList.copyOf(Objects.requireNonNull(functionNameParts,
                "functionNameParts is required in create function command"));
        this.argTypeStrings = ImmutableList.copyOf(Objects.requireNonNull(argTypeStrings,
                "argTypes is required in create function command"));
        this.retTypeString = retTypeString;
        this.intermediateTypeString = intermediateTypeString;
        this.paramStrings = paramStrings;
        this.originalFunction = originalFunction;
        this.properties = properties;
    }

    @Override
    public void run(ConnectContext ctx, StmtExecutor executor) throws AnalysisException {
        if (isAliasFunction) {
            handleAliasFunction(ctx, executor);
        }
    }

    private void handleAliasFunction(ConnectContext ctx, StmtExecutor executor) throws AnalysisException {
        checkDb(ctx);
        Map<String, PlaceholderSlot> replaceMap = Maps.newHashMap();
        for (int i = 0; i < paramStrings.size(); ++i) {
            replaceMap.put(paramStrings.get(i), new PlaceholderSlot(paramStrings.get(i),
                    DataType.convertFromString(argTypeStrings.get(i))));
        }
        Expression unboundOriginalFunction = UnboundSlotReplacer.INSTANCE.replace(originalFunction, replaceMap);

        // build a placeholder plan to analyze and optimize the function.
        UnboundOneRowRelation placeholderPlan = new UnboundOneRowRelation(RelationUtil.newRelationId(),
                ImmutableList.of(new Alias(unboundOriginalFunction, "ORIGINAL_FUNCTION")));
        LogicalPlanAdapter adapter = new LogicalPlanAdapter(placeholderPlan, ctx.getStatementContext());
        NereidsPlanner planner = new NereidsPlanner(ctx.getStatementContext());
        planner.plan(adapter, ctx.getSessionVariable().toThrift());

        Expression optimizedFunction = ((Alias) ((PhysicalOneRowRelation) planner.getPhysicalPlan())
                .getProjects().get(0)).child();

        optimizedFunction.hasUnbound();
    }

    private void checkDb(ConnectContext ctx) throws AnalysisException {
        String dbName;
        if (functionNameParts.size() == 1) {
            return;
        } else if (functionNameParts.size() == 2) {
            dbName = functionNameParts.get(0);
        } else {
            throw new AnalysisException(String.format("%s is an invalid name", functionNameParts));
        }
        Optional<Database> optionalDB = ctx.getCurrentCatalog().getDb(dbName);
        if (!optionalDB.isPresent()) {
            throw new AnalysisException(String.format("database [%s] is not exist", dbName));
        }
    }

    @VisibleForTesting
    public Expression getOriginalFunction() {
        return originalFunction;
    }

    @Override
    public <R, C> R accept(PlanVisitor<R, C> visitor, C context) {
        return visitor.visitCreateFunctionCommand(this, context);
    }

    private static class UnboundSlotReplacer extends DefaultExpressionRewriter<Map<String, PlaceholderSlot>> {
        public static final UnboundSlotReplacer INSTANCE = new UnboundSlotReplacer();

        public Expression replace(Expression expression, Map<String, PlaceholderSlot> context) {
            return expression.accept(this, context);
        }

        @Override
        public Expression visitUnboundSlot(UnboundSlot unboundSlot, Map<String, PlaceholderSlot> context) {
            String slotName = unboundSlot.getNameParts().get(0);
            if (!context.containsKey(slotName)) {
                throw new RuntimeException(String.format("%s is not exist in parameters", slotName));
            }
            return context.get(slotName);
        }
    }
}
