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
 * <p>Java-Klasse für ListOfDataTypeDefinition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataTypeDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataTypeDefinition" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataTypeDefinition", propOrder = {
    "dataTypeDefinition"
})
public class ListOfDataTypeDefinition {

    @XmlElement(name = "DataTypeDefinition", nillable = true)
    protected List<DataTypeDefinition> dataTypeDefinition;

    /**
     * Gets the value of the dataTypeDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataTypeDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataTypeDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTypeDefinition }
     * 
     * 
     */
    public List<DataTypeDefinition> getDataTypeDefinition() {
        if (dataTypeDefinition == null) {
            dataTypeDefinition = new ArrayList<DataTypeDefinition>();
        }
        return this.dataTypeDefinition;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataTypeDefinition.Builder<_B> _other) {
        if (this.dataTypeDefinition == null) {
            _other.dataTypeDefinition = null;
        } else {
            _other.dataTypeDefinition = new ArrayList<DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>>>();
            for (DataTypeDefinition _item: this.dataTypeDefinition) {
                _other.dataTypeDefinition.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataTypeDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataTypeDefinition.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataTypeDefinition.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataTypeDefinition.Builder<Void> builder() {
        return new ListOfDataTypeDefinition.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataTypeDefinition.Builder<_B> copyOf(final ListOfDataTypeDefinition _other) {
        final ListOfDataTypeDefinition.Builder<_B> _newBuilder = new ListOfDataTypeDefinition.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataTypeDefinition.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataTypeDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeDefinition"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeDefinitionPropertyTree!= null):((dataTypeDefinitionPropertyTree == null)||(!dataTypeDefinitionPropertyTree.isLeaf())))) {
            if (this.dataTypeDefinition == null) {
                _other.dataTypeDefinition = null;
            } else {
                _other.dataTypeDefinition = new ArrayList<DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>>>();
                for (DataTypeDefinition _item: this.dataTypeDefinition) {
                    _other.dataTypeDefinition.add(((_item == null)?null:_item.newCopyBuilder(_other, dataTypeDefinitionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataTypeDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataTypeDefinition.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataTypeDefinition.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataTypeDefinition.Builder<_B> copyOf(final ListOfDataTypeDefinition _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataTypeDefinition.Builder<_B> _newBuilder = new ListOfDataTypeDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataTypeDefinition.Builder<Void> copyExcept(final ListOfDataTypeDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataTypeDefinition.Builder<Void> copyOnly(final ListOfDataTypeDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataTypeDefinition _storedValue;
        private List<DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>>> dataTypeDefinition;

        public Builder(final _B _parentBuilder, final ListOfDataTypeDefinition _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataTypeDefinition == null) {
                        this.dataTypeDefinition = null;
                    } else {
                        this.dataTypeDefinition = new ArrayList<DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>>>();
                        for (DataTypeDefinition _item: _other.dataTypeDefinition) {
                            this.dataTypeDefinition.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataTypeDefinition _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataTypeDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeDefinition"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeDefinitionPropertyTree!= null):((dataTypeDefinitionPropertyTree == null)||(!dataTypeDefinitionPropertyTree.isLeaf())))) {
                        if (_other.dataTypeDefinition == null) {
                            this.dataTypeDefinition = null;
                        } else {
                            this.dataTypeDefinition = new ArrayList<DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>>>();
                            for (DataTypeDefinition _item: _other.dataTypeDefinition) {
                                this.dataTypeDefinition.add(((_item == null)?null:_item.newCopyBuilder(this, dataTypeDefinitionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataTypeDefinition >_P init(final _P _product) {
            if (this.dataTypeDefinition!= null) {
                final List<DataTypeDefinition> dataTypeDefinition = new ArrayList<DataTypeDefinition>(this.dataTypeDefinition.size());
                for (DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>> _item: this.dataTypeDefinition) {
                    dataTypeDefinition.add(_item.build());
                }
                _product.dataTypeDefinition = dataTypeDefinition;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataTypeDefinition" hinzu.
         * 
         * @param dataTypeDefinition
         *     Werte, die zur Eigenschaft "dataTypeDefinition" hinzugefügt werden.
         */
        public ListOfDataTypeDefinition.Builder<_B> addDataTypeDefinition(final Iterable<? extends DataTypeDefinition> dataTypeDefinition) {
            if (dataTypeDefinition!= null) {
                if (this.dataTypeDefinition == null) {
                    this.dataTypeDefinition = new ArrayList<DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>>>();
                }
                for (DataTypeDefinition _item: dataTypeDefinition) {
                    this.dataTypeDefinition.add(new DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataTypeDefinition" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataTypeDefinition
         *     Neuer Wert der Eigenschaft "dataTypeDefinition".
         */
        public ListOfDataTypeDefinition.Builder<_B> withDataTypeDefinition(final Iterable<? extends DataTypeDefinition> dataTypeDefinition) {
            if (this.dataTypeDefinition!= null) {
                this.dataTypeDefinition.clear();
            }
            return addDataTypeDefinition(dataTypeDefinition);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataTypeDefinition" hinzu.
         * 
         * @param dataTypeDefinition
         *     Werte, die zur Eigenschaft "dataTypeDefinition" hinzugefügt werden.
         */
        public ListOfDataTypeDefinition.Builder<_B> addDataTypeDefinition(DataTypeDefinition... dataTypeDefinition) {
            addDataTypeDefinition(Arrays.asList(dataTypeDefinition));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataTypeDefinition" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataTypeDefinition
         *     Neuer Wert der Eigenschaft "dataTypeDefinition".
         */
        public ListOfDataTypeDefinition.Builder<_B> withDataTypeDefinition(DataTypeDefinition... dataTypeDefinition) {
            withDataTypeDefinition(Arrays.asList(dataTypeDefinition));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataTypeDefinition".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataTypeDefinition.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataTypeDefinition".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataTypeDefinition.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public DataTypeDefinition.Builder<? extends ListOfDataTypeDefinition.Builder<_B>> addDataTypeDefinition() {
            if (this.dataTypeDefinition == null) {
                this.dataTypeDefinition = new ArrayList<DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>>>();
            }
            final DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>> dataTypeDefinition_Builder = new DataTypeDefinition.Builder<ListOfDataTypeDefinition.Builder<_B>>(this, null, false);
            this.dataTypeDefinition.add(dataTypeDefinition_Builder);
            return dataTypeDefinition_Builder;
        }

        @Override
        public ListOfDataTypeDefinition build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataTypeDefinition());
            } else {
                return ((ListOfDataTypeDefinition) _storedValue);
            }
        }

        public ListOfDataTypeDefinition.Builder<_B> copyOf(final ListOfDataTypeDefinition _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataTypeDefinition.Builder<_B> copyOf(final ListOfDataTypeDefinition.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataTypeDefinition.Selector<ListOfDataTypeDefinition.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataTypeDefinition.Select _root() {
            return new ListOfDataTypeDefinition.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataTypeDefinition.Selector<TRoot, ListOfDataTypeDefinition.Selector<TRoot, TParent>> dataTypeDefinition = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataTypeDefinition!= null) {
                products.put("dataTypeDefinition", this.dataTypeDefinition.init());
            }
            return products;
        }

        public DataTypeDefinition.Selector<TRoot, ListOfDataTypeDefinition.Selector<TRoot, TParent>> dataTypeDefinition() {
            return ((this.dataTypeDefinition == null)?this.dataTypeDefinition = new DataTypeDefinition.Selector<TRoot, ListOfDataTypeDefinition.Selector<TRoot, TParent>>(this._root, this, "dataTypeDefinition"):this.dataTypeDefinition);
        }

    }

}
