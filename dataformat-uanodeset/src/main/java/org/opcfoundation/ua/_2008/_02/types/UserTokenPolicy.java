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
 * <p>Java-Klasse für UserTokenPolicy complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserTokenPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PolicyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TokenType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UserTokenType" minOccurs="0"/&gt;
 *         &lt;element name="IssuedTokenType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuerEndpointUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPolicyUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserTokenPolicy", propOrder = {
    "policyId",
    "tokenType",
    "issuedTokenType",
    "issuerEndpointUrl",
    "securityPolicyUri"
})
public class UserTokenPolicy {

    @XmlElementRef(name = "PolicyId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyId;
    @XmlElement(name = "TokenType")
    @XmlSchemaType(name = "string")
    protected UserTokenType tokenType;
    @XmlElementRef(name = "IssuedTokenType", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issuedTokenType;
    @XmlElementRef(name = "IssuerEndpointUrl", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issuerEndpointUrl;
    @XmlElementRef(name = "SecurityPolicyUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityPolicyUri;

    /**
     * Ruft den Wert der policyId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyId() {
        return policyId;
    }

    /**
     * Legt den Wert der policyId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyId(JAXBElement<String> value) {
        this.policyId = value;
    }

    /**
     * Ruft den Wert der tokenType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserTokenType }
     *     
     */
    public UserTokenType getTokenType() {
        return tokenType;
    }

    /**
     * Legt den Wert der tokenType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTokenType }
     *     
     */
    public void setTokenType(UserTokenType value) {
        this.tokenType = value;
    }

    /**
     * Ruft den Wert der issuedTokenType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssuedTokenType() {
        return issuedTokenType;
    }

    /**
     * Legt den Wert der issuedTokenType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssuedTokenType(JAXBElement<String> value) {
        this.issuedTokenType = value;
    }

    /**
     * Ruft den Wert der issuerEndpointUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIssuerEndpointUrl() {
        return issuerEndpointUrl;
    }

    /**
     * Legt den Wert der issuerEndpointUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIssuerEndpointUrl(JAXBElement<String> value) {
        this.issuerEndpointUrl = value;
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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UserTokenPolicy.Builder<_B> _other) {
        _other.policyId = this.policyId;
        _other.tokenType = this.tokenType;
        _other.issuedTokenType = this.issuedTokenType;
        _other.issuerEndpointUrl = this.issuerEndpointUrl;
        _other.securityPolicyUri = this.securityPolicyUri;
    }

    public<_B >UserTokenPolicy.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UserTokenPolicy.Builder<_B>(_parentBuilder, this, true);
    }

    public UserTokenPolicy.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UserTokenPolicy.Builder<Void> builder() {
        return new UserTokenPolicy.Builder<Void>(null, null, false);
    }

    public static<_B >UserTokenPolicy.Builder<_B> copyOf(final UserTokenPolicy _other) {
        final UserTokenPolicy.Builder<_B> _newBuilder = new UserTokenPolicy.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UserTokenPolicy.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree policyIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("policyId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(policyIdPropertyTree!= null):((policyIdPropertyTree == null)||(!policyIdPropertyTree.isLeaf())))) {
            _other.policyId = this.policyId;
        }
        final PropertyTree tokenTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tokenType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tokenTypePropertyTree!= null):((tokenTypePropertyTree == null)||(!tokenTypePropertyTree.isLeaf())))) {
            _other.tokenType = this.tokenType;
        }
        final PropertyTree issuedTokenTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("issuedTokenType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(issuedTokenTypePropertyTree!= null):((issuedTokenTypePropertyTree == null)||(!issuedTokenTypePropertyTree.isLeaf())))) {
            _other.issuedTokenType = this.issuedTokenType;
        }
        final PropertyTree issuerEndpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("issuerEndpointUrl"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(issuerEndpointUrlPropertyTree!= null):((issuerEndpointUrlPropertyTree == null)||(!issuerEndpointUrlPropertyTree.isLeaf())))) {
            _other.issuerEndpointUrl = this.issuerEndpointUrl;
        }
        final PropertyTree securityPolicyUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityPolicyUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityPolicyUriPropertyTree!= null):((securityPolicyUriPropertyTree == null)||(!securityPolicyUriPropertyTree.isLeaf())))) {
            _other.securityPolicyUri = this.securityPolicyUri;
        }
    }

    public<_B >UserTokenPolicy.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UserTokenPolicy.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public UserTokenPolicy.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UserTokenPolicy.Builder<_B> copyOf(final UserTokenPolicy _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UserTokenPolicy.Builder<_B> _newBuilder = new UserTokenPolicy.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UserTokenPolicy.Builder<Void> copyExcept(final UserTokenPolicy _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UserTokenPolicy.Builder<Void> copyOnly(final UserTokenPolicy _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final UserTokenPolicy _storedValue;
        private JAXBElement<String> policyId;
        private UserTokenType tokenType;
        private JAXBElement<String> issuedTokenType;
        private JAXBElement<String> issuerEndpointUrl;
        private JAXBElement<String> securityPolicyUri;

        public Builder(final _B _parentBuilder, final UserTokenPolicy _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.policyId = _other.policyId;
                    this.tokenType = _other.tokenType;
                    this.issuedTokenType = _other.issuedTokenType;
                    this.issuerEndpointUrl = _other.issuerEndpointUrl;
                    this.securityPolicyUri = _other.securityPolicyUri;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final UserTokenPolicy _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree policyIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("policyId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(policyIdPropertyTree!= null):((policyIdPropertyTree == null)||(!policyIdPropertyTree.isLeaf())))) {
                        this.policyId = _other.policyId;
                    }
                    final PropertyTree tokenTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tokenType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tokenTypePropertyTree!= null):((tokenTypePropertyTree == null)||(!tokenTypePropertyTree.isLeaf())))) {
                        this.tokenType = _other.tokenType;
                    }
                    final PropertyTree issuedTokenTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("issuedTokenType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(issuedTokenTypePropertyTree!= null):((issuedTokenTypePropertyTree == null)||(!issuedTokenTypePropertyTree.isLeaf())))) {
                        this.issuedTokenType = _other.issuedTokenType;
                    }
                    final PropertyTree issuerEndpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("issuerEndpointUrl"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(issuerEndpointUrlPropertyTree!= null):((issuerEndpointUrlPropertyTree == null)||(!issuerEndpointUrlPropertyTree.isLeaf())))) {
                        this.issuerEndpointUrl = _other.issuerEndpointUrl;
                    }
                    final PropertyTree securityPolicyUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityPolicyUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityPolicyUriPropertyTree!= null):((securityPolicyUriPropertyTree == null)||(!securityPolicyUriPropertyTree.isLeaf())))) {
                        this.securityPolicyUri = _other.securityPolicyUri;
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

        protected<_P extends UserTokenPolicy >_P init(final _P _product) {
            _product.policyId = this.policyId;
            _product.tokenType = this.tokenType;
            _product.issuedTokenType = this.issuedTokenType;
            _product.issuerEndpointUrl = this.issuerEndpointUrl;
            _product.securityPolicyUri = this.securityPolicyUri;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "policyId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param policyId
         *     Neuer Wert der Eigenschaft "policyId".
         */
        public UserTokenPolicy.Builder<_B> withPolicyId(final JAXBElement<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "tokenType" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param tokenType
         *     Neuer Wert der Eigenschaft "tokenType".
         */
        public UserTokenPolicy.Builder<_B> withTokenType(final UserTokenType tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "issuedTokenType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param issuedTokenType
         *     Neuer Wert der Eigenschaft "issuedTokenType".
         */
        public UserTokenPolicy.Builder<_B> withIssuedTokenType(final JAXBElement<String> issuedTokenType) {
            this.issuedTokenType = issuedTokenType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "issuerEndpointUrl" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param issuerEndpointUrl
         *     Neuer Wert der Eigenschaft "issuerEndpointUrl".
         */
        public UserTokenPolicy.Builder<_B> withIssuerEndpointUrl(final JAXBElement<String> issuerEndpointUrl) {
            this.issuerEndpointUrl = issuerEndpointUrl;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityPolicyUri" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param securityPolicyUri
         *     Neuer Wert der Eigenschaft "securityPolicyUri".
         */
        public UserTokenPolicy.Builder<_B> withSecurityPolicyUri(final JAXBElement<String> securityPolicyUri) {
            this.securityPolicyUri = securityPolicyUri;
            return this;
        }

        @Override
        public UserTokenPolicy build() {
            if (_storedValue == null) {
                return this.init(new UserTokenPolicy());
            } else {
                return ((UserTokenPolicy) _storedValue);
            }
        }

        public UserTokenPolicy.Builder<_B> copyOf(final UserTokenPolicy _other) {
            _other.copyTo(this);
            return this;
        }

        public UserTokenPolicy.Builder<_B> copyOf(final UserTokenPolicy.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UserTokenPolicy.Selector<UserTokenPolicy.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UserTokenPolicy.Select _root() {
            return new UserTokenPolicy.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> policyId = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> tokenType = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> issuedTokenType = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> issuerEndpointUrl = null;
        private com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> securityPolicyUri = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.policyId!= null) {
                products.put("policyId", this.policyId.init());
            }
            if (this.tokenType!= null) {
                products.put("tokenType", this.tokenType.init());
            }
            if (this.issuedTokenType!= null) {
                products.put("issuedTokenType", this.issuedTokenType.init());
            }
            if (this.issuerEndpointUrl!= null) {
                products.put("issuerEndpointUrl", this.issuerEndpointUrl.init());
            }
            if (this.securityPolicyUri!= null) {
                products.put("securityPolicyUri", this.securityPolicyUri.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> policyId() {
            return ((this.policyId == null)?this.policyId = new com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>>(this._root, this, "policyId"):this.policyId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> tokenType() {
            return ((this.tokenType == null)?this.tokenType = new com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>>(this._root, this, "tokenType"):this.tokenType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> issuedTokenType() {
            return ((this.issuedTokenType == null)?this.issuedTokenType = new com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>>(this._root, this, "issuedTokenType"):this.issuedTokenType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> issuerEndpointUrl() {
            return ((this.issuerEndpointUrl == null)?this.issuerEndpointUrl = new com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>>(this._root, this, "issuerEndpointUrl"):this.issuerEndpointUrl);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>> securityPolicyUri() {
            return ((this.securityPolicyUri == null)?this.securityPolicyUri = new com.kscs.util.jaxb.Selector<TRoot, UserTokenPolicy.Selector<TRoot, TParent>>(this._root, this, "securityPolicyUri"):this.securityPolicyUri);
        }

    }

}
