/*******************************************************************************
 * Copyright (C) 2022 the Eclipse BaSyx Authors
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT
 ******************************************************************************/

/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2022 SAP SE
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.collect.Lists;

public class QualifierDeserializer extends JsonDeserializer<List<Qualifier>> {

    private static Logger logger = LoggerFactory.getLogger(QualifierDeserializer.class);

    @Override
    public List<Qualifier> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        try {
            ObjectNode node = DeserializationHelper.getRootObjectNode(parser);

            if (!node.has("qualifier")) {
                return new ArrayList<>();
            }
            JsonNode qualifierNode = node.get("qualifier");
            if (qualifierNode.isArray()) {
                return createConstraintsFromArrayNode(parser, node);
            } else {
                Qualifier qualifier = DeserializationHelper.createInstanceFromNode(parser, qualifierNode,
                        Qualifier.class);
                return Lists.newArrayList(qualifier);
            }
        } catch (ClassCastException e) {
            logger.info("Found empty list item of qualifiers ('<qualifiers />') in XML. This is most likely an error.");
            return new ArrayList<Qualifier>();
        }

    }

    private List<Qualifier> createConstraintsFromArrayNode(JsonParser parser, ObjectNode node) throws IOException {
        ArrayNode content = (ArrayNode) node.get("qualifier");
        return DeserializationHelper.createInstancesFromArrayNode(parser, content, Qualifier.class);
    }

}
