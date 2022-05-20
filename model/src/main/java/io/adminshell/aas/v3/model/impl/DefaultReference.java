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

package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Reference
 * 
 * Reference to either a model element of the same or another AAs or to an external entity. A
 * reference is an ordered list of keys, each key referencing an element. The complete list of keys
 * may for example be concatenated to a path that then gives unique access to an element or entity.
 */

@IRI("aas:Reference")
public class DefaultReference implements Reference {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Reference/key")
    protected List<Key> keys = new ArrayList<>();

    public DefaultReference() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.keys);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultReference other = (DefaultReference) obj;
            return Objects.equals(this.keys, other.keys);
        }
    }

    @Override
    public List<Key> getKeys() {
        return keys;
    }

    @Override
    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    /**
     * This builder class can be used to construct a DefaultReference bean.
     */
    public static class Builder extends ReferenceBuilder<DefaultReference, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultReference newBuildingInstance() {
            return new DefaultReference();
        }
    }
}
