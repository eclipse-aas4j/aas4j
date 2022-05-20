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
 * <p>Java-Klasse für EndpointDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EndpointDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndpointUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Server" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ApplicationDescription" minOccurs="0"/&gt;
 *         &lt;element name="ServerCertificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="SecurityMode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MessageSecurityMode" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPolicyUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserIdentityTokens" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUserTokenPolicy" minOccurs="0"/&gt;
 *         &lt;element name="TransportProfileUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointDescription", propOrder = {
    "endpointUrl",
    "server",
    "serverCertificate",
    "securityMode",
    "securityPolicyUri",
    "userIdentityTokens",
    "transportProfileUri",
    "securityLevel"
})
public class EndpointDescription {

    @XmlElementRef(name = "EndpointUrl", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endpointUrl;
    @XmlElementRef(name = "Server", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ApplicationDescription> server;
    @XmlElementRef(name = "ServerCertificate", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> serverCertificate;
    @XmlElement(name = "SecurityMode")
    @XmlSchemaType(name = "string")
    protected MessageSecurityMode securityMode;
    @XmlElementRef(name = "SecurityPolicyUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityPolicyUri;
    @XmlElementRef(name = "UserIdentityTokens", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfUserTokenPolicy> userIdentityTokens;
    @XmlElementRef(name = "TransportProfileUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportProfileUri;
    @XmlElement(name = "SecurityLevel")
    @XmlSchemaType(name = "unsignedByte")
    protected Short securityLevel;

    /**
     * Ruft den Wert der endpointUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndpointUrl() {
        return endpointUrl;
    }

    /**
     * Legt den Wert der endpointUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndpointUrl(JAXBElement<String> value) {
        this.endpointUrl = value;
    }

    /**
     * Ruft den Wert der server-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApplicationDescription }{@code >}
     *     
     */
    public JAXBElement<ApplicationDescription> getServer() {
        return server;
    }

    /**
     * Legt den Wert der server-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApplicationDescription }{@code >}
     *     
     */
    public void setServer(JAXBElement<ApplicationDescription> value) {
        this.server = value;
    }

    /**
     * Ruft den Wert der serverCertificate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getServerCertificate() {
        return serverCertificate;
    }

    /**
     * Legt den Wert der serverCertificate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setServerCertificate(JAXBElement<byte[]> value) {
        this.serverCertificate = value;
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
     * Ruft den Wert der userIdentityTokens-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfUserTokenPolicy }{@code >}
     *     
     */
    public JAXBElement<ListOfUserTokenPolicy> getUserIdentityTokens() {
        return userIdentityTokens;
    }

    /**
     * Legt den Wert der userIdentityTokens-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfUserTokenPolicy }{@code >}
     *     
     */
    public void setUserIdentityTokens(JAXBElement<ListOfUserTokenPolicy> value) {
        this.userIdentityTokens = value;
    }

    /**
     * Ruft den Wert der transportProfileUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransportProfileUri() {
        return transportProfileUri;
    }

    /**
     * Legt den Wert der transportProfileUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransportProfileUri(JAXBElement<String> value) {
        this.transportProfileUri = value;
    }

    /**
     * Ruft den Wert der securityLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Legt den Wert der securityLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSecurityLevel(Short value) {
        this.securityLevel = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EndpointDescription.Builder<_B> _other) {
        _other.endpointUrl = this.endpointUrl;
        _other.server = this.server;
        _other.serverCertificate = this.serverCertificate;
        _other.securityMode = this.securityMode;
        _other.securityPolicyUri = this.securityPolicyUri;
        _other.userIdentityTokens = this.userIdentityTokens;
        _other.transportProfileUri = this.transportProfileUri;
        _other.securityLevel = this.securityLevel;
    }

    public<_B >EndpointDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EndpointDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public EndpointDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EndpointDescription.Builder<Void> builder() {
        return new EndpointDescription.Builder<Void>(null, null, false);
    }

    public static<_B >EndpointDescription.Builder<_B> copyOf(final EndpointDescription _other) {
        final EndpointDescription.Builder<_B> _newBuilder = new EndpointDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EndpointDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
            _other.endpointUrl = this.endpointUrl;
        }
        final PropertyTree serverPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("server"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverPropertyTree!= null):((serverPropertyTree == null)||(!serverPropertyTree.isLeaf())))) {
            _other.server = this.server;
        }
        final PropertyTree serverCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCertificate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCertificatePropertyTree!= null):((serverCertificatePropertyTree == null)||(!serverCertificatePropertyTree.isLeaf())))) {
            _other.serverCertificate = this.serverCertificate;
        }
        final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
            _other.securityMode = this.securityMode;
        }
        final PropertyTree securityPolicyUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityPolicyUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityPolicyUriPropertyTree!= null):((securityPolicyUriPropertyTree == null)||(!securityPolicyUriPropertyTree.isLeaf())))) {
            _other.securityPolicyUri = this.securityPolicyUri;
        }
        final PropertyTree userIdentityTokensPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userIdentityTokens"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userIdentityTokensPropertyTree!= null):((userIdentityTokensPropertyTree == null)||(!userIdentityTokensPropertyTree.isLeaf())))) {
            _other.userIdentityTokens = this.userIdentityTokens;
        }
        final PropertyTree transportProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportProfileUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportProfileUriPropertyTree!= null):((transportProfileUriPropertyTree == null)||(!transportProfileUriPropertyTree.isLeaf())))) {
            _other.transportProfileUri = this.transportProfileUri;
        }
        final PropertyTree securityLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityLevel"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityLevelPropertyTree!= null):((securityLevelPropertyTree == null)||(!securityLevelPropertyTree.isLeaf())))) {
            _other.securityLevel = this.securityLevel;
        }
    }

    public<_B >EndpointDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EndpointDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public EndpointDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EndpointDescription.Builder<_B> copyOf(final EndpointDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EndpointDescription.Builder<_B> _newBuilder = new EndpointDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EndpointDescription.Builder<Void> copyExcept(final EndpointDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EndpointDescription.Builder<Void> copyOnly(final EndpointDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final EndpointDescription _storedValue;
        private JAXBElement<String> endpointUrl;
        private JAXBElement<ApplicationDescription> server;
        private JAXBElement<byte[]> serverCertificate;
        private MessageSecurityMode securityMode;
        private JAXBElement<String> securityPolicyUri;
        private JAXBElement<ListOfUserTokenPolicy> userIdentityTokens;
        private JAXBElement<String> transportProfileUri;
        private Short securityLevel;

        public Builder(final _B _parentBuilder, final EndpointDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.endpointUrl = _other.endpointUrl;
                    this.server = _other.server;
                    this.serverCertificate = _other.serverCertificate;
                    this.securityMode = _other.securityMode;
                    this.securityPolicyUri = _other.securityPolicyUri;
                    this.userIdentityTokens = _other.userIdentityTokens;
                    this.transportProfileUri = _other.transportProfileUri;
                    this.securityLevel = _other.securityLevel;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final EndpointDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
                        this.endpointUrl = _other.endpointUrl;
                    }
                    final PropertyTree serverPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("server"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverPropertyTree!= null):((serverPropertyTree == null)||(!serverPropertyTree.isLeaf())))) {
                        this.server = _other.server;
                    }
                    final PropertyTree serverCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCertificate"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCertificatePropertyTree!= null):((serverCertificatePropertyTree == null)||(!serverCertificatePropertyTree.isLeaf())))) {
                        this.serverCertificate = _other.serverCertificate;
                    }
                    final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
                        this.securityMode = _other.securityMode;
                    }
                    final PropertyTree securityPolicyUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityPolicyUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityPolicyUriPropertyTree!= null):((securityPolicyUriPropertyTree == null)||(!securityPolicyUriPropertyTree.isLeaf())))) {
                        this.securityPolicyUri = _other.securityPolicyUri;
                    }
                    final PropertyTree userIdentityTokensPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userIdentityTokens"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userIdentityTokensPropertyTree!= null):((userIdentityTokensPropertyTree == null)||(!userIdentityTokensPropertyTree.isLeaf())))) {
                        this.userIdentityTokens = _other.userIdentityTokens;
                    }
                    final PropertyTree transportProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportProfileUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportProfileUriPropertyTree!= null):((transportProfileUriPropertyTree == null)||(!transportProfileUriPropertyTree.isLeaf())))) {
                        this.transportProfileUri = _other.transportProfileUri;
                    }
                    final PropertyTree securityLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityLevel"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityLevelPropertyTree!= null):((securityLevelPropertyTree == null)||(!securityLevelPropertyTree.isLeaf())))) {
                        this.securityLevel = _other.securityLevel;
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

        protected<_P extends EndpointDescription >_P init(final _P _product) {
            _product.endpointUrl = this.endpointUrl;
            _product.server = this.server;
            _product.serverCertificate = this.serverCertificate;
            _product.securityMode = this.securityMode;
            _product.securityPolicyUri = this.securityPolicyUri;
            _product.userIdentityTokens = this.userIdentityTokens;
            _product.transportProfileUri = this.transportProfileUri;
            _product.securityLevel = this.securityLevel;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointUrl" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param endpointUrl
         *     Neuer Wert der Eigenschaft "endpointUrl".
         */
        public EndpointDescription.Builder<_B> withEndpointUrl(final JAXBElement<String> endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "server" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param server
         *     Neuer Wert der Eigenschaft "server".
         */
        public EndpointDescription.Builder<_B> withServer(final JAXBElement<ApplicationDescription> server) {
            this.server = server;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverCertificate" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param serverCertificate
         *     Neuer Wert der Eigenschaft "serverCertificate".
         */
        public EndpointDescription.Builder<_B> withServerCertificate(final JAXBElement<byte[]> serverCertificate) {
            this.serverCertificate = serverCertificate;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityMode
         *     Neuer Wert der Eigenschaft "securityMode".
         */
        public EndpointDescription.Builder<_B> withSecurityMode(final MessageSecurityMode securityMode) {
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
        public EndpointDescription.Builder<_B> withSecurityPolicyUri(final JAXBElement<String> securityPolicyUri) {
            this.securityPolicyUri = securityPolicyUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userIdentityTokens" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param userIdentityTokens
         *     Neuer Wert der Eigenschaft "userIdentityTokens".
         */
        public EndpointDescription.Builder<_B> withUserIdentityTokens(final JAXBElement<ListOfUserTokenPolicy> userIdentityTokens) {
            this.userIdentityTokens = userIdentityTokens;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transportProfileUri" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transportProfileUri
         *     Neuer Wert der Eigenschaft "transportProfileUri".
         */
        public EndpointDescription.Builder<_B> withTransportProfileUri(final JAXBElement<String> transportProfileUri) {
            this.transportProfileUri = transportProfileUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityLevel" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityLevel
         *     Neuer Wert der Eigenschaft "securityLevel".
         */
        public EndpointDescription.Builder<_B> withSecurityLevel(final Short securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        @Override
        public EndpointDescription build() {
            if (_storedValue == null) {
                return this.init(new EndpointDescription());
            } else {
                return ((EndpointDescription) _storedValue);
            }
        }

        public EndpointDescription.Builder<_B> copyOf(final EndpointDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public EndpointDescription.Builder<_B> copyOf(final EndpointDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EndpointDescription.Selector<EndpointDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EndpointDescription.Select _root() {
            return new EndpointDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> endpointUrl = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> server = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> serverCertificate = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> securityMode = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> securityPolicyUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> userIdentityTokens = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> transportProfileUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> securityLevel = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.endpointUrl!= null) {
                products.put("endpointUrl", this.endpointUrl.init());
            }
            if (this.server!= null) {
                products.put("server", this.server.init());
            }
            if (this.serverCertificate!= null) {
                products.put("serverCertificate", this.serverCertificate.init());
            }
            if (this.securityMode!= null) {
                products.put("securityMode", this.securityMode.init());
            }
            if (this.securityPolicyUri!= null) {
                products.put("securityPolicyUri", this.securityPolicyUri.init());
            }
            if (this.userIdentityTokens!= null) {
                products.put("userIdentityTokens", this.userIdentityTokens.init());
            }
            if (this.transportProfileUri!= null) {
                products.put("transportProfileUri", this.transportProfileUri.init());
            }
            if (this.securityLevel!= null) {
                products.put("securityLevel", this.securityLevel.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> endpointUrl() {
            return ((this.endpointUrl == null)?this.endpointUrl = new com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>>(this._root, this, "endpointUrl"):this.endpointUrl);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> server() {
            return ((this.server == null)?this.server = new com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>>(this._root, this, "server"):this.server);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> serverCertificate() {
            return ((this.serverCertificate == null)?this.serverCertificate = new com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>>(this._root, this, "serverCertificate"):this.serverCertificate);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> securityMode() {
            return ((this.securityMode == null)?this.securityMode = new com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>>(this._root, this, "securityMode"):this.securityMode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> securityPolicyUri() {
            return ((this.securityPolicyUri == null)?this.securityPolicyUri = new com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>>(this._root, this, "securityPolicyUri"):this.securityPolicyUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> userIdentityTokens() {
            return ((this.userIdentityTokens == null)?this.userIdentityTokens = new com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>>(this._root, this, "userIdentityTokens"):this.userIdentityTokens);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> transportProfileUri() {
            return ((this.transportProfileUri == null)?this.transportProfileUri = new com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>>(this._root, this, "transportProfileUri"):this.transportProfileUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>> securityLevel() {
            return ((this.securityLevel == null)?this.securityLevel = new com.kscs.util.jaxb.Selector<TRoot, EndpointDescription.Selector<TRoot, TParent>>(this._root, this, "securityLevel"):this.securityLevel);
        }

    }

}
