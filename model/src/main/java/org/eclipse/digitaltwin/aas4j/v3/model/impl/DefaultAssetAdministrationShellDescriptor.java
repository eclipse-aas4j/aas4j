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

import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.Endpoint;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.AssetAdministrationShellDescriptorBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor
 * 
 */

@IRI("aas:AssetAdministrationShellDescriptor")
public class DefaultAssetAdministrationShellDescriptor implements AssetAdministrationShellDescriptor {

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetKind")
    protected AssetKind assetKind;

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/assetType")
    protected String assetType;

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/endpoints")
    protected List<Endpoint> endpoints = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/globalAssetId")
    protected String globalAssetId;

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/id")
    protected String id;

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/specificAssetIds")
    protected List<SpecificAssetId> specificAssetIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShellDescriptor/submodelDescriptors")
    protected List<SubmodelDescriptor> submodelDescriptors = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Descriptor/description")
    protected List<LangStringTextType> description = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Descriptor/displayName")
    protected List<LangStringNameType> displayName = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Descriptor/extensions")
    protected List<Extension> extensions = new ArrayList<>();

    public DefaultAssetAdministrationShellDescriptor() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.administration,
            this.assetKind,
            this.assetType,
            this.endpoints,
            this.globalAssetId,
            this.idShort,
            this.id,
            this.specificAssetIds,
            this.submodelDescriptors,
            this.description,
            this.displayName,
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
            DefaultAssetAdministrationShellDescriptor other = (DefaultAssetAdministrationShellDescriptor) obj;
            return Objects.equals(this.administration, other.administration) &&
                Objects.equals(this.assetKind, other.assetKind) &&
                Objects.equals(this.assetType, other.assetType) &&
                Objects.equals(this.endpoints, other.endpoints) &&
                Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.id, other.id) &&
                Objects.equals(this.specificAssetIds, other.specificAssetIds) &&
                Objects.equals(this.submodelDescriptors, other.submodelDescriptors) &&
                Objects.equals(this.description, other.description) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.extensions, other.extensions);
        }
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
    public AssetKind getAssetKind() {
        return assetKind;
    }

    @Override
    public void setAssetKind(AssetKind assetKind) {
        this.assetKind = assetKind;
    }

    @Override
    public String getAssetType() {
        return assetType;
    }

    @Override
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    @Override
    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    @Override
    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    @Override
    public String getGlobalAssetId() {
        return globalAssetId;
    }

    @Override
    public void setGlobalAssetId(String globalAssetId) {
        this.globalAssetId = globalAssetId;
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
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public List<SpecificAssetId> getSpecificAssetIds() {
        return specificAssetIds;
    }

    @Override
    public void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds) {
        this.specificAssetIds = specificAssetIds;
    }

    @Override
    public List<SubmodelDescriptor> getSubmodelDescriptors() {
        return submodelDescriptors;
    }

    @Override
    public void setSubmodelDescriptors(List<SubmodelDescriptor> submodelDescriptors) {
        this.submodelDescriptors = submodelDescriptors;
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
    public List<LangStringNameType> getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(List<LangStringNameType> displayNames) {
        this.displayName = displayNames;
    }

    @Override
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    public String toString() {
        return String.format(
            "DefaultAssetAdministrationShellDescriptor (" + "administration=%s,"
                + "assetKind=%s,"
                + "assetType=%s,"
                + "endpoints=%s,"
                + "globalAssetId=%s,"
                + "idShort=%s,"
                + "id=%s,"
                + "specificAssetIds=%s,"
                + "submodelDescriptors=%s,"
                + ")",
            this.administration, this.assetKind, this.assetType, this.endpoints, this.globalAssetId, this.idShort, this.id,
            this.specificAssetIds, this.submodelDescriptors);
    }

    /**
     * This builder class can be used to construct a DefaultAssetAdministrationShellDescriptor bean.
     */
    public static class Builder extends AssetAdministrationShellDescriptorBuilder<DefaultAssetAdministrationShellDescriptor, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetAdministrationShellDescriptor newBuildingInstance() {
            return new DefaultAssetAdministrationShellDescriptor();
        }
    }
}
