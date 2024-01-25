package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.HasSemantics;

public class DefaultHasSemanticsRDFHandler implements RDFPartialHandler<HasSemantics> {

    @Override
    public void partialToModel(HasSemantics object, Model model, Resource parentNode) {

    }

    @Override
    public HasSemantics partialFromModel(HasSemantics object, Model model, Resource subjectToParse) {
        return null;
    }
}
