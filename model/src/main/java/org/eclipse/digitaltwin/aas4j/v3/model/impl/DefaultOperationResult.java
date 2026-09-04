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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.ExecutionState;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.Result;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.OperationResultBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.OperationResult */
@IRI("aas:OperationResult")
public class DefaultOperationResult implements OperationResult {

  @IRI("https://admin-shell.io/aas/3/2/OperationResult/executionResult")
  protected List<Result> executionResult = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/OperationResult/executionState")
  protected List<ExecutionState> executionState = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/OperationResult/inoutputArguments")
  protected List<OperationVariable> inoutputArguments = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/OperationResult/outputArguments")
  protected List<OperationVariable> outputArguments = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/2/OperationResult/requestId")
  protected List<String> requestId = new ArrayList<>();

  public DefaultOperationResult() {}

  @Override
  public String toString() {
    return "DefaultOperationResult{"
        + "executionResult='"
        + executionResult
        + "',"
        + "executionState='"
        + executionState
        + "',"
        + "inoutputArguments='"
        + inoutputArguments
        + "',"
        + "outputArguments='"
        + outputArguments
        + "',"
        + "requestId='"
        + requestId
        + "',"
        + "}";
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.executionResult,
        this.executionState,
        this.inoutputArguments,
        this.outputArguments,
        this.requestId);
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
      DefaultOperationResult other = (DefaultOperationResult) obj;
      return Objects.equals(this.executionResult, other.executionResult)
          && Objects.equals(this.executionState, other.executionState)
          && Objects.equals(this.inoutputArguments, other.inoutputArguments)
          && Objects.equals(this.outputArguments, other.outputArguments)
          && Objects.equals(this.requestId, other.requestId);
    }
  }

  @Override
  public List<Result> getExecutionResult() {
    return executionResult;
  }

  @Override
  public void setExecutionResult(List<Result> executionResults) {
    this.executionResult = executionResults;
  }

  @Override
  public void setExecutionResult(Result executionResult) {
    this.executionResult.add(executionResult);
  }

  @Override
  public List<ExecutionState> getExecutionState() {
    return executionState;
  }

  @Override
  public void setExecutionState(List<ExecutionState> executionStates) {
    this.executionState = executionStates;
  }

  @Override
  public void setExecutionState(ExecutionState executionState) {
    this.executionState.add(executionState);
  }

  @Override
  public List<OperationVariable> getInoutputArguments() {
    return inoutputArguments;
  }

  @Override
  public void setInoutputArguments(List<OperationVariable> inoutputArguments) {
    this.inoutputArguments = inoutputArguments;
  }

  @Override
  public void setInoutputArgument(OperationVariable inoutputArgument) {
    this.inoutputArguments.add(inoutputArgument);
  }

  @Override
  public List<OperationVariable> getOutputArguments() {
    return outputArguments;
  }

  @Override
  public void setOutputArguments(List<OperationVariable> outputArguments) {
    this.outputArguments = outputArguments;
  }

  @Override
  public void setOutputArgument(OperationVariable outputArgument) {
    this.outputArguments.add(outputArgument);
  }

  @Override
  public List<String> getRequestId() {
    return requestId;
  }

  @Override
  public void setRequestId(List<String> requestIds) {
    this.requestId = requestIds;
  }

  @Override
  public void setRequestId(String requestId) {
    this.requestId.add(requestId);
  }

  /** This builder class can be used to construct a DefaultOperationResult bean. */
  public static class Builder extends OperationResultBuilder<DefaultOperationResult, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultOperationResult newBuildingInstance() {
      return new DefaultOperationResult();
    }
  }
}
