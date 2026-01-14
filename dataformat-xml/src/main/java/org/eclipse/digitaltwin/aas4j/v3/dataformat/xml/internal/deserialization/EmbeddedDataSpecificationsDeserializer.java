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
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;

public class EmbeddedDataSpecificationsDeserializer
    extends JsonDeserializer<DataSpecificationContent> {

  @Override
  public DataSpecificationContent deserialize(JsonParser parser, DeserializationContext ctxt)
      throws IOException {
    ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
    if (node == null) {
      return null;
    }

    return createEmbeddedDataSpecificationsFromContent(parser, node);
  }

  private DataSpecificationContent createEmbeddedDataSpecificationsFromContent(
      JsonParser parser, JsonNode node) throws IOException {
    JsonNode contentNode = node;
    if (contentNode.isObject() && contentNode.has("dataSpecificationContent")) {
      contentNode = contentNode.get("dataSpecificationContent");
    }
    if (contentNode == null || contentNode.isNull()) {
      return null;
    }

    Set<Class<?>> subtypes = ReflectionHelper.SUBTYPES.get(DataSpecificationContent.class);
    if (subtypes == null || subtypes.isEmpty()) {
      throw new IOException("No known subtypes of DataSpecificationContent registered");
    }
    if (contentNode.isObject()) {
      Iterator<Map.Entry<String, JsonNode>> fields = contentNode.fields();
      while (fields.hasNext()) {
        Map.Entry<String, JsonNode> field = fields.next();
        DataSpecificationContent content =
            tryDeserializeDataSpecification(parser, field.getKey(), field.getValue(), subtypes);
        if (content != null) {
          return content;
        }
      }
    }

    DataSpecificationContent direct = tryDeserializeFromNode(parser, contentNode, subtypes);
    if (direct != null) {
      return direct;
    }

    throw new IOException(
        "Was expecting a known subclass of DataSpecificationContent but found " + contentNode);
  }

  private DataSpecificationContent tryDeserializeDataSpecification(
      JsonParser parser, String fieldName, JsonNode fieldValue, Set<Class<?>> subtypes)
      throws IOException {
    Iterator<Class<?>> iter = subtypes.iterator();
    while (iter.hasNext()) {
      Class<?> clazz = iter.next();
      if (matchesType(fieldName, clazz)) {
        try {
          return (DataSpecificationContent)
              DeserializationHelper.createInstanceFromNode(parser, fieldValue, clazz);
        } catch (Exception e) {
          // do nothing and try next in list
        }
      }
    }
    return null;
  }

  private DataSpecificationContent tryDeserializeFromNode(
      JsonParser parser, JsonNode node, Set<Class<?>> subtypes) throws IOException {
    for (Class<?> clazz : subtypes) {
      try {
        return (DataSpecificationContent)
            DeserializationHelper.createInstanceFromNode(parser, node, clazz);
      } catch (Exception e) {
        // do nothing and try next in list
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
