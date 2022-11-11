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

package org.apache.doris.nereids.jobs.cascades;

import org.apache.doris.nereids.jobs.Job;
import org.apache.doris.nereids.jobs.JobContext;
import org.apache.doris.nereids.jobs.JobType;
import org.apache.doris.nereids.memo.Group;
import org.apache.doris.nereids.memo.GroupExpression;
import org.apache.doris.nereids.memo.Memo;
import org.apache.doris.nereids.metrics.CounterType;
import org.apache.doris.nereids.metrics.event.CounterEvent;

/**
 * Job to optimize {@link Group} in {@link org.apache.doris.nereids.memo.Memo}.
 */
public class OptimizeGroupJob extends Job {
    private final Group group;

    public OptimizeGroupJob(Group group, JobContext context) {
        super(JobType.OPTIMIZE_PLAN_SET, context);
        this.group = group;
    }

    @Override
    public void execute() {
        COUNTER_TRACER.log(new CounterEvent(Memo.getStateId(), CounterType.JOB_EXECUTION, group, null, null));
        if (group.getCostLowerBound() > context.getCostUpperBound()
                || group.getLowestCostPlan(context.getRequiredProperties()).isPresent()) {
            return;
        }
        if (!group.isExplored()) {
            for (GroupExpression logicalGroupExpression : group.getLogicalExpressions()) {
                context.getCascadesContext().pushJob(new OptimizeGroupExpressionJob(logicalGroupExpression, context));
            }
        }
        for (GroupExpression physicalGroupExpression : group.getPhysicalExpressions()) {
            context.getCascadesContext().pushJob(new CostAndEnforcerJob(physicalGroupExpression, context));
        }
        group.setExplored(true);
    }
}
