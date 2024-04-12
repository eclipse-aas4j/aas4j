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
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.internal.AASXUtils;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.internal.visitor.AssetAdministrationShellElementWalkerVisitor;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.JsonDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.XmlDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AASX package converter converts a aasx package into a list of aas, a list
 * of submodels a list of assets, a list of Concept descriptions
 */
public class AASXDeserializer {
    private static Logger logger = LoggerFactory.getLogger(AASXDeserializer.class);

    // In an older version of AAS4J/AASX Package Explorer,
    // the wrong namespace was used
    private static final String AASPEC_RELTYPE_BACKWARDSCOMPATIBLE = "http://www.admin-shell.io/aasx/relationships/aas-spec";
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;


    private final XmlDeserializer xmlDeserializer;
    private final JsonDeserializer jsonDeserializer;

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
        this.xmlDeserializer = new XmlDeserializer();
        this.jsonDeserializer = new JsonDeserializer();
    }

    /**
     * Constructor for custom deserialization
     *
     * @param xmlDeserializer a custom XML deserializer used for deserializing the aas environment
     * @param jsonDeserializer a custom JSON deserializer used for deserializing the aas environment
     * @param inputStream an input stream to an aasx package that can be read with this instance
     * @throws InvalidFormatException if aasx package format is invalid
     * @throws IOException if creating input streams for aasx fails
     */
    public AASXDeserializer(XmlDeserializer xmlDeserializer,
                            JsonDeserializer jsonDeserializer,
                            InputStream inputStream) throws InvalidFormatException, IOException {
        aasxRoot = OPCPackage.open(inputStream);
        this.xmlDeserializer = xmlDeserializer;
        this.jsonDeserializer = jsonDeserializer;
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
        if (MetamodelContentType.XML.equals(getContentType())) {
            environment = xmlDeserializer.read(getResourceString(aasxRoot));
        }
        if (MetamodelContentType.JSON.equals(getContentType())) {
            environment = jsonDeserializer.read(getResourceString(aasxRoot), Environment.class);
        }
        return environment;
    }

    /**
     * Currently XML and JSON are supported for deserializing.
     * @return
     * @throws InvalidFormatException
     * @throws IOException
     * @throws DeserializationException
     */
    protected MetamodelContentType getContentType()  throws InvalidFormatException, IOException, DeserializationException {
        MetamodelContentType contentType;
        PackagePart packagePart = getPackagePart(aasxRoot);
        // We also check for the none official content types "test/xml" and "text/json", which are commonly used
        switch (packagePart.getContentType()) {
            case "text/xml":
            case "application/xml":
                contentType = MetamodelContentType.XML;
                break;
            case "text/json":
            case "application/json":
                contentType = MetamodelContentType.JSON;
                break;
            default:
                throw new DeserializationException("The following content type is not supported: " + packagePart.getContentType());
        }
        return contentType;
    }

    /**
     * Return the Content of the xml or json file in the aasx-package as String
     *
     * @throws InvalidFormatException if aasx package format is invalid
     * @throws IOException if creating input streams for aasx fails
     */
    public String getResourceString() throws InvalidFormatException, IOException {
        return getResourceString(this.aasxRoot);
    }

    /**
     * Retrieves a list of related files from the deserialized aasx package
     * 
     * @return the list of file in memory
     * @throws InvalidFormatException
     *             if aasx package format is invalid
     * @throws IOException
     *             if creating input streams for aasx fails
     * @throws DeserializationException
     *             if deserialization of the serialized aas environment fails
     */
    public List<InMemoryFile> getRelatedFiles() throws InvalidFormatException, IOException, DeserializationException {
        List<String> filePaths = parseReferencedFilePathsFromAASX().stream().filter(AASXUtils::isFilePath).collect(Collectors.toList());
        List<InMemoryFile> files = new ArrayList<>();
        for (String filePath : filePaths) {
            try {
                files.add(readFile(aasxRoot, filePath));
            } catch (Exception e) {
                logger.warn("Loading file {} failed and will not be included.", filePath, e);
            }
        }
        return files;
    }

    private PackagePart getPackagePart(OPCPackage aasxPackage) throws InvalidFormatException, IOException {
        PackagePart originPart = getOriginPart(aasxPackage);
        PackageRelationshipCollection originRelationships = getXMLDocumentRelation(originPart);
        return originPart.getRelatedPart(originRelationships.getRelationship(0));
    }

    private String getResourceString(OPCPackage aasxPackage) throws InvalidFormatException, IOException {
        PackagePart xmlPart = getPackagePart(aasxPackage);
        return readContentFromPackagePart(xmlPart);
    }

    private String readContentFromPackagePart(PackagePart xmlPart) throws IOException {
        InputStream stream = xmlPart.getInputStream();
        StringWriter writer = new StringWriter();
        IOUtils.copy(stream, writer, DEFAULT_CHARSET);
        return writer.toString();
    }

    private PackagePart getOriginPart(OPCPackage aasxPackage) throws InvalidFormatException {
        return aasxPackage.getPart(PackagingURIHelper.createPartName(AASXSerializer.ORIGIN_PATH));
    }

    private PackageRelationshipCollection getXMLDocumentRelation(PackagePart originPart) throws InvalidFormatException {
        String xmlPart = getXMLPart(originPart);
        PackageRelationshipCollection originRelationships = originPart.getRelationshipsByType(xmlPart);

        checkNumberOfRelationsForValidity(originRelationships);

        return originRelationships;
    }

    private String getXMLPart(PackagePart originPart) throws InvalidFormatException {
        if (isCompatibilityModeNeeded(originPart)) {
            logger.info("AASX contains wrong Relationship namespace. This may be related to the AASX being created with an old version of AASX Package Explorer or an old version of AAS4J. Future compatibility with the wrong namespace may not be guaranteed");
            return AASPEC_RELTYPE_BACKWARDSCOMPATIBLE;
        } else {
            return AASXSerializer.AASSPEC_RELTYPE;
        }
    }

    private boolean isCompatibilityModeNeeded(PackagePart originPart) throws InvalidFormatException {
        PackageRelationshipCollection originRelationshipsBackwardsCompatible = originPart.getRelationshipsByType(AASPEC_RELTYPE_BACKWARDSCOMPATIBLE);

        return originRelationshipsBackwardsCompatible.size() > 0;
    }

    private void checkNumberOfRelationsForValidity(PackageRelationshipCollection originRelationships) throws InvalidFormatException {
        if (originRelationships.size() > 1) {
            throw new InvalidFormatException("More than one 'aasx-spec' document found in .aasx");
        } else if (originRelationships.size() == 0) {
            throw new InvalidFormatException("No 'aasx-spec' document found in .aasx");
        }
    }

    /**
     * Load the referenced filepaths in the submodels such as PDF, PNG files from
     * the package
     * 
     * @return a list of the folder name and folder path, the folder holds the files
     * @throws IOException if creating input streams for aasx fails
     * @throws InvalidFormatException if aasx package format is invalid
     * @throws DeserializationException if deserialization of the serialized aas environment fails
     * 
     */
    private List<String> parseReferencedFilePathsFromAASX() throws IOException, InvalidFormatException, DeserializationException {
        read();

        List<String> paths = new ArrayList<>();
        environment.getAssetAdministrationShells().stream().filter(aas -> aas.getAssetInformation() != null
                        && aas.getAssetInformation().getDefaultThumbnail() != null
                        && aas.getAssetInformation().getDefaultThumbnail().getPath() != null)
                .forEach(aas -> paths.add(aas.getAssetInformation().getDefaultThumbnail().getPath()));
        new AssetAdministrationShellElementWalkerVisitor() {
            @Override
            public void visit(File file) {
                if(file != null && file.getValue() != null) {
                    paths.add(file.getValue());
                }
            }
        }.visit(environment);
        return paths;
    }

    private InMemoryFile readFile(OPCPackage aasxRoot, String filePath) throws InvalidFormatException, IOException {
        PackagePart part = aasxRoot.getPart(PackagingURIHelper.createPartName(AASXUtils.removeFilePartOfURI(filePath)));
        InputStream stream = part.getInputStream();
        return new InMemoryFile(stream.readAllBytes(), filePath);
    }
}
