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

import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Message
 * 
 */

@IRI("aas:Message")
public class DefaultMessage implements Message {

    @IRI("https://admin-shell.io/aas/3/1/Message/code")
    protected String code;

    @IRI("https://admin-shell.io/aas/3/1/Message/correlationId")
    protected String correlationId;

    @IRI("https://admin-shell.io/aas/3/1/Message/messageType")
    protected MessageType messageType;

    @IRI("https://admin-shell.io/aas/3/1/Message/text")
    protected String text;

    @IRI("https://admin-shell.io/aas/3/1/Message/timestamp")
    protected String timestamp;

    public DefaultMessage() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.code,
            this.correlationId,
            this.messageType,
            this.text,
            this.timestamp);
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
            DefaultMessage other = (DefaultMessage) obj;
            return Objects.equals(this.code, other.code) &&
                Objects.equals(this.correlationId, other.correlationId) &&
                Objects.equals(this.messageType, other.messageType) &&
                Objects.equals(this.text, other.text) &&
                Objects.equals(this.timestamp, other.timestamp);
        }
    }

    @Override
    public String toString() {
        return "DefaultMessage{" +
                "code='" + code + '\'' +
                ", correlationId='" + correlationId + '\'' +
                ", messageType=" + messageType +
                ", text='" + text + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getCorrelationId() {
        return correlationId;
    }

    @Override
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @Override
    public MessageType getMessageType() {
        return messageType;
    }

    @Override
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This builder class can be used to construct a DefaultMessage bean.
     */
    public static class Builder extends MessageBuilder<DefaultMessage, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultMessage newBuildingInstance() {
            return new DefaultMessage();
        }
    }
}
