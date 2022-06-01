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
package io.adminshell.aas.v3.dataformat.i4aas.mappers.utils;

import java.util.UUID;

import org.opcfoundation.ua._2011._03.uanodeset.LocalizedText;
import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;

import io.adminshell.aas.v3.model.Asset;
import org.eclipse.aas4j.v3.rc02.model.AssetAdministrationShell;
import org.eclipse.aas4j.v3.rc02.model.Referable;
import org.eclipse.aas4j.v3.rc02.model.Submodel;

public class I4AASUtils {

	public static String generateRandomNamespace(UANodeSet nodeset) {
		return "http://example.org/i4aasNs/" + UUID.randomUUID() + "/";
	}

	public static LocalizedText createDisplayName(Referable ref) {
		if (ref instanceof Submodel) {
			return LocalizedText.builder().withValue(I4AASConstants.SM_DISPLAYNAME_PREFIX + ref.getIdShort()).build();
		} else if (ref instanceof AssetAdministrationShell) {
			return LocalizedText.builder().withValue(I4AASConstants.AAS_DISPLAYNAME_PREFIX + ref.getIdShort()).build();
		} else if (ref instanceof Asset) {
			return LocalizedText.builder().withValue(I4AASConstants.ASSET_DISPLAYNAME_PREFIX + ref.getIdShort())
					.build();
		} else {
			return LocalizedText.builder().withValue(ref.getIdShort()).build();
		}
	}
	
	public static String parseDisplayName(Referable ref, String rawstring) {
		if (rawstring == null) {
			return null;
		}
		if (ref instanceof Submodel && rawstring.startsWith(I4AASConstants.SM_DISPLAYNAME_PREFIX)) {
			return rawstring.substring(I4AASConstants.SM_DISPLAYNAME_PREFIX.length());
		} else if (ref instanceof AssetAdministrationShell
				&& rawstring.startsWith(I4AASConstants.AAS_DISPLAYNAME_PREFIX)) {
			return rawstring.substring(I4AASConstants.AAS_DISPLAYNAME_PREFIX.length());
		} else if (ref instanceof Asset && rawstring.startsWith(I4AASConstants.ASSET_DISPLAYNAME_PREFIX)) {
			return rawstring.substring(I4AASConstants.ASSET_DISPLAYNAME_PREFIX.length());
		} else {
			return rawstring;
		}
	}
	
}
