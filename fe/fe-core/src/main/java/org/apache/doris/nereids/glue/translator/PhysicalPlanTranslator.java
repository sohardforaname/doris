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

package org.apache.doris.nereids.glue.translator;

import org.apache.doris.analysis.AggregateInfo;
import org.apache.doris.analysis.BaseTableRef;
import org.apache.doris.analysis.Expr;
import org.apache.doris.analysis.FunctionCallExpr;
import org.apache.doris.analysis.SlotRef;
import org.apache.doris.analysis.SortInfo;
import org.apache.doris.analysis.TableName;
import org.apache.doris.analysis.TableRef;
import org.apache.doris.analysis.TupleDescriptor;
import org.apache.doris.catalog.OlapTable;
import org.apache.doris.catalog.Table;
import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.operators.plans.AggPhase;
import org.apache.doris.nereids.operators.plans.JoinType;
import org.apache.doris.nereids.operators.plans.physical.PhysicalAggregate;
import org.apache.doris.nereids.operators.plans.physical.PhysicalFilter;
import org.apache.doris.nereids.operators.plans.physical.PhysicalHashJoin;
import org.apache.doris.nereids.operators.plans.physical.PhysicalHeapSort;
import org.apache.doris.nereids.operators.plans.physical.PhysicalOlapScan;
import org.apache.doris.nereids.operators.plans.physical.PhysicalOperator;
import org.apache.doris.nereids.operators.plans.physical.PhysicalProject;
import org.apache.doris.nereids.properties.OrderKey;
import org.apache.doris.nereids.trees.expressions.EqualTo;
import org.apache.doris.nereids.trees.expressions.ExprId;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.NamedExpression;
import org.apache.doris.nereids.trees.expressions.Slot;
import org.apache.doris.nereids.trees.expressions.SlotReference;
import org.apache.doris.nereids.trees.expressions.functions.AggregateFunction;
import org.apache.doris.nereids.trees.expressions.visitor.SlotExtractor;
import org.apache.doris.nereids.trees.plans.Plan;
import org.apache.doris.nereids.trees.plans.PlanOperatorVisitor;
import org.apache.doris.nereids.trees.plans.physical.PhysicalBinaryPlan;
import org.apache.doris.nereids.trees.plans.physical.PhysicalLeafPlan;
import org.apache.doris.nereids.trees.plans.physical.PhysicalPlan;
import org.apache.doris.nereids.trees.plans.physical.PhysicalUnaryPlan;
import org.apache.doris.nereids.util.ExpressionUtils;
import org.apache.doris.planner.AggregationNode;
import org.apache.doris.planner.DataPartition;
import org.apache.doris.planner.ExchangeNode;
import org.apache.doris.planner.HashJoinNode;
import org.apache.doris.planner.HashJoinNode.DistributionMode;
import org.apache.doris.planner.OlapScanNode;
import org.apache.doris.planner.PlanFragment;
import org.apache.doris.planner.PlanNode;
import org.apache.doris.planner.SortNode;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Used to translate to physical plan generated by new optimizer to the plan fragments.
 *
 * <STRONG>
 *     ATTENTION:
 *      Must always visit plan's children first when you implement a method to translate from PhysicalPlan to PlanNode.
 * </STRONG>
 */
public class PhysicalPlanTranslator extends PlanOperatorVisitor<PlanFragment, PlanTranslatorContext> {
    /**
     * The left and right child of origin predicates need to be swap sometimes.
     * Case A:
     * select * from t1 join t2 on t2.id=t1.id
     * The left plan node is t1 and the right plan node is t2.
     * The left child of origin predicate is t2.id and the right child of origin predicate is t1.id.
     * In this situation, the children of predicate need to be swap => t1.id=t2.id.
     */
    private static Expression swapEqualToForChildrenOrder(EqualTo equalTo, List<Slot> leftOutput) {
        Set<ExprId> leftSlots = SlotExtractor.extractSlot(equalTo.left()).stream()
                .map(NamedExpression::getExprId).collect(Collectors.toSet());
        if (leftOutput.stream().map(NamedExpression::getExprId).collect(Collectors.toSet()).containsAll(leftSlots)) {
            return equalTo;
        } else {
            return new EqualTo(equalTo.right(), equalTo.left());
        }
    }

