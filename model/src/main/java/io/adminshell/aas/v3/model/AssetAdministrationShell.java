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

package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Describes the Administration Shell for Assets, Products, Components, e.g. Machines
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShell.class)
})
public interface AssetAdministrationShell extends HasDataSpecification, Identifiable {

    /**
     * Meta information about the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     *
     * @return Returns the AssetInformation for the property assetInformation.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    AssetInformation getAssetInformation();

    /**
     * Meta information about the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
     *
     * @param assetInformation desired value for the property assetInformation.
     */
    void setAssetInformation(AssetInformation assetInformation);

    /**
     * This relation connects instances of AAS with their respective types. Refer to Asset Kind for
     * further information of instance and type kinds.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
     *
     * @return Returns the Reference for the property derivedFrom.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
    Reference getDerivedFrom();

    /**
     * This relation connects instances of AAS with their respective types. Refer to Asset Kind for
     * further information of instance and type kinds.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
     *
     * @param derivedFrom desired value for the property derivedFrom.
     */
    void setDerivedFrom(Reference derivedFrom);

    /**
     * Definition of the security relevant aspects of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
     *
     * @return Returns the Security for the property security.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
    Security getSecurity();

    /**
     * Definition of the security relevant aspects of the AAS.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
     *
     * @param security desired value for the property security.
     */
    void setSecurity(Security security);

    /**
     * Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     *
     * @return Returns the List of References for the property submodels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    List<Reference> getSubmodels();

    /**
     * Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
     *
     * @param submodels desired value for the property submodels.
     */
    void setSubmodels(List<Reference> submodels);

    /**
     * Points to the differents views associated to the Administration Shell via the Submodels.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
     *
     * @return Returns the List of Views for the property views.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
    List<View> getViews();

    /**
     * Points to the differents views associated to the Administration Shell via the Submodels.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
     *
     * @param views desired value for the property views.
     */
    void setViews(List<View> views);

}
