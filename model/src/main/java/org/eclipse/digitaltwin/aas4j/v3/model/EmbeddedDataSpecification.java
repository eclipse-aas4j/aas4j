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

package org.eclipse.digitaltwin.aas4j.v3.model;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEmbeddedDataSpecification;


/**
 * Embed the content of a data specification.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEmbeddedDataSpecification.class)
})
public interface EmbeddedDataSpecification {

    /**
     * Reference to the data specification
     *
     * More information under https://admin-shell.io/aas/3/0/EmbeddedDataSpecification/dataSpecification
     *
     * @return Returns the Reference for the property dataSpecification.
     */
    @IRI("https://admin-shell.io/aas/3/0/EmbeddedDataSpecification/dataSpecification")
    Reference getDataSpecification();

    /**
     * Reference to the data specification
     *
     * More information under https://admin-shell.io/aas/3/0/EmbeddedDataSpecification/dataSpecification
     *
     * @param dataSpecification desired value for the property dataSpecification.
     */
    void setDataSpecification(Reference dataSpecification);

    /**
     * Actual content of the data specification
     *
     * More information under
     * https://admin-shell.io/aas/3/0/EmbeddedDataSpecification/dataSpecificationContent
     *
     * @return Returns the DataSpecificationContent for the property dataSpecificationContent.
     */
    @IRI("https://admin-shell.io/aas/3/0/EmbeddedDataSpecification/dataSpecificationContent")
    DataSpecificationContent getDataSpecificationContent();

    /**
     * Actual content of the data specification
     *
     * More information under
     * https://admin-shell.io/aas/3/0/EmbeddedDataSpecification/dataSpecificationContent
     *
     * @param dataSpecificationContent desired value for the property dataSpecificationContent.
     */
    void setDataSpecificationContent(DataSpecificationContent dataSpecificationContent);

}
