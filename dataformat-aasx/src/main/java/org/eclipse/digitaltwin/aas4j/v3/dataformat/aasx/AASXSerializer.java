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
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.RelationshipSource;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.openxml4j.opc.internal.MemoryPackagePart;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.internal.AASXUtils;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.visitor.AssetAdministrationShellElementWalkerVisitor;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.JsonSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.XmlSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class can be used to generate an .aasx file from Metamodel Objects and
 * the Files referred to in the Submodels
 */
public class AASXSerializer {
    private static Logger logger = LoggerFactory.getLogger(AASXSerializer.class);

    private static final String MIME_PLAINTXT = "text/plain";
    private static final String MIME_XML = "application/xml";
    private static final String MIME_JSON = "application/json";

    public static final String OPC_NAMESPACE = "http://schemas.openxmlformats.org/package/2006/relationships";
    public static final String AASX_NAMESPACE = "http://admin-shell.io/aasx/relationships";

    public static final String ORIGIN_RELTYPE = AASX_NAMESPACE + "/aasx-origin";
    public static final String ORIGIN_PATH = "/aasx/aasx-origin";
    public static final String ORIGIN_CONTENT = "Intentionally empty.";

    public static final String AASSPEC_RELTYPE = AASX_NAMESPACE + "/aas-spec";
    public static final String XML_PATH = "/aasx/xml/content.xml";
    public static final String JSON_PATH = "/aasx/json/content.json";

    public static final String AASSUPPL_RELTYPE = AASX_NAMESPACE + "/aas-suppl";

    public static final String AAS_THUMBNAIL_RELTYPE = OPC_NAMESPACE + "/metadata/thumbnail";

    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    private final XmlSerializer xmlSerializer;
    private final JsonSerializer jsonSerializer;

    /**
     * Default constructor
     */
    public AASXSerializer() {
        this.xmlSerializer = new XmlSerializer();
        this.jsonSerializer = new JsonSerializer();
    }

    /**
     * Constructor with a custom XML serializer for serializing the aas environment
     *
     * @param xmlSerializer a custom serializer used for serializing the aas environment in XML
     */
    public AASXSerializer(XmlSerializer xmlSerializer) {
        this.xmlSerializer = xmlSerializer;
        this.jsonSerializer = new JsonSerializer();
    }

    /**
     * Constructor with custom serializers for serializing the aas environment
     *
     * @param xmlSerializer a custom serializer used for serializing the aas environment in XML
     * @param jsonSerializer a custom serializer used for serializing the aas environment in JSON
     */
    public AASXSerializer(XmlSerializer xmlSerializer, JsonSerializer jsonSerializer) {
        this.xmlSerializer = xmlSerializer;
        this.jsonSerializer = jsonSerializer;
    }

    /**
     * Generates the .aasx file and writes it to the given OutputStream, by using XML as the default content type.
     *
     * @param environment the aas environment that will be included in the aasx package as an xml serialization
     * @param files related inMemory files that belong to the given aas environment
     * @param os an output stream for writing the aasx package
     * @throws SerializationException if serializing the given elements fails
     * @throws IOException if creating output streams for aasx fails
     */
    public void write(Environment environment, Collection<InMemoryFile> files, OutputStream os)
            throws SerializationException, IOException {

        write(environment, files, os, MetamodelContentType.XML);
    }

