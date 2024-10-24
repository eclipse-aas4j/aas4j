package org.eclipse.digitaltwin.aas4j.v3.model;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.CustomSubProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.junit.Test;

public class ModelTest {

    void fillProperty(Property object) {
        object.setIdShort("test");
        object.setValueType(DataTypeDefXsd.STRING);
    }

    @Test
    public void testPropertyEqualityWithSubclass() {
        Property defaultProperty = new DefaultProperty();
        Property customProperty = new CustomSubProperty();
        fillProperty(customProperty);
        fillProperty(defaultProperty);

        //object should be equal to itself
        assert defaultProperty.equals(defaultProperty);
        //defaultProperty should be equal with customProperty
        assert defaultProperty.equals(customProperty);
        assert customProperty.equals(customProperty);
        assert customProperty.equals(defaultProperty);
        //hashCode implementation should be consistent
        assert customProperty.hashCode() == defaultProperty.hashCode();
    }
}
