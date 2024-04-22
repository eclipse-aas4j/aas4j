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

import java.util.Iterator;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.deserialization.EnumDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.EntityType;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

import static org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization.EnumSerializer.serializeEnumName;
/**
 * Entity is serialized as named JSON object with ${Entity/idShort} as the name of the containing JSON property. The
 * JSON object contains three JSON properties. The first is named “statements” ${Entity/statements} and contains an
 * array of the serialized submodel elements according to their respective serialization mentioned in this clause. The
 * second is named either “globalAssetId” or “specificAssetId” and contains either a Reference (see above) or a
 * SpecificAssetId. SpecificAssetId is serialized as named JSON object with the values of the properties “name” for the
 * JSON key and “value” for the JSON value. The third property is named “entityType” and contains a string
 * representation of ${Entity/entityType}.
 */
class EntityMapper extends AbstractMapper<Entity> {
    private static final String STATEMENTS = "statements";
    private static final String GLOBAL_ASSET_ID = "globalAssetId";
    private static final String SPECIFIC_ASSET_ID = "specificAssetId";
    private static final String ENTITY_TYPE = "entityType";

    EntityMapper(Entity entity, String idShortPath) {
        super(entity, idShortPath);
    }

    @Override
    public JsonNode toJson() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        ElementsListMapper<Entity> statementsMapper = new ElementsListMapper<>(
                element, element.getStatements(), idShortPath + "." + STATEMENTS);
        node.set(STATEMENTS, statementsMapper.toJson());
        String globalAssetId = element.getGlobalAssetId();
        if(globalAssetId != null) {
            node.set(GLOBAL_ASSET_ID, new TextNode(globalAssetId));
        }
        List<SpecificAssetId> specificAssetIds = element.getSpecificAssetIds();
        if(specificAssetIds != null && !specificAssetIds.isEmpty()) {
            ObjectNode assetIdNode = JsonNodeFactory.instance.objectNode();
            for (SpecificAssetId assetId : specificAssetIds) {
                assetIdNode.set(assetId.getValue(), new TextNode(assetId.getName()));
            }
            node.set(SPECIFIC_ASSET_ID, assetIdNode);
        }
        node.set(ENTITY_TYPE, new TextNode(serializeEnumName(element.getEntityType().name())));
         return asValueNode(node);
    }

    @Override
    public void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        JsonNode value = valueFromNode("Cannot update entity", idShortPath, valueOnly);
        JsonNode statementsNode = value.get(STATEMENTS);
        if(statementsNode == null) {
            element.getStatements().clear();
        } else {
            ElementsListMapper<Entity> statementsMapper = new ElementsListMapper<>(
                    element, element.getStatements(), idShortPath + "." + STATEMENTS);
            statementsMapper.update(statementsNode);
        }
        JsonNode globalAssetIdNode = value.get(GLOBAL_ASSET_ID);
        if(globalAssetIdNode == null || globalAssetIdNode.isNull()) {
            element.setGlobalAssetId(null);
        } else if(globalAssetIdNode.isTextual()) {
            element.setGlobalAssetId(globalAssetIdNode.asText());
        } else {
            throw new ValueOnlySerializationException("Cannot update the Entity at idShort path '" +
                idShortPath + "', as the passed " + GLOBAL_ASSET_ID + " is not a string.", idShortPath);
        }
        JsonNode specificAssetIdNode = value.get(SPECIFIC_ASSET_ID);
        if(specificAssetIdNode != null) {
            if(!specificAssetIdNode.isObject()) {
                throw new ValueOnlySerializationException("Cannot update the Entity at idShort path '" +
                    idShortPath + "', as the passed " + SPECIFIC_ASSET_ID + " is not an object.", idShortPath);
            }
            updateSpecificAssetIds(element.getSpecificAssetIds(), (ObjectNode) specificAssetIdNode);
        }
        JsonNode entityTypeNode = value.get(ENTITY_TYPE);
        if(entityTypeNode == null || !entityTypeNode.isTextual()) {
            throw new ValueOnlySerializationException("Cannot update the Entity at idShort path '" +
                idShortPath + "', as its type is not set as string property '" + ENTITY_TYPE + "'.", idShortPath);
        }
        element.setEntityType(EntityType.valueOf(EnumDeserializer.deserializeEnumName(entityTypeNode.textValue())));
    }

    private void updateSpecificAssetIds(List<SpecificAssetId> specificAssetIds, ObjectNode objNode)
        throws ValueOnlySerializationException {
        for (Iterator<String> it = objNode.fieldNames(); it.hasNext(); ) {
            String name = it.next();
            SpecificAssetId specificAssetId = findSpecificAssetIdByName(specificAssetIds, name);
            JsonNode valueNode = objNode.get(name);
            if(!valueNode.isTextual()) {
                throw new ValueOnlySerializationException("Cannot update the SpecificAssetId at IdShort path '" +
                   idShortPath + "." + SPECIFIC_ASSET_ID + "." + name + "' as its value is not set as string property.",
                    idShortPath);
            }
            specificAssetId.setValue(valueNode.textValue());
        }
    }

    private SpecificAssetId findSpecificAssetIdByName(List<SpecificAssetId> specificAssetIds, String name)
        throws ValueOnlySerializationException {
        for (SpecificAssetId saId : specificAssetIds) {
            if(name.equals(saId.getName())) {
                return saId;
            }
        }
        throw new ValueOnlySerializationException(
            "Cannot find the SpecificAssetId with name '" + name + "'.", idShortPath + "." + SPECIFIC_ASSET_ID);
    }
}
