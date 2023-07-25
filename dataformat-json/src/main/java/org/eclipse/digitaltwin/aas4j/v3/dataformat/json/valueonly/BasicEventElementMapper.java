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
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;

/**
 * BasicEventElement is serialized as named JSON object with ${BasicEventElement/idShort} as the name of the containing
 * JSON property. The JSON object contains one JSON property named “observed” with the corresponding value of
 * ${BasicEventElement/observed} as the standard serialization of the Reference class.
 */
class BasicEventElementMapper extends AbstractMapper<BasicEventElement> {
    private static final String OBSERVED = "observed";

    BasicEventElementMapper(BasicEventElement event, String idShortPath) {
        super(event, idShortPath);
    }

    @Override
    JsonNode toJson() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        node.set(OBSERVED, new JsonValueOnlyDeserialiser().toJson(element.getObserved()));
        return node;
    }

    @Override
    void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        element.setObserved(new JsonValueOnlyDeserialiser().deserialiseReference(valueOnly.get(OBSERVED), idShortPath));
    }
}