    /**
     * Translate Nereids Physical Plan tree to Stale Planner PlanFragment tree.
     *
     * @param physicalPlan Nereids Physical Plan tree
     * @param context context to help translate
     * @return Stale Planner PlanFragment tree
     */
    public PlanFragment translatePlan(PhysicalPlan physicalPlan, PlanTranslatorContext context) {
        PlanFragment rootFragment = visit(physicalPlan, context);
        if (rootFragment.isPartitioned() && rootFragment.getPlanRoot().getNumInstances() > 1) {
            rootFragment = exchangeToMergeFragment(rootFragment, context);
        }
        List<Expr> outputExprs = Lists.newArrayList();
        physicalPlan.getOutput().stream().map(Slot::getExprId)
                .forEach(exprId -> outputExprs.add(context.findSlotRef(exprId)));
        rootFragment.setOutputExprs(outputExprs);
        rootFragment.getPlanRoot().convertToVectoriezd();
        for (PlanFragment fragment : context.getPlanFragmentList()) {
            fragment.finalize(null);
        }
        Collections.reverse(context.getPlanFragmentList());
        return rootFragment;
    }

    @Override
    public PlanFragment visit(Plan plan, PlanTranslatorContext context) {
        PhysicalOperator operator = (PhysicalOperator) plan.getOperator();
        return operator.accept(this, plan, context);
    }

    /**
     * Translate Agg.
     * todo: support DISTINCT
     */
    @Override
    public PlanFragment visitPhysicalAggregate(
            PhysicalUnaryPlan<PhysicalAggregate, Plan> aggregate, PlanTranslatorContext context) {
        PlanFragment inputPlanFragment = visit(aggregate.child(0), context);
        PhysicalAggregate physicalAggregate = aggregate.getOperator();

        // TODO: stale planner generate aggregate tuple in a special way. tuple include 2 parts:
        //    1. group by expressions: removing duplicate expressions add to tuple
        //    2. agg functions: only removing duplicate agg functions in output expression should appear in tuple.
        //       e.g. select sum(v1) + 1, sum(v1) + 2 from t1 should only generate one sum(v1) in tuple
        //    We need:
        //    1. add a project after agg, if agg function is not the top output expression.
        //    2. introduce canonicalized, semanticEquals and deterministic in Expression
        //       for removing duplicate.
        List<Expression> groupByExpressionList = physicalAggregate.getGroupByExprList();
        List<NamedExpression> outputExpressionList = physicalAggregate.getOutputExpressionList();

        // 1. generate slot reference for each group expression
        List<SlotReference> groupSlotList = Lists.newArrayList();
        for (Expression e : groupByExpressionList) {
            if (e instanceof SlotReference && outputExpressionList.stream().anyMatch(o -> o.anyMatch(e::equals))) {
                groupSlotList.add((SlotReference) e);
            } else {
                groupSlotList.add(new SlotReference(e.toSql(), e.getDataType(), e.nullable(), Collections.emptyList()));
            }
        }
        ArrayList<Expr> execGroupingExpressions = groupByExpressionList.stream()
                .map(e -> ExpressionTranslator.translate(e, context)).collect(Collectors.toCollection(ArrayList::new));
        // 2. collect agg functions and generate agg function to slot reference map
        List<Slot> aggFunctionOutput = Lists.newArrayList();
        List<AggregateFunction> aggregateFunctionList = outputExpressionList.stream()
                .filter(o -> o.anyMatch(AggregateFunction.class::isInstance))
                .peek(o -> aggFunctionOutput.add(o.toSlot()))
                .map(o -> o.<List<AggregateFunction>>collect(AggregateFunction.class::isInstance))
                .flatMap(List::stream)
                .collect(Collectors.toList());
        ArrayList<FunctionCallExpr> execAggregateFunctions = aggregateFunctionList.stream()
                .map(x -> (FunctionCallExpr) ExpressionTranslator.translate(x, context))
                .collect(Collectors.toCollection(ArrayList::new));

        // 3. generate output tuple
        // TODO: currently, we only support sum(a), if we want to support sum(a) + 1, we need to
        //  split merge agg to project(agg) and generate tuple like what first phase agg do.
        List<Slot> slotList = Lists.newArrayList();
        TupleDescriptor outputTupleDesc;
        if (physicalAggregate.getAggPhase() == AggPhase.GLOBAL) {
            slotList.addAll(groupSlotList);
            slotList.addAll(aggFunctionOutput);
            outputTupleDesc = generateTupleDesc(slotList, null, context);
        } else {
            outputTupleDesc = generateTupleDesc(aggregate.getOutput(), null, context);
        }

        // process partition list
        List<Expression> partitionExpressionList = physicalAggregate.getPartitionExprList();
        List<Expr> execPartitionExpressions = partitionExpressionList.stream()
                .map(e -> ExpressionTranslator.translate(e, context)).collect(Collectors.toList());
        DataPartition mergePartition = DataPartition.UNPARTITIONED;
        if (CollectionUtils.isNotEmpty(execPartitionExpressions)) {
            mergePartition = DataPartition.hashPartitioned(execGroupingExpressions);
        }

        if (physicalAggregate.getAggPhase() == AggPhase.GLOBAL) {
            for (FunctionCallExpr execAggregateFunction : execAggregateFunctions) {
                execAggregateFunction.setMergeForNereids(true);
            }
        }
        AggregateInfo aggInfo = AggregateInfo.create(execGroupingExpressions, execAggregateFunctions, outputTupleDesc,
                outputTupleDesc, physicalAggregate.getAggPhase().toExec());
        AggregationNode aggregationNode = new AggregationNode(context.nextPlanNodeId(),
                inputPlanFragment.getPlanRoot(), aggInfo);
        inputPlanFragment.setPlanRoot(aggregationNode);
        switch (physicalAggregate.getAggPhase()) {
            case LOCAL:
                aggregationNode.unsetNeedsFinalize();
                aggregationNode.setUseStreamingPreagg(physicalAggregate.isUsingStream());
                aggregationNode.setIntermediateTuple();
                return createParentFragment(inputPlanFragment, mergePartition, context);
            case GLOBAL:
                inputPlanFragment.updateDataPartition(mergePartition);
                return inputPlanFragment;
            default:
                throw new RuntimeException("Unsupported yet");
        }
    }

