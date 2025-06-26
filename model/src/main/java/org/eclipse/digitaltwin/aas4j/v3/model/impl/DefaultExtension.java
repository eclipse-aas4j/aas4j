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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Extension
 * 
 * Single extension of an element.
 */

@IRI("aas:Extension")
public class DefaultExtension implements Extension {

    @IRI("https://admin-shell.io/aas/3/1/Extension/name")
    protected String name;

    @IRI("https://admin-shell.io/aas/3/1/Extension/refersTo")
    protected List<Reference> refersTos = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/Extension/value")
    protected String value;

    @IRI("https://admin-shell.io/aas/3/1/Extension/valueType")
    protected DataTypeDefXsd valueType;

    @IRI("https://admin-shell.io/aas/3/1/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/1/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    public DefaultExtension() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.name,
            this.valueType,
            this.value,
            this.refersTos,
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
            DefaultExtension other = (DefaultExtension) obj;
            return Objects.equals(this.name, other.name) &&
                Objects.equals(this.valueType, other.valueType) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.refersTos, other.refersTos) &&
                Objects.equals(this.semanticId, other.semanticId) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds);
        }
    }

    @Override
    public String toString() {
        return "DefaultExtension{" +
                "name='" + name + '\'' +
                ", refersTos=" + refersTos +
                ", value='" + value + '\'' +
                ", valueType=" + valueType +
                ", semanticId=" + semanticId +
                ", supplementalSemanticIds=" + supplementalSemanticIds +
                '}';
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
    public DataTypeDefXsd getValueType() {
        return valueType;
    }

    @Override
    public void setValueType(DataTypeDefXsd valueType) {
        this.valueType = valueType;
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
    public List<Reference> getRefersTo() {
        return refersTos;
    }

    @Override
    public void setRefersTo(List<Reference> refersTos) {
        this.refersTos = refersTos;
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
     * This builder class can be used to construct a DefaultExtension bean.
     */
    public static class Builder extends ExtensionBuilder<DefaultExtension, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultExtension newBuildingInstance() {
            return new DefaultExtension();
        }
    }
}
