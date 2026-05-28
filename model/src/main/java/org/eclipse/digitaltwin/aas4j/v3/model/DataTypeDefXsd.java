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

/** Enumeration listing all XSD anySimpleTypes */
@IRI("aas:DataTypeDefXsd")
public enum DataTypeDefXsd {

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/AnyUri")
  ANY_URI,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Base64Binary")
  BASE64BINARY,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Boolean")
  BOOLEAN,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Byte")
  BYTE,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Date")
  DATE,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/DateTime")
  DATE_TIME,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Decimal")
  DECIMAL,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Double")
  DOUBLE,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Duration")
  DURATION,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Float")
  FLOAT,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GDay")
  GDAY,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GMonth")
  GMONTH,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GMonthDay")
  GMONTH_DAY,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GYear")
  GYEAR,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/GYearMonth")
  GYEAR_MONTH,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/HexBinary")
  HEX_BINARY,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Int")
  INT,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Integer")
  INTEGER,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Long")
  LONG,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/NegativeInteger")
  NEGATIVE_INTEGER,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/NonNegativeInteger")
  NON_NEGATIVE_INTEGER,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/NonPositiveInteger")
  NON_POSITIVE_INTEGER,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/PositiveInteger")
  POSITIVE_INTEGER,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Short")
  SHORT,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/String")
  STRING,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/Time")
  TIME,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/UnsignedByte")
  UNSIGNED_BYTE,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/UnsignedInt")
  UNSIGNED_INT,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/UnsignedLong")
  UNSIGNED_LONG,

  /** */
  @IRI("https://admin-shell.io/aas/3/0/DataTypeDefXsd/UnsignedShort")
  UNSIGNED_SHORT;
}
