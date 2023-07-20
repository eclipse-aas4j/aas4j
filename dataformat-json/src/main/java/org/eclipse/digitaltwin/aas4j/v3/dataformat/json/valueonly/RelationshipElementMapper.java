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

import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;

import static org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly.ValueOnlyMapper.serializer;
import static org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly.ValueOnlyMapper.deserializer;

/**
 * RelationshipElement is serialized as named JSON object with ${RelationshipElement/idShort} as the name of the
 * containing JSON property. The JSON object contains two JSON properties. The first is named "first". The second is
 * named "second". Their corresponding values are ${RelationshipElement/first} resp. ${Relationship/second}. The values
 * are serialized according to the serialization of a Reference.
 */
public class RelationshipElementMapper extends AbstractMapper<RelationshipElement> {
    private static final String FIRST = "first";
    private static final String SECOND = "second";

    RelationshipElementMapper(RelationshipElement relationship, String idShortPath) {
        super(relationship, idShortPath);
    }

    @Override
    public JsonNode toJson() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        node.set(FIRST, serializer.toJson(element.getFirst()));
        node.set(SECOND, serializer.toJson(element.getSecond()));
        return node;
    }

    @Override
    public void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        element.setFirst(deserializer.parseReference(valueOnly.get(FIRST), idShortPath + "." + FIRST));
        element.setSecond(deserializer.parseReference(valueOnly.get(SECOND), idShortPath + "." + SECOND));
    }
}
