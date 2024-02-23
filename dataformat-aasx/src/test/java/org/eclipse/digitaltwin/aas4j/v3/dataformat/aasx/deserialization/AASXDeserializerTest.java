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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.deserialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.AASXDeserializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.AASXSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.InMemoryFile;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultFile;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.xml.sax.SAXException;

public class AASXDeserializerTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void roundTrip() throws SerializationException, IOException, InvalidFormatException, DeserializationException, ParserConfigurationException, SAXException {
        List<InMemoryFile> fileList = new ArrayList<>();
        byte[] operationManualContent = { 0, 1, 2, 3, 4 };
        byte[] thumbnail = { 0, 1, 2, 3, 4 };
        InMemoryFile inMemoryFile = new InMemoryFile(operationManualContent, "file:///aasx/OperatingManual.pdf");
        InMemoryFile inMemoryFileThumbnail = new InMemoryFile(thumbnail, "file:///master/verwaltungsschale-detail-part1.png");
        fileList.add(inMemoryFile);
        fileList.add(inMemoryFileThumbnail);

        java.io.File file = tempFolder.newFile("output.aasx");

        new AASXSerializer().write(AASSimple.createEnvironment(), fileList, new FileOutputStream(file));

        InputStream in = new FileInputStream(file);
        AASXDeserializer deserializer = new AASXDeserializer(in);

        assertEquals(AASSimple.createEnvironment(), deserializer.read());
        assertTrue(CollectionUtils.isEqualCollection(fileList, deserializer.getRelatedFiles()));
    }

    @Test
    public void relatedFilesAreOnlyResolvedIfWithinAASX() throws IOException, SerializationException, InvalidFormatException, DeserializationException {
        Submodel fileSm = new DefaultSubmodel.Builder().id("doesNotMatter").submodelElements(createFileSubmodelElements()).build();
        Environment env = new DefaultEnvironment.Builder().submodels(fileSm).build();
        
        byte[] image = { 0, 1, 2, 3, 4 };
        InMemoryFile inMemoryFile = new InMemoryFile(image, "file:///aasx/internalFile.jpg");

        java.io.File file = tempFolder.newFile("output.aasx");
        new AASXSerializer().write(env, Collections.singleton(inMemoryFile), new FileOutputStream(file));

        InputStream in = new FileInputStream(file);
        AASXDeserializer deserializer = new AASXDeserializer(in);

        assertEquals(Collections.singletonList(inMemoryFile), deserializer.getRelatedFiles());
    }

    @Test
    public void emptyFiles() throws IOException, SerializationException, InvalidFormatException, DeserializationException {
        File emptyFile = new DefaultFile.Builder().idShort("emptyFile").contentType("").value("").build();
        Submodel fileSm = new DefaultSubmodel.Builder().id("doesNotMatter").submodelElements(emptyFile).build();
        Environment env = new DefaultEnvironment.Builder().submodels(fileSm).build();

        java.io.File file = tempFolder.newFile("output.aasx");
        new AASXSerializer().write(env, null, new FileOutputStream(file));

        InputStream in = new FileInputStream(file);
        AASXDeserializer deserializer = new AASXDeserializer(in);
        assertTrue(deserializer.getRelatedFiles().isEmpty());
    }

    @Test
    public void filesInElementList() throws IOException, SerializationException, InvalidFormatException, DeserializationException {
        DefaultSubmodelElementList elementList = new DefaultSubmodelElementList.Builder().value(createFileSubmodelElements()).build();
        Submodel fileSm = new DefaultSubmodel.Builder().id("doesNotMatter").submodelElements(elementList).build();
        Environment env = new DefaultEnvironment.Builder().submodels(fileSm).build();

        byte[] image = { 0, 1, 2, 3, 4 };
        InMemoryFile inMemoryFile = new InMemoryFile(image, "file:///aasx/internalFile.jpg");

        java.io.File file = tempFolder.newFile("output.aasx");
        new AASXSerializer().write(env, Collections.singleton(inMemoryFile), new FileOutputStream(file));

        InputStream in = new FileInputStream(file);
        AASXDeserializer deserializer = new AASXDeserializer(in);
        assertEquals(Collections.singletonList(inMemoryFile), deserializer.getRelatedFiles());
    }

    private static List<SubmodelElement> createFileSubmodelElements() {
        File internalFile = new DefaultFile.Builder().idShort("internalFile").contentType("image/jpeg").value("file:///aasx/internalFile.jpg").build();
        File externalFile = new DefaultFile.Builder().idShort("externalFile").contentType("image/jpeg").value("http://doesNotMatter.com/image").build();
        return Arrays.asList(internalFile, externalFile);
    }
}
