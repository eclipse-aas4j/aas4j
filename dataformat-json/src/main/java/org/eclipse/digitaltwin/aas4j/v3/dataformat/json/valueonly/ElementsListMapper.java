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
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import com.fasterxml.jackson.databind.node.NullNode;

import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import java.util.List;

/**
 * SubmodelElementList is serialized as a JSON array with the index of the contained SubmodelElement in the list as the
 * position in the JSON array. The elements contained within the list are serialized according to their respective type.
 */
class ElementsListMapper extends ElementsCollectionMapper {
    ElementsListMapper(List<SubmodelElement> elements, String idShortPath) {
        super(elements, idShortPath);
    }

    @Override
    public JsonNode toJson() throws ValueOnlySerializationException {
        ArrayNode arrayNode = JsonNodeFactory.instance.arrayNode();
        for(int i = 0; i < element.size(); i++) {
            SubmodelElement submodelElement = element.get(i);
            AbstractMapper mapper = createMapper(submodelElement, idShortPath + "[" + i + "]");
            arrayNode.add(mapper == null ? NullNode.instance : mapper.toJson());
        }
        return arrayNode;
    }

    @Override
    public void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        if(!valueOnly.isArray()) {
            throw new ValueOnlySerializationException(
                "Cannot update the submodel elements list at idShort path '" + idShortPath +
                "', as the corresponding value-only is not a JSON array.", idShortPath);
        }
        ArrayNode arrayNode = (ArrayNode) valueOnly;
        if(arrayNode.size() != element.size()) {
            throw new ValueOnlySerializationException(
                "Cannot update the submodel elements list at idShort path '" + idShortPath +
                "', as the corresponding value-only array has different size.", idShortPath);
        }
        for (int i = 0; i < arrayNode.size(); i++ ) {
            SubmodelElement submodelElement = element.get(i);
            AbstractMapper mapper = createMapper(submodelElement, idShortPath + "[" + i + "]");
            mapper.update(arrayNode.get(i));
        }
    }
}
