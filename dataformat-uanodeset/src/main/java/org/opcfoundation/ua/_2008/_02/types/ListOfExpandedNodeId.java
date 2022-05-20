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
 * <p>Java-Klasse für ListOfExpandedNodeId complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfExpandedNodeId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpandedNodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfExpandedNodeId", propOrder = {
    "expandedNodeId"
})
public class ListOfExpandedNodeId {

    @XmlElement(name = "ExpandedNodeId", nillable = true)
    protected List<ExpandedNodeId> expandedNodeId;

    /**
     * Gets the value of the expandedNodeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expandedNodeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpandedNodeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpandedNodeId }
     * 
     * 
     */
    public List<ExpandedNodeId> getExpandedNodeId() {
        if (expandedNodeId == null) {
            expandedNodeId = new ArrayList<ExpandedNodeId>();
        }
        return this.expandedNodeId;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfExpandedNodeId.Builder<_B> _other) {
        if (this.expandedNodeId == null) {
            _other.expandedNodeId = null;
        } else {
            _other.expandedNodeId = new ArrayList<ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>>>();
            for (ExpandedNodeId _item: this.expandedNodeId) {
                _other.expandedNodeId.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfExpandedNodeId.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfExpandedNodeId.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfExpandedNodeId.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfExpandedNodeId.Builder<Void> builder() {
        return new ListOfExpandedNodeId.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfExpandedNodeId.Builder<_B> copyOf(final ListOfExpandedNodeId _other) {
        final ListOfExpandedNodeId.Builder<_B> _newBuilder = new ListOfExpandedNodeId.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfExpandedNodeId.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree expandedNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("expandedNodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(expandedNodeIdPropertyTree!= null):((expandedNodeIdPropertyTree == null)||(!expandedNodeIdPropertyTree.isLeaf())))) {
            if (this.expandedNodeId == null) {
                _other.expandedNodeId = null;
            } else {
                _other.expandedNodeId = new ArrayList<ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>>>();
                for (ExpandedNodeId _item: this.expandedNodeId) {
                    _other.expandedNodeId.add(((_item == null)?null:_item.newCopyBuilder(_other, expandedNodeIdPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfExpandedNodeId.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfExpandedNodeId.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfExpandedNodeId.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfExpandedNodeId.Builder<_B> copyOf(final ListOfExpandedNodeId _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfExpandedNodeId.Builder<_B> _newBuilder = new ListOfExpandedNodeId.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfExpandedNodeId.Builder<Void> copyExcept(final ListOfExpandedNodeId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfExpandedNodeId.Builder<Void> copyOnly(final ListOfExpandedNodeId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfExpandedNodeId _storedValue;
        private List<ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>>> expandedNodeId;

        public Builder(final _B _parentBuilder, final ListOfExpandedNodeId _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.expandedNodeId == null) {
                        this.expandedNodeId = null;
                    } else {
                        this.expandedNodeId = new ArrayList<ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>>>();
                        for (ExpandedNodeId _item: _other.expandedNodeId) {
                            this.expandedNodeId.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfExpandedNodeId _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree expandedNodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("expandedNodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(expandedNodeIdPropertyTree!= null):((expandedNodeIdPropertyTree == null)||(!expandedNodeIdPropertyTree.isLeaf())))) {
                        if (_other.expandedNodeId == null) {
                            this.expandedNodeId = null;
                        } else {
                            this.expandedNodeId = new ArrayList<ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>>>();
                            for (ExpandedNodeId _item: _other.expandedNodeId) {
                                this.expandedNodeId.add(((_item == null)?null:_item.newCopyBuilder(this, expandedNodeIdPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfExpandedNodeId >_P init(final _P _product) {
            if (this.expandedNodeId!= null) {
                final List<ExpandedNodeId> expandedNodeId = new ArrayList<ExpandedNodeId>(this.expandedNodeId.size());
                for (ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>> _item: this.expandedNodeId) {
                    expandedNodeId.add(_item.build());
                }
                _product.expandedNodeId = expandedNodeId;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "expandedNodeId" hinzu.
         * 
         * @param expandedNodeId
         *     Werte, die zur Eigenschaft "expandedNodeId" hinzugefügt werden.
         */
        public ListOfExpandedNodeId.Builder<_B> addExpandedNodeId(final Iterable<? extends ExpandedNodeId> expandedNodeId) {
            if (expandedNodeId!= null) {
                if (this.expandedNodeId == null) {
                    this.expandedNodeId = new ArrayList<ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>>>();
                }
                for (ExpandedNodeId _item: expandedNodeId) {
                    this.expandedNodeId.add(new ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "expandedNodeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param expandedNodeId
         *     Neuer Wert der Eigenschaft "expandedNodeId".
         */
        public ListOfExpandedNodeId.Builder<_B> withExpandedNodeId(final Iterable<? extends ExpandedNodeId> expandedNodeId) {
            if (this.expandedNodeId!= null) {
                this.expandedNodeId.clear();
            }
            return addExpandedNodeId(expandedNodeId);
        }

        /**
         * Fügt Werte zur Eigenschaft "expandedNodeId" hinzu.
         * 
         * @param expandedNodeId
         *     Werte, die zur Eigenschaft "expandedNodeId" hinzugefügt werden.
         */
        public ListOfExpandedNodeId.Builder<_B> addExpandedNodeId(ExpandedNodeId... expandedNodeId) {
            addExpandedNodeId(Arrays.asList(expandedNodeId));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "expandedNodeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param expandedNodeId
         *     Neuer Wert der Eigenschaft "expandedNodeId".
         */
        public ListOfExpandedNodeId.Builder<_B> withExpandedNodeId(ExpandedNodeId... expandedNodeId) {
            withExpandedNodeId(Arrays.asList(expandedNodeId));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ExpandedNodeId".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ExpandedNodeId.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ExpandedNodeId".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ExpandedNodeId.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ExpandedNodeId.Builder<? extends ListOfExpandedNodeId.Builder<_B>> addExpandedNodeId() {
            if (this.expandedNodeId == null) {
                this.expandedNodeId = new ArrayList<ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>>>();
            }
            final ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>> expandedNodeId_Builder = new ExpandedNodeId.Builder<ListOfExpandedNodeId.Builder<_B>>(this, null, false);
            this.expandedNodeId.add(expandedNodeId_Builder);
            return expandedNodeId_Builder;
        }

        @Override
        public ListOfExpandedNodeId build() {
            if (_storedValue == null) {
                return this.init(new ListOfExpandedNodeId());
            } else {
                return ((ListOfExpandedNodeId) _storedValue);
            }
        }

        public ListOfExpandedNodeId.Builder<_B> copyOf(final ListOfExpandedNodeId _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfExpandedNodeId.Builder<_B> copyOf(final ListOfExpandedNodeId.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfExpandedNodeId.Selector<ListOfExpandedNodeId.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfExpandedNodeId.Select _root() {
            return new ListOfExpandedNodeId.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ExpandedNodeId.Selector<TRoot, ListOfExpandedNodeId.Selector<TRoot, TParent>> expandedNodeId = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.expandedNodeId!= null) {
                products.put("expandedNodeId", this.expandedNodeId.init());
            }
            return products;
        }

        public ExpandedNodeId.Selector<TRoot, ListOfExpandedNodeId.Selector<TRoot, TParent>> expandedNodeId() {
            return ((this.expandedNodeId == null)?this.expandedNodeId = new ExpandedNodeId.Selector<TRoot, ListOfExpandedNodeId.Selector<TRoot, TParent>>(this._root, this, "expandedNodeId"):this.expandedNodeId);
        }

    }

}
