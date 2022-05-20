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
 * <p>Java-Klasse für RegisteredServer complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegisteredServer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServerUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerNames" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfLocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="ServerType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ApplicationType" minOccurs="0"/&gt;
 *         &lt;element name="GatewayServerUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscoveryUrls" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="SemaphoreFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredServer", propOrder = {
    "serverUri",
    "productUri",
    "serverNames",
    "serverType",
    "gatewayServerUri",
    "discoveryUrls",
    "semaphoreFilePath",
    "isOnline"
})
public class RegisteredServer {

    @XmlElementRef(name = "ServerUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverUri;
    @XmlElementRef(name = "ProductUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productUri;
    @XmlElementRef(name = "ServerNames", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfLocalizedText> serverNames;
    @XmlElement(name = "ServerType")
    @XmlSchemaType(name = "string")
    protected ApplicationType serverType;
    @XmlElementRef(name = "GatewayServerUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gatewayServerUri;
    @XmlElementRef(name = "DiscoveryUrls", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> discoveryUrls;
    @XmlElementRef(name = "SemaphoreFilePath", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> semaphoreFilePath;
    @XmlElement(name = "IsOnline")
    protected Boolean isOnline;

    /**
     * Ruft den Wert der serverUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerUri() {
        return serverUri;
    }

    /**
     * Legt den Wert der serverUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerUri(JAXBElement<String> value) {
        this.serverUri = value;
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
     * Ruft den Wert der serverNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfLocalizedText }{@code >}
     *     
     */
    public JAXBElement<ListOfLocalizedText> getServerNames() {
        return serverNames;
    }

    /**
     * Legt den Wert der serverNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfLocalizedText }{@code >}
     *     
     */
    public void setServerNames(JAXBElement<ListOfLocalizedText> value) {
        this.serverNames = value;
    }

    /**
     * Ruft den Wert der serverType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getServerType() {
        return serverType;
    }

    /**
     * Legt den Wert der serverType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setServerType(ApplicationType value) {
        this.serverType = value;
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
     * Ruft den Wert der semaphoreFilePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSemaphoreFilePath() {
        return semaphoreFilePath;
    }

    /**
     * Legt den Wert der semaphoreFilePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSemaphoreFilePath(JAXBElement<String> value) {
        this.semaphoreFilePath = value;
    }

    /**
     * Ruft den Wert der isOnline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnline() {
        return isOnline;
    }

    /**
     * Legt den Wert der isOnline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnline(Boolean value) {
        this.isOnline = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RegisteredServer.Builder<_B> _other) {
        _other.serverUri = this.serverUri;
        _other.productUri = this.productUri;
        _other.serverNames = this.serverNames;
        _other.serverType = this.serverType;
        _other.gatewayServerUri = this.gatewayServerUri;
        _other.discoveryUrls = this.discoveryUrls;
        _other.semaphoreFilePath = this.semaphoreFilePath;
        _other.isOnline = this.isOnline;
    }

    public<_B >RegisteredServer.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RegisteredServer.Builder<_B>(_parentBuilder, this, true);
    }

    public RegisteredServer.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RegisteredServer.Builder<Void> builder() {
        return new RegisteredServer.Builder<Void>(null, null, false);
    }

    public static<_B >RegisteredServer.Builder<_B> copyOf(final RegisteredServer _other) {
        final RegisteredServer.Builder<_B> _newBuilder = new RegisteredServer.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RegisteredServer.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree serverUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUriPropertyTree!= null):((serverUriPropertyTree == null)||(!serverUriPropertyTree.isLeaf())))) {
            _other.serverUri = this.serverUri;
        }
        final PropertyTree productUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("productUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(productUriPropertyTree!= null):((productUriPropertyTree == null)||(!productUriPropertyTree.isLeaf())))) {
            _other.productUri = this.productUri;
        }
        final PropertyTree serverNamesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverNames"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNamesPropertyTree!= null):((serverNamesPropertyTree == null)||(!serverNamesPropertyTree.isLeaf())))) {
            _other.serverNames = this.serverNames;
        }
        final PropertyTree serverTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverTypePropertyTree!= null):((serverTypePropertyTree == null)||(!serverTypePropertyTree.isLeaf())))) {
            _other.serverType = this.serverType;
        }
        final PropertyTree gatewayServerUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("gatewayServerUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(gatewayServerUriPropertyTree!= null):((gatewayServerUriPropertyTree == null)||(!gatewayServerUriPropertyTree.isLeaf())))) {
            _other.gatewayServerUri = this.gatewayServerUri;
        }
        final PropertyTree discoveryUrlsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryUrls"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryUrlsPropertyTree!= null):((discoveryUrlsPropertyTree == null)||(!discoveryUrlsPropertyTree.isLeaf())))) {
            _other.discoveryUrls = this.discoveryUrls;
        }
        final PropertyTree semaphoreFilePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("semaphoreFilePath"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(semaphoreFilePathPropertyTree!= null):((semaphoreFilePathPropertyTree == null)||(!semaphoreFilePathPropertyTree.isLeaf())))) {
            _other.semaphoreFilePath = this.semaphoreFilePath;
        }
        final PropertyTree isOnlinePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isOnline"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isOnlinePropertyTree!= null):((isOnlinePropertyTree == null)||(!isOnlinePropertyTree.isLeaf())))) {
            _other.isOnline = this.isOnline;
        }
    }

    public<_B >RegisteredServer.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RegisteredServer.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RegisteredServer.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RegisteredServer.Builder<_B> copyOf(final RegisteredServer _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RegisteredServer.Builder<_B> _newBuilder = new RegisteredServer.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RegisteredServer.Builder<Void> copyExcept(final RegisteredServer _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RegisteredServer.Builder<Void> copyOnly(final RegisteredServer _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RegisteredServer _storedValue;
        private JAXBElement<String> serverUri;
        private JAXBElement<String> productUri;
        private JAXBElement<ListOfLocalizedText> serverNames;
        private ApplicationType serverType;
        private JAXBElement<String> gatewayServerUri;
        private JAXBElement<ListOfString> discoveryUrls;
        private JAXBElement<String> semaphoreFilePath;
        private Boolean isOnline;

        public Builder(final _B _parentBuilder, final RegisteredServer _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.serverUri = _other.serverUri;
                    this.productUri = _other.productUri;
                    this.serverNames = _other.serverNames;
                    this.serverType = _other.serverType;
                    this.gatewayServerUri = _other.gatewayServerUri;
                    this.discoveryUrls = _other.discoveryUrls;
                    this.semaphoreFilePath = _other.semaphoreFilePath;
                    this.isOnline = _other.isOnline;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RegisteredServer _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree serverUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUriPropertyTree!= null):((serverUriPropertyTree == null)||(!serverUriPropertyTree.isLeaf())))) {
                        this.serverUri = _other.serverUri;
                    }
                    final PropertyTree productUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("productUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(productUriPropertyTree!= null):((productUriPropertyTree == null)||(!productUriPropertyTree.isLeaf())))) {
                        this.productUri = _other.productUri;
                    }
                    final PropertyTree serverNamesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverNames"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNamesPropertyTree!= null):((serverNamesPropertyTree == null)||(!serverNamesPropertyTree.isLeaf())))) {
                        this.serverNames = _other.serverNames;
                    }
                    final PropertyTree serverTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverTypePropertyTree!= null):((serverTypePropertyTree == null)||(!serverTypePropertyTree.isLeaf())))) {
                        this.serverType = _other.serverType;
                    }
                    final PropertyTree gatewayServerUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("gatewayServerUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(gatewayServerUriPropertyTree!= null):((gatewayServerUriPropertyTree == null)||(!gatewayServerUriPropertyTree.isLeaf())))) {
                        this.gatewayServerUri = _other.gatewayServerUri;
                    }
                    final PropertyTree discoveryUrlsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryUrls"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryUrlsPropertyTree!= null):((discoveryUrlsPropertyTree == null)||(!discoveryUrlsPropertyTree.isLeaf())))) {
                        this.discoveryUrls = _other.discoveryUrls;
                    }
                    final PropertyTree semaphoreFilePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("semaphoreFilePath"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(semaphoreFilePathPropertyTree!= null):((semaphoreFilePathPropertyTree == null)||(!semaphoreFilePathPropertyTree.isLeaf())))) {
                        this.semaphoreFilePath = _other.semaphoreFilePath;
                    }
                    final PropertyTree isOnlinePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isOnline"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isOnlinePropertyTree!= null):((isOnlinePropertyTree == null)||(!isOnlinePropertyTree.isLeaf())))) {
                        this.isOnline = _other.isOnline;
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

        protected<_P extends RegisteredServer >_P init(final _P _product) {
            _product.serverUri = this.serverUri;
            _product.productUri = this.productUri;
            _product.serverNames = this.serverNames;
            _product.serverType = this.serverType;
            _product.gatewayServerUri = this.gatewayServerUri;
            _product.discoveryUrls = this.discoveryUrls;
            _product.semaphoreFilePath = this.semaphoreFilePath;
            _product.isOnline = this.isOnline;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverUri" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serverUri
         *     Neuer Wert der Eigenschaft "serverUri".
         */
        public RegisteredServer.Builder<_B> withServerUri(final JAXBElement<String> serverUri) {
            this.serverUri = serverUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "productUri" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param productUri
         *     Neuer Wert der Eigenschaft "productUri".
         */
        public RegisteredServer.Builder<_B> withProductUri(final JAXBElement<String> productUri) {
            this.productUri = productUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverNames" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverNames
         *     Neuer Wert der Eigenschaft "serverNames".
         */
        public RegisteredServer.Builder<_B> withServerNames(final JAXBElement<ListOfLocalizedText> serverNames) {
            this.serverNames = serverNames;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverType" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serverType
         *     Neuer Wert der Eigenschaft "serverType".
         */
        public RegisteredServer.Builder<_B> withServerType(final ApplicationType serverType) {
            this.serverType = serverType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "gatewayServerUri" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param gatewayServerUri
         *     Neuer Wert der Eigenschaft "gatewayServerUri".
         */
        public RegisteredServer.Builder<_B> withGatewayServerUri(final JAXBElement<String> gatewayServerUri) {
            this.gatewayServerUri = gatewayServerUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "discoveryUrls" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param discoveryUrls
         *     Neuer Wert der Eigenschaft "discoveryUrls".
         */
        public RegisteredServer.Builder<_B> withDiscoveryUrls(final JAXBElement<ListOfString> discoveryUrls) {
            this.discoveryUrls = discoveryUrls;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "semaphoreFilePath" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param semaphoreFilePath
         *     Neuer Wert der Eigenschaft "semaphoreFilePath".
         */
        public RegisteredServer.Builder<_B> withSemaphoreFilePath(final JAXBElement<String> semaphoreFilePath) {
            this.semaphoreFilePath = semaphoreFilePath;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isOnline" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param isOnline
         *     Neuer Wert der Eigenschaft "isOnline".
         */
        public RegisteredServer.Builder<_B> withIsOnline(final Boolean isOnline) {
            this.isOnline = isOnline;
            return this;
        }

        @Override
        public RegisteredServer build() {
            if (_storedValue == null) {
                return this.init(new RegisteredServer());
            } else {
                return ((RegisteredServer) _storedValue);
            }
        }

        public RegisteredServer.Builder<_B> copyOf(final RegisteredServer _other) {
            _other.copyTo(this);
            return this;
        }

        public RegisteredServer.Builder<_B> copyOf(final RegisteredServer.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RegisteredServer.Selector<RegisteredServer.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RegisteredServer.Select _root() {
            return new RegisteredServer.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> serverUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> productUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> serverNames = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> serverType = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> gatewayServerUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> discoveryUrls = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> semaphoreFilePath = null;
        private com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> isOnline = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.serverUri!= null) {
                products.put("serverUri", this.serverUri.init());
            }
            if (this.productUri!= null) {
                products.put("productUri", this.productUri.init());
            }
            if (this.serverNames!= null) {
                products.put("serverNames", this.serverNames.init());
            }
            if (this.serverType!= null) {
                products.put("serverType", this.serverType.init());
            }
            if (this.gatewayServerUri!= null) {
                products.put("gatewayServerUri", this.gatewayServerUri.init());
            }
            if (this.discoveryUrls!= null) {
                products.put("discoveryUrls", this.discoveryUrls.init());
            }
            if (this.semaphoreFilePath!= null) {
                products.put("semaphoreFilePath", this.semaphoreFilePath.init());
            }
            if (this.isOnline!= null) {
                products.put("isOnline", this.isOnline.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> serverUri() {
            return ((this.serverUri == null)?this.serverUri = new com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>>(this._root, this, "serverUri"):this.serverUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> productUri() {
            return ((this.productUri == null)?this.productUri = new com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>>(this._root, this, "productUri"):this.productUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> serverNames() {
            return ((this.serverNames == null)?this.serverNames = new com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>>(this._root, this, "serverNames"):this.serverNames);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> serverType() {
            return ((this.serverType == null)?this.serverType = new com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>>(this._root, this, "serverType"):this.serverType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> gatewayServerUri() {
            return ((this.gatewayServerUri == null)?this.gatewayServerUri = new com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>>(this._root, this, "gatewayServerUri"):this.gatewayServerUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> discoveryUrls() {
            return ((this.discoveryUrls == null)?this.discoveryUrls = new com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>>(this._root, this, "discoveryUrls"):this.discoveryUrls);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> semaphoreFilePath() {
            return ((this.semaphoreFilePath == null)?this.semaphoreFilePath = new com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>>(this._root, this, "semaphoreFilePath"):this.semaphoreFilePath);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>> isOnline() {
            return ((this.isOnline == null)?this.isOnline = new com.kscs.util.jaxb.Selector<TRoot, RegisteredServer.Selector<TRoot, TParent>>(this._root, this, "isOnline"):this.isOnline);
        }

    }

}
