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
 * <p>Java-Klasse für ListOfWriterGroupTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfWriterGroupTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WriterGroupTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}WriterGroupTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfWriterGroupTransportDataType", propOrder = {
    "writerGroupTransportDataType"
})
public class ListOfWriterGroupTransportDataType {

    @XmlElement(name = "WriterGroupTransportDataType", nillable = true)
    protected List<WriterGroupTransportDataType> writerGroupTransportDataType;

    /**
     * Gets the value of the writerGroupTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the writerGroupTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWriterGroupTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WriterGroupTransportDataType }
     * 
     * 
     */
    public List<WriterGroupTransportDataType> getWriterGroupTransportDataType() {
        if (writerGroupTransportDataType == null) {
            writerGroupTransportDataType = new ArrayList<WriterGroupTransportDataType>();
        }
        return this.writerGroupTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfWriterGroupTransportDataType.Builder<_B> _other) {
        if (this.writerGroupTransportDataType == null) {
            _other.writerGroupTransportDataType = null;
        } else {
            _other.writerGroupTransportDataType = new ArrayList<WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>>>();
            for (WriterGroupTransportDataType _item: this.writerGroupTransportDataType) {
                _other.writerGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfWriterGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfWriterGroupTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfWriterGroupTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfWriterGroupTransportDataType.Builder<Void> builder() {
        return new ListOfWriterGroupTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfWriterGroupTransportDataType _other) {
        final ListOfWriterGroupTransportDataType.Builder<_B> _newBuilder = new ListOfWriterGroupTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfWriterGroupTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree writerGroupTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupTransportDataTypePropertyTree!= null):((writerGroupTransportDataTypePropertyTree == null)||(!writerGroupTransportDataTypePropertyTree.isLeaf())))) {
            if (this.writerGroupTransportDataType == null) {
                _other.writerGroupTransportDataType = null;
            } else {
                _other.writerGroupTransportDataType = new ArrayList<WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>>>();
                for (WriterGroupTransportDataType _item: this.writerGroupTransportDataType) {
                    _other.writerGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, writerGroupTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfWriterGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfWriterGroupTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfWriterGroupTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfWriterGroupTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfWriterGroupTransportDataType.Builder<_B> _newBuilder = new ListOfWriterGroupTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfWriterGroupTransportDataType.Builder<Void> copyExcept(final ListOfWriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfWriterGroupTransportDataType.Builder<Void> copyOnly(final ListOfWriterGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfWriterGroupTransportDataType _storedValue;
        private List<WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>>> writerGroupTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfWriterGroupTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.writerGroupTransportDataType == null) {
                        this.writerGroupTransportDataType = null;
                    } else {
                        this.writerGroupTransportDataType = new ArrayList<WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>>>();
                        for (WriterGroupTransportDataType _item: _other.writerGroupTransportDataType) {
                            this.writerGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfWriterGroupTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree writerGroupTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupTransportDataTypePropertyTree!= null):((writerGroupTransportDataTypePropertyTree == null)||(!writerGroupTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.writerGroupTransportDataType == null) {
                            this.writerGroupTransportDataType = null;
                        } else {
                            this.writerGroupTransportDataType = new ArrayList<WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>>>();
                            for (WriterGroupTransportDataType _item: _other.writerGroupTransportDataType) {
                                this.writerGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, writerGroupTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfWriterGroupTransportDataType >_P init(final _P _product) {
            if (this.writerGroupTransportDataType!= null) {
                final List<WriterGroupTransportDataType> writerGroupTransportDataType = new ArrayList<WriterGroupTransportDataType>(this.writerGroupTransportDataType.size());
                for (WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>> _item: this.writerGroupTransportDataType) {
                    writerGroupTransportDataType.add(_item.build());
                }
                _product.writerGroupTransportDataType = writerGroupTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "writerGroupTransportDataType" hinzu.
         * 
         * @param writerGroupTransportDataType
         *     Werte, die zur Eigenschaft "writerGroupTransportDataType" hinzugefügt werden.
         */
        public ListOfWriterGroupTransportDataType.Builder<_B> addWriterGroupTransportDataType(final Iterable<? extends WriterGroupTransportDataType> writerGroupTransportDataType) {
            if (writerGroupTransportDataType!= null) {
                if (this.writerGroupTransportDataType == null) {
                    this.writerGroupTransportDataType = new ArrayList<WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>>>();
                }
                for (WriterGroupTransportDataType _item: writerGroupTransportDataType) {
                    this.writerGroupTransportDataType.add(new WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writerGroupTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param writerGroupTransportDataType
         *     Neuer Wert der Eigenschaft "writerGroupTransportDataType".
         */
        public ListOfWriterGroupTransportDataType.Builder<_B> withWriterGroupTransportDataType(final Iterable<? extends WriterGroupTransportDataType> writerGroupTransportDataType) {
            if (this.writerGroupTransportDataType!= null) {
                this.writerGroupTransportDataType.clear();
            }
            return addWriterGroupTransportDataType(writerGroupTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "writerGroupTransportDataType" hinzu.
         * 
         * @param writerGroupTransportDataType
         *     Werte, die zur Eigenschaft "writerGroupTransportDataType" hinzugefügt werden.
         */
        public ListOfWriterGroupTransportDataType.Builder<_B> addWriterGroupTransportDataType(WriterGroupTransportDataType... writerGroupTransportDataType) {
            addWriterGroupTransportDataType(Arrays.asList(writerGroupTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writerGroupTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param writerGroupTransportDataType
         *     Neuer Wert der Eigenschaft "writerGroupTransportDataType".
         */
        public ListOfWriterGroupTransportDataType.Builder<_B> withWriterGroupTransportDataType(WriterGroupTransportDataType... writerGroupTransportDataType) {
            withWriterGroupTransportDataType(Arrays.asList(writerGroupTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "WriterGroupTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.WriterGroupTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "WriterGroupTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.WriterGroupTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public WriterGroupTransportDataType.Builder<? extends ListOfWriterGroupTransportDataType.Builder<_B>> addWriterGroupTransportDataType() {
            if (this.writerGroupTransportDataType == null) {
                this.writerGroupTransportDataType = new ArrayList<WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>>>();
            }
            final WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>> writerGroupTransportDataType_Builder = new WriterGroupTransportDataType.Builder<ListOfWriterGroupTransportDataType.Builder<_B>>(this, null, false);
            this.writerGroupTransportDataType.add(writerGroupTransportDataType_Builder);
            return writerGroupTransportDataType_Builder;
        }

        @Override
        public ListOfWriterGroupTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfWriterGroupTransportDataType());
            } else {
                return ((ListOfWriterGroupTransportDataType) _storedValue);
            }
        }

        public ListOfWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfWriterGroupTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfWriterGroupTransportDataType.Builder<_B> copyOf(final ListOfWriterGroupTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfWriterGroupTransportDataType.Selector<ListOfWriterGroupTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfWriterGroupTransportDataType.Select _root() {
            return new ListOfWriterGroupTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private WriterGroupTransportDataType.Selector<TRoot, ListOfWriterGroupTransportDataType.Selector<TRoot, TParent>> writerGroupTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.writerGroupTransportDataType!= null) {
                products.put("writerGroupTransportDataType", this.writerGroupTransportDataType.init());
            }
            return products;
        }

        public WriterGroupTransportDataType.Selector<TRoot, ListOfWriterGroupTransportDataType.Selector<TRoot, TParent>> writerGroupTransportDataType() {
            return ((this.writerGroupTransportDataType == null)?this.writerGroupTransportDataType = new WriterGroupTransportDataType.Selector<TRoot, ListOfWriterGroupTransportDataType.Selector<TRoot, TParent>>(this._root, this, "writerGroupTransportDataType"):this.writerGroupTransportDataType);
        }

    }

}
