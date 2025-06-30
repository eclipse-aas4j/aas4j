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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.google.common.base.CaseFormat;
import java.io.IOException;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;

/**
 * Custom Serializer for class DataSpecification. Adds type information in form of a reference. Uses
 * DataSpecificationManager to resolve java type to reference.
 */
public class EmbeddedDataSpecificationSerializer extends JsonSerializer<DataSpecificationContent> {

  @Override
  public void serialize(
      DataSpecificationContent data, JsonGenerator generator, SerializerProvider provider)
      throws IOException {
    if (data == null) {
      return;
    }
    String class_name = "dataSpecification"; // default
    try {
      // known limitation: Only one interface must be implemented by the class, and the name of this
      // interface must match exactly to the name of the DataSpecification
      class_name = data.getClass().getInterfaces()[0].getSimpleName();
    } catch (Exception e) {
      // do nothing and continue with the default
    }
    class_name = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, class_name);
    generator.writeStartObject();
    generator.writeObjectField(class_name, data);
    generator.writeEndObject();
  }

  @Override
  public void serializeWithType(
      DataSpecificationContent data,
      JsonGenerator generator,
      SerializerProvider provider,
      TypeSerializer typedSerializer)
      throws IOException, JsonProcessingException {
    serialize(data, generator, provider);
  }
}
