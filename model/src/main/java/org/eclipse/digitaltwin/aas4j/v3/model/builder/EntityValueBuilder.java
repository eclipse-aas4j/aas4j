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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


public abstract class EntityValueBuilder<T extends EntityValue, B extends EntityValueBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for entityType
     * 
     * @param entityType desired value to be set
     * @return Builder object with new value for entityType
     */
    public B entityType(EntityType entityType) {
        getBuildingInstance().setEntityType(entityType);
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
    public B specificAssetIds(List<SpecificAssetIdValue> specificAssetIds) {
        getBuildingInstance().setSpecificAssetIds(specificAssetIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List specificAssetIds
     * 
     * @param specificAssetIds desired value to be added
     * @return Builder object with new value for specificAssetIds
     */
    public B specificAssetIds(SpecificAssetIdValue specificAssetIds) {
        getBuildingInstance().getSpecificAssetIds().add(specificAssetIds);
        return getSelf();
    }

    /**
     * This function allows setting a value for statements
     * 
     * @param statements desired value to be set
     * @return Builder object with new value for statements
     */
    public B statements(ValueOnly statements) {
        getBuildingInstance().setStatements(statements);
        return getSelf();
    }
}
