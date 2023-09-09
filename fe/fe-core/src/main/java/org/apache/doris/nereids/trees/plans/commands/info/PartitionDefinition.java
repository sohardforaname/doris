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
import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.types.DataType;

import java.util.List;
import java.util.Map;

/**
 * abstract class for partition definition
 */
public abstract class PartitionDefinition {
    protected List<DataType> partitionTypes;
    protected Map<String, String> propreties;

    public PartitionDefinition withProperties(Map<String, String> properties) {
        this.propreties = properties;
        return this;
    }

    public abstract AllPartitionDesc translateToCatalogStyle();

    public abstract void validate(Map<String, String> properties);

    public void setPartitionTypes(List<DataType> partitionTypes) {
        this.partitionTypes = partitionTypes;
    }
}
