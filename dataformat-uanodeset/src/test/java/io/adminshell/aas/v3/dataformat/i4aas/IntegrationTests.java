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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import org.apache.jena.shacl.ValidationReport;
import org.apache.jena.shacl.validation.ReportEntry;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import io.adminshell.aas.v3.dataformat.DeserializationException;
import io.adminshell.aas.v3.dataformat.SerializationException;
import io.adminshell.aas.v3.dataformat.core.AASFull;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.json.JsonSerializer;
import io.adminshell.aas.v3.model.Asset;
import org.eclipse.aas4j.v3.rc02.model.AssetAdministrationShell;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import org.eclipse.aas4j.v3.rc02.model.AssetInformation;
import org.eclipse.aas4j.v3.rc02.model.AssetKind;
import org.eclipse.aas4j.v3.rc02.model.Blob;
import org.eclipse.aas4j.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import io.adminshell.aas.v3.model.IdentifierType;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import org.eclipse.aas4j.v3.rc02.model.LangString;
import org.eclipse.aas4j.v3.rc02.model.MultiLanguageProperty;
import org.eclipse.aas4j.v3.rc02.model.Submodel;
import org.eclipse.aas4j.v3.rc02.model.SubmodelElementCollection;
import io.adminshell.aas.v3.model.impl.DefaultAsset;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultAssetAdministrationShell;
import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultAssetInformation;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultBlob;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultConceptDescription;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultFile;
import io.adminshell.aas.v3.model.impl.DefaultIdentifier;
import io.adminshell.aas.v3.model.impl.DefaultIdentifierKeyValuePair;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultKey;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultMultiLanguageProperty;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultReference;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultSubmodel;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultSubmodelElementCollection;
import io.adminshell.aas.v3.model.validator.ShaclValidator;
import io.adminshell.aas.v3.model.validator.ValidationException;

public class IntegrationTests {

	private I4AASSerializer serializer;
	private I4AASDeserializer deserializer;

	private AssetAdministrationShellEnvironment env;
	private AssetAdministrationShell aas;
	private Asset asset;
	private Submodel sm;
	private ConceptDescription cd;

	@Before
	public void before() {
		MappingContext.setModelNamespaceNamingStrategy(nodeset -> "http://example.org/IntegrationTest");
		serializer = new I4AASSerializer();
		deserializer = new I4AASDeserializer();

		// test frame model
		env = new DefaultAssetAdministrationShellEnvironment();
		aas = new DefaultAssetAdministrationShell();
		aas.setIdShort("aas");
		asset = new DefaultAsset();
		asset.setIdShort("asset");
		sm = new DefaultSubmodel();
		sm.setIdShort("sm");
		cd = new DefaultConceptDescription();
		cd.setIdShort("cd");
		cd.setIdentification(new DefaultIdentifier.Builder().identifier("mycd").idType(IdentifierType.CUSTOM).build());
		env.getAssetAdministrationShells().add(aas);
		env.getAssets().add(asset);
		env.getSubmodels().add(sm);
		env.getConceptDescriptions().add(cd);
	}

	@Test
	public void testBlobWithSemantics() throws SerializationException, DeserializationException {
		// ARRANGE
		Blob blob = new DefaultBlob();
		blob.setMimeType("testmime");
		blob.setValue("testvalue".getBytes());
		blob.setIdShort("testblob");

		blob.setSemanticId(new DefaultReference.Builder().key(new DefaultKey.Builder().value("mySemanticId")
				.type(KeyElements.CONCEPT_DESCRIPTION).idType(KeyType.CUSTOM).build()).build());

		sm.getSubmodelElements().add(blob);

		// ACT
		AssetAdministrationShellEnvironment result = inAndOut();

		// ASSERT
		Blob submodelElement = (Blob) result.getSubmodels().get(0).getSubmodelElements().get(0);
		Assert.assertEquals(blob.getMimeType(), submodelElement.getMimeType());
		Assert.assertEquals(blob.getIdShort(), submodelElement.getIdShort());
		Assert.assertArrayEquals(blob.getValue(), submodelElement.getValue());

		Assert.assertEquals("mySemanticId", submodelElement.getSemanticId().getKeys().get(0).getValue());
		Assert.assertEquals(KeyType.CUSTOM, submodelElement.getSemanticId().getKeys().get(0).getIdType());
	}

	@Test
	public void testMultiLanguageProperty() throws SerializationException, DeserializationException {
		// ARRANGE
		MultiLanguageProperty defaultMultiLanguageProperty = new DefaultMultiLanguageProperty();
		defaultMultiLanguageProperty.setIdShort("mymultilang");

		List<LangString> values = new ArrayList<>();
		values.add(new LangString("delang", "de"));
		values.add(new LangString("enlang", "en"));
		defaultMultiLanguageProperty.setValues(values);
		sm.getSubmodelElements().add(defaultMultiLanguageProperty);

		// ACT
		AssetAdministrationShellEnvironment result = inAndOut();

		// ASSERT
		MultiLanguageProperty submodelElement = (MultiLanguageProperty) result.getSubmodels().get(0)
				.getSubmodelElements().get(0);
		Assert.assertEquals("de", submodelElement.getValues().get(0).getLanguage());
		Assert.assertEquals("delang", submodelElement.getValues().get(0).getValue());
		Assert.assertEquals("en", submodelElement.getValues().get(1).getLanguage());
		Assert.assertEquals("enlang", submodelElement.getValues().get(1).getValue());
	}

