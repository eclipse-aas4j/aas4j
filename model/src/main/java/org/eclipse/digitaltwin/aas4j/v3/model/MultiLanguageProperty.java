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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultMultiLanguageProperty;

/** A property is a data element that has a multi-language value. */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultMultiLanguageProperty.class)})
public interface MultiLanguageProperty extends DataElement {

  /**
   * The value of the property instance.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/MultiLanguageProperty/value
   *
   * @return Returns the List of LangStringTextTypes for the property value.
   */
  @IRI("https://admin-shell.io/aas/3/0/MultiLanguageProperty/value")
  List<LangStringTextType> getValue();

  /**
   * The value of the property instance.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/MultiLanguageProperty/value
   *
   * @param values desired value for the property value.
   */
  void setValue(List<LangStringTextType> values);

  /**
   * Reference to the global unique ID of a coded value.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/MultiLanguageProperty/valueId
   *
   * @return Returns the Reference for the property valueId.
   */
  @IRI("https://admin-shell.io/aas/3/0/MultiLanguageProperty/valueId")
  Reference getValueId();

  /**
   * Reference to the global unique ID of a coded value.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/MultiLanguageProperty/valueId
   *
   * @param valueId desired value for the property valueId.
   */
  void setValueId(Reference valueId);
}
