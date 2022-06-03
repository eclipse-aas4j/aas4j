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

package org.eclipse.aas4j.v3.rc02.model;

import java.util.List;



import org.eclipse.aas4j.v3.rc02.model.annotations.IRI;
import org.eclipse.aas4j.v3.rc02.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.rc02.model.impl.*;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultOperation;

/**
 * An operation is a submodel element with input and output variables.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperation.class)
})
public interface Operation extends SubmodelElement {

    /**
     * Input parameter of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Operation/inputVariables
     *
     * @return Returns the List of OperationVariables for the property inputVariables.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Operation/inputVariables")
    List<OperationVariable> getInputVariables();

    /**
     * Input parameter of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Operation/inputVariables
     *
     * @param inputVariables desired value for the property inputVariables.
     */
    void setInputVariables(List<OperationVariable> inputVariables);

    /**
     * Output parameter of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Operation/outputVariables
     *
     * @return Returns the List of OperationVariables for the property outputVariables.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Operation/outputVariables")
    List<OperationVariable> getOutputVariables();

    /**
     * Output parameter of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Operation/outputVariables
     *
     * @param outputVariables desired value for the property outputVariables.
     */
    void setOutputVariables(List<OperationVariable> outputVariables);

    /**
     * Parameter that is input and output of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Operation/inoutputVariables
     *
     * @return Returns the List of OperationVariables for the property inoutputVariables.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Operation/inoutputVariables")
    List<OperationVariable> getInoutputVariables();

    /**
     * Parameter that is input and output of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Operation/inoutputVariables
     *
     * @param inoutputVariables desired value for the property inoutputVariables.
     */
    void setInoutputVariables(List<OperationVariable> inoutputVariables);

}
