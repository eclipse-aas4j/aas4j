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
 * <p>Java-Klasse für OpenSecureChannelResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OpenSecureChannelResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="ServerProtocolVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="SecurityToken" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ChannelSecurityToken" minOccurs="0"/&gt;
 *         &lt;element name="ServerNonce" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenSecureChannelResponse", propOrder = {
    "responseHeader",
    "serverProtocolVersion",
    "securityToken",
    "serverNonce"
})
public class OpenSecureChannelResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElement(name = "ServerProtocolVersion")
    @XmlSchemaType(name = "unsignedInt")
    protected Long serverProtocolVersion;
    @XmlElementRef(name = "SecurityToken", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ChannelSecurityToken> securityToken;
    @XmlElementRef(name = "ServerNonce", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> serverNonce;

    /**
     * Ruft den Wert der responseHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}
     *     
     */
    public JAXBElement<ResponseHeader> getResponseHeader() {
        return responseHeader;
    }

    /**
     * Legt den Wert der responseHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}
     *     
     */
    public void setResponseHeader(JAXBElement<ResponseHeader> value) {
        this.responseHeader = value;
    }

    /**
     * Ruft den Wert der serverProtocolVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServerProtocolVersion() {
        return serverProtocolVersion;
    }

    /**
     * Legt den Wert der serverProtocolVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServerProtocolVersion(Long value) {
        this.serverProtocolVersion = value;
    }

    /**
     * Ruft den Wert der securityToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelSecurityToken }{@code >}
     *     
     */
    public JAXBElement<ChannelSecurityToken> getSecurityToken() {
        return securityToken;
    }

    /**
     * Legt den Wert der securityToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelSecurityToken }{@code >}
     *     
     */
    public void setSecurityToken(JAXBElement<ChannelSecurityToken> value) {
        this.securityToken = value;
    }

    /**
     * Ruft den Wert der serverNonce-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getServerNonce() {
        return serverNonce;
    }

    /**
     * Legt den Wert der serverNonce-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setServerNonce(JAXBElement<byte[]> value) {
        this.serverNonce = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final OpenSecureChannelResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.serverProtocolVersion = this.serverProtocolVersion;
        _other.securityToken = this.securityToken;
        _other.serverNonce = this.serverNonce;
    }

    public<_B >OpenSecureChannelResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new OpenSecureChannelResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public OpenSecureChannelResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static OpenSecureChannelResponse.Builder<Void> builder() {
        return new OpenSecureChannelResponse.Builder<Void>(null, null, false);
    }

    public static<_B >OpenSecureChannelResponse.Builder<_B> copyOf(final OpenSecureChannelResponse _other) {
        final OpenSecureChannelResponse.Builder<_B> _newBuilder = new OpenSecureChannelResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final OpenSecureChannelResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree serverProtocolVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverProtocolVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverProtocolVersionPropertyTree!= null):((serverProtocolVersionPropertyTree == null)||(!serverProtocolVersionPropertyTree.isLeaf())))) {
            _other.serverProtocolVersion = this.serverProtocolVersion;
        }
        final PropertyTree securityTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityToken"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityTokenPropertyTree!= null):((securityTokenPropertyTree == null)||(!securityTokenPropertyTree.isLeaf())))) {
            _other.securityToken = this.securityToken;
        }
        final PropertyTree serverNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverNonce"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNoncePropertyTree!= null):((serverNoncePropertyTree == null)||(!serverNoncePropertyTree.isLeaf())))) {
            _other.serverNonce = this.serverNonce;
        }
    }

    public<_B >OpenSecureChannelResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new OpenSecureChannelResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public OpenSecureChannelResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >OpenSecureChannelResponse.Builder<_B> copyOf(final OpenSecureChannelResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final OpenSecureChannelResponse.Builder<_B> _newBuilder = new OpenSecureChannelResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static OpenSecureChannelResponse.Builder<Void> copyExcept(final OpenSecureChannelResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static OpenSecureChannelResponse.Builder<Void> copyOnly(final OpenSecureChannelResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final OpenSecureChannelResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private Long serverProtocolVersion;
        private JAXBElement<ChannelSecurityToken> securityToken;
        private JAXBElement<byte[]> serverNonce;

        public Builder(final _B _parentBuilder, final OpenSecureChannelResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.serverProtocolVersion = _other.serverProtocolVersion;
                    this.securityToken = _other.securityToken;
                    this.serverNonce = _other.serverNonce;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final OpenSecureChannelResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree serverProtocolVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverProtocolVersion"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverProtocolVersionPropertyTree!= null):((serverProtocolVersionPropertyTree == null)||(!serverProtocolVersionPropertyTree.isLeaf())))) {
                        this.serverProtocolVersion = _other.serverProtocolVersion;
                    }
                    final PropertyTree securityTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityToken"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityTokenPropertyTree!= null):((securityTokenPropertyTree == null)||(!securityTokenPropertyTree.isLeaf())))) {
                        this.securityToken = _other.securityToken;
                    }
                    final PropertyTree serverNoncePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverNonce"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNoncePropertyTree!= null):((serverNoncePropertyTree == null)||(!serverNoncePropertyTree.isLeaf())))) {
                        this.serverNonce = _other.serverNonce;
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

        protected<_P extends OpenSecureChannelResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.serverProtocolVersion = this.serverProtocolVersion;
            _product.securityToken = this.securityToken;
            _product.serverNonce = this.serverNonce;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public OpenSecureChannelResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverProtocolVersion" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param serverProtocolVersion
         *     Neuer Wert der Eigenschaft "serverProtocolVersion".
         */
        public OpenSecureChannelResponse.Builder<_B> withServerProtocolVersion(final Long serverProtocolVersion) {
            this.serverProtocolVersion = serverProtocolVersion;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityToken" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityToken
         *     Neuer Wert der Eigenschaft "securityToken".
         */
        public OpenSecureChannelResponse.Builder<_B> withSecurityToken(final JAXBElement<ChannelSecurityToken> securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverNonce" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverNonce
         *     Neuer Wert der Eigenschaft "serverNonce".
         */
        public OpenSecureChannelResponse.Builder<_B> withServerNonce(final JAXBElement<byte[]> serverNonce) {
            this.serverNonce = serverNonce;
            return this;
        }

        @Override
        public OpenSecureChannelResponse build() {
            if (_storedValue == null) {
                return this.init(new OpenSecureChannelResponse());
            } else {
                return ((OpenSecureChannelResponse) _storedValue);
            }
        }

        public OpenSecureChannelResponse.Builder<_B> copyOf(final OpenSecureChannelResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public OpenSecureChannelResponse.Builder<_B> copyOf(final OpenSecureChannelResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends OpenSecureChannelResponse.Selector<OpenSecureChannelResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static OpenSecureChannelResponse.Select _root() {
            return new OpenSecureChannelResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>> serverProtocolVersion = null;
        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>> securityToken = null;
        private com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>> serverNonce = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.responseHeader!= null) {
                products.put("responseHeader", this.responseHeader.init());
            }
            if (this.serverProtocolVersion!= null) {
                products.put("serverProtocolVersion", this.serverProtocolVersion.init());
            }
            if (this.securityToken!= null) {
                products.put("securityToken", this.securityToken.init());
            }
            if (this.serverNonce!= null) {
                products.put("serverNonce", this.serverNonce.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>> serverProtocolVersion() {
            return ((this.serverProtocolVersion == null)?this.serverProtocolVersion = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>>(this._root, this, "serverProtocolVersion"):this.serverProtocolVersion);
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>> securityToken() {
            return ((this.securityToken == null)?this.securityToken = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>>(this._root, this, "securityToken"):this.securityToken);
        }

        public com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>> serverNonce() {
            return ((this.serverNonce == null)?this.serverNonce = new com.kscs.util.jaxb.Selector<TRoot, OpenSecureChannelResponse.Selector<TRoot, TParent>>(this._root, this, "serverNonce"):this.serverNonce);
        }

    }

}
