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
 * <p>Java-Klasse für ListOfStructureDefinition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfStructureDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StructureDefinition" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StructureDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfStructureDefinition", propOrder = {
    "structureDefinition"
})
public class ListOfStructureDefinition {

    @XmlElement(name = "StructureDefinition", nillable = true)
    protected List<StructureDefinition> structureDefinition;

    /**
     * Gets the value of the structureDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structureDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructureDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructureDefinition }
     * 
     * 
     */
    public List<StructureDefinition> getStructureDefinition() {
        if (structureDefinition == null) {
            structureDefinition = new ArrayList<StructureDefinition>();
        }
        return this.structureDefinition;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfStructureDefinition.Builder<_B> _other) {
        if (this.structureDefinition == null) {
            _other.structureDefinition = null;
        } else {
            _other.structureDefinition = new ArrayList<StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>>>();
            for (StructureDefinition _item: this.structureDefinition) {
                _other.structureDefinition.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfStructureDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfStructureDefinition.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfStructureDefinition.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfStructureDefinition.Builder<Void> builder() {
        return new ListOfStructureDefinition.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfStructureDefinition.Builder<_B> copyOf(final ListOfStructureDefinition _other) {
        final ListOfStructureDefinition.Builder<_B> _newBuilder = new ListOfStructureDefinition.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfStructureDefinition.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree structureDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureDefinition"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureDefinitionPropertyTree!= null):((structureDefinitionPropertyTree == null)||(!structureDefinitionPropertyTree.isLeaf())))) {
            if (this.structureDefinition == null) {
                _other.structureDefinition = null;
            } else {
                _other.structureDefinition = new ArrayList<StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>>>();
                for (StructureDefinition _item: this.structureDefinition) {
                    _other.structureDefinition.add(((_item == null)?null:_item.newCopyBuilder(_other, structureDefinitionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfStructureDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfStructureDefinition.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfStructureDefinition.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfStructureDefinition.Builder<_B> copyOf(final ListOfStructureDefinition _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfStructureDefinition.Builder<_B> _newBuilder = new ListOfStructureDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfStructureDefinition.Builder<Void> copyExcept(final ListOfStructureDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfStructureDefinition.Builder<Void> copyOnly(final ListOfStructureDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfStructureDefinition _storedValue;
        private List<StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>>> structureDefinition;

        public Builder(final _B _parentBuilder, final ListOfStructureDefinition _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.structureDefinition == null) {
                        this.structureDefinition = null;
                    } else {
                        this.structureDefinition = new ArrayList<StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>>>();
                        for (StructureDefinition _item: _other.structureDefinition) {
                            this.structureDefinition.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfStructureDefinition _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree structureDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureDefinition"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureDefinitionPropertyTree!= null):((structureDefinitionPropertyTree == null)||(!structureDefinitionPropertyTree.isLeaf())))) {
                        if (_other.structureDefinition == null) {
                            this.structureDefinition = null;
                        } else {
                            this.structureDefinition = new ArrayList<StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>>>();
                            for (StructureDefinition _item: _other.structureDefinition) {
                                this.structureDefinition.add(((_item == null)?null:_item.newCopyBuilder(this, structureDefinitionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfStructureDefinition >_P init(final _P _product) {
            if (this.structureDefinition!= null) {
                final List<StructureDefinition> structureDefinition = new ArrayList<StructureDefinition>(this.structureDefinition.size());
                for (StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>> _item: this.structureDefinition) {
                    structureDefinition.add(_item.build());
                }
                _product.structureDefinition = structureDefinition;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "structureDefinition" hinzu.
         * 
         * @param structureDefinition
         *     Werte, die zur Eigenschaft "structureDefinition" hinzugefügt werden.
         */
        public ListOfStructureDefinition.Builder<_B> addStructureDefinition(final Iterable<? extends StructureDefinition> structureDefinition) {
            if (structureDefinition!= null) {
                if (this.structureDefinition == null) {
                    this.structureDefinition = new ArrayList<StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>>>();
                }
                for (StructureDefinition _item: structureDefinition) {
                    this.structureDefinition.add(new StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureDefinition" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param structureDefinition
         *     Neuer Wert der Eigenschaft "structureDefinition".
         */
        public ListOfStructureDefinition.Builder<_B> withStructureDefinition(final Iterable<? extends StructureDefinition> structureDefinition) {
            if (this.structureDefinition!= null) {
                this.structureDefinition.clear();
            }
            return addStructureDefinition(structureDefinition);
        }

        /**
         * Fügt Werte zur Eigenschaft "structureDefinition" hinzu.
         * 
         * @param structureDefinition
         *     Werte, die zur Eigenschaft "structureDefinition" hinzugefügt werden.
         */
        public ListOfStructureDefinition.Builder<_B> addStructureDefinition(StructureDefinition... structureDefinition) {
            addStructureDefinition(Arrays.asList(structureDefinition));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureDefinition" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param structureDefinition
         *     Neuer Wert der Eigenschaft "structureDefinition".
         */
        public ListOfStructureDefinition.Builder<_B> withStructureDefinition(StructureDefinition... structureDefinition) {
            withStructureDefinition(Arrays.asList(structureDefinition));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "StructureDefinition".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.StructureDefinition.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "StructureDefinition".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.StructureDefinition.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public StructureDefinition.Builder<? extends ListOfStructureDefinition.Builder<_B>> addStructureDefinition() {
            if (this.structureDefinition == null) {
                this.structureDefinition = new ArrayList<StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>>>();
            }
            final StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>> structureDefinition_Builder = new StructureDefinition.Builder<ListOfStructureDefinition.Builder<_B>>(this, null, false);
            this.structureDefinition.add(structureDefinition_Builder);
            return structureDefinition_Builder;
        }

        @Override
        public ListOfStructureDefinition build() {
            if (_storedValue == null) {
                return this.init(new ListOfStructureDefinition());
            } else {
                return ((ListOfStructureDefinition) _storedValue);
            }
        }

        public ListOfStructureDefinition.Builder<_B> copyOf(final ListOfStructureDefinition _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfStructureDefinition.Builder<_B> copyOf(final ListOfStructureDefinition.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfStructureDefinition.Selector<ListOfStructureDefinition.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfStructureDefinition.Select _root() {
            return new ListOfStructureDefinition.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StructureDefinition.Selector<TRoot, ListOfStructureDefinition.Selector<TRoot, TParent>> structureDefinition = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.structureDefinition!= null) {
                products.put("structureDefinition", this.structureDefinition.init());
            }
            return products;
        }

        public StructureDefinition.Selector<TRoot, ListOfStructureDefinition.Selector<TRoot, TParent>> structureDefinition() {
            return ((this.structureDefinition == null)?this.structureDefinition = new StructureDefinition.Selector<TRoot, ListOfStructureDefinition.Selector<TRoot, TParent>>(this._root, this, "structureDefinition"):this.structureDefinition);
        }

    }

}
