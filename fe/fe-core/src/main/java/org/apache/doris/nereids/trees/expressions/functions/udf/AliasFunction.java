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

import org.apache.doris.catalog.FunctionSignature;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.functions.BoundFunction;
import org.apache.doris.nereids.trees.expressions.functions.ExplicitlyCastableSignature;
import org.apache.doris.nereids.types.DataType;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * alias function
 */
public class AliasFunction extends BoundFunction implements ExplicitlyCastableSignature {
    private final BoundFunction originalFunction;
    private final List<String> parameters;
    private final List<DataType> argTypes;

    public AliasFunction(String name, List<DataType> argTypes, BoundFunction originalFunction,
            List<String> parameters, Expression... arguments) {
        super(name, arguments);
        this.originalFunction = originalFunction;
        this.parameters = parameters;
        this.argTypes = argTypes;
    }

    @Override
    public List<FunctionSignature> getSignatures() {
        return ImmutableList.of(Suppliers.memoize(() -> FunctionSignature
                .of(originalFunction.getSignature().returnType, argTypes)).get());
    }

    public List<String> getParameters() {
        return parameters;
    }

    public BoundFunction getOriginalFunction() {
        return originalFunction;
    }

    @Override
    public boolean nullable() {
        return false;
    }
}
