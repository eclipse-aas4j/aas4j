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

package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBasicEventElementMetadata;

import java.util.List;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBasicEventElementMetadata.class)
})
public interface BasicEventElementMetadata extends SubmodelElementAttributes {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/direction
     *
     * @return Returns the List of Directions for the property direction.
     */
    @IRI("https://admin-shell.io/aas/3/0/BasicEventElementMetadata/direction")
    List<Direction> getDirection();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/direction
     *
     * @param directions desired value for the property direction.
     */
    void setDirection(List<Direction> directions);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/state
     *
     * @return Returns the List of StateOfEvents for the property state.
     */
    @IRI("https://admin-shell.io/aas/3/0/BasicEventElementMetadata/state")
    List<StateOfEvent> getState();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/state
     *
     * @param states desired value for the property state.
     */
    void setState(List<StateOfEvent> states);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/messageBroker
     *
     * @return Returns the List of References for the property messageBroker.
     */
    @IRI("https://admin-shell.io/aas/3/0/BasicEventElementMetadata/messageBroker")
    List<Reference> getMessageBroker();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/messageBroker
     *
     * @param messageBrokers desired value for the property messageBroker.
     */
    void setMessageBroker(List<Reference> messageBrokers);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/messageTopic
     *
     * @return Returns the List of Strings for the property messageTopic.
     */
    @IRI("https://admin-shell.io/aas/3/0/BasicEventElementMetadata/messageTopic")
    List<String> getMessageTopic();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/messageTopic
     *
     * @param messageTopics desired value for the property messageTopic.
     */
    void setMessageTopic(List<String> messageTopics);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/lastUpdate
     *
     * @return Returns the List of Strings for the property lastUpdate.
     */
    @IRI("https://admin-shell.io/aas/3/0/BasicEventElementMetadata/lastUpdate")
    List<String> getLastUpdate();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/lastUpdate
     *
     * @param lastUpdates desired value for the property lastUpdate.
     */
    void setLastUpdate(List<String> lastUpdates);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/minInterval
     *
     * @return Returns the List of Strings for the property minInterval.
     */
    @IRI("https://admin-shell.io/aas/3/0/BasicEventElementMetadata/minInterval")
    List<String> getMinInterval();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/minInterval
     *
     * @param minIntervals desired value for the property minInterval.
     */
    void setMinInterval(List<String> minIntervals);

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/maxInterval
     *
     * @return Returns the List of Strings for the property maxInterval.
     */
    @IRI("https://admin-shell.io/aas/3/0/BasicEventElementMetadata/maxInterval")
    List<String> getMaxInterval();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/BasicEventElementMetadata/maxInterval
     *
     * @param maxIntervals desired value for the property maxInterval.
     */
    void setMaxInterval(List<String> maxIntervals);

}
