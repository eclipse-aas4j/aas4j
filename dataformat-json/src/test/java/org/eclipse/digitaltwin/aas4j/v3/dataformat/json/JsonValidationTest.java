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

import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Stream;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class JsonValidationTest {

  private static JsonSchemaValidator validator;
  private static final String TEST_FILES_DIR = "target/test-classes/examples";

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
  @Parameters({
    "src/test/resources/AssetAdministrationShell-WithAssetInformation.json",
    "src/test/resources/AssetAdministrationShellDescriptor.json",
    "src/test/resources/ConceptDescription-DataSpecificationPhysicalUnit.json",
    "src/test/resources/Environment-Empty.json",
    "src/test/resources/Example-Full.json",
    "src/test/resources/Example-Simple.json",
    "src/test/resources/MotorAAS.json",
    "src/test/resources/MotorAAS-Reduced.json",
    "src/test/resources/OperationRequest.json",
    "src/test/resources/Submodel.json",
    "src/test/resources/SubmodelDescriptor.json",
    "src/test/resources/SubmodelElement.json",
    "src/test/resources/SubmodelElementCollection.json",
    "src/test/resources/SubmodelElementList.json",
    "src/test/resources/SubmodelElementList-Empty.json",
  })
  public void validateValidAasJson(String file) throws IOException {
    assertTrue(validate(file).isEmpty());
  }

  @Test
  @Parameters(method = "fileProvider")
  @TestCaseName("{0}")
  public void validateJsonExamples(String filePath)
      throws DeserializationException, SerializationException, IOException {
    String initialJson = new String(Files.readAllBytes(Paths.get(filePath)));
    Set<String> initialFileValidationError = validateSerializedJson(initialJson);

    Environment environment = new JsonDeserializer().read(initialJson, Environment.class);
    String serializedEnv = new JsonSerializer().write(environment);

    Set<String> serializedEnvValidationError = validateSerializedJson(serializedEnv);

    assumeFalse(
        "Skipping this test because there are same validation errors for the initial file: "
            + filePath,
        !initialFileValidationError.isEmpty()
            && initialFileValidationError.containsAll(serializedEnvValidationError)
            && serializedEnvValidationError.containsAll(initialFileValidationError));

    assertTrue(serializedEnvValidationError.isEmpty());
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

  private Set<String> validateSerializedJson(String serializedEnv) {
    Set<String> result = validator.validateSchema(serializedEnv);
    result.forEach(System.out::println);
    return result;
  }

  // This method supplies the file paths of aas-spec-metamodel JSON examples files from the test
  // directory to the above test.
  private static Object[] fileProvider() {
    try (Stream<Path> paths = Files.walk(Paths.get(TEST_FILES_DIR))) {
      return paths
          .filter(Files::isRegularFile)
          .filter(p -> p.toString().endsWith(".json"))
          .map(Path::toAbsolutePath)
          .map(Path::toString)
          .toArray();
    } catch (IOException e) {
      e.printStackTrace();
      return new String[0];
    }
  }
}
