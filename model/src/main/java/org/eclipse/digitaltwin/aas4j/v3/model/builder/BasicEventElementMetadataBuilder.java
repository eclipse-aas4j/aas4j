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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


public abstract class BasicEventElementMetadataBuilder<T extends BasicEventElementMetadata, B extends BasicEventElementMetadataBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for direction
     * 
     * @param directions desired value to be set
     * @return Builder object with new value for direction
     */
    public B direction(List<Direction> directions) {
        getBuildingInstance().setDirection(directions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List direction
     * 
     * @param direction desired value to be added
     * @return Builder object with new value for direction
     */
    public B direction(Direction direction) {
        getBuildingInstance().getDirection().add(direction);
        return getSelf();
    }

    /**
     * This function allows setting a value for state
     * 
     * @param states desired value to be set
     * @return Builder object with new value for state
     */
    public B state(List<StateOfEvent> states) {
        getBuildingInstance().setState(states);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List state
     * 
     * @param state desired value to be added
     * @return Builder object with new value for state
     */
    public B state(StateOfEvent state) {
        getBuildingInstance().getState().add(state);
        return getSelf();
    }

    /**
     * This function allows setting a value for messageBroker
     * 
     * @param messageBrokers desired value to be set
     * @return Builder object with new value for messageBroker
     */
    public B messageBroker(List<Reference> messageBrokers) {
        getBuildingInstance().setMessageBroker(messageBrokers);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List messageBroker
     * 
     * @param messageBroker desired value to be added
     * @return Builder object with new value for messageBroker
     */
    public B messageBroker(Reference messageBroker) {
        getBuildingInstance().getMessageBroker().add(messageBroker);
        return getSelf();
    }

    /**
     * This function allows setting a value for messageTopic
     * 
     * @param messageTopics desired value to be set
     * @return Builder object with new value for messageTopic
     */
    public B messageTopic(List<String> messageTopics) {
        getBuildingInstance().setMessageTopic(messageTopics);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List messageTopic
     * 
     * @param messageTopic desired value to be added
     * @return Builder object with new value for messageTopic
     */
    public B messageTopic(String messageTopic) {
        getBuildingInstance().getMessageTopic().add(messageTopic);
        return getSelf();
    }

    /**
     * This function allows setting a value for lastUpdate
     * 
     * @param lastUpdates desired value to be set
     * @return Builder object with new value for lastUpdate
     */
    public B lastUpdate(List<String> lastUpdates) {
        getBuildingInstance().setLastUpdate(lastUpdates);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List lastUpdate
     * 
     * @param lastUpdate desired value to be added
     * @return Builder object with new value for lastUpdate
     */
    public B lastUpdate(String lastUpdate) {
        getBuildingInstance().getLastUpdate().add(lastUpdate);
        return getSelf();
    }

    /**
     * This function allows setting a value for minInterval
     * 
     * @param minIntervals desired value to be set
     * @return Builder object with new value for minInterval
     */
    public B minInterval(List<String> minIntervals) {
        getBuildingInstance().setMinInterval(minIntervals);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List minInterval
     * 
     * @param minInterval desired value to be added
     * @return Builder object with new value for minInterval
     */
    public B minInterval(String minInterval) {
        getBuildingInstance().getMinInterval().add(minInterval);
        return getSelf();
    }

    /**
     * This function allows setting a value for maxInterval
     * 
     * @param maxIntervals desired value to be set
     * @return Builder object with new value for maxInterval
     */
    public B maxInterval(List<String> maxIntervals) {
        getBuildingInstance().setMaxInterval(maxIntervals);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List maxInterval
     * 
     * @param maxInterval desired value to be added
     * @return Builder object with new value for maxInterval
     */
    public B maxInterval(String maxInterval) {
        getBuildingInstance().getMaxInterval().add(maxInterval);
        return getSelf();
    }

    /**
     * This function allows setting a value for kind
     * 
     * @param kind desired value to be set
     * @return Builder object with new value for kind
     */
    public B kind(ModellingKind kind) {
        getBuildingInstance().setKind(kind);
        return getSelf();
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        getBuildingInstance().setEmbeddedDataSpecifications(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be added
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(EmbeddedDataSpecification embeddedDataSpecifications) {
        getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public B category(String category) {
        getBuildingInstance().setCategory(category);
        return getSelf();
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public B idShort(String idShort) {
        getBuildingInstance().setIdShort(idShort);
        return getSelf();
    }

    /**
     * This function allows setting a value for displayName
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayName
     */
    public B displayName(List<LangStringNameType> displayNames) {
        getBuildingInstance().setDisplayName(displayNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List displayName
     * 
     * @param displayName desired value to be added
     * @return Builder object with new value for displayName
     */
    public B displayName(LangStringNameType displayName) {
        getBuildingInstance().getDisplayName().add(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for description
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for description
     */
    public B description(List<LangStringTextType> descriptions) {
        getBuildingInstance().setDescription(descriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List description
     * 
     * @param description desired value to be added
     * @return Builder object with new value for description
     */
    public B description(LangStringTextType description) {
        getBuildingInstance().getDescription().add(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for extensions
     * 
     * @param extensions desired value to be set
     * @return Builder object with new value for extensions
     */
    public B extensions(List<Extension> extensions) {
        getBuildingInstance().setExtensions(extensions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List extensions
     * 
     * @param extensions desired value to be added
     * @return Builder object with new value for extensions
     */
    public B extensions(Extension extensions) {
        getBuildingInstance().getExtensions().add(extensions);
        return getSelf();
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public B semanticId(Reference semanticId) {
        getBuildingInstance().setSemanticId(semanticId);
        return getSelf();
    }

    /**
     * This function allows setting a value for supplementalSemanticIds
     * 
     * @param supplementalSemanticIds desired value to be set
     * @return Builder object with new value for supplementalSemanticIds
     */
    public B supplementalSemanticIds(List<Reference> supplementalSemanticIds) {
        getBuildingInstance().setSupplementalSemanticIds(supplementalSemanticIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List supplementalSemanticIds
     * 
     * @param supplementalSemanticIds desired value to be added
     * @return Builder object with new value for supplementalSemanticIds
     */
    public B supplementalSemanticIds(Reference supplementalSemanticIds) {
        getBuildingInstance().getSupplementalSemanticIds().add(supplementalSemanticIds);
        return getSelf();
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public B qualifiers(List<Qualifier> qualifiers) {
        getBuildingInstance().setQualifiers(qualifiers);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List qualifiers
     * 
     * @param qualifiers desired value to be added
     * @return Builder object with new value for qualifiers
     */
    public B qualifiers(Qualifier qualifiers) {
        getBuildingInstance().getQualifiers().add(qualifiers);
        return getSelf();
    }
}
