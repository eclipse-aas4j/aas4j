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


/**  
*/
@IRI("aas:DataTypeIec61360")
public enum DataTypeIec61360 {

    /**
     * values containing the content of a file. Values may be binaries.
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/Blob")
    BLOB,

    /**
     * values representing truth of logic or Boolean algebra (TRUE, FALSE)
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/Boolean")
    BOOLEAN,

    /**
     * values containing a calendar date, conformant to ISO 8601:2004 Format yyyy-mm-dd Example from IEC
     * 61360-1:2017: "1999-05-31" is the [DATE] representation of: "31 May 1999".
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/Date")
    DATE,

    /**
     * values containing an address to a file. The values are of type URI and can represent an absolute
     * or relative path.
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/File")
    FILE,

    /**
     * Values containing string with any sequence of characters, using the syntax of HTML5 (see W3C
     * Recommendation 28:2014)
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/Html")
    HTML,

    /**
     * values containing values of type INTEGER but are no currencies or measures
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/IntegerCount")
    INTEGER_COUNT,

    /**
     * values containing values of type INTEGER that are currencies
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/IntegerCurrency")
    INTEGER_CURRENCY,

    /**
     * values containing values that are measure of type INTEGER. In addition such a value comes with a
     * physical unit.
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/IntegerMeasure")
    INTEGER_MEASURE,

    /**
     * values conforming to ISO/IEC 11179 series global identifier sequences
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/Irdi")
    IRDI,

    /**
     * values containing values of type STRING conformant to Rfc 3987
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/Iri")
    IRI,

    /**
     * values containing values of type rational
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/Rational")
    RATIONAL,

    /**
     * values containing values of type rational. In addition such a value comes with a physical unit.
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/RationalMeasure")
    RATIONAL_MEASURE,

    /**
     * values containing numbers that can be written as a terminating or non-terminating decimal; a
     * rational or irrational number but are no currencies or measures
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/RealCount")
    REAL_COUNT,

    /**
     * values containing values of type REAL that are currencies
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/RealCurrency")
    REAL_CURRENCY,

    /**
     * values containing values that are measures of type REAL. In addition such a value comes with a
     * physical unit.
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/RealMeasure")
    REAL_MEASURE,

    /**
     * values consisting of sequence of characters but cannot be translated into other languages
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/String")
    STRING,

    /**
     * values containing string but shall be represented as different string in different languages
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/StringTranslatable")
    STRING_TRANSLATABLE,

    /**
     * values containing a time, conformant to ISO 8601:2004 but restricted to what is allowed in the
     * corresponding type in xml.
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/Time")
    TIME,

    /**
     * values containing a time, conformant to ISO 8601:2004 but restricted to what is allowed in the
     * corresponding type in xml.
     */
    @IRI("https://admin-shell.io/aas/3/0/DataTypeIec61360/Timestamp")
    TIMESTAMP;

}
