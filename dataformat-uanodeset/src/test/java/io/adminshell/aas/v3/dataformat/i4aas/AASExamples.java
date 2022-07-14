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

import org.eclipse.aas4j.v3.rc02.model.AssetAdministrationShell;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import org.eclipse.aas4j.v3.rc02.model.AssetKind;
import io.adminshell.aas.v3.model.DataTypeIEC61360;
import io.adminshell.aas.v3.model.IdentifierType;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import org.eclipse.aas4j.v3.rc02.model.LangString;
import org.eclipse.aas4j.v3.rc02.model.ModelingKind;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultAdministrativeInformation;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultAssetAdministrationShell;
import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultAssetInformation;
import io.adminshell.aas.v3.model.impl.DefaultDataSpecificationIEC61360;
import io.adminshell.aas.v3.model.impl.DefaultEmbeddedDataSpecification;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultFile;
import io.adminshell.aas.v3.model.impl.DefaultIdentifier;
import io.adminshell.aas.v3.model.impl.DefaultIdentifierKeyValuePair;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultKey;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultReference;

public class AASExamples {

	private AASExamples() {
	}

	private static final AssetAdministrationShell AAS_1 = new DefaultAssetAdministrationShell.Builder()
			.idShort("aas_idshort")
			.identification(new DefaultIdentifier.Builder().idType(IdentifierType.IRI)
					.identifier("http://aas.org/example").build())
			.assetInformation(new DefaultAssetInformation.Builder().assetKind(AssetKind.INSTANCE)
					.globalAssetId(new DefaultReference.Builder().key(new DefaultKey.Builder().type(KeyElements.ASSET)
							.value("http://asset.org/example").idType(KeyType.IRI).build()).build())
					.specificAssetId(new DefaultIdentifierKeyValuePair.Builder().key("testkey").value("testvalue")
							.externalSubjectId(new DefaultReference.Builder()
									.key(new DefaultKey.Builder().type(KeyElements.GLOBAL_REFERENCE)
											.value("http://externalsubjectid.org/example").idType(KeyType.IRI).build())
									.build())
							.build())
					.defaultThumbnail(new DefaultFile.Builder().kind(ModelingKind.INSTANCE).idShort("thumbnail")
							.mimeType("image/png").value("http://image.org/example.png").build())
					.build())
			.administration(
					new DefaultAdministrativeInformation.Builder().version("1.0").revision("b")
							.embeddedDataSpecification(new DefaultEmbeddedDataSpecification.Builder()
									.dataSpecification(new DefaultReference.Builder()
											.key(new DefaultKey.Builder().type(KeyElements.CONCEPT_DESCRIPTION)
													.value("http://dataspec.org/example").idType(KeyType.IRI).build())
											.build())
									.dataSpecificationContent(new DefaultDataSpecificationIEC61360.Builder()
											.dataType(DataTypeIEC61360.BOOLEAN)
											.definition(new LangString("mydefinition", "en")).symbol("iec61360_symbol")
											.build())
									.build())
							.build())
			.build();

	public static final AssetAdministrationShellEnvironment AAS_ENV_1 = new DefaultAssetAdministrationShellEnvironment.Builder()
			.assetAdministrationShells(AAS_1).build();
}
