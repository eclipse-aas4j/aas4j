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
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.*;
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
    public void testAdministrativeInformationSimple() throws IncompatibleTypeException {
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
    public void testAdministrativeInformationComplex() throws IncompatibleTypeException {
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
