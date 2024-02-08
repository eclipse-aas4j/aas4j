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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.util.ReflectionHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.AasXmlNamespaceContext;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AssetAdministrationShellEnvironmentSerializer extends JsonSerializer<Environment> {

    private static final String[] SCHEMA_LOCATION = {"xsi:schemaLocation",
            "https://admin-shell.io/aas/3/0 AAS.xsd" };

    private static final QName AASENV_TAGNAME = new QName(AasXmlNamespaceContext.AAS_URI, "environment");
    private static final QName AASLIST_TAGNAME = new QName(AasXmlNamespaceContext.AAS_URI, "assetAdministrationShells");
    private static final QName AAS_TAGNAME = new QName(AasXmlNamespaceContext.AAS_URI, "assetAdministrationShell");
    private static final QName CONCEPTDICTIONARYLIST_TAGNAME = new QName(AasXmlNamespaceContext.AAS_URI, "conceptDescriptions");
    private static final QName CONCEPTDICTIONARY_TAGNAME = new QName(AasXmlNamespaceContext.AAS_URI, "conceptDescription");
    private static final QName SUBMODELLIST_TAGNAME = new QName(AasXmlNamespaceContext.AAS_URI, "submodels");
    private static final QName SUBMODEL_TAGNAME = new QName(AasXmlNamespaceContext.AAS_URI, "submodel");

    private Map<String, String> namespacePrefixes;

    public AssetAdministrationShellEnvironmentSerializer(Map<String, String> namespacePrefixes) {
        this.namespacePrefixes = namespacePrefixes;
    }

    public AssetAdministrationShellEnvironmentSerializer() {
        this.namespacePrefixes = AasXmlNamespaceContext.PREFERRED_PREFIX_CONTEXT;
    }

    @Override
    public void serialize(Environment value, JsonGenerator gen, SerializerProvider serializers)
            throws IOException {
        ToXmlGenerator xgen = (ToXmlGenerator) gen;
        XMLStreamWriter streamWriter = xgen.getStaxWriter();
        setPrefixes(streamWriter);
        writeOpeningTag(xgen, streamWriter);
        writeContent(value, xgen);
        closeOpeningTag(xgen);
    }

    private void setPrefixes(XMLStreamWriter streamWriter) {
        try {
            for (Entry<String, String> namespacePrefixEntry : namespacePrefixes.entrySet()) {
                streamWriter.setPrefix(namespacePrefixEntry.getKey(), namespacePrefixEntry.getValue());
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void writeOpeningTag(ToXmlGenerator xgen, XMLStreamWriter streamWriter) throws IOException {
        xgen.setNextName(AASENV_TAGNAME);
        xgen.writeStartObject();
        try {
            for (Entry<String, String> namespacePrefixEntry : namespacePrefixes.entrySet()) {
                streamWriter.writeNamespace(namespacePrefixEntry.getKey(), namespacePrefixEntry.getValue());
            }
            streamWriter.writeAttribute(SCHEMA_LOCATION[0], SCHEMA_LOCATION[1]);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void writeContent(Environment value, ToXmlGenerator xgen) throws IOException {
        writeAssetAdministrationShells(xgen, value.getAssetAdministrationShells());
        writeSubmodels(xgen, value.getSubmodels());
        writeConceptDescriptions(xgen, value.getConceptDescriptions());
    }

    private void writeAssetAdministrationShells(ToXmlGenerator xgen, List<AssetAdministrationShell> aasList)
            throws IOException {
        if (aasList.isEmpty()) {
            return;
        }
        writeWrappedArray(xgen, AASLIST_TAGNAME, AAS_TAGNAME, aasList);
    }

    private void writeConceptDescriptions(ToXmlGenerator xgen, List<ConceptDescription> conceptDescriptions)
            throws IOException {
        if (conceptDescriptions.isEmpty()) {
            return;
        }
        writeWrappedArray(xgen, CONCEPTDICTIONARYLIST_TAGNAME, CONCEPTDICTIONARY_TAGNAME, conceptDescriptions);
    }

    private void writeSubmodels(ToXmlGenerator xgen, List<Submodel> submodels) throws IOException {
        if (submodels.isEmpty()) {
            return;
        }
        writeWrappedArray(xgen, SUBMODELLIST_TAGNAME, SUBMODEL_TAGNAME, submodels);
    }

    private void writeWrappedArray(ToXmlGenerator xgen, QName wrapper, QName wrapped, List<?> list)
            throws IOException {
        // overwrite all empty list with null, as the schema does not allow empty XML lists

        List<Runnable> resetRunnables = new ArrayList<>();

        for (Object obj : list)
            resetRunnables.addAll(ReflectionHelper.setEmptyListsToNull(obj));

        xgen.writeFieldName(wrapper.getLocalPart());
        xgen.writeStartArray();
        xgen.startWrappedValue(wrapper, wrapped);
        for (Object aas : list) {
            xgen.writeObject(aas);
        }
        xgen.finishWrappedValue(wrapper, wrapped);
        xgen.writeEndArray();

        resetRunnables.stream().forEach(r -> r.run());
    }

    private void closeOpeningTag(ToXmlGenerator xgen) throws IOException {
        xgen.writeEndObject();
    }
}
