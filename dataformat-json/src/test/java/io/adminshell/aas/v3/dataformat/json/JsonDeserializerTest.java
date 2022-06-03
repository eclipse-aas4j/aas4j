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
package io.adminshell.aas.v3.dataformat.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.adminshell.aas.v3.dataformat.Deserializer;
import io.adminshell.aas.v3.dataformat.core.AASFull;
import io.adminshell.aas.v3.dataformat.core.AASSimple;
import io.adminshell.aas.v3.dataformat.core.CustomProperty;
import io.adminshell.aas.v3.dataformat.core.CustomSubmodel;
import io.adminshell.aas.v3.dataformat.core.CustomSubmodel2;
import io.adminshell.aas.v3.rc02.model.Environment;
import io.adminshell.aas.v3.rc02.model.Property;
import io.adminshell.aas.v3.rc02.model.Submodel;
import io.adminshell.aas.v3.rc02.model.impl.DefaultProperty;
import io.adminshell.aas.v3.rc02.model.impl.DefaultSubmodel;

public class JsonDeserializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonDeserializerTest.class);

    @Test
    public void testReadFromFile() throws Exception {
        new JsonDeserializer().read(JsonSerializerTest.AASFULL_FILE);
    }

    @Test
    public void testSimpleExample() throws Exception {
        Environment env = new JsonDeserializer().read(JsonSerializerTest.AASSIMPLE_FILE);
        assertEquals(AASSimple.ENVIRONMENT, env);
    }

    @Test
    public void testFullExample() throws Exception {
        Environment env = new JsonDeserializer().read(JsonSerializerTest.AASFULL_FILE);
        assertEquals(AASFull.ENVIRONMENT, env);
    }

    @Test
    public void testCustomImplementationClass() throws Exception {
        String json = new JsonSerializer().write(AASSimple.ENVIRONMENT);
        Deserializer deserializer = new JsonDeserializer();
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
