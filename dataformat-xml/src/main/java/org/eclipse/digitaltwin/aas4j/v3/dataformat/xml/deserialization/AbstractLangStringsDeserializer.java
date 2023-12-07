/*
 * Copyright (c) 2023 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.helper.LangStringContent;
import org.eclipse.digitaltwin.aas4j.v3.model.AbstractLangString;

import java.io.IOException;
import java.util.List;

/**
 * 
 * @author schnicke
 *
 * @param <T>
 */
public abstract class AbstractLangStringsDeserializer<T extends AbstractLangString> extends JsonDeserializer<List<T>> implements CustomJsonNodeDeserializer<T> {

	private static LangStringContentDeserializer contentDeserializer = new LangStringContentDeserializer();

	private NoEntryWrapperListDeserializer<T> deserializer;

	public AbstractLangStringsDeserializer(String elementName) {
		deserializer = new NoEntryWrapperListDeserializer<>(elementName, this);
	}

	@Override
	public List<T> deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		return deserializer.deserialize(parser, ctxt);
	}

	@Override
	public T readValue(JsonNode node, JsonParser parser) throws IOException {
		LangStringContent content = deserializeContent(node, parser);
		return createLangStringInstance(content);
	}

	protected abstract T createLangStringInstance(LangStringContent content);

	private LangStringContent deserializeContent(JsonNode node, JsonParser parser) throws IOException {
		return contentDeserializer.readValue(node, parser);
	}
}
