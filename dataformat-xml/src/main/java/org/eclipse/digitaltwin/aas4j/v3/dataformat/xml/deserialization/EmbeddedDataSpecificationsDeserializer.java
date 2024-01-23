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
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class EmbeddedDataSpecificationsDeserializer extends JsonDeserializer<DataSpecificationContent> {


    @Override
    public DataSpecificationContent deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException {
        ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
        if (node == null) {
            return null;
        }

        return createEmbeddedDataSpecificationsFromContent(parser, node);
    }


    private DataSpecificationContent createEmbeddedDataSpecificationsFromContent(JsonParser parser, JsonNode node) throws IOException {
        String class_name = node.fieldNames().next();
        Set<Class<?>> subtypes = ReflectionHelper.SUBTYPES.get(DataSpecificationContent.class);
        Iterator<Class<?>> iter = subtypes.iterator();
        while (iter.hasNext()) {
            Class clazz = iter.next();
            if (clazz.getSimpleName().toLowerCase().contains(class_name.toLowerCase())) {
                try {
                    JsonNode nodeContent = node.get(class_name);
                    return (DataSpecificationContent) DeserializationHelper.createInstanceFromNode(parser, nodeContent, clazz);
                } catch (Exception e) {
                    // do nothing and try next in list
                }
            }
        };

        throw new IOException("Was expecting a known subclass of DataSpecificationContent but found " + class_name);
    }

}
