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

import java.io.IOException;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.helper.LangStringContent;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIEC61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringDefinitionTypeIEC61360;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * 
 * @author schnicke
 *
 */
public class LangStringDefinitionTypeIEC61360Deserializer extends AbstractLangStringDeserializer<LangStringDefinitionTypeIEC61360> {


	private static class LangStringDefinitionTypeIEC61360NodeDeserializer implements CustomJsonNodeDeserializer<LangStringDefinitionTypeIEC61360> {

		@Override
		public LangStringDefinitionTypeIEC61360 readValue(JsonNode node, JsonParser parser) throws IOException {
			LangStringContent content = deserializer.readValue(node, parser);
			return new DefaultLangStringDefinitionTypeIEC61360.Builder().language(content.getLanguage()).text(content.getText()).build();
		}

	}

    public LangStringDefinitionTypeIEC61360Deserializer() {
		super("langStringDefinitionTypeIec61360", new LangStringDefinitionTypeIEC61360NodeDeserializer());
    }
}
