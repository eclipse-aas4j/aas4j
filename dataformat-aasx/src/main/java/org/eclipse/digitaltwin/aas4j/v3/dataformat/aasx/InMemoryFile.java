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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx;

import java.util.Arrays;

/** Container class for the content of a File and its Path */
public class InMemoryFile {

  private byte[] fileContent;
  private String path;

  /**
   * Constructor for directly setting the InMemoryFile contents
   *
   * @param fileContent byte-array content of the represented file
   * @param path relative or absolute path of the represented file
   */
  public InMemoryFile(byte[] fileContent, String path) {
    this.fileContent = fileContent;
    this.path = path;
  }

  public byte[] getFileContent() {
    return fileContent;
  }

  public String getPath() {
    return path;
  }

  @Override
  public String toString() {
    return "InMemoryFile [fileContent=" + Arrays.toString(fileContent) + ", path=" + path + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(fileContent);
    result = prime * result + ((path == null) ? 0 : path.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    InMemoryFile other = (InMemoryFile) obj;
    if (!Arrays.equals(fileContent, other.fileContent)) return false;
    if (path == null) {
      if (other.path != null) return false;
    } else if (!path.equals(other.path)) return false;
    return true;
  }
}
