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
 * <p>Java-Klasse für DatagramWriterGroupTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DatagramWriterGroupTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}WriterGroupTransportDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageRepeatCount" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="MessageRepeatDelay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatagramWriterGroupTransportDataType", propOrder = {
    "messageRepeatCount",
    "messageRepeatDelay"
})
public class DatagramWriterGroupTransportDataType
    extends WriterGroupTransportDataType
{

    @XmlElement(name = "MessageRepeatCount")
    @XmlSchemaType(name = "unsignedByte")
    protected Short messageRepeatCount;
    @XmlElement(name = "MessageRepeatDelay")
    protected Double messageRepeatDelay;

    /**
     * Ruft den Wert der messageRepeatCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMessageRepeatCount() {
        return messageRepeatCount;
    }

    /**
     * Legt den Wert der messageRepeatCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMessageRepeatCount(Short value) {
        this.messageRepeatCount = value;
    }

    /**
     * Ruft den Wert der messageRepeatDelay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMessageRepeatDelay() {
        return messageRepeatDelay;
    }

    /**
     * Legt den Wert der messageRepeatDelay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMessageRepeatDelay(Double value) {
        this.messageRepeatDelay = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DatagramWriterGroupTransportDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.messageRepeatCount = this.messageRepeatCount;
        _other.messageRepeatDelay = this.messageRepeatDelay;
    }

    @Override
    public<_B >DatagramWriterGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DatagramWriterGroupTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public DatagramWriterGroupTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DatagramWriterGroupTransportDataType.Builder<Void> builder() {
        return new DatagramWriterGroupTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >DatagramWriterGroupTransportDataType.Builder<_B> copyOf(final WriterGroupTransportDataType _other) {
        final DatagramWriterGroupTransportDataType.Builder<_B> _newBuilder = new DatagramWriterGroupTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DatagramWriterGroupTransportDataType.Builder<_B> copyOf(final DatagramWriterGroupTransportDataType _other) {
        final DatagramWriterGroupTransportDataType.Builder<_B> _newBuilder = new DatagramWriterGroupTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DatagramWriterGroupTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree messageRepeatCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageRepeatCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageRepeatCountPropertyTree!= null):((messageRepeatCountPropertyTree == null)||(!messageRepeatCountPropertyTree.isLeaf())))) {
            _other.messageRepeatCount = this.messageRepeatCount;
        }
        final PropertyTree messageRepeatDelayPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageRepeatDelay"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageRepeatDelayPropertyTree!= null):((messageRepeatDelayPropertyTree == null)||(!messageRepeatDelayPropertyTree.isLeaf())))) {
            _other.messageRepeatDelay = this.messageRepeatDelay;
        }
    }

    @Override
    public<_B >DatagramWriterGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DatagramWriterGroupTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public DatagramWriterGroupTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DatagramWriterGroupTransportDataType.Builder<_B> copyOf(final WriterGroupTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DatagramWriterGroupTransportDataType.Builder<_B> _newBuilder = new DatagramWriterGroupTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DatagramWriterGroupTransportDataType.Builder<_B> copyOf(final DatagramWriterGroupTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DatagramWriterGroupTransportDataType.Builder<_B> _newBuilder = new DatagramWriterGroupTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DatagramWriterGroupTransportDataType.Builder<Void> copyExcept(final WriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DatagramWriterGroupTransportDataType.Builder<Void> copyExcept(final DatagramWriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DatagramWriterGroupTransportDataType.Builder<Void> copyOnly(final WriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DatagramWriterGroupTransportDataType.Builder<Void> copyOnly(final DatagramWriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends WriterGroupTransportDataType.Builder<_B>
        implements Buildable
    {

        private Short messageRepeatCount;
        private Double messageRepeatDelay;

        public Builder(final _B _parentBuilder, final DatagramWriterGroupTransportDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.messageRepeatCount = _other.messageRepeatCount;
                this.messageRepeatDelay = _other.messageRepeatDelay;
            }
        }

        public Builder(final _B _parentBuilder, final DatagramWriterGroupTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree messageRepeatCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageRepeatCount"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageRepeatCountPropertyTree!= null):((messageRepeatCountPropertyTree == null)||(!messageRepeatCountPropertyTree.isLeaf())))) {
                    this.messageRepeatCount = _other.messageRepeatCount;
                }
                final PropertyTree messageRepeatDelayPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageRepeatDelay"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageRepeatDelayPropertyTree!= null):((messageRepeatDelayPropertyTree == null)||(!messageRepeatDelayPropertyTree.isLeaf())))) {
                    this.messageRepeatDelay = _other.messageRepeatDelay;
                }
            }
        }

        protected<_P extends DatagramWriterGroupTransportDataType >_P init(final _P _product) {
            _product.messageRepeatCount = this.messageRepeatCount;
            _product.messageRepeatDelay = this.messageRepeatDelay;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "messageRepeatCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param messageRepeatCount
         *     Neuer Wert der Eigenschaft "messageRepeatCount".
         */
        public DatagramWriterGroupTransportDataType.Builder<_B> withMessageRepeatCount(final Short messageRepeatCount) {
            this.messageRepeatCount = messageRepeatCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "messageRepeatDelay" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param messageRepeatDelay
         *     Neuer Wert der Eigenschaft "messageRepeatDelay".
         */
        public DatagramWriterGroupTransportDataType.Builder<_B> withMessageRepeatDelay(final Double messageRepeatDelay) {
            this.messageRepeatDelay = messageRepeatDelay;
            return this;
        }

        @Override
        public DatagramWriterGroupTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new DatagramWriterGroupTransportDataType());
            } else {
                return ((DatagramWriterGroupTransportDataType) _storedValue);
            }
        }

        public DatagramWriterGroupTransportDataType.Builder<_B> copyOf(final DatagramWriterGroupTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public DatagramWriterGroupTransportDataType.Builder<_B> copyOf(final DatagramWriterGroupTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DatagramWriterGroupTransportDataType.Selector<DatagramWriterGroupTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DatagramWriterGroupTransportDataType.Select _root() {
            return new DatagramWriterGroupTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends WriterGroupTransportDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DatagramWriterGroupTransportDataType.Selector<TRoot, TParent>> messageRepeatCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, DatagramWriterGroupTransportDataType.Selector<TRoot, TParent>> messageRepeatDelay = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.messageRepeatCount!= null) {
                products.put("messageRepeatCount", this.messageRepeatCount.init());
            }
            if (this.messageRepeatDelay!= null) {
                products.put("messageRepeatDelay", this.messageRepeatDelay.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DatagramWriterGroupTransportDataType.Selector<TRoot, TParent>> messageRepeatCount() {
            return ((this.messageRepeatCount == null)?this.messageRepeatCount = new com.kscs.util.jaxb.Selector<TRoot, DatagramWriterGroupTransportDataType.Selector<TRoot, TParent>>(this._root, this, "messageRepeatCount"):this.messageRepeatCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DatagramWriterGroupTransportDataType.Selector<TRoot, TParent>> messageRepeatDelay() {
            return ((this.messageRepeatDelay == null)?this.messageRepeatDelay = new com.kscs.util.jaxb.Selector<TRoot, DatagramWriterGroupTransportDataType.Selector<TRoot, TParent>>(this._root, this, "messageRepeatDelay"):this.messageRepeatDelay);
        }

    }

}
