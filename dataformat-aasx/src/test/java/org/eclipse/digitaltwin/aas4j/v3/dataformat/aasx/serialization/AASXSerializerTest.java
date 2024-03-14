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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.serialization;


import org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.AASXSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.InMemoryFile;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.SerializationException;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AASXSerializerTest {

    private static final String RELS_PATH_URI = "file:///_rels/.rels";
    private static final String XML_PATH_URI = "file:///aasx/xml/content.xml";
    private static final String ORIGIN_PATH_URI = "file:///aasx/aasx-origin";

    private List<InMemoryFile> fileList = new ArrayList<>();

    @Test
    public void testBuildAASXFull() throws IOException, TransformerException, ParserConfigurationException, SerializationException {
        byte[] operationManualContent = { 0, 1, 2, 3, 4 };
        InMemoryFile file = new InMemoryFile(operationManualContent, "file:///TestFile.pdf");
        fileList.add(file);
        // This stream can be used to write the .aasx directly to a file
        // FileOutputStream out = new FileOutputStream("path/to/test.aasx");

        // This stream keeps the output of the AASXFactory only in memory
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        new AASXSerializer().write(AASFull.createEnvironment(), fileList, out);

        validateAASX(out, List.of(AASXSerializerTest::assertRootXml));
    }

    @Test
    public void testBuildAASXSimple() throws IOException, TransformerException, ParserConfigurationException, SerializationException {
        byte[] thumbnail = { 0, 1, 2, 3, 4 };
        byte[] operationManualContent = { 0, 1, 2, 3, 4 };
        InMemoryFile file = new InMemoryFile(operationManualContent, "file:///aasx/OperatingManual.pdf");
        InMemoryFile inMemoryFileThumbnail = new InMemoryFile(thumbnail, "file:///master/verwaltungsschale-detail-part1.png");
        fileList.add(file);
        fileList.add(inMemoryFileThumbnail);
        // This stream can be used to write the .aasx directly to a file
        // FileOutputStream out = new FileOutputStream("path/to/test.aasx");

        // This stream keeps the output of the AASXFactory only in memory
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        new AASXSerializer().write(AASSimple.createEnvironment(), fileList, out);

        validateAASX(out, List.of(AASXSerializerTest::assertRootXml, AASXSerializerTest::assertThumbnailReference));
    }

    private void validateAASX(ByteArrayOutputStream byteStream, List<BiConsumer<ZipEntry, ZipInputStream>> fileValidators) {
        ZipInputStream in = new ZipInputStream(new ByteArrayInputStream(byteStream.toByteArray()));
        ZipEntry zipEntry;

        ArrayList<String> filePaths = new ArrayList<>();

        try {
            while ((zipEntry = in.getNextEntry()) != null) {
                for (final BiConsumer<ZipEntry, ZipInputStream> validator : fileValidators) {
                    validator.accept(zipEntry, in);
                }

                // Write the paths of all files contained in the .aasx into filePaths
                filePaths.add("file:///" + zipEntry.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        assertTrue(filePaths.contains(XML_PATH_URI));
        assertTrue(filePaths.contains(ORIGIN_PATH_URI));

        // Check if all expected files are present
        // Needs to strip the first slash of the paths, as ZipEntry gives paths without
        // it
        for (InMemoryFile file : fileList) {
            assertTrue(filePaths.contains(file.getPath()));
        }

    }

    private static void assertRootXml(ZipEntry zipEntry, ZipInputStream in) {
        if (!XML_PATH_URI.endsWith(zipEntry.getName())) {
            return;
        }
        // Read the first 5 bytes of the XML file to make sure it is in fact XML file
        // No further test of XML file necessary as XML-Converter is tested separately
        byte[] buf = new byte[5];
        try {
            in.read(buf);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals("<?xml", new String(buf));
    }

    private static void assertThumbnailReference(ZipEntry zipEntry, ZipInputStream in) {
        if (!RELS_PATH_URI.endsWith(zipEntry.getName())) {
            return;
        }
        final String content;
        try {
            content = new String(in.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertTrue(content.contains("Type=\"http://schemas.openxmlformats.org/package/2006/relationships/metadata/thumbnail\""));
        assertTrue(content.contains("Target=\"master/verwaltungsschale-detail-part1.png\""));
    }
}
