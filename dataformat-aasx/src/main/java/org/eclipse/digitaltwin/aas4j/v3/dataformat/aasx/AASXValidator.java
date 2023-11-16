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

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.XmlSchemaValidator;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/**
 * Class to validate the XML file inside an AASX-package
 */
public class AASXValidator {

    private XmlSchemaValidator xmlValidator;
    private AASXDeserializer deserializer;

    public AASXValidator(InputStream is) throws SAXException, IOException, InvalidFormatException {
        this.xmlValidator = new XmlSchemaValidator();
        this.deserializer = new AASXDeserializer(is);
    }

    /**
     * Calls XML-Validator
     * 
     * @return Set of Strings containing message on AASX-XML-Validation result
     * @throws IOException failure during filehandling
     * @throws InvalidFormatException specified URI is invalid
     */
    public Set<String> validateSchema() throws IOException, InvalidFormatException {
        String file = deserializer.getXMLResourceString();
        return xmlValidator.validateSchema(file);
    }

}
