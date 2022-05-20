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
 * <p>Java-Klasse für ListOfRationalNumber complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfRationalNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RationalNumber" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RationalNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfRationalNumber", propOrder = {
    "rationalNumber"
})
public class ListOfRationalNumber {

    @XmlElement(name = "RationalNumber", nillable = true)
    protected List<RationalNumber> rationalNumber;

    /**
     * Gets the value of the rationalNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rationalNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRationalNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RationalNumber }
     * 
     * 
     */
    public List<RationalNumber> getRationalNumber() {
        if (rationalNumber == null) {
            rationalNumber = new ArrayList<RationalNumber>();
        }
        return this.rationalNumber;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfRationalNumber.Builder<_B> _other) {
        if (this.rationalNumber == null) {
            _other.rationalNumber = null;
        } else {
            _other.rationalNumber = new ArrayList<RationalNumber.Builder<ListOfRationalNumber.Builder<_B>>>();
            for (RationalNumber _item: this.rationalNumber) {
                _other.rationalNumber.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfRationalNumber.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfRationalNumber.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfRationalNumber.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfRationalNumber.Builder<Void> builder() {
        return new ListOfRationalNumber.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfRationalNumber.Builder<_B> copyOf(final ListOfRationalNumber _other) {
        final ListOfRationalNumber.Builder<_B> _newBuilder = new ListOfRationalNumber.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfRationalNumber.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree rationalNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rationalNumber"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rationalNumberPropertyTree!= null):((rationalNumberPropertyTree == null)||(!rationalNumberPropertyTree.isLeaf())))) {
            if (this.rationalNumber == null) {
                _other.rationalNumber = null;
            } else {
                _other.rationalNumber = new ArrayList<RationalNumber.Builder<ListOfRationalNumber.Builder<_B>>>();
                for (RationalNumber _item: this.rationalNumber) {
                    _other.rationalNumber.add(((_item == null)?null:_item.newCopyBuilder(_other, rationalNumberPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfRationalNumber.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfRationalNumber.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfRationalNumber.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfRationalNumber.Builder<_B> copyOf(final ListOfRationalNumber _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfRationalNumber.Builder<_B> _newBuilder = new ListOfRationalNumber.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfRationalNumber.Builder<Void> copyExcept(final ListOfRationalNumber _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfRationalNumber.Builder<Void> copyOnly(final ListOfRationalNumber _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfRationalNumber _storedValue;
        private List<RationalNumber.Builder<ListOfRationalNumber.Builder<_B>>> rationalNumber;

        public Builder(final _B _parentBuilder, final ListOfRationalNumber _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.rationalNumber == null) {
                        this.rationalNumber = null;
                    } else {
                        this.rationalNumber = new ArrayList<RationalNumber.Builder<ListOfRationalNumber.Builder<_B>>>();
                        for (RationalNumber _item: _other.rationalNumber) {
                            this.rationalNumber.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfRationalNumber _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree rationalNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rationalNumber"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rationalNumberPropertyTree!= null):((rationalNumberPropertyTree == null)||(!rationalNumberPropertyTree.isLeaf())))) {
                        if (_other.rationalNumber == null) {
                            this.rationalNumber = null;
                        } else {
                            this.rationalNumber = new ArrayList<RationalNumber.Builder<ListOfRationalNumber.Builder<_B>>>();
                            for (RationalNumber _item: _other.rationalNumber) {
                                this.rationalNumber.add(((_item == null)?null:_item.newCopyBuilder(this, rationalNumberPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfRationalNumber >_P init(final _P _product) {
            if (this.rationalNumber!= null) {
                final List<RationalNumber> rationalNumber = new ArrayList<RationalNumber>(this.rationalNumber.size());
                for (RationalNumber.Builder<ListOfRationalNumber.Builder<_B>> _item: this.rationalNumber) {
                    rationalNumber.add(_item.build());
                }
                _product.rationalNumber = rationalNumber;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "rationalNumber" hinzu.
         * 
         * @param rationalNumber
         *     Werte, die zur Eigenschaft "rationalNumber" hinzugefügt werden.
         */
        public ListOfRationalNumber.Builder<_B> addRationalNumber(final Iterable<? extends RationalNumber> rationalNumber) {
            if (rationalNumber!= null) {
                if (this.rationalNumber == null) {
                    this.rationalNumber = new ArrayList<RationalNumber.Builder<ListOfRationalNumber.Builder<_B>>>();
                }
                for (RationalNumber _item: rationalNumber) {
                    this.rationalNumber.add(new RationalNumber.Builder<ListOfRationalNumber.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rationalNumber" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param rationalNumber
         *     Neuer Wert der Eigenschaft "rationalNumber".
         */
        public ListOfRationalNumber.Builder<_B> withRationalNumber(final Iterable<? extends RationalNumber> rationalNumber) {
            if (this.rationalNumber!= null) {
                this.rationalNumber.clear();
            }
            return addRationalNumber(rationalNumber);
        }

        /**
         * Fügt Werte zur Eigenschaft "rationalNumber" hinzu.
         * 
         * @param rationalNumber
         *     Werte, die zur Eigenschaft "rationalNumber" hinzugefügt werden.
         */
        public ListOfRationalNumber.Builder<_B> addRationalNumber(RationalNumber... rationalNumber) {
            addRationalNumber(Arrays.asList(rationalNumber));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rationalNumber" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param rationalNumber
         *     Neuer Wert der Eigenschaft "rationalNumber".
         */
        public ListOfRationalNumber.Builder<_B> withRationalNumber(RationalNumber... rationalNumber) {
            withRationalNumber(Arrays.asList(rationalNumber));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "RationalNumber".
         * Mit {@link org.opcfoundation.ua._2008._02.types.RationalNumber.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "RationalNumber".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.RationalNumber.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public RationalNumber.Builder<? extends ListOfRationalNumber.Builder<_B>> addRationalNumber() {
            if (this.rationalNumber == null) {
                this.rationalNumber = new ArrayList<RationalNumber.Builder<ListOfRationalNumber.Builder<_B>>>();
            }
            final RationalNumber.Builder<ListOfRationalNumber.Builder<_B>> rationalNumber_Builder = new RationalNumber.Builder<ListOfRationalNumber.Builder<_B>>(this, null, false);
            this.rationalNumber.add(rationalNumber_Builder);
            return rationalNumber_Builder;
        }

        @Override
        public ListOfRationalNumber build() {
            if (_storedValue == null) {
                return this.init(new ListOfRationalNumber());
            } else {
                return ((ListOfRationalNumber) _storedValue);
            }
        }

        public ListOfRationalNumber.Builder<_B> copyOf(final ListOfRationalNumber _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfRationalNumber.Builder<_B> copyOf(final ListOfRationalNumber.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfRationalNumber.Selector<ListOfRationalNumber.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfRationalNumber.Select _root() {
            return new ListOfRationalNumber.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private RationalNumber.Selector<TRoot, ListOfRationalNumber.Selector<TRoot, TParent>> rationalNumber = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.rationalNumber!= null) {
                products.put("rationalNumber", this.rationalNumber.init());
            }
            return products;
        }

        public RationalNumber.Selector<TRoot, ListOfRationalNumber.Selector<TRoot, TParent>> rationalNumber() {
            return ((this.rationalNumber == null)?this.rationalNumber = new RationalNumber.Selector<TRoot, ListOfRationalNumber.Selector<TRoot, TParent>>(this._root, this, "rationalNumber"):this.rationalNumber);
        }

    }

}
