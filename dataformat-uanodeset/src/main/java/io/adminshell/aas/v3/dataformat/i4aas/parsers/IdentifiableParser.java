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

import io.adminshell.aas.v3.model.EmbeddedDataSpecification;
import io.adminshell.aas.v3.model.Identifiable;
import io.adminshell.aas.v3.model.IdentifierType;
import io.adminshell.aas.v3.model.impl.DefaultAdministrativeInformation;
import io.adminshell.aas.v3.model.impl.DefaultIdentifier;

public abstract class IdentifiableParser<T extends Identifiable> extends ReferableParser<T> {

	public IdentifiableParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected void parseAndAttachChildren() {
		super.parseAndAttachChildren();
		
		Optional<UANodeWrapper> uaIdentification = source.getI4AASComponent(IDENTIFICATION_BROWSENAME);
		uaIdentification.ifPresent(uaNode -> {
			target.setIdentification(new DefaultIdentifier());
			uaNode.getI4AASProperty(IDENTIFICATION_ID_BROWSENAME).ifPresent(id -> {
				target.getIdentification().setIdentifier(ParserUtils.extractValueAsString(id.getNodeVariable()));
			});
			uaNode.getI4AASProperty(IDENTIFICATION_IDTYPE_BROWSENAME).ifPresent(idType -> {
				IdentifierType parsedIdType;
				parsedIdType = (IdentifierType) new I4AASGenericEnumParser(idType, ctx, IdentifierType.class).parse();
				target.getIdentification().setIdType(parsedIdType);
			});
		});
		
		Optional<UANodeWrapper> uaAdministration = source.getI4AASComponent(ADMINISTRATION_BROWSENAME);
		uaAdministration.ifPresent(uaNode -> {
			target.setAdministration(new DefaultAdministrativeInformation());
			uaNode.getI4AASProperty(ADMINISTRATION_VERSION_BROWSENAME).ifPresent(uaVar -> {
				target.getAdministration().setVersion(ParserUtils.extractValueAsString(uaVar.getNodeVariable()));
			});
			uaNode.getI4AASProperty(ADMINISTRATION_REVISION_BROWSENAME).ifPresent(uaVar -> {
				target.getAdministration().setRevision(ParserUtils.extractValueAsString(uaVar.getNodeVariable()));
			});
			
			
			uaNode.getI4AASComponent(DATASPECIFICATION_BROWSENAME).ifPresent(uaDataSpec -> {
				List<EmbeddedDataSpecification> listOfEmbeddedDataSpecification = new DataSpecificationsParser(uaDataSpec, ctx).parse();
				target.getAdministration().setEmbeddedDataSpecifications(listOfEmbeddedDataSpecification);
			});
		});
		
	}

}
