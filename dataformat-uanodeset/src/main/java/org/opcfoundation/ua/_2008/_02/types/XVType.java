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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für XVType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XVType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XVType", propOrder = {
    "x",
    "value"
})
public class XVType {

    @XmlElement(name = "X")
    protected Double x;
    @XmlElement(name = "Value")
    protected Float value;

    /**
     * Ruft den Wert der x-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX() {
        return x;
    }

    /**
     * Legt den Wert der x-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX(Double value) {
        this.x = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final XVType.Builder<_B> _other) {
        _other.x = this.x;
        _other.value = this.value;
    }

    public<_B >XVType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new XVType.Builder<_B>(_parentBuilder, this, true);
    }

    public XVType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static XVType.Builder<Void> builder() {
        return new XVType.Builder<Void>(null, null, false);
    }

    public static<_B >XVType.Builder<_B> copyOf(final XVType _other) {
        final XVType.Builder<_B> _newBuilder = new XVType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final XVType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree xPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("x"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(xPropertyTree!= null):((xPropertyTree == null)||(!xPropertyTree.isLeaf())))) {
            _other.x = this.x;
        }
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = this.value;
        }
    }

    public<_B >XVType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new XVType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public XVType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >XVType.Builder<_B> copyOf(final XVType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final XVType.Builder<_B> _newBuilder = new XVType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static XVType.Builder<Void> copyExcept(final XVType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static XVType.Builder<Void> copyOnly(final XVType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final XVType _storedValue;
        private Double x;
        private Float value;

        public Builder(final _B _parentBuilder, final XVType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.x = _other.x;
                    this.value = _other.value;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final XVType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree xPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("x"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(xPropertyTree!= null):((xPropertyTree == null)||(!xPropertyTree.isLeaf())))) {
                        this.x = _other.x;
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

        protected<_P extends XVType >_P init(final _P _product) {
            _product.x = this.x;
            _product.value = this.value;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "x" (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param x
         *     Neuer Wert der Eigenschaft "x".
         */
        public XVType.Builder<_B> withX(final Double x) {
            this.x = x;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public XVType.Builder<_B> withValue(final Float value) {
            this.value = value;
            return this;
        }

        @Override
        public XVType build() {
            if (_storedValue == null) {
                return this.init(new XVType());
            } else {
                return ((XVType) _storedValue);
            }
        }

        public XVType.Builder<_B> copyOf(final XVType _other) {
            _other.copyTo(this);
            return this;
        }

        public XVType.Builder<_B> copyOf(final XVType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends XVType.Selector<XVType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static XVType.Select _root() {
            return new XVType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, XVType.Selector<TRoot, TParent>> x = null;
        private com.kscs.util.jaxb.Selector<TRoot, XVType.Selector<TRoot, TParent>> value = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.x!= null) {
                products.put("x", this.x.init());
            }
            if (this.value!= null) {
                products.put("value", this.value.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, XVType.Selector<TRoot, TParent>> x() {
            return ((this.x == null)?this.x = new com.kscs.util.jaxb.Selector<TRoot, XVType.Selector<TRoot, TParent>>(this._root, this, "x"):this.x);
        }

        public com.kscs.util.jaxb.Selector<TRoot, XVType.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new com.kscs.util.jaxb.Selector<TRoot, XVType.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

    }

}
