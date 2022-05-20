/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A qualifier is a type-value pair that makes additional statements w.r.t. the value of the
 * element. Constraint AASd-063: The semanticId of a Qualifier shall only reference a
 * ConceptDescription with the category QUALIFIER.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultQualifier.class)
})
public interface Qualifier extends Constraint, HasSemantics {

    /**
     * The qualifier type describes the type of the qualifier that is applied to the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/type
     *
     * @return Returns the String for the property type.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    String getType();

    /**
     * The qualifier type describes the type of the qualifier that is applied to the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/type
     *
     * @param type desired value for the property type.
     */
    void setType(String type);

    /**
     * The qualifier value is the value of the qualifier.
     *
     * Constraint AASd-006: if both, the value and the valueId are present then the value needs to be
     * identical to the short name of the referenced coded value in qualifierValueId.
     *
     * Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined
     * in Qualifier/valueType.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    String getValue();

    /**
     * The qualifier value is the value of the qualifier.
     *
     * Constraint AASd-006: if both, the value and the valueId are present then the value needs to be
     * identical to the short name of the referenced coded value in qualifierValueId.
     *
     * Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined
     * in Qualifier/valueType.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Reference to the global unqiue id of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId
     *
     * @return Returns the Reference for the property valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    Reference getValueId();

    /**
     * Reference to the global unqiue id of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId
     *
     * @param valueId desired value for the property valueId.
     */
    void setValueId(Reference valueId);

}
