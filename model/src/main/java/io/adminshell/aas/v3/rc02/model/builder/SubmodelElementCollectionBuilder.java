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

package io.adminshell.aas.v3.rc02.model.builder;

import io.adminshell.aas.v3.rc02.model.*;

import java.util.List;

public abstract class SubmodelElementCollectionBuilder<T extends SubmodelElementCollection, B extends SubmodelElementCollectionBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public B values(List<SubmodelElement> values) {
        getBuildingInstance().setValues(values);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List values
     * 
     * @param value desired value to be added
     * @return Builder object with new value for values
     */
    public B value(SubmodelElement value) {
        getBuildingInstance().getValues().add(value);
        return getSelf();
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecifications(List<Reference> dataSpecifications) {
        getBuildingInstance().setDataSpecifications(dataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataSpecifications
     * 
     * @param dataSpecifications desired value to be added
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecifications(Reference dataSpecifications) {
        getBuildingInstance().getDataSpecifications().add(dataSpecifications);
        return getSelf();
    }

    /**
     * This function allows setting a value for kind
     * 
     * @param kind desired value to be set
     * @return Builder object with new value for kind
     */
    public B kind(ModelingKind kind) {
        getBuildingInstance().setKind(kind);
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

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public B qualifiers(List<Qualifier> qualifiers) {
        getBuildingInstance().setQualifiers(qualifiers);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List qualifiers
     * 
     * @param qualifiers desired value to be added
     * @return Builder object with new value for qualifiers
     */
    public B qualifiers(Qualifier qualifiers) {
        getBuildingInstance().getQualifiers().add(qualifiers);
        return getSelf();
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public B category(String category) {
        getBuildingInstance().setCategory(category);
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
     * This function allows setting a value for displayName
     * 
     * @param displayName desired value to be set
     * @return Builder object with new value for displayName
     */
    public B displayName(LangStringSet displayName) {
        getBuildingInstance().setDisplayName(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for description
     * 
     * @param description desired value to be set
     * @return Builder object with new value for description
     */
    public B description(LangStringSet description) {
        getBuildingInstance().setDescription(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for checksum
     * 
     * @param checksum desired value to be set
     * @return Builder object with new value for checksum
     */
    public B checksum(String checksum) {
        getBuildingInstance().setChecksum(checksum);
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
