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

package org.eclipse.digitaltwin.aas4j.v3.model;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;


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
     * More information under https://admin-shell.io/aas/3/0/Property/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/Property/value")
    String getValue();

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/Property/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/Property/valueID
     *
     * @return Returns the Reference for the property valueID.
     */
    @IRI("https://admin-shell.io/aas/3/0/Property/valueID")
    Reference getValueID();

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/Property/valueID
     *
     * @param valueID desired value for the property valueID.
     */
    void setValueID(Reference valueID);

    /**
     * Data type of the value
     *
     * More information under https://admin-shell.io/aas/3/0/Property/valueType
     *
     * @return Returns the DataTypeDefXSD for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/Property/valueType")
    DataTypeDefXSD getValueType();

    /**
     * Data type of the value
     *
     * More information under https://admin-shell.io/aas/3/0/Property/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(DataTypeDefXSD valueType);

}
