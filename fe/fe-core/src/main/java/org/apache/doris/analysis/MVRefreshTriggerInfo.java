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

package org.apache.doris.analysis;

import org.apache.doris.analysis.MVRefreshInfo.RefreshTrigger;
import org.apache.doris.common.AnalysisException;
import org.apache.doris.common.UserException;

public class MVRefreshTriggerInfo {
    private RefreshTrigger refreshTrigger;
    private MVRefreshIntervalTriggerInfo intervalTrigger;

    public MVRefreshTriggerInfo(MVRefreshIntervalTriggerInfo trigger) {
        this.intervalTrigger = trigger;
        this.refreshTrigger = RefreshTrigger.INTERVAL;
    }

    public MVRefreshTriggerInfo(RefreshTrigger trigger) {
        this.intervalTrigger = null;
        this.refreshTrigger = trigger;
    }

    void analyze(Analyzer analyzer) throws UserException {
        if (refreshTrigger == RefreshTrigger.INTERVAL && (intervalTrigger == null || (
                intervalTrigger.getStartTime() == null && intervalTrigger.getInterval() < 0))) {
            throw new AnalysisException("Start time or interval is required.");
        } else if (refreshTrigger == null) {
            throw new AnalysisException("refresh trigger is required.");
        }
    }


    public RefreshTrigger getRefreshTrigger() {
        return refreshTrigger;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (refreshTrigger != RefreshTrigger.INTERVAL) {
            sb.append(" ON ");
            sb.append(refreshTrigger.toString());
        } else {
            sb.append(intervalTrigger.toString());
        }
        return sb.toString();
    }
}
