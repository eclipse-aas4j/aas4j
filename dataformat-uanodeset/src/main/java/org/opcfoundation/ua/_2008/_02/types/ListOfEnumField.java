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
 * <p>Java-Klasse für ListOfEnumField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfEnumField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnumField" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EnumField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfEnumField", propOrder = {
    "enumField"
})
public class ListOfEnumField {

    @XmlElement(name = "EnumField", nillable = true)
    protected List<EnumField> enumField;

    /**
     * Gets the value of the enumField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumField }
     * 
     * 
     */
    public List<EnumField> getEnumField() {
        if (enumField == null) {
            enumField = new ArrayList<EnumField>();
        }
        return this.enumField;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfEnumField.Builder<_B> _other) {
        if (this.enumField == null) {
            _other.enumField = null;
        } else {
            _other.enumField = new ArrayList<EnumField.Builder<ListOfEnumField.Builder<_B>>>();
            for (EnumField _item: this.enumField) {
                _other.enumField.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfEnumField.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfEnumField.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfEnumField.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfEnumField.Builder<Void> builder() {
        return new ListOfEnumField.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfEnumField.Builder<_B> copyOf(final ListOfEnumField _other) {
        final ListOfEnumField.Builder<_B> _newBuilder = new ListOfEnumField.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfEnumField.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree enumFieldPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumField"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumFieldPropertyTree!= null):((enumFieldPropertyTree == null)||(!enumFieldPropertyTree.isLeaf())))) {
            if (this.enumField == null) {
                _other.enumField = null;
            } else {
                _other.enumField = new ArrayList<EnumField.Builder<ListOfEnumField.Builder<_B>>>();
                for (EnumField _item: this.enumField) {
                    _other.enumField.add(((_item == null)?null:_item.newCopyBuilder(_other, enumFieldPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfEnumField.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfEnumField.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfEnumField.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfEnumField.Builder<_B> copyOf(final ListOfEnumField _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfEnumField.Builder<_B> _newBuilder = new ListOfEnumField.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfEnumField.Builder<Void> copyExcept(final ListOfEnumField _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfEnumField.Builder<Void> copyOnly(final ListOfEnumField _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfEnumField _storedValue;
        private List<EnumField.Builder<ListOfEnumField.Builder<_B>>> enumField;

        public Builder(final _B _parentBuilder, final ListOfEnumField _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.enumField == null) {
                        this.enumField = null;
                    } else {
                        this.enumField = new ArrayList<EnumField.Builder<ListOfEnumField.Builder<_B>>>();
                        for (EnumField _item: _other.enumField) {
                            this.enumField.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfEnumField _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree enumFieldPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumField"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumFieldPropertyTree!= null):((enumFieldPropertyTree == null)||(!enumFieldPropertyTree.isLeaf())))) {
                        if (_other.enumField == null) {
                            this.enumField = null;
                        } else {
                            this.enumField = new ArrayList<EnumField.Builder<ListOfEnumField.Builder<_B>>>();
                            for (EnumField _item: _other.enumField) {
                                this.enumField.add(((_item == null)?null:_item.newCopyBuilder(this, enumFieldPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfEnumField >_P init(final _P _product) {
            if (this.enumField!= null) {
                final List<EnumField> enumField = new ArrayList<EnumField>(this.enumField.size());
                for (EnumField.Builder<ListOfEnumField.Builder<_B>> _item: this.enumField) {
                    enumField.add(_item.build());
                }
                _product.enumField = enumField;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "enumField" hinzu.
         * 
         * @param enumField
         *     Werte, die zur Eigenschaft "enumField" hinzugefügt werden.
         */
        public ListOfEnumField.Builder<_B> addEnumField(final Iterable<? extends EnumField> enumField) {
            if (enumField!= null) {
                if (this.enumField == null) {
                    this.enumField = new ArrayList<EnumField.Builder<ListOfEnumField.Builder<_B>>>();
                }
                for (EnumField _item: enumField) {
                    this.enumField.add(new EnumField.Builder<ListOfEnumField.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumField" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param enumField
         *     Neuer Wert der Eigenschaft "enumField".
         */
        public ListOfEnumField.Builder<_B> withEnumField(final Iterable<? extends EnumField> enumField) {
            if (this.enumField!= null) {
                this.enumField.clear();
            }
            return addEnumField(enumField);
        }

        /**
         * Fügt Werte zur Eigenschaft "enumField" hinzu.
         * 
         * @param enumField
         *     Werte, die zur Eigenschaft "enumField" hinzugefügt werden.
         */
        public ListOfEnumField.Builder<_B> addEnumField(EnumField... enumField) {
            addEnumField(Arrays.asList(enumField));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumField" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param enumField
         *     Neuer Wert der Eigenschaft "enumField".
         */
        public ListOfEnumField.Builder<_B> withEnumField(EnumField... enumField) {
            withEnumField(Arrays.asList(enumField));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "EnumField".
         * Mit {@link org.opcfoundation.ua._2008._02.types.EnumField.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "EnumField".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.EnumField.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public EnumField.Builder<? extends ListOfEnumField.Builder<_B>> addEnumField() {
            if (this.enumField == null) {
                this.enumField = new ArrayList<EnumField.Builder<ListOfEnumField.Builder<_B>>>();
            }
            final EnumField.Builder<ListOfEnumField.Builder<_B>> enumField_Builder = new EnumField.Builder<ListOfEnumField.Builder<_B>>(this, null, false);
            this.enumField.add(enumField_Builder);
            return enumField_Builder;
        }

        @Override
        public ListOfEnumField build() {
            if (_storedValue == null) {
                return this.init(new ListOfEnumField());
            } else {
                return ((ListOfEnumField) _storedValue);
            }
        }

        public ListOfEnumField.Builder<_B> copyOf(final ListOfEnumField _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfEnumField.Builder<_B> copyOf(final ListOfEnumField.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfEnumField.Selector<ListOfEnumField.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfEnumField.Select _root() {
            return new ListOfEnumField.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private EnumField.Selector<TRoot, ListOfEnumField.Selector<TRoot, TParent>> enumField = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.enumField!= null) {
                products.put("enumField", this.enumField.init());
            }
            return products;
        }

        public EnumField.Selector<TRoot, ListOfEnumField.Selector<TRoot, TParent>> enumField() {
            return ((this.enumField == null)?this.enumField = new EnumField.Selector<TRoot, ListOfEnumField.Selector<TRoot, TParent>>(this._root, this, "enumField"):this.enumField);
        }

    }

}
