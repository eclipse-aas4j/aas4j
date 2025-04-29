package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;

/**
 * RDFHandler provides functionality to convert
 * an object to its RDF representation and vice versa
 *
 * @param <T> The type of the object that the RDFHandler should support
 */
public interface RDFHandler<T> {
    /**
     * Convert to RDF model. This method should be side effect free and idempotent.
     *
     * @param object the object that should be converted to an RDF model
     * @return a {@link RDFSerializationResult} which holds the Model and created node that
     * represent the created root node in the model.
     */
    RDFSerializationResult toModel(T object);

    /**
     * Converts an Apache Jena's Resource in an RDF graph to the desired object.
     * This method should be side effect free and idempotent.
     *
     * @param model          The graph model that holds information.
     * @param subjectToParse Root element that correspond to the object.
     * @return instance of the object
     * @throws IncompatibleTypeException the rdf:type should match with the object type.
     */
    T fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException;
}
