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




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An element that has a globally unique identifier.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifiable.class),
    @KnownSubtypes.Type(value = Submodel.class),
    @KnownSubtypes.Type(value = Asset.class),
    @KnownSubtypes.Type(value = AssetAdministrationShell.class),
    @KnownSubtypes.Type(value = ConceptDescription.class)
})
public interface Identifiable extends Referable {

    /**
     * Administrative information of an identifiable element.
     *
     * Some of the administrative information like the version number might need to be part of the
     * identification.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     *
     * @return Returns the AdministrativeInformation for the property administration.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    AdministrativeInformation getAdministration();

    /**
     * Administrative information of an identifiable element.
     *
     * Some of the administrative information like the version number might need to be part of the
     * identification.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
     *
     * @param administration desired value for the property administration.
     */
    void setAdministration(AdministrativeInformation administration);

    /**
     * The globally unique identification of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     *
     * @return Returns the Identifier for the property identification.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    Identifier getIdentification();

    /**
     * The globally unique identification of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
     *
     * @param identification desired value for the property identification.
     */
    void setIdentification(Identifier identification);

}
