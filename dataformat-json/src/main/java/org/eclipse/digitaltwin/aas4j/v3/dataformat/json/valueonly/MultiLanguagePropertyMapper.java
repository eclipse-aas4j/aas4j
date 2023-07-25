/*
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
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringTextType;

import java.util.Iterator;
import java.util.List;

/**
 * MultiLanguageProperty is serialized as named JSON object with ${MultiLanguageProperty/idShort} as the name of the
 * containing JSON property. The JSON object contains an array of JSON objects for each language of the
 * MultiLanguageProperty with the language as name and the corresponding localized string as value of the respective
 * JSON property. The language name is defined as two chars according to ISO 639-1.
 */
class MultiLanguagePropertyMapper extends AbstractMapper<MultiLanguageProperty> {

    MultiLanguagePropertyMapper(MultiLanguageProperty property, String idShortPath) {
        super(property, idShortPath);
    }

    @Override
    JsonNode toJson() throws ValueOnlySerializationException {
        List<LangStringTextType> langTexts = element.getValue();
        if(langTexts == null || langTexts.size() == 0) {
            return NullNode.instance;
        }
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        for (LangStringTextType langText: langTexts) {
            node.set(langText.getLanguage(), new TextNode(langText.getText()));
        }
        return node;
    }

    @Override
    void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        if(!valueOnly.isObject()) {
            throw new ValueOnlySerializationException(
                "Cannot update the multi-language property at idShort path '" + idShortPath +
                "', as the passed value-only is not a JSON object.", idShortPath);
        }
        ObjectNode propNode = (ObjectNode)valueOnly;
        List<LangStringTextType> value = element.getValue();
        value.clear();
        for (Iterator<String> it = propNode.fieldNames(); it.hasNext(); ) {
            String language = it.next();
            JsonNode textNode = propNode.get(language);
            if(!textNode.isTextual()) {
                String fullPath = idShortPath + "." + language;
                throw new ValueOnlySerializationException(
                    "Cannot update the multi-language property at idShort path '" + fullPath +
                    "', as the passed value is not a string.", idShortPath);
            }
            value.add(new DefaultLangStringTextType.Builder().language(language).text(textNode.textValue()).build());
        }
    }
}
