package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.deserialization.EnumDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIEC61360;
import org.eclipse.digitaltwin.aas4j.v3.model.Direction;
import org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class EnumDeserializerTest {

    private JsonParser jsonParserMock;
    private DeserializationContext deserializationContextMock;

    @Before
    public void setUp() {
        jsonParserMock = Mockito.mock(JsonParser.class);
        deserializationContextMock = Mockito.mock(DeserializationContext.class);
    }

    @Test
    public void whenSerializingEnum_usingDataTypeIEC61360_shouldReturnUpperCase() {
        assertDeserialization("BOOLEAN", DataTypeIEC61360.BOOLEAN);
        assertDeserialization("DATE", DataTypeIEC61360.DATE);
        assertDeserialization("INTEGER_CURRENCY", DataTypeIEC61360.INTEGER_CURRENCY);
        assertDeserialization("INTEGER_COUNT", DataTypeIEC61360.INTEGER_COUNT);
        assertDeserialization("INTEGER_MEASURE", DataTypeIEC61360.INTEGER_MEASURE);
        assertDeserialization("RATIONAL", DataTypeIEC61360.RATIONAL);
        assertDeserialization("RATIONAL_MEASURE", DataTypeIEC61360.RATIONAL_MEASURE);
        assertDeserialization("REAL_COUNT", DataTypeIEC61360.REAL_COUNT);
        assertDeserialization("REAL_MEASURE", DataTypeIEC61360.REAL_MEASURE);
        assertDeserialization("STRING", DataTypeIEC61360.STRING);
        assertDeserialization("STRING_TRANSLATABLE", DataTypeIEC61360.STRING_TRANSLATABLE);
        assertDeserialization("TIME", DataTypeIEC61360.TIME);
        assertDeserialization("TIMESTAMP", DataTypeIEC61360.TIMESTAMP);
        assertDeserialization("IRI", DataTypeIEC61360.IRI);
    }

    @Test
    public void whenSerializingEnum_usingDirection_shouldReturnLowerCase() {
        assertDeserialization("input", Direction.INPUT);
        assertDeserialization("output", Direction.OUTPUT);
    }

    @Test
    public void whenSerializingEnum_usingStateOfEvent_shouldReturnLowerCase() {
        assertDeserialization("on", StateOfEvent.ON);
        assertDeserialization("off", StateOfEvent.OFF);
    }

    private void assertDeserialization(String value, Enum expected) {
        try {
            Mockito.doReturn(value).when(jsonParserMock).getText();
            Class<? extends Enum> type = expected.getClass();
            EnumDeserializer<? extends Enum> enumDeserializer = new EnumDeserializer<>(type);
            Enum actual = enumDeserializer.deserialize(jsonParserMock, deserializationContextMock);
            Assert.assertEquals(expected, actual);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
