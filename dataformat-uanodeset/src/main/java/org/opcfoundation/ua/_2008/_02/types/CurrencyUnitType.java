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
 * <p>Java-Klasse für CurrencyUnitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CurrencyUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumericCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Exponent" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="AlphabeticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyUnitType", propOrder = {
    "numericCode",
    "exponent",
    "alphabeticCode",
    "currency"
})
public class CurrencyUnitType {

    @XmlElement(name = "NumericCode")
    protected Short numericCode;
    @XmlElement(name = "Exponent")
    protected Byte exponent;
    @XmlElementRef(name = "AlphabeticCode", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alphabeticCode;
    @XmlElementRef(name = "Currency", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> currency;

    /**
     * Ruft den Wert der numericCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumericCode() {
        return numericCode;
    }

    /**
     * Legt den Wert der numericCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumericCode(Short value) {
        this.numericCode = value;
    }

    /**
     * Ruft den Wert der exponent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getExponent() {
        return exponent;
    }

    /**
     * Legt den Wert der exponent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setExponent(Byte value) {
        this.exponent = value;
    }

    /**
     * Ruft den Wert der alphabeticCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlphabeticCode() {
        return alphabeticCode;
    }

    /**
     * Legt den Wert der alphabeticCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlphabeticCode(JAXBElement<String> value) {
        this.alphabeticCode = value;
    }

    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public JAXBElement<LocalizedText> getCurrency() {
        return currency;
    }

    /**
     * Legt den Wert der currency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<LocalizedText> value) {
        this.currency = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CurrencyUnitType.Builder<_B> _other) {
        _other.numericCode = this.numericCode;
        _other.exponent = this.exponent;
        _other.alphabeticCode = this.alphabeticCode;
        _other.currency = this.currency;
    }

    public<_B >CurrencyUnitType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CurrencyUnitType.Builder<_B>(_parentBuilder, this, true);
    }

    public CurrencyUnitType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CurrencyUnitType.Builder<Void> builder() {
        return new CurrencyUnitType.Builder<Void>(null, null, false);
    }

    public static<_B >CurrencyUnitType.Builder<_B> copyOf(final CurrencyUnitType _other) {
        final CurrencyUnitType.Builder<_B> _newBuilder = new CurrencyUnitType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CurrencyUnitType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree numericCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numericCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numericCodePropertyTree!= null):((numericCodePropertyTree == null)||(!numericCodePropertyTree.isLeaf())))) {
            _other.numericCode = this.numericCode;
        }
        final PropertyTree exponentPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("exponent"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(exponentPropertyTree!= null):((exponentPropertyTree == null)||(!exponentPropertyTree.isLeaf())))) {
            _other.exponent = this.exponent;
        }
        final PropertyTree alphabeticCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("alphabeticCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(alphabeticCodePropertyTree!= null):((alphabeticCodePropertyTree == null)||(!alphabeticCodePropertyTree.isLeaf())))) {
            _other.alphabeticCode = this.alphabeticCode;
        }
        final PropertyTree currencyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currency"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currencyPropertyTree!= null):((currencyPropertyTree == null)||(!currencyPropertyTree.isLeaf())))) {
            _other.currency = this.currency;
        }
    }

    public<_B >CurrencyUnitType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CurrencyUnitType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CurrencyUnitType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CurrencyUnitType.Builder<_B> copyOf(final CurrencyUnitType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CurrencyUnitType.Builder<_B> _newBuilder = new CurrencyUnitType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CurrencyUnitType.Builder<Void> copyExcept(final CurrencyUnitType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CurrencyUnitType.Builder<Void> copyOnly(final CurrencyUnitType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CurrencyUnitType _storedValue;
        private Short numericCode;
        private Byte exponent;
        private JAXBElement<String> alphabeticCode;
        private JAXBElement<LocalizedText> currency;

        public Builder(final _B _parentBuilder, final CurrencyUnitType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.numericCode = _other.numericCode;
                    this.exponent = _other.exponent;
                    this.alphabeticCode = _other.alphabeticCode;
                    this.currency = _other.currency;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CurrencyUnitType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree numericCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numericCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numericCodePropertyTree!= null):((numericCodePropertyTree == null)||(!numericCodePropertyTree.isLeaf())))) {
                        this.numericCode = _other.numericCode;
                    }
                    final PropertyTree exponentPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("exponent"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(exponentPropertyTree!= null):((exponentPropertyTree == null)||(!exponentPropertyTree.isLeaf())))) {
                        this.exponent = _other.exponent;
                    }
                    final PropertyTree alphabeticCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("alphabeticCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(alphabeticCodePropertyTree!= null):((alphabeticCodePropertyTree == null)||(!alphabeticCodePropertyTree.isLeaf())))) {
                        this.alphabeticCode = _other.alphabeticCode;
                    }
                    final PropertyTree currencyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currency"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currencyPropertyTree!= null):((currencyPropertyTree == null)||(!currencyPropertyTree.isLeaf())))) {
                        this.currency = _other.currency;
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

        protected<_P extends CurrencyUnitType >_P init(final _P _product) {
            _product.numericCode = this.numericCode;
            _product.exponent = this.exponent;
            _product.alphabeticCode = this.alphabeticCode;
            _product.currency = this.currency;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "numericCode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param numericCode
         *     Neuer Wert der Eigenschaft "numericCode".
         */
        public CurrencyUnitType.Builder<_B> withNumericCode(final Short numericCode) {
            this.numericCode = numericCode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "exponent" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param exponent
         *     Neuer Wert der Eigenschaft "exponent".
         */
        public CurrencyUnitType.Builder<_B> withExponent(final Byte exponent) {
            this.exponent = exponent;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "alphabeticCode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param alphabeticCode
         *     Neuer Wert der Eigenschaft "alphabeticCode".
         */
        public CurrencyUnitType.Builder<_B> withAlphabeticCode(final JAXBElement<String> alphabeticCode) {
            this.alphabeticCode = alphabeticCode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currency" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param currency
         *     Neuer Wert der Eigenschaft "currency".
         */
        public CurrencyUnitType.Builder<_B> withCurrency(final JAXBElement<LocalizedText> currency) {
            this.currency = currency;
            return this;
        }

        @Override
        public CurrencyUnitType build() {
            if (_storedValue == null) {
                return this.init(new CurrencyUnitType());
            } else {
                return ((CurrencyUnitType) _storedValue);
            }
        }

        public CurrencyUnitType.Builder<_B> copyOf(final CurrencyUnitType _other) {
            _other.copyTo(this);
            return this;
        }

        public CurrencyUnitType.Builder<_B> copyOf(final CurrencyUnitType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CurrencyUnitType.Selector<CurrencyUnitType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CurrencyUnitType.Select _root() {
            return new CurrencyUnitType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>> numericCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>> exponent = null;
        private com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>> alphabeticCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>> currency = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.numericCode!= null) {
                products.put("numericCode", this.numericCode.init());
            }
            if (this.exponent!= null) {
                products.put("exponent", this.exponent.init());
            }
            if (this.alphabeticCode!= null) {
                products.put("alphabeticCode", this.alphabeticCode.init());
            }
            if (this.currency!= null) {
                products.put("currency", this.currency.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>> numericCode() {
            return ((this.numericCode == null)?this.numericCode = new com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>>(this._root, this, "numericCode"):this.numericCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>> exponent() {
            return ((this.exponent == null)?this.exponent = new com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>>(this._root, this, "exponent"):this.exponent);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>> alphabeticCode() {
            return ((this.alphabeticCode == null)?this.alphabeticCode = new com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>>(this._root, this, "alphabeticCode"):this.alphabeticCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>> currency() {
            return ((this.currency == null)?this.currency = new com.kscs.util.jaxb.Selector<TRoot, CurrencyUnitType.Selector<TRoot, TParent>>(this._root, this, "currency"):this.currency);
        }

    }

}
