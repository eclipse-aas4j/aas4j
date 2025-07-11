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
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

public class ReferencesDeserializer extends JsonDeserializer<List<Reference>> {

  @Override
  public List<Reference> deserialize(JsonParser parser, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
    TreeNode treeNode = DeserializationHelper.getRootTreeNode(parser);
    treeNode = treeNode.get("reference");
    if (treeNode.isArray()) {
      return createReferencesFromArray(parser, (ArrayNode) treeNode);
    } else {
      return createReferencesFromObjectNode(parser, (ObjectNode) treeNode);
    }
  }

  private List<Reference> createReferencesFromObjectNode(JsonParser parser, ObjectNode node)
      throws IOException {
    Reference reference = createReference(parser, node);
    return Lists.newArrayList(reference);
  }

  private List<Reference> createReferencesFromArray(JsonParser parser, ArrayNode arrayNode)
      throws IOException {
    List<Reference> references = new ArrayList<>();
    for (int i = 0; i < arrayNode.size(); i++) {
      Reference reference = createReference(parser, (ObjectNode) arrayNode.get(i));
      references.add(reference);
    }
    return references;
  }

  private Reference createReference(JsonParser parser, ObjectNode node) throws IOException {
    return DeserializationHelper.createInstanceFromNode(parser, node, Reference.class);
  }
}
