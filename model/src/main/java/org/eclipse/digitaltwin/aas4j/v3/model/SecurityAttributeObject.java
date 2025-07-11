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

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSecurityAttributeObject;

/** */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultSecurityAttributeObject.class)})
public interface SecurityAttributeObject {

  /**
   * More information under https://admin-shell.io/aas/3/0/SecurityAttributeObject/type
   *
   * @return Returns the SecurityTypeEnum for the property type.
   */
  @IRI("https://admin-shell.io/aas/3/0/SecurityAttributeObject/type")
  SecurityTypeEnum getType();

  /**
   * More information under https://admin-shell.io/aas/3/0/SecurityAttributeObject/type
   *
   * @param type desired value for the property type.
   */
  void setType(SecurityTypeEnum type);

  /**
   * More information under https://admin-shell.io/aas/3/0/SecurityAttributeObject/key
   *
   * @return Returns the String for the property key.
   */
  @IRI("https://admin-shell.io/aas/3/0/SecurityAttributeObject/key")
  String getKey();

  /**
   * More information under https://admin-shell.io/aas/3/0/SecurityAttributeObject/key
   *
   * @param key desired value for the property key.
   */
  void setKey(String key);

  /**
   * More information under https://admin-shell.io/aas/3/0/SecurityAttributeObject/value
   *
   * @return Returns the String for the property value.
   */
  @IRI("https://admin-shell.io/aas/3/0/SecurityAttributeObject/value")
  String getValue();

  /**
   * More information under https://admin-shell.io/aas/3/0/SecurityAttributeObject/value
   *
   * @param value desired value for the property value.
   */
  void setValue(String value);
}
