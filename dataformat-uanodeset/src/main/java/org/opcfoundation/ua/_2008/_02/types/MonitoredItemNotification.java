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
 * <p>Java-Klasse für MonitoredItemNotification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MonitoredItemNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientHandle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredItemNotification", propOrder = {
    "clientHandle",
    "value"
})
public class MonitoredItemNotification {

    @XmlElement(name = "ClientHandle")
    @XmlSchemaType(name = "unsignedInt")
    protected Long clientHandle;
    @XmlElementRef(name = "Value", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DataValue> value;

    /**
     * Ruft den Wert der clientHandle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientHandle() {
        return clientHandle;
    }

    /**
     * Legt den Wert der clientHandle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientHandle(Long value) {
        this.clientHandle = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataValue }{@code >}
     *     
     */
    public JAXBElement<DataValue> getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataValue }{@code >}
     *     
     */
    public void setValue(JAXBElement<DataValue> value) {
        this.value = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final MonitoredItemNotification.Builder<_B> _other) {
        _other.clientHandle = this.clientHandle;
        _other.value = this.value;
    }

    public<_B >MonitoredItemNotification.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new MonitoredItemNotification.Builder<_B>(_parentBuilder, this, true);
    }

    public MonitoredItemNotification.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static MonitoredItemNotification.Builder<Void> builder() {
        return new MonitoredItemNotification.Builder<Void>(null, null, false);
    }

    public static<_B >MonitoredItemNotification.Builder<_B> copyOf(final MonitoredItemNotification _other) {
        final MonitoredItemNotification.Builder<_B> _newBuilder = new MonitoredItemNotification.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final MonitoredItemNotification.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree clientHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientHandle"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientHandlePropertyTree!= null):((clientHandlePropertyTree == null)||(!clientHandlePropertyTree.isLeaf())))) {
            _other.clientHandle = this.clientHandle;
        }
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = this.value;
        }
    }

    public<_B >MonitoredItemNotification.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new MonitoredItemNotification.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public MonitoredItemNotification.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >MonitoredItemNotification.Builder<_B> copyOf(final MonitoredItemNotification _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MonitoredItemNotification.Builder<_B> _newBuilder = new MonitoredItemNotification.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static MonitoredItemNotification.Builder<Void> copyExcept(final MonitoredItemNotification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MonitoredItemNotification.Builder<Void> copyOnly(final MonitoredItemNotification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final MonitoredItemNotification _storedValue;
        private Long clientHandle;
        private JAXBElement<DataValue> value;

        public Builder(final _B _parentBuilder, final MonitoredItemNotification _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.clientHandle = _other.clientHandle;
                    this.value = _other.value;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final MonitoredItemNotification _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree clientHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientHandle"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientHandlePropertyTree!= null):((clientHandlePropertyTree == null)||(!clientHandlePropertyTree.isLeaf())))) {
                        this.clientHandle = _other.clientHandle;
                    }
                    final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
                        this.value = _other.value;
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

        protected<_P extends MonitoredItemNotification >_P init(final _P _product) {
            _product.clientHandle = this.clientHandle;
            _product.value = this.value;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientHandle" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param clientHandle
         *     Neuer Wert der Eigenschaft "clientHandle".
         */
        public MonitoredItemNotification.Builder<_B> withClientHandle(final Long clientHandle) {
            this.clientHandle = clientHandle;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public MonitoredItemNotification.Builder<_B> withValue(final JAXBElement<DataValue> value) {
            this.value = value;
            return this;
        }

        @Override
        public MonitoredItemNotification build() {
            if (_storedValue == null) {
                return this.init(new MonitoredItemNotification());
            } else {
                return ((MonitoredItemNotification) _storedValue);
            }
        }

        public MonitoredItemNotification.Builder<_B> copyOf(final MonitoredItemNotification _other) {
            _other.copyTo(this);
            return this;
        }

        public MonitoredItemNotification.Builder<_B> copyOf(final MonitoredItemNotification.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends MonitoredItemNotification.Selector<MonitoredItemNotification.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static MonitoredItemNotification.Select _root() {
            return new MonitoredItemNotification.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemNotification.Selector<TRoot, TParent>> clientHandle = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemNotification.Selector<TRoot, TParent>> value = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.clientHandle!= null) {
                products.put("clientHandle", this.clientHandle.init());
            }
            if (this.value!= null) {
                products.put("value", this.value.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemNotification.Selector<TRoot, TParent>> clientHandle() {
            return ((this.clientHandle == null)?this.clientHandle = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemNotification.Selector<TRoot, TParent>>(this._root, this, "clientHandle"):this.clientHandle);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemNotification.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemNotification.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

    }

}
