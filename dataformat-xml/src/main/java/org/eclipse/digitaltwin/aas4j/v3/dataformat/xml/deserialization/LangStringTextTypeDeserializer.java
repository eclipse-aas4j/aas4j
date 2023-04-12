/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

import java.io.IOException;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.helper.LangStringContent;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringTextType;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;

public class LangStringTextTypeDeserializer extends AbstractLangStringDeserializer<LangStringTextType> {

	private static class LangStringTextTypeNodeDeserializer implements CustomJsonNodeDeserializer<LangStringTextType> {

		@Override
		public LangStringTextType readValue(JsonNode node, JsonParser parser) throws IOException {
			LangStringContent content = deserializer.readValue(node, parser);
			return new DefaultLangStringTextType.Builder().language(content.getLanguage()).text(content.getText()).build();
		}

	}

	public LangStringTextTypeDeserializer() {
		super("langStringTextType", new LangStringTextTypeNodeDeserializer());
    }
}
