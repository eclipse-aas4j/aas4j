/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import java.util.Objects;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.LangStringNameTypeBuilder;

/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType
 *
 * <p>String with length 128 maximum and minimum 1 characters and with language tags
 */
@IRI("aas:LangStringNameType")
public class DefaultLangStringNameType implements LangStringNameType {

  @IRI("https://admin-shell.io/aas/3/1/AbstractLangString/language")
  protected String language;

  @IRI("https://admin-shell.io/aas/3/1/AbstractLangString/text")
  protected String text;

  public DefaultLangStringNameType() {}

  @Override
  public int hashCode() {
    return Objects.hash(this.language, this.text);
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
      DefaultLangStringNameType other = (DefaultLangStringNameType) obj;
      return Objects.equals(this.language, other.language) && Objects.equals(this.text, other.text);
    }
  }

  @Override
  public String toString() {
    return "DefaultLangStringNameType{"
        + "language='"
        + language
        + '\''
        + ", text='"
        + text
        + '\''
        + '}';
  }

  @Override
  public String getLanguage() {
    return language;
  }

  @Override
  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public String getText() {
    return text;
  }

  @Override
  public void setText(String text) {
    this.text = text;
  }

  /** This builder class can be used to construct a DefaultLangStringNameType bean. */
  public static class Builder
      extends LangStringNameTypeBuilder<DefaultLangStringNameType, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultLangStringNameType newBuildingInstance() {
      return new DefaultLangStringNameType();
    }
  }
}
