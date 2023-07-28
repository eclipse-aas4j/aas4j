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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


public abstract class OperationResultValueOnlyBuilder<T extends OperationResultValueOnly, B extends OperationResultValueOnlyBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for executionResult
     * 
     * @param executionResults desired value to be set
     * @return Builder object with new value for executionResult
     */
    public B executionResult(List<Result> executionResults) {
        getBuildingInstance().setExecutionResult(executionResults);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List executionResult
     * 
     * @param executionResult desired value to be added
     * @return Builder object with new value for executionResult
     */
    public B executionResult(Result executionResult) {
        getBuildingInstance().getExecutionResult().add(executionResult);
        return getSelf();
    }

    /**
     * This function allows setting a value for executionState
     * 
     * @param executionStates desired value to be set
     * @return Builder object with new value for executionState
     */
    public B executionState(List<ExecutionState> executionStates) {
        getBuildingInstance().setExecutionState(executionStates);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List executionState
     * 
     * @param executionState desired value to be added
     * @return Builder object with new value for executionState
     */
    public B executionState(ExecutionState executionState) {
        getBuildingInstance().getExecutionState().add(executionState);
        return getSelf();
    }

    /**
     * This function allows setting a value for inoutputArguments
     * 
     * @param inoutputArguments desired value to be set
     * @return Builder object with new value for inoutputArguments
     */
    public B inoutputArguments(List<String> inoutputArguments) {
        getBuildingInstance().setInoutputArguments(inoutputArguments);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List inoutputArguments
     * 
     * @param inoutputArguments desired value to be added
     * @return Builder object with new value for inoutputArguments
     */
    public B inoutputArguments(String inoutputArguments) {
        getBuildingInstance().getInoutputArguments().add(inoutputArguments);
        return getSelf();
    }

    /**
     * This function allows setting a value for outputArguments
     * 
     * @param outputArguments desired value to be set
     * @return Builder object with new value for outputArguments
     */
    public B outputArguments(List<String> outputArguments) {
        getBuildingInstance().setOutputArguments(outputArguments);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List outputArguments
     * 
     * @param outputArguments desired value to be added
     * @return Builder object with new value for outputArguments
     */
    public B outputArguments(String outputArguments) {
        getBuildingInstance().getOutputArguments().add(outputArguments);
        return getSelf();
    }

    /**
     * This function allows setting a value for requestId
     * 
     * @param requestIds desired value to be set
     * @return Builder object with new value for requestId
     */
    public B requestId(List<String> requestIds) {
        getBuildingInstance().setRequestId(requestIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List requestId
     * 
     * @param requestId desired value to be added
     * @return Builder object with new value for requestId
     */
    public B requestId(String requestId) {
        getBuildingInstance().getRequestId().add(requestId);
        return getSelf();
    }
}
