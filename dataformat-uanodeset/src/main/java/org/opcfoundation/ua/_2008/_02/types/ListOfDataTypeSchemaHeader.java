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
 * <p>Java-Klasse für ListOfDataTypeSchemaHeader complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataTypeSchemaHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataTypeSchemaHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeSchemaHeader" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataTypeSchemaHeader", propOrder = {
    "dataTypeSchemaHeader"
})
public class ListOfDataTypeSchemaHeader {

    @XmlElement(name = "DataTypeSchemaHeader", nillable = true)
    protected List<DataTypeSchemaHeader> dataTypeSchemaHeader;

    /**
     * Gets the value of the dataTypeSchemaHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataTypeSchemaHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataTypeSchemaHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTypeSchemaHeader }
     * 
     * 
     */
    public List<DataTypeSchemaHeader> getDataTypeSchemaHeader() {
        if (dataTypeSchemaHeader == null) {
            dataTypeSchemaHeader = new ArrayList<DataTypeSchemaHeader>();
        }
        return this.dataTypeSchemaHeader;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataTypeSchemaHeader.Builder<_B> _other) {
        if (this.dataTypeSchemaHeader == null) {
            _other.dataTypeSchemaHeader = null;
        } else {
            _other.dataTypeSchemaHeader = new ArrayList<DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>>>();
            for (DataTypeSchemaHeader _item: this.dataTypeSchemaHeader) {
                _other.dataTypeSchemaHeader.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDataTypeSchemaHeader.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataTypeSchemaHeader.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataTypeSchemaHeader.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataTypeSchemaHeader.Builder<Void> builder() {
        return new ListOfDataTypeSchemaHeader.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataTypeSchemaHeader.Builder<_B> copyOf(final ListOfDataTypeSchemaHeader _other) {
        final ListOfDataTypeSchemaHeader.Builder<_B> _newBuilder = new ListOfDataTypeSchemaHeader.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataTypeSchemaHeader.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataTypeSchemaHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeSchemaHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeSchemaHeaderPropertyTree!= null):((dataTypeSchemaHeaderPropertyTree == null)||(!dataTypeSchemaHeaderPropertyTree.isLeaf())))) {
            if (this.dataTypeSchemaHeader == null) {
                _other.dataTypeSchemaHeader = null;
            } else {
                _other.dataTypeSchemaHeader = new ArrayList<DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>>>();
                for (DataTypeSchemaHeader _item: this.dataTypeSchemaHeader) {
                    _other.dataTypeSchemaHeader.add(((_item == null)?null:_item.newCopyBuilder(_other, dataTypeSchemaHeaderPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDataTypeSchemaHeader.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataTypeSchemaHeader.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataTypeSchemaHeader.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataTypeSchemaHeader.Builder<_B> copyOf(final ListOfDataTypeSchemaHeader _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataTypeSchemaHeader.Builder<_B> _newBuilder = new ListOfDataTypeSchemaHeader.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataTypeSchemaHeader.Builder<Void> copyExcept(final ListOfDataTypeSchemaHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataTypeSchemaHeader.Builder<Void> copyOnly(final ListOfDataTypeSchemaHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataTypeSchemaHeader _storedValue;
        private List<DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>>> dataTypeSchemaHeader;

        public Builder(final _B _parentBuilder, final ListOfDataTypeSchemaHeader _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataTypeSchemaHeader == null) {
                        this.dataTypeSchemaHeader = null;
                    } else {
                        this.dataTypeSchemaHeader = new ArrayList<DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>>>();
                        for (DataTypeSchemaHeader _item: _other.dataTypeSchemaHeader) {
                            this.dataTypeSchemaHeader.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataTypeSchemaHeader _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataTypeSchemaHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeSchemaHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeSchemaHeaderPropertyTree!= null):((dataTypeSchemaHeaderPropertyTree == null)||(!dataTypeSchemaHeaderPropertyTree.isLeaf())))) {
                        if (_other.dataTypeSchemaHeader == null) {
                            this.dataTypeSchemaHeader = null;
                        } else {
                            this.dataTypeSchemaHeader = new ArrayList<DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>>>();
                            for (DataTypeSchemaHeader _item: _other.dataTypeSchemaHeader) {
                                this.dataTypeSchemaHeader.add(((_item == null)?null:_item.newCopyBuilder(this, dataTypeSchemaHeaderPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDataTypeSchemaHeader >_P init(final _P _product) {
            if (this.dataTypeSchemaHeader!= null) {
                final List<DataTypeSchemaHeader> dataTypeSchemaHeader = new ArrayList<DataTypeSchemaHeader>(this.dataTypeSchemaHeader.size());
                for (DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>> _item: this.dataTypeSchemaHeader) {
                    dataTypeSchemaHeader.add(_item.build());
                }
                _product.dataTypeSchemaHeader = dataTypeSchemaHeader;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataTypeSchemaHeader" hinzu.
         * 
         * @param dataTypeSchemaHeader
         *     Werte, die zur Eigenschaft "dataTypeSchemaHeader" hinzugefügt werden.
         */
        public ListOfDataTypeSchemaHeader.Builder<_B> addDataTypeSchemaHeader(final Iterable<? extends DataTypeSchemaHeader> dataTypeSchemaHeader) {
            if (dataTypeSchemaHeader!= null) {
                if (this.dataTypeSchemaHeader == null) {
                    this.dataTypeSchemaHeader = new ArrayList<DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>>>();
                }
                for (DataTypeSchemaHeader _item: dataTypeSchemaHeader) {
                    this.dataTypeSchemaHeader.add(new DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataTypeSchemaHeader" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataTypeSchemaHeader
         *     Neuer Wert der Eigenschaft "dataTypeSchemaHeader".
         */
        public ListOfDataTypeSchemaHeader.Builder<_B> withDataTypeSchemaHeader(final Iterable<? extends DataTypeSchemaHeader> dataTypeSchemaHeader) {
            if (this.dataTypeSchemaHeader!= null) {
                this.dataTypeSchemaHeader.clear();
            }
            return addDataTypeSchemaHeader(dataTypeSchemaHeader);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataTypeSchemaHeader" hinzu.
         * 
         * @param dataTypeSchemaHeader
         *     Werte, die zur Eigenschaft "dataTypeSchemaHeader" hinzugefügt werden.
         */
        public ListOfDataTypeSchemaHeader.Builder<_B> addDataTypeSchemaHeader(DataTypeSchemaHeader... dataTypeSchemaHeader) {
            addDataTypeSchemaHeader(Arrays.asList(dataTypeSchemaHeader));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataTypeSchemaHeader" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param dataTypeSchemaHeader
         *     Neuer Wert der Eigenschaft "dataTypeSchemaHeader".
         */
        public ListOfDataTypeSchemaHeader.Builder<_B> withDataTypeSchemaHeader(DataTypeSchemaHeader... dataTypeSchemaHeader) {
            withDataTypeSchemaHeader(Arrays.asList(dataTypeSchemaHeader));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DataTypeSchemaHeader".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DataTypeSchemaHeader".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.DataTypeSchemaHeader.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public DataTypeSchemaHeader.Builder<? extends ListOfDataTypeSchemaHeader.Builder<_B>> addDataTypeSchemaHeader() {
            if (this.dataTypeSchemaHeader == null) {
                this.dataTypeSchemaHeader = new ArrayList<DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>>>();
            }
            final DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>> dataTypeSchemaHeader_Builder = new DataTypeSchemaHeader.Builder<ListOfDataTypeSchemaHeader.Builder<_B>>(this, null, false);
            this.dataTypeSchemaHeader.add(dataTypeSchemaHeader_Builder);
            return dataTypeSchemaHeader_Builder;
        }

        @Override
        public ListOfDataTypeSchemaHeader build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataTypeSchemaHeader());
            } else {
                return ((ListOfDataTypeSchemaHeader) _storedValue);
            }
        }

        public ListOfDataTypeSchemaHeader.Builder<_B> copyOf(final ListOfDataTypeSchemaHeader _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataTypeSchemaHeader.Builder<_B> copyOf(final ListOfDataTypeSchemaHeader.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataTypeSchemaHeader.Selector<ListOfDataTypeSchemaHeader.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataTypeSchemaHeader.Select _root() {
            return new ListOfDataTypeSchemaHeader.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DataTypeSchemaHeader.Selector<TRoot, ListOfDataTypeSchemaHeader.Selector<TRoot, TParent>> dataTypeSchemaHeader = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataTypeSchemaHeader!= null) {
                products.put("dataTypeSchemaHeader", this.dataTypeSchemaHeader.init());
            }
            return products;
        }

        public DataTypeSchemaHeader.Selector<TRoot, ListOfDataTypeSchemaHeader.Selector<TRoot, TParent>> dataTypeSchemaHeader() {
            return ((this.dataTypeSchemaHeader == null)?this.dataTypeSchemaHeader = new DataTypeSchemaHeader.Selector<TRoot, ListOfDataTypeSchemaHeader.Selector<TRoot, TParent>>(this._root, this, "dataTypeSchemaHeader"):this.dataTypeSchemaHeader);
        }

    }

}
