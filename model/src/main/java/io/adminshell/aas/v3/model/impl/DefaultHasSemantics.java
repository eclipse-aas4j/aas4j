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

import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.HasSemantics
 * 
 * Element that can have a semantic definition. Identifier of the semantic definition of the
 * element. It is called semantic id of the element. The semantic id may either reference an
 * external global id or it may reference a referable model element of kind=Type that defines the
 * semantics of the element. In many cases the idShort is identical to the English short name within
 * the semantic definition as referenced vi aits semantic id.
 */

@IRI("aas:HasSemantics")
public class DefaultHasSemantics implements HasSemantics {

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    public DefaultHasSemantics() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.semanticId);
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
            DefaultHasSemantics other = (DefaultHasSemantics) obj;
            return Objects.equals(this.semanticId, other.semanticId);
        }
    }

    @Override
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    /**
     * This builder class can be used to construct a DefaultHasSemantics bean.
     */
    public static class Builder extends HasSemanticsBuilder<DefaultHasSemantics, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultHasSemantics newBuildingInstance() {
            return new DefaultHasSemantics();
        }
    }
}
