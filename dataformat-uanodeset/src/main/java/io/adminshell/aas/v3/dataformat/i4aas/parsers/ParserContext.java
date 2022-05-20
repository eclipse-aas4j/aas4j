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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.opcfoundation.ua._2011._03.uanodeset.ListOfReferences;
import org.opcfoundation.ua._2011._03.uanodeset.Reference;
import org.opcfoundation.ua._2011._03.uanodeset.UANode;
import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASConstants;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;

public class ParserContext {

	protected UANodeSet uaNodeset;
	protected Map<String, Integer> namespaceIdxMap = new HashMap<>();
	private int i4aasNsIdx;

	protected NodeIdResolver nodeId2NodeMap;

	private UANodeWrapper uaEnvironment;
	private List<UANodeWrapper> conceptDictionaries;

	public ParserContext(UANodeSet uaNodeset) {
		this.uaNodeset = uaNodeset;

		nodeId2NodeMap = new NodeIdResolver(uaNodeset);

		parseNamespaces();

		Optional<UANode> environmentNode = findNodeOfAASEnvironmentType();
		if (environmentNode.isPresent()) {
			uaEnvironment = new UANodeWrapper(environmentNode.get(), nodeId2NodeMap, this);
		} else {
			// log no environment found
		}

		conceptDictionaries = findNodesOfAASConceptDictionaryType();
	}

	private void parseNamespaces() {
		for (int i = 0; i < uaNodeset.getNamespaceUris().getUri().size(); i++) {
			String namespace = uaNodeset.getNamespaceUris().getUri().get(i);
			int nsIdx = i + 1;
			namespaceIdxMap.put(namespace, nsIdx);
			if (namespace.equals(I4AASConstants.I4AAS_MODEL_URI)) {
				i4aasNsIdx = nsIdx;
			}
		}
	}

	protected Optional<UANode> findNodeOfAASEnvironmentType() {
		for (UANode uaNode : uaNodeset.getUAObjectOrUAVariableOrUAMethod()) {
			ListOfReferences references = uaNode.getReferences();
			if (references != null) {
				Optional<String> aasEnvironmentNodeId = getTypeDefinitons(references)
						.filter(ofType(I4AASIdentifier.AASEnvironmentType)).findAny();
				if (aasEnvironmentNodeId.isPresent()) {
					return Optional.of(uaNode);
				}
			}
		}
		return Optional.empty();
	}

	protected List<UANodeWrapper> findNodesOfAASConceptDictionaryType() {
		ArrayList<UANodeWrapper> result = new ArrayList<>();
		for (UANode uaNode : uaNodeset.getUAObjectOrUAVariableOrUAMethod()) {
			ListOfReferences references = uaNode.getReferences();
			if (references != null) {
				if (getTypeDefinitons(references).filter(ofTypeAASConcetpDescription()).findAny().isPresent()) {
					result.add(new UANodeWrapper(uaNode, nodeId2NodeMap, this));
				}
			}
		}
		return result;
	}

	protected Stream<String> getTypeDefinitons(ListOfReferences references) {
		return getNodeIdsOfType(references, hasTypeDefinition());
	}

	protected Stream<String> getComponents(ListOfReferences references) {
		return getNodeIdsOfType(references, hasComponent());
	}

	protected Stream<String> getProperties(ListOfReferences references) {
		return getNodeIdsOfType(references, hasProperty());
	}

	protected Stream<String> getDictionaryEntries(ListOfReferences references) {
		return getNodeIdsOfType(references, hasDictionaryEntry());
	}

	protected Stream<String> getNodeIdsOfType(ListOfReferences references, Predicate<? super Reference> referenceType) {
		return references != null ? references.getReference().stream().filter(referenceType).map(toValue())
				: Stream.empty();
	}

	private Predicate<? super String> ofType(I4AASIdentifier identifier) {
		return str -> str.equals(nodeIdOf(identifier));
	}

	protected String nodeIdOf(I4AASIdentifier identifier) {
		return String.format("ns=%s;i=%s", getI4aasNsIdx(), identifier.getId());
	}

	protected String nodeIdOf(UaIdentifier identifier) {
		return String.format("i=%s", identifier.getId());
	}

	protected Function<? super Reference, String> toValue() {
		return ref -> ref.getValue();
	}

	protected Predicate<? super Reference> hasTypeDefinition() {
		return typeOf(UaIdentifier.HasTypeDefinition);
	}

	protected Predicate<Reference> hasComponent() {
		return typeOf(UaIdentifier.HasComponent).or(typeOf(UaIdentifier.HasOrderedComponent));
	}

	protected Predicate<Reference> hasProperty() {
		return typeOf(UaIdentifier.HasProperty);
	}

	protected Predicate<Reference> hasDictionaryEntry() {
		return typeOf(UaIdentifier.HasDictionaryEntry);
	}

	protected Predicate<String> ofTypeAASConcetpDescription() {
		return str -> str.equals(nodeIdOf(I4AASIdentifier.AASCustomConceptDescriptionType))
				|| str.equals(nodeIdOf(I4AASIdentifier.AASIriConceptDescriptionType))
				|| str.equals(nodeIdOf(I4AASIdentifier.AASCustomConceptDescriptionType));
	}


	protected Predicate<Reference> typeOf(UaIdentifier id) {
		return ref -> ref.getReferenceType().equals(id.getName()) && ref.isIsForward();
	}

	public UANodeWrapper getEnvironment() {
		return uaEnvironment;
	}

	public int getI4aasNsIdx() {
		return i4aasNsIdx;
	}

	public List<UANodeWrapper> getDictionaryEntries() {
		return conceptDictionaries;
	}

}