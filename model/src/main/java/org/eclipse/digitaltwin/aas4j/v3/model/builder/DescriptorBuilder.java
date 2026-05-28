/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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

package org.eclipse.digitaltwin.aas4j.v3.model.builder;

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.Descriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;

public abstract class DescriptorBuilder<T extends Descriptor, B extends DescriptorBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

  /**
   * This function allows setting a value for description
   *
   * @param descriptions desired value to be set
   * @return Builder object with new value for description
   */
  public B description(List<LangStringTextType> descriptions) {
    getBuildingInstance().setDescription(descriptions);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List description
   *
   * @param description desired value to be added
   * @return Builder object with new value for description
   */
  public B description(LangStringTextType description) {
    getBuildingInstance().getDescription().add(description);
    return getSelf();
  }

  /**
   * This function allows setting a value for displayName
   *
   * @param displayNames desired value to be set
   * @return Builder object with new value for displayName
   */
  public B displayName(List<LangStringNameType> displayNames) {
    getBuildingInstance().setDisplayName(displayNames);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List displayName
   *
   * @param displayName desired value to be added
   * @return Builder object with new value for displayName
   */
  public B displayName(LangStringNameType displayName) {
    getBuildingInstance().getDisplayName().add(displayName);
    return getSelf();
  }

  /**
   * This function allows setting a value for extensions
   *
   * @param extensions desired value to be set
   * @return Builder object with new value for extensions
   */
  public B extensions(List<Extension> extensions) {
    getBuildingInstance().setExtensions(extensions);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List extensions
   *
   * @param extensions desired value to be added
   * @return Builder object with new value for extensions
   */
  public B extensions(Extension extensions) {
    getBuildingInstance().getExtensions().add(extensions);
    return getSelf();
  }
}
