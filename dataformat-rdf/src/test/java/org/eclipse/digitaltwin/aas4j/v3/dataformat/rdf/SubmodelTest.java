package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultSubmodelRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubmodelTest {
    @Parameterized.Parameter
    public Submodel submodel;

    @Parameterized.Parameters(name = "{index}: Submodel - {0}")
    public static Object[] data() {
        List<Submodel> list = new LinkedList<>();
//        list.add(SerializerUtil.gets());
//        list.add(SerializerUtil.getMaximalConceptDescription());
        list.add(AASFull.createSubmodel1());
        list.add(AASFull.createSubmodel2());
        list.add(AASFull.createSubmodel3());
        list.add(AASFull.createSubmodel4());
        list.add(AASFull.createSubmodel5());
        list.add(AASFull.createSubmodel6());
        list.add(AASFull.createSubmodel7());
        list.add(AASSimple.createSubmodelDocumentation());
        list.add(AASSimple.createSubmodelOperationalData());
        list.add(AASSimple.createSubmodelTechnicalData());
        return list.toArray();
    }

    @Test
    public void testSubmodel() throws IncompatibleTypeException {

        Submodel object = submodel;
        RDFSerializationResult rdfSerializationResult = new DefaultSubmodelRDFHandler().toModel(object);
        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Submodel);

        Submodel recreatedObject = new DefaultSubmodelRDFHandler().fromModel(model, createdResource);
//        assertEquals(object, recreatedObject);
//        List<SubmodelElement> submodelElements1 = object.getSubmodelElements();
//
//        List<SubmodelElement> submodelElements2 = recreatedObject.getSubmodelElements();
//        for(int i=0;i<submodelElements1.size();i++){
//            SubmodelElement original = submodelElements1.get(i);
//            SubmodelElement recreated = submodelElements2.get(i);
//            assertEquals(original,recreated);
//        }
//        assert Objects.equals(submodelElements2,submodelElements1);
        assertEquals(object, recreatedObject);


    }
}
