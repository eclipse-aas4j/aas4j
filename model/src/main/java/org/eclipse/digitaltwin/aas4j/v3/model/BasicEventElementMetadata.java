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

package org.eclipse.digitaltwin.aas4j.v3.model;

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBasicEventElementMetadata.class)
})
public interface BasicEventElementMetadata extends SubmodelElementAttributes {

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/direction
     *
     * @return Returns the List of Directions for the property directions.
     */
    @IRI("https://admin-shell.io/aas/3/1/BasicEventElementMetadata/direction")
    List<Direction> getDirections();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/direction
     *
     * @param directions desired value for the property directions.
     */
    void setDirections(List<Direction> directions);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/state
     *
     * @return Returns the List of StateOfEvents for the property states.
     */
    @IRI("https://admin-shell.io/aas/3/1/BasicEventElementMetadata/state")
    List<StateOfEvent> getStates();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/state
     *
     * @param states desired value for the property states.
     */
    void setStates(List<StateOfEvent> states);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/messageBroker
     *
     * @return Returns the List of References for the property messageBrokers.
     */
    @IRI("https://admin-shell.io/aas/3/1/BasicEventElementMetadata/messageBroker")
    List<Reference> getMessageBrokers();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/messageBroker
     *
     * @param messageBrokers desired value for the property messageBrokers.
     */
    void setMessageBrokers(List<Reference> messageBrokers);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/messageTopic
     *
     * @return Returns the List of Strings for the property messageTopics.
     */
    @IRI("https://admin-shell.io/aas/3/1/BasicEventElementMetadata/messageTopic")
    List<String> getMessageTopics();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/messageTopic
     *
     * @param messageTopics desired value for the property messageTopics.
     */
    void setMessageTopics(List<String> messageTopics);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/lastUpdate
     *
     * @return Returns the List of Strings for the property lastUpdates.
     */
    @IRI("https://admin-shell.io/aas/3/1/BasicEventElementMetadata/lastUpdate")
    List<String> getLastUpdates();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/lastUpdate
     *
     * @param lastUpdates desired value for the property lastUpdates.
     */
    void setLastUpdates(List<String> lastUpdates);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/minInterval
     *
     * @return Returns the List of Strings for the property minIntervals.
     */
    @IRI("https://admin-shell.io/aas/3/1/BasicEventElementMetadata/minInterval")
    List<String> getMinIntervals();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/minInterval
     *
     * @param minIntervals desired value for the property minIntervals.
     */
    void setMinIntervals(List<String> minIntervals);

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/maxInterval
     *
     * @return Returns the List of Strings for the property maxIntervals.
     */
    @IRI("https://admin-shell.io/aas/3/1/BasicEventElementMetadata/maxInterval")
    List<String> getMaxIntervals();

    /**
     *
     * More information under https://admin-shell.io/aas/3/1/BasicEventElementMetadata/maxInterval
     *
     * @param maxIntervals desired value for the property maxIntervals.
     */
    void setMaxIntervals(List<String> maxIntervals);

}
