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
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.DataSpecificationManager;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationIEC61360;

import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIEC61360;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

// TODO fix the EmbeddedDataSpecification issue
public class EmbeddedDataSpecificationsDeserializer extends JsonDeserializer<List<DataSpecificationContent>> {

    @Override
    public List<DataSpecificationContent> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        if (node == null) {
            return null;
        }

        return createEmbeddedDataSpecificationsFromContent(parser, node);
    }

    private JsonNode getReferenceNode(JsonParser parser, JsonNode node) throws JsonMappingException {
        if (!node.has(DataSpecificationManager.PROP_DATA_SPECIFICATION)) {
            throw new JsonMappingException(parser, String.format("data specification must contain node '%s'", DataSpecificationManager.PROP_DATA_SPECIFICATION));
        }
        JsonNode nodeDataSpecification = node.get(DataSpecificationManager.PROP_DATA_SPECIFICATION);
        return nodeDataSpecification;
    }

    private List<DataSpecificationContent> createEmbeddedDataSpecificationsFromContent(JsonParser parser, JsonNode node) throws IOException {
        JsonNode nodeContent = node.get(DataSpecificationManager.PROP_DATA_SPECIFICATION_CONTENT);
        JsonNode specificationNode = nodeContent.get("dataSpecificationIEC61360");
        DataSpecificationContent content = createDefaultDataSpecificationIEC61360FromNode(parser, specificationNode);
        return Collections.singletonList(content);
    }

    private DataSpecificationContent createDefaultDataSpecificationIEC61360FromNode(JsonParser parser, JsonNode nodeContent) throws IOException {
        return DeserializationHelper.createInstanceFromNode(parser, nodeContent, DefaultDataSpecificationIEC61360.class);
    }

}
