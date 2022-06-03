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
import io.adminshell.aas.v3.rc02.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.rc02.model.impl.DefaultFile;

/**
 * A File is a data element that represents an address to a file (a locator).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultFile.class)
})
public interface File extends DataElement {

    /**
     * Path and name of the referenced file (with file extension).
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/File/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/File/value")
    String getValue();

    /**
     * Path and name of the referenced file (with file extension).
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/File/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Content type of the content of the file.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/File/contentType
     *
     * @return Returns the String for the property contentType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/File/contentType")
    String getContentType();

    /**
     * Content type of the content of the file.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/File/contentType
     *
     * @param contentType desired value for the property contentType.
     */
    void setContentType(String contentType);

}
