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


package org.eclipse.aas4j.v3.dataformat.xml.deserialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.aas4j.v3.model.Qualifier;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class QualifierDeserializer extends JsonDeserializer<List<Qualifier>> {

	private static final String QUALIFIER = "qualifier";

	@Override
	public List<Qualifier> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectNode node = DeserializationHelper.getRootObjectNode(parser);
		List<Qualifier> qualifiers = new ArrayList<>();

		List<Qualifier> createdQualifiers = createQualifierOfClass(parser, node);
		qualifiers.addAll(createdQualifiers);

		return qualifiers;
	}

	private List<Qualifier> createQualifierOfClass(JsonParser parser, ObjectNode node) throws IOException {
		if (!node.has(QUALIFIER)) {
			return Collections.emptyList();
		}
		JsonNode qualifierNode = node.get(QUALIFIER);
		if (qualifierNode.isArray()) {
			return createQualifierFromArrayNode(parser, node);
		} else {
			Qualifier constraint = DeserializationHelper.createInstanceFromNode(parser, qualifierNode, Qualifier.class);
			return Collections.singletonList(constraint);
		}
	}

	private List<Qualifier> createQualifierFromArrayNode(JsonParser parser, ObjectNode node) throws IOException {
		ArrayNode content = (ArrayNode) node.get(QUALIFIER);
		return DeserializationHelper.createInstancesFromArrayNode(parser, content, Qualifier.class);
	}

}
