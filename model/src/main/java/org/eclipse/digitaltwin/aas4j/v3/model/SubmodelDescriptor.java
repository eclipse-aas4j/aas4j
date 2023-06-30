/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelDescriptor;

import java.util.List;

/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodelDescriptor.class)
})
public interface SubmodelDescriptor extends Descriptor {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/administration
     *
     * @return Returns the AdministrativeInformation for the property administration.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/administration")
    AdministrativeInformation getAdministration();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/administration
     *
     * @param administration desired value for the property administration.
     */
    void setAdministration(AdministrativeInformation administration);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/description
     *
     * @return Returns the LangStringSet for the property description.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/description")
    List<LangString> getDescription();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/description
     *
     * @param description desired value for the property description.
     */
    void setDescription(List<LangString> description);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/displayName
     *
     * @return Returns the LangStringSet for the property displayName.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/displayName")
    List<LangString> getDisplayName();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/displayName
     *
     * @param displayName desired value for the property displayName.
     */
    void setDisplayName(List<LangString> displayName);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/idShort
     *
     * @return Returns the String for the property idShort.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/idShort")
    String getIdShort();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/idShort
     *
     * @param idShort desired value for the property idShort.
     */
    void setIdShort(String idShort);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/identification
     *
     * @return Returns the String for the property identification.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/identification")
    String getIdentification();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/identification
     *
     * @param identification desired value for the property identification.
     */
    void setIdentification(String identification);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/semanticId
     *
     * @return Returns the Reference for the property semanticId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/semanticId")
    Reference getSemanticId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelDescriptor/semanticId
     *
     * @param semanticId desired value for the property semanticId.
     */
    void setSemanticId(Reference semanticId);

}
