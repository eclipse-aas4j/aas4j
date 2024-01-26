/*
 * Copyright (c) 2024 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.internal;

public class AASXUtils {


    /**
     * Removes the file: or file:// suffix of an URI
     *
     * @param uri
     *            URI to remove the file suffix from
     * @return the URI without the file suffix
     */
    public static String removeFilePartOfURI(String uri) {
        if (uri == null) {
            return null;
        }

        if (uri.startsWith("file://")) {
            return uri.replaceFirst("file://", "");
        } else if (uri.startsWith("file:")) {
            return uri.replaceFirst("file:", "");
        }

        return uri;
    }
    
    public static boolean isFilePath(String uri) {
        return uri.startsWith("/") || uri.startsWith("file:") || uri.startsWith("./") || uri.startsWith("../");
    }
}
