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
 * <p>Java-Klasse für FilterOperator.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Equals_0"/&gt;
 *     &lt;enumeration value="IsNull_1"/&gt;
 *     &lt;enumeration value="GreaterThan_2"/&gt;
 *     &lt;enumeration value="LessThan_3"/&gt;
 *     &lt;enumeration value="GreaterThanOrEqual_4"/&gt;
 *     &lt;enumeration value="LessThanOrEqual_5"/&gt;
 *     &lt;enumeration value="Like_6"/&gt;
 *     &lt;enumeration value="Not_7"/&gt;
 *     &lt;enumeration value="Between_8"/&gt;
 *     &lt;enumeration value="InList_9"/&gt;
 *     &lt;enumeration value="And_10"/&gt;
 *     &lt;enumeration value="Or_11"/&gt;
 *     &lt;enumeration value="Cast_12"/&gt;
 *     &lt;enumeration value="InView_13"/&gt;
 *     &lt;enumeration value="OfType_14"/&gt;
 *     &lt;enumeration value="RelatedTo_15"/&gt;
 *     &lt;enumeration value="BitwiseAnd_16"/&gt;
 *     &lt;enumeration value="BitwiseOr_17"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FilterOperator")
@XmlEnum
public enum FilterOperator {

    @XmlEnumValue("Equals_0")
    EQUALS_0("Equals_0"),
    @XmlEnumValue("IsNull_1")
    IS_NULL_1("IsNull_1"),
    @XmlEnumValue("GreaterThan_2")
    GREATER_THAN_2("GreaterThan_2"),
    @XmlEnumValue("LessThan_3")
    LESS_THAN_3("LessThan_3"),
    @XmlEnumValue("GreaterThanOrEqual_4")
    GREATER_THAN_OR_EQUAL_4("GreaterThanOrEqual_4"),
    @XmlEnumValue("LessThanOrEqual_5")
    LESS_THAN_OR_EQUAL_5("LessThanOrEqual_5"),
    @XmlEnumValue("Like_6")
    LIKE_6("Like_6"),
    @XmlEnumValue("Not_7")
    NOT_7("Not_7"),
    @XmlEnumValue("Between_8")
    BETWEEN_8("Between_8"),
    @XmlEnumValue("InList_9")
    IN_LIST_9("InList_9"),
    @XmlEnumValue("And_10")
    AND_10("And_10"),
    @XmlEnumValue("Or_11")
    OR_11("Or_11"),
    @XmlEnumValue("Cast_12")
    CAST_12("Cast_12"),
    @XmlEnumValue("InView_13")
    IN_VIEW_13("InView_13"),
    @XmlEnumValue("OfType_14")
    OF_TYPE_14("OfType_14"),
    @XmlEnumValue("RelatedTo_15")
    RELATED_TO_15("RelatedTo_15"),
    @XmlEnumValue("BitwiseAnd_16")
    BITWISE_AND_16("BitwiseAnd_16"),
    @XmlEnumValue("BitwiseOr_17")
    BITWISE_OR_17("BitwiseOr_17");
    private final String value;

    FilterOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterOperator fromValue(String v) {
        for (FilterOperator c: FilterOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
