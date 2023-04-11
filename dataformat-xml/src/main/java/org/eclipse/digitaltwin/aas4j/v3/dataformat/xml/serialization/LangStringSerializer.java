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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.AasXmlNamespaceContext;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.lang.reflect.Field;

public class LangStringSerializer extends JsonSerializer<LangString> {


    @Override
    public void serialize(LangString langString, JsonGenerator gen, SerializerProvider serializers) throws IOException {

        ToXmlGenerator xgen = (ToXmlGenerator) gen;
        try {
            Field nextName = xgen.getClass().getDeclaredField("_nextName");
            nextName.setAccessible(true);
            xgen.setNextName(new QName(AasXmlNamespaceContext.AAS_URI, "langString"));

            serializeLangString(xgen, langString);

		} catch (NoSuchFieldException e) {
            // serialize it without changing the namespaces
            serializeLangString(xgen, langString);
        }

    }

    private void serializeLangString(ToXmlGenerator xgen, LangString langString) throws IOException {


        xgen.writeStartObject();
        xgen.writeFieldName("language");
        xgen.writeString(langString.getLanguage());

        xgen.writeFieldName("text");
        xgen.writeString(langString.getText());

        xgen.writeEndObject();
    }
}
