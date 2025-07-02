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

/** The value of a qualifiable element may be further qualified by one or more qualifiers. */
@KnownSubtypes({
  @KnownSubtypes.Type(value = Submodel.class),
  @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface Qualifiable {

  /**
   * Additional qualification of a qualifiable element.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/Qualifiable/qualifiers
   *
   * @return Returns the List of Qualifiers for the property qualifiers.
   */
  @IRI("https://admin-shell.io/aas/3/1/Qualifiable/qualifiers")
  List<Qualifier> getQualifiers();

  /**
   * Additional qualification of a qualifiable element.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/Qualifiable/qualifiers
   *
   * @param qualifiers desired value for the property qualifiers.
   */
  void setQualifiers(List<Qualifier> qualifiers);
}
