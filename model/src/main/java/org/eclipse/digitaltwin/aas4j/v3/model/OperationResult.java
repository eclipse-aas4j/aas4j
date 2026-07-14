/*
 * Copyright (c) 2026 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2026 SAP SE or an SAP affiliate company. All rights reserved.
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
 *
 * AI-assisted: This file was generated or updated with assistance from AI tools.
 */

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationResult;

import java.util.List;

/** */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultOperationResult.class)})
public interface OperationResult {

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/executionResult
   *
   * @return Returns the List of Results for the property executionResult.
   */
  @IRI("https://admin-shell.io/aas/3/2/OperationResult/executionResult")
  List<Result> getExecutionResult();

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/executionResult
   *
   * @param executionResults desired value for the property executionResult.
   */
  void setExecutionResult(List<Result> executionResults);

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/executionResult
   *
   * @param executionResult desired value to be added to the property executionResult.
   */
  void setExecutionResult(Result executionResult);

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/executionState
   *
   * @return Returns the List of ExecutionStates for the property executionState.
   */
  @IRI("https://admin-shell.io/aas/3/2/OperationResult/executionState")
  List<ExecutionState> getExecutionState();

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/executionState
   *
   * @param executionStates desired value for the property executionState.
   */
  void setExecutionState(List<ExecutionState> executionStates);

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/executionState
   *
   * @param executionState desired value to be added to the property executionState.
   */
  void setExecutionState(ExecutionState executionState);

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/inoutputArguments
   *
   * @return Returns the List of OperationVariables for the property inoutputArguments.
   */
  @IRI("https://admin-shell.io/aas/3/2/OperationResult/inoutputArguments")
  List<OperationVariable> getInoutputArguments();

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/inoutputArguments
   *
   * @param inoutputArguments desired value for the property inoutputArguments.
   */
  void setInoutputArguments(List<OperationVariable> inoutputArguments);

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/inoutputArguments
   *
   * @param inoutputArgument desired value to be added to the property inoutputArguments.
   */
  void setInoutputArgument(OperationVariable inoutputArgument);

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/outputArguments
   *
   * @return Returns the List of OperationVariables for the property outputArguments.
   */
  @IRI("https://admin-shell.io/aas/3/2/OperationResult/outputArguments")
  List<OperationVariable> getOutputArguments();

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/outputArguments
   *
   * @param outputArguments desired value for the property outputArguments.
   */
  void setOutputArguments(List<OperationVariable> outputArguments);

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/outputArguments
   *
   * @param outputArgument desired value to be added to the property outputArguments.
   */
  void setOutputArgument(OperationVariable outputArgument);

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/requestId
   *
   * @return Returns the List of Strings for the property requestId.
   */
  @IRI("https://admin-shell.io/aas/3/2/OperationResult/requestId")
  List<String> getRequestId();

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/requestId
   *
   * @param requestIds desired value for the property requestId.
   */
  void setRequestId(List<String> requestIds);

  /**
   * More information under https://admin-shell.io/aas/3/2/OperationResult/requestId
   *
   * @param requestId desired value to be added to the property requestId.
   */
  void setRequestId(String requestId);
}
