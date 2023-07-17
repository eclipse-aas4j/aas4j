package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

/**
 * This exception is thrown during the value-only serialization.
 */
public class ValueOnlySerializationException extends Exception {
    public ValueOnlySerializationException(String msg) {
        super(msg);
    }
}
