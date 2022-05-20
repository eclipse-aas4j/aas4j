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
 * <p>Java-Klasse für ListOfUnion complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUnion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Union" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Union" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUnion", propOrder = {
    "union"
})
public class ListOfUnion {

    @XmlElement(name = "Union", nillable = true)
    protected List<Union> union;

    /**
     * Gets the value of the union property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the union property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Union }
     * 
     * 
     */
    public List<Union> getUnion() {
        if (union == null) {
            union = new ArrayList<Union>();
        }
        return this.union;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUnion.Builder<_B> _other) {
        if (this.union == null) {
            _other.union = null;
        } else {
            _other.union = new ArrayList<Union.Builder<ListOfUnion.Builder<_B>>>();
            for (Union _item: this.union) {
                _other.union.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfUnion.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUnion.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUnion.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUnion.Builder<Void> builder() {
        return new ListOfUnion.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUnion.Builder<_B> copyOf(final ListOfUnion _other) {
        final ListOfUnion.Builder<_B> _newBuilder = new ListOfUnion.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUnion.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree unionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("union"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unionPropertyTree!= null):((unionPropertyTree == null)||(!unionPropertyTree.isLeaf())))) {
            if (this.union == null) {
                _other.union = null;
            } else {
                _other.union = new ArrayList<Union.Builder<ListOfUnion.Builder<_B>>>();
                for (Union _item: this.union) {
                    _other.union.add(((_item == null)?null:_item.newCopyBuilder(_other, unionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfUnion.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUnion.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUnion.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUnion.Builder<_B> copyOf(final ListOfUnion _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUnion.Builder<_B> _newBuilder = new ListOfUnion.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUnion.Builder<Void> copyExcept(final ListOfUnion _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUnion.Builder<Void> copyOnly(final ListOfUnion _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUnion _storedValue;
        private List<Union.Builder<ListOfUnion.Builder<_B>>> union;

        public Builder(final _B _parentBuilder, final ListOfUnion _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.union == null) {
                        this.union = null;
                    } else {
                        this.union = new ArrayList<Union.Builder<ListOfUnion.Builder<_B>>>();
                        for (Union _item: _other.union) {
                            this.union.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUnion _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree unionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("union"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unionPropertyTree!= null):((unionPropertyTree == null)||(!unionPropertyTree.isLeaf())))) {
                        if (_other.union == null) {
                            this.union = null;
                        } else {
                            this.union = new ArrayList<Union.Builder<ListOfUnion.Builder<_B>>>();
                            for (Union _item: _other.union) {
                                this.union.add(((_item == null)?null:_item.newCopyBuilder(this, unionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfUnion >_P init(final _P _product) {
            if (this.union!= null) {
                final List<Union> union = new ArrayList<Union>(this.union.size());
                for (Union.Builder<ListOfUnion.Builder<_B>> _item: this.union) {
                    union.add(_item.build());
                }
                _product.union = union;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "union" hinzu.
         * 
         * @param union
         *     Werte, die zur Eigenschaft "union" hinzugefügt werden.
         */
        public ListOfUnion.Builder<_B> addUnion(final Iterable<? extends Union> union) {
            if (union!= null) {
                if (this.union == null) {
                    this.union = new ArrayList<Union.Builder<ListOfUnion.Builder<_B>>>();
                }
                for (Union _item: union) {
                    this.union.add(new Union.Builder<ListOfUnion.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "union" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param union
         *     Neuer Wert der Eigenschaft "union".
         */
        public ListOfUnion.Builder<_B> withUnion(final Iterable<? extends Union> union) {
            if (this.union!= null) {
                this.union.clear();
            }
            return addUnion(union);
        }

        /**
         * Fügt Werte zur Eigenschaft "union" hinzu.
         * 
         * @param union
         *     Werte, die zur Eigenschaft "union" hinzugefügt werden.
         */
        public ListOfUnion.Builder<_B> addUnion(Union... union) {
            addUnion(Arrays.asList(union));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "union" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param union
         *     Neuer Wert der Eigenschaft "union".
         */
        public ListOfUnion.Builder<_B> withUnion(Union... union) {
            withUnion(Arrays.asList(union));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "Union".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Union.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "Union".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Union.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Union.Builder<? extends ListOfUnion.Builder<_B>> addUnion() {
            if (this.union == null) {
                this.union = new ArrayList<Union.Builder<ListOfUnion.Builder<_B>>>();
            }
            final Union.Builder<ListOfUnion.Builder<_B>> union_Builder = new Union.Builder<ListOfUnion.Builder<_B>>(this, null, false);
            this.union.add(union_Builder);
            return union_Builder;
        }

        @Override
        public ListOfUnion build() {
            if (_storedValue == null) {
                return this.init(new ListOfUnion());
            } else {
                return ((ListOfUnion) _storedValue);
            }
        }

        public ListOfUnion.Builder<_B> copyOf(final ListOfUnion _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUnion.Builder<_B> copyOf(final ListOfUnion.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUnion.Selector<ListOfUnion.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUnion.Select _root() {
            return new ListOfUnion.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Union.Selector<TRoot, ListOfUnion.Selector<TRoot, TParent>> union = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.union!= null) {
                products.put("union", this.union.init());
            }
            return products;
        }

        public Union.Selector<TRoot, ListOfUnion.Selector<TRoot, TParent>> union() {
            return ((this.union == null)?this.union = new Union.Selector<TRoot, ListOfUnion.Selector<TRoot, TParent>>(this._root, this, "union"):this.union);
        }

    }

}
