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

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;

import java.util.List;


/**
 * An asset administration shell.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShell.class)
})
public interface AssetAdministrationShell extends Identifiable, HasDataSpecification {

    /**
     * The reference to the AAS the AAS was derived from.
     *
     * More information under https://admin-shell.io/aas/3/0/AssetAdministrationShell/derivedFrom
     *
     * @return Returns the Reference for the property derivedFrom.
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShell/derivedFrom")
    Reference getDerivedFrom();

    /**
     * The reference to the AAS the AAS was derived from.
     *
     * More information under https://admin-shell.io/aas/3/0/AssetAdministrationShell/derivedFrom
     *
     * @param derivedFrom desired value for the property derivedFrom.
     */
    void setDerivedFrom(Reference derivedFrom);

    /**
     * Meta-information about the asset the AAS is representing.
     *
     * More information under https://admin-shell.io/aas/3/0/AssetAdministrationShell/assetInformation
     *
     * @return Returns the AssetInformation for the property assetInformation.
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShell/assetInformation")
    AssetInformation getAssetInformation();

    /**
     * Meta-information about the asset the AAS is representing.
     *
     * More information under https://admin-shell.io/aas/3/0/AssetAdministrationShell/assetInformation
     *
     * @param assetInformation desired value for the property assetInformation.
     */
    void setAssetInformation(AssetInformation assetInformation);

    /**
     * References to submodels of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/AssetAdministrationShell/submodels
     *
     * @return Returns the List of References for the property submodels.
     */
    @IRI("https://admin-shell.io/aas/3/0/AssetAdministrationShell/submodels")
    List<Reference> getSubmodels();

    /**
     * References to submodels of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/AssetAdministrationShell/submodels
     *
     * @param submodels desired value for the property submodels.
     */
    void setSubmodels(List<Reference> submodels);

}
