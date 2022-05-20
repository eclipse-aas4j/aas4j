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
 * <p>Java-Klasse für ListOfTrustListDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfTrustListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrustListDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}TrustListDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfTrustListDataType", propOrder = {
    "trustListDataType"
})
public class ListOfTrustListDataType {

    @XmlElement(name = "TrustListDataType", nillable = true)
    protected List<TrustListDataType> trustListDataType;

    /**
     * Gets the value of the trustListDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustListDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustListDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrustListDataType }
     * 
     * 
     */
    public List<TrustListDataType> getTrustListDataType() {
        if (trustListDataType == null) {
            trustListDataType = new ArrayList<TrustListDataType>();
        }
        return this.trustListDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfTrustListDataType.Builder<_B> _other) {
        if (this.trustListDataType == null) {
            _other.trustListDataType = null;
        } else {
            _other.trustListDataType = new ArrayList<TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>>>();
            for (TrustListDataType _item: this.trustListDataType) {
                _other.trustListDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfTrustListDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfTrustListDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfTrustListDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfTrustListDataType.Builder<Void> builder() {
        return new ListOfTrustListDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfTrustListDataType.Builder<_B> copyOf(final ListOfTrustListDataType _other) {
        final ListOfTrustListDataType.Builder<_B> _newBuilder = new ListOfTrustListDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfTrustListDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree trustListDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("trustListDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(trustListDataTypePropertyTree!= null):((trustListDataTypePropertyTree == null)||(!trustListDataTypePropertyTree.isLeaf())))) {
            if (this.trustListDataType == null) {
                _other.trustListDataType = null;
            } else {
                _other.trustListDataType = new ArrayList<TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>>>();
                for (TrustListDataType _item: this.trustListDataType) {
                    _other.trustListDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, trustListDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfTrustListDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfTrustListDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfTrustListDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfTrustListDataType.Builder<_B> copyOf(final ListOfTrustListDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfTrustListDataType.Builder<_B> _newBuilder = new ListOfTrustListDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfTrustListDataType.Builder<Void> copyExcept(final ListOfTrustListDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfTrustListDataType.Builder<Void> copyOnly(final ListOfTrustListDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfTrustListDataType _storedValue;
        private List<TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>>> trustListDataType;

        public Builder(final _B _parentBuilder, final ListOfTrustListDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.trustListDataType == null) {
                        this.trustListDataType = null;
                    } else {
                        this.trustListDataType = new ArrayList<TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>>>();
                        for (TrustListDataType _item: _other.trustListDataType) {
                            this.trustListDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfTrustListDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree trustListDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("trustListDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(trustListDataTypePropertyTree!= null):((trustListDataTypePropertyTree == null)||(!trustListDataTypePropertyTree.isLeaf())))) {
                        if (_other.trustListDataType == null) {
                            this.trustListDataType = null;
                        } else {
                            this.trustListDataType = new ArrayList<TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>>>();
                            for (TrustListDataType _item: _other.trustListDataType) {
                                this.trustListDataType.add(((_item == null)?null:_item.newCopyBuilder(this, trustListDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfTrustListDataType >_P init(final _P _product) {
            if (this.trustListDataType!= null) {
                final List<TrustListDataType> trustListDataType = new ArrayList<TrustListDataType>(this.trustListDataType.size());
                for (TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>> _item: this.trustListDataType) {
                    trustListDataType.add(_item.build());
                }
                _product.trustListDataType = trustListDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "trustListDataType" hinzu.
         * 
         * @param trustListDataType
         *     Werte, die zur Eigenschaft "trustListDataType" hinzugefügt werden.
         */
        public ListOfTrustListDataType.Builder<_B> addTrustListDataType(final Iterable<? extends TrustListDataType> trustListDataType) {
            if (trustListDataType!= null) {
                if (this.trustListDataType == null) {
                    this.trustListDataType = new ArrayList<TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>>>();
                }
                for (TrustListDataType _item: trustListDataType) {
                    this.trustListDataType.add(new TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "trustListDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param trustListDataType
         *     Neuer Wert der Eigenschaft "trustListDataType".
         */
        public ListOfTrustListDataType.Builder<_B> withTrustListDataType(final Iterable<? extends TrustListDataType> trustListDataType) {
            if (this.trustListDataType!= null) {
                this.trustListDataType.clear();
            }
            return addTrustListDataType(trustListDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "trustListDataType" hinzu.
         * 
         * @param trustListDataType
         *     Werte, die zur Eigenschaft "trustListDataType" hinzugefügt werden.
         */
        public ListOfTrustListDataType.Builder<_B> addTrustListDataType(TrustListDataType... trustListDataType) {
            addTrustListDataType(Arrays.asList(trustListDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "trustListDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param trustListDataType
         *     Neuer Wert der Eigenschaft "trustListDataType".
         */
        public ListOfTrustListDataType.Builder<_B> withTrustListDataType(TrustListDataType... trustListDataType) {
            withTrustListDataType(Arrays.asList(trustListDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "TrustListDataType".
         * Mit {@link org.opcfoundation.ua._2008._02.types.TrustListDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "TrustListDataType".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.TrustListDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public TrustListDataType.Builder<? extends ListOfTrustListDataType.Builder<_B>> addTrustListDataType() {
            if (this.trustListDataType == null) {
                this.trustListDataType = new ArrayList<TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>>>();
            }
            final TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>> trustListDataType_Builder = new TrustListDataType.Builder<ListOfTrustListDataType.Builder<_B>>(this, null, false);
            this.trustListDataType.add(trustListDataType_Builder);
            return trustListDataType_Builder;
        }

        @Override
        public ListOfTrustListDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfTrustListDataType());
            } else {
                return ((ListOfTrustListDataType) _storedValue);
            }
        }

        public ListOfTrustListDataType.Builder<_B> copyOf(final ListOfTrustListDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfTrustListDataType.Builder<_B> copyOf(final ListOfTrustListDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfTrustListDataType.Selector<ListOfTrustListDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfTrustListDataType.Select _root() {
            return new ListOfTrustListDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private TrustListDataType.Selector<TRoot, ListOfTrustListDataType.Selector<TRoot, TParent>> trustListDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.trustListDataType!= null) {
                products.put("trustListDataType", this.trustListDataType.init());
            }
            return products;
        }

        public TrustListDataType.Selector<TRoot, ListOfTrustListDataType.Selector<TRoot, TParent>> trustListDataType() {
            return ((this.trustListDataType == null)?this.trustListDataType = new TrustListDataType.Selector<TRoot, ListOfTrustListDataType.Selector<TRoot, TParent>>(this._root, this, "trustListDataType"):this.trustListDataType);
        }

    }

}
