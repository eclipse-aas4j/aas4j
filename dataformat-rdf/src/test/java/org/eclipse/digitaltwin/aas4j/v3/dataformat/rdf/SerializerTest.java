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
import org.apache.jena.riot.RDFLanguages;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SerializerTest {

    //TODO: Optional: Prefixes instead of full URIs
    //TODO: Optional: Do not serialize empty collections
    @Test
    public void simpleConceptDescription() throws IOException {
        ConceptDescription conceptDescription = new DefaultConceptDescription.Builder()
                .id("simple")
                .build();

        String output = null;
        try {
            output = new RdfSerializer().write(conceptDescription);
            System.out.println(output);

            Model model = ModelFactory.createDefaultModel();
            InputStream inputStream = new ByteArrayInputStream(output.getBytes());
            model.read(inputStream, null, "TTL");
//            ResourceFactory.createResource(Identifiable.id);
//            ResourceFactory.createProperty(propertyUriString);
            // Get all subject nodes that are of type ConceptDescription
            ResIterator resIterator = model.listResourcesWithProperty(RDF.type,
                    ResourceFactory.createResource("https://admin-shell.io/aas/3/0/ConceptDescription"));
            Resource createdConceptDescriptionResource = resIterator.nextResource();
            Statement idStatement = model.getProperty(createdConceptDescriptionResource,
                    ResourceFactory.createProperty(Identifiable.id));
            assert idStatement.getString().equals(conceptDescription.getId());
        } catch (SerializationException e) {
            throw new RuntimeException(e);
        }

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
                                .build()
                ))
                .description(Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                                .text("A long text in English")
                                .language("en")
                                .build(),
                        new DefaultLangStringTextType.Builder()
                                .text("영어로 된 긴 텍스트")
                                .language("ko")
                                .build()
                ))
                .administration(new DefaultAdministrativeInformation.Builder()
                        .version("1")
                        .revision("0")
                        .creator(new DefaultReference.Builder()
                                .keys(Arrays.asList(
                                        new DefaultKey.Builder()
                                                .value("https://example.com")
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .build(),
                                        new DefaultKey.Builder()
                                                .value("fragment")
                                                .type(KeyTypes.FRAGMENT_REFERENCE)
                                                .build()
                                ))
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .build()
                ).isCaseOf(Arrays.asList(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("https://example.com/outside")
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build()
                ))
                .embeddedDataSpecifications(new DefaultEmbeddedDataSpecification.Builder()
                        .dataSpecification(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0")
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .build())
                                .build())
                        .dataSpecificationContent(new DefaultDataSpecificationIec61360.Builder()
                                .levelType(new DefaultLevelType.Builder()
                                        .max(true)
                                        .min(true)
                                        .nom(false)
                                        .typ(false)
                                        .build())
                                .unit("gram")
                                .symbol("g")
//                                .definition()
//                                .shortName()
//                                .preferredName()
//                                .valueFormat()
//                                .valueList()
                                .dataType(DataTypeIec61360.INTEGER_MEASURE)
                                .build())
                        .build())
                .build();

        String output = null;
        try {
            String outputJsonLd = new RdfSerializer().write(conceptDescription, Lang.JSONLD);
            System.out.println(outputJsonLd);
            output = new RdfSerializer().write(conceptDescription);
            System.out.println(output);

            Model model = ModelFactory.createDefaultModel();
            InputStream inputStream = new ByteArrayInputStream(output.getBytes());
            model.read(inputStream, null, "TTL");
//            ResourceFactory.createResource(Identifiable.id);
//            ResourceFactory.createProperty(propertyUriString);
            // Get all subject nodes that are of type ConceptDescription
            ResIterator resIterator = model.listResourcesWithProperty(RDF.type,
                    ResourceFactory.createResource("https://admin-shell.io/aas/3/0/ConceptDescription"));
            Resource createdConceptDescriptionResource = resIterator.nextResource();
            Statement idStatement = model.getProperty(createdConceptDescriptionResource,
                    ResourceFactory.createProperty(Identifiable.id));
            assert idStatement.getString().equals(conceptDescription.getId());
        } catch (SerializationException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void serializeEnvironmentSmokeTest() throws IOException, DeserializationException, SerializationException {

        AssetAdministrationShell aas = new DefaultAssetAdministrationShell.Builder()
                .assetInformation(new DefaultAssetInformation.Builder()
                        .assetKind(AssetKind.INSTANCE)
                        .build())
                .description(Arrays.asList(new DefaultLangStringTextType.Builder().text("This is a test AAS").language("en-us").build()))
                .displayName(Arrays.asList(
                        new DefaultLangStringNameType.Builder().text("Anzeigename 2").language("de").build(),
                        new DefaultLangStringNameType.Builder().text("Display Name 1").language("en").build()
                ))
                .build();

        Submodel submodel = new DefaultSubmodel.Builder()
                .description(Arrays.asList(new DefaultLangStringTextType.Builder().text("My Submodel").language("en-us").build()))
                .displayName(Arrays.asList(
                        new DefaultLangStringNameType.Builder().text("First Submodel Element name").language("en").build(),
                        new DefaultLangStringNameType.Builder().text("Second Submodel Element name").language("en").build()
                ))
                .category("Example category")
                .build();

        ConceptDescription conceptDescription = new DefaultConceptDescription.Builder()
                .embeddedDataSpecifications(new DefaultEmbeddedDataSpecification.Builder()
                        .dataSpecification(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("https://example.org")
                                        .build())
                                .build())
                        .dataSpecificationContent(new DefaultDataSpecificationIec61360.Builder()
                                .dataType(DataTypeIec61360.RATIONAL)
                                .build())
                        .build())
                .build();

        List<AssetAdministrationShell> aasList = new ArrayList<>(Collections.singletonList(aas));
        Environment aasEnv = new DefaultEnvironment.Builder()
                .assetAdministrationShells(aasList)
                .submodels(submodel)
                .conceptDescriptions(conceptDescription)
                .build();

        String output = new RdfSerializer().write(aasEnv);
        System.out.println(output);
    }
}
