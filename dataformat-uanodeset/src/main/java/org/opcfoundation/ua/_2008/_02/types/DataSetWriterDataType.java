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
 * <p>Java-Klasse für DataSetWriterDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataSetWriterDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataSetWriterId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="DataSetFieldContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetFieldContentMask" minOccurs="0"/&gt;
 *         &lt;element name="KeyFrameCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DataSetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataSetWriterProperties" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfKeyValuePair" minOccurs="0"/&gt;
 *         &lt;element name="TransportSettings" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="MessageSettings" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetWriterDataType", propOrder = {
    "name",
    "enabled",
    "dataSetWriterId",
    "dataSetFieldContentMask",
    "keyFrameCount",
    "dataSetName",
    "dataSetWriterProperties",
    "transportSettings",
    "messageSettings"
})
public class DataSetWriterDataType {

    @XmlElementRef(name = "Name", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "DataSetWriterId")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dataSetWriterId;
    @XmlElement(name = "DataSetFieldContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dataSetFieldContentMask;
    @XmlElement(name = "KeyFrameCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long keyFrameCount;
    @XmlElementRef(name = "DataSetName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataSetName;
    @XmlElementRef(name = "DataSetWriterProperties", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfKeyValuePair> dataSetWriterProperties;
    @XmlElementRef(name = "TransportSettings", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> transportSettings;
    @XmlElementRef(name = "MessageSettings", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> messageSettings;

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
     * Ruft den Wert der dataSetWriterId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataSetWriterId() {
        return dataSetWriterId;
    }

    /**
     * Legt den Wert der dataSetWriterId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataSetWriterId(Integer value) {
        this.dataSetWriterId = value;
    }

    /**
     * Ruft den Wert der dataSetFieldContentMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDataSetFieldContentMask() {
        return dataSetFieldContentMask;
    }

    /**
     * Legt den Wert der dataSetFieldContentMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDataSetFieldContentMask(Long value) {
        this.dataSetFieldContentMask = value;
    }

    /**
     * Ruft den Wert der keyFrameCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyFrameCount() {
        return keyFrameCount;
    }

    /**
     * Legt den Wert der keyFrameCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyFrameCount(Long value) {
        this.keyFrameCount = value;
    }

    /**
     * Ruft den Wert der dataSetName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataSetName() {
        return dataSetName;
    }

    /**
     * Legt den Wert der dataSetName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataSetName(JAXBElement<String> value) {
        this.dataSetName = value;
    }

    /**
     * Ruft den Wert der dataSetWriterProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public JAXBElement<ListOfKeyValuePair> getDataSetWriterProperties() {
        return dataSetWriterProperties;
    }

    /**
     * Legt den Wert der dataSetWriterProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public void setDataSetWriterProperties(JAXBElement<ListOfKeyValuePair> value) {
        this.dataSetWriterProperties = value;
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
     * Ruft den Wert der messageSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getMessageSettings() {
        return messageSettings;
    }

    /**
     * Legt den Wert der messageSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setMessageSettings(JAXBElement<ExtensionObject> value) {
        this.messageSettings = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataSetWriterDataType.Builder<_B> _other) {
        _other.name = this.name;
        _other.enabled = this.enabled;
        _other.dataSetWriterId = this.dataSetWriterId;
        _other.dataSetFieldContentMask = this.dataSetFieldContentMask;
        _other.keyFrameCount = this.keyFrameCount;
        _other.dataSetName = this.dataSetName;
        _other.dataSetWriterProperties = this.dataSetWriterProperties;
        _other.transportSettings = this.transportSettings;
        _other.messageSettings = this.messageSettings;
    }

    public<_B >DataSetWriterDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataSetWriterDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public DataSetWriterDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataSetWriterDataType.Builder<Void> builder() {
        return new DataSetWriterDataType.Builder<Void>(null, null, false);
    }

    public static<_B >DataSetWriterDataType.Builder<_B> copyOf(final DataSetWriterDataType _other) {
        final DataSetWriterDataType.Builder<_B> _newBuilder = new DataSetWriterDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataSetWriterDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree enabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enabled"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enabledPropertyTree!= null):((enabledPropertyTree == null)||(!enabledPropertyTree.isLeaf())))) {
            _other.enabled = this.enabled;
        }
        final PropertyTree dataSetWriterIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterIdPropertyTree!= null):((dataSetWriterIdPropertyTree == null)||(!dataSetWriterIdPropertyTree.isLeaf())))) {
            _other.dataSetWriterId = this.dataSetWriterId;
        }
        final PropertyTree dataSetFieldContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFieldContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFieldContentMaskPropertyTree!= null):((dataSetFieldContentMaskPropertyTree == null)||(!dataSetFieldContentMaskPropertyTree.isLeaf())))) {
            _other.dataSetFieldContentMask = this.dataSetFieldContentMask;
        }
        final PropertyTree keyFrameCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("keyFrameCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keyFrameCountPropertyTree!= null):((keyFrameCountPropertyTree == null)||(!keyFrameCountPropertyTree.isLeaf())))) {
            _other.keyFrameCount = this.keyFrameCount;
        }
        final PropertyTree dataSetNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetNamePropertyTree!= null):((dataSetNamePropertyTree == null)||(!dataSetNamePropertyTree.isLeaf())))) {
            _other.dataSetName = this.dataSetName;
        }
        final PropertyTree dataSetWriterPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterProperties"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterPropertiesPropertyTree!= null):((dataSetWriterPropertiesPropertyTree == null)||(!dataSetWriterPropertiesPropertyTree.isLeaf())))) {
            _other.dataSetWriterProperties = this.dataSetWriterProperties;
        }
        final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
            _other.transportSettings = this.transportSettings;
        }
        final PropertyTree messageSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageSettings"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageSettingsPropertyTree!= null):((messageSettingsPropertyTree == null)||(!messageSettingsPropertyTree.isLeaf())))) {
            _other.messageSettings = this.messageSettings;
        }
    }

    public<_B >DataSetWriterDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataSetWriterDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DataSetWriterDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataSetWriterDataType.Builder<_B> copyOf(final DataSetWriterDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataSetWriterDataType.Builder<_B> _newBuilder = new DataSetWriterDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataSetWriterDataType.Builder<Void> copyExcept(final DataSetWriterDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataSetWriterDataType.Builder<Void> copyOnly(final DataSetWriterDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DataSetWriterDataType _storedValue;
        private JAXBElement<String> name;
        private Boolean enabled;
        private Integer dataSetWriterId;
        private Long dataSetFieldContentMask;
        private Long keyFrameCount;
        private JAXBElement<String> dataSetName;
        private JAXBElement<ListOfKeyValuePair> dataSetWriterProperties;
        private JAXBElement<ExtensionObject> transportSettings;
        private JAXBElement<ExtensionObject> messageSettings;

        public Builder(final _B _parentBuilder, final DataSetWriterDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.name = _other.name;
                    this.enabled = _other.enabled;
                    this.dataSetWriterId = _other.dataSetWriterId;
                    this.dataSetFieldContentMask = _other.dataSetFieldContentMask;
                    this.keyFrameCount = _other.keyFrameCount;
                    this.dataSetName = _other.dataSetName;
                    this.dataSetWriterProperties = _other.dataSetWriterProperties;
                    this.transportSettings = _other.transportSettings;
                    this.messageSettings = _other.messageSettings;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DataSetWriterDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
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
                    final PropertyTree dataSetWriterIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterIdPropertyTree!= null):((dataSetWriterIdPropertyTree == null)||(!dataSetWriterIdPropertyTree.isLeaf())))) {
                        this.dataSetWriterId = _other.dataSetWriterId;
                    }
                    final PropertyTree dataSetFieldContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFieldContentMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFieldContentMaskPropertyTree!= null):((dataSetFieldContentMaskPropertyTree == null)||(!dataSetFieldContentMaskPropertyTree.isLeaf())))) {
                        this.dataSetFieldContentMask = _other.dataSetFieldContentMask;
                    }
                    final PropertyTree keyFrameCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("keyFrameCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keyFrameCountPropertyTree!= null):((keyFrameCountPropertyTree == null)||(!keyFrameCountPropertyTree.isLeaf())))) {
                        this.keyFrameCount = _other.keyFrameCount;
                    }
                    final PropertyTree dataSetNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetNamePropertyTree!= null):((dataSetNamePropertyTree == null)||(!dataSetNamePropertyTree.isLeaf())))) {
                        this.dataSetName = _other.dataSetName;
                    }
                    final PropertyTree dataSetWriterPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterProperties"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterPropertiesPropertyTree!= null):((dataSetWriterPropertiesPropertyTree == null)||(!dataSetWriterPropertiesPropertyTree.isLeaf())))) {
                        this.dataSetWriterProperties = _other.dataSetWriterProperties;
                    }
                    final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
                        this.transportSettings = _other.transportSettings;
                    }
                    final PropertyTree messageSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageSettings"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageSettingsPropertyTree!= null):((messageSettingsPropertyTree == null)||(!messageSettingsPropertyTree.isLeaf())))) {
                        this.messageSettings = _other.messageSettings;
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

        protected<_P extends DataSetWriterDataType >_P init(final _P _product) {
            _product.name = this.name;
            _product.enabled = this.enabled;
            _product.dataSetWriterId = this.dataSetWriterId;
            _product.dataSetFieldContentMask = this.dataSetFieldContentMask;
            _product.keyFrameCount = this.keyFrameCount;
            _product.dataSetName = this.dataSetName;
            _product.dataSetWriterProperties = this.dataSetWriterProperties;
            _product.transportSettings = this.transportSettings;
            _product.messageSettings = this.messageSettings;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        public DataSetWriterDataType.Builder<_B> withName(final JAXBElement<String> name) {
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
        public DataSetWriterDataType.Builder<_B> withEnabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriterId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetWriterId
         *     Neuer Wert der Eigenschaft "dataSetWriterId".
         */
        public DataSetWriterDataType.Builder<_B> withDataSetWriterId(final Integer dataSetWriterId) {
            this.dataSetWriterId = dataSetWriterId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetFieldContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetFieldContentMask
         *     Neuer Wert der Eigenschaft "dataSetFieldContentMask".
         */
        public DataSetWriterDataType.Builder<_B> withDataSetFieldContentMask(final Long dataSetFieldContentMask) {
            this.dataSetFieldContentMask = dataSetFieldContentMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "keyFrameCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param keyFrameCount
         *     Neuer Wert der Eigenschaft "keyFrameCount".
         */
        public DataSetWriterDataType.Builder<_B> withKeyFrameCount(final Long keyFrameCount) {
            this.keyFrameCount = keyFrameCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetName
         *     Neuer Wert der Eigenschaft "dataSetName".
         */
        public DataSetWriterDataType.Builder<_B> withDataSetName(final JAXBElement<String> dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriterProperties" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetWriterProperties
         *     Neuer Wert der Eigenschaft "dataSetWriterProperties".
         */
        public DataSetWriterDataType.Builder<_B> withDataSetWriterProperties(final JAXBElement<ListOfKeyValuePair> dataSetWriterProperties) {
            this.dataSetWriterProperties = dataSetWriterProperties;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transportSettings" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transportSettings
         *     Neuer Wert der Eigenschaft "transportSettings".
         */
        public DataSetWriterDataType.Builder<_B> withTransportSettings(final JAXBElement<ExtensionObject> transportSettings) {
            this.transportSettings = transportSettings;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "messageSettings" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param messageSettings
         *     Neuer Wert der Eigenschaft "messageSettings".
         */
        public DataSetWriterDataType.Builder<_B> withMessageSettings(final JAXBElement<ExtensionObject> messageSettings) {
            this.messageSettings = messageSettings;
            return this;
        }

        @Override
        public DataSetWriterDataType build() {
            if (_storedValue == null) {
                return this.init(new DataSetWriterDataType());
            } else {
                return ((DataSetWriterDataType) _storedValue);
            }
        }

        public DataSetWriterDataType.Builder<_B> copyOf(final DataSetWriterDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public DataSetWriterDataType.Builder<_B> copyOf(final DataSetWriterDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataSetWriterDataType.Selector<DataSetWriterDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataSetWriterDataType.Select _root() {
            return new DataSetWriterDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> enabled = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> dataSetWriterId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> dataSetFieldContentMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> keyFrameCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> dataSetName = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> dataSetWriterProperties = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> transportSettings = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> messageSettings = null;

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
            if (this.dataSetWriterId!= null) {
                products.put("dataSetWriterId", this.dataSetWriterId.init());
            }
            if (this.dataSetFieldContentMask!= null) {
                products.put("dataSetFieldContentMask", this.dataSetFieldContentMask.init());
            }
            if (this.keyFrameCount!= null) {
                products.put("keyFrameCount", this.keyFrameCount.init());
            }
            if (this.dataSetName!= null) {
                products.put("dataSetName", this.dataSetName.init());
            }
            if (this.dataSetWriterProperties!= null) {
                products.put("dataSetWriterProperties", this.dataSetWriterProperties.init());
            }
            if (this.transportSettings!= null) {
                products.put("transportSettings", this.transportSettings.init());
            }
            if (this.messageSettings!= null) {
                products.put("messageSettings", this.messageSettings.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> enabled() {
            return ((this.enabled == null)?this.enabled = new com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "enabled"):this.enabled);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> dataSetWriterId() {
            return ((this.dataSetWriterId == null)?this.dataSetWriterId = new com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetWriterId"):this.dataSetWriterId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> dataSetFieldContentMask() {
            return ((this.dataSetFieldContentMask == null)?this.dataSetFieldContentMask = new com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetFieldContentMask"):this.dataSetFieldContentMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> keyFrameCount() {
            return ((this.keyFrameCount == null)?this.keyFrameCount = new com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "keyFrameCount"):this.keyFrameCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> dataSetName() {
            return ((this.dataSetName == null)?this.dataSetName = new com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetName"):this.dataSetName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> dataSetWriterProperties() {
            return ((this.dataSetWriterProperties == null)?this.dataSetWriterProperties = new com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetWriterProperties"):this.dataSetWriterProperties);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> transportSettings() {
            return ((this.transportSettings == null)?this.transportSettings = new com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "transportSettings"):this.transportSettings);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>> messageSettings() {
            return ((this.messageSettings == null)?this.messageSettings = new com.kscs.util.jaxb.Selector<TRoot, DataSetWriterDataType.Selector<TRoot, TParent>>(this._root, this, "messageSettings"):this.messageSettings);
        }

    }

}
