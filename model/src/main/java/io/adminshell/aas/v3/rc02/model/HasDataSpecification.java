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

package io.adminshell.aas.v3.rc02.model;

import io.adminshell.aas.v3.rc02.model.annotations.IRI;
import io.adminshell.aas.v3.rc02.model.annotations.KnownSubtypes;

import java.util.List;

/**
 * Element that can be extended by using data specification templates.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = AdministrativeInformation.class),
    @KnownSubtypes.Type(value = AssetAdministrationShell.class),
    @KnownSubtypes.Type(value = ConceptDescription.class),
    @KnownSubtypes.Type(value = SubmodelElement.class),
    @KnownSubtypes.Type(value = Submodel.class)
})
public interface HasDataSpecification {

    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecifications
     *
     * @return Returns the List of References for the property dataSpecifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecifications")
    List<Reference> getDataSpecifications();

    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecifications
     *
     * @param dataSpecifications desired value for the property dataSpecifications.
     */
    void setDataSpecifications(List<Reference> dataSpecifications);

}
