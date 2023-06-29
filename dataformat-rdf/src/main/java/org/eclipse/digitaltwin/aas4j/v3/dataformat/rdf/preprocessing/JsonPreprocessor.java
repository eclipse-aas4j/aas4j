/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.preprocessing;

import java.io.IOException;

/**
 * Interface for JSON-LD preprocessors which should transform JSON-LD inputs
 * before they are deserialized by Jackson.
 *
 * Implementations used at the same time must not interfere with each other.
 */
public interface JsonPreprocessor {

    /**
     * preprocessing method
     * @param input of the transformation, the original JSON-LD
     * @return the transformation´s result
     * @throws IOException if preprocessing fails, e.g. because the input is not valid RDF
     */
    public String preprocess(String input) throws IOException;

    /**
     * specify wheter the transformation's result should be validated to
     * be parsable by RDF4j
     * @param validate enable/disable switch
     */
    public void enableRDFValidation(boolean validate);
}
