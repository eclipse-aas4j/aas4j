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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.SubmodelElementManager;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

public class SubmodelElementDeserializer extends JsonDeserializer<SubmodelElement> {

  @Override
  public SubmodelElement deserialize(JsonParser parser, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
    ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
    String elemName = findSubmodelElementName(parser, node);
    JsonNode nodeContent = node.get(elemName);
    Class<?> clazz = SubmodelElementManager.getClassByXmlName(elemName);
    JsonNode normalizedNode = unwrapWrappedLists(parser, nodeContent, clazz);
    return (SubmodelElement)
        DeserializationHelper.createInstanceFromNode(parser, normalizedNode, clazz);
  }

  private String findSubmodelElementName(JsonParser parser, ObjectNode node)
      throws JsonMappingException {
    for (String value : SubmodelElementManager.NAME_TO_CLASS.keySet()) {
      if (node.has(value)) {
        return value;
      }
    }
    throw new JsonMappingException(parser, "Unknown element " + node);
  }

  private JsonNode unwrapWrappedLists(JsonParser parser, JsonNode node, Class<?> clazz) {
    if (!(node instanceof ObjectNode)) {
      return node;
    }
    ObjectCodec codec = parser.getCodec();
    if (!(codec instanceof ObjectMapper)) {
      return node;
    }
    ObjectMapper mapper = (ObjectMapper) codec;
    BeanDescription desc =
        mapper.getDeserializationConfig().introspect(mapper.constructType(clazz));
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
