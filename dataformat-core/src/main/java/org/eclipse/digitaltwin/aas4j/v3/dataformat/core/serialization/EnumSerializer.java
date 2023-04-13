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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.AasUtils;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXSD;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.Direction;
import org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent;

/**
 * Serializes enum values. If enum is part of the AAS Java model, the name will
 * be converted from SCREAMING_SNAKE_CASE to UpperCamelCase, else default
 * serialization will be used
 */
public class EnumSerializer extends JsonSerializer<Enum> {

    protected static final char UNDERSCORE = '_';

    @Override
    public void serialize(Enum value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (value instanceof DataTypeDefXSD) {
            // only for the DataTypeDefXsd notation
            if (value.equals(DataTypeDefXSD.ANY_URI)) {
                gen.writeString("xs:anyURI");
            } else if (value.equals(DataTypeDefXSD.NON_NEGATIVE_INTEGER)) {
                gen.writeString("xs:NonNegativeInteger");
            } else {
                // pattern: 'xs:' + camelCase
                String enum_string = AasUtils.serializeEnumName(value.name());
                gen.writeString("xs:" + enum_string.substring(0, 1).toLowerCase() + enum_string.substring(1));
            }
        } else if (value instanceof DataTypeIec61360) {
            gen.writeString(value.name().toUpperCase());
        } else if (value instanceof Direction || value instanceof StateOfEvent) {
            gen.writeString(value.name().toLowerCase());
        } else if (ReflectionHelper.ENUMS.contains(value.getClass())) {
            gen.writeString(AasUtils.serializeEnumName(value.name()));
        } else {
            provider.findValueSerializer(Enum.class).serialize(value, gen, provider);
        }
    }

}
