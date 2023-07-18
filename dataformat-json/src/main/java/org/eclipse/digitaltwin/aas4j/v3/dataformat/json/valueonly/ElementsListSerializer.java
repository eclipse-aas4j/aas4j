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

import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import java.util.List;

/**
 * SubmodelElementList is serialized as a JSON array with the index of the contained SubmodelElement in the list as the
 * position in the JSON array. The elements contained within the list are serialized according to their respective type.
 */
public class ElementsListSerializer extends ElementsCollectionSerializer {
    ElementsListSerializer(List<SubmodelElement> elements, String idShortPath) {
        super(elements, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        ArrayNode arrayNode = JsonNodeFactory.instance.arrayNode();
        for(int i = 0; i < element.size(); i++) {
            SubmodelElement submodelElement = element.get(i);
            arrayNode.add(serialize(submodelElement, idShortPath + "[" + i + "]"));
        }
        return arrayNode;
    }
}
