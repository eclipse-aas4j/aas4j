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

public interface I4AASConstants {

	public final String UA_MODEL_URI = "http://opcfoundation.org/UA/";
	public final String UA_PUBDATE = "2020-07-15T00:00:00Z";
	public final String UA_VERSION = "1.04.7";

	public final String I4AAS_MODEL_URI = "http://opcfoundation.org/UA/I4AAS/V3/";
	public final String I4AAS_PUBDATE = "2021-06-04T00:00:00Z";
	public final String I4AAS_VERSION = "1.0.0";

	public final static String AAS_DISPLAYNAME_PREFIX = "AAS:";
	public final static String ASSET_DISPLAYNAME_PREFIX = "Asset:";
	public final static String SM_DISPLAYNAME_PREFIX = "Submodel:";

	public static final String CATEGORY_BROWSENAME = "Category";
	
	public static final String IDENTIFICATION_BROWSENAME = "Identification";
	public static final String IDENTIFICATION_ID_BROWSENAME = "Id";
	public static final String IDENTIFICATION_IDTYPE_BROWSENAME = "IdType";
	public static final String IDENTIFICATION_DATATYPE_BROWSENAME = "DataType";
	
	public static final String ADMINISTRATION_BROWSENAME = "Administration";
	public static final String ADMINISTRATION_REVISION_BROWSENAME = "Revision";
	public static final String ADMINISTRATION_VERSION_BROWSENAME = "Version";
	
	public static final String DATASPECIFICATION_BROWSENAME = "DataSpecification";
	public static final String QUALIFIABLE_BROWSENAME = "Qualifier";
	
	public static final String AAS_SUBMODELREFERENCES_LIST_BROWSENAME = "Submodel";
	public static final String AAS_DERIVEDFROM_BROWSENAME = "DerivedFrom";
	public static final String AAS_ASSETINFORMATION_BROWSENAME = "AssetInformation";

	public static final String REFERENCE_KEYS_BROWSENAME = "Keys";
	
	public static final String IEC61360_SHORT_NAME_BROWSENAME = "ShortName";
	public static final String IEC61360_PREFERRED_NAME_BROWSENAME = "PreferredName";
	public static final String IEC61360_DEFINITION_BROWSENAME = "Definition";
	public static final String IEC61360_VALUE_ID_BROWSENAME = "ValueId";
	public static final String IEC61360_UNIT_ID_BROWSENAME = "UnitId";
	public static final String IEC61360_VALUE_BROWSENAME = "Value";
	public static final String IEC61360_VALUE_FORMAT_BROWSENAME = "ValueFormat";
	public static final String IEC61360_UNIT_BROWSENAME = "Unit";
	public static final String IEC61360_SYMBOL_BROWSENAME = "Symbol";
	public static final String IEC61360_SOURCE_OF_DEFINITION_BROWSENAME = "SourceOfDefinition";

	public static final String ASSETINFO_SPECIFIC_ASSET_ID_BROWSENAME = "SpecificAssetId";
	public static final String ASSETINFO_DEFAULT_THUMBNAIL_BROWSENAME = "DefaultThumbnail";
	public static final String ASSETINFO_BILL_OF_MATERIAL_BROWSENAME = "BillOfMaterial";
	public static final String ASSETINFO_GLOBAL_ASSET_ID_BROWSENAME = "GlobalAssetId";

	public static final String IKVP_EXTERNAL_SUBJECT_ID_BROWSENAME = "ExternalSubjectId";
	public static final String IKVP_KEY_BROWSENAME = "Key";
	public static final String IKVP_VALUE_BROWSENAME = "Value";
	
	public static final String MIME_TYPE_BROWSENAME = "MimeType";
	public static final String QUALIFIER_TYPE_BROWSENAME = "Type";


}
