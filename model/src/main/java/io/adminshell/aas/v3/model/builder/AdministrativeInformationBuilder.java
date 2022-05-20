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

package io.adminshell.aas.v3.model.builder;

import java.util.List;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

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
     * @param dataSpecification desired value to be added
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecification(Reference dataSpecification) {
        getBuildingInstance().getDataSpecifications().add(dataSpecification);
        return getSelf();
    }
}
