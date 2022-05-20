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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ActivateSessionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActivateSessionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="ClientSignature" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SignatureData" minOccurs="0"/&gt;
 *         &lt;element name="ClientSoftwareCertificates" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfSignedSoftwareCertificate" minOccurs="0"/&gt;
 *         &lt;element name="LocaleIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="UserIdentityToken" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="UserTokenSignature" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SignatureData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivateSessionRequest", propOrder = {
    "requestHeader",
    "clientSignature",
    "clientSoftwareCertificates",
    "localeIds",
    "userIdentityToken",
    "userTokenSignature"
})
public class ActivateSessionRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "ClientSignature", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SignatureData> clientSignature;
    @XmlElementRef(name = "ClientSoftwareCertificates", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSignedSoftwareCertificate> clientSoftwareCertificates;
    @XmlElementRef(name = "LocaleIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> localeIds;
    @XmlElementRef(name = "UserIdentityToken", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> userIdentityToken;
    @XmlElementRef(name = "UserTokenSignature", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SignatureData> userTokenSignature;

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
     * Ruft den Wert der clientSignature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SignatureData }{@code >}
     *     
     */
    public JAXBElement<SignatureData> getClientSignature() {
        return clientSignature;
    }

    /**
     * Legt den Wert der clientSignature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SignatureData }{@code >}
     *     
     */
    public void setClientSignature(JAXBElement<SignatureData> value) {
        this.clientSignature = value;
    }

    /**
     * Ruft den Wert der clientSoftwareCertificates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSignedSoftwareCertificate }{@code >}
     *     
     */
    public JAXBElement<ListOfSignedSoftwareCertificate> getClientSoftwareCertificates() {
        return clientSoftwareCertificates;
    }

    /**
     * Legt den Wert der clientSoftwareCertificates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSignedSoftwareCertificate }{@code >}
     *     
     */
    public void setClientSoftwareCertificates(JAXBElement<ListOfSignedSoftwareCertificate> value) {
        this.clientSoftwareCertificates = value;
    }

    /**
     * Ruft den Wert der localeIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getLocaleIds() {
        return localeIds;
    }

    /**
     * Legt den Wert der localeIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setLocaleIds(JAXBElement<ListOfString> value) {
        this.localeIds = value;
    }

    /**
     * Ruft den Wert der userIdentityToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getUserIdentityToken() {
        return userIdentityToken;
    }

    /**
     * Legt den Wert der userIdentityToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setUserIdentityToken(JAXBElement<ExtensionObject> value) {
        this.userIdentityToken = value;
    }

    /**
     * Ruft den Wert der userTokenSignature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SignatureData }{@code >}
     *     
     */
    public JAXBElement<SignatureData> getUserTokenSignature() {
        return userTokenSignature;
    }

    /**
     * Legt den Wert der userTokenSignature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SignatureData }{@code >}
     *     
     */
    public void setUserTokenSignature(JAXBElement<SignatureData> value) {
        this.userTokenSignature = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ActivateSessionRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.clientSignature = this.clientSignature;
        _other.clientSoftwareCertificates = this.clientSoftwareCertificates;
        _other.localeIds = this.localeIds;
        _other.userIdentityToken = this.userIdentityToken;
        _other.userTokenSignature = this.userTokenSignature;
    }

    public<_B >ActivateSessionRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ActivateSessionRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public ActivateSessionRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ActivateSessionRequest.Builder<Void> builder() {
        return new ActivateSessionRequest.Builder<Void>(null, null, false);
    }

    public static<_B >ActivateSessionRequest.Builder<_B> copyOf(final ActivateSessionRequest _other) {
        final ActivateSessionRequest.Builder<_B> _newBuilder = new ActivateSessionRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ActivateSessionRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree clientSignaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientSignature"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientSignaturePropertyTree!= null):((clientSignaturePropertyTree == null)||(!clientSignaturePropertyTree.isLeaf())))) {
            _other.clientSignature = this.clientSignature;
        }
        final PropertyTree clientSoftwareCertificatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientSoftwareCertificates"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientSoftwareCertificatesPropertyTree!= null):((clientSoftwareCertificatesPropertyTree == null)||(!clientSoftwareCertificatesPropertyTree.isLeaf())))) {
            _other.clientSoftwareCertificates = this.clientSoftwareCertificates;
        }
        final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
            _other.localeIds = this.localeIds;
        }
        final PropertyTree userIdentityTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userIdentityToken"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userIdentityTokenPropertyTree!= null):((userIdentityTokenPropertyTree == null)||(!userIdentityTokenPropertyTree.isLeaf())))) {
            _other.userIdentityToken = this.userIdentityToken;
        }
        final PropertyTree userTokenSignaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userTokenSignature"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userTokenSignaturePropertyTree!= null):((userTokenSignaturePropertyTree == null)||(!userTokenSignaturePropertyTree.isLeaf())))) {
            _other.userTokenSignature = this.userTokenSignature;
        }
    }

    public<_B >ActivateSessionRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ActivateSessionRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ActivateSessionRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ActivateSessionRequest.Builder<_B> copyOf(final ActivateSessionRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ActivateSessionRequest.Builder<_B> _newBuilder = new ActivateSessionRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ActivateSessionRequest.Builder<Void> copyExcept(final ActivateSessionRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ActivateSessionRequest.Builder<Void> copyOnly(final ActivateSessionRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ActivateSessionRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<SignatureData> clientSignature;
        private JAXBElement<ListOfSignedSoftwareCertificate> clientSoftwareCertificates;
        private JAXBElement<ListOfString> localeIds;
        private JAXBElement<ExtensionObject> userIdentityToken;
        private JAXBElement<SignatureData> userTokenSignature;

        public Builder(final _B _parentBuilder, final ActivateSessionRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.clientSignature = _other.clientSignature;
                    this.clientSoftwareCertificates = _other.clientSoftwareCertificates;
                    this.localeIds = _other.localeIds;
                    this.userIdentityToken = _other.userIdentityToken;
                    this.userTokenSignature = _other.userTokenSignature;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ActivateSessionRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree clientSignaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientSignature"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientSignaturePropertyTree!= null):((clientSignaturePropertyTree == null)||(!clientSignaturePropertyTree.isLeaf())))) {
                        this.clientSignature = _other.clientSignature;
                    }
                    final PropertyTree clientSoftwareCertificatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientSoftwareCertificates"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientSoftwareCertificatesPropertyTree!= null):((clientSoftwareCertificatesPropertyTree == null)||(!clientSoftwareCertificatesPropertyTree.isLeaf())))) {
                        this.clientSoftwareCertificates = _other.clientSoftwareCertificates;
                    }
                    final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
                        this.localeIds = _other.localeIds;
                    }
                    final PropertyTree userIdentityTokenPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userIdentityToken"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userIdentityTokenPropertyTree!= null):((userIdentityTokenPropertyTree == null)||(!userIdentityTokenPropertyTree.isLeaf())))) {
                        this.userIdentityToken = _other.userIdentityToken;
                    }
                    final PropertyTree userTokenSignaturePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userTokenSignature"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userTokenSignaturePropertyTree!= null):((userTokenSignaturePropertyTree == null)||(!userTokenSignaturePropertyTree.isLeaf())))) {
                        this.userTokenSignature = _other.userTokenSignature;
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

        protected<_P extends ActivateSessionRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.clientSignature = this.clientSignature;
            _product.clientSoftwareCertificates = this.clientSoftwareCertificates;
            _product.localeIds = this.localeIds;
            _product.userIdentityToken = this.userIdentityToken;
            _product.userTokenSignature = this.userTokenSignature;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public ActivateSessionRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientSignature" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param clientSignature
         *     Neuer Wert der Eigenschaft "clientSignature".
         */
        public ActivateSessionRequest.Builder<_B> withClientSignature(final JAXBElement<SignatureData> clientSignature) {
            this.clientSignature = clientSignature;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientSoftwareCertificates" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param clientSoftwareCertificates
         *     Neuer Wert der Eigenschaft "clientSoftwareCertificates".
         */
        public ActivateSessionRequest.Builder<_B> withClientSoftwareCertificates(final JAXBElement<ListOfSignedSoftwareCertificate> clientSoftwareCertificates) {
            this.clientSoftwareCertificates = clientSoftwareCertificates;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "localeIds" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param localeIds
         *     Neuer Wert der Eigenschaft "localeIds".
         */
        public ActivateSessionRequest.Builder<_B> withLocaleIds(final JAXBElement<ListOfString> localeIds) {
            this.localeIds = localeIds;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userIdentityToken" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param userIdentityToken
         *     Neuer Wert der Eigenschaft "userIdentityToken".
         */
        public ActivateSessionRequest.Builder<_B> withUserIdentityToken(final JAXBElement<ExtensionObject> userIdentityToken) {
            this.userIdentityToken = userIdentityToken;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userTokenSignature" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param userTokenSignature
         *     Neuer Wert der Eigenschaft "userTokenSignature".
         */
        public ActivateSessionRequest.Builder<_B> withUserTokenSignature(final JAXBElement<SignatureData> userTokenSignature) {
            this.userTokenSignature = userTokenSignature;
            return this;
        }

        @Override
        public ActivateSessionRequest build() {
            if (_storedValue == null) {
                return this.init(new ActivateSessionRequest());
            } else {
                return ((ActivateSessionRequest) _storedValue);
            }
        }

        public ActivateSessionRequest.Builder<_B> copyOf(final ActivateSessionRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public ActivateSessionRequest.Builder<_B> copyOf(final ActivateSessionRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ActivateSessionRequest.Selector<ActivateSessionRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ActivateSessionRequest.Select _root() {
            return new ActivateSessionRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> clientSignature = null;
        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> clientSoftwareCertificates = null;
        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> localeIds = null;
        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> userIdentityToken = null;
        private com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> userTokenSignature = null;

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
            if (this.clientSignature!= null) {
                products.put("clientSignature", this.clientSignature.init());
            }
            if (this.clientSoftwareCertificates!= null) {
                products.put("clientSoftwareCertificates", this.clientSoftwareCertificates.init());
            }
            if (this.localeIds!= null) {
                products.put("localeIds", this.localeIds.init());
            }
            if (this.userIdentityToken!= null) {
                products.put("userIdentityToken", this.userIdentityToken.init());
            }
            if (this.userTokenSignature!= null) {
                products.put("userTokenSignature", this.userTokenSignature.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> clientSignature() {
            return ((this.clientSignature == null)?this.clientSignature = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "clientSignature"):this.clientSignature);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> clientSoftwareCertificates() {
            return ((this.clientSoftwareCertificates == null)?this.clientSoftwareCertificates = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "clientSoftwareCertificates"):this.clientSoftwareCertificates);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> localeIds() {
            return ((this.localeIds == null)?this.localeIds = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "localeIds"):this.localeIds);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> userIdentityToken() {
            return ((this.userIdentityToken == null)?this.userIdentityToken = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "userIdentityToken"):this.userIdentityToken);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>> userTokenSignature() {
            return ((this.userTokenSignature == null)?this.userTokenSignature = new com.kscs.util.jaxb.Selector<TRoot, ActivateSessionRequest.Selector<TRoot, TParent>>(this._root, this, "userTokenSignature"):this.userTokenSignature);
        }

    }

}
