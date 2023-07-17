package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;

/**
 * BasicEventElement is serialized as named JSON object with ${BasicEventElement/idShort} as the name of the containing
 * JSON property. The JSON object contains one JSON property named “observed” with the corresponding value of
 * ${BasicEventElement/observed} as the standard serialization of the Reference class.
 */
public class BasicEventSerializer extends AbstractSerializer<BasicEventElement> {
    BasicEventSerializer(BasicEventElement event, String idShortPath) {
        super(event, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        node.set("observed", serializer.toJson(element.getObserved()));
        return node;
    }
}
