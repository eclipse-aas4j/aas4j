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

package io.adminshell.aas.v3.rc02.model;

import io.adminshell.aas.v3.rc02.model.annotations.IRI;
import io.adminshell.aas.v3.rc02.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.rc02.model.impl.DefaultEnvironment;

import java.util.List;

/**
 * Container for the sets of different identifiables.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEnvironment.class)
})
public interface Environment {

    /**
     * Asset administration shell
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Environment/assetAdministrationShells
     *
     * @return Returns the List of AssetAdministrationShells for the property assetAdministrationShells.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Environment/assetAdministrationShells")
    List<AssetAdministrationShell> getAssetAdministrationShells();

    /**
     * Asset administration shell
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Environment/assetAdministrationShells
     *
     * @param assetAdministrationShells desired value for the property assetAdministrationShells.
     */
    void setAssetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells);

    /**
     * Submodel
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Environment/submodels
     *
     * @return Returns the List of Submodels for the property submodels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Environment/submodels")
    List<Submodel> getSubmodels();

    /**
     * Submodel
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Environment/submodels
     *
     * @param submodels desired value for the property submodels.
     */
    void setSubmodels(List<Submodel> submodels);

    /**
     * Concept description
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Environment/conceptDescriptions
     *
     * @return Returns the List of ConceptDescriptions for the property conceptDescriptions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Environment/conceptDescriptions")
    List<ConceptDescription> getConceptDescriptions();

    /**
     * Concept description
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Environment/conceptDescriptions
     *
     * @param conceptDescriptions desired value for the property conceptDescriptions.
     */
    void setConceptDescriptions(List<ConceptDescription> conceptDescriptions);

    /**
     * Data specification
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Environment/dataSpecifications
     *
     * @return Returns the List of DataSpecifications for the property dataSpecifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Environment/dataSpecifications")
    List<DataSpecification> getDataSpecifications();

    /**
     * Data specification
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Environment/dataSpecifications
     *
     * @param dataSpecifications desired value for the property dataSpecifications.
     */
    void setDataSpecifications(List<DataSpecification> dataSpecifications);

}
