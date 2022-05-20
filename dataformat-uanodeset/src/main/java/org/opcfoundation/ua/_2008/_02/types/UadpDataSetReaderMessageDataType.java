//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für UadpDataSetReaderMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UadpDataSetReaderMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetReaderMessageDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NetworkMessageNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="DataSetOffset" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="DataSetClassId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Guid" minOccurs="0"/&gt;
 *         &lt;element name="NetworkMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UadpNetworkMessageContentMask" minOccurs="0"/&gt;
 *         &lt;element name="DataSetMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UadpDataSetMessageContentMask" minOccurs="0"/&gt;
 *         &lt;element name="PublishingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveOffset" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingOffset" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UadpDataSetReaderMessageDataType", propOrder = {
    "groupVersion",
    "networkMessageNumber",
    "dataSetOffset",
    "dataSetClassId",
    "networkMessageContentMask",
    "dataSetMessageContentMask",
    "publishingInterval",
    "receiveOffset",
    "processingOffset"
})
public class UadpDataSetReaderMessageDataType
    extends DataSetReaderMessageDataType
{

    @XmlElement(name = "GroupVersion")
    @XmlSchemaType(name = "unsignedInt")
    protected Long groupVersion;
    @XmlElement(name = "NetworkMessageNumber")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer networkMessageNumber;
    @XmlElement(name = "DataSetOffset")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dataSetOffset;
    @XmlElement(name = "DataSetClassId")
    protected Guid dataSetClassId;
    @XmlElement(name = "NetworkMessageContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long networkMessageContentMask;
    @XmlElement(name = "DataSetMessageContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dataSetMessageContentMask;
    @XmlElement(name = "PublishingInterval")
    protected Double publishingInterval;
    @XmlElement(name = "ReceiveOffset")
    protected Double receiveOffset;
    @XmlElement(name = "ProcessingOffset")
    protected Double processingOffset;

    /**
     * Ruft den Wert der groupVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupVersion() {
        return groupVersion;
    }

    /**
     * Legt den Wert der groupVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupVersion(Long value) {
        this.groupVersion = value;
    }

    /**
     * Ruft den Wert der networkMessageNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetworkMessageNumber() {
        return networkMessageNumber;
    }

    /**
     * Legt den Wert der networkMessageNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetworkMessageNumber(Integer value) {
        this.networkMessageNumber = value;
    }

    /**
     * Ruft den Wert der dataSetOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataSetOffset() {
        return dataSetOffset;
    }

    /**
     * Legt den Wert der dataSetOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataSetOffset(Integer value) {
        this.dataSetOffset = value;
    }

    /**
     * Ruft den Wert der dataSetClassId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getDataSetClassId() {
        return dataSetClassId;
    }

    /**
     * Legt den Wert der dataSetClassId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setDataSetClassId(Guid value) {
        this.dataSetClassId = value;
    }

    /**
     * Ruft den Wert der networkMessageContentMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetworkMessageContentMask() {
        return networkMessageContentMask;
    }

    /**
     * Legt den Wert der networkMessageContentMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetworkMessageContentMask(Long value) {
        this.networkMessageContentMask = value;
    }

    /**
     * Ruft den Wert der dataSetMessageContentMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDataSetMessageContentMask() {
        return dataSetMessageContentMask;
    }

    /**
     * Legt den Wert der dataSetMessageContentMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDataSetMessageContentMask(Long value) {
        this.dataSetMessageContentMask = value;
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
     * Ruft den Wert der receiveOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiveOffset() {
        return receiveOffset;
    }

    /**
     * Legt den Wert der receiveOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiveOffset(Double value) {
        this.receiveOffset = value;
    }

    /**
     * Ruft den Wert der processingOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProcessingOffset() {
        return processingOffset;
    }

    /**
     * Legt den Wert der processingOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProcessingOffset(Double value) {
        this.processingOffset = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UadpDataSetReaderMessageDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.groupVersion = this.groupVersion;
        _other.networkMessageNumber = this.networkMessageNumber;
        _other.dataSetOffset = this.dataSetOffset;
        _other.dataSetClassId = ((this.dataSetClassId == null)?null:this.dataSetClassId.newCopyBuilder(_other));
        _other.networkMessageContentMask = this.networkMessageContentMask;
        _other.dataSetMessageContentMask = this.dataSetMessageContentMask;
        _other.publishingInterval = this.publishingInterval;
        _other.receiveOffset = this.receiveOffset;
        _other.processingOffset = this.processingOffset;
    }

    @Override
    public<_B >UadpDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UadpDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public UadpDataSetReaderMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UadpDataSetReaderMessageDataType.Builder<Void> builder() {
        return new UadpDataSetReaderMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >UadpDataSetReaderMessageDataType.Builder<_B> copyOf(final DataSetReaderMessageDataType _other) {
        final UadpDataSetReaderMessageDataType.Builder<_B> _newBuilder = new UadpDataSetReaderMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >UadpDataSetReaderMessageDataType.Builder<_B> copyOf(final UadpDataSetReaderMessageDataType _other) {
        final UadpDataSetReaderMessageDataType.Builder<_B> _newBuilder = new UadpDataSetReaderMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UadpDataSetReaderMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree groupVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("groupVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupVersionPropertyTree!= null):((groupVersionPropertyTree == null)||(!groupVersionPropertyTree.isLeaf())))) {
            _other.groupVersion = this.groupVersion;
        }
        final PropertyTree networkMessageNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageNumber"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageNumberPropertyTree!= null):((networkMessageNumberPropertyTree == null)||(!networkMessageNumberPropertyTree.isLeaf())))) {
            _other.networkMessageNumber = this.networkMessageNumber;
        }
        final PropertyTree dataSetOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetOffset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetOffsetPropertyTree!= null):((dataSetOffsetPropertyTree == null)||(!dataSetOffsetPropertyTree.isLeaf())))) {
            _other.dataSetOffset = this.dataSetOffset;
        }
        final PropertyTree dataSetClassIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetClassId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetClassIdPropertyTree!= null):((dataSetClassIdPropertyTree == null)||(!dataSetClassIdPropertyTree.isLeaf())))) {
            _other.dataSetClassId = ((this.dataSetClassId == null)?null:this.dataSetClassId.newCopyBuilder(_other, dataSetClassIdPropertyTree, _propertyTreeUse));
        }
        final PropertyTree networkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageContentMaskPropertyTree!= null):((networkMessageContentMaskPropertyTree == null)||(!networkMessageContentMaskPropertyTree.isLeaf())))) {
            _other.networkMessageContentMask = this.networkMessageContentMask;
        }
        final PropertyTree dataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMessageContentMaskPropertyTree!= null):((dataSetMessageContentMaskPropertyTree == null)||(!dataSetMessageContentMaskPropertyTree.isLeaf())))) {
            _other.dataSetMessageContentMask = this.dataSetMessageContentMask;
        }
        final PropertyTree publishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingIntervalPropertyTree!= null):((publishingIntervalPropertyTree == null)||(!publishingIntervalPropertyTree.isLeaf())))) {
            _other.publishingInterval = this.publishingInterval;
        }
        final PropertyTree receiveOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("receiveOffset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(receiveOffsetPropertyTree!= null):((receiveOffsetPropertyTree == null)||(!receiveOffsetPropertyTree.isLeaf())))) {
            _other.receiveOffset = this.receiveOffset;
        }
        final PropertyTree processingOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("processingOffset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(processingOffsetPropertyTree!= null):((processingOffsetPropertyTree == null)||(!processingOffsetPropertyTree.isLeaf())))) {
            _other.processingOffset = this.processingOffset;
        }
    }

    @Override
    public<_B >UadpDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UadpDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public UadpDataSetReaderMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UadpDataSetReaderMessageDataType.Builder<_B> copyOf(final DataSetReaderMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UadpDataSetReaderMessageDataType.Builder<_B> _newBuilder = new UadpDataSetReaderMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >UadpDataSetReaderMessageDataType.Builder<_B> copyOf(final UadpDataSetReaderMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UadpDataSetReaderMessageDataType.Builder<_B> _newBuilder = new UadpDataSetReaderMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UadpDataSetReaderMessageDataType.Builder<Void> copyExcept(final DataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UadpDataSetReaderMessageDataType.Builder<Void> copyExcept(final UadpDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UadpDataSetReaderMessageDataType.Builder<Void> copyOnly(final DataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static UadpDataSetReaderMessageDataType.Builder<Void> copyOnly(final UadpDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataSetReaderMessageDataType.Builder<_B>
        implements Buildable
    {

        private Long groupVersion;
        private Integer networkMessageNumber;
        private Integer dataSetOffset;
        private Guid.Builder<UadpDataSetReaderMessageDataType.Builder<_B>> dataSetClassId;
        private Long networkMessageContentMask;
        private Long dataSetMessageContentMask;
        private Double publishingInterval;
        private Double receiveOffset;
        private Double processingOffset;

        public Builder(final _B _parentBuilder, final UadpDataSetReaderMessageDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.groupVersion = _other.groupVersion;
                this.networkMessageNumber = _other.networkMessageNumber;
                this.dataSetOffset = _other.dataSetOffset;
                this.dataSetClassId = ((_other.dataSetClassId == null)?null:_other.dataSetClassId.newCopyBuilder(this));
                this.networkMessageContentMask = _other.networkMessageContentMask;
                this.dataSetMessageContentMask = _other.dataSetMessageContentMask;
                this.publishingInterval = _other.publishingInterval;
                this.receiveOffset = _other.receiveOffset;
                this.processingOffset = _other.processingOffset;
            }
        }

        public Builder(final _B _parentBuilder, final UadpDataSetReaderMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree groupVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("groupVersion"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupVersionPropertyTree!= null):((groupVersionPropertyTree == null)||(!groupVersionPropertyTree.isLeaf())))) {
                    this.groupVersion = _other.groupVersion;
                }
                final PropertyTree networkMessageNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageNumber"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageNumberPropertyTree!= null):((networkMessageNumberPropertyTree == null)||(!networkMessageNumberPropertyTree.isLeaf())))) {
                    this.networkMessageNumber = _other.networkMessageNumber;
                }
                final PropertyTree dataSetOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetOffset"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetOffsetPropertyTree!= null):((dataSetOffsetPropertyTree == null)||(!dataSetOffsetPropertyTree.isLeaf())))) {
                    this.dataSetOffset = _other.dataSetOffset;
                }
                final PropertyTree dataSetClassIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetClassId"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetClassIdPropertyTree!= null):((dataSetClassIdPropertyTree == null)||(!dataSetClassIdPropertyTree.isLeaf())))) {
                    this.dataSetClassId = ((_other.dataSetClassId == null)?null:_other.dataSetClassId.newCopyBuilder(this, dataSetClassIdPropertyTree, _propertyTreeUse));
                }
                final PropertyTree networkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageContentMask"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageContentMaskPropertyTree!= null):((networkMessageContentMaskPropertyTree == null)||(!networkMessageContentMaskPropertyTree.isLeaf())))) {
                    this.networkMessageContentMask = _other.networkMessageContentMask;
                }
                final PropertyTree dataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMessageContentMask"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMessageContentMaskPropertyTree!= null):((dataSetMessageContentMaskPropertyTree == null)||(!dataSetMessageContentMaskPropertyTree.isLeaf())))) {
                    this.dataSetMessageContentMask = _other.dataSetMessageContentMask;
                }
                final PropertyTree publishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingInterval"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingIntervalPropertyTree!= null):((publishingIntervalPropertyTree == null)||(!publishingIntervalPropertyTree.isLeaf())))) {
                    this.publishingInterval = _other.publishingInterval;
                }
                final PropertyTree receiveOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("receiveOffset"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(receiveOffsetPropertyTree!= null):((receiveOffsetPropertyTree == null)||(!receiveOffsetPropertyTree.isLeaf())))) {
                    this.receiveOffset = _other.receiveOffset;
                }
                final PropertyTree processingOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("processingOffset"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(processingOffsetPropertyTree!= null):((processingOffsetPropertyTree == null)||(!processingOffsetPropertyTree.isLeaf())))) {
                    this.processingOffset = _other.processingOffset;
                }
            }
        }

        protected<_P extends UadpDataSetReaderMessageDataType >_P init(final _P _product) {
            _product.groupVersion = this.groupVersion;
            _product.networkMessageNumber = this.networkMessageNumber;
            _product.dataSetOffset = this.dataSetOffset;
            _product.dataSetClassId = ((this.dataSetClassId == null)?null:this.dataSetClassId.build());
            _product.networkMessageContentMask = this.networkMessageContentMask;
            _product.dataSetMessageContentMask = this.dataSetMessageContentMask;
            _product.publishingInterval = this.publishingInterval;
            _product.receiveOffset = this.receiveOffset;
            _product.processingOffset = this.processingOffset;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "groupVersion" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param groupVersion
         *     Neuer Wert der Eigenschaft "groupVersion".
         */
        public UadpDataSetReaderMessageDataType.Builder<_B> withGroupVersion(final Long groupVersion) {
            this.groupVersion = groupVersion;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkMessageNumber" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param networkMessageNumber
         *     Neuer Wert der Eigenschaft "networkMessageNumber".
         */
        public UadpDataSetReaderMessageDataType.Builder<_B> withNetworkMessageNumber(final Integer networkMessageNumber) {
            this.networkMessageNumber = networkMessageNumber;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetOffset" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetOffset
         *     Neuer Wert der Eigenschaft "dataSetOffset".
         */
        public UadpDataSetReaderMessageDataType.Builder<_B> withDataSetOffset(final Integer dataSetOffset) {
            this.dataSetOffset = dataSetOffset;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetClassId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetClassId
         *     Neuer Wert der Eigenschaft "dataSetClassId".
         */
        public UadpDataSetReaderMessageDataType.Builder<_B> withDataSetClassId(final Guid dataSetClassId) {
            this.dataSetClassId = ((dataSetClassId == null)?null:new Guid.Builder<UadpDataSetReaderMessageDataType.Builder<_B>>(this, dataSetClassId, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "dataSetClassId".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Guid.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft
         *     "dataSetClassId".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Guid.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Guid.Builder<? extends UadpDataSetReaderMessageDataType.Builder<_B>> withDataSetClassId() {
            if (this.dataSetClassId!= null) {
                return this.dataSetClassId;
            }
            return this.dataSetClassId = new Guid.Builder<UadpDataSetReaderMessageDataType.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param networkMessageContentMask
         *     Neuer Wert der Eigenschaft "networkMessageContentMask".
         */
        public UadpDataSetReaderMessageDataType.Builder<_B> withNetworkMessageContentMask(final Long networkMessageContentMask) {
            this.networkMessageContentMask = networkMessageContentMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetMessageContentMask
         *     Neuer Wert der Eigenschaft "dataSetMessageContentMask".
         */
        public UadpDataSetReaderMessageDataType.Builder<_B> withDataSetMessageContentMask(final Long dataSetMessageContentMask) {
            this.dataSetMessageContentMask = dataSetMessageContentMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishingInterval" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishingInterval
         *     Neuer Wert der Eigenschaft "publishingInterval".
         */
        public UadpDataSetReaderMessageDataType.Builder<_B> withPublishingInterval(final Double publishingInterval) {
            this.publishingInterval = publishingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "receiveOffset" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param receiveOffset
         *     Neuer Wert der Eigenschaft "receiveOffset".
         */
        public UadpDataSetReaderMessageDataType.Builder<_B> withReceiveOffset(final Double receiveOffset) {
            this.receiveOffset = receiveOffset;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "processingOffset" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param processingOffset
         *     Neuer Wert der Eigenschaft "processingOffset".
         */
        public UadpDataSetReaderMessageDataType.Builder<_B> withProcessingOffset(final Double processingOffset) {
            this.processingOffset = processingOffset;
            return this;
        }

        @Override
        public UadpDataSetReaderMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new UadpDataSetReaderMessageDataType());
            } else {
                return ((UadpDataSetReaderMessageDataType) _storedValue);
            }
        }

        public UadpDataSetReaderMessageDataType.Builder<_B> copyOf(final UadpDataSetReaderMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public UadpDataSetReaderMessageDataType.Builder<_B> copyOf(final UadpDataSetReaderMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UadpDataSetReaderMessageDataType.Selector<UadpDataSetReaderMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UadpDataSetReaderMessageDataType.Select _root() {
            return new UadpDataSetReaderMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataSetReaderMessageDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> groupVersion = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> networkMessageNumber = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetOffset = null;
        private Guid.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetClassId = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> networkMessageContentMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetMessageContentMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> publishingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> receiveOffset = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> processingOffset = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.groupVersion!= null) {
                products.put("groupVersion", this.groupVersion.init());
            }
            if (this.networkMessageNumber!= null) {
                products.put("networkMessageNumber", this.networkMessageNumber.init());
            }
            if (this.dataSetOffset!= null) {
                products.put("dataSetOffset", this.dataSetOffset.init());
            }
            if (this.dataSetClassId!= null) {
                products.put("dataSetClassId", this.dataSetClassId.init());
            }
            if (this.networkMessageContentMask!= null) {
                products.put("networkMessageContentMask", this.networkMessageContentMask.init());
            }
            if (this.dataSetMessageContentMask!= null) {
                products.put("dataSetMessageContentMask", this.dataSetMessageContentMask.init());
            }
            if (this.publishingInterval!= null) {
                products.put("publishingInterval", this.publishingInterval.init());
            }
            if (this.receiveOffset!= null) {
                products.put("receiveOffset", this.receiveOffset.init());
            }
            if (this.processingOffset!= null) {
                products.put("processingOffset", this.processingOffset.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> groupVersion() {
            return ((this.groupVersion == null)?this.groupVersion = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "groupVersion"):this.groupVersion);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> networkMessageNumber() {
            return ((this.networkMessageNumber == null)?this.networkMessageNumber = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "networkMessageNumber"):this.networkMessageNumber);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetOffset() {
            return ((this.dataSetOffset == null)?this.dataSetOffset = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetOffset"):this.dataSetOffset);
        }

        public Guid.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetClassId() {
            return ((this.dataSetClassId == null)?this.dataSetClassId = new Guid.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetClassId"):this.dataSetClassId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> networkMessageContentMask() {
            return ((this.networkMessageContentMask == null)?this.networkMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "networkMessageContentMask"):this.networkMessageContentMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetMessageContentMask() {
            return ((this.dataSetMessageContentMask == null)?this.dataSetMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetMessageContentMask"):this.dataSetMessageContentMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> publishingInterval() {
            return ((this.publishingInterval == null)?this.publishingInterval = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "publishingInterval"):this.publishingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> receiveOffset() {
            return ((this.receiveOffset == null)?this.receiveOffset = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "receiveOffset"):this.receiveOffset);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> processingOffset() {
            return ((this.processingOffset == null)?this.processingOffset = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "processingOffset"):this.processingOffset);
        }

    }

}
