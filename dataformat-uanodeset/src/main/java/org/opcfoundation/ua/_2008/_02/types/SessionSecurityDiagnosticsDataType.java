//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für SessionSecurityDiagnosticsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SessionSecurityDiagnosticsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="ClientUserIdOfSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientUserIdHistory" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationMechanism" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityMode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MessageSecurityMode" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPolicyUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientCertificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionSecurityDiagnosticsDataType", propOrder = {
    "sessionId",
    "clientUserIdOfSession",
    "clientUserIdHistory",
    "authenticationMechanism",
    "encoding",
    "transportProtocol",
    "securityMode",
    "securityPolicyUri",
    "clientCertificate"
})
public class SessionSecurityDiagnosticsDataType {

    @XmlElementRef(name = "SessionId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> sessionId;
    @XmlElementRef(name = "ClientUserIdOfSession", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientUserIdOfSession;
    @XmlElementRef(name = "ClientUserIdHistory", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> clientUserIdHistory;
    @XmlElementRef(name = "AuthenticationMechanism", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticationMechanism;
    @XmlElementRef(name = "Encoding", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> encoding;
    @XmlElementRef(name = "TransportProtocol", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportProtocol;
    @XmlElement(name = "SecurityMode")
    @XmlSchemaType(name = "string")
    protected MessageSecurityMode securityMode;
    @XmlElementRef(name = "SecurityPolicyUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityPolicyUri;
    @XmlElementRef(name = "ClientCertificate", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> clientCertificate;

    /**
     * Ruft den Wert der sessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getSessionId() {
        return sessionId;
    }

    /**
     * Legt den Wert der sessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setSessionId(JAXBElement<NodeId> value) {
        this.sessionId = value;
    }

    /**
     * Ruft den Wert der clientUserIdOfSession-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientUserIdOfSession() {
        return clientUserIdOfSession;
    }

    /**
     * Legt den Wert der clientUserIdOfSession-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientUserIdOfSession(JAXBElement<String> value) {
        this.clientUserIdOfSession = value;
    }

    /**
     * Ruft den Wert der clientUserIdHistory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getClientUserIdHistory() {
        return clientUserIdHistory;
    }

    /**
     * Legt den Wert der clientUserIdHistory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setClientUserIdHistory(JAXBElement<ListOfString> value) {
        this.clientUserIdHistory = value;
    }

    /**
     * Ruft den Wert der authenticationMechanism-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticationMechanism() {
        return authenticationMechanism;
    }

    /**
     * Legt den Wert der authenticationMechanism-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticationMechanism(JAXBElement<String> value) {
        this.authenticationMechanism = value;
    }

    /**
     * Ruft den Wert der encoding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEncoding() {
        return encoding;
    }

    /**
     * Legt den Wert der encoding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEncoding(JAXBElement<String> value) {
        this.encoding = value;
    }

    /**
     * Ruft den Wert der transportProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransportProtocol() {
        return transportProtocol;
    }

    /**
     * Legt den Wert der transportProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransportProtocol(JAXBElement<String> value) {
        this.transportProtocol = value;
    }

    /**
     * Ruft den Wert der securityMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageSecurityMode }
     *     
     */
    public MessageSecurityMode getSecurityMode() {
        return securityMode;
    }

    /**
     * Legt den Wert der securityMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSecurityMode }
     *     
     */
    public void setSecurityMode(MessageSecurityMode value) {
        this.securityMode = value;
    }

    /**
     * Ruft den Wert der securityPolicyUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecurityPolicyUri() {
        return securityPolicyUri;
    }

    /**
     * Legt den Wert der securityPolicyUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecurityPolicyUri(JAXBElement<String> value) {
        this.securityPolicyUri = value;
    }

    /**
     * Ruft den Wert der clientCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getClientCertificate() {
        return clientCertificate;
    }

    /**
     * Legt den Wert der clientCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setClientCertificate(JAXBElement<byte[]> value) {
        this.clientCertificate = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SessionSecurityDiagnosticsDataType.Builder<_B> _other) {
        _other.sessionId = this.sessionId;
        _other.clientUserIdOfSession = this.clientUserIdOfSession;
        _other.clientUserIdHistory = this.clientUserIdHistory;
        _other.authenticationMechanism = this.authenticationMechanism;
        _other.encoding = this.encoding;
        _other.transportProtocol = this.transportProtocol;
        _other.securityMode = this.securityMode;
        _other.securityPolicyUri = this.securityPolicyUri;
        _other.clientCertificate = this.clientCertificate;
    }

    public<_B >SessionSecurityDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SessionSecurityDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public SessionSecurityDiagnosticsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SessionSecurityDiagnosticsDataType.Builder<Void> builder() {
        return new SessionSecurityDiagnosticsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >SessionSecurityDiagnosticsDataType.Builder<_B> copyOf(final SessionSecurityDiagnosticsDataType _other) {
        final SessionSecurityDiagnosticsDataType.Builder<_B> _newBuilder = new SessionSecurityDiagnosticsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SessionSecurityDiagnosticsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionIdPropertyTree!= null):((sessionIdPropertyTree == null)||(!sessionIdPropertyTree.isLeaf())))) {
            _other.sessionId = this.sessionId;
        }
        final PropertyTree clientUserIdOfSessionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientUserIdOfSession"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientUserIdOfSessionPropertyTree!= null):((clientUserIdOfSessionPropertyTree == null)||(!clientUserIdOfSessionPropertyTree.isLeaf())))) {
            _other.clientUserIdOfSession = this.clientUserIdOfSession;
        }
        final PropertyTree clientUserIdHistoryPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientUserIdHistory"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientUserIdHistoryPropertyTree!= null):((clientUserIdHistoryPropertyTree == null)||(!clientUserIdHistoryPropertyTree.isLeaf())))) {
            _other.clientUserIdHistory = this.clientUserIdHistory;
        }
        final PropertyTree authenticationMechanismPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationMechanism"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationMechanismPropertyTree!= null):((authenticationMechanismPropertyTree == null)||(!authenticationMechanismPropertyTree.isLeaf())))) {
            _other.authenticationMechanism = this.authenticationMechanism;
        }
        final PropertyTree encodingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("encoding"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(encodingPropertyTree!= null):((encodingPropertyTree == null)||(!encodingPropertyTree.isLeaf())))) {
            _other.encoding = this.encoding;
        }
        final PropertyTree transportProtocolPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportProtocol"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportProtocolPropertyTree!= null):((transportProtocolPropertyTree == null)||(!transportProtocolPropertyTree.isLeaf())))) {
            _other.transportProtocol = this.transportProtocol;
        }
        final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
            _other.securityMode = this.securityMode;
        }
        final PropertyTree securityPolicyUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityPolicyUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityPolicyUriPropertyTree!= null):((securityPolicyUriPropertyTree == null)||(!securityPolicyUriPropertyTree.isLeaf())))) {
            _other.securityPolicyUri = this.securityPolicyUri;
        }
        final PropertyTree clientCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientCertificate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientCertificatePropertyTree!= null):((clientCertificatePropertyTree == null)||(!clientCertificatePropertyTree.isLeaf())))) {
            _other.clientCertificate = this.clientCertificate;
        }
    }

    public<_B >SessionSecurityDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SessionSecurityDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SessionSecurityDiagnosticsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SessionSecurityDiagnosticsDataType.Builder<_B> copyOf(final SessionSecurityDiagnosticsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SessionSecurityDiagnosticsDataType.Builder<_B> _newBuilder = new SessionSecurityDiagnosticsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SessionSecurityDiagnosticsDataType.Builder<Void> copyExcept(final SessionSecurityDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SessionSecurityDiagnosticsDataType.Builder<Void> copyOnly(final SessionSecurityDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SessionSecurityDiagnosticsDataType _storedValue;
        private JAXBElement<NodeId> sessionId;
        private JAXBElement<String> clientUserIdOfSession;
        private JAXBElement<ListOfString> clientUserIdHistory;
        private JAXBElement<String> authenticationMechanism;
        private JAXBElement<String> encoding;
        private JAXBElement<String> transportProtocol;
        private MessageSecurityMode securityMode;
        private JAXBElement<String> securityPolicyUri;
        private JAXBElement<byte[]> clientCertificate;

        public Builder(final _B _parentBuilder, final SessionSecurityDiagnosticsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.sessionId = _other.sessionId;
                    this.clientUserIdOfSession = _other.clientUserIdOfSession;
                    this.clientUserIdHistory = _other.clientUserIdHistory;
                    this.authenticationMechanism = _other.authenticationMechanism;
                    this.encoding = _other.encoding;
                    this.transportProtocol = _other.transportProtocol;
                    this.securityMode = _other.securityMode;
                    this.securityPolicyUri = _other.securityPolicyUri;
                    this.clientCertificate = _other.clientCertificate;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SessionSecurityDiagnosticsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree sessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionIdPropertyTree!= null):((sessionIdPropertyTree == null)||(!sessionIdPropertyTree.isLeaf())))) {
                        this.sessionId = _other.sessionId;
                    }
                    final PropertyTree clientUserIdOfSessionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientUserIdOfSession"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientUserIdOfSessionPropertyTree!= null):((clientUserIdOfSessionPropertyTree == null)||(!clientUserIdOfSessionPropertyTree.isLeaf())))) {
                        this.clientUserIdOfSession = _other.clientUserIdOfSession;
                    }
                    final PropertyTree clientUserIdHistoryPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientUserIdHistory"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientUserIdHistoryPropertyTree!= null):((clientUserIdHistoryPropertyTree == null)||(!clientUserIdHistoryPropertyTree.isLeaf())))) {
                        this.clientUserIdHistory = _other.clientUserIdHistory;
                    }
                    final PropertyTree authenticationMechanismPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationMechanism"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationMechanismPropertyTree!= null):((authenticationMechanismPropertyTree == null)||(!authenticationMechanismPropertyTree.isLeaf())))) {
                        this.authenticationMechanism = _other.authenticationMechanism;
                    }
                    final PropertyTree encodingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("encoding"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(encodingPropertyTree!= null):((encodingPropertyTree == null)||(!encodingPropertyTree.isLeaf())))) {
                        this.encoding = _other.encoding;
                    }
                    final PropertyTree transportProtocolPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportProtocol"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportProtocolPropertyTree!= null):((transportProtocolPropertyTree == null)||(!transportProtocolPropertyTree.isLeaf())))) {
                        this.transportProtocol = _other.transportProtocol;
                    }
                    final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
                        this.securityMode = _other.securityMode;
                    }
                    final PropertyTree securityPolicyUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityPolicyUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityPolicyUriPropertyTree!= null):((securityPolicyUriPropertyTree == null)||(!securityPolicyUriPropertyTree.isLeaf())))) {
                        this.securityPolicyUri = _other.securityPolicyUri;
                    }
                    final PropertyTree clientCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientCertificate"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientCertificatePropertyTree!= null):((clientCertificatePropertyTree == null)||(!clientCertificatePropertyTree.isLeaf())))) {
                        this.clientCertificate = _other.clientCertificate;
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends SessionSecurityDiagnosticsDataType >_P init(final _P _product) {
            _product.sessionId = this.sessionId;
            _product.clientUserIdOfSession = this.clientUserIdOfSession;
            _product.clientUserIdHistory = this.clientUserIdHistory;
            _product.authenticationMechanism = this.authenticationMechanism;
            _product.encoding = this.encoding;
            _product.transportProtocol = this.transportProtocol;
            _product.securityMode = this.securityMode;
            _product.securityPolicyUri = this.securityPolicyUri;
            _product.clientCertificate = this.clientCertificate;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param sessionId
         *     Neuer Wert der Eigenschaft "sessionId".
         */
        public SessionSecurityDiagnosticsDataType.Builder<_B> withSessionId(final JAXBElement<NodeId> sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientUserIdOfSession" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param clientUserIdOfSession
         *     Neuer Wert der Eigenschaft "clientUserIdOfSession".
         */
        public SessionSecurityDiagnosticsDataType.Builder<_B> withClientUserIdOfSession(final JAXBElement<String> clientUserIdOfSession) {
            this.clientUserIdOfSession = clientUserIdOfSession;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientUserIdHistory" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param clientUserIdHistory
         *     Neuer Wert der Eigenschaft "clientUserIdHistory".
         */
        public SessionSecurityDiagnosticsDataType.Builder<_B> withClientUserIdHistory(final JAXBElement<ListOfString> clientUserIdHistory) {
            this.clientUserIdHistory = clientUserIdHistory;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "authenticationMechanism" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param authenticationMechanism
         *     Neuer Wert der Eigenschaft "authenticationMechanism".
         */
        public SessionSecurityDiagnosticsDataType.Builder<_B> withAuthenticationMechanism(final JAXBElement<String> authenticationMechanism) {
            this.authenticationMechanism = authenticationMechanism;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "encoding" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param encoding
         *     Neuer Wert der Eigenschaft "encoding".
         */
        public SessionSecurityDiagnosticsDataType.Builder<_B> withEncoding(final JAXBElement<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transportProtocol" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transportProtocol
         *     Neuer Wert der Eigenschaft "transportProtocol".
         */
        public SessionSecurityDiagnosticsDataType.Builder<_B> withTransportProtocol(final JAXBElement<String> transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityMode
         *     Neuer Wert der Eigenschaft "securityMode".
         */
        public SessionSecurityDiagnosticsDataType.Builder<_B> withSecurityMode(final MessageSecurityMode securityMode) {
            this.securityMode = securityMode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityPolicyUri" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param securityPolicyUri
         *     Neuer Wert der Eigenschaft "securityPolicyUri".
         */
        public SessionSecurityDiagnosticsDataType.Builder<_B> withSecurityPolicyUri(final JAXBElement<String> securityPolicyUri) {
            this.securityPolicyUri = securityPolicyUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientCertificate" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param clientCertificate
         *     Neuer Wert der Eigenschaft "clientCertificate".
         */
        public SessionSecurityDiagnosticsDataType.Builder<_B> withClientCertificate(final JAXBElement<byte[]> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }

        @Override
        public SessionSecurityDiagnosticsDataType build() {
            if (_storedValue == null) {
                return this.init(new SessionSecurityDiagnosticsDataType());
            } else {
                return ((SessionSecurityDiagnosticsDataType) _storedValue);
            }
        }

        public SessionSecurityDiagnosticsDataType.Builder<_B> copyOf(final SessionSecurityDiagnosticsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public SessionSecurityDiagnosticsDataType.Builder<_B> copyOf(final SessionSecurityDiagnosticsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SessionSecurityDiagnosticsDataType.Selector<SessionSecurityDiagnosticsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SessionSecurityDiagnosticsDataType.Select _root() {
            return new SessionSecurityDiagnosticsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> sessionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> clientUserIdOfSession = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> clientUserIdHistory = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> authenticationMechanism = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> encoding = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> transportProtocol = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> securityMode = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> securityPolicyUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> clientCertificate = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.sessionId!= null) {
                products.put("sessionId", this.sessionId.init());
            }
            if (this.clientUserIdOfSession!= null) {
                products.put("clientUserIdOfSession", this.clientUserIdOfSession.init());
            }
            if (this.clientUserIdHistory!= null) {
                products.put("clientUserIdHistory", this.clientUserIdHistory.init());
            }
            if (this.authenticationMechanism!= null) {
                products.put("authenticationMechanism", this.authenticationMechanism.init());
            }
            if (this.encoding!= null) {
                products.put("encoding", this.encoding.init());
            }
            if (this.transportProtocol!= null) {
                products.put("transportProtocol", this.transportProtocol.init());
            }
            if (this.securityMode!= null) {
                products.put("securityMode", this.securityMode.init());
            }
            if (this.securityPolicyUri!= null) {
                products.put("securityPolicyUri", this.securityPolicyUri.init());
            }
            if (this.clientCertificate!= null) {
                products.put("clientCertificate", this.clientCertificate.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> sessionId() {
            return ((this.sessionId == null)?this.sessionId = new com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "sessionId"):this.sessionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> clientUserIdOfSession() {
            return ((this.clientUserIdOfSession == null)?this.clientUserIdOfSession = new com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "clientUserIdOfSession"):this.clientUserIdOfSession);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> clientUserIdHistory() {
            return ((this.clientUserIdHistory == null)?this.clientUserIdHistory = new com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "clientUserIdHistory"):this.clientUserIdHistory);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> authenticationMechanism() {
            return ((this.authenticationMechanism == null)?this.authenticationMechanism = new com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "authenticationMechanism"):this.authenticationMechanism);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> encoding() {
            return ((this.encoding == null)?this.encoding = new com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "encoding"):this.encoding);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> transportProtocol() {
            return ((this.transportProtocol == null)?this.transportProtocol = new com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "transportProtocol"):this.transportProtocol);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> securityMode() {
            return ((this.securityMode == null)?this.securityMode = new com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "securityMode"):this.securityMode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> securityPolicyUri() {
            return ((this.securityPolicyUri == null)?this.securityPolicyUri = new com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "securityPolicyUri"):this.securityPolicyUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> clientCertificate() {
            return ((this.clientCertificate == null)?this.clientCertificate = new com.kscs.util.jaxb.Selector<TRoot, SessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "clientCertificate"):this.clientCertificate);
        }

    }

}
