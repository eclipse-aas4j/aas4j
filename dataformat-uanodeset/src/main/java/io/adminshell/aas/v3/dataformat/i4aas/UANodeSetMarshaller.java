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
package io.adminshell.aas.v3.dataformat.i4aas;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;
import org.opcfoundation.ua.i4aas.v3.types.AASKeyDataType;

/**
 * Marshaller with predefined context and properties relevant for serialization.
 *
 */
public class UANodeSetMarshaller {

	private UANodeSet nodeset;

	/**
	 * @param nodeset the nodeset to be marshalled
	 */
	public UANodeSetMarshaller(UANodeSet nodeset) {
		this.nodeset = nodeset;
	}

	/**
	 * @return marshalled UANodeSet given in constructor
	 * @throws JAXBException if action failed
	 */
	public String marshallAsString() throws JAXBException {
		JAXBContext jaxbCtx = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext(new Class[] {UANodeSet.class, ListOfExtensionObject.class, AASKeyDataType.class}, null);
		Marshaller marshaller = jaxbCtx.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", true);
		StringWriter stringWriter = new StringWriter();
		marshaller.marshal(nodeset, stringWriter);
		return stringWriter.toString();
	}

}
