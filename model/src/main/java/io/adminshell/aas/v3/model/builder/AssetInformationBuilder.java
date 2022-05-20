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

package io.adminshell.aas.v3.model.builder;

import java.util.List;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class AssetInformationBuilder<T extends AssetInformation, B extends AssetInformationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetKinds
     * 
     * @param assetKinds desired value to be set
     * @return Builder object with new value for assetKinds
     */
    public B assetKinds(List<AssetKind> assetKinds) {
        getBuildingInstance().setAssetKinds(assetKinds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List assetKinds
     * 
     * @param assetKind desired value to be added
     * @return Builder object with new value for assetKinds
     */
    public B assetKind(AssetKind assetKind) {
        getBuildingInstance().getAssetKinds().add(assetKind);
        return getSelf();
    }

    /**
     * This function allows setting a value for globalAssetId
     * 
     * @param globalAssetId desired value to be set
     * @return Builder object with new value for globalAssetId
     */
    public B globalAssetId(Reference globalAssetId) {
        getBuildingInstance().setGlobalAssetId(globalAssetId);
        return getSelf();
    }

    /**
     * This function allows setting a value for externalAssetIds
     * 
     * @param externalAssetIds desired value to be set
     * @return Builder object with new value for externalAssetIds
     */
    public B externalAssetIds(List<IdentifierKeyValuePair> externalAssetIds) {
        getBuildingInstance().setExternalAssetIds(externalAssetIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List externalAssetIds
     * 
     * @param externalAssetId desired value to be added
     * @return Builder object with new value for externalAssetIds
     */
    public B externalAssetId(IdentifierKeyValuePair externalAssetId) {
        getBuildingInstance().getExternalAssetIds().add(externalAssetId);
        return getSelf();
    }

    /**
     * This function allows setting a value for billOfMaterials
     * 
     * @param billOfMaterials desired value to be set
     * @return Builder object with new value for billOfMaterials
     */
    public B billOfMaterials(List<Reference> billOfMaterials) {
        getBuildingInstance().setBillOfMaterials(billOfMaterials);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List billOfMaterials
     * 
     * @param billOfMaterial desired value to be added
     * @return Builder object with new value for billOfMaterials
     */
    public B billOfMaterial(Reference billOfMaterial) {
        getBuildingInstance().getBillOfMaterials().add(billOfMaterial);
        return getSelf();
    }

    /**
     * This function allows setting a value for thumbnail
     * 
     * @param thumbnail desired value to be set
     * @return Builder object with new value for thumbnail
     */
    public B thumbnail(File thumbnail) {
        getBuildingInstance().setThumbnail(thumbnail);
        return getSelf();
    }
}
