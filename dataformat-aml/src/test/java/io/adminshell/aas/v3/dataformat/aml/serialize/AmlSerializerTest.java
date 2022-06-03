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
package io.adminshell.aas.v3.dataformat.aml.serialize;

import io.adminshell.aas.v3.dataformat.DeserializationException;
import io.adminshell.aas.v3.dataformat.aml.fixtures.FullExample;
import io.adminshell.aas.v3.dataformat.SerializationException;
import io.adminshell.aas.v3.dataformat.aml.AmlSerializationConfig;
import io.adminshell.aas.v3.dataformat.aml.AmlSerializer;
import io.adminshell.aas.v3.dataformat.aml.fixtures.SimpleExample;
import io.adminshell.aas.v3.dataformat.aml.serialization.id.IntegerIdGenerator;
import io.adminshell.aas.v3.dataformat.core.AASFull;
import io.adminshell.aas.v3.dataformat.core.AASSimple;
import io.adminshell.aas.v3.rc02.model.Environment;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import org.junit.Test;
import org.xml.sax.SAXException;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.DefaultNodeMatcher;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.Difference;
import org.xmlunit.diff.ElementSelectors;

public class AmlSerializerTest {

    @Test
    public void testSAPFullExample() throws SerializationException, SAXException, IOException {
        validateAmlSerializer(FullExample.FILE, AASFull.ENVIRONMENT);
    }

    @Test
    public void testSimpleExample() throws SerializationException, SAXException, IOException, DeserializationException {
        validateAmlSerializer(SimpleExample.FILE, AASSimple.ENVIRONMENT);
    }

    private void validateAmlSerializer(File expectedFile, Environment environment)
            throws SerializationException, SAXException, IOException {
        String expected = Files.readString(expectedFile.toPath());
        String actual = new AmlSerializer().write(environment, AmlSerializationConfig.builder()
                .idGenerator(new IntegerIdGenerator())
                .build());
        System.out.println(actual);
        Diff diff = DiffBuilder
                .compare(expected)
                .withTest(actual)
                .normalizeWhitespace()
                .withNodeMatcher(new DefaultNodeMatcher(
                        ElementSelectors.conditionalBuilder()
                                .whenElementIsNamed("Attribute")
                                .thenUse(ElementSelectors.byNameAndAttributes("Name"))
                                .whenElementIsNamed("InternalElement")
                                .thenUse(ElementSelectors.byNameAndAttributes("Name", "ID"))
                                .whenElementIsNamed("ExternalInterface")
                                .thenUse(ElementSelectors.byNameAndAttributes("Name"))
                                .elseUse(ElementSelectors.byNameAndText)
                                .build()))
                .ignoreComments()
                .ignoreWhitespace()
                .withNodeFilter(node -> !node.getNodeName().equals("AdditionalInformation"))
                .build();
        Iterator<Difference> iter = diff.getDifferences().iterator();
        int size = 0;
        while (iter.hasNext()) {
            System.out.println(iter.next());
            size++;
        }
        System.err.println(String.format("found %d validation error(s)", size));
        assert (size == 0);
    }

}
