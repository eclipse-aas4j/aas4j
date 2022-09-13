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

package org.eclipse.aas4j.v3.model;




import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.model.impl.DefaultEmbeddedDataSpecification;

/**
 * Data Specification Template
 */
@KnownSubtypes({
        @KnownSubtypes.Type(value = DefaultEmbeddedDataSpecification.class)
})
public interface EmbeddedDataSpecification {


    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecification
     *
     * @return Returns the Reference for the property dataSpecification.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecification")
    Reference getDataSpecification();

    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecifications
     *
     * @param dataSpecification desired value for the property dataSpecification.
     */
    void setDataSpecification(Reference dataSpecification);


    /**
     * The content of the template without meta data
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecificationContent
     *
     * @return Returns the DataSpecificationContent for the property dataSpecificationContent.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecificationContent")
    DataSpecificationIEC61360 getDataSpecificationContent();

    /**
     * The content of the template without meta data
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecificationContent
     *
     * @param dataSpecificationContent desired value for the property dataSpecificationContent.
     */
    void setDataSpecificationContent(DataSpecificationIEC61360 dataSpecificationContent);

}
