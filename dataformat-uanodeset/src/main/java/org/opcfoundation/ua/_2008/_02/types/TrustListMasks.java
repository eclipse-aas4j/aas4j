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
 * <p>Java-Klasse für TrustListMasks.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TrustListMasks"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None_0"/&gt;
 *     &lt;enumeration value="TrustedCertificates_1"/&gt;
 *     &lt;enumeration value="TrustedCrls_2"/&gt;
 *     &lt;enumeration value="IssuerCertificates_4"/&gt;
 *     &lt;enumeration value="IssuerCrls_8"/&gt;
 *     &lt;enumeration value="All_15"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrustListMasks")
@XmlEnum
public enum TrustListMasks {

    @XmlEnumValue("None_0")
    NONE_0("None_0"),
    @XmlEnumValue("TrustedCertificates_1")
    TRUSTED_CERTIFICATES_1("TrustedCertificates_1"),
    @XmlEnumValue("TrustedCrls_2")
    TRUSTED_CRLS_2("TrustedCrls_2"),
    @XmlEnumValue("IssuerCertificates_4")
    ISSUER_CERTIFICATES_4("IssuerCertificates_4"),
    @XmlEnumValue("IssuerCrls_8")
    ISSUER_CRLS_8("IssuerCrls_8"),
    @XmlEnumValue("All_15")
    ALL_15("All_15");
    private final String value;

    TrustListMasks(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrustListMasks fromValue(String v) {
        for (TrustListMasks c: TrustListMasks.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
