/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
<<<<<<< HEAD
 * Copyright (c) 2023 SAP SE
=======
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
>>>>>>> 32df45a2ecc2825513496d22d7e5423aa8744bba
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

import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;

import java.util.List;


public abstract class SpecificAssetIdBuilder<T extends SpecificAssetId, B extends SpecificAssetIdBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for name
     * 
     * @param name desired value to be set
     * @return Builder object with new value for name
     */
    public B name(String name) {
        getBuildingInstance().setName(name);
        return getSelf();
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public B value(String value) {
        getBuildingInstance().setValue(value);
        return getSelf();
    }

    /**
     * This function allows setting a value for externalSubjectId
     * 
     * @param externalSubjectId desired value to be set
     * @return Builder object with new value for externalSubjectId
     */
    public B externalSubjectId(Reference externalSubjectId) {
        getBuildingInstance().setExternalSubjectId(externalSubjectId);
        return getSelf();
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public B semanticId(Reference semanticId) {
        getBuildingInstance().setSemanticId(semanticId);
        return getSelf();
    }

    /**
     * This function allows setting a value for supplementalSemanticIds
     * 
     * @param supplementalSemanticIds desired value to be set
     * @return Builder object with new value for supplementalSemanticIds
     */
    public B supplementalSemanticIds(List<Reference> supplementalSemanticIds) {
        getBuildingInstance().setSupplementalSemanticIds(supplementalSemanticIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List supplementalSemanticIds
     * 
     * @param supplementalSemanticIds desired value to be added
     * @return Builder object with new value for supplementalSemanticIds
     */
    public B supplementalSemanticIds(Reference supplementalSemanticIds) {
        getBuildingInstance().getSupplementalSemanticIds().add(supplementalSemanticIds);
        return getSelf();
    }
}
