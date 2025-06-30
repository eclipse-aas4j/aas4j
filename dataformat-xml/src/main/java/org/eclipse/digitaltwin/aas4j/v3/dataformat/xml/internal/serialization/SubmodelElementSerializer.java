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
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import java.io.IOException;
import java.lang.reflect.Field;
import javax.xml.namespace.QName;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.SubmodelElementManager;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;

public class SubmodelElementSerializer extends JsonSerializer<SubmodelElement> {

  @Override
  public void serialize(SubmodelElement value, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    ToXmlGenerator xgen = (ToXmlGenerator) gen;

    try {
      Field nextName = xgen.getClass().getDeclaredField("_nextName");
      nextName.setAccessible(true);
      QName next = (QName) nextName.get(xgen);

      String name = SubmodelElementManager.CLASS_TO_NAME.get(value.getClass());

      if (next.getLocalPart().equals(name)) {
        xgen.writeObject(value); // only write the plain object without a deduplicate wrapping field
        return;
      }
    } catch (NoSuchFieldException | IllegalAccessException e) {
      throw new IOException(e);
    }

    xgen.writeStartObject();
    String name = SubmodelElementManager.CLASS_TO_NAME.get(value.getClass());
    xgen.writeFieldName(name);
    xgen.writeObject(value);
    xgen.writeEndObject();
  }
}
