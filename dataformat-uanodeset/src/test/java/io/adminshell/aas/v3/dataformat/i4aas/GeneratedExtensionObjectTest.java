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
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Assert;
import org.junit.Test;
import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ExtensionObject.Body;
import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2008._02.types.ObjectFactory;
import org.opcfoundation.ua._2011._03.uanodeset.UANode;
import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable.Value;
import org.opcfoundation.ua.i4aas.v3.types.AASKeyDataType;
import org.opcfoundation.ua.i4aas.v3.types.AASKeyElementsDataType;
import org.opcfoundation.ua.i4aas.v3.types.AASKeyTypeDataType;
import org.w3c.dom.Node;

/**
 * 
 * test classes to review nested xml schema with appropriate namespaces
 * 
 * @author br
 *
 */
public class GeneratedExtensionObjectTest {

	@Test
	public void testJAXBunmarshalling() throws JAXBException {
		
		//needed context to unmarshal down to the custom defined types
		JAXBContext jaxbCtx = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext(new Class[] {UANodeSet.class, ListOfExtensionObject.class, AASKeyDataType.class}, null);
		
		InputStream resourceAsStream = GeneratedExtensionObjectTest.class
				.getResourceAsStream("/AASSimple_V3Draft.xml");
		UANodeSet uanodeset = (UANodeSet) jaxbCtx.createUnmarshaller().unmarshal(resourceAsStream);
		List<UANode> uaObjectOrUAVariableOrUAMethod = uanodeset.getUAObjectOrUAVariableOrUAMethod();
		for (UANode uaNode : uaObjectOrUAVariableOrUAMethod) {
			if (uaNode.getNodeId().equals("ns=1;i=162")) {
				UAVariable uaNodeAsVar = (UAVariable) uaNode;
				Object genericExtension = uaNodeAsVar.getValue().getAny();
				
				Assert.assertEquals(javax.xml.bind.JAXBElement.class.getName(), genericExtension.getClass().getName());
				
				JAXBElement<ListOfExtensionObject> asJaxb = (JAXBElement<ListOfExtensionObject>) genericExtension;
				Object anyAASDataTypeKey = asJaxb.getValue().getExtensionObject().get(0).getBody().getValue().getAny();

				Assert.assertTrue(anyAASDataTypeKey instanceof Node);				
				
				JAXBElement<AASKeyDataType> aasKey = jaxbCtx.createUnmarshaller().unmarshal((Node) anyAASDataTypeKey, AASKeyDataType.class);
				
				Assert.assertEquals(AASKeyTypeDataType.IRI_4, aasKey.getValue().getIdType());
			}
		}
	}
	
	@Test
	public void testJAXBmarshalling() throws JAXBException {
		
		//needed context to unmarshal down to the custom defined types
		JAXBContext jaxbCtx = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext(new Class[] {UANodeSet.class, ListOfExtensionObject.class, AASKeyDataType.class}, null);
		
		
		UANodeSet uaNodeSet = new UANodeSet();
		UAVariable uaVarWithAASKey = new UAVariable();
		Value valueWithExtension = new Value();
		
		//create extension wrapper
		ObjectFactory extensionObjectFactory = new ObjectFactory();
		ListOfExtensionObject anyListOfExtensionObject = new ListOfExtensionObject();
		anyListOfExtensionObject.getExtensionObject().add(new ExtensionObject());
		Body body = new Body();
		
		//build custom type AAS Key
		org.opcfoundation.ua.i4aas.v3.types.ObjectFactory i4aasTypesObjectFactory = new org.opcfoundation.ua.i4aas.v3.types.ObjectFactory();
		AASKeyDataType aasKey = new AASKeyDataType();
		aasKey.setIdType(AASKeyTypeDataType.ID_SHORT_0);
		aasKey.setType(AASKeyElementsDataType.ACCESS_PERMISSION_RULE_0);
		aasKey.setValue("mykey");
		JAXBElement<AASKeyDataType> jaxbAASKeyDataType = i4aasTypesObjectFactory.createAASKeyDataType(aasKey);
		
		//assembly
		body.setAny(jaxbAASKeyDataType);
		JAXBElement<Body> jaxbElementBody = extensionObjectFactory.createExtensionObjectBody(body );
		anyListOfExtensionObject.getExtensionObject().get(0).setBody(jaxbElementBody);
		
		JAXBElement<ListOfExtensionObject> createListOfExtensionObject = extensionObjectFactory.createListOfExtensionObject(anyListOfExtensionObject);
		//new JAXBElement<ListOfExtensionObject>()
		
		
		valueWithExtension.setAny(createListOfExtensionObject );
		
		uaVarWithAASKey.setValue(valueWithExtension );
		uaNodeSet.getUAObjectOrUAVariableOrUAMethod().add(uaVarWithAASKey );
		Marshaller marshaller = jaxbCtx.createMarshaller();
		
		marshaller.setProperty("jaxb.formatted.output", true);
		marshaller.marshal(uaNodeSet, System.out);
	}

	@Test
	public void testJAXBmarshallingOnlyExtension() throws JAXBException {
		
		//needed context to unmarshal down to the custom defined types
		JAXBContext jaxbCtx = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext(new Class[] {ListOfExtensionObject.class, AASKeyDataType.class}, null);
		
			
		//create extension wrapper
		ObjectFactory extensionObjectFactory = new ObjectFactory();
		ListOfExtensionObject anyListOfExtensionObject = new ListOfExtensionObject();
		anyListOfExtensionObject.getExtensionObject().add(new ExtensionObject());
		Body body = new Body();
		
		//build custom type AAS Key
		org.opcfoundation.ua.i4aas.v3.types.ObjectFactory i4aasTypesObjectFactory = new org.opcfoundation.ua.i4aas.v3.types.ObjectFactory();
		AASKeyDataType aasKey = new AASKeyDataType();
		aasKey.setIdType(AASKeyTypeDataType.ID_SHORT_0);
		aasKey.setType(AASKeyElementsDataType.ACCESS_PERMISSION_RULE_0);
		aasKey.setValue("mykey");
		JAXBElement<AASKeyDataType> jaxbAASKeyDataType = i4aasTypesObjectFactory.createAASKeyDataType(aasKey);
		
		//assembly
		body.setAny(jaxbAASKeyDataType);
		JAXBElement<Body> jaxbElementBody = extensionObjectFactory.createExtensionObjectBody(body );
		anyListOfExtensionObject.getExtensionObject().get(0).setBody(jaxbElementBody);
		
		JAXBElement<ListOfExtensionObject> createListOfExtensionObject = extensionObjectFactory.createListOfExtensionObject(anyListOfExtensionObject);
		//new JAXBElement<ListOfExtensionObject>()
		
				Marshaller marshaller = jaxbCtx.createMarshaller();
		
		marshaller.setProperty("jaxb.formatted.output", true);
		marshaller.marshal(createListOfExtensionObject, System.out);
	}

}
