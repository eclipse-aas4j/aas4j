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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetID;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.SpecificAssetIDBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetID
 * 
 * A specific asset ID describes a generic supplementary identifying attribute of the asset.
 */

@IRI("aas:SpecificAssetID")
public class DefaultSpecificAssetID implements SpecificAssetID {

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/semanticID")
    protected Reference semanticID;

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/SpecificAssetID/externalSubjectID")
    protected Reference externalSubjectID;

    @IRI("https://admin-shell.io/aas/3/0/SpecificAssetID/name")
    protected String name;

    @IRI("https://admin-shell.io/aas/3/0/SpecificAssetID/value")
    protected String value;

    public DefaultSpecificAssetID() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.externalSubjectID,
            this.name,
            this.value,
            this.semanticID,
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
            DefaultSpecificAssetID other = (DefaultSpecificAssetID) obj;
            return Objects.equals(this.externalSubjectID, other.externalSubjectID) &&
                Objects.equals(this.name, other.name) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.semanticID, other.semanticID) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds);
        }
    }

    @Override
    public Reference getExternalSubjectID() {
        return externalSubjectID;
    }

    @Override
    public void setExternalSubjectID(Reference externalSubjectID) {
        this.externalSubjectID = externalSubjectID;
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
    public Reference getSemanticID() {
        return semanticID;
    }

    @Override
    public void setSemanticID(Reference semanticID) {
        this.semanticID = semanticID;
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
     * This builder class can be used to construct a DefaultSpecificAssetID bean.
     */
    public static class Builder extends SpecificAssetIDBuilder<DefaultSpecificAssetID, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSpecificAssetID newBuildingInstance() {
            return new DefaultSpecificAssetID();
        }
    }
}
