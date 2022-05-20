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
 * <p>Java-Klasse für ServerState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ServerState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Running_0"/&gt;
 *     &lt;enumeration value="Failed_1"/&gt;
 *     &lt;enumeration value="NoConfiguration_2"/&gt;
 *     &lt;enumeration value="Suspended_3"/&gt;
 *     &lt;enumeration value="Shutdown_4"/&gt;
 *     &lt;enumeration value="Test_5"/&gt;
 *     &lt;enumeration value="CommunicationFault_6"/&gt;
 *     &lt;enumeration value="Unknown_7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServerState")
@XmlEnum
public enum ServerState {

    @XmlEnumValue("Running_0")
    RUNNING_0("Running_0"),
    @XmlEnumValue("Failed_1")
    FAILED_1("Failed_1"),
    @XmlEnumValue("NoConfiguration_2")
    NO_CONFIGURATION_2("NoConfiguration_2"),
    @XmlEnumValue("Suspended_3")
    SUSPENDED_3("Suspended_3"),
    @XmlEnumValue("Shutdown_4")
    SHUTDOWN_4("Shutdown_4"),
    @XmlEnumValue("Test_5")
    TEST_5("Test_5"),
    @XmlEnumValue("CommunicationFault_6")
    COMMUNICATION_FAULT_6("CommunicationFault_6"),
    @XmlEnumValue("Unknown_7")
    UNKNOWN_7("Unknown_7");
    private final String value;

    ServerState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServerState fromValue(String v) {
        for (ServerState c: ServerState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
