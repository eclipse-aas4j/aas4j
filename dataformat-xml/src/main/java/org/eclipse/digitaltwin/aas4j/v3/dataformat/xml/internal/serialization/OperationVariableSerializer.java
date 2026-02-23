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
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.SubmodelElementManager;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;

public class OperationVariableSerializer extends JsonSerializer<OperationVariable> {
  @Override
  public void serialize(
      OperationVariable operationVariable, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    ToXmlGenerator xgen = (ToXmlGenerator) gen;
    List<Runnable> resetRunnables =
        ReflectionHelper.setEmptyListsToNull(operationVariable.getValue());
    xgen.writeStartObject();
    xgen.writeFieldName("value");
    xgen.writeStartObject();
    xgen.writeFieldName(SubmodelElementManager.getXmlName(operationVariable.getValue().getClass()));
    xgen.writeObject(operationVariable.getValue());
    xgen.writeEndObject();
    xgen.writeEndObject();
    resetRunnables.stream().forEach(r -> r.run());
  }
}
