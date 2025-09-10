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

/** Element that can have a semantic definition plus some supplemental semantic definitions. */
@KnownSubtypes({
  @KnownSubtypes.Type(value = SpecificAssetId.class),
  @KnownSubtypes.Type(value = Submodel.class),
  @KnownSubtypes.Type(value = Extension.class),
  @KnownSubtypes.Type(value = SubmodelElement.class),
  @KnownSubtypes.Type(value = Qualifier.class)
})
public interface HasSemantics {

  /**
   * Identifier of the semantic definition of the element. It is called semantic ID of the element
   * or also main semantic ID of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/HasSemantics/semanticId
   *
   * @return Returns the Reference for the property semanticId.
   */
  @IRI("https://admin-shell.io/aas/3/1/HasSemantics/semanticId")
  Reference getSemanticId();

  /**
   * Identifier of the semantic definition of the element. It is called semantic ID of the element
   * or also main semantic ID of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/HasSemantics/semanticId
   *
   * @param semanticId desired value for the property semanticId.
   */
  void setSemanticId(Reference semanticId);

  /**
   * Identifier of a supplemental semantic definition of the element. It is called supplemental
   * semantic ID of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/HasSemantics/supplementalSemanticIds
   *
   * @return Returns the List of References for the property supplementalSemanticIds.
   */
  @IRI("https://admin-shell.io/aas/3/1/HasSemantics/supplementalSemanticIds")
  List<Reference> getSupplementalSemanticIds();

  /**
   * Identifier of a supplemental semantic definition of the element. It is called supplemental
   * semantic ID of the element.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/HasSemantics/supplementalSemanticIds
   *
   * @param supplementalSemanticIds desired value for the property supplementalSemanticIds.
   */
  void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds);
}
