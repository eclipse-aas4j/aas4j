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
 * A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to
 * structure the virtual representation and technical functionality of an Administration Shell into
 * distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels
 * can become standardized and thus become submodels types. Submodels can have different
 * life-cycles. Describe the different types of Data related to the I4.0 Asset Constraint AASd-062:
 * The semanticId of a Submodel shall only reference a ConceptDescription with the category
 * APPLICATION_CLASS.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodel.class)
})
public interface Submodel extends Qualifiable, HasDataSpecification, Identifiable, HasKind, HasSemantics {

    /**
     * A submodel consists of zero or more submodel elements.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
     *
     * @return Returns the List of SubmodelElements for the property submodelElements.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement")
    List<SubmodelElement> getSubmodelElements();

    /**
     * A submodel consists of zero or more submodel elements.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
     *
     * @param submodelElements desired value for the property submodelElements.
     */
    void setSubmodelElements(List<SubmodelElement> submodelElements);

}
