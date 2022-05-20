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
 * <p>Java-Klasse für UadpWriterGroupMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UadpWriterGroupMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}WriterGroupMessageDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DataSetOrdering" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetOrderingType" minOccurs="0"/&gt;
 *         &lt;element name="NetworkMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UadpNetworkMessageContentMask" minOccurs="0"/&gt;
 *         &lt;element name="SamplingOffset" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PublishingOffset" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDouble" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UadpWriterGroupMessageDataType", propOrder = {
    "groupVersion",
    "dataSetOrdering",
    "networkMessageContentMask",
    "samplingOffset",
    "publishingOffset"
})
public class UadpWriterGroupMessageDataType
    extends WriterGroupMessageDataType
{

    @XmlElement(name = "GroupVersion")
    @XmlSchemaType(name = "unsignedInt")
    protected Long groupVersion;
    @XmlElement(name = "DataSetOrdering")
    @XmlSchemaType(name = "string")
    protected DataSetOrderingType dataSetOrdering;
    @XmlElement(name = "NetworkMessageContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long networkMessageContentMask;
    @XmlElement(name = "SamplingOffset")
    protected Double samplingOffset;
    @XmlElementRef(name = "PublishingOffset", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDouble> publishingOffset;

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
     * Ruft den Wert der dataSetOrdering-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataSetOrderingType }
     *     
     */
    public DataSetOrderingType getDataSetOrdering() {
        return dataSetOrdering;
    }

    /**
     * Legt den Wert der dataSetOrdering-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetOrderingType }
     *     
     */
    public void setDataSetOrdering(DataSetOrderingType value) {
        this.dataSetOrdering = value;
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
     * Ruft den Wert der samplingOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSamplingOffset() {
        return samplingOffset;
    }

    /**
     * Legt den Wert der samplingOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSamplingOffset(Double value) {
        this.samplingOffset = value;
    }

    /**
     * Ruft den Wert der publishingOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDouble }{@code >}
     *     
     */
    public JAXBElement<ListOfDouble> getPublishingOffset() {
        return publishingOffset;
    }

    /**
     * Legt den Wert der publishingOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDouble }{@code >}
     *     
     */
    public void setPublishingOffset(JAXBElement<ListOfDouble> value) {
        this.publishingOffset = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UadpWriterGroupMessageDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.groupVersion = this.groupVersion;
        _other.dataSetOrdering = this.dataSetOrdering;
        _other.networkMessageContentMask = this.networkMessageContentMask;
        _other.samplingOffset = this.samplingOffset;
        _other.publishingOffset = this.publishingOffset;
    }

    @Override
    public<_B >UadpWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UadpWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public UadpWriterGroupMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UadpWriterGroupMessageDataType.Builder<Void> builder() {
        return new UadpWriterGroupMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >UadpWriterGroupMessageDataType.Builder<_B> copyOf(final WriterGroupMessageDataType _other) {
        final UadpWriterGroupMessageDataType.Builder<_B> _newBuilder = new UadpWriterGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >UadpWriterGroupMessageDataType.Builder<_B> copyOf(final UadpWriterGroupMessageDataType _other) {
        final UadpWriterGroupMessageDataType.Builder<_B> _newBuilder = new UadpWriterGroupMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UadpWriterGroupMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree groupVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("groupVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupVersionPropertyTree!= null):((groupVersionPropertyTree == null)||(!groupVersionPropertyTree.isLeaf())))) {
            _other.groupVersion = this.groupVersion;
        }
        final PropertyTree dataSetOrderingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetOrdering"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetOrderingPropertyTree!= null):((dataSetOrderingPropertyTree == null)||(!dataSetOrderingPropertyTree.isLeaf())))) {
            _other.dataSetOrdering = this.dataSetOrdering;
        }
        final PropertyTree networkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageContentMaskPropertyTree!= null):((networkMessageContentMaskPropertyTree == null)||(!networkMessageContentMaskPropertyTree.isLeaf())))) {
            _other.networkMessageContentMask = this.networkMessageContentMask;
        }
        final PropertyTree samplingOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingOffset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingOffsetPropertyTree!= null):((samplingOffsetPropertyTree == null)||(!samplingOffsetPropertyTree.isLeaf())))) {
            _other.samplingOffset = this.samplingOffset;
        }
        final PropertyTree publishingOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingOffset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingOffsetPropertyTree!= null):((publishingOffsetPropertyTree == null)||(!publishingOffsetPropertyTree.isLeaf())))) {
            _other.publishingOffset = this.publishingOffset;
        }
    }

    @Override
    public<_B >UadpWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UadpWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public UadpWriterGroupMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UadpWriterGroupMessageDataType.Builder<_B> copyOf(final WriterGroupMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UadpWriterGroupMessageDataType.Builder<_B> _newBuilder = new UadpWriterGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >UadpWriterGroupMessageDataType.Builder<_B> copyOf(final UadpWriterGroupMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UadpWriterGroupMessageDataType.Builder<_B> _newBuilder = new UadpWriterGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UadpWriterGroupMessageDataType.Builder<Void> copyExcept(final WriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UadpWriterGroupMessageDataType.Builder<Void> copyExcept(final UadpWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UadpWriterGroupMessageDataType.Builder<Void> copyOnly(final WriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static UadpWriterGroupMessageDataType.Builder<Void> copyOnly(final UadpWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends WriterGroupMessageDataType.Builder<_B>
        implements Buildable
    {

        private Long groupVersion;
        private DataSetOrderingType dataSetOrdering;
        private Long networkMessageContentMask;
        private Double samplingOffset;
        private JAXBElement<ListOfDouble> publishingOffset;

        public Builder(final _B _parentBuilder, final UadpWriterGroupMessageDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.groupVersion = _other.groupVersion;
                this.dataSetOrdering = _other.dataSetOrdering;
                this.networkMessageContentMask = _other.networkMessageContentMask;
                this.samplingOffset = _other.samplingOffset;
                this.publishingOffset = _other.publishingOffset;
            }
        }

        public Builder(final _B _parentBuilder, final UadpWriterGroupMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree groupVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("groupVersion"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(groupVersionPropertyTree!= null):((groupVersionPropertyTree == null)||(!groupVersionPropertyTree.isLeaf())))) {
                    this.groupVersion = _other.groupVersion;
                }
                final PropertyTree dataSetOrderingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetOrdering"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetOrderingPropertyTree!= null):((dataSetOrderingPropertyTree == null)||(!dataSetOrderingPropertyTree.isLeaf())))) {
                    this.dataSetOrdering = _other.dataSetOrdering;
                }
                final PropertyTree networkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageContentMask"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageContentMaskPropertyTree!= null):((networkMessageContentMaskPropertyTree == null)||(!networkMessageContentMaskPropertyTree.isLeaf())))) {
                    this.networkMessageContentMask = _other.networkMessageContentMask;
                }
                final PropertyTree samplingOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingOffset"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingOffsetPropertyTree!= null):((samplingOffsetPropertyTree == null)||(!samplingOffsetPropertyTree.isLeaf())))) {
                    this.samplingOffset = _other.samplingOffset;
                }
                final PropertyTree publishingOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingOffset"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingOffsetPropertyTree!= null):((publishingOffsetPropertyTree == null)||(!publishingOffsetPropertyTree.isLeaf())))) {
                    this.publishingOffset = _other.publishingOffset;
                }
            }
        }

        protected<_P extends UadpWriterGroupMessageDataType >_P init(final _P _product) {
            _product.groupVersion = this.groupVersion;
            _product.dataSetOrdering = this.dataSetOrdering;
            _product.networkMessageContentMask = this.networkMessageContentMask;
            _product.samplingOffset = this.samplingOffset;
            _product.publishingOffset = this.publishingOffset;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "groupVersion" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param groupVersion
         *     Neuer Wert der Eigenschaft "groupVersion".
         */
        public UadpWriterGroupMessageDataType.Builder<_B> withGroupVersion(final Long groupVersion) {
            this.groupVersion = groupVersion;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetOrdering" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetOrdering
         *     Neuer Wert der Eigenschaft "dataSetOrdering".
         */
        public UadpWriterGroupMessageDataType.Builder<_B> withDataSetOrdering(final DataSetOrderingType dataSetOrdering) {
            this.dataSetOrdering = dataSetOrdering;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param networkMessageContentMask
         *     Neuer Wert der Eigenschaft "networkMessageContentMask".
         */
        public UadpWriterGroupMessageDataType.Builder<_B> withNetworkMessageContentMask(final Long networkMessageContentMask) {
            this.networkMessageContentMask = networkMessageContentMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "samplingOffset" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param samplingOffset
         *     Neuer Wert der Eigenschaft "samplingOffset".
         */
        public UadpWriterGroupMessageDataType.Builder<_B> withSamplingOffset(final Double samplingOffset) {
            this.samplingOffset = samplingOffset;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishingOffset" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishingOffset
         *     Neuer Wert der Eigenschaft "publishingOffset".
         */
        public UadpWriterGroupMessageDataType.Builder<_B> withPublishingOffset(final JAXBElement<ListOfDouble> publishingOffset) {
            this.publishingOffset = publishingOffset;
            return this;
        }

        @Override
        public UadpWriterGroupMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new UadpWriterGroupMessageDataType());
            } else {
                return ((UadpWriterGroupMessageDataType) _storedValue);
            }
        }

        public UadpWriterGroupMessageDataType.Builder<_B> copyOf(final UadpWriterGroupMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public UadpWriterGroupMessageDataType.Builder<_B> copyOf(final UadpWriterGroupMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UadpWriterGroupMessageDataType.Selector<UadpWriterGroupMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UadpWriterGroupMessageDataType.Select _root() {
            return new UadpWriterGroupMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends WriterGroupMessageDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> groupVersion = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> dataSetOrdering = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> networkMessageContentMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> samplingOffset = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> publishingOffset = null;

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
            if (this.dataSetOrdering!= null) {
                products.put("dataSetOrdering", this.dataSetOrdering.init());
            }
            if (this.networkMessageContentMask!= null) {
                products.put("networkMessageContentMask", this.networkMessageContentMask.init());
            }
            if (this.samplingOffset!= null) {
                products.put("samplingOffset", this.samplingOffset.init());
            }
            if (this.publishingOffset!= null) {
                products.put("publishingOffset", this.publishingOffset.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> groupVersion() {
            return ((this.groupVersion == null)?this.groupVersion = new com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "groupVersion"):this.groupVersion);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> dataSetOrdering() {
            return ((this.dataSetOrdering == null)?this.dataSetOrdering = new com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetOrdering"):this.dataSetOrdering);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> networkMessageContentMask() {
            return ((this.networkMessageContentMask == null)?this.networkMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "networkMessageContentMask"):this.networkMessageContentMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> samplingOffset() {
            return ((this.samplingOffset == null)?this.samplingOffset = new com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "samplingOffset"):this.samplingOffset);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>> publishingOffset() {
            return ((this.publishingOffset == null)?this.publishingOffset = new com.kscs.util.jaxb.Selector<TRoot, UadpWriterGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "publishingOffset"):this.publishingOffset);
        }

    }

}
