/*
 * Copyright (C) 2023 SAP SE or an SAP affiliate company.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.function.Supplier;

import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Blob;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.EntityType;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.ModellingKind;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Range;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBlob;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEntity;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultFile;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultMultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRange;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;

public class TestData {
    public static final Supplier<Entity> ENTITY = () -> new DefaultEntity.Builder()
            .idShort("entity1")
            .entityType(EntityType.SELF_MANAGED_ENTITY)
            .globalAssetId("Global Asset Id")
        .statements(new DefaultProperty.Builder()
            .idShort("maxRotationSpeed")
            .valueType(DataTypeDefXsd.INT)
            .value("5000")
            .build())
        .build();

    public static final Entity ENTITY_UPDATED = new DefaultEntity.Builder()
        .idShort("entity1")
        .entityType(EntityType.CO_MANAGED_ENTITY)
        .globalAssetId("Global Asset Id Updated")
        .statements(new DefaultProperty.Builder()
            .idShort("maxRotationSpeed")
            .valueType(DataTypeDefXsd.INT)
            .value("5001")
            .build())
        .build();

    public static final Supplier<Property> PROPERTY_STRING = () -> new DefaultProperty.Builder()
        .category("category")
        .idShort("propString")
        .value("foo")
        .build();

    public static final Property PROPERTY_STRING_UPDATED = new DefaultProperty.Builder()
        .category("category")
        .idShort("propString")
        .value("foo updated")
        .build();

    public static final Supplier<Range> RANGE_DOUBLE = () -> new DefaultRange.Builder()
        .idShort("rangeDouble")
        .valueType(DataTypeDefXsd.DOUBLE)
        .min("3.0")
        .max("5.0")
        .build();

    public static final Range RANGE_DOUBLE_UPDATED = new DefaultRange.Builder()
        .idShort("rangeDouble")
        .valueType(DataTypeDefXsd.DOUBLE)
        .min("3.0")
        .max("5.0")
        .build();

    public static final Supplier<Blob> BLOB = () -> new DefaultBlob.Builder()
        .idShort("blob1")
        .contentType("application/octet-stream")
        .value("example-data".getBytes())
        .build();

    public static final Blob BLOB_UPDATED = new DefaultBlob.Builder()
        .idShort("blob1")
        .contentType("application/json")
        .value("{ value: 42 }".getBytes())
        .build();

    public static final Supplier<File> FILE = () -> new DefaultFile.Builder()
        .idShort("file1")
        .contentType("application/pdf")
        .value("SafetyInstructions.pdf")
        .build();

    public static final File FILE_UPDATED = new DefaultFile.Builder()
        .idShort("file1")
        .contentType("application/json")
        .value("SafetyInstructions.json")
        .build();

    public static final Supplier<MultiLanguageProperty> MULTI_LANGUAGE_PROPERTY = () -> new DefaultMultiLanguageProperty.Builder()
        .idShort("multiLanguageProp1")
        .value(new DefaultLangStringTextType.Builder().text("foo").language("de").build())
        .value(new DefaultLangStringTextType.Builder() .text("bar").language("en").build())
        .build();

    public static final MultiLanguageProperty MULTI_LANGUAGE_PROPERTY_UPDATED = new DefaultMultiLanguageProperty.Builder()
        .idShort("multiLanguageProp1")
        .value(new DefaultLangStringTextType.Builder().text("foo updated").language("fr").build())
        .value(new DefaultLangStringTextType.Builder() .text("bar updated").language("de").build())
        .build();

    public static final Supplier<Property> PROPERTY_DOUBLE = () -> new DefaultProperty.Builder()
        .category("category")
        .idShort("propDouble")
        .valueType(DataTypeDefXsd.DOUBLE)
        .value("42.17")
        .build();

    public static final Property PROPERTY_DOUBLE_UPDATED = new DefaultProperty.Builder()
        .category("category")
        .idShort("propDouble")
        .valueType(DataTypeDefXsd.DOUBLE)
        .value("24.71")
        .build();

    public static final Supplier<Property> PROPERTY_DATETIME = () -> new DefaultProperty.Builder()
        .category("category")
        .idShort("propDateTime")
        .valueType(DataTypeDefXsd.DATE_TIME)
        .value(ZonedDateTime.of(2022, 7, 31, 17, 8, 51, 0, ZoneOffset.UTC).toString())
        .build();

    public static final Property PROPERTY_DATETIME_UPDATED = new DefaultProperty.Builder()
        .category("category")
        .idShort("propDateTime")
        .valueType(DataTypeDefXsd.DATE_TIME)
        .value(ZonedDateTime.of(2023, 7, 31, 17, 8, 51, 0, ZoneOffset.UTC).toString())
        .build();

    public static final Supplier<Property> PROPERTY_INT = () -> new DefaultProperty.Builder()
        .category("category")
        .idShort("propInt")
        .valueType(DataTypeDefXsd.INT)
        .value("42")
        .build();

    public static final Property PROPERTY_INT_UPDATED = new DefaultProperty.Builder()
        .category("category")
        .idShort("propInt")
        .valueType(DataTypeDefXsd.INT)
        .value("24")
        .build();

    public static final Supplier<Range> RANGE_INT = () -> new DefaultRange.Builder()
        .idShort("rangeInt")
        .valueType(DataTypeDefXsd.INT)
        .min("17")
        .max("42")
        .build();

    public static final Range RANGE_INT_UPDATED = new DefaultRange.Builder()
        .idShort("rangeInt")
        .valueType(DataTypeDefXsd.INT)
        .min("24")
        .max("50")
        .build();

    public static final Supplier<ReferenceElement> REFERENCE_ELEMENT_GLOBAL = () -> new DefaultReferenceElement.Builder()
        .idShort("referenceGlobal")
        .value(new DefaultReference.Builder().type(ReferenceTypes.EXTERNAL_REFERENCE)
            .referredSemanticId(new DefaultReference.Builder()
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .keys(new DefaultKey.Builder()
                    .type(KeyTypes.CONCEPT_DESCRIPTION)
                    .value("Concept Description key value")
                     .build())
                .build())
            .keys(new DefaultKey.Builder()
                .type(KeyTypes.GLOBAL_REFERENCE)
                .value("global reference key value")
                .build())
            .build())
        .build();

    public static final ReferenceElement REFERENCE_ELEMENT_GLOBAL_UPDATED = new DefaultReferenceElement.Builder()
        .idShort("referenceGlobal")
        .value(new DefaultReference.Builder().type(ReferenceTypes.EXTERNAL_REFERENCE)
            .referredSemanticId(new DefaultReference.Builder()
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .keys(new DefaultKey.Builder()
                    .type(KeyTypes.GLOBAL_REFERENCE)
                    .value("Global reference key value updated")
                    .build())
                .build())
            .keys(new DefaultKey.Builder()
                .type(KeyTypes.FILE)
                .value("file key value")
                .build())
            .build())
        .build();

    public static final Supplier<ReferenceElement> REFERENCE_ELEMENT_MODEL = () -> new DefaultReferenceElement.Builder()
        .idShort("referenceModel")
        .value(new DefaultReference.Builder()
            .type(ReferenceTypes.MODEL_REFERENCE)
            .keys(new DefaultKey.Builder()
                .type(KeyTypes.PROPERTY)
                .value("MaxRotationSpeed")
                .build())
            .build())
            .build();

    public static final ReferenceElement REFERENCE_ELEMENT_MODEL_UPDATED = new DefaultReferenceElement.Builder()
        .idShort("referenceModel")
        .value(new DefaultReference.Builder()
            .type(ReferenceTypes.EXTERNAL_REFERENCE)
            .keys(new DefaultKey.Builder()
                 .type(KeyTypes.GLOBAL_REFERENCE)
                 .value("Global reference key value updated")
                 .build())
            .build())
        .build();

    public static final Supplier<AnnotatedRelationshipElement> ANNOTATED_RELATIONSHIP_ELEMENT = () -> new DefaultAnnotatedRelationshipElement.Builder()
        .idShort("annotatedRelationship1")
            .first(REFERENCE_ELEMENT_GLOBAL.get().getValue())
            .second(REFERENCE_ELEMENT_MODEL.get().getValue())
            .annotations(PROPERTY_DATETIME.get())
            .annotations(RANGE_INT.get())
        .build();

    public static final AnnotatedRelationshipElement ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED = new DefaultAnnotatedRelationshipElement.Builder()
        .idShort("annotatedRelationship1")
        .first(REFERENCE_ELEMENT_GLOBAL_UPDATED.getValue())
        .second(REFERENCE_ELEMENT_MODEL_UPDATED.getValue())
        .annotations(PROPERTY_DATETIME_UPDATED)
        .annotations(RANGE_INT_UPDATED)
        .build();

    public static final Supplier<RelationshipElement> RELATIONSHIP_ELEMENT = () -> new DefaultRelationshipElement.Builder()
        .idShort("relationship1")
            .first(REFERENCE_ELEMENT_GLOBAL.get().getValue())
            .second(REFERENCE_ELEMENT_MODEL.get().getValue())
        .build();


    public static final RelationshipElement RELATIONSHIP_ELEMENT_UPDATED = new DefaultRelationshipElement.Builder()
        .idShort("relationship1")
        .first(REFERENCE_ELEMENT_GLOBAL_UPDATED.getValue())
        .second(REFERENCE_ELEMENT_MODEL_UPDATED.getValue())
        .build();

    public static final Supplier<SubmodelElementCollection> ELEMENT_COLLECTION = () -> new DefaultSubmodelElementCollection.Builder()
        .idShort("collection1")
            .value(PROPERTY_STRING.get())
            .value(RANGE_DOUBLE.get())
            .value(ENTITY.get())
            .value(RELATIONSHIP_ELEMENT.get())
        .build();

    public static final SubmodelElementCollection ELEMENT_COLLECTION_UPDATED = new DefaultSubmodelElementCollection.Builder()
        .idShort("collection1")
        .value(PROPERTY_STRING_UPDATED)
        .value(RANGE_DOUBLE_UPDATED)
        .value(ENTITY_UPDATED)
        .value(RELATIONSHIP_ELEMENT_UPDATED)
        .build();

    public static final Supplier<SubmodelElementList> ELEMENT_LIST = () -> new DefaultSubmodelElementList.Builder()
        .idShort("list1")
            .value(PROPERTY_STRING.get())
            .value(RANGE_DOUBLE.get())
            .value(ENTITY.get())
            .value(ANNOTATED_RELATIONSHIP_ELEMENT.get())
        .build();

    public static final SubmodelElementList ELEMENT_LIST_UPDATED = new DefaultSubmodelElementList.Builder()
        .idShort("list1")
        .value(PROPERTY_STRING_UPDATED)
        .value(RANGE_DOUBLE_UPDATED)
        .value(ENTITY_UPDATED)
        .value(ANNOTATED_RELATIONSHIP_ELEMENT_UPDATED)
        .build();

    public static final Supplier<Submodel> SUBMODEL = () -> new DefaultSubmodel.Builder()
        .category("category")
        .idShort("submodel1")
        .kind(ModellingKind.INSTANCE)
            .submodelElements(PROPERTY_STRING.get())
            .submodelElements(RANGE_DOUBLE.get())
            .submodelElements(ELEMENT_COLLECTION.get())
        .submodelElements(new DefaultOperation.Builder()
            .idShort("operation1")
            .build())
        .build();

    public static final Submodel SUBMODEL_UPDATED = new DefaultSubmodel.Builder()
        .category("category")
        .idShort("submodel1")
        .kind(ModellingKind.INSTANCE)
        .submodelElements(PROPERTY_STRING_UPDATED)
        .submodelElements(RANGE_DOUBLE_UPDATED)
        .submodelElements(ELEMENT_COLLECTION_UPDATED)
        .submodelElements(new DefaultOperation.Builder()
            .idShort("operation1")
            .build())
        .build();
}
