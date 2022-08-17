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

package org.apache.doris.nereids.util;

import org.apache.doris.nereids.trees.expressions.SlotReference;
import org.apache.doris.nereids.trees.plans.Plan;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Utils for Nereids.
 */
public class Utils {
    /**
     * Quoted string if it contains special character or all characters are digit.
     *
     * @param part string to be quoted
     * @return quoted string
     */
    public static String quoteIfNeeded(String part) {
        // We quote strings except the ones which consist of digits only.
        return part.matches("\\w*[\\w&&[^\\d]]+\\w*")
                ? part : part.replace("`", "``");
    }

    /**
     * Helper function to eliminate unnecessary checked exception caught requirement from the main logic of translator.
     *
     * @param f function which would invoke the logic of
     *        stale code from old optimizer that could throw
     *        a checked exception
     */
    public static void execWithUncheckedException(FuncWrapper f) {
        try {
            f.exec();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /**
     * Helper function to eliminate unnecessary checked exception caught requirement from the main logic of translator.
     */
    @SuppressWarnings("unchecked")
    public static <R> R execWithReturnVal(Supplier<R> f) {
        final Object[] ans = new Object[] {null};
        try {
            ans[0] = f.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return (R) ans[0];
    }

    /**
     * Wrapper to a function without return value.
     */
    public interface FuncWrapper {
        void exec() throws Exception;
    }

    /**
     * Wrapper to a funciton with return value.
     */
    public interface Supplier<R> {
        R get() throws Exception;
    }

    /**
     * Fully qualified identifier name parts, i.e., concat qualifier and name into a list.
     */
    public static List<String> qualifiedNameParts(List<String> qualifier, String name) {
        return new ImmutableList.Builder<String>().addAll(qualifier).add(name).build();
    }

    /**
     * Fully qualified identifier name, concat qualifier and name with `.` as separator.
     */
    public static String qualifiedName(List<String> qualifier, String name) {
        return StringUtils.join(qualifiedNameParts(qualifier, name), ".");
    }


    /**
     * equals for List but ignore order.
     */
    public static <E> boolean equalsIgnoreOrder(List<E> one, List<E> other) {
        if (one.size() != other.size()) {
            return false;
        }
        return new HashSet<>(one).containsAll(other) && new HashSet<>(other).containsAll(one);
    }

    /**
     * Get SlotReference from output of plam.
     * Warning, plan must have bound, because exists Slot Cast to SlotReference.
     */
    public static List<SlotReference> getOutputSlotReference(Plan plan) {
        return plan.getOutput().stream().map(SlotReference.class::cast)
                .collect(Collectors.toList());
    }

    public static <T1, T2, R> Function<T2, R> currying(BiFunction<T1, T2, R> func, T1 t1) {
        return (T2 t2) -> func.apply(t1, t2);
    }
}
