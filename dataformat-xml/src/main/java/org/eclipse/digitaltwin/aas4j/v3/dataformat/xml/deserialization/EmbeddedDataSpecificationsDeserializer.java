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
import java.util.Objects;
import java.util.Set;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import static java.util.Spliterator.ORDERED;
import static java.util.Spliterators.spliteratorUnknownSize;
import static java.util.stream.StreamSupport.stream;
import static org.eclipse.digitaltwin.aas4j.v3.dataformat.core.ReflectionHelper.getDefaultImplementation;
import static org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization.DeserializationHelper.createInstanceFromNode;

public class EmbeddedDataSpecificationsDeserializer extends JsonDeserializer<DataSpecificationContent> {

    @Override
    public DataSpecificationContent deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        if (node == null) {
            return null;
        }

        return createEmbeddedDataSpecificationsFromContent(parser, node);
    }


    private DataSpecificationContent createEmbeddedDataSpecificationsFromContent(JsonParser parser, JsonNode node) throws IOException {
        final Set<Class<?>> subtypes = ReflectionHelper.SUBTYPES.get(DataSpecificationContent.class);

        Pair<String, ? extends Class<?>> typeMapping = stream(spliteratorUnknownSize(node.fieldNames(), ORDERED), false)
                .flatMap(fieldName -> subtypes.stream().map(subtype -> (subtype.getSimpleName().equalsIgnoreCase(fieldName)) ? Pair.of(fieldName, subtype) : null))
                .filter(Objects::nonNull)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No subtype could be determined for creating EmbeddedDataSpecifications from content!"));
        JsonNode nodeContent = node.get(typeMapping.getKey());
        Class<?> instanceType = getDefaultImplementation(typeMapping.getValue());
        return (DataSpecificationContent) createInstanceFromNode(parser, nodeContent, instanceType);
    }

}
