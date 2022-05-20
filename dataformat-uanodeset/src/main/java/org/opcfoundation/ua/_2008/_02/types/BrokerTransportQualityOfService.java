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
 * <p>Java-Klasse für BrokerTransportQualityOfService.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BrokerTransportQualityOfService"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSpecified_0"/&gt;
 *     &lt;enumeration value="BestEffort_1"/&gt;
 *     &lt;enumeration value="AtLeastOnce_2"/&gt;
 *     &lt;enumeration value="AtMostOnce_3"/&gt;
 *     &lt;enumeration value="ExactlyOnce_4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BrokerTransportQualityOfService")
@XmlEnum
public enum BrokerTransportQualityOfService {

    @XmlEnumValue("NotSpecified_0")
    NOT_SPECIFIED_0("NotSpecified_0"),
    @XmlEnumValue("BestEffort_1")
    BEST_EFFORT_1("BestEffort_1"),
    @XmlEnumValue("AtLeastOnce_2")
    AT_LEAST_ONCE_2("AtLeastOnce_2"),
    @XmlEnumValue("AtMostOnce_3")
    AT_MOST_ONCE_3("AtMostOnce_3"),
    @XmlEnumValue("ExactlyOnce_4")
    EXACTLY_ONCE_4("ExactlyOnce_4");
    private final String value;

    BrokerTransportQualityOfService(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BrokerTransportQualityOfService fromValue(String v) {
        for (BrokerTransportQualityOfService c: BrokerTransportQualityOfService.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
