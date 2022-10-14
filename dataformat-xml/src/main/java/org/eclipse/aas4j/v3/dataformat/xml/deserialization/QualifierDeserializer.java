/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2022 SAP SE
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
package org.eclipse.aas4j.v3.dataformat.xml.deserialization;

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

import org.eclipse.aas4j.v3.model.Qualifier;


public class QualifierDeserializer extends JsonDeserializer<List<Qualifier>> {


    public QualifierDeserializer() {
    }


    @Override
    public List<Qualifier> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        List<Qualifier> qualifiers = new ArrayList<>();

        if (!node.has("qualifier")) {
            return Collections.emptyList();
        }
        JsonNode qualifierNode = node.get("qualifier");
        if (qualifierNode.isArray()) {
            return createConstraintsFromArrayNode(parser, node);
        } else {
            Qualifier qualifier = DeserializationHelper.createInstanceFromNode(parser, qualifierNode, Qualifier.class);
            return Collections.singletonList(qualifier);
        }

    }

    @SuppressWarnings("unchecked")
    private List<Qualifier> createConstraintsFromArrayNode(JsonParser parser, ObjectNode node) throws IOException {
        ArrayNode content = (ArrayNode) node.get("qualifier");
        return (List<Qualifier>) DeserializationHelper.createInstancesFromArrayNode(parser, content, Qualifier.class);
    }

}