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
package org.eclipse.aas4j.v3.rc02.dataformat.core.deserialization;

// TODO import org.eclipse.aas4j.v3.rc02.model.EmbeddedDataSpecification;

// TODO import org.eclipse.aas4j.v3.rc02.model.impl.DefaultEmbeddedDataSpecification;

/**
 * Custom Deserializer for class DataSpecification. First reads property
 * PROP_DATA_SPECIFICATION and tries to resolve which Java class to use for
 * deserialization based on the found value with the help of
 * DataSpecificationManager.
 */
// TODO: solve the problem with EmbeddedDataSpecifications
/* public class EmbeddedDataSpecificationDeserializer extends JsonDeserializer<EmbeddedDataSpecification> {

    @Override
    public EmbeddedDataSpecification deserialize(JsonParser parser, DeserializationContext context)
            throws IOException, JsonProcessingException {
        Object temp = parser.getCodec().readTree(parser);
        ObjectNode node = (ObjectNode) temp;
        if (node == null) {
            return null;
        }
        JsonNode nodeDataSpecification = node.get(PROP_DATA_SPECIFICATION);
        if (nodeDataSpecification == null) {
            throw new JsonMappingException(parser,
                    String.format("data specification must contain node '%s'", PROP_DATA_SPECIFICATION));
        }
        JsonParser parserReference = parser.getCodec().getFactory().getCodec().treeAsTokens(nodeDataSpecification);
        parserReference.nextToken();
        Reference reference = parserReference.readValueAs(Reference.class);
        JsonNode nodeContent = node.get(PROP_DATA_SPECIFICATION_CONTENT);
        if (nodeContent != null) {
            Class<? extends DataSpecificationContent> targetClass = DataSpecificationManager.getDataSpecification(reference).getType();
            JsonParser parserContent = parser.getCodec().getFactory().getCodec().treeAsTokens(nodeContent);
            parserContent.nextToken();
            DataSpecificationContent content = parserContent.readValueAs(targetClass);
            return new DefaultEmbeddedDataSpecification.Builder().dataSpecificationContent(content).build();
        }
        return new DefaultEmbeddedDataSpecification.Builder().dataSpecification(reference).build();
    }
}
*/