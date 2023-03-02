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
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.RelationshipSource;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.openxml4j.opc.internal.MemoryPackagePart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.Serializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.XmlSerializer;

/**
 * This class can be used to generate an .aasx file from Metamodel Objects and
 * the Files referred to in the Submodels
 */
public class AASXSerializer {
    private static Logger logger = LoggerFactory.getLogger(AASXSerializer.class);

    private static final String MIME_PLAINTXT = "text/plain";
    private static final String MIME_XML = "application/xml";

    private static final String ORIGIN_RELTYPE = "http://www.admin-shell.io/aasx/relationships/aasx-origin";
    private static final String ORIGIN_PATH = "/aasx/aasx-origin";
    private static final String ORIGIN_CONTENT = "Intentionally empty.";

    private static final String AASSPEC_RELTYPE = "http://www.admin-shell.io/aasx/relationships/aas-spec";
    private static final String XML_PATH = "/aasx/xml/content.xml";

    private static final String AASSUPPL_RELTYPE = "http://www.admin-shell.io/aasx/relationships/aas-suppl";

    private final Serializer xmlSerializer;

    /**
     * Default constructor
     */
    public AASXSerializer() {
        this.xmlSerializer = new XmlSerializer();
    }

    /**
     * Constructor with a custom serializer for serializing the aas environment
     * 
     * @param xmlSerializer a custom serializer used for serializing the aas environment
     */
    public AASXSerializer(Serializer xmlSerializer) {
        this.xmlSerializer = xmlSerializer;
    }

    /**
     * Generates the .aasx file and writes it to the given OutputStream
     * 
     * @param environment the aas environment that will be included in the aasx package as an xml serialization
     * @param files related inMemory files that belong to the given aas environment
     * @param os an output stream for writing the aasx package
     * @throws SerializationException if serializing the given elements fails
     * @throws IOException if creating output streams for aasx fails
     */
    public void write(Environment environment, Collection<InMemoryFile> files, OutputStream os)
            throws SerializationException, IOException {
        prepareFilePaths(environment.getSubmodels());

        OPCPackage rootPackage = OPCPackage.create(os);

        // Create the empty aasx-origin file
        PackagePart origin = createAASXPart(rootPackage, rootPackage, ORIGIN_PATH, MIME_PLAINTXT, ORIGIN_RELTYPE,
                ORIGIN_CONTENT.getBytes());

        // Convert the given Metamodels to XML
        String xml = xmlSerializer.write(environment);

        // Save the XML to aasx/xml/content.xml
        PackagePart xmlPart = createAASXPart(rootPackage, origin, XML_PATH, MIME_XML, AASSPEC_RELTYPE, xml.getBytes(Serializer.DEFAULT_CHARSET));

        storeFilesInAASX(environment.getSubmodels(), files, rootPackage, xmlPart);

        saveAASX(os, rootPackage);
    }

    /**
     * Stores the files from the Submodels in the .aasx file
     * 
     * @param submodelList the Submodels
     * @param files the content of the files
     * @param rootPackage the OPCPackage
     * @param xmlPart the Part the files should be related to
     */
    private void storeFilesInAASX(List<Submodel> submodelList, Collection<InMemoryFile> files, OPCPackage rootPackage,
                                  PackagePart xmlPart) {

        for (Submodel sm : submodelList) {
            for (File file : findFileElements(sm.getSubmodelElements())) {
                String filePath = AASXUtils.getPathFromURL(file.getValue());
                try {
                    InMemoryFile content = findFileByPath(files, filePath);
                    logger.trace("Writing file '" + filePath + "' to .aasx.");
                    createAASXPart(rootPackage, xmlPart, filePath, file.getContentType(), AASSUPPL_RELTYPE, content.getFileContent());
                } catch (RuntimeException e) {
                    // Log that a file is missing and continue building the .aasx
                    logger.warn("Could not add File '" + filePath + "'. It was not contained in given InMemoryFiles.");
                }
            }
        }
    }

