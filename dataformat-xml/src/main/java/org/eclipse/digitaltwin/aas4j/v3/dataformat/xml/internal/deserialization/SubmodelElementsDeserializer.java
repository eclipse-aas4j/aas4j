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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.core.TreeNode;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.node.ArrayNode;
import tools.jackson.databind.node.ObjectNode;
import tools.jackson.databind.node.StringNode;

public class SubmodelElementsDeserializer extends ValueDeserializer<List<SubmodelElement>> {

  private SubmodelElementDeserializer deserializer = new SubmodelElementDeserializer();

  public SubmodelElementsDeserializer(SubmodelElementDeserializer deserializer) {
    this.deserializer = deserializer;
  }

  public SubmodelElementsDeserializer() {}

  @Override
  public List<SubmodelElement> deserialize(JsonParser parser, DeserializationContext ctxt)
      throws JacksonException {
    TreeNode treeNode = DeserializationHelper.getRootTreeNode(parser);
    if (treeNode instanceof StringNode) {
      return new ArrayList<>();
    } else {
      return createSubmodelElements(parser, ctxt, treeNode);
    }
  }

  private List<SubmodelElement> createSubmodelElements(
      JsonParser parser, DeserializationContext ctxt, TreeNode treeNode) throws JacksonException {
    if (treeNode.isArray()) {
      return getSubmodelElementsFromArrayNode(parser, ctxt, (ArrayNode) treeNode);
    } else {
      return getSubmodelElementsFromObjectNode(parser, ctxt, (JsonNode) treeNode);
    }
  }

  private List<SubmodelElement> getSubmodelElementsFromObjectNode(
      JsonParser parser, DeserializationContext ctxt, JsonNode nodeSubmodelElement)
      throws JacksonException {

    Iterator<String> iter = nodeSubmodelElement.propertyNames().iterator();
    List<SubmodelElement> submodelElements = new ArrayList<SubmodelElement>();

    while (iter.hasNext()) {
      String submodelElementName = iter.next();
      final JsonMapper mapper = JsonMapper.builder().build();
      final ObjectNode node = mapper.createObjectNode();
      node.set(submodelElementName, nodeSubmodelElement.get(submodelElementName));
      if (nodeSubmodelElement.get(submodelElementName).isArray()) {
        ArrayNode arrayNode = (ArrayNode) nodeSubmodelElement.get(submodelElementName);
        for (int i = 0; i < arrayNode.size(); i++) {
          final ObjectNode nodeElement = mapper.createObjectNode();
          nodeElement.set(submodelElementName, arrayNode.get(i));
          submodelElements.add(getSubmodelElementFromJsonNode(parser, ctxt, nodeElement));
        }
      } else {
        SubmodelElement elem = getSubmodelElementFromJsonNode(parser, ctxt, node);
        submodelElements.add(elem);
      }
    }

    return submodelElements;
  }

  private List<SubmodelElement> getSubmodelElementsFromArrayNode(
      JsonParser parser, DeserializationContext ctxt, ArrayNode arrayNode) throws JacksonException {
    List<SubmodelElement> elements = new ArrayList<>();
    for (int i = 0; i < arrayNode.size(); i++) {
      JsonNode jsonNode = arrayNode.get(i);
      SubmodelElement elem = getSubmodelElementFromJsonNode(parser, ctxt, jsonNode);
      elements.add(elem);
    }
    return elements;
  }

  private SubmodelElement getSubmodelElementFromJsonNode(
      JsonParser parser, DeserializationContext ctxt, JsonNode nodeSubmodelElement)
      throws JacksonException {
    return DeserializationHelper.createInstanceFromNode(
        ctxt, nodeSubmodelElement, SubmodelElement.class);
  }
}
