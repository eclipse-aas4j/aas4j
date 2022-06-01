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
package io.adminshell.aas.v3.dataformat.i4aas.mappers;

import javax.xml.bind.JAXBElement;

import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ExtensionObject.Body;
import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2008._02.types.NodeId;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable.Value;
import org.opcfoundation.ua.i4aas.v3.types.AASKeyDataType;
import org.opcfoundation.ua.i4aas.v3.types.AASKeyElementsDataType;
import org.opcfoundation.ua.i4aas.v3.types.AASKeyTypeDataType;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;
import org.eclipse.aas4j.v3.rc02.model.Key;
import org.eclipse.aas4j.v3.rc02.model.Reference;

public class ReferenceMapper extends I4AASMapper<Reference, UAObject> {

	private String browseName;

	org.opcfoundation.ua._2008._02.types.ObjectFactory extensionObjectFactory = new org.opcfoundation.ua._2008._02.types.ObjectFactory();
	org.opcfoundation.ua.i4aas.v3.types.ObjectFactory i4aasTypesObjectFactory = new org.opcfoundation.ua.i4aas.v3.types.ObjectFactory();

	public ReferenceMapper(Reference src, MappingContext ctx, String browseName) {
		super(src, ctx);
		this.browseName = browseName;
	}

	@Override
	protected UAObject createTargetObject() {
		target = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString()).withBrowseName(createI4AASBrowseName(browseName))
				.withDisplayName(createLocalizedText(browseName)).build();
		addTypeReference(I4AASIdentifier.AASReferenceType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		UAVariable UAKeyVariable = UAVariable.builder().withNodeId(ctx.newModelNodeIdAsString())
				.withDataType(I4AASIdentifier.AASKeyDataType.getName()).withValueRank(1).withArrayDimensions("0")
				.withAccessLevel(3L).withDisplayName(createLocalizedText(REFERENCE_KEYS_BROWSENAME))
				.withBrowseName(createI4AASBrowseName(REFERENCE_KEYS_BROWSENAME)).build();
		addTypeReferenceFor(UAKeyVariable, UaIdentifier.PropertyType);
		attachAsProperty(target, UAKeyVariable);
		addToNodeset(UAKeyVariable);
		
		if (!source.getKeys().isEmpty()) {			
			UAKeyVariable.setValue(new Value());
			ListOfExtensionObject listOfExtensions = new ListOfExtensionObject();

			for (Key key : source.getKeys()) {
				AASKeyDataType aasKeyDataType = AASKeyDataType.builder().//
				withIdType((AASKeyTypeDataType) I4AASEnumMapper.findMatch(key.getIdType())).//
				withType((AASKeyElementsDataType) I4AASEnumMapper.findMatch(key.getType())).//
				withValue(key.getValue()).build();
				JAXBElement<AASKeyDataType> jaxbAASKeyDataType = i4aasTypesObjectFactory.createAASKeyDataType(aasKeyDataType);
				
				Body uaxBody = extensionObjectFactory.createExtensionObjectBody();
				uaxBody.setAny(jaxbAASKeyDataType);
						
				NodeId typeId = extensionObjectFactory.createNodeId();
				typeId.setIdentifier(extensionObjectFactory.createNodeIdIdentifier(ctx.getI4aasNodeIdAsString(I4AASIdentifier.AASKeyDataType_Encoding_DefaultXml)));
				
				ExtensionObject extensionObject = extensionObjectFactory.createExtensionObject();
				extensionObject.setTypeId(extensionObjectFactory.createNodeId(typeId));
				extensionObject.setBody(extensionObjectFactory.createExtensionObjectBody(uaxBody));
				
				listOfExtensions.getExtensionObject().add(extensionObject);
			}			
			UAKeyVariable.getValue().setAny(extensionObjectFactory.createListOfExtensionObject(listOfExtensions));
		}
		ctx.registerReferenceMapped(target, source);
	}

}
