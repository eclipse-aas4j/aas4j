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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.AasUtils;

import org.eclipse.digitaltwin.aas4j.v3.model.Key;

public class KeySerializer extends JsonSerializer<Key> {

    @Override
    public void serialize(Key key, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        ToXmlGenerator xgen = (ToXmlGenerator) gen;
        xgen.writeObjectFieldStart("key");

        String keyTypeValue = key.getType().toString();
        xgen.setNextIsAttribute(false);
        xgen.writeFieldName("type");
        xgen.writeString(key.getType().name());

        xgen.setNextIsAttribute(false);
        xgen.writeFieldName("value");
        xgen.writeString(key.getValue());

        xgen.writeEndObject();
    }
}
