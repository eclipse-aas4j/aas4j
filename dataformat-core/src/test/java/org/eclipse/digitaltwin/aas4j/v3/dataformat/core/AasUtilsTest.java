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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;


import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util.AasUtils;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.junit.Assert;
import org.junit.Test;

public class AasUtilsTest {

    @Test
    public void testParseReference() {
        Reference reference = AasUtils.parseReference("(ModelReference)[Property]Temperature");
        Assert.assertNotNull(reference);
        Assert.assertEquals(1, reference.getKeys().size());
        Assert.assertEquals(KeyTypes.PROPERTY, reference.getKeys().get(0).getType());
        Assert.assertEquals("Temperature", reference.getKeys().get(0).getValue());
    }

    @Test
    public void whenDeserializingEnumNames_withUpperCamelCase_shouldReturnScreamingSnakeCase() {
        Assert.assertEquals("ANY_ENUM", AasUtils.deserializeEnumName("AnyEnum"));
    }

    @Test
    public void whenDeserializingEnumNames_withLowerCamelCase_shouldReturnScreamingSnakeCase() {
        Assert.assertEquals("ANY_ENUM", AasUtils.deserializeEnumName("anyEnum"));
    }

    @Test
    public void whenDeserializingEnumNames_withScreamingSnakeCase_shouldReturnUnchanged() {
        final String name = "ANY_ENUM";
        Assert.assertEquals(name, AasUtils.deserializeEnumName(name));
    }
}
