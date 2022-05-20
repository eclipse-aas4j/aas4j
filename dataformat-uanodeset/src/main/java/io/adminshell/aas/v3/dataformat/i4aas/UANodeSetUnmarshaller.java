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

import java.io.InputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;
import org.opcfoundation.ua.i4aas.v3.types.AASKeyDataType;


/**
 * Unmarshaller with predefined context and properties relevant for deserialization.
 *
 */
public class UANodeSetUnmarshaller {

	private JAXBContext jaxbCtx;
	private Unmarshaller unmarshaller;

	/**
	 * @throws JAXBException if the internal creation of a context based unmarshaller failed
	 */
	public UANodeSetUnmarshaller() throws JAXBException {
		jaxbCtx = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext(
				new Class[] { UANodeSet.class, ListOfExtensionObject.class, AASKeyDataType.class }, null);
		unmarshaller = jaxbCtx.createUnmarshaller();
	}

	/**
	 * @param input UANodeSet as XML string
	 * @return unmarshalled UANodeSet
	 * @throws JAXBException if action failed
	 */
	public UANodeSet unmarshall(String input) throws JAXBException {
		return (UANodeSet) unmarshaller.unmarshal(new StringReader(input));
	}

	/**
	 * @param input UANodeSet as XML inputstream
	 * @return unmarshalled UANodeSet
	 * @throws JAXBException if action failed
	 */
	public UANodeSet unmarshall(InputStream input) throws JAXBException {
		return (UANodeSet) unmarshaller.unmarshal(input);
	}
}
