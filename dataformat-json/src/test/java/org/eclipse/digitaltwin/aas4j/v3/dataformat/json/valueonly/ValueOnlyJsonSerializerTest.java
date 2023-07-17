package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ValueOnlyJsonSerializerTest {
    private static ObjectMapper objectMapper = new ObjectMapper();
    private static ValueOnlyJsonSerializer serializer = new ValueOnlyJsonSerializer(true);

    @Test
    public void testCreateSerializer() throws IOException {
        assertNotNull(serializer);
        String valueOnlySubmodel = readValueOnlyFile("submodel.json");
        assertNotNull(valueOnlySubmodel);
        JsonNode node = readValueOnlyJson("submodel.json");
        assertNotNull(node);
    }

    @Test
    public void testSerializeSubmodel() throws IOException, ValueOnlySerializationException, JSONException {
        String valueOnlySubmodelString = serializer.write(TestData.SUBMODEL);
        assertNotNull(valueOnlySubmodelString);
        String expected = readValueOnlyFile("submodel.json");
        JSONAssert.assertEquals(expected, valueOnlySubmodelString, JSONCompareMode.NON_EXTENSIBLE);
    }

    private String readValueOnlyFile(String valueOnlyFile) throws IOException {
        return new String(getClass().getClassLoader().getResourceAsStream(
            "valueonly/" + valueOnlyFile).readAllBytes(), StandardCharsets.UTF_8);
    }

    private JsonNode readValueOnlyJson(String valueOnlyFile) throws IOException {
        return objectMapper.readTree(getClass().getClassLoader().getResourceAsStream(
                "valueonly/" + valueOnlyFile));
    }
}
