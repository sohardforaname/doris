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

import org.apache.doris.analysis.Expr;
import org.apache.doris.analysis.LiteralExpr;
import org.apache.doris.analysis.SlotDescriptor;
import org.apache.doris.analysis.TupleDescriptor;
import org.apache.doris.catalog.Column;
import org.apache.doris.catalog.Database;
import org.apache.doris.catalog.Env;
import org.apache.doris.catalog.OlapTable;
import org.apache.doris.catalog.Partition;
import org.apache.doris.datasource.CatalogIf;
import org.apache.doris.nereids.NereidsPlanner;
import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.glue.LogicalPlanAdapter;
import org.apache.doris.nereids.properties.DistributionSpecHash;
import org.apache.doris.nereids.properties.DistributionSpecHash.ShuffleType;
import org.apache.doris.nereids.properties.PhysicalProperties;
import org.apache.doris.nereids.trees.expressions.ExprId;
import org.apache.doris.nereids.trees.expressions.NamedExpression;
import org.apache.doris.nereids.trees.expressions.Slot;
import org.apache.doris.nereids.trees.plans.PlanType;
import org.apache.doris.nereids.trees.plans.logical.LogicalPlan;
import org.apache.doris.nereids.trees.plans.physical.PhysicalOlapTableSink;
import org.apache.doris.nereids.trees.plans.physical.PhysicalPlan;
import org.apache.doris.nereids.trees.plans.visitor.PlanVisitor;
import org.apache.doris.nereids.txn.Transaction;
import org.apache.doris.nereids.util.RelationUtil;
import org.apache.doris.planner.DataSink;
import org.apache.doris.planner.OlapTableSink;
import org.apache.doris.planner.PlanFragment;
import org.apache.doris.qe.ConnectContext;
import org.apache.doris.qe.StmtExecutor;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

/**
 * insert into select command implementation
 * insert into select command support the grammer: explain? insert into table columns? partitions? hints? query
 * InsertIntoTableCommand is a command to represent insert the answer of a query into a table.
 * class structure's:
 *  InsertIntoTableCommand(Query())
 *  ExplainCommand(InsertIntoTableCommand(Query()))
 */
public class InsertIntoTableCommand extends Command implements ForwardWithSync {
    public static final Logger LOG = LogManager.getLogger(InsertIntoTableCommand.class);

    private final LogicalPlan logicalQuery;
    private final String labelName;
    private PhysicalPlan plannedQuery;
    private NereidsPlanner planner;

    /**
     * constructor
     */
    public InsertIntoTableCommand(LogicalPlan logicalQuery, String labelName) {
        super(PlanType.INSERT_INTO_TABLE_COMMAND);
        Preconditions.checkArgument(logicalQuery != null, "logicalQuery cannot be null in InsertIntoTableCommand");
        this.logicalQuery = logicalQuery;
        this.labelName = labelName;
    }

    public NereidsPlanner getPlanner() {
        return planner;
    }

    @Override
    public void run(ConnectContext ctx, StmtExecutor executor) throws Exception {
        if (ctx.isTxnModel()) {
            // in original planner with txn model, we can execute sql like: insert into t select 1, 2, 3
            // but no data will be inserted, now we adjust forbid it.
            throw new AnalysisException("insert into table command is not supported in txn model");
        }

        getTable(ctx);

        LogicalPlanAdapter logicalPlanAdapter = new LogicalPlanAdapter(logicalQuery, ctx.getStatementContext());
        planner = new NereidsPlanner(ctx.getStatementContext());
        planner.plan(logicalPlanAdapter, ctx.getSessionVariable().toThrift());

        if (ctx.getMysqlChannel() != null) {
            ctx.getMysqlChannel().reset();
        }
        String label = this.labelName;
        if (label == null) {
            label = String.format("label_%x_%x", ctx.queryId().hi, ctx.queryId().lo);
        }

        PhysicalOlapTableSink physicalOlapTableSink = ((PhysicalOlapTableSink) planner.getPhysicalPlan());
        OlapTableSink sink = ((OlapTableSink) planner.getFragments().get(0).getSink());

        Transaction txn = new Transaction(ctx,
                physicalOlapTableSink, table, label, planner);

        sink.init(ctx.queryId(), txn.getTxnId(), database.getId(), ctx.getExecTimeout(),
                ctx.getSessionVariable().getSendBatchParallelism(), false);
        sink.complete();

        txn.executeInsertIntoSelectCommand(executor);
    }

    public LogicalPlan initTargetTableAndGetQuery(ConnectContext ctx) {
        getTable(ctx);
        return logicalQuery;
    }

    /**
     * calculate PhysicalProperties.
     */
    public PhysicalProperties calculatePhysicalProperties(List<Slot> outputs) {
        // it will be used at set physical properties.

        List<ExprId> exprIds = outputs.subList(0, ((OlapTable) table).getKeysNum()).stream()
                .map(NamedExpression::getExprId).collect(Collectors.toList());
        return PhysicalProperties.createHash(new DistributionSpecHash(exprIds, ShuffleType.NATURAL));
    }

    private void getTable(ConnectContext ctx) {
        // Check database and table
        List<String> qualifiedTableName = RelationUtil.getQualifierName(ctx, nameParts);
        String catalogName = qualifiedTableName.get(0);
        String dbName = qualifiedTableName.get(1);
        String tableName = qualifiedTableName.get(2);
        CatalogIf<?> catalog = Env.getCurrentEnv().getCatalogMgr().getCatalog(catalogName);
        if (catalog == null) {
            throw new AnalysisException(String.format("Catalog %s does not exist.", catalogName));
        }
        Database database;
        try {
            database = ((Database) catalog.getDb(dbName).orElseThrow(() ->
                    new AnalysisException("Database [" + dbName + "] does not exist.")));
            table = database.getTable(tableName).orElseThrow(() ->
                    new AnalysisException("Table [" + tableName + "] does not exist in database [" + dbName + "]."));
        } catch (Throwable e) {
            throw new AnalysisException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public <R, C> R accept(PlanVisitor<R, C> visitor, C context) {
        return visitor.visitInsertIntoCommand(this, context);
    }
}
