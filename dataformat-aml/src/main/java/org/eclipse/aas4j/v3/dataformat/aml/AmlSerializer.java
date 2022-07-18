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
package org.eclipse.aas4j.v3.dataformat.aml;

import org.eclipse.aas4j.v3.dataformat.aml.serialization.AasToAmlMapper;
import org.eclipse.aas4j.v3.dataformat.SerializationException;
import org.eclipse.aas4j.v3.dataformat.Serializer;
import org.eclipse.aas4j.v3.dataformat.aml.header.AutomationMLVersion;
import org.eclipse.aas4j.v3.dataformat.aml.header.WriterInfo;
import org.eclipse.aas4j.v3.dataformat.aml.model.caex.CAEXFile;
import org.eclipse.aas4j.v3.dataformat.mapping.MappingException;
import org.eclipse.aas4j.v3.model.Environment;
import java.io.IOException;
import java.io.StringWriter;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class for serializing an instance of AssetAdministrationShellEnvironment to
 * AML.
 */
public class AmlSerializer implements Serializer {

    private static final String AAS_LIB_SOURCE = "/AssetAdministrationShellLib.aml";
    private static final Logger log = LoggerFactory.getLogger(AmlSerializer.class);

    @Override
    public String write(Environment aasEnvironment) throws SerializationException {
        return write(aasEnvironment, AmlSerializationConfig.DEFAULT);
    }

    /**
     * Serializes a given instance of AssetAdministrationShellEnvironment to
     * string
     *
     * @param aasEnvironment the AssetAdministrationShellEnvironment to
     * serialize
     * @param config serialization configuration
     * @return the string representation of the environment
     * @throws SerializationException if serialization fails
     */
    public String write(Environment aasEnvironment, AmlSerializationConfig config) throws SerializationException {
        try {
            CAEXFile aml = new AasToAmlMapper().map(aasEnvironment, config);
            if (config.isIncludeLibraries()) {
                aml = addAASLibrary(aml);
            }
            Marshaller marshaller = JAXBContextFactory.createContext(new Class[]{
                CAEXFile.class,
                AutomationMLVersion.class,
                WriterInfo.class,
                WriterInfo.Wrapper.class
            },
                    null).createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter writer = new StringWriter();
            marshaller.marshal(aml, writer);
            return writer.toString();
        } catch (JAXBException ex) {
            throw new SerializationException("error serializing AssetAdministrationShellEnvironment", ex);
        } catch (MappingException ex) {
            throw new SerializationException("error serializing AssetAdministrationShellEnvironment, mapping to AML failed", ex);
        } catch (IOException ex) {
            throw new SerializationException("error serializing AssetAdministrationShellEnvironment, AAS library could not be loaded", ex);
        }
    }

    private CAEXFile addAASLibrary(CAEXFile file) throws JAXBException, IOException {
        CAEXFile aasLib = loadAASLibrary();
        return CAEXFile.copyOf(file)
                .addInterfaceClassLib(aasLib.getInterfaceClassLib())
                .addRoleClassLib(aasLib.getRoleClassLib())
                .addSystemUnitClassLib(aasLib.getSystemUnitClassLib())
                .build();
    }

    private CAEXFile loadAASLibrary() throws JAXBException, IOException {
        Unmarshaller unmarshaller = JAXBContextFactory.createContext(new Class[]{CAEXFile.class}, null).createUnmarshaller();
        return (CAEXFile) unmarshaller.unmarshal(getClass().getResource(AAS_LIB_SOURCE).openStream());
    }
}
