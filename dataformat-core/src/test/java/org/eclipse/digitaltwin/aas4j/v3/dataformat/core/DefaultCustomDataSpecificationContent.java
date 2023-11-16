package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;

import java.util.Objects;

/**
 * This interface is needed to test the serialization/deserialization of a custom data specification content.
 * See: https://github.com/eclipse-aas4j/aas4j/issues/196
 */

public class DefaultCustomDataSpecificationContent implements CustomDataSpecificationContent {
    private LangStringNameType name;
    private String text;
    private int pages;

    public LangStringNameType getName() {
        return name;
    }

    public void setName(LangStringNameType name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPages() {
        return pages;
    };
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.text, this.pages);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultCustomDataSpecificationContent other = (DefaultCustomDataSpecificationContent) obj;
            return Objects.equals(this.name, other.name) &&
                    Objects.equals(this.text, other.text) &&
                    Objects.equals(this.pages, other.pages);
        }
    }

    /**
     * This builder class can be used to construct a DefaultCustomDataSpecificationContent.
     */
    public static class Builder extends CustomDataSpecificationContentBuilder<DefaultCustomDataSpecificationContent,
            Builder> {

        @Override
        protected DefaultCustomDataSpecificationContent.Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultCustomDataSpecificationContent newBuildingInstance() {
            return new DefaultCustomDataSpecificationContent();
        }
    }
}