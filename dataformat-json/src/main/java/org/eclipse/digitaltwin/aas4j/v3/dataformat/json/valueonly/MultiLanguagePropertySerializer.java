package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;

import java.util.List;

/**
 * MultiLanguageProperty is serialized as named JSON object with ${MultiLanguageProperty/idShort} as the name of the
 * containing JSON property. The JSON object contains an array of JSON objects for each language of the
 * MultiLanguageProperty with the language as name and the corresponding localized string as value of the respective
 * JSON property. The language name is defined as two chars according to ISO 639-1.
 */
public class MultiLanguagePropertySerializer extends AbstractSerializer<MultiLanguageProperty> {

    MultiLanguagePropertySerializer(MultiLanguageProperty property, String idShortPath) {
        super(property, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
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
}
