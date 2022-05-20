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
 * <p>Java-Klasse für ListOfReaderGroupTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfReaderGroupTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReaderGroupTransportDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ReaderGroupTransportDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfReaderGroupTransportDataType", propOrder = {
    "readerGroupTransportDataType"
})
public class ListOfReaderGroupTransportDataType {

    @XmlElement(name = "ReaderGroupTransportDataType", nillable = true)
    protected List<ReaderGroupTransportDataType> readerGroupTransportDataType;

    /**
     * Gets the value of the readerGroupTransportDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readerGroupTransportDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReaderGroupTransportDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReaderGroupTransportDataType }
     * 
     * 
     */
    public List<ReaderGroupTransportDataType> getReaderGroupTransportDataType() {
        if (readerGroupTransportDataType == null) {
            readerGroupTransportDataType = new ArrayList<ReaderGroupTransportDataType>();
        }
        return this.readerGroupTransportDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfReaderGroupTransportDataType.Builder<_B> _other) {
        if (this.readerGroupTransportDataType == null) {
            _other.readerGroupTransportDataType = null;
        } else {
            _other.readerGroupTransportDataType = new ArrayList<ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>>>();
            for (ReaderGroupTransportDataType _item: this.readerGroupTransportDataType) {
                _other.readerGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfReaderGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfReaderGroupTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfReaderGroupTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfReaderGroupTransportDataType.Builder<Void> builder() {
        return new ListOfReaderGroupTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfReaderGroupTransportDataType.Builder<_B> copyOf(final ListOfReaderGroupTransportDataType _other) {
        final ListOfReaderGroupTransportDataType.Builder<_B> _newBuilder = new ListOfReaderGroupTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfReaderGroupTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree readerGroupTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readerGroupTransportDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readerGroupTransportDataTypePropertyTree!= null):((readerGroupTransportDataTypePropertyTree == null)||(!readerGroupTransportDataTypePropertyTree.isLeaf())))) {
            if (this.readerGroupTransportDataType == null) {
                _other.readerGroupTransportDataType = null;
            } else {
                _other.readerGroupTransportDataType = new ArrayList<ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>>>();
                for (ReaderGroupTransportDataType _item: this.readerGroupTransportDataType) {
                    _other.readerGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, readerGroupTransportDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfReaderGroupTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfReaderGroupTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfReaderGroupTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfReaderGroupTransportDataType.Builder<_B> copyOf(final ListOfReaderGroupTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfReaderGroupTransportDataType.Builder<_B> _newBuilder = new ListOfReaderGroupTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfReaderGroupTransportDataType.Builder<Void> copyExcept(final ListOfReaderGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfReaderGroupTransportDataType.Builder<Void> copyOnly(final ListOfReaderGroupTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfReaderGroupTransportDataType _storedValue;
        private List<ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>>> readerGroupTransportDataType;

        public Builder(final _B _parentBuilder, final ListOfReaderGroupTransportDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.readerGroupTransportDataType == null) {
                        this.readerGroupTransportDataType = null;
                    } else {
                        this.readerGroupTransportDataType = new ArrayList<ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>>>();
                        for (ReaderGroupTransportDataType _item: _other.readerGroupTransportDataType) {
                            this.readerGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfReaderGroupTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree readerGroupTransportDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readerGroupTransportDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readerGroupTransportDataTypePropertyTree!= null):((readerGroupTransportDataTypePropertyTree == null)||(!readerGroupTransportDataTypePropertyTree.isLeaf())))) {
                        if (_other.readerGroupTransportDataType == null) {
                            this.readerGroupTransportDataType = null;
                        } else {
                            this.readerGroupTransportDataType = new ArrayList<ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>>>();
                            for (ReaderGroupTransportDataType _item: _other.readerGroupTransportDataType) {
                                this.readerGroupTransportDataType.add(((_item == null)?null:_item.newCopyBuilder(this, readerGroupTransportDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfReaderGroupTransportDataType >_P init(final _P _product) {
            if (this.readerGroupTransportDataType!= null) {
                final List<ReaderGroupTransportDataType> readerGroupTransportDataType = new ArrayList<ReaderGroupTransportDataType>(this.readerGroupTransportDataType.size());
                for (ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>> _item: this.readerGroupTransportDataType) {
                    readerGroupTransportDataType.add(_item.build());
                }
                _product.readerGroupTransportDataType = readerGroupTransportDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "readerGroupTransportDataType" hinzu.
         * 
         * @param readerGroupTransportDataType
         *     Werte, die zur Eigenschaft "readerGroupTransportDataType" hinzugefügt werden.
         */
        public ListOfReaderGroupTransportDataType.Builder<_B> addReaderGroupTransportDataType(final Iterable<? extends ReaderGroupTransportDataType> readerGroupTransportDataType) {
            if (readerGroupTransportDataType!= null) {
                if (this.readerGroupTransportDataType == null) {
                    this.readerGroupTransportDataType = new ArrayList<ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>>>();
                }
                for (ReaderGroupTransportDataType _item: readerGroupTransportDataType) {
                    this.readerGroupTransportDataType.add(new ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readerGroupTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param readerGroupTransportDataType
         *     Neuer Wert der Eigenschaft "readerGroupTransportDataType".
         */
        public ListOfReaderGroupTransportDataType.Builder<_B> withReaderGroupTransportDataType(final Iterable<? extends ReaderGroupTransportDataType> readerGroupTransportDataType) {
            if (this.readerGroupTransportDataType!= null) {
                this.readerGroupTransportDataType.clear();
            }
            return addReaderGroupTransportDataType(readerGroupTransportDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "readerGroupTransportDataType" hinzu.
         * 
         * @param readerGroupTransportDataType
         *     Werte, die zur Eigenschaft "readerGroupTransportDataType" hinzugefügt werden.
         */
        public ListOfReaderGroupTransportDataType.Builder<_B> addReaderGroupTransportDataType(ReaderGroupTransportDataType... readerGroupTransportDataType) {
            addReaderGroupTransportDataType(Arrays.asList(readerGroupTransportDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readerGroupTransportDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param readerGroupTransportDataType
         *     Neuer Wert der Eigenschaft "readerGroupTransportDataType".
         */
        public ListOfReaderGroupTransportDataType.Builder<_B> withReaderGroupTransportDataType(ReaderGroupTransportDataType... readerGroupTransportDataType) {
            withReaderGroupTransportDataType(Arrays.asList(readerGroupTransportDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ReaderGroupTransportDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ReaderGroupTransportDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ReaderGroupTransportDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ReaderGroupTransportDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ReaderGroupTransportDataType.Builder<? extends ListOfReaderGroupTransportDataType.Builder<_B>> addReaderGroupTransportDataType() {
            if (this.readerGroupTransportDataType == null) {
                this.readerGroupTransportDataType = new ArrayList<ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>>>();
            }
            final ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>> readerGroupTransportDataType_Builder = new ReaderGroupTransportDataType.Builder<ListOfReaderGroupTransportDataType.Builder<_B>>(this, null, false);
            this.readerGroupTransportDataType.add(readerGroupTransportDataType_Builder);
            return readerGroupTransportDataType_Builder;
        }

        @Override
        public ListOfReaderGroupTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfReaderGroupTransportDataType());
            } else {
                return ((ListOfReaderGroupTransportDataType) _storedValue);
            }
        }

        public ListOfReaderGroupTransportDataType.Builder<_B> copyOf(final ListOfReaderGroupTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfReaderGroupTransportDataType.Builder<_B> copyOf(final ListOfReaderGroupTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfReaderGroupTransportDataType.Selector<ListOfReaderGroupTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfReaderGroupTransportDataType.Select _root() {
            return new ListOfReaderGroupTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ReaderGroupTransportDataType.Selector<TRoot, ListOfReaderGroupTransportDataType.Selector<TRoot, TParent>> readerGroupTransportDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.readerGroupTransportDataType!= null) {
                products.put("readerGroupTransportDataType", this.readerGroupTransportDataType.init());
            }
            return products;
        }

        public ReaderGroupTransportDataType.Selector<TRoot, ListOfReaderGroupTransportDataType.Selector<TRoot, TParent>> readerGroupTransportDataType() {
            return ((this.readerGroupTransportDataType == null)?this.readerGroupTransportDataType = new ReaderGroupTransportDataType.Selector<TRoot, ListOfReaderGroupTransportDataType.Selector<TRoot, TParent>>(this._root, this, "readerGroupTransportDataType"):this.readerGroupTransportDataType);
        }

    }

}
