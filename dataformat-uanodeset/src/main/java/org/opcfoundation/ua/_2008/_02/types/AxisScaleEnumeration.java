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
 * <p>Java-Klasse für AxisScaleEnumeration.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AxisScaleEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Linear_0"/&gt;
 *     &lt;enumeration value="Log_1"/&gt;
 *     &lt;enumeration value="Ln_2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AxisScaleEnumeration")
@XmlEnum
public enum AxisScaleEnumeration {

    @XmlEnumValue("Linear_0")
    LINEAR_0("Linear_0"),
    @XmlEnumValue("Log_1")
    LOG_1("Log_1"),
    @XmlEnumValue("Ln_2")
    LN_2("Ln_2");
    private final String value;

    AxisScaleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxisScaleEnumeration fromValue(String v) {
        for (AxisScaleEnumeration c: AxisScaleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
