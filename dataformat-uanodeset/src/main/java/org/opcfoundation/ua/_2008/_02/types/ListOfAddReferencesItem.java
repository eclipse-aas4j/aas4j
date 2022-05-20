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
 * <p>Java-Klasse für ListOfAddReferencesItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfAddReferencesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddReferencesItem" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}AddReferencesItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAddReferencesItem", propOrder = {
    "addReferencesItem"
})
public class ListOfAddReferencesItem {

    @XmlElement(name = "AddReferencesItem", nillable = true)
    protected List<AddReferencesItem> addReferencesItem;

    /**
     * Gets the value of the addReferencesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addReferencesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddReferencesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddReferencesItem }
     * 
     * 
     */
    public List<AddReferencesItem> getAddReferencesItem() {
        if (addReferencesItem == null) {
            addReferencesItem = new ArrayList<AddReferencesItem>();
        }
        return this.addReferencesItem;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfAddReferencesItem.Builder<_B> _other) {
        if (this.addReferencesItem == null) {
            _other.addReferencesItem = null;
        } else {
            _other.addReferencesItem = new ArrayList<AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>>>();
            for (AddReferencesItem _item: this.addReferencesItem) {
                _other.addReferencesItem.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfAddReferencesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfAddReferencesItem.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfAddReferencesItem.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfAddReferencesItem.Builder<Void> builder() {
        return new ListOfAddReferencesItem.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfAddReferencesItem.Builder<_B> copyOf(final ListOfAddReferencesItem _other) {
        final ListOfAddReferencesItem.Builder<_B> _newBuilder = new ListOfAddReferencesItem.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfAddReferencesItem.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree addReferencesItemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addReferencesItem"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addReferencesItemPropertyTree!= null):((addReferencesItemPropertyTree == null)||(!addReferencesItemPropertyTree.isLeaf())))) {
            if (this.addReferencesItem == null) {
                _other.addReferencesItem = null;
            } else {
                _other.addReferencesItem = new ArrayList<AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>>>();
                for (AddReferencesItem _item: this.addReferencesItem) {
                    _other.addReferencesItem.add(((_item == null)?null:_item.newCopyBuilder(_other, addReferencesItemPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfAddReferencesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfAddReferencesItem.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfAddReferencesItem.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfAddReferencesItem.Builder<_B> copyOf(final ListOfAddReferencesItem _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfAddReferencesItem.Builder<_B> _newBuilder = new ListOfAddReferencesItem.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfAddReferencesItem.Builder<Void> copyExcept(final ListOfAddReferencesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfAddReferencesItem.Builder<Void> copyOnly(final ListOfAddReferencesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfAddReferencesItem _storedValue;
        private List<AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>>> addReferencesItem;

        public Builder(final _B _parentBuilder, final ListOfAddReferencesItem _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.addReferencesItem == null) {
                        this.addReferencesItem = null;
                    } else {
                        this.addReferencesItem = new ArrayList<AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>>>();
                        for (AddReferencesItem _item: _other.addReferencesItem) {
                            this.addReferencesItem.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfAddReferencesItem _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree addReferencesItemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addReferencesItem"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addReferencesItemPropertyTree!= null):((addReferencesItemPropertyTree == null)||(!addReferencesItemPropertyTree.isLeaf())))) {
                        if (_other.addReferencesItem == null) {
                            this.addReferencesItem = null;
                        } else {
                            this.addReferencesItem = new ArrayList<AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>>>();
                            for (AddReferencesItem _item: _other.addReferencesItem) {
                                this.addReferencesItem.add(((_item == null)?null:_item.newCopyBuilder(this, addReferencesItemPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfAddReferencesItem >_P init(final _P _product) {
            if (this.addReferencesItem!= null) {
                final List<AddReferencesItem> addReferencesItem = new ArrayList<AddReferencesItem>(this.addReferencesItem.size());
                for (AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>> _item: this.addReferencesItem) {
                    addReferencesItem.add(_item.build());
                }
                _product.addReferencesItem = addReferencesItem;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "addReferencesItem" hinzu.
         * 
         * @param addReferencesItem
         *     Werte, die zur Eigenschaft "addReferencesItem" hinzugefügt werden.
         */
        public ListOfAddReferencesItem.Builder<_B> addAddReferencesItem(final Iterable<? extends AddReferencesItem> addReferencesItem) {
            if (addReferencesItem!= null) {
                if (this.addReferencesItem == null) {
                    this.addReferencesItem = new ArrayList<AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>>>();
                }
                for (AddReferencesItem _item: addReferencesItem) {
                    this.addReferencesItem.add(new AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addReferencesItem" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param addReferencesItem
         *     Neuer Wert der Eigenschaft "addReferencesItem".
         */
        public ListOfAddReferencesItem.Builder<_B> withAddReferencesItem(final Iterable<? extends AddReferencesItem> addReferencesItem) {
            if (this.addReferencesItem!= null) {
                this.addReferencesItem.clear();
            }
            return addAddReferencesItem(addReferencesItem);
        }

        /**
         * Fügt Werte zur Eigenschaft "addReferencesItem" hinzu.
         * 
         * @param addReferencesItem
         *     Werte, die zur Eigenschaft "addReferencesItem" hinzugefügt werden.
         */
        public ListOfAddReferencesItem.Builder<_B> addAddReferencesItem(AddReferencesItem... addReferencesItem) {
            addAddReferencesItem(Arrays.asList(addReferencesItem));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addReferencesItem" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param addReferencesItem
         *     Neuer Wert der Eigenschaft "addReferencesItem".
         */
        public ListOfAddReferencesItem.Builder<_B> withAddReferencesItem(AddReferencesItem... addReferencesItem) {
            withAddReferencesItem(Arrays.asList(addReferencesItem));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "AddReferencesItem".
         * Mit {@link org.opcfoundation.ua._2008._02.types.AddReferencesItem.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "AddReferencesItem".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.AddReferencesItem.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public AddReferencesItem.Builder<? extends ListOfAddReferencesItem.Builder<_B>> addAddReferencesItem() {
            if (this.addReferencesItem == null) {
                this.addReferencesItem = new ArrayList<AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>>>();
            }
            final AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>> addReferencesItem_Builder = new AddReferencesItem.Builder<ListOfAddReferencesItem.Builder<_B>>(this, null, false);
            this.addReferencesItem.add(addReferencesItem_Builder);
            return addReferencesItem_Builder;
        }

        @Override
        public ListOfAddReferencesItem build() {
            if (_storedValue == null) {
                return this.init(new ListOfAddReferencesItem());
            } else {
                return ((ListOfAddReferencesItem) _storedValue);
            }
        }

        public ListOfAddReferencesItem.Builder<_B> copyOf(final ListOfAddReferencesItem _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfAddReferencesItem.Builder<_B> copyOf(final ListOfAddReferencesItem.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfAddReferencesItem.Selector<ListOfAddReferencesItem.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfAddReferencesItem.Select _root() {
            return new ListOfAddReferencesItem.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private AddReferencesItem.Selector<TRoot, ListOfAddReferencesItem.Selector<TRoot, TParent>> addReferencesItem = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.addReferencesItem!= null) {
                products.put("addReferencesItem", this.addReferencesItem.init());
            }
            return products;
        }

        public AddReferencesItem.Selector<TRoot, ListOfAddReferencesItem.Selector<TRoot, TParent>> addReferencesItem() {
            return ((this.addReferencesItem == null)?this.addReferencesItem = new AddReferencesItem.Selector<TRoot, ListOfAddReferencesItem.Selector<TRoot, TParent>>(this._root, this, "addReferencesItem"):this.addReferencesItem);
        }

    }

}
