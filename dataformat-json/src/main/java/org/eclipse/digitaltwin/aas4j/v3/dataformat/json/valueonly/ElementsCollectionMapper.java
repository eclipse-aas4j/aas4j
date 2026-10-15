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

import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * SubmodelElementCollection is serialized as named JSON object with ${SubmodelElementCollection/idShort} as the name of
 * the containing JSON property. The elements contained within the struct are serialized according to their respective
 * type with ${SubmodelElement/idShort} as the name of the containing JSON property.
 */
class ElementsCollectionMapper extends AbstractCollectionMapper<Referable> {
    ElementsCollectionMapper(Referable elementCollection, List<SubmodelElement> values, String idShortPath) {
        super(elementCollection, values, idShortPath);
    }

    @Override
    public JsonNode toJson() throws ValueOnlySerializationException {
        ObjectNode elementsNode = valuesToJson();
        return asValueNode(elementsNode);
    }

    @Override
    public void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        JsonNode value = valueFromNode("Cannot update submodel elements collection", idShortPath, valueOnly);
        updateFromJson(value);
    }
}
