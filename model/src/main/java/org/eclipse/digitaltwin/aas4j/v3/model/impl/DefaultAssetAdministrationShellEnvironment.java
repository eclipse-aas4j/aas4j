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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellEnvironment
 * 
 * Container for the sets of different identifiables.
 */

@IRI("aas:AssetAdministrationShellEnvironment")
public class DefaultAssetAdministrationShellEnvironment implements AssetAdministrationShellEnvironment {

    @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellEnvironment/assetAdministrationShells")
    protected List<AssetAdministrationShell> assetAdministrationShells = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellEnvironment/conceptDescriptions")
    protected List<ConceptDescription> conceptDescriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/AssetAdministrationShellEnvironment/submodels")
    protected List<Submodel> submodels = new ArrayList<>();

    public DefaultAssetAdministrationShellEnvironment() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.assetAdministrationShells,
            this.conceptDescriptions,
            this.submodels);
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
            DefaultAssetAdministrationShellEnvironment other = (DefaultAssetAdministrationShellEnvironment) obj;
            return Objects.equals(this.assetAdministrationShells, other.assetAdministrationShells) &&
                Objects.equals(this.conceptDescriptions, other.conceptDescriptions) &&
                Objects.equals(this.submodels, other.submodels);
        }
    }

    @Override
    public String toString() {
        return "DefaultAssetAdministrationShellEnvironment{" +
                "assetAdministrationShells=" + assetAdministrationShells +
                ", conceptDescriptions=" + conceptDescriptions +
                ", submodels=" + submodels +
                '}';
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
    public List<ConceptDescription> getConceptDescriptions() {
        return conceptDescriptions;
    }

    @Override
    public void setConceptDescriptions(List<ConceptDescription> conceptDescriptions) {
        this.conceptDescriptions = conceptDescriptions;
    }

    @Override
    public List<Submodel> getSubmodels() {
        return submodels;
    }

    @Override
    public void setSubmodels(List<Submodel> submodels) {
        this.submodels = submodels;
    }

    /**
     * This builder class can be used to construct a DefaultAssetAdministrationShellEnvironment bean.
     */
    public static class Builder extends AssetAdministrationShellEnvironmentBuilder<DefaultAssetAdministrationShellEnvironment, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetAdministrationShellEnvironment newBuildingInstance() {
            return new DefaultAssetAdministrationShellEnvironment();
        }
    }
}
