//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UserTokenType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UserTokenType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Anonymous_0"/&gt;
 *     &lt;enumeration value="UserName_1"/&gt;
 *     &lt;enumeration value="Certificate_2"/&gt;
 *     &lt;enumeration value="IssuedToken_3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserTokenType")
@XmlEnum
public enum UserTokenType {

    @XmlEnumValue("Anonymous_0")
    ANONYMOUS_0("Anonymous_0"),
    @XmlEnumValue("UserName_1")
    USER_NAME_1("UserName_1"),
    @XmlEnumValue("Certificate_2")
    CERTIFICATE_2("Certificate_2"),
    @XmlEnumValue("IssuedToken_3")
    ISSUED_TOKEN_3("IssuedToken_3");
    private final String value;

    UserTokenType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTokenType fromValue(String v) {
        for (UserTokenType c: UserTokenType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