    @Override
    public PlanFragment visitPhysicalOlapScan(
            PhysicalLeafPlan<PhysicalOlapScan> olapScan, PlanTranslatorContext context) {
        // Create OlapScanNode
        List<Slot> slotList = olapScan.getOutput();
        PhysicalOlapScan physicalOlapScan = olapScan.getOperator();
        OlapTable olapTable = physicalOlapScan.getTable();
        List<Expr> execConjunctsList = physicalOlapScan
                .getExpressions()
                .stream()
                .map(e -> ExpressionTranslator.translate(e, context)).collect(Collectors.toList());
        TupleDescriptor tupleDescriptor = generateTupleDesc(slotList, olapTable, context);
        tupleDescriptor.setTable(olapTable);
        OlapScanNode olapScanNode = new OlapScanNode(context.nextPlanNodeId(), tupleDescriptor, olapTable.getName());
        // TODO: Do we really need tableName here?
        TableName tableName = new TableName(null, "", "");
        TableRef ref = new TableRef(tableName, null, null);
        BaseTableRef tableRef = new BaseTableRef(ref, olapTable, tableName);
        tupleDescriptor.setRef(tableRef);
        olapScanNode.setSelectedPartitionIds(physicalOlapScan.getSelectedPartitionId());
        try {
            olapScanNode.updateScanRangeInfoByNewMVSelector(physicalOlapScan.getSelectedIndexId(), false, "");
        } catch (Exception e) {
            throw new AnalysisException(e.getMessage());
        }
        exec(olapScanNode::init);
        olapScanNode.addConjuncts(execConjunctsList);
        context.addScanNode(olapScanNode);
        // Create PlanFragment
        // TODO: add data partition after we have physical properties
        PlanFragment planFragment = new PlanFragment(context.nextFragmentId(), olapScanNode, DataPartition.RANDOM);
        context.addPlanFragment(planFragment);
        return planFragment;
    }

