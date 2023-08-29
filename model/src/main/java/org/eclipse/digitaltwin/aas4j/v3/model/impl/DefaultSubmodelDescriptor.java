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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.Endpoint;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.SubmodelDescriptorBuilder;

@IRI("aas:SubmodelDescriptor")
public class DefaultSubmodelDescriptor implements SubmodelDescriptor {

    @IRI("https://admin-shell.io/aas/3/0/RC02/Descriptor/endpoints")
    protected List<Endpoint> endpoints = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/description")
    protected List<LangStringTextType> description;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/displayName")
    protected List<LangStringNameType> displayName;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/ide")
    protected String id;

    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/semanticId")
    protected Reference semanticId;

    public DefaultSubmodelDescriptor() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.administration,
            this.description,
            this.displayName,
            this.idShort,
            this.id,
            this.semanticId,
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
            DefaultSubmodelDescriptor other = (DefaultSubmodelDescriptor) obj;
            return Objects.equals(this.administration, other.administration) &&
                Objects.equals(this.description, other.description) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.id, other.id) &&
                Objects.equals(this.semanticId, other.semanticId) &&
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
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
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
    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    @Override
    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * This builder class can be used to construct a DefaultSubmodelDescriptor bean.
     */
    public static class Builder extends SubmodelDescriptorBuilder<DefaultSubmodelDescriptor, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSubmodelDescriptor newBuildingInstance() {
            return new DefaultSubmodelDescriptor();
        }
    }
}
