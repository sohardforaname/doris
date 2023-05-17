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

package org.apache.doris.nereids.trees.plans.physical;

import org.apache.doris.catalog.Column;
import org.apache.doris.catalog.Database;
import org.apache.doris.catalog.OlapTable;
import org.apache.doris.nereids.memo.GroupExpression;
import org.apache.doris.nereids.properties.LogicalProperties;
import org.apache.doris.nereids.properties.PhysicalProperties;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.plans.Plan;
import org.apache.doris.nereids.trees.plans.PlanType;
import org.apache.doris.nereids.trees.plans.visitor.PlanVisitor;
import org.apache.doris.statistics.Statistics;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * physical olap table sink for insert command
 */
public class PhysicalOlapTableSink<CHILD_TYPE extends Plan> extends PhysicalUnary<CHILD_TYPE> {
    private final Database database;
    private final OlapTable targetTable;
    private final List<Column> cols;
    private final List<Long> partitionIds;
    private final boolean singleReplicaLoad;

    public PhysicalOlapTableSink(Database database, OlapTable targetTable, List<Long> partitionIds, List<Column> cols,
            boolean singleReplicaLoad, LogicalProperties logicalProperties, CHILD_TYPE child) {
        this(database, targetTable, partitionIds, cols, singleReplicaLoad, Optional.empty(), logicalProperties, child);
    }

    /**
     * Constructor
     */
    public PhysicalOlapTableSink(Database database, OlapTable targetTable, List<Long> partitionIds, List<Column> cols,
            boolean singleReplicaLoad, Optional<GroupExpression> groupExpression, LogicalProperties logicalProperties,
            CHILD_TYPE child) {
        super(PlanType.PHYSICAL_OLAP_TABLE_SINK, groupExpression, logicalProperties, child);
        this.database = Preconditions.checkNotNull(database, "database != null in PhysicalOlapTableSink");
        this.targetTable = Preconditions.checkNotNull(targetTable, "targetTable != null in PhysicalOlapTableSink");
        this.cols = cols;
        this.partitionIds = partitionIds;
        this.singleReplicaLoad = singleReplicaLoad;
    }

    /**
     * Constructor
     */
    public PhysicalOlapTableSink(Database database, OlapTable targetTable, List<Long> partitionIds, List<Column> cols,
            boolean singleReplicaLoad, Optional<GroupExpression> groupExpression, LogicalProperties logicalProperties,
            PhysicalProperties physicalProperties, Statistics statistics, CHILD_TYPE child) {
        super(PlanType.PHYSICAL_OLAP_TABLE_SINK, groupExpression, logicalProperties, physicalProperties,
                statistics, child);
        this.database = Preconditions.checkNotNull(database, "database != null in PhysicalOlapTableSink");
        this.targetTable = Preconditions.checkNotNull(targetTable, "targetTable != null in PhysicalOlapTableSink");
        this.cols = cols;
        this.partitionIds = partitionIds;
        this.singleReplicaLoad = singleReplicaLoad;
    }

    public Database getDatabase() {
        return database;
    }

    public OlapTable getTargetTable() {
        return targetTable;
    }

    public List<Long> getPartitionIds() {
        return partitionIds;
    }

    public boolean isSingleReplicaLoad() {
        return singleReplicaLoad;
    }

    @Override
    public Plan withChildren(List<Plan> children) {
        Preconditions.checkArgument(children.size() == 1, "PhysicalOlapTableSink only accepts one child");
        return new PhysicalOlapTableSink<>(database, targetTable, partitionIds, cols, singleReplicaLoad,
                getLogicalProperties(), children.get(0));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        PhysicalOlapTableSink<?> that = (PhysicalOlapTableSink<?>) o;
        return Objects.equals(targetTable, that.targetTable) && Objects.equals(partitionIds,
                that.partitionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetTable, partitionIds);
    }

    @Override
    public <R, C> R accept(PlanVisitor<R, C> visitor, C context) {
        return visitor.visitPhysicalOlapTableSink(this, context);
    }

    @Override
    public List<? extends Expression> getExpressions() {
        return ImmutableList.of();
    }

    @Override
    public Plan withGroupExpression(Optional<GroupExpression> groupExpression) {
        return new PhysicalOlapTableSink<>(database, targetTable, partitionIds, cols, singleReplicaLoad,
                groupExpression, getLogicalProperties(), child());
    }

    @Override
    public Plan withLogicalProperties(Optional<LogicalProperties> logicalProperties) {
        return new PhysicalOlapTableSink<>(database, targetTable, partitionIds, cols, singleReplicaLoad,
                groupExpression, logicalProperties.get(), child());
    }

    @Override
    public PhysicalPlan withPhysicalPropertiesAndStats(PhysicalProperties physicalProperties, Statistics statistics) {
        return new PhysicalOlapTableSink<>(database, targetTable, partitionIds, cols, singleReplicaLoad,
                groupExpression, getLogicalProperties(), physicalProperties, statistics, child());
    }
}
