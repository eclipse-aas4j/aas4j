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
 * <p>Java-Klasse für ExceptionDeviationFormat.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionDeviationFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AbsoluteValue_0"/&gt;
 *     &lt;enumeration value="PercentOfValue_1"/&gt;
 *     &lt;enumeration value="PercentOfRange_2"/&gt;
 *     &lt;enumeration value="PercentOfEURange_3"/&gt;
 *     &lt;enumeration value="Unknown_4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExceptionDeviationFormat")
@XmlEnum
public enum ExceptionDeviationFormat {

    @XmlEnumValue("AbsoluteValue_0")
    ABSOLUTE_VALUE_0("AbsoluteValue_0"),
    @XmlEnumValue("PercentOfValue_1")
    PERCENT_OF_VALUE_1("PercentOfValue_1"),
    @XmlEnumValue("PercentOfRange_2")
    PERCENT_OF_RANGE_2("PercentOfRange_2"),
    @XmlEnumValue("PercentOfEURange_3")
    PERCENT_OF_EU_RANGE_3("PercentOfEURange_3"),
    @XmlEnumValue("Unknown_4")
    UNKNOWN_4("Unknown_4");
    private final String value;

    ExceptionDeviationFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExceptionDeviationFormat fromValue(String v) {
        for (ExceptionDeviationFormat c: ExceptionDeviationFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
