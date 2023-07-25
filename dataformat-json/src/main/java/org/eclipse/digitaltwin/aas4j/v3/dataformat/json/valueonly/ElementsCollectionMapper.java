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
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Blob;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Range;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;

import java.util.Iterator;
import java.util.List;

/**
 * SubmodelElementCollection is serialized as named JSON object with ${SubmodelElementCollection/idShort} as the name of
 * the containing JSON property. The elements contained within the struct are serialized according to their respective
 * type with ${SubmodelElement/idShort} as the name of the containing JSON property.
 */
class ElementsCollectionMapper extends AbstractMapper<List<SubmodelElement>> {
    ElementsCollectionMapper(List<SubmodelElement> elements, String idShortPath) {
        super(elements, idShortPath);
    }

    @Override
    JsonNode toJson() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        for(SubmodelElement submodelElement : element) {
            String idShort = submodelElement.getIdShort();
            if(node.has(idShort)) {
                throw new ValueOnlySerializationException("Duplicated idShort name '" + idShort +
                    "' under idShort path '" + idShortPath + "'.", idShortPath);
            }
            AbstractMapper mapper = createMapper(submodelElement, idShortPath + "." + idShort);
            if(mapper == null) {
                // This type of submodel elements are not serialized in value-only format.
                continue;
            }
            node.set(idShort, mapper.toJson());
        }
        return node;
    }

    @Override
    void update(JsonNode valueOnly) throws ValueOnlySerializationException {
        if(!valueOnly.isObject()) {
            throw new ValueOnlySerializationException(
                "Cannot update the submodel elements collection at idShort path '" + idShortPath +
                "', as the corresponding value-only is not a JSON object.", idShortPath);
        }
        ObjectNode objNode = (ObjectNode) valueOnly;
        for (Iterator<String> it = objNode.fieldNames(); it.hasNext(); ) {
            String idShort = it.next();
            SubmodelElement submodelElement = findElementByIdShort(idShort);
            AbstractMapper mapper = createMapper(submodelElement, idShortPath + "." + idShort);
            mapper.update(objNode.get(idShort));
        }
    }

    /**
     * Creates the corresponding mapper.
     * @param element the submodel element.
     * @param idShortPath the idShort path.
     * @return the corresponding mapper or null if this type cannot be serialized to value-only JSON string.
     */
    static AbstractMapper createMapper(SubmodelElement element, String idShortPath) {
        if(element instanceof Blob) {
            return new BlobMapper((Blob) element, idShortPath);
        }
        if(element instanceof File) {
            return new FileMapper((File) element, idShortPath);
        }
        if(element instanceof MultiLanguageProperty) {
            return new MultiLanguagePropertyMapper((MultiLanguageProperty)element, idShortPath);
        }
        if(element instanceof Property) {
            return new PropertyMapper((Property)element, idShortPath);
        }
        if(element instanceof Range) {
            return new RangeMapper((Range) element, idShortPath);
        }
        if(element instanceof ReferenceElement) {
            return new ReferenceElementMapper((ReferenceElement) element, idShortPath);
        }
        if(element instanceof Entity) {
            return new EntityMapper((Entity) element, idShortPath);
        }
        if(element instanceof BasicEventElement) {
            return new BasicEventElementMapper((BasicEventElement) element, idShortPath);
        }
        if(element instanceof SubmodelElementCollection) {
            return new ElementsCollectionMapper(((SubmodelElementCollection)element).getValue(), idShortPath);
        }
        if(element instanceof SubmodelElementList) {
            return new ElementsListMapper(((SubmodelElementList)element).getValue(), idShortPath);
        }
        if(element instanceof AnnotatedRelationshipElement) {
            return new AnnotatedRelationshipMapper((AnnotatedRelationshipElement) element, idShortPath);
        }
        if(element instanceof RelationshipElement) {
            return new RelationshipElementMapper((RelationshipElement) element, idShortPath);
        }
        return null;
    }

    private SubmodelElement findElementByIdShort(String idShort) throws ValueOnlySerializationException {
        for (SubmodelElement submodelElement : element) {
            if(idShort.equals(submodelElement.getIdShort())) {
                return submodelElement;
            }
        }
        throw new ValueOnlySerializationException("Cannot find submodel element with idShort '" + idShort +
            "' at idShort path '" + idShortPath + "'.", idShortPath);
    }
}
