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
 * <p>Java-Klasse für EndpointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EndpointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndpointUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityMode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MessageSecurityMode" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPolicyUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportProfileUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointType", propOrder = {
    "endpointUrl",
    "securityMode",
    "securityPolicyUri",
    "transportProfileUri"
})
public class EndpointType {

    @XmlElementRef(name = "EndpointUrl", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endpointUrl;
    @XmlElement(name = "SecurityMode")
    @XmlSchemaType(name = "string")
    protected MessageSecurityMode securityMode;
    @XmlElementRef(name = "SecurityPolicyUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityPolicyUri;
    @XmlElementRef(name = "TransportProfileUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportProfileUri;

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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EndpointType.Builder<_B> _other) {
        _other.endpointUrl = this.endpointUrl;
        _other.securityMode = this.securityMode;
        _other.securityPolicyUri = this.securityPolicyUri;
        _other.transportProfileUri = this.transportProfileUri;
    }

    public<_B >EndpointType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EndpointType.Builder<_B>(_parentBuilder, this, true);
    }

    public EndpointType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EndpointType.Builder<Void> builder() {
        return new EndpointType.Builder<Void>(null, null, false);
    }

    public static<_B >EndpointType.Builder<_B> copyOf(final EndpointType _other) {
        final EndpointType.Builder<_B> _newBuilder = new EndpointType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EndpointType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
            _other.endpointUrl = this.endpointUrl;
        }
        final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
            _other.securityMode = this.securityMode;
        }
        final PropertyTree securityPolicyUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityPolicyUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityPolicyUriPropertyTree!= null):((securityPolicyUriPropertyTree == null)||(!securityPolicyUriPropertyTree.isLeaf())))) {
            _other.securityPolicyUri = this.securityPolicyUri;
        }
        final PropertyTree transportProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportProfileUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportProfileUriPropertyTree!= null):((transportProfileUriPropertyTree == null)||(!transportProfileUriPropertyTree.isLeaf())))) {
            _other.transportProfileUri = this.transportProfileUri;
        }
    }

    public<_B >EndpointType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EndpointType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public EndpointType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EndpointType.Builder<_B> copyOf(final EndpointType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EndpointType.Builder<_B> _newBuilder = new EndpointType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EndpointType.Builder<Void> copyExcept(final EndpointType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EndpointType.Builder<Void> copyOnly(final EndpointType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final EndpointType _storedValue;
        private JAXBElement<String> endpointUrl;
        private MessageSecurityMode securityMode;
        private JAXBElement<String> securityPolicyUri;
        private JAXBElement<String> transportProfileUri;

        public Builder(final _B _parentBuilder, final EndpointType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.endpointUrl = _other.endpointUrl;
                    this.securityMode = _other.securityMode;
                    this.securityPolicyUri = _other.securityPolicyUri;
                    this.transportProfileUri = _other.transportProfileUri;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final EndpointType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
                        this.endpointUrl = _other.endpointUrl;
                    }
                    final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
                        this.securityMode = _other.securityMode;
                    }
                    final PropertyTree securityPolicyUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityPolicyUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityPolicyUriPropertyTree!= null):((securityPolicyUriPropertyTree == null)||(!securityPolicyUriPropertyTree.isLeaf())))) {
                        this.securityPolicyUri = _other.securityPolicyUri;
                    }
                    final PropertyTree transportProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportProfileUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportProfileUriPropertyTree!= null):((transportProfileUriPropertyTree == null)||(!transportProfileUriPropertyTree.isLeaf())))) {
                        this.transportProfileUri = _other.transportProfileUri;
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

        protected<_P extends EndpointType >_P init(final _P _product) {
            _product.endpointUrl = this.endpointUrl;
            _product.securityMode = this.securityMode;
            _product.securityPolicyUri = this.securityPolicyUri;
            _product.transportProfileUri = this.transportProfileUri;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointUrl" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param endpointUrl
         *     Neuer Wert der Eigenschaft "endpointUrl".
         */
        public EndpointType.Builder<_B> withEndpointUrl(final JAXBElement<String> endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityMode
         *     Neuer Wert der Eigenschaft "securityMode".
         */
        public EndpointType.Builder<_B> withSecurityMode(final MessageSecurityMode securityMode) {
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
        public EndpointType.Builder<_B> withSecurityPolicyUri(final JAXBElement<String> securityPolicyUri) {
            this.securityPolicyUri = securityPolicyUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transportProfileUri" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transportProfileUri
         *     Neuer Wert der Eigenschaft "transportProfileUri".
         */
        public EndpointType.Builder<_B> withTransportProfileUri(final JAXBElement<String> transportProfileUri) {
            this.transportProfileUri = transportProfileUri;
            return this;
        }

        @Override
        public EndpointType build() {
            if (_storedValue == null) {
                return this.init(new EndpointType());
            } else {
                return ((EndpointType) _storedValue);
            }
        }

        public EndpointType.Builder<_B> copyOf(final EndpointType _other) {
            _other.copyTo(this);
            return this;
        }

        public EndpointType.Builder<_B> copyOf(final EndpointType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EndpointType.Selector<EndpointType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EndpointType.Select _root() {
            return new EndpointType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>> endpointUrl = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>> securityMode = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>> securityPolicyUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>> transportProfileUri = null;

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
            if (this.securityMode!= null) {
                products.put("securityMode", this.securityMode.init());
            }
            if (this.securityPolicyUri!= null) {
                products.put("securityPolicyUri", this.securityPolicyUri.init());
            }
            if (this.transportProfileUri!= null) {
                products.put("transportProfileUri", this.transportProfileUri.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>> endpointUrl() {
            return ((this.endpointUrl == null)?this.endpointUrl = new com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>>(this._root, this, "endpointUrl"):this.endpointUrl);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>> securityMode() {
            return ((this.securityMode == null)?this.securityMode = new com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>>(this._root, this, "securityMode"):this.securityMode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>> securityPolicyUri() {
            return ((this.securityPolicyUri == null)?this.securityPolicyUri = new com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>>(this._root, this, "securityPolicyUri"):this.securityPolicyUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>> transportProfileUri() {
            return ((this.transportProfileUri == null)?this.transportProfileUri = new com.kscs.util.jaxb.Selector<TRoot, EndpointType.Selector<TRoot, TParent>>(this._root, this, "transportProfileUri"):this.transportProfileUri);
        }

    }

}
