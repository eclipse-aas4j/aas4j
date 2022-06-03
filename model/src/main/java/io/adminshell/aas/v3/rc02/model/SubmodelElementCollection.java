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
import io.adminshell.aas.v3.rc02.model.impl.DefaultSubmodelElementCollection;

import java.util.List;

/**
 * A submodel element collection is a kind of struct, i.e. a a logical encapsulation of multiple
 * named values. It has a fixed number of submodel elements.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodelElementCollection.class)
})
public interface SubmodelElementCollection extends SubmodelElement {

    /**
     * Submodel element contained in the collection.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelElementCollection/value
     *
     * @return Returns the List of SubmodelElements for the property values.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/SubmodelElementCollection/value")
    List<SubmodelElement> getValues();

    /**
     * Submodel element contained in the collection.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/SubmodelElementCollection/value
     *
     * @param values desired value for the property values.
     */
    void setValues(List<SubmodelElement> values);

}
