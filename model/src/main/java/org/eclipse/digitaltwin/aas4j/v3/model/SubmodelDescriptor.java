/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/administration
     *
     * @return Returns the AdministrativeInformation for the property administration.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/administration")
    AdministrativeInformation getAdministration();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/administration
     *
     * @param administration desired value for the property administration.
     */
    void setAdministration(AdministrativeInformation administration);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/endpoints
     *
     * @return Returns the List of Endpoints for the property endpoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/endpoints")
    List<Endpoint> getEndpoints();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/endpoints
     *
     * @param endpoints desired value for the property endpoints.
     */
    void setEndpoints(List<Endpoint> endpoints);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/idShort
     *
     * @return Returns the String for the property idShort.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/idShort")
    String getIdShort();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/idShort
     *
     * @param idShort desired value for the property idShort.
     */
    void setIdShort(String idShort);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/id
     *
     * @return Returns the String for the property id.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/id")
    String getId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/id
     *
     * @param id desired value for the property id.
     */
    void setId(String id);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/semanticId
     *
     * @return Returns the Reference for the property semanticId.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/semanticId")
    Reference getSemanticId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/semanticId
     *
     * @param semanticId desired value for the property semanticId.
     */
    void setSemanticId(Reference semanticId);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/supplementalSemanticId
     *
     * @return Returns the List of References for the property supplementalSemanticId.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelDescriptor/supplementalSemanticId")
    List<Reference> getSupplementalSemanticId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelDescriptor/supplementalSemanticId
     *
     * @param supplementalSemanticIds desired value for the property supplementalSemanticId.
     */
    void setSupplementalSemanticId(List<Reference> supplementalSemanticIds);

}
