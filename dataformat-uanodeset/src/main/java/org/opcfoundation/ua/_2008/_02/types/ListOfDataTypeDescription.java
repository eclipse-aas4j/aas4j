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
 * <p>Java-Klasse für ListOfDataTypeDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataTypeDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataTypeDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataTypeDescription", propOrder = {
    "dataTypeDescription"
})
public class ListOfDataTypeDescription {

    @XmlElement(name = "DataTypeDescription", nillable = true)
    protected List<DataTypeDescription> dataTypeDescription;

    /**
     * Gets the value of the dataTypeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataTypeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataTypeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTypeDescription }
     * 
     * 
     */
    public List<DataTypeDescription> getDataTypeDescription() {
        if (dataTypeDescription == null) {
            dataTypeDescription = new ArrayList<DataTypeDescription>();
        }
        return this.dataTypeDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataTypeDescription.Builder<_B> _other) {
        if (this.dataTypeDescription == null) {
            _other.dataTypeDescription = null;
        } else {
            _other.dataTypeDescription = new ArrayList<DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>>>();
            for (DataTypeDescription _item: this.dataTypeDescription) {
                _other.dataTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataTypeDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataTypeDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataTypeDescription.Builder<Void> builder() {
        return new ListOfDataTypeDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataTypeDescription.Builder<_B> copyOf(final ListOfDataTypeDescription _other) {
        final ListOfDataTypeDescription.Builder<_B> _newBuilder = new ListOfDataTypeDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataTypeDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataTypeDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeDescriptionPropertyTree!= null):((dataTypeDescriptionPropertyTree == null)||(!dataTypeDescriptionPropertyTree.isLeaf())))) {
            if (this.dataTypeDescription == null) {
                _other.dataTypeDescription = null;
            } else {
                _other.dataTypeDescription = new ArrayList<DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>>>();
                for (DataTypeDescription _item: this.dataTypeDescription) {
                    _other.dataTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, dataTypeDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataTypeDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataTypeDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataTypeDescription.Builder<_B> copyOf(final ListOfDataTypeDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataTypeDescription.Builder<_B> _newBuilder = new ListOfDataTypeDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataTypeDescription.Builder<Void> copyExcept(final ListOfDataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataTypeDescription.Builder<Void> copyOnly(final ListOfDataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataTypeDescription _storedValue;
        private List<DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>>> dataTypeDescription;

        public Builder(final _B _parentBuilder, final ListOfDataTypeDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataTypeDescription == null) {
                        this.dataTypeDescription = null;
                    } else {
                        this.dataTypeDescription = new ArrayList<DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>>>();
                        for (DataTypeDescription _item: _other.dataTypeDescription) {
                            this.dataTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataTypeDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataTypeDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeDescriptionPropertyTree!= null):((dataTypeDescriptionPropertyTree == null)||(!dataTypeDescriptionPropertyTree.isLeaf())))) {
                        if (_other.dataTypeDescription == null) {
                            this.dataTypeDescription = null;
                        } else {
                            this.dataTypeDescription = new ArrayList<DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>>>();
                            for (DataTypeDescription _item: _other.dataTypeDescription) {
                                this.dataTypeDescription.add(((_item == null)?null:_item.newCopyBuilder(this, dataTypeDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataTypeDescription >_P init(final _P _product) {
            if (this.dataTypeDescription!= null) {
                final List<DataTypeDescription> dataTypeDescription = new ArrayList<DataTypeDescription>(this.dataTypeDescription.size());
                for (DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>> _item: this.dataTypeDescription) {
                    dataTypeDescription.add(_item.build());
                }
                _product.dataTypeDescription = dataTypeDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataTypeDescription" hinzu.
         * 
         * @param dataTypeDescription
         *     Werte, die zur Eigenschaft "dataTypeDescription" hinzugefügt werden.
         */
        public ListOfDataTypeDescription.Builder<_B> addDataTypeDescription(final Iterable<? extends DataTypeDescription> dataTypeDescription) {
            if (dataTypeDescription!= null) {
                if (this.dataTypeDescription == null) {
                    this.dataTypeDescription = new ArrayList<DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>>>();
                }
                for (DataTypeDescription _item: dataTypeDescription) {
                    this.dataTypeDescription.add(new DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataTypeDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataTypeDescription
         *     Neuer Wert der Eigenschaft "dataTypeDescription".
         */
        public ListOfDataTypeDescription.Builder<_B> withDataTypeDescription(final Iterable<? extends DataTypeDescription> dataTypeDescription) {
            if (this.dataTypeDescription!= null) {
                this.dataTypeDescription.clear();
            }
            return addDataTypeDescription(dataTypeDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataTypeDescription" hinzu.
         * 
         * @param dataTypeDescription
         *     Werte, die zur Eigenschaft "dataTypeDescription" hinzugefügt werden.
         */
        public ListOfDataTypeDescription.Builder<_B> addDataTypeDescription(DataTypeDescription... dataTypeDescription) {
            addDataTypeDescription(Arrays.asList(dataTypeDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataTypeDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataTypeDescription
         *     Neuer Wert der Eigenschaft "dataTypeDescription".
         */
        public ListOfDataTypeDescription.Builder<_B> withDataTypeDescription(DataTypeDescription... dataTypeDescription) {
            withDataTypeDescription(Arrays.asList(dataTypeDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataTypeDescription".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataTypeDescription.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataTypeDescription".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataTypeDescription.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public DataTypeDescription.Builder<? extends ListOfDataTypeDescription.Builder<_B>> addDataTypeDescription() {
            if (this.dataTypeDescription == null) {
                this.dataTypeDescription = new ArrayList<DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>>>();
            }
            final DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>> dataTypeDescription_Builder = new DataTypeDescription.Builder<ListOfDataTypeDescription.Builder<_B>>(this, null, false);
            this.dataTypeDescription.add(dataTypeDescription_Builder);
            return dataTypeDescription_Builder;
        }

        @Override
        public ListOfDataTypeDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataTypeDescription());
            } else {
                return ((ListOfDataTypeDescription) _storedValue);
            }
        }

        public ListOfDataTypeDescription.Builder<_B> copyOf(final ListOfDataTypeDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataTypeDescription.Builder<_B> copyOf(final ListOfDataTypeDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataTypeDescription.Selector<ListOfDataTypeDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataTypeDescription.Select _root() {
            return new ListOfDataTypeDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataTypeDescription.Selector<TRoot, ListOfDataTypeDescription.Selector<TRoot, TParent>> dataTypeDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataTypeDescription!= null) {
                products.put("dataTypeDescription", this.dataTypeDescription.init());
            }
            return products;
        }

        public DataTypeDescription.Selector<TRoot, ListOfDataTypeDescription.Selector<TRoot, TParent>> dataTypeDescription() {
            return ((this.dataTypeDescription == null)?this.dataTypeDescription = new DataTypeDescription.Selector<TRoot, ListOfDataTypeDescription.Selector<TRoot, TParent>>(this._root, this, "dataTypeDescription"):this.dataTypeDescription);
        }

    }

}
