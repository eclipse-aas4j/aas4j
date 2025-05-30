/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class EnumSerializerTest {

    private JsonGenerator jsonGeneratorMock;
    private SerializerProvider serializerProviderMock;
    private EnumSerializer enumSerializer;
    private StringBuffer serializationOutput;

    @Before
    public void setUp() throws Exception {
        this.serializationOutput = new StringBuffer();
        jsonGeneratorMock = Mockito.mock(JsonGenerator.class);
        Mockito.doAnswer(invocationOnMock -> {
            String serializedEnum = invocationOnMock.getArgument(0);
            serializationOutput.append(serializedEnum);
            return null;
        }).when(jsonGeneratorMock).writeString(Mockito.anyString());
        serializerProviderMock = Mockito.mock(SerializerProvider.class);
        this.enumSerializer = new EnumSerializer();
    }

    @Test
    public void whenSerializingEnum_usingDataTypeIec61360_shouldReturnUpperCase() {
        assertSerialization(DataTypeIec61360.BOOLEAN, "BOOLEAN");
        assertSerialization(DataTypeIec61360.DATE, "DATE");
        assertSerialization(DataTypeIec61360.INTEGER_CURRENCY, "INTEGER_CURRENCY");
        assertSerialization(DataTypeIec61360.INTEGER_COUNT, "INTEGER_COUNT");
        assertSerialization(DataTypeIec61360.INTEGER_MEASURE, "INTEGER_MEASURE");
        assertSerialization(DataTypeIec61360.RATIONAL, "RATIONAL");
        assertSerialization(DataTypeIec61360.RATIONAL_MEASURE, "RATIONAL_MEASURE");
        assertSerialization(DataTypeIec61360.REAL_COUNT, "REAL_COUNT");
        assertSerialization(DataTypeIec61360.REAL_MEASURE, "REAL_MEASURE");
        assertSerialization(DataTypeIec61360.STRING, "STRING");
        assertSerialization(DataTypeIec61360.STRING_TRANSLATABLE, "STRING_TRANSLATABLE");
        assertSerialization(DataTypeIec61360.TIME, "TIME");
        assertSerialization(DataTypeIec61360.TIMESTAMP, "TIMESTAMP");
        assertSerialization(DataTypeIec61360.IRI, "IRI");
    }

    @Test
    public void whenSerializingEnum_usingDirection_shouldReturnLowerCase() {
        assertSerialization(Direction.INPUT, "input");
        assertSerialization(Direction.OUTPUT, "output");
    }

    @Test
    public void whenSerializingEnum_usingStateOfEvent_shouldReturnLowerCase() {
        assertSerialization(StateOfEvent.ON, "on");
        assertSerialization(StateOfEvent.OFF, "off");
    }

    @Test
    public void whenSerializingEnum_usingModelingKind_shouldReturnCamelCase() {
        assertSerialization(ModellingKind.INSTANCE, "Instance");
        assertSerialization(ModellingKind.TEMPLATE, "Template");
    }

    @Test
    public void whenSerializingEnum_usingDataTypeDefXsd_shouldReturnCamelCase() {
        assertSerialization(DataTypeDefXsd.BASE64BINARY, "xs:base64Binary");
    }

    private void assertSerialization(Enum value, String expected) {
        this.serializationOutput.setLength(0);
        try {
            this.enumSerializer.serialize(value, jsonGeneratorMock, serializerProviderMock);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        String actual = this.serializationOutput.toString();
        assertEquals(expected, actual);
    }
}
