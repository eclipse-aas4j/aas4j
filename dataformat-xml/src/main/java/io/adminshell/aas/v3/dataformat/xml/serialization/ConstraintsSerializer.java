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
package io.adminshell.aas.v3.dataformat.xml.serialization;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import io.adminshell.aas.v3.model.Constraint;
import io.adminshell.aas.v3.model.Formula;
import io.adminshell.aas.v3.model.Qualifier;

public class ConstraintsSerializer extends JsonSerializer<List<Constraint>> {

    @Override
    public void serialize(List<Constraint> value, JsonGenerator gen, SerializerProvider serializers)
            throws IOException {
        ToXmlGenerator xgen = (ToXmlGenerator) gen;
        xgen.writeStartObject();
        for (Constraint constraint : value) {
            if (constraint instanceof Qualifier) {
                xgen.writeFieldName("qualifier");
            } else if (constraint instanceof Formula) {
                xgen.writeFieldName("formula");
            }
            xgen.writeObject(constraint);
        }
        xgen.writeEndObject();
    }

    @Override
    public boolean isEmpty(SerializerProvider provider, List<Constraint> value) {
        return value == null || value.isEmpty();
    }
}
