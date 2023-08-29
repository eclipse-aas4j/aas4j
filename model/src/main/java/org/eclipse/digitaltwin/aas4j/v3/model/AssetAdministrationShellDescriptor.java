/*
 * Copyright (c) 2023 SAP SE
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

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShellDescriptor;

import java.util.List;

/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShellDescriptor.class)
})
public interface AssetAdministrationShellDescriptor extends Descriptor {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/administration
     *
     * @return Returns the AdministrativeInformation for the property administration.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/administration")
    AdministrativeInformation getAdministration();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/administration
     *
     * @param administration desired value for the property administration.
     */
    void setAdministration(AdministrativeInformation administration);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/description
     *
     * @return Returns the LangStringSet for the property description.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/description")
    List<LangStringTextType> getDescription();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/description
     *
     * @param description desired value for the property description.
     */
    void setDescription(List<LangStringTextType> description);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/displayName
     *
     * @return Returns the LangStringSet for the property displayName.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/displayName")
    List<LangStringNameType> getDisplayName();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/displayName
     *
     * @param displayName desired value for the property displayName.
     */
    void setDisplayName(List<LangStringNameType> displayName);


    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/globalAssetId
     *
     * @return Returns the String for the property idShort.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/globalAssetId")
    Reference getGlobalAssetId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/globalAssetId
     *
     * @param globalAssetId desired value for the property globalAssetId.
     */
    void setGlobalAssetId(Reference globalAssetId);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/idShort
     *
     * @return Returns the String for the property idShort.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/idShort")
    String getIdShort();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/idShort
     *
     * @param idShort desired value for the property idShort.
     */
    void setIdShort(String idShort);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/id
     *
     * @return Returns the String for the property identification.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/id")
    String getId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/id
     *
     * @param id desired value for the property identification.
     */
    void setId(String id);


    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/assetKind
     *
     * @return Returns the AssetKind for the property assetKind.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/assetKind")
    AssetKind getAssetKind();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/assetKind
     *
     * @param assetKind desired value for the property assetKind.
     */
    void setAssetKind(AssetKind assetKind);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/specificAssetId
     *
     * @return Returns the String for the property specificAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/specificAssetIds")
    SpecificAssetId getSpecificAssetIds();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/specificAssetIds
     *
     * @param specificAssetIds desired value for the property specificAssetIds.
     */
    void setSpecificAssetIds(SpecificAssetId specificAssetIds);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/submodelDescriptor
     *
     * @return Returns the String for the property submodelDescriptor.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/submodelDescriptor")
    List<SubmodelDescriptor> getSubmodelDescriptor();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/submodelDescriptor
     *
     * @param submodelDescriptor desired value for the property submodelDescriptor.
     */
    void setSubmodelDescriptor(List<SubmodelDescriptor> submodelDescriptor);

}
