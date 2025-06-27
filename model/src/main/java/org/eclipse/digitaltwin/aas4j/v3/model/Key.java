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

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;

/** A key is a reference to an element by its ID. */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultKey.class)})
public interface Key {

  /**
   * Denotes which kind of entity is referenced.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/Key/type
   *
   * @return Returns the KeyTypes for the property type.
   */
  @IRI("https://admin-shell.io/aas/3/1/Key/type")
  KeyTypes getType();

  /**
   * Denotes which kind of entity is referenced.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/Key/type
   *
   * @param type desired value for the property type.
   */
  void setType(KeyTypes type);

  /**
   * The key value, for example an IRDI or an URI
   *
   * <p>More information under https://admin-shell.io/aas/3/1/Key/value
   *
   * @return Returns the String for the property value.
   */
  @IRI("https://admin-shell.io/aas/3/1/Key/value")
  String getValue();

  /**
   * The key value, for example an IRDI or an URI
   *
   * <p>More information under https://admin-shell.io/aas/3/1/Key/value
   *
   * @param value desired value for the property value.
   */
  void setValue(String value);
}
