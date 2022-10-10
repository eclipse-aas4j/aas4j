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
 * Resource represents an address to a file (a locator). The value is an URI that can represent an
 * absolute or relative path
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultResource.class)
})
public interface Resource {

    /**
     * Content type of the content of the file.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Resource/contentType
     *
     * @return Returns the String for the property contentType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Resource/contentType")
    String getContentType();

    /**
     * Content type of the content of the file.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Resource/contentType
     *
     * @param contentType desired value for the property contentType.
     */
    void setContentType(String contentType);

    /**
     * Path and name of the resource (with file extension).
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Resource/path
     *
     * @return Returns the String for the property path.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Resource/path")
    String getPath();

    /**
     * Path and name of the resource (with file extension).
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Resource/path
     *
     * @param path desired value for the property path.
     */
    void setPath(String path);

}
