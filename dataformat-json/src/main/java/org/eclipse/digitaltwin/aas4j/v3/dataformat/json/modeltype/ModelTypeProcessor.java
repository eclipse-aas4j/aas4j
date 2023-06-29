/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Helper class to deal with nested nature of modelType property in JSON. As
 * Jackson can not natively deal with such nested type information, this class
 * offers functions to unwrapp the modelType information via the preprocess(...)
 * method and wrap it again via postprocess(...).
 */
public class ModelTypeProcessor {

    private static final String MODEL_TYPE = "modelType";
    private static final String MODEL_TYPE_NAME = "name";

    /**
     * Unwrapps type information recursively, e.g. converts
     * <pre>
     * "modelType": {
     *      "name": "Foo"
     * }
     * </pre> to
     * <pre>
     * "modelType": "Foo"
     * </pre>
     *
     * @param json json as string
     * @return root node with unwrapped type information
     * @throws JsonProcessingException parsing JSON fails
     */
    public static JsonNode preprocess(String json) throws JsonProcessingException {
        JsonNode result = new ObjectMapper().readTree(json);
        JsonTreeProcessor.traverse(result,
                x -> {
                    if (x.get(MODEL_TYPE) != null) {
                        x.replace(MODEL_TYPE, x.get(MODEL_TYPE).get(MODEL_TYPE_NAME));
                    }
                });
        return result;
    }

    /**
     * Wraps type information recursively, e.g. converts
     * <pre>
     * "modelType": "Foo"
     * </pre> to
     * <pre>
     * "modelType": {
     *      "name": "Foo"
     * }
     * </pre>
     *
     * @param node root node
     * @return transformed root node
     * @throws JsonProcessingException parsing JSON fails
     */
    public static JsonNode postprocess(JsonNode node) throws JsonProcessingException {
        JsonTreeProcessor.traverse(node,
                x -> {
                    if (x.get(MODEL_TYPE) != null && x.get(MODEL_TYPE).isTextual()) {
                        ObjectNode nodeModelType = JsonNodeFactory.instance.objectNode();
                        nodeModelType.set(MODEL_TYPE_NAME, JsonNodeFactory.instance.textNode(x.get(MODEL_TYPE).asText()));
                        x.replace(MODEL_TYPE, nodeModelType);
                    }
                });
        return node;
    }
}
