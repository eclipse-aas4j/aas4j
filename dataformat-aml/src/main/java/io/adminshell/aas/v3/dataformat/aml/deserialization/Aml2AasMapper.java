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
package io.adminshell.aas.v3.dataformat.aml.deserialization;

import io.adminshell.aas.v3.dataformat.aml.deserialization.mappers.*;
import io.adminshell.aas.v3.dataformat.aml.AmlDeserializationConfig;
import io.adminshell.aas.v3.dataformat.aml.AmlDocumentInfo;
import io.adminshell.aas.v3.dataformat.aml.model.caex.CAEXFile;
import io.adminshell.aas.v3.dataformat.aml.common.naming.AbstractClassNamingStrategy;
import io.adminshell.aas.v3.dataformat.aml.common.naming.NumberingClassNamingStrategy;
import io.adminshell.aas.v3.dataformat.aml.common.naming.PropertyNamingStrategy;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.dataformat.mapping.MappingProvider;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.AssetInformation;
import io.adminshell.aas.v3.model.Identifiable;
import io.adminshell.aas.v3.model.MultiLanguageProperty;
import io.adminshell.aas.v3.model.Referable;
import io.adminshell.aas.v3.model.Qualifiable;

import java.util.List;

/**
 * Maps an AML file to an AssetAdministrationShellEnvironment
 */
public class Aml2AasMapper {

    private final AmlDeserializationConfig config;

    public Aml2AasMapper(AmlDeserializationConfig config) {
        this.config = config;
    }

    /**
     * Maps an AML file (represented by a CAEXFile) to an
     * AssetAdministrationShellEnvironment
     *
     * @param aml the AML source file to map
     * @return AssetAdministrationShellEnvironment representation
     * @throws MappingException if the mapping fails
     */
    public AssetAdministrationShellEnvironment map(CAEXFile aml) throws MappingException {
        // unclear how to handle additional information
        List<Object> additionalInformation = aml.getAdditionalInformation();
        AmlParser parser = new AmlParser(aml);
        MappingProvider mappingProvider = new MappingProvider(Mapper.class, new DefaultMapper(), new DefaultMapper());
        mappingProvider.register(new AssetAdministrationShellEnvironmentMapper());
        mappingProvider.register(new EnumMapper());
        mappingProvider.register(new ReferenceMapper());
        mappingProvider.register(new AssetAdministrationShellMapper());
        mappingProvider.register(new LangStringCollectionMapper());
        mappingProvider.register(new RelationshipElementMapper());
        mappingProvider.register(new ReferenceElementMapper());
        mappingProvider.register(new ReferableMapper<>());
        mappingProvider.register(new IdentifiableMapper<>());
        mappingProvider.register(new ConstraintCollectionMapper());
        mappingProvider.register(new QualifierMapper());
        mappingProvider.register(new OperationCollectionMapper());
        mappingProvider.register(new FileMapper());
        mappingProvider.register(new RangeMapper());
        mappingProvider.register(new ViewMapper());
        mappingProvider.register(new PropertyMapper());
        mappingProvider.register(new ConceptDescriptionMapper());
        mappingProvider.register(new EmbeddedDataSpecificationCollectionMapper());
        mappingProvider.register(new DataSpecificationIEC61360Mapper());
        mappingProvider.register(new EnumDataTypeIEC61360Mapper());
        mappingProvider.register(new IdentifierKeyValuePairCollectionMapper());

        AbstractClassNamingStrategy classNamingStrategy = new NumberingClassNamingStrategy();

        PropertyNamingStrategy propertyNamingStrategy = new PropertyNamingStrategy();
        propertyNamingStrategy.registerCustomNaming(Referable.class, "descriptions", "description");
        propertyNamingStrategy.registerCustomNaming(MultiLanguageProperty.class, "values", "value");
        propertyNamingStrategy.registerCustomNaming(Qualifiable.class, "qualifiers", "qualifier", "qualifier");
        propertyNamingStrategy.registerCustomNaming(AssetInformation.class, "specificAssetIds", "specificAssetId");
        MappingContext context = new MappingContext(mappingProvider, classNamingStrategy, propertyNamingStrategy, config.getTypeFactory());
        context.setDocumentInfo(AmlDocumentInfo.fromFile(aml));
        AssetAdministrationShellEnvironment result = context.map(AssetAdministrationShellEnvironment.class, parser);
        parser.resolveIdsToReferences(result);
        return result;
    }
}
