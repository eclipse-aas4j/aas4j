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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Result
 * 
 */

@IRI("aas:Result")
public class DefaultResult implements Result {

    @IRI("https://admin-shell.io/aas/3/0/Result/messages")
    protected List<Message> messages = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Result/success")
    protected boolean success;

    public DefaultResult() {}

    public DefaultResult(Result x) {
        this.messages = x.getMessages();
        this.success = x.getSuccess();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.messages,
            this.success);
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
            DefaultResult other = (DefaultResult) obj;
            return Objects.equals(this.messages, other.messages) &&
                Objects.equals(this.success, other.success);
        }
    }

    @Override
    public List<Message> getMessages() {
        return messages;
    }

    @Override
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public boolean getSuccess() {
        return success;
    }

    @Override
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String toString() {
        return String.format(
            "DefaultResult (" + "messages=%s,"
                + "success=%s,"
                + ")",
            this.messages, this.success);
    }

    /**
     * This builder class can be used to construct a DefaultResult bean.
     */
    public static class Builder extends ResultBuilder<DefaultResult, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultResult newBuildingInstance() {
            return new DefaultResult();
        }
    }
}
