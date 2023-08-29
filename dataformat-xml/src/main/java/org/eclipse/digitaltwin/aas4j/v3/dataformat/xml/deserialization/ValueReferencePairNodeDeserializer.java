package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.deserialization;

import java.io.IOException;

import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ValueReferencePair;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultValueReferencePair;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;

public class ValueReferencePairNodeDeserializer implements CustomJsonNodeDeserializer<ValueReferencePair> {
    @Override
    public ValueReferencePair readValue(JsonNode node, JsonParser parser) throws IOException {
        String value = node.get("value").asText();
		Reference valueId = DeserializationHelper.createInstanceFromNode(parser, node.get("valueId"), Reference.class);
		return new DefaultValueReferencePair.Builder().value(value).valueId(valueId).build();
    }
}
