/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model;

import java.util.Collection;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A submodel element collection is a set or list of submodel elements. Constraint AASd-059: If the
 * semanticId of a SubmodelElementCollection references a ConceptDescription then the category of
 * the ConceptDescription shall be COLLECTION or ENTITY. Constraint AASd-092: If the semanticId of a
 * SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == false references a
 * ConceptDescription then the ConceptDescription/category shall be ENTITY. Constraint AASd-093: If
 * the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates ==
 * true references a ConceptDescription then the ConceptDescription/category shall be COLLECTION.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodelElementCollection.class)
})
public interface SubmodelElementCollection extends SubmodelElement {

    /**
     * If allowDuplicates=true then it is allowed that the collection contains the same element several
     * times. Default = false
     *
     * Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection
     * contains several elements with the same semantics (i.e. the same semanticId).
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates
     *
     * @return Returns the boolean for the property allowDuplicates.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
    boolean getAllowDuplicates();

    /**
     * If allowDuplicates=true then it is allowed that the collection contains the same element several
     * times. Default = false
     *
     * Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection
     * contains several elements with the same semantics (i.e. the same semanticId).
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates
     *
     * @param allowDuplicates desired value for the property allowDuplicates.
     */
    void setAllowDuplicates(boolean allowDuplicates);

    /**
     * If ordered=false then the elements in the property collection are not ordered. If ordered=true
     * then the elements in the collection are ordered. Default = false
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered
     *
     * @return Returns the boolean for the property ordered.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
    boolean getOrdered();

    /**
     * If ordered=false then the elements in the property collection are not ordered. If ordered=true
     * then the elements in the collection are ordered. Default = false
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered
     *
     * @param ordered desired value for the property ordered.
     */
    void setOrdered(boolean ordered);

    /**
     * Submodel element contained in the collection.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value
     *
     * @return Returns the Collection of SubmodelElements for the property values.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
    Collection<SubmodelElement> getValues();

    /**
     * Submodel element contained in the collection.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value
     *
     * @param values desired value for the property values.
     */
    void setValues(Collection<SubmodelElement> values);

}
