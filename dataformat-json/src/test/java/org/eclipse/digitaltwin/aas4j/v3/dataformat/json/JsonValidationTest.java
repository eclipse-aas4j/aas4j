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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class JsonValidationTest {

  private static JsonSchemaValidator validator;

  @BeforeClass
  public static void prepareValidator() throws IOException {
    validator = new JsonSchemaValidator();
  }

  @Test
  @Parameters({
    "src/test/resources/Environment-Empty.json",
    "src/test/resources/Example-Simple.json",
    "src/test/resources/MotorAAS.json",
    "src/test/resources/MotorAAS-Reduced.json",
    "src/test/resources/Example-Full.json"
  })
  public void validateValidJson(String file) throws IOException {
    assertTrue(validate(file).isEmpty());
  }

  @Test
  @Parameters({"src/test/resources/Environment-Invalid.json"})
  public void validateInvalidJson(String file) throws IOException {
    assertFalse(validate(file).isEmpty());
  }

  private Set<String> validate(String file) throws IOException {
    String json = new String(Files.readAllBytes(Paths.get(file)));
    Set<String> result = validator.validateSchema(json);
    System.out.println("Validating: " + file);
    result.forEach(System.out::println);
    return result;
  }
}
