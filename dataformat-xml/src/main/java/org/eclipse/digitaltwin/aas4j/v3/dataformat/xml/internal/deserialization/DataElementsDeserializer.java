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
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.DataElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

public class DataElementsDeserializer extends JsonDeserializer<List<DataElement>> {

  SubmodelElementDeserializer deserializer = new SubmodelElementDeserializer();

  public DataElementsDeserializer(SubmodelElementDeserializer deserializer) {
    this.deserializer = deserializer;
  }

  public DataElementsDeserializer() {}

  @Override
  public List<DataElement> deserialize(JsonParser parser, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
    TreeNode treeNode = DeserializationHelper.getRootTreeNode(parser);
    if (treeNode instanceof TextNode) {
      return new ArrayList<>();
    }

    ObjectNode node = (ObjectNode) treeNode;

    Iterator<String> iter = node.fieldNames();
    List<DataElement> dataElements = new ArrayList<DataElement>();
    final ObjectMapper mapper = new ObjectMapper();
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
      throws IOException, JsonProcessingException {
    return (DataElement)
        DeserializationHelper.createInstanceFromNode(
            parser, dataElementNode, SubmodelElement.class);
  }
}
