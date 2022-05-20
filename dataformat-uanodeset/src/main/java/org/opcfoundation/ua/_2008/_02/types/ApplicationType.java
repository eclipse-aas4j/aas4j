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
 * <p>Java-Klasse für ApplicationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Server_0"/&gt;
 *     &lt;enumeration value="Client_1"/&gt;
 *     &lt;enumeration value="ClientAndServer_2"/&gt;
 *     &lt;enumeration value="DiscoveryServer_3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApplicationType")
@XmlEnum
public enum ApplicationType {

    @XmlEnumValue("Server_0")
    SERVER_0("Server_0"),
    @XmlEnumValue("Client_1")
    CLIENT_1("Client_1"),
    @XmlEnumValue("ClientAndServer_2")
    CLIENT_AND_SERVER_2("ClientAndServer_2"),
    @XmlEnumValue("DiscoveryServer_3")
    DISCOVERY_SERVER_3("DiscoveryServer_3");
    private final String value;

    ApplicationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationType fromValue(String v) {
        for (ApplicationType c: ApplicationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
