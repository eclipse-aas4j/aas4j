package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import java.util.List;

/**
 * Entity is serialized as named JSON object with ${Entity/idShort} as the name of the containing JSON property. The
 * JSON object contains three JSON properties. The first is named “statements” ${Entity/statements} and contains an
 * array of the serialized submodel elements according to their respective serialization mentioned in this clause. The
 * second is named either “globalAssetId” or “specificAssetId” and contains either a Reference (see above) or a
 * SpecificAssetId. SpecificAssetId is serialized as named JSON object with the values of the properties “name” for the
 * JSON key and “value” for the JSON value. The third property is named “entityType” and contains a string
 * representation of ${Entity/entityType}.
 */
public class EntitySerializer extends AbstractSerializer<Entity> {

    EntitySerializer(Entity entity, String idShortPath) {
        super(entity, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        List<SubmodelElement> elements = element.getStatements();
        ElementsListSerializer ecSerializer = new ElementsListSerializer(elements, idShortPath + ".statements");
        node.set("statements", ecSerializer.serialize());
        String globalAssetId = element.getGlobalAssetId();
        if(globalAssetId != null) {
            node.set("globalAssetId", new TextNode(globalAssetId));
        }
        List<SpecificAssetId> specificAssetIds = element.getSpecificAssetIds();
        if(specificAssetIds != null && specificAssetIds.size() > 0) {
            ObjectNode assetIdNode = JsonNodeFactory.instance.objectNode();
            for (SpecificAssetId assetId : specificAssetIds) {
                assetIdNode.set(assetId.getValue(), new TextNode(assetId.getName()));
            }
            node.set("specificAssetId", assetIdNode);
        }
        node.set("entityType", new TextNode(element.getEntityType().name()));
        return node;
    }
}
