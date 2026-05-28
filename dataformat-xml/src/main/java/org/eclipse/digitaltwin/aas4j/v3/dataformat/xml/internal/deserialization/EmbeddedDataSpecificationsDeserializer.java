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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DatabindException;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.node.ObjectNode;

public class EmbeddedDataSpecificationsDeserializer
    extends ValueDeserializer<DataSpecificationContent> {

  private static final Logger logger =
      LoggerFactory.getLogger(EmbeddedDataSpecificationsDeserializer.class);

  @Override
  public DataSpecificationContent deserialize(JsonParser parser, DeserializationContext ctxt)
      throws JacksonException {
    ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
    if (node == null) {
      return null;
    }
    return createEmbeddedDataSpecificationsFromContent(ctxt, parser, node);
  }

  private DataSpecificationContent createEmbeddedDataSpecificationsFromContent(
      DeserializationContext ctxt, JsonParser parser, JsonNode node) throws JacksonException {
    JsonNode contentNode = node;
    if (contentNode.isObject() && contentNode.has("dataSpecificationContent")) {
      contentNode = contentNode.get("dataSpecificationContent");
    }
    if (contentNode == null || contentNode.isNull()) {
      return null;
    }

    Set<Class<?>> subtypes = ReflectionHelper.SUBTYPES.get(DataSpecificationContent.class);
    if (subtypes == null || subtypes.isEmpty()) {
      throw DatabindException.from(
          parser, "No known subtypes of DataSpecificationContent registered");
    }
    if (contentNode.isObject()) {
      for (Map.Entry<String, JsonNode> field : contentNode.properties()) {
        DataSpecificationContent content =
            tryDeserializeDataSpecification(ctxt, field.getKey(), field.getValue(), subtypes);
        if (content != null) {
          return content;
        }
      }
    }

    DataSpecificationContent direct = tryDeserializeFromNode(ctxt, contentNode, subtypes);
    if (direct != null) {
      return direct;
    }

    throw DatabindException.from(
        parser,
        "Was expecting a known subclass of DataSpecificationContent but found " + contentNode);
  }

  private DataSpecificationContent tryDeserializeDataSpecification(
      DeserializationContext ctxt, String fieldName, JsonNode fieldValue, Set<Class<?>> subtypes)
      throws JacksonException {
    Iterator<Class<?>> iter = subtypes.iterator();
    while (iter.hasNext()) {
      Class<?> clazz = iter.next();
      if (matchesType(fieldName, clazz)) {
        try {
          return (DataSpecificationContent)
              DeserializationHelper.createInstanceFromNode(ctxt, fieldValue, clazz);
        } catch (Exception e) {
          if (logger.isDebugEnabled()) {
            logger.debug(
                "Failed to deserialize field '{}' as {}: {}",
                fieldName,
                clazz.getSimpleName(),
                e.getMessage());
          }
        }
      }
    }
    return null;
  }

  private DataSpecificationContent tryDeserializeFromNode(
      DeserializationContext ctxt, JsonNode node, Set<Class<?>> subtypes) throws JacksonException {
    for (Class<?> clazz : subtypes) {
      try {
        return (DataSpecificationContent)
            DeserializationHelper.createInstanceFromNode(ctxt, node, clazz);
      } catch (Exception e) {
        if (logger.isDebugEnabled()) {
          logger.debug(
              "Failed to deserialize node as {}: {}", clazz.getSimpleName(), e.getMessage());
        }
      }
    }
    return null;
  }

  private boolean matchesType(String fieldName, Class<?> clazz) {
    String normalizedField = normalize(fieldName);
    return matchesType(normalizedField, clazz, new HashSet<>());
  }

  private boolean matchesType(String normalizedFieldName, Class<?> clazz, Set<Class<?>> visited) {
    if (clazz == null || !visited.add(clazz)) {
      return false;
    }
    if (normalizedFieldName.equals(normalize(clazz.getSimpleName()))) {
      return true;
    }
    for (Class<?> iface : clazz.getInterfaces()) {
      if (matchesType(normalizedFieldName, iface, visited)) {
        return true;
      }
    }
    return matchesType(normalizedFieldName, clazz.getSuperclass(), visited);
  }

  private String normalize(String value) {
    if (value == null) {
      return "";
    }
    return value.toLowerCase().replace("dataspecification", "").replaceAll("[^a-z0-9]", "");
  }
}
