/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company.
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
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIec61360;

import java.io.IOException;

public class EmbeddedDataSpecificationsDeserializer extends JsonDeserializer<DataSpecificationIec61360> {

    private static final String PROP_DATA_SPECIFICATION_CONTENT = "dataSpecificationIec61360";

    @Override
    public DataSpecificationIec61360 deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        if (node == null) {
            return null;
        }

        return createEmbeddedDataSpecificationsFromContent(parser, node);
    }


    private DataSpecificationIec61360 createEmbeddedDataSpecificationsFromContent(JsonParser parser, JsonNode node) throws IOException {
        JsonNode nodeContent = node.get(PROP_DATA_SPECIFICATION_CONTENT);
        return createDefaultDataSpecificationIec61360FromNode(parser, nodeContent);
    }

    private DataSpecificationIec61360 createDefaultDataSpecificationIec61360FromNode(JsonParser parser, JsonNode nodeContent) throws IOException {
        return DeserializationHelper.createInstanceFromNode(parser, nodeContent, DefaultDataSpecificationIec61360.class);
    }

}
