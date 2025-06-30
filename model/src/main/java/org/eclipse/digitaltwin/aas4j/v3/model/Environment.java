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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;

/** Container for the sets of different identifiables. */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultEnvironment.class)})
public interface Environment {

  /**
   * Asset administration shell
   *
   * <p>More information under https://admin-shell.io/aas/3/0/Environment/assetAdministrationShells
   *
   * @return Returns the List of AssetAdministrationShells for the property
   *     assetAdministrationShells.
   */
  @IRI("https://admin-shell.io/aas/3/0/Environment/assetAdministrationShells")
  List<AssetAdministrationShell> getAssetAdministrationShells();

  /**
   * Asset administration shell
   *
   * <p>More information under https://admin-shell.io/aas/3/0/Environment/assetAdministrationShells
   *
   * @param assetAdministrationShells desired value for the property assetAdministrationShells.
   */
  void setAssetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells);

  /**
   * Submodel
   *
   * <p>More information under https://admin-shell.io/aas/3/0/Environment/submodels
   *
   * @return Returns the List of Submodels for the property submodels.
   */
  @IRI("https://admin-shell.io/aas/3/0/Environment/submodels")
  List<Submodel> getSubmodels();

  /**
   * Submodel
   *
   * <p>More information under https://admin-shell.io/aas/3/0/Environment/submodels
   *
   * @param submodels desired value for the property submodels.
   */
  void setSubmodels(List<Submodel> submodels);

  /**
   * Concept description
   *
   * <p>More information under https://admin-shell.io/aas/3/0/Environment/conceptDescriptions
   *
   * @return Returns the List of ConceptDescriptions for the property conceptDescriptions.
   */
  @IRI("https://admin-shell.io/aas/3/0/Environment/conceptDescriptions")
  List<ConceptDescription> getConceptDescriptions();

  /**
   * Concept description
   *
   * <p>More information under https://admin-shell.io/aas/3/0/Environment/conceptDescriptions
   *
   * @param conceptDescriptions desired value for the property conceptDescriptions.
   */
  void setConceptDescriptions(List<ConceptDescription> conceptDescriptions);
}