    /**
     * Generates the .aasx file and writes it to the given OutputStream
     *
     * @param environment the aas environment that will be included in the aasx package as an xml serialization
     * @param files related inMemory files that belong to the given aas environment
     * @param os an output stream for writing the aasx package
     * @param contentType the content type for the metamodel serialization
     * @throws SerializationException if serializing the given elements fails
     * @throws IOException if creating output streams for aasx fails
     */
    public void write(Environment environment, Collection<InMemoryFile> files, OutputStream os, MetamodelContentType contentType)
            throws SerializationException, IOException {

        OPCPackage rootPackage = OPCPackage.create(os);

        // Create the empty aasx-origin file
        PackagePart origin = createAASXPart(rootPackage, rootPackage, ORIGIN_PATH, MIME_PLAINTXT, ORIGIN_RELTYPE,
                ORIGIN_CONTENT.getBytes());

        PackagePart packagePart;
        switch (contentType) {
            case JSON:
                // Convert the given Metamodels to JSON
                String json = jsonSerializer.write(environment);
                // Save the JSON to aasx/json/content.json
                packagePart = createAASXPart(rootPackage, origin, JSON_PATH, MIME_JSON, AASSPEC_RELTYPE, json.getBytes(DEFAULT_CHARSET));
                break;
            case XML:
                // Convert the given Metamodels to XML
                String xml = xmlSerializer.write(environment);
                // Save the XML to aasx/xml/content.xml
                packagePart = createAASXPart(rootPackage, origin, XML_PATH, MIME_XML, AASSPEC_RELTYPE, xml.getBytes(DEFAULT_CHARSET));
                break;
            default:
                throw new IllegalArgumentException("Unsupported content type: " + contentType);
        }

        environment.getAssetAdministrationShells().stream().filter(aas -> aas.getAssetInformation() != null
                        && aas.getAssetInformation().getDefaultThumbnail() != null
                        && aas.getAssetInformation().getDefaultThumbnail().getPath() != null)
                .forEach(aas -> createParts(files,
                        AASXUtils.removeFilePartOfURI(aas.getAssetInformation().getDefaultThumbnail().getPath()),
                        rootPackage, rootPackage, aas.getAssetInformation().getDefaultThumbnail().getContentType(), AAS_THUMBNAIL_RELTYPE));
        storeFilesInAASX(environment, files, rootPackage, packagePart);

        saveAASX(os, rootPackage);
    }

    /**
     * Stores the files from the Submodels in the .aasx file
     *
     * @param environment the Environment
     * @param files the content of the files
     * @param rootPackage the OPCPackage
     * @param xmlPart the Part the files should be related to
     */
    private void storeFilesInAASX(Environment environment, Collection<InMemoryFile> files, OPCPackage rootPackage,
                                  PackagePart xmlPart) {
        findFileElements(environment).forEach(file -> createParts(files,
                    AASXUtils.removeFilePartOfURI(file.getValue()), rootPackage, xmlPart, file.getContentType(), AASSUPPL_RELTYPE));
    }

    /**
     * Adds a part to the .aasx file with the given file, filePath and contentType
     *
     * @param files the content of the files
     * @param filePath the path of the file
     * @param rootPackage the OPCPackage
     * @param xmlPart the Part the files should be related to
     * @param contentType the contentType of the file
     * @param relType the relationship type
     */
    private void createParts(Collection<InMemoryFile> files, String filePath, OPCPackage rootPackage,
          RelationshipSource xmlPart, String contentType, String relType) {
        try {
            InMemoryFile content = findFileByPath(files, filePath);
            logger.trace("Writing file '{}' to .aasx.", filePath);
            createAASXPart(rootPackage, xmlPart, filePath, contentType, relType, content.getFileContent());
        } catch (RuntimeException e) {
            // Log that a file is missing and continue building the .aasx
            logger.warn("Could not add File '{}'. It was not contained in given InMemoryFiles.", filePath, e);
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
                // The unique id has to start with a letter (cf. xs:ID). UUIDs do this only sometimes
                return "a" + UUID.randomUUID().toString();
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
        try (OutputStream ostream = part.getOutputStream()) {
            ostream.write(content);
            ostream.flush();
        } catch (Exception e) {
            throw new RuntimeException("Failed to write content to AASX Part '" + part.getPartName().getName() + "'", e);
        }
    }

    /**
     * Gets the File elements from an environment
     * searches in SubmodelElementCollections
     *
     * @param environment the Environment
     * @return the found Files
     */
    private Collection<File> findFileElements(Environment environment) {
        Collection<File> files = new HashSet<>();
        new AssetAdministrationShellElementWalkerVisitor() {
            @Override
            public void visit(File file) {
                if(file != null && file.getValue() != null) {
                    files.add(file);
                }
            }
        }.visit(environment);
        return files;
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
            if (AASXUtils.removeFilePartOfURI(file.getPath()).equals(path)) {
                return file;
            }
        }
        throw new RuntimeException("The wanted file '" + path + "' was not found in the given files.");
    }

}
