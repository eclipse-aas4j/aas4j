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
 * <p>Java-Klasse für ListOfSubscribedDataSetMirrorDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSubscribedDataSetMirrorDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscribedDataSetMirrorDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SubscribedDataSetMirrorDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSubscribedDataSetMirrorDataType", propOrder = {
    "subscribedDataSetMirrorDataType"
})
public class ListOfSubscribedDataSetMirrorDataType {

    @XmlElement(name = "SubscribedDataSetMirrorDataType", nillable = true)
    protected List<SubscribedDataSetMirrorDataType> subscribedDataSetMirrorDataType;

    /**
     * Gets the value of the subscribedDataSetMirrorDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscribedDataSetMirrorDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscribedDataSetMirrorDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscribedDataSetMirrorDataType }
     * 
     * 
     */
    public List<SubscribedDataSetMirrorDataType> getSubscribedDataSetMirrorDataType() {
        if (subscribedDataSetMirrorDataType == null) {
            subscribedDataSetMirrorDataType = new ArrayList<SubscribedDataSetMirrorDataType>();
        }
        return this.subscribedDataSetMirrorDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSubscribedDataSetMirrorDataType.Builder<_B> _other) {
        if (this.subscribedDataSetMirrorDataType == null) {
            _other.subscribedDataSetMirrorDataType = null;
        } else {
            _other.subscribedDataSetMirrorDataType = new ArrayList<SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>>>();
            for (SubscribedDataSetMirrorDataType _item: this.subscribedDataSetMirrorDataType) {
                _other.subscribedDataSetMirrorDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSubscribedDataSetMirrorDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSubscribedDataSetMirrorDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSubscribedDataSetMirrorDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSubscribedDataSetMirrorDataType.Builder<Void> builder() {
        return new ListOfSubscribedDataSetMirrorDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSubscribedDataSetMirrorDataType.Builder<_B> copyOf(final ListOfSubscribedDataSetMirrorDataType _other) {
        final ListOfSubscribedDataSetMirrorDataType.Builder<_B> _newBuilder = new ListOfSubscribedDataSetMirrorDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSubscribedDataSetMirrorDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree subscribedDataSetMirrorDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscribedDataSetMirrorDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscribedDataSetMirrorDataTypePropertyTree!= null):((subscribedDataSetMirrorDataTypePropertyTree == null)||(!subscribedDataSetMirrorDataTypePropertyTree.isLeaf())))) {
            if (this.subscribedDataSetMirrorDataType == null) {
                _other.subscribedDataSetMirrorDataType = null;
            } else {
                _other.subscribedDataSetMirrorDataType = new ArrayList<SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>>>();
                for (SubscribedDataSetMirrorDataType _item: this.subscribedDataSetMirrorDataType) {
                    _other.subscribedDataSetMirrorDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, subscribedDataSetMirrorDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSubscribedDataSetMirrorDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSubscribedDataSetMirrorDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSubscribedDataSetMirrorDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSubscribedDataSetMirrorDataType.Builder<_B> copyOf(final ListOfSubscribedDataSetMirrorDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSubscribedDataSetMirrorDataType.Builder<_B> _newBuilder = new ListOfSubscribedDataSetMirrorDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSubscribedDataSetMirrorDataType.Builder<Void> copyExcept(final ListOfSubscribedDataSetMirrorDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSubscribedDataSetMirrorDataType.Builder<Void> copyOnly(final ListOfSubscribedDataSetMirrorDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSubscribedDataSetMirrorDataType _storedValue;
        private List<SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>>> subscribedDataSetMirrorDataType;

        public Builder(final _B _parentBuilder, final ListOfSubscribedDataSetMirrorDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.subscribedDataSetMirrorDataType == null) {
                        this.subscribedDataSetMirrorDataType = null;
                    } else {
                        this.subscribedDataSetMirrorDataType = new ArrayList<SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>>>();
                        for (SubscribedDataSetMirrorDataType _item: _other.subscribedDataSetMirrorDataType) {
                            this.subscribedDataSetMirrorDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSubscribedDataSetMirrorDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree subscribedDataSetMirrorDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscribedDataSetMirrorDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscribedDataSetMirrorDataTypePropertyTree!= null):((subscribedDataSetMirrorDataTypePropertyTree == null)||(!subscribedDataSetMirrorDataTypePropertyTree.isLeaf())))) {
                        if (_other.subscribedDataSetMirrorDataType == null) {
                            this.subscribedDataSetMirrorDataType = null;
                        } else {
                            this.subscribedDataSetMirrorDataType = new ArrayList<SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>>>();
                            for (SubscribedDataSetMirrorDataType _item: _other.subscribedDataSetMirrorDataType) {
                                this.subscribedDataSetMirrorDataType.add(((_item == null)?null:_item.newCopyBuilder(this, subscribedDataSetMirrorDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSubscribedDataSetMirrorDataType >_P init(final _P _product) {
            if (this.subscribedDataSetMirrorDataType!= null) {
                final List<SubscribedDataSetMirrorDataType> subscribedDataSetMirrorDataType = new ArrayList<SubscribedDataSetMirrorDataType>(this.subscribedDataSetMirrorDataType.size());
                for (SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>> _item: this.subscribedDataSetMirrorDataType) {
                    subscribedDataSetMirrorDataType.add(_item.build());
                }
                _product.subscribedDataSetMirrorDataType = subscribedDataSetMirrorDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "subscribedDataSetMirrorDataType" hinzu.
         * 
         * @param subscribedDataSetMirrorDataType
         *     Werte, die zur Eigenschaft "subscribedDataSetMirrorDataType" hinzugefügt werden.
         */
        public ListOfSubscribedDataSetMirrorDataType.Builder<_B> addSubscribedDataSetMirrorDataType(final Iterable<? extends SubscribedDataSetMirrorDataType> subscribedDataSetMirrorDataType) {
            if (subscribedDataSetMirrorDataType!= null) {
                if (this.subscribedDataSetMirrorDataType == null) {
                    this.subscribedDataSetMirrorDataType = new ArrayList<SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>>>();
                }
                for (SubscribedDataSetMirrorDataType _item: subscribedDataSetMirrorDataType) {
                    this.subscribedDataSetMirrorDataType.add(new SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscribedDataSetMirrorDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param subscribedDataSetMirrorDataType
         *     Neuer Wert der Eigenschaft "subscribedDataSetMirrorDataType".
         */
        public ListOfSubscribedDataSetMirrorDataType.Builder<_B> withSubscribedDataSetMirrorDataType(final Iterable<? extends SubscribedDataSetMirrorDataType> subscribedDataSetMirrorDataType) {
            if (this.subscribedDataSetMirrorDataType!= null) {
                this.subscribedDataSetMirrorDataType.clear();
            }
            return addSubscribedDataSetMirrorDataType(subscribedDataSetMirrorDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "subscribedDataSetMirrorDataType" hinzu.
         * 
         * @param subscribedDataSetMirrorDataType
         *     Werte, die zur Eigenschaft "subscribedDataSetMirrorDataType" hinzugefügt werden.
         */
        public ListOfSubscribedDataSetMirrorDataType.Builder<_B> addSubscribedDataSetMirrorDataType(SubscribedDataSetMirrorDataType... subscribedDataSetMirrorDataType) {
            addSubscribedDataSetMirrorDataType(Arrays.asList(subscribedDataSetMirrorDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscribedDataSetMirrorDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param subscribedDataSetMirrorDataType
         *     Neuer Wert der Eigenschaft "subscribedDataSetMirrorDataType".
         */
        public ListOfSubscribedDataSetMirrorDataType.Builder<_B> withSubscribedDataSetMirrorDataType(SubscribedDataSetMirrorDataType... subscribedDataSetMirrorDataType) {
            withSubscribedDataSetMirrorDataType(Arrays.asList(subscribedDataSetMirrorDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SubscribedDataSetMirrorDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SubscribedDataSetMirrorDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SubscribedDataSetMirrorDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public SubscribedDataSetMirrorDataType.Builder<? extends ListOfSubscribedDataSetMirrorDataType.Builder<_B>> addSubscribedDataSetMirrorDataType() {
            if (this.subscribedDataSetMirrorDataType == null) {
                this.subscribedDataSetMirrorDataType = new ArrayList<SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>>>();
            }
            final SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>> subscribedDataSetMirrorDataType_Builder = new SubscribedDataSetMirrorDataType.Builder<ListOfSubscribedDataSetMirrorDataType.Builder<_B>>(this, null, false);
            this.subscribedDataSetMirrorDataType.add(subscribedDataSetMirrorDataType_Builder);
            return subscribedDataSetMirrorDataType_Builder;
        }

        @Override
        public ListOfSubscribedDataSetMirrorDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfSubscribedDataSetMirrorDataType());
            } else {
                return ((ListOfSubscribedDataSetMirrorDataType) _storedValue);
            }
        }

        public ListOfSubscribedDataSetMirrorDataType.Builder<_B> copyOf(final ListOfSubscribedDataSetMirrorDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSubscribedDataSetMirrorDataType.Builder<_B> copyOf(final ListOfSubscribedDataSetMirrorDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSubscribedDataSetMirrorDataType.Selector<ListOfSubscribedDataSetMirrorDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSubscribedDataSetMirrorDataType.Select _root() {
            return new ListOfSubscribedDataSetMirrorDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SubscribedDataSetMirrorDataType.Selector<TRoot, ListOfSubscribedDataSetMirrorDataType.Selector<TRoot, TParent>> subscribedDataSetMirrorDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.subscribedDataSetMirrorDataType!= null) {
                products.put("subscribedDataSetMirrorDataType", this.subscribedDataSetMirrorDataType.init());
            }
            return products;
        }

        public SubscribedDataSetMirrorDataType.Selector<TRoot, ListOfSubscribedDataSetMirrorDataType.Selector<TRoot, TParent>> subscribedDataSetMirrorDataType() {
            return ((this.subscribedDataSetMirrorDataType == null)?this.subscribedDataSetMirrorDataType = new SubscribedDataSetMirrorDataType.Selector<TRoot, ListOfSubscribedDataSetMirrorDataType.Selector<TRoot, TParent>>(this._root, this, "subscribedDataSetMirrorDataType"):this.subscribedDataSetMirrorDataType);
        }

    }

}
