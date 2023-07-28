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

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


public abstract class ReferenceBuilder<T extends Reference, B extends ReferenceBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for type
     * 
     * @param type desired value to be set
     * @return Builder object with new value for type
     */
    public B type(ReferenceTypes type) {
        getBuildingInstance().setType(type);
        return getSelf();
    }

    /**
     * This function allows setting a value for referredSemanticId
     * 
     * @param referredSemanticId desired value to be set
     * @return Builder object with new value for referredSemanticId
     */
    public B referredSemanticId(Reference referredSemanticId) {
        getBuildingInstance().setReferredSemanticId(referredSemanticId);
        return getSelf();
    }

    /**
     * This function allows setting a value for keys
     * 
     * @param keys desired value to be set
     * @return Builder object with new value for keys
     */
    public B keys(List<Key> keys) {
        getBuildingInstance().setKeys(keys);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List keys
     * 
     * @param keys desired value to be added
     * @return Builder object with new value for keys
     */
    public B keys(Key keys) {
        getBuildingInstance().getKeys().add(keys);
        return getSelf();
    }
}
