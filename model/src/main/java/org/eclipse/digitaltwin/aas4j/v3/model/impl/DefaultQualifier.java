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
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.QualifierBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Qualifier
 * 
 * A qualifier is a type-value-pair that makes additional statements w.r.t. the value of the
 * element.
 */

@IRI("aas:Qualifier")
public class DefaultQualifier implements Qualifier {

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/semanticID")
    protected Reference semanticID;

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Qualifier/kind")
    protected QualifierKind kind;

    @IRI("https://admin-shell.io/aas/3/0/Qualifier/type")
    protected String type;

    @IRI("https://admin-shell.io/aas/3/0/Qualifier/value")
    protected String value;

    @IRI("https://admin-shell.io/aas/3/0/Qualifier/valueID")
    protected Reference valueID;

    @IRI("https://admin-shell.io/aas/3/0/Qualifier/valueType")
    protected DataTypeDefXSD valueType;

    public DefaultQualifier() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.kind,
            this.type,
            this.value,
            this.valueID,
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
            DefaultQualifier other = (DefaultQualifier) obj;
            return Objects.equals(this.kind, other.kind) &&
                Objects.equals(this.type, other.type) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueID, other.valueID) &&
                Objects.equals(this.valueType, other.valueType) &&
                Objects.equals(this.semanticID, other.semanticID) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds);
        }
    }

    @Override
    public QualifierKind getKind() {
        return kind;
    }

    @Override
    public void setKind(QualifierKind kind) {
        this.kind = kind;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
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
    public Reference getValueID() {
        return valueID;
    }

    @Override
    public void setValueID(Reference valueID) {
        this.valueID = valueID;
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
     * This builder class can be used to construct a DefaultQualifier bean.
     */
    public static class Builder extends QualifierBuilder<DefaultQualifier, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultQualifier newBuildingInstance() {
            return new DefaultQualifier();
        }
    }
}
