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
 * <p>Java-Klasse für DiagnosticsLevel.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticsLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Basic_0"/&gt;
 *     &lt;enumeration value="Advanced_1"/&gt;
 *     &lt;enumeration value="Info_2"/&gt;
 *     &lt;enumeration value="Log_3"/&gt;
 *     &lt;enumeration value="Debug_4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticsLevel")
@XmlEnum
public enum DiagnosticsLevel {

    @XmlEnumValue("Basic_0")
    BASIC_0("Basic_0"),
    @XmlEnumValue("Advanced_1")
    ADVANCED_1("Advanced_1"),
    @XmlEnumValue("Info_2")
    INFO_2("Info_2"),
    @XmlEnumValue("Log_3")
    LOG_3("Log_3"),
    @XmlEnumValue("Debug_4")
    DEBUG_4("Debug_4");
    private final String value;

    DiagnosticsLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiagnosticsLevel fromValue(String v) {
        for (DiagnosticsLevel c: DiagnosticsLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
