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
 * <p>Java-Klasse für NodeAttributesMask.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NodeAttributesMask"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None_0"/&gt;
 *     &lt;enumeration value="AccessLevel_1"/&gt;
 *     &lt;enumeration value="ArrayDimensions_2"/&gt;
 *     &lt;enumeration value="BrowseName_4"/&gt;
 *     &lt;enumeration value="ContainsNoLoops_8"/&gt;
 *     &lt;enumeration value="DataType_16"/&gt;
 *     &lt;enumeration value="Description_32"/&gt;
 *     &lt;enumeration value="DisplayName_64"/&gt;
 *     &lt;enumeration value="EventNotifier_128"/&gt;
 *     &lt;enumeration value="Executable_256"/&gt;
 *     &lt;enumeration value="Historizing_512"/&gt;
 *     &lt;enumeration value="InverseName_1024"/&gt;
 *     &lt;enumeration value="IsAbstract_2048"/&gt;
 *     &lt;enumeration value="MinimumSamplingInterval_4096"/&gt;
 *     &lt;enumeration value="NodeClass_8192"/&gt;
 *     &lt;enumeration value="NodeId_16384"/&gt;
 *     &lt;enumeration value="Symmetric_32768"/&gt;
 *     &lt;enumeration value="UserAccessLevel_65536"/&gt;
 *     &lt;enumeration value="UserExecutable_131072"/&gt;
 *     &lt;enumeration value="UserWriteMask_262144"/&gt;
 *     &lt;enumeration value="ValueRank_524288"/&gt;
 *     &lt;enumeration value="WriteMask_1048576"/&gt;
 *     &lt;enumeration value="Value_2097152"/&gt;
 *     &lt;enumeration value="DataTypeDefinition_4194304"/&gt;
 *     &lt;enumeration value="RolePermissions_8388608"/&gt;
 *     &lt;enumeration value="AccessRestrictions_16777216"/&gt;
 *     &lt;enumeration value="All_33554431"/&gt;
 *     &lt;enumeration value="BaseNode_26501220"/&gt;
 *     &lt;enumeration value="Object_26501348"/&gt;
 *     &lt;enumeration value="ObjectType_26503268"/&gt;
 *     &lt;enumeration value="Variable_26571383"/&gt;
 *     &lt;enumeration value="VariableType_28600438"/&gt;
 *     &lt;enumeration value="Method_26632548"/&gt;
 *     &lt;enumeration value="ReferenceType_26537060"/&gt;
 *     &lt;enumeration value="View_26501356"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NodeAttributesMask")
@XmlEnum
public enum NodeAttributesMask {

    @XmlEnumValue("None_0")
    NONE_0("None_0"),
    @XmlEnumValue("AccessLevel_1")
    ACCESS_LEVEL_1("AccessLevel_1"),
    @XmlEnumValue("ArrayDimensions_2")
    ARRAY_DIMENSIONS_2("ArrayDimensions_2"),
    @XmlEnumValue("BrowseName_4")
    BROWSE_NAME_4("BrowseName_4"),
    @XmlEnumValue("ContainsNoLoops_8")
    CONTAINS_NO_LOOPS_8("ContainsNoLoops_8"),
    @XmlEnumValue("DataType_16")
    DATA_TYPE_16("DataType_16"),
    @XmlEnumValue("Description_32")
    DESCRIPTION_32("Description_32"),
    @XmlEnumValue("DisplayName_64")
    DISPLAY_NAME_64("DisplayName_64"),
    @XmlEnumValue("EventNotifier_128")
    EVENT_NOTIFIER_128("EventNotifier_128"),
    @XmlEnumValue("Executable_256")
    EXECUTABLE_256("Executable_256"),
    @XmlEnumValue("Historizing_512")
    HISTORIZING_512("Historizing_512"),
    @XmlEnumValue("InverseName_1024")
    INVERSE_NAME_1024("InverseName_1024"),
    @XmlEnumValue("IsAbstract_2048")
    IS_ABSTRACT_2048("IsAbstract_2048"),
    @XmlEnumValue("MinimumSamplingInterval_4096")
    MINIMUM_SAMPLING_INTERVAL_4096("MinimumSamplingInterval_4096"),
    @XmlEnumValue("NodeClass_8192")
    NODE_CLASS_8192("NodeClass_8192"),
    @XmlEnumValue("NodeId_16384")
    NODE_ID_16384("NodeId_16384"),
    @XmlEnumValue("Symmetric_32768")
    SYMMETRIC_32768("Symmetric_32768"),
    @XmlEnumValue("UserAccessLevel_65536")
    USER_ACCESS_LEVEL_65536("UserAccessLevel_65536"),
    @XmlEnumValue("UserExecutable_131072")
    USER_EXECUTABLE_131072("UserExecutable_131072"),
    @XmlEnumValue("UserWriteMask_262144")
    USER_WRITE_MASK_262144("UserWriteMask_262144"),
    @XmlEnumValue("ValueRank_524288")
    VALUE_RANK_524288("ValueRank_524288"),
    @XmlEnumValue("WriteMask_1048576")
    WRITE_MASK_1048576("WriteMask_1048576"),
    @XmlEnumValue("Value_2097152")
    VALUE_2097152("Value_2097152"),
    @XmlEnumValue("DataTypeDefinition_4194304")
    DATA_TYPE_DEFINITION_4194304("DataTypeDefinition_4194304"),
    @XmlEnumValue("RolePermissions_8388608")
    ROLE_PERMISSIONS_8388608("RolePermissions_8388608"),
    @XmlEnumValue("AccessRestrictions_16777216")
    ACCESS_RESTRICTIONS_16777216("AccessRestrictions_16777216"),
    @XmlEnumValue("All_33554431")
    ALL_33554431("All_33554431"),
    @XmlEnumValue("BaseNode_26501220")
    BASE_NODE_26501220("BaseNode_26501220"),
    @XmlEnumValue("Object_26501348")
    OBJECT_26501348("Object_26501348"),
    @XmlEnumValue("ObjectType_26503268")
    OBJECT_TYPE_26503268("ObjectType_26503268"),
    @XmlEnumValue("Variable_26571383")
    VARIABLE_26571383("Variable_26571383"),
    @XmlEnumValue("VariableType_28600438")
    VARIABLE_TYPE_28600438("VariableType_28600438"),
    @XmlEnumValue("Method_26632548")
    METHOD_26632548("Method_26632548"),
    @XmlEnumValue("ReferenceType_26537060")
    REFERENCE_TYPE_26537060("ReferenceType_26537060"),
    @XmlEnumValue("View_26501356")
    VIEW_26501356("View_26501356");
    private final String value;

    NodeAttributesMask(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NodeAttributesMask fromValue(String v) {
        for (NodeAttributesMask c: NodeAttributesMask.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
