/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.Deserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomProperty;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubmodel2;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;

public class JsonDeserializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonDeserializerTest.class);

    @Test
    public void testReadFromFile() throws Exception {
        new JsonDeserializer().read(JsonSerializerTest.AASFULL_FILE);
    }

    @Test
    public void testSimpleExample() throws Exception {
        Environment env = new JsonDeserializer().read(JsonSerializerTest.AASSIMPLE_FILE);
        Assert.assertEquals(AASSimple.ENVIRONMENT, env);
    }

    @Test
    public void testFullExample() throws Exception {
        Environment env = new JsonDeserializer().read(JsonSerializerTest.AASFULL_FILE);
        Assert.assertEquals(AASFull.ENVIRONMENT, env);
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
