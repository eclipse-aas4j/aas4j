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
 * <p>Java-Klasse für ThreeDVector complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThreeDVector"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}Vector"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Z" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreeDVector", propOrder = {
    "x",
    "y",
    "z"
})
public class ThreeDVector
    extends Vector
{

    @XmlElement(name = "X")
    protected Double x;
    @XmlElement(name = "Y")
    protected Double y;
    @XmlElement(name = "Z")
    protected Double z;

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
     * Ruft den Wert der y-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getY() {
        return y;
    }

    /**
     * Legt den Wert der y-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setY(Double value) {
        this.y = value;
    }

    /**
     * Ruft den Wert der z-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZ() {
        return z;
    }

    /**
     * Legt den Wert der z-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZ(Double value) {
        this.z = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ThreeDVector.Builder<_B> _other) {
        super.copyTo(_other);
        _other.x = this.x;
        _other.y = this.y;
        _other.z = this.z;
    }

    @Override
    public<_B >ThreeDVector.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ThreeDVector.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ThreeDVector.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ThreeDVector.Builder<Void> builder() {
        return new ThreeDVector.Builder<Void>(null, null, false);
    }

    public static<_B >ThreeDVector.Builder<_B> copyOf(final Vector _other) {
        final ThreeDVector.Builder<_B> _newBuilder = new ThreeDVector.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ThreeDVector.Builder<_B> copyOf(final ThreeDVector _other) {
        final ThreeDVector.Builder<_B> _newBuilder = new ThreeDVector.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ThreeDVector.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree xPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("x"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(xPropertyTree!= null):((xPropertyTree == null)||(!xPropertyTree.isLeaf())))) {
            _other.x = this.x;
        }
        final PropertyTree yPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("y"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(yPropertyTree!= null):((yPropertyTree == null)||(!yPropertyTree.isLeaf())))) {
            _other.y = this.y;
        }
        final PropertyTree zPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("z"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(zPropertyTree!= null):((zPropertyTree == null)||(!zPropertyTree.isLeaf())))) {
            _other.z = this.z;
        }
    }

    @Override
    public<_B >ThreeDVector.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ThreeDVector.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ThreeDVector.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ThreeDVector.Builder<_B> copyOf(final Vector _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ThreeDVector.Builder<_B> _newBuilder = new ThreeDVector.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ThreeDVector.Builder<_B> copyOf(final ThreeDVector _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ThreeDVector.Builder<_B> _newBuilder = new ThreeDVector.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ThreeDVector.Builder<Void> copyExcept(final Vector _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ThreeDVector.Builder<Void> copyExcept(final ThreeDVector _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ThreeDVector.Builder<Void> copyOnly(final Vector _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ThreeDVector.Builder<Void> copyOnly(final ThreeDVector _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends Vector.Builder<_B>
        implements Buildable
    {

        private Double x;
        private Double y;
        private Double z;

        public Builder(final _B _parentBuilder, final ThreeDVector _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.x = _other.x;
                this.y = _other.y;
                this.z = _other.z;
            }
        }

        public Builder(final _B _parentBuilder, final ThreeDVector _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree xPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("x"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(xPropertyTree!= null):((xPropertyTree == null)||(!xPropertyTree.isLeaf())))) {
                    this.x = _other.x;
                }
                final PropertyTree yPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("y"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(yPropertyTree!= null):((yPropertyTree == null)||(!yPropertyTree.isLeaf())))) {
                    this.y = _other.y;
                }
                final PropertyTree zPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("z"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(zPropertyTree!= null):((zPropertyTree == null)||(!zPropertyTree.isLeaf())))) {
                    this.z = _other.z;
                }
            }
        }

        protected<_P extends ThreeDVector >_P init(final _P _product) {
            _product.x = this.x;
            _product.y = this.y;
            _product.z = this.z;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "x" (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param x
         *     Neuer Wert der Eigenschaft "x".
         */
        public ThreeDVector.Builder<_B> withX(final Double x) {
            this.x = x;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "y" (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param y
         *     Neuer Wert der Eigenschaft "y".
         */
        public ThreeDVector.Builder<_B> withY(final Double y) {
            this.y = y;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "z" (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param z
         *     Neuer Wert der Eigenschaft "z".
         */
        public ThreeDVector.Builder<_B> withZ(final Double z) {
            this.z = z;
            return this;
        }

        @Override
        public ThreeDVector build() {
            if (_storedValue == null) {
                return this.init(new ThreeDVector());
            } else {
                return ((ThreeDVector) _storedValue);
            }
        }

        public ThreeDVector.Builder<_B> copyOf(final ThreeDVector _other) {
            _other.copyTo(this);
            return this;
        }

        public ThreeDVector.Builder<_B> copyOf(final ThreeDVector.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ThreeDVector.Selector<ThreeDVector.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ThreeDVector.Select _root() {
            return new ThreeDVector.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends Vector.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ThreeDVector.Selector<TRoot, TParent>> x = null;
        private com.kscs.util.jaxb.Selector<TRoot, ThreeDVector.Selector<TRoot, TParent>> y = null;
        private com.kscs.util.jaxb.Selector<TRoot, ThreeDVector.Selector<TRoot, TParent>> z = null;

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
            if (this.y!= null) {
                products.put("y", this.y.init());
            }
            if (this.z!= null) {
                products.put("z", this.z.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ThreeDVector.Selector<TRoot, TParent>> x() {
            return ((this.x == null)?this.x = new com.kscs.util.jaxb.Selector<TRoot, ThreeDVector.Selector<TRoot, TParent>>(this._root, this, "x"):this.x);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ThreeDVector.Selector<TRoot, TParent>> y() {
            return ((this.y == null)?this.y = new com.kscs.util.jaxb.Selector<TRoot, ThreeDVector.Selector<TRoot, TParent>>(this._root, this, "y"):this.y);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ThreeDVector.Selector<TRoot, TParent>> z() {
            return ((this.z == null)?this.z = new com.kscs.util.jaxb.Selector<TRoot, ThreeDVector.Selector<TRoot, TParent>>(this._root, this, "z"):this.z);
        }

    }

}
