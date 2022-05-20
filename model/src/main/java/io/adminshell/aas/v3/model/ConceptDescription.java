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
 * The semantics of a property or other elements that may have a semantic description is defined by
 * a concept description. The description of the concept should follow a standardized schema
 * (realized as data specification template). Constraint AASd-051: A ConceptDescription shall have
 * one of the following categories: VALUE, PROPERTY, REFERENCE, DOCUMENT, CAPABILITY, RELATIONSHIP,
 * COLLECTION, FUNCTION, EVENT, ENTITY, APPLICATION_CLASS, QUALIFIER, VIEW. Default: PROPERTY.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultConceptDescription.class)
})
public interface ConceptDescription extends HasDataSpecification, Identifiable {

    /**
     * Link from a ConceptDescription to its explaining DataSpecificationContent.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content
     *
     * @return Returns the List of DataSpecificationContents for the property contents.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content")
    List<DataSpecificationContent> getContents();

    /**
     * Link from a ConceptDescription to its explaining DataSpecificationContent.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content
     *
     * @param contents desired value for the property contents.
     */
    void setContents(List<DataSpecificationContent> contents);

    /**
     * Reference to an external definition the concept is compatible to or was derived from.
     *
     * Compare to is-case-of relationship in ISO 13584-32 and IEC EN 61360.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf
     *
     * @return Returns the List of References for the property isCaseOfs.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
    List<Reference> getIsCaseOfs();

    /**
     * Reference to an external definition the concept is compatible to or was derived from.
     *
     * Compare to is-case-of relationship in ISO 13584-32 and IEC EN 61360.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf
     *
     * @param isCaseOfs desired value for the property isCaseOfs.
     */
    void setIsCaseOfs(List<Reference> isCaseOfs);

}
