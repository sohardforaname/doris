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

package org.apache.doris.nereids.trees.plans.commands.info;

import org.apache.doris.analysis.AllPartitionDesc;
import org.apache.doris.analysis.PartitionKeyDesc;
import org.apache.doris.analysis.PartitionValue;
import org.apache.doris.analysis.SinglePartitionDesc;
import org.apache.doris.catalog.ReplicaAllocation;
import org.apache.doris.common.util.PropertyAnalyzer;
import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.literal.Literal;

import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * represent in partition
 */
public class InPartition extends PartitionDefinition {
    private final String partitionName;
    private final List<List<Expression>> values;
    private ReplicaAllocation replicaAllocation = ReplicaAllocation.DEFAULT_ALLOCATION;

    public InPartition(String partitionName, List<List<Expression>> values) {
        this.partitionName = partitionName;
        this.values = values;
    }

    @Override
    public void validate(Map<String, String> properties) {
        try {
            replicaAllocation = PropertyAnalyzer.analyzeReplicaAllocation(properties, "");
        } catch (Exception e) {
            throw new AnalysisException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public String getPartitionName() {
        return partitionName;
    }

    @Override
    public AllPartitionDesc translateToCatalogStyle() {
        List<List<PartitionValue>> catalogValues = values.stream().map(l -> l.stream().map(e -> new PartitionValue(
                ((Literal) e).getStringValue())).collect(Collectors.toList())).collect(Collectors.toList());
        return new SinglePartitionDesc(false, partitionName, PartitionKeyDesc.createIn(catalogValues),
                replicaAllocation, Maps.newHashMap());
    }
}