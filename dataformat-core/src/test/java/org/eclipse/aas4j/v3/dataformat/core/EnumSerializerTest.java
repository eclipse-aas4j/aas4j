package org.eclipse.aas4j.v3.dataformat.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.eclipse.aas4j.v3.dataformat.core.serialization.EnumSerializer;
import org.eclipse.aas4j.v3.model.DataTypeIEC61360;
import org.eclipse.aas4j.v3.model.Direction;
import org.eclipse.aas4j.v3.model.StateOfEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

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
        assertSerialization(DataTypeIEC61360.BOOLEAN, "BOOLEAN");
        assertSerialization(DataTypeIEC61360.DATE, "DATE");
        assertSerialization(DataTypeIEC61360.INTEGER_CURRENCY, "INTEGER_CURRENCY");
        assertSerialization(DataTypeIEC61360.INTEGER_COUNT, "INTEGER_COUNT");
        assertSerialization(DataTypeIEC61360.INTEGER_MEASURE, "INTEGER_MEASURE");
        assertSerialization(DataTypeIEC61360.RATIONAL, "RATIONAL");
        assertSerialization(DataTypeIEC61360.RATIONAL_MEASURE, "RATIONAL_MEASURE");
        assertSerialization(DataTypeIEC61360.REAL_COUNT, "REAL_COUNT");
        assertSerialization(DataTypeIEC61360.REAL_MEASURE, "REAL_MEASURE");
        assertSerialization(DataTypeIEC61360.STRING, "STRING");
        assertSerialization(DataTypeIEC61360.STRING_TRANSLATABLE, "STRING_TRANSLATABLE");
        assertSerialization(DataTypeIEC61360.TIME, "TIME");
        assertSerialization(DataTypeIEC61360.TIMESTAMP, "TIMESTAMP");
        assertSerialization(DataTypeIEC61360.IRI, "IRI");
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

    private void assertSerialization(Enum value, String expected) {
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
