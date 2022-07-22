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

import org.eclipse.aas4j.v3.model.*;

import java.util.List;

public abstract class DataSpecificationBuilder<T extends DataSpecification, B extends DataSpecificationBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for administration
     * 
     * @param administrativeInformation desired value to be set
     * @return Builder object with new value for name
     */
    public B administration(AdministrativeInformation administrativeInformation) {
        getBuildingInstance().setAdministration(administrativeInformation);
        return getSelf();
    }

    /**
     * This function allows setting a value for id
     * 
     * @param id desired value to be set
     * @return Builder object with new value for valueType
     */
    public B id(String id) {
        getBuildingInstance().setId(id);
        return getSelf();
    }

    /**
     * This function allows setting a value for dataSpecificationContent
     * 
     * @param dataSpecificationContent desired value to be set
     * @return Builder object with new value for value
     */
    public B dataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        getBuildingInstance().setDataSpecificationContent(dataSpecificationContent);
        return getSelf();
    }

    /**
     * This function allows setting a value for description
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for refersTo
     */
    public B descriptions(List<LangString> descriptions) {
        getBuildingInstance().setDescription(descriptions);
        return getSelf();
    }

}
