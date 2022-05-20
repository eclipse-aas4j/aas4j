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
 * <p>Java-Klasse für ListOfSubscribedDataSetDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSubscribedDataSetDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscribedDataSetDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SubscribedDataSetDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSubscribedDataSetDataType", propOrder = {
    "subscribedDataSetDataType"
})
public class ListOfSubscribedDataSetDataType {

    @XmlElement(name = "SubscribedDataSetDataType", nillable = true)
    protected List<SubscribedDataSetDataType> subscribedDataSetDataType;

    /**
     * Gets the value of the subscribedDataSetDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscribedDataSetDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscribedDataSetDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscribedDataSetDataType }
     * 
     * 
     */
    public List<SubscribedDataSetDataType> getSubscribedDataSetDataType() {
        if (subscribedDataSetDataType == null) {
            subscribedDataSetDataType = new ArrayList<SubscribedDataSetDataType>();
        }
        return this.subscribedDataSetDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSubscribedDataSetDataType.Builder<_B> _other) {
        if (this.subscribedDataSetDataType == null) {
            _other.subscribedDataSetDataType = null;
        } else {
            _other.subscribedDataSetDataType = new ArrayList<SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>>>();
            for (SubscribedDataSetDataType _item: this.subscribedDataSetDataType) {
                _other.subscribedDataSetDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSubscribedDataSetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSubscribedDataSetDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSubscribedDataSetDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSubscribedDataSetDataType.Builder<Void> builder() {
        return new ListOfSubscribedDataSetDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSubscribedDataSetDataType.Builder<_B> copyOf(final ListOfSubscribedDataSetDataType _other) {
        final ListOfSubscribedDataSetDataType.Builder<_B> _newBuilder = new ListOfSubscribedDataSetDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSubscribedDataSetDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree subscribedDataSetDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscribedDataSetDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscribedDataSetDataTypePropertyTree!= null):((subscribedDataSetDataTypePropertyTree == null)||(!subscribedDataSetDataTypePropertyTree.isLeaf())))) {
            if (this.subscribedDataSetDataType == null) {
                _other.subscribedDataSetDataType = null;
            } else {
                _other.subscribedDataSetDataType = new ArrayList<SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>>>();
                for (SubscribedDataSetDataType _item: this.subscribedDataSetDataType) {
                    _other.subscribedDataSetDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, subscribedDataSetDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSubscribedDataSetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSubscribedDataSetDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSubscribedDataSetDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSubscribedDataSetDataType.Builder<_B> copyOf(final ListOfSubscribedDataSetDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSubscribedDataSetDataType.Builder<_B> _newBuilder = new ListOfSubscribedDataSetDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSubscribedDataSetDataType.Builder<Void> copyExcept(final ListOfSubscribedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSubscribedDataSetDataType.Builder<Void> copyOnly(final ListOfSubscribedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSubscribedDataSetDataType _storedValue;
        private List<SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>>> subscribedDataSetDataType;

        public Builder(final _B _parentBuilder, final ListOfSubscribedDataSetDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.subscribedDataSetDataType == null) {
                        this.subscribedDataSetDataType = null;
                    } else {
                        this.subscribedDataSetDataType = new ArrayList<SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>>>();
                        for (SubscribedDataSetDataType _item: _other.subscribedDataSetDataType) {
                            this.subscribedDataSetDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSubscribedDataSetDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree subscribedDataSetDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscribedDataSetDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscribedDataSetDataTypePropertyTree!= null):((subscribedDataSetDataTypePropertyTree == null)||(!subscribedDataSetDataTypePropertyTree.isLeaf())))) {
                        if (_other.subscribedDataSetDataType == null) {
                            this.subscribedDataSetDataType = null;
                        } else {
                            this.subscribedDataSetDataType = new ArrayList<SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>>>();
                            for (SubscribedDataSetDataType _item: _other.subscribedDataSetDataType) {
                                this.subscribedDataSetDataType.add(((_item == null)?null:_item.newCopyBuilder(this, subscribedDataSetDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSubscribedDataSetDataType >_P init(final _P _product) {
            if (this.subscribedDataSetDataType!= null) {
                final List<SubscribedDataSetDataType> subscribedDataSetDataType = new ArrayList<SubscribedDataSetDataType>(this.subscribedDataSetDataType.size());
                for (SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>> _item: this.subscribedDataSetDataType) {
                    subscribedDataSetDataType.add(_item.build());
                }
                _product.subscribedDataSetDataType = subscribedDataSetDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "subscribedDataSetDataType" hinzu.
         * 
         * @param subscribedDataSetDataType
         *     Werte, die zur Eigenschaft "subscribedDataSetDataType" hinzugefügt werden.
         */
        public ListOfSubscribedDataSetDataType.Builder<_B> addSubscribedDataSetDataType(final Iterable<? extends SubscribedDataSetDataType> subscribedDataSetDataType) {
            if (subscribedDataSetDataType!= null) {
                if (this.subscribedDataSetDataType == null) {
                    this.subscribedDataSetDataType = new ArrayList<SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>>>();
                }
                for (SubscribedDataSetDataType _item: subscribedDataSetDataType) {
                    this.subscribedDataSetDataType.add(new SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscribedDataSetDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param subscribedDataSetDataType
         *     Neuer Wert der Eigenschaft "subscribedDataSetDataType".
         */
        public ListOfSubscribedDataSetDataType.Builder<_B> withSubscribedDataSetDataType(final Iterable<? extends SubscribedDataSetDataType> subscribedDataSetDataType) {
            if (this.subscribedDataSetDataType!= null) {
                this.subscribedDataSetDataType.clear();
            }
            return addSubscribedDataSetDataType(subscribedDataSetDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "subscribedDataSetDataType" hinzu.
         * 
         * @param subscribedDataSetDataType
         *     Werte, die zur Eigenschaft "subscribedDataSetDataType" hinzugefügt werden.
         */
        public ListOfSubscribedDataSetDataType.Builder<_B> addSubscribedDataSetDataType(SubscribedDataSetDataType... subscribedDataSetDataType) {
            addSubscribedDataSetDataType(Arrays.asList(subscribedDataSetDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscribedDataSetDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param subscribedDataSetDataType
         *     Neuer Wert der Eigenschaft "subscribedDataSetDataType".
         */
        public ListOfSubscribedDataSetDataType.Builder<_B> withSubscribedDataSetDataType(SubscribedDataSetDataType... subscribedDataSetDataType) {
            withSubscribedDataSetDataType(Arrays.asList(subscribedDataSetDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SubscribedDataSetDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SubscribedDataSetDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SubscribedDataSetDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SubscribedDataSetDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public SubscribedDataSetDataType.Builder<? extends ListOfSubscribedDataSetDataType.Builder<_B>> addSubscribedDataSetDataType() {
            if (this.subscribedDataSetDataType == null) {
                this.subscribedDataSetDataType = new ArrayList<SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>>>();
            }
            final SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>> subscribedDataSetDataType_Builder = new SubscribedDataSetDataType.Builder<ListOfSubscribedDataSetDataType.Builder<_B>>(this, null, false);
            this.subscribedDataSetDataType.add(subscribedDataSetDataType_Builder);
            return subscribedDataSetDataType_Builder;
        }

        @Override
        public ListOfSubscribedDataSetDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfSubscribedDataSetDataType());
            } else {
                return ((ListOfSubscribedDataSetDataType) _storedValue);
            }
        }

        public ListOfSubscribedDataSetDataType.Builder<_B> copyOf(final ListOfSubscribedDataSetDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSubscribedDataSetDataType.Builder<_B> copyOf(final ListOfSubscribedDataSetDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSubscribedDataSetDataType.Selector<ListOfSubscribedDataSetDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSubscribedDataSetDataType.Select _root() {
            return new ListOfSubscribedDataSetDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SubscribedDataSetDataType.Selector<TRoot, ListOfSubscribedDataSetDataType.Selector<TRoot, TParent>> subscribedDataSetDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.subscribedDataSetDataType!= null) {
                products.put("subscribedDataSetDataType", this.subscribedDataSetDataType.init());
            }
            return products;
        }

        public SubscribedDataSetDataType.Selector<TRoot, ListOfSubscribedDataSetDataType.Selector<TRoot, TParent>> subscribedDataSetDataType() {
            return ((this.subscribedDataSetDataType == null)?this.subscribedDataSetDataType = new SubscribedDataSetDataType.Selector<TRoot, ListOfSubscribedDataSetDataType.Selector<TRoot, TParent>>(this._root, this, "subscribedDataSetDataType"):this.subscribedDataSetDataType);
        }

    }

}
