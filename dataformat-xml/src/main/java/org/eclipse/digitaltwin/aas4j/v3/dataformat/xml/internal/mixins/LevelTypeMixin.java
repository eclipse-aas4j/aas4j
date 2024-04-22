/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.AasXmlNamespaceContext;


@JsonPropertyOrder({"min", "nom", "typ", "max"})
public interface LevelTypeMixin {

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "min")
    public boolean getMin();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "min")
    void setMin(boolean min);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "nom")
    public boolean getNom();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "nom")
    void setNom(boolean nom);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "typ")
    public boolean getTyp();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "typ")
    void setTyp(boolean typ);

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "max")
    public boolean getMax();

    @JacksonXmlProperty(namespace = AasXmlNamespaceContext.AAS_URI, localName = "max")
    void setMax(boolean max);
}
