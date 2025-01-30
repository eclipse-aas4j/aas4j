package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;

public interface RDFPartialHandler<T> {

    void partialToModel(T object, Model model, Resource parentNode);

    T partialFromModel(T object, Model model, Resource subjectToParse) throws IncompatibleTypeException;
}
