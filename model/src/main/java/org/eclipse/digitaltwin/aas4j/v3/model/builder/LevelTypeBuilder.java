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


import org.eclipse.digitaltwin.aas4j.v3.model.LevelType;


public abstract class LevelTypeBuilder<T extends LevelType, B extends LevelTypeBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for max
     * 
     * @param max desired value to be set
     * @return Builder object with new value for max
     */
    public B max(boolean max) {
        getBuildingInstance().setMax(max);
        return getSelf();
    }

    /**
     * This function allows setting a value for min
     * 
     * @param min desired value to be set
     * @return Builder object with new value for min
     */
    public B min(boolean min) {
        getBuildingInstance().setMin(min);
        return getSelf();
    }

    /**
     * This function allows setting a value for nom
     * 
     * @param nom desired value to be set
     * @return Builder object with new value for nom
     */
    public B nom(boolean nom) {
        getBuildingInstance().setNom(nom);
        return getSelf();
    }

    /**
     * This function allows setting a value for typ
     * 
     * @param typ desired value to be set
     * @return Builder object with new value for typ
     */
    public B typ(boolean typ) {
        getBuildingInstance().setTyp(typ);
        return getSelf();
    }
}
