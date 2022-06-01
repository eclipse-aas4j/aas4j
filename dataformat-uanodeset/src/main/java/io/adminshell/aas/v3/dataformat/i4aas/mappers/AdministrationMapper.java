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
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import org.eclipse.aas4j.v3.rc02.model.AdministrativeInformation;

public class AdministrationMapper extends I4AASMapper<AdministrativeInformation, UAObject>
		implements HasDataSpecificationMapper {

	public AdministrationMapper(AdministrativeInformation src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		target = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString())
				.withBrowseName(createI4AASBrowseName(ADMINISTRATION_BROWSENAME))
				.withDisplayName(createLocalizedText(ADMINISTRATION_BROWSENAME)).build();
		addTypeReference(I4AASIdentifier.AASAdministrativeInformationType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		if (source != null) {
			String revision = source.getRevision();
			if (revision != null) {
				UAVariable revisionStringProperty = new StringPropertyMapper(ADMINISTRATION_REVISION_BROWSENAME, revision, ctx,
						ctx.getI4aasNsIndex()).map();
				attachAsProperty(target, revisionStringProperty);
			}
			String version = source.getVersion();
			if (version != null) {
				UAVariable versionStringProperty = new StringPropertyMapper(ADMINISTRATION_VERSION_BROWSENAME, version, ctx,
						ctx.getI4aasNsIndex()).map();
				attachAsProperty(target, versionStringProperty);
			}
			mapDataSpecification(source, target, ctx);
		}
	}

}
