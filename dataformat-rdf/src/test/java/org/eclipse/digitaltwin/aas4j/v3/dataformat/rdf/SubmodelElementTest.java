package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultSubmodelElementRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class SubmodelElementTest {
    @Parameter
    public SubmodelElement submodelElement;

    @Parameters(name = "{index}: SME - {0}")
    public static Object[] data() {
        return new Object[]{
                SerializerUtil.getMinimalAnnotatedRelationshipElement(),
                SerializerUtil.getMinimalBasicEventElement(),
                SerializerUtil.getMinimalBlob(),
                SerializerUtil.getMinimalCapability(),
                SerializerUtil.getMinimalEntity(),
                SerializerUtil.getMinimalFile(),
                SerializerUtil.getMinimalMultiLanguageProperty(),
                SerializerUtil.getMinimalOperation(),
                SerializerUtil.getMinimalProperty(),
                SerializerUtil.getMinimalRange(),
                SerializerUtil.getMinimalReferenceElement(),
                SerializerUtil.getMinimalRelationshipElement(),
                SerializerUtil.getMinimalSubmodelElementCollection(),
                SerializerUtil.getMinimalSubmodelElementList(),
                SerializerUtil.getMaximalMultiLanguageProperty()
        };
    }

    @Test
    public void testGeneric() throws IncompatibleTypeException {
        SubmodelElement object = submodelElement;
        RDFSerializationResult rdfSerializationResult = new DefaultSubmodelElementRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Property);

        SubmodelElement submodelElement = new DefaultSubmodelElementRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(submodelElement);

    }


}
