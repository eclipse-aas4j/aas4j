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
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.DataElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

import java.util.ArrayList;
import java.util.List;

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
    JsonNode toJson() throws ValueOnlySerializationException {
        ObjectNode node = (ObjectNode) super.toJson();
        List<SubmodelElement> annotations = new ArrayList<>(((AnnotatedRelationshipElement)element).getAnnotations());
        if(annotations.size() > 0) {
            ElementsListMapper listMapper = new ElementsListMapper(
                annotations, idShortPath + "." + ANNOTATIONS);
            node.set(ANNOTATIONS, listMapper.toJson());
        }
        return node;
    }

    @Override
    void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        super.update(valueOnly);
        List<DataElement> annotations = ((AnnotatedRelationshipElement)element).getAnnotations();
        JsonNode annotationsNode = valueOnly.get(ANNOTATIONS);
        if(annotationsNode == null || annotationsNode.isNull()) {
            annotations.clear();
        } else {
            List<SubmodelElement> elements = new ArrayList<>(annotations);
            ElementsListMapper listMapper = new ElementsListMapper(elements, idShortPath + "." + ANNOTATIONS);
            listMapper.update(annotationsNode);
        }
    }
}