    /**
     * Physical sort:
     * 1. Build sortInfo
     *    There are two types of slotRef:
     *    one is generated by the previous node, collectively called old.
     *    the other is newly generated by the sort node, collectively called new.
     *    Filling of sortInfo related data structures,
     *    a. ordering use newSlotRef.
     *    b. sortTupleSlotExprs use oldSlotRef.
     * 2. Create sortNode
     * 3. Create mergeFragment
     * TODO: When the slotRef of sort is currently generated,
     *       it will be based on the expression in select and orderBy expression in to ensure the uniqueness of slotRef.
     *       But eg:
     *       select a+1 from table order by a+1;
     *       the expressions of the two are inconsistent.
     *       The former will perform an additional Alias.
     *       Currently we cannot test whether this will have any effect.
     *       After a+1 can be parsed , reprocessing.
     */
    @Override
    public PlanFragment visitPhysicalHeapSort(PhysicalUnaryPlan<PhysicalHeapSort, Plan> sort,
            PlanTranslatorContext context) {
        PlanFragment childFragment = visit(sort.child(0), context);
        PhysicalHeapSort physicalHeapSort = sort.getOperator();
        long limit = physicalHeapSort.getLimit();
        // TODO: need to discuss how to process field: SortNode::resolvedTupleExprs
        List<Expr> oldOrderingExprList = Lists.newArrayList();
        List<Boolean> ascOrderList = Lists.newArrayList();
        List<Boolean> nullsFirstParamList = Lists.newArrayList();
        List<OrderKey> orderKeyList = physicalHeapSort.getOrderKeys();
        // 1.Get previous slotRef
        orderKeyList.forEach(k -> {
            oldOrderingExprList.add(ExpressionTranslator.translate(k.getExpr(), context));
            ascOrderList.add(k.isAsc());
            nullsFirstParamList.add(k.isNullFirst());
        });
        List<Expr> sortTupleOutputList = new ArrayList<>();
        List<Slot> outputList = sort.getOutput();
        outputList.forEach(k -> {
            sortTupleOutputList.add(ExpressionTranslator.translate(k, context));
        });
        // 2. Generate new Tuple
        TupleDescriptor tupleDesc = generateTupleDesc(outputList, orderKeyList, context, null);
        // 3. Get current slotRef
        List<Expr> newOrderingExprList = Lists.newArrayList();
        orderKeyList.forEach(k -> {
            newOrderingExprList.add(ExpressionTranslator.translate(k.getExpr(), context));
        });
        // 4. fill in SortInfo members
        SortInfo sortInfo = new SortInfo(newOrderingExprList, ascOrderList, nullsFirstParamList, tupleDesc);
        PlanNode childNode = childFragment.getPlanRoot();
        // TODO: notice topN
        SortNode sortNode = new SortNode(context.nextPlanNodeId(), childNode, sortInfo, true,
                physicalHeapSort.hasLimit(), physicalHeapSort.getOffset());
        sortNode.finalizeForNereids(tupleDesc, sortTupleOutputList, oldOrderingExprList);
        childFragment.addPlanRoot(sortNode);
        if (!childFragment.isPartitioned()) {
            return childFragment;
        }
        PlanFragment mergeFragment = createParentFragment(childFragment, DataPartition.UNPARTITIONED, context);
        ExchangeNode exchangeNode = (ExchangeNode) mergeFragment.getPlanRoot();
        exchangeNode.unsetLimit();
        if (physicalHeapSort.hasLimit()) {
            exchangeNode.setLimit(limit);
        }
        long offset = physicalHeapSort.getOffset();
        exchangeNode.setMergeInfo(sortNode.getSortInfo(), offset);

        // Child nodes should not process the offset. If there is a limit,
        // the child nodes need only return (offset + limit) rows.
        SortNode childSortNode = (SortNode) childFragment.getPlanRoot();
        Preconditions.checkState(sortNode == childSortNode);
        if (sortNode.hasLimit()) {
            childSortNode.unsetLimit();
            childSortNode.setLimit(limit + offset);
        }
        childSortNode.setOffset(0);
        context.addPlanFragment(mergeFragment);
        return mergeFragment;
    }

