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

package org.eclipse.aas4j.v3.model.impl;

import java.util.Objects;


import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.aas4j.v3.model.OperationVariable
 * 
 * The value of an operation variable is a submodel element that is used as input and/or output
 * variable of an operation.
 */

@IRI("aas:OperationVariable")
public class DefaultOperationVariable implements OperationVariable {

    @IRI("https://admin-shell.io/aas/3/0/RC02/OperationVariable/value")
    protected SubmodelElement value;

    public DefaultOperationVariable() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
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
            DefaultOperationVariable other = (DefaultOperationVariable) obj;
            return Objects.equals(this.value, other.value);
        }
    }

    @Override
    public SubmodelElement getValue() {
        return value;
    }

    @Override
    public void setValue(SubmodelElement value) {
        this.value = value;
    }

    /**
     * This builder class can be used to construct a DefaultOperationVariable bean.
     */
    public static class Builder extends OperationVariableBuilder<DefaultOperationVariable, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultOperationVariable newBuildingInstance() {
            return new DefaultOperationVariable();
        }
    }
}
