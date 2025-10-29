package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.mixins;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Jackson mixin for LangStringTextType. Ensures deterministic XML element order: language → text.
 */
@JsonPropertyOrder({"language", "text"})
public interface LangStringTextTypeMixin {}
