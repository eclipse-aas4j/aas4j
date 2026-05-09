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
import java.util.List;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.core.TreeNode;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.node.ArrayNode;
import tools.jackson.databind.node.ObjectNode;

public class DeserializationHelper {
  public static <T> T createInstanceFromNode(
      DeserializationContext ctxt, JsonNode node, Class<T> clazz) throws JacksonException {
    return ctxt.readTreeAsValue(node, clazz);
  }

  public static <T> List<T> createInstancesFromArrayNode(
      DeserializationContext ctxt, ArrayNode node, Class<T> clazz) throws JacksonException {
    List<T> instances = new ArrayList<>();
    for (int i = 0; i < node.size(); i++) {
      T instance = DeserializationHelper.createInstanceFromNode(ctxt, node.get(i), clazz);
      instances.add(instance);
    }
    return instances;
  }

  public static TreeNode getRootTreeNode(JsonParser parser) throws JacksonException {
    return parser.readValueAsTree();
  }

  public static ObjectNode getRootObjectNode(JsonParser parser) throws JacksonException {
    return (ObjectNode) getRootTreeNode(parser);
  }
}
