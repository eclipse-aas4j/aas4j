/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.*;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultConceptDescriptionRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultDataSpecificationIEC61360RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultKeyRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultReferableRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultReferenceRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SerializerTest {

    @Test
    public void testKey() throws IOException {
        Key simpleKey = new DefaultKey.Builder().value("simple").type(KeyTypes.GLOBAL_REFERENCE).build();
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
    public void testReference() throws IncompatibleTypeException {
        Reference reference = new DefaultReference.Builder()
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .keys(Arrays.asList(
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

    @Test
    public void simpleConceptDescription() throws IOException, IncompatibleTypeException {
        ConceptDescription conceptDescription = new DefaultConceptDescription.Builder().id("simple").build();

        RDFSerializationResult rdfSerializationResult = new DefaultConceptDescriptionRDFHandler().toModel(conceptDescription);
        Model model = rdfSerializationResult.getModel();
        model.write(System.out, Lang.TTL.getName());
        Resource createdResource = rdfSerializationResult.getResource();
        assert model.contains(createdResource, RDF.type, AASNamespace.Types.ConceptDescription);
        assert model.contains(createdResource, AASNamespace.Identifiable.id, conceptDescription.getId());

        ConceptDescription recreatedConceptDescription = new DefaultConceptDescriptionRDFHandler().fromModel(model, createdResource);
        assert conceptDescription.equals(recreatedConceptDescription);
    }

    @Test
    public void complexConceptDescription() throws IOException {
        ConceptDescription conceptDescription = new DefaultConceptDescription.Builder()
                .id("complex")
                .extensions(Arrays.asList(
                        new DefaultExtension.Builder()
                                .name("extension1")
                                .value("extension1Value")
                                .build(),
                        new DefaultExtension.Builder()
                                .name("extension2")
                                .value("extension2Value")
                                .build()))
                .category("myCategory")
                .idShort("exampleIdShort")
                .displayName(Arrays.asList(
                        new DefaultLangStringNameType.Builder()
                                .text("text in English")
                                .language("en")
                                .build(),
                        new DefaultLangStringNameType.Builder()
                                .text("متن به فارسی")
                                .language("fa")
                                .build()))
                .description(Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                                .text("A long text in English")
                                .language("en")
                                .build(),
                        new DefaultLangStringTextType.Builder()
                                .text("영어로 된 긴 텍스트")
                                .language("ko")
                                .build()))
                .administration(new DefaultAdministrativeInformation.Builder()
                        .version("1")
                        .revision("0")
                        .creator(new DefaultReference.Builder().keys(
                                Arrays.asList(new DefaultKey.Builder()
                                        .value("https://example.com")
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .build(),
                                        new DefaultKey.Builder()
                                                .value("fragment")
                                                .type(KeyTypes.FRAGMENT_REFERENCE)
                                                .build()))
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .build())
                .isCaseOf(Arrays.asList(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("https://example.com/outside")
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE).build()))
                .embeddedDataSpecifications(new DefaultEmbeddedDataSpecification.Builder().dataSpecification(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0")
                                        .type(KeyTypes.GLOBAL_REFERENCE).build()).build())
                        .dataSpecificationContent(
                                new DefaultDataSpecificationIec61360.Builder()
                                        .levelType(new DefaultLevelType.Builder().max(true).min(true).nom(false).typ(false).build())
                                        .unit("gram")
                                        .symbol("g")
//                                .definition()
//                                .shortName()
//                                .preferredName()
//                                .valueFormat()
//                                .valueList()
                        .dataType(DataTypeIec61360.INTEGER_MEASURE).build()).build()).build();


    }

    @Test
    public void serializeEnvironmentSmokeTest() throws IOException, DeserializationException, SerializationException {

        AssetAdministrationShell aas = new DefaultAssetAdministrationShell.Builder().assetInformation(new DefaultAssetInformation.Builder().assetKind(AssetKind.INSTANCE).build()).description(Arrays.asList(new DefaultLangStringTextType.Builder().text("This is a test AAS").language("en-us").build())).displayName(Arrays.asList(new DefaultLangStringNameType.Builder().text("Anzeigename 2").language("de").build(), new DefaultLangStringNameType.Builder().text("Display Name 1").language("en").build())).build();

        Submodel submodel = new DefaultSubmodel.Builder().description(Arrays.asList(new DefaultLangStringTextType.Builder().text("My Submodel").language("en-us").build())).displayName(Arrays.asList(new DefaultLangStringNameType.Builder().text("First Submodel Element name").language("en").build(), new DefaultLangStringNameType.Builder().text("Second Submodel Element name").language("en").build())).category("Example category").build();

        ConceptDescription conceptDescription = new DefaultConceptDescription.Builder().embeddedDataSpecifications(new DefaultEmbeddedDataSpecification.Builder().dataSpecification(new DefaultReference.Builder().keys(new DefaultKey.Builder().value("https://example.org").build()).build()).dataSpecificationContent(new DefaultDataSpecificationIec61360.Builder().dataType(DataTypeIec61360.RATIONAL).build()).build()).build();

        List<AssetAdministrationShell> aasList = new ArrayList<>(Collections.singletonList(aas));
        Environment aasEnv = new DefaultEnvironment.Builder().assetAdministrationShells(aasList).submodels(submodel).conceptDescriptions(conceptDescription).build();

        String output = new RDFSerializer().write(aasEnv);
        System.out.println(output);
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

}
