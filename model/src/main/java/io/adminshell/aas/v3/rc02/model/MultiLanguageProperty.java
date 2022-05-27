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

package io.adminshell.aas.v3.rc02.model;


import io.adminshell.aas.v3.rc02.model.annotations.IRI;
import io.adminshell.aas.v3.rc02.model.impl.DefaultMultiLanguageProperty;
import io.adminshell.aas.v3.rc02.model.annotations.KnownSubtypes;

/**
 * A property is a data element that has a multi-language value.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultMultiLanguageProperty.class)
})
public interface MultiLanguageProperty extends DataElement {

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/MultiLanguageProperty/value
     *
     * @return Returns the LangStringSet for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/MultiLanguageProperty/value")
    LangStringSet getValue();

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/MultiLanguageProperty/value
     *
     * @param value desired value for the property value.
     */
    void setValue(LangStringSet value);

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/MultiLanguageProperty/valueId
     *
     * @return Returns the Reference for the property valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/MultiLanguageProperty/valueId")
    Reference getValueId();

    /**
     * Reference to the global unique ID of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/MultiLanguageProperty/valueId
     *
     * @param valueId desired value for the property valueId.
     */
    void setValueId(Reference valueId);

}
