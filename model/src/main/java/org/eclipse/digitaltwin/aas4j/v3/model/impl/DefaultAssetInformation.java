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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.AssetInformationBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation
 * 
 * In 'AssetInformation' identifying meta data of the asset that is represented by an AAS is
 * defined.
 */

@IRI("aas:AssetInformation")
public class DefaultAssetInformation implements AssetInformation {

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetInformation/assetKind")
    protected AssetKind assetKind;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetInformation/defaultThumbnail")
    protected Resource defaultThumbnail;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetInformation/globalAssetId")
    protected Reference globalAssetId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetInformation/specificAssetIds")
    protected List<SpecificAssetId> specificAssetIds = new ArrayList<>();

    public DefaultAssetInformation() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.assetKind,
            this.defaultThumbnail,
            this.globalAssetId,
            this.specificAssetIds);
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
            return Objects.equals(this.assetKind, other.assetKind) &&
                Objects.equals(this.defaultThumbnail, other.defaultThumbnail) &&
                Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.specificAssetIds, other.specificAssetIds);
        }
    }

    @Override
    public AssetKind getAssetKind() {
        return assetKind;
    }

    @Override
    public void setAssetKind(AssetKind assetKind) {
        this.assetKind = assetKind;
    }

    @Override
    public Resource getDefaultThumbnail() {
        return defaultThumbnail;
    }

    @Override
    public void setDefaultThumbnail(Resource defaultThumbnail) {
        this.defaultThumbnail = defaultThumbnail;
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
    public List<SpecificAssetId> getSpecificAssetIds() {
        return specificAssetIds;
    }

    @Override
    public void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds) {
        this.specificAssetIds = specificAssetIds;
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
