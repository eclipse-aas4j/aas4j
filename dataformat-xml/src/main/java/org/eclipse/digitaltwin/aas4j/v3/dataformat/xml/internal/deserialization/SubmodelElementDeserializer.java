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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.SubmodelElementManager;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.BeanDescription;
import tools.jackson.databind.DatabindException;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.PropertyName;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;
import tools.jackson.databind.introspect.AnnotatedMember;
import tools.jackson.databind.introspect.BeanPropertyDefinition;
import tools.jackson.databind.node.ObjectNode;

public class SubmodelElementDeserializer extends ValueDeserializer<SubmodelElement> {

  @Override
  public SubmodelElement deserialize(JsonParser parser, DeserializationContext ctxt)
      throws JacksonException {
    ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
    String elemName = findSubmodelElementName(parser, node);
    JsonNode nodeContent = node.get(elemName);
    Class<?> clazz = SubmodelElementManager.getClassByXmlName(elemName);
    JsonNode normalizedNode = unwrapWrappedLists(ctxt, nodeContent, clazz);
    return (SubmodelElement)
        DeserializationHelper.createInstanceFromNode(ctxt, normalizedNode, clazz);
  }

  private String findSubmodelElementName(JsonParser parser, ObjectNode node)
      throws DatabindException {
    for (String value : SubmodelElementManager.NAME_TO_CLASS.keySet()) {
      if (node.has(value)) {
        return value;
      }
    }
    throw DatabindException.from(parser, "Unknown element " + node);
  }

  private JsonNode unwrapWrappedLists(DeserializationContext ctxt, JsonNode node, Class<?> clazz) {
    if (!(node instanceof ObjectNode)) {
      return node;
    }
    BeanDescription desc = ctxt.introspectBeanDescriptionForCreation(ctxt.constructType(clazz));
    ObjectNode objectNode = (ObjectNode) node;
    for (BeanPropertyDefinition prop : desc.findProperties()) {
      if (hasCustomDeserializer(prop)) {
        continue;
      }
      PropertyName wrapperName = prop.getWrapperName();
      if (wrapperName == null || wrapperName.isEmpty()) {
        continue;
      }
      String wrapperLocalName = wrapperName.getSimpleName();
      String propertyName = prop.getName();
      if (wrapperLocalName == null || wrapperLocalName.isEmpty()) {
        continue;
      }
      JsonNode wrapperNode = objectNode.get(wrapperLocalName);
      if (wrapperNode == null || wrapperNode.isNull()) {
        continue;
      }
      if (wrapperNode.isObject()) {
        JsonNode inner = wrapperNode.get(propertyName);
        if (inner != null) {
          objectNode.set(wrapperLocalName, inner);
        }
      }
    }
    return objectNode;
  }

  private boolean hasCustomDeserializer(BeanPropertyDefinition prop) {
    AnnotatedMember accessor = prop.getAccessor();
    if (accessor != null && accessor.getAnnotation(JsonDeserialize.class) != null) {
      return true;
    }
    AnnotatedMember mutator = prop.getMutator();
    return mutator != null && mutator.getAnnotation(JsonDeserialize.class) != null;
  }
}
