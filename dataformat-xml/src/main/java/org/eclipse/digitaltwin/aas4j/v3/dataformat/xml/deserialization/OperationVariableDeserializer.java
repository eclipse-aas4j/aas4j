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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class OperationVariableDeserializer extends JsonDeserializer<List<OperationVariable>> {


    public OperationVariableDeserializer() {
    }


    @Override
    public List<OperationVariable> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
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

    }


    private List<OperationVariable> createOperationVariablesFromArrayNode(JsonParser parser, ObjectNode node) throws IOException {
        ArrayNode content = (ArrayNode) node.get("operationVariable");

        return (List<OperationVariable>) DeserializationHelper.createInstancesFromArrayNode(parser, content, OperationVariable.class);
    }


}