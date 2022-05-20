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
 * <p>Java-Klasse für WriterGroupDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WriterGroupDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}PubSubGroupDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WriterGroupId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="PublishingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="KeepAliveTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="LocaleIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="HeaderLayoutUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportSettings" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="MessageSettings" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="DataSetWriters" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDataSetWriterDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriterGroupDataType", propOrder = {
    "writerGroupId",
    "publishingInterval",
    "keepAliveTime",
    "priority",
    "localeIds",
    "headerLayoutUri",
    "transportSettings",
    "messageSettings",
    "dataSetWriters"
})
public class WriterGroupDataType
    extends PubSubGroupDataType
{

    @XmlElement(name = "WriterGroupId")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer writerGroupId;
    @XmlElement(name = "PublishingInterval")
    protected Double publishingInterval;
    @XmlElement(name = "KeepAliveTime")
    protected Double keepAliveTime;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "unsignedByte")
    protected Short priority;
    @XmlElementRef(name = "LocaleIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> localeIds;
    @XmlElementRef(name = "HeaderLayoutUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> headerLayoutUri;
    @XmlElementRef(name = "TransportSettings", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> transportSettings;
    @XmlElementRef(name = "MessageSettings", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> messageSettings;
    @XmlElementRef(name = "DataSetWriters", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDataSetWriterDataType> dataSetWriters;

    /**
     * Ruft den Wert der writerGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWriterGroupId() {
        return writerGroupId;
    }

    /**
     * Legt den Wert der writerGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWriterGroupId(Integer value) {
        this.writerGroupId = value;
    }

    /**
     * Ruft den Wert der publishingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPublishingInterval() {
        return publishingInterval;
    }

    /**
     * Legt den Wert der publishingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPublishingInterval(Double value) {
        this.publishingInterval = value;
    }

    /**
     * Ruft den Wert der keepAliveTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKeepAliveTime() {
        return keepAliveTime;
    }

    /**
     * Legt den Wert der keepAliveTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKeepAliveTime(Double value) {
        this.keepAliveTime = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriority(Short value) {
        this.priority = value;
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
     * Ruft den Wert der headerLayoutUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeaderLayoutUri() {
        return headerLayoutUri;
    }

    /**
     * Legt den Wert der headerLayoutUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeaderLayoutUri(JAXBElement<String> value) {
        this.headerLayoutUri = value;
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
     * Ruft den Wert der dataSetWriters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDataSetWriterDataType }{@code >}
     *     
     */
    public JAXBElement<ListOfDataSetWriterDataType> getDataSetWriters() {
        return dataSetWriters;
    }

    /**
     * Legt den Wert der dataSetWriters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDataSetWriterDataType }{@code >}
     *     
     */
    public void setDataSetWriters(JAXBElement<ListOfDataSetWriterDataType> value) {
        this.dataSetWriters = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final WriterGroupDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.writerGroupId = this.writerGroupId;
        _other.publishingInterval = this.publishingInterval;
        _other.keepAliveTime = this.keepAliveTime;
        _other.priority = this.priority;
        _other.localeIds = this.localeIds;
        _other.headerLayoutUri = this.headerLayoutUri;
        _other.transportSettings = this.transportSettings;
        _other.messageSettings = this.messageSettings;
        _other.dataSetWriters = this.dataSetWriters;
    }

    @Override
    public<_B >WriterGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new WriterGroupDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public WriterGroupDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static WriterGroupDataType.Builder<Void> builder() {
        return new WriterGroupDataType.Builder<Void>(null, null, false);
    }

    public static<_B >WriterGroupDataType.Builder<_B> copyOf(final PubSubGroupDataType _other) {
        final WriterGroupDataType.Builder<_B> _newBuilder = new WriterGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >WriterGroupDataType.Builder<_B> copyOf(final WriterGroupDataType _other) {
        final WriterGroupDataType.Builder<_B> _newBuilder = new WriterGroupDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final WriterGroupDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree writerGroupIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupIdPropertyTree!= null):((writerGroupIdPropertyTree == null)||(!writerGroupIdPropertyTree.isLeaf())))) {
            _other.writerGroupId = this.writerGroupId;
        }
        final PropertyTree publishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingIntervalPropertyTree!= null):((publishingIntervalPropertyTree == null)||(!publishingIntervalPropertyTree.isLeaf())))) {
            _other.publishingInterval = this.publishingInterval;
        }
        final PropertyTree keepAliveTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("keepAliveTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keepAliveTimePropertyTree!= null):((keepAliveTimePropertyTree == null)||(!keepAliveTimePropertyTree.isLeaf())))) {
            _other.keepAliveTime = this.keepAliveTime;
        }
        final PropertyTree priorityPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("priority"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(priorityPropertyTree!= null):((priorityPropertyTree == null)||(!priorityPropertyTree.isLeaf())))) {
            _other.priority = this.priority;
        }
        final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
            _other.localeIds = this.localeIds;
        }
        final PropertyTree headerLayoutUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("headerLayoutUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(headerLayoutUriPropertyTree!= null):((headerLayoutUriPropertyTree == null)||(!headerLayoutUriPropertyTree.isLeaf())))) {
            _other.headerLayoutUri = this.headerLayoutUri;
        }
        final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
            _other.transportSettings = this.transportSettings;
        }
        final PropertyTree messageSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageSettings"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageSettingsPropertyTree!= null):((messageSettingsPropertyTree == null)||(!messageSettingsPropertyTree.isLeaf())))) {
            _other.messageSettings = this.messageSettings;
        }
        final PropertyTree dataSetWritersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriters"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWritersPropertyTree!= null):((dataSetWritersPropertyTree == null)||(!dataSetWritersPropertyTree.isLeaf())))) {
            _other.dataSetWriters = this.dataSetWriters;
        }
    }

    @Override
    public<_B >WriterGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new WriterGroupDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public WriterGroupDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >WriterGroupDataType.Builder<_B> copyOf(final PubSubGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final WriterGroupDataType.Builder<_B> _newBuilder = new WriterGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >WriterGroupDataType.Builder<_B> copyOf(final WriterGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final WriterGroupDataType.Builder<_B> _newBuilder = new WriterGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static WriterGroupDataType.Builder<Void> copyExcept(final PubSubGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static WriterGroupDataType.Builder<Void> copyExcept(final WriterGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static WriterGroupDataType.Builder<Void> copyOnly(final PubSubGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static WriterGroupDataType.Builder<Void> copyOnly(final WriterGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends PubSubGroupDataType.Builder<_B>
        implements Buildable
    {

        private Integer writerGroupId;
        private Double publishingInterval;
        private Double keepAliveTime;
        private Short priority;
        private JAXBElement<ListOfString> localeIds;
        private JAXBElement<String> headerLayoutUri;
        private JAXBElement<ExtensionObject> transportSettings;
        private JAXBElement<ExtensionObject> messageSettings;
        private JAXBElement<ListOfDataSetWriterDataType> dataSetWriters;

        public Builder(final _B _parentBuilder, final WriterGroupDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.writerGroupId = _other.writerGroupId;
                this.publishingInterval = _other.publishingInterval;
                this.keepAliveTime = _other.keepAliveTime;
                this.priority = _other.priority;
                this.localeIds = _other.localeIds;
                this.headerLayoutUri = _other.headerLayoutUri;
                this.transportSettings = _other.transportSettings;
                this.messageSettings = _other.messageSettings;
                this.dataSetWriters = _other.dataSetWriters;
            }
        }

        public Builder(final _B _parentBuilder, final WriterGroupDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree writerGroupIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupId"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupIdPropertyTree!= null):((writerGroupIdPropertyTree == null)||(!writerGroupIdPropertyTree.isLeaf())))) {
                    this.writerGroupId = _other.writerGroupId;
                }
                final PropertyTree publishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingInterval"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingIntervalPropertyTree!= null):((publishingIntervalPropertyTree == null)||(!publishingIntervalPropertyTree.isLeaf())))) {
                    this.publishingInterval = _other.publishingInterval;
                }
                final PropertyTree keepAliveTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("keepAliveTime"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keepAliveTimePropertyTree!= null):((keepAliveTimePropertyTree == null)||(!keepAliveTimePropertyTree.isLeaf())))) {
                    this.keepAliveTime = _other.keepAliveTime;
                }
                final PropertyTree priorityPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("priority"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(priorityPropertyTree!= null):((priorityPropertyTree == null)||(!priorityPropertyTree.isLeaf())))) {
                    this.priority = _other.priority;
                }
                final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
                    this.localeIds = _other.localeIds;
                }
                final PropertyTree headerLayoutUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("headerLayoutUri"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(headerLayoutUriPropertyTree!= null):((headerLayoutUriPropertyTree == null)||(!headerLayoutUriPropertyTree.isLeaf())))) {
                    this.headerLayoutUri = _other.headerLayoutUri;
                }
                final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
                    this.transportSettings = _other.transportSettings;
                }
                final PropertyTree messageSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageSettings"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageSettingsPropertyTree!= null):((messageSettingsPropertyTree == null)||(!messageSettingsPropertyTree.isLeaf())))) {
                    this.messageSettings = _other.messageSettings;
                }
                final PropertyTree dataSetWritersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriters"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWritersPropertyTree!= null):((dataSetWritersPropertyTree == null)||(!dataSetWritersPropertyTree.isLeaf())))) {
                    this.dataSetWriters = _other.dataSetWriters;
                }
            }
        }

        protected<_P extends WriterGroupDataType >_P init(final _P _product) {
            _product.writerGroupId = this.writerGroupId;
            _product.publishingInterval = this.publishingInterval;
            _product.keepAliveTime = this.keepAliveTime;
            _product.priority = this.priority;
            _product.localeIds = this.localeIds;
            _product.headerLayoutUri = this.headerLayoutUri;
            _product.transportSettings = this.transportSettings;
            _product.messageSettings = this.messageSettings;
            _product.dataSetWriters = this.dataSetWriters;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writerGroupId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param writerGroupId
         *     Neuer Wert der Eigenschaft "writerGroupId".
         */
        public WriterGroupDataType.Builder<_B> withWriterGroupId(final Integer writerGroupId) {
            this.writerGroupId = writerGroupId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishingInterval" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishingInterval
         *     Neuer Wert der Eigenschaft "publishingInterval".
         */
        public WriterGroupDataType.Builder<_B> withPublishingInterval(final Double publishingInterval) {
            this.publishingInterval = publishingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "keepAliveTime" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param keepAliveTime
         *     Neuer Wert der Eigenschaft "keepAliveTime".
         */
        public WriterGroupDataType.Builder<_B> withKeepAliveTime(final Double keepAliveTime) {
            this.keepAliveTime = keepAliveTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "priority" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param priority
         *     Neuer Wert der Eigenschaft "priority".
         */
        public WriterGroupDataType.Builder<_B> withPriority(final Short priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "localeIds" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param localeIds
         *     Neuer Wert der Eigenschaft "localeIds".
         */
        public WriterGroupDataType.Builder<_B> withLocaleIds(final JAXBElement<ListOfString> localeIds) {
            this.localeIds = localeIds;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "headerLayoutUri" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param headerLayoutUri
         *     Neuer Wert der Eigenschaft "headerLayoutUri".
         */
        public WriterGroupDataType.Builder<_B> withHeaderLayoutUri(final JAXBElement<String> headerLayoutUri) {
            this.headerLayoutUri = headerLayoutUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transportSettings" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transportSettings
         *     Neuer Wert der Eigenschaft "transportSettings".
         */
        public WriterGroupDataType.Builder<_B> withTransportSettings(final JAXBElement<ExtensionObject> transportSettings) {
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
        public WriterGroupDataType.Builder<_B> withMessageSettings(final JAXBElement<ExtensionObject> messageSettings) {
            this.messageSettings = messageSettings;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriters" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetWriters
         *     Neuer Wert der Eigenschaft "dataSetWriters".
         */
        public WriterGroupDataType.Builder<_B> withDataSetWriters(final JAXBElement<ListOfDataSetWriterDataType> dataSetWriters) {
            this.dataSetWriters = dataSetWriters;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        @Override
        public WriterGroupDataType.Builder<_B> withName(final JAXBElement<String> name) {
            super.withName(name);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enabled" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param enabled
         *     Neuer Wert der Eigenschaft "enabled".
         */
        @Override
        public WriterGroupDataType.Builder<_B> withEnabled(final Boolean enabled) {
            super.withEnabled(enabled);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityMode
         *     Neuer Wert der Eigenschaft "securityMode".
         */
        @Override
        public WriterGroupDataType.Builder<_B> withSecurityMode(final MessageSecurityMode securityMode) {
            super.withSecurityMode(securityMode);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityGroupId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityGroupId
         *     Neuer Wert der Eigenschaft "securityGroupId".
         */
        @Override
        public WriterGroupDataType.Builder<_B> withSecurityGroupId(final JAXBElement<String> securityGroupId) {
            super.withSecurityGroupId(securityGroupId);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityKeyServices" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param securityKeyServices
         *     Neuer Wert der Eigenschaft "securityKeyServices".
         */
        @Override
        public WriterGroupDataType.Builder<_B> withSecurityKeyServices(final JAXBElement<ListOfEndpointDescription> securityKeyServices) {
            super.withSecurityKeyServices(securityKeyServices);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxNetworkMessageSize" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxNetworkMessageSize
         *     Neuer Wert der Eigenschaft "maxNetworkMessageSize".
         */
        @Override
        public WriterGroupDataType.Builder<_B> withMaxNetworkMessageSize(final Long maxNetworkMessageSize) {
            super.withMaxNetworkMessageSize(maxNetworkMessageSize);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "groupProperties" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param groupProperties
         *     Neuer Wert der Eigenschaft "groupProperties".
         */
        @Override
        public WriterGroupDataType.Builder<_B> withGroupProperties(final JAXBElement<ListOfKeyValuePair> groupProperties) {
            super.withGroupProperties(groupProperties);
            return this;
        }

        @Override
        public WriterGroupDataType build() {
            if (_storedValue == null) {
                return this.init(new WriterGroupDataType());
            } else {
                return ((WriterGroupDataType) _storedValue);
            }
        }

        public WriterGroupDataType.Builder<_B> copyOf(final WriterGroupDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public WriterGroupDataType.Builder<_B> copyOf(final WriterGroupDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends WriterGroupDataType.Selector<WriterGroupDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static WriterGroupDataType.Select _root() {
            return new WriterGroupDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends PubSubGroupDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> writerGroupId = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> publishingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> keepAliveTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> priority = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> localeIds = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> headerLayoutUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> transportSettings = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> messageSettings = null;
        private com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> dataSetWriters = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.writerGroupId!= null) {
                products.put("writerGroupId", this.writerGroupId.init());
            }
            if (this.publishingInterval!= null) {
                products.put("publishingInterval", this.publishingInterval.init());
            }
            if (this.keepAliveTime!= null) {
                products.put("keepAliveTime", this.keepAliveTime.init());
            }
            if (this.priority!= null) {
                products.put("priority", this.priority.init());
            }
            if (this.localeIds!= null) {
                products.put("localeIds", this.localeIds.init());
            }
            if (this.headerLayoutUri!= null) {
                products.put("headerLayoutUri", this.headerLayoutUri.init());
            }
            if (this.transportSettings!= null) {
                products.put("transportSettings", this.transportSettings.init());
            }
            if (this.messageSettings!= null) {
                products.put("messageSettings", this.messageSettings.init());
            }
            if (this.dataSetWriters!= null) {
                products.put("dataSetWriters", this.dataSetWriters.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> writerGroupId() {
            return ((this.writerGroupId == null)?this.writerGroupId = new com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "writerGroupId"):this.writerGroupId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> publishingInterval() {
            return ((this.publishingInterval == null)?this.publishingInterval = new com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "publishingInterval"):this.publishingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> keepAliveTime() {
            return ((this.keepAliveTime == null)?this.keepAliveTime = new com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "keepAliveTime"):this.keepAliveTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> priority() {
            return ((this.priority == null)?this.priority = new com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "priority"):this.priority);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> localeIds() {
            return ((this.localeIds == null)?this.localeIds = new com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "localeIds"):this.localeIds);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> headerLayoutUri() {
            return ((this.headerLayoutUri == null)?this.headerLayoutUri = new com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "headerLayoutUri"):this.headerLayoutUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> transportSettings() {
            return ((this.transportSettings == null)?this.transportSettings = new com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "transportSettings"):this.transportSettings);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> messageSettings() {
            return ((this.messageSettings == null)?this.messageSettings = new com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "messageSettings"):this.messageSettings);
        }

        public com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>> dataSetWriters() {
            return ((this.dataSetWriters == null)?this.dataSetWriters = new com.kscs.util.jaxb.Selector<TRoot, WriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetWriters"):this.dataSetWriters);
        }

    }

}
