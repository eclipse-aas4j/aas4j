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
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Direction;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.BasicEventElementBuilder;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement
 *
 * <p>A basic event element.
 */
@IRI("aas:BasicEventElement")
public class DefaultBasicEventElement implements BasicEventElement {

  @IRI("https://admin-shell.io/aas/3/0/BasicEventElement/direction")
  protected Direction direction;

  @IRI("https://admin-shell.io/aas/3/0/BasicEventElement/lastUpdate")
  protected String lastUpdate;

  @IRI("https://admin-shell.io/aas/3/0/BasicEventElement/maxInterval")
  protected String maxInterval;

  @IRI("https://admin-shell.io/aas/3/0/BasicEventElement/messageBroker")
  protected Reference messageBroker;

  @IRI("https://admin-shell.io/aas/3/0/BasicEventElement/messageTopic")
  protected String messageTopic;

  @IRI("https://admin-shell.io/aas/3/0/BasicEventElement/minInterval")
  protected String minInterval;

  @IRI("https://admin-shell.io/aas/3/0/BasicEventElement/observed")
  protected Reference observed;

  @IRI("https://admin-shell.io/aas/3/0/BasicEventElement/state")
  protected StateOfEvent state;

  @IRI("https://admin-shell.io/aas/3/0/HasDataSpecification/embeddedDataSpecifications")
  protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/HasExtensions/extensions")
  protected List<Extension> extensions = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/HasSemantics/semanticId")
  protected Reference semanticId;

  @IRI("https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds")
  protected List<Reference> supplementalSemanticIds = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Qualifiable/qualifiers")
  protected List<Qualifier> qualifiers = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Referable/category")
  protected String category;

  @IRI("https://admin-shell.io/aas/3/0/Referable/description")
  protected List<LangStringTextType> description = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Referable/displayName")
  protected List<LangStringNameType> displayName = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/0/Referable/idShort")
  protected String idShort;

  public DefaultBasicEventElement() {}

  @Override
  public int hashCode() {
    return Objects.hash(
        this.observed,
        this.direction,
        this.state,
        this.messageTopic,
        this.messageBroker,
        this.lastUpdate,
        this.minInterval,
        this.maxInterval,
        this.embeddedDataSpecifications,
        this.category,
        this.idShort,
        this.displayName,
        this.description,
        this.extensions,
        this.semanticId,
        this.supplementalSemanticIds,
        this.qualifiers);
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
      DefaultBasicEventElement other = (DefaultBasicEventElement) obj;
      return Objects.equals(this.observed, other.observed)
          && Objects.equals(this.direction, other.direction)
          && Objects.equals(this.state, other.state)
          && Objects.equals(this.messageTopic, other.messageTopic)
          && Objects.equals(this.messageBroker, other.messageBroker)
          && Objects.equals(this.lastUpdate, other.lastUpdate)
          && Objects.equals(this.minInterval, other.minInterval)
          && Objects.equals(this.maxInterval, other.maxInterval)
          && Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications)
          && Objects.equals(this.category, other.category)
          && Objects.equals(this.idShort, other.idShort)
          && Objects.equals(this.displayName, other.displayName)
          && Objects.equals(this.description, other.description)
          && Objects.equals(this.extensions, other.extensions)
          && Objects.equals(this.semanticId, other.semanticId)
          && Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds)
          && Objects.equals(this.qualifiers, other.qualifiers);
    }
  }

  @Override
  public Reference getObserved() {
    return observed;
  }

  @Override
  public void setObserved(Reference observed) {
    this.observed = observed;
  }

  @Override
  public Direction getDirection() {
    return direction;
  }

  @Override
  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  @Override
  public StateOfEvent getState() {
    return state;
  }

  @Override
  public void setState(StateOfEvent state) {
    this.state = state;
  }

  @Override
  public String getMessageTopic() {
    return messageTopic;
  }

  @Override
  public void setMessageTopic(String messageTopic) {
    this.messageTopic = messageTopic;
  }

  @Override
  public Reference getMessageBroker() {
    return messageBroker;
  }

  @Override
  public void setMessageBroker(Reference messageBroker) {
    this.messageBroker = messageBroker;
  }

  @Override
  public String getLastUpdate() {
    return lastUpdate;
  }

  @Override
  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  @Override
  public String getMinInterval() {
    return minInterval;
  }

  @Override
  public void setMinInterval(String minInterval) {
    this.minInterval = minInterval;
  }

  @Override
  public String getMaxInterval() {
    return maxInterval;
  }

  @Override
  public void setMaxInterval(String maxInterval) {
    this.maxInterval = maxInterval;
  }

  @Override
  public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
    return embeddedDataSpecifications;
  }

  @Override
  public void setEmbeddedDataSpecifications(
      List<EmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
  }

  @Override
  public String getCategory() {
    return category;
  }

  @Override
  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public String getIdShort() {
    return idShort;
  }

  @Override
  public void setIdShort(String idShort) {
    this.idShort = idShort;
  }

  @Override
  public List<LangStringNameType> getDisplayName() {
    return displayName;
  }

  @Override
  public void setDisplayName(List<LangStringNameType> displayNames) {
    this.displayName = displayNames;
  }

  @Override
  public List<LangStringTextType> getDescription() {
    return description;
  }

  @Override
  public void setDescription(List<LangStringTextType> descriptions) {
    this.description = descriptions;
  }

  @Override
  public List<Extension> getExtensions() {
    return extensions;
  }

  @Override
  public void setExtensions(List<Extension> extensions) {
    this.extensions = extensions;
  }

  @Override
  public Reference getSemanticId() {
    return semanticId;
  }

  @Override
  public void setSemanticId(Reference semanticId) {
    this.semanticId = semanticId;
  }

  @Override
  public List<Reference> getSupplementalSemanticIds() {
    return supplementalSemanticIds;
  }

  @Override
  public void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
  }

  @Override
  public List<Qualifier> getQualifiers() {
    return qualifiers;
  }

  @Override
  public void setQualifiers(List<Qualifier> qualifiers) {
    this.qualifiers = qualifiers;
  }

  public String toString() {
    return String.format(
        "DefaultBasicEventElement ("
            + "observed=%s,"
            + "direction=%s,"
            + "state=%s,"
            + "messageTopic=%s,"
            + "messageBroker=%s,"
            + "lastUpdate=%s,"
            + "minInterval=%s,"
            + "maxInterval=%s,"
            + ")",
        this.observed,
        this.direction,
        this.state,
        this.messageTopic,
        this.messageBroker,
        this.lastUpdate,
        this.minInterval,
        this.maxInterval);
  }

  /** This builder class can be used to construct a DefaultBasicEventElement bean. */
  public static class Builder extends BasicEventElementBuilder<DefaultBasicEventElement, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultBasicEventElement newBuildingInstance() {
      return new DefaultBasicEventElement();
    }
  }
}
