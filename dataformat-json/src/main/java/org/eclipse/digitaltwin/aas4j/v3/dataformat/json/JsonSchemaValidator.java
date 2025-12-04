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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.Error;
import com.networknt.schema.Schema;
import com.networknt.schema.SchemaRegistry;
import com.networknt.schema.SpecificationVersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SchemaValidator;

/**
 * Class for validating a serialized instance of AssetAdministrationShellEnvironment against a
 * json-schema.
 */
public class JsonSchemaValidator implements SchemaValidator {

  private static final String SCHEMA = "/aas.json";
  private final ObjectMapper mapper = new ObjectMapper();

  public JsonSchemaValidator() {}

  /**
   * validates against default schema
   *
   * @param serialized AssetAdministrationShellEnvironment, serialized as json string
   * @return Set of messages to display validation results
   */
  @Override
  public List<String> validateSchema(String serialized) {
    try {
      return validateSchema(serialized, loadDefaultSchema());
    } catch (IOException | URISyntaxException e) {
      return List.of(e.getMessage());
    }
  }

  /**
   * validates against custom schema
   *
   * @param serialized AssetAdministrationShellEnvironment, serialized as json string
   * @param serializedSchema Custom json-schema serialized as String that must extend the default
   *     aas-schema
   * @return Set of messages to display validation results
   */
  public List<String> validateSchema(String serialized, String serializedSchema) {
    try {
      JsonNode schemaRootNode = mapper.readTree(serializedSchema);
      SchemaRegistry schemaRegistry =
          SchemaRegistry.withDefaultDialect(SpecificationVersion.DRAFT_2019_09);
      Schema schema = schemaRegistry.getSchema(schemaRootNode);
      JsonNode node = mapper.readTree(serialized);
      List<Error> validationMessages = schema.validate(node);
      return generalizeValidationMessagesAsStringSet(validationMessages);
    } catch (JsonProcessingException e) {
      return List.of(e.getMessage());
    }
  }

  private String loadDefaultSchema() throws IOException, URISyntaxException {
    return new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(SCHEMA)))
        .lines()
        .collect(Collectors.joining("\n"));
  }

  private List<String> generalizeValidationMessagesAsStringSet(List<Error> messages) {
    return messages.stream().map(Error::getMessage).collect(Collectors.toList());
  }
}
