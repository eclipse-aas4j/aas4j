package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultPropertyRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.junit.Test;

public class SubmodelTest {

    @Test
    public void testMinimalProperty() throws IncompatibleTypeException {
        Property object = SerializerUtil.getMinimalProperty();
        RDFSerializationResult rdfSerializationResult = new DefaultPropertyRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Property);

        Property recreatedObject = new DefaultPropertyRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }


}
