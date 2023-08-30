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

import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXSD;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.ExtensionBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Extension
 * 
 * Single extension of an element.
 */

@IRI("aas:Extension")
public class DefaultExtension implements Extension {

    @IRI("https://admin-shell.io/aas/3/0/Extension/name")
    protected String name;

    @IRI("https://admin-shell.io/aas/3/0/Extension/refersTo")
    protected List<Reference> refersTo = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Extension/value")
    protected String value;

    @IRI("https://admin-shell.io/aas/3/0/Extension/valueType")
    protected DataTypeDefXSD valueType;

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/semanticID")
    protected Reference semanticID;

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    public DefaultExtension() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,
            this.refersTo,
            this.value,
            this.valueType,
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
            DefaultExtension other = (DefaultExtension) obj;
            return Objects.equals(this.name, other.name) &&
                Objects.equals(this.refersTo, other.refersTo) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueType, other.valueType) &&
                Objects.equals(this.semanticID, other.semanticID) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds);
        }
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
    public List<Reference> getRefersTo() {
        return refersTo;
    }

    @Override
    public void setRefersTo(List<Reference> refersTo) {
        this.refersTo = refersTo;
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
    public DataTypeDefXSD getValueType() {
        return valueType;
    }

    @Override
    public void setValueType(DataTypeDefXSD valueType) {
        this.valueType = valueType;
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
