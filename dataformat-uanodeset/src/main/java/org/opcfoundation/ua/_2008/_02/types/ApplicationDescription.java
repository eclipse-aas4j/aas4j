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
 * <p>Java-Klasse für ApplicationDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApplicationDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ApplicationType" minOccurs="0"/&gt;
 *         &lt;element name="GatewayServerUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscoveryProfileUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscoveryUrls" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationDescription", propOrder = {
    "applicationUri",
    "productUri",
    "applicationName",
    "applicationType",
    "gatewayServerUri",
    "discoveryProfileUri",
    "discoveryUrls"
})
public class ApplicationDescription {

    @XmlElementRef(name = "ApplicationUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationUri;
    @XmlElementRef(name = "ProductUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productUri;
    @XmlElementRef(name = "ApplicationName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> applicationName;
    @XmlElement(name = "ApplicationType")
    @XmlSchemaType(name = "string")
    protected ApplicationType applicationType;
    @XmlElementRef(name = "GatewayServerUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayServerUri;
    @XmlElementRef(name = "DiscoveryProfileUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> discoveryProfileUri;
    @XmlElementRef(name = "DiscoveryUrls", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> discoveryUrls;

    /**
     * Ruft den Wert der applicationUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationUri() {
        return applicationUri;
    }

    /**
     * Legt den Wert der applicationUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationUri(JAXBElement<String> value) {
        this.applicationUri = value;
    }

    /**
     * Ruft den Wert der productUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductUri() {
        return productUri;
    }

    /**
     * Legt den Wert der productUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductUri(JAXBElement<String> value) {
        this.productUri = value;
    }

    /**
     * Ruft den Wert der applicationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public JAXBElement<LocalizedText> getApplicationName() {
        return applicationName;
    }

    /**
     * Legt den Wert der applicationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public void setApplicationName(JAXBElement<LocalizedText> value) {
        this.applicationName = value;
    }

    /**
     * Ruft den Wert der applicationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplicationType() {
        return applicationType;
    }

    /**
     * Legt den Wert der applicationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplicationType(ApplicationType value) {
        this.applicationType = value;
    }

    /**
     * Ruft den Wert der gatewayServerUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGatewayServerUri() {
        return gatewayServerUri;
    }

    /**
     * Legt den Wert der gatewayServerUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGatewayServerUri(JAXBElement<String> value) {
        this.gatewayServerUri = value;
    }

    /**
     * Ruft den Wert der discoveryProfileUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscoveryProfileUri() {
        return discoveryProfileUri;
    }

    /**
     * Legt den Wert der discoveryProfileUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscoveryProfileUri(JAXBElement<String> value) {
        this.discoveryProfileUri = value;
    }

    /**
     * Ruft den Wert der discoveryUrls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getDiscoveryUrls() {
        return discoveryUrls;
    }

    /**
     * Legt den Wert der discoveryUrls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setDiscoveryUrls(JAXBElement<ListOfString> value) {
        this.discoveryUrls = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ApplicationDescription.Builder<_B> _other) {
        _other.applicationUri = this.applicationUri;
        _other.productUri = this.productUri;
        _other.applicationName = this.applicationName;
        _other.applicationType = this.applicationType;
        _other.gatewayServerUri = this.gatewayServerUri;
        _other.discoveryProfileUri = this.discoveryProfileUri;
        _other.discoveryUrls = this.discoveryUrls;
    }

    public<_B >ApplicationDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ApplicationDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ApplicationDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ApplicationDescription.Builder<Void> builder() {
        return new ApplicationDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ApplicationDescription.Builder<_B> copyOf(final ApplicationDescription _other) {
        final ApplicationDescription.Builder<_B> _newBuilder = new ApplicationDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ApplicationDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree applicationUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("applicationUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(applicationUriPropertyTree!= null):((applicationUriPropertyTree == null)||(!applicationUriPropertyTree.isLeaf())))) {
            _other.applicationUri = this.applicationUri;
        }
        final PropertyTree productUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("productUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(productUriPropertyTree!= null):((productUriPropertyTree == null)||(!productUriPropertyTree.isLeaf())))) {
            _other.productUri = this.productUri;
        }
        final PropertyTree applicationNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("applicationName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(applicationNamePropertyTree!= null):((applicationNamePropertyTree == null)||(!applicationNamePropertyTree.isLeaf())))) {
            _other.applicationName = this.applicationName;
        }
        final PropertyTree applicationTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("applicationType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(applicationTypePropertyTree!= null):((applicationTypePropertyTree == null)||(!applicationTypePropertyTree.isLeaf())))) {
            _other.applicationType = this.applicationType;
        }
        final PropertyTree gatewayServerUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("gatewayServerUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(gatewayServerUriPropertyTree!= null):((gatewayServerUriPropertyTree == null)||(!gatewayServerUriPropertyTree.isLeaf())))) {
            _other.gatewayServerUri = this.gatewayServerUri;
        }
        final PropertyTree discoveryProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryProfileUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryProfileUriPropertyTree!= null):((discoveryProfileUriPropertyTree == null)||(!discoveryProfileUriPropertyTree.isLeaf())))) {
            _other.discoveryProfileUri = this.discoveryProfileUri;
        }
        final PropertyTree discoveryUrlsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryUrls"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryUrlsPropertyTree!= null):((discoveryUrlsPropertyTree == null)||(!discoveryUrlsPropertyTree.isLeaf())))) {
            _other.discoveryUrls = this.discoveryUrls;
        }
    }

    public<_B >ApplicationDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ApplicationDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ApplicationDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ApplicationDescription.Builder<_B> copyOf(final ApplicationDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ApplicationDescription.Builder<_B> _newBuilder = new ApplicationDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ApplicationDescription.Builder<Void> copyExcept(final ApplicationDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ApplicationDescription.Builder<Void> copyOnly(final ApplicationDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ApplicationDescription _storedValue;
        private JAXBElement<String> applicationUri;
        private JAXBElement<String> productUri;
        private JAXBElement<LocalizedText> applicationName;
        private ApplicationType applicationType;
        private JAXBElement<String> gatewayServerUri;
        private JAXBElement<String> discoveryProfileUri;
        private JAXBElement<ListOfString> discoveryUrls;

        public Builder(final _B _parentBuilder, final ApplicationDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.applicationUri = _other.applicationUri;
                    this.productUri = _other.productUri;
                    this.applicationName = _other.applicationName;
                    this.applicationType = _other.applicationType;
                    this.gatewayServerUri = _other.gatewayServerUri;
                    this.discoveryProfileUri = _other.discoveryProfileUri;
                    this.discoveryUrls = _other.discoveryUrls;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ApplicationDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree applicationUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("applicationUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(applicationUriPropertyTree!= null):((applicationUriPropertyTree == null)||(!applicationUriPropertyTree.isLeaf())))) {
                        this.applicationUri = _other.applicationUri;
                    }
                    final PropertyTree productUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("productUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(productUriPropertyTree!= null):((productUriPropertyTree == null)||(!productUriPropertyTree.isLeaf())))) {
                        this.productUri = _other.productUri;
                    }
                    final PropertyTree applicationNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("applicationName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(applicationNamePropertyTree!= null):((applicationNamePropertyTree == null)||(!applicationNamePropertyTree.isLeaf())))) {
                        this.applicationName = _other.applicationName;
                    }
                    final PropertyTree applicationTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("applicationType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(applicationTypePropertyTree!= null):((applicationTypePropertyTree == null)||(!applicationTypePropertyTree.isLeaf())))) {
                        this.applicationType = _other.applicationType;
                    }
                    final PropertyTree gatewayServerUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("gatewayServerUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(gatewayServerUriPropertyTree!= null):((gatewayServerUriPropertyTree == null)||(!gatewayServerUriPropertyTree.isLeaf())))) {
                        this.gatewayServerUri = _other.gatewayServerUri;
                    }
                    final PropertyTree discoveryProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryProfileUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryProfileUriPropertyTree!= null):((discoveryProfileUriPropertyTree == null)||(!discoveryProfileUriPropertyTree.isLeaf())))) {
                        this.discoveryProfileUri = _other.discoveryProfileUri;
                    }
                    final PropertyTree discoveryUrlsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryUrls"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryUrlsPropertyTree!= null):((discoveryUrlsPropertyTree == null)||(!discoveryUrlsPropertyTree.isLeaf())))) {
                        this.discoveryUrls = _other.discoveryUrls;
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

        protected<_P extends ApplicationDescription >_P init(final _P _product) {
            _product.applicationUri = this.applicationUri;
            _product.productUri = this.productUri;
            _product.applicationName = this.applicationName;
            _product.applicationType = this.applicationType;
            _product.gatewayServerUri = this.gatewayServerUri;
            _product.discoveryProfileUri = this.discoveryProfileUri;
            _product.discoveryUrls = this.discoveryUrls;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "applicationUri" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param applicationUri
         *     Neuer Wert der Eigenschaft "applicationUri".
         */
        public ApplicationDescription.Builder<_B> withApplicationUri(final JAXBElement<String> applicationUri) {
            this.applicationUri = applicationUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "productUri" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param productUri
         *     Neuer Wert der Eigenschaft "productUri".
         */
        public ApplicationDescription.Builder<_B> withProductUri(final JAXBElement<String> productUri) {
            this.productUri = productUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "applicationName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param applicationName
         *     Neuer Wert der Eigenschaft "applicationName".
         */
        public ApplicationDescription.Builder<_B> withApplicationName(final JAXBElement<LocalizedText> applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "applicationType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param applicationType
         *     Neuer Wert der Eigenschaft "applicationType".
         */
        public ApplicationDescription.Builder<_B> withApplicationType(final ApplicationType applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "gatewayServerUri" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param gatewayServerUri
         *     Neuer Wert der Eigenschaft "gatewayServerUri".
         */
        public ApplicationDescription.Builder<_B> withGatewayServerUri(final JAXBElement<String> gatewayServerUri) {
            this.gatewayServerUri = gatewayServerUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "discoveryProfileUri" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param discoveryProfileUri
         *     Neuer Wert der Eigenschaft "discoveryProfileUri".
         */
        public ApplicationDescription.Builder<_B> withDiscoveryProfileUri(final JAXBElement<String> discoveryProfileUri) {
            this.discoveryProfileUri = discoveryProfileUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "discoveryUrls" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param discoveryUrls
         *     Neuer Wert der Eigenschaft "discoveryUrls".
         */
        public ApplicationDescription.Builder<_B> withDiscoveryUrls(final JAXBElement<ListOfString> discoveryUrls) {
            this.discoveryUrls = discoveryUrls;
            return this;
        }

        @Override
        public ApplicationDescription build() {
            if (_storedValue == null) {
                return this.init(new ApplicationDescription());
            } else {
                return ((ApplicationDescription) _storedValue);
            }
        }

        public ApplicationDescription.Builder<_B> copyOf(final ApplicationDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ApplicationDescription.Builder<_B> copyOf(final ApplicationDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ApplicationDescription.Selector<ApplicationDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ApplicationDescription.Select _root() {
            return new ApplicationDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> applicationUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> productUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> applicationName = null;
        private com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> applicationType = null;
        private com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> gatewayServerUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> discoveryProfileUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> discoveryUrls = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.applicationUri!= null) {
                products.put("applicationUri", this.applicationUri.init());
            }
            if (this.productUri!= null) {
                products.put("productUri", this.productUri.init());
            }
            if (this.applicationName!= null) {
                products.put("applicationName", this.applicationName.init());
            }
            if (this.applicationType!= null) {
                products.put("applicationType", this.applicationType.init());
            }
            if (this.gatewayServerUri!= null) {
                products.put("gatewayServerUri", this.gatewayServerUri.init());
            }
            if (this.discoveryProfileUri!= null) {
                products.put("discoveryProfileUri", this.discoveryProfileUri.init());
            }
            if (this.discoveryUrls!= null) {
                products.put("discoveryUrls", this.discoveryUrls.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> applicationUri() {
            return ((this.applicationUri == null)?this.applicationUri = new com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>>(this._root, this, "applicationUri"):this.applicationUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> productUri() {
            return ((this.productUri == null)?this.productUri = new com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>>(this._root, this, "productUri"):this.productUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> applicationName() {
            return ((this.applicationName == null)?this.applicationName = new com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>>(this._root, this, "applicationName"):this.applicationName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> applicationType() {
            return ((this.applicationType == null)?this.applicationType = new com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>>(this._root, this, "applicationType"):this.applicationType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> gatewayServerUri() {
            return ((this.gatewayServerUri == null)?this.gatewayServerUri = new com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>>(this._root, this, "gatewayServerUri"):this.gatewayServerUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> discoveryProfileUri() {
            return ((this.discoveryProfileUri == null)?this.discoveryProfileUri = new com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>>(this._root, this, "discoveryProfileUri"):this.discoveryProfileUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>> discoveryUrls() {
            return ((this.discoveryUrls == null)?this.discoveryUrls = new com.kscs.util.jaxb.Selector<TRoot, ApplicationDescription.Selector<TRoot, TParent>>(this._root, this, "discoveryUrls"):this.discoveryUrls);
        }

    }

}
