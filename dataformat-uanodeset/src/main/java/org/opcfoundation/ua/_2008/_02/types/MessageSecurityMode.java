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
 * <p>Java-Klasse für MessageSecurityMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageSecurityMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Invalid_0"/&gt;
 *     &lt;enumeration value="None_1"/&gt;
 *     &lt;enumeration value="Sign_2"/&gt;
 *     &lt;enumeration value="SignAndEncrypt_3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageSecurityMode")
@XmlEnum
public enum MessageSecurityMode {

    @XmlEnumValue("Invalid_0")
    INVALID_0("Invalid_0"),
    @XmlEnumValue("None_1")
    NONE_1("None_1"),
    @XmlEnumValue("Sign_2")
    SIGN_2("Sign_2"),
    @XmlEnumValue("SignAndEncrypt_3")
    SIGN_AND_ENCRYPT_3("SignAndEncrypt_3");
    private final String value;

    MessageSecurityMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageSecurityMode fromValue(String v) {
        for (MessageSecurityMode c: MessageSecurityMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
