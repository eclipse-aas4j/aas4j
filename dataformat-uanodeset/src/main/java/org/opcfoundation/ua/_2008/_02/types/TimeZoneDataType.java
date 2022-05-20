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
 * <p>Java-Klasse für TimeZoneDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeZoneDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="DaylightSavingInOffset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneDataType", propOrder = {
    "offset",
    "daylightSavingInOffset"
})
public class TimeZoneDataType {

    @XmlElement(name = "Offset")
    protected Short offset;
    @XmlElement(name = "DaylightSavingInOffset")
    protected Boolean daylightSavingInOffset;

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOffset(Short value) {
        this.offset = value;
    }

    /**
     * Ruft den Wert der daylightSavingInOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDaylightSavingInOffset() {
        return daylightSavingInOffset;
    }

    /**
     * Legt den Wert der daylightSavingInOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDaylightSavingInOffset(Boolean value) {
        this.daylightSavingInOffset = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final TimeZoneDataType.Builder<_B> _other) {
        _other.offset = this.offset;
        _other.daylightSavingInOffset = this.daylightSavingInOffset;
    }

    public<_B >TimeZoneDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new TimeZoneDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public TimeZoneDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static TimeZoneDataType.Builder<Void> builder() {
        return new TimeZoneDataType.Builder<Void>(null, null, false);
    }

    public static<_B >TimeZoneDataType.Builder<_B> copyOf(final TimeZoneDataType _other) {
        final TimeZoneDataType.Builder<_B> _newBuilder = new TimeZoneDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final TimeZoneDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree offsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsetPropertyTree!= null):((offsetPropertyTree == null)||(!offsetPropertyTree.isLeaf())))) {
            _other.offset = this.offset;
        }
        final PropertyTree daylightSavingInOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("daylightSavingInOffset"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(daylightSavingInOffsetPropertyTree!= null):((daylightSavingInOffsetPropertyTree == null)||(!daylightSavingInOffsetPropertyTree.isLeaf())))) {
            _other.daylightSavingInOffset = this.daylightSavingInOffset;
        }
    }

    public<_B >TimeZoneDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new TimeZoneDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public TimeZoneDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >TimeZoneDataType.Builder<_B> copyOf(final TimeZoneDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TimeZoneDataType.Builder<_B> _newBuilder = new TimeZoneDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static TimeZoneDataType.Builder<Void> copyExcept(final TimeZoneDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static TimeZoneDataType.Builder<Void> copyOnly(final TimeZoneDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final TimeZoneDataType _storedValue;
        private Short offset;
        private Boolean daylightSavingInOffset;

        public Builder(final _B _parentBuilder, final TimeZoneDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.offset = _other.offset;
                    this.daylightSavingInOffset = _other.daylightSavingInOffset;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final TimeZoneDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree offsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("offset"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(offsetPropertyTree!= null):((offsetPropertyTree == null)||(!offsetPropertyTree.isLeaf())))) {
                        this.offset = _other.offset;
                    }
                    final PropertyTree daylightSavingInOffsetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("daylightSavingInOffset"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(daylightSavingInOffsetPropertyTree!= null):((daylightSavingInOffsetPropertyTree == null)||(!daylightSavingInOffsetPropertyTree.isLeaf())))) {
                        this.daylightSavingInOffset = _other.daylightSavingInOffset;
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

        protected<_P extends TimeZoneDataType >_P init(final _P _product) {
            _product.offset = this.offset;
            _product.daylightSavingInOffset = this.daylightSavingInOffset;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "offset" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param offset
         *     Neuer Wert der Eigenschaft "offset".
         */
        public TimeZoneDataType.Builder<_B> withOffset(final Short offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "daylightSavingInOffset" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param daylightSavingInOffset
         *     Neuer Wert der Eigenschaft "daylightSavingInOffset".
         */
        public TimeZoneDataType.Builder<_B> withDaylightSavingInOffset(final Boolean daylightSavingInOffset) {
            this.daylightSavingInOffset = daylightSavingInOffset;
            return this;
        }

        @Override
        public TimeZoneDataType build() {
            if (_storedValue == null) {
                return this.init(new TimeZoneDataType());
            } else {
                return ((TimeZoneDataType) _storedValue);
            }
        }

        public TimeZoneDataType.Builder<_B> copyOf(final TimeZoneDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public TimeZoneDataType.Builder<_B> copyOf(final TimeZoneDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends TimeZoneDataType.Selector<TimeZoneDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static TimeZoneDataType.Select _root() {
            return new TimeZoneDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, TimeZoneDataType.Selector<TRoot, TParent>> offset = null;
        private com.kscs.util.jaxb.Selector<TRoot, TimeZoneDataType.Selector<TRoot, TParent>> daylightSavingInOffset = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.offset!= null) {
                products.put("offset", this.offset.init());
            }
            if (this.daylightSavingInOffset!= null) {
                products.put("daylightSavingInOffset", this.daylightSavingInOffset.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, TimeZoneDataType.Selector<TRoot, TParent>> offset() {
            return ((this.offset == null)?this.offset = new com.kscs.util.jaxb.Selector<TRoot, TimeZoneDataType.Selector<TRoot, TParent>>(this._root, this, "offset"):this.offset);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TimeZoneDataType.Selector<TRoot, TParent>> daylightSavingInOffset() {
            return ((this.daylightSavingInOffset == null)?this.daylightSavingInOffset = new com.kscs.util.jaxb.Selector<TRoot, TimeZoneDataType.Selector<TRoot, TParent>>(this._root, this, "daylightSavingInOffset"):this.daylightSavingInOffset);
        }

    }

}
