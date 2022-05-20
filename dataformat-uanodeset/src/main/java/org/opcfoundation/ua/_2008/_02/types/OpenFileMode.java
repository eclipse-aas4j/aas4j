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
 * <p>Java-Klasse für OpenFileMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OpenFileMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Read_1"/&gt;
 *     &lt;enumeration value="Write_2"/&gt;
 *     &lt;enumeration value="EraseExisting_4"/&gt;
 *     &lt;enumeration value="Append_8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpenFileMode")
@XmlEnum
public enum OpenFileMode {

    @XmlEnumValue("Read_1")
    READ_1("Read_1"),
    @XmlEnumValue("Write_2")
    WRITE_2("Write_2"),
    @XmlEnumValue("EraseExisting_4")
    ERASE_EXISTING_4("EraseExisting_4"),
    @XmlEnumValue("Append_8")
    APPEND_8("Append_8");
    private final String value;

    OpenFileMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenFileMode fromValue(String v) {
        for (OpenFileMode c: OpenFileMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
