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

import org.eclipse.digitaltwin.aas4j.v3.model.EventPayload;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.EventPayloadBuilder;

import java.util.Arrays;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.EventPayload
 * 
 * Defines the necessary information of an event instance sent out or received.
 */

@IRI("aas:EventPayload")
public class DefaultEventPayload implements EventPayload {

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/observableReference")
    protected Reference observableReference;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/observableSemanticID")
    protected Reference observableSemanticID;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/payload")
    protected byte[] payload;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/source")
    protected Reference source;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/sourceSemanticID")
    protected Reference sourceSemanticID;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/subjectID")
    protected Reference subjectID;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/timeStamp")
    protected String timeStamp;

    @IRI("https://admin-shell.io/aas/3/0/EventPayload/topic")
    protected String topic;

    public DefaultEventPayload() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.observableReference,
            this.observableSemanticID,
            Arrays.hashCode(this.payload),
            this.source,
            this.sourceSemanticID,
            this.subjectID,
            this.timeStamp,
            this.topic);
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
            DefaultEventPayload other = (DefaultEventPayload) obj;
            return Objects.equals(this.observableReference, other.observableReference) &&
                Objects.equals(this.observableSemanticID, other.observableSemanticID) &&
                Arrays.equals(this.payload, other.payload) &&
                Objects.equals(this.source, other.source) &&
                Objects.equals(this.sourceSemanticID, other.sourceSemanticID) &&
                Objects.equals(this.subjectID, other.subjectID) &&
                Objects.equals(this.timeStamp, other.timeStamp) &&
                Objects.equals(this.topic, other.topic);
        }
    }

    @Override
    public Reference getObservableReference() {
        return observableReference;
    }

    @Override
    public void setObservableReference(Reference observableReference) {
        this.observableReference = observableReference;
    }

    @Override
    public Reference getObservableSemanticID() {
        return observableSemanticID;
    }

    @Override
    public void setObservableSemanticID(Reference observableSemanticID) {
        this.observableSemanticID = observableSemanticID;
    }

    @Override
    public byte[] getPayload() {
        return payload;
    }

    @Override
    public void setPayload(byte[] payload) {
        this.payload = payload;
    }

    @Override
    public Reference getSource() {
        return source;
    }

    @Override
    public void setSource(Reference source) {
        this.source = source;
    }

    @Override
    public Reference getSourceSemanticID() {
        return sourceSemanticID;
    }

    @Override
    public void setSourceSemanticID(Reference sourceSemanticID) {
        this.sourceSemanticID = sourceSemanticID;
    }

    @Override
    public Reference getSubjectID() {
        return subjectID;
    }

    @Override
    public void setSubjectID(Reference subjectID) {
        this.subjectID = subjectID;
    }

    @Override
    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * This builder class can be used to construct a DefaultEventPayload bean.
     */
    public static class Builder extends EventPayloadBuilder<DefaultEventPayload, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEventPayload newBuildingInstance() {
            return new DefaultEventPayload();
        }
    }
}
