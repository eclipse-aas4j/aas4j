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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class OperationVariableDeserializer extends JsonDeserializer<List<OperationVariable>> {
    private static Logger logger = LoggerFactory.getLogger(OperationVariableDeserializer.class);

    @Override
    public List<OperationVariable> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        try {
            ObjectNode node = DeserializationHelper.getRootObjectNode(parser);

            if (!node.has("operationVariable")) {
                return Collections.emptyList();
            }
            JsonNode operationVariableNode = node.get("operationVariable");
            if (operationVariableNode.isArray()) {
                return createOperationVariablesFromArrayNode(parser, node);
            } else {
                OperationVariable operationVariable = DeserializationHelper.createInstanceFromNode(parser, operationVariableNode, OperationVariable.class);
                return Collections.singletonList(operationVariable);
            }
        } catch (ClassCastException e) {
            logger.info("Found empty list item in Operation (e.g., '<outputVariables />') in XML. This is most likely an error.");
            return new ArrayList<OperationVariable>();
        }
    }


    private List<OperationVariable> createOperationVariablesFromArrayNode(JsonParser parser, ObjectNode node) throws IOException {
        ArrayNode content = (ArrayNode) node.get("operationVariable");

        return DeserializationHelper.createInstancesFromArrayNode(parser, content, OperationVariable.class);
    }


}