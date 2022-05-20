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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.adminshell.aas.v3.model.Constraint;
import io.adminshell.aas.v3.model.Formula;
import io.adminshell.aas.v3.model.Qualifier;

public class ConstraintsDeserializer extends JsonDeserializer<List<Constraint>> {
    private Map<String, Class<? extends Constraint>> classMap = new HashMap<>();

    public ConstraintsDeserializer() {
        classMap.put("qualifier", Qualifier.class);
        classMap.put("formula", Formula.class);
    }

    public ConstraintsDeserializer(Map<String, Class<? extends Constraint>> classMap) {
        this.classMap = classMap;
    }

    @Override
    public List<Constraint> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        List<Constraint> constraints = new ArrayList<>();
        for (String className : classMap.keySet()) {
            List<Constraint> createdConstraints = createConstraintsOfClass(parser, node, className);
            constraints.addAll(createdConstraints);
        }
        return constraints;
    }

    private List<Constraint> createConstraintsOfClass(JsonParser parser, ObjectNode node, String className) throws IOException {
        if (!node.has(className)) {
            return Collections.emptyList();
        }
        JsonNode qualifierNode = node.get(className);
        if (qualifierNode.isArray()) {
            return createConstraintsFromArrayNode(parser, node, className);
        } else {
            Constraint constraint = DeserializationHelper.createInstanceFromNode(parser, qualifierNode, classMap.get(className));
            return Collections.singletonList(constraint);
        }
    }

    @SuppressWarnings("unchecked")
    private List<Constraint> createConstraintsFromArrayNode(JsonParser parser, ObjectNode node, String className) throws IOException {
        ArrayNode content = (ArrayNode) node.get(className);
        return (List<Constraint>) DeserializationHelper.createInstancesFromArrayNode(parser, content, classMap.get(className));
    }

}
