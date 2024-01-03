/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.mixins;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.eclipse.digitaltwin.aas4j.v3.model.Direction;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;

@JsonTypeName("aas:BasicEventElement")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface BasicEventElementMixin extends EventElementMixin {

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/direction")
    Direction getDirection();

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/direction")
    void setDirection(Direction direction);

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/lastUpdate")
    String getLastUpdate();

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/lastUpdate")
    void setLastUpdate(String lastUpdate);


    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/maxInterval")
    String getMaxInterval();

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/maxInterval")
    void setMaxInterval(String maxInterval);

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/messageBroker")
    Reference getMessageBroker();

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/messageBroker")
    void setMessageBroker(Reference messageBroker);

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/messageTopic")
    String getMessageTopic();

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/messageTopic")
    void setMessageTopic(String messageTopic);

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/minInterval")
    String getMinInterval();

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/minInterval")
    void setMinInterval(String minInterval);

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/observed")
    Reference getObserved();

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/observed")
    void setObserved(Reference observed);

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/state")
    StateOfEvent getState();

    @JsonProperty("https://admin-shell.io/aas/3/0/BasicEventElement/state")
    void setState(StateOfEvent state);
}
