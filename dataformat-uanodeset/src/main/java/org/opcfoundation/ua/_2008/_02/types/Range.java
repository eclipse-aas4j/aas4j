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
 * <p>Java-Klasse für Range complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Range"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Range", propOrder = {
    "low",
    "high"
})
public class Range {

    @XmlElement(name = "Low")
    protected Double low;
    @XmlElement(name = "High")
    protected Double high;

    /**
     * Ruft den Wert der low-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLow() {
        return low;
    }

    /**
     * Legt den Wert der low-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLow(Double value) {
        this.low = value;
    }

    /**
     * Ruft den Wert der high-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHigh() {
        return high;
    }

    /**
     * Legt den Wert der high-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHigh(Double value) {
        this.high = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Range.Builder<_B> _other) {
        _other.low = this.low;
        _other.high = this.high;
    }

    public<_B >Range.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new Range.Builder<_B>(_parentBuilder, this, true);
    }

    public Range.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static Range.Builder<Void> builder() {
        return new Range.Builder<Void>(null, null, false);
    }

    public static<_B >Range.Builder<_B> copyOf(final Range _other) {
        final Range.Builder<_B> _newBuilder = new Range.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final Range.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree lowPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("low"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lowPropertyTree!= null):((lowPropertyTree == null)||(!lowPropertyTree.isLeaf())))) {
            _other.low = this.low;
        }
        final PropertyTree highPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("high"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(highPropertyTree!= null):((highPropertyTree == null)||(!highPropertyTree.isLeaf())))) {
            _other.high = this.high;
        }
    }

    public<_B >Range.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new Range.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public Range.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >Range.Builder<_B> copyOf(final Range _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final Range.Builder<_B> _newBuilder = new Range.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static Range.Builder<Void> copyExcept(final Range _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static Range.Builder<Void> copyOnly(final Range _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final Range _storedValue;
        private Double low;
        private Double high;

        public Builder(final _B _parentBuilder, final Range _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.low = _other.low;
                    this.high = _other.high;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final Range _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree lowPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("low"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lowPropertyTree!= null):((lowPropertyTree == null)||(!lowPropertyTree.isLeaf())))) {
                        this.low = _other.low;
                    }
                    final PropertyTree highPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("high"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(highPropertyTree!= null):((highPropertyTree == null)||(!highPropertyTree.isLeaf())))) {
                        this.high = _other.high;
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

        protected<_P extends Range >_P init(final _P _product) {
            _product.low = this.low;
            _product.high = this.high;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "low" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param low
         *     Neuer Wert der Eigenschaft "low".
         */
        public Range.Builder<_B> withLow(final Double low) {
            this.low = low;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "high" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param high
         *     Neuer Wert der Eigenschaft "high".
         */
        public Range.Builder<_B> withHigh(final Double high) {
            this.high = high;
            return this;
        }

        @Override
        public Range build() {
            if (_storedValue == null) {
                return this.init(new Range());
            } else {
                return ((Range) _storedValue);
            }
        }

        public Range.Builder<_B> copyOf(final Range _other) {
            _other.copyTo(this);
            return this;
        }

        public Range.Builder<_B> copyOf(final Range.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends Range.Selector<Range.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static Range.Select _root() {
            return new Range.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, Range.Selector<TRoot, TParent>> low = null;
        private com.kscs.util.jaxb.Selector<TRoot, Range.Selector<TRoot, TParent>> high = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.low!= null) {
                products.put("low", this.low.init());
            }
            if (this.high!= null) {
                products.put("high", this.high.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, Range.Selector<TRoot, TParent>> low() {
            return ((this.low == null)?this.low = new com.kscs.util.jaxb.Selector<TRoot, Range.Selector<TRoot, TParent>>(this._root, this, "low"):this.low);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Range.Selector<TRoot, TParent>> high() {
            return ((this.high == null)?this.high = new com.kscs.util.jaxb.Selector<TRoot, Range.Selector<TRoot, TParent>>(this._root, this, "high"):this.high);
        }

    }

}
