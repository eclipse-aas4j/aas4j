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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.ExecutionState;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.Result;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.OperationResultBuilder;

import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.OperationResult
 * 
 */

@IRI("aas:OperationResult")
public class DefaultOperationResult implements OperationResult {

    @IRI("https://admin-shell.io/aas/3/0/OperationResult/executionResult")
    protected Result executionResult;

    @IRI("https://admin-shell.io/aas/3/0/OperationResult/executionState")
    protected ExecutionState executionState;

    @IRI("https://admin-shell.io/aas/3/0/OperationResult/inoutputArguments")
    protected OperationVariable inoutputArguments;

    @IRI("https://admin-shell.io/aas/3/0/OperationResult/outputArguments")
    protected OperationVariable outputArguments;

    @IRI("https://admin-shell.io/aas/3/0/OperationResult/requestId")
    protected String requestId;

    public DefaultOperationResult() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.executionResult,
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
            return Objects.equals(this.executionResult, other.executionResult) &&
                Objects.equals(this.executionState, other.executionState) &&
                Objects.equals(this.inoutputArguments, other.inoutputArguments) &&
                Objects.equals(this.outputArguments, other.outputArguments) &&
                Objects.equals(this.requestId, other.requestId);
        }
    }

    @Override
    public Result getExecutionResult() {
        return executionResult;
    }

    @Override
    public void setExecutionResult(Result executionResult) {
        this.executionResult = executionResult;
    }

    @Override
    public ExecutionState getExecutionState() {
        return executionState;
    }

    @Override
    public void setExecutionState(ExecutionState executionState) {
        this.executionState = executionState;
    }

    @Override
    public OperationVariable getInoutputArguments() {
        return inoutputArguments;
    }

    @Override
    public void setInoutputArguments(OperationVariable inoutputArguments) {
        this.inoutputArguments = inoutputArguments;
    }

    @Override
    public OperationVariable getOutputArguments() {
        return outputArguments;
    }

    @Override
    public void setOutputArguments(OperationVariable outputArguments) {
        this.outputArguments = outputArguments;
    }

    @Override
    public String getRequestId() {
        return requestId;
    }

    @Override
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String toString() {
        return String.format(
            "DefaultOperationResult (" + "executionResult=%s,"
                + "executionState=%s,"
                + "inoutputArguments=%s,"
                + "outputArguments=%s,"
                + "requestId=%s,"
                + ")",
            this.executionResult, this.executionState, this.inoutputArguments, this.outputArguments, this.requestId);
    }

    /**
     * This builder class can be used to construct a DefaultOperationResult bean.
     */
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
