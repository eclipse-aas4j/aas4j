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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultValueReferencePair;

/**
 * A value reference pair within a value list. Each value has a global unique id defining its
 * semantic.
 */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultValueReferencePair.class)})
public interface ValueReferencePair {

  /**
   * The value of the referenced concept definition of the value in 'valueId'.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/ValueReferencePair/value
   *
   * @return Returns the String for the property value.
   */
  @IRI("https://admin-shell.io/aas/3/0/ValueReferencePair/value")
  String getValue();

  /**
   * The value of the referenced concept definition of the value in 'valueId'.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/ValueReferencePair/value
   *
   * @param value desired value for the property value.
   */
  void setValue(String value);

  /**
   * Global unique id of the value.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/ValueReferencePair/valueId
   *
   * @return Returns the Reference for the property valueId.
   */
  @IRI("https://admin-shell.io/aas/3/0/ValueReferencePair/valueId")
  Reference getValueId();

  /**
   * Global unique id of the value.
   *
   * <p>More information under https://admin-shell.io/aas/3/0/ValueReferencePair/valueId
   *
   * @param valueId desired value for the property valueId.
   */
  void setValueId(Reference valueId);
}
