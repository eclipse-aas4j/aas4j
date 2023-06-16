/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023 SAP SE
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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;

import java.util.List;


public abstract class AssetInformationBuilder<T extends AssetInformation, B extends AssetInformationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetKind
     * 
     * @param assetKind desired value to be set
     * @return Builder object with new value for assetKind
     */
    public B assetKind(AssetKind assetKind) {
        getBuildingInstance().setAssetKind(assetKind);
        return getSelf();
    }

    /**
     * This function allows setting a value for globalAssetId
     * 
     * @param globalAssetId desired value to be set
     * @return Builder object with new value for globalAssetId
     */
    public B globalAssetId(String globalAssetId) {
        getBuildingInstance().setGlobalAssetId(globalAssetId);
        return getSelf();
    }

    /**
     * This function allows setting a value for specificAssetIds
     * 
     * @param specificAssetIds desired value to be set
     * @return Builder object with new value for specificAssetIds
     */
    public B specificAssetIds(List<SpecificAssetId> specificAssetIds) {
        getBuildingInstance().setSpecificAssetIds(specificAssetIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List specificAssetIds
     * 
     * @param specificAssetIds desired value to be added
     * @return Builder object with new value for specificAssetIds
     */
    public B specificAssetIds(SpecificAssetId specificAssetIds) {
        getBuildingInstance().getSpecificAssetIds().add(specificAssetIds);
        return getSelf();
    }

    /**
     * This function allows setting a value for assetType
     * 
     * @param assetType desired value to be set
     * @return Builder object with new value for assetType
     */
    public B assetType(String assetType) {
        getBuildingInstance().setAssetType(assetType);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultThumbnail
     * 
     * @param defaultThumbnail desired value to be set
     * @return Builder object with new value for defaultThumbnail
     */
    public B defaultThumbnail(Resource defaultThumbnail) {
        getBuildingInstance().setDefaultThumbnail(defaultThumbnail);
        return getSelf();
    }
}
