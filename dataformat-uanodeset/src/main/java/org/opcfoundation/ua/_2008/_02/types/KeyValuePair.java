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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für KeyValuePair complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePair"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QualifiedName" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePair", propOrder = {
    "key",
    "value"
})
public class KeyValuePair {

    @XmlElementRef(name = "Key", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<QualifiedName> key;
    @XmlElement(name = "Value")
    protected Variant value;

    /**
     * Ruft den Wert der key-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public JAXBElement<QualifiedName> getKey() {
        return key;
    }

    /**
     * Legt den Wert der key-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public void setKey(JAXBElement<QualifiedName> value) {
        this.key = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setValue(Variant value) {
        this.value = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final KeyValuePair.Builder<_B> _other) {
        _other.key = this.key;
        _other.value = ((this.value == null)?null:this.value.newCopyBuilder(_other));
    }

    public<_B >KeyValuePair.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new KeyValuePair.Builder<_B>(_parentBuilder, this, true);
    }

    public KeyValuePair.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static KeyValuePair.Builder<Void> builder() {
        return new KeyValuePair.Builder<Void>(null, null, false);
    }

    public static<_B >KeyValuePair.Builder<_B> copyOf(final KeyValuePair _other) {
        final KeyValuePair.Builder<_B> _newBuilder = new KeyValuePair.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final KeyValuePair.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree keyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("key"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keyPropertyTree!= null):((keyPropertyTree == null)||(!keyPropertyTree.isLeaf())))) {
            _other.key = this.key;
        }
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = ((this.value == null)?null:this.value.newCopyBuilder(_other, valuePropertyTree, _propertyTreeUse));
        }
    }

    public<_B >KeyValuePair.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new KeyValuePair.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public KeyValuePair.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >KeyValuePair.Builder<_B> copyOf(final KeyValuePair _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final KeyValuePair.Builder<_B> _newBuilder = new KeyValuePair.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static KeyValuePair.Builder<Void> copyExcept(final KeyValuePair _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static KeyValuePair.Builder<Void> copyOnly(final KeyValuePair _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final KeyValuePair _storedValue;
        private JAXBElement<QualifiedName> key;
        private Variant.Builder<KeyValuePair.Builder<_B>> value;

        public Builder(final _B _parentBuilder, final KeyValuePair _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.key = _other.key;
                    this.value = ((_other.value == null)?null:_other.value.newCopyBuilder(this));
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final KeyValuePair _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree keyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("key"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keyPropertyTree!= null):((keyPropertyTree == null)||(!keyPropertyTree.isLeaf())))) {
                        this.key = _other.key;
                    }
                    final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
                        this.value = ((_other.value == null)?null:_other.value.newCopyBuilder(this, valuePropertyTree, _propertyTreeUse));
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

        protected<_P extends KeyValuePair >_P init(final _P _product) {
            _product.key = this.key;
            _product.value = ((this.value == null)?null:this.value.build());
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "key" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param key
         *     Neuer Wert der Eigenschaft "key".
         */
        public KeyValuePair.Builder<_B> withKey(final JAXBElement<QualifiedName> key) {
            this.key = key;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public KeyValuePair.Builder<_B> withValue(final Variant value) {
            this.value = ((value == null)?null:new Variant.Builder<KeyValuePair.Builder<_B>>(this, value, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "value".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "value".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends KeyValuePair.Builder<_B>> withValue() {
            if (this.value!= null) {
                return this.value;
            }
            return this.value = new Variant.Builder<KeyValuePair.Builder<_B>>(this, null, false);
        }

        @Override
        public KeyValuePair build() {
            if (_storedValue == null) {
                return this.init(new KeyValuePair());
            } else {
                return ((KeyValuePair) _storedValue);
            }
        }

        public KeyValuePair.Builder<_B> copyOf(final KeyValuePair _other) {
            _other.copyTo(this);
            return this;
        }

        public KeyValuePair.Builder<_B> copyOf(final KeyValuePair.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends KeyValuePair.Selector<KeyValuePair.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static KeyValuePair.Select _root() {
            return new KeyValuePair.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, KeyValuePair.Selector<TRoot, TParent>> key = null;
        private Variant.Selector<TRoot, KeyValuePair.Selector<TRoot, TParent>> value = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.key!= null) {
                products.put("key", this.key.init());
            }
            if (this.value!= null) {
                products.put("value", this.value.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, KeyValuePair.Selector<TRoot, TParent>> key() {
            return ((this.key == null)?this.key = new com.kscs.util.jaxb.Selector<TRoot, KeyValuePair.Selector<TRoot, TParent>>(this._root, this, "key"):this.key);
        }

        public Variant.Selector<TRoot, KeyValuePair.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new Variant.Selector<TRoot, KeyValuePair.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

    }

}
