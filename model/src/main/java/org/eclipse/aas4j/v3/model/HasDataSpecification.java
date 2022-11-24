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

import java.util.List;



import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;

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
     * EmbeddedDataSpecifications used by the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecifications
     *
     * @return Returns the List of DataSpecifications for the property embeddedDataSpecifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecifications")
    List<EmbeddedDataSpecification> getEmbeddedDataSpecifications();

    /**
     * EmbeddedDataSpecifications used by the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecifications
     *
     * @param embeddedDataSpecifications desired value for the property embeddedDataSpecifications.
     */
    void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications);

}