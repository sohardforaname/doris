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

import org.apache.doris.catalog.Column;
import org.apache.doris.catalog.KeysType;
import org.apache.doris.catalog.OlapTable;
import org.apache.doris.catalog.TableIf;
import org.apache.doris.nereids.analyzer.UnboundOlapTableSink;
import org.apache.doris.nereids.analyzer.UnboundSlot;
import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.trees.expressions.Alias;
import org.apache.doris.nereids.trees.expressions.NamedExpression;
import org.apache.doris.nereids.trees.expressions.literal.BooleanLiteral;
import org.apache.doris.nereids.trees.plans.PlanType;
import org.apache.doris.nereids.trees.plans.commands.ExplainCommand.ExplainLevel;
import org.apache.doris.nereids.trees.plans.logical.LogicalPlan;
import org.apache.doris.nereids.trees.plans.logical.LogicalProject;
import org.apache.doris.nereids.trees.plans.visitor.PlanVisitor;
import org.apache.doris.nereids.util.RelationUtil;
import org.apache.doris.qe.ConnectContext;
import org.apache.doris.qe.StmtExecutor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * delete from unique key table.
 */
public class DeleteCommand extends Command implements ForwardWithSync {
    private final List<String> nameParts;
    private final String tableAlias;
    private final List<String> partitions;
    private LogicalPlan logicalQuery;
    private OlapTable targetTable;
    private ExplainLevel explainLevel = null;

    public DeleteCommand(List<String> nameParts, String tableAlias, List<String> partitions, LogicalPlan logicalQuery) {
        super(PlanType.DELETE_COMMAND);
        this.nameParts = nameParts;
        this.tableAlias = tableAlias;
        this.partitions = partitions;
        this.logicalQuery = logicalQuery;
    }

    @Override
    public void run(ConnectContext ctx, StmtExecutor executor) throws Exception {
        completeQueryPlan(ctx);

        if (explainLevel != null) {
            new ExplainCommand(explainLevel, logicalQuery).run(ctx, executor);
        } else {
            new InsertIntoTableCommand(logicalQuery, null).run(ctx, executor);
        }
    }

    private void checkTable(ConnectContext ctx) {
        List<String> qualifieredTableName = RelationUtil.getQualifierName(ctx, nameParts);
        TableIf table = RelationUtil.getTable(qualifieredTableName, ctx.getEnv());
        if (!(table instanceof OlapTable)) {
            throw new AnalysisException("table must be olapTable in delete command");
        }
        targetTable = ((OlapTable) table);
        if (targetTable.getKeysType() != KeysType.UNIQUE_KEYS) {
            throw new AnalysisException("Nereids only support delete command on unique key table now");
        }
    }

    /**
     * public for test
     */
    public void completeQueryPlan(ConnectContext ctx) {
        checkTable(ctx);

        if (logicalQuery instanceof ExplainCommand) {
            explainLevel = ((ExplainCommand) logicalQuery).getLevel();
            logicalQuery = ((ExplainCommand) logicalQuery).getLogicalPlan();
        }

        // add select and insert node.
        List<NamedExpression> selectLists = Lists.newArrayList();
        for (Column column : targetTable.getFullSchema()) {
            if (column.getName().equals(Column.DELETE_SIGN)) {
                selectLists.add(new Alias(BooleanLiteral.TRUE, BooleanLiteral.TRUE.toSql()));
            } else {
                selectLists.add(new UnboundSlot(column.getName()));
            }
        }

        logicalQuery = new LogicalProject<>(selectLists, logicalQuery);

        // make UnboundTableSink
        logicalQuery = new UnboundOlapTableSink<>(nameParts, null, null, null, logicalQuery);
    }

    public LogicalPlan getLogicalQuery() {
        return logicalQuery;
    }

    @Override
    public <R, C> R accept(PlanVisitor<R, C> visitor, C context) {
        return visitor.visitDeleteCommand(this, context);
    }
}
