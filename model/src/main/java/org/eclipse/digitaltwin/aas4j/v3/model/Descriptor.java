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

package org.eclipse.digitaltwin.aas4j.v3.model;

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDescriptor;

/** */
@KnownSubtypes({
  @KnownSubtypes.Type(value = DefaultDescriptor.class),
  @KnownSubtypes.Type(value = AssetAdministrationShellDescriptor.class),
  @KnownSubtypes.Type(value = SubmodelDescriptor.class)
})
public interface Descriptor {

  /**
   * More information under https://admin-shell.io/aas/3/1/Descriptor/description
   *
   * @return Returns the List of LangStringTextTypes for the property description.
   */
  @IRI("https://admin-shell.io/aas/3/1/Descriptor/description")
  List<LangStringTextType> getDescription();

  /**
   * More information under https://admin-shell.io/aas/3/1/Descriptor/description
   *
   * @param description desired value for the property description.
   */
  void setDescription(List<LangStringTextType> description);

  /**
   * More information under https://admin-shell.io/aas/3/1/Descriptor/displayName
   *
   * @return Returns the List of LangStringNameTypes for the property displayName.
   */
  @IRI("https://admin-shell.io/aas/3/1/Descriptor/displayName")
  List<LangStringNameType> getDisplayName();

  /**
   * More information under https://admin-shell.io/aas/3/1/Descriptor/displayName
   *
   * @param displayName desired value for the property displayName.
   */
  void setDisplayName(List<LangStringNameType> displayName);

  /**
   * More information under https://admin-shell.io/aas/3/1/Descriptor/extensions
   *
   * @return Returns the List of Extensions for the property extensions.
   */
  @IRI("https://admin-shell.io/aas/3/1/Descriptor/extensions")
  List<Extension> getExtensions();

  /**
   * More information under https://admin-shell.io/aas/3/1/Descriptor/extensions
   *
   * @param extensions desired value for the property extensions.
   */
  void setExtensions(List<Extension> extensions);
}
