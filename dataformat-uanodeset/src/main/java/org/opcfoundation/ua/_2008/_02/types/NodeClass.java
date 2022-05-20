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
 * <p>Java-Klasse für NodeClass.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unspecified_0"/&gt;
 *     &lt;enumeration value="Object_1"/&gt;
 *     &lt;enumeration value="Variable_2"/&gt;
 *     &lt;enumeration value="Method_4"/&gt;
 *     &lt;enumeration value="ObjectType_8"/&gt;
 *     &lt;enumeration value="VariableType_16"/&gt;
 *     &lt;enumeration value="ReferenceType_32"/&gt;
 *     &lt;enumeration value="DataType_64"/&gt;
 *     &lt;enumeration value="View_128"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeClass")
@XmlEnum
public enum NodeClass {

    @XmlEnumValue("Unspecified_0")
    UNSPECIFIED_0("Unspecified_0"),
    @XmlEnumValue("Object_1")
    OBJECT_1("Object_1"),
    @XmlEnumValue("Variable_2")
    VARIABLE_2("Variable_2"),
    @XmlEnumValue("Method_4")
    METHOD_4("Method_4"),
    @XmlEnumValue("ObjectType_8")
    OBJECT_TYPE_8("ObjectType_8"),
    @XmlEnumValue("VariableType_16")
    VARIABLE_TYPE_16("VariableType_16"),
    @XmlEnumValue("ReferenceType_32")
    REFERENCE_TYPE_32("ReferenceType_32"),
    @XmlEnumValue("DataType_64")
    DATA_TYPE_64("DataType_64"),
    @XmlEnumValue("View_128")
    VIEW_128("View_128");
    private final String value;

    NodeClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeClass fromValue(String v) {
        for (NodeClass c: NodeClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
