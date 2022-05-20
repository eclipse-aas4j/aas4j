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
 * <p>Java-Klasse für UadpDataSetWriterMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UadpDataSetWriterMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetWriterMessageDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UadpDataSetMessageContentMask" minOccurs="0"/&gt;
 *         &lt;element name="ConfiguredSize" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="NetworkMessageNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="DataSetOffset" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UadpDataSetWriterMessageDataType", propOrder = {
    "dataSetMessageContentMask",
    "configuredSize",
    "networkMessageNumber",
    "dataSetOffset"
})
public class UadpDataSetWriterMessageDataType
    extends DataSetWriterMessageDataType
{

    @XmlElement(name = "DataSetMessageContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dataSetMessageContentMask;
    @XmlElement(name = "ConfiguredSize")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer configuredSize;
    @XmlElement(name = "NetworkMessageNumber")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer networkMessageNumber;
    @XmlElement(name = "DataSetOffset")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dataSetOffset;

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
     * Ruft den Wert der configuredSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfiguredSize() {
        return configuredSize;
    }

    /**
     * Legt den Wert der configuredSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfiguredSize(Integer value) {
        this.configuredSize = value;
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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UadpDataSetWriterMessageDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.dataSetMessageContentMask = this.dataSetMessageContentMask;
        _other.configuredSize = this.configuredSize;
        _other.networkMessageNumber = this.networkMessageNumber;
        _other.dataSetOffset = this.dataSetOffset;
    }

    @Override
    public<_B >UadpDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UadpDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public UadpDataSetWriterMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UadpDataSetWriterMessageDataType.Builder<Void> builder() {
        return new UadpDataSetWriterMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >UadpDataSetWriterMessageDataType.Builder<_B> copyOf(final DataSetWriterMessageDataType _other) {
        final UadpDataSetWriterMessageDataType.Builder<_B> _newBuilder = new UadpDataSetWriterMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >UadpDataSetWriterMessageDataType.Builder<_B> copyOf(final UadpDataSetWriterMessageDataType _other) {
        final UadpDataSetWriterMessageDataType.Builder<_B> _newBuilder = new UadpDataSetWriterMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UadpDataSetWriterMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree dataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMessageContentMaskPropertyTree!= null):((dataSetMessageContentMaskPropertyTree == null)||(!dataSetMessageContentMaskPropertyTree.isLeaf())))) {
            _other.dataSetMessageContentMask = this.dataSetMessageContentMask;
        }
        final PropertyTree configuredSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("configuredSize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(configuredSizePropertyTree!= null):((configuredSizePropertyTree == null)||(!configuredSizePropertyTree.isLeaf())))) {
            _other.configuredSize = this.configuredSize;
        }
        final PropertyTree networkMessageNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageNumber"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageNumberPropertyTree!= null):((networkMessageNumberPropertyTree == null)||(!networkMessageNumberPropertyTree.isLeaf())))) {
            _other.networkMessageNumber = this.networkMessageNumber;
        }
        final PropertyTree dataSetOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetOffset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetOffsetPropertyTree!= null):((dataSetOffsetPropertyTree == null)||(!dataSetOffsetPropertyTree.isLeaf())))) {
            _other.dataSetOffset = this.dataSetOffset;
        }
    }

    @Override
    public<_B >UadpDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UadpDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public UadpDataSetWriterMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UadpDataSetWriterMessageDataType.Builder<_B> copyOf(final DataSetWriterMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UadpDataSetWriterMessageDataType.Builder<_B> _newBuilder = new UadpDataSetWriterMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >UadpDataSetWriterMessageDataType.Builder<_B> copyOf(final UadpDataSetWriterMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UadpDataSetWriterMessageDataType.Builder<_B> _newBuilder = new UadpDataSetWriterMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UadpDataSetWriterMessageDataType.Builder<Void> copyExcept(final DataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UadpDataSetWriterMessageDataType.Builder<Void> copyExcept(final UadpDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UadpDataSetWriterMessageDataType.Builder<Void> copyOnly(final DataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static UadpDataSetWriterMessageDataType.Builder<Void> copyOnly(final UadpDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataSetWriterMessageDataType.Builder<_B>
        implements Buildable
    {

        private Long dataSetMessageContentMask;
        private Integer configuredSize;
        private Integer networkMessageNumber;
        private Integer dataSetOffset;

        public Builder(final _B _parentBuilder, final UadpDataSetWriterMessageDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.dataSetMessageContentMask = _other.dataSetMessageContentMask;
                this.configuredSize = _other.configuredSize;
                this.networkMessageNumber = _other.networkMessageNumber;
                this.dataSetOffset = _other.dataSetOffset;
            }
        }

        public Builder(final _B _parentBuilder, final UadpDataSetWriterMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree dataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMessageContentMask"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMessageContentMaskPropertyTree!= null):((dataSetMessageContentMaskPropertyTree == null)||(!dataSetMessageContentMaskPropertyTree.isLeaf())))) {
                    this.dataSetMessageContentMask = _other.dataSetMessageContentMask;
                }
                final PropertyTree configuredSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("configuredSize"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(configuredSizePropertyTree!= null):((configuredSizePropertyTree == null)||(!configuredSizePropertyTree.isLeaf())))) {
                    this.configuredSize = _other.configuredSize;
                }
                final PropertyTree networkMessageNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageNumber"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageNumberPropertyTree!= null):((networkMessageNumberPropertyTree == null)||(!networkMessageNumberPropertyTree.isLeaf())))) {
                    this.networkMessageNumber = _other.networkMessageNumber;
                }
                final PropertyTree dataSetOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetOffset"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetOffsetPropertyTree!= null):((dataSetOffsetPropertyTree == null)||(!dataSetOffsetPropertyTree.isLeaf())))) {
                    this.dataSetOffset = _other.dataSetOffset;
                }
            }
        }

        protected<_P extends UadpDataSetWriterMessageDataType >_P init(final _P _product) {
            _product.dataSetMessageContentMask = this.dataSetMessageContentMask;
            _product.configuredSize = this.configuredSize;
            _product.networkMessageNumber = this.networkMessageNumber;
            _product.dataSetOffset = this.dataSetOffset;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetMessageContentMask
         *     Neuer Wert der Eigenschaft "dataSetMessageContentMask".
         */
        public UadpDataSetWriterMessageDataType.Builder<_B> withDataSetMessageContentMask(final Long dataSetMessageContentMask) {
            this.dataSetMessageContentMask = dataSetMessageContentMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "configuredSize" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param configuredSize
         *     Neuer Wert der Eigenschaft "configuredSize".
         */
        public UadpDataSetWriterMessageDataType.Builder<_B> withConfiguredSize(final Integer configuredSize) {
            this.configuredSize = configuredSize;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkMessageNumber" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param networkMessageNumber
         *     Neuer Wert der Eigenschaft "networkMessageNumber".
         */
        public UadpDataSetWriterMessageDataType.Builder<_B> withNetworkMessageNumber(final Integer networkMessageNumber) {
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
        public UadpDataSetWriterMessageDataType.Builder<_B> withDataSetOffset(final Integer dataSetOffset) {
            this.dataSetOffset = dataSetOffset;
            return this;
        }

        @Override
        public UadpDataSetWriterMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new UadpDataSetWriterMessageDataType());
            } else {
                return ((UadpDataSetWriterMessageDataType) _storedValue);
            }
        }

        public UadpDataSetWriterMessageDataType.Builder<_B> copyOf(final UadpDataSetWriterMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public UadpDataSetWriterMessageDataType.Builder<_B> copyOf(final UadpDataSetWriterMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UadpDataSetWriterMessageDataType.Selector<UadpDataSetWriterMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UadpDataSetWriterMessageDataType.Select _root() {
            return new UadpDataSetWriterMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataSetWriterMessageDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> dataSetMessageContentMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> configuredSize = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> networkMessageNumber = null;
        private com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> dataSetOffset = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetMessageContentMask!= null) {
                products.put("dataSetMessageContentMask", this.dataSetMessageContentMask.init());
            }
            if (this.configuredSize!= null) {
                products.put("configuredSize", this.configuredSize.init());
            }
            if (this.networkMessageNumber!= null) {
                products.put("networkMessageNumber", this.networkMessageNumber.init());
            }
            if (this.dataSetOffset!= null) {
                products.put("dataSetOffset", this.dataSetOffset.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> dataSetMessageContentMask() {
            return ((this.dataSetMessageContentMask == null)?this.dataSetMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetMessageContentMask"):this.dataSetMessageContentMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> configuredSize() {
            return ((this.configuredSize == null)?this.configuredSize = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>>(this._root, this, "configuredSize"):this.configuredSize);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> networkMessageNumber() {
            return ((this.networkMessageNumber == null)?this.networkMessageNumber = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>>(this._root, this, "networkMessageNumber"):this.networkMessageNumber);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> dataSetOffset() {
            return ((this.dataSetOffset == null)?this.dataSetOffset = new com.kscs.util.jaxb.Selector<TRoot, UadpDataSetWriterMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetOffset"):this.dataSetOffset);
        }

    }

}
