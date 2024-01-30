package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAdministrativeInformation;

public class DefaultAdministrativeInformationRDFHandler implements RDFHandler<AdministrativeInformation> {
    @Override
    public RDFSerializationResult toModel(AdministrativeInformation object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject,RDF.type,AASNamespace.Types.AdministrativeInformation);
        if(object.getVersion()!=null){
            model.addLiteral(subject,AASNamespace.AdministrativeInformation.version,object.getVersion());
        }
        if(object.getRevision()!=null){
            model.addLiteral(subject,AASNamespace.AdministrativeInformation.revision,object.getRevision());
        }
        if(object.getTemplateId()!=null){
            model.addLiteral(subject,AASNamespace.AdministrativeInformation.templateId,object.getTemplateId());
        }
        if(object.getCreator()!=null){
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getCreator());
            model.addLiteral(subject,AASNamespace.AdministrativeInformation.creator,res.getResource());
            model.add(res.getModel());
        }
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialToModel(object,model,subject);
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public AdministrativeInformation fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.AdministrativeInformation) == false){
            throw new IncompatibleTypeException("AdministrativeInformation");
        }
        DefaultAdministrativeInformation.Builder builder = new DefaultAdministrativeInformation.Builder();
        if(model.contains(subjectToParse,AASNamespace.AdministrativeInformation.version)){
            builder.version(model.getProperty(subjectToParse,
                    AASNamespace.AdministrativeInformation.version).getString());
        }
        if(model.contains(subjectToParse,AASNamespace.AdministrativeInformation.revision)){
            builder.revision(model.getProperty(subjectToParse,
                    AASNamespace.AdministrativeInformation.revision).getString());
        }
        if(model.contains(subjectToParse,AASNamespace.AdministrativeInformation.templateId)){
            builder.templateId(model.getProperty(subjectToParse,
                    AASNamespace.AdministrativeInformation.templateId).getString());
        }
        if(model.contains(subjectToParse,AASNamespace.AdministrativeInformation.creator)){
            Resource resource = model.getProperty(subjectToParse,
                    AASNamespace.AdministrativeInformation.creator).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.creator(reference);
        }
        DefaultAdministrativeInformation object = builder.build();
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialFromModel(object,model,subjectToParse);
        return object;
    }
}
