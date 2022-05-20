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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import org.w3c.dom.Element;


/**
 * <p>Java-Klasse für Variant complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Variant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variant", propOrder = {
    "value"
})
public class Variant {

    @XmlElementRef(name = "Value", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Variant.Value> value;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Variant.Value }{@code >}
     *     
     */
    public JAXBElement<Variant.Value> getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Variant.Value }{@code >}
     *     
     */
    public void setValue(JAXBElement<Variant.Value> value) {
        this.value = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Variant.Builder<_B> _other) {
        _other.value = this.value;
    }

    public<_B >Variant.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new Variant.Builder<_B>(_parentBuilder, this, true);
    }

    public Variant.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static Variant.Builder<Void> builder() {
        return new Variant.Builder<Void>(null, null, false);
    }

    public static<_B >Variant.Builder<_B> copyOf(final Variant _other) {
        final Variant.Builder<_B> _newBuilder = new Variant.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final Variant.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = this.value;
        }
    }

    public<_B >Variant.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new Variant.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public Variant.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >Variant.Builder<_B> copyOf(final Variant _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final Variant.Builder<_B> _newBuilder = new Variant.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static Variant.Builder<Void> copyExcept(final Variant _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static Variant.Builder<Void> copyOnly(final Variant _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final Variant _storedValue;
        private JAXBElement<Variant.Value> value;

        public Builder(final _B _parentBuilder, final Variant _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.value = _other.value;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final Variant _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
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

        protected<_P extends Variant >_P init(final _P _product) {
            _product.value = this.value;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public Variant.Builder<_B> withValue(final JAXBElement<Variant.Value> value) {
            this.value = value;
            return this;
        }

        @Override
        public Variant build() {
            if (_storedValue == null) {
                return this.init(new Variant());
            } else {
                return ((Variant) _storedValue);
            }
        }

        public Variant.Builder<_B> copyOf(final Variant _other) {
            _other.copyTo(this);
            return this;
        }

        public Variant.Builder<_B> copyOf(final Variant.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends Variant.Selector<Variant.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static Variant.Select _root() {
            return new Variant.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, Variant.Selector<TRoot, TParent>> value = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.value!= null) {
                products.put("value", this.value.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, Variant.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new com.kscs.util.jaxb.Selector<TRoot, Variant.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Value {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Ruft den Wert der any-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Legt den Wert der any-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        /**
         * Copies all state of this object to a builder. This method is used by the {@link
         * #copyOf} method and should not be called directly by client code.
         * 
         * @param _other
         *     A builder instance to which the state of this object will be copied.
         */
        public<_B >void copyTo(final Variant.Value.Builder<_B> _other) {
        }

        public<_B >Variant.Value.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
            return new Variant.Value.Builder<_B>(_parentBuilder, this, true);
        }

        public Variant.Value.Builder<Void> newCopyBuilder() {
            return newCopyBuilder(null);
        }

        public static Variant.Value.Builder<Void> builder() {
            return new Variant.Value.Builder<Void>(null, null, false);
        }

        public static<_B >Variant.Value.Builder<_B> copyOf(final Variant.Value _other) {
            final Variant.Value.Builder<_B> _newBuilder = new Variant.Value.Builder<_B>(null, null, false);
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
        public<_B >void copyTo(final Variant.Value.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        }

        public<_B >Variant.Value.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            return new Variant.Value.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
        }

        public Variant.Value.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
        }

        public static<_B >Variant.Value.Builder<_B> copyOf(final Variant.Value _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            final Variant.Value.Builder<_B> _newBuilder = new Variant.Value.Builder<_B>(null, null, false);
            _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
            return _newBuilder;
        }

        public static Variant.Value.Builder<Void> copyExcept(final Variant.Value _other, final PropertyTree _propertyTree) {
            return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
        }

        public static Variant.Value.Builder<Void> copyOnly(final Variant.Value _other, final PropertyTree _propertyTree) {
            return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
        }

        public static class Builder<_B >implements Buildable
        {

            protected final _B _parentBuilder;
            protected final Variant.Value _storedValue;
            private Object any;

            public Builder(final _B _parentBuilder, final Variant.Value _other, final boolean _copy) {
                this._parentBuilder = _parentBuilder;
                if (_other!= null) {
                    if (_copy) {
                        _storedValue = null;
                    } else {
                        _storedValue = _other;
                    }
                } else {
                    _storedValue = null;
                }
            }

            public Builder(final _B _parentBuilder, final Variant.Value _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
                this._parentBuilder = _parentBuilder;
                if (_other!= null) {
                    if (_copy) {
                        _storedValue = null;
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

            protected<_P extends Variant.Value >_P init(final _P _product) {
                _product.any = this.any;
                return _product;
            }

            /**
             * Setzt den neuen Wert der Eigenschaft "any" (Vorher zugewiesener Wert wird
             * ersetzt)
             * 
             * @param any
             *     Neuer Wert der Eigenschaft "any".
             */
            public Variant.Value.Builder<_B> withAny(final Object any) {
                this.any = any;
                return this;
            }

            @Override
            public Variant.Value build() {
                if (_storedValue == null) {
                    return this.init(new Variant.Value());
                } else {
                    return ((Variant.Value) _storedValue);
                }
            }

            public Variant.Value.Builder<_B> copyOf(final Variant.Value _other) {
                _other.copyTo(this);
                return this;
            }

            public Variant.Value.Builder<_B> copyOf(final Variant.Value.Builder _other) {
                return copyOf(_other.build());
            }

        }

        public static class Select
            extends Variant.Value.Selector<Variant.Value.Select, Void>
        {


            Select() {
                super(null, null, null);
            }

            public static Variant.Value.Select _root() {
                return new Variant.Value.Select();
            }

        }

        public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
            extends com.kscs.util.jaxb.Selector<TRoot, TParent>
        {

            private com.kscs.util.jaxb.Selector<TRoot, Variant.Value.Selector<TRoot, TParent>> any = null;

            public Selector(final TRoot root, final TParent parent, final String propertyName) {
                super(root, parent, propertyName);
            }

            @Override
            public Map<String, PropertyTree> buildChildren() {
                final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
                products.putAll(super.buildChildren());
                if (this.any!= null) {
                    products.put("any", this.any.init());
                }
                return products;
            }

            public com.kscs.util.jaxb.Selector<TRoot, Variant.Value.Selector<TRoot, TParent>> any() {
                return ((this.any == null)?this.any = new com.kscs.util.jaxb.Selector<TRoot, Variant.Value.Selector<TRoot, TParent>>(this._root, this, "any"):this.any);
            }

        }

    }

}
