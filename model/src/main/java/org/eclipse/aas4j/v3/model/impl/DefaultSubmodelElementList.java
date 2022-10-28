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

import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.builder.SubmodelElementListBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.aas4j.v3.model.SubmodelElementList
 * 
 * A submodel element list is an ordered list of submodel elements.
 */

@IRI("aas:SubmodelElementList")
public class DefaultSubmodelElementList implements SubmodelElementList {

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecifications")
    protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasExtensions/extensions")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasKind/kind")
    protected ModelingKind kind;

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Qualifiable/qualifiers")
    protected List<Qualifier> qualifiers = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/checksum")
    protected String checksum;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/description")
    protected List<LangString> description = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/displayName")
    protected List<LangString> displayName = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/orderRelevant")
    protected boolean orderRelevant;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/semanticIdListElement")
    protected Reference semanticIdListElement;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/typeValueListElement")
    protected AasSubmodelElements typeValueListElement;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/value")
    protected List<SubmodelElement> value = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/valueTypeListElement")
    protected DataTypeDefXsd valueTypeListElement;

    public DefaultSubmodelElementList() {
        this.orderRelevant = Boolean.TRUE;

        this.kind = ModelingKind.INSTANCE;

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.orderRelevant,
            this.semanticIdListElement,
            this.typeValueListElement,
            this.value,
            this.valueTypeListElement,
            this.embeddedDataSpecifications,
            this.semanticId,
            this.supplementalSemanticIds,
            this.kind,
            this.category,
            this.checksum,
            this.description,
            this.displayName,
            this.idShort,
            this.extensions,
            this.qualifiers);
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
            DefaultSubmodelElementList other = (DefaultSubmodelElementList) obj;
            return Objects.equals(this.orderRelevant, other.orderRelevant) &&
                Objects.equals(this.semanticIdListElement, other.semanticIdListElement) &&
                Objects.equals(this.typeValueListElement, other.typeValueListElement) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueTypeListElement, other.valueTypeListElement) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications) &&
                Objects.equals(this.semanticId, other.semanticId) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds) &&
                Objects.equals(this.kind, other.kind) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.checksum, other.checksum) &&
                Objects.equals(this.description, other.description) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.extensions, other.extensions) &&
                Objects.equals(this.qualifiers, other.qualifiers);
        }
    }

    @Override
    public boolean getOrderRelevant() {
        return orderRelevant;
    }

    @Override
    public void setOrderRelevant(boolean orderRelevant) {
        this.orderRelevant = orderRelevant;
    }

    @Override
    public Reference getSemanticIdListElement() {
        return semanticIdListElement;
    }

    @Override
    public void setSemanticIdListElement(Reference semanticIdListElement) {
        this.semanticIdListElement = semanticIdListElement;
    }

    @Override
    public AasSubmodelElements getTypeValueListElement() {
        return typeValueListElement;
    }

    @Override
    public void setTypeValueListElement(AasSubmodelElements typeValueListElement) {
        this.typeValueListElement = typeValueListElement;
    }

    @Override
    public List<SubmodelElement> getValue() {
        return value;
    }

    @Override
    public void setValue(List<SubmodelElement> value) {
        this.value = value;
    }

    @Override
    public DataTypeDefXsd getValueTypeListElement() {
        return valueTypeListElement;
    }

    @Override
    public void setValueTypeListElement(DataTypeDefXsd valueTypeListElement) {
        this.valueTypeListElement = valueTypeListElement;
    }

    @Override
    public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
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

    @Override
    public ModelingKind getKind() {
        return kind;
    }

    @Override
    public void setKind(ModelingKind kind) {
        this.kind = kind;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getChecksum() {
        return checksum;
    }

    @Override
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @Override
    public List<LangString> getDescription() {
        return description;
    }

    @Override
    public void setDescription(List<LangString> description) {
        this.description = description;
    }

    @Override
    public List<LangString> getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(List<LangString> displayName) {
        this.displayName = displayName;

    }

    @Override
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @Override
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    @Override
    public List<Qualifier> getQualifiers() {
        return qualifiers;
    }

    @Override
    public void setQualifiers(List<Qualifier> qualifiers) {
        this.qualifiers = qualifiers;
    }

    /**
     * This builder class can be used to construct a DefaultSubmodelElementList bean.
     */
    public static class Builder extends SubmodelElementListBuilder<DefaultSubmodelElementList, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSubmodelElementList newBuildingInstance() {
            return new DefaultSubmodelElementList();
        }
    }
}
