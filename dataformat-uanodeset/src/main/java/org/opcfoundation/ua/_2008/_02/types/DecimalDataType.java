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
 * <p>Java-Klasse für DecimalDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DecimalDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Scale" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecimalDataType", propOrder = {
    "scale",
    "value"
})
public class DecimalDataType {

    @XmlElement(name = "Scale")
    protected Short scale;
    @XmlElementRef(name = "Value", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> value;

    /**
     * Ruft den Wert der scale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getScale() {
        return scale;
    }

    /**
     * Legt den Wert der scale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setScale(Short value) {
        this.scale = value;
    }

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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DecimalDataType.Builder<_B> _other) {
        _other.scale = this.scale;
        _other.value = this.value;
    }

    public<_B >DecimalDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DecimalDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public DecimalDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DecimalDataType.Builder<Void> builder() {
        return new DecimalDataType.Builder<Void>(null, null, false);
    }

    public static<_B >DecimalDataType.Builder<_B> copyOf(final DecimalDataType _other) {
        final DecimalDataType.Builder<_B> _newBuilder = new DecimalDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DecimalDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree scalePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("scale"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(scalePropertyTree!= null):((scalePropertyTree == null)||(!scalePropertyTree.isLeaf())))) {
            _other.scale = this.scale;
        }
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = this.value;
        }
    }

    public<_B >DecimalDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DecimalDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DecimalDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DecimalDataType.Builder<_B> copyOf(final DecimalDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DecimalDataType.Builder<_B> _newBuilder = new DecimalDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DecimalDataType.Builder<Void> copyExcept(final DecimalDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DecimalDataType.Builder<Void> copyOnly(final DecimalDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DecimalDataType _storedValue;
        private Short scale;
        private JAXBElement<byte[]> value;

        public Builder(final _B _parentBuilder, final DecimalDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.scale = _other.scale;
                    this.value = _other.value;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DecimalDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree scalePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("scale"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(scalePropertyTree!= null):((scalePropertyTree == null)||(!scalePropertyTree.isLeaf())))) {
                        this.scale = _other.scale;
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

        protected<_P extends DecimalDataType >_P init(final _P _product) {
            _product.scale = this.scale;
            _product.value = this.value;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "scale" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param scale
         *     Neuer Wert der Eigenschaft "scale".
         */
        public DecimalDataType.Builder<_B> withScale(final Short scale) {
            this.scale = scale;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public DecimalDataType.Builder<_B> withValue(final JAXBElement<byte[]> value) {
            this.value = value;
            return this;
        }

        @Override
        public DecimalDataType build() {
            if (_storedValue == null) {
                return this.init(new DecimalDataType());
            } else {
                return ((DecimalDataType) _storedValue);
            }
        }

        public DecimalDataType.Builder<_B> copyOf(final DecimalDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public DecimalDataType.Builder<_B> copyOf(final DecimalDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DecimalDataType.Selector<DecimalDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DecimalDataType.Select _root() {
            return new DecimalDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DecimalDataType.Selector<TRoot, TParent>> scale = null;
        private com.kscs.util.jaxb.Selector<TRoot, DecimalDataType.Selector<TRoot, TParent>> value = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.scale!= null) {
                products.put("scale", this.scale.init());
            }
            if (this.value!= null) {
                products.put("value", this.value.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DecimalDataType.Selector<TRoot, TParent>> scale() {
            return ((this.scale == null)?this.scale = new com.kscs.util.jaxb.Selector<TRoot, DecimalDataType.Selector<TRoot, TParent>>(this._root, this, "scale"):this.scale);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DecimalDataType.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new com.kscs.util.jaxb.Selector<TRoot, DecimalDataType.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

    }

}
