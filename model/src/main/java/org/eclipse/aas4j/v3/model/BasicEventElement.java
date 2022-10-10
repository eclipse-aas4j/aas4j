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
 * A basic event element.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBasicEventElement.class)
})
public interface BasicEventElement extends EventElement {

    /**
     * Direction of event.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/direction
     *
     * @return Returns the Direction for the property direction.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/direction")
    Direction getDirection();

    /**
     * Direction of event.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/direction
     *
     * @param direction desired value for the property direction.
     */
    void setDirection(Direction direction);

    /**
     * Timestamp in UTC, when the last event was received (input direction) or sent (output direction).
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/lastUpdate
     *
     * @return Returns the String for the property lastUpdate.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/lastUpdate")
    String getLastUpdate();

    /**
     * Timestamp in UTC, when the last event was received (input direction) or sent (output direction).
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/lastUpdate
     *
     * @param lastUpdate desired value for the property lastUpdate.
     */
    void setLastUpdate(String lastUpdate);

    /**
     * For input direction: not applicable.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/maxInterval
     *
     * @return Returns the String for the property maxInterval.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/maxInterval")
    String getMaxInterval();

    /**
     * For input direction: not applicable.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/maxInterval
     *
     * @param maxInterval desired value for the property maxInterval.
     */
    void setMaxInterval(String maxInterval);

    /**
     * Information, which outer message infrastructure shall handle messages for the 'EventElement'.
     * Refers to a 'Submodel', 'SubmodelElementList', 'SubmodelElementCollection' or 'Entity', which
     * contains 'DataElement''s describing the proprietary specification for the message broker.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/messageBroker
     *
     * @return Returns the Reference for the property messageBroker.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/messageBroker")
    Reference getMessageBroker();

    /**
     * Information, which outer message infrastructure shall handle messages for the 'EventElement'.
     * Refers to a 'Submodel', 'SubmodelElementList', 'SubmodelElementCollection' or 'Entity', which
     * contains 'DataElement''s describing the proprietary specification for the message broker.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/messageBroker
     *
     * @param messageBroker desired value for the property messageBroker.
     */
    void setMessageBroker(Reference messageBroker);

    /**
     * Information for the outer message infrastructure for scheduling the event to the respective
     * communication channel.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/messageTopic
     *
     * @return Returns the String for the property messageTopic.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/messageTopic")
    String getMessageTopic();

    /**
     * Information for the outer message infrastructure for scheduling the event to the respective
     * communication channel.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/messageTopic
     *
     * @param messageTopic desired value for the property messageTopic.
     */
    void setMessageTopic(String messageTopic);

    /**
     * For input direction, reports on the maximum frequency, the software entity behind the respective
     * Referable can handle input events.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/minInterval
     *
     * @return Returns the String for the property minInterval.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/minInterval")
    String getMinInterval();

    /**
     * For input direction, reports on the maximum frequency, the software entity behind the respective
     * Referable can handle input events.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/minInterval
     *
     * @param minInterval desired value for the property minInterval.
     */
    void setMinInterval(String minInterval);

    /**
     * Reference to the 'Referable', which defines the scope of the event. Can be
     * 'AssetAdministrationShell', 'Submodel', or 'SubmodelElement'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/observed
     *
     * @return Returns the Reference for the property observed.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/observed")
    Reference getObserved();

    /**
     * Reference to the 'Referable', which defines the scope of the event. Can be
     * 'AssetAdministrationShell', 'Submodel', or 'SubmodelElement'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/observed
     *
     * @param observed desired value for the property observed.
     */
    void setObserved(Reference observed);

    /**
     * State of event.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/state
     *
     * @return Returns the StateOfEvent for the property state.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/state")
    StateOfEvent getState();

    /**
     * State of event.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/BasicEventElement/state
     *
     * @param state desired value for the property state.
     */
    void setState(StateOfEvent state);

}
