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

import javax.xml.bind.JAXBException;

import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;

import io.adminshell.aas.v3.dataformat.SerializationException;
import io.adminshell.aas.v3.dataformat.Serializer;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.EnvironmentMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;

/**
 * Serializer Implementation for I4AAS
 *
 */
public class I4AASSerializer implements Serializer {
	
	private boolean addMissingSemanticIdsToDictionary;

	/**
	 * I4AASSerializer with addMissingSemanticIdsToDictionary defaults to true
	 */
	public I4AASSerializer() {
		this(true);
	}
	
	/**
	 * @param addMissingSemanticIdsToDictionary handles missing semanticIds in OPC UA Dictionary (caused by missing AAS Concept Description) by adding them automatically
	 */
	public I4AASSerializer(boolean addMissingSemanticIdsToDictionary) {
		this.addMissingSemanticIdsToDictionary = addMissingSemanticIdsToDictionary;
	}

	/**
	 * takes a AAS model and returns a I4AAS as string.
	 */
	@Override
	public String write(AssetAdministrationShellEnvironment aasEnvironment) throws SerializationException {
		MappingContext mappingContext = new MappingContext(aasEnvironment);
		mappingContext.setAddMissingSemanticIdsToDictionary(addMissingSemanticIdsToDictionary);
		UAObject uaEnv = new EnvironmentMapper(mappingContext.getEnvironment(), mappingContext).map();
		//map action
		UANodeSet nodeset = mappingContext.getNodeSet();
		
		try {
			return new UANodeSetMarshaller(nodeset).marshallAsString();
		} catch (JAXBException e) {
			throw new SerializationException("Serialization failed due to a JAXBException.", e);
		}

	}

}
