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

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Reference to either a model element of the same or another AAs or to an external entity. A
 * reference is an ordered list of keys, each key referencing an element. The complete list of keys
 * may for example be concatenated to a path that then gives unique access to an element or entity.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultReference.class)
})
public interface Reference {

    /**
     * Unique reference in its name space.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Reference/key
     *
     * @return Returns the List of Keys for the property keys.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Reference/key")
    List<Key> getKeys();

    /**
     * Unique reference in its name space.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Reference/key
     *
     * @param keys desired value for the property keys.
     */
    void setKeys(List<Key> keys);

}
