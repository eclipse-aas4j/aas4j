/*******************************************************************************
 * Copyright (C) 2023 the Eclipse BaSyx Authors
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * SPDX-License-Identifier: MIT
 ******************************************************************************/

package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.mixins.HasSemanticsMixin;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

import java.io.IOException;
import java.util.List;

/**
 * Serializes the RefersTo value of {@link Extension}. <br>
 * This class is needed since using the same approach as used in
 * {@link HasSemanticsMixin} leads to a conflict for XMLPropertyName "reference"
 * 
 * @author schnicke
 *
 */
public class RefersToSerializer extends JsonSerializer<List<Reference>> {

    @Override
    public void serialize(List<Reference> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value.isEmpty())
            return;

        ToXmlGenerator xgen = (ToXmlGenerator) gen;

        xgen.writeStartObject();

        for (Reference ref : value) {
            writeReference(xgen, ref);
        }

        xgen.writeEndObject();
    }

    private void writeReference(ToXmlGenerator xgen, Reference ref) throws IOException {
        xgen.writeFieldName("reference");
        xgen.writeObject(ref);
    }

}
