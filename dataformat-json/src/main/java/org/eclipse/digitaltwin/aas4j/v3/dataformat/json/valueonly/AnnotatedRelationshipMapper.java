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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.DataElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * AnnotatedRelationshipElement is serialized according to the serialization of a ReleationshipElement. Additionally, a
 * third named JSON object is introduced with "annotations" as the name of the containing JSON property. The value is
 * ${AnnotatedRelationshipElement/annotations}. The values of the array items are serialized depending on the type of
 * the annotation data element.
 */
class AnnotatedRelationshipMapper extends RelationshipElementMapper {
    private static final String ANNOTATIONS = "annotations";
    AnnotatedRelationshipMapper(AnnotatedRelationshipElement relationship, String idShortPath) {
        super(relationship, idShortPath);
    }

    @Override
    public JsonNode toJson() throws ValueOnlySerializationException {
        ObjectNode valueNode = (ObjectNode) super.toJson();
        AnnotatedRelationshipElement annotatedRelationshipElement = (AnnotatedRelationshipElement) element;
        List<SubmodelElement> annotations = new ArrayList<>(annotatedRelationshipElement.getAnnotations());
        if(!annotations.isEmpty()) {
            ElementsListMapper<AnnotatedRelationshipElement> listMapper = new ElementsListMapper<>(
                    annotatedRelationshipElement, annotations, idShortPath + "." + ANNOTATIONS);
            ObjectNode dataNode = (ObjectNode) valueNode.get(element.getIdShort());
            dataNode.set(ANNOTATIONS, listMapper.toJson());
        }
        return valueNode;
    }

    @Override
    public void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        super.update(valueOnly);
        AnnotatedRelationshipElement annotatedRelationshipElement = (AnnotatedRelationshipElement) element;
        List<DataElement> annotations = annotatedRelationshipElement.getAnnotations();
        JsonNode value = valueFromNode("Cannot update the annotated relationship", idShortPath, valueOnly);
        JsonNode annotationsNode = value.get(ANNOTATIONS);
        if(annotationsNode == null || annotationsNode.isNull()) {
            annotations.clear();
        } else {
            List<SubmodelElement> elements = new ArrayList<>(annotations);
            ElementsListMapper<AnnotatedRelationshipElement> listMapper = new ElementsListMapper<>(annotatedRelationshipElement, elements, idShortPath + "." + ANNOTATIONS);
            listMapper.update(annotationsNode);
        }
    }
}
