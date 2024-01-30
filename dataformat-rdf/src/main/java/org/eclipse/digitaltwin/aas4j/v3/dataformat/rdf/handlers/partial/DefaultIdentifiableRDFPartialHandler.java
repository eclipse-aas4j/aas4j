package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial;

import org.apache.jena.rdf.model.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultAdministrativeInformationRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.Identifiable;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

public class DefaultIdentifiableRDFPartialHandler implements RDFPartialHandler<Identifiable> {

    @Override
    public void partialToModel(Identifiable object, Model model, Resource parentNode) {
        //TODO: Side effect
        if (object.getId() != null) {
            parentNode.addProperty(AASNamespace.Identifiable.id, object.getId());
        }
        if (object.getAdministration() != null) {
            RDFSerializationResult administrativeResult = new DefaultAdministrativeInformationRDFHandler()
                    .toModel(object.getAdministration());
            parentNode.addProperty(AASNamespace.Identifiable.administration,
                    administrativeResult.getResource());
            model.add(administrativeResult.getModel());
        }

        //Referable
        new DefaultReferableRDFPartialHandler().partialToModel(object, model, parentNode);
    }

    @Override
    public Identifiable partialFromModel(Identifiable object, Model model, Resource subjectToParse) throws IncompatibleTypeException {
        //TODO: Side effect
        if (model.contains(subjectToParse, AASNamespace.Identifiable.id)) {
            String id = model.getProperty(subjectToParse, AASNamespace.Identifiable.id).getString();
            object.setId(id);
        }

        if (model.contains(subjectToParse, AASNamespace.Identifiable.administration)) {
            Resource administrationToParse = model.getProperty(
                    subjectToParse,
                    AASNamespace.Identifiable.administration).getResource();
            AdministrativeInformation administrativeInformation = new DefaultAdministrativeInformationRDFHandler()
                    .fromModel(model, administrationToParse);
            object.setAdministration(administrativeInformation);
        }

        //Referable
        new DefaultReferableRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        return object;
    }
}
