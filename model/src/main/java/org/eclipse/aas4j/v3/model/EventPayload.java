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

package org.eclipse.aas4j.v3.model;



import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;


/**
 * Defines the necessary information of an event instance sent out or received.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEventPayload.class)
})
public interface EventPayload {

    /**
     * Reference to the referable, which defines the scope of the event.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/observableReference
     *
     * @return Returns the Reference for the property observableReference.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/observableReference")
    Reference getObservableReference();

    /**
     * Reference to the referable, which defines the scope of the event.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/observableReference
     *
     * @param observableReference desired value for the property observableReference.
     */
    void setObservableReference(Reference observableReference);

    /**
     * 'semanticId' of the referable which defines the scope of the event, if available.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/observableSemanticId
     *
     * @return Returns the Reference for the property observableSemanticId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/observableSemanticId")
    Reference getObservableSemanticId();

    /**
     * 'semanticId' of the referable which defines the scope of the event, if available.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/observableSemanticId
     *
     * @param observableSemanticId desired value for the property observableSemanticId.
     */
    void setObservableSemanticId(Reference observableSemanticId);

    /**
     * Event specific payload.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/payload
     *
     * @return Returns the String for the property payload.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/payload")
    String getPayload();

    /**
     * Event specific payload.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/payload
     *
     * @param payload desired value for the property payload.
     */
    void setPayload(String payload);

    /**
     * Reference to the source event element, including identification of 'AssetAdministrationShell',
     * 'Submodel', 'SubmodelElement''s.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/source
     *
     * @return Returns the Reference for the property source.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/source")
    Reference getSource();

    /**
     * Reference to the source event element, including identification of 'AssetAdministrationShell',
     * 'Submodel', 'SubmodelElement''s.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/source
     *
     * @param source desired value for the property source.
     */
    void setSource(Reference source);

    /**
     * 'semanticId' of the source event element, if available
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/sourceSemanticId
     *
     * @return Returns the Reference for the property sourceSemanticId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/sourceSemanticId")
    Reference getSourceSemanticId();

    /**
     * 'semanticId' of the source event element, if available
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/sourceSemanticId
     *
     * @param sourceSemanticId desired value for the property sourceSemanticId.
     */
    void setSourceSemanticId(Reference sourceSemanticId);

    /**
     * Subject, who/which initiated the creation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/subjectId
     *
     * @return Returns the Reference for the property subjectId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/subjectId")
    Reference getSubjectId();

    /**
     * Subject, who/which initiated the creation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/subjectId
     *
     * @param subjectId desired value for the property subjectId.
     */
    void setSubjectId(Reference subjectId);

    /**
     * Timestamp in UTC, when this event was triggered.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/timeStamp
     *
     * @return Returns the String for the property timeStamp.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/timeStamp")
    String getTimeStamp();

    /**
     * Timestamp in UTC, when this event was triggered.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/timeStamp
     *
     * @param timeStamp desired value for the property timeStamp.
     */
    void setTimeStamp(String timeStamp);

    /**
     * Information for the outer message infrastructure for scheduling the event to the respective
     * communication channel.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/topic
     *
     * @return Returns the String for the property topic.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/EventPayload/topic")
    String getTopic();

    /**
     * Information for the outer message infrastructure for scheduling the event to the respective
     * communication channel.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/EventPayload/topic
     *
     * @param topic desired value for the property topic.
     */
    void setTopic(String topic);

}
