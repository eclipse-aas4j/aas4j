/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.validator.ShaclValidator;
import org.eclipse.digitaltwin.aas4j.v3.model.validator.ValidationException;
import java.io.IOException;
import org.apache.jena.shacl.ValidationReport;
import org.apache.jena.shacl.lib.ShLib;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidateModelsTest {

    private static final Logger log = LoggerFactory.getLogger(ValidateModelsTest.class);

    @BeforeClass
    public static void init() {
        ShaclValidator.getInstance().initialize();
    }

    @Test
    public void validateAASFull() throws ValidationException, IOException {
        validate(AASFull.ENVIRONMENT);
    }

    @Test
    public void validateAASSimple() throws ValidationException, IOException {
        validate(AASSimple.ENVIRONMENT);
    }

    private void validate(Environment aasEnv) throws ValidationException, IOException {
        ValidationReport report = ShaclValidator.getInstance().validateGetReport(aasEnv);
        ShLib.printReport(report);
        System.out.println("Report entry size: " + report.getEntries().size());
        assertTrue(report.conforms());
    }
}
