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

package org.apache.doris.nereids.metrics.event;

import org.apache.doris.nereids.memo.Group;
import org.apache.doris.nereids.memo.GroupExpression;
import org.apache.doris.nereids.metrics.CounterType;
import org.apache.doris.nereids.metrics.Event;
import org.apache.doris.nereids.trees.plans.Plan;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * counter event
 */
public class CounterEvent extends Event {
    private static final Map<CounterType, Long> counterMap = Maps.newHashMap();
    private final CounterType counterType;
    private final Group group;
    private final GroupExpression groupExpression;
    private final Plan plan;

    /**
     * counter event
     */
    public CounterEvent(long stateId, CounterType counterType, Group group,
            GroupExpression groupExpression, Plan plan) {
        super(stateId);
        counterMap.compute(counterType, (t, l) -> l == null ? 1L : l + 1);
        this.counterType = counterType;
        this.group = group;
        this.groupExpression = groupExpression;
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "CounterEvent{"
                + "count=" + counterMap.get(counterType)
                + ", counterType=" + counterType
                + ", group=" + group
                + ", groupExpression=" + groupExpression
                + ", plan=" + plan
                + '}';
    }

    public static void clearCounter() {
        counterMap.clear();
    }
}
