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


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.OperationResult
 *
 */

@IRI("aas:OperationResult")
public class DefaultOperationResult implements OperationResult {

    @IRI("https://admin-shell.io/aas/3/2/OperationResult/executionResult")
    protected List<Result> executionResults = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/OperationResult/executionState")
    protected List<ExecutionState> executionStates = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/OperationResult/inoutputArguments")
    protected List<OperationVariable> inoutputArguments = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/OperationResult/outputArguments")
    protected List<OperationVariable> outputArguments = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/OperationResult/requestId")
    protected List<String> requestIds = new ArrayList<>();

    public DefaultOperationResult() {
    }

    @Override
    public String toString() {
        return "DefaultOperationResult{"
                + "executionResults='" + executionResults + "',"
                + "executionStates='" + executionStates + "',"
                + "inoutputArguments='" + inoutputArguments + "',"
                + "outputArguments='" + outputArguments + "',"
                + "requestIds='" + requestIds + "',"
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.executionResults,
                this.executionStates,
                this.inoutputArguments,
                this.outputArguments,
                this.requestIds);
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
            return Objects.equals(this.executionResults, other.executionResults) &&
                    Objects.equals(this.executionStates, other.executionStates) &&
                    Objects.equals(this.inoutputArguments, other.inoutputArguments) &&
                    Objects.equals(this.outputArguments, other.outputArguments) &&
                    Objects.equals(this.requestIds, other.requestIds);
        }
    }

    @Override
    public List<Result> getExecutionResults() {
        return executionResults;
    }

    @Override
    public void setExecutionResults(List<Result> executionResults) {
        this.executionResults = executionResults;
    }

    @Override
    public List<ExecutionState> getExecutionStates() {
        return executionStates;
    }

    @Override
    public void setExecutionStates(List<ExecutionState> executionStates) {
        this.executionStates = executionStates;
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
    public List<OperationVariable> getOutputArguments() {
        return outputArguments;
    }

    @Override
    public void setOutputArguments(List<OperationVariable> outputArguments) {
        this.outputArguments = outputArguments;
    }

    @Override
    public List<String> getRequestIds() {
        return requestIds;
    }

    @Override
    public void setRequestIds(List<String> requestIds) {
        this.requestIds = requestIds;
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
