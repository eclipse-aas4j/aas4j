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
 * An IdentifierKeyValuePair describes a generic identifier as key-value pair.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifierKeyValuePair.class)
})
public interface IdentifierKeyValuePair extends HasSemantics {

    /**
     * Key of the identifier.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
     *
     * @return Returns the String for the property key.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    String getKey();

    /**
     * Key of the identifier.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key
     *
     * @param key desired value for the property key.
     */
    void setKey(String key);

    /**
     * The value of the identifier with the corresponding key.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    String getValue();

    /**
     * The value of the identifier with the corresponding key.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * The (external) subject the key belongs to or has meaning to.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
     *
     * @return Returns the Reference for the property externalSubjectId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
    Reference getExternalSubjectId();

    /**
     * The (external) subject the key belongs to or has meaning to.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId
     *
     * @param externalSubjectId desired value for the property externalSubjectId.
     */
    void setExternalSubjectId(Reference externalSubjectId);

}
