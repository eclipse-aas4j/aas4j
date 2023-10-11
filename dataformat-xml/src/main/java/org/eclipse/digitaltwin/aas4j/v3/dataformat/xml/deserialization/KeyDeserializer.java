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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import org.eclipse.digitaltwin.aas4j.v3.model.Key;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;

import java.io.IOException;

public class KeyDeserializer implements CustomJsonNodeDeserializer<Key> {


    @Override
    public Key readValue(JsonNode node, JsonParser parser) throws IOException {
        JsonNode typeNode = node.get("type");
        JsonNode valueNode = node.get("value");
        KeyTypes type = createKeyTypesFromNode(parser, typeNode);
        String value = valueNode.asText();
        return new DefaultKey.Builder().type(type).value(value).build();
    }

    private KeyTypes createKeyTypesFromNode(JsonParser parser, JsonNode typeNode) throws IOException {
        return DeserializationHelper.createInstanceFromNode(parser, typeNode, KeyTypes.class);
    }

}
