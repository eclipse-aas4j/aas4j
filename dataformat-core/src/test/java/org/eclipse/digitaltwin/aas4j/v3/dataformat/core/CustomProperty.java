/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import org.eclipse.digitaltwin.aas4j.v3.model.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class CustomProperty implements Property {

    protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new LinkedList<>();
    ;

    protected Reference semanticId;

    protected String value;

    protected Reference valueId;

    protected DataTypeDefXsd valueType;

    protected List<Qualifier> qualifiers = new LinkedList<>();
    ;

    protected String category;

    protected List<LangStringTextType> description = new LinkedList<>();
    ;

    protected List<LangStringNameType> displayName = new LinkedList<>();
    ;

    protected String idShort;

    protected List<Extension> extensions = new LinkedList<>();
    ;

    protected List<Reference> supplementalSemanticIds = new LinkedList<>();

    protected CustomProperty() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.valueType,
                this.value,
                this.valueId,
                this.embeddedDataSpecifications,
                this.category,
                this.idShort,
                this.displayName,
                this.description,
                this.extensions,
                this.semanticId,
                this.supplementalSemanticIds,
                this.qualifiers);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if ((obj instanceof Property) == false) {
            return false;
        } else {
            Property other = (Property) obj;
            return Objects.equals(this.valueType, other.getValueType())
                    && Objects.equals(this.value, other.getValue())
                    && Objects.equals(this.valueId, other.getValueId())
                    && Objects.equals(this.category, other.getCategory())
                    && Objects.equals(this.description, other.getDescription())
                    && Objects.equals(this.displayName, other.getDisplayName())
                    && Objects.equals(this.idShort, other.getIdShort())
                    && Objects.equals(this.qualifiers, other.getQualifiers())
                    && Objects.equals(this.embeddedDataSpecifications, other.getEmbeddedDataSpecifications())
                    && Objects.equals(this.semanticId, other.getSemanticId());
        }
    }

    @Override
    final public DataTypeDefXsd getValueType() {
        return this.valueType;
    }

    @Override
    final public void setValueType(DataTypeDefXsd dataType) {
        this.valueType = dataType;
    }

    @Override
    final public String getValue() {
        return value;
    }

    @Override
    final public void setValue(String value) {
        this.value = value;
    }

    @Override
    final public Reference getValueId() {
        return valueId;
    }

    @Override
    final public void setValueId(Reference valueId) {
        this.valueId = valueId;
    }

    @Override
    final public String getCategory() {
        return category;
    }

    @Override
    final public void setCategory(String category) {
        this.category = category;
    }

    @Override
    final public List<LangStringTextType> getDescription() {
        return description;
    }

    @Override
    final public void setDescription(List<LangStringTextType> description) {
        this.description = description;
    }

    @Override
    final public List<LangStringNameType> getDisplayName() {
        return displayName;
    }

    @Override
    final public void setDisplayName(List<LangStringNameType> displayName) {
        this.displayName = displayName;
    }

    @Override
    final public String getIdShort() {
        return idShort;
    }

    @Override
    final public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @Override
    final public List<Qualifier> getQualifiers() {
        return qualifiers;
    }

    @Override
    final public void setQualifiers(List<Qualifier> qualifiers) {
        this.qualifiers = qualifiers;
    }

    @Override
    final public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    final public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    @Override
    final public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    final public void setSemanticId(Reference semanticId) {
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

    @Override
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> list) {
        this.extensions = list;
    }
}
