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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für PubSubConnectionDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PubSubConnectionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PublisherId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *         &lt;element name="TransportProfileUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionProperties" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfKeyValuePair" minOccurs="0"/&gt;
 *         &lt;element name="TransportSettings" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="WriterGroups" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfWriterGroupDataType" minOccurs="0"/&gt;
 *         &lt;element name="ReaderGroups" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfReaderGroupDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PubSubConnectionDataType", propOrder = {
    "name",
    "enabled",
    "publisherId",
    "transportProfileUri",
    "address",
    "connectionProperties",
    "transportSettings",
    "writerGroups",
    "readerGroups"
})
public class PubSubConnectionDataType {

    @XmlElementRef(name = "Name", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "PublisherId")
    protected Variant publisherId;
    @XmlElementRef(name = "TransportProfileUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportProfileUri;
    @XmlElementRef(name = "Address", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> address;
    @XmlElementRef(name = "ConnectionProperties", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfKeyValuePair> connectionProperties;
    @XmlElementRef(name = "TransportSettings", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> transportSettings;
    @XmlElementRef(name = "WriterGroups", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfWriterGroupDataType> writerGroups;
    @XmlElementRef(name = "ReaderGroups", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfReaderGroupDataType> readerGroups;

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
     * Ruft den Wert der publisherId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getPublisherId() {
        return publisherId;
    }

    /**
     * Legt den Wert der publisherId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setPublisherId(Variant value) {
        this.publisherId = value;
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
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setAddress(JAXBElement<ExtensionObject> value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der connectionProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public JAXBElement<ListOfKeyValuePair> getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * Legt den Wert der connectionProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public void setConnectionProperties(JAXBElement<ListOfKeyValuePair> value) {
        this.connectionProperties = value;
    }

    /**
     * Ruft den Wert der transportSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getTransportSettings() {
        return transportSettings;
    }

    /**
     * Legt den Wert der transportSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setTransportSettings(JAXBElement<ExtensionObject> value) {
        this.transportSettings = value;
    }

    /**
     * Ruft den Wert der writerGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfWriterGroupDataType }{@code >}
     *     
     */
    public JAXBElement<ListOfWriterGroupDataType> getWriterGroups() {
        return writerGroups;
    }

    /**
     * Legt den Wert der writerGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfWriterGroupDataType }{@code >}
     *     
     */
    public void setWriterGroups(JAXBElement<ListOfWriterGroupDataType> value) {
        this.writerGroups = value;
    }

    /**
     * Ruft den Wert der readerGroups-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfReaderGroupDataType }{@code >}
     *     
     */
    public JAXBElement<ListOfReaderGroupDataType> getReaderGroups() {
        return readerGroups;
    }

    /**
     * Legt den Wert der readerGroups-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfReaderGroupDataType }{@code >}
     *     
     */
    public void setReaderGroups(JAXBElement<ListOfReaderGroupDataType> value) {
        this.readerGroups = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PubSubConnectionDataType.Builder<_B> _other) {
        _other.name = this.name;
        _other.enabled = this.enabled;
        _other.publisherId = ((this.publisherId == null)?null:this.publisherId.newCopyBuilder(_other));
        _other.transportProfileUri = this.transportProfileUri;
        _other.address = this.address;
        _other.connectionProperties = this.connectionProperties;
        _other.transportSettings = this.transportSettings;
        _other.writerGroups = this.writerGroups;
        _other.readerGroups = this.readerGroups;
    }

    public<_B >PubSubConnectionDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PubSubConnectionDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public PubSubConnectionDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PubSubConnectionDataType.Builder<Void> builder() {
        return new PubSubConnectionDataType.Builder<Void>(null, null, false);
    }

    public static<_B >PubSubConnectionDataType.Builder<_B> copyOf(final PubSubConnectionDataType _other) {
        final PubSubConnectionDataType.Builder<_B> _newBuilder = new PubSubConnectionDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final PubSubConnectionDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree enabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enabled"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enabledPropertyTree!= null):((enabledPropertyTree == null)||(!enabledPropertyTree.isLeaf())))) {
            _other.enabled = this.enabled;
        }
        final PropertyTree publisherIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publisherId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publisherIdPropertyTree!= null):((publisherIdPropertyTree == null)||(!publisherIdPropertyTree.isLeaf())))) {
            _other.publisherId = ((this.publisherId == null)?null:this.publisherId.newCopyBuilder(_other, publisherIdPropertyTree, _propertyTreeUse));
        }
        final PropertyTree transportProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportProfileUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportProfileUriPropertyTree!= null):((transportProfileUriPropertyTree == null)||(!transportProfileUriPropertyTree.isLeaf())))) {
            _other.transportProfileUri = this.transportProfileUri;
        }
        final PropertyTree addressPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("address"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addressPropertyTree!= null):((addressPropertyTree == null)||(!addressPropertyTree.isLeaf())))) {
            _other.address = this.address;
        }
        final PropertyTree connectionPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("connectionProperties"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(connectionPropertiesPropertyTree!= null):((connectionPropertiesPropertyTree == null)||(!connectionPropertiesPropertyTree.isLeaf())))) {
            _other.connectionProperties = this.connectionProperties;
        }
        final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
            _other.transportSettings = this.transportSettings;
        }
        final PropertyTree writerGroupsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroups"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupsPropertyTree!= null):((writerGroupsPropertyTree == null)||(!writerGroupsPropertyTree.isLeaf())))) {
            _other.writerGroups = this.writerGroups;
        }
        final PropertyTree readerGroupsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readerGroups"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readerGroupsPropertyTree!= null):((readerGroupsPropertyTree == null)||(!readerGroupsPropertyTree.isLeaf())))) {
            _other.readerGroups = this.readerGroups;
        }
    }

    public<_B >PubSubConnectionDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PubSubConnectionDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public PubSubConnectionDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PubSubConnectionDataType.Builder<_B> copyOf(final PubSubConnectionDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PubSubConnectionDataType.Builder<_B> _newBuilder = new PubSubConnectionDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PubSubConnectionDataType.Builder<Void> copyExcept(final PubSubConnectionDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PubSubConnectionDataType.Builder<Void> copyOnly(final PubSubConnectionDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final PubSubConnectionDataType _storedValue;
        private JAXBElement<String> name;
        private Boolean enabled;
        private Variant.Builder<PubSubConnectionDataType.Builder<_B>> publisherId;
        private JAXBElement<String> transportProfileUri;
        private JAXBElement<ExtensionObject> address;
        private JAXBElement<ListOfKeyValuePair> connectionProperties;
        private JAXBElement<ExtensionObject> transportSettings;
        private JAXBElement<ListOfWriterGroupDataType> writerGroups;
        private JAXBElement<ListOfReaderGroupDataType> readerGroups;

        public Builder(final _B _parentBuilder, final PubSubConnectionDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.name = _other.name;
                    this.enabled = _other.enabled;
                    this.publisherId = ((_other.publisherId == null)?null:_other.publisherId.newCopyBuilder(this));
                    this.transportProfileUri = _other.transportProfileUri;
                    this.address = _other.address;
                    this.connectionProperties = _other.connectionProperties;
                    this.transportSettings = _other.transportSettings;
                    this.writerGroups = _other.writerGroups;
                    this.readerGroups = _other.readerGroups;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final PubSubConnectionDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                    final PropertyTree publisherIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publisherId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publisherIdPropertyTree!= null):((publisherIdPropertyTree == null)||(!publisherIdPropertyTree.isLeaf())))) {
                        this.publisherId = ((_other.publisherId == null)?null:_other.publisherId.newCopyBuilder(this, publisherIdPropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree transportProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportProfileUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportProfileUriPropertyTree!= null):((transportProfileUriPropertyTree == null)||(!transportProfileUriPropertyTree.isLeaf())))) {
                        this.transportProfileUri = _other.transportProfileUri;
                    }
                    final PropertyTree addressPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("address"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addressPropertyTree!= null):((addressPropertyTree == null)||(!addressPropertyTree.isLeaf())))) {
                        this.address = _other.address;
                    }
                    final PropertyTree connectionPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("connectionProperties"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(connectionPropertiesPropertyTree!= null):((connectionPropertiesPropertyTree == null)||(!connectionPropertiesPropertyTree.isLeaf())))) {
                        this.connectionProperties = _other.connectionProperties;
                    }
                    final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
                        this.transportSettings = _other.transportSettings;
                    }
                    final PropertyTree writerGroupsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroups"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupsPropertyTree!= null):((writerGroupsPropertyTree == null)||(!writerGroupsPropertyTree.isLeaf())))) {
                        this.writerGroups = _other.writerGroups;
                    }
                    final PropertyTree readerGroupsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readerGroups"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readerGroupsPropertyTree!= null):((readerGroupsPropertyTree == null)||(!readerGroupsPropertyTree.isLeaf())))) {
                        this.readerGroups = _other.readerGroups;
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

        protected<_P extends PubSubConnectionDataType >_P init(final _P _product) {
            _product.name = this.name;
            _product.enabled = this.enabled;
            _product.publisherId = ((this.publisherId == null)?null:this.publisherId.build());
            _product.transportProfileUri = this.transportProfileUri;
            _product.address = this.address;
            _product.connectionProperties = this.connectionProperties;
            _product.transportSettings = this.transportSettings;
            _product.writerGroups = this.writerGroups;
            _product.readerGroups = this.readerGroups;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        public PubSubConnectionDataType.Builder<_B> withName(final JAXBElement<String> name) {
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
        public PubSubConnectionDataType.Builder<_B> withEnabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publisherId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param publisherId
         *     Neuer Wert der Eigenschaft "publisherId".
         */
        public PubSubConnectionDataType.Builder<_B> withPublisherId(final Variant publisherId) {
            this.publisherId = ((publisherId == null)?null:new Variant.Builder<PubSubConnectionDataType.Builder<_B>>(this, publisherId, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "publisherId".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "publisherId".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends PubSubConnectionDataType.Builder<_B>> withPublisherId() {
            if (this.publisherId!= null) {
                return this.publisherId;
            }
            return this.publisherId = new Variant.Builder<PubSubConnectionDataType.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transportProfileUri" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transportProfileUri
         *     Neuer Wert der Eigenschaft "transportProfileUri".
         */
        public PubSubConnectionDataType.Builder<_B> withTransportProfileUri(final JAXBElement<String> transportProfileUri) {
            this.transportProfileUri = transportProfileUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "address" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param address
         *     Neuer Wert der Eigenschaft "address".
         */
        public PubSubConnectionDataType.Builder<_B> withAddress(final JAXBElement<ExtensionObject> address) {
            this.address = address;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "connectionProperties" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param connectionProperties
         *     Neuer Wert der Eigenschaft "connectionProperties".
         */
        public PubSubConnectionDataType.Builder<_B> withConnectionProperties(final JAXBElement<ListOfKeyValuePair> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transportSettings" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transportSettings
         *     Neuer Wert der Eigenschaft "transportSettings".
         */
        public PubSubConnectionDataType.Builder<_B> withTransportSettings(final JAXBElement<ExtensionObject> transportSettings) {
            this.transportSettings = transportSettings;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writerGroups" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param writerGroups
         *     Neuer Wert der Eigenschaft "writerGroups".
         */
        public PubSubConnectionDataType.Builder<_B> withWriterGroups(final JAXBElement<ListOfWriterGroupDataType> writerGroups) {
            this.writerGroups = writerGroups;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readerGroups" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param readerGroups
         *     Neuer Wert der Eigenschaft "readerGroups".
         */
        public PubSubConnectionDataType.Builder<_B> withReaderGroups(final JAXBElement<ListOfReaderGroupDataType> readerGroups) {
            this.readerGroups = readerGroups;
            return this;
        }

        @Override
        public PubSubConnectionDataType build() {
            if (_storedValue == null) {
                return this.init(new PubSubConnectionDataType());
            } else {
                return ((PubSubConnectionDataType) _storedValue);
            }
        }

        public PubSubConnectionDataType.Builder<_B> copyOf(final PubSubConnectionDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public PubSubConnectionDataType.Builder<_B> copyOf(final PubSubConnectionDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends PubSubConnectionDataType.Selector<PubSubConnectionDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PubSubConnectionDataType.Select _root() {
            return new PubSubConnectionDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> enabled = null;
        private Variant.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> publisherId = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> transportProfileUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> address = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> connectionProperties = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> transportSettings = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> writerGroups = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> readerGroups = null;

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
            if (this.publisherId!= null) {
                products.put("publisherId", this.publisherId.init());
            }
            if (this.transportProfileUri!= null) {
                products.put("transportProfileUri", this.transportProfileUri.init());
            }
            if (this.address!= null) {
                products.put("address", this.address.init());
            }
            if (this.connectionProperties!= null) {
                products.put("connectionProperties", this.connectionProperties.init());
            }
            if (this.transportSettings!= null) {
                products.put("transportSettings", this.transportSettings.init());
            }
            if (this.writerGroups!= null) {
                products.put("writerGroups", this.writerGroups.init());
            }
            if (this.readerGroups!= null) {
                products.put("readerGroups", this.readerGroups.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> enabled() {
            return ((this.enabled == null)?this.enabled = new com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "enabled"):this.enabled);
        }

        public Variant.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> publisherId() {
            return ((this.publisherId == null)?this.publisherId = new Variant.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "publisherId"):this.publisherId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> transportProfileUri() {
            return ((this.transportProfileUri == null)?this.transportProfileUri = new com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "transportProfileUri"):this.transportProfileUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> address() {
            return ((this.address == null)?this.address = new com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "address"):this.address);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> connectionProperties() {
            return ((this.connectionProperties == null)?this.connectionProperties = new com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "connectionProperties"):this.connectionProperties);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> transportSettings() {
            return ((this.transportSettings == null)?this.transportSettings = new com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "transportSettings"):this.transportSettings);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> writerGroups() {
            return ((this.writerGroups == null)?this.writerGroups = new com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "writerGroups"):this.writerGroups);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>> readerGroups() {
            return ((this.readerGroups == null)?this.readerGroups = new com.kscs.util.jaxb.Selector<TRoot, PubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "readerGroups"):this.readerGroups);
        }

    }

}
