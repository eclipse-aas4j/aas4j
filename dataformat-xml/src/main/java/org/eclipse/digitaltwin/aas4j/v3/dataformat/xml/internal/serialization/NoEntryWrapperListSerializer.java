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
import java.util.List;

/**
 * Custom serializer for lists without individual list entry wrappers for parametrized classes.
 *
 * @param <T> serialized class within the list
 */
public class NoEntryWrapperListSerializer<T extends Object> extends JsonSerializer<List<T>> {
  private String outerWrapperName;

  /**
   * Sets the tag-name of the outer xml wrapper element. By default, no outer wrapper is serialized.
   *
   * @param outerWrapper the tag name (without namespace)
   */
  public void setOuterWrapper(String outerWrapper) {
    this.outerWrapperName = outerWrapper;
  }

  @Override
  public void serialize(List<T> list, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    writeList(list, (ToXmlGenerator) gen);
  }

  private void writeList(List<T> list, ToXmlGenerator xgen) throws IOException {
    xgen.writeStartObject();

    writeOuterWrapperStart(xgen);
    writeListEntries(list, xgen);
    writeOuterWrapperEnd(xgen);

    xgen.writeEndObject();
  }

  private void writeListEntries(List<T> list, ToXmlGenerator xgen) throws IOException {
    for (Object listEntry : list) {
      xgen.writeObject(listEntry);
    }
  }

  private void writeOuterWrapperStart(ToXmlGenerator xgen) throws IOException {
    if (outerWrapperName != null && !outerWrapperName.isEmpty()) {
      xgen.writeObjectFieldStart(outerWrapperName);
    }
  }

  private void writeOuterWrapperEnd(ToXmlGenerator xgen) throws IOException {
    if (outerWrapperName != null && !outerWrapperName.isEmpty()) {
      xgen.writeEndObject();
    }
  }

  @Override
  public boolean isEmpty(SerializerProvider provider, List<T> value) {
    return value == null || value.isEmpty();
  }
}
