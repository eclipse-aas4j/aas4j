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
package org.eclipse.digitaltwin.aas4j.v3.model;

import java.util.Objects;

/**
 * This interface is needed to test the serialization/deserialization of a custom data specification
 * content. See: https://github.com/eclipse-aas4j/aas4j/issues/196
 */
public class DefaultDummyDataSpecification implements DummyDataSpecification {
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
  }
  ;

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
      DefaultDummyDataSpecification other = (DefaultDummyDataSpecification) obj;
      return Objects.equals(this.name, other.name)
          && Objects.equals(this.text, other.text)
          && Objects.equals(this.pages, other.pages);
    }
  }

  /** This builder class can be used to construct a DefaultCustomDataSpecificationContent. */
  public static class Builder
      extends DummyDataSpecificationBuilder<DefaultDummyDataSpecification, Builder> {

    @Override
    protected DefaultDummyDataSpecification.Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultDummyDataSpecification newBuildingInstance() {
      return new DefaultDummyDataSpecification();
    }
  }
}
