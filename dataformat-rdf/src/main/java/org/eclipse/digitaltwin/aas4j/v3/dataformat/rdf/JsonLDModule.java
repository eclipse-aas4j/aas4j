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

import com.fasterxml.jackson.databind.module.SimpleModule;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.custom.BigDecimalSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.custom.XMLGregorianCalendarDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.custom.XMLGregorianCalendarSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.LangString;

import java.math.BigDecimal;
import java.net.URI;
import java.util.Map;


import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Jackson module which provides support for JSON-LD serialization
 */
public class JsonLDModule extends SimpleModule {


    public JsonLDModule(Map<Object, String> idMap) {
        super();

        setSerializerModifier(new JsonLDSerializerModifier(idMap));
        
        addSerializer(XMLGregorianCalendar.class, new XMLGregorianCalendarSerializer());
        addDeserializer(XMLGregorianCalendar.class, new XMLGregorianCalendarDeserializer());
        addSerializer(BigDecimal.class, new BigDecimalSerializer());
        
        addSerializer(URI.class, new UriSerializer());
        addSerializer(LangString.class, new LangStringSerializer());
    }

}
