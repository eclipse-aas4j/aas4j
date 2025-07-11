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

import org.eclipse.digitaltwin.aas4j.v3.model.builder.ExtendableBuilder;

/**
 * This interface is needed to test the serialization/deserialization of a custom data specification
 * content.
 *
 * <p>See: https://github.com/eclipse-aas4j/aas4j/issues/196
 */
public abstract class DummyDataSpecificationBuilder<
        T extends DummyDataSpecification, B extends DummyDataSpecificationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

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
