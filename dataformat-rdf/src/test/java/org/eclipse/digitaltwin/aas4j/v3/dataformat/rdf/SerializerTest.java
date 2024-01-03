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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.apache.jena.riot.RDFLanguages;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

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

        String output = null;
        try {
            output = new RdfSerializer().write(aasEnv);
            System.out.println(output);
        } catch (SerializationException e) {
            throw new RuntimeException(e);
        }


    }
}
