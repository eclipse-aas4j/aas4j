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
import org.eclipse.digitaltwin.aas4j.v3.model.PackageDescription;

public abstract class PackageDescriptionBuilder<
        T extends PackageDescription, B extends PackageDescriptionBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

  /**
   * This function allows setting a value for items
   *
   * @param items desired value to be set
   * @return Builder object with new value for items
   */
  public B items(List<String> items) {
    getBuildingInstance().setItems(items);
    return getSelf();
  }

  /**
   * This function allows adding a value to the List items
   *
   * @param items desired value to be added
   * @return Builder object with new value for items
   */
  public B items(String items) {
    getBuildingInstance().getItems().add(items);
    return getSelf();
  }

  /**
   * This function allows setting a value for packageId
   *
   * @param packageId desired value to be set
   * @return Builder object with new value for packageId
   */
  public B packageId(String packageId) {
    getBuildingInstance().setPackageId(packageId);
    return getSelf();
  }
}
