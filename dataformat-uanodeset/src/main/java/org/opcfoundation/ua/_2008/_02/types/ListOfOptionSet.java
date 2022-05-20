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
 * <p>Java-Klasse für ListOfOptionSet complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfOptionSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptionSet" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}OptionSet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOptionSet", propOrder = {
    "optionSet"
})
public class ListOfOptionSet {

    @XmlElement(name = "OptionSet", nillable = true)
    protected List<OptionSet> optionSet;

    /**
     * Gets the value of the optionSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionSet }
     * 
     * 
     */
    public List<OptionSet> getOptionSet() {
        if (optionSet == null) {
            optionSet = new ArrayList<OptionSet>();
        }
        return this.optionSet;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfOptionSet.Builder<_B> _other) {
        if (this.optionSet == null) {
            _other.optionSet = null;
        } else {
            _other.optionSet = new ArrayList<OptionSet.Builder<ListOfOptionSet.Builder<_B>>>();
            for (OptionSet _item: this.optionSet) {
                _other.optionSet.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfOptionSet.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfOptionSet.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfOptionSet.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfOptionSet.Builder<Void> builder() {
        return new ListOfOptionSet.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfOptionSet.Builder<_B> copyOf(final ListOfOptionSet _other) {
        final ListOfOptionSet.Builder<_B> _newBuilder = new ListOfOptionSet.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfOptionSet.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree optionSetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("optionSet"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(optionSetPropertyTree!= null):((optionSetPropertyTree == null)||(!optionSetPropertyTree.isLeaf())))) {
            if (this.optionSet == null) {
                _other.optionSet = null;
            } else {
                _other.optionSet = new ArrayList<OptionSet.Builder<ListOfOptionSet.Builder<_B>>>();
                for (OptionSet _item: this.optionSet) {
                    _other.optionSet.add(((_item == null)?null:_item.newCopyBuilder(_other, optionSetPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfOptionSet.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfOptionSet.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfOptionSet.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfOptionSet.Builder<_B> copyOf(final ListOfOptionSet _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfOptionSet.Builder<_B> _newBuilder = new ListOfOptionSet.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfOptionSet.Builder<Void> copyExcept(final ListOfOptionSet _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfOptionSet.Builder<Void> copyOnly(final ListOfOptionSet _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfOptionSet _storedValue;
        private List<OptionSet.Builder<ListOfOptionSet.Builder<_B>>> optionSet;

        public Builder(final _B _parentBuilder, final ListOfOptionSet _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.optionSet == null) {
                        this.optionSet = null;
                    } else {
                        this.optionSet = new ArrayList<OptionSet.Builder<ListOfOptionSet.Builder<_B>>>();
                        for (OptionSet _item: _other.optionSet) {
                            this.optionSet.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfOptionSet _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree optionSetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("optionSet"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(optionSetPropertyTree!= null):((optionSetPropertyTree == null)||(!optionSetPropertyTree.isLeaf())))) {
                        if (_other.optionSet == null) {
                            this.optionSet = null;
                        } else {
                            this.optionSet = new ArrayList<OptionSet.Builder<ListOfOptionSet.Builder<_B>>>();
                            for (OptionSet _item: _other.optionSet) {
                                this.optionSet.add(((_item == null)?null:_item.newCopyBuilder(this, optionSetPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfOptionSet >_P init(final _P _product) {
            if (this.optionSet!= null) {
                final List<OptionSet> optionSet = new ArrayList<OptionSet>(this.optionSet.size());
                for (OptionSet.Builder<ListOfOptionSet.Builder<_B>> _item: this.optionSet) {
                    optionSet.add(_item.build());
                }
                _product.optionSet = optionSet;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "optionSet" hinzu.
         * 
         * @param optionSet
         *     Werte, die zur Eigenschaft "optionSet" hinzugefügt werden.
         */
        public ListOfOptionSet.Builder<_B> addOptionSet(final Iterable<? extends OptionSet> optionSet) {
            if (optionSet!= null) {
                if (this.optionSet == null) {
                    this.optionSet = new ArrayList<OptionSet.Builder<ListOfOptionSet.Builder<_B>>>();
                }
                for (OptionSet _item: optionSet) {
                    this.optionSet.add(new OptionSet.Builder<ListOfOptionSet.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "optionSet" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param optionSet
         *     Neuer Wert der Eigenschaft "optionSet".
         */
        public ListOfOptionSet.Builder<_B> withOptionSet(final Iterable<? extends OptionSet> optionSet) {
            if (this.optionSet!= null) {
                this.optionSet.clear();
            }
            return addOptionSet(optionSet);
        }

        /**
         * Fügt Werte zur Eigenschaft "optionSet" hinzu.
         * 
         * @param optionSet
         *     Werte, die zur Eigenschaft "optionSet" hinzugefügt werden.
         */
        public ListOfOptionSet.Builder<_B> addOptionSet(OptionSet... optionSet) {
            addOptionSet(Arrays.asList(optionSet));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "optionSet" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param optionSet
         *     Neuer Wert der Eigenschaft "optionSet".
         */
        public ListOfOptionSet.Builder<_B> withOptionSet(OptionSet... optionSet) {
            withOptionSet(Arrays.asList(optionSet));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "OptionSet".
         * Mit {@link org.opcfoundation.ua._2008._02.types.OptionSet.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "OptionSet".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.OptionSet.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public OptionSet.Builder<? extends ListOfOptionSet.Builder<_B>> addOptionSet() {
            if (this.optionSet == null) {
                this.optionSet = new ArrayList<OptionSet.Builder<ListOfOptionSet.Builder<_B>>>();
            }
            final OptionSet.Builder<ListOfOptionSet.Builder<_B>> optionSet_Builder = new OptionSet.Builder<ListOfOptionSet.Builder<_B>>(this, null, false);
            this.optionSet.add(optionSet_Builder);
            return optionSet_Builder;
        }

        @Override
        public ListOfOptionSet build() {
            if (_storedValue == null) {
                return this.init(new ListOfOptionSet());
            } else {
                return ((ListOfOptionSet) _storedValue);
            }
        }

        public ListOfOptionSet.Builder<_B> copyOf(final ListOfOptionSet _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfOptionSet.Builder<_B> copyOf(final ListOfOptionSet.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfOptionSet.Selector<ListOfOptionSet.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfOptionSet.Select _root() {
            return new ListOfOptionSet.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private OptionSet.Selector<TRoot, ListOfOptionSet.Selector<TRoot, TParent>> optionSet = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.optionSet!= null) {
                products.put("optionSet", this.optionSet.init());
            }
            return products;
        }

        public OptionSet.Selector<TRoot, ListOfOptionSet.Selector<TRoot, TParent>> optionSet() {
            return ((this.optionSet == null)?this.optionSet = new OptionSet.Selector<TRoot, ListOfOptionSet.Selector<TRoot, TParent>>(this._root, this, "optionSet"):this.optionSet);
        }

    }

}
