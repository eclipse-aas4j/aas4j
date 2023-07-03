/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023 SAP SE
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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.Direction;
import org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Serializes enum values. If enum is part of the AAS Java model, the name will
 * be converted from SCREAMING_SNAKE_CASE to UpperCamelCase, else default
 * serialization will be used
 */
@SuppressWarnings("rawtypes")
public class EnumSerializer extends JsonSerializer<Enum> {

	@Override
	public void serialize(Enum value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (value instanceof DataTypeDefXsd) {
            // only for the DataTypeDefXsd notation
            if (value.equals(DataTypeDefXsd.ANY_URI)) {
                gen.writeString("xs:anyURI");
            } else if (value.equals(DataTypeDefXsd.NON_NEGATIVE_INTEGER)) {
                gen.writeString("xs:nonNegativeInteger");
            } else if(isTimeRelatedValue(value)) {
				handleTimeRelatedValue(gen, value);
            } else {
                // pattern: 'xs:' + camelCase
				String enum_string = serializeEnumName(value.name());
                gen.writeString("xs:" + enum_string.substring(0, 1).toLowerCase() + enum_string.substring(1));
            }
        } else if (value instanceof DataTypeIec61360) {
            gen.writeString(value.name().toUpperCase());
        } else if (value instanceof Direction || value instanceof StateOfEvent) {
            gen.writeString(value.name().toLowerCase());
        } else if (ReflectionHelper.ENUMS.contains(value.getClass())) {
			gen.writeString(serializeEnumName(value.name()));
        } else {
            provider.findValueSerializer(Enum.class).serialize(value, gen, provider);
        }
    }

	private void handleTimeRelatedValue(JsonGenerator gen, Enum<?> value) throws IOException {
		String enum_string = serializeEnumName(value.name());
		String adaptedEnumString = "xs:g" + enum_string.substring(1, 2).toUpperCase() + enum_string.substring(2);
		gen.writeString(adaptedEnumString);
	}

	private boolean isTimeRelatedValue(Enum<?> value) {
		String enum_string = serializeEnumName(value.name());
		return enum_string.startsWith("G");
	}

	/**
	 * Translates an enum value from SCREAMING_SNAKE_CASE to CamelCase
	 *
	 * @param input
	 *            input name in SCREAMING_SNAKE_CASE
	 * @return name in CamelCase
	 */
	public static String serializeEnumName(String input) {
		String result = "";
		boolean capitalize = true;
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if ('_' == currentChar) {
				capitalize = true;
			} else {
				result += capitalize ? currentChar : Character.toLowerCase(currentChar);
				capitalize = false;
			}
		}
		return result;
	}

}
