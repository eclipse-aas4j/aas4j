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

import java.util.List;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;


/**
 * Single extension of an element.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultExtension.class)
})
public interface Extension extends HasSemantics {

    /**
     * Name of the extension.
     *
     * More information under https://admin-shell.io/aas/3/1/Extension/name
     *
     * @return Returns the String for the property name.
     */
    @IRI("https://admin-shell.io/aas/3/1/Extension/name")
    String getName();

    /**
     * Name of the extension.
     *
     * More information under https://admin-shell.io/aas/3/1/Extension/name
     *
     * @param name desired value for the property name.
     */
    void setName(String name);

    /**
     * Type of the value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/1/Extension/valueType
     *
     * @return Returns the DataTypeDefXsd for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/1/Extension/valueType")
    DataTypeDefXsd getValueType();

    /**
     * Type of the value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/1/Extension/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(DataTypeDefXsd valueType);

    /**
     * Value of the extension
     *
     * More information under https://admin-shell.io/aas/3/1/Extension/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/1/Extension/value")
    String getValue();

    /**
     * Value of the extension
     *
     * More information under https://admin-shell.io/aas/3/1/Extension/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Reference to an element the extension refers to.
     *
     * More information under https://admin-shell.io/aas/3/1/Extension/refersTo
     *
     * @return Returns the List of References for the property refersTos.
     */
    @IRI("https://admin-shell.io/aas/3/1/Extension/refersTo")
    List<Reference> getRefersTo();

    /**
     * Reference to an element the extension refers to.
     *
     * More information under https://admin-shell.io/aas/3/1/Extension/refersTo
     *
     * @param refersTo desired value for the property refersTos.
     */
    void setRefersTo(List<Reference> refersTo);

}
