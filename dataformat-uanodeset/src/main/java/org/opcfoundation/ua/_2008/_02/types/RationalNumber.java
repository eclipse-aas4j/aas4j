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
 * <p>Java-Klasse für RationalNumber complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RationalNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Numerator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Denominator" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RationalNumber", propOrder = {
    "numerator",
    "denominator"
})
public class RationalNumber {

    @XmlElement(name = "Numerator")
    protected Integer numerator;
    @XmlElement(name = "Denominator")
    @XmlSchemaType(name = "unsignedInt")
    protected Long denominator;

    /**
     * Ruft den Wert der numerator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumerator() {
        return numerator;
    }

    /**
     * Legt den Wert der numerator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumerator(Integer value) {
        this.numerator = value;
    }

    /**
     * Ruft den Wert der denominator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDenominator() {
        return denominator;
    }

    /**
     * Legt den Wert der denominator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDenominator(Long value) {
        this.denominator = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RationalNumber.Builder<_B> _other) {
        _other.numerator = this.numerator;
        _other.denominator = this.denominator;
    }

    public<_B >RationalNumber.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RationalNumber.Builder<_B>(_parentBuilder, this, true);
    }

    public RationalNumber.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RationalNumber.Builder<Void> builder() {
        return new RationalNumber.Builder<Void>(null, null, false);
    }

    public static<_B >RationalNumber.Builder<_B> copyOf(final RationalNumber _other) {
        final RationalNumber.Builder<_B> _newBuilder = new RationalNumber.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RationalNumber.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree numeratorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numerator"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numeratorPropertyTree!= null):((numeratorPropertyTree == null)||(!numeratorPropertyTree.isLeaf())))) {
            _other.numerator = this.numerator;
        }
        final PropertyTree denominatorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("denominator"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(denominatorPropertyTree!= null):((denominatorPropertyTree == null)||(!denominatorPropertyTree.isLeaf())))) {
            _other.denominator = this.denominator;
        }
    }

    public<_B >RationalNumber.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RationalNumber.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RationalNumber.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RationalNumber.Builder<_B> copyOf(final RationalNumber _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RationalNumber.Builder<_B> _newBuilder = new RationalNumber.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RationalNumber.Builder<Void> copyExcept(final RationalNumber _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RationalNumber.Builder<Void> copyOnly(final RationalNumber _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RationalNumber _storedValue;
        private Integer numerator;
        private Long denominator;

        public Builder(final _B _parentBuilder, final RationalNumber _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.numerator = _other.numerator;
                    this.denominator = _other.denominator;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RationalNumber _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree numeratorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numerator"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numeratorPropertyTree!= null):((numeratorPropertyTree == null)||(!numeratorPropertyTree.isLeaf())))) {
                        this.numerator = _other.numerator;
                    }
                    final PropertyTree denominatorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("denominator"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(denominatorPropertyTree!= null):((denominatorPropertyTree == null)||(!denominatorPropertyTree.isLeaf())))) {
                        this.denominator = _other.denominator;
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

        protected<_P extends RationalNumber >_P init(final _P _product) {
            _product.numerator = this.numerator;
            _product.denominator = this.denominator;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "numerator" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param numerator
         *     Neuer Wert der Eigenschaft "numerator".
         */
        public RationalNumber.Builder<_B> withNumerator(final Integer numerator) {
            this.numerator = numerator;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "denominator" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param denominator
         *     Neuer Wert der Eigenschaft "denominator".
         */
        public RationalNumber.Builder<_B> withDenominator(final Long denominator) {
            this.denominator = denominator;
            return this;
        }

        @Override
        public RationalNumber build() {
            if (_storedValue == null) {
                return this.init(new RationalNumber());
            } else {
                return ((RationalNumber) _storedValue);
            }
        }

        public RationalNumber.Builder<_B> copyOf(final RationalNumber _other) {
            _other.copyTo(this);
            return this;
        }

        public RationalNumber.Builder<_B> copyOf(final RationalNumber.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RationalNumber.Selector<RationalNumber.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RationalNumber.Select _root() {
            return new RationalNumber.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RationalNumber.Selector<TRoot, TParent>> numerator = null;
        private com.kscs.util.jaxb.Selector<TRoot, RationalNumber.Selector<TRoot, TParent>> denominator = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.numerator!= null) {
                products.put("numerator", this.numerator.init());
            }
            if (this.denominator!= null) {
                products.put("denominator", this.denominator.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RationalNumber.Selector<TRoot, TParent>> numerator() {
            return ((this.numerator == null)?this.numerator = new com.kscs.util.jaxb.Selector<TRoot, RationalNumber.Selector<TRoot, TParent>>(this._root, this, "numerator"):this.numerator);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RationalNumber.Selector<TRoot, TParent>> denominator() {
            return ((this.denominator == null)?this.denominator = new com.kscs.util.jaxb.Selector<TRoot, RationalNumber.Selector<TRoot, TParent>>(this._root, this, "denominator"):this.denominator);
        }

    }

}
