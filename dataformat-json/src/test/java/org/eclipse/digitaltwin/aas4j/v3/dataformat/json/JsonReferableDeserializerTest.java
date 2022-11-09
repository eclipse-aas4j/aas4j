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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;

import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;

public class JsonReferableDeserializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonReferableDeserializerTest.class);

    @Test
    public void testReadAAS() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/assetAdministrationShell.json");
        String expected = Files.readString(fileExpected.toPath());
        AssetAdministrationShell aas = new JsonDeserializer().readReferable(expected, AssetAdministrationShell.class);
        Environment environment = AASFull.ENVIRONMENT;
        AssetAdministrationShell aasExpected = environment.getAssetAdministrationShells().get(0);

        assertEquals(aasExpected, aas);
    }

    @Test
    public void testReadAASs() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/assetAdministrationShellList.json");
        String expected = Files.readString(fileExpected.toPath());
        List<AssetAdministrationShell> aas = new JsonDeserializer().readReferables(expected, AssetAdministrationShell.class);
        Environment environment = AASFull.ENVIRONMENT;
        List<AssetAdministrationShell> aasExpected = Arrays.asList(environment.getAssetAdministrationShells().get(0)
                ,environment.getAssetAdministrationShells().get(1)) ;

        assertEquals(aasExpected, aas);
    }

    @Test
    public void testReadSubmodel() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/submodel.json");
        String expected = Files.readString(fileExpected.toPath());
        Submodel submodel = new JsonDeserializer().readReferable(expected, Submodel.class);
        Environment environment = AASFull.ENVIRONMENT;
        Submodel submodelExpected = environment.getSubmodels().get(0);

        assertEquals(submodelExpected, submodel);
    }

    @Test
    public void testReadSubmodels() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/submodelList.json");
        String expected = Files.readString(fileExpected.toPath());
        List<Submodel> submodels = new JsonDeserializer().readReferables(expected,Submodel.class);
        Environment environment = AASFull.ENVIRONMENT;
        List<Submodel> submodelsExpected = Arrays.asList(environment.getSubmodels().get(0),environment.getSubmodels().get(1));

        assertEquals(submodelsExpected, submodels);
    }

    @Test
    public void testReadSubmodelElement() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/submodelElement.json");
        String expected = Files.readString(fileExpected.toPath());
        SubmodelElement submodelElement = new JsonDeserializer().readReferable(expected,SubmodelElement.class);
        Environment environment = AASFull.ENVIRONMENT;
        SubmodelElement submodelElementExpected = environment.getSubmodels().get(0).getSubmodelElements().get(0);

        assertEquals(submodelElementExpected, submodelElement);
    }

    @Test
    public void testReadSubmodelElements() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/listOfSubmodelElements.json");
        String expected = Files.readString(fileExpected.toPath());
        List<SubmodelElement> submodelElements = new JsonDeserializer().readReferables(expected,SubmodelElement.class);
        Environment environment = AASFull.ENVIRONMENT;
        List<SubmodelElement> submodelElementsExpected = Arrays.asList(
                environment.getSubmodels().get(0).getSubmodelElements().get(0),
                environment.getSubmodels().get(0).getSubmodelElements().get(1));                ;

        assertEquals(submodelElementsExpected, submodelElements);
    }

    @Test
    public void testReadSubmodelElementList() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/submodelElementList.json");
        String expected = Files.readString(fileExpected.toPath());
        SubmodelElementList submodelElementList = new JsonDeserializer().readReferable(expected, SubmodelElementList.class);
        Environment environment = AASFull.ENVIRONMENT;
        SubmodelElement submodelElementListExpected = environment.getSubmodels().get(6).getSubmodelElements().get(5);                ;

        assertEquals(submodelElementListExpected, submodelElementList);
    }

    @Test
    public void testReadSubmodelElementCollection() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/submodelElementCollection.json");
        String expected = Files.readString(fileExpected.toPath());
        SubmodelElementCollection submodelElementCollection = new JsonDeserializer().readReferable(expected, SubmodelElementCollection.class);
        Environment environment = AASFull.ENVIRONMENT;
        SubmodelElement submodelElementCollectionExpected = environment.getSubmodels().get(6).getSubmodelElements().get(6);                ;

        assertEquals(submodelElementCollectionExpected, submodelElementCollection);
    }

}
