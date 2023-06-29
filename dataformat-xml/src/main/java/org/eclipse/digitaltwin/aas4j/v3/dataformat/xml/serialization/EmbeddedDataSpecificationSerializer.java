/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 ** Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationIEC61360;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


/**
 * Custom Serializer for class DataSpecification. Adds type information in form
 * of a reference. Uses DataSpecificationManager to resolve java type to
 * reference.
 */
// TODO: solve EmbeddedDataSpecifiction issue
public class EmbeddedDataSpecificationSerializer extends JsonSerializer<DataSpecificationIEC61360> {

    private static final Logger logger = LoggerFactory.getLogger(EmbeddedDataSpecificationSerializer.class);

    @Override
    public void serialize(DataSpecificationIEC61360 data, JsonGenerator generator, SerializerProvider provider)
            throws IOException {
        if (data == null) {
            return;
        }
//        generator.writeFieldName(PROP_DATA_SPECIFICATION_CONTENT);
        generator.writeStartObject();
        // TODO: Add field name according to template type
        generator.writeObjectField("dataSpecificationIec61360", data);
        generator.writeEndObject();

    }

    @Override
    public void serializeWithType(DataSpecificationIEC61360 data, JsonGenerator generator, SerializerProvider provider,
            TypeSerializer typedSerializer) throws IOException, JsonProcessingException {
        serialize(data, generator, provider);
    }
}
