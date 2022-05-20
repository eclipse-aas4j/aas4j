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

package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.AssetInformation
 * 
 * In AssetInformation identifying meta data of the asset that is represented by an AAS is defined.
 * The asset may either represent an asset type or an asset instance. The asset has a globally
 * unique identifier plus - if needed - additional domain specific (proprietary) identifiers.
 * However, to support the corner case of very first phase of lifecycle where a stabilised/constant
 * global asset identifier does not already exist, the corresponding attribute 'globalAssetId' is
 * optional.
 */

@IRI("aas:AssetInformation")
public class DefaultAssetInformation implements AssetInformation {

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    protected List<AssetKind> assetKinds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
    protected List<Reference> billOfMaterials = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/externalAssetId")
    protected List<IdentifierKeyValuePair> externalAssetIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    protected Reference globalAssetId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/thumbnail")
    protected File thumbnail;

    public DefaultAssetInformation() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.assetKinds,
            this.globalAssetId,
            this.externalAssetIds,
            this.billOfMaterials,
            this.thumbnail);
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
            DefaultAssetInformation other = (DefaultAssetInformation) obj;
            return Objects.equals(this.assetKinds, other.assetKinds) &&
                Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.externalAssetIds, other.externalAssetIds) &&
                Objects.equals(this.billOfMaterials, other.billOfMaterials) &&
                Objects.equals(this.thumbnail, other.thumbnail);
        }
    }

    @Override
    public List<AssetKind> getAssetKinds() {
        return assetKinds;
    }

    @Override
    public void setAssetKinds(List<AssetKind> assetKinds) {
        this.assetKinds = assetKinds;
    }

    @Override
    public Reference getGlobalAssetId() {
        return globalAssetId;
    }

    @Override
    public void setGlobalAssetId(Reference globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @Override
    public List<IdentifierKeyValuePair> getExternalAssetIds() {
        return externalAssetIds;
    }

    @Override
    public void setExternalAssetIds(List<IdentifierKeyValuePair> externalAssetIds) {
        this.externalAssetIds = externalAssetIds;
    }

    @Override
    public List<Reference> getBillOfMaterials() {
        return billOfMaterials;
    }

    @Override
    public void setBillOfMaterials(List<Reference> billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }

    @Override
    public File getThumbnail() {
        return thumbnail;
    }

    @Override
    public void setThumbnail(File thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * This builder class can be used to construct a DefaultAssetInformation bean.
     */
    public static class Builder extends AssetInformationBuilder<DefaultAssetInformation, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetInformation newBuildingInstance() {
            return new DefaultAssetInformation();
        }
    }
}
