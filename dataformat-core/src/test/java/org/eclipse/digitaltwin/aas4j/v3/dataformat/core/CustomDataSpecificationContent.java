package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;

/**
 * This interface is needed to test the serialization/deserialization of a custom data specification content.
 * See: https://github.com/eclipse-aas4j/aas4j/issues/196
 */

public interface CustomDataSpecificationContent extends DataSpecificationContent {
    LangStringNameType getName();
    void setName(LangStringNameType name);
    String getText();
    void setText(String text);
    int getPages();
    void setPages(int pages);
}
