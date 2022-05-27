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
import java.util.Optional;

import org.opcfoundation.ua._2011._03.uanodeset.LocalizedText;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASUtils;
import io.adminshell.aas.v3.model.Asset;
import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.model.Constraint;
import io.adminshell.aas.v3.model.EmbeddedDataSpecification;
import io.adminshell.aas.v3.rc02.model.HasDataSpecification;
import io.adminshell.aas.v3.rc02.model.HasKind;
import io.adminshell.aas.v3.rc02.model.HasSemantics;
import io.adminshell.aas.v3.model.Identifier;
import io.adminshell.aas.v3.model.KeyType;
import io.adminshell.aas.v3.rc02.model.LangString;
import io.adminshell.aas.v3.rc02.model.ModelingKind;
import io.adminshell.aas.v3.rc02.model.Qualifiable;
import io.adminshell.aas.v3.rc02.model.Referable;
import io.adminshell.aas.v3.rc02.model.impl.DefaultKey;
import io.adminshell.aas.v3.rc02.model.impl.DefaultReference;

public abstract class ReferableParser<T extends Referable> extends I4AASParser<T> {

	public ReferableParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected void parseAndAttachChildren() {
		target.setIdShort(source.getBrowseNameStringPart());

		for (LocalizedText localizedText : source.getDescription()) {
			LangString langString = new LangString(localizedText.getValue(), localizedText.getLocale());
			target.getDescriptions().add(langString);
		}

		for (LocalizedText localizedText : source.getDisplayName()) {
			String displayName = I4AASUtils.parseDisplayName(target, localizedText.getValue());
			LangString langString = new LangString(displayName, localizedText.getLocale());
			target.getDisplayNames().add(langString);
		}

		Optional<UANodeWrapper> i4aasCategoryProperty = source.getI4AASProperty(CATEGORY_BROWSENAME);
		if (i4aasCategoryProperty.isPresent()) {
			UAVariable nodeVariable = i4aasCategoryProperty.get().getNodeVariable();
			target.setCategory(ParserUtils.extractValueAsString(nodeVariable));
		}

		if (target instanceof HasDataSpecification) {
			parseHasDataSpecification((HasDataSpecification) target);
		}

		if (target instanceof Qualifiable) {
			parseQualifiable((Qualifiable) target);
		}

		if (target instanceof HasKind) {
			parseHasKind((HasKind) target);
		}

		if (target instanceof HasSemantics) {
			parseSemantics((HasSemantics) target);
		}
	}

	private void parseSemantics(HasSemantics target) {
		//TODO I4AAS currently lacks with handling of KeyElements within ConceptDescriptions
		source.getAASDictionaryEntry().ifPresent(p -> {
			ConceptDescription cd = new ConceptDescriptionParser(p, ctx).parse();
			Identifier identification = cd.getIdentification();
			target.setSemanticId(new DefaultReference.Builder()
					.key(new DefaultKey.Builder().idType(KeyType.valueOf(identification.getIdType().name()))
							.value(identification.getIdentifier()).build())
					.build());
		});

	}

	private void parseHasKind(HasKind target) {
		source.getI4AASProperty("ModelingKind").ifPresent(p -> {
			ModelingKind parse = (ModelingKind) new I4AASGenericEnumParser(p, ctx, ModelingKind.class).parse();
			target.setKind(parse);
		});
	}

	private void parseQualifiable(Qualifiable target) {
		source.getI4AASComponent(QUALIFIABLE_BROWSENAME).ifPresent(p -> {
			p.getComponentsOfType(I4AASIdentifier.AASQualifierType).forEach(q -> {
				Constraint parse = new QualifierParser(q, ctx).parse();
				target.getQualifiers().add(parse);
			});
		});
	}

	private void parseHasDataSpecification(HasDataSpecification target) {
		source.getI4AASComponent(DATASPECIFICATION_BROWSENAME).ifPresent(uaDataSpec -> {
			List<EmbeddedDataSpecification> listOfEmbeddedDataSpecification = new DataSpecificationsParser(uaDataSpec,
					ctx).parse();
			target.setEmbeddedDataSpecifications(listOfEmbeddedDataSpecification);
		});
	}

}
