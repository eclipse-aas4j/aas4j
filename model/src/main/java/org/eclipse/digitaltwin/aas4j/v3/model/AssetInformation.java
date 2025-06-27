/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

package org.eclipse.digitaltwin.aas4j.v3.model;

import java.util.List;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;

/**
 * In 'AssetInformation' identifying meta data of the asset that is represented by an AAS is
 * defined.
 */
@KnownSubtypes({@KnownSubtypes.Type(value = DefaultAssetInformation.class)})
public interface AssetInformation {

  /**
   * Denotes whether the Asset is of kind 'Type' or 'Instance'.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/assetKind
   *
   * @return Returns the AssetKind for the property assetKind.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetInformation/assetKind")
  AssetKind getAssetKind();

  /**
   * Denotes whether the Asset is of kind 'Type' or 'Instance'.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/assetKind
   *
   * @param assetKind desired value for the property assetKind.
   */
  void setAssetKind(AssetKind assetKind);

  /**
   * Global identifier of the asset the AAS is representing.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/globalAssetId
   *
   * @return Returns the String for the property globalAssetId.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetInformation/globalAssetId")
  String getGlobalAssetId();

  /**
   * Global identifier of the asset the AAS is representing.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/globalAssetId
   *
   * @param globalAssetId desired value for the property globalAssetId.
   */
  void setGlobalAssetId(String globalAssetId);

  /**
   * Additional domain-specific, typically proprietary identifier for the asset like e.g., serial
   * number etc.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/specificAssetIds
   *
   * @return Returns the List of SpecificAssetIds for the property specificAssetIds.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetInformation/specificAssetIds")
  List<SpecificAssetId> getSpecificAssetIds();

  /**
   * Additional domain-specific, typically proprietary identifier for the asset like e.g., serial
   * number etc.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/specificAssetIds
   *
   * @param specificAssetIds desired value for the property specificAssetIds.
   */
  void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds);

  /**
   * In case 'assetKind' is applicable the 'assetType' is the asset ID of the type asset of the
   * asset under consideration as identified by 'globalAssetId'.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/assetType
   *
   * @return Returns the String for the property assetType.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetInformation/assetType")
  String getAssetType();

  /**
   * In case 'assetKind' is applicable the 'assetType' is the asset ID of the type asset of the
   * asset under consideration as identified by 'globalAssetId'.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/assetType
   *
   * @param assetType desired value for the property assetType.
   */
  void setAssetType(String assetType);

  /**
   * Thumbnail of the asset represented by the Asset Administration Shell.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/defaultThumbnail
   *
   * @return Returns the Resource for the property defaultThumbnail.
   */
  @IRI("https://admin-shell.io/aas/3/1/AssetInformation/defaultThumbnail")
  Resource getDefaultThumbnail();

  /**
   * Thumbnail of the asset represented by the Asset Administration Shell.
   *
   * <p>More information under https://admin-shell.io/aas/3/1/AssetInformation/defaultThumbnail
   *
   * @param defaultThumbnail desired value for the property defaultThumbnail.
   */
  void setDefaultThumbnail(Resource defaultThumbnail);
}
