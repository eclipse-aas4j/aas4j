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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.mixins;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.AasXmlNamespaceContext;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.deserialization.EmbeddedDataSpecificationsDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.serialization.EmbeddedDataSpecificationSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

@JsonPropertyOrder({"dataSpecification", "dataSpecificationContent"})
public interface EmbeddedDataSpecificationMixin {

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "dataSpecification")
  public Reference getDataSpecification();

  @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "dataSpecification")
  public void setDataSpecification(Reference dataSpecification);

  @JacksonXmlProperty(
      namespace = AasXmlNamespaceContext.AAS_URI,
      localName = "dataSpecificationContent")
  @JsonSerialize(using = EmbeddedDataSpecificationSerializer.class)
  public DataSpecificationContent getDataSpecificationContent();

  @JacksonXmlProperty(
      namespace = AasXmlNamespaceContext.AAS_URI,
      localName = "dataSpecificationContent")
  @JsonDeserialize(using = EmbeddedDataSpecificationsDeserializer.class)
  public void setDataSpecificationContent(DataSpecificationContent dataSpecificationIEC61360);
}
