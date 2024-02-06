package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultResource;

public class DefaultResourceRDFHandler implements RDFHandler<Resource> {
    @Override
    public RDFSerializationResult toModel(Resource object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        org.apache.jena.rdf.model.Resource subject = model.createResource();
        model.add(subject,RDF.type,AASNamespace.Types.Resource);
        if(object.getPath()!=null){
            model.add(subject,AASNamespace.Resource.path,object.getPath());
        }
        if(object.getContentType()!=null){
            model.add(subject,AASNamespace.Resource.contentType,object.getContentType());
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public Resource fromModel(Model model, org.apache.jena.rdf.model.Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.Resource) == false){
            throw new IncompatibleTypeException("Resource");
        }
        DefaultResource.Builder builder = new DefaultResource.Builder();
        if (model.contains(subjectToParse, AASNamespace.Resource.path)){
            builder.path(model.getProperty(subjectToParse,AASNamespace.Resource.path).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.Resource.contentType)){
            builder.contentType(model.getProperty(subjectToParse,AASNamespace.Resource.contentType).getString());
        }
        return builder.build();
    }
}
