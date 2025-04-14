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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.JsonSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

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
public class JsonValueOnlySerialiser extends JsonSerializer {

    private final boolean prettyString;

    JsonNode toJson(Reference reference) {
        return mapper.valueToTree(reference) ;
    }

    JsonNode readTree(String jsonString) throws ValueOnlySerializationException {
            try {
                return mapper.readTree(jsonString);
            } catch (JsonProcessingException e) {
                throw new ValueOnlySerializationException("Cannot parse the value only string: ", e, "$");
            }

    }

    /**
     * The default constructor creates a value-only mapper which serializes and deserializes submodels and submodel
     * elements to a compact value-only JSON string.
     */
    public JsonValueOnlySerialiser() {
        this(false);
    }

    /**
     * Creates a value-only mapper.
     * @param prettyString pass true, if you want to have a pretty formatted value-only JSON strings.
     */
    public JsonValueOnlySerialiser(boolean prettyString) {
        this.prettyString = prettyString;
    }

    /**
     * Serializes a submodel in value-only JSON format.
     * @param submodel the submodel to be serialized. Not null.
     * @return the corresponding value-only JSON string.
     */
    public String serialise(Submodel submodel) throws ValueOnlySerializationException {
        SubmodelMapper mapper = new SubmodelMapper(submodel, "$");
        JsonNode node = mapper.toJson();
        return stringify(node);
    }

    /**
     * Update an existing submodel with the given value-only JSON string.
     * <br><b>Note:</b>The update is not an atomic operation and if an exception is thrown, the corresponding submodel
     * will be in an inconsistent state. If you cannot handle such situations, pass a copy of the original submodel.
     * @param submodel The submodel to be updated. If you want to prevent the direct modification of the original
     *                 submodel, just use the corresponding copy constructor, when you pass this argument. Not null.
     * @param valueOnly the valueOnly string. Not null.
     *
     */
    public void update(Submodel submodel, String valueOnly) throws ValueOnlySerializationException {
        JsonNode node = readTree(valueOnly);
        SubmodelMapper mapper = new SubmodelMapper(submodel, "$");
        mapper.update(node);
    }

    /**
     * Serializes a submodel element in value-only JSON format.
     * @param element the submodel element to be serialized. Not null.
     * @return the corresponding value-only JSON string.
     */
    public String serialise(SubmodelElement element) throws ValueOnlySerializationException {
        ValueOnlyMapper mapper = ValueOnlyMapper.createMapper(element, "$");
        if(mapper == null) {
            throw new ValueOnlySerializationException(
                "Value-only serialization is not allowed for submodel elements of type '" + element.getClass() + "'.",
                "$");
        }
        JsonNode node = mapper.toJson();
        return stringify(node);
    }

    /**
     * Update an existing submodel element with the given valueOnly.
     * <br><b>Note:</b>The update is not an atomic operation and if an exception is thrown, the corresponding element
     * will be in an inconsistent state. If you cannot handle such situations, pass a copy of the original element.
     * @param element The submodel element to be updated. If you want to prevent the direct modification of the original
     *                submodel element, just use the corresponding copy constructor, when you pass this argument.
     *                Not null.
     * @param valueOnly the valueOnly string. Not null.
     */
    public void update(SubmodelElement element, String valueOnly) throws ValueOnlySerializationException {
        JsonNode node = readTree(valueOnly);
        ValueOnlyMapper mapper = ValueOnlyMapper.createMapper(element, "$");
        mapper.update(node);
    }

    private String stringify(JsonNode node) {
        return prettyString ? node.toPrettyString() : node.toString();
    }
}
