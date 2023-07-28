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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellMetadata
 * 
 */

@IRI("aas:AssetAdministrationShellMetadata")
public class DefaultAssetAdministrationShellMetadata implements AssetAdministrationShellMetadata {

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellMetadata/derivedFrom")
    protected List<Reference> derivedFrom = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/HasDataSpecification/embeddedDataSpecifications")
    protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/HasExtensions/extensions")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Identifiable/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/Identifiable/id")
    protected String id;

    @IRI("https://admin-shell.io/aas/3/0/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/0/Referable/description")
    protected List<LangStringTextType> description = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/displayName")
    protected List<LangStringNameType> displayName = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/idShort")
    protected String idShort;

    public DefaultAssetAdministrationShellMetadata() {}

    public DefaultAssetAdministrationShellMetadata(AssetAdministrationShellMetadata x) {
        this.derivedFrom = x.getDerivedFrom();
        this.embeddedDataSpecifications = x.getEmbeddedDataSpecifications();
        this.extensions = x.getExtensions();
        this.administration = x.getAdministration();
        this.id = x.getId();
        this.category = x.getCategory();
        this.description = x.getDescription();
        this.displayName = x.getDisplayName();
        this.idShort = x.getIdShort();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.derivedFrom,
            this.administration,
            this.id,
            this.category,
            this.idShort,
            this.displayName,
            this.description,
            this.extensions,
            this.embeddedDataSpecifications);
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
            DefaultAssetAdministrationShellMetadata other = (DefaultAssetAdministrationShellMetadata) obj;
            return Objects.equals(this.derivedFrom, other.derivedFrom) &&
                Objects.equals(this.administration, other.administration) &&
                Objects.equals(this.id, other.id) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.description, other.description) &&
                Objects.equals(this.extensions, other.extensions) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications);
        }
    }

    @Override
    public List<Reference> getDerivedFrom() {
        return derivedFrom;
    }

    @Override
    public void setDerivedFrom(List<Reference> derivedFroms) {
        this.derivedFrom = derivedFroms;
    }

    @Override
    public AdministrativeInformation getAdministration() {
        return administration;
    }

    @Override
    public void setAdministration(AdministrativeInformation administration) {
        this.administration = administration;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
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
    public List<LangStringNameType> getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(List<LangStringNameType> displayNames) {
        this.displayName = displayNames;
    }

    @Override
    public List<LangStringTextType> getDescription() {
        return description;
    }

    @Override
    public void setDescription(List<LangStringTextType> descriptions) {
        this.description = descriptions;
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
    public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    public String toString() {
        return String.format(
            "DefaultAssetAdministrationShellMetadata (" + "derivedFrom=%s,"
                + ")",
            this.derivedFrom);
    }

    /**
     * This builder class can be used to construct a DefaultAssetAdministrationShellMetadata bean.
     */
    public static class Builder extends AssetAdministrationShellMetadataBuilder<DefaultAssetAdministrationShellMetadata, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetAdministrationShellMetadata newBuildingInstance() {
            return new DefaultAssetAdministrationShellMetadata();
        }
    }
}
