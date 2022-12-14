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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.Serializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.XmlDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;

/**
 * The AASX package converter converts a aasx package into a list of aas, a list
 * of submodels a list of assets, a list of Concept descriptions
 */
public class AASXDeserializer {

    private static final String XML_TYPE = "http://www.admin-shell.io/aasx/relationships/aas-spec";
    private static final String AASX_ORIGIN = "/aasx/aasx-origin";

    private XmlDeserializer deserializer = new XmlDeserializer();

    private Environment environment;
    private final OPCPackage aasxRoot;

    /**
     * Constructor that takes the aasx package for this deserializer
     * 
     * @param inputStream an input stream to an aasx package that can be read with this instance
     * @throws InvalidFormatException if aasx package format is invalid
     * @throws IOException if creating input streams for aasx fails
     */
    public AASXDeserializer(InputStream inputStream) throws InvalidFormatException, IOException {
        aasxRoot = OPCPackage.open(inputStream);
    }

    /**
     * Constructor for custom XML deserialization
     * 
     * @param deserializer a custom deserializer used for deserializing the aas environment
     * @param inputStream an input stream to an aasx package that can be read with this instance
     * @throws InvalidFormatException if aasx package format is invalid
     * @throws IOException if creating input streams for aasx fails
     */
    public AASXDeserializer(XmlDeserializer deserializer, InputStream inputStream) throws InvalidFormatException, IOException {
        aasxRoot = OPCPackage.open(inputStream);
        this.deserializer = deserializer;
    }

    /**
     * Reads the AASX package that belongs to this deserializer
     * 
     * @return The deserialized aas environment from the aasx package given in the constructor
     * 
     * @throws InvalidFormatException if aasx package format is invalid
     * @throws IOException if creating input streams for aasx fails
     * @throws DeserializationException if deserialization of the serialized aas environment fails
     */
    public Environment read() throws InvalidFormatException, IOException, DeserializationException {
        // If the XML was already parsed return cached environment
        if (environment != null) {
            return environment;
        }
        environment = deserializer.read(getXMLResourceString(aasxRoot));
        return environment;
    }

    /**
     * Return the Content of the xml file in the aasx-package as String
     * 
     * @throws InvalidFormatException if aasx package format is invalid
     * @throws IOException if creating input streams for aasx fails
     */
    public String getXMLResourceString() throws InvalidFormatException, IOException {
        return getXMLResourceString(this.aasxRoot);
    }

    private String getXMLResourceString(OPCPackage aasxPackage) throws InvalidFormatException, IOException {
        // Get the "/aasx/aasx-origin" Part. It is Relationship source for the
        // XML-Document
        PackagePart originPart = aasxPackage.getPart(PackagingURIHelper.createPartName(AASX_ORIGIN));

        // Get the Relation to the XML Document
        PackageRelationshipCollection originRelationships = originPart.getRelationshipsByType(XML_TYPE);

        // If there is more than one or no XML-Document that is an error
        if (originRelationships.size() > 1) {
            throw new RuntimeException("More than one 'aasx-spec' document found in .aasx");
        } else if (originRelationships.size() == 0) {
            throw new RuntimeException("No 'aasx-spec' document found in .aasx");
        }

        // Get the PackagePart of the XML-Document
        PackagePart xmlPart = originPart.getRelatedPart(originRelationships.getRelationship(0));

        // Read the content from the PackagePart
        InputStream stream = xmlPart.getInputStream();
        StringWriter writer = new StringWriter();
        IOUtils.copy(stream, writer, Serializer.DEFAULT_CHARSET);
        return writer.toString();
    }

    /**
     * Load the referenced filepaths in the submodels such as PDF, PNG files from
     * the package
     * 
     * @return a map of the folder name and folder path, the folder holds the files
     * @throws IOException if creating input streams for aasx fails
     * @throws InvalidFormatException if aasx package format is invalid
     * @throws DeserializationException if deserialization of the serialized aas environment fails
     * 
     */
    private List<String> parseReferencedFilePathsFromAASX() throws IOException, InvalidFormatException, DeserializationException {
        read();

        List<String> paths = new ArrayList<>();
        for (Submodel sm : environment.getSubmodels()) {
            paths.addAll(parseElements(sm.getSubmodelElements()));
        }
        return paths;
    }

    /**
     * Gets the file paths from a collection of ISubmodelElement
     * 
     * @param elements the submodel elements to process
     * @return the Paths from the File elements
     */
    private List<String> parseElements(Collection<SubmodelElement> elements) {
        List<String> paths = new ArrayList<>();
        for (SubmodelElement element : elements) {
            if (element instanceof File) {
                File file = (File) element;
                paths.add(file.getValue());
            } else if (element instanceof SubmodelElementCollection) {
                SubmodelElementCollection collection = (SubmodelElementCollection) element;
                paths.addAll(parseElements(collection.getValue()));
            }
        }
        return paths;
    }

    /**
     * Retrieves a list of related files from the deserialized aasx package
     * 
     * @return the list of file in memory
     * @throws InvalidFormatException if aasx package format is invalid
     * @throws IOException if creating input streams for aasx fails
     * @throws DeserializationException if deserialization of the serialized aas environment fails
     */
    public List<InMemoryFile> getRelatedFiles() throws InvalidFormatException, IOException, DeserializationException {
        List<String> filePaths = parseReferencedFilePathsFromAASX();
        List<InMemoryFile> files = new ArrayList<>();
        for (String filePath : filePaths) {
            files.add(readFile(aasxRoot, filePath));
        }
        return files;
    }

    private InMemoryFile readFile(OPCPackage aasxRoot, String filePath) throws InvalidFormatException, IOException {
        PackagePart part = aasxRoot.getPart(PackagingURIHelper.createPartName(AASXUtils.getPathFromURL(filePath)));
        InputStream stream = part.getInputStream();
        return new InMemoryFile(stream.readAllBytes(), filePath);
    }
}
