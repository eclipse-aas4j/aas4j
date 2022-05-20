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
 * <p>Java-Klasse für JsonDataSetWriterMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JsonDataSetWriterMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetWriterMessageDataType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "JsonDataSetWriterMessageDataType", propOrder = {
    "dataSetMessageContentMask"
})
public class JsonDataSetWriterMessageDataType
    extends DataSetWriterMessageDataType
{

    @XmlElement(name = "DataSetMessageContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dataSetMessageContentMask;

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
    public<_B >void copyTo(final JsonDataSetWriterMessageDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.dataSetMessageContentMask = this.dataSetMessageContentMask;
    }

    @Override
    public<_B >JsonDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new JsonDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public JsonDataSetWriterMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static JsonDataSetWriterMessageDataType.Builder<Void> builder() {
        return new JsonDataSetWriterMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >JsonDataSetWriterMessageDataType.Builder<_B> copyOf(final DataSetWriterMessageDataType _other) {
        final JsonDataSetWriterMessageDataType.Builder<_B> _newBuilder = new JsonDataSetWriterMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >JsonDataSetWriterMessageDataType.Builder<_B> copyOf(final JsonDataSetWriterMessageDataType _other) {
        final JsonDataSetWriterMessageDataType.Builder<_B> _newBuilder = new JsonDataSetWriterMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final JsonDataSetWriterMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree dataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMessageContentMaskPropertyTree!= null):((dataSetMessageContentMaskPropertyTree == null)||(!dataSetMessageContentMaskPropertyTree.isLeaf())))) {
            _other.dataSetMessageContentMask = this.dataSetMessageContentMask;
        }
    }

    @Override
    public<_B >JsonDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new JsonDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public JsonDataSetWriterMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >JsonDataSetWriterMessageDataType.Builder<_B> copyOf(final DataSetWriterMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final JsonDataSetWriterMessageDataType.Builder<_B> _newBuilder = new JsonDataSetWriterMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >JsonDataSetWriterMessageDataType.Builder<_B> copyOf(final JsonDataSetWriterMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final JsonDataSetWriterMessageDataType.Builder<_B> _newBuilder = new JsonDataSetWriterMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static JsonDataSetWriterMessageDataType.Builder<Void> copyExcept(final DataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static JsonDataSetWriterMessageDataType.Builder<Void> copyExcept(final JsonDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static JsonDataSetWriterMessageDataType.Builder<Void> copyOnly(final DataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static JsonDataSetWriterMessageDataType.Builder<Void> copyOnly(final JsonDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataSetWriterMessageDataType.Builder<_B>
        implements Buildable
    {

        private Long dataSetMessageContentMask;

        public Builder(final _B _parentBuilder, final JsonDataSetWriterMessageDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.dataSetMessageContentMask = _other.dataSetMessageContentMask;
            }
        }

        public Builder(final _B _parentBuilder, final JsonDataSetWriterMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree dataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMessageContentMask"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMessageContentMaskPropertyTree!= null):((dataSetMessageContentMaskPropertyTree == null)||(!dataSetMessageContentMaskPropertyTree.isLeaf())))) {
                    this.dataSetMessageContentMask = _other.dataSetMessageContentMask;
                }
            }
        }

        protected<_P extends JsonDataSetWriterMessageDataType >_P init(final _P _product) {
            _product.dataSetMessageContentMask = this.dataSetMessageContentMask;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetMessageContentMask
         *     Neuer Wert der Eigenschaft "dataSetMessageContentMask".
         */
        public JsonDataSetWriterMessageDataType.Builder<_B> withDataSetMessageContentMask(final Long dataSetMessageContentMask) {
            this.dataSetMessageContentMask = dataSetMessageContentMask;
            return this;
        }

        @Override
        public JsonDataSetWriterMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new JsonDataSetWriterMessageDataType());
            } else {
                return ((JsonDataSetWriterMessageDataType) _storedValue);
            }
        }

        public JsonDataSetWriterMessageDataType.Builder<_B> copyOf(final JsonDataSetWriterMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public JsonDataSetWriterMessageDataType.Builder<_B> copyOf(final JsonDataSetWriterMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends JsonDataSetWriterMessageDataType.Selector<JsonDataSetWriterMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static JsonDataSetWriterMessageDataType.Select _root() {
            return new JsonDataSetWriterMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataSetWriterMessageDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, JsonDataSetWriterMessageDataType.Selector<TRoot, TParent>> dataSetMessageContentMask = null;

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
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, JsonDataSetWriterMessageDataType.Selector<TRoot, TParent>> dataSetMessageContentMask() {
            return ((this.dataSetMessageContentMask == null)?this.dataSetMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, JsonDataSetWriterMessageDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetMessageContentMask"):this.dataSetMessageContentMask);
        }

    }

}
