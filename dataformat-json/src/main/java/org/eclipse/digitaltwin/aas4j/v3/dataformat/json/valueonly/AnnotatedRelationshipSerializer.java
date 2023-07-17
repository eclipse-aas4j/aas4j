package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import java.util.ArrayList;
import java.util.List;

/**
 * AnnotatedRelationshipElement is serialized according to the serialization of a ReleationshipElement. Additionally, a
 * third named JSON object is introduced with "annotations" as the name of the containing JSON property. The value is
 * ${AnnotatedRelationshipElement/annotations}. The values of the array items are serialized depending on the type of
 * the annotation data element.
 */
public class AnnotatedRelationshipSerializer extends AbstractSerializer<AnnotatedRelationshipElement> {
    AnnotatedRelationshipSerializer(AnnotatedRelationshipElement relationship, String idShortPath) {
        super(relationship, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        node.set("first", JsonNodeFactory.instance.pojoNode(element.getFirst()));
        node.set("second", JsonNodeFactory.instance.pojoNode(element.getSecond()));
        List<SubmodelElement> annotations = new ArrayList<>(element.getAnnotations());
        ElementsListSerializer listSerializer = new ElementsListSerializer(
            annotations, idShortPath + ".annotations");
        node.set("annotations", listSerializer.serialize());
        return node;
    }
}
