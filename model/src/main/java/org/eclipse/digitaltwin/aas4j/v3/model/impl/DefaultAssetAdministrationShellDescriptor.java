/*
 * Copyright (c) 2026 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2026 SAP SE or an SAP affiliate company. All rights reserved.
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
import org.eclipse.digitaltwin.aas4j.v3.model.Endpoint;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
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

    @IRI("https://admin-shell.io/aas/3/2/AssetAdministrationShellDescriptor/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/2/AssetAdministrationShellDescriptor/description")
    protected LangStringTextType description;

    @IRI("https://admin-shell.io/aas/3/2/AssetAdministrationShellDescriptor/displayName")
    protected LangStringNameType displayName;

    @IRI("https://admin-shell.io/aas/3/2/AssetAdministrationShellDescriptor/globalAssetId")
    protected Reference globalAssetId;

    @IRI("https://admin-shell.io/aas/3/2/AssetAdministrationShellDescriptor/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/2/AssetAdministrationShellDescriptor/identification")
    protected String identification;

    @IRI("https://admin-shell.io/aas/3/2/AssetAdministrationShellDescriptor/specificAssetIds")
    protected List<SpecificAssetId> specificAssetIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/AssetAdministrationShellDescriptor/submodelDescriptors")
    protected SubmodelDescriptor submodelDescriptors;

    @IRI("https://admin-shell.io/aas/3/2/Descriptor/endpoints")
    protected List<Endpoint> endpoints = new ArrayList<>();

    public DefaultAssetAdministrationShellDescriptor() {
    }

    @Override
    public String toString() {
        return "DefaultAssetAdministrationShellDescriptor{"
                + "administration='" + administration + "',"
                + "description='" + description + "',"
                + "displayName='" + displayName + "',"
                + "globalAssetId='" + globalAssetId + "',"
                + "idShort='" + idShort + "',"
                + "identification='" + identification + "',"
                + "specificAssetIds='" + specificAssetIds + "',"
                + "submodelDescriptors='" + submodelDescriptors + "',"
                + "endpoints='" + endpoints + "',"
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.administration,
                this.description,
                this.displayName,
                this.globalAssetId,
                this.idShort,
                this.identification,
                this.specificAssetIds,
                this.submodelDescriptors,
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
                    Objects.equals(this.globalAssetId, other.globalAssetId) &&
                    Objects.equals(this.idShort, other.idShort) &&
                    Objects.equals(this.identification, other.identification) &&
                    Objects.equals(this.specificAssetIds, other.specificAssetIds) &&
                    Objects.equals(this.submodelDescriptors, other.submodelDescriptors) &&
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
    public LangStringTextType getDescription() {
        return description;
    }

    @Override
    public void setDescription(LangStringTextType description) {
        this.description = description;
    }

    @Override
    public LangStringNameType getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(LangStringNameType displayName) {
        this.displayName = displayName;
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
    public List<SpecificAssetId> getSpecificAssetIds() {
        return specificAssetIds;
    }

    @Override
    public void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds) {
        this.specificAssetIds = specificAssetIds;
    }

    @Override
    public SubmodelDescriptor getSubmodelDescriptors() {
        return submodelDescriptors;
    }

    @Override
    public void setSubmodelDescriptors(SubmodelDescriptor submodelDescriptors) {
        this.submodelDescriptors = submodelDescriptors;
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
