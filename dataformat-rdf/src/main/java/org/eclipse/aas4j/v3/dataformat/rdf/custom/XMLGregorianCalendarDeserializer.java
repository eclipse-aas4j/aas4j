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
package org.eclipse.aas4j.v3.dataformat.rdf.custom;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class XMLGregorianCalendarDeserializer extends StdDeserializer<XMLGregorianCalendar> {

    public XMLGregorianCalendarDeserializer() {
        this(XMLGregorianCalendar.class);
    }

    public XMLGregorianCalendarDeserializer(Class clazz) {
        super(clazz);
    }

    @Override
    public XMLGregorianCalendar deserialize(JsonParser p, DeserializationContext context) throws IOException {
        XMLGregorianCalendar xgc = null;
        try {
            xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(GregorianCalendar.from(ZonedDateTime.parse(p.getValueAsString())));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return xgc;
    }
}
