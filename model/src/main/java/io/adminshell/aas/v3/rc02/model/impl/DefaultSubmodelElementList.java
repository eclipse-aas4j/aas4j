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

package io.adminshell.aas.v3.rc02.model.impl;

import io.adminshell.aas.v3.rc02.model.*;
import io.adminshell.aas.v3.rc02.model.annotations.IRI;
import io.adminshell.aas.v3.rc02.model.builder.SubmodelElementListBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Default implementation of package SubmodelElementList
 * 
 * A submodel element list is an ordered list of submodel elements.
 */

@IRI("aas:SubmodelElementList")
public class DefaultSubmodelElementList implements SubmodelElementList {

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecifications")
    protected List<Reference> dataSpecifications = new ArrayList<>();

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
    protected LangStringSet description;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/displayName")
    protected LangStringSet displayName;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/orderRelevant")
    protected boolean orderRelevant;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/semanticIdListElement")
    protected Reference semanticIdListElement;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/typeValueListElement")
    protected AasSubmodelElements typeValueListElement;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/value")
    protected List<SubmodelElement> values = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementList/valueTypeListElement")
    protected DataTypeDefXsd valueTypeListElement;

    public DefaultSubmodelElementList() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.orderRelevant,
            this.values,
            this.semanticIdListElement,
            this.typeValueListElement,
            this.valueTypeListElement,
            this.dataSpecifications,
            this.kind,
            this.semanticId,
            this.supplementalSemanticIds,
            this.qualifiers,
            this.category,
            this.idShort,
            this.displayName,
            this.description,
            this.checksum,
            this.extensions);
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
                Objects.equals(this.values, other.values) &&
                Objects.equals(this.semanticIdListElement, other.semanticIdListElement) &&
                Objects.equals(this.typeValueListElement, other.typeValueListElement) &&
                Objects.equals(this.valueTypeListElement, other.valueTypeListElement) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.kind, other.kind) &&
                Objects.equals(this.semanticId, other.semanticId) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds) &&
                Objects.equals(this.qualifiers, other.qualifiers) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.description, other.description) &&
                Objects.equals(this.checksum, other.checksum) &&
                Objects.equals(this.extensions, other.extensions);
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
    public List<SubmodelElement> getValues() {
        return values;
    }

    @Override
    public void setValues(List<SubmodelElement> values) {
        this.values = values;
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
    public DataTypeDefXsd getValueTypeListElement() {
        return valueTypeListElement;
    }

    @Override
    public void setValueTypeListElement(DataTypeDefXsd valueTypeListElement) {
        this.valueTypeListElement = valueTypeListElement;
    }

    @Override
    public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    @Override
    public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
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
    public List<Qualifier> getQualifiers() {
        return qualifiers;
    }

    @Override
    public void setQualifiers(List<Qualifier> qualifiers) {
        this.qualifiers = qualifiers;
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
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @Override
    public LangStringSet getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(LangStringSet displayName) {
        this.displayName = displayName;
    }

    @Override
    public LangStringSet getDescription() {
        return description;
    }

    @Override
    public void setDescription(LangStringSet description) {
        this.description = description;
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
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
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
