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
 * <p>Java-Klasse für RedundancySupport.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RedundancySupport"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None_0"/&gt;
 *     &lt;enumeration value="Cold_1"/&gt;
 *     &lt;enumeration value="Warm_2"/&gt;
 *     &lt;enumeration value="Hot_3"/&gt;
 *     &lt;enumeration value="Transparent_4"/&gt;
 *     &lt;enumeration value="HotAndMirrored_5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RedundancySupport")
@XmlEnum
public enum RedundancySupport {

    @XmlEnumValue("None_0")
    NONE_0("None_0"),
    @XmlEnumValue("Cold_1")
    COLD_1("Cold_1"),
    @XmlEnumValue("Warm_2")
    WARM_2("Warm_2"),
    @XmlEnumValue("Hot_3")
    HOT_3("Hot_3"),
    @XmlEnumValue("Transparent_4")
    TRANSPARENT_4("Transparent_4"),
    @XmlEnumValue("HotAndMirrored_5")
    HOT_AND_MIRRORED_5("HotAndMirrored_5");
    private final String value;

    RedundancySupport(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RedundancySupport fromValue(String v) {
        for (RedundancySupport c: RedundancySupport.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
