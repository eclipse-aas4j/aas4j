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
 * <p>Java-Klasse für ListOfDeleteNodesItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDeleteNodesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeleteNodesItem" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DeleteNodesItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDeleteNodesItem", propOrder = {
    "deleteNodesItem"
})
public class ListOfDeleteNodesItem {

    @XmlElement(name = "DeleteNodesItem", nillable = true)
    protected List<DeleteNodesItem> deleteNodesItem;

    /**
     * Gets the value of the deleteNodesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteNodesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteNodesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteNodesItem }
     * 
     * 
     */
    public List<DeleteNodesItem> getDeleteNodesItem() {
        if (deleteNodesItem == null) {
            deleteNodesItem = new ArrayList<DeleteNodesItem>();
        }
        return this.deleteNodesItem;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDeleteNodesItem.Builder<_B> _other) {
        if (this.deleteNodesItem == null) {
            _other.deleteNodesItem = null;
        } else {
            _other.deleteNodesItem = new ArrayList<DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>>>();
            for (DeleteNodesItem _item: this.deleteNodesItem) {
                _other.deleteNodesItem.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDeleteNodesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDeleteNodesItem.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDeleteNodesItem.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDeleteNodesItem.Builder<Void> builder() {
        return new ListOfDeleteNodesItem.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDeleteNodesItem.Builder<_B> copyOf(final ListOfDeleteNodesItem _other) {
        final ListOfDeleteNodesItem.Builder<_B> _newBuilder = new ListOfDeleteNodesItem.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDeleteNodesItem.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree deleteNodesItemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteNodesItem"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteNodesItemPropertyTree!= null):((deleteNodesItemPropertyTree == null)||(!deleteNodesItemPropertyTree.isLeaf())))) {
            if (this.deleteNodesItem == null) {
                _other.deleteNodesItem = null;
            } else {
                _other.deleteNodesItem = new ArrayList<DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>>>();
                for (DeleteNodesItem _item: this.deleteNodesItem) {
                    _other.deleteNodesItem.add(((_item == null)?null:_item.newCopyBuilder(_other, deleteNodesItemPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDeleteNodesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDeleteNodesItem.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDeleteNodesItem.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDeleteNodesItem.Builder<_B> copyOf(final ListOfDeleteNodesItem _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDeleteNodesItem.Builder<_B> _newBuilder = new ListOfDeleteNodesItem.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDeleteNodesItem.Builder<Void> copyExcept(final ListOfDeleteNodesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDeleteNodesItem.Builder<Void> copyOnly(final ListOfDeleteNodesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDeleteNodesItem _storedValue;
        private List<DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>>> deleteNodesItem;

        public Builder(final _B _parentBuilder, final ListOfDeleteNodesItem _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.deleteNodesItem == null) {
                        this.deleteNodesItem = null;
                    } else {
                        this.deleteNodesItem = new ArrayList<DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>>>();
                        for (DeleteNodesItem _item: _other.deleteNodesItem) {
                            this.deleteNodesItem.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDeleteNodesItem _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree deleteNodesItemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteNodesItem"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteNodesItemPropertyTree!= null):((deleteNodesItemPropertyTree == null)||(!deleteNodesItemPropertyTree.isLeaf())))) {
                        if (_other.deleteNodesItem == null) {
                            this.deleteNodesItem = null;
                        } else {
                            this.deleteNodesItem = new ArrayList<DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>>>();
                            for (DeleteNodesItem _item: _other.deleteNodesItem) {
                                this.deleteNodesItem.add(((_item == null)?null:_item.newCopyBuilder(this, deleteNodesItemPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDeleteNodesItem >_P init(final _P _product) {
            if (this.deleteNodesItem!= null) {
                final List<DeleteNodesItem> deleteNodesItem = new ArrayList<DeleteNodesItem>(this.deleteNodesItem.size());
                for (DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>> _item: this.deleteNodesItem) {
                    deleteNodesItem.add(_item.build());
                }
                _product.deleteNodesItem = deleteNodesItem;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "deleteNodesItem" hinzu.
         * 
         * @param deleteNodesItem
         *     Werte, die zur Eigenschaft "deleteNodesItem" hinzugefügt werden.
         */
        public ListOfDeleteNodesItem.Builder<_B> addDeleteNodesItem(final Iterable<? extends DeleteNodesItem> deleteNodesItem) {
            if (deleteNodesItem!= null) {
                if (this.deleteNodesItem == null) {
                    this.deleteNodesItem = new ArrayList<DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>>>();
                }
                for (DeleteNodesItem _item: deleteNodesItem) {
                    this.deleteNodesItem.add(new DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteNodesItem" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param deleteNodesItem
         *     Neuer Wert der Eigenschaft "deleteNodesItem".
         */
        public ListOfDeleteNodesItem.Builder<_B> withDeleteNodesItem(final Iterable<? extends DeleteNodesItem> deleteNodesItem) {
            if (this.deleteNodesItem!= null) {
                this.deleteNodesItem.clear();
            }
            return addDeleteNodesItem(deleteNodesItem);
        }

        /**
         * Fügt Werte zur Eigenschaft "deleteNodesItem" hinzu.
         * 
         * @param deleteNodesItem
         *     Werte, die zur Eigenschaft "deleteNodesItem" hinzugefügt werden.
         */
        public ListOfDeleteNodesItem.Builder<_B> addDeleteNodesItem(DeleteNodesItem... deleteNodesItem) {
            addDeleteNodesItem(Arrays.asList(deleteNodesItem));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteNodesItem" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param deleteNodesItem
         *     Neuer Wert der Eigenschaft "deleteNodesItem".
         */
        public ListOfDeleteNodesItem.Builder<_B> withDeleteNodesItem(DeleteNodesItem... deleteNodesItem) {
            withDeleteNodesItem(Arrays.asList(deleteNodesItem));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DeleteNodesItem".
         * Mit {@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DeleteNodesItem".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.DeleteNodesItem.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public DeleteNodesItem.Builder<? extends ListOfDeleteNodesItem.Builder<_B>> addDeleteNodesItem() {
            if (this.deleteNodesItem == null) {
                this.deleteNodesItem = new ArrayList<DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>>>();
            }
            final DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>> deleteNodesItem_Builder = new DeleteNodesItem.Builder<ListOfDeleteNodesItem.Builder<_B>>(this, null, false);
            this.deleteNodesItem.add(deleteNodesItem_Builder);
            return deleteNodesItem_Builder;
        }

        @Override
        public ListOfDeleteNodesItem build() {
            if (_storedValue == null) {
                return this.init(new ListOfDeleteNodesItem());
            } else {
                return ((ListOfDeleteNodesItem) _storedValue);
            }
        }

        public ListOfDeleteNodesItem.Builder<_B> copyOf(final ListOfDeleteNodesItem _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDeleteNodesItem.Builder<_B> copyOf(final ListOfDeleteNodesItem.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDeleteNodesItem.Selector<ListOfDeleteNodesItem.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDeleteNodesItem.Select _root() {
            return new ListOfDeleteNodesItem.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DeleteNodesItem.Selector<TRoot, ListOfDeleteNodesItem.Selector<TRoot, TParent>> deleteNodesItem = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.deleteNodesItem!= null) {
                products.put("deleteNodesItem", this.deleteNodesItem.init());
            }
            return products;
        }

        public DeleteNodesItem.Selector<TRoot, ListOfDeleteNodesItem.Selector<TRoot, TParent>> deleteNodesItem() {
            return ((this.deleteNodesItem == null)?this.deleteNodesItem = new DeleteNodesItem.Selector<TRoot, ListOfDeleteNodesItem.Selector<TRoot, TParent>>(this._root, this, "deleteNodesItem"):this.deleteNodesItem);
        }

    }

}
