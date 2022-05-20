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
 * <p>Java-Klasse für DeadbandType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DeadbandType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None_0"/&gt;
 *     &lt;enumeration value="Absolute_1"/&gt;
 *     &lt;enumeration value="Percent_2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeadbandType")
@XmlEnum
public enum DeadbandType {

    @XmlEnumValue("None_0")
    NONE_0("None_0"),
    @XmlEnumValue("Absolute_1")
    ABSOLUTE_1("Absolute_1"),
    @XmlEnumValue("Percent_2")
    PERCENT_2("Percent_2");
    private final String value;

    DeadbandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeadbandType fromValue(String v) {
        for (DeadbandType c: DeadbandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
