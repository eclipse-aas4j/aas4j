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
package org.eclipse.aas4j.v3.rc02.dataformat.xml.deserialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Custom deserializer for lists without individual list entry wrappers for parametrized classes.
 * 
 * @param <T> deserialized class within the list
 */
public class NoEntryWrapperListDeserializer<T extends Object> extends JsonDeserializer<List<T>> {
    protected final String elementName;
    private CustomJsonNodeDeserializer<T> nodeDeserializer;

    public NoEntryWrapperListDeserializer(String elementName, CustomJsonNodeDeserializer<T> nodeDeserializer) {
        this.elementName = elementName;
        this.nodeDeserializer = nodeDeserializer;
    }

    @Override
    public List<T> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        JsonNode langStringNode = node.get(elementName);
        if (langStringNode.isObject()) {
            return createEntriesFromObjectNode(langStringNode, parser);
        } else {
            return createEntriesFromArrayNode((ArrayNode) langStringNode, parser);
        }
    }

    private List<T> createEntriesFromArrayNode(ArrayNode langStringsNode, JsonParser parser) throws IOException {
        List<T> entries = new ArrayList<>();
        for (int i = 0; i < langStringsNode.size(); i++) {
            JsonNode nextNode = langStringsNode.get(i);
            entries.add(nodeDeserializer.readValue(nextNode, parser));
        }
        return entries;
    }

    private List<T> createEntriesFromObjectNode(JsonNode langStringNode, JsonParser parser) throws IOException {
        T entry = nodeDeserializer.readValue(langStringNode, parser);
        return Collections.singletonList(entry);
    }
}
