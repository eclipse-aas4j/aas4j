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

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.node.ArrayNode;
import tools.jackson.databind.node.ObjectNode;

/**
 * Custom deserializer for lists without individual list entry wrappers for parametrized classes.
 *
 * @param <T> deserialized class within the list
 */
public class NoEntryWrapperListDeserializer<T> extends ValueDeserializer<List<T>> {
  protected final String elementName;
  private CustomJsonNodeDeserializer<T> nodeDeserializer;
  private static Logger logger = LoggerFactory.getLogger(NoEntryWrapperListDeserializer.class);

  public NoEntryWrapperListDeserializer(
      String elementName, CustomJsonNodeDeserializer<T> nodeDeserializer) {
    this.elementName = elementName;
    this.nodeDeserializer = nodeDeserializer;
  }

  @Override
  public List<T> deserialize(JsonParser parser, DeserializationContext ctxt)
      throws tools.jackson.core.JacksonException {
    try {
      ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
      JsonNode langStringNode = node.get(elementName);
      if (langStringNode.isObject()) {
        return createEntriesFromObjectNode(langStringNode, ctxt);
      } else {
        return createEntriesFromArrayNode((ArrayNode) langStringNode, ctxt);
      }
    } catch (ClassCastException e) {
      logger.info(
          "Found empty list item (e.g., '<preferredName />' of dataSpecificationIec61360) in XML. This is most likely an error.");
      return new ArrayList<T>();
    }
  }

  private List<T> createEntriesFromArrayNode(ArrayNode langStringsNode, DeserializationContext ctxt)
      throws tools.jackson.core.JacksonException {
    List<T> entries = new ArrayList<>();
    for (int i = 0; i < langStringsNode.size(); i++) {
      JsonNode nextNode = langStringsNode.get(i);
      entries.add(nodeDeserializer.readValue(nextNode, ctxt));
    }
    return entries;
  }

  private List<T> createEntriesFromObjectNode(JsonNode langStringNode, DeserializationContext ctxt)
      throws tools.jackson.core.JacksonException {
    T entry = nodeDeserializer.readValue(langStringNode, ctxt);
    return Lists.newArrayList(entry);
  }
}
