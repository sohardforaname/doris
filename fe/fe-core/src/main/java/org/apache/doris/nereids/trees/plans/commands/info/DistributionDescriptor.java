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

import org.apache.doris.analysis.DistributionDesc;
import org.apache.doris.analysis.HashDistributionDesc;
import org.apache.doris.analysis.RandomDistributionDesc;
import org.apache.doris.nereids.util.Utils;

import java.util.List;

/**
 * table distribution description
 */
public class DistributionDescriptor {
    private final boolean isHash;
    private final boolean isAutoBucket;
    private final int bucketNum;
    private final List<String> cols;
    
    public DistributionDescriptor(boolean isHash, boolean isAutoBucket, int bucketNum, List<String> cols) {
        this.isHash = isHash;
        this.isAutoBucket = isAutoBucket;
        this.bucketNum = bucketNum;
        this.cols = Utils.copyRequiredList(cols);
    }

    public DistributionDesc translateToCatalogStyle() {
        if (isHash) {
            return new HashDistributionDesc(bucketNum, isAutoBucket, cols);
        }
        return new RandomDistributionDesc(bucketNum, isAutoBucket);
    }
}