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

import java.io.IOException;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.DataSpecificationManager;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationIEC61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIEC61360;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class EmbeddedDataSpecificationsDeserializer extends JsonDeserializer<DataSpecificationIEC61360> {

    @Override
    public DataSpecificationIEC61360 deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        if (node == null) {
            return null;
        }

        return createEmbeddedDataSpecificationsFromContent(parser, node);
    }


    private DataSpecificationIEC61360 createEmbeddedDataSpecificationsFromContent(JsonParser parser, JsonNode node) throws IOException {
        JsonNode nodeContent = node.get(DataSpecificationManager.PROP_DATA_SPECIFICATION_CONTENT);
		return createDefaultDataSpecificationIEC61360FromNode(parser, nodeContent);
    }

    private DataSpecificationIEC61360 createDefaultDataSpecificationIEC61360FromNode(JsonParser parser, JsonNode nodeContent) throws IOException {
        return DeserializationHelper.createInstanceFromNode(parser, nodeContent, DefaultDataSpecificationIEC61360.class);
    }

}
