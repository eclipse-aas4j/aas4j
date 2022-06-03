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
 * A File is a data element that represents a file via its path description.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultFile.class)
})
public interface File extends DataElement, SubmodelElement {

    /**
     * Mime type of the content of the File.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/mimeType
     *
     * @return Returns the String for the property mimeType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/mimeType")
    String getMimeType();

    /**
     * Mime type of the content of the File.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/mimeType
     *
     * @param mimeType desired value for the property mimeType.
     */
    void setMimeType(String mimeType);

    /**
     * Path and name of the referenced file (with file extension). The path can be absolute or relative.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/File/value")
    String getValue();

    /**
     * Path and name of the referenced file (with file extension). The path can be absolute or relative.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/File/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

}
