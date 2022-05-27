/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * The asset may either represent an asset type or an asset instance. The asset has a globally
 * unique identifier plus - if needed - additional domain specific (proprietary) identifiers.
 * However, to support the corner case of very first phase of lifecycle where a stabilised/constant
 * global asset identifier does not already exist, the corresponding attribute 'globalAssetId' is
 * optional.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetInformation.class)
})
public interface AssetInformation {

    /**
     * Denotes whether the Asset of kind 'Type' or 'Instance'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind
     *
     * @return Returns the AssetKind for the property assetKind.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    AssetKind getAssetKind();

    /**
     * Denotes whether the Asset of kind 'Type' or 'Instance'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind
     *
     * @param assetKind desired value for the property assetKind.
     */
    void setAssetKind(AssetKind assetKind);

    /**
     * Reference to either an Asset object or a global reference to the asset the AAS is representing.
     * This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the
     * asset. In a first phase of the life cycle the asset might not yet have a global id but already an
     * internal identifier. The internal identifier would be modelled via 'externalAssetId'.
     *
     * Constraint AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or a
     * global reference.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId
     *
     * @return Returns the Reference for the property globalAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    Reference getGlobalAssetId();

    /**
     * Reference to either an Asset object or a global reference to the asset the AAS is representing.
     * This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the
     * asset. In a first phase of the life cycle the asset might not yet have a global id but already an
     * internal identifier. The internal identifier would be modelled via 'externalAssetId'.
     *
     * Constraint AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or a
     * global reference.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId
     *
     * @param globalAssetId desired value for the property globalAssetId.
     */
    void setGlobalAssetId(Reference globalAssetId);

    /**
     * Additional domain-specific, typically proprietary Identifier for the asset like e.g. serial
     * number etc.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId
     *
     * @return Returns the List of IdentifierKeyValuePairs for the property specificAssetIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId")
    List<IdentifierKeyValuePair> getSpecificAssetIds();

    /**
     * Additional domain-specific, typically proprietary Identifier for the asset like e.g. serial
     * number etc.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId
     *
     * @param specificAssetIds desired value for the property specificAssetIds.
     */
    void setSpecificAssetIds(List<IdentifierKeyValuePair> specificAssetIds);

    /**
     * A reference to a Submodel that defines the bill of material of the asset represented by the AAS.
     * This submodel contains a set of entities describing the material used to compose the composite
     * I4.0 Component.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial
     *
     * @return Returns the List of References for the property billOfMaterials.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
    List<Reference> getBillOfMaterials();

    /**
     * A reference to a Submodel that defines the bill of material of the asset represented by the AAS.
     * This submodel contains a set of entities describing the material used to compose the composite
     * I4.0 Component.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial
     *
     * @param billOfMaterials desired value for the property billOfMaterials.
     */
    void setBillOfMaterials(List<Reference> billOfMaterials);

    /**
     * Thumbnail of the asset represented by the asset administration shell.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail
     *
     * @return Returns the File for the property defaultThumbnail.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    File getDefaultThumbnail();

    /**
     * Thumbnail of the asset represented by the asset administration shell.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail
     *
     * @param defaultThumbnail desired value for the property defaultThumbnail.
     */
    void setDefaultThumbnail(File defaultThumbnail);

}
