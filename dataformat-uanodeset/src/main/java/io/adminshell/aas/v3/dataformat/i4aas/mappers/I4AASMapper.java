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

import java.util.List;

import org.opcfoundation.ua._2011._03.uanodeset.ListOfReferences;
import org.opcfoundation.ua._2011._03.uanodeset.LocalizedText;
import org.opcfoundation.ua._2011._03.uanodeset.Reference;
import org.opcfoundation.ua._2011._03.uanodeset.UAInstance;
import org.opcfoundation.ua._2011._03.uanodeset.UANode;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import com.google.common.base.Strings;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.BasicIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASConstants;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;
import io.adminshell.aas.v3.rc02.model.LangString;
import io.adminshell.aas.v3.rc02.model.Referable;

/**
 * Generic base class used for all mapper implementation.
 *
 * @param <SOURCE> mapping source
 * @param <TARGET> mapping target
 */
public abstract class I4AASMapper<SOURCE, TARGET extends UANode> implements I4AASConstants {

	public static boolean CHECK_NS_INTERN_REFERENCES_ATTACHED = false;

	protected MappingContext ctx;
	protected SOURCE source;
	protected TARGET target;

	/**
	 * @param src
	 * @param ctx
	 */
	public I4AASMapper(SOURCE src, MappingContext ctx) {
		this.source = src;
		this.ctx = ctx;
	}

	/**
	 * @return the mapping complete target object with all children attached
	 */
	public final TARGET map() {
		target = createTargetObject();
		addToNodeset();
		mapAndAttachChildren();
		if (CHECK_NS_INTERN_REFERENCES_ATTACHED) {
			checkChildrenAttached();
		}
		return target;
	}

	private void checkChildrenAttached() {
		target.getReferences().getReference().forEach(ref -> {
			if (ref.getValue().startsWith("ns=" + ctx.getModelNsIndex())) {
				List<UANode> uaObjectOrUAVariableOrUAMethod = ctx.getNodeSet().getUAObjectOrUAVariableOrUAMethod();
				boolean found = false;
				for (UANode uaNode : uaObjectOrUAVariableOrUAMethod) {
					found = found || uaNode.getNodeId().equals(ref.getValue());
				}
				if (!found) {
					throw new IllegalStateException(
							String.format("parent %s misses child %s", target.getNodeId(), ref.getValue()));
				}
			}
		});
	}

	/**
	 * @return return the object filled with attributes directly bound to the
	 *         target.
	 */
	protected abstract TARGET createTargetObject();

	/**
	 * action to be called when the children objects must be mapped and attached to
	 * the target.
	 */
	protected abstract void mapAndAttachChildren();

	private void addToNodeset() {
		ctx.getNodeSet().getUAObjectOrUAVariableOrUAMethod().add(target);
	}

	protected final void addToNodeset(UANode node) {
		ctx.getNodeSet().getUAObjectOrUAVariableOrUAMethod().add(node);
	}

	protected final void addTypeReference(BasicIdentifier idForType) {
		addTypeReferenceFor(target, idForType);
	}

	protected final void addTypeReferenceFor(UANode anyNode, BasicIdentifier idForType) {
		addTypeReferenceFor(anyNode, idForType, ctx);
	}

	private static final void addTypeReferenceFor(UANode anyNode, BasicIdentifier idForType, MappingContext ctx) {
		if (anyNode.getReferences() == null) {
			anyNode.setReferences(new ListOfReferences());
		}
		ListOfReferences references = anyNode.getReferences();
		if (idForType instanceof I4AASIdentifier) {
			references.getReference()
					.add(Reference.builder().withReferenceType(UaIdentifier.HasTypeDefinition.getName())
							.withValue(ctx.getI4aasNodeIdAsString((I4AASIdentifier) idForType)).build());
		}
		if (idForType instanceof UaIdentifier) {
			references.getReference()
					.add(Reference.builder().withReferenceType(UaIdentifier.HasTypeDefinition.getName())
							.withValue(ctx.getUaBaseNodeIdAsString((UaIdentifier) idForType)).build());
		}
	}

