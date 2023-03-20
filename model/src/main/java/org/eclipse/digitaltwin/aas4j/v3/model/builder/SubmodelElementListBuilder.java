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

import org.eclipse.digitaltwin.aas4j.v3.model.*;

import java.util.List;


public abstract class SubmodelElementListBuilder<T extends SubmodelElementList, B extends SubmodelElementListBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for orderRelevant
     * 
     * @param orderRelevant desired value to be set
     * @return Builder object with new value for orderRelevant
     */
    public B orderRelevant(boolean orderRelevant) {
        getBuildingInstance().setOrderRelevant(orderRelevant);
        return getSelf();
    }

    /**
     * This function allows setting a value for semanticIDListElement
     * 
     * @param semanticIDListElement desired value to be set
     * @return Builder object with new value for semanticIDListElement
     */
    public B semanticIDListElement(Reference semanticIDListElement) {
        getBuildingInstance().setSemanticIDListElement(semanticIDListElement);
        return getSelf();
    }

    /**
     * This function allows setting a value for typeValueListElement
     * 
     * @param typeValueListElement desired value to be set
     * @return Builder object with new value for typeValueListElement
     */
    public B typeValueListElement(AASSubmodelElements typeValueListElement) {
        getBuildingInstance().setTypeValueListElement(typeValueListElement);
        return getSelf();
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public B value(List<SubmodelElement> value) {
        getBuildingInstance().setValue(value);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List value
     * 
     * @param value desired value to be added
     * @return Builder object with new value for value
     */
    public B value(SubmodelElement value) {
        getBuildingInstance().getValue().add(value);
        return getSelf();
    }

    /**
     * This function allows setting a value for valueTypeListElement
     * 
     * @param valueTypeListElement desired value to be set
     * @return Builder object with new value for valueTypeListElement
     */
    public B valueTypeListElement(DataTypeDefXSD valueTypeListElement) {
        getBuildingInstance().setValueTypeListElement(valueTypeListElement);
        return getSelf();
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        getBuildingInstance().setEmbeddedDataSpecifications(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be added
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(EmbeddedDataSpecification embeddedDataSpecifications) {
        getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows setting a value for semanticID
     * 
     * @param semanticID desired value to be set
     * @return Builder object with new value for semanticID
     */
    public B semanticID(Reference semanticID) {
        getBuildingInstance().setSemanticID(semanticID);
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
     * @param displayName desired value to be set
     * @return Builder object with new value for displayName
     */
    public B displayName(List<LangStringNameType> displayName) {
        getBuildingInstance().setDisplayName(displayName);
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
}
