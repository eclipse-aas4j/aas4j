package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultConceptDescriptionRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ConceptDescriptionTest {


    @Parameterized.Parameter
    public ConceptDescription concept;

    @Parameterized.Parameters(name = "{index}: CD - {0}")
    public static Object[] data() {
        List<ConceptDescription> list = new LinkedList<>();
        list.add(SerializerUtil.getMinimalConceptDescription());
        list.add(SerializerUtil.getMaximalConceptDescription());
        list.add(AASFull.CONCEPT_DESCRIPTION_1);
        list.add(AASFull.CONCEPT_DESCRIPTION_2);
        list.add(AASFull.CONCEPT_DESCRIPTION_3);
        list.add(AASFull.CONCEPT_DESCRIPTION_4);
        list.add(AASSimple.CONCEPT_DESCRIPTION_DIGITALFILE);
        list.add(AASSimple.CONCEPT_DESCRIPTION_TITLE);
        list.add(AASSimple.CONCEPT_DESCRIPTION_DOCUMENT);
        list.add(AASSimple.CONCEPT_DESCRIPTION_ROTATIONSPEED);
        list.add(AASSimple.CONCEPT_DESCRIPTION_MAXROTATIONSPEED);
        return list.toArray();
    }

    @Test
    public void testConceptDescription() throws IncompatibleTypeException {

        ConceptDescription object = concept;
        RDFSerializationResult rdfSerializationResult = new DefaultConceptDescriptionRDFHandler().toModel(object);
        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.ConceptDescription);

        ConceptDescription recreatedObject = new DefaultConceptDescriptionRDFHandler().fromModel(model, createdResource);
        assertEquals(object, recreatedObject);
    }
}
