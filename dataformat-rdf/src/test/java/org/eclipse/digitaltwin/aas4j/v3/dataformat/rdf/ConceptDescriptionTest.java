package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultConceptDescriptionRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultConceptDescription;
import org.junit.Test;

import java.io.IOException;

public class ConceptDescriptionTest {

    @Test
    public void simpleConceptDescription() throws IOException, IncompatibleTypeException {
        ConceptDescription object = new DefaultConceptDescription.Builder()
                .id("simple")
                .build();

        RDFSerializationResult rdfSerializationResult = new DefaultConceptDescriptionRDFHandler().toModel(object);
        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        ConceptDescription recreatedObject = new DefaultConceptDescriptionRDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);
    }


    @Test
    public void complexConceptDescription() throws IncompatibleTypeException {
        ConceptDescription object = new DefaultConceptDescription.Builder()
                .id("complex")
                .extensions(SerializerUtil.getExtensionList())
                .category("myCategory")
                .idShort("exampleIdShort")
                .displayName(SerializerUtil.getDisplayNames())
                .description(SerializerUtil.getDescriptions())
                .administration(SerializerUtil.getAdministrativeInformation())
                .isCaseOf(SerializerUtil.getIsCaseOfs())
                .embeddedDataSpecifications(SerializerUtil.getEmbeddedDataSpecifications())
                .build();

        RDFSerializationResult rdfSerializationResult = new DefaultConceptDescriptionRDFHandler().toModel(object);
        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        ConceptDescription recreatedObject = new DefaultConceptDescriptionRDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);
    }
}
