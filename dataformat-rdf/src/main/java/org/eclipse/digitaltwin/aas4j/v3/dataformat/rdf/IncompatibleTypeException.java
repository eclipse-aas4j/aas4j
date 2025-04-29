package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

public class IncompatibleTypeException extends Exception {
    public IncompatibleTypeException() {
        super("The RDF root node either has no type (rdf:type) or it does not match");
    }

    public IncompatibleTypeException(String message) {
        super("The RDF root node does not match with " + message);
    }
}
