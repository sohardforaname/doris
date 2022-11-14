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

import org.apache.doris.qe.ConnectContext;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * event channel
 */
public class EventChannel {
    private static final Logger LOG = LogManager.getLogger(EventChannel.class);
    private static final EventChannel DEFAULT_CHANNEL = new EventChannel();
    private Set<Class<? extends Event>> eventSwitch = new HashSet<>();
    private final Map<Class<? extends Event>, List<EventConsumer>> consumers = Maps.newHashMap();
    private final Map<Class<? extends Event>, EventEnhancer> enhancers = Maps.newHashMap();
    private final BlockingQueue<Event> queue = new LinkedBlockingQueue<>(4096);
    private final AtomicBoolean isStop = new AtomicBoolean(false);
    private Thread thread;

    public void add(Event e) {
        queue.add(e);
    }

    public EventChannel addConsumers(List<EventConsumer> consumers) {
        consumers.forEach(consumer -> this.consumers
                .computeIfAbsent(consumer.getTargetClass(), k -> Lists.newArrayList()).add(consumer));
        return this;
    }

    public EventChannel addEnhancers(List<EventEnhancer> enhancers) {
        enhancers.forEach(enhancer -> this.enhancers.putIfAbsent(enhancer.getTargetClass(), enhancer));
        return this;
    }

    public EventChannel setConnectContext(ConnectContext context) {
        Preconditions.checkArgument(Objects.nonNull(context));
        if (context.getSessionVariable().isEnableNereidsTrace()) {
            eventSwitch = new EventSwitchParser().parse(context.getSessionVariable().getNereidsEventMode());
        }
        return this;
    }

    public Set<Class<? extends Event>> getEventSwitch() {
        return eventSwitch;
    }

    public static EventChannel getDefaultChannel() {
        return DEFAULT_CHANNEL;
    }

    private class Worker implements Runnable {
        @Override
        public void run() {
            while (!isStop.get() || !queue.isEmpty()) {
                try {
                    Event e = queue.poll();
                    if (e == null) {
                        continue;
                    }
                    for (EventConsumer consumer : consumers.get(e.getClass())) {
                        if (enhancers.containsKey(e.getClass())) {
                            enhancers.get(e.getClass()).enhance(e);
                        }
                        consumer.consume(e.clone());
                    }
                } catch (Exception exception) {
                    LOG.warn("encounter exception when push event: ", exception);
                }
            }
            for (List<EventConsumer> consumerList : consumers.values()) {
                for (EventConsumer consumer : consumerList) {
                    consumer.close();
                }
            }
        }
    }

    public void start() {
        thread = new Thread(new Worker(), "nereids_event");
        thread.setDaemon(true);
        thread.start();
    }

    /**
     * stop channel
     */
    public void stop() {
        isStop.set(true);
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                LOG.warn("join worker join failed.", e);
            }
        }
    }
}
