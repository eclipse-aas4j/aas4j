/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

package org.eclipse.aas4j.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.aas4j.v3.model.SpecificAssetId
 * 
 * A specific asset ID describes a generic supplementary identifying attribute of the asset.
 */

@IRI("aas:SpecificAssetId")
public class DefaultSpecificAssetId implements SpecificAssetId {

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/SpecificAssetId/externalSubjectId")
    protected Reference externalSubjectId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SpecificAssetId/name")
    protected String name;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SpecificAssetId/value")
    protected String value;

    public DefaultSpecificAssetId() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.externalSubjectId,
            this.name,
            this.value,
            this.semanticId,
            this.supplementalSemanticIds);
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
            DefaultSpecificAssetId other = (DefaultSpecificAssetId) obj;
            return Objects.equals(this.externalSubjectId, other.externalSubjectId) &&
                Objects.equals(this.name, other.name) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.semanticId, other.semanticId) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds);
        }
    }

    @Override
    public Reference getExternalSubjectId() {
        return externalSubjectId;
    }

    @Override
    public void setExternalSubjectId(Reference externalSubjectId) {
        this.externalSubjectId = externalSubjectId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    @Override
    public List<Reference> getSupplementalSemanticIds() {
        return supplementalSemanticIds;
    }

    @Override
    public void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds) {
        this.supplementalSemanticIds = supplementalSemanticIds;
    }

    /**
     * This builder class can be used to construct a DefaultSpecificAssetId bean.
     */
    public static class Builder extends SpecificAssetIdBuilder<DefaultSpecificAssetId, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSpecificAssetId newBuildingInstance() {
            return new DefaultSpecificAssetId();
        }
    }
}
