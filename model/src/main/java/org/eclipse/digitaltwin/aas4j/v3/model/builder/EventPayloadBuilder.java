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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;


import org.eclipse.digitaltwin.aas4j.v3.model.EventPayload;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;


public abstract class EventPayloadBuilder<T extends EventPayload, B extends EventPayloadBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for observableReference
     * 
     * @param observableReference desired value to be set
     * @return Builder object with new value for observableReference
     */
    public B observableReference(Reference observableReference) {
        getBuildingInstance().setObservableReference(observableReference);
        return getSelf();
    }

    /**
     * This function allows setting a value for observableSemanticID
     * 
     * @param observableSemanticID desired value to be set
     * @return Builder object with new value for observableSemanticID
     */
    public B observableSemanticID(Reference observableSemanticID) {
        getBuildingInstance().setObservableSemanticID(observableSemanticID);
        return getSelf();
    }

    /**
     * This function allows setting a value for payload
     * 
     * @param payload desired value to be set
     * @return Builder object with new value for payload
     */
    public B payload(byte[] payload) {
        getBuildingInstance().setPayload(payload);
        return getSelf();
    }

    /**
     * This function allows setting a value for source
     * 
     * @param source desired value to be set
     * @return Builder object with new value for source
     */
    public B source(Reference source) {
        getBuildingInstance().setSource(source);
        return getSelf();
    }

    /**
     * This function allows setting a value for sourceSemanticID
     * 
     * @param sourceSemanticID desired value to be set
     * @return Builder object with new value for sourceSemanticID
     */
    public B sourceSemanticID(Reference sourceSemanticID) {
        getBuildingInstance().setSourceSemanticID(sourceSemanticID);
        return getSelf();
    }

    /**
     * This function allows setting a value for subjectID
     * 
     * @param subjectID desired value to be set
     * @return Builder object with new value for subjectID
     */
    public B subjectID(Reference subjectID) {
        getBuildingInstance().setSubjectID(subjectID);
        return getSelf();
    }

    /**
     * This function allows setting a value for timeStamp
     * 
     * @param timeStamp desired value to be set
     * @return Builder object with new value for timeStamp
     */
    public B timeStamp(String timeStamp) {
        getBuildingInstance().setTimeStamp(timeStamp);
        return getSelf();
    }

    /**
     * This function allows setting a value for topic
     * 
     * @param topic desired value to be set
     * @return Builder object with new value for topic
     */
    public B topic(String topic) {
        getBuildingInstance().setTopic(topic);
        return getSelf();
    }
}
