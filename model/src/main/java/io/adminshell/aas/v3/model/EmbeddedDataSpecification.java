/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Link to the included description of the Data Specification.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEmbeddedDataSpecification.class)
})
public interface EmbeddedDataSpecification {

    /**
     * Global reference to the data specification template used by the element. Reference points to a
     * Data Specification.
     *
     * Reference must point to a Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecification
     *
     * @return Returns the Reference for the property dataSpecification.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecification")
    Reference getDataSpecification();

    /**
     * Global reference to the data specification template used by the element. Reference points to a
     * Data Specification.
     *
     * Reference must point to a Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecification
     *
     * @param dataSpecification desired value for the property dataSpecification.
     */
    void setDataSpecification(Reference dataSpecification);

    /**
     * Property links to a Data Specification Content, which contains the formalized definitions
     * specifying this Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecificationContent
     *
     * @return Returns the DataSpecificationContent for the property dataSpecificationContent.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecificationContent")
    DataSpecificationContent getDataSpecificationContent();

    /**
     * Property links to a Data Specification Content, which contains the formalized definitions
     * specifying this Data Specification.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/EmbeddedDataSpecification/dataSpecificationContent
     *
     * @param dataSpecificationContent desired value for the property dataSpecificationContent.
     */
    void setDataSpecificationContent(DataSpecificationContent dataSpecificationContent);

}
