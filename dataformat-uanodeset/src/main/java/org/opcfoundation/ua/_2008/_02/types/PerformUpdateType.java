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
 * <p>Java-Klasse für PerformUpdateType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformUpdateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Insert_1"/&gt;
 *     &lt;enumeration value="Replace_2"/&gt;
 *     &lt;enumeration value="Update_3"/&gt;
 *     &lt;enumeration value="Remove_4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PerformUpdateType")
@XmlEnum
public enum PerformUpdateType {

    @XmlEnumValue("Insert_1")
    INSERT_1("Insert_1"),
    @XmlEnumValue("Replace_2")
    REPLACE_2("Replace_2"),
    @XmlEnumValue("Update_3")
    UPDATE_3("Update_3"),
    @XmlEnumValue("Remove_4")
    REMOVE_4("Remove_4");
    private final String value;

    PerformUpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformUpdateType fromValue(String v) {
        for (PerformUpdateType c: PerformUpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
