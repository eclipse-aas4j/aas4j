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

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.opcfoundation.ua._2008._02.types.ListOfLocalizedText;
import org.opcfoundation.ua._2008._02.types.LocalizedText;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable.Value;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.rc02.model.AnnotatedRelationshipElement;
import io.adminshell.aas.v3.rc02.model.Blob;
import io.adminshell.aas.v3.rc02.model.Capability;
import io.adminshell.aas.v3.rc02.model.Entity;
import io.adminshell.aas.v3.model.Event;
import io.adminshell.aas.v3.rc02.model.File;
import io.adminshell.aas.v3.rc02.model.LangString;
import io.adminshell.aas.v3.rc02.model.MultiLanguageProperty;
import io.adminshell.aas.v3.rc02.model.Operation;
import io.adminshell.aas.v3.rc02.model.Property;
import io.adminshell.aas.v3.rc02.model.Range;
import io.adminshell.aas.v3.rc02.model.ReferenceElement;
import io.adminshell.aas.v3.rc02.model.RelationshipElement;
import io.adminshell.aas.v3.rc02.model.SubmodelElement;
import io.adminshell.aas.v3.rc02.model.SubmodelElementCollection;

public class ParserUtils {

	public static String extractValueAsString(UAVariable nodeVariable) {
		Value uaValue = nodeVariable.getValue();
		if (uaValue != null) {
			Object any = uaValue.getAny();
			if (any instanceof JAXBElement<?>) {
				JAXBElement<?> anyJaxbElement = (JAXBElement<?>) any;
				if (anyJaxbElement.getValue() instanceof String) {
					return (String) anyJaxbElement.getValue();
				} else if (anyJaxbElement.getValue() != null) {
					new UnsupportedOperationException(
							"Unsupported Type " + anyJaxbElement.getValue().getClass().getName());
				}
			} else if (any != null) {
				new UnsupportedOperationException("Unsupported Type " + any.getClass().getName());
			}
		}
		return null;
	}

	public static Integer extractValueAsInteger(UAVariable nodeVariable) {
		Value uaValue = nodeVariable.getValue();
		if (uaValue != null) {
			Object any = uaValue.getAny();
			if (any instanceof JAXBElement<?>) {
				JAXBElement<?> anyJaxbElement = (JAXBElement<?>) any;
				if (anyJaxbElement.getValue() instanceof Integer) {
					return (Integer) anyJaxbElement.getValue();
				} else if (anyJaxbElement.getValue() != null) {
					new UnsupportedOperationException(
							"Unsupported Type " + anyJaxbElement.getValue().getClass().getName());
				}
			} else if (any != null) {
				new UnsupportedOperationException("Unsupported Type " + any.getClass().getName());
			}
		}
		return null;
	}

	public static List<LangString> extractValueAsLangString(UAVariable nodeVariable) {
		List<LangString> result = new ArrayList<>();
		Value uaValue = nodeVariable.getValue();
		if (uaValue != null) {
			Object any = uaValue.getAny();
			if (any instanceof JAXBElement<?>) {
				JAXBElement<?> anyJaxbElement = (JAXBElement<?>) any;
				if (anyJaxbElement.getValue() instanceof ListOfLocalizedText) {
					List<LocalizedText> localizedTexts = ((ListOfLocalizedText) anyJaxbElement.getValue())
							.getLocalizedText();
					for (LocalizedText localizedText : localizedTexts) {
						LangString langString = new LangString(localizedText.getText().getValue(),
								localizedText.getLocale().getValue());
						result.add(langString);
					}
				} else if (anyJaxbElement.getValue() != null) {
					new UnsupportedOperationException(
							"Unsupported Type " + anyJaxbElement.getValue().getClass().getName());
				}
			} else if (any != null) {
				new UnsupportedOperationException("Unsupported Type " + any.getClass().getName());
			}
		}
		return result;
	}

	public static byte[] extractValueAsByteString(UAVariable nodeVariable) {
		String byteString = extractValueAsString(nodeVariable);
		if (byteString == null) {
			return null;
		}
		byte[] bytes = Base64.getDecoder().decode(byteString);
		return bytes;
	}
	

	public static Boolean extractValueAsBoolean(UAVariable nodeVariable) {
		Value uaValue = nodeVariable.getValue();
		if (uaValue != null) {
			Object any = uaValue.getAny();
			if (any instanceof JAXBElement<?>) {
				JAXBElement<?> anyJaxbElement = (JAXBElement<?>) any;
				if (anyJaxbElement.getValue() instanceof Boolean) {
					return (Boolean) anyJaxbElement.getValue();
				} else if (anyJaxbElement.getValue() != null) {
					new UnsupportedOperationException(
							"Unsupported Type " + anyJaxbElement.getValue().getClass().getName());
				}
			} else if (any != null) {
				new UnsupportedOperationException("Unsupported Type " + any.getClass().getName());
			}
		}
		return null;
	}

	public static SubmodelElement parseSME(UANodeWrapper source, ParserContext ctx) {

		if (source.getType().equals(I4AASIdentifier.AASBlobType)) {
			Blob parse = new BlobParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASCapabilityType)) {
			Capability parse = new CapabilityParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASEntityType)) {
			Entity parse = new EntityParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASEventType)) {
			Event parse = new EventParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASFileType)) {
			File parse = new FileParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASMultiLanguagePropertyType)) {
			MultiLanguageProperty parse = new MultiLanguagePropertyParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASOperationType)) {
			Operation parse = new OperationParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASPropertyType)) {
			Property parse = new PropertyParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASRangeType)) {
			Range parse = new RangeParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASReferenceElementType)) {
			ReferenceElement parse = new ReferenceElementParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASRelationshipElementType)) {
			RelationshipElement parse = new RelationshipElementParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASAnnotatedRelationshipElementType)) {
			AnnotatedRelationshipElement parse = new AnnotatedRelationshipElementParser(source, ctx).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASSubmodelElementCollectionType)) {
			SubmodelElementCollection parse = new SubmodelElementCollectionParser(source, ctx, false).parse();
			return parse;
		}

		if (source.getType().equals(I4AASIdentifier.AASOrderedSubmodelElementCollectionType)) {
			SubmodelElementCollection parse = new SubmodelElementCollectionParser(source, ctx, true).parse();
			return parse;
		}
		
		return null;
	}

}
