package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.TextNode;

import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;

import java.math.BigDecimal;

/**
 * This is a helper class for the serialization of string values depending of their data type. The data types are
 * defined according to the W3C XML Schema (https://www.w3.org/TR/xmlschema-2/#built-in-datatypes and
 * https://www.w3.org/TR/xmlschema-2/#built-in-derived).
 * Note that for xs:decimal, xs:unsignedLong, xs:positiveInteger, xs:nonNegativeInteger, xs:negativeInteger and
 * xs:nonPositiveInteger exists the possibility for lost of precision during the conversion.
 */
class ValueConverter {
    private ValueConverter() {}

    /**
     *
     * @param dataType The data type.
     * @param value
     * @return
     * @throws NumberFormatException
     */
    static JsonNode convert(DataTypeDefXsd dataType, String value) throws NumberFormatException {
        if(dataType == null) {
            return new TextNode(value);
        }

        switch (dataType) {
            case BOOLEAN:
                return Boolean.parseBoolean(value) ? BooleanNode.TRUE : BooleanNode.FALSE;
            case DECIMAL:
                // According to the AAS spec, this type is serialized as a number.
                // There is a possibility for lost of precision.
                return new DoubleNode(new BigDecimal(value).doubleValue());
            case BYTE:
            case UNSIGNED_BYTE:
            case SHORT:
            case UNSIGNED_SHORT:
            case INT:
                return new IntNode(Integer.parseInt(value));
            case UNSIGNED_INT:
            case POSITIVE_INTEGER:
            case NEGATIVE_INTEGER:
            case NON_NEGATIVE_INTEGER:
            case NON_POSITIVE_INTEGER:
            case LONG:
                return new LongNode(Long.parseLong(value));
            case UNSIGNED_LONG:
                // According to the spec, it should be serialized as number. There is a possibility for precision lost.
            case DOUBLE:
                return new DoubleNode(Double.parseDouble(value));
            case FLOAT:
                return new FloatNode(Float.parseFloat(value));
            default:
                // All other types have no need to be converted from string.
                return new TextNode(value);
        }
    }
}
