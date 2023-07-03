package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import java.io.IOException;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.serialization.EnumSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.Direction;
import org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;

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
    public void whenSerializingEnum_usingDataTypeIEC61360_shouldReturnUpperCase() {
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

	private void assertSerialization(Enum<?> value, String expected) {
        this.serializationOutput.setLength(0);
        try {
            this.enumSerializer.serialize(value, jsonGeneratorMock, serializerProviderMock);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        String actual = this.serializationOutput.toString();
        Assert.assertEquals(expected, actual);
    }
}
