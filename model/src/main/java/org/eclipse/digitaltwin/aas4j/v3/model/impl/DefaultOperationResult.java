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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.OperationResult
 * 
 */

@IRI("aas:OperationResult")
public class DefaultOperationResult implements OperationResult {

    @IRI("https://admin-shell.io/aas/3/1/BaseOperationResult/executionState")
    protected ExecutionState executionState;

    @IRI("https://admin-shell.io/aas/3/1/BaseOperationResult/success")
    protected boolean success;

    @IRI("https://admin-shell.io/aas/3/1/OperationResult/inoutputArguments")
    protected List<OperationVariable> inoutputArguments = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/OperationResult/outputArguments")
    protected List<OperationVariable> outputArguments = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/Result/messages")
    protected List<Message> messages = new ArrayList<>();

    public DefaultOperationResult() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.inoutputArguments,
            this.outputArguments,
            this.executionState,
            this.success,
            this.messages);
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
            return Objects.equals(this.inoutputArguments, other.inoutputArguments) &&
                Objects.equals(this.outputArguments, other.outputArguments) &&
                Objects.equals(this.executionState, other.executionState) &&
                Objects.equals(this.success, other.success) &&
                Objects.equals(this.messages, other.messages);
        }
    }

    @Override
    public String toString() {
        return "DefaultOperationResult{" +
                "executionState=" + executionState +
                ", success=" + success +
                ", inoutputArguments=" + inoutputArguments +
                ", outputArguments=" + outputArguments +
                ", messages=" + messages +
                '}';
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
    public ExecutionState getExecutionState() {
        return executionState;
    }

    @Override
    public void setExecutionState(ExecutionState executionState) {
        this.executionState = executionState;
    }

    @Override
    public boolean getSuccess() {
        return success;
    }

    @Override
    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public List<Message> getMessages() {
        return messages;
    }

    @Override
    public void setMessages(List<Message> messages) {
        this.messages = messages;
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
