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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für OptionSet complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OptionSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ValidBits" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionSet", propOrder = {
    "value",
    "validBits"
})
public class OptionSet {

    @XmlElementRef(name = "Value", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> value;
    @XmlElementRef(name = "ValidBits", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> validBits;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setValue(JAXBElement<byte[]> value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der validBits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getValidBits() {
        return validBits;
    }

    /**
     * Legt den Wert der validBits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setValidBits(JAXBElement<byte[]> value) {
        this.validBits = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final OptionSet.Builder<_B> _other) {
        _other.value = this.value;
        _other.validBits = this.validBits;
    }

    public<_B >OptionSet.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new OptionSet.Builder<_B>(_parentBuilder, this, true);
    }

    public OptionSet.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static OptionSet.Builder<Void> builder() {
        return new OptionSet.Builder<Void>(null, null, false);
    }

    public static<_B >OptionSet.Builder<_B> copyOf(final OptionSet _other) {
        final OptionSet.Builder<_B> _newBuilder = new OptionSet.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final OptionSet.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = this.value;
        }
        final PropertyTree validBitsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("validBits"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(validBitsPropertyTree!= null):((validBitsPropertyTree == null)||(!validBitsPropertyTree.isLeaf())))) {
            _other.validBits = this.validBits;
        }
    }

    public<_B >OptionSet.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new OptionSet.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public OptionSet.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >OptionSet.Builder<_B> copyOf(final OptionSet _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final OptionSet.Builder<_B> _newBuilder = new OptionSet.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static OptionSet.Builder<Void> copyExcept(final OptionSet _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static OptionSet.Builder<Void> copyOnly(final OptionSet _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final OptionSet _storedValue;
        private JAXBElement<byte[]> value;
        private JAXBElement<byte[]> validBits;

        public Builder(final _B _parentBuilder, final OptionSet _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.value = _other.value;
                    this.validBits = _other.validBits;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final OptionSet _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
                        this.value = _other.value;
                    }
                    final PropertyTree validBitsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("validBits"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(validBitsPropertyTree!= null):((validBitsPropertyTree == null)||(!validBitsPropertyTree.isLeaf())))) {
                        this.validBits = _other.validBits;
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

        protected<_P extends OptionSet >_P init(final _P _product) {
            _product.value = this.value;
            _product.validBits = this.validBits;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public OptionSet.Builder<_B> withValue(final JAXBElement<byte[]> value) {
            this.value = value;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "validBits" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param validBits
         *     Neuer Wert der Eigenschaft "validBits".
         */
        public OptionSet.Builder<_B> withValidBits(final JAXBElement<byte[]> validBits) {
            this.validBits = validBits;
            return this;
        }

        @Override
        public OptionSet build() {
            if (_storedValue == null) {
                return this.init(new OptionSet());
            } else {
                return ((OptionSet) _storedValue);
            }
        }

        public OptionSet.Builder<_B> copyOf(final OptionSet _other) {
            _other.copyTo(this);
            return this;
        }

        public OptionSet.Builder<_B> copyOf(final OptionSet.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends OptionSet.Selector<OptionSet.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static OptionSet.Select _root() {
            return new OptionSet.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, OptionSet.Selector<TRoot, TParent>> value = null;
        private com.kscs.util.jaxb.Selector<TRoot, OptionSet.Selector<TRoot, TParent>> validBits = null;

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
            if (this.validBits!= null) {
                products.put("validBits", this.validBits.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, OptionSet.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new com.kscs.util.jaxb.Selector<TRoot, OptionSet.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

        public com.kscs.util.jaxb.Selector<TRoot, OptionSet.Selector<TRoot, TParent>> validBits() {
            return ((this.validBits == null)?this.validBits = new com.kscs.util.jaxb.Selector<TRoot, OptionSet.Selector<TRoot, TParent>>(this._root, this, "validBits"):this.validBits);
        }

    }

}
