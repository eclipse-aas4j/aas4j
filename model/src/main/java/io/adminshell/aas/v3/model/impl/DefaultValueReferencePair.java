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
package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.ValueReferencePair
 * 
 * A value reference pair within a value list. Each value has a global unique id defining its
 * semantic.
 */

@IRI("aas:ValueReferencePair")
public class DefaultValueReferencePair implements ValueReferencePair {

    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/value")
    protected String value;

    @IRI("https://admin-shell.io/aas/3/0/RC01/ValueReferencePair/valueId")
    protected Reference valueId;

    public DefaultValueReferencePair() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.value,
            this.valueId);
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
            DefaultValueReferencePair other = (DefaultValueReferencePair) obj;
            return Objects.equals(this.value, other.value) &&
                Objects.equals(this.valueId, other.valueId);
        }
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Reference getValueId() {
        return valueId;
    }

    @Override
    public void setValueId(Reference valueId) {
        this.valueId = valueId;
    }

    /**
     * This builder class can be used to construct a DefaultValueReferencePair bean.
     */
    public static class Builder extends ValueReferencePairBuilder<DefaultValueReferencePair, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultValueReferencePair newBuildingInstance() {
            return new DefaultValueReferencePair();
        }
    }
}
