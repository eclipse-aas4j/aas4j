package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Range;

/**
 * Range is serialized as named JSON object with ${Range/idShort} as the name of the containing JSON property. The JSON
 * object contains two JSON properties. The first is named "min". The second is named "max". Their corresponding values
 * are ${Range/min} and ${Range/max}.
 */
public class RangeSerializer extends AbstractSerializer<Range> {
    RangeSerializer(Range range, String idShortPath) {
        super(range, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        try {
            ObjectNode node = JsonNodeFactory.instance.objectNode();
            DataTypeDefXsd valueType = element.getValueType();
            node.set("min", ValueConverter.convert(valueType, element.getMin()));
            node.set("max", ValueConverter.convert(valueType, element.getMax()));
            return node;
        } catch (NumberFormatException ex) {
            throw new ValueOnlySerializationException("Cannot serialize the range with idShort path '" +
                idShortPath + "': " + ex.getMessage());
        }
    }
}
