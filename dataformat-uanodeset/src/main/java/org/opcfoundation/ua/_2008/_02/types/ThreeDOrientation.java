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
 * <p>Java-Klasse für ThreeDOrientation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThreeDOrientation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}Orientation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="B" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="C" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreeDOrientation", propOrder = {
    "a",
    "b",
    "c"
})
public class ThreeDOrientation
    extends Orientation
{

    @XmlElement(name = "A")
    protected Double a;
    @XmlElement(name = "B")
    protected Double b;
    @XmlElement(name = "C")
    protected Double c;

    /**
     * Ruft den Wert der a-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getA() {
        return a;
    }

    /**
     * Legt den Wert der a-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setA(Double value) {
        this.a = value;
    }

    /**
     * Ruft den Wert der b-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getB() {
        return b;
    }

    /**
     * Legt den Wert der b-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setB(Double value) {
        this.b = value;
    }

    /**
     * Ruft den Wert der c-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getC() {
        return c;
    }

    /**
     * Legt den Wert der c-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setC(Double value) {
        this.c = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ThreeDOrientation.Builder<_B> _other) {
        super.copyTo(_other);
        _other.a = this.a;
        _other.b = this.b;
        _other.c = this.c;
    }

    @Override
    public<_B >ThreeDOrientation.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ThreeDOrientation.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ThreeDOrientation.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ThreeDOrientation.Builder<Void> builder() {
        return new ThreeDOrientation.Builder<Void>(null, null, false);
    }

    public static<_B >ThreeDOrientation.Builder<_B> copyOf(final Orientation _other) {
        final ThreeDOrientation.Builder<_B> _newBuilder = new ThreeDOrientation.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ThreeDOrientation.Builder<_B> copyOf(final ThreeDOrientation _other) {
        final ThreeDOrientation.Builder<_B> _newBuilder = new ThreeDOrientation.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ThreeDOrientation.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree aPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("a"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aPropertyTree!= null):((aPropertyTree == null)||(!aPropertyTree.isLeaf())))) {
            _other.a = this.a;
        }
        final PropertyTree bPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("b"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(bPropertyTree!= null):((bPropertyTree == null)||(!bPropertyTree.isLeaf())))) {
            _other.b = this.b;
        }
        final PropertyTree cPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("c"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cPropertyTree!= null):((cPropertyTree == null)||(!cPropertyTree.isLeaf())))) {
            _other.c = this.c;
        }
    }

    @Override
    public<_B >ThreeDOrientation.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ThreeDOrientation.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ThreeDOrientation.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ThreeDOrientation.Builder<_B> copyOf(final Orientation _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ThreeDOrientation.Builder<_B> _newBuilder = new ThreeDOrientation.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ThreeDOrientation.Builder<_B> copyOf(final ThreeDOrientation _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ThreeDOrientation.Builder<_B> _newBuilder = new ThreeDOrientation.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ThreeDOrientation.Builder<Void> copyExcept(final Orientation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ThreeDOrientation.Builder<Void> copyExcept(final ThreeDOrientation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ThreeDOrientation.Builder<Void> copyOnly(final Orientation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ThreeDOrientation.Builder<Void> copyOnly(final ThreeDOrientation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends Orientation.Builder<_B>
        implements Buildable
    {

        private Double a;
        private Double b;
        private Double c;

        public Builder(final _B _parentBuilder, final ThreeDOrientation _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.a = _other.a;
                this.b = _other.b;
                this.c = _other.c;
            }
        }

        public Builder(final _B _parentBuilder, final ThreeDOrientation _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree aPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("a"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aPropertyTree!= null):((aPropertyTree == null)||(!aPropertyTree.isLeaf())))) {
                    this.a = _other.a;
                }
                final PropertyTree bPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("b"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(bPropertyTree!= null):((bPropertyTree == null)||(!bPropertyTree.isLeaf())))) {
                    this.b = _other.b;
                }
                final PropertyTree cPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("c"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cPropertyTree!= null):((cPropertyTree == null)||(!cPropertyTree.isLeaf())))) {
                    this.c = _other.c;
                }
            }
        }

        protected<_P extends ThreeDOrientation >_P init(final _P _product) {
            _product.a = this.a;
            _product.b = this.b;
            _product.c = this.c;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "a" (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param a
         *     Neuer Wert der Eigenschaft "a".
         */
        public ThreeDOrientation.Builder<_B> withA(final Double a) {
            this.a = a;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "b" (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param b
         *     Neuer Wert der Eigenschaft "b".
         */
        public ThreeDOrientation.Builder<_B> withB(final Double b) {
            this.b = b;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "c" (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param c
         *     Neuer Wert der Eigenschaft "c".
         */
        public ThreeDOrientation.Builder<_B> withC(final Double c) {
            this.c = c;
            return this;
        }

        @Override
        public ThreeDOrientation build() {
            if (_storedValue == null) {
                return this.init(new ThreeDOrientation());
            } else {
                return ((ThreeDOrientation) _storedValue);
            }
        }

        public ThreeDOrientation.Builder<_B> copyOf(final ThreeDOrientation _other) {
            _other.copyTo(this);
            return this;
        }

        public ThreeDOrientation.Builder<_B> copyOf(final ThreeDOrientation.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ThreeDOrientation.Selector<ThreeDOrientation.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ThreeDOrientation.Select _root() {
            return new ThreeDOrientation.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends Orientation.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ThreeDOrientation.Selector<TRoot, TParent>> a = null;
        private com.kscs.util.jaxb.Selector<TRoot, ThreeDOrientation.Selector<TRoot, TParent>> b = null;
        private com.kscs.util.jaxb.Selector<TRoot, ThreeDOrientation.Selector<TRoot, TParent>> c = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.a!= null) {
                products.put("a", this.a.init());
            }
            if (this.b!= null) {
                products.put("b", this.b.init());
            }
            if (this.c!= null) {
                products.put("c", this.c.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ThreeDOrientation.Selector<TRoot, TParent>> a() {
            return ((this.a == null)?this.a = new com.kscs.util.jaxb.Selector<TRoot, ThreeDOrientation.Selector<TRoot, TParent>>(this._root, this, "a"):this.a);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ThreeDOrientation.Selector<TRoot, TParent>> b() {
            return ((this.b == null)?this.b = new com.kscs.util.jaxb.Selector<TRoot, ThreeDOrientation.Selector<TRoot, TParent>>(this._root, this, "b"):this.b);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ThreeDOrientation.Selector<TRoot, TParent>> c() {
            return ((this.c == null)?this.c = new com.kscs.util.jaxb.Selector<TRoot, ThreeDOrientation.Selector<TRoot, TParent>>(this._root, this, "c"):this.c);
        }

    }

}
