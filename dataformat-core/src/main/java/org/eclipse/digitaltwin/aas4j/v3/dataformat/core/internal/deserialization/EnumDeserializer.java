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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.deserialization;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;

/**
 * Deserializes enum values converting element names from UpperCamelCase to SCREAMING_SNAKE_CASE
 *
 * @param <T> Type of enum to deserialize
 */
public class EnumDeserializer<T extends Enum<T>> extends ValueDeserializer<T> {

  protected final Class<T> type;

  public EnumDeserializer(Class<T> type) {
    this.type = type;
  }

  @Override
  public T deserialize(JsonParser parser, DeserializationContext context) throws JacksonException {

    String value = parser.getString();

    if (value.startsWith("xs:")) {
      value = value.substring(3);
      value = value.substring(0, 1).toUpperCase() + value.substring(1);
    }

    return Enum.valueOf(type, deserializeEnumName(value));
  }

  /**
   * Translates an enum value from CamelCase to SCREAMING_SNAKE_CASE
   *
   * @param input input name in CamelCase
   * @return name in SCREAMING_SNAKE_CASE
   */
  public static String deserializeEnumName(String input) {
    String result = "";
    if (input == null || input.isEmpty()) {
      return result;
    }
    result += Character.toUpperCase(input.charAt(0));
    for (int i = 1; i < input.length(); i++) {
      char currentChar = input.charAt(i), previousChar = input.charAt(i - 1);
      if (Character.isUpperCase(currentChar) && Character.isLowerCase(previousChar)) {
        result += "_";
      }
      result += Character.toUpperCase(currentChar);
    }
    return result;
  }
}
