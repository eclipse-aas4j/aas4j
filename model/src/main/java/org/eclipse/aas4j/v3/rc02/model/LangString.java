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

package org.eclipse.aas4j.v3.rc02.model;




import org.eclipse.aas4j.v3.rc02.model.annotations.IRI;
import org.eclipse.aas4j.v3.rc02.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.rc02.model.impl.*;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultLangString;

/**
 * Strings with language tags
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultLangString.class)
})
public interface LangString {

    /**
     * Language tag conforming to BCP 47
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/LangString/language
     *
     * @return Returns the String for the property language.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/LangString/language")
    String getLanguage();

    /**
     * Language tag conforming to BCP 47
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/LangString/language
     *
     * @param language desired value for the property language.
     */
    void setLanguage(String language);

    /**
     * Text in the 'language'
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/LangString/text
     *
     * @return Returns the String for the property text.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/LangString/text")
    String getText();

    /**
     * Text in the 'language'
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/LangString/text
     *
     * @param text desired value for the property text.
     */
    void setText(String text);

}