    /**
     * Saves the OPCPackage to the given OutputStream
     * 
     * @param os the Stream to be saved to
     * @param rootPackage the Package to be saved
     * @throws IOException if creating output streams for aasx fails
     */
    private void saveAASX(OutputStream os, OPCPackage rootPackage) throws IOException {
        rootPackage.flush();
        rootPackage.save(os);
    }

    /**
     * Generates a UUID. Every element of the .aasx needs a unique Id according to
     * the specification
     * 
     * @return UUID
     */
    private String createUniqueID() {
        return UUID.randomUUID().toString();
    }

    /**
     * Creates a Part (a file in the .aasx) of the .aasx and adds it to the Package
     * 
     * @param root the OPCPackage
     * @param relateTo the Part of the OPC the relationship of the new Part should be added to
     * @param path the path inside the .aasx where the new Part should be created
     * @param mimeType the mime-type of the file
     * @param relType the type of the Relationship
     * @param content the data the new part should contain
     * @return the created PackagePart; Returned in case it is needed late as a Part to relate to
     */
    private PackagePart createAASXPart(OPCPackage root, RelationshipSource relateTo, String path, String mimeType, String relType,
            byte[] content) {
        if (mimeType == null || mimeType.equals("")) {
            throw new RuntimeException("Could not create AASX Part '" + path + "'. No MIME_TYPE specified.");
        }

        PackagePartName partName = null;
        MemoryPackagePart part = null;
        try {
            partName = PackagingURIHelper.createPartName(path);
            part = new MemoryPackagePart(root, partName, mimeType);
        } catch (InvalidFormatException e) {
            // This occurs if the given MIME-Type is not valid according to RFC2046
            throw new RuntimeException("Could not create AASX Part '" + path + "'", e);
        }
        writeDataToPart(part, content);
        root.registerPartAndContentType(part);
        relateTo.addRelationship(partName, TargetMode.INTERNAL, relType, createUniqueID());
        return part;
    }

    /**
     * Writes the content of a byte[] to a Part
     * 
     * @param part the Part to be written to
     * @param content the content to be written to the part
     */
    private void writeDataToPart(PackagePart part, byte[] content) {
        try (OutputStream ostream = part.getOutputStream();) {
            ostream.write(content);
            ostream.flush();
        } catch (Exception e) {
            throw new RuntimeException("Failed to write content to AASX Part '" + part.getPartName().getName() + "'", e);
        }
    }

    /**
     * Gets the File elements from a collection of elements Also recursively
     * searches in SubmodelElementCollections
     * 
     * @param elements the Elements to be searched for File elements
     * @return the found Files
     */
    private Collection<File> findFileElements(Collection<SubmodelElement> elements) {
        Collection<File> files = new ArrayList<>();

        for (SubmodelElement element : elements) {
            if (element instanceof File) {
                files.add((File) element);
            } else if (element instanceof SubmodelElementCollection) {
                // Recursive call to deal with SubmodelElementCollections
                files.addAll(findFileElements(((SubmodelElementCollection) element).getValue()));
            }
        }

        return files;
    }

    /**
     * Replaces the path in all File Elements with the result of preparePath
     * 
     * @param submodels the Submodels
     */
    private void prepareFilePaths(Collection<Submodel> submodels) {
        submodels.stream()
                .forEach(sm -> findFileElements(sm.getSubmodelElements()).stream().forEach(f -> f.setValue(preparePath(f.getValue()))));
    }

    /**
     * Finds an InMemoryFile by its path
     * 
     * @param files the InMemoryFiles
     * @param path the path of the wanted file
     * @return the InMemoryFile if it was found; else null
     */
    private InMemoryFile findFileByPath(Collection<InMemoryFile> files, String path) {
        for (InMemoryFile file : files) {
            if (AASXUtils.getPathFromURL(file.getPath()).equals(path)) {
                return file;
            }
        }
        throw new RuntimeException("The wanted file '" + path + "' was not found in the given files.");
    }

    /**
     * Removes the serverpart from a path and ensures it starts with "file://"
     * 
     * @param path the path to be prepared
     * @return the prepared path
     */
    private String preparePath(String path) {
        String newPath = AASXUtils.getPathFromURL(path);
        if (!newPath.startsWith("file://")) {
            newPath = "file://" + newPath;
        }
        return newPath;
    }

}