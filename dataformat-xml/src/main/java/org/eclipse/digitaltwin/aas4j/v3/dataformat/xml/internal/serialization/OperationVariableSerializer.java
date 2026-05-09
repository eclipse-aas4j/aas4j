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

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.SubmodelElementManager;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ValueSerializer;
import tools.jackson.dataformat.xml.ser.ToXmlGenerator;

public class OperationVariableSerializer extends ValueSerializer<OperationVariable> {
  @Override
  public void serialize(
      OperationVariable operationVariable, JsonGenerator gen, SerializationContext serializers)
      throws tools.jackson.core.JacksonException {
    ToXmlGenerator xgen = (ToXmlGenerator) gen;
    List<Runnable> resetRunnables =
        ReflectionHelper.setEmptyListsToNull(operationVariable.getValue());
    xgen.writeStartObject();
    xgen.writeName("value");
    xgen.writeStartObject();
    xgen.writeName(SubmodelElementManager.getXmlName(operationVariable.getValue().getClass()));
    xgen.writePOJO(operationVariable.getValue());
    xgen.writeEndObject();
    xgen.writeEndObject();
    resetRunnables.stream().forEach(r -> r.run());
  }
}
