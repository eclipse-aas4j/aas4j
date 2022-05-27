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
import io.adminshell.aas.v3.rc02.model.impl.DefaultConceptDescription;

import java.util.List;

/**
 * The semantics of a property or other elements that may have a semantic description is defined by
 * a concept description.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultConceptDescription.class)
})
public interface ConceptDescription extends HasDataSpecification, Identifiable {

    /**
     * Reference to an external definition the concept is compatible to or was derived from.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/ConceptDescription/isCaseOf
     *
     * @return Returns the List of References for the property isCaseOfs.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/ConceptDescription/isCaseOf")
    List<Reference> getIsCaseOfs();

    /**
     * Reference to an external definition the concept is compatible to or was derived from.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/ConceptDescription/isCaseOf
     *
     * @param isCaseOfs desired value for the property isCaseOfs.
     */
    void setIsCaseOfs(List<Reference> isCaseOfs);

}
