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
 * <p>Java-Klasse für ListOfEnumDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfEnumDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnumDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EnumDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfEnumDescription", propOrder = {
    "enumDescription"
})
public class ListOfEnumDescription {

    @XmlElement(name = "EnumDescription", nillable = true)
    protected List<EnumDescription> enumDescription;

    /**
     * Gets the value of the enumDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumDescription }
     * 
     * 
     */
    public List<EnumDescription> getEnumDescription() {
        if (enumDescription == null) {
            enumDescription = new ArrayList<EnumDescription>();
        }
        return this.enumDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfEnumDescription.Builder<_B> _other) {
        if (this.enumDescription == null) {
            _other.enumDescription = null;
        } else {
            _other.enumDescription = new ArrayList<EnumDescription.Builder<ListOfEnumDescription.Builder<_B>>>();
            for (EnumDescription _item: this.enumDescription) {
                _other.enumDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfEnumDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfEnumDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfEnumDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfEnumDescription.Builder<Void> builder() {
        return new ListOfEnumDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfEnumDescription.Builder<_B> copyOf(final ListOfEnumDescription _other) {
        final ListOfEnumDescription.Builder<_B> _newBuilder = new ListOfEnumDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfEnumDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree enumDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumDescriptionPropertyTree!= null):((enumDescriptionPropertyTree == null)||(!enumDescriptionPropertyTree.isLeaf())))) {
            if (this.enumDescription == null) {
                _other.enumDescription = null;
            } else {
                _other.enumDescription = new ArrayList<EnumDescription.Builder<ListOfEnumDescription.Builder<_B>>>();
                for (EnumDescription _item: this.enumDescription) {
                    _other.enumDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, enumDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfEnumDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfEnumDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfEnumDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfEnumDescription.Builder<_B> copyOf(final ListOfEnumDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfEnumDescription.Builder<_B> _newBuilder = new ListOfEnumDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfEnumDescription.Builder<Void> copyExcept(final ListOfEnumDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfEnumDescription.Builder<Void> copyOnly(final ListOfEnumDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfEnumDescription _storedValue;
        private List<EnumDescription.Builder<ListOfEnumDescription.Builder<_B>>> enumDescription;

        public Builder(final _B _parentBuilder, final ListOfEnumDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.enumDescription == null) {
                        this.enumDescription = null;
                    } else {
                        this.enumDescription = new ArrayList<EnumDescription.Builder<ListOfEnumDescription.Builder<_B>>>();
                        for (EnumDescription _item: _other.enumDescription) {
                            this.enumDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfEnumDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree enumDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumDescriptionPropertyTree!= null):((enumDescriptionPropertyTree == null)||(!enumDescriptionPropertyTree.isLeaf())))) {
                        if (_other.enumDescription == null) {
                            this.enumDescription = null;
                        } else {
                            this.enumDescription = new ArrayList<EnumDescription.Builder<ListOfEnumDescription.Builder<_B>>>();
                            for (EnumDescription _item: _other.enumDescription) {
                                this.enumDescription.add(((_item == null)?null:_item.newCopyBuilder(this, enumDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfEnumDescription >_P init(final _P _product) {
            if (this.enumDescription!= null) {
                final List<EnumDescription> enumDescription = new ArrayList<EnumDescription>(this.enumDescription.size());
                for (EnumDescription.Builder<ListOfEnumDescription.Builder<_B>> _item: this.enumDescription) {
                    enumDescription.add(_item.build());
                }
                _product.enumDescription = enumDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "enumDescription" hinzu.
         * 
         * @param enumDescription
         *     Werte, die zur Eigenschaft "enumDescription" hinzugefügt werden.
         */
        public ListOfEnumDescription.Builder<_B> addEnumDescription(final Iterable<? extends EnumDescription> enumDescription) {
            if (enumDescription!= null) {
                if (this.enumDescription == null) {
                    this.enumDescription = new ArrayList<EnumDescription.Builder<ListOfEnumDescription.Builder<_B>>>();
                }
                for (EnumDescription _item: enumDescription) {
                    this.enumDescription.add(new EnumDescription.Builder<ListOfEnumDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumDescription" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumDescription
         *     Neuer Wert der Eigenschaft "enumDescription".
         */
        public ListOfEnumDescription.Builder<_B> withEnumDescription(final Iterable<? extends EnumDescription> enumDescription) {
            if (this.enumDescription!= null) {
                this.enumDescription.clear();
            }
            return addEnumDescription(enumDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "enumDescription" hinzu.
         * 
         * @param enumDescription
         *     Werte, die zur Eigenschaft "enumDescription" hinzugefügt werden.
         */
        public ListOfEnumDescription.Builder<_B> addEnumDescription(EnumDescription... enumDescription) {
            addEnumDescription(Arrays.asList(enumDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumDescription" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumDescription
         *     Neuer Wert der Eigenschaft "enumDescription".
         */
        public ListOfEnumDescription.Builder<_B> withEnumDescription(EnumDescription... enumDescription) {
            withEnumDescription(Arrays.asList(enumDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "EnumDescription".
         * Mit {@link org.opcfoundation.ua._2008._02.types.EnumDescription.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "EnumDescription".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.EnumDescription.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public EnumDescription.Builder<? extends ListOfEnumDescription.Builder<_B>> addEnumDescription() {
            if (this.enumDescription == null) {
                this.enumDescription = new ArrayList<EnumDescription.Builder<ListOfEnumDescription.Builder<_B>>>();
            }
            final EnumDescription.Builder<ListOfEnumDescription.Builder<_B>> enumDescription_Builder = new EnumDescription.Builder<ListOfEnumDescription.Builder<_B>>(this, null, false);
            this.enumDescription.add(enumDescription_Builder);
            return enumDescription_Builder;
        }

        @Override
        public ListOfEnumDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfEnumDescription());
            } else {
                return ((ListOfEnumDescription) _storedValue);
            }
        }

        public ListOfEnumDescription.Builder<_B> copyOf(final ListOfEnumDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfEnumDescription.Builder<_B> copyOf(final ListOfEnumDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfEnumDescription.Selector<ListOfEnumDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfEnumDescription.Select _root() {
            return new ListOfEnumDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private EnumDescription.Selector<TRoot, ListOfEnumDescription.Selector<TRoot, TParent>> enumDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.enumDescription!= null) {
                products.put("enumDescription", this.enumDescription.init());
            }
            return products;
        }

        public EnumDescription.Selector<TRoot, ListOfEnumDescription.Selector<TRoot, TParent>> enumDescription() {
            return ((this.enumDescription == null)?this.enumDescription = new EnumDescription.Selector<TRoot, ListOfEnumDescription.Selector<TRoot, TParent>>(this._root, this, "enumDescription"):this.enumDescription);
        }

    }

}
