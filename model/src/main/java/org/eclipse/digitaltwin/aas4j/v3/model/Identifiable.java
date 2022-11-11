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


/**
 * An element that has a globally unique identifier.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = AssetAdministrationShell.class),
    @KnownSubtypes.Type(value = ConceptDescription.class),
    @KnownSubtypes.Type(value = Submodel.class)
})
public interface Identifiable extends Referable {

    /**
     * Administrative information of an identifiable element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Identifiable/administration
     *
     * @return Returns the AdministrativeInformation for the property administration.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Identifiable/administration")
    AdministrativeInformation getAdministration();

    /**
     * Administrative information of an identifiable element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Identifiable/administration
     *
     * @param administration desired value for the property administration.
     */
    void setAdministration(AdministrativeInformation administration);

    /**
     * The globally unique identification of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Identifiable/id
     *
     * @return Returns the String for the property id.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Identifiable/id")
    String getId();

    /**
     * The globally unique identification of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Identifiable/id
     *
     * @param id desired value for the property id.
     */
    void setId(String id);

}
