package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.*;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RDFHandlersTest {
    @Test
    public void testKey() throws IOException, IncompatibleTypeException {
        Key simpleKey = new DefaultKey.Builder()
                .value("simple")
                .type(KeyTypes.GLOBAL_REFERENCE)
                .build();
        RDFSerializationResult rdfSerializationResult = new DefaultKeyRDFHandler().toModel(simpleKey);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Key);
        assert rdfSerializationResult.getModel().contains(createdResource, AASNamespace.Key.value, simpleKey.getValue());
        assert rdfSerializationResult.getModel().contains(createdResource, AASNamespace.Key.type, AASNamespace.KeyTypes.valueOf(simpleKey.getType().name()));

        Key recreatedKey = new DefaultKeyRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert simpleKey.equals(recreatedKey);
    }

    @Test
    public void testMinimalAdministrativeInformation() throws IncompatibleTypeException {
        AdministrativeInformation object = new DefaultAdministrativeInformation.Builder()
                .version("1")
                .revision("0")
                .build();

        RDFSerializationResult rdfSerializationResult = new DefaultAdministrativeInformationRDFHandler().toModel(object);

        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert model.contains(createdResource, RDF.type, AASNamespace.Types.AdministrativeInformation);

        AdministrativeInformation recreatedObject = new DefaultAdministrativeInformationRDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMaximalAdministrativeInformation() throws IncompatibleTypeException {
        AdministrativeInformation object = new DefaultAdministrativeInformation.Builder()
                .version("1")
                .revision("1")
                .templateId("template")
                .creator(new DefaultReference.Builder()
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .keys(List.of(
                                new DefaultKey.Builder()
                                        .value("Ref1")
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .build()
                        ))
                        .build()
                )
                .embeddedDataSpecifications(SerializerUtil.getEmbeddedDataSpecifications())
                .build();

        RDFSerializationResult rdfSerializationResult = new DefaultAdministrativeInformationRDFHandler().toModel(object);

        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert model.contains(createdResource, RDF.type, AASNamespace.Types.AdministrativeInformation);

        AdministrativeInformation recreatedObject = new DefaultAdministrativeInformationRDFHandler().fromModel(model, createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testReference() throws IncompatibleTypeException {
        Reference reference = new DefaultReference.Builder()
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .keys(List.of(
                        new DefaultKey.Builder()
                                .value("https://example.com")
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .build(),
                        new DefaultKey.Builder()
                                .value("fragment")
                                .type(KeyTypes.FRAGMENT_REFERENCE)
                                .build()))
                .build();
        RDFSerializationResult rdfSerializationResult = new DefaultReferenceRDFHandler().toModel(reference);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Reference);

        Reference recreatedKey = new DefaultReferenceRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert reference.equals(recreatedKey);
    }
//
//    @Test
//    public void invalidEqualsLogic() {
//        List<LangStringTextType> withArraysAsList = Arrays.asList(
//                new DefaultLangStringTextType.Builder().text("").language("en-us").build(),
//                new DefaultLangStringTextType.Builder().text("Ein Beispiel-Teilmodell für eine Test-Anwendung").language("de").build()
//        );
//        List<DefaultLangStringTextType> withListOf = List.of(
//                new DefaultLangStringTextType.Builder().text("An example submodel for the test application").language("en-us").build(),
//                new DefaultLangStringTextType.Builder().text("Ein Beispiel-Teilmodell für eine Test-Anwendung").language("de").build()
//        );
//        assert withListOf.equals(withArraysAsList);
//        assertEquals(withListOf,withArraysAsList);
//    }

    @Test
    public void testExtension() throws IncompatibleTypeException {
        Extension object = SerializerUtil.getMaximalExtension();
        RDFSerializationResult rdfSerializationResult = new DefaultExtensionRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Extension);

        Extension recreatedObject = new DefaultExtensionRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }


    @Test
    public void testMinimalQualifier() throws IncompatibleTypeException {
        Qualifier object = SerializerUtil.getMinimalQualifier();
        RDFSerializationResult rdfSerializationResult = new DefaultQualifierRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Qualifier);

        Qualifier recreatedObject = new DefaultQualifierRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMaximalQualifier() throws IncompatibleTypeException {
        Qualifier object = SerializerUtil.getMaximalQualifier();
        RDFSerializationResult rdfSerializationResult = new DefaultQualifierRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Qualifier);

        Qualifier recreatedObject = new DefaultQualifierRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }


    @Test
    public void serializeEnvironmentSmokeTest() throws IOException, DeserializationException, SerializationException {

        AssetAdministrationShell aas = new DefaultAssetAdministrationShell.Builder()
                .id("test")
                .assetInformation(new DefaultAssetInformation.Builder()
                        .assetKind(AssetKind.INSTANCE)
                        .build())
                .description(
                        List.of(
                                new DefaultLangStringTextType.Builder()
                                        .text("This is a test AAS")
                                        .language("en-us").build()))
                .displayName(List.of(new DefaultLangStringNameType.Builder()
                                .text("Anzeigename 2").language("de").build(),
                        new DefaultLangStringNameType.Builder().text("Display Name 1")
                                .language("en").build())).build();

        Submodel submodel = new DefaultSubmodel.Builder()
                .id("example")
                .description(
                        List.of(new DefaultLangStringTextType.Builder()
                                .text("My Submodel")
                                .language("en-us")
                                .build()))
                .displayName(List.of(new DefaultLangStringNameType.Builder()
                                .text("First Submodel Element name")
                                .language("en").build(),
                        new DefaultLangStringNameType.Builder()
                                .text("Second Submodel Element name")
                                .language("en").build())).
                category("Example category").build();

        ConceptDescription conceptDescription = new DefaultConceptDescription.Builder()
                .id("concept1")
                .embeddedDataSpecifications(new DefaultEmbeddedDataSpecification.Builder()
                        .dataSpecification(
                                new DefaultReference.Builder()
                                        .keys(new DefaultKey.Builder()
                                                .value("https://example.org")
                                                .build()).build())
                        .dataSpecificationContent(
                                new DefaultDataSpecificationIec61360.Builder()
                                        .dataType(DataTypeIec61360.RATIONAL)
                                        .build()).build())
                .build();

        List<AssetAdministrationShell> aasList = new ArrayList<>(Collections.singletonList(aas));
        Environment aasEnv = new DefaultEnvironment.Builder().assetAdministrationShells(aasList).submodels(submodel).conceptDescriptions(conceptDescription).build();

        String output = new RDFSerializer().write(aasEnv);
        System.out.println(output);
    }

    @Test
    public void testMaximalSpecificAssetId() throws IncompatibleTypeException {
        SpecificAssetId object = SerializerUtil.getMaximalSpecificAssetId();
        RDFSerializationResult rdfSerializationResult = new DefaultSpecificAssetIdRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.SpecificAssetId);

        SpecificAssetId recreatedObject = new DefaultSpecificAssetIdRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testResource() throws IncompatibleTypeException {
        org.eclipse.digitaltwin.aas4j.v3.model.Resource object = SerializerUtil.getResource();
        RDFSerializationResult rdfSerializationResult = new DefaultResourceRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.Resource);


        org.eclipse.digitaltwin.aas4j.v3.model.Resource recreatedObject = new DefaultResourceRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMinimalAssetInformation() throws IncompatibleTypeException {
        AssetInformation object = SerializerUtil.getMinimalAssetInformation();
        RDFSerializationResult rdfSerializationResult = new DefaultAssetInformationRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.AssetInformation);


        AssetInformation recreatedObject = new DefaultAssetInformationRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }

    @Test
    public void testMaximalAssetInformation() throws IncompatibleTypeException {
        AssetInformation object = SerializerUtil.getMaximalAssetInformation();
        RDFSerializationResult rdfSerializationResult = new DefaultAssetInformationRDFHandler().toModel(object);
        rdfSerializationResult.getModel().write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert rdfSerializationResult.getModel().contains(createdResource, RDF.type, AASNamespace.Types.AssetInformation);


        AssetInformation recreatedObject = new DefaultAssetInformationRDFHandler().fromModel(rdfSerializationResult.getModel(), createdResource);
        assert object.equals(recreatedObject);
    }


}
