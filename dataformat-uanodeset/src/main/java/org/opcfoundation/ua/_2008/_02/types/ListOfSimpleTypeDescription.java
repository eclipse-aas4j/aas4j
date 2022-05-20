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
 * <p>Java-Klasse für ListOfSimpleTypeDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSimpleTypeDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SimpleTypeDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SimpleTypeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSimpleTypeDescription", propOrder = {
    "simpleTypeDescription"
})
public class ListOfSimpleTypeDescription {

    @XmlElement(name = "SimpleTypeDescription", nillable = true)
    protected List<SimpleTypeDescription> simpleTypeDescription;

    /**
     * Gets the value of the simpleTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleTypeDescription }
     * 
     * 
     */
    public List<SimpleTypeDescription> getSimpleTypeDescription() {
        if (simpleTypeDescription == null) {
            simpleTypeDescription = new ArrayList<SimpleTypeDescription>();
        }
        return this.simpleTypeDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSimpleTypeDescription.Builder<_B> _other) {
        if (this.simpleTypeDescription == null) {
            _other.simpleTypeDescription = null;
        } else {
            _other.simpleTypeDescription = new ArrayList<SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>>>();
            for (SimpleTypeDescription _item: this.simpleTypeDescription) {
                _other.simpleTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSimpleTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSimpleTypeDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSimpleTypeDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSimpleTypeDescription.Builder<Void> builder() {
        return new ListOfSimpleTypeDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSimpleTypeDescription.Builder<_B> copyOf(final ListOfSimpleTypeDescription _other) {
        final ListOfSimpleTypeDescription.Builder<_B> _newBuilder = new ListOfSimpleTypeDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSimpleTypeDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree simpleTypeDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("simpleTypeDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(simpleTypeDescriptionPropertyTree!= null):((simpleTypeDescriptionPropertyTree == null)||(!simpleTypeDescriptionPropertyTree.isLeaf())))) {
            if (this.simpleTypeDescription == null) {
                _other.simpleTypeDescription = null;
            } else {
                _other.simpleTypeDescription = new ArrayList<SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>>>();
                for (SimpleTypeDescription _item: this.simpleTypeDescription) {
                    _other.simpleTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, simpleTypeDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSimpleTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSimpleTypeDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSimpleTypeDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSimpleTypeDescription.Builder<_B> copyOf(final ListOfSimpleTypeDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSimpleTypeDescription.Builder<_B> _newBuilder = new ListOfSimpleTypeDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSimpleTypeDescription.Builder<Void> copyExcept(final ListOfSimpleTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSimpleTypeDescription.Builder<Void> copyOnly(final ListOfSimpleTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSimpleTypeDescription _storedValue;
        private List<SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>>> simpleTypeDescription;

        public Builder(final _B _parentBuilder, final ListOfSimpleTypeDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.simpleTypeDescription == null) {
                        this.simpleTypeDescription = null;
                    } else {
                        this.simpleTypeDescription = new ArrayList<SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>>>();
                        for (SimpleTypeDescription _item: _other.simpleTypeDescription) {
                            this.simpleTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSimpleTypeDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree simpleTypeDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("simpleTypeDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(simpleTypeDescriptionPropertyTree!= null):((simpleTypeDescriptionPropertyTree == null)||(!simpleTypeDescriptionPropertyTree.isLeaf())))) {
                        if (_other.simpleTypeDescription == null) {
                            this.simpleTypeDescription = null;
                        } else {
                            this.simpleTypeDescription = new ArrayList<SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>>>();
                            for (SimpleTypeDescription _item: _other.simpleTypeDescription) {
                                this.simpleTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(this, simpleTypeDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSimpleTypeDescription >_P init(final _P _product) {
            if (this.simpleTypeDescription!= null) {
                final List<SimpleTypeDescription> simpleTypeDescription = new ArrayList<SimpleTypeDescription>(this.simpleTypeDescription.size());
                for (SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>> _item: this.simpleTypeDescription) {
                    simpleTypeDescription.add(_item.build());
                }
                _product.simpleTypeDescription = simpleTypeDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "simpleTypeDescription" hinzu.
         * 
         * @param simpleTypeDescription
         *     Werte, die zur Eigenschaft "simpleTypeDescription" hinzugefügt werden.
         */
        public ListOfSimpleTypeDescription.Builder<_B> addSimpleTypeDescription(final Iterable<? extends SimpleTypeDescription> simpleTypeDescription) {
            if (simpleTypeDescription!= null) {
                if (this.simpleTypeDescription == null) {
                    this.simpleTypeDescription = new ArrayList<SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>>>();
                }
                for (SimpleTypeDescription _item: simpleTypeDescription) {
                    this.simpleTypeDescription.add(new SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "simpleTypeDescription" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param simpleTypeDescription
         *     Neuer Wert der Eigenschaft "simpleTypeDescription".
         */
        public ListOfSimpleTypeDescription.Builder<_B> withSimpleTypeDescription(final Iterable<? extends SimpleTypeDescription> simpleTypeDescription) {
            if (this.simpleTypeDescription!= null) {
                this.simpleTypeDescription.clear();
            }
            return addSimpleTypeDescription(simpleTypeDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "simpleTypeDescription" hinzu.
         * 
         * @param simpleTypeDescription
         *     Werte, die zur Eigenschaft "simpleTypeDescription" hinzugefügt werden.
         */
        public ListOfSimpleTypeDescription.Builder<_B> addSimpleTypeDescription(SimpleTypeDescription... simpleTypeDescription) {
            addSimpleTypeDescription(Arrays.asList(simpleTypeDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "simpleTypeDescription" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param simpleTypeDescription
         *     Neuer Wert der Eigenschaft "simpleTypeDescription".
         */
        public ListOfSimpleTypeDescription.Builder<_B> withSimpleTypeDescription(SimpleTypeDescription... simpleTypeDescription) {
            withSimpleTypeDescription(Arrays.asList(simpleTypeDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SimpleTypeDescription".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SimpleTypeDescription.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SimpleTypeDescription".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SimpleTypeDescription.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public SimpleTypeDescription.Builder<? extends ListOfSimpleTypeDescription.Builder<_B>> addSimpleTypeDescription() {
            if (this.simpleTypeDescription == null) {
                this.simpleTypeDescription = new ArrayList<SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>>>();
            }
            final SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>> simpleTypeDescription_Builder = new SimpleTypeDescription.Builder<ListOfSimpleTypeDescription.Builder<_B>>(this, null, false);
            this.simpleTypeDescription.add(simpleTypeDescription_Builder);
            return simpleTypeDescription_Builder;
        }

        @Override
        public ListOfSimpleTypeDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfSimpleTypeDescription());
            } else {
                return ((ListOfSimpleTypeDescription) _storedValue);
            }
        }

        public ListOfSimpleTypeDescription.Builder<_B> copyOf(final ListOfSimpleTypeDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSimpleTypeDescription.Builder<_B> copyOf(final ListOfSimpleTypeDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSimpleTypeDescription.Selector<ListOfSimpleTypeDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSimpleTypeDescription.Select _root() {
            return new ListOfSimpleTypeDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SimpleTypeDescription.Selector<TRoot, ListOfSimpleTypeDescription.Selector<TRoot, TParent>> simpleTypeDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.simpleTypeDescription!= null) {
                products.put("simpleTypeDescription", this.simpleTypeDescription.init());
            }
            return products;
        }

        public SimpleTypeDescription.Selector<TRoot, ListOfSimpleTypeDescription.Selector<TRoot, TParent>> simpleTypeDescription() {
            return ((this.simpleTypeDescription == null)?this.simpleTypeDescription = new SimpleTypeDescription.Selector<TRoot, ListOfSimpleTypeDescription.Selector<TRoot, TParent>>(this._root, this, "simpleTypeDescription"):this.simpleTypeDescription);
        }

    }

}
