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
 * <p>Java-Klasse für OpenSecureChannelRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OpenSecureChannelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="ClientProtocolVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RequestType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SecurityTokenRequestType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityMode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MessageSecurityMode" minOccurs="0"/&gt;
 *         &lt;element name="ClientNonce" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="RequestedLifetime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenSecureChannelRequest", propOrder = {
    "requestHeader",
    "clientProtocolVersion",
    "requestType",
    "securityMode",
    "clientNonce",
    "requestedLifetime"
})
public class OpenSecureChannelRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "ClientProtocolVersion")
    @XmlSchemaType(name = "unsignedInt")
    protected Long clientProtocolVersion;
    @XmlElement(name = "RequestType")
    @XmlSchemaType(name = "string")
    protected SecurityTokenRequestType requestType;
    @XmlElement(name = "SecurityMode")
    @XmlSchemaType(name = "string")
    protected MessageSecurityMode securityMode;
    @XmlElementRef(name = "ClientNonce", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> clientNonce;
    @XmlElement(name = "RequestedLifetime")
    @XmlSchemaType(name = "unsignedInt")
    protected Long requestedLifetime;

    /**
     * Ruft den Wert der requestHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public JAXBElement<RequestHeader> getRequestHeader() {
        return requestHeader;
    }

    /**
     * Legt den Wert der requestHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public void setRequestHeader(JAXBElement<RequestHeader> value) {
        this.requestHeader = value;
    }

    /**
     * Ruft den Wert der clientProtocolVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientProtocolVersion() {
        return clientProtocolVersion;
    }

    /**
     * Legt den Wert der clientProtocolVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientProtocolVersion(Long value) {
        this.clientProtocolVersion = value;
    }

    /**
     * Ruft den Wert der requestType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTokenRequestType }
     *     
     */
    public SecurityTokenRequestType getRequestType() {
        return requestType;
    }

    /**
     * Legt den Wert der requestType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTokenRequestType }
     *     
     */
    public void setRequestType(SecurityTokenRequestType value) {
        this.requestType = value;
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
     * Ruft den Wert der clientNonce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getClientNonce() {
        return clientNonce;
    }

    /**
     * Legt den Wert der clientNonce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setClientNonce(JAXBElement<byte[]> value) {
        this.clientNonce = value;
    }

    /**
     * Ruft den Wert der requestedLifetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestedLifetime() {
        return requestedLifetime;
    }

    /**
     * Legt den Wert der requestedLifetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestedLifetime(Long value) {
        this.requestedLifetime = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final OpenSecureChannelRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.clientProtocolVersion = this.clientProtocolVersion;
        _other.requestType = this.requestType;
        _other.securityMode = this.securityMode;
        _other.clientNonce = this.clientNonce;
        _other.requestedLifetime = this.requestedLifetime;
    }

    public<_B >OpenSecureChannelRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new OpenSecureChannelRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public OpenSecureChannelRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static OpenSecureChannelRequest.Builder<Void> builder() {
        return new OpenSecureChannelRequest.Builder<Void>(null, null, false);
    }

    public static<_B >OpenSecureChannelRequest.Builder<_B> copyOf(final OpenSecureChannelRequest _other) {
        final OpenSecureChannelRequest.Builder<_B> _newBuilder = new OpenSecureChannelRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final OpenSecureChannelRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree clientProtocolVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientProtocolVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientProtocolVersionPropertyTree!= null):((clientProtocolVersionPropertyTree == null)||(!clientProtocolVersionPropertyTree.isLeaf())))) {
            _other.clientProtocolVersion = this.clientProtocolVersion;
        }
        final PropertyTree requestTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestTypePropertyTree!= null):((requestTypePropertyTree == null)||(!requestTypePropertyTree.isLeaf())))) {
            _other.requestType = this.requestType;
        }
        final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
            _other.securityMode = this.securityMode;
        }
        final PropertyTree clientNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientNonce"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientNoncePropertyTree!= null):((clientNoncePropertyTree == null)||(!clientNoncePropertyTree.isLeaf())))) {
            _other.clientNonce = this.clientNonce;
        }
        final PropertyTree requestedLifetimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedLifetime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedLifetimePropertyTree!= null):((requestedLifetimePropertyTree == null)||(!requestedLifetimePropertyTree.isLeaf())))) {
            _other.requestedLifetime = this.requestedLifetime;
        }
    }

    public<_B >OpenSecureChannelRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new OpenSecureChannelRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public OpenSecureChannelRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >OpenSecureChannelRequest.Builder<_B> copyOf(final OpenSecureChannelRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final OpenSecureChannelRequest.Builder<_B> _newBuilder = new OpenSecureChannelRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static OpenSecureChannelRequest.Builder<Void> copyExcept(final OpenSecureChannelRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static OpenSecureChannelRequest.Builder<Void> copyOnly(final OpenSecureChannelRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final OpenSecureChannelRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Long clientProtocolVersion;
        private SecurityTokenRequestType requestType;
        private MessageSecurityMode securityMode;
        private JAXBElement<byte[]> clientNonce;
        private Long requestedLifetime;

        public Builder(final _B _parentBuilder, final OpenSecureChannelRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.clientProtocolVersion = _other.clientProtocolVersion;
                    this.requestType = _other.requestType;
                    this.securityMode = _other.securityMode;
                    this.clientNonce = _other.clientNonce;
                    this.requestedLifetime = _other.requestedLifetime;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final OpenSecureChannelRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree clientProtocolVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientProtocolVersion"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientProtocolVersionPropertyTree!= null):((clientProtocolVersionPropertyTree == null)||(!clientProtocolVersionPropertyTree.isLeaf())))) {
                        this.clientProtocolVersion = _other.clientProtocolVersion;
                    }
                    final PropertyTree requestTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestTypePropertyTree!= null):((requestTypePropertyTree == null)||(!requestTypePropertyTree.isLeaf())))) {
                        this.requestType = _other.requestType;
                    }
                    final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
                        this.securityMode = _other.securityMode;
                    }
                    final PropertyTree clientNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientNonce"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientNoncePropertyTree!= null):((clientNoncePropertyTree == null)||(!clientNoncePropertyTree.isLeaf())))) {
                        this.clientNonce = _other.clientNonce;
                    }
                    final PropertyTree requestedLifetimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedLifetime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedLifetimePropertyTree!= null):((requestedLifetimePropertyTree == null)||(!requestedLifetimePropertyTree.isLeaf())))) {
                        this.requestedLifetime = _other.requestedLifetime;
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

        protected<_P extends OpenSecureChannelRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.clientProtocolVersion = this.clientProtocolVersion;
            _product.requestType = this.requestType;
            _product.securityMode = this.securityMode;
            _product.clientNonce = this.clientNonce;
            _product.requestedLifetime = this.requestedLifetime;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public OpenSecureChannelRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientProtocolVersion" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param clientProtocolVersion
         *     Neuer Wert der Eigenschaft "clientProtocolVersion".
         */
        public OpenSecureChannelRequest.Builder<_B> withClientProtocolVersion(final Long clientProtocolVersion) {
            this.clientProtocolVersion = clientProtocolVersion;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestType
         *     Neuer Wert der Eigenschaft "requestType".
         */
        public OpenSecureChannelRequest.Builder<_B> withRequestType(final SecurityTokenRequestType requestType) {
            this.requestType = requestType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityMode
         *     Neuer Wert der Eigenschaft "securityMode".
         */
        public OpenSecureChannelRequest.Builder<_B> withSecurityMode(final MessageSecurityMode securityMode) {
            this.securityMode = securityMode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientNonce" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param clientNonce
         *     Neuer Wert der Eigenschaft "clientNonce".
         */
        public OpenSecureChannelRequest.Builder<_B> withClientNonce(final JAXBElement<byte[]> clientNonce) {
            this.clientNonce = clientNonce;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedLifetime" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param requestedLifetime
         *     Neuer Wert der Eigenschaft "requestedLifetime".
         */
        public OpenSecureChannelRequest.Builder<_B> withRequestedLifetime(final Long requestedLifetime) {
            this.requestedLifetime = requestedLifetime;
            return this;
        }

        @Override
        public OpenSecureChannelRequest build() {
            if (_storedValue == null) {
                return this.init(new OpenSecureChannelRequest());
            } else {
                return ((OpenSecureChannelRequest) _storedValue);
            }
        }

        public OpenSecureChannelRequest.Builder<_B> copyOf(final OpenSecureChannelRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public OpenSecureChannelRequest.Builder<_B> copyOf(final OpenSecureChannelRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends OpenSecureChannelRequest.Selector<OpenSecureChannelRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static OpenSecureChannelRequest.Select _root() {
            return new OpenSecureChannelRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> clientProtocolVersion = null;
        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> requestType = null;
        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> securityMode = null;
        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> clientNonce = null;
        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> requestedLifetime = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.requestHeader!= null) {
                products.put("requestHeader", this.requestHeader.init());
            }
            if (this.clientProtocolVersion!= null) {
                products.put("clientProtocolVersion", this.clientProtocolVersion.init());
            }
            if (this.requestType!= null) {
                products.put("requestType", this.requestType.init());
            }
            if (this.securityMode!= null) {
                products.put("securityMode", this.securityMode.init());
            }
            if (this.clientNonce!= null) {
                products.put("clientNonce", this.clientNonce.init());
            }
            if (this.requestedLifetime!= null) {
                products.put("requestedLifetime", this.requestedLifetime.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> clientProtocolVersion() {
            return ((this.clientProtocolVersion == null)?this.clientProtocolVersion = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>>(this._root, this, "clientProtocolVersion"):this.clientProtocolVersion);
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> requestType() {
            return ((this.requestType == null)?this.requestType = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>>(this._root, this, "requestType"):this.requestType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> securityMode() {
            return ((this.securityMode == null)?this.securityMode = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>>(this._root, this, "securityMode"):this.securityMode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> clientNonce() {
            return ((this.clientNonce == null)?this.clientNonce = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>>(this._root, this, "clientNonce"):this.clientNonce);
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>> requestedLifetime() {
            return ((this.requestedLifetime == null)?this.requestedLifetime = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelRequest.Selector<TRoot, TParent>>(this._root, this, "requestedLifetime"):this.requestedLifetime);
        }

    }

}
