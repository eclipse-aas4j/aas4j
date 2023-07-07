/*
 * Copyright 2023 jab.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.junit.Assert;
import org.junit.Test;

public class EqualsTest {

    private static final Property PROPERTY_1 = new DefaultProperty.Builder()
            .idShort("property1")
            .build();
    private static final Property PROPERTY_2 = new DefaultProperty.Builder()
            .idShort("property2")
            .build();

    @Test
    public void submodelElementCollection_SameOrder() {
        SubmodelElementCollection obj1 = new DefaultSubmodelElementCollection.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementCollection obj2 = new DefaultSubmodelElementCollection.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void submodelElementCollection_DifferntOrder() {
        SubmodelElementCollection obj1 = new DefaultSubmodelElementCollection.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementCollection obj2 = new DefaultSubmodelElementCollection.Builder()
                .value(List.of(PROPERTY_2, PROPERTY_1))
                .build();
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void submodelElementList_SameOrder_OrderUndefined() {
        SubmodelElementList obj1 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementList obj2 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void submodelElementList_SameOrder_OrderNotRelevant() {
        SubmodelElementList obj1 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementList obj2 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        obj1.setOrderRelevant(false);
        obj2.setOrderRelevant(false);
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void submodelElementList_SameOrder_OrderRelevant() {
        SubmodelElementList obj1 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementList obj2 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_2, PROPERTY_1))
                .build();
        obj1.setOrderRelevant(true);
        obj2.setOrderRelevant(true);
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void submodelElementList_SameOrder_OrderRelevantMixed() {
        SubmodelElementList obj1 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementList obj2 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        obj1.setOrderRelevant(true);
        obj2.setOrderRelevant(false);
        Assert.assertNotEquals(obj1, obj2);
    }

    @Test
    public void submodelElementList_DifferentOrder_OrderUndefined() {
        SubmodelElementList obj1 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementList obj2 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_2, PROPERTY_1))
                .build();
        Assert.assertNotEquals(obj1, obj2);
    }

    @Test
    public void submodelElementList_DifferntOrder_OrderNotRelevant() {
        SubmodelElementList obj1 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementList obj2 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_2, PROPERTY_1))
                .build();
        obj1.setOrderRelevant(false);
        obj2.setOrderRelevant(false);
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void submodelElementList_DifferntOrder_OrderRelevant() {
        SubmodelElementList obj1 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementList obj2 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_2, PROPERTY_1))
                .build();
        obj1.setOrderRelevant(true);
        obj2.setOrderRelevant(true);
        Assert.assertNotEquals(obj1, obj2);
    }

    @Test
    public void submodelElementList_DifferntOrder_OrderRelevantMixed() {
        SubmodelElementList obj1 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        SubmodelElementList obj2 = new DefaultSubmodelElementList.Builder()
                .value(List.of(PROPERTY_2, PROPERTY_1))
                .build();
        obj1.setOrderRelevant(true);
        obj2.setOrderRelevant(false);
        Assert.assertNotEquals(obj1, obj2);
    }

    @Test
    public void submodel_submodelElements_SameOrder() {
        Submodel obj1 = new DefaultSubmodel.Builder()
                .submodelElements(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        Submodel obj2 = new DefaultSubmodel.Builder()
                .submodelElements(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void submodel_submodelElements_DifferentOrder() {
        Submodel obj1 = new DefaultSubmodel.Builder()
                .submodelElements(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        Submodel obj2 = new DefaultSubmodel.Builder()
                .submodelElements(List.of(PROPERTY_2, PROPERTY_1))
                .build();
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void submodel_submodelElements_Uniqueness() {
        Submodel obj1 = new DefaultSubmodel.Builder()
                .submodelElements(PROPERTY_1)
                .submodelElements(PROPERTY_1)
                .build();
        Assert.assertEquals(1, obj1.getSubmodelElements().size());
    }

    @Test
    public void entity_statements_SameOrder() {
        Entity obj1 = new DefaultEntity.Builder()
                .statements(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        Entity obj2 = new DefaultEntity.Builder()
                .statements(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void entity_statements_DifferentOrder() {
        Entity obj1 = new DefaultEntity.Builder()
                .statements(List.of(PROPERTY_1, PROPERTY_2))
                .build();
        Entity obj2 = new DefaultEntity.Builder()
                .statements(List.of(PROPERTY_2, PROPERTY_1))
                .build();
        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void entity_statements_Uniqueness() {
        Entity obj1 = new DefaultEntity.Builder()
                .statements(PROPERTY_1)
                .statements(PROPERTY_1)
                .build();
        Assert.assertEquals(1, obj1.getStatements().size());
    }

}
