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
import org.eclipse.digitaltwin.aas4j.v3.model.DataElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.core.TreeNode;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.node.ObjectNode;
import tools.jackson.databind.node.StringNode;

public class DataElementsDeserializer extends ValueDeserializer<List<DataElement>> {

  SubmodelElementDeserializer deserializer = new SubmodelElementDeserializer();

  public DataElementsDeserializer(SubmodelElementDeserializer deserializer) {
    this.deserializer = deserializer;
  }

  public DataElementsDeserializer() {}

  @Override
  public List<DataElement> deserialize(JsonParser parser, DeserializationContext ctxt)
      throws JacksonException {
    TreeNode treeNode = DeserializationHelper.getRootTreeNode(parser);
    if (treeNode instanceof StringNode) {
      return new ArrayList<>();
    }

    ObjectNode node = (ObjectNode) treeNode;

    Iterator<String> iter = node.propertyNames().iterator();
    List<DataElement> dataElements = new ArrayList<DataElement>();
    final JsonMapper mapper = JsonMapper.builder().build();
    while (iter.hasNext()) {
      String fieldName = iter.next();
      ObjectNode dataElementNode = (ObjectNode) node.get(fieldName);
      final ObjectNode nodeElement = mapper.createObjectNode();
      nodeElement.set(fieldName, dataElementNode);
      DataElement elem = createDataElementFromNode(parser, ctxt, nodeElement);
      dataElements.add(elem);
    }

    return dataElements;
  }

  private DataElement createDataElementFromNode(
      JsonParser parser, DeserializationContext ctxt, ObjectNode dataElementNode)
      throws JacksonException {
    return (DataElement)
        DeserializationHelper.createInstanceFromNode(ctxt, dataElementNode, SubmodelElement.class);
  }
}
