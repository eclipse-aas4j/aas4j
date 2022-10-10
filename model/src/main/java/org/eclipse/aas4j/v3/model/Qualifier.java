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

package org.eclipse.aas4j.v3.model;



import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;


/**
 * A qualifier is a type-value-pair that makes additional statements w.r.t. the value of the
 * element.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultQualifier.class)
})
public interface Qualifier extends HasSemantics {

    /**
     * The qualifier kind describes the kind of the qualifier that is applied to the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/kind
     *
     * @return Returns the QualifierKind for the property kind.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Qualifier/kind")
    QualifierKind getKind();

    /**
     * The qualifier kind describes the kind of the qualifier that is applied to the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/kind
     *
     * @param kind desired value for the property kind.
     */
    void setKind(QualifierKind kind);

    /**
     * The qualifier type describes the type of the qualifier that is applied to the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/type
     *
     * @return Returns the String for the property type.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Qualifier/type")
    String getType();

    /**
     * The qualifier type describes the type of the qualifier that is applied to the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/type
     *
     * @param type desired value for the property type.
     */
    void setType(String type);

    /**
     * The qualifier value is the value of the qualifier.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Qualifier/value")
    String getValue();

    /**
     * The qualifier value is the value of the qualifier.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/valueId
     *
     * @return Returns the Reference for the property valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Qualifier/valueId")
    Reference getValueId();

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/valueId
     *
     * @param valueId desired value for the property valueId.
     */
    void setValueId(Reference valueId);

    /**
     * Data type of the qualifier value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/valueType
     *
     * @return Returns the DataTypeDefXsd for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Qualifier/valueType")
    DataTypeDefXsd getValueType();

    /**
     * Data type of the qualifier value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Qualifier/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(DataTypeDefXsd valueType);

}
