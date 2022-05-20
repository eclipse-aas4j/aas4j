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
 * <p>Java-Klasse für ListOfEnumValueType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfEnumValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnumValueType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EnumValueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfEnumValueType", propOrder = {
    "enumValueType"
})
public class ListOfEnumValueType {

    @XmlElement(name = "EnumValueType", nillable = true)
    protected List<EnumValueType> enumValueType;

    /**
     * Gets the value of the enumValueType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumValueType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumValueType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumValueType }
     * 
     * 
     */
    public List<EnumValueType> getEnumValueType() {
        if (enumValueType == null) {
            enumValueType = new ArrayList<EnumValueType>();
        }
        return this.enumValueType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfEnumValueType.Builder<_B> _other) {
        if (this.enumValueType == null) {
            _other.enumValueType = null;
        } else {
            _other.enumValueType = new ArrayList<EnumValueType.Builder<ListOfEnumValueType.Builder<_B>>>();
            for (EnumValueType _item: this.enumValueType) {
                _other.enumValueType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfEnumValueType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfEnumValueType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfEnumValueType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfEnumValueType.Builder<Void> builder() {
        return new ListOfEnumValueType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfEnumValueType.Builder<_B> copyOf(final ListOfEnumValueType _other) {
        final ListOfEnumValueType.Builder<_B> _newBuilder = new ListOfEnumValueType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfEnumValueType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree enumValueTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumValueType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumValueTypePropertyTree!= null):((enumValueTypePropertyTree == null)||(!enumValueTypePropertyTree.isLeaf())))) {
            if (this.enumValueType == null) {
                _other.enumValueType = null;
            } else {
                _other.enumValueType = new ArrayList<EnumValueType.Builder<ListOfEnumValueType.Builder<_B>>>();
                for (EnumValueType _item: this.enumValueType) {
                    _other.enumValueType.add(((_item == null)?null:_item.newCopyBuilder(_other, enumValueTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfEnumValueType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfEnumValueType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfEnumValueType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfEnumValueType.Builder<_B> copyOf(final ListOfEnumValueType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfEnumValueType.Builder<_B> _newBuilder = new ListOfEnumValueType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfEnumValueType.Builder<Void> copyExcept(final ListOfEnumValueType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfEnumValueType.Builder<Void> copyOnly(final ListOfEnumValueType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfEnumValueType _storedValue;
        private List<EnumValueType.Builder<ListOfEnumValueType.Builder<_B>>> enumValueType;

        public Builder(final _B _parentBuilder, final ListOfEnumValueType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.enumValueType == null) {
                        this.enumValueType = null;
                    } else {
                        this.enumValueType = new ArrayList<EnumValueType.Builder<ListOfEnumValueType.Builder<_B>>>();
                        for (EnumValueType _item: _other.enumValueType) {
                            this.enumValueType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfEnumValueType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree enumValueTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumValueType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumValueTypePropertyTree!= null):((enumValueTypePropertyTree == null)||(!enumValueTypePropertyTree.isLeaf())))) {
                        if (_other.enumValueType == null) {
                            this.enumValueType = null;
                        } else {
                            this.enumValueType = new ArrayList<EnumValueType.Builder<ListOfEnumValueType.Builder<_B>>>();
                            for (EnumValueType _item: _other.enumValueType) {
                                this.enumValueType.add(((_item == null)?null:_item.newCopyBuilder(this, enumValueTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfEnumValueType >_P init(final _P _product) {
            if (this.enumValueType!= null) {
                final List<EnumValueType> enumValueType = new ArrayList<EnumValueType>(this.enumValueType.size());
                for (EnumValueType.Builder<ListOfEnumValueType.Builder<_B>> _item: this.enumValueType) {
                    enumValueType.add(_item.build());
                }
                _product.enumValueType = enumValueType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "enumValueType" hinzu.
         * 
         * @param enumValueType
         *     Werte, die zur Eigenschaft "enumValueType" hinzugefügt werden.
         */
        public ListOfEnumValueType.Builder<_B> addEnumValueType(final Iterable<? extends EnumValueType> enumValueType) {
            if (enumValueType!= null) {
                if (this.enumValueType == null) {
                    this.enumValueType = new ArrayList<EnumValueType.Builder<ListOfEnumValueType.Builder<_B>>>();
                }
                for (EnumValueType _item: enumValueType) {
                    this.enumValueType.add(new EnumValueType.Builder<ListOfEnumValueType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumValueType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumValueType
         *     Neuer Wert der Eigenschaft "enumValueType".
         */
        public ListOfEnumValueType.Builder<_B> withEnumValueType(final Iterable<? extends EnumValueType> enumValueType) {
            if (this.enumValueType!= null) {
                this.enumValueType.clear();
            }
            return addEnumValueType(enumValueType);
        }

        /**
         * Fügt Werte zur Eigenschaft "enumValueType" hinzu.
         * 
         * @param enumValueType
         *     Werte, die zur Eigenschaft "enumValueType" hinzugefügt werden.
         */
        public ListOfEnumValueType.Builder<_B> addEnumValueType(EnumValueType... enumValueType) {
            addEnumValueType(Arrays.asList(enumValueType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumValueType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumValueType
         *     Neuer Wert der Eigenschaft "enumValueType".
         */
        public ListOfEnumValueType.Builder<_B> withEnumValueType(EnumValueType... enumValueType) {
            withEnumValueType(Arrays.asList(enumValueType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "EnumValueType".
         * Mit {@link org.opcfoundation.ua._2008._02.types.EnumValueType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "EnumValueType".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.EnumValueType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public EnumValueType.Builder<? extends ListOfEnumValueType.Builder<_B>> addEnumValueType() {
            if (this.enumValueType == null) {
                this.enumValueType = new ArrayList<EnumValueType.Builder<ListOfEnumValueType.Builder<_B>>>();
            }
            final EnumValueType.Builder<ListOfEnumValueType.Builder<_B>> enumValueType_Builder = new EnumValueType.Builder<ListOfEnumValueType.Builder<_B>>(this, null, false);
            this.enumValueType.add(enumValueType_Builder);
            return enumValueType_Builder;
        }

        @Override
        public ListOfEnumValueType build() {
            if (_storedValue == null) {
                return this.init(new ListOfEnumValueType());
            } else {
                return ((ListOfEnumValueType) _storedValue);
            }
        }

        public ListOfEnumValueType.Builder<_B> copyOf(final ListOfEnumValueType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfEnumValueType.Builder<_B> copyOf(final ListOfEnumValueType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfEnumValueType.Selector<ListOfEnumValueType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfEnumValueType.Select _root() {
            return new ListOfEnumValueType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private EnumValueType.Selector<TRoot, ListOfEnumValueType.Selector<TRoot, TParent>> enumValueType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.enumValueType!= null) {
                products.put("enumValueType", this.enumValueType.init());
            }
            return products;
        }

        public EnumValueType.Selector<TRoot, ListOfEnumValueType.Selector<TRoot, TParent>> enumValueType() {
            return ((this.enumValueType == null)?this.enumValueType = new EnumValueType.Selector<TRoot, ListOfEnumValueType.Selector<TRoot, TParent>>(this._root, this, "enumValueType"):this.enumValueType);
        }

    }

}