    // TODO: 1. support shuffle join / co-locate / bucket shuffle join later
    //       2. For ssb, there are only binary equal predicate, we shall support more in the future.
    @Override
    public PlanFragment visitPhysicalHashJoin(
            PhysicalBinaryPlan<PhysicalHashJoin, Plan, Plan> hashJoin, PlanTranslatorContext context) {
        // NOTICE: We must visit from right to left, to ensure the last fragment is root fragment
        PlanFragment rightFragment = visit(hashJoin.child(1), context);
        PlanFragment leftFragment = visit(hashJoin.child(0), context);
        PlanNode leftFragmentPlanRoot = leftFragment.getPlanRoot();
        PlanNode rightFragmentPlanRoot = rightFragment.getPlanRoot();
        PhysicalHashJoin physicalHashJoin = hashJoin.getOperator();
        JoinType joinType = physicalHashJoin.getJoinType();

        if (joinType.equals(JoinType.CROSS_JOIN)
                || physicalHashJoin.getJoinType().equals(JoinType.INNER_JOIN)
                && !physicalHashJoin.getCondition().isPresent()) {
            throw new RuntimeException("Physical hash join could not execute without equal join condition.");
        } else {
            Expression eqJoinExpression = physicalHashJoin.getCondition().get();
            List<Expr> execEqConjunctList = ExpressionUtils.extractConjunct(eqJoinExpression).stream()
                    .map(EqualTo.class::cast)
                    .map(e -> swapEqualToForChildrenOrder(e, hashJoin.left().getOutput()))
                    .map(e -> ExpressionTranslator.translate(e, context))
                    .collect(Collectors.toList());

            HashJoinNode hashJoinNode = new HashJoinNode(context.nextPlanNodeId(), leftFragmentPlanRoot,
                    rightFragmentPlanRoot,
                    JoinType.toJoinOperator(physicalHashJoin.getJoinType()), execEqConjunctList, Lists.newArrayList());

            hashJoinNode.setDistributionMode(DistributionMode.BROADCAST);
            hashJoinNode.setChild(0, leftFragmentPlanRoot);
            connectChildFragment(hashJoinNode, 1, leftFragment, rightFragment, context);
            leftFragment.setPlanRoot(hashJoinNode);
            return leftFragment;
        }
    }

    // TODO: generate expression mapping when be project could do in ExecNode
    @Override
    public PlanFragment visitPhysicalProject(
            PhysicalUnaryPlan<PhysicalProject, Plan> projectPlan, PlanTranslatorContext context) {
        PlanFragment inputFragment = visit(projectPlan.child(0), context);
        PhysicalProject physicalProject = projectPlan.getOperator();
        List<Expr> execExprList = physicalProject.getProjects()
                .stream()
                .map(e -> ExpressionTranslator.translate(e, context))
                .collect(Collectors.toList());
        PlanNode inputPlanNode = inputFragment.getPlanRoot();
        List<Expr> predicateList = inputPlanNode.getConjuncts();
        Set<Integer> requiredSlotIdList = new HashSet<>();
        for (Expr expr : predicateList) {
            extractExecSlot(expr, requiredSlotIdList);
        }
        for (Expr expr : execExprList) {
            if (expr instanceof SlotRef) {
                requiredSlotIdList.add(((SlotRef) expr).getDesc().getId().asInt());
            }
        }
        return inputFragment;
    }

    @Override
    public PlanFragment visitPhysicalFilter(
            PhysicalUnaryPlan<PhysicalFilter, Plan> filterPlan, PlanTranslatorContext context) {
        PlanFragment inputFragment = visit(filterPlan.child(0), context);
        PlanNode planNode = inputFragment.getPlanRoot();
        PhysicalFilter filter = filterPlan.getOperator();
        Expression expression = filter.getPredicates();
        List<Expression> expressionList = ExpressionUtils.extractConjunct(expression);
        expressionList.stream().map(e -> ExpressionTranslator.translate(e, context)).forEach(planNode::addConjunct);
        return inputFragment;
    }

