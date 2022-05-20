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

public enum I4AASIdentifier implements BasicIdentifier {

	AASAssetAdministrationShellType("AASAssetAdministrationShellType", 1002),
	AASReferableType("AASReferableType", 1003),
	AASReferenceType("AASReferenceType", 1004),
	AASAssetType("AASAssetType", 1005),
	AASSubmodelType("AASSubmodelType", 1006),
	AASIdentifiableType("AASIdentifiableType", 1007),
	AASEnvironmentType("AASEnvironmentType",1008),
	AASSubmodelElementType("AASSubmodelElementType", 1009),
	AASSubmodelElementCollectionType("AASSubmodelElementCollectionType", 1010),
	AASOrderedSubmodelElementCollectionType("AASOrderedSubmodelElementCollectionType", 1011),
	AASMultiLanguagePropertyType("AASMultiLanguagePropertyType", 1012),
	AASPropertyType("AASPropertyType", 1013),
	AASCapabilityType("AASCapabilityType", 1014),
	AASOperationType("AASOperationType", 1015),
	AASBlobType("AASBlobType", 1016),
	AASFileType("AASFileType", 1017),
	AASRelationshipElementType("AASRelationshipElementType", 1018),
	AASAnnotatedRelationshipElementType("AASAnnotatedRelationshipElementType", 1019),
	AASReferenceElementType("AASReferenceElementType", 1020),
	AASEventType("AASEventType", 1021),
	AASEntityType("AASEntityType", 1022),
	AASRangeType("AASRangeType", 1023),
	AASIrdiConceptDescriptionType("AASIrdiConceptDescriptionType", 1024),
	AASIriConceptDescriptionType("AASIriConceptDescriptionType", 1025),
	AASCustomConceptDescriptionType("AASCustomConceptDescriptionType", 1026),
	AASDataSpecificationType("AASDataSpecificationType", 1027),
	AASDataSpecificationIEC61360Type("AASDataSpecificationIEC61360Type", 1028),
	AASIdentifierType("AASIdentifierType", 1029),
	AASAdministrativeInformationType("AASAdministrativeInformationType", 1030),
	AASAssetInformationType("AASAssetInformationType", 1031),
	AASQualifierType("AASQualifierType", 1032),
	IAASReferableType("IAASReferableType", 1033),
	IAASIdentifiableType("IAASIdentifiableType", 1034),
	AASIdentifierKeyValuePairType("AASIdentifierKeyValuePairType", 1035),
	AASReferenceList("AASReferenceList",1036),
	AASQualifierList("AASQualifierList",1037),
	AASSubmodelElementList("AASSubmodelElementList",1038),
	AASIdentifierKeyValuePairList("AASIdentifierKeyValuePairList",1039),
	AASKeyTypeDataType("AASKeyTypeDataType", 3002),
	AASAssetKindDataType("AASAssetKindDataType", 3003),
	AASValueTypeDataType("AASValueTypeDataType", 3004),
	AASPathDataType("AASPathDataType", 3005),
	AASEntityTypeDataType("AASEntityTypeDataType", 3006),
	AASCategoryDataType("AASCategoryDataType", 3007),
	AASDataTypeIEC61360DataType("AASDataTypeIEC61360DataType", 3008),
	AASLevelTypeDataType("AASLevelTypeDataType", 3009),
	AASIdentifierTypeDataType("AASIdentifierTypeDataType", 3010),
	AASKeyDataType("AASKeyDataType", 3011),
	AASKeyElementsDataType("AASKeyElementsDataType", 3012),
	AASQualifierDataType("AASQualifierDataType", 3013),
	AASPropertyValueDataType("AASPropertyValueDataType", 3014),
	AASModelingKindDataType("AASModelingKindDataType", 3015),
	AASMimeDataType("AASMimeDataType", 3016),
	AASKeyDataType_Encoding_DefaultXml("AASKeyDataType_Encoding_DefaultXml",5039),
	AASOperationType_Operation("AASOperationType_Operation",7001),
	AASFileType_File_Close("AASFileType_File_Close",7008),
	AASFileType_File_GetPosition("AASFileType_File_GetPosition",7009),
	AASFileType_File_Open("AASFileType_File_Open",7010),
	AASFileType_File_Read("AASFileType_File_Read",7011),
	AASFileType_File_SetPosition("AASFileType_File_SetPosition",7012),
	AASFileType_File_Write("AASFileType_File_Write",7013);

	private String name;
	private Integer id;

	private I4AASIdentifier(String name, Integer id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

}
