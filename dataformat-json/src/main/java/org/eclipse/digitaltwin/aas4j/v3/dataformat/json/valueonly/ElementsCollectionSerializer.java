/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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
import com.fasterxml.jackson.databind.node.NullNode;
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

import java.util.List;

/**
 * SubmodelElementCollection is serialized as named JSON object with ${SubmodelElementCollection/idShort} as the name of
 * the containing JSON property. The elements contained within the struct are serialized according to their respective
 * type with ${SubmodelElement/idShort} as the name of the containing JSON property.
 */
public class ElementsCollectionSerializer extends AbstractSerializer<List<SubmodelElement>> {
    ElementsCollectionSerializer(List<SubmodelElement> elements, String idShortPath) {
        super(elements, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        for(SubmodelElement submodelElement : element) {
            String idShort = submodelElement.getIdShort();
            JsonNode elementNode = serialize(submodelElement, idShortPath + "." + idShort);
            if(elementNode.equals(NullNode.instance)) {
                // This type of submodel elements are not serialized in value-only format.
                continue;
            }
            if(node.has(idShort)) {
                throw new ValueOnlySerializationException("Duplicated idShort name '" + idShort +
                    "' under idShort path '" + idShortPath + "'");
            }
            node.set(idShort, elementNode);
        }
        return node;
    }

    static JsonNode serialize(SubmodelElement element, String idShortPath) throws ValueOnlySerializationException {
        if(element instanceof Blob) {
            return new BlobSerializer((Blob) element, idShortPath).serialize();
        }
        if(element instanceof File) {
            return new FileSerializer((File) element, idShortPath).serialize();
        }
        if(element instanceof MultiLanguageProperty) {
            return new MultiLanguagePropertySerializer((MultiLanguageProperty)element, idShortPath).serialize();
        }
        if(element instanceof Property) {
            return new PropertySerializer((Property)element, idShortPath).serialize();
        }
        if(element instanceof Range) {
            return new RangeSerializer((Range) element, idShortPath).serialize();
        }
        if(element instanceof ReferenceElement) {
            return new ReferenceElementSerializer((ReferenceElement) element, idShortPath).serialize();
        }
        if(element instanceof Entity) {
            return new EntitySerializer((Entity) element, idShortPath).serialize();
        }
        if(element instanceof BasicEventElement) {
            return new BasicEventSerializer((BasicEventElement) element, idShortPath).serialize();
        }
        if(element instanceof SubmodelElementCollection) {
            return new ElementsCollectionSerializer(((SubmodelElementCollection)element).getValue(), idShortPath).serialize();
        }
        if(element instanceof SubmodelElementList) {
            return new ElementsListSerializer(((SubmodelElementCollection)element).getValue(), idShortPath).serialize();
        }
        if(element instanceof AnnotatedRelationshipElement) {
            return new AnnotatedRelationshipSerializer((AnnotatedRelationshipElement) element, idShortPath).serialize();
        }
        if(element instanceof RelationshipElement) {
            return new RelationshipSerializer((RelationshipElement) element, idShortPath).serialize();
        }

        // This type of submodel element should not be serialized.
        return NullNode.instance;
    }
}
