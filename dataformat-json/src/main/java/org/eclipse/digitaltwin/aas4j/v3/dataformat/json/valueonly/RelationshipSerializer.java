package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;

/**
 * RelationshipElement is serialized as named JSON object with ${RelationshipElement/idShort} as the name of the
 * containing JSON property. The JSON object contains two JSON properties. The first is named "first". The second is
 * named "second". Their corresponding values are ${RelationshipElement/first} resp. ${Relationship/second}. The values
 * are serialized according to the serialization of a Reference.
 */
public class RelationshipSerializer extends AbstractSerializer<RelationshipElement> {
    RelationshipSerializer(RelationshipElement relationship, String idShortPath) {
        super(relationship, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        node.set("first", JsonNodeFactory.instance.pojoNode(element.getFirst()));
        node.set("second", JsonNodeFactory.instance.pojoNode(element.getSecond()));
        return node;
    }
}
