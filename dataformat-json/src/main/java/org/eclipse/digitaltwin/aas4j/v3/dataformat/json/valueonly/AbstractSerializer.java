package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import com.fasterxml.jackson.databind.JsonNode;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.JsonSerializer;

/**
 * The abstract base class for all value-only serializers.
 * @param <T> The type of the serialized elements.
 */
public abstract class AbstractSerializer<T> {
    protected T element;
    protected String idShortPath;
    protected static JsonSerializer serializer = new JsonSerializer();

    /**
     *
     * @param element the submodel element that has to be serialized.
     * @param idShortPath the idShort path is a dot separated chain of idShorts, that can be used in case of
     * troubleshooting.
     */
    protected AbstractSerializer(T element, String idShortPath) {
        this.element = element;
        this.idShortPath = idShortPath;
    }

    /**
     * This method serializes the corresponding element.
     * @return the corresponding JSON node.
     * @throws ValueOnlySerializationException with information about the idShort path.
     */
    public abstract JsonNode serialize() throws ValueOnlySerializationException;
}