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
 * <p>Java-Klasse für ListOfStructureDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfStructureDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StructureDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StructureDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfStructureDescription", propOrder = {
    "structureDescription"
})
public class ListOfStructureDescription {

    @XmlElement(name = "StructureDescription", nillable = true)
    protected List<StructureDescription> structureDescription;

    /**
     * Gets the value of the structureDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structureDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructureDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructureDescription }
     * 
     * 
     */
    public List<StructureDescription> getStructureDescription() {
        if (structureDescription == null) {
            structureDescription = new ArrayList<StructureDescription>();
        }
        return this.structureDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfStructureDescription.Builder<_B> _other) {
        if (this.structureDescription == null) {
            _other.structureDescription = null;
        } else {
            _other.structureDescription = new ArrayList<StructureDescription.Builder<ListOfStructureDescription.Builder<_B>>>();
            for (StructureDescription _item: this.structureDescription) {
                _other.structureDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfStructureDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfStructureDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfStructureDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfStructureDescription.Builder<Void> builder() {
        return new ListOfStructureDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfStructureDescription.Builder<_B> copyOf(final ListOfStructureDescription _other) {
        final ListOfStructureDescription.Builder<_B> _newBuilder = new ListOfStructureDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfStructureDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree structureDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureDescriptionPropertyTree!= null):((structureDescriptionPropertyTree == null)||(!structureDescriptionPropertyTree.isLeaf())))) {
            if (this.structureDescription == null) {
                _other.structureDescription = null;
            } else {
                _other.structureDescription = new ArrayList<StructureDescription.Builder<ListOfStructureDescription.Builder<_B>>>();
                for (StructureDescription _item: this.structureDescription) {
                    _other.structureDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, structureDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfStructureDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfStructureDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfStructureDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfStructureDescription.Builder<_B> copyOf(final ListOfStructureDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfStructureDescription.Builder<_B> _newBuilder = new ListOfStructureDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfStructureDescription.Builder<Void> copyExcept(final ListOfStructureDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfStructureDescription.Builder<Void> copyOnly(final ListOfStructureDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfStructureDescription _storedValue;
        private List<StructureDescription.Builder<ListOfStructureDescription.Builder<_B>>> structureDescription;

        public Builder(final _B _parentBuilder, final ListOfStructureDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.structureDescription == null) {
                        this.structureDescription = null;
                    } else {
                        this.structureDescription = new ArrayList<StructureDescription.Builder<ListOfStructureDescription.Builder<_B>>>();
                        for (StructureDescription _item: _other.structureDescription) {
                            this.structureDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfStructureDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree structureDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureDescriptionPropertyTree!= null):((structureDescriptionPropertyTree == null)||(!structureDescriptionPropertyTree.isLeaf())))) {
                        if (_other.structureDescription == null) {
                            this.structureDescription = null;
                        } else {
                            this.structureDescription = new ArrayList<StructureDescription.Builder<ListOfStructureDescription.Builder<_B>>>();
                            for (StructureDescription _item: _other.structureDescription) {
                                this.structureDescription.add(((_item == null)?null:_item.newCopyBuilder(this, structureDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfStructureDescription >_P init(final _P _product) {
            if (this.structureDescription!= null) {
                final List<StructureDescription> structureDescription = new ArrayList<StructureDescription>(this.structureDescription.size());
                for (StructureDescription.Builder<ListOfStructureDescription.Builder<_B>> _item: this.structureDescription) {
                    structureDescription.add(_item.build());
                }
                _product.structureDescription = structureDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "structureDescription" hinzu.
         * 
         * @param structureDescription
         *     Werte, die zur Eigenschaft "structureDescription" hinzugefügt werden.
         */
        public ListOfStructureDescription.Builder<_B> addStructureDescription(final Iterable<? extends StructureDescription> structureDescription) {
            if (structureDescription!= null) {
                if (this.structureDescription == null) {
                    this.structureDescription = new ArrayList<StructureDescription.Builder<ListOfStructureDescription.Builder<_B>>>();
                }
                for (StructureDescription _item: structureDescription) {
                    this.structureDescription.add(new StructureDescription.Builder<ListOfStructureDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param structureDescription
         *     Neuer Wert der Eigenschaft "structureDescription".
         */
        public ListOfStructureDescription.Builder<_B> withStructureDescription(final Iterable<? extends StructureDescription> structureDescription) {
            if (this.structureDescription!= null) {
                this.structureDescription.clear();
            }
            return addStructureDescription(structureDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "structureDescription" hinzu.
         * 
         * @param structureDescription
         *     Werte, die zur Eigenschaft "structureDescription" hinzugefügt werden.
         */
        public ListOfStructureDescription.Builder<_B> addStructureDescription(StructureDescription... structureDescription) {
            addStructureDescription(Arrays.asList(structureDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param structureDescription
         *     Neuer Wert der Eigenschaft "structureDescription".
         */
        public ListOfStructureDescription.Builder<_B> withStructureDescription(StructureDescription... structureDescription) {
            withStructureDescription(Arrays.asList(structureDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "StructureDescription".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.StructureDescription.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "StructureDescription".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.StructureDescription.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public StructureDescription.Builder<? extends ListOfStructureDescription.Builder<_B>> addStructureDescription() {
            if (this.structureDescription == null) {
                this.structureDescription = new ArrayList<StructureDescription.Builder<ListOfStructureDescription.Builder<_B>>>();
            }
            final StructureDescription.Builder<ListOfStructureDescription.Builder<_B>> structureDescription_Builder = new StructureDescription.Builder<ListOfStructureDescription.Builder<_B>>(this, null, false);
            this.structureDescription.add(structureDescription_Builder);
            return structureDescription_Builder;
        }

        @Override
        public ListOfStructureDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfStructureDescription());
            } else {
                return ((ListOfStructureDescription) _storedValue);
            }
        }

        public ListOfStructureDescription.Builder<_B> copyOf(final ListOfStructureDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfStructureDescription.Builder<_B> copyOf(final ListOfStructureDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfStructureDescription.Selector<ListOfStructureDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfStructureDescription.Select _root() {
            return new ListOfStructureDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StructureDescription.Selector<TRoot, ListOfStructureDescription.Selector<TRoot, TParent>> structureDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.structureDescription!= null) {
                products.put("structureDescription", this.structureDescription.init());
            }
            return products;
        }

        public StructureDescription.Selector<TRoot, ListOfStructureDescription.Selector<TRoot, TParent>> structureDescription() {
            return ((this.structureDescription == null)?this.structureDescription = new StructureDescription.Selector<TRoot, ListOfStructureDescription.Selector<TRoot, TParent>>(this._root, this, "structureDescription"):this.structureDescription);
        }

    }

}
