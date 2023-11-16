package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.ExtendableBuilder;

/**
 * This interface is needed to test the serialization/deserialization of a custom data specification content.
 * See: https://github.com/eclipse-aas4j/aas4j/issues/196
 */
public abstract class CustomDataSpecificationContentBuilder<T extends CustomDataSpecificationContent,
    B extends CustomDataSpecificationContentBuilder<T, B>> extends ExtendableBuilder<T, B> {

    public B name(LangStringNameType name) {
        getBuildingInstance().setName(name);
        return getSelf();
    }

    public B text(String text) {
        getBuildingInstance().setText(text);
        return getSelf();
    }

    public B pages(int pages) {
        getBuildingInstance().setPages(pages);
        return getSelf();
    }
}
