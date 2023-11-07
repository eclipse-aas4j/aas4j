/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.EntityType;
import org.eclipse.digitaltwin.aas4j.v3.model.EntityValue;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceValue;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.EntityValueBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.EntityValue
 * 
 */

@IRI("aas:EntityValue")
public class DefaultEntityValue implements EntityValue {

    @IRI("https://admin-shell.io/aas/3/0/EntityValue/entityType")
    protected EntityType entityType;

    @IRI("https://admin-shell.io/aas/3/0/EntityValue/globalAssetId")
    protected ReferenceValue globalAssetId;

    @IRI("https://admin-shell.io/aas/3/0/EntityValue/specificAssetIds")
    protected List<String> specificAssetIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/EntityValue/statements")
    protected List<String> statements = new ArrayList<>();

    public DefaultEntityValue() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.entityType,
            this.globalAssetId,
            this.specificAssetIds,
            this.statements);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultEntityValue other = (DefaultEntityValue) obj;
            return Objects.equals(this.entityType, other.entityType) &&
                Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.specificAssetIds, other.specificAssetIds) &&
                Objects.equals(this.statements, other.statements);
        }
    }

    @Override
    public EntityType getEntityType() {
        return entityType;
    }

    @Override
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    @Override
    public ReferenceValue getGlobalAssetId() {
        return globalAssetId;
    }

    @Override
    public void setGlobalAssetId(ReferenceValue globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @Override
    public List<String> getSpecificAssetIds() {
        return specificAssetIds;
    }

    @Override
    public void setSpecificAssetIds(List<String> specificAssetIds) {
        this.specificAssetIds = specificAssetIds;
    }

    @Override
    public List<String> getStatements() {
        return statements;
    }

    @Override
    public void setStatements(List<String> statements) {
        this.statements = statements;
    }

    public String toString() {
        return String.format(
            "DefaultEntityValue (" + "entityType=%s,"
                + "globalAssetId=%s,"
                + "specificAssetIds=%s,"
                + "statements=%s,"
                + ")",
            this.entityType, this.globalAssetId, this.specificAssetIds, this.statements);
    }

    /**
     * This builder class can be used to construct a DefaultEntityValue bean.
     */
    public static class Builder extends EntityValueBuilder<DefaultEntityValue, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEntityValue newBuildingInstance() {
            return new DefaultEntityValue();
        }
    }
}
