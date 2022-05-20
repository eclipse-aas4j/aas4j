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
 * <p>Java-Klasse für ListOfStructureField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfStructureField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StructureField" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StructureField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfStructureField", propOrder = {
    "structureField"
})
public class ListOfStructureField {

    @XmlElement(name = "StructureField", nillable = true)
    protected List<StructureField> structureField;

    /**
     * Gets the value of the structureField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structureField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructureField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructureField }
     * 
     * 
     */
    public List<StructureField> getStructureField() {
        if (structureField == null) {
            structureField = new ArrayList<StructureField>();
        }
        return this.structureField;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfStructureField.Builder<_B> _other) {
        if (this.structureField == null) {
            _other.structureField = null;
        } else {
            _other.structureField = new ArrayList<StructureField.Builder<ListOfStructureField.Builder<_B>>>();
            for (StructureField _item: this.structureField) {
                _other.structureField.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfStructureField.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfStructureField.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfStructureField.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfStructureField.Builder<Void> builder() {
        return new ListOfStructureField.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfStructureField.Builder<_B> copyOf(final ListOfStructureField _other) {
        final ListOfStructureField.Builder<_B> _newBuilder = new ListOfStructureField.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfStructureField.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree structureFieldPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureField"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureFieldPropertyTree!= null):((structureFieldPropertyTree == null)||(!structureFieldPropertyTree.isLeaf())))) {
            if (this.structureField == null) {
                _other.structureField = null;
            } else {
                _other.structureField = new ArrayList<StructureField.Builder<ListOfStructureField.Builder<_B>>>();
                for (StructureField _item: this.structureField) {
                    _other.structureField.add(((_item == null)?null:_item.newCopyBuilder(_other, structureFieldPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfStructureField.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfStructureField.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfStructureField.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfStructureField.Builder<_B> copyOf(final ListOfStructureField _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfStructureField.Builder<_B> _newBuilder = new ListOfStructureField.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfStructureField.Builder<Void> copyExcept(final ListOfStructureField _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfStructureField.Builder<Void> copyOnly(final ListOfStructureField _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfStructureField _storedValue;
        private List<StructureField.Builder<ListOfStructureField.Builder<_B>>> structureField;

        public Builder(final _B _parentBuilder, final ListOfStructureField _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.structureField == null) {
                        this.structureField = null;
                    } else {
                        this.structureField = new ArrayList<StructureField.Builder<ListOfStructureField.Builder<_B>>>();
                        for (StructureField _item: _other.structureField) {
                            this.structureField.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfStructureField _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree structureFieldPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureField"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureFieldPropertyTree!= null):((structureFieldPropertyTree == null)||(!structureFieldPropertyTree.isLeaf())))) {
                        if (_other.structureField == null) {
                            this.structureField = null;
                        } else {
                            this.structureField = new ArrayList<StructureField.Builder<ListOfStructureField.Builder<_B>>>();
                            for (StructureField _item: _other.structureField) {
                                this.structureField.add(((_item == null)?null:_item.newCopyBuilder(this, structureFieldPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfStructureField >_P init(final _P _product) {
            if (this.structureField!= null) {
                final List<StructureField> structureField = new ArrayList<StructureField>(this.structureField.size());
                for (StructureField.Builder<ListOfStructureField.Builder<_B>> _item: this.structureField) {
                    structureField.add(_item.build());
                }
                _product.structureField = structureField;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "structureField" hinzu.
         * 
         * @param structureField
         *     Werte, die zur Eigenschaft "structureField" hinzugefügt werden.
         */
        public ListOfStructureField.Builder<_B> addStructureField(final Iterable<? extends StructureField> structureField) {
            if (structureField!= null) {
                if (this.structureField == null) {
                    this.structureField = new ArrayList<StructureField.Builder<ListOfStructureField.Builder<_B>>>();
                }
                for (StructureField _item: structureField) {
                    this.structureField.add(new StructureField.Builder<ListOfStructureField.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureField" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param structureField
         *     Neuer Wert der Eigenschaft "structureField".
         */
        public ListOfStructureField.Builder<_B> withStructureField(final Iterable<? extends StructureField> structureField) {
            if (this.structureField!= null) {
                this.structureField.clear();
            }
            return addStructureField(structureField);
        }

        /**
         * Fügt Werte zur Eigenschaft "structureField" hinzu.
         * 
         * @param structureField
         *     Werte, die zur Eigenschaft "structureField" hinzugefügt werden.
         */
        public ListOfStructureField.Builder<_B> addStructureField(StructureField... structureField) {
            addStructureField(Arrays.asList(structureField));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureField" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param structureField
         *     Neuer Wert der Eigenschaft "structureField".
         */
        public ListOfStructureField.Builder<_B> withStructureField(StructureField... structureField) {
            withStructureField(Arrays.asList(structureField));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "StructureField".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StructureField.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "StructureField".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StructureField.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public StructureField.Builder<? extends ListOfStructureField.Builder<_B>> addStructureField() {
            if (this.structureField == null) {
                this.structureField = new ArrayList<StructureField.Builder<ListOfStructureField.Builder<_B>>>();
            }
            final StructureField.Builder<ListOfStructureField.Builder<_B>> structureField_Builder = new StructureField.Builder<ListOfStructureField.Builder<_B>>(this, null, false);
            this.structureField.add(structureField_Builder);
            return structureField_Builder;
        }

        @Override
        public ListOfStructureField build() {
            if (_storedValue == null) {
                return this.init(new ListOfStructureField());
            } else {
                return ((ListOfStructureField) _storedValue);
            }
        }

        public ListOfStructureField.Builder<_B> copyOf(final ListOfStructureField _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfStructureField.Builder<_B> copyOf(final ListOfStructureField.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfStructureField.Selector<ListOfStructureField.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfStructureField.Select _root() {
            return new ListOfStructureField.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StructureField.Selector<TRoot, ListOfStructureField.Selector<TRoot, TParent>> structureField = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.structureField!= null) {
                products.put("structureField", this.structureField.init());
            }
            return products;
        }

        public StructureField.Selector<TRoot, ListOfStructureField.Selector<TRoot, TParent>> structureField() {
            return ((this.structureField == null)?this.structureField = new StructureField.Selector<TRoot, ListOfStructureField.Selector<TRoot, TParent>>(this._root, this, "structureField"):this.structureField);
        }

    }

}
