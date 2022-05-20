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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;

import io.adminshell.aas.v3.model.Key;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import io.adminshell.aas.v3.model.impl.DefaultKey;

public class KeyDeserializer implements CustomJsonNodeDeserializer<Key> {


    @Override
    public Key readValue(JsonNode node, JsonParser parser) throws IOException {
        JsonNode idTypeNode = node.get("idType");
        JsonNode typeNode = node.get("type");
        JsonNode valueNode = node.get("");
        KeyType idType = createKeyTypeFromNode(parser, idTypeNode);
        KeyElements type = createKeyElementsFromNode(parser, typeNode);
        String value = valueNode.asText();
        return new DefaultKey.Builder().idType(idType).type(type).value(value).build();
    }

    private KeyElements createKeyElementsFromNode(JsonParser parser, JsonNode typeNode) throws IOException {
        return DeserializationHelper.createInstanceFromNode(parser, typeNode, KeyElements.class);
    }

    private KeyType createKeyTypeFromNode(JsonParser parser, JsonNode idTypeNode) throws IOException {
        return DeserializationHelper.createInstanceFromNode(parser, idTypeNode, KeyType.class);
    }

}
