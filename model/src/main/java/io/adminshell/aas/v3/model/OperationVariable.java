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




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An operation variable is a submodel element that is used as input or output variable of an
 * operation.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperationVariable.class)
})
public interface OperationVariable {

    /**
     * Describes the needed argument for an operation via a submodel element of kind=Template.
     *
     * The submodel element value of an operation variable shall be of kind=Template.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/OperationVariable/value
     *
     * @return Returns the SubmodelElement for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/OperationVariable/value")
    SubmodelElement getValue();

    /**
     * Describes the needed argument for an operation via a submodel element of kind=Template.
     *
     * The submodel element value of an operation variable shall be of kind=Template.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/OperationVariable/value
     *
     * @param value desired value for the property value.
     */
    void setValue(SubmodelElement value);

}
