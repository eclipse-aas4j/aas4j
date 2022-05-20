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
 * <p>Java-Klasse für ThreeDFrame complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThreeDFrame"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}Frame"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CartesianCoordinates" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ThreeDCartesianCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="Orientation" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ThreeDOrientation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreeDFrame", propOrder = {
    "cartesianCoordinates",
    "orientation"
})
public class ThreeDFrame
    extends Frame
{

    @XmlElementRef(name = "CartesianCoordinates", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ThreeDCartesianCoordinates> cartesianCoordinates;
    @XmlElementRef(name = "Orientation", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ThreeDOrientation> orientation;

    /**
     * Ruft den Wert der cartesianCoordinates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ThreeDCartesianCoordinates }{@code >}
     *     
     */
    public JAXBElement<ThreeDCartesianCoordinates> getCartesianCoordinates() {
        return cartesianCoordinates;
    }

    /**
     * Legt den Wert der cartesianCoordinates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ThreeDCartesianCoordinates }{@code >}
     *     
     */
    public void setCartesianCoordinates(JAXBElement<ThreeDCartesianCoordinates> value) {
        this.cartesianCoordinates = value;
    }

    /**
     * Ruft den Wert der orientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ThreeDOrientation }{@code >}
     *     
     */
    public JAXBElement<ThreeDOrientation> getOrientation() {
        return orientation;
    }

    /**
     * Legt den Wert der orientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ThreeDOrientation }{@code >}
     *     
     */
    public void setOrientation(JAXBElement<ThreeDOrientation> value) {
        this.orientation = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ThreeDFrame.Builder<_B> _other) {
        super.copyTo(_other);
        _other.cartesianCoordinates = this.cartesianCoordinates;
        _other.orientation = this.orientation;
    }

    @Override
    public<_B >ThreeDFrame.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ThreeDFrame.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ThreeDFrame.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ThreeDFrame.Builder<Void> builder() {
        return new ThreeDFrame.Builder<Void>(null, null, false);
    }

    public static<_B >ThreeDFrame.Builder<_B> copyOf(final Frame _other) {
        final ThreeDFrame.Builder<_B> _newBuilder = new ThreeDFrame.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ThreeDFrame.Builder<_B> copyOf(final ThreeDFrame _other) {
        final ThreeDFrame.Builder<_B> _newBuilder = new ThreeDFrame.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ThreeDFrame.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree cartesianCoordinatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cartesianCoordinates"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cartesianCoordinatesPropertyTree!= null):((cartesianCoordinatesPropertyTree == null)||(!cartesianCoordinatesPropertyTree.isLeaf())))) {
            _other.cartesianCoordinates = this.cartesianCoordinates;
        }
        final PropertyTree orientationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("orientation"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(orientationPropertyTree!= null):((orientationPropertyTree == null)||(!orientationPropertyTree.isLeaf())))) {
            _other.orientation = this.orientation;
        }
    }

    @Override
    public<_B >ThreeDFrame.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ThreeDFrame.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ThreeDFrame.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ThreeDFrame.Builder<_B> copyOf(final Frame _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ThreeDFrame.Builder<_B> _newBuilder = new ThreeDFrame.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ThreeDFrame.Builder<_B> copyOf(final ThreeDFrame _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ThreeDFrame.Builder<_B> _newBuilder = new ThreeDFrame.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ThreeDFrame.Builder<Void> copyExcept(final Frame _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ThreeDFrame.Builder<Void> copyExcept(final ThreeDFrame _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ThreeDFrame.Builder<Void> copyOnly(final Frame _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ThreeDFrame.Builder<Void> copyOnly(final ThreeDFrame _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends Frame.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ThreeDCartesianCoordinates> cartesianCoordinates;
        private JAXBElement<ThreeDOrientation> orientation;

        public Builder(final _B _parentBuilder, final ThreeDFrame _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.cartesianCoordinates = _other.cartesianCoordinates;
                this.orientation = _other.orientation;
            }
        }

        public Builder(final _B _parentBuilder, final ThreeDFrame _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree cartesianCoordinatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cartesianCoordinates"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cartesianCoordinatesPropertyTree!= null):((cartesianCoordinatesPropertyTree == null)||(!cartesianCoordinatesPropertyTree.isLeaf())))) {
                    this.cartesianCoordinates = _other.cartesianCoordinates;
                }
                final PropertyTree orientationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("orientation"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(orientationPropertyTree!= null):((orientationPropertyTree == null)||(!orientationPropertyTree.isLeaf())))) {
                    this.orientation = _other.orientation;
                }
            }
        }

        protected<_P extends ThreeDFrame >_P init(final _P _product) {
            _product.cartesianCoordinates = this.cartesianCoordinates;
            _product.orientation = this.orientation;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "cartesianCoordinates" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param cartesianCoordinates
         *     Neuer Wert der Eigenschaft "cartesianCoordinates".
         */
        public ThreeDFrame.Builder<_B> withCartesianCoordinates(final JAXBElement<ThreeDCartesianCoordinates> cartesianCoordinates) {
            this.cartesianCoordinates = cartesianCoordinates;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "orientation" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param orientation
         *     Neuer Wert der Eigenschaft "orientation".
         */
        public ThreeDFrame.Builder<_B> withOrientation(final JAXBElement<ThreeDOrientation> orientation) {
            this.orientation = orientation;
            return this;
        }

        @Override
        public ThreeDFrame build() {
            if (_storedValue == null) {
                return this.init(new ThreeDFrame());
            } else {
                return ((ThreeDFrame) _storedValue);
            }
        }

        public ThreeDFrame.Builder<_B> copyOf(final ThreeDFrame _other) {
            _other.copyTo(this);
            return this;
        }

        public ThreeDFrame.Builder<_B> copyOf(final ThreeDFrame.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ThreeDFrame.Selector<ThreeDFrame.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ThreeDFrame.Select _root() {
            return new ThreeDFrame.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends Frame.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ThreeDFrame.Selector<TRoot, TParent>> cartesianCoordinates = null;
        private com.kscs.util.jaxb.Selector<TRoot, ThreeDFrame.Selector<TRoot, TParent>> orientation = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.cartesianCoordinates!= null) {
                products.put("cartesianCoordinates", this.cartesianCoordinates.init());
            }
            if (this.orientation!= null) {
                products.put("orientation", this.orientation.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ThreeDFrame.Selector<TRoot, TParent>> cartesianCoordinates() {
            return ((this.cartesianCoordinates == null)?this.cartesianCoordinates = new com.kscs.util.jaxb.Selector<TRoot, ThreeDFrame.Selector<TRoot, TParent>>(this._root, this, "cartesianCoordinates"):this.cartesianCoordinates);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ThreeDFrame.Selector<TRoot, TParent>> orientation() {
            return ((this.orientation == null)?this.orientation = new com.kscs.util.jaxb.Selector<TRoot, ThreeDFrame.Selector<TRoot, TParent>>(this._root, this, "orientation"):this.orientation);
        }

    }

}
