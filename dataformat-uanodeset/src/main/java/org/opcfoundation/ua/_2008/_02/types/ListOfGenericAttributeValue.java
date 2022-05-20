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
 * <p>Java-Klasse für ListOfGenericAttributeValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfGenericAttributeValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GenericAttributeValue" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}GenericAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfGenericAttributeValue", propOrder = {
    "genericAttributeValue"
})
public class ListOfGenericAttributeValue {

    @XmlElement(name = "GenericAttributeValue", nillable = true)
    protected List<GenericAttributeValue> genericAttributeValue;

    /**
     * Gets the value of the genericAttributeValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericAttributeValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericAttributeValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericAttributeValue }
     * 
     * 
     */
    public List<GenericAttributeValue> getGenericAttributeValue() {
        if (genericAttributeValue == null) {
            genericAttributeValue = new ArrayList<GenericAttributeValue>();
        }
        return this.genericAttributeValue;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfGenericAttributeValue.Builder<_B> _other) {
        if (this.genericAttributeValue == null) {
            _other.genericAttributeValue = null;
        } else {
            _other.genericAttributeValue = new ArrayList<GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>>>();
            for (GenericAttributeValue _item: this.genericAttributeValue) {
                _other.genericAttributeValue.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfGenericAttributeValue.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfGenericAttributeValue.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfGenericAttributeValue.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfGenericAttributeValue.Builder<Void> builder() {
        return new ListOfGenericAttributeValue.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfGenericAttributeValue.Builder<_B> copyOf(final ListOfGenericAttributeValue _other) {
        final ListOfGenericAttributeValue.Builder<_B> _newBuilder = new ListOfGenericAttributeValue.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfGenericAttributeValue.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree genericAttributeValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("genericAttributeValue"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(genericAttributeValuePropertyTree!= null):((genericAttributeValuePropertyTree == null)||(!genericAttributeValuePropertyTree.isLeaf())))) {
            if (this.genericAttributeValue == null) {
                _other.genericAttributeValue = null;
            } else {
                _other.genericAttributeValue = new ArrayList<GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>>>();
                for (GenericAttributeValue _item: this.genericAttributeValue) {
                    _other.genericAttributeValue.add(((_item == null)?null:_item.newCopyBuilder(_other, genericAttributeValuePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfGenericAttributeValue.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfGenericAttributeValue.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfGenericAttributeValue.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfGenericAttributeValue.Builder<_B> copyOf(final ListOfGenericAttributeValue _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfGenericAttributeValue.Builder<_B> _newBuilder = new ListOfGenericAttributeValue.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfGenericAttributeValue.Builder<Void> copyExcept(final ListOfGenericAttributeValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfGenericAttributeValue.Builder<Void> copyOnly(final ListOfGenericAttributeValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfGenericAttributeValue _storedValue;
        private List<GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>>> genericAttributeValue;

        public Builder(final _B _parentBuilder, final ListOfGenericAttributeValue _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.genericAttributeValue == null) {
                        this.genericAttributeValue = null;
                    } else {
                        this.genericAttributeValue = new ArrayList<GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>>>();
                        for (GenericAttributeValue _item: _other.genericAttributeValue) {
                            this.genericAttributeValue.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfGenericAttributeValue _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree genericAttributeValuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("genericAttributeValue"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(genericAttributeValuePropertyTree!= null):((genericAttributeValuePropertyTree == null)||(!genericAttributeValuePropertyTree.isLeaf())))) {
                        if (_other.genericAttributeValue == null) {
                            this.genericAttributeValue = null;
                        } else {
                            this.genericAttributeValue = new ArrayList<GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>>>();
                            for (GenericAttributeValue _item: _other.genericAttributeValue) {
                                this.genericAttributeValue.add(((_item == null)?null:_item.newCopyBuilder(this, genericAttributeValuePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfGenericAttributeValue >_P init(final _P _product) {
            if (this.genericAttributeValue!= null) {
                final List<GenericAttributeValue> genericAttributeValue = new ArrayList<GenericAttributeValue>(this.genericAttributeValue.size());
                for (GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>> _item: this.genericAttributeValue) {
                    genericAttributeValue.add(_item.build());
                }
                _product.genericAttributeValue = genericAttributeValue;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "genericAttributeValue" hinzu.
         * 
         * @param genericAttributeValue
         *     Werte, die zur Eigenschaft "genericAttributeValue" hinzugefügt werden.
         */
        public ListOfGenericAttributeValue.Builder<_B> addGenericAttributeValue(final Iterable<? extends GenericAttributeValue> genericAttributeValue) {
            if (genericAttributeValue!= null) {
                if (this.genericAttributeValue == null) {
                    this.genericAttributeValue = new ArrayList<GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>>>();
                }
                for (GenericAttributeValue _item: genericAttributeValue) {
                    this.genericAttributeValue.add(new GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "genericAttributeValue" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param genericAttributeValue
         *     Neuer Wert der Eigenschaft "genericAttributeValue".
         */
        public ListOfGenericAttributeValue.Builder<_B> withGenericAttributeValue(final Iterable<? extends GenericAttributeValue> genericAttributeValue) {
            if (this.genericAttributeValue!= null) {
                this.genericAttributeValue.clear();
            }
            return addGenericAttributeValue(genericAttributeValue);
        }

        /**
         * Fügt Werte zur Eigenschaft "genericAttributeValue" hinzu.
         * 
         * @param genericAttributeValue
         *     Werte, die zur Eigenschaft "genericAttributeValue" hinzugefügt werden.
         */
        public ListOfGenericAttributeValue.Builder<_B> addGenericAttributeValue(GenericAttributeValue... genericAttributeValue) {
            addGenericAttributeValue(Arrays.asList(genericAttributeValue));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "genericAttributeValue" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param genericAttributeValue
         *     Neuer Wert der Eigenschaft "genericAttributeValue".
         */
        public ListOfGenericAttributeValue.Builder<_B> withGenericAttributeValue(GenericAttributeValue... genericAttributeValue) {
            withGenericAttributeValue(Arrays.asList(genericAttributeValue));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "GenericAttributeValue".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.GenericAttributeValue.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "GenericAttributeValue".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.GenericAttributeValue.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public GenericAttributeValue.Builder<? extends ListOfGenericAttributeValue.Builder<_B>> addGenericAttributeValue() {
            if (this.genericAttributeValue == null) {
                this.genericAttributeValue = new ArrayList<GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>>>();
            }
            final GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>> genericAttributeValue_Builder = new GenericAttributeValue.Builder<ListOfGenericAttributeValue.Builder<_B>>(this, null, false);
            this.genericAttributeValue.add(genericAttributeValue_Builder);
            return genericAttributeValue_Builder;
        }

        @Override
        public ListOfGenericAttributeValue build() {
            if (_storedValue == null) {
                return this.init(new ListOfGenericAttributeValue());
            } else {
                return ((ListOfGenericAttributeValue) _storedValue);
            }
        }

        public ListOfGenericAttributeValue.Builder<_B> copyOf(final ListOfGenericAttributeValue _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfGenericAttributeValue.Builder<_B> copyOf(final ListOfGenericAttributeValue.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfGenericAttributeValue.Selector<ListOfGenericAttributeValue.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfGenericAttributeValue.Select _root() {
            return new ListOfGenericAttributeValue.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private GenericAttributeValue.Selector<TRoot, ListOfGenericAttributeValue.Selector<TRoot, TParent>> genericAttributeValue = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.genericAttributeValue!= null) {
                products.put("genericAttributeValue", this.genericAttributeValue.init());
            }
            return products;
        }

        public GenericAttributeValue.Selector<TRoot, ListOfGenericAttributeValue.Selector<TRoot, TParent>> genericAttributeValue() {
            return ((this.genericAttributeValue == null)?this.genericAttributeValue = new GenericAttributeValue.Selector<TRoot, ListOfGenericAttributeValue.Selector<TRoot, TParent>>(this._root, this, "genericAttributeValue"):this.genericAttributeValue);
        }

    }

}
