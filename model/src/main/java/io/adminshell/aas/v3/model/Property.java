/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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
package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A property is a data element that has a single value. Constraint AASd-052a: If the semanticId of
 * a Property references a ConceptDescription then the ConceptDescription/category shall be one of
 * following values: VALUE, PROPERTY. Constraint AASd-065: If the semanticId of a Property or
 * MultiLanguageProperty references a ConceptDescription with the category VALUE then the value of
 * the property is identical to DataSpecificationIEC61360/value and the valueId of the property is
 * identical to DataSpecificationIEC61360/valueId. Constraint AASd-066: If the semanticId of a
 * Property or MultiLanguageProperty references a ConceptDescription with the category PROPERTY and
 * DataSpecificationIEC61360/valueList is defined the value and valueId of the property is identical
 * to one of the value reference pair types references in the value list, i.e.
 * ValueReferencePairType/value or ValueReferencePairType/valueId, resp.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultProperty.class)
})
public interface Property extends DataElement {

    /**
     * Data type pf the value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueType
     *
     * @return Returns the String for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueType")
    String getValueType();

    /**
     * Data type pf the value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(String valueType);

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/value")
    String getValue();

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Reference to the global unique id of a coded value.
     *
     * Constraint AASd-007: if both, the value and the valueId are present then the value needs to be
     * identical to the value of the referenced coded value in valueId.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueId
     *
     * @return Returns the Reference for the property valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueId")
    Reference getValueId();

    /**
     * Reference to the global unique id of a coded value.
     *
     * Constraint AASd-007: if both, the value and the valueId are present then the value needs to be
     * identical to the value of the referenced coded value in valueId.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueId
     *
     * @param valueId desired value for the property valueId.
     */
    void setValueId(Reference valueId);

}
