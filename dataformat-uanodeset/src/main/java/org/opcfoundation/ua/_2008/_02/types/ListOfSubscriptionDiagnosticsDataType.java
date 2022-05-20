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
 * <p>Java-Klasse für ListOfSubscriptionDiagnosticsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSubscriptionDiagnosticsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionDiagnosticsDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SubscriptionDiagnosticsDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSubscriptionDiagnosticsDataType", propOrder = {
    "subscriptionDiagnosticsDataType"
})
public class ListOfSubscriptionDiagnosticsDataType {

    @XmlElement(name = "SubscriptionDiagnosticsDataType", nillable = true)
    protected List<SubscriptionDiagnosticsDataType> subscriptionDiagnosticsDataType;

    /**
     * Gets the value of the subscriptionDiagnosticsDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionDiagnosticsDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionDiagnosticsDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionDiagnosticsDataType }
     * 
     * 
     */
    public List<SubscriptionDiagnosticsDataType> getSubscriptionDiagnosticsDataType() {
        if (subscriptionDiagnosticsDataType == null) {
            subscriptionDiagnosticsDataType = new ArrayList<SubscriptionDiagnosticsDataType>();
        }
        return this.subscriptionDiagnosticsDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSubscriptionDiagnosticsDataType.Builder<_B> _other) {
        if (this.subscriptionDiagnosticsDataType == null) {
            _other.subscriptionDiagnosticsDataType = null;
        } else {
            _other.subscriptionDiagnosticsDataType = new ArrayList<SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>>>();
            for (SubscriptionDiagnosticsDataType _item: this.subscriptionDiagnosticsDataType) {
                _other.subscriptionDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSubscriptionDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSubscriptionDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSubscriptionDiagnosticsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSubscriptionDiagnosticsDataType.Builder<Void> builder() {
        return new ListOfSubscriptionDiagnosticsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSubscriptionDiagnosticsDataType.Builder<_B> copyOf(final ListOfSubscriptionDiagnosticsDataType _other) {
        final ListOfSubscriptionDiagnosticsDataType.Builder<_B> _newBuilder = new ListOfSubscriptionDiagnosticsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSubscriptionDiagnosticsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree subscriptionDiagnosticsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionDiagnosticsDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionDiagnosticsDataTypePropertyTree!= null):((subscriptionDiagnosticsDataTypePropertyTree == null)||(!subscriptionDiagnosticsDataTypePropertyTree.isLeaf())))) {
            if (this.subscriptionDiagnosticsDataType == null) {
                _other.subscriptionDiagnosticsDataType = null;
            } else {
                _other.subscriptionDiagnosticsDataType = new ArrayList<SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>>>();
                for (SubscriptionDiagnosticsDataType _item: this.subscriptionDiagnosticsDataType) {
                    _other.subscriptionDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, subscriptionDiagnosticsDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSubscriptionDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSubscriptionDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSubscriptionDiagnosticsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSubscriptionDiagnosticsDataType.Builder<_B> copyOf(final ListOfSubscriptionDiagnosticsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSubscriptionDiagnosticsDataType.Builder<_B> _newBuilder = new ListOfSubscriptionDiagnosticsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSubscriptionDiagnosticsDataType.Builder<Void> copyExcept(final ListOfSubscriptionDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSubscriptionDiagnosticsDataType.Builder<Void> copyOnly(final ListOfSubscriptionDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSubscriptionDiagnosticsDataType _storedValue;
        private List<SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>>> subscriptionDiagnosticsDataType;

        public Builder(final _B _parentBuilder, final ListOfSubscriptionDiagnosticsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.subscriptionDiagnosticsDataType == null) {
                        this.subscriptionDiagnosticsDataType = null;
                    } else {
                        this.subscriptionDiagnosticsDataType = new ArrayList<SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>>>();
                        for (SubscriptionDiagnosticsDataType _item: _other.subscriptionDiagnosticsDataType) {
                            this.subscriptionDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSubscriptionDiagnosticsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree subscriptionDiagnosticsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionDiagnosticsDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionDiagnosticsDataTypePropertyTree!= null):((subscriptionDiagnosticsDataTypePropertyTree == null)||(!subscriptionDiagnosticsDataTypePropertyTree.isLeaf())))) {
                        if (_other.subscriptionDiagnosticsDataType == null) {
                            this.subscriptionDiagnosticsDataType = null;
                        } else {
                            this.subscriptionDiagnosticsDataType = new ArrayList<SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>>>();
                            for (SubscriptionDiagnosticsDataType _item: _other.subscriptionDiagnosticsDataType) {
                                this.subscriptionDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(this, subscriptionDiagnosticsDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSubscriptionDiagnosticsDataType >_P init(final _P _product) {
            if (this.subscriptionDiagnosticsDataType!= null) {
                final List<SubscriptionDiagnosticsDataType> subscriptionDiagnosticsDataType = new ArrayList<SubscriptionDiagnosticsDataType>(this.subscriptionDiagnosticsDataType.size());
                for (SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>> _item: this.subscriptionDiagnosticsDataType) {
                    subscriptionDiagnosticsDataType.add(_item.build());
                }
                _product.subscriptionDiagnosticsDataType = subscriptionDiagnosticsDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "subscriptionDiagnosticsDataType" hinzu.
         * 
         * @param subscriptionDiagnosticsDataType
         *     Werte, die zur Eigenschaft "subscriptionDiagnosticsDataType" hinzugefügt werden.
         */
        public ListOfSubscriptionDiagnosticsDataType.Builder<_B> addSubscriptionDiagnosticsDataType(final Iterable<? extends SubscriptionDiagnosticsDataType> subscriptionDiagnosticsDataType) {
            if (subscriptionDiagnosticsDataType!= null) {
                if (this.subscriptionDiagnosticsDataType == null) {
                    this.subscriptionDiagnosticsDataType = new ArrayList<SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>>>();
                }
                for (SubscriptionDiagnosticsDataType _item: subscriptionDiagnosticsDataType) {
                    this.subscriptionDiagnosticsDataType.add(new SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionDiagnosticsDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param subscriptionDiagnosticsDataType
         *     Neuer Wert der Eigenschaft "subscriptionDiagnosticsDataType".
         */
        public ListOfSubscriptionDiagnosticsDataType.Builder<_B> withSubscriptionDiagnosticsDataType(final Iterable<? extends SubscriptionDiagnosticsDataType> subscriptionDiagnosticsDataType) {
            if (this.subscriptionDiagnosticsDataType!= null) {
                this.subscriptionDiagnosticsDataType.clear();
            }
            return addSubscriptionDiagnosticsDataType(subscriptionDiagnosticsDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "subscriptionDiagnosticsDataType" hinzu.
         * 
         * @param subscriptionDiagnosticsDataType
         *     Werte, die zur Eigenschaft "subscriptionDiagnosticsDataType" hinzugefügt werden.
         */
        public ListOfSubscriptionDiagnosticsDataType.Builder<_B> addSubscriptionDiagnosticsDataType(SubscriptionDiagnosticsDataType... subscriptionDiagnosticsDataType) {
            addSubscriptionDiagnosticsDataType(Arrays.asList(subscriptionDiagnosticsDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionDiagnosticsDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param subscriptionDiagnosticsDataType
         *     Neuer Wert der Eigenschaft "subscriptionDiagnosticsDataType".
         */
        public ListOfSubscriptionDiagnosticsDataType.Builder<_B> withSubscriptionDiagnosticsDataType(SubscriptionDiagnosticsDataType... subscriptionDiagnosticsDataType) {
            withSubscriptionDiagnosticsDataType(Arrays.asList(subscriptionDiagnosticsDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SubscriptionDiagnosticsDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SubscriptionDiagnosticsDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SubscriptionDiagnosticsDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public SubscriptionDiagnosticsDataType.Builder<? extends ListOfSubscriptionDiagnosticsDataType.Builder<_B>> addSubscriptionDiagnosticsDataType() {
            if (this.subscriptionDiagnosticsDataType == null) {
                this.subscriptionDiagnosticsDataType = new ArrayList<SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>>>();
            }
            final SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>> subscriptionDiagnosticsDataType_Builder = new SubscriptionDiagnosticsDataType.Builder<ListOfSubscriptionDiagnosticsDataType.Builder<_B>>(this, null, false);
            this.subscriptionDiagnosticsDataType.add(subscriptionDiagnosticsDataType_Builder);
            return subscriptionDiagnosticsDataType_Builder;
        }

        @Override
        public ListOfSubscriptionDiagnosticsDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfSubscriptionDiagnosticsDataType());
            } else {
                return ((ListOfSubscriptionDiagnosticsDataType) _storedValue);
            }
        }

        public ListOfSubscriptionDiagnosticsDataType.Builder<_B> copyOf(final ListOfSubscriptionDiagnosticsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSubscriptionDiagnosticsDataType.Builder<_B> copyOf(final ListOfSubscriptionDiagnosticsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSubscriptionDiagnosticsDataType.Selector<ListOfSubscriptionDiagnosticsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSubscriptionDiagnosticsDataType.Select _root() {
            return new ListOfSubscriptionDiagnosticsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SubscriptionDiagnosticsDataType.Selector<TRoot, ListOfSubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> subscriptionDiagnosticsDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.subscriptionDiagnosticsDataType!= null) {
                products.put("subscriptionDiagnosticsDataType", this.subscriptionDiagnosticsDataType.init());
            }
            return products;
        }

        public SubscriptionDiagnosticsDataType.Selector<TRoot, ListOfSubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> subscriptionDiagnosticsDataType() {
            return ((this.subscriptionDiagnosticsDataType == null)?this.subscriptionDiagnosticsDataType = new SubscriptionDiagnosticsDataType.Selector<TRoot, ListOfSubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "subscriptionDiagnosticsDataType"):this.subscriptionDiagnosticsDataType);
        }

    }

}
