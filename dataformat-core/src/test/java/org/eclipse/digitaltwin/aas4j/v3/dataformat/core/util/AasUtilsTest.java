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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class AasUtilsTest {
    @Test
    public void whenResolve_withProperty_success() {
        String submodelId = "http://example.org/submodel";
        String submodelElementIdShort = "foo";
        SubmodelElement expected = new DefaultProperty.Builder()
                .idShort(submodelElementIdShort)
                .value("bar")
                .build();
        Environment environment = new DefaultEnvironment.Builder()
                .submodels(new DefaultSubmodel.Builder()
                        .id(submodelId)
                        .submodelElements(expected)
                        .build())
                .build();
        Reference reference = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value(submodelId)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT)
                        .value(submodelElementIdShort)
                        .build())
                .build();
        Referable actual = AasUtils.resolve(reference, environment);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenResolve_withSubmodel_success() {
        assertNotNull(AasUtils.resolve(AASFull.AAS_1.getSubmodels().get(0), AASFull.createEnvironment()));

        Submodel asSubmodel = AasUtils.resolve(
                AASFull.AAS_1.getSubmodels().get(0),
                AASFull.createEnvironment(),
                Submodel.class
        );
        
        assertNotNull(asSubmodel);
        assertEquals(DefaultSubmodel.class, asSubmodel.getClass());
    }
    
    @Test
    public void whenResolve_withOperation_success() {
        String submodelId = "http://example.org/submodel";
        String submodelElementIdShort = "foo";
        String submodelElement2IdShort = "bar";
        SubmodelElement expected = new DefaultProperty.Builder()
                .idShort(submodelElement2IdShort)
                .value("bar")
                .build();
        Environment environment = new DefaultEnvironment.Builder()
                .submodels(new DefaultSubmodel.Builder()
                        .id(submodelId)
                        .submodelElements(new DefaultOperation.Builder()
                                .idShort(submodelElementIdShort)
                                .inputVariables(new DefaultOperationVariable.Builder()
                                        .value(expected)
                                        .build())
                                .build())
                        .build())
                .build();
        Reference reference = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value(submodelId)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT)
                        .value(submodelElementIdShort)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT)
                        .value(submodelElement2IdShort)
                        .build())
                .build();
        Referable actual = AasUtils.resolve(reference, environment);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenResolve_withElementWithinSubmodelElementList_success() {
        String submodelId = "http://example.org/submodel";
        String submodelElementIdShort = "foo";
        SubmodelElement expected = new DefaultProperty.Builder()
                .value("bar")
                .build();
        Environment environment = new DefaultEnvironment.Builder()
                .submodels(new DefaultSubmodel.Builder()
                        .id(submodelId)
                        .submodelElements(new DefaultSubmodelElementList.Builder()
                                .idShort(submodelElementIdShort)
                                .value(expected)
                                .build())
                        .build())
                .build();
        Reference reference = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value(submodelId)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT)
                        .value(submodelElementIdShort)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT)
                        .value("0")
                        .build())
                .build();
        Referable actual = AasUtils.resolve(reference, environment);
        Assert.assertEquals(expected, actual);
    }

}
