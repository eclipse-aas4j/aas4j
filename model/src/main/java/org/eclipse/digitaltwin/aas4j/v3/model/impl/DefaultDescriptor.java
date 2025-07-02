/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.digitaltwin.aas4j.v3.model.Descriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.DescriptorBuilder;

/** Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Descriptor */
@IRI("aas:Descriptor")
public class DefaultDescriptor implements Descriptor {

  @IRI("https://admin-shell.io/aas/3/1/Descriptor/description")
  protected List<LangStringTextType> description = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/1/Descriptor/displayName")
  protected List<LangStringNameType> displayName = new ArrayList<>();

  @IRI("https://admin-shell.io/aas/3/1/Descriptor/extensions")
  protected List<Extension> extensions = new ArrayList<>();

  public DefaultDescriptor() {}

  @Override
  public int hashCode() {
    return Objects.hash(this.description, this.displayName, this.extensions);
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
      DefaultDescriptor other = (DefaultDescriptor) obj;
      return Objects.equals(this.description, other.description)
          && Objects.equals(this.displayName, other.displayName)
          && Objects.equals(this.extensions, other.extensions);
    }
  }

  @Override
  public String toString() {
    return "DefaultDescriptor{"
        + "description="
        + description
        + ", displayName="
        + displayName
        + ", extensions="
        + extensions
        + '}';
  }

  @Override
  public List<LangStringTextType> getDescription() {
    return description;
  }

  @Override
  public void setDescription(List<LangStringTextType> description) {
    this.description = description;
  }

  @Override
  public List<LangStringNameType> getDisplayName() {
    return displayName;
  }

  @Override
  public void setDisplayName(List<LangStringNameType> displayName) {
    this.displayName = displayName;
  }

  @Override
  public List<Extension> getExtensions() {
    return extensions;
  }

  @Override
  public void setExtensions(List<Extension> extensions) {
    this.extensions = extensions;
  }

  /** This builder class can be used to construct a DefaultDescriptor bean. */
  public static class Builder extends DescriptorBuilder<DefaultDescriptor, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultDescriptor newBuildingInstance() {
      return new DefaultDescriptor();
    }
  }
}
