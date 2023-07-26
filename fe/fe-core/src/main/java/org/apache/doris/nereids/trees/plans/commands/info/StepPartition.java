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

import org.apache.doris.analysis.MultiPartitionDesc;
import org.apache.doris.analysis.PartitionKeyDesc;
import org.apache.doris.analysis.PartitionValue;
import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.literal.Literal;

import com.google.common.collect.Maps;

import java.util.List;
import java.util.stream.Collectors;

/**
 * represent step partition
 */
public class StepPartition extends PartitionDefinition {
    private final List<Expression> fromExpression;
    private final List<Expression> toExpression;
    private final Expression unit;
    private final String unitString;

    public StepPartition(List<Expression> fromExpression, List<Expression> toExpression, Expression unit,
            String unitString) {
        this.fromExpression = fromExpression;
        this.toExpression = toExpression;
        this.unit = unit;
        this.unitString = unitString;
    }

    /**
     * translate to catalog objects.
     */
    public MultiPartitionDesc translateToCatalogStyle() {
        List<PartitionValue> fromValues = fromExpression.stream().map(e -> new PartitionValue(e.toSql()))
                .collect(Collectors.toList());
        List<PartitionValue> toValues = toExpression.stream().map(e -> new PartitionValue(e.toSql()))
                .collect(Collectors.toList());
        try {
            if (unitString == null) {
                return new MultiPartitionDesc(PartitionKeyDesc.createMultiFixed(fromValues, toValues,
                        ((long) ((Literal) unit).getDouble())), Maps.newHashMap());
            }
            return new MultiPartitionDesc(PartitionKeyDesc.createMultiFixed(fromValues, toValues,
                    ((long) ((Literal) unit).getDouble()), unitString), Maps.newHashMap());
        } catch (Exception e) {
            throw new AnalysisException(e.getMessage(), e.getCause());
        }
    }
}
