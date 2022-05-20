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
package io.adminshell.aas.v3.dataformat.rdf;

import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;
import org.apache.jena.riot.RDFLanguages;
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
    public void serializeEnvironment() throws IOException {
        AssetAdministrationShell aas = new DefaultAssetAdministrationShell.Builder()
                .assetInformation(new DefaultAssetInformation.Builder()
                        .assetKind(AssetKind.INSTANCE)
                        .build())
                .description(new LangString("This is a test AAS"))
                .displayName(new LangString("Display Name 1", "en"))
                .displayName(new LangString("Anzeigename 2@de"))
                .build();
        Submodel submodel = new DefaultSubmodel.Builder()
                .description(new LangString("My Submodel"))
                .displayNames(new ArrayList<>(
                        Arrays.asList(
                                new LangString("First Submodel Element name"),
                                new LangString("Second Submodel Element name"))))
                .category("Example category")
                .embeddedDataSpecification(new DefaultEmbeddedDataSpecification.Builder()
                        .dataSpecification(new DefaultReference.Builder()
                                .key(new DefaultKey.Builder()
                                        .idType(KeyType.IRI).value("https://example.org")
                                        .build())
                                .build())
                        .dataSpecificationContent(new DefaultDataSpecificationIEC61360.Builder()
                                .dataType(DataTypeIEC61360.RATIONAL)
                                .build())
                        .build())
                .build();
        List<AssetAdministrationShell> aasList = new ArrayList<>(Collections.singletonList(aas));
        AssetAdministrationShellEnvironment aasEnv = new DefaultAssetAdministrationShellEnvironment.Builder()
                .assetAdministrationShells(aasList)
                .submodels(submodel)
                .build();
        String output = new Serializer().serialize(aasEnv, RDFLanguages.JSONLD);
        //System.out.println(output);
        Assert.assertTrue(output.contains("@context"));
        Assert.assertTrue(output.contains("rdf:"));

        //AssetAdministrationShellEnvironment assetAdministrationShellEnvironment = new Serializer().deserialize(output, AssetAdministrationShellEnvironment.class);
        //System.out.println(assetAdministrationShellEnvironment.getAssetAdministrationShells().get(0).getDescriptions().get(0).getValue());
    }
}
