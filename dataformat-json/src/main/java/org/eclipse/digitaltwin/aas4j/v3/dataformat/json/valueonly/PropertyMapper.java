/*
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Property is serialized as ${Property/idShort}: ${Property/value} where ${Property/value} is the JSON serialization
 * of the respective property’s value in accordance with the data type to value mapping.
 * @see ValueConverter
 */
class PropertyMapper extends AbstractMapper<Property> {
    PropertyMapper(Property property, String idShortPath) {
        super(property, idShortPath);
    }

    @Override
    public JsonNode toJson() throws ValueOnlySerializationException {
        try {
            JsonNode value = ValueConverter.convert(element.getValueType(), element.getValue());
            return asValueNode(value);
        } catch (NumberFormatException ex) {
            throw new ValueOnlySerializationException("Cannot serialize the property with idShort path '" +
                idShortPath + "': " + ex.getMessage(), idShortPath);
        }
    }

    @Override
    public void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        JsonNode valueNode = valueFromNode("Cannot update the property", idShortPath, valueOnly);
        element.setValue(readValueAsString("Cannot update the property", idShortPath, valueNode));
    }
}