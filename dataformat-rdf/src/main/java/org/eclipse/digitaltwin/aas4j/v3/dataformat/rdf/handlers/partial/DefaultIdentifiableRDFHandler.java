package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial;

import org.apache.jena.rdf.model.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultAdministrativeInformationRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.DefaultRDFHandlerResult;
import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.Identifiable;

import java.util.HashMap;
import java.util.Map;

public class DefaultIdentifiableRDFHandler implements RDFPartialHandler<Identifiable> {

    @Override
    public void partialToModel(Identifiable object, Model model, Resource parentNode) {
        //TODO: Side effect
        parentNode.addProperty(AASNamespace.Identifiable.id, object.getId());

        RDFSerializationResult administrativeResult = new DefaultAdministrativeInformationRDFHandler()
                .toModel(object.getAdministration());
        if(object.getAdministration()!=null){
            parentNode.addProperty(AASNamespace.Identifiable.administration, administrativeResult.getResource());
            model.add(administrativeResult.getModel());
        }

        new DefaultReferableRDFHandler().partialToModel(object,model,parentNode);
    }

    @Override
    public Identifiable partialFromModel(Identifiable object, Model model, Resource subjectToParse) {
        //TODO: Side effect
        String id = model.getProperty(subjectToParse, AASNamespace.Identifiable.id).getString();
        object.setId(id);

        Statement administrationStatement = model.getProperty(subjectToParse, AASNamespace.Identifiable.administration);
        if(administrationStatement!=null) {
            Resource administrationToParse = administrationStatement.getResource();
            AdministrativeInformation administrativeInformation = new DefaultAdministrativeInformationRDFHandler().fromModel(model, administrationToParse);
            object.setAdministration(administrativeInformation);
        }

        //Referable
        new DefaultReferableRDFHandler().partialFromModel(object,model,subjectToParse);
        return object;
    }
}