    private void extractExecSlot(Expr root, Set<Integer>  slotRefList) {
        if (root instanceof SlotRef) {
            slotRefList.add(((SlotRef) root).getDesc().getId().asInt());
            return;
        }
        for (Expr child : root.getChildren()) {
            extractExecSlot(child, slotRefList);
        }
    }

    private TupleDescriptor generateTupleDesc(List<Slot> slotList, Table table, PlanTranslatorContext context) {
        TupleDescriptor tupleDescriptor = context.generateTupleDesc();
        tupleDescriptor.setTable(table);
        for (Slot slot : slotList) {
            context.createSlotDesc(tupleDescriptor, (SlotReference) slot);
        }
        return tupleDescriptor;
    }

    private TupleDescriptor generateTupleDesc(List<Slot> slotList, List<OrderKey> orderKeyList,
            PlanTranslatorContext context, Table table) {
        TupleDescriptor tupleDescriptor = context.generateTupleDesc();
        tupleDescriptor.setTable(table);
        Set<ExprId> alreadyExists = Sets.newHashSet();
        for (OrderKey orderKey : orderKeyList) {
            if (orderKey.getExpr() instanceof SlotReference) {
                SlotReference slotReference = (SlotReference) orderKey.getExpr();
                // TODO: trick here, we need semanticEquals to remove redundant expression
                if (alreadyExists.contains(slotReference.getExprId())) {
                    continue;
                }
                context.createSlotDesc(tupleDescriptor, (SlotReference) orderKey.getExpr());
                alreadyExists.add(slotReference.getExprId());
            }
        }
        for (Slot slot : slotList) {
            if (alreadyExists.contains(slot.getExprId())) {
                continue;
            }
            context.createSlotDesc(tupleDescriptor, (SlotReference) slot);
            alreadyExists.add(slot.getExprId());

        }

        return tupleDescriptor;
    }

    private PlanFragment createParentFragment(PlanFragment childFragment, DataPartition parentPartition,
            PlanTranslatorContext context) {
        ExchangeNode exchangeNode = new ExchangeNode(context.nextPlanNodeId(), childFragment.getPlanRoot(), false);
        exchangeNode.setNumInstances(childFragment.getPlanRoot().getNumInstances());
        PlanFragment parentFragment = new PlanFragment(context.nextFragmentId(), exchangeNode, parentPartition);
        childFragment.setDestination(exchangeNode);
        childFragment.setOutputPartition(parentPartition);
        context.addPlanFragment(parentFragment);
        return parentFragment;
    }

    private void connectChildFragment(PlanNode node, int childIdx,
            PlanFragment parentFragment, PlanFragment childFragment,
            PlanTranslatorContext context) {
        ExchangeNode exchangeNode = new ExchangeNode(context.nextPlanNodeId(), childFragment.getPlanRoot(), false);
        exchangeNode.setNumInstances(childFragment.getPlanRoot().getNumInstances());
        exchangeNode.setFragment(parentFragment);
        node.setChild(childIdx, exchangeNode);
        childFragment.setDestination(exchangeNode);
    }

    /**
     * Return unpartitioned fragment that merges the input fragment's output via
     * an ExchangeNode.
     * Requires that input fragment be partitioned.
     */
    private PlanFragment exchangeToMergeFragment(PlanFragment inputFragment, PlanTranslatorContext context) {
        Preconditions.checkState(inputFragment.isPartitioned());

        // exchange node clones the behavior of its input, aside from the conjuncts
        ExchangeNode mergePlan =
                new ExchangeNode(context.nextPlanNodeId(), inputFragment.getPlanRoot(), false);
        mergePlan.setNumInstances(inputFragment.getPlanRoot().getNumInstances());
        PlanFragment fragment = new PlanFragment(context.nextFragmentId(), mergePlan, DataPartition.UNPARTITIONED);
        inputFragment.setDestination(mergePlan);
        context.addPlanFragment(fragment);
        return fragment;
    }

    /**
     * Helper function to eliminate unnecessary checked exception caught requirement from the main logic of translator.
     *
     * @param f function which would invoke the logic of
     *        stale code from old optimizer that could throw
     *        a checked exception
     */
    public void exec(FuncWrapper f) {
        try {
            f.exec();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private interface FuncWrapper {
        void exec() throws Exception;
    }
}
