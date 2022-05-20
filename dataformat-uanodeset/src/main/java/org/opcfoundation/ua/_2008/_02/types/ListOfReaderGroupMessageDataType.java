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
 * <p>Java-Klasse für ListOfReaderGroupMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfReaderGroupMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReaderGroupMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ReaderGroupMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfReaderGroupMessageDataType", propOrder = {
    "readerGroupMessageDataType"
})
public class ListOfReaderGroupMessageDataType {

    @XmlElement(name = "ReaderGroupMessageDataType", nillable = true)
    protected List<ReaderGroupMessageDataType> readerGroupMessageDataType;

    /**
     * Gets the value of the readerGroupMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readerGroupMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReaderGroupMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReaderGroupMessageDataType }
     * 
     * 
     */
    public List<ReaderGroupMessageDataType> getReaderGroupMessageDataType() {
        if (readerGroupMessageDataType == null) {
            readerGroupMessageDataType = new ArrayList<ReaderGroupMessageDataType>();
        }
        return this.readerGroupMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfReaderGroupMessageDataType.Builder<_B> _other) {
        if (this.readerGroupMessageDataType == null) {
            _other.readerGroupMessageDataType = null;
        } else {
            _other.readerGroupMessageDataType = new ArrayList<ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>>>();
            for (ReaderGroupMessageDataType _item: this.readerGroupMessageDataType) {
                _other.readerGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfReaderGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfReaderGroupMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfReaderGroupMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfReaderGroupMessageDataType.Builder<Void> builder() {
        return new ListOfReaderGroupMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfReaderGroupMessageDataType.Builder<_B> copyOf(final ListOfReaderGroupMessageDataType _other) {
        final ListOfReaderGroupMessageDataType.Builder<_B> _newBuilder = new ListOfReaderGroupMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfReaderGroupMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree readerGroupMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readerGroupMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readerGroupMessageDataTypePropertyTree!= null):((readerGroupMessageDataTypePropertyTree == null)||(!readerGroupMessageDataTypePropertyTree.isLeaf())))) {
            if (this.readerGroupMessageDataType == null) {
                _other.readerGroupMessageDataType = null;
            } else {
                _other.readerGroupMessageDataType = new ArrayList<ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>>>();
                for (ReaderGroupMessageDataType _item: this.readerGroupMessageDataType) {
                    _other.readerGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, readerGroupMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfReaderGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfReaderGroupMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfReaderGroupMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfReaderGroupMessageDataType.Builder<_B> copyOf(final ListOfReaderGroupMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfReaderGroupMessageDataType.Builder<_B> _newBuilder = new ListOfReaderGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfReaderGroupMessageDataType.Builder<Void> copyExcept(final ListOfReaderGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfReaderGroupMessageDataType.Builder<Void> copyOnly(final ListOfReaderGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfReaderGroupMessageDataType _storedValue;
        private List<ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>>> readerGroupMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfReaderGroupMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.readerGroupMessageDataType == null) {
                        this.readerGroupMessageDataType = null;
                    } else {
                        this.readerGroupMessageDataType = new ArrayList<ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>>>();
                        for (ReaderGroupMessageDataType _item: _other.readerGroupMessageDataType) {
                            this.readerGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfReaderGroupMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree readerGroupMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readerGroupMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readerGroupMessageDataTypePropertyTree!= null):((readerGroupMessageDataTypePropertyTree == null)||(!readerGroupMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.readerGroupMessageDataType == null) {
                            this.readerGroupMessageDataType = null;
                        } else {
                            this.readerGroupMessageDataType = new ArrayList<ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>>>();
                            for (ReaderGroupMessageDataType _item: _other.readerGroupMessageDataType) {
                                this.readerGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, readerGroupMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfReaderGroupMessageDataType >_P init(final _P _product) {
            if (this.readerGroupMessageDataType!= null) {
                final List<ReaderGroupMessageDataType> readerGroupMessageDataType = new ArrayList<ReaderGroupMessageDataType>(this.readerGroupMessageDataType.size());
                for (ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>> _item: this.readerGroupMessageDataType) {
                    readerGroupMessageDataType.add(_item.build());
                }
                _product.readerGroupMessageDataType = readerGroupMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "readerGroupMessageDataType" hinzu.
         * 
         * @param readerGroupMessageDataType
         *     Werte, die zur Eigenschaft "readerGroupMessageDataType" hinzugefügt werden.
         */
        public ListOfReaderGroupMessageDataType.Builder<_B> addReaderGroupMessageDataType(final Iterable<? extends ReaderGroupMessageDataType> readerGroupMessageDataType) {
            if (readerGroupMessageDataType!= null) {
                if (this.readerGroupMessageDataType == null) {
                    this.readerGroupMessageDataType = new ArrayList<ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>>>();
                }
                for (ReaderGroupMessageDataType _item: readerGroupMessageDataType) {
                    this.readerGroupMessageDataType.add(new ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readerGroupMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param readerGroupMessageDataType
         *     Neuer Wert der Eigenschaft "readerGroupMessageDataType".
         */
        public ListOfReaderGroupMessageDataType.Builder<_B> withReaderGroupMessageDataType(final Iterable<? extends ReaderGroupMessageDataType> readerGroupMessageDataType) {
            if (this.readerGroupMessageDataType!= null) {
                this.readerGroupMessageDataType.clear();
            }
            return addReaderGroupMessageDataType(readerGroupMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "readerGroupMessageDataType" hinzu.
         * 
         * @param readerGroupMessageDataType
         *     Werte, die zur Eigenschaft "readerGroupMessageDataType" hinzugefügt werden.
         */
        public ListOfReaderGroupMessageDataType.Builder<_B> addReaderGroupMessageDataType(ReaderGroupMessageDataType... readerGroupMessageDataType) {
            addReaderGroupMessageDataType(Arrays.asList(readerGroupMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readerGroupMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param readerGroupMessageDataType
         *     Neuer Wert der Eigenschaft "readerGroupMessageDataType".
         */
        public ListOfReaderGroupMessageDataType.Builder<_B> withReaderGroupMessageDataType(ReaderGroupMessageDataType... readerGroupMessageDataType) {
            withReaderGroupMessageDataType(Arrays.asList(readerGroupMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ReaderGroupMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ReaderGroupMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ReaderGroupMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ReaderGroupMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ReaderGroupMessageDataType.Builder<? extends ListOfReaderGroupMessageDataType.Builder<_B>> addReaderGroupMessageDataType() {
            if (this.readerGroupMessageDataType == null) {
                this.readerGroupMessageDataType = new ArrayList<ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>>>();
            }
            final ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>> readerGroupMessageDataType_Builder = new ReaderGroupMessageDataType.Builder<ListOfReaderGroupMessageDataType.Builder<_B>>(this, null, false);
            this.readerGroupMessageDataType.add(readerGroupMessageDataType_Builder);
            return readerGroupMessageDataType_Builder;
        }

        @Override
        public ListOfReaderGroupMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfReaderGroupMessageDataType());
            } else {
                return ((ListOfReaderGroupMessageDataType) _storedValue);
            }
        }

        public ListOfReaderGroupMessageDataType.Builder<_B> copyOf(final ListOfReaderGroupMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfReaderGroupMessageDataType.Builder<_B> copyOf(final ListOfReaderGroupMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfReaderGroupMessageDataType.Selector<ListOfReaderGroupMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfReaderGroupMessageDataType.Select _root() {
            return new ListOfReaderGroupMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ReaderGroupMessageDataType.Selector<TRoot, ListOfReaderGroupMessageDataType.Selector<TRoot, TParent>> readerGroupMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.readerGroupMessageDataType!= null) {
                products.put("readerGroupMessageDataType", this.readerGroupMessageDataType.init());
            }
            return products;
        }

        public ReaderGroupMessageDataType.Selector<TRoot, ListOfReaderGroupMessageDataType.Selector<TRoot, TParent>> readerGroupMessageDataType() {
            return ((this.readerGroupMessageDataType == null)?this.readerGroupMessageDataType = new ReaderGroupMessageDataType.Selector<TRoot, ListOfReaderGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "readerGroupMessageDataType"):this.readerGroupMessageDataType);
        }

    }

}
