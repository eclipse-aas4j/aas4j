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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import org.eclipse.digitaltwin.aas4j.v3.model.*;

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
     * This function allows setting a value for description
     * 
     * @param description desired value to be set
     * @return Builder object with new value for description
     */
    public B description(List<LangStringTextType> description) {
        getBuildingInstance().setDescription(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for displayName
     * 
     * @param displayName desired value to be set
     * @return Builder object with new value for displayName
     */
    public B displayName(List<LangStringNameType> displayName) {
        getBuildingInstance().setDisplayName(displayName);
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
     * This function allows setting a value for identification
     * 
     * @param id desired value to be set
     * @return Builder object with new value for identification
     */
    public B identification(String id) {
        getBuildingInstance().setId(id);
        return getSelf();
    }

    /**
     * This function allows setting a value for specificAssetId
     * 
     * @param specificAssetId desired value to be set
     * @return Builder object with new value for specificAssetId
     */
    public B specificAssetId(SpecificAssetId specificAssetId) {
        getBuildingInstance().setSpecificAssetIds(specificAssetId);
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
     * This function allows setting a value for submodelDescriptor
     *
     * @param submodelDescriptor desired value to be set
     * @return Builder object with new value for submodelDescriptor
     */
    public B submodelDescriptor(List<SubmodelDescriptor> submodelDescriptor) {
        getBuildingInstance().setSubmodelDescriptor(submodelDescriptor);
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
}
