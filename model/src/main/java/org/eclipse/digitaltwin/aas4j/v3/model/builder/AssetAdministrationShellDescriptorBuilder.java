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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.Endpoint;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;

import java.util.List;


public abstract class AssetAdministrationShellDescriptorBuilder<T extends AssetAdministrationShellDescriptor, B extends AssetAdministrationShellDescriptorBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for administration
     * 
     * @param administration desired value to be set
     * @return Builder object with new value for administration
     */
    public B administration(AdministrativeInformation administration) {
        getBuildingInstance().setAdministration(administration);
        return getSelf();
    }

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
     * This function allows setting a value for endpoints
     * 
     * @param endpoints desired value to be set
     * @return Builder object with new value for endpoints
     */
    public B endpoints(List<Endpoint> endpoints) {
        getBuildingInstance().setEndpoints(endpoints);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List endpoints
     * 
     * @param endpoints desired value to be added
     * @return Builder object with new value for endpoints
     */
    public B endpoints(Endpoint endpoints) {
        getBuildingInstance().getEndpoints().add(endpoints);
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
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public B idShort(String idShort) {
        getBuildingInstance().setIdShort(idShort);
        return getSelf();
    }

    /**
     * This function allows setting a value for id
     * 
     * @param id desired value to be set
     * @return Builder object with new value for id
     */
    public B id(String id) {
        getBuildingInstance().setId(id);
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
     * This function allows setting a value for submodelDescriptors
     * 
     * @param submodelDescriptors desired value to be set
     * @return Builder object with new value for submodelDescriptors
     */
    public B submodelDescriptors(List<SubmodelDescriptor> submodelDescriptors) {
        getBuildingInstance().setSubmodelDescriptors(submodelDescriptors);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List submodelDescriptors
     * 
     * @param submodelDescriptors desired value to be added
     * @return Builder object with new value for submodelDescriptors
     */
    public B submodelDescriptors(SubmodelDescriptor submodelDescriptors) {
        getBuildingInstance().getSubmodelDescriptors().add(submodelDescriptors);
        return getSelf();
    }

    /**
     * This function allows setting a value for description
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for description
     */
    public B description(List<LangStringTextType> descriptions) {
        getBuildingInstance().setDescription(descriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List description
     * 
     * @param description desired value to be added
     * @return Builder object with new value for description
     */
    public B description(LangStringTextType description) {
        getBuildingInstance().getDescription().add(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for displayName
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayName
     */
    public B displayName(List<LangStringNameType> displayNames) {
        getBuildingInstance().setDisplayName(displayNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List displayName
     * 
     * @param displayName desired value to be added
     * @return Builder object with new value for displayName
     */
    public B displayName(LangStringNameType displayName) {
        getBuildingInstance().getDisplayName().add(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for extensions
     * 
     * @param extensions desired value to be set
     * @return Builder object with new value for extensions
     */
    public B extensions(List<Extension> extensions) {
        getBuildingInstance().setExtensions(extensions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List extensions
     * 
     * @param extensions desired value to be added
     * @return Builder object with new value for extensions
     */
    public B extensions(Extension extensions) {
        getBuildingInstance().getExtensions().add(extensions);
        return getSelf();
    }
}
