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

import org.apache.doris.catalog.DatabaseIf;
import org.apache.doris.catalog.Env;
import org.apache.doris.catalog.TableIf;
import org.apache.doris.cluster.ClusterNamespace;
import org.apache.doris.datasource.CatalogIf;
import org.apache.doris.nereids.StatementContext;
import org.apache.doris.nereids.trees.plans.ObjectId;
import org.apache.doris.qe.ConnectContext;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * relation util
 */
public class RelationUtil {

    // for test only
    private static StatementContext statementContext = new StatementContext();

    public static ObjectId newRelationId() {
        // this branch is for test only
        if (ConnectContext.get() == null || ConnectContext.get().getStatementContext() == null) {
            return statementContext.getNextObjectId();
        }
        return ConnectContext.get().getStatementContext().getNextObjectId();
    }

    /**
     *  Reset Id Generator
     */
    @VisibleForTesting
    public static void clear() throws Exception {
        if (ConnectContext.get() != null) {
            ConnectContext.get().setStatementContext(new StatementContext());
        }
        statementContext = new StatementContext();
    }

    /**
     * get table qualifier
     */
    public static List<String> getQualifierName(ConnectContext context, List<String> nameParts) {
        switch (nameParts.size()) {
            case 1: { // table
                // Use current database name from catalog.
                String tableName = nameParts.get(0);
                String catalogName = context.getCurrentCatalog().getName();
                String dbName = context.getDatabase();
                return ImmutableList.of(tableName, catalogName, dbName);
            }
            case 2: { // db.table
                // Use database name from table name parts.
                String catalogName = context.getCurrentCatalog().getName();
                // if the relation is view, nameParts.get(0) is dbName.
                String dbName = nameParts.get(0);
                if (!dbName.contains(ClusterNamespace.CLUSTER_DELIMITER)) {
                    dbName = context.getClusterName() + ClusterNamespace.CLUSTER_DELIMITER + dbName;
                }
                String tableName = nameParts.get(1);
                return ImmutableList.of(tableName, catalogName, dbName);
            }
            case 3: { // catalog.db.table
                // Use catalog and database name from name parts.
                String catalogName = nameParts.get(0);
                String dbName = nameParts.get(1);
                if (!dbName.contains(ClusterNamespace.CLUSTER_DELIMITER)) {
                    dbName = context.getClusterName() + ClusterNamespace.CLUSTER_DELIMITER + dbName;
                }
                String tableName = nameParts.get(2);
                return ImmutableList.of(tableName, catalogName, dbName);
            }
            default:
                throw new IllegalStateException("Table name [" + String.join(".", nameParts) + "] is invalid.");
        }
    }

    /**
     * get table
     */
    public static TableIf getTable(List<String> qualifierName, Env env) {
        String catalogName = qualifierName.get(1);
        String dbName = qualifierName.get(2);
        String tableName = qualifierName.get(0);
        CatalogIf catalog = env.getCatalogMgr().getCatalog(catalogName);
        if (catalog == null) {
            throw new RuntimeException(String.format("Catalog %s does not exist.", catalogName));
        }
        DatabaseIf<TableIf> db = null;
        try {
            db = (DatabaseIf<TableIf>) catalog.getDb(dbName)
                    .orElseThrow(() -> new RuntimeException("Database [" + dbName + "] does not exist."));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return db.getTable(tableName).orElseThrow(() -> new RuntimeException(
                "Table [" + tableName + "] does not exist in database [" + dbName + "]."));
    }
}
