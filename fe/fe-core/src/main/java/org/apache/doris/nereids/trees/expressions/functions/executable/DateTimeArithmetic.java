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

package org.apache.doris.nereids.trees.expressions.functions.executable;

import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.trees.expressions.ExecFunction;
import org.apache.doris.nereids.trees.expressions.literal.DateLiteral;
import org.apache.doris.nereids.trees.expressions.literal.DateTimeLiteral;
import org.apache.doris.nereids.trees.expressions.literal.DateTimeV2Literal;
import org.apache.doris.nereids.trees.expressions.literal.DateV2Literal;
import org.apache.doris.nereids.trees.expressions.literal.IntegerLiteral;

/**
 * executable function:
 * date_add/sub, years/months/days/hours/minutes/seconds_add/sub
 */
public class DateTimeArithmetic {
    /**
     * datetime arithmetic function date-add.
     */
    @ExecFunction(name = "date_add", argTypes = {"DATE", "INT"}, returnType = "DATE")
    public static DateLiteral dateAdd(DateLiteral date, IntegerLiteral day) throws AnalysisException {
        return daysAdd(date, day);
    }

    @ExecFunction(name = "date_add", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral dateAdd(DateTimeLiteral date, IntegerLiteral day) throws AnalysisException {
        return daysAdd(date, day);
    }

    @ExecFunction(name = "date_add", argTypes = {"DATEV2", "INT"}, returnType = "DATEV2")
    public static DateV2Literal dateAdd(DateV2Literal date, IntegerLiteral day) throws AnalysisException {
        return daysAdd(date, day);
    }

    @ExecFunction(name = "date_add", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal dateAdd(DateTimeV2Literal date, IntegerLiteral day) throws AnalysisException {
        return daysAdd(date, day);
    }

    /**
     * datetime arithmetic function date-sub.
     */
    @ExecFunction(name = "date_sub", argTypes = {"DATE", "INT"}, returnType = "DATE")
    public static DateLiteral dateSub(DateLiteral date, IntegerLiteral day) throws AnalysisException {
        return dateAdd(date, new IntegerLiteral(-day.getValue()));
    }

    @ExecFunction(name = "date_sub", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral dateSub(DateTimeLiteral date, IntegerLiteral day) throws AnalysisException {
        return dateAdd(date, new IntegerLiteral(-day.getValue()));
    }

    @ExecFunction(name = "date_sub", argTypes = {"DATEV2", "INT"}, returnType = "DATEV2")
    public static DateV2Literal dateSub(DateV2Literal date, IntegerLiteral day) throws AnalysisException {
        return dateAdd(date, new IntegerLiteral(-day.getValue()));
    }

    @ExecFunction(name = "date_sub", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal dateSub(DateTimeV2Literal date, IntegerLiteral day) throws AnalysisException {
        return dateAdd(date, new IntegerLiteral(-day.getValue()));
    }

    /**
     * datetime arithmetic function years-add.
     */
    @ExecFunction(name = "years_add", argTypes = {"DATE", "INT"}, returnType = "DATE")
    public static DateLiteral yearsAdd(DateLiteral date, IntegerLiteral year) throws AnalysisException {
        return date.plusYears(year.getValue());
    }

    @ExecFunction(name = "years_add", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral yearsAdd(DateTimeLiteral date, IntegerLiteral year) throws AnalysisException {
        return date.plusYears(year.getValue());
    }

    @ExecFunction(name = "years_add", argTypes = {"DATEV2", "INT"}, returnType = "DATEV2")
    public static DateV2Literal yearsAdd(DateV2Literal date, IntegerLiteral year) throws AnalysisException {
        return date.plusYears(year.getValue());
    }

    @ExecFunction(name = "years_add", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal yearsAdd(DateTimeV2Literal date, IntegerLiteral year) throws AnalysisException {
        return date.plusYears(year.getValue());
    }

    /**
     * datetime arithmetic function months-add.
     */
    @ExecFunction(name = "months_add", argTypes = {"DATE", "INT"}, returnType = "DATE")
    public static DateLiteral monthsAdd(DateLiteral date, IntegerLiteral month) throws AnalysisException {
        return date.plusMonths(month.getValue());
    }

    @ExecFunction(name = "months_add", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral monthsAdd(DateTimeLiteral date, IntegerLiteral month) throws AnalysisException {
        return date.plusMonths(month.getValue());
    }

    @ExecFunction(name = "months_add", argTypes = {"DATEV2", "INT"}, returnType = "DATEV2")
    public static DateV2Literal monthsAdd(DateV2Literal date, IntegerLiteral month) throws AnalysisException {
        return date.plusMonths(month.getValue());
    }

    @ExecFunction(name = "months_add", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal monthsAdd(DateTimeV2Literal date, IntegerLiteral month) throws AnalysisException {
        return date.plusMonths(month.getValue());
    }

    /**
     * datetime arithmetic function days-add.
     */
    @ExecFunction(name = "days_add", argTypes = {"DATE", "INT"}, returnType = "DATE")
    public static DateLiteral daysAdd(DateLiteral date, IntegerLiteral day) throws AnalysisException {
        return date.plusDays(day.getValue());
    }

    @ExecFunction(name = "days_add", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral daysAdd(DateTimeLiteral date, IntegerLiteral day) throws AnalysisException {
        return date.plusDays(day.getValue());
    }

    @ExecFunction(name = "days_add", argTypes = {"DATEV2", "INT"}, returnType = "DATEV2")
    public static DateV2Literal daysAdd(DateV2Literal date, IntegerLiteral day) throws AnalysisException {
        return date.plusDays(day.getValue());
    }

    @ExecFunction(name = "days_add", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal daysAdd(DateTimeV2Literal date, IntegerLiteral day) throws AnalysisException {
        return date.plusDays(day.getValue());
    }

    /**
     * datetime arithmetic function hours-add.
     */
    @ExecFunction(name = "hours_add", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral hoursAdd(DateTimeLiteral date, IntegerLiteral hour) throws AnalysisException {
        return date.plusHours(hour.getValue());
    }

    @ExecFunction(name = "hours_add", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal hoursAdd(DateTimeV2Literal date, IntegerLiteral hour) throws AnalysisException {
        return date.plusHours(hour.getValue());
    }

    /**
     * datetime arithmetic function minutes-add.
     */
    @ExecFunction(name = "minutes_add", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral minutesAdd(DateTimeLiteral date, IntegerLiteral minute) throws AnalysisException {
        return date.plusMinutes(minute.getValue());
    }

    @ExecFunction(name = "minutes_add", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal minutesAdd(DateTimeV2Literal date, IntegerLiteral minute) throws AnalysisException {
        return date.plusMinutes(minute.getValue());
    }

    /**
     * datetime arithmetic function seconds-add.
     */
    @ExecFunction(name = "seconds_add", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral secondsAdd(DateTimeLiteral date, IntegerLiteral second) throws AnalysisException {
        return date.plusSeconds(second.getValue());
    }

    @ExecFunction(name = "seconds_add", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal secondsAdd(DateTimeV2Literal date, IntegerLiteral second) throws AnalysisException {
        return date.plusSeconds(second.getValue());
    }

    /**
     * datetime arithmetic function years-sub.
     */
    @ExecFunction(name = "years_sub", argTypes = {"DATE", "INT"}, returnType = "DATE")
    public static DateLiteral yearsSub(DateLiteral date, IntegerLiteral year) throws AnalysisException {
        return yearsAdd(date, new IntegerLiteral(-year.getValue()));
    }

    @ExecFunction(name = "years_sub", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral yearsSub(DateTimeLiteral date, IntegerLiteral year) throws AnalysisException {
        return yearsAdd(date, new IntegerLiteral(-year.getValue()));
    }

    @ExecFunction(name = "years_sub", argTypes = {"DATEV2", "INT"}, returnType = "DATEV2")
    public static DateV2Literal yearsSub(DateV2Literal date, IntegerLiteral year) throws AnalysisException {
        return yearsAdd(date, new IntegerLiteral(-year.getValue()));
    }

    @ExecFunction(name = "years_sub", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal yearsSub(DateTimeV2Literal date, IntegerLiteral year) throws AnalysisException {
        return yearsAdd(date, new IntegerLiteral(-year.getValue()));
    }

    /**
     * datetime arithmetic function months-sub
     */
    @ExecFunction(name = "months_sub", argTypes = {"DATE", "INT"}, returnType = "DATE")
    public static DateLiteral monthsSub(DateLiteral date, IntegerLiteral month) throws AnalysisException {
        return monthsAdd(date, new IntegerLiteral(-month.getValue()));
    }

    @ExecFunction(name = "months_sub", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral monthsSub(DateTimeLiteral date, IntegerLiteral month) throws AnalysisException {
        return monthsAdd(date, new IntegerLiteral(-month.getValue()));
    }

    @ExecFunction(name = "months_sub", argTypes = {"DATEV2", "INT"}, returnType = "DATEV2")
    public static DateV2Literal monthsSub(DateV2Literal date, IntegerLiteral month) throws AnalysisException {
        return monthsAdd(date, new IntegerLiteral(-month.getValue()));
    }

    @ExecFunction(name = "months_sub", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal monthsSub(DateTimeV2Literal date, IntegerLiteral month) throws AnalysisException {
        return monthsAdd(date, new IntegerLiteral(-month.getValue()));
    }

    /**
     * datetime arithmetic function days-sub
     */
    @ExecFunction(name = "days_sub", argTypes = {"DATE", "INT"}, returnType = "DATE")
    public static DateLiteral daysSub(DateLiteral date, IntegerLiteral day) throws AnalysisException {
        return daysAdd(date, new IntegerLiteral(-day.getValue()));
    }

    @ExecFunction(name = "days_sub", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral daysSub(DateTimeLiteral date, IntegerLiteral day) throws AnalysisException {
        return daysAdd(date, new IntegerLiteral(-day.getValue()));
    }

    @ExecFunction(name = "days_sub", argTypes = {"DATEV2", "INT"}, returnType = "DATEV2")
    public static DateV2Literal daysSub(DateV2Literal date, IntegerLiteral day) throws AnalysisException {
        return daysAdd(date, new IntegerLiteral(-day.getValue()));
    }

    @ExecFunction(name = "days_sub", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal daysSub(DateTimeV2Literal date, IntegerLiteral day) throws AnalysisException {
        return daysAdd(date, new IntegerLiteral(-day.getValue()));
    }

    /**
     * datetime arithmetic function hours-sub
     */
    @ExecFunction(name = "hours_sub", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral hoursSub(DateTimeLiteral date, IntegerLiteral hour) throws AnalysisException {
        return hoursAdd(date, new IntegerLiteral(-hour.getValue()));
    }

    @ExecFunction(name = "hours_sub", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal hoursSub(DateTimeV2Literal date, IntegerLiteral hour) throws AnalysisException {
        return hoursAdd(date, new IntegerLiteral(-hour.getValue()));
    }

    /**
     * datetime arithmetic function minutes-sub
     */
    @ExecFunction(name = "minutes_sub", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral minutesSub(DateTimeLiteral date, IntegerLiteral minute) throws AnalysisException {
        return minutesAdd(date, new IntegerLiteral(-minute.getValue()));
    }

    @ExecFunction(name = "minutes_sub", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal minutesSub(DateTimeV2Literal date, IntegerLiteral minute) throws AnalysisException {
        return minutesAdd(date, new IntegerLiteral(-minute.getValue()));
    }

    /**
     * datetime arithmetic function seconds-sub
     */
    @ExecFunction(name = "seconds_sub", argTypes = {"DATETIME", "INT"}, returnType = "DATETIME")
    public static DateTimeLiteral secondsSub(DateTimeLiteral date, IntegerLiteral second) throws AnalysisException {
        return secondsAdd(date, new IntegerLiteral(-second.getValue()));
    }

    @ExecFunction(name = "seconds_sub", argTypes = {"DATETIMEV2", "INT"}, returnType = "DATETIMEV2")
    public static DateTimeV2Literal secondsSub(DateTimeV2Literal date, IntegerLiteral second) throws AnalysisException {
        return secondsAdd(date, new IntegerLiteral(-second.getValue()));
    }
}
