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
 * Default implementation of package io.adminshell.aas.v3.model.HasKind
 * 
 * An element with a kind is an element that can either represent a type or an instance. Default for
 * an element is that it is representing an instance.
 */

@IRI("aas:HasKind")
public class DefaultHasKind implements HasKind {

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    protected ModelingKind kind;

    public DefaultHasKind() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.kind);
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
            DefaultHasKind other = (DefaultHasKind) obj;
            return Objects.equals(this.kind, other.kind);
        }
    }

    @Override
    public ModelingKind getKind() {
        return kind;
    }

    @Override
    public void setKind(ModelingKind kind) {
        this.kind = kind;
    }

    /**
     * This builder class can be used to construct a DefaultHasKind bean.
     */
    public static class Builder extends HasKindBuilder<DefaultHasKind, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultHasKind newBuildingInstance() {
            return new DefaultHasKind();
        }
    }
}
