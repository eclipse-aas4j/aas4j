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

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;

import java.util.List;


/**
 * In 'AssetInformation' identifying meta data of the asset that is represented by an AAS is
 * defined.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetInformation.class)
})
public interface AssetInformation {

    /**
     * Denotes whether the Asset is of kind 'Type' or 'Instance'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetInformation/assetKind
     *
     * @return Returns the AssetKind for the property assetKind.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetInformation/assetKind")
    AssetKind getAssetKind();

    /**
     * Denotes whether the Asset is of kind 'Type' or 'Instance'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetInformation/assetKind
     *
     * @param assetKind desired value for the property assetKind.
     */
    void setAssetKind(AssetKind assetKind);

    /**
     * Thumbnail of the asset represented by the Asset Administration Shell.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetInformation/defaultThumbnail
     *
     * @return Returns the Resource for the property defaultThumbnail.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetInformation/defaultThumbnail")
    Resource getDefaultThumbnail();

    /**
     * Thumbnail of the asset represented by the Asset Administration Shell.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetInformation/defaultThumbnail
     *
     * @param defaultThumbnail desired value for the property defaultThumbnail.
     */
    void setDefaultThumbnail(Resource defaultThumbnail);

    /**
     * Global identifier of the asset the AAS is representing.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetInformation/globalAssetId
     *
     * @return Returns the Reference for the property globalAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetInformation/globalAssetId")
    Reference getGlobalAssetId();

    /**
     * Global identifier of the asset the AAS is representing.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetInformation/globalAssetId
     *
     * @param globalAssetId desired value for the property globalAssetId.
     */
    void setGlobalAssetId(Reference globalAssetId);

    /**
     * Additional domain-specific, typically proprietary identifier for the asset like e.g., serial
     * number etc.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetInformation/specificAssetIds
     *
     * @return Returns the List of SpecificAssetIds for the property specificAssetIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetInformation/specificAssetIds")
    List<SpecificAssetId> getSpecificAssetIds();

    /**
     * Additional domain-specific, typically proprietary identifier for the asset like e.g., serial
     * number etc.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AssetInformation/specificAssetIds
     *
     * @param specificAssetIds desired value for the property specificAssetIds.
     */
    void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds);

}
