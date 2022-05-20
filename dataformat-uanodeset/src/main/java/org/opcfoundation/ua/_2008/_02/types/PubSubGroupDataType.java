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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für PubSubGroupDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PubSubGroupDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SecurityMode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MessageSecurityMode" minOccurs="0"/&gt;
 *         &lt;element name="SecurityGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityKeyServices" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfEndpointDescription" minOccurs="0"/&gt;
 *         &lt;element name="MaxNetworkMessageSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="GroupProperties" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfKeyValuePair" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PubSubGroupDataType", propOrder = {
    "name",
    "enabled",
    "securityMode",
    "securityGroupId",
    "securityKeyServices",
    "maxNetworkMessageSize",
    "groupProperties"
})
@XmlSeeAlso({
    WriterGroupDataType.class,
    ReaderGroupDataType.class
})
public class PubSubGroupDataType {

    @XmlElementRef(name = "Name", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "SecurityMode")
    @XmlSchemaType(name = "string")
    protected MessageSecurityMode securityMode;
    @XmlElementRef(name = "SecurityGroupId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityGroupId;
    @XmlElementRef(name = "SecurityKeyServices", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfEndpointDescription> securityKeyServices;
    @XmlElement(name = "MaxNetworkMessageSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxNetworkMessageSize;
    @XmlElementRef(name = "GroupProperties", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfKeyValuePair> groupProperties;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der enabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Legt den Wert der enabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
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
     * Ruft den Wert der securityGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecurityGroupId() {
        return securityGroupId;
    }

    /**
     * Legt den Wert der securityGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecurityGroupId(JAXBElement<String> value) {
        this.securityGroupId = value;
    }

    /**
     * Ruft den Wert der securityKeyServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfEndpointDescription> getSecurityKeyServices() {
        return securityKeyServices;
    }

    /**
     * Legt den Wert der securityKeyServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointDescription }{@code >}
     *     
     */
    public void setSecurityKeyServices(JAXBElement<ListOfEndpointDescription> value) {
        this.securityKeyServices = value;
    }

    /**
     * Ruft den Wert der maxNetworkMessageSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxNetworkMessageSize() {
        return maxNetworkMessageSize;
    }

    /**
     * Legt den Wert der maxNetworkMessageSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxNetworkMessageSize(Long value) {
        this.maxNetworkMessageSize = value;
    }

    /**
     * Ruft den Wert der groupProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public JAXBElement<ListOfKeyValuePair> getGroupProperties() {
        return groupProperties;
    }

    /**
     * Legt den Wert der groupProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public void setGroupProperties(JAXBElement<ListOfKeyValuePair> value) {
        this.groupProperties = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PubSubGroupDataType.Builder<_B> _other) {
        _other.name = this.name;
        _other.enabled = this.enabled;
        _other.securityMode = this.securityMode;
        _other.securityGroupId = this.securityGroupId;
        _other.securityKeyServices = this.securityKeyServices;
        _other.maxNetworkMessageSize = this.maxNetworkMessageSize;
        _other.groupProperties = this.groupProperties;
    }

    public<_B >PubSubGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PubSubGroupDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public PubSubGroupDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PubSubGroupDataType.Builder<Void> builder() {
        return new PubSubGroupDataType.Builder<Void>(null, null, false);
    }

    public static<_B >PubSubGroupDataType.Builder<_B> copyOf(final PubSubGroupDataType _other) {
        final PubSubGroupDataType.Builder<_B> _newBuilder = new PubSubGroupDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final PubSubGroupDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree enabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enabled"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enabledPropertyTree!= null):((enabledPropertyTree == null)||(!enabledPropertyTree.isLeaf())))) {
            _other.enabled = this.enabled;
        }
        final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
            _other.securityMode = this.securityMode;
        }
        final PropertyTree securityGroupIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityGroupId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityGroupIdPropertyTree!= null):((securityGroupIdPropertyTree == null)||(!securityGroupIdPropertyTree.isLeaf())))) {
            _other.securityGroupId = this.securityGroupId;
        }
        final PropertyTree securityKeyServicesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityKeyServices"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityKeyServicesPropertyTree!= null):((securityKeyServicesPropertyTree == null)||(!securityKeyServicesPropertyTree.isLeaf())))) {
            _other.securityKeyServices = this.securityKeyServices;
        }
        final PropertyTree maxNetworkMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxNetworkMessageSize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxNetworkMessageSizePropertyTree!= null):((maxNetworkMessageSizePropertyTree == null)||(!maxNetworkMessageSizePropertyTree.isLeaf())))) {
            _other.maxNetworkMessageSize = this.maxNetworkMessageSize;
        }
        final PropertyTree groupPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("groupProperties"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupPropertiesPropertyTree!= null):((groupPropertiesPropertyTree == null)||(!groupPropertiesPropertyTree.isLeaf())))) {
            _other.groupProperties = this.groupProperties;
        }
    }

    public<_B >PubSubGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PubSubGroupDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public PubSubGroupDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PubSubGroupDataType.Builder<_B> copyOf(final PubSubGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PubSubGroupDataType.Builder<_B> _newBuilder = new PubSubGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PubSubGroupDataType.Builder<Void> copyExcept(final PubSubGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PubSubGroupDataType.Builder<Void> copyOnly(final PubSubGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final PubSubGroupDataType _storedValue;
        private JAXBElement<String> name;
        private Boolean enabled;
        private MessageSecurityMode securityMode;
        private JAXBElement<String> securityGroupId;
        private JAXBElement<ListOfEndpointDescription> securityKeyServices;
        private Long maxNetworkMessageSize;
        private JAXBElement<ListOfKeyValuePair> groupProperties;

        public Builder(final _B _parentBuilder, final PubSubGroupDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.name = _other.name;
                    this.enabled = _other.enabled;
                    this.securityMode = _other.securityMode;
                    this.securityGroupId = _other.securityGroupId;
                    this.securityKeyServices = _other.securityKeyServices;
                    this.maxNetworkMessageSize = _other.maxNetworkMessageSize;
                    this.groupProperties = _other.groupProperties;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final PubSubGroupDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                        this.name = _other.name;
                    }
                    final PropertyTree enabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enabled"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enabledPropertyTree!= null):((enabledPropertyTree == null)||(!enabledPropertyTree.isLeaf())))) {
                        this.enabled = _other.enabled;
                    }
                    final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
                        this.securityMode = _other.securityMode;
                    }
                    final PropertyTree securityGroupIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityGroupId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityGroupIdPropertyTree!= null):((securityGroupIdPropertyTree == null)||(!securityGroupIdPropertyTree.isLeaf())))) {
                        this.securityGroupId = _other.securityGroupId;
                    }
                    final PropertyTree securityKeyServicesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityKeyServices"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityKeyServicesPropertyTree!= null):((securityKeyServicesPropertyTree == null)||(!securityKeyServicesPropertyTree.isLeaf())))) {
                        this.securityKeyServices = _other.securityKeyServices;
                    }
                    final PropertyTree maxNetworkMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxNetworkMessageSize"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxNetworkMessageSizePropertyTree!= null):((maxNetworkMessageSizePropertyTree == null)||(!maxNetworkMessageSizePropertyTree.isLeaf())))) {
                        this.maxNetworkMessageSize = _other.maxNetworkMessageSize;
                    }
                    final PropertyTree groupPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("groupProperties"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupPropertiesPropertyTree!= null):((groupPropertiesPropertyTree == null)||(!groupPropertiesPropertyTree.isLeaf())))) {
                        this.groupProperties = _other.groupProperties;
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

        protected<_P extends PubSubGroupDataType >_P init(final _P _product) {
            _product.name = this.name;
            _product.enabled = this.enabled;
            _product.securityMode = this.securityMode;
            _product.securityGroupId = this.securityGroupId;
            _product.securityKeyServices = this.securityKeyServices;
            _product.maxNetworkMessageSize = this.maxNetworkMessageSize;
            _product.groupProperties = this.groupProperties;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        public PubSubGroupDataType.Builder<_B> withName(final JAXBElement<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enabled" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param enabled
         *     Neuer Wert der Eigenschaft "enabled".
         */
        public PubSubGroupDataType.Builder<_B> withEnabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityMode
         *     Neuer Wert der Eigenschaft "securityMode".
         */
        public PubSubGroupDataType.Builder<_B> withSecurityMode(final MessageSecurityMode securityMode) {
            this.securityMode = securityMode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityGroupId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityGroupId
         *     Neuer Wert der Eigenschaft "securityGroupId".
         */
        public PubSubGroupDataType.Builder<_B> withSecurityGroupId(final JAXBElement<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityKeyServices" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param securityKeyServices
         *     Neuer Wert der Eigenschaft "securityKeyServices".
         */
        public PubSubGroupDataType.Builder<_B> withSecurityKeyServices(final JAXBElement<ListOfEndpointDescription> securityKeyServices) {
            this.securityKeyServices = securityKeyServices;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxNetworkMessageSize" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxNetworkMessageSize
         *     Neuer Wert der Eigenschaft "maxNetworkMessageSize".
         */
        public PubSubGroupDataType.Builder<_B> withMaxNetworkMessageSize(final Long maxNetworkMessageSize) {
            this.maxNetworkMessageSize = maxNetworkMessageSize;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "groupProperties" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param groupProperties
         *     Neuer Wert der Eigenschaft "groupProperties".
         */
        public PubSubGroupDataType.Builder<_B> withGroupProperties(final JAXBElement<ListOfKeyValuePair> groupProperties) {
            this.groupProperties = groupProperties;
            return this;
        }

        @Override
        public PubSubGroupDataType build() {
            if (_storedValue == null) {
                return this.init(new PubSubGroupDataType());
            } else {
                return ((PubSubGroupDataType) _storedValue);
            }
        }

        public PubSubGroupDataType.Builder<_B> copyOf(final PubSubGroupDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public PubSubGroupDataType.Builder<_B> copyOf(final PubSubGroupDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends PubSubGroupDataType.Selector<PubSubGroupDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PubSubGroupDataType.Select _root() {
            return new PubSubGroupDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> enabled = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> securityMode = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> securityGroupId = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> securityKeyServices = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> maxNetworkMessageSize = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> groupProperties = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.name!= null) {
                products.put("name", this.name.init());
            }
            if (this.enabled!= null) {
                products.put("enabled", this.enabled.init());
            }
            if (this.securityMode!= null) {
                products.put("securityMode", this.securityMode.init());
            }
            if (this.securityGroupId!= null) {
                products.put("securityGroupId", this.securityGroupId.init());
            }
            if (this.securityKeyServices!= null) {
                products.put("securityKeyServices", this.securityKeyServices.init());
            }
            if (this.maxNetworkMessageSize!= null) {
                products.put("maxNetworkMessageSize", this.maxNetworkMessageSize.init());
            }
            if (this.groupProperties!= null) {
                products.put("groupProperties", this.groupProperties.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> enabled() {
            return ((this.enabled == null)?this.enabled = new com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>>(this._root, this, "enabled"):this.enabled);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> securityMode() {
            return ((this.securityMode == null)?this.securityMode = new com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>>(this._root, this, "securityMode"):this.securityMode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> securityGroupId() {
            return ((this.securityGroupId == null)?this.securityGroupId = new com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>>(this._root, this, "securityGroupId"):this.securityGroupId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> securityKeyServices() {
            return ((this.securityKeyServices == null)?this.securityKeyServices = new com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>>(this._root, this, "securityKeyServices"):this.securityKeyServices);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> maxNetworkMessageSize() {
            return ((this.maxNetworkMessageSize == null)?this.maxNetworkMessageSize = new com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>>(this._root, this, "maxNetworkMessageSize"):this.maxNetworkMessageSize);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>> groupProperties() {
            return ((this.groupProperties == null)?this.groupProperties = new com.kscs.util.jaxb.Selector<TRoot, PubSubGroupDataType.Selector<TRoot, TParent>>(this._root, this, "groupProperties"):this.groupProperties);
        }

    }

}
