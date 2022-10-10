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
 * A 'Blob' is a data element that represents a file that is contained with its source code in the
 * value attribute.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBlob.class)
})
public interface Blob extends DataElement {

    /**
     * Content type of the content of the 'Blob'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Blob/contentType
     *
     * @return Returns the String for the property contentType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Blob/contentType")
    String getContentType();

    /**
     * Content type of the content of the 'Blob'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Blob/contentType
     *
     * @param contentType desired value for the property contentType.
     */
    void setContentType(String contentType);

    /**
     * The value of the 'Blob' instance of a blob data element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Blob/value
     *
     * @return Returns the byte[] for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Blob/value")
    byte[] getValue();

    /**
     * The value of the 'Blob' instance of a blob data element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Blob/value
     *
     * @param value desired value for the property value.
     */
    void setValue(byte[] value);

}
