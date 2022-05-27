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
package io.adminshell.aas.v3.dataformat.core;


import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.rc02.model.KeyTypes;
import io.adminshell.aas.v3.rc02.model.Reference;
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
}
