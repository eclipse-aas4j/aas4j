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
 * <p>Java-Klasse für ListOfEnumDefinition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfEnumDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnumDefinition" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EnumDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfEnumDefinition", propOrder = {
    "enumDefinition"
})
public class ListOfEnumDefinition {

    @XmlElement(name = "EnumDefinition", nillable = true)
    protected List<EnumDefinition> enumDefinition;

    /**
     * Gets the value of the enumDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumDefinition }
     * 
     * 
     */
    public List<EnumDefinition> getEnumDefinition() {
        if (enumDefinition == null) {
            enumDefinition = new ArrayList<EnumDefinition>();
        }
        return this.enumDefinition;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfEnumDefinition.Builder<_B> _other) {
        if (this.enumDefinition == null) {
            _other.enumDefinition = null;
        } else {
            _other.enumDefinition = new ArrayList<EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>>>();
            for (EnumDefinition _item: this.enumDefinition) {
                _other.enumDefinition.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfEnumDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfEnumDefinition.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfEnumDefinition.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfEnumDefinition.Builder<Void> builder() {
        return new ListOfEnumDefinition.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfEnumDefinition.Builder<_B> copyOf(final ListOfEnumDefinition _other) {
        final ListOfEnumDefinition.Builder<_B> _newBuilder = new ListOfEnumDefinition.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfEnumDefinition.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree enumDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumDefinition"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumDefinitionPropertyTree!= null):((enumDefinitionPropertyTree == null)||(!enumDefinitionPropertyTree.isLeaf())))) {
            if (this.enumDefinition == null) {
                _other.enumDefinition = null;
            } else {
                _other.enumDefinition = new ArrayList<EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>>>();
                for (EnumDefinition _item: this.enumDefinition) {
                    _other.enumDefinition.add(((_item == null)?null:_item.newCopyBuilder(_other, enumDefinitionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfEnumDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfEnumDefinition.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfEnumDefinition.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfEnumDefinition.Builder<_B> copyOf(final ListOfEnumDefinition _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfEnumDefinition.Builder<_B> _newBuilder = new ListOfEnumDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfEnumDefinition.Builder<Void> copyExcept(final ListOfEnumDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfEnumDefinition.Builder<Void> copyOnly(final ListOfEnumDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfEnumDefinition _storedValue;
        private List<EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>>> enumDefinition;

        public Builder(final _B _parentBuilder, final ListOfEnumDefinition _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.enumDefinition == null) {
                        this.enumDefinition = null;
                    } else {
                        this.enumDefinition = new ArrayList<EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>>>();
                        for (EnumDefinition _item: _other.enumDefinition) {
                            this.enumDefinition.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfEnumDefinition _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree enumDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumDefinition"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumDefinitionPropertyTree!= null):((enumDefinitionPropertyTree == null)||(!enumDefinitionPropertyTree.isLeaf())))) {
                        if (_other.enumDefinition == null) {
                            this.enumDefinition = null;
                        } else {
                            this.enumDefinition = new ArrayList<EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>>>();
                            for (EnumDefinition _item: _other.enumDefinition) {
                                this.enumDefinition.add(((_item == null)?null:_item.newCopyBuilder(this, enumDefinitionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfEnumDefinition >_P init(final _P _product) {
            if (this.enumDefinition!= null) {
                final List<EnumDefinition> enumDefinition = new ArrayList<EnumDefinition>(this.enumDefinition.size());
                for (EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>> _item: this.enumDefinition) {
                    enumDefinition.add(_item.build());
                }
                _product.enumDefinition = enumDefinition;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "enumDefinition" hinzu.
         * 
         * @param enumDefinition
         *     Werte, die zur Eigenschaft "enumDefinition" hinzugefügt werden.
         */
        public ListOfEnumDefinition.Builder<_B> addEnumDefinition(final Iterable<? extends EnumDefinition> enumDefinition) {
            if (enumDefinition!= null) {
                if (this.enumDefinition == null) {
                    this.enumDefinition = new ArrayList<EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>>>();
                }
                for (EnumDefinition _item: enumDefinition) {
                    this.enumDefinition.add(new EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumDefinition" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumDefinition
         *     Neuer Wert der Eigenschaft "enumDefinition".
         */
        public ListOfEnumDefinition.Builder<_B> withEnumDefinition(final Iterable<? extends EnumDefinition> enumDefinition) {
            if (this.enumDefinition!= null) {
                this.enumDefinition.clear();
            }
            return addEnumDefinition(enumDefinition);
        }

        /**
         * Fügt Werte zur Eigenschaft "enumDefinition" hinzu.
         * 
         * @param enumDefinition
         *     Werte, die zur Eigenschaft "enumDefinition" hinzugefügt werden.
         */
        public ListOfEnumDefinition.Builder<_B> addEnumDefinition(EnumDefinition... enumDefinition) {
            addEnumDefinition(Arrays.asList(enumDefinition));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumDefinition" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumDefinition
         *     Neuer Wert der Eigenschaft "enumDefinition".
         */
        public ListOfEnumDefinition.Builder<_B> withEnumDefinition(EnumDefinition... enumDefinition) {
            withEnumDefinition(Arrays.asList(enumDefinition));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "EnumDefinition".
         * Mit {@link org.opcfoundation.ua._2008._02.types.EnumDefinition.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "EnumDefinition".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.EnumDefinition.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public EnumDefinition.Builder<? extends ListOfEnumDefinition.Builder<_B>> addEnumDefinition() {
            if (this.enumDefinition == null) {
                this.enumDefinition = new ArrayList<EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>>>();
            }
            final EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>> enumDefinition_Builder = new EnumDefinition.Builder<ListOfEnumDefinition.Builder<_B>>(this, null, false);
            this.enumDefinition.add(enumDefinition_Builder);
            return enumDefinition_Builder;
        }

        @Override
        public ListOfEnumDefinition build() {
            if (_storedValue == null) {
                return this.init(new ListOfEnumDefinition());
            } else {
                return ((ListOfEnumDefinition) _storedValue);
            }
        }

        public ListOfEnumDefinition.Builder<_B> copyOf(final ListOfEnumDefinition _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfEnumDefinition.Builder<_B> copyOf(final ListOfEnumDefinition.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfEnumDefinition.Selector<ListOfEnumDefinition.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfEnumDefinition.Select _root() {
            return new ListOfEnumDefinition.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private EnumDefinition.Selector<TRoot, ListOfEnumDefinition.Selector<TRoot, TParent>> enumDefinition = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.enumDefinition!= null) {
                products.put("enumDefinition", this.enumDefinition.init());
            }
            return products;
        }

        public EnumDefinition.Selector<TRoot, ListOfEnumDefinition.Selector<TRoot, TParent>> enumDefinition() {
            return ((this.enumDefinition == null)?this.enumDefinition = new EnumDefinition.Selector<TRoot, ListOfEnumDefinition.Selector<TRoot, TParent>>(this._root, this, "enumDefinition"):this.enumDefinition);
        }

    }

}
