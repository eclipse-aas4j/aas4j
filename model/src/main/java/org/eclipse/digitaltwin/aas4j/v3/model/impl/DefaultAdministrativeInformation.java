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
import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.AdministrativeInformationBuilder;

/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation
 *
 * <p>Administrative meta-information for an element like version information.
 */
@IRI("aas:AdministrativeInformation")
public class DefaultAdministrativeInformation implements AdministrativeInformation {

  @IRI("https://admin-shell.io/aas/3/0/AdministrativeInformation/creator")
  protected Reference creator;

  @IRI("https://admin-shell.io/aas/3/0/AdministrativeInformation/revision")
  protected String revision;

  @IRI("https://admin-shell.io/aas/3/0/AdministrativeInformation/templateId")
  protected String templateId;

  @IRI("https://admin-shell.io/aas/3/0/AdministrativeInformation/version")
  protected String version;

  @IRI("https://admin-shell.io/aas/3/0/HasDataSpecification/embeddedDataSpecifications")
  protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

  public DefaultAdministrativeInformation() {}

  @Override
  public int hashCode() {
    return Objects.hash(
        this.version,
        this.revision,
        this.creator,
        this.templateId,
        this.embeddedDataSpecifications);
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
      DefaultAdministrativeInformation other = (DefaultAdministrativeInformation) obj;
      return Objects.equals(this.version, other.version)
          && Objects.equals(this.revision, other.revision)
          && Objects.equals(this.creator, other.creator)
          && Objects.equals(this.templateId, other.templateId)
          && Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications);
    }
  }

  @Override
  public String getVersion() {
    return version;
  }

  @Override
  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public String getRevision() {
    return revision;
  }

  @Override
  public void setRevision(String revision) {
    this.revision = revision;
  }

  @Override
  public Reference getCreator() {
    return creator;
  }

  @Override
  public void setCreator(Reference creator) {
    this.creator = creator;
  }

  @Override
  public String getTemplateId() {
    return templateId;
  }

  @Override
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  @Override
  public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
    return embeddedDataSpecifications;
  }

  @Override
  public void setEmbeddedDataSpecifications(
      List<EmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
  }

  public String toString() {
    return String.format(
        "DefaultAdministrativeInformation ("
            + "version=%s,"
            + "revision=%s,"
            + "creator=%s,"
            + "templateId=%s,"
            + ")",
        this.version, this.revision, this.creator, this.templateId);
  }

  /** This builder class can be used to construct a DefaultAdministrativeInformation bean. */
  public static class Builder
      extends AdministrativeInformationBuilder<DefaultAdministrativeInformation, Builder> {

    @Override
    protected Builder getSelf() {
      return this;
    }

    @Override
    protected DefaultAdministrativeInformation newBuildingInstance() {
      return new DefaultAdministrativeInformation();
    }
  }
}
