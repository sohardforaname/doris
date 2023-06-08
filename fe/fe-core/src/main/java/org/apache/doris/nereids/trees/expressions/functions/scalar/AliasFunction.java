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

package org.apache.doris.nereids.trees.expressions.functions.scalar;

import org.apache.doris.catalog.FunctionSignature;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.functions.BoundFunction;
import org.apache.doris.nereids.trees.expressions.functions.ExplicitlyCastableSignature;
import org.apache.doris.nereids.types.DataType;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * alias function created by user.
 */
public class AliasFunction extends BoundFunction implements ExplicitlyCastableSignature {
    private final Expression originalFunction;
    private final DataType retType;
    private final List<DataType> argTypes;

    public AliasFunction(String name, Expression originalFunction, DataType retType, List<DataType> argTypes) {
        super(name);
        this.originalFunction = originalFunction;
        this.retType = retType;
        this.argTypes = argTypes;
    }

    @Override
    public List<FunctionSignature> getSignatures() {
        return Suppliers.memoize(() -> ImmutableList.of(FunctionSignature.ret(retType)
                .args(argTypes.toArray(new DataType[0])))).get();
    }

    @Override
    public boolean nullable() {
        return originalFunction.nullable();
    }
}
