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

package org.apache.doris.nereids.trees.expressions.literal;

import org.apache.doris.analysis.IntLiteral;
import org.apache.doris.analysis.LiteralExpr;
import org.apache.doris.catalog.Type;
import org.apache.doris.common.AnalysisException;
import org.apache.doris.nereids.trees.expressions.visitor.ExpressionVisitor;
import org.apache.doris.nereids.types.TinyIntType;

import java.io.DataOutput;
import java.io.IOException;

/**
 * tiny int type literal
 */
public class TinyIntLiteral extends IntegerLikeLiteral {

    private final byte value;

    public TinyIntLiteral(byte value) {
        super(TinyIntType.INSTANCE);
        this.value = value;
    }

    @Override
    public Byte getValue() {
        return value;
    }

    @Override
    public <R, C> R accept(ExpressionVisitor<R, C> visitor, C context) {
        return visitor.visitTinyIntLiteral(this, context);
    }

    @Override
    public LiteralExpr toLegacyLiteral() {
        try {
            return new IntLiteral(value, Type.TINYINT);
        } catch (AnalysisException e) {
            throw new org.apache.doris.nereids.exceptions.AnalysisException(
                    "Can not convert to legacy literal: " + value, e);
        }
    }

    @Override
    public int getIntValue() {
        return value;
    }

    @Override
    public Number getNumber() {
        return value;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(MetaCode.TINYINT_LITERAL.getCode());
        out.writeByte(value);
    }
}
