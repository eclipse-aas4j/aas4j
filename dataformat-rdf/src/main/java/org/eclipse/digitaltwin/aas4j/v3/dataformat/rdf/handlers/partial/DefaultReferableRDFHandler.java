package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultAdministrativeInformationRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultConceptDescriptionRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

public class DefaultReferableRDFHandler implements RDFPartialHandler<Referable> {


    @Override
    public void partialToModel(Referable object, Model model, Resource parentNode) {
        if (object.getIdShort() != null) {
            parentNode.addProperty(AASNamespace.Referable.idShort, object.getIdShort());
        }
        if (object.getCategory() != null) {
            parentNode.addProperty(AASNamespace.Referable.category, object.getCategory());
        }
        if (object.getDescription() != null && object.getDescription().isEmpty() == false){

        }
        if (object.getDisplayName() != null && object.getDescription().isEmpty() == false){

        }

    }

    @Override
    public Referable partialFromModel(Referable object, Model model, Resource subjectToParse) {
        if (object.getIdShort() != null) {

        }
        if (object.getCategory() != null) {

        }
        if (object.getDescription() != null && object.getDescription().isEmpty() == false){

        }
        if (object.getDisplayName() != null && object.getDescription().isEmpty() == false){

        }
        return object;
    }
}
