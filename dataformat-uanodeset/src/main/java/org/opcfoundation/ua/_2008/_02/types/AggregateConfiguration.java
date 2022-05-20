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
 * <p>Java-Klasse für AggregateConfiguration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AggregateConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UseServerCapabilitiesDefaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TreatUncertainAsBad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PercentDataBad" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="PercentDataGood" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="UseSlopedExtrapolation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateConfiguration", propOrder = {
    "useServerCapabilitiesDefaults",
    "treatUncertainAsBad",
    "percentDataBad",
    "percentDataGood",
    "useSlopedExtrapolation"
})
public class AggregateConfiguration {

    @XmlElement(name = "UseServerCapabilitiesDefaults")
    protected Boolean useServerCapabilitiesDefaults;
    @XmlElement(name = "TreatUncertainAsBad")
    protected Boolean treatUncertainAsBad;
    @XmlElement(name = "PercentDataBad")
    @XmlSchemaType(name = "unsignedByte")
    protected Short percentDataBad;
    @XmlElement(name = "PercentDataGood")
    @XmlSchemaType(name = "unsignedByte")
    protected Short percentDataGood;
    @XmlElement(name = "UseSlopedExtrapolation")
    protected Boolean useSlopedExtrapolation;

    /**
     * Ruft den Wert der useServerCapabilitiesDefaults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseServerCapabilitiesDefaults() {
        return useServerCapabilitiesDefaults;
    }

    /**
     * Legt den Wert der useServerCapabilitiesDefaults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseServerCapabilitiesDefaults(Boolean value) {
        this.useServerCapabilitiesDefaults = value;
    }

    /**
     * Ruft den Wert der treatUncertainAsBad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTreatUncertainAsBad() {
        return treatUncertainAsBad;
    }

    /**
     * Legt den Wert der treatUncertainAsBad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTreatUncertainAsBad(Boolean value) {
        this.treatUncertainAsBad = value;
    }

    /**
     * Ruft den Wert der percentDataBad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPercentDataBad() {
        return percentDataBad;
    }

    /**
     * Legt den Wert der percentDataBad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPercentDataBad(Short value) {
        this.percentDataBad = value;
    }

    /**
     * Ruft den Wert der percentDataGood-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPercentDataGood() {
        return percentDataGood;
    }

    /**
     * Legt den Wert der percentDataGood-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPercentDataGood(Short value) {
        this.percentDataGood = value;
    }

    /**
     * Ruft den Wert der useSlopedExtrapolation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSlopedExtrapolation() {
        return useSlopedExtrapolation;
    }

    /**
     * Legt den Wert der useSlopedExtrapolation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSlopedExtrapolation(Boolean value) {
        this.useSlopedExtrapolation = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final AggregateConfiguration.Builder<_B> _other) {
        _other.useServerCapabilitiesDefaults = this.useServerCapabilitiesDefaults;
        _other.treatUncertainAsBad = this.treatUncertainAsBad;
        _other.percentDataBad = this.percentDataBad;
        _other.percentDataGood = this.percentDataGood;
        _other.useSlopedExtrapolation = this.useSlopedExtrapolation;
    }

    public<_B >AggregateConfiguration.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AggregateConfiguration.Builder<_B>(_parentBuilder, this, true);
    }

    public AggregateConfiguration.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AggregateConfiguration.Builder<Void> builder() {
        return new AggregateConfiguration.Builder<Void>(null, null, false);
    }

    public static<_B >AggregateConfiguration.Builder<_B> copyOf(final AggregateConfiguration _other) {
        final AggregateConfiguration.Builder<_B> _newBuilder = new AggregateConfiguration.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AggregateConfiguration.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree useServerCapabilitiesDefaultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("useServerCapabilitiesDefaults"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(useServerCapabilitiesDefaultsPropertyTree!= null):((useServerCapabilitiesDefaultsPropertyTree == null)||(!useServerCapabilitiesDefaultsPropertyTree.isLeaf())))) {
            _other.useServerCapabilitiesDefaults = this.useServerCapabilitiesDefaults;
        }
        final PropertyTree treatUncertainAsBadPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("treatUncertainAsBad"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(treatUncertainAsBadPropertyTree!= null):((treatUncertainAsBadPropertyTree == null)||(!treatUncertainAsBadPropertyTree.isLeaf())))) {
            _other.treatUncertainAsBad = this.treatUncertainAsBad;
        }
        final PropertyTree percentDataBadPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("percentDataBad"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(percentDataBadPropertyTree!= null):((percentDataBadPropertyTree == null)||(!percentDataBadPropertyTree.isLeaf())))) {
            _other.percentDataBad = this.percentDataBad;
        }
        final PropertyTree percentDataGoodPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("percentDataGood"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(percentDataGoodPropertyTree!= null):((percentDataGoodPropertyTree == null)||(!percentDataGoodPropertyTree.isLeaf())))) {
            _other.percentDataGood = this.percentDataGood;
        }
        final PropertyTree useSlopedExtrapolationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("useSlopedExtrapolation"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(useSlopedExtrapolationPropertyTree!= null):((useSlopedExtrapolationPropertyTree == null)||(!useSlopedExtrapolationPropertyTree.isLeaf())))) {
            _other.useSlopedExtrapolation = this.useSlopedExtrapolation;
        }
    }

    public<_B >AggregateConfiguration.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AggregateConfiguration.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public AggregateConfiguration.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AggregateConfiguration.Builder<_B> copyOf(final AggregateConfiguration _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AggregateConfiguration.Builder<_B> _newBuilder = new AggregateConfiguration.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AggregateConfiguration.Builder<Void> copyExcept(final AggregateConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AggregateConfiguration.Builder<Void> copyOnly(final AggregateConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final AggregateConfiguration _storedValue;
        private Boolean useServerCapabilitiesDefaults;
        private Boolean treatUncertainAsBad;
        private Short percentDataBad;
        private Short percentDataGood;
        private Boolean useSlopedExtrapolation;

        public Builder(final _B _parentBuilder, final AggregateConfiguration _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.useServerCapabilitiesDefaults = _other.useServerCapabilitiesDefaults;
                    this.treatUncertainAsBad = _other.treatUncertainAsBad;
                    this.percentDataBad = _other.percentDataBad;
                    this.percentDataGood = _other.percentDataGood;
                    this.useSlopedExtrapolation = _other.useSlopedExtrapolation;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final AggregateConfiguration _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree useServerCapabilitiesDefaultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("useServerCapabilitiesDefaults"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(useServerCapabilitiesDefaultsPropertyTree!= null):((useServerCapabilitiesDefaultsPropertyTree == null)||(!useServerCapabilitiesDefaultsPropertyTree.isLeaf())))) {
                        this.useServerCapabilitiesDefaults = _other.useServerCapabilitiesDefaults;
                    }
                    final PropertyTree treatUncertainAsBadPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("treatUncertainAsBad"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(treatUncertainAsBadPropertyTree!= null):((treatUncertainAsBadPropertyTree == null)||(!treatUncertainAsBadPropertyTree.isLeaf())))) {
                        this.treatUncertainAsBad = _other.treatUncertainAsBad;
                    }
                    final PropertyTree percentDataBadPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("percentDataBad"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(percentDataBadPropertyTree!= null):((percentDataBadPropertyTree == null)||(!percentDataBadPropertyTree.isLeaf())))) {
                        this.percentDataBad = _other.percentDataBad;
                    }
                    final PropertyTree percentDataGoodPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("percentDataGood"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(percentDataGoodPropertyTree!= null):((percentDataGoodPropertyTree == null)||(!percentDataGoodPropertyTree.isLeaf())))) {
                        this.percentDataGood = _other.percentDataGood;
                    }
                    final PropertyTree useSlopedExtrapolationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("useSlopedExtrapolation"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(useSlopedExtrapolationPropertyTree!= null):((useSlopedExtrapolationPropertyTree == null)||(!useSlopedExtrapolationPropertyTree.isLeaf())))) {
                        this.useSlopedExtrapolation = _other.useSlopedExtrapolation;
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

        protected<_P extends AggregateConfiguration >_P init(final _P _product) {
            _product.useServerCapabilitiesDefaults = this.useServerCapabilitiesDefaults;
            _product.treatUncertainAsBad = this.treatUncertainAsBad;
            _product.percentDataBad = this.percentDataBad;
            _product.percentDataGood = this.percentDataGood;
            _product.useSlopedExtrapolation = this.useSlopedExtrapolation;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "useServerCapabilitiesDefaults" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param useServerCapabilitiesDefaults
         *     Neuer Wert der Eigenschaft "useServerCapabilitiesDefaults".
         */
        public AggregateConfiguration.Builder<_B> withUseServerCapabilitiesDefaults(final Boolean useServerCapabilitiesDefaults) {
            this.useServerCapabilitiesDefaults = useServerCapabilitiesDefaults;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "treatUncertainAsBad" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param treatUncertainAsBad
         *     Neuer Wert der Eigenschaft "treatUncertainAsBad".
         */
        public AggregateConfiguration.Builder<_B> withTreatUncertainAsBad(final Boolean treatUncertainAsBad) {
            this.treatUncertainAsBad = treatUncertainAsBad;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "percentDataBad" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param percentDataBad
         *     Neuer Wert der Eigenschaft "percentDataBad".
         */
        public AggregateConfiguration.Builder<_B> withPercentDataBad(final Short percentDataBad) {
            this.percentDataBad = percentDataBad;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "percentDataGood" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param percentDataGood
         *     Neuer Wert der Eigenschaft "percentDataGood".
         */
        public AggregateConfiguration.Builder<_B> withPercentDataGood(final Short percentDataGood) {
            this.percentDataGood = percentDataGood;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "useSlopedExtrapolation" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param useSlopedExtrapolation
         *     Neuer Wert der Eigenschaft "useSlopedExtrapolation".
         */
        public AggregateConfiguration.Builder<_B> withUseSlopedExtrapolation(final Boolean useSlopedExtrapolation) {
            this.useSlopedExtrapolation = useSlopedExtrapolation;
            return this;
        }

        @Override
        public AggregateConfiguration build() {
            if (_storedValue == null) {
                return this.init(new AggregateConfiguration());
            } else {
                return ((AggregateConfiguration) _storedValue);
            }
        }

        public AggregateConfiguration.Builder<_B> copyOf(final AggregateConfiguration _other) {
            _other.copyTo(this);
            return this;
        }

        public AggregateConfiguration.Builder<_B> copyOf(final AggregateConfiguration.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AggregateConfiguration.Selector<AggregateConfiguration.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AggregateConfiguration.Select _root() {
            return new AggregateConfiguration.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> useServerCapabilitiesDefaults = null;
        private com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> treatUncertainAsBad = null;
        private com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> percentDataBad = null;
        private com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> percentDataGood = null;
        private com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> useSlopedExtrapolation = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.useServerCapabilitiesDefaults!= null) {
                products.put("useServerCapabilitiesDefaults", this.useServerCapabilitiesDefaults.init());
            }
            if (this.treatUncertainAsBad!= null) {
                products.put("treatUncertainAsBad", this.treatUncertainAsBad.init());
            }
            if (this.percentDataBad!= null) {
                products.put("percentDataBad", this.percentDataBad.init());
            }
            if (this.percentDataGood!= null) {
                products.put("percentDataGood", this.percentDataGood.init());
            }
            if (this.useSlopedExtrapolation!= null) {
                products.put("useSlopedExtrapolation", this.useSlopedExtrapolation.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> useServerCapabilitiesDefaults() {
            return ((this.useServerCapabilitiesDefaults == null)?this.useServerCapabilitiesDefaults = new com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>>(this._root, this, "useServerCapabilitiesDefaults"):this.useServerCapabilitiesDefaults);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> treatUncertainAsBad() {
            return ((this.treatUncertainAsBad == null)?this.treatUncertainAsBad = new com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>>(this._root, this, "treatUncertainAsBad"):this.treatUncertainAsBad);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> percentDataBad() {
            return ((this.percentDataBad == null)?this.percentDataBad = new com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>>(this._root, this, "percentDataBad"):this.percentDataBad);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> percentDataGood() {
            return ((this.percentDataGood == null)?this.percentDataGood = new com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>>(this._root, this, "percentDataGood"):this.percentDataGood);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>> useSlopedExtrapolation() {
            return ((this.useSlopedExtrapolation == null)?this.useSlopedExtrapolation = new com.kscs.util.jaxb.Selector<TRoot, AggregateConfiguration.Selector<TRoot, TParent>>(this._root, this, "useSlopedExtrapolation"):this.useSlopedExtrapolation);
        }

    }

}
