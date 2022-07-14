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

// TODO import io.adminshell.aas.v3.model.EmbeddedDataSpecification;

// TODO import io.adminshell.aas.v3.model.impl.DefaultDataSpecificationIEC61360;
// TODO import io.adminshell.aas.v3.model.impl.DefaultEmbeddedDataSpecification;

// TODO fix the EmbeddedDataSpecification issue
/* public class EmbeddedDataSpecificationsDeserializer extends JsonDeserializer<List<EmbeddedDataSpecification>> {

    @Override
    public List<EmbeddedDataSpecification> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        if (node == null) {
            return null;
        }
        if (node.has(DataSpecificationManager.PROP_DATA_SPECIFICATION_CONTENT)) {
            return createEmbeddedDataSpecificationsFromContent(parser, node);
        } else {
            return createEmbeddedDataSpecificationsFromReference(parser, node);
        }
    }

    private JsonNode getReferenceNode(JsonParser parser, JsonNode node) throws JsonMappingException {
        if (!node.has(DataSpecificationManager.PROP_DATA_SPECIFICATION)) {
            throw new JsonMappingException(parser, String.format("data specification must contain node '%s'", DataSpecificationManager.PROP_DATA_SPECIFICATION));
        }
        JsonNode nodeDataSpecification = node.get(DataSpecificationManager.PROP_DATA_SPECIFICATION);
        return nodeDataSpecification;
    }

    private List<EmbeddedDataSpecification> createEmbeddedDataSpecificationsFromContent(JsonParser parser, JsonNode node) throws IOException {
        JsonNode nodeContent = node.get(DataSpecificationManager.PROP_DATA_SPECIFICATION_CONTENT);
        JsonNode specificationNode = nodeContent.get("dataSpecificationIEC61360");
        DataSpecificationContent content = createDefaultDataSpecificationIEC61360FromNode(parser, specificationNode);
        return Collections.singletonList(new DefaultEmbeddedDataSpecification.Builder().dataSpecificationContent(content).build());
    }

    private List<EmbeddedDataSpecification> createEmbeddedDataSpecificationsFromReference(JsonParser parser, JsonNode node) throws IOException {
        JsonNode nodeDataSpecification = getReferenceNode(parser, node);
        Reference reference = DeserializationHelper.createInstanceFromNode(parser, nodeDataSpecification, Reference.class);
        return Collections.singletonList(new DefaultEmbeddedDataSpecification.Builder().dataSpecification(reference).build());
    }

    private DataSpecificationContent createDefaultDataSpecificationIEC61360FromNode(JsonParser parser, JsonNode nodeContent) throws IOException {
        return DeserializationHelper.createInstanceFromNode(parser, nodeContent, DefaultDataSpecificationIEC61360.class);
    }

}*/
