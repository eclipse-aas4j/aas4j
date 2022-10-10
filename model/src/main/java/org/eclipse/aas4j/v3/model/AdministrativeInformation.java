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
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;


/**
 * Administrative meta-information for an element like version information.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAdministrativeInformation.class)
})
public interface AdministrativeInformation extends HasDataSpecification {

    /**
     * Revision of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AdministrativeInformation/revision
     *
     * @return Returns the String for the property revision.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AdministrativeInformation/revision")
    String getRevision();

    /**
     * Revision of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AdministrativeInformation/revision
     *
     * @param revision desired value for the property revision.
     */
    void setRevision(String revision);

    /**
     * Version of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AdministrativeInformation/version
     *
     * @return Returns the String for the property version.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AdministrativeInformation/version")
    String getVersion();

    /**
     * Version of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/AdministrativeInformation/version
     *
     * @param version desired value for the property version.
     */
    void setVersion(String version);

}
