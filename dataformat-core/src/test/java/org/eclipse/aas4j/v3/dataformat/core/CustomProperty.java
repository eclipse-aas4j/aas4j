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
package org.eclipse.aas4j.v3.dataformat.core;

import java.util.List;
import java.util.Objects;

import org.eclipse.aas4j.v3.model.*;


public class CustomProperty implements Property {

	// protected List<EmbeddedDataSpecification> embeddedDataSpecifications;

	protected List<Reference> dataSpecifications;

	protected ModelingKind kind;

	protected Reference semanticId;

	protected String value;

	protected Reference valueId;

	protected DataTypeDefXsd valueType;

	protected List<Qualifier> qualifiers;

	protected String category;

	protected List<LangString> descriptions;

	protected List<LangString> displayNames;

	protected String idShort;

	protected List<Extension> extensions;

	protected List<Reference> supplementalSemanticIds;

	protected CustomProperty() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[] { this.valueType, this.value, this.valueId, this.category, this.descriptions,
				this.displayNames, this.idShort, this.qualifiers, /* this.embeddedDataSpecifications,*/ this.kind,
				this.semanticId });
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			CustomProperty other = (CustomProperty) obj;
			return Objects.equals(this.valueType, other.valueType) && Objects.equals(this.value, other.value)
					&& Objects.equals(this.valueId, other.valueId) && Objects.equals(this.category, other.category)
					&& Objects.equals(this.descriptions, other.descriptions)
					&& Objects.equals(this.displayNames, other.displayNames)
					&& Objects.equals(this.idShort, other.idShort) && Objects.equals(this.qualifiers, other.qualifiers)
					// TODO && Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications)
					&& Objects.equals(this.kind, other.kind) && Objects.equals(this.semanticId, other.semanticId);
		}
	}

	@Override
	final public DataTypeDefXsd getValueType() {
		return this.valueType;
	}

	@Override
	final public void setValueType(DataTypeDefXsd dataType) {
		this.valueType = dataType;
	}

	@Override
	final public String getValue() {
		return value;
	}

	@Override
	final public void setValue(String value) {
		this.value = value;
	}

	@Override
	final public Reference getValueId() {
		return valueId;
	}

	@Override
	final public void setValueId(Reference valueId) {
		this.valueId = valueId;
	}

	@Override
	final public String getCategory() {
		return category;
	}

	@Override
	final public void setCategory(String category) {
		this.category = category;
	}

	@Override
	final public List<LangString> getDescription() {
		return descriptions;
	}

	@Override
	final public void setDescription(List<LangString> description) {
		this.descriptions = description;
	}

	@Override
	public String getChecksum() {
		return null;
	}

	@Override
	public void setChecksum(String checksum) {

	}

	@Override
	final public List<LangString> getDisplayName() {
		return displayNames;
	}

	@Override
	final public void setDisplayName(List<LangString> displayName) {
		this.displayNames = displayName;
	}

	@Override
	final public String getIdShort() {
		return idShort;
	}

	@Override
	final public void setIdShort(String idShort) {
		this.idShort = idShort;
	}

	@Override
	final public List<Qualifier> getQualifiers() {
		return qualifiers;
	}

	@Override
	final public void setQualifiers(List<Qualifier> qualifiers) {
		this.qualifiers = qualifiers;
	}

	/* TODO @Override
	final public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
		return embeddedDataSpecifications;
	}

	@Override
	final public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
		this.embeddedDataSpecifications = embeddedDataSpecifications;
	}*/

	@Override
	final public List<Reference> getDataSpecifications() {
		return dataSpecifications;
	}

	@Override
	final public void setDataSpecifications(List<Reference> dataSpecifications) {
		this.dataSpecifications = dataSpecifications;
	}

	@Override
	final public ModelingKind getKind() {
		return kind;
	}

	@Override
	final public void setKind(ModelingKind kind) {
		this.kind = kind;
	}

	@Override
	final public Reference getSemanticId() {
		return semanticId;
	}

	@Override
	final public void setSemanticId(Reference semanticId) {
		this.semanticId = semanticId;
	}

	@Override
	public List<Reference> getSupplementalSemanticIds() {
		return supplementalSemanticIds;
	}

	@Override
	public void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds) {
		this.supplementalSemanticIds = supplementalSemanticIds;
	}

	@Override
	public List<Extension> getExtensions() {
		return extensions;
	}

	@Override
	public void setExtensions(List<Extension> list) {
		this.extensions = list;
	}
}
