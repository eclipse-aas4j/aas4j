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
package io.adminshell.aas.v3.dataformat.i4aas.parsers;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.opcfoundation.ua._2008._02.types.ExtensionObject;
import org.opcfoundation.ua._2008._02.types.ListOfExtensionObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable.Value;
import org.opcfoundation.ua.i4aas.v3.types.AASKeyDataType;
import org.w3c.dom.Node;

import io.adminshell.aas.v3.rc02.model.Key;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.impl.DefaultReference;

public class ReferenceParser extends I4AASParser<Reference> {

	static JAXBContext aasKeyJaxbCtx;
	static {
		try {
			aasKeyJaxbCtx = org.eclipse.persistence.jaxb.JAXBContextFactory
					.createContext(new Class[] { AASKeyDataType.class }, null);
		} catch (JAXBException e) {
			new IllegalStateException("Unable to create JAXBContext to unmarshal reference keys.", e);
		}
	}

	public ReferenceParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected Reference createTargetObject() {
		return new DefaultReference();
	}

	@Override
	protected void parseAndAttachChildren() {
		Value value = source.getNodeVariable().getValue();
		if (value != null && value.getAny() instanceof JAXBElement) {
			JAXBElement<ListOfExtensionObject> jaxb_leo = (JAXBElement<ListOfExtensionObject>) value.getAny();
			List<ExtensionObject> keysExtObjList = jaxb_leo.getValue().getExtensionObject();
			for (ExtensionObject keyExtObj : keysExtObjList) {
				Object nodeWithKey = keyExtObj.getBody().getValue().getAny();
				try {
					JAXBElement<AASKeyDataType> jaxb_aasKeyDataType = aasKeyJaxbCtx.createUnmarshaller()
							.unmarshal((Node) nodeWithKey, AASKeyDataType.class);
					AASKeyDataType aasKeyDataType = jaxb_aasKeyDataType.getValue();
					Key parse = new KeyParser(aasKeyDataType, ctx).parse();
					target.getKeys().add(parse);
				} catch (Exception e) {
					new UnsupportedOperationException("Unable to read AASKeyDataType from content.", e);
				}
			}
		}
	}

}
