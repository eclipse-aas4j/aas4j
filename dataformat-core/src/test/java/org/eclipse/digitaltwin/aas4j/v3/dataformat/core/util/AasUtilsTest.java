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

import junitparams.JUnitParamsRunner;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementCollection;

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

    @Test(expected = IllegalArgumentException.class)
    public void whenResolve_withInvalidType_fail() {
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
                .type(ReferenceTypes.MODEL_REFERENCE)
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value(submodelId)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT)
                        .value(submodelElementIdShort)
                        .build())
                .build();
        AasUtils.resolve(reference, environment, Operation.class);
    }

    @Test
    public void whenResolve_insideSubmodelElementList_success() {
        String submodelId = "http://example.org/submodel";
        String submodelElementIdShort = "foo";
        String submodelElementListIdShort = "list";
        SubmodelElement expected = new DefaultProperty.Builder()
                .idShort(submodelElementIdShort)
                .value("bar")
                .build();
        SubmodelElementList list = new DefaultSubmodelElementList.Builder()
                .idShort(submodelElementListIdShort)
                .value(expected)
                .build();
        Environment environment = new DefaultEnvironment.Builder()
                .submodels(new DefaultSubmodel.Builder()
                        .id(submodelId)
                        .submodelElements(list)
                        .build())
                .build();
        Reference reference = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value(submodelId)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                        .value(submodelElementListIdShort)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT)
                        .value("0")
                        .build())
                .build();
        Referable actual = AasUtils.resolve(reference, environment);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenResolve_insideSubmodelElementList_indexOutOfBounds() {
        String submodelId = "http://example.org/submodel";
        String submodelElementIdShort = "foo";
        String submodelElementListIdShort = "list";
        SubmodelElement expected = new DefaultProperty.Builder()
                .idShort(submodelElementIdShort)
                .value("bar")
                .build();
        SubmodelElementList list = new DefaultSubmodelElementList.Builder()
                .idShort(submodelElementListIdShort)
                .value(expected)
                .build();
        Environment environment = new DefaultEnvironment.Builder()
                .submodels(new DefaultSubmodel.Builder()
                        .id(submodelId)
                        .submodelElements(list)
                        .build())
                .build();
        Reference reference = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value(submodelId)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                        .value(submodelElementListIdShort)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT)
                        .value("1")
                        .build())
                .build();
        AasUtils.resolve(reference, environment);
    }

    @Test
    public void whenResolve_insideSubmodelElementCollection_success() {
        String submodelId = "http://example.org/submodel";
        String submodelElementIdShort = "foo";
        String submodelElementCollectionIdShort = "collection";
        SubmodelElement expected = new DefaultProperty.Builder()
                .idShort(submodelElementIdShort)
                .value("bar")
                .build();
        SubmodelElementCollection list = new DefaultSubmodelElementCollection.Builder()
                .idShort(submodelElementCollectionIdShort)
                .value(expected)
                .build();
        Environment environment = new DefaultEnvironment.Builder()
                .submodels(new DefaultSubmodel.Builder()
                        .id(submodelId)
                        .submodelElements(list)
                        .build())
                .build();
        Reference reference = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value(submodelId)
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                        .value(submodelElementCollectionIdShort)
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

    @Test
    public void whenSameAs_withDifferentKeyTypesButSameValues_success() {
        String value = "0173-1#01-ADS698#010";
        Reference ref1 = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value(value)
                        .build())
                .build();
        Reference ref2 = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.FRAGMENT_REFERENCE)
                        .value(value)
                        .build())
                .build();
        Assert.assertTrue(AasUtils.sameAs(ref1, ref2));
    }

    @Test
    public void whenSameAs_withDifferentKeyTypesAndValues_fail() {
        Reference ref1 = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value("foo")
                        .build())
                .build();
        Reference ref2 = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.FRAGMENT_REFERENCE)
                        .value("bar")
                        .build())
                .build();
        Assert.assertFalse(AasUtils.sameAs(ref1, ref2));
    }

    @Test
    public void whenSameAs_withSameKeyTypesAndValues_success() {
        String value = "0173-1#01-ADS698#010";
        Reference ref1 = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value(value)
                        .build())
                .build();
        Reference ref2 = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value(value)
                        .build())
                .build();
        Assert.assertTrue(AasUtils.sameAs(ref1, ref2));
    }

    @Test
    public void whenSameAs_withSameKeyTypesButDifferentValues_fail() {
        Reference ref1 = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value("foo")
                        .build())
                .build();
        Reference ref2 = new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value("bar")
                        .build())
                .build();
        Assert.assertFalse(AasUtils.sameAs(ref1, ref2));
    }

    @Test
    public void whenSameAs_withDifferentReferredSemanticId_success() {
        String value = "0173-1#01-ADS698#010";
        Reference ref1 = new DefaultReference.Builder()
                .referredSemanticID(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("foo")
                                .build())
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value(value)
                        .build())
                .build();
        Reference ref2 = new DefaultReference.Builder()
                .referredSemanticID(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("bar")
                                .build())
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value(value)
                        .build())
                .build();
        Assert.assertTrue(AasUtils.sameAs(ref1, ref2));
    }

    @Test
    public void whenSameAs_withDifferentReferredSemanticId_fail() {
        String value = "0173-1#01-ADS698#010";
        Reference ref1 = new DefaultReference.Builder()
                .referredSemanticID(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("foo")
                                .build())
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value(value)
                        .build())
                .build();
        Reference ref2 = new DefaultReference.Builder()
                .referredSemanticID(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("bar")
                                .build())
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value(value)
                        .build())
                .build();
        Assert.assertFalse(AasUtils.sameAs(ref1, ref2, true));
    }

    @Test
    public void whenAsString_withSubmodelElementList_success() {
        Reference reference = new DefaultReference.Builder()
                .type(ReferenceTypes.MODEL_REFERENCE)
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value("submodel")
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                        .value("list")
                        .build())
                .keys(new DefaultKey.Builder()
                        .type(KeyTypes.PROPERTY)
                        .value("0")
                        .build())
                .build();
        String expected = "[ModelRef](Submodel)submodel, (SubmodelElementList)list, (Property)0";
        String actual = AasUtils.asString(reference);
        Assert.assertEquals(expected, actual);
    }
}
