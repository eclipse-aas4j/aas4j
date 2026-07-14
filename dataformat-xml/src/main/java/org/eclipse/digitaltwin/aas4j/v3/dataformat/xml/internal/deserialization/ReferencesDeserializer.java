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
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.core.TreeNode;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.node.ArrayNode;
import tools.jackson.databind.node.ObjectNode;

public class ReferencesDeserializer extends ValueDeserializer<List<Reference>> {

  @Override
  public List<Reference> deserialize(JsonParser parser, DeserializationContext ctxt)
      throws JacksonException {
    TreeNode treeNode = DeserializationHelper.getRootTreeNode(parser);
    treeNode = treeNode.get("reference");
    if (treeNode.isArray()) {
      return createReferencesFromArray(ctxt, (ArrayNode) treeNode);
    } else {
      return createReferencesFromObjectNode(ctxt, (ObjectNode) treeNode);
    }
  }

  private List<Reference> createReferencesFromObjectNode(
      DeserializationContext ctxt, ObjectNode node) throws JacksonException {
    Reference reference = DeserializationHelper.createInstanceFromNode(ctxt, node, Reference.class);
    return Lists.newArrayList(reference);
  }

  private List<Reference> createReferencesFromArray(
      DeserializationContext ctxt, ArrayNode arrayNode) throws JacksonException {
    List<Reference> references = new ArrayList<>();
    for (int i = 0; i < arrayNode.size(); i++) {
      Reference reference =
          DeserializationHelper.createInstanceFromNode(ctxt, arrayNode.get(i), Reference.class);
      references.add(reference);
    }
    return references;
  }
}
