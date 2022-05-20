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

package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Element that can have be extended by using data specification templates. A data specification
 * template defines the additional attributes an element may or shall have. The data specifications
 * used are explicitly specified with their id. Constraint AASd-050: If the DataSpecificationContent
 * DataSpecificationIEC61360 is used for an element then the value of
 * hasDataSpecification/dataSpecification shall contain the global reference to the IRI of the
 * corresponding data specification template
 * https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/2/0.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultHasDataSpecification.class),
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = AdministrativeInformation.class),
    @KnownSubtypes.Type(value = Asset.class),
    @KnownSubtypes.Type(value = AssetAdministrationShell.class),
    @KnownSubtypes.Type(value = View.class),
    @KnownSubtypes.Type(value = SubmodelElement.class),
    @KnownSubtypes.Type(value = ConceptDescription.class)
})
public interface HasDataSpecification {

    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
     *
     * @return Returns the List of References for the property dataSpecifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    List<Reference> getDataSpecifications();

    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
     *
     * @param dataSpecifications desired value for the property dataSpecifications.
     */
    void setDataSpecifications(List<Reference> dataSpecifications);

}
