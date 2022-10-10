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
 * A property is a data element that has a single value.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultProperty.class)
})
public interface Property extends DataElement {

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Property/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Property/value")
    String getValue();

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Property/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Property/valueId
     *
     * @return Returns the Reference for the property valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Property/valueId")
    Reference getValueId();

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Property/valueId
     *
     * @param valueId desired value for the property valueId.
     */
    void setValueId(Reference valueId);

    /**
     * Data type of the value
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Property/valueType
     *
     * @return Returns the DataTypeDefXsd for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Property/valueType")
    DataTypeDefXsd getValueType();

    /**
     * Data type of the value
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Property/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(DataTypeDefXsd valueType);

}
