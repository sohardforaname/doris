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
import org.apache.doris.nereids.trees.expressions.functions.ExplicitlyCastableSignature;
import org.apache.doris.nereids.trees.expressions.functions.PropagateNullable;
import org.apache.doris.nereids.trees.expressions.visitor.ExpressionVisitor;
import org.apache.doris.nereids.types.IntegerType;
import org.apache.doris.nereids.types.StringType;
import org.apache.doris.nereids.types.VarcharType;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * function mask_first_n
 */
public class MaskFirstN extends ScalarFunction implements ExplicitlyCastableSignature, PropagateNullable {
    public static final List<FunctionSignature> SIGNATURES = ImmutableList.of(
            FunctionSignature.ret(VarcharType.SYSTEM_DEFAULT).varArgs(VarcharType.SYSTEM_DEFAULT),
            FunctionSignature.ret(StringType.INSTANCE).varArgs(StringType.INSTANCE),
            FunctionSignature.ret(VarcharType.SYSTEM_DEFAULT).varArgs(VarcharType.SYSTEM_DEFAULT, IntegerType.INSTANCE),
            FunctionSignature.ret(StringType.INSTANCE).varArgs(StringType.INSTANCE, IntegerType.INSTANCE)
    );

    /**
     * constructor with 1 or more arguments.
     */
    public MaskFirstN(Expression arg, Expression arg1) {
        super("mask_first_n", arg, arg1);
    }

    /**
     * withChildren.
     */
    @Override
    public MaskFirstN withChildren(List<Expression> children) {
        Preconditions.checkArgument(children.size() >= 1);
        return new MaskFirstN(children.get(0), children.get(1));
    }

    @Override
    public List<FunctionSignature> getSignatures() {
        return SIGNATURES;
    }

    @Override
    public <R, C> R accept(ExpressionVisitor<R, C> visitor, C context) {
        return visitor.visitMaskFirstN(this, context);
    }
}
