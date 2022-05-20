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
 * <p>Java-Klasse für JsonWriterGroupMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JsonWriterGroupMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}WriterGroupMessageDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}JsonNetworkMessageContentMask" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JsonWriterGroupMessageDataType", propOrder = {
    "networkMessageContentMask"
})
public class JsonWriterGroupMessageDataType
    extends WriterGroupMessageDataType
{

    @XmlElement(name = "NetworkMessageContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long networkMessageContentMask;

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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final JsonWriterGroupMessageDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.networkMessageContentMask = this.networkMessageContentMask;
    }

    @Override
    public<_B >JsonWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new JsonWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public JsonWriterGroupMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static JsonWriterGroupMessageDataType.Builder<Void> builder() {
        return new JsonWriterGroupMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >JsonWriterGroupMessageDataType.Builder<_B> copyOf(final WriterGroupMessageDataType _other) {
        final JsonWriterGroupMessageDataType.Builder<_B> _newBuilder = new JsonWriterGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >JsonWriterGroupMessageDataType.Builder<_B> copyOf(final JsonWriterGroupMessageDataType _other) {
        final JsonWriterGroupMessageDataType.Builder<_B> _newBuilder = new JsonWriterGroupMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final JsonWriterGroupMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree networkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageContentMaskPropertyTree!= null):((networkMessageContentMaskPropertyTree == null)||(!networkMessageContentMaskPropertyTree.isLeaf())))) {
            _other.networkMessageContentMask = this.networkMessageContentMask;
        }
    }

    @Override
    public<_B >JsonWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new JsonWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public JsonWriterGroupMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >JsonWriterGroupMessageDataType.Builder<_B> copyOf(final WriterGroupMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final JsonWriterGroupMessageDataType.Builder<_B> _newBuilder = new JsonWriterGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >JsonWriterGroupMessageDataType.Builder<_B> copyOf(final JsonWriterGroupMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final JsonWriterGroupMessageDataType.Builder<_B> _newBuilder = new JsonWriterGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static JsonWriterGroupMessageDataType.Builder<Void> copyExcept(final WriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static JsonWriterGroupMessageDataType.Builder<Void> copyExcept(final JsonWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static JsonWriterGroupMessageDataType.Builder<Void> copyOnly(final WriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static JsonWriterGroupMessageDataType.Builder<Void> copyOnly(final JsonWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends WriterGroupMessageDataType.Builder<_B>
        implements Buildable
    {

        private Long networkMessageContentMask;

        public Builder(final _B _parentBuilder, final JsonWriterGroupMessageDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.networkMessageContentMask = _other.networkMessageContentMask;
            }
        }

        public Builder(final _B _parentBuilder, final JsonWriterGroupMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree networkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("networkMessageContentMask"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(networkMessageContentMaskPropertyTree!= null):((networkMessageContentMaskPropertyTree == null)||(!networkMessageContentMaskPropertyTree.isLeaf())))) {
                    this.networkMessageContentMask = _other.networkMessageContentMask;
                }
            }
        }

        protected<_P extends JsonWriterGroupMessageDataType >_P init(final _P _product) {
            _product.networkMessageContentMask = this.networkMessageContentMask;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param networkMessageContentMask
         *     Neuer Wert der Eigenschaft "networkMessageContentMask".
         */
        public JsonWriterGroupMessageDataType.Builder<_B> withNetworkMessageContentMask(final Long networkMessageContentMask) {
            this.networkMessageContentMask = networkMessageContentMask;
            return this;
        }

        @Override
        public JsonWriterGroupMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new JsonWriterGroupMessageDataType());
            } else {
                return ((JsonWriterGroupMessageDataType) _storedValue);
            }
        }

        public JsonWriterGroupMessageDataType.Builder<_B> copyOf(final JsonWriterGroupMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public JsonWriterGroupMessageDataType.Builder<_B> copyOf(final JsonWriterGroupMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends JsonWriterGroupMessageDataType.Selector<JsonWriterGroupMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static JsonWriterGroupMessageDataType.Select _root() {
            return new JsonWriterGroupMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends WriterGroupMessageDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, JsonWriterGroupMessageDataType.Selector<TRoot, TParent>> networkMessageContentMask = null;

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
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, JsonWriterGroupMessageDataType.Selector<TRoot, TParent>> networkMessageContentMask() {
            return ((this.networkMessageContentMask == null)?this.networkMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, JsonWriterGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "networkMessageContentMask"):this.networkMessageContentMask);
        }

    }

}
