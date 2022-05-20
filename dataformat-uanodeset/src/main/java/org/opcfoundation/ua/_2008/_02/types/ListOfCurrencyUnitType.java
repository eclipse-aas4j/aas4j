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
 * <p>Java-Klasse für ListOfCurrencyUnitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfCurrencyUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrencyUnitType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}CurrencyUnitType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCurrencyUnitType", propOrder = {
    "currencyUnitType"
})
public class ListOfCurrencyUnitType {

    @XmlElement(name = "CurrencyUnitType", nillable = true)
    protected List<CurrencyUnitType> currencyUnitType;

    /**
     * Gets the value of the currencyUnitType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyUnitType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyUnitType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyUnitType }
     * 
     * 
     */
    public List<CurrencyUnitType> getCurrencyUnitType() {
        if (currencyUnitType == null) {
            currencyUnitType = new ArrayList<CurrencyUnitType>();
        }
        return this.currencyUnitType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfCurrencyUnitType.Builder<_B> _other) {
        if (this.currencyUnitType == null) {
            _other.currencyUnitType = null;
        } else {
            _other.currencyUnitType = new ArrayList<CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>>>();
            for (CurrencyUnitType _item: this.currencyUnitType) {
                _other.currencyUnitType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfCurrencyUnitType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfCurrencyUnitType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfCurrencyUnitType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfCurrencyUnitType.Builder<Void> builder() {
        return new ListOfCurrencyUnitType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfCurrencyUnitType.Builder<_B> copyOf(final ListOfCurrencyUnitType _other) {
        final ListOfCurrencyUnitType.Builder<_B> _newBuilder = new ListOfCurrencyUnitType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfCurrencyUnitType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree currencyUnitTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currencyUnitType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currencyUnitTypePropertyTree!= null):((currencyUnitTypePropertyTree == null)||(!currencyUnitTypePropertyTree.isLeaf())))) {
            if (this.currencyUnitType == null) {
                _other.currencyUnitType = null;
            } else {
                _other.currencyUnitType = new ArrayList<CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>>>();
                for (CurrencyUnitType _item: this.currencyUnitType) {
                    _other.currencyUnitType.add(((_item == null)?null:_item.newCopyBuilder(_other, currencyUnitTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfCurrencyUnitType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfCurrencyUnitType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfCurrencyUnitType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfCurrencyUnitType.Builder<_B> copyOf(final ListOfCurrencyUnitType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfCurrencyUnitType.Builder<_B> _newBuilder = new ListOfCurrencyUnitType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfCurrencyUnitType.Builder<Void> copyExcept(final ListOfCurrencyUnitType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfCurrencyUnitType.Builder<Void> copyOnly(final ListOfCurrencyUnitType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfCurrencyUnitType _storedValue;
        private List<CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>>> currencyUnitType;

        public Builder(final _B _parentBuilder, final ListOfCurrencyUnitType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.currencyUnitType == null) {
                        this.currencyUnitType = null;
                    } else {
                        this.currencyUnitType = new ArrayList<CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>>>();
                        for (CurrencyUnitType _item: _other.currencyUnitType) {
                            this.currencyUnitType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfCurrencyUnitType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree currencyUnitTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currencyUnitType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currencyUnitTypePropertyTree!= null):((currencyUnitTypePropertyTree == null)||(!currencyUnitTypePropertyTree.isLeaf())))) {
                        if (_other.currencyUnitType == null) {
                            this.currencyUnitType = null;
                        } else {
                            this.currencyUnitType = new ArrayList<CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>>>();
                            for (CurrencyUnitType _item: _other.currencyUnitType) {
                                this.currencyUnitType.add(((_item == null)?null:_item.newCopyBuilder(this, currencyUnitTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfCurrencyUnitType >_P init(final _P _product) {
            if (this.currencyUnitType!= null) {
                final List<CurrencyUnitType> currencyUnitType = new ArrayList<CurrencyUnitType>(this.currencyUnitType.size());
                for (CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>> _item: this.currencyUnitType) {
                    currencyUnitType.add(_item.build());
                }
                _product.currencyUnitType = currencyUnitType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "currencyUnitType" hinzu.
         * 
         * @param currencyUnitType
         *     Werte, die zur Eigenschaft "currencyUnitType" hinzugefügt werden.
         */
        public ListOfCurrencyUnitType.Builder<_B> addCurrencyUnitType(final Iterable<? extends CurrencyUnitType> currencyUnitType) {
            if (currencyUnitType!= null) {
                if (this.currencyUnitType == null) {
                    this.currencyUnitType = new ArrayList<CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>>>();
                }
                for (CurrencyUnitType _item: currencyUnitType) {
                    this.currencyUnitType.add(new CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currencyUnitType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param currencyUnitType
         *     Neuer Wert der Eigenschaft "currencyUnitType".
         */
        public ListOfCurrencyUnitType.Builder<_B> withCurrencyUnitType(final Iterable<? extends CurrencyUnitType> currencyUnitType) {
            if (this.currencyUnitType!= null) {
                this.currencyUnitType.clear();
            }
            return addCurrencyUnitType(currencyUnitType);
        }

        /**
         * Fügt Werte zur Eigenschaft "currencyUnitType" hinzu.
         * 
         * @param currencyUnitType
         *     Werte, die zur Eigenschaft "currencyUnitType" hinzugefügt werden.
         */
        public ListOfCurrencyUnitType.Builder<_B> addCurrencyUnitType(CurrencyUnitType... currencyUnitType) {
            addCurrencyUnitType(Arrays.asList(currencyUnitType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currencyUnitType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param currencyUnitType
         *     Neuer Wert der Eigenschaft "currencyUnitType".
         */
        public ListOfCurrencyUnitType.Builder<_B> withCurrencyUnitType(CurrencyUnitType... currencyUnitType) {
            withCurrencyUnitType(Arrays.asList(currencyUnitType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "CurrencyUnitType".
         * Mit {@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "CurrencyUnitType".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.CurrencyUnitType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public CurrencyUnitType.Builder<? extends ListOfCurrencyUnitType.Builder<_B>> addCurrencyUnitType() {
            if (this.currencyUnitType == null) {
                this.currencyUnitType = new ArrayList<CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>>>();
            }
            final CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>> currencyUnitType_Builder = new CurrencyUnitType.Builder<ListOfCurrencyUnitType.Builder<_B>>(this, null, false);
            this.currencyUnitType.add(currencyUnitType_Builder);
            return currencyUnitType_Builder;
        }

        @Override
        public ListOfCurrencyUnitType build() {
            if (_storedValue == null) {
                return this.init(new ListOfCurrencyUnitType());
            } else {
                return ((ListOfCurrencyUnitType) _storedValue);
            }
        }

        public ListOfCurrencyUnitType.Builder<_B> copyOf(final ListOfCurrencyUnitType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfCurrencyUnitType.Builder<_B> copyOf(final ListOfCurrencyUnitType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfCurrencyUnitType.Selector<ListOfCurrencyUnitType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfCurrencyUnitType.Select _root() {
            return new ListOfCurrencyUnitType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private CurrencyUnitType.Selector<TRoot, ListOfCurrencyUnitType.Selector<TRoot, TParent>> currencyUnitType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.currencyUnitType!= null) {
                products.put("currencyUnitType", this.currencyUnitType.init());
            }
            return products;
        }

        public CurrencyUnitType.Selector<TRoot, ListOfCurrencyUnitType.Selector<TRoot, TParent>> currencyUnitType() {
            return ((this.currencyUnitType == null)?this.currencyUnitType = new CurrencyUnitType.Selector<TRoot, ListOfCurrencyUnitType.Selector<TRoot, TParent>>(this._root, this, "currencyUnitType"):this.currencyUnitType);
        }

    }

}
