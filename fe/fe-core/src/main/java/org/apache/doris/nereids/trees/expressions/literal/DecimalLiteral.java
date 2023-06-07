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

import org.apache.doris.analysis.LiteralExpr;
import org.apache.doris.nereids.trees.expressions.visitor.ExpressionVisitor;
import org.apache.doris.nereids.types.DecimalV2Type;

import java.io.DataOutput;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

/**
 * decimal type literal
 */
public class DecimalLiteral extends Literal {

    private final BigDecimal value;

    public DecimalLiteral(BigDecimal value) {
        this(DecimalV2Type.createDecimalV2Type(value), value);
    }

    public DecimalLiteral(DecimalV2Type dataType, BigDecimal value) {
        super(dataType);
        BigDecimal adjustedValue = value.scale() < 0 ? value : value.setScale(dataType.getScale(), RoundingMode.DOWN);
        this.value = Objects.requireNonNull(adjustedValue);
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public <R, C> R accept(ExpressionVisitor<R, C> visitor, C context) {
        return visitor.visitDecimalLiteral(this, context);
    }

    @Override
    public LiteralExpr toLegacyLiteral() {
        return new org.apache.doris.analysis.DecimalLiteral(value, dataType.toCatalogDataType());
    }

    @Override
    public double getDouble() {
        return value.doubleValue();
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(MetaCode.DECIMALV2_LITERAL.getCode());
        out.writeInt(getValue().precision());
        out.writeInt(getValue().scale());
        out.writeChars(getValue().toString());
    }
}
