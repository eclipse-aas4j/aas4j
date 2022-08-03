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

package org.eclipse.aas4j.v3.model.builder;

import java.util.List;


import org.eclipse.aas4j.v3.model.*;


public abstract class ConceptDescriptionBuilder<T extends ConceptDescription, B extends ConceptDescriptionBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for isCaseOf
     * 
     * @param isCaseOf desired value to be set
     * @return Builder object with new value for isCaseOf
     */
    public B isCaseOf(List<Reference> isCaseOf) {
        getBuildingInstance().setIsCaseOf(isCaseOf);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List isCaseOf
     * 
     * @param isCaseOf desired value to be added
     * @return Builder object with new value for isCaseOf
     */
    public B isCaseOf(Reference isCaseOf) {
        getBuildingInstance().getIsCaseOf().add(isCaseOf);
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
     * This function allows adding a value to the List embeddedDataSpecifications
     *
     * @param embeddedDataSpecifications desired value to be added
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(DataSpecification embeddedDataSpecifications) {
        getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecifications);
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
    public B displayNames(List<LangString> displayName) {
        getBuildingInstance().setDisplayNames(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for description
     * 
     * @param description desired value to be set
     * @return Builder object with new value for description
     */
    public B descriptions(List<LangString> description) {
        getBuildingInstance().setDescriptions(description);
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
