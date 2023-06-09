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

import org.apache.doris.common.util.ReflectionUtils;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.SlotReference;
import org.apache.doris.nereids.trees.expressions.VirtualSlotReference;
import org.apache.doris.nereids.trees.expressions.functions.BoundFunction;
import org.apache.doris.nereids.trees.expressions.functions.FunctionBuilder;
import org.apache.doris.nereids.trees.expressions.visitor.DefaultExpressionRewriter;
import org.apache.doris.nereids.util.TypeCoercionUtils;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
        for (Object argument : arguments) {
            if (!(argument instanceof Expression)) {
                Optional<Class> primitiveType = ReflectionUtils.getPrimitiveType(argument.getClass());
                if (!primitiveType.isPresent() || !Expression.class.isAssignableFrom(primitiveType.get())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public BoundFunction build(String name, List<?> arguments) {
        // use AliasFunction to process TypeCoercion
        BoundFunction boundAliasFunction = ((BoundFunction) aliasFunction.withChildren(arguments.stream()
                .map(Expression.class::cast).collect(Collectors.toList())));

        Expression processedExpression = TypeCoercionUtils.processBoundFunction(boundAliasFunction);
        List<Expression> inputs = processedExpression.getArguments();

        // replace the placeholder slot to the input expressions.
        // adjust input, parameter and replaceMap to be corresponding.
        Map<String, VirtualSlotReference> virtualSlots = ((Set<VirtualSlotReference>) aliasFunction
                .getOriginalFunction().collect(VirtualSlotReference.class::isInstance))
                .stream().collect(Collectors.toMap(SlotReference::getName, k -> k));

        Map<VirtualSlotReference, Expression> replaceMap = Maps.newHashMap();
        for (int i = 0; i < inputs.size(); ++i) {
            String parameter = aliasFunction.getParameters().get(i);
            Preconditions.checkArgument(virtualSlots.containsKey(parameter));
            replaceMap.put(virtualSlots.get(parameter), inputs.get(i));
        }

        return ((BoundFunction) VirtualSlotReplacer.INSTANCE.replace(aliasFunction.getOriginalFunction(), replaceMap));
    }

    private static class VirtualSlotReplacer extends DefaultExpressionRewriter<Map<VirtualSlotReference, Expression>> {
        public static final VirtualSlotReplacer INSTANCE = new VirtualSlotReplacer();

        public Expression replace(Expression expression, Map<VirtualSlotReference, Expression> context) {
            return expression.accept(this, context);
        }

        @Override
        public Expression visitVirtualReference(VirtualSlotReference slot,
                Map<VirtualSlotReference, Expression> context) {
            return context.get(slot);
        }
    }
}
