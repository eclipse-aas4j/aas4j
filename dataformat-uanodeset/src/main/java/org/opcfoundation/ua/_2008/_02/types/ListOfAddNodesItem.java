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
 * <p>Java-Klasse für ListOfAddNodesItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfAddNodesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddNodesItem" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}AddNodesItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAddNodesItem", propOrder = {
    "addNodesItem"
})
public class ListOfAddNodesItem {

    @XmlElement(name = "AddNodesItem", nillable = true)
    protected List<AddNodesItem> addNodesItem;

    /**
     * Gets the value of the addNodesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addNodesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddNodesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddNodesItem }
     * 
     * 
     */
    public List<AddNodesItem> getAddNodesItem() {
        if (addNodesItem == null) {
            addNodesItem = new ArrayList<AddNodesItem>();
        }
        return this.addNodesItem;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfAddNodesItem.Builder<_B> _other) {
        if (this.addNodesItem == null) {
            _other.addNodesItem = null;
        } else {
            _other.addNodesItem = new ArrayList<AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>>>();
            for (AddNodesItem _item: this.addNodesItem) {
                _other.addNodesItem.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfAddNodesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfAddNodesItem.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfAddNodesItem.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfAddNodesItem.Builder<Void> builder() {
        return new ListOfAddNodesItem.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfAddNodesItem.Builder<_B> copyOf(final ListOfAddNodesItem _other) {
        final ListOfAddNodesItem.Builder<_B> _newBuilder = new ListOfAddNodesItem.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfAddNodesItem.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree addNodesItemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addNodesItem"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addNodesItemPropertyTree!= null):((addNodesItemPropertyTree == null)||(!addNodesItemPropertyTree.isLeaf())))) {
            if (this.addNodesItem == null) {
                _other.addNodesItem = null;
            } else {
                _other.addNodesItem = new ArrayList<AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>>>();
                for (AddNodesItem _item: this.addNodesItem) {
                    _other.addNodesItem.add(((_item == null)?null:_item.newCopyBuilder(_other, addNodesItemPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfAddNodesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfAddNodesItem.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfAddNodesItem.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfAddNodesItem.Builder<_B> copyOf(final ListOfAddNodesItem _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfAddNodesItem.Builder<_B> _newBuilder = new ListOfAddNodesItem.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfAddNodesItem.Builder<Void> copyExcept(final ListOfAddNodesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfAddNodesItem.Builder<Void> copyOnly(final ListOfAddNodesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfAddNodesItem _storedValue;
        private List<AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>>> addNodesItem;

        public Builder(final _B _parentBuilder, final ListOfAddNodesItem _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.addNodesItem == null) {
                        this.addNodesItem = null;
                    } else {
                        this.addNodesItem = new ArrayList<AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>>>();
                        for (AddNodesItem _item: _other.addNodesItem) {
                            this.addNodesItem.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfAddNodesItem _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree addNodesItemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addNodesItem"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addNodesItemPropertyTree!= null):((addNodesItemPropertyTree == null)||(!addNodesItemPropertyTree.isLeaf())))) {
                        if (_other.addNodesItem == null) {
                            this.addNodesItem = null;
                        } else {
                            this.addNodesItem = new ArrayList<AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>>>();
                            for (AddNodesItem _item: _other.addNodesItem) {
                                this.addNodesItem.add(((_item == null)?null:_item.newCopyBuilder(this, addNodesItemPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfAddNodesItem >_P init(final _P _product) {
            if (this.addNodesItem!= null) {
                final List<AddNodesItem> addNodesItem = new ArrayList<AddNodesItem>(this.addNodesItem.size());
                for (AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>> _item: this.addNodesItem) {
                    addNodesItem.add(_item.build());
                }
                _product.addNodesItem = addNodesItem;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "addNodesItem" hinzu.
         * 
         * @param addNodesItem
         *     Werte, die zur Eigenschaft "addNodesItem" hinzugefügt werden.
         */
        public ListOfAddNodesItem.Builder<_B> addAddNodesItem(final Iterable<? extends AddNodesItem> addNodesItem) {
            if (addNodesItem!= null) {
                if (this.addNodesItem == null) {
                    this.addNodesItem = new ArrayList<AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>>>();
                }
                for (AddNodesItem _item: addNodesItem) {
                    this.addNodesItem.add(new AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addNodesItem" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param addNodesItem
         *     Neuer Wert der Eigenschaft "addNodesItem".
         */
        public ListOfAddNodesItem.Builder<_B> withAddNodesItem(final Iterable<? extends AddNodesItem> addNodesItem) {
            if (this.addNodesItem!= null) {
                this.addNodesItem.clear();
            }
            return addAddNodesItem(addNodesItem);
        }

        /**
         * Fügt Werte zur Eigenschaft "addNodesItem" hinzu.
         * 
         * @param addNodesItem
         *     Werte, die zur Eigenschaft "addNodesItem" hinzugefügt werden.
         */
        public ListOfAddNodesItem.Builder<_B> addAddNodesItem(AddNodesItem... addNodesItem) {
            addAddNodesItem(Arrays.asList(addNodesItem));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addNodesItem" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param addNodesItem
         *     Neuer Wert der Eigenschaft "addNodesItem".
         */
        public ListOfAddNodesItem.Builder<_B> withAddNodesItem(AddNodesItem... addNodesItem) {
            withAddNodesItem(Arrays.asList(addNodesItem));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "AddNodesItem".
         * Mit {@link org.opcfoundation.ua._2008._02.types.AddNodesItem.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "AddNodesItem".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.AddNodesItem.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public AddNodesItem.Builder<? extends ListOfAddNodesItem.Builder<_B>> addAddNodesItem() {
            if (this.addNodesItem == null) {
                this.addNodesItem = new ArrayList<AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>>>();
            }
            final AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>> addNodesItem_Builder = new AddNodesItem.Builder<ListOfAddNodesItem.Builder<_B>>(this, null, false);
            this.addNodesItem.add(addNodesItem_Builder);
            return addNodesItem_Builder;
        }

        @Override
        public ListOfAddNodesItem build() {
            if (_storedValue == null) {
                return this.init(new ListOfAddNodesItem());
            } else {
                return ((ListOfAddNodesItem) _storedValue);
            }
        }

        public ListOfAddNodesItem.Builder<_B> copyOf(final ListOfAddNodesItem _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfAddNodesItem.Builder<_B> copyOf(final ListOfAddNodesItem.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfAddNodesItem.Selector<ListOfAddNodesItem.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfAddNodesItem.Select _root() {
            return new ListOfAddNodesItem.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private AddNodesItem.Selector<TRoot, ListOfAddNodesItem.Selector<TRoot, TParent>> addNodesItem = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.addNodesItem!= null) {
                products.put("addNodesItem", this.addNodesItem.init());
            }
            return products;
        }

        public AddNodesItem.Selector<TRoot, ListOfAddNodesItem.Selector<TRoot, TParent>> addNodesItem() {
            return ((this.addNodesItem == null)?this.addNodesItem = new AddNodesItem.Selector<TRoot, ListOfAddNodesItem.Selector<TRoot, TParent>>(this._root, this, "addNodesItem"):this.addNodesItem);
        }

    }

}
