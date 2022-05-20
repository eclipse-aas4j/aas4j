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
 * <p>Java-Klasse für ModelChangeStructureVerbMask.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ModelChangeStructureVerbMask"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NodeAdded_1"/&gt;
 *     &lt;enumeration value="NodeDeleted_2"/&gt;
 *     &lt;enumeration value="ReferenceAdded_4"/&gt;
 *     &lt;enumeration value="ReferenceDeleted_8"/&gt;
 *     &lt;enumeration value="DataTypeChanged_16"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModelChangeStructureVerbMask")
@XmlEnum
public enum ModelChangeStructureVerbMask {

    @XmlEnumValue("NodeAdded_1")
    NODE_ADDED_1("NodeAdded_1"),
    @XmlEnumValue("NodeDeleted_2")
    NODE_DELETED_2("NodeDeleted_2"),
    @XmlEnumValue("ReferenceAdded_4")
    REFERENCE_ADDED_4("ReferenceAdded_4"),
    @XmlEnumValue("ReferenceDeleted_8")
    REFERENCE_DELETED_8("ReferenceDeleted_8"),
    @XmlEnumValue("DataTypeChanged_16")
    DATA_TYPE_CHANGED_16("DataTypeChanged_16");
    private final String value;

    ModelChangeStructureVerbMask(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModelChangeStructureVerbMask fromValue(String v) {
        for (ModelChangeStructureVerbMask c: ModelChangeStructureVerbMask.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
