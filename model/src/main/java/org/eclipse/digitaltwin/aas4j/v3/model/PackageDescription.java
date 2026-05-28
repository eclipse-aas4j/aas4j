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

package org.eclipse.digitaltwin.aas4j.v3.model;

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultPackageDescription;

/** */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultPackageDescription.class)})
public interface PackageDescription {

  /**
   * More information under https://admin-shell.io/aas/3/0/PackageDescription/items
   *
   * @return Returns the List of Strings for the property items.
   */
  @IRI("https://admin-shell.io/aas/3/0/PackageDescription/items")
  List<String> getItems();

  /**
   * More information under https://admin-shell.io/aas/3/0/PackageDescription/items
   *
   * @param items desired value for the property items.
   */
  void setItems(List<String> items);

  /**
   * More information under https://admin-shell.io/aas/3/0/PackageDescription/packageId
   *
   * @return Returns the String for the property packageId.
   */
  @IRI("https://admin-shell.io/aas/3/0/PackageDescription/packageId")
  String getPackageId();

  /**
   * More information under https://admin-shell.io/aas/3/0/PackageDescription/packageId
   *
   * @param packageId desired value for the property packageId.
   */
  void setPackageId(String packageId);
}
