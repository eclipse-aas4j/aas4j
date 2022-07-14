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
package org.eclipse.aas4j.v3.rc02.dataformat.rdf;

import org.eclipse.aas4j.v3.rc02.model.AssetAdministrationShell;
import org.eclipse.aas4j.v3.rc02.model.Environment;
import org.eclipse.aas4j.v3.rc02.model.AssetKind;
import org.eclipse.aas4j.v3.rc02.model.Submodel;
import org.apache.jena.riot.RDFLanguages;
import org.eclipse.aas4j.v3.rc02.model.impl.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
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
                .description(new DefaultLangStringSet.Builder().langStrings(new DefaultLangString.Builder().text("This is a test AAS").language("en-us").build()).build())
                .displayName(new DefaultLangStringSet.Builder()
                        .langStrings(new DefaultLangString.Builder().text("Display Name 1").language("en").build())
                        .langStrings(new DefaultLangString.Builder().text("Anzeigename 2").language("de").build())
                        .build())
                .build();
        Submodel submodel = new DefaultSubmodel.Builder()
                .description(new DefaultLangStringSet.Builder().langStrings(new DefaultLangString.Builder().text("My Submodel").language("en-us").build()).build())
                .displayName(new DefaultLangStringSet.Builder()
                        .langStrings(new DefaultLangString.Builder().text("First Submodel Element name").language("en").build())
                        .langStrings(new DefaultLangString.Builder().text("Second Submodel Element name").language("en").build())
                        .build())
                .category("Example category")
//                .embeddedDataSpecification(new DefaultEmbeddedDataSpecification.Builder()
//                        .dataSpecification(new DefaultReference.Builder()
//                                .keys(new DefaultKey.Builder()
//                                        .value("https://example.org")
//                                        .build())
//                                .build())
//                        .dataSpecificationContent(new DefaultDataSpecificationIEC61360.Builder()
//                                .dataType(DataTypeIEC61360.RATIONAL)
//                                .build())
//                        .build())
                .build();
        List<AssetAdministrationShell> aasList = new ArrayList<>(Collections.singletonList(aas));
        Environment aasEnv = new DefaultEnvironment.Builder()
                .assetAdministrationShells(aasList)
                .submodels(submodel)
                .build();
        String output = new Serializer().serialize(aasEnv, RDFLanguages.JSONLD);
        //System.out.println(output);
        Assert.assertTrue(output.contains("@context"));
        Assert.assertTrue(output.contains("rdf:"));

        //Environment Environment = new Serializer().deserialize(output, Environment.class);
        //System.out.println(Environment.getAssetAdministrationShells().get(0).getDescriptions().get(0).getValue());
    }
}
