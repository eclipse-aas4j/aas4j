package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.valueonly;

import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.EntityType;
import org.eclipse.digitaltwin.aas4j.v3.model.Range;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEntity;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRange;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;
import org.eclipse.digitaltwin.aas4j.v3.model.ModellingKind;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementCollection;

public class TestData {
    public static final Entity ENTITY = new DefaultEntity.Builder()
        .idShort("entity1")
        .entityType(EntityType.SELF_MANAGED_ENTITY)
        .globalAssetId("Global Asset Id")
        .statements(new DefaultProperty.Builder()
            .idShort("MaxRotationSpeed")
            .valueType(DataTypeDefXsd.INT)
            .value("5000")
            .build())
        .build();

    public static final Property PROPERTY_STRING = new DefaultProperty.Builder()
        .category("category")
        .idShort("propString")
        .value("foo")
        .build();
    public static final Range RANGE_DOUBLE = new DefaultRange.Builder()
        .idShort("rangeDouble")
        .valueType(DataTypeDefXsd.DOUBLE)
        .min("3.0")
        .max("5.0")
        .build();
    public static final SubmodelElementCollection ELEMENT_COLLECTION = new DefaultSubmodelElementCollection.Builder()
        .idShort("collection1")
        .value(PROPERTY_STRING)
        .value(RANGE_DOUBLE)
        .value(ENTITY)
        .build();

    public static final Submodel SUBMODEL = new DefaultSubmodel.Builder()
        .category("category")
        .idShort("submodel1")
        .kind(ModellingKind.INSTANCE)
        .submodelElements(PROPERTY_STRING)
        .submodelElements(RANGE_DOUBLE)
        .submodelElements(ELEMENT_COLLECTION)
        .submodelElements(new DefaultOperation.Builder()
            .idShort("operation1")
            .build())
        .build();
}
