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

import org.eclipse.digitaltwin.aas4j.v3.model.BaseOperationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.ExecutionState;
import org.eclipse.digitaltwin.aas4j.v3.model.Message;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.BaseOperationResultBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.BaseOperationResult
 * 
 */

@IRI("aas:BaseOperationResult")
public class DefaultBaseOperationResult implements BaseOperationResult {

    @IRI("https://admin-shell.io/aas/3/0/BaseOperationResult/executionState")
    protected ExecutionState executionState;

    @IRI("https://admin-shell.io/aas/3/0/BaseOperationResult/success")
    protected boolean success;

    @IRI("https://admin-shell.io/aas/3/0/Result/messages")
    protected List<Message> messages = new ArrayList<>();

    public DefaultBaseOperationResult() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.executionState,
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
            DefaultBaseOperationResult other = (DefaultBaseOperationResult) obj;
            return Objects.equals(this.executionState, other.executionState) &&
                Objects.equals(this.success, other.success) &&
                Objects.equals(this.messages, other.messages);
        }
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

    public String toString() {
        return String.format(
            "DefaultBaseOperationResult (" + "executionState=%s,"
                + "success=%s,"
                + ")",
            this.executionState, this.success);
    }

    /**
     * This builder class can be used to construct a DefaultBaseOperationResult bean.
     */
    public static class Builder extends BaseOperationResultBuilder<DefaultBaseOperationResult, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultBaseOperationResult newBuildingInstance() {
            return new DefaultBaseOperationResult();
        }
    }
}
