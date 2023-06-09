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

package org.apache.doris.nereids.trees.expressions.functions.udf;

import org.apache.doris.nereids.trees.expressions.functions.BoundFunction;
import org.apache.doris.nereids.trees.expressions.functions.FunctionBuilder;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * alias function builder
 */
public class AliasFunctionBuilder extends FunctionBuilder {
    private final AliasFunction aliasFunction;

    public AliasFunctionBuilder(AliasFunction aliasFunction) {
        super(aliasFunction.arity(), false);
        this.aliasFunction = aliasFunction;
    }

    @Override
    public boolean canApply(List<?> arguments) {
        if (arguments.size() != aliasFunction.arity()) {
            return false;
        }
        return true;
    }
    
    @Override
    public BoundFunction build(String name, List<?> arguments) {
    }
}