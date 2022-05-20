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
 * <p>Java-Klasse für ListOfReaderGroupDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfReaderGroupDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReaderGroupDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ReaderGroupDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfReaderGroupDataType", propOrder = {
    "readerGroupDataType"
})
public class ListOfReaderGroupDataType {

    @XmlElement(name = "ReaderGroupDataType", nillable = true)
    protected List<ReaderGroupDataType> readerGroupDataType;

    /**
     * Gets the value of the readerGroupDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readerGroupDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReaderGroupDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReaderGroupDataType }
     * 
     * 
     */
    public List<ReaderGroupDataType> getReaderGroupDataType() {
        if (readerGroupDataType == null) {
            readerGroupDataType = new ArrayList<ReaderGroupDataType>();
        }
        return this.readerGroupDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfReaderGroupDataType.Builder<_B> _other) {
        if (this.readerGroupDataType == null) {
            _other.readerGroupDataType = null;
        } else {
            _other.readerGroupDataType = new ArrayList<ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>>>();
            for (ReaderGroupDataType _item: this.readerGroupDataType) {
                _other.readerGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfReaderGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfReaderGroupDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfReaderGroupDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfReaderGroupDataType.Builder<Void> builder() {
        return new ListOfReaderGroupDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfReaderGroupDataType.Builder<_B> copyOf(final ListOfReaderGroupDataType _other) {
        final ListOfReaderGroupDataType.Builder<_B> _newBuilder = new ListOfReaderGroupDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfReaderGroupDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree readerGroupDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readerGroupDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readerGroupDataTypePropertyTree!= null):((readerGroupDataTypePropertyTree == null)||(!readerGroupDataTypePropertyTree.isLeaf())))) {
            if (this.readerGroupDataType == null) {
                _other.readerGroupDataType = null;
            } else {
                _other.readerGroupDataType = new ArrayList<ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>>>();
                for (ReaderGroupDataType _item: this.readerGroupDataType) {
                    _other.readerGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, readerGroupDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfReaderGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfReaderGroupDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfReaderGroupDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfReaderGroupDataType.Builder<_B> copyOf(final ListOfReaderGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfReaderGroupDataType.Builder<_B> _newBuilder = new ListOfReaderGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfReaderGroupDataType.Builder<Void> copyExcept(final ListOfReaderGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfReaderGroupDataType.Builder<Void> copyOnly(final ListOfReaderGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfReaderGroupDataType _storedValue;
        private List<ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>>> readerGroupDataType;

        public Builder(final _B _parentBuilder, final ListOfReaderGroupDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.readerGroupDataType == null) {
                        this.readerGroupDataType = null;
                    } else {
                        this.readerGroupDataType = new ArrayList<ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>>>();
                        for (ReaderGroupDataType _item: _other.readerGroupDataType) {
                            this.readerGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfReaderGroupDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree readerGroupDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readerGroupDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readerGroupDataTypePropertyTree!= null):((readerGroupDataTypePropertyTree == null)||(!readerGroupDataTypePropertyTree.isLeaf())))) {
                        if (_other.readerGroupDataType == null) {
                            this.readerGroupDataType = null;
                        } else {
                            this.readerGroupDataType = new ArrayList<ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>>>();
                            for (ReaderGroupDataType _item: _other.readerGroupDataType) {
                                this.readerGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(this, readerGroupDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfReaderGroupDataType >_P init(final _P _product) {
            if (this.readerGroupDataType!= null) {
                final List<ReaderGroupDataType> readerGroupDataType = new ArrayList<ReaderGroupDataType>(this.readerGroupDataType.size());
                for (ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>> _item: this.readerGroupDataType) {
                    readerGroupDataType.add(_item.build());
                }
                _product.readerGroupDataType = readerGroupDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "readerGroupDataType" hinzu.
         * 
         * @param readerGroupDataType
         *     Werte, die zur Eigenschaft "readerGroupDataType" hinzugefügt werden.
         */
        public ListOfReaderGroupDataType.Builder<_B> addReaderGroupDataType(final Iterable<? extends ReaderGroupDataType> readerGroupDataType) {
            if (readerGroupDataType!= null) {
                if (this.readerGroupDataType == null) {
                    this.readerGroupDataType = new ArrayList<ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>>>();
                }
                for (ReaderGroupDataType _item: readerGroupDataType) {
                    this.readerGroupDataType.add(new ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readerGroupDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param readerGroupDataType
         *     Neuer Wert der Eigenschaft "readerGroupDataType".
         */
        public ListOfReaderGroupDataType.Builder<_B> withReaderGroupDataType(final Iterable<? extends ReaderGroupDataType> readerGroupDataType) {
            if (this.readerGroupDataType!= null) {
                this.readerGroupDataType.clear();
            }
            return addReaderGroupDataType(readerGroupDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "readerGroupDataType" hinzu.
         * 
         * @param readerGroupDataType
         *     Werte, die zur Eigenschaft "readerGroupDataType" hinzugefügt werden.
         */
        public ListOfReaderGroupDataType.Builder<_B> addReaderGroupDataType(ReaderGroupDataType... readerGroupDataType) {
            addReaderGroupDataType(Arrays.asList(readerGroupDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readerGroupDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param readerGroupDataType
         *     Neuer Wert der Eigenschaft "readerGroupDataType".
         */
        public ListOfReaderGroupDataType.Builder<_B> withReaderGroupDataType(ReaderGroupDataType... readerGroupDataType) {
            withReaderGroupDataType(Arrays.asList(readerGroupDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ReaderGroupDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ReaderGroupDataType.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ReaderGroupDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ReaderGroupDataType.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public ReaderGroupDataType.Builder<? extends ListOfReaderGroupDataType.Builder<_B>> addReaderGroupDataType() {
            if (this.readerGroupDataType == null) {
                this.readerGroupDataType = new ArrayList<ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>>>();
            }
            final ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>> readerGroupDataType_Builder = new ReaderGroupDataType.Builder<ListOfReaderGroupDataType.Builder<_B>>(this, null, false);
            this.readerGroupDataType.add(readerGroupDataType_Builder);
            return readerGroupDataType_Builder;
        }

        @Override
        public ListOfReaderGroupDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfReaderGroupDataType());
            } else {
                return ((ListOfReaderGroupDataType) _storedValue);
            }
        }

        public ListOfReaderGroupDataType.Builder<_B> copyOf(final ListOfReaderGroupDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfReaderGroupDataType.Builder<_B> copyOf(final ListOfReaderGroupDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfReaderGroupDataType.Selector<ListOfReaderGroupDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfReaderGroupDataType.Select _root() {
            return new ListOfReaderGroupDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ReaderGroupDataType.Selector<TRoot, ListOfReaderGroupDataType.Selector<TRoot, TParent>> readerGroupDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.readerGroupDataType!= null) {
                products.put("readerGroupDataType", this.readerGroupDataType.init());
            }
            return products;
        }

        public ReaderGroupDataType.Selector<TRoot, ListOfReaderGroupDataType.Selector<TRoot, TParent>> readerGroupDataType() {
            return ((this.readerGroupDataType == null)?this.readerGroupDataType = new ReaderGroupDataType.Selector<TRoot, ListOfReaderGroupDataType.Selector<TRoot, TParent>>(this._root, this, "readerGroupDataType"):this.readerGroupDataType);
        }

    }

}
