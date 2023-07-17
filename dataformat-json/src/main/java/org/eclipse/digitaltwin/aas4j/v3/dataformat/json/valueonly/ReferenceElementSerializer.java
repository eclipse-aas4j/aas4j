package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;

/**
 * ReferenceElement is serialized as ${ReferenceElement/idShort}: ${ReferenceElement/value} where
 * ${ReferenceElement/value} is the serialization of the Reference class.
 */
public class ReferenceElementSerializer extends AbstractSerializer<ReferenceElement> {
    ReferenceElementSerializer(ReferenceElement element, String idShortPath) {
        super(element, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        return serializer.toJson(element.getValue());
    }
}