	protected static final LocalizedText createLocalizedText(String value) {
		return LocalizedText.builder().withValue(value).build();
	}

	protected final String createBrowseName(String name, int namespaceIndx) {
		return namespaceIndx + ":" + name;
	}

	protected final String createModelBrowseName(String name) {
		return ctx.getModelNsIndex() + ":" + name;
	}

	protected final String createModelBrowseName(Referable ref) {
		if (ref != null && !Strings.isNullOrEmpty(ref.getIdShort())) {
			return ctx.getModelNsIndex() + ":" + ref.getIdShort();
		}
		throw new IllegalArgumentException("Referable is null or does not contain a valid IdShort.");
	}

	protected final String createI4AASBrowseName(String name) {
		return ctx.getI4aasNsIndex() + ":" + name;
	}

	protected final UAObject createFolder(String folderName) {
		return createFolder((UAObject) target, folderName, ctx, UaIdentifier.FolderType);
	}

	private static final String createI4AASBrowseName(String name, MappingContext ctx) {
		return ctx.getI4aasNsIndex() + ":" + name;
	}

	public static final UAObject createFolder(UAObject target, String folderName, MappingContext ctx,
			BasicIdentifier folderSubtype) {
		UAObject folder = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString())
				.withBrowseName(createI4AASBrowseName(folderName, ctx)).withDisplayName(createLocalizedText(folderName))
				.build();
		ctx.getNodeSet().getUAObjectOrUAVariableOrUAMethod().add(folder);
		addTypeReferenceFor(folder, folderSubtype, ctx);
		attachAsComponent((UAObject) target, folder);
		return folder;
	}

	public final UAObject createReferenceList(String folderName) {
		return createFolder((UAObject) target, folderName, ctx, I4AASIdentifier.AASReferenceList);
	}

	public final UAObject createSubmodelElementList(String folderName) {
		return createFolder((UAObject) target, folderName, ctx, I4AASIdentifier.AASSubmodelElementList);
	}

	public final UAObject createIdentifierKeyValuePairList(String folderName) {
		return createFolder((UAObject) target, folderName, ctx, I4AASIdentifier.AASIdentifierKeyValuePairList);
	}

	protected static void attachAsType(UAInstance parent, UAInstance child, BasicIdentifier typeId) {
		if (child.getReferences() == null) {
			child.setReferences(new ListOfReferences());
		}
		Reference parentRef = Reference.builder().withIsForward(false).withReferenceType(typeId.getName())
				.withValue(parent.getNodeId()).build();
		child.getReferences().getReference().add(parentRef);
		if (parent.getReferences() == null) {
			parent.setReferences(new ListOfReferences());
		}
		Reference childRef = Reference.builder().withReferenceType(typeId.getName()).withValue(child.getNodeId())
				.build();
		parent.getReferences().getReference().add(childRef);
	}

	protected static final void attachAsProperty(UAObject parent, UAVariable child) {
		child.setParentNodeId(parent.getNodeId());
		attachAsType(parent, child, UaIdentifier.HasProperty);
	}

	protected static final void attachAsComponent(UAObject parent, UAInstance child) {
		child.setParentNodeId(parent.getNodeId());
		attachAsType(parent, child, UaIdentifier.HasComponent);
	}

	protected static final void attachAsOrderedComponent(UAObject parent, UAObject child) {
		child.setParentNodeId(parent.getNodeId());
		attachAsType(parent, child, UaIdentifier.HasOrderedComponent);
	}

	protected static final void attachAsDictionaryEntry(UAObject parent, UAObject child) {
		attachAsType(parent, child, UaIdentifier.HasDictionaryEntry);
	}

	protected static final void attachAsAddIn(UAObject parent, UAObject child) {
		attachAsType(parent, child, UaIdentifier.HasAddIn);
	}

	protected static final LocalizedText mapLangString(LangString description) {
		return LocalizedText.builder().withLocale(description.getLanguage()).withValue(description.getValue()).build();
	}
}
