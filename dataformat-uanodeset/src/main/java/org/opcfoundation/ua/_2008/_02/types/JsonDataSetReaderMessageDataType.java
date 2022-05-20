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
 * <p>Java-Klasse für JsonDataSetReaderMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JsonDataSetReaderMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetReaderMessageDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}JsonNetworkMessageContentMask" minOccurs="0"/&gt;
 *         &lt;element name="DataSetMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}JsonDataSetMessageContentMask" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JsonDataSetReaderMessageDataType", propOrder = {
    "networkMessageContentMask",
    "dataSetMessageContentMask"
})
public class JsonDataSetReaderMessageDataType
    extends DataSetReaderMessageDataType
{

    @XmlElement(name = "NetworkMessageContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long networkMessageContentMask;
    @XmlElement(name = "DataSetMessageContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dataSetMessageContentMask;

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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final JsonDataSetReaderMessageDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.networkMessageContentMask = this.networkMessageContentMask;
        _other.dataSetMessageContentMask = this.dataSetMessageContentMask;
    }

    @Override
    public<_B >JsonDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new JsonDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public JsonDataSetReaderMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static JsonDataSetReaderMessageDataType.Builder<Void> builder() {
        return new JsonDataSetReaderMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >JsonDataSetReaderMessageDataType.Builder<_B> copyOf(final DataSetReaderMessageDataType _other) {
        final JsonDataSetReaderMessageDataType.Builder<_B> _newBuilder = new JsonDataSetReaderMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >JsonDataSetReaderMessageDataType.Builder<_B> copyOf(final JsonDataSetReaderMessageDataType _other) {
        final JsonDataSetReaderMessageDataType.Builder<_B> _newBuilder = new JsonDataSetReaderMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final JsonDataSetReaderMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree networkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageContentMaskPropertyTree!= null):((networkMessageContentMaskPropertyTree == null)||(!networkMessageContentMaskPropertyTree.isLeaf())))) {
            _other.networkMessageContentMask = this.networkMessageContentMask;
        }
        final PropertyTree dataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMessageContentMaskPropertyTree!= null):((dataSetMessageContentMaskPropertyTree == null)||(!dataSetMessageContentMaskPropertyTree.isLeaf())))) {
            _other.dataSetMessageContentMask = this.dataSetMessageContentMask;
        }
    }

    @Override
    public<_B >JsonDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new JsonDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public JsonDataSetReaderMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >JsonDataSetReaderMessageDataType.Builder<_B> copyOf(final DataSetReaderMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final JsonDataSetReaderMessageDataType.Builder<_B> _newBuilder = new JsonDataSetReaderMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >JsonDataSetReaderMessageDataType.Builder<_B> copyOf(final JsonDataSetReaderMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final JsonDataSetReaderMessageDataType.Builder<_B> _newBuilder = new JsonDataSetReaderMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static JsonDataSetReaderMessageDataType.Builder<Void> copyExcept(final DataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static JsonDataSetReaderMessageDataType.Builder<Void> copyExcept(final JsonDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static JsonDataSetReaderMessageDataType.Builder<Void> copyOnly(final DataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static JsonDataSetReaderMessageDataType.Builder<Void> copyOnly(final JsonDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataSetReaderMessageDataType.Builder<_B>
        implements Buildable
    {

        private Long networkMessageContentMask;
        private Long dataSetMessageContentMask;

        public Builder(final _B _parentBuilder, final JsonDataSetReaderMessageDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.networkMessageContentMask = _other.networkMessageContentMask;
                this.dataSetMessageContentMask = _other.dataSetMessageContentMask;
            }
        }

        public Builder(final _B _parentBuilder, final JsonDataSetReaderMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree networkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageContentMask"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageContentMaskPropertyTree!= null):((networkMessageContentMaskPropertyTree == null)||(!networkMessageContentMaskPropertyTree.isLeaf())))) {
                    this.networkMessageContentMask = _other.networkMessageContentMask;
                }
                final PropertyTree dataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMessageContentMask"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMessageContentMaskPropertyTree!= null):((dataSetMessageContentMaskPropertyTree == null)||(!dataSetMessageContentMaskPropertyTree.isLeaf())))) {
                    this.dataSetMessageContentMask = _other.dataSetMessageContentMask;
                }
            }
        }

        protected<_P extends JsonDataSetReaderMessageDataType >_P init(final _P _product) {
            _product.networkMessageContentMask = this.networkMessageContentMask;
            _product.dataSetMessageContentMask = this.dataSetMessageContentMask;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param networkMessageContentMask
         *     Neuer Wert der Eigenschaft "networkMessageContentMask".
         */
        public JsonDataSetReaderMessageDataType.Builder<_B> withNetworkMessageContentMask(final Long networkMessageContentMask) {
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
        public JsonDataSetReaderMessageDataType.Builder<_B> withDataSetMessageContentMask(final Long dataSetMessageContentMask) {
            this.dataSetMessageContentMask = dataSetMessageContentMask;
            return this;
        }

        @Override
        public JsonDataSetReaderMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new JsonDataSetReaderMessageDataType());
            } else {
                return ((JsonDataSetReaderMessageDataType) _storedValue);
            }
        }

        public JsonDataSetReaderMessageDataType.Builder<_B> copyOf(final JsonDataSetReaderMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public JsonDataSetReaderMessageDataType.Builder<_B> copyOf(final JsonDataSetReaderMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends JsonDataSetReaderMessageDataType.Selector<JsonDataSetReaderMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static JsonDataSetReaderMessageDataType.Select _root() {
            return new JsonDataSetReaderMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataSetReaderMessageDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, JsonDataSetReaderMessageDataType.Selector<TRoot, TParent>> networkMessageContentMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, JsonDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetMessageContentMask = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.networkMessageContentMask!= null) {
                products.put("networkMessageContentMask", this.networkMessageContentMask.init());
            }
            if (this.dataSetMessageContentMask!= null) {
                products.put("dataSetMessageContentMask", this.dataSetMessageContentMask.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, JsonDataSetReaderMessageDataType.Selector<TRoot, TParent>> networkMessageContentMask() {
            return ((this.networkMessageContentMask == null)?this.networkMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, JsonDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "networkMessageContentMask"):this.networkMessageContentMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, JsonDataSetReaderMessageDataType.Selector<TRoot, TParent>> dataSetMessageContentMask() {
            return ((this.dataSetMessageContentMask == null)?this.dataSetMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, JsonDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetMessageContentMask"):this.dataSetMessageContentMask);
        }

    }

}
