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
 * <p>Java-Klasse für SecurityTokenRequestType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityTokenRequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Issue_0"/&gt;
 *     &lt;enumeration value="Renew_1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecurityTokenRequestType")
@XmlEnum
public enum SecurityTokenRequestType {

    @XmlEnumValue("Issue_0")
    ISSUE_0("Issue_0"),
    @XmlEnumValue("Renew_1")
    RENEW_1("Renew_1");
    private final String value;

    SecurityTokenRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityTokenRequestType fromValue(String v) {
        for (SecurityTokenRequestType c: SecurityTokenRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
