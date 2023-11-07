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
import org.eclipse.digitaltwin.aas4j.v3.model.OperationResultValueOnly;
import org.eclipse.digitaltwin.aas4j.v3.model.Result;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.OperationResultValueOnlyBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.OperationResultValueOnly
 * 
 */

@IRI("aas:OperationResultValueOnly")
public class DefaultOperationResultValueOnly implements OperationResultValueOnly {

    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/executionResult")
    protected List<Result> executionResult = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/executionState")
    protected List<ExecutionState> executionState = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/inoutputArguments")
    protected List<String> inoutputArguments = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/outputArguments")
    protected List<String> outputArguments = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/OperationResultValueOnly/requestId")
    protected List<String> requestId = new ArrayList<>();

    public DefaultOperationResultValueOnly() {}

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
            DefaultOperationResultValueOnly other = (DefaultOperationResultValueOnly) obj;
            return Objects.equals(this.executionResult, other.executionResult) &&
                Objects.equals(this.executionState, other.executionState) &&
                Objects.equals(this.inoutputArguments, other.inoutputArguments) &&
                Objects.equals(this.outputArguments, other.outputArguments) &&
                Objects.equals(this.requestId, other.requestId);
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
    public List<ExecutionState> getExecutionState() {
        return executionState;
    }

    @Override
    public void setExecutionState(List<ExecutionState> executionStates) {
        this.executionState = executionStates;
    }

    @Override
    public List<String> getInoutputArguments() {
        return inoutputArguments;
    }

    @Override
    public void setInoutputArguments(List<String> inoutputArguments) {
        this.inoutputArguments = inoutputArguments;
    }

    @Override
    public List<String> getOutputArguments() {
        return outputArguments;
    }

    @Override
    public void setOutputArguments(List<String> outputArguments) {
        this.outputArguments = outputArguments;
    }

    @Override
    public List<String> getRequestId() {
        return requestId;
    }

    @Override
    public void setRequestId(List<String> requestIds) {
        this.requestId = requestIds;
    }

    public String toString() {
        return String.format(
            "DefaultOperationResultValueOnly (" + "executionResult=%s,"
                + "executionState=%s,"
                + "inoutputArguments=%s,"
                + "outputArguments=%s,"
                + "requestId=%s,"
                + ")",
            this.executionResult, this.executionState, this.inoutputArguments, this.outputArguments, this.requestId);
    }

    /**
     * This builder class can be used to construct a DefaultOperationResultValueOnly bean.
     */
    public static class Builder extends OperationResultValueOnlyBuilder<DefaultOperationResultValueOnly, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultOperationResultValueOnly newBuildingInstance() {
            return new DefaultOperationResultValueOnly();
        }
    }
}
