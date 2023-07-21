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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Range;

/**
 * Range is serialized as named JSON object with ${Range/idShort} as the name of the containing JSON property. The JSON
 * object contains two JSON properties. The first is named "min". The second is named "max". Their corresponding values
 * are ${Range/min} and ${Range/max}.
 */
class RangeMapper extends AbstractMapper<Range> {
    private static final String MIN = "min";
    private static final String MAX = "max";

    RangeMapper(Range range, String idShortPath) {
        super(range, idShortPath);
    }

    @Override
    public JsonNode toJson() throws ValueOnlySerializationException {
        try {
            ObjectNode node = JsonNodeFactory.instance.objectNode();
            DataTypeDefXsd valueType = element.getValueType();
            node.set(MIN, ValueConverter.convert(valueType, element.getMin()));
            node.set(MAX, ValueConverter.convert(valueType, element.getMax()));
            return node;
        } catch (NumberFormatException ex) {
            throw new ValueOnlySerializationException("Cannot serialize the range with idShort path '" +
                idShortPath + "': " + ex.getMessage(), idShortPath);
        }
    }

    @Override
    public void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        element.setMax(PropertyMapper.readValueAsString("Cannot update Range." + MAX, idShortPath, valueOnly.get(MAX)));
        element.setMin(PropertyMapper.readValueAsString("Cannot update Range." + MIN, idShortPath, valueOnly.get(MIN)));
    }
}
