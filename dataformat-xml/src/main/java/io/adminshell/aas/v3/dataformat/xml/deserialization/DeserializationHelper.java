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
package io.adminshell.aas.v3.dataformat.xml.deserialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DeserializationHelper {
    public static <T> T createInstanceFromNode(JsonParser parser, JsonNode node, Class<T> clazz) throws IOException {
        JsonParser parserContent = parser.getCodec().getFactory().getCodec().treeAsTokens(node);
        parserContent.nextToken();
        T instance = parserContent.readValueAs(clazz);
        return instance;
    }

    public static <T> List<T> createInstancesFromArrayNode(JsonParser parser, ArrayNode node, Class<T> clazz) throws IOException {
        List<T> instances = new ArrayList<>();
        for (int i = 0; i < node.size(); i++) {
            T instance = DeserializationHelper.createInstanceFromNode(parser, node.get(i), clazz);
            instances.add(instance);
        }
        return instances;
    }

    public static TreeNode getRootTreeNode(JsonParser parser) throws IOException {
        return parser.getCodec().readTree(parser);
    }

    public static ObjectNode getRootObjectNode(JsonParser parser) throws IOException {
        return (ObjectNode) getRootTreeNode(parser);
    }
}