	@Test
	public void testSMECollection() throws SerializationException, DeserializationException {
		// ARRANGE
		SubmodelElementCollection smec = new DefaultSubmodelElementCollection();
		smec.setIdShort("collection");
		smec.setAllowDuplicates(true);
		smec.setOrdered(true);

		Blob blob = new DefaultBlob();
		blob.setMimeType("testmime");
		blob.setValue("testvalue".getBytes());
		blob.setIdShort("testblob");

		smec.getValues().add(blob);
		sm.getSubmodelElements().add(smec);

		// ACT
		AssetAdministrationShellEnvironment result = inAndOut();

		// ASSERT
		SubmodelElementCollection submodelElement = (SubmodelElementCollection) result.getSubmodels().get(0)
				.getSubmodelElements().get(0);
		Assert.assertEquals(true, submodelElement.getAllowDuplicates());
		Assert.assertEquals(true, submodelElement.getOrdered());
		Object[] smecContent = submodelElement.getValues().toArray();
		Assert.assertEquals("testblob", ((Blob) smecContent[0]).getIdShort());

	}

	@Test
	public void testAssetInformation() throws SerializationException, DeserializationException {
		// ARRANGE
		DefaultAssetInformation defaultAssetInformation = new DefaultAssetInformation();
		defaultAssetInformation.setAssetKind(AssetKind.TYPE);
		defaultAssetInformation.setDefaultThumbnail(new DefaultFile.Builder().value("/path/to/img.png").build());
		List<IdentifierKeyValuePair> list = new ArrayList<>();
		list.add(new DefaultIdentifierKeyValuePair.Builder().key("mykey").value("myvalue").build());
		defaultAssetInformation.setSpecificAssetIds(list);
		aas.setAssetInformation(defaultAssetInformation);

		// ACT
		AssetAdministrationShellEnvironment result = inAndOut();

		// ASSERT
		AssetInformation assetInformationResult = result.getAssetAdministrationShells().get(0).getAssetInformation();
		Assert.assertEquals(defaultAssetInformation.getAssetKind(), assetInformationResult.getAssetKind());
		Assert.assertEquals(defaultAssetInformation.getDefaultThumbnail().getValue(),
				assetInformationResult.getDefaultThumbnail().getValue());
		Assert.assertEquals(defaultAssetInformation.getSpecificAssetIds().get(0).getKey(),
				assetInformationResult.getSpecificAssetIds().get(0).getKey());
	}

	@Test
	public void testConceptDescription() throws SerializationException, DeserializationException {
		// ARRANGE
		cd.setIdentification(new DefaultIdentifier.Builder().identifier("myCD").idType(IdentifierType.CUSTOM).build());
		cd.getIsCaseOfs().add(new DefaultReference.Builder().key(new DefaultKey.Builder().value("myCaseOfRef")
				.type(KeyElements.CONCEPT_DESCRIPTION).idType(KeyType.CUSTOM).build()).build());

		// ACT
		AssetAdministrationShellEnvironment result = inAndOut();

		// ASSERT
		ConceptDescription conceptDescription = result.getConceptDescriptions().get(0);
		Assert.assertEquals(cd.getIdentification(), conceptDescription.getIdentification());
		Assert.assertEquals(cd.getIsCaseOfs().get(0).getKeys().get(0).getValue(),
				conceptDescription.getIsCaseOfs().get(0).getKeys().get(0).getValue());
	}

	@Test
	public void testAASFull()
			throws SerializationException, DeserializationException, ValidationException, IOException {
		// ARRANGE
		ShaclValidator.getInstance().validate(AASFull.ENVIRONMENT);

		Assert.assertEquals(4, AASFull.ENVIRONMENT.getAssetAdministrationShells().size());
		Assert.assertEquals(7, AASFull.ENVIRONMENT.getSubmodels().size());
		Assert.assertEquals(4, AASFull.ENVIRONMENT.getConceptDescriptions().size());

		// ACT
		serializer = new I4AASSerializer(false); // false = do not add semanticIds automaitcally to concept description
		deserializer = new I4AASDeserializer();
		AssetAdministrationShellEnvironment result = deserializer.read(serializer.write(AASFull.ENVIRONMENT));

		// ASSERT
		Assert.assertEquals(4, result.getAssetAdministrationShells().size());
		Assert.assertEquals(7, result.getSubmodels().size());
		Assert.assertEquals(4, result.getConceptDescriptions().size());
		ValidationReport validateGetReport = ShaclValidator.getInstance().validateGetReport(result);
		for (ReportEntry reportEntry : validateGetReport.getEntries()) {
			if ("<https://admin-shell.io/aas/3/0/RC01/BasicEvent/observed>".equals(reportEntry.resultPath().toString())) {
				//observed currently not supported
				continue;
			}
			Assert.fail(reportEntry.toString());
		}
	}

	@Test
	@Ignore(value = "highly dependent on other json dependencies, just used for manual comparison if json serializer is seen as complete reference implementation")
	public void testAASFullwithJsonCompare()
			throws SerializationException, DeserializationException, JSONException, IOException {
		// ARRANGE
		String expected = new JsonSerializer().write(AASFull.ENVIRONMENT);
		Files.writeString(Paths.get("./jsonExpected.json"), expected, StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);

		AssetAdministrationShellEnvironment result = deserializer.read(serializer.write(AASFull.ENVIRONMENT));

		String actual = new JsonSerializer().write(result);
		Files.writeString(Paths.get("./jsonActual.json"), actual, StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);

		JSONAssert.assertEquals(expected, actual, JSONCompareMode.LENIENT);
	}

	public AssetAdministrationShellEnvironment inAndOut() throws SerializationException, DeserializationException {
		AssetAdministrationShellEnvironment out = deserializer.read(serializer.write(env));
		return out;
	}

}
