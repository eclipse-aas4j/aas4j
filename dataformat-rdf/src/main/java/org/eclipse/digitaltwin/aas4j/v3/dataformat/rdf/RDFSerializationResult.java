package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;

public interface RDFSerializationResult {
    Model getModel();

    Resource getResource();
}
