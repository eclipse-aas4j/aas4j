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
 * <p>Java-Klasse für ListOfThreeDCartesianCoordinates complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfThreeDCartesianCoordinates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ThreeDCartesianCoordinates" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ThreeDCartesianCoordinates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfThreeDCartesianCoordinates", propOrder = {
    "threeDCartesianCoordinates"
})
public class ListOfThreeDCartesianCoordinates {

    @XmlElement(name = "ThreeDCartesianCoordinates", nillable = true)
    protected List<ThreeDCartesianCoordinates> threeDCartesianCoordinates;

    /**
     * Gets the value of the threeDCartesianCoordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threeDCartesianCoordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreeDCartesianCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThreeDCartesianCoordinates }
     * 
     * 
     */
    public List<ThreeDCartesianCoordinates> getThreeDCartesianCoordinates() {
        if (threeDCartesianCoordinates == null) {
            threeDCartesianCoordinates = new ArrayList<ThreeDCartesianCoordinates>();
        }
        return this.threeDCartesianCoordinates;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfThreeDCartesianCoordinates.Builder<_B> _other) {
        if (this.threeDCartesianCoordinates == null) {
            _other.threeDCartesianCoordinates = null;
        } else {
            _other.threeDCartesianCoordinates = new ArrayList<ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>>>();
            for (ThreeDCartesianCoordinates _item: this.threeDCartesianCoordinates) {
                _other.threeDCartesianCoordinates.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfThreeDCartesianCoordinates.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfThreeDCartesianCoordinates.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfThreeDCartesianCoordinates.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfThreeDCartesianCoordinates.Builder<Void> builder() {
        return new ListOfThreeDCartesianCoordinates.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfThreeDCartesianCoordinates.Builder<_B> copyOf(final ListOfThreeDCartesianCoordinates _other) {
        final ListOfThreeDCartesianCoordinates.Builder<_B> _newBuilder = new ListOfThreeDCartesianCoordinates.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfThreeDCartesianCoordinates.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree threeDCartesianCoordinatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("threeDCartesianCoordinates"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(threeDCartesianCoordinatesPropertyTree!= null):((threeDCartesianCoordinatesPropertyTree == null)||(!threeDCartesianCoordinatesPropertyTree.isLeaf())))) {
            if (this.threeDCartesianCoordinates == null) {
                _other.threeDCartesianCoordinates = null;
            } else {
                _other.threeDCartesianCoordinates = new ArrayList<ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>>>();
                for (ThreeDCartesianCoordinates _item: this.threeDCartesianCoordinates) {
                    _other.threeDCartesianCoordinates.add(((_item == null)?null:_item.newCopyBuilder(_other, threeDCartesianCoordinatesPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfThreeDCartesianCoordinates.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfThreeDCartesianCoordinates.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfThreeDCartesianCoordinates.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfThreeDCartesianCoordinates.Builder<_B> copyOf(final ListOfThreeDCartesianCoordinates _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfThreeDCartesianCoordinates.Builder<_B> _newBuilder = new ListOfThreeDCartesianCoordinates.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfThreeDCartesianCoordinates.Builder<Void> copyExcept(final ListOfThreeDCartesianCoordinates _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfThreeDCartesianCoordinates.Builder<Void> copyOnly(final ListOfThreeDCartesianCoordinates _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfThreeDCartesianCoordinates _storedValue;
        private List<ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>>> threeDCartesianCoordinates;

        public Builder(final _B _parentBuilder, final ListOfThreeDCartesianCoordinates _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.threeDCartesianCoordinates == null) {
                        this.threeDCartesianCoordinates = null;
                    } else {
                        this.threeDCartesianCoordinates = new ArrayList<ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>>>();
                        for (ThreeDCartesianCoordinates _item: _other.threeDCartesianCoordinates) {
                            this.threeDCartesianCoordinates.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfThreeDCartesianCoordinates _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree threeDCartesianCoordinatesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("threeDCartesianCoordinates"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(threeDCartesianCoordinatesPropertyTree!= null):((threeDCartesianCoordinatesPropertyTree == null)||(!threeDCartesianCoordinatesPropertyTree.isLeaf())))) {
                        if (_other.threeDCartesianCoordinates == null) {
                            this.threeDCartesianCoordinates = null;
                        } else {
                            this.threeDCartesianCoordinates = new ArrayList<ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>>>();
                            for (ThreeDCartesianCoordinates _item: _other.threeDCartesianCoordinates) {
                                this.threeDCartesianCoordinates.add(((_item == null)?null:_item.newCopyBuilder(this, threeDCartesianCoordinatesPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfThreeDCartesianCoordinates >_P init(final _P _product) {
            if (this.threeDCartesianCoordinates!= null) {
                final List<ThreeDCartesianCoordinates> threeDCartesianCoordinates = new ArrayList<ThreeDCartesianCoordinates>(this.threeDCartesianCoordinates.size());
                for (ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>> _item: this.threeDCartesianCoordinates) {
                    threeDCartesianCoordinates.add(_item.build());
                }
                _product.threeDCartesianCoordinates = threeDCartesianCoordinates;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "threeDCartesianCoordinates" hinzu.
         * 
         * @param threeDCartesianCoordinates
         *     Werte, die zur Eigenschaft "threeDCartesianCoordinates" hinzugefügt werden.
         */
        public ListOfThreeDCartesianCoordinates.Builder<_B> addThreeDCartesianCoordinates(final Iterable<? extends ThreeDCartesianCoordinates> threeDCartesianCoordinates) {
            if (threeDCartesianCoordinates!= null) {
                if (this.threeDCartesianCoordinates == null) {
                    this.threeDCartesianCoordinates = new ArrayList<ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>>>();
                }
                for (ThreeDCartesianCoordinates _item: threeDCartesianCoordinates) {
                    this.threeDCartesianCoordinates.add(new ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "threeDCartesianCoordinates" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param threeDCartesianCoordinates
         *     Neuer Wert der Eigenschaft "threeDCartesianCoordinates".
         */
        public ListOfThreeDCartesianCoordinates.Builder<_B> withThreeDCartesianCoordinates(final Iterable<? extends ThreeDCartesianCoordinates> threeDCartesianCoordinates) {
            if (this.threeDCartesianCoordinates!= null) {
                this.threeDCartesianCoordinates.clear();
            }
            return addThreeDCartesianCoordinates(threeDCartesianCoordinates);
        }

        /**
         * Fügt Werte zur Eigenschaft "threeDCartesianCoordinates" hinzu.
         * 
         * @param threeDCartesianCoordinates
         *     Werte, die zur Eigenschaft "threeDCartesianCoordinates" hinzugefügt werden.
         */
        public ListOfThreeDCartesianCoordinates.Builder<_B> addThreeDCartesianCoordinates(ThreeDCartesianCoordinates... threeDCartesianCoordinates) {
            addThreeDCartesianCoordinates(Arrays.asList(threeDCartesianCoordinates));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "threeDCartesianCoordinates" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param threeDCartesianCoordinates
         *     Neuer Wert der Eigenschaft "threeDCartesianCoordinates".
         */
        public ListOfThreeDCartesianCoordinates.Builder<_B> withThreeDCartesianCoordinates(ThreeDCartesianCoordinates... threeDCartesianCoordinates) {
            withThreeDCartesianCoordinates(Arrays.asList(threeDCartesianCoordinates));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ThreeDCartesianCoordinates".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ThreeDCartesianCoordinates".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ThreeDCartesianCoordinates.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ThreeDCartesianCoordinates.Builder<? extends ListOfThreeDCartesianCoordinates.Builder<_B>> addThreeDCartesianCoordinates() {
            if (this.threeDCartesianCoordinates == null) {
                this.threeDCartesianCoordinates = new ArrayList<ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>>>();
            }
            final ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>> threeDCartesianCoordinates_Builder = new ThreeDCartesianCoordinates.Builder<ListOfThreeDCartesianCoordinates.Builder<_B>>(this, null, false);
            this.threeDCartesianCoordinates.add(threeDCartesianCoordinates_Builder);
            return threeDCartesianCoordinates_Builder;
        }

        @Override
        public ListOfThreeDCartesianCoordinates build() {
            if (_storedValue == null) {
                return this.init(new ListOfThreeDCartesianCoordinates());
            } else {
                return ((ListOfThreeDCartesianCoordinates) _storedValue);
            }
        }

        public ListOfThreeDCartesianCoordinates.Builder<_B> copyOf(final ListOfThreeDCartesianCoordinates _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfThreeDCartesianCoordinates.Builder<_B> copyOf(final ListOfThreeDCartesianCoordinates.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfThreeDCartesianCoordinates.Selector<ListOfThreeDCartesianCoordinates.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfThreeDCartesianCoordinates.Select _root() {
            return new ListOfThreeDCartesianCoordinates.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ThreeDCartesianCoordinates.Selector<TRoot, ListOfThreeDCartesianCoordinates.Selector<TRoot, TParent>> threeDCartesianCoordinates = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.threeDCartesianCoordinates!= null) {
                products.put("threeDCartesianCoordinates", this.threeDCartesianCoordinates.init());
            }
            return products;
        }

        public ThreeDCartesianCoordinates.Selector<TRoot, ListOfThreeDCartesianCoordinates.Selector<TRoot, TParent>> threeDCartesianCoordinates() {
            return ((this.threeDCartesianCoordinates == null)?this.threeDCartesianCoordinates = new ThreeDCartesianCoordinates.Selector<TRoot, ListOfThreeDCartesianCoordinates.Selector<TRoot, TParent>>(this._root, this, "threeDCartesianCoordinates"):this.threeDCartesianCoordinates);
        }

    }

}
