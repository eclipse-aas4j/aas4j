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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;

import java.util.List;


/**
 * A submodel defines a specific aspect of the asset represented by the AAS.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodel.class)
})
public interface Submodel extends Identifiable, HasDataSpecification, HasSemantics, Qualifiable, HasKind {

    /**
     * A submodel consists of zero or more submodel elements.
     *
     * More information under https://admin-shell.io/aas/3/0/Submodel/submodelElements
     *
     * @return Returns the List of SubmodelElements for the property submodelElements.
     */
    @IRI("https://admin-shell.io/aas/3/0/Submodel/submodelElements")
    List<SubmodelElement> getSubmodelElements();

    /**
     * A submodel consists of zero or more submodel elements.
     *
     * More information under https://admin-shell.io/aas/3/0/Submodel/submodelElements
     *
     * @param submodelElements desired value for the property submodelElements.
     */
    void setSubmodelElements(List<SubmodelElement> submodelElements);

}
