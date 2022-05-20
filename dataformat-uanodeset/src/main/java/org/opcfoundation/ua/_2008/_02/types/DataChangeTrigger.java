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
 * <p>Java-Klasse für DataChangeTrigger.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DataChangeTrigger"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Status_0"/&gt;
 *     &lt;enumeration value="StatusValue_1"/&gt;
 *     &lt;enumeration value="StatusValueTimestamp_2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataChangeTrigger")
@XmlEnum
public enum DataChangeTrigger {

    @XmlEnumValue("Status_0")
    STATUS_0("Status_0"),
    @XmlEnumValue("StatusValue_1")
    STATUS_VALUE_1("StatusValue_1"),
    @XmlEnumValue("StatusValueTimestamp_2")
    STATUS_VALUE_TIMESTAMP_2("StatusValueTimestamp_2");
    private final String value;

    DataChangeTrigger(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataChangeTrigger fromValue(String v) {
        for (DataChangeTrigger c: DataChangeTrigger.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
