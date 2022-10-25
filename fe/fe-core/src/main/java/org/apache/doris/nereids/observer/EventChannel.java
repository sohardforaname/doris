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

package org.apache.doris.nereids.observer;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * event channel
 */
public class EventChannel {
    private static final Logger LOG = LogManager.getLogger(EventChannel.class);

    private class EventProperties {
        private final List<EventConsumer> consumers = Lists.newArrayList();
        private final List<EventFilter> filters = Lists.newArrayList();

        public List<EventConsumer> getConsumers() {
            return consumers;
        }

        public List<EventFilter> getFilters() {
            return filters;
        }
    }

    private Map<Class<Event>, Boolean> eventSwitch = Maps.newHashMap();
    private Map<Class<Event>, EventProperties> properties = Maps.newHashMap();
    private BlockingQueue<Event> queue = new LinkedBlockingQueue<>(4096);
    private boolean isStop = false;
    private Thread thread;

    /**
     * constructor
     * @param consumers consumer list
     * @param filters filter list
     */
    public EventChannel(List<EventConsumer> consumers, List<EventFilter> filters) {
        for (EventConsumer consumer : consumers) {
            properties.computeIfAbsent(consumer.getTargetClass(), k -> new EventProperties())
                    .getConsumers().add(consumer);
        }
        for (EventFilter filter : filters) {
            properties.get(filter.getTargetClass()).getFilters().add(filter);
        }
    }

    public void add(Event e) {
        if (filter(e) != null) {
            queue.add(e);
        }
    }

    private Event filter(Event e) {
        if (!eventSwitch.get(e.getClass())) {
            return null;
        }
        for (EventFilter filter : properties.get(e.getClass()).getFilters()) {
            e = filter.checkEvent(e);
            if (e == null) {
                return null;
            }
        }
        return e;
    }

    private class Worker implements Runnable {
        @Override
        public void run() {
            while (!isStop) {
                try {
                    Event e = queue.poll();
                    for (EventConsumer consumer : properties.get(e.getClass()).getConsumers()) {
                        consumer.consume(e.clone());
                    }
                } catch (Exception e) {
                    LOG.warn("encounter exception when push event: ", e);
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
        isStop = true;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                LOG.warn("join worker join failed.", e);
            }
        }
    }
}
