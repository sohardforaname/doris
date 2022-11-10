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

package org.apache.doris.nereids.metrics;

import org.apache.doris.nereids.metrics.event.CounterEvent;
import org.apache.doris.nereids.metrics.event.EnforcerEvent;
import org.apache.doris.nereids.metrics.event.GroupMergeEvent;
import org.apache.doris.nereids.metrics.event.MemoTransformEvent;
import org.apache.doris.nereids.metrics.event.StatsStateEvent;
import org.apache.doris.nereids.metrics.event.TransformEvent;
import org.apache.doris.nereids.rules.RuleType;
import org.apache.doris.utframe.TestWithFeService;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class EventTest extends TestWithFeService {
    private EventChannel channel;
    private List<EventProducer> producers;
    private final List<Event> events = ImmutableList.of(
            new CounterEvent(0, CounterType.PLAN_CONSTRUCTOR, null, null, null),
            new TransformEvent(null, null, ImmutableList.of(), RuleType.AGGREGATE_DISASSEMBLE),
            new EnforcerEvent(null, null, null, null),
            new GroupMergeEvent(null, null, null),
            new MemoTransformEvent(0, 1, null),
            new StatsStateEvent(null, null)
    );

    private final StringBuilder builder = new StringBuilder();
    private final PrintStream printStream = new PrintStream(new OutputStream() {
        @Override
        public void write(int b) {
            builder.append((char) b);
        }
    });

    @Override
    public void runBeforeAll() {
        connectContext.getSessionVariable().setEnableNereidsEvent(true);
        connectContext.getSessionVariable().setNereidsEventMode("counter, transform");
        channel = new EventChannel(
                ImmutableList.of(
                        new PrintConsumer(CounterEvent.class, printStream),
                        new PrintConsumer(TransformEvent.class, printStream),
                        new PrintConsumer(EnforcerEvent.class, printStream),
                        new PrintConsumer(GroupMergeEvent.class, printStream),
                        new PrintConsumer(MemoTransformEvent.class, printStream)),
                ImmutableList.of()
        );
        channel.start();
        producers = ImmutableList.of(
                new EventProducer(TransformEvent.class, ImmutableList.of(
                        new EventFilter(CounterEvent.class),
                        new EventFilter(CounterEvent.class)),
                        channel),
                new EventProducer(CounterEvent.class, ImmutableList.of(
                        new EventFilter(TransformEvent.class) {
                            @Override
                            public Event checkEvent(Event event) {
                                return ((TransformEvent) event).getGroupExpression() == null ? null : event;
                            }
                        }), channel)
        );
    }

    @Override
    public void runAfterAll() {
        channel.stop();
        Assertions.assertEquals(
                "TransformEvent{groupExpression=null, before=null, afters=[], ruleType=AGGREGATE_DISASSEMBLE}\n"
                        + "CounterEvent{count=0, counterType=PLAN_CONSTRUCTOR, group=null, groupExpression=null, plan=null}\n"
                        + "TransformEvent{groupExpression=null, before=null, afters=[], ruleType=AGGREGATE_DISASSEMBLE}\n"
                        + "CounterEvent{count=0, counterType=PLAN_CONSTRUCTOR, group=null, groupExpression=null, plan=null}\n"
                        + "TransformEvent{groupExpression=null, before=null, afters=[], ruleType=AGGREGATE_DISASSEMBLE}\n"
                        + "CounterEvent{count=0, counterType=PLAN_CONSTRUCTOR, group=null, groupExpression=null, plan=null}\n"
                        + "TransformEvent{groupExpression=null, before=null, afters=[], ruleType=AGGREGATE_DISASSEMBLE}\n"
                        + "CounterEvent{count=0, counterType=PLAN_CONSTRUCTOR, group=null, groupExpression=null, plan=null}\n"
                        + "TransformEvent{groupExpression=null, before=null, afters=[], ruleType=AGGREGATE_DISASSEMBLE}\n"
                        + "CounterEvent{count=0, counterType=PLAN_CONSTRUCTOR, group=null, groupExpression=null, plan=null}\n",
                builder.toString());
    }

    @Test
    public void testEvent() {
        for (int i = 0; i < 10; ++i) {
            producers.get(i % 2).log(events.get((i + 1) % 2));
        }
    }
}
