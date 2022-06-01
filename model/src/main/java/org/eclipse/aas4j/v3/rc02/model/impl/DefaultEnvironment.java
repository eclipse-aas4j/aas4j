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

package org.eclipse.aas4j.v3.rc02.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import org.eclipse.aas4j.v3.rc02.model.*;
import org.eclipse.aas4j.v3.rc02.model.*;
import org.eclipse.aas4j.v3.rc02.model.annotations.IRI;
import org.eclipse.aas4j.v3.rc02.model.builder.*;
import org.eclipse.aas4j.v3.rc02.model.builder.EnvironmentBuilder;

/**
 * Default implementation of package io.adminshell.aas.v3.rc02.model.Environment
 * 
 * Container for the sets of different identifiables.
 */

@IRI("aas:Environment")
public class DefaultEnvironment implements Environment {

    @IRI("https://admin-shell.io/aas/3/0/RC02/Environment/assetAdministrationShells")
    protected List<AssetAdministrationShell> assetAdministrationShells = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Environment/conceptDescriptions")
    protected List<ConceptDescription> conceptDescriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Environment/dataSpecifications")
    protected List<DataSpecification> dataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Environment/submodels")
    protected List<Submodel> submodels = new ArrayList<>();

    public DefaultEnvironment() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.assetAdministrationShells,
            this.submodels,
            this.conceptDescriptions,
            this.dataSpecifications);
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
            DefaultEnvironment other = (DefaultEnvironment) obj;
            return Objects.equals(this.assetAdministrationShells, other.assetAdministrationShells) &&
                Objects.equals(this.submodels, other.submodels) &&
                Objects.equals(this.conceptDescriptions, other.conceptDescriptions) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications);
        }
    }

    @Override
    public List<AssetAdministrationShell> getAssetAdministrationShells() {
        return assetAdministrationShells;
    }

    @Override
    public void setAssetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells) {
        this.assetAdministrationShells = assetAdministrationShells;
    }

    @Override
    public List<Submodel> getSubmodels() {
        return submodels;
    }

    @Override
    public void setSubmodels(List<Submodel> submodels) {
        this.submodels = submodels;
    }

    @Override
    public List<ConceptDescription> getConceptDescriptions() {
        return conceptDescriptions;
    }

    @Override
    public void setConceptDescriptions(List<ConceptDescription> conceptDescriptions) {
        this.conceptDescriptions = conceptDescriptions;
    }

    @Override
    public List<DataSpecification> getDataSpecifications() {
        return dataSpecifications;
    }

    @Override
    public void setDataSpecifications(List<DataSpecification> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    /**
     * This builder class can be used to construct a DefaultEnvironment bean.
     */
    public static class Builder extends EnvironmentBuilder<DefaultEnvironment, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEnvironment newBuildingInstance() {
            return new DefaultEnvironment();
        }
    }
}
