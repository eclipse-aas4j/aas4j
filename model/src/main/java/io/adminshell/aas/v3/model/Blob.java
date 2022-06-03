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
 * A BLOB is a data element that represents a file that is contained with its source code in the
 * value attribute. Constraint AASd-057: The semanticId of a File or Blob submodel element shall
 * only reference a ConceptDescription with the category DOCUMENT.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBlob.class)
})
public interface Blob extends DataElement {

    /**
     * Mime type of the content of the BLOB. The mime type states which file extension the file has.
     * Valid values are e.g. 'application/json', 'application/xls', 'image/jpg' The allowed values are
     * defined as in RFC2046.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Blob/mimeType
     *
     * @return Returns the String for the property mimeType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Blob/mimeType")
    String getMimeType();

    /**
     * Mime type of the content of the BLOB. The mime type states which file extension the file has.
     * Valid values are e.g. 'application/json', 'application/xls', 'image/jpg' The allowed values are
     * defined as in RFC2046.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Blob/mimeType
     *
     * @param mimeType desired value for the property mimeType.
     */
    void setMimeType(String mimeType);

    /**
     * The value of the BLOB instance of a blob data element.
     *
     * In contrast to the file property the file content is stored directly as value in the Blob data
     * element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Blob/value
     *
     * @return Returns the byte[] for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Blob/value")
    byte[] getValue();

    /**
     * The value of the BLOB instance of a blob data element.
     *
     * In contrast to the file property the file content is stored directly as value in the Blob data
     * element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Blob/value
     *
     * @param value desired value for the property value.
     */
    void setValue(byte[] value);

}
