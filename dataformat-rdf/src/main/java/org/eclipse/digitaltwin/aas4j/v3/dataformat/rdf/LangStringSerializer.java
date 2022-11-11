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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import java.io.IOException;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.LangString;

public class LangStringSerializer extends StdSerializer<LangString> {


    public LangStringSerializer() {
        this(null);
    }

    public LangStringSerializer(Class clazz) {
        super(clazz);
    }


    @Override
    public void serialize(LangString value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        if(value.getLanguage() != null && !value.getLanguage().isEmpty())
        {
            gen.writeStringField("@language", value.getLanguage());
        }
        else
        {
            gen.writeStringField("@type", "rdf:langString");
        }
        gen.writeStringField("@value", value.getText());
        gen.writeEndObject();
    }

}
