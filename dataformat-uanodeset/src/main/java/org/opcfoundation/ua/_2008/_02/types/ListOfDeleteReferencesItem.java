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
 * <p>Java-Klasse für ListOfDeleteReferencesItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDeleteReferencesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeleteReferencesItem" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DeleteReferencesItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDeleteReferencesItem", propOrder = {
    "deleteReferencesItem"
})
public class ListOfDeleteReferencesItem {

    @XmlElement(name = "DeleteReferencesItem", nillable = true)
    protected List<DeleteReferencesItem> deleteReferencesItem;

    /**
     * Gets the value of the deleteReferencesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteReferencesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteReferencesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteReferencesItem }
     * 
     * 
     */
    public List<DeleteReferencesItem> getDeleteReferencesItem() {
        if (deleteReferencesItem == null) {
            deleteReferencesItem = new ArrayList<DeleteReferencesItem>();
        }
        return this.deleteReferencesItem;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDeleteReferencesItem.Builder<_B> _other) {
        if (this.deleteReferencesItem == null) {
            _other.deleteReferencesItem = null;
        } else {
            _other.deleteReferencesItem = new ArrayList<DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>>>();
            for (DeleteReferencesItem _item: this.deleteReferencesItem) {
                _other.deleteReferencesItem.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDeleteReferencesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDeleteReferencesItem.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDeleteReferencesItem.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDeleteReferencesItem.Builder<Void> builder() {
        return new ListOfDeleteReferencesItem.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDeleteReferencesItem.Builder<_B> copyOf(final ListOfDeleteReferencesItem _other) {
        final ListOfDeleteReferencesItem.Builder<_B> _newBuilder = new ListOfDeleteReferencesItem.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDeleteReferencesItem.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree deleteReferencesItemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteReferencesItem"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteReferencesItemPropertyTree!= null):((deleteReferencesItemPropertyTree == null)||(!deleteReferencesItemPropertyTree.isLeaf())))) {
            if (this.deleteReferencesItem == null) {
                _other.deleteReferencesItem = null;
            } else {
                _other.deleteReferencesItem = new ArrayList<DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>>>();
                for (DeleteReferencesItem _item: this.deleteReferencesItem) {
                    _other.deleteReferencesItem.add(((_item == null)?null:_item.newCopyBuilder(_other, deleteReferencesItemPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDeleteReferencesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDeleteReferencesItem.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDeleteReferencesItem.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDeleteReferencesItem.Builder<_B> copyOf(final ListOfDeleteReferencesItem _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDeleteReferencesItem.Builder<_B> _newBuilder = new ListOfDeleteReferencesItem.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDeleteReferencesItem.Builder<Void> copyExcept(final ListOfDeleteReferencesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDeleteReferencesItem.Builder<Void> copyOnly(final ListOfDeleteReferencesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDeleteReferencesItem _storedValue;
        private List<DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>>> deleteReferencesItem;

        public Builder(final _B _parentBuilder, final ListOfDeleteReferencesItem _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.deleteReferencesItem == null) {
                        this.deleteReferencesItem = null;
                    } else {
                        this.deleteReferencesItem = new ArrayList<DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>>>();
                        for (DeleteReferencesItem _item: _other.deleteReferencesItem) {
                            this.deleteReferencesItem.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDeleteReferencesItem _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree deleteReferencesItemPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteReferencesItem"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteReferencesItemPropertyTree!= null):((deleteReferencesItemPropertyTree == null)||(!deleteReferencesItemPropertyTree.isLeaf())))) {
                        if (_other.deleteReferencesItem == null) {
                            this.deleteReferencesItem = null;
                        } else {
                            this.deleteReferencesItem = new ArrayList<DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>>>();
                            for (DeleteReferencesItem _item: _other.deleteReferencesItem) {
                                this.deleteReferencesItem.add(((_item == null)?null:_item.newCopyBuilder(this, deleteReferencesItemPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDeleteReferencesItem >_P init(final _P _product) {
            if (this.deleteReferencesItem!= null) {
                final List<DeleteReferencesItem> deleteReferencesItem = new ArrayList<DeleteReferencesItem>(this.deleteReferencesItem.size());
                for (DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>> _item: this.deleteReferencesItem) {
                    deleteReferencesItem.add(_item.build());
                }
                _product.deleteReferencesItem = deleteReferencesItem;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "deleteReferencesItem" hinzu.
         * 
         * @param deleteReferencesItem
         *     Werte, die zur Eigenschaft "deleteReferencesItem" hinzugefügt werden.
         */
        public ListOfDeleteReferencesItem.Builder<_B> addDeleteReferencesItem(final Iterable<? extends DeleteReferencesItem> deleteReferencesItem) {
            if (deleteReferencesItem!= null) {
                if (this.deleteReferencesItem == null) {
                    this.deleteReferencesItem = new ArrayList<DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>>>();
                }
                for (DeleteReferencesItem _item: deleteReferencesItem) {
                    this.deleteReferencesItem.add(new DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteReferencesItem" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param deleteReferencesItem
         *     Neuer Wert der Eigenschaft "deleteReferencesItem".
         */
        public ListOfDeleteReferencesItem.Builder<_B> withDeleteReferencesItem(final Iterable<? extends DeleteReferencesItem> deleteReferencesItem) {
            if (this.deleteReferencesItem!= null) {
                this.deleteReferencesItem.clear();
            }
            return addDeleteReferencesItem(deleteReferencesItem);
        }

        /**
         * Fügt Werte zur Eigenschaft "deleteReferencesItem" hinzu.
         * 
         * @param deleteReferencesItem
         *     Werte, die zur Eigenschaft "deleteReferencesItem" hinzugefügt werden.
         */
        public ListOfDeleteReferencesItem.Builder<_B> addDeleteReferencesItem(DeleteReferencesItem... deleteReferencesItem) {
            addDeleteReferencesItem(Arrays.asList(deleteReferencesItem));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteReferencesItem" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param deleteReferencesItem
         *     Neuer Wert der Eigenschaft "deleteReferencesItem".
         */
        public ListOfDeleteReferencesItem.Builder<_B> withDeleteReferencesItem(DeleteReferencesItem... deleteReferencesItem) {
            withDeleteReferencesItem(Arrays.asList(deleteReferencesItem));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DeleteReferencesItem".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DeleteReferencesItem.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DeleteReferencesItem".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DeleteReferencesItem.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public DeleteReferencesItem.Builder<? extends ListOfDeleteReferencesItem.Builder<_B>> addDeleteReferencesItem() {
            if (this.deleteReferencesItem == null) {
                this.deleteReferencesItem = new ArrayList<DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>>>();
            }
            final DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>> deleteReferencesItem_Builder = new DeleteReferencesItem.Builder<ListOfDeleteReferencesItem.Builder<_B>>(this, null, false);
            this.deleteReferencesItem.add(deleteReferencesItem_Builder);
            return deleteReferencesItem_Builder;
        }

        @Override
        public ListOfDeleteReferencesItem build() {
            if (_storedValue == null) {
                return this.init(new ListOfDeleteReferencesItem());
            } else {
                return ((ListOfDeleteReferencesItem) _storedValue);
            }
        }

        public ListOfDeleteReferencesItem.Builder<_B> copyOf(final ListOfDeleteReferencesItem _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDeleteReferencesItem.Builder<_B> copyOf(final ListOfDeleteReferencesItem.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDeleteReferencesItem.Selector<ListOfDeleteReferencesItem.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDeleteReferencesItem.Select _root() {
            return new ListOfDeleteReferencesItem.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DeleteReferencesItem.Selector<TRoot, ListOfDeleteReferencesItem.Selector<TRoot, TParent>> deleteReferencesItem = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.deleteReferencesItem!= null) {
                products.put("deleteReferencesItem", this.deleteReferencesItem.init());
            }
            return products;
        }

        public DeleteReferencesItem.Selector<TRoot, ListOfDeleteReferencesItem.Selector<TRoot, TParent>> deleteReferencesItem() {
            return ((this.deleteReferencesItem == null)?this.deleteReferencesItem = new DeleteReferencesItem.Selector<TRoot, ListOfDeleteReferencesItem.Selector<TRoot, TParent>>(this._root, this, "deleteReferencesItem"):this.deleteReferencesItem);
        }

    }

}
