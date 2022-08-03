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
package org.eclipse.aas4j.v3.dataformat.rdf;

import org.eclipse.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.aas4j.v3.model.*;
import org.apache.jena.riot.RDFLanguages;
import org.eclipse.aas4j.v3.model.impl.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SerializerTest {

    //TODO: Optional: Prefixes instead of full URIs
    //TODO: Optional: Do not serialize empty collections

    @Test
    public void serializeEnvironment() throws IOException, DeserializationException {

        AssetAdministrationShell aas = new DefaultAssetAdministrationShell.Builder()
                .assetInformation(new DefaultAssetInformation.Builder()
                        .assetKind(AssetKind.INSTANCE)
                        .build())
                .descriptions(Arrays.asList(new DefaultLangString.Builder().text("This is a test AAS").language("en-us").build()))
                .displayNames(Arrays.asList(
                        new DefaultLangString.Builder().text("Anzeigename 2").language("de").build(),
                        new DefaultLangString.Builder().text("Display Name 1").language("en").build()
                        ))
                .build();

        Submodel submodel = new DefaultSubmodel.Builder()
                .descriptions(Arrays.asList(new DefaultLangString.Builder().text("My Submodel").language("en-us").build()))
                .displayNames(Arrays.asList(
                        new DefaultLangString.Builder().text("First Submodel Element name").language("en").build(),
                        new DefaultLangString.Builder().text("Second Submodel Element name").language("en").build()
                        ))
                .category("Example category")
                .build();

        ConceptDescription conceptDescription = new DefaultConceptDescription.Builder()
                .dataSpecifications(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .value("https://example.org")
                                .build())
                        .build())
                .embeddedDataSpecifications(new DefaultDataSpecification.Builder()
                        .id("http://example.org/DataSpecification1")
                        .dataSpecificationContent(new DefaultDataSpecificationIEC61360.Builder()
                                .dataType(DataTypeIEC61360.RATIONAL)
                                .build())
                        .build())
                .build();

        List<AssetAdministrationShell> aasList = new ArrayList<>(Collections.singletonList(aas));
        Environment aasEnv = new DefaultEnvironment.Builder()
                .assetAdministrationShells(aasList)
                .submodels(submodel)
                .conceptDescriptions(conceptDescription)
                .build();

        String output = new Serializer().serialize(aasEnv, RDFLanguages.JSONLD);
        //System.out.println(output);

        Assert.assertTrue(output.contains("@context"));
        // Assert.assertTrue(output.contains("rdf:")); // TODO: why should the output contain the 'rdf' prefix?
        Assert.assertTrue(output.contains("\"@type\" : \"aas:Environment\""));
        Assert.assertTrue(output.contains("\"@type\" : \"aas:AssetAdministrationShell\""));
        Assert.assertTrue(output.contains("\"@type\" : \"aas:Submodel\""));
        Assert.assertTrue(output.contains("\"@type\" : \"aas:ConceptDescription\""));

        Environment environment = new Serializer().deserialize(output, Environment.class);
        Assert.assertNotNull(environment);

        // Assert.assertTrue(aasEnv.equals(environment)); // TODO: Serialising and parsing to/from RDF looses the sequence of e.g. LangStrings, therefore this test fails also for semantically equal objects
    }
}
