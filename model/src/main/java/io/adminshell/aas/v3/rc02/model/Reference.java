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
import io.adminshell.aas.v3.rc02.model.impl.DefaultReference;

import java.util.List;

/**
 * Reference to either a model element of the same or another AAS or to an external entity.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultReference.class)
})
public interface Reference {

    /**
     * Type of the reference.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Reference/type
     *
     * @return Returns the ReferenceTypes for the property type.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Reference/type")
    ReferenceTypes getType();

    /**
     * Type of the reference.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Reference/type
     *
     * @param type desired value for the property type.
     */
    void setType(ReferenceTypes type);

    /**
     * 'semanticId' of the referenced model element ('type' = 'ModelReference').
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Reference/referredSemanticId
     *
     * @return Returns the Reference for the property referredSemanticId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Reference/referredSemanticId")
    Reference getReferredSemanticId();

    /**
     * 'semanticId' of the referenced model element ('type' = 'ModelReference').
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Reference/referredSemanticId
     *
     * @param referredSemanticId desired value for the property referredSemanticId.
     */
    void setReferredSemanticId(Reference referredSemanticId);

    /**
     * Unique references in their name space.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Reference/keys
     *
     * @return Returns the List of Keys for the property keys.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Reference/keys")
    List<Key> getKeys();

    /**
     * Unique references in their name space.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Reference/keys
     *
     * @param keys desired value for the property keys.
     */
    void setKeys(List<Key> keys);

}
