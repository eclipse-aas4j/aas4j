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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomProperty;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel2;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class JsonDeserializerTest {
    @Test
    public void testReadEnvironmentFromStream() throws Exception {
        Environment env = new JsonDeserializer().read(Examples.EXAMPLE_FULL.fileContentStream());
        assertNotNull(env);
    }

    @Test
    public void testReadEnvironmentFromFile() throws Exception {
        File file = Paths.get("src", "test", "resources", "Example-Full.json").toFile();
        assertTrue(file.exists());
        Environment env = new JsonDeserializer().read(file);
        assertNotNull(env);
    }

    @Test
    public void testReadReferable() throws Exception {
        Path path = Paths.get("src", "test", "resources", "Submodel.json");
        assertTrue(path.toFile().exists());
        String jsonSubmodel = Files.readString(path);
        Submodel submodel = new JsonDeserializer().readReferable(jsonSubmodel, Submodel.class);
        assertNotNull(submodel);
    }

    @Test
    public void testReadReferableFromStream() throws Exception {
        Submodel submodel = new JsonDeserializer().readReferable(Examples.SUBMODEL.fileContentStream(), Submodel.class);
        assertNotNull(submodel);
    }

    @Test
    public void testReadReferableFromNode() throws Exception {
        JsonNode node = new ObjectMapper().readTree(Examples.SUBMODEL.fileContentStream());
        Submodel submodel = new JsonDeserializer().readReferable(node, Submodel.class);
        assertNotNull(submodel);
    }

    @Test
    public void testReadReferableFromFile() throws Exception {
        File file = Paths.get("src", "test", "resources", "Submodel.json").toFile();
        assertTrue(file.exists());
        Submodel submodel = new JsonDeserializer().readReferable(file, Submodel.class);
        assertNotNull(submodel);
    }

    @Test
    public void testReadReferables() throws Exception {
        Path path = Paths.get("src", "test", "resources", "Submodel-List.json");
        assertTrue(path.toFile().exists());
        String jsonSubmodels = Files.readString(path);
        List<Submodel> submodels = new JsonDeserializer().readReferables(jsonSubmodels, Submodel.class);
        assertNotNull(submodels);
        assertEquals(2, submodels.size());
        assertNotNull(submodels.get(0));
        assertNotNull(submodels.get(1));
    }

    @Test
    public void testReadReferablesFromNode() throws Exception {
        JsonNode node = new ObjectMapper().readTree(Examples.SUBMODEL_LIST_OF.fileContentStream());
        List<Submodel> submodels = new JsonDeserializer().readReferables(node, Submodel.class);
        assertNotNull(submodels);
        assertEquals(2, submodels.size());
        assertNotNull(submodels.get(0));
        assertNotNull(submodels.get(1));
    }

    @Test
    public void testReadReferablesFromStream() throws Exception {
        List<Submodel> submodels = new JsonDeserializer().readReferables(
            Examples.SUBMODEL_LIST_OF.fileContentStream(), Submodel.class);
        assertNotNull(submodels);
        assertEquals(2, submodels.size());
        assertNotNull(submodels.get(0));
        assertNotNull(submodels.get(1));
    }

    @Test
    public void testReadReferablesFromFile() throws Exception {
        File file = Paths.get("src", "test", "resources", "Submodel-List.json").toFile();
        assertTrue(file.exists());
        List<Submodel> submodels = new JsonDeserializer().readReferables(file, Submodel.class);
        assertNotNull(submodels);
        assertEquals(2, submodels.size());
        assertNotNull(submodels.get(0));
        assertNotNull(submodels.get(1));
    }



    @Test
    public void testSimpleExample() throws Exception {
        Environment expected = Examples.EXAMPLE_SIMPLE.getModel();
        Environment actual = new JsonDeserializer().read(Examples.EXAMPLE_SIMPLE.fileContentStream());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFullExample() throws Exception {
        Environment expected = Examples.EXAMPLE_FULL.getModel();
        Environment actual = new JsonDeserializer().read(Examples.EXAMPLE_FULL.fileContentStream());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFullExampleFromNode() throws Exception {
        Environment expected = Examples.EXAMPLE_FULL.getModel();
        JsonNode node = new ObjectMapper().readTree(Examples.EXAMPLE_FULL.fileContentStream());
        Environment actual = new JsonDeserializer().read(node);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCustomImplementationClass() throws Exception {
        String json = new JsonSerializer().write(AASSimple.createEnvironment());
        JsonDeserializer deserializer = new JsonDeserializer();
        Environment environment = deserializer.read(json);
        checkImplementationClasses(environment, DefaultSubmodel.class, DefaultProperty.class);
        deserializer.useImplementation(Submodel.class, CustomSubmodel.class);
        deserializer.useImplementation(Property.class, CustomProperty.class);
        environment = deserializer.read(json);
        checkImplementationClasses(environment, CustomSubmodel.class, CustomProperty.class);
        deserializer.useImplementation(Submodel.class, CustomSubmodel2.class);
        environment = deserializer.read(json);
        checkImplementationClasses(environment, CustomSubmodel2.class, CustomProperty.class);
    }

    private void checkImplementationClasses(Environment environment,
            Class<? extends Submodel> submodelImpl, Class<? extends Property> propertyImpl) {
        environment.getSubmodels().forEach(submodel -> {
            assertEquals(submodel.getClass(), submodelImpl);
            submodel.getSubmodelElements().stream()
                    .filter(element -> Property.class.isAssignableFrom(element.getClass()))
                    .forEach(element -> assertEquals(element.getClass(), propertyImpl));
        });
    }
}
