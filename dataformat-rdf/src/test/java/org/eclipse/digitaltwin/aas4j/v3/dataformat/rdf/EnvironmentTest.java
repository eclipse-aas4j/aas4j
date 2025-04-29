package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultEnvironmentRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EnvironmentTest {
    @Parameterized.Parameter
    public Environment environment;

    @Parameterized.Parameters(name = "{index}: Shell - {0}")
    public static Object[] data() {
        List<Environment> list = new LinkedList<>();
//        list.add(SerializerUtil.getMaximalAssetAdministrationShell());
//        list.add(SerializerUtil.getMinimalAssetAdministrationShell());
        list.add(AASFull.createEnvironment());
        list.add(AASSimple.createEnvironment());
        return list.toArray();
    }

    @Test
    public void testEnvironment() throws IncompatibleTypeException {
        Environment object = environment;
        RDFSerializationResult rdfSerializationResult = new DefaultEnvironmentRDFHandler().toModel(object);
        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Environment);

        Environment recreatedObject = new DefaultEnvironmentRDFHandler().fromModel(model, createdResource);
        assertEquals(object.getConceptDescriptions().size(),
                recreatedObject.getConceptDescriptions().size());
        assertEquals(object.getSubmodels().size(),
                recreatedObject.getSubmodels().size());
        assertEquals(object.getAssetAdministrationShells().size(),
                recreatedObject.getAssetAdministrationShells().size());
    }
}
