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

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.opcfoundation.ua._2011._03.uanodeset.AliasTable;
import org.opcfoundation.ua._2011._03.uanodeset.ModelTable;
import org.opcfoundation.ua._2011._03.uanodeset.ModelTableEntry;
import org.opcfoundation.ua._2011._03.uanodeset.NodeIdAlias;
import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UriTable;

import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASConstants;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASUtils;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.Identifier;
import io.adminshell.aas.v3.model.Referable;
import io.adminshell.aas.v3.model.Reference;

public class MappingContext {

	private final UANodeSet nodeset;
	private final AssetAdministrationShellEnvironment aasEnvironment;
	private final String modelNamspace;

	private final DatatypeFactory datatypeFactory = DatatypeFactory.newDefaultInstance();

	private int modelNsIndex; // currently always 1
	private int i4aasNsIndex; // currently always 2

	private int nodeIdCounter = 1;

	private static Function<UANodeSet, String> modelNamespaceNamingStrategy = I4AASUtils::generateRandomNamespace;
	private boolean addMissingSemanticIdsToDictionary = true;

	public static void setModelNamespaceNamingStrategy(Function<UANodeSet, String> strategy) {
		modelNamespaceNamingStrategy = strategy;
	}

	public MappingContext(AssetAdministrationShellEnvironment aasEnvironment) {
		this.aasEnvironment = aasEnvironment;
		nodeset = new UANodeSet();
		modelNamspace = modelNamespaceNamingStrategy.apply(nodeset);
		initNodeset();
	}

	private void initNodeset() {
		initNamespace();
		initModelTable();
		initAliases();
	}

	private void initAliases() {
		nodeset.setAliases(new AliasTable());
		List<NodeIdAlias> aliases = nodeset.getAliases().getAlias();
		// add default aliases
		for (UaIdentifier uaId : UaIdentifier.values()) {
			NodeIdAlias nodeIdAlias = new NodeIdAlias();
			nodeIdAlias.setAlias(uaId.getName());
			nodeIdAlias.setValue(getUaBaseNodeIdAsString(uaId));
			aliases.add(nodeIdAlias);
		}
		// add I4AAS Aliases
		for (I4AASIdentifier i4aasId : I4AASIdentifier.values()) {
			NodeIdAlias nodeIdAlias = new NodeIdAlias();
			nodeIdAlias.setAlias(i4aasId.getName());
			nodeIdAlias.setValue(getI4aasNodeIdAsString(i4aasId));
			aliases.add(nodeIdAlias);
		}
	}

	public String getUaBaseNodeIdAsString(UaIdentifier uaId) {
		return "i=" + uaId.getId(); // if no namespace is given, it is interpreted as a base UA node
	}

	public String getI4aasNodeIdAsString(I4AASIdentifier i4aasId) {
		return "ns=" + getI4aasNsIndex() + ";i=" + i4aasId.getId();
	}

	public String getI4aasNodeIdAsString(Integer id) {
		return "ns=" + getI4aasNsIndex() + ";i=" + id;
	}

	public String newModelNodeIdAsString() {
		return "ns=" + getModelNsIndex() + ";i=" + nodeIdCounter++;
	}

	private void initModelTable() {
		nodeset.setModels(new ModelTable());
		ModelTableEntry tableEntry = new ModelTableEntry();
		tableEntry.setModelUri(modelNamspace);
		XMLGregorianCalendar gregorianCalendar = datatypeFactory
				.newXMLGregorianCalendar(LocalDateTime.now().toString());
		tableEntry.setPublicationDate(gregorianCalendar);
		tableEntry.setVersion("1.0.0");

		ModelTableEntry uaRequiredEntry = new ModelTableEntry();
		uaRequiredEntry.setModelUri(I4AASConstants.UA_MODEL_URI);
		uaRequiredEntry.setPublicationDate(datatypeFactory.newXMLGregorianCalendar(I4AASConstants.UA_PUBDATE));
		uaRequiredEntry.setVersion(I4AASConstants.UA_VERSION);
		tableEntry.getRequiredModel().add(uaRequiredEntry);

		ModelTableEntry i4aasRequiredEntry = new ModelTableEntry();
		i4aasRequiredEntry.setModelUri(I4AASConstants.I4AAS_MODEL_URI);
		i4aasRequiredEntry.setPublicationDate(datatypeFactory.newXMLGregorianCalendar(I4AASConstants.I4AAS_PUBDATE));
		i4aasRequiredEntry.setVersion(I4AASConstants.I4AAS_VERSION);
		tableEntry.getRequiredModel().add(i4aasRequiredEntry);

		nodeset.getModels().getModel().add(tableEntry);
	}

	private void initNamespace() {
		nodeset.setNamespaceUris(new UriTable());
		nodeset.getNamespaceUris().getUri().add(modelNamspace);
		modelNsIndex = 1;
		nodeset.getNamespaceUris().getUri().add(I4AASConstants.I4AAS_MODEL_URI);
		i4aasNsIndex = 2;
	}

	public AssetAdministrationShellEnvironment getEnvironment() {
		return aasEnvironment;
	}

	public UANodeSet getNodeSet() {
		return nodeset;
	}

	public int getModelNsIndex() {
		return modelNsIndex;
	}

	public int getI4aasNsIndex() {
		return i4aasNsIndex;
	}

	private Map<Referable, UAObject> sourceReferableToTargetIdentifier = new HashMap<>();
	private Map<UAObject, Reference> targetReferenceToSourceReference = new HashMap<>();

	public void registerReferableMapped(Referable sourceReferable, UAObject targetReferable) {
		sourceReferableToTargetIdentifier.put(sourceReferable, targetReferable);

		// try a local, native UA reference binding
		for (Entry<UAObject, Reference> entry : targetReferenceToSourceReference.entrySet()) {
			Referable resolve = AasUtils.resolve(entry.getValue(), aasEnvironment);
			if (sourceReferable.equals(resolve)) {
				I4AASMapper.attachAsAddIn(entry.getKey(), targetReferable);
			}
		}
	}

	public void registerReferenceMapped(UAObject targetReference, Reference sourceReference) {
		targetReferenceToSourceReference.put(targetReference, sourceReference);

		// try a local, native UA reference binding
		Referable resolve = AasUtils.resolve(sourceReference, aasEnvironment);
		if (resolve != null) {
			UAObject uaObject = sourceReferableToTargetIdentifier.get(resolve);
			if (uaObject != null) {
				I4AASMapper.attachAsAddIn(targetReference, uaObject);
			}
		}
	}

	public final UAObject getTargetNodeForReference(Reference semanticId) {
		Referable resolve = AasUtils.resolve(semanticId, aasEnvironment);
		return sourceReferableToTargetIdentifier.get(resolve);
	}

	public void setAddMissingSemanticIdsToDictionary(boolean addMissingSemanticIdsToDictionary) {
		this.addMissingSemanticIdsToDictionary = addMissingSemanticIdsToDictionary;
	}

	public boolean isAddMissingSemanticIdsToDictionary() {
		return addMissingSemanticIdsToDictionary;
	}

}
