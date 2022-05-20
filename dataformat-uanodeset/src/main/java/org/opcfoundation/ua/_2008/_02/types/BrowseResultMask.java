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
 * <p>Java-Klasse für BrowseResultMask.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BrowseResultMask"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None_0"/&gt;
 *     &lt;enumeration value="ReferenceTypeId_1"/&gt;
 *     &lt;enumeration value="IsForward_2"/&gt;
 *     &lt;enumeration value="NodeClass_4"/&gt;
 *     &lt;enumeration value="BrowseName_8"/&gt;
 *     &lt;enumeration value="DisplayName_16"/&gt;
 *     &lt;enumeration value="TypeDefinition_32"/&gt;
 *     &lt;enumeration value="All_63"/&gt;
 *     &lt;enumeration value="ReferenceTypeInfo_3"/&gt;
 *     &lt;enumeration value="TargetInfo_60"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BrowseResultMask")
@XmlEnum
public enum BrowseResultMask {

    @XmlEnumValue("None_0")
    NONE_0("None_0"),
    @XmlEnumValue("ReferenceTypeId_1")
    REFERENCE_TYPE_ID_1("ReferenceTypeId_1"),
    @XmlEnumValue("IsForward_2")
    IS_FORWARD_2("IsForward_2"),
    @XmlEnumValue("NodeClass_4")
    NODE_CLASS_4("NodeClass_4"),
    @XmlEnumValue("BrowseName_8")
    BROWSE_NAME_8("BrowseName_8"),
    @XmlEnumValue("DisplayName_16")
    DISPLAY_NAME_16("DisplayName_16"),
    @XmlEnumValue("TypeDefinition_32")
    TYPE_DEFINITION_32("TypeDefinition_32"),
    @XmlEnumValue("All_63")
    ALL_63("All_63"),
    @XmlEnumValue("ReferenceTypeInfo_3")
    REFERENCE_TYPE_INFO_3("ReferenceTypeInfo_3"),
    @XmlEnumValue("TargetInfo_60")
    TARGET_INFO_60("TargetInfo_60");
    private final String value;

    BrowseResultMask(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BrowseResultMask fromValue(String v) {
        for (BrowseResultMask c: BrowseResultMask.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
