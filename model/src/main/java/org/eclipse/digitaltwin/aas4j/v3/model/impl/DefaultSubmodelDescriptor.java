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

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.SubmodelDescriptorBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor
 * 
 */

@IRI("aas:SubmodelDescriptor")
public class DefaultSubmodelDescriptor implements SubmodelDescriptor {

    @IRI("https://admin-shell.io/aas/3/0/Descriptor/description")
    protected List<LangStringTextType> description = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Descriptor/displayName")
    protected List<LangStringNameType> displayName = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Descriptor/extensions")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/endpoints")
    protected List<Endpoint> endpoints = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/id")
    protected String id;

    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/supplementalSemanticId")
    protected List<Reference> supplementalSemanticId = new ArrayList<>();

    public DefaultSubmodelDescriptor() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.administration,
            this.endpoints,
            this.idShort,
            this.id,
            this.semanticId,
            this.supplementalSemanticId,
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
        } else if ((obj instanceof SubmodelDescriptor) == false) {
            return false;
        } else {
            SubmodelDescriptor other = (SubmodelDescriptor) obj;
            return Objects.equals(this.administration, other.getAdministration()) &&
                Objects.equals(this.endpoints, other.getEndpoints()) &&
                Objects.equals(this.idShort, other.getIdShort()) &&
                Objects.equals(this.id, other.getId()) &&
                Objects.equals(this.semanticId, other.getSemanticId()) &&
                Objects.equals(this.supplementalSemanticId, other.getSupplementalSemanticId()) &&
                Objects.equals(this.description, other.getDescription()) &&
                Objects.equals(this.displayName, other.getDisplayName()) &&
                Objects.equals(this.extensions, other.getExtensions());
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
    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    @Override
    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
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
    public List<Reference> getSupplementalSemanticId() {
        return supplementalSemanticId;
    }

    @Override
    public void setSupplementalSemanticId(List<Reference> supplementalSemanticIds) {
        this.supplementalSemanticId = supplementalSemanticIds;
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
            "DefaultSubmodelDescriptor (" + "administration=%s,"
                + "endpoints=%s,"
                + "idShort=%s,"
                + "id=%s,"
                + "semanticId=%s,"
                + "supplementalSemanticId=%s,"
                + ")",
            this.administration, this.endpoints, this.idShort, this.id, this.semanticId, this.supplementalSemanticId);
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
