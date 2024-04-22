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

package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ValueReferencePair;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultValueReferencePair;

import java.io.IOException;

public class ValueReferencePairNodeDeserializer implements CustomJsonNodeDeserializer<ValueReferencePair> {
    @Override
    public ValueReferencePair readValue(JsonNode node, JsonParser parser) throws IOException {
        String value = node.get("value").asText();
		Reference valueId = DeserializationHelper.createInstanceFromNode(parser, node.get("valueId"), Reference.class);
		return new DefaultValueReferencePair.Builder().value(value).valueId(valueId).build();
    }
}
