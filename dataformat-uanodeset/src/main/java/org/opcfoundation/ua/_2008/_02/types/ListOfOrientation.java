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
 * <p>Java-Klasse für ListOfOrientation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrientation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Orientation" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Orientation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrientation", propOrder = {
    "orientation"
})
public class ListOfOrientation {

    @XmlElement(name = "Orientation", nillable = true)
    protected List<Orientation> orientation;

    /**
     * Gets the value of the orientation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrientation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Orientation }
     * 
     * 
     */
    public List<Orientation> getOrientation() {
        if (orientation == null) {
            orientation = new ArrayList<Orientation>();
        }
        return this.orientation;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfOrientation.Builder<_B> _other) {
        if (this.orientation == null) {
            _other.orientation = null;
        } else {
            _other.orientation = new ArrayList<Orientation.Builder<ListOfOrientation.Builder<_B>>>();
            for (Orientation _item: this.orientation) {
                _other.orientation.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfOrientation.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfOrientation.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfOrientation.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfOrientation.Builder<Void> builder() {
        return new ListOfOrientation.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfOrientation.Builder<_B> copyOf(final ListOfOrientation _other) {
        final ListOfOrientation.Builder<_B> _newBuilder = new ListOfOrientation.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfOrientation.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree orientationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("orientation"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(orientationPropertyTree!= null):((orientationPropertyTree == null)||(!orientationPropertyTree.isLeaf())))) {
            if (this.orientation == null) {
                _other.orientation = null;
            } else {
                _other.orientation = new ArrayList<Orientation.Builder<ListOfOrientation.Builder<_B>>>();
                for (Orientation _item: this.orientation) {
                    _other.orientation.add(((_item == null)?null:_item.newCopyBuilder(_other, orientationPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfOrientation.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfOrientation.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfOrientation.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfOrientation.Builder<_B> copyOf(final ListOfOrientation _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfOrientation.Builder<_B> _newBuilder = new ListOfOrientation.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfOrientation.Builder<Void> copyExcept(final ListOfOrientation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfOrientation.Builder<Void> copyOnly(final ListOfOrientation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfOrientation _storedValue;
        private List<Orientation.Builder<ListOfOrientation.Builder<_B>>> orientation;

        public Builder(final _B _parentBuilder, final ListOfOrientation _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.orientation == null) {
                        this.orientation = null;
                    } else {
                        this.orientation = new ArrayList<Orientation.Builder<ListOfOrientation.Builder<_B>>>();
                        for (Orientation _item: _other.orientation) {
                            this.orientation.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfOrientation _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree orientationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("orientation"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(orientationPropertyTree!= null):((orientationPropertyTree == null)||(!orientationPropertyTree.isLeaf())))) {
                        if (_other.orientation == null) {
                            this.orientation = null;
                        } else {
                            this.orientation = new ArrayList<Orientation.Builder<ListOfOrientation.Builder<_B>>>();
                            for (Orientation _item: _other.orientation) {
                                this.orientation.add(((_item == null)?null:_item.newCopyBuilder(this, orientationPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfOrientation >_P init(final _P _product) {
            if (this.orientation!= null) {
                final List<Orientation> orientation = new ArrayList<Orientation>(this.orientation.size());
                for (Orientation.Builder<ListOfOrientation.Builder<_B>> _item: this.orientation) {
                    orientation.add(_item.build());
                }
                _product.orientation = orientation;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "orientation" hinzu.
         * 
         * @param orientation
         *     Werte, die zur Eigenschaft "orientation" hinzugefügt werden.
         */
        public ListOfOrientation.Builder<_B> addOrientation(final Iterable<? extends Orientation> orientation) {
            if (orientation!= null) {
                if (this.orientation == null) {
                    this.orientation = new ArrayList<Orientation.Builder<ListOfOrientation.Builder<_B>>>();
                }
                for (Orientation _item: orientation) {
                    this.orientation.add(new Orientation.Builder<ListOfOrientation.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "orientation" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param orientation
         *     Neuer Wert der Eigenschaft "orientation".
         */
        public ListOfOrientation.Builder<_B> withOrientation(final Iterable<? extends Orientation> orientation) {
            if (this.orientation!= null) {
                this.orientation.clear();
            }
            return addOrientation(orientation);
        }

        /**
         * Fügt Werte zur Eigenschaft "orientation" hinzu.
         * 
         * @param orientation
         *     Werte, die zur Eigenschaft "orientation" hinzugefügt werden.
         */
        public ListOfOrientation.Builder<_B> addOrientation(Orientation... orientation) {
            addOrientation(Arrays.asList(orientation));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "orientation" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param orientation
         *     Neuer Wert der Eigenschaft "orientation".
         */
        public ListOfOrientation.Builder<_B> withOrientation(Orientation... orientation) {
            withOrientation(Arrays.asList(orientation));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "Orientation".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Orientation.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "Orientation".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Orientation.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public Orientation.Builder<? extends ListOfOrientation.Builder<_B>> addOrientation() {
            if (this.orientation == null) {
                this.orientation = new ArrayList<Orientation.Builder<ListOfOrientation.Builder<_B>>>();
            }
            final Orientation.Builder<ListOfOrientation.Builder<_B>> orientation_Builder = new Orientation.Builder<ListOfOrientation.Builder<_B>>(this, null, false);
            this.orientation.add(orientation_Builder);
            return orientation_Builder;
        }

        @Override
        public ListOfOrientation build() {
            if (_storedValue == null) {
                return this.init(new ListOfOrientation());
            } else {
                return ((ListOfOrientation) _storedValue);
            }
        }

        public ListOfOrientation.Builder<_B> copyOf(final ListOfOrientation _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfOrientation.Builder<_B> copyOf(final ListOfOrientation.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfOrientation.Selector<ListOfOrientation.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfOrientation.Select _root() {
            return new ListOfOrientation.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Orientation.Selector<TRoot, ListOfOrientation.Selector<TRoot, TParent>> orientation = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.orientation!= null) {
                products.put("orientation", this.orientation.init());
            }
            return products;
        }

        public Orientation.Selector<TRoot, ListOfOrientation.Selector<TRoot, TParent>> orientation() {
            return ((this.orientation == null)?this.orientation = new Orientation.Selector<TRoot, ListOfOrientation.Selector<TRoot, TParent>>(this._root, this, "orientation"):this.orientation);
        }

    }

}
