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
package org.eclipse.aas4j.v3.dataformat.xml.mixins;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import org.eclipse.aas4j.v3.dataformat.xml.AasXmlNamespaceContext;
import org.eclipse.aas4j.v3.dataformat.xml.deserialization.OperationVariableDeserializer;
import org.eclipse.aas4j.v3.model.OperationVariable;

public interface OperationMixin {
    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "inputVariables")
    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "operationVariable")
    public List<OperationVariable> getInputVariables();

    //@JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "operationVariable")
    @JsonDeserialize(using = OperationVariableDeserializer.class)
    public void setInputVariables(List<OperationVariable> inputVariables);


    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "inoutputVariables")
    // TODO: conflicting with getter above @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "operationVariable")
    //@JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "inoutputVariables")
    public List<OperationVariable> getInoutputVariables();

    @JsonDeserialize(using = OperationVariableDeserializer.class)
    public void setInoutputVariables(List<OperationVariable> inoutputVariables);


    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "outputVariables")
    // TODO: conflicting with getter above @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "operationVariable")
    //@JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "outputVariables")
    public List<OperationVariable> getOutputVariables();

    @JsonDeserialize(using = OperationVariableDeserializer.class)
    public void setOutputVariables(List<OperationVariable> outputVariables);

}
