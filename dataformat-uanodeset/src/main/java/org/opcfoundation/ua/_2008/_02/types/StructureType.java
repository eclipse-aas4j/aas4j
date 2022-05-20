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
 * <p>Java-Klasse für StructureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StructureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Structure_0"/&gt;
 *     &lt;enumeration value="StructureWithOptionalFields_1"/&gt;
 *     &lt;enumeration value="Union_2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StructureType")
@XmlEnum
public enum StructureType {

    @XmlEnumValue("Structure_0")
    STRUCTURE_0("Structure_0"),
    @XmlEnumValue("StructureWithOptionalFields_1")
    STRUCTURE_WITH_OPTIONAL_FIELDS_1("StructureWithOptionalFields_1"),
    @XmlEnumValue("Union_2")
    UNION_2("Union_2");
    private final String value;

    StructureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StructureType fromValue(String v) {
        for (StructureType c: StructureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
