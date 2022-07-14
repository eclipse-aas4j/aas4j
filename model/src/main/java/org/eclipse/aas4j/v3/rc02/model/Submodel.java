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

package org.eclipse.aas4j.v3.rc02.model;

import java.util.List;



import org.eclipse.aas4j.v3.rc02.model.annotations.IRI;
import org.eclipse.aas4j.v3.rc02.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.rc02.model.impl.*;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultSubmodel;

/**
 * A submodel defines a specific aspect of the asset represented by the AAS.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodel.class)
})
public interface Submodel extends HasDataSpecification, HasKind, HasSemantics, Identifiable, Qualifiable {

    /**
     * A submodel consists of zero or more submodel elements.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Submodel/submodelElements
     *
     * @return Returns the List of SubmodelElements for the property submodelElements.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Submodel/submodelElements")
    List<SubmodelElement> getSubmodelElements();

    /**
     * A submodel consists of zero or more submodel elements.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Submodel/submodelElements
     *
     * @param submodelElements desired value for the property submodelElements.
     */
    void setSubmodelElements(List<SubmodelElement> submodelElements);

}
