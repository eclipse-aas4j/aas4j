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

/** Represents security attributes in the Asset Administration Shell. */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultSecurityAttributeObject.class)})
public interface SecurityAttributeObject {

  /**
   * The type of the security attribute.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/SecurityAttribute/type
   *
   * @return Returns the SecurityTypeEnum for the property type.
   */
  @IRI("https://admin-shell.io/aas/3/1/SecurityAttribute/type")
  SecurityTypeEnum getType();

  /**
   * The type of the security attribute.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/SecurityAttribute/type
   *
   * @param type desired value for the property type.
   */
  void setType(SecurityTypeEnum type);

  /**
   * The key of the security attribute.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/SecurityAttribute/key
   *
   * @return Returns the String for the property key.
   */
  @IRI("https://admin-shell.io/aas/3/1/SecurityAttribute/key")
  String getKey();

  /**
   * The key of the security attribute.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/SecurityAttribute/key
   *
   * @param key desired value for the property key.
   */
  void setKey(String key);

  /**
   * The value of the security attribute.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/SecurityAttribute/value
   *
   * @return Returns the String for the property value.
   */
  @IRI("https://admin-shell.io/aas/3/1/SecurityAttribute/value")
  String getValue();

  /**
   * The value of the security attribute.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/SecurityAttribute/value
   *
   * @param value desired value for the property value.
   */
  void setValue(String value);
}
