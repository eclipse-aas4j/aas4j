package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultDataSpecificationIEC61360RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultEmbeddedDataSpecificationRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360.DefaultLangStringShortNameTypeIec61360RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360.DefaultLevelTypeRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360.DefaultValueListRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;
import org.junit.Test;

import java.util.List;

import static org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.SerializerUtil.getDataSpecificationIec61360;

public class DataSpecificationIec61360Test {

    @Test
    public void testLevelType() throws IncompatibleTypeException {
        LevelType levelType = new DefaultLevelType.Builder()
                .max(true)
                .min(false)
                .typ(true)
                .nom(false)
                .build();

        RDFSerializationResult rdfSerializationResult = new DefaultLevelTypeRDFHandler().toModel(levelType);

        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert model.contains(createdResource, RDF.type, AASNamespace.Types.LevelType);
        assert model.containsLiteral(createdResource, AASNamespace.LevelType.max, levelType.getMax());
        assert model.containsLiteral(createdResource, AASNamespace.LevelType.min, levelType.getMin());
        assert model.containsLiteral(createdResource, AASNamespace.LevelType.typ, levelType.getTyp());
        assert model.containsLiteral(createdResource, AASNamespace.LevelType.nom, levelType.getNom());

        LevelType recreatedLevelType = new DefaultLevelTypeRDFHandler().fromModel(model, createdResource);
        assert levelType.equals(recreatedLevelType);
    }

    @Test
    public void testEmbeddedDataSpecification() throws IncompatibleTypeException {
        EmbeddedDataSpecification object = SerializerUtil.getEmbeddedDataSpecifications();
        RDFSerializationResult rdfSerializationResult = new DefaultEmbeddedDataSpecificationRDFHandler().toModel(object);
        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        EmbeddedDataSpecification recreatedObject = new DefaultEmbeddedDataSpecificationRDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);

    }

    @Test
    public void testMaximalEmbeddedDataSpecification() throws IncompatibleTypeException {
        EmbeddedDataSpecification object = SerializerUtil.getMaximalEmbeddedDataSpecifications();
        RDFSerializationResult rdfSerializationResult = new DefaultEmbeddedDataSpecificationRDFHandler().toModel(object);
        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        EmbeddedDataSpecification recreatedObject = new DefaultEmbeddedDataSpecificationRDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);

    }
    @Test
    public void testDataSpecificationIec61360() throws IncompatibleTypeException {
        DataSpecificationIec61360 dataSpecificationIec61360 = new DefaultDataSpecificationIec61360.Builder()
                .preferredName(List.of(new DefaultLangStringPreferredNameTypeIec61360.Builder()
                        .language("en")
                        .text("preferred name")
                        .build()))
                .build();
        RDFSerializationResult rdfSerializationResult = new DefaultDataSpecificationIEC61360RDFHandler().toModel(dataSpecificationIec61360);
        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert model.contains(createdResource, RDF.type, AASNamespace.Types.DataSpecificationIec61360);
//        assert model.contains(createdResource, AASNamespace.Identifiable.id, conceptDescription.getId());

        DataSpecificationIec61360 recreatedDataSpecification = new DefaultDataSpecificationIEC61360RDFHandler().fromModel(model, createdResource);
        assert dataSpecificationIec61360.equals(recreatedDataSpecification);
    }
    @Test
    public void testLangStrings() throws IncompatibleTypeException {
        DefaultLangStringShortNameTypeIec61360 object = new DefaultLangStringShortNameTypeIec61360.Builder()
                .text("test")
                .language("en")
                .build();

        RDFSerializationResult rdfSerializationResult = new DefaultLangStringShortNameTypeIec61360RDFHandler().toModel(object);

        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert model.contains(createdResource, RDF.type, AASNamespace.Types.LangStringShortNameTypeIec61360);
        assert model.containsLiteral(createdResource, AASNamespace.AbstractLangString.language, object.getLanguage());
        assert model.containsLiteral(createdResource, AASNamespace.AbstractLangString.text, object.getText());

        LangStringShortNameTypeIec61360 recreatedObject = new DefaultLangStringShortNameTypeIec61360RDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testValueList() throws IncompatibleTypeException {
        ValueList object = new DefaultValueList.Builder()
                .valueReferencePairs(List.of(
                                new DefaultValueReferencePair.Builder()
                                        .valueId(new DefaultReference.Builder()
                                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                .keys(List.of(new DefaultKey.Builder()
                                                        .value("Global1")
                                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                                        .build()))
                                                .build())
                                        .value("value1")
                                        .build(),
                                new DefaultValueReferencePair.Builder()
                                        .valueId(new DefaultReference.Builder()
                                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                .keys(List.of(new DefaultKey.Builder()
                                                        .value("Global2")
                                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                                        .build()))
                                                .build())
                                        .value("value2")
                                        .build()
                        )
                )
                .build();

        RDFSerializationResult rdfSerializationResult = new DefaultValueListRDFHandler().toModel(object);

        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert model.contains(createdResource, RDF.type, AASNamespace.Types.ValueList);

        ValueList recreatedObject = new DefaultValueListRDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMinimalDataSpecificationIec61360() throws IncompatibleTypeException {
        DataSpecificationIec61360 object = new DefaultDataSpecificationIec61360.Builder()
                .dataType(DataTypeIec61360.STRING)
                .levelType(new DefaultLevelType.Builder()
                        .build())
                .build();
        RDFSerializationResult rdfSerializationResult = new DefaultDataSpecificationIEC61360RDFHandler().toModel(object);

        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert model.contains(createdResource, RDF.type, AASNamespace.Types.DataSpecificationIec61360);
        DataSpecificationIec61360 recreatedObject = new DefaultDataSpecificationIEC61360RDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMaximalDataSpecificationIec61360() throws IncompatibleTypeException {
        DataSpecificationIec61360 object = getDataSpecificationIec61360();
        RDFSerializationResult rdfSerializationResult = new DefaultDataSpecificationIEC61360RDFHandler().toModel(object);

        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert model.contains(createdResource, RDF.type, AASNamespace.Types.DataSpecificationIec61360);
        DataSpecificationIec61360 recreatedObject = new DefaultDataSpecificationIEC61360RDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);
    }


}
