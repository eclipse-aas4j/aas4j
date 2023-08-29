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
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

import java.util.List;


public abstract class AdministrativeInformationBuilder<T extends AdministrativeInformation, B extends AdministrativeInformationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for version
     * 
     * @param version desired value to be set
     * @return Builder object with new value for version
     */
    public B version(String version) {
        getBuildingInstance().setVersion(version);
        return getSelf();
    }

    /**
     * This function allows setting a value for revision
     * 
     * @param revision desired value to be set
     * @return Builder object with new value for revision
     */
    public B revision(String revision) {
        getBuildingInstance().setRevision(revision);
        return getSelf();
    }

    /**
     * This function allows setting a value for creator
     * 
     * @param creator desired value to be set
     * @return Builder object with new value for creator
     */
    public B creator(Reference creator) {
        getBuildingInstance().setCreator(creator);
        return getSelf();
    }

    /**
     * This function allows setting a value for templateId
     * 
     * @param templateId desired value to be set
     * @return Builder object with new value for templateId
     */
    public B templateId(String templateId) {
        getBuildingInstance().setTemplateId(templateId);
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
}
