//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfCartesianCoordinates complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfCartesianCoordinates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CartesianCoordinates" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}CartesianCoordinates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCartesianCoordinates", propOrder = {
    "cartesianCoordinates"
})
public class ListOfCartesianCoordinates {

    @XmlElement(name = "CartesianCoordinates", nillable = true)
    protected List<CartesianCoordinates> cartesianCoordinates;

    /**
     * Gets the value of the cartesianCoordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartesianCoordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartesianCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartesianCoordinates }
     * 
     * 
     */
    public List<CartesianCoordinates> getCartesianCoordinates() {
        if (cartesianCoordinates == null) {
            cartesianCoordinates = new ArrayList<CartesianCoordinates>();
        }
        return this.cartesianCoordinates;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfCartesianCoordinates.Builder<_B> _other) {
        if (this.cartesianCoordinates == null) {
            _other.cartesianCoordinates = null;
        } else {
            _other.cartesianCoordinates = new ArrayList<CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>>>();
            for (CartesianCoordinates _item: this.cartesianCoordinates) {
                _other.cartesianCoordinates.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfCartesianCoordinates.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfCartesianCoordinates.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfCartesianCoordinates.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfCartesianCoordinates.Builder<Void> builder() {
        return new ListOfCartesianCoordinates.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfCartesianCoordinates.Builder<_B> copyOf(final ListOfCartesianCoordinates _other) {
        final ListOfCartesianCoordinates.Builder<_B> _newBuilder = new ListOfCartesianCoordinates.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfCartesianCoordinates.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree cartesianCoordinatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cartesianCoordinates"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cartesianCoordinatesPropertyTree!= null):((cartesianCoordinatesPropertyTree == null)||(!cartesianCoordinatesPropertyTree.isLeaf())))) {
            if (this.cartesianCoordinates == null) {
                _other.cartesianCoordinates = null;
            } else {
                _other.cartesianCoordinates = new ArrayList<CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>>>();
                for (CartesianCoordinates _item: this.cartesianCoordinates) {
                    _other.cartesianCoordinates.add(((_item == null)?null:_item.newCopyBuilder(_other, cartesianCoordinatesPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfCartesianCoordinates.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfCartesianCoordinates.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfCartesianCoordinates.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfCartesianCoordinates.Builder<_B> copyOf(final ListOfCartesianCoordinates _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfCartesianCoordinates.Builder<_B> _newBuilder = new ListOfCartesianCoordinates.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfCartesianCoordinates.Builder<Void> copyExcept(final ListOfCartesianCoordinates _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfCartesianCoordinates.Builder<Void> copyOnly(final ListOfCartesianCoordinates _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfCartesianCoordinates _storedValue;
        private List<CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>>> cartesianCoordinates;

        public Builder(final _B _parentBuilder, final ListOfCartesianCoordinates _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.cartesianCoordinates == null) {
                        this.cartesianCoordinates = null;
                    } else {
                        this.cartesianCoordinates = new ArrayList<CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>>>();
                        for (CartesianCoordinates _item: _other.cartesianCoordinates) {
                            this.cartesianCoordinates.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfCartesianCoordinates _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree cartesianCoordinatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cartesianCoordinates"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cartesianCoordinatesPropertyTree!= null):((cartesianCoordinatesPropertyTree == null)||(!cartesianCoordinatesPropertyTree.isLeaf())))) {
                        if (_other.cartesianCoordinates == null) {
                            this.cartesianCoordinates = null;
                        } else {
                            this.cartesianCoordinates = new ArrayList<CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>>>();
                            for (CartesianCoordinates _item: _other.cartesianCoordinates) {
                                this.cartesianCoordinates.add(((_item == null)?null:_item.newCopyBuilder(this, cartesianCoordinatesPropertyTree, _propertyTreeUse)));
                            }
                        }
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

        protected<_P extends ListOfCartesianCoordinates >_P init(final _P _product) {
            if (this.cartesianCoordinates!= null) {
                final List<CartesianCoordinates> cartesianCoordinates = new ArrayList<CartesianCoordinates>(this.cartesianCoordinates.size());
                for (CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>> _item: this.cartesianCoordinates) {
                    cartesianCoordinates.add(_item.build());
                }
                _product.cartesianCoordinates = cartesianCoordinates;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "cartesianCoordinates" hinzu.
         * 
         * @param cartesianCoordinates
         *     Werte, die zur Eigenschaft "cartesianCoordinates" hinzugefügt werden.
         */
        public ListOfCartesianCoordinates.Builder<_B> addCartesianCoordinates(final Iterable<? extends CartesianCoordinates> cartesianCoordinates) {
            if (cartesianCoordinates!= null) {
                if (this.cartesianCoordinates == null) {
                    this.cartesianCoordinates = new ArrayList<CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>>>();
                }
                for (CartesianCoordinates _item: cartesianCoordinates) {
                    this.cartesianCoordinates.add(new CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "cartesianCoordinates" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param cartesianCoordinates
         *     Neuer Wert der Eigenschaft "cartesianCoordinates".
         */
        public ListOfCartesianCoordinates.Builder<_B> withCartesianCoordinates(final Iterable<? extends CartesianCoordinates> cartesianCoordinates) {
            if (this.cartesianCoordinates!= null) {
                this.cartesianCoordinates.clear();
            }
            return addCartesianCoordinates(cartesianCoordinates);
        }

        /**
         * Fügt Werte zur Eigenschaft "cartesianCoordinates" hinzu.
         * 
         * @param cartesianCoordinates
         *     Werte, die zur Eigenschaft "cartesianCoordinates" hinzugefügt werden.
         */
        public ListOfCartesianCoordinates.Builder<_B> addCartesianCoordinates(CartesianCoordinates... cartesianCoordinates) {
            addCartesianCoordinates(Arrays.asList(cartesianCoordinates));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "cartesianCoordinates" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param cartesianCoordinates
         *     Neuer Wert der Eigenschaft "cartesianCoordinates".
         */
        public ListOfCartesianCoordinates.Builder<_B> withCartesianCoordinates(CartesianCoordinates... cartesianCoordinates) {
            withCartesianCoordinates(Arrays.asList(cartesianCoordinates));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "CartesianCoordinates".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.CartesianCoordinates.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "CartesianCoordinates".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.CartesianCoordinates.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public CartesianCoordinates.Builder<? extends ListOfCartesianCoordinates.Builder<_B>> addCartesianCoordinates() {
            if (this.cartesianCoordinates == null) {
                this.cartesianCoordinates = new ArrayList<CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>>>();
            }
            final CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>> cartesianCoordinates_Builder = new CartesianCoordinates.Builder<ListOfCartesianCoordinates.Builder<_B>>(this, null, false);
            this.cartesianCoordinates.add(cartesianCoordinates_Builder);
            return cartesianCoordinates_Builder;
        }

        @Override
        public ListOfCartesianCoordinates build() {
            if (_storedValue == null) {
                return this.init(new ListOfCartesianCoordinates());
            } else {
                return ((ListOfCartesianCoordinates) _storedValue);
            }
        }

        public ListOfCartesianCoordinates.Builder<_B> copyOf(final ListOfCartesianCoordinates _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfCartesianCoordinates.Builder<_B> copyOf(final ListOfCartesianCoordinates.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfCartesianCoordinates.Selector<ListOfCartesianCoordinates.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfCartesianCoordinates.Select _root() {
            return new ListOfCartesianCoordinates.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private CartesianCoordinates.Selector<TRoot, ListOfCartesianCoordinates.Selector<TRoot, TParent>> cartesianCoordinates = null;

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
            return products;
        }

        public CartesianCoordinates.Selector<TRoot, ListOfCartesianCoordinates.Selector<TRoot, TParent>> cartesianCoordinates() {
            return ((this.cartesianCoordinates == null)?this.cartesianCoordinates = new CartesianCoordinates.Selector<TRoot, ListOfCartesianCoordinates.Selector<TRoot, TParent>>(this._root, this, "cartesianCoordinates"):this.cartesianCoordinates);
        }

    }

}
