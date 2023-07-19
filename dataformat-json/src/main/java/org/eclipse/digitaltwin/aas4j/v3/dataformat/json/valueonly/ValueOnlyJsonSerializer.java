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
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

/**
 * This class implements the value-only Serialization in JSON format, as described in section 11.4.2 of <a
 * href="https://industrialdigitaltwin.org/wp-content/uploads/2023/06/IDTA-01002-3-0_SpecificationAssetAdministrationShell_Part2_API_.pdf">
 * AAS Specification Part 2</a><br>
 *
 * Values are only available for:
 * <ol>
 * <li>All subtypes of abstract type DataElement</li>
 * <li>SubmodelElementList and SubmodelElementCollection respectively for their included SubmodelElements</li>
 * <li>ReferenceElement</li>
 * <li>RelationshipElement + AnnotatedRelationshipElement</li>
 * <li>Entity</li>
 * <li>BasicEventElement</li>
 * </ol>
 */
public class ValueOnlyJsonSerializer {
    private final boolean prettyString;

    /**
     * The default constructor creates a value-only serializer which serializes submodels and submodel elements to a
     * compact string.
     */
    public ValueOnlyJsonSerializer() {
        this(false);
    }

    /**
     * Creates a value-only serializer.
     * @param prettyString pass true, if you want to have a pretty formatted strings.
     */
    public ValueOnlyJsonSerializer(boolean prettyString) {
        this.prettyString = prettyString;
    }

    /**
     * Serializes a submodel in value-only JSON format.
     * @param submodel the submodel to be serialized.
     * @return the corresponding value-only JSON string.
     */
    public String write(Submodel submodel) throws ValueOnlySerializationException {
        ElementsCollectionSerializer serializer = new ElementsCollectionSerializer(submodel.getSubmodelElements(), "$");
        JsonNode node = serializer.serialize();
        return prettyString ? node.toPrettyString() : node.toString();
    }

    /**
     * Serializes a submodel element in value-only JSON format.
     * @param element the submodel element to be serialized.
     * @return the corresponding value-only JSON string.
     * @param element
     * @return
     */
    public String write(SubmodelElement element) throws ValueOnlySerializationException {
        JsonNode node = ElementsCollectionSerializer.serialize(element, "$");
        return prettyString ? node.toPrettyString() : node.toString();
    }
}