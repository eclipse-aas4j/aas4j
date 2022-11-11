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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.modeltype;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.function.Consumer;

/**
 * Helper class to traverse a JsonNode recursive and applying an operation to
 * each node
 */
public class JsonTreeProcessor {

    private final Consumer<ObjectNode> operator;

    public static void traverse(JsonNode node, Consumer<ObjectNode> operator) {
        new JsonTreeProcessor(operator).traverse(node);
    }

    public JsonTreeProcessor(Consumer<ObjectNode> operator) {
        this.operator = operator;
    }

    public void traverse(JsonNode node) {
        if (null == node.getNodeType()) {
            return;
        }
        switch (node.getNodeType()) {
            case ARRAY:
                node.elements().forEachRemaining(x -> traverse(x));
                break;
            case OBJECT:
                operator.accept((ObjectNode) node);
                node.elements().forEachRemaining(x -> traverse(x));
                break;
            default:
            // do nothing
        }
    }
}
