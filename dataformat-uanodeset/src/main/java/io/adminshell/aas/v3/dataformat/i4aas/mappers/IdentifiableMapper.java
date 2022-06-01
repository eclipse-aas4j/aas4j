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

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject.Builder;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import org.eclipse.aas4j.v3.rc02.model.Identifiable;
import io.adminshell.aas.v3.model.Identifier;
import io.adminshell.aas.v3.model.IdentifierType;

public class IdentifiableMapper<T extends Identifiable> extends ReferableMapper<T> {

	public IdentifiableMapper(T src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		return super.createTargetObject();
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();
		mapIdentification();
		mapAdministration();
	}

	private void mapIdentification() {
		Builder<Void> coreUAObject = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString())
				.withDisplayName(createLocalizedText(IDENTIFICATION_BROWSENAME))
				.withBrowseName(createI4AASBrowseName(IDENTIFICATION_BROWSENAME));
		UAObject uaObject = coreUAObject.build();
		addTypeReferenceFor(uaObject, I4AASIdentifier.AASIdentifierType);
		addToNodeset(uaObject);
		attachAsComponent(target, uaObject);

		Identifier identification = source.getIdentification();
		if (identification != null) {
			IdentifierType sourceIdType = identification.getIdType();
			String sourceIdentifierValue = identification.getIdentifier();
			UAVariable targetIdVar = new StringPropertyMapper(IDENTIFICATION_ID_BROWSENAME, sourceIdentifierValue, ctx,
					ctx.getI4aasNsIndex()).map();
			attachAsProperty(uaObject, targetIdVar);
			UAVariable mappedEnum = new I4AASEnumMapper(sourceIdType, ctx).map();
			attachAsProperty(uaObject, mappedEnum);
		}
	}

	private void mapAdministration() {
		if (source.getAdministration() != null) {
			UAObject uaAdministration = new AdministrationMapper(source.getAdministration(), ctx).map();
			attachAsComponent(target, uaAdministration);
		}
	}

}
