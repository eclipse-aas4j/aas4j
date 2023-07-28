/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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

package org.eclipse.digitaltwin.aas4j.v3.model;

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperationResultValueOnly.class)
})
public interface OperationResultValueOnly {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/executionResult
     *
     * @return Returns the List of Results for the property executionResult.
     */
    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/executionResult")
    List<Result> getExecutionResult();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/executionResult
     *
     * @param executionResults desired value for the property executionResult.
     */
    void setExecutionResult(List<Result> executionResults);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/executionState
     *
     * @return Returns the List of ExecutionStates for the property executionState.
     */
    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/executionState")
    List<ExecutionState> getExecutionState();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/executionState
     *
     * @param executionStates desired value for the property executionState.
     */
    void setExecutionState(List<ExecutionState> executionStates);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/inoutputArguments
     *
     * @return Returns the List of Strings for the property inoutputArguments.
     */
    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/inoutputArguments")
    List<String> getInoutputArguments();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/inoutputArguments
     *
     * @param inoutputArguments desired value for the property inoutputArguments.
     */
    void setInoutputArguments(List<String> inoutputArguments);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/outputArguments
     *
     * @return Returns the List of Strings for the property outputArguments.
     */
    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/outputArguments")
    List<String> getOutputArguments();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/outputArguments
     *
     * @param outputArguments desired value for the property outputArguments.
     */
    void setOutputArguments(List<String> outputArguments);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/requestId
     *
     * @return Returns the List of Strings for the property requestId.
     */
    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/requestId")
    List<String> getRequestId();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/OperationResultValueOnly/requestId
     *
     * @param requestIds desired value for the property requestId.
     */
    void setRequestId(List<String> requestIds);

}
