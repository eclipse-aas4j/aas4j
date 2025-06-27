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

/** Enumeration for Security Type. */
@IRI("aas:SecurityTypeEnum")
public enum SecurityTypeEnum {

  /** Indicates that this security type enum value means no security is applied. */
  @IRI("https://admin-shell.io/aas/3/1/SecurityTypeEnum/None")
  NONE,

  /** Indicates that this security type enum value refers to RFC TLSA-based security. */
  @IRI("https://admin-shell.io/aas/3/1/SecurityTypeEnum/Rfc_Tlsa")
  RFC_TLSA,

  /** Indicates that this security type enum value refers to W3C DID-based security. */
  @IRI("https://admin-shell.io/aas/3/1/SecurityTypeEnum/W3c_Did")
  W3C_DID;
}
