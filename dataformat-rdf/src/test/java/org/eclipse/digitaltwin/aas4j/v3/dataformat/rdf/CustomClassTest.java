package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubProperty;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultReferableRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomClassTest {

    @Test
    public void testCustomProperty() throws IncompatibleTypeException {
        List<String> one = new ArrayList<>();
        one.add("test");
        List<String> two = new LinkedList<>();
        two.add("test");
        assert one.equals(two);


        CustomSubProperty object = new CustomSubProperty();
        object.setIdShort("test");
        RDFSerializationResult rdfSerializationResult = new DefaultReferableRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Property);


        Referable recreatedObject = new DefaultReferableRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assertEquals(object, recreatedObject);
    }
}
