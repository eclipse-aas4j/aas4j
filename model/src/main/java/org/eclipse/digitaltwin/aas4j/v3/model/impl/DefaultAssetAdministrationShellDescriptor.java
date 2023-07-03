/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.AssetAdministrationShellDescriptorBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@IRI("aas:AssetAdministrationShellDescriptor")
public class DefaultAssetAdministrationShellDescriptor implements AssetAdministrationShellDescriptor {

    @IRI("https://admin-shell.io/aas/3/0/RC02/Descriptor/endpoints")
    protected List<Endpoint> endpoints = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/description")
    protected List<LangStringTextType> description;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/displayName")
    protected List<LangStringNameType> displayName;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/identification")
    protected String identification;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/globalAssetId")
    protected Reference globalAssetId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/specificAssetIds")
    protected SpecificAssetId specificAssetId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/submodelDescriptor")
    protected List<SubmodelDescriptor> submodelDescriptor;


    public DefaultAssetAdministrationShellDescriptor() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.administration,
            this.description,
            this.displayName,
            this.idShort,
            this.identification,
            this.globalAssetId,
            this.specificAssetId,
            this.submodelDescriptor,
            this.endpoints);
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
                Objects.equals(this.description, other.description) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.identification, other.identification) &&
                Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.specificAssetId, other.specificAssetId) &&
                Objects.equals(this.submodelDescriptor, other.submodelDescriptor) &&
                Objects.equals(this.endpoints, other.endpoints);
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
    public List<LangStringTextType> getDescription() {
        return description;
    }

    @Override
    public void setDescription(List<LangStringTextType> description) {
        this.description = description;
    }

    @Override
    public List<LangStringNameType> getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(List<LangStringNameType> displayName) {
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
    public String getIdentification() {
        return identification;
    }

    @Override
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @Override
    public Reference getGlobalAssetId() {
        return globalAssetId;
    }

    @Override
    public void setGlobalAssetId(Reference globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @Override
    public SpecificAssetId getSpecificAssetIds() {
        return specificAssetId;
    }

    @Override
    public void setSpecificAssetIds(SpecificAssetId specificAssetId) {
        this.specificAssetId = specificAssetId;
    }

    @Override
    public List<SubmodelDescriptor> getSubmodelDescriptor() {
        return submodelDescriptor;
    }

    @Override
    public void setSubmodelDescriptor(List<SubmodelDescriptor> submodelDescriptor) {
        this.submodelDescriptor = submodelDescriptor;
    }


    @Override
    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    @Override
    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
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
