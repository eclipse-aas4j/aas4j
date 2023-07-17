package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;

/**
 * Property is serialized as ${Property/idShort}: ${Property/value} where ${Property/value} is the JSON serialization
 * of the respective property’s value in accordance with the data type to value mapping.
 * @see ValueConverter
 */
public class PropertySerializer extends AbstractSerializer<Property> {
    PropertySerializer(Property property, String idShortPath) {
        super(property, idShortPath);
    }

    @Override
    public JsonNode serialize() throws ValueOnlySerializationException {
        try {
            return ValueConverter.convert(element.getValueType(), element.getValue());
        } catch (NumberFormatException ex) {
            throw new ValueOnlySerializationException("Cannot serialize the property with idShort path '" +
                idShortPath + "': " + ex.getMessage());
        }
    }
}