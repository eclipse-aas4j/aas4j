package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;

/**
 * RDF Serialization result
 */
public interface RDFSerializationResult {
    /**
     * Apache Jena {@link org.apache.jena.rdf.model.Model} that is the RDF graph
     *
     * @return the Graph model
     */
    Model getModel();

    /**
     * corresponding node created in the graph as a starting point
     * note that this is a Apache Jena's {@link org.apache.jena.rdf.model.Resource}
     *
     * @return a Resource in the graph
     */
    Resource getResource();
}
