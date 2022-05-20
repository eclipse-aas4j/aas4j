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
 * <p>Java-Klasse für PubSubState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PubSubState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled_0"/&gt;
 *     &lt;enumeration value="Paused_1"/&gt;
 *     &lt;enumeration value="Operational_2"/&gt;
 *     &lt;enumeration value="Error_3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PubSubState")
@XmlEnum
public enum PubSubState {

    @XmlEnumValue("Disabled_0")
    DISABLED_0("Disabled_0"),
    @XmlEnumValue("Paused_1")
    PAUSED_1("Paused_1"),
    @XmlEnumValue("Operational_2")
    OPERATIONAL_2("Operational_2"),
    @XmlEnumValue("Error_3")
    ERROR_3("Error_3");
    private final String value;

    PubSubState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PubSubState fromValue(String v) {
        for (PubSubState c: PubSubState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
