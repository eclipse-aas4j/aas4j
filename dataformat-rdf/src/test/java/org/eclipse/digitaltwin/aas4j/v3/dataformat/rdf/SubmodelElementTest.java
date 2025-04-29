package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultSubmodelElementRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubmodelElementTest {
    @Parameter
    public SubmodelElement submodelElement;

    @Parameters(name = "{index}: SME - {0}")
    public static Object[] data() {
        List<SubmodelElement> list = new LinkedList<>();
        list.addAll(SerializerUtil.getMaximalSubmodelElementsList());
        list.addAll(SerializerUtil.getMinimalSubmodelElementsList());
        return list.toArray();
    }

    @Test
    public void testGenericSubmodelElement() throws IncompatibleTypeException {
        SubmodelElement object = submodelElement;
        RDFSerializationResult rdfSerializationResult = new DefaultSubmodelElementRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        SubmodelElement recreatedObject = new DefaultSubmodelElementRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assertEquals(object, recreatedObject);
    }


}
