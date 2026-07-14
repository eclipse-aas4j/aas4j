/*
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import java.util.Iterator;

import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

/**
 * The abstract base class for all value-only mappers.
 * @param <T> The type of the mapped elements.
 */
abstract class AbstractMapper<T extends Referable> implements ValueOnlyMapper {
    protected final T element;
    protected final String idShortPath;

    /**
     *
     * @param element the submodel element that has to be mapped.
     * @param idShortPath the idShort path is a dot separated chain of idShorts, that can be used in case of
     * troubleshooting.
     */
    protected AbstractMapper(T element, String idShortPath) {
        this.element = element;
        this.idShortPath = idShortPath;
    }

    JsonNode asValueNode(JsonNode value) {
        return JsonNodeFactory.instance.objectNode().set(element.getIdShort(), value);
    }

    static JsonNode valueFromNode(String msg, String idShortPath, JsonNode valueOnly) {
        Iterator<String> fieldNames = valueOnly.fieldNames();
        if (!fieldNames.hasNext()) {
            // throw exception as value-only nodes must have exactly one field!
            throw new ValueOnlySerializationException(
                    msg + " at idShort path '" + idShortPath +
                            "', as the passed value does have no fields!", idShortPath);
        }
        String fieldName = fieldNames.next();
        if (fieldNames.hasNext()) {
            // throw exception as value-only nodes must have exactly one field!
            throw new ValueOnlySerializationException(
                    msg + " at idShort path '" + idShortPath +
                            "', as the passed value has more than one field!", idShortPath);
        }
        return valueOnly.get(fieldName);
    }

    /**
     * Verifies the given object is neither an object nor an array
     * @param msg Prefix for exception messages.
     * @param idShortPath short path of ID being included to exception messages.
     * @param value the node to return as text
     * @return given {@code value} as text if it's neither an object nor an array, otherwise throws exception.
     * @throws ValueOnlySerializationException throw if node is object or array.
     */
    String readValueAsString(String msg, String idShortPath, JsonNode value)
            throws ValueOnlySerializationException {
        if (value == null || value.isNull()) {
            return null;
        }
        if (value.isObject()) {
            throw new ValueOnlySerializationException(
                    msg + " at idShort path '" + idShortPath +
                            "', as the passed value is a JSON object.", idShortPath);
        }
        if (value.isArray()) {
            throw new ValueOnlySerializationException(
                    msg + " at idShort path '" + idShortPath +
                            "', as the passed value is a JSON array.", idShortPath);
        }
        return value.asText();
    }
}