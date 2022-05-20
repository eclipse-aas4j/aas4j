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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.opcfoundation.ua._2011._03.uanodeset.ListOfExtensions;
import org.opcfoundation.ua._2011._03.uanodeset.ListOfReferences;
import org.opcfoundation.ua._2011._03.uanodeset.LocalizedText;
import org.opcfoundation.ua._2011._03.uanodeset.UANode;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.BasicIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;

/**
 * This class provides some basic functionalities and preparsed attributes for a
 * more convenient usage
 *
 */
public class UANodeWrapper {

	private final static Pattern browseNamePattern = Pattern.compile("^(\\d+):(.*)$");

	private UANode node;
	private TypeResolver typeResolver;
	private ParserContext ctx;

	private List<UANodeWrapper> components;
	private List<UANodeWrapper> properties;
	private List<UANodeWrapper> dictionaryEntries;
	// UaIdentifier.HasDictionaryEntry

	private BasicIdentifier type;

	private int browseNameNamespace;
	private String browseNameString;

	public UANodeWrapper(UANode node, NodeIdResolver nodeIdResolver, ParserContext parserContext) {
		this.node = node;
		this.ctx = parserContext;
		typeResolver = new TypeResolver(parserContext.getI4aasNsIdx());
		// parse components
		components = ctx.getComponents(getReferences()).map(nodeIdResolver::getUANode).filter(Objects::nonNull)
				.map(uaNode -> new UANodeWrapper(uaNode, nodeIdResolver, ctx)).collect(Collectors.toList());
		// parse properties
		properties = ctx.getProperties(getReferences()).map(nodeIdResolver::getUANode).filter(Objects::nonNull)
				.map(uaNode -> new UANodeWrapper(uaNode, nodeIdResolver, ctx)).collect(Collectors.toList());
		// parse dictionaryEntries
		dictionaryEntries = ctx.getDictionaryEntries(getReferences()).map(nodeIdResolver::getUANode)
				.filter(Objects::nonNull).map(uaNode -> new UANodeWrapper(uaNode, nodeIdResolver, ctx))
				.collect(Collectors.toList());

		// parse type definition
		ctx.getTypeDefinitons(getReferences()).map(typeResolver::getType).findFirst().ifPresent(id -> type = id.get());
		parseBrowseName(node.getBrowseName());
	}

	private void parseBrowseName(String browseName) {
		Matcher browseNameMatcher = browseNamePattern.matcher(browseName);
		if (browseNameMatcher.matches()) {
			browseNameNamespace = Integer.parseInt(browseNameMatcher.group(1));
			browseNameString = browseNameMatcher.group(2);
		}
	}

	public List<LocalizedText> getDisplayName() {
		return node.getDisplayName();
	}

	public List<LocalizedText> getDescription() {
		return node.getDescription();
	}

	public ListOfReferences getReferences() {
		return node.getReferences();
	}

	public ListOfExtensions getExtensions() {
		return node.getExtensions();
	}

	public String getNodeId() {
		return node.getNodeId();
	}

	public String getBrowseName() {
		return node.getBrowseName();
	}

	/**
	 * @return all Nodes which are referenced by HasComponent
	 */
	public List<UANodeWrapper> getComponents() {
		return components;
	}

	/**
	 * @return all Nodes which are referenced by HasProperty
	 */
	public List<UANodeWrapper> getProperties() {
		return properties;
	}

	/**
	 * @return all Nodes which are referenced by HasDictionaryEntries for
	 *         hasSemantics
	 */
	public List<UANodeWrapper> getDictionaryEntries() {
		return dictionaryEntries;
	}

	public Optional<UANodeWrapper> getAASDictionaryEntry() {
		return dictionaryEntries.stream().filter(node -> {
			return 		node.getType().equals(I4AASIdentifier.AASCustomConceptDescriptionType)
					|| 	node.getType().equals(I4AASIdentifier.AASIrdiConceptDescriptionType)
					|| 	node.getType().equals(I4AASIdentifier.AASIriConceptDescriptionType);
		}).findFirst();
	}

	public List<UANodeWrapper> getPropertiesAndComponents() {
		List<UANodeWrapper> propertiesAndComponents = new ArrayList<>();
		propertiesAndComponents.addAll(properties);
		propertiesAndComponents.addAll(components);
		return propertiesAndComponents;
	}

	/**
	 * @return Identifier of the Reference with Type HasTypeDefinition
	 */
	public BasicIdentifier getType() {
		return type;
	}

	/**
	 * see https://reference.opcfoundation.org/v104/Core/docs/Part3/5.2.4/
	 * 
	 * @return string part of the browse name
	 */
	public String getBrowseNameStringPart() {
		return browseNameString;
	}

	/**
	 * see https://reference.opcfoundation.org/v104/Core/docs/Part3/5.2.4/
	 * 
	 * @return namespace part of the browse name
	 */
	public int getBrowseNameNamespacePart() {
		return browseNameNamespace;
	}

	/**
	 * @param filterName string part of the I4AAS predefined browse name
	 * @return UANodeWrapper which is a component of the this UANodeWrapper and
	 *         matches the given name
	 */
	public Optional<UANodeWrapper> getI4AASComponent(String filterName) {
		return getComponents().stream().filter(c -> c.getBrowseNameNamespacePart() == ctx.getI4aasNsIdx()
				&& filterName.equals(c.getBrowseNameStringPart())).findFirst();
	}

	/**
	 * @param filterName string part of the I4AAS predefined browse name
	 * @return UANodeWrapper which is a property of the this UANodeWrapper and
	 *         matches the given name
	 */
	public Optional<UANodeWrapper> getI4AASProperty(String filterName) {
		return getProperties().stream().filter(c -> c.getBrowseNameNamespacePart() == ctx.getI4aasNsIdx()
				&& filterName.equals(c.getBrowseNameStringPart())).findFirst();
	}

	/**
	 * @param filterType filter type
	 * @return all UANodeWrapper which are components of the this UANodeWrapper and
	 *         matches the given type
	 */
	public List<UANodeWrapper> getComponentsOfType(BasicIdentifier filterType) {
		return getComponents().stream().filter(c -> c.getType() == filterType).collect(Collectors.toList());
	}

	/**
	 * @param filterType filter type
	 * @return all UANodeWrapper which are properties of the this UANodeWrapper and
	 *         matches the given type
	 */
	public List<UANodeWrapper> getPropertiesOfType(BasicIdentifier filterType) {
		return getProperties().stream().filter(c -> c.getType() == filterType).collect(Collectors.toList());
	}

	public UANode getNode() {
		return node;
	}

	public UAVariable getNodeVariable() {
		return (UAVariable) node;
	}

	public UAObject getNodeObject() {
		return (UAObject) node;
	}

}
