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
package org.eclipse.aas4j.v3.rc02.dataformat.rdf.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.aas4j.v3.rc02.model.AssetKind;
import org.eclipse.aas4j.v3.rc02.model.File;
import org.eclipse.aas4j.v3.rc02.model.SpecificAssetId;
import org.eclipse.aas4j.v3.rc02.model.Reference;

import java.util.List;

@JsonTypeName("aas:AssetInformation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AssetInformationMixin {
    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    AssetKind getAssetKind();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    void setAssetKind(AssetKind assetKind);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    Reference getGlobalAssetId();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    void setGlobalAssetId(Reference globalAssetId);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId")
    List<SpecificAssetId> getSpecificAssetIds();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId")
    void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
    List<Reference> getBillOfMaterials();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
    void setBillOfMaterials(List<Reference> billOfMaterials);

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    File getDefaultThumbnail();

    @JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    void setDefaultThumbnail(File defaultThumbnail);
}
