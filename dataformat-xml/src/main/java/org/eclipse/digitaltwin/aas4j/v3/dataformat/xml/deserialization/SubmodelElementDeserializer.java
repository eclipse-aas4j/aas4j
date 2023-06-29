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

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.SubmodelElementManager;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

public class SubmodelElementDeserializer extends JsonDeserializer<SubmodelElement> {

    @Override
    public SubmodelElement deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        String elemName = findSubmodelElementName(parser, node);
        JsonNode nodeContent = node.get(elemName);
        return (SubmodelElement) DeserializationHelper.createInstanceFromNode(parser, nodeContent, SubmodelElementManager.getClassByXmlName(elemName));
    }

    private String findSubmodelElementName(JsonParser parser, ObjectNode node) throws JsonMappingException {
        for (String value : SubmodelElementManager.NAME_TO_CLASS.keySet()) {
            if (node.has(value)) {
                return value;
            }
        }
        throw new JsonMappingException(parser, "Unknown element " + node);
    }
}
