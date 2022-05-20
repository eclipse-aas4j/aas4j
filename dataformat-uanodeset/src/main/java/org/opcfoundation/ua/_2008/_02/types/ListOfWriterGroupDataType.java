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
 * <p>Java-Klasse für ListOfWriterGroupDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfWriterGroupDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WriterGroupDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}WriterGroupDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfWriterGroupDataType", propOrder = {
    "writerGroupDataType"
})
public class ListOfWriterGroupDataType {

    @XmlElement(name = "WriterGroupDataType", nillable = true)
    protected List<WriterGroupDataType> writerGroupDataType;

    /**
     * Gets the value of the writerGroupDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the writerGroupDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWriterGroupDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WriterGroupDataType }
     * 
     * 
     */
    public List<WriterGroupDataType> getWriterGroupDataType() {
        if (writerGroupDataType == null) {
            writerGroupDataType = new ArrayList<WriterGroupDataType>();
        }
        return this.writerGroupDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfWriterGroupDataType.Builder<_B> _other) {
        if (this.writerGroupDataType == null) {
            _other.writerGroupDataType = null;
        } else {
            _other.writerGroupDataType = new ArrayList<WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>>>();
            for (WriterGroupDataType _item: this.writerGroupDataType) {
                _other.writerGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfWriterGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfWriterGroupDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfWriterGroupDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfWriterGroupDataType.Builder<Void> builder() {
        return new ListOfWriterGroupDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfWriterGroupDataType.Builder<_B> copyOf(final ListOfWriterGroupDataType _other) {
        final ListOfWriterGroupDataType.Builder<_B> _newBuilder = new ListOfWriterGroupDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfWriterGroupDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree writerGroupDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupDataTypePropertyTree!= null):((writerGroupDataTypePropertyTree == null)||(!writerGroupDataTypePropertyTree.isLeaf())))) {
            if (this.writerGroupDataType == null) {
                _other.writerGroupDataType = null;
            } else {
                _other.writerGroupDataType = new ArrayList<WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>>>();
                for (WriterGroupDataType _item: this.writerGroupDataType) {
                    _other.writerGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, writerGroupDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfWriterGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfWriterGroupDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfWriterGroupDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfWriterGroupDataType.Builder<_B> copyOf(final ListOfWriterGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfWriterGroupDataType.Builder<_B> _newBuilder = new ListOfWriterGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfWriterGroupDataType.Builder<Void> copyExcept(final ListOfWriterGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfWriterGroupDataType.Builder<Void> copyOnly(final ListOfWriterGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfWriterGroupDataType _storedValue;
        private List<WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>>> writerGroupDataType;

        public Builder(final _B _parentBuilder, final ListOfWriterGroupDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.writerGroupDataType == null) {
                        this.writerGroupDataType = null;
                    } else {
                        this.writerGroupDataType = new ArrayList<WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>>>();
                        for (WriterGroupDataType _item: _other.writerGroupDataType) {
                            this.writerGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfWriterGroupDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree writerGroupDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupDataTypePropertyTree!= null):((writerGroupDataTypePropertyTree == null)||(!writerGroupDataTypePropertyTree.isLeaf())))) {
                        if (_other.writerGroupDataType == null) {
                            this.writerGroupDataType = null;
                        } else {
                            this.writerGroupDataType = new ArrayList<WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>>>();
                            for (WriterGroupDataType _item: _other.writerGroupDataType) {
                                this.writerGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(this, writerGroupDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfWriterGroupDataType >_P init(final _P _product) {
            if (this.writerGroupDataType!= null) {
                final List<WriterGroupDataType> writerGroupDataType = new ArrayList<WriterGroupDataType>(this.writerGroupDataType.size());
                for (WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>> _item: this.writerGroupDataType) {
                    writerGroupDataType.add(_item.build());
                }
                _product.writerGroupDataType = writerGroupDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "writerGroupDataType" hinzu.
         * 
         * @param writerGroupDataType
         *     Werte, die zur Eigenschaft "writerGroupDataType" hinzugefügt werden.
         */
        public ListOfWriterGroupDataType.Builder<_B> addWriterGroupDataType(final Iterable<? extends WriterGroupDataType> writerGroupDataType) {
            if (writerGroupDataType!= null) {
                if (this.writerGroupDataType == null) {
                    this.writerGroupDataType = new ArrayList<WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>>>();
                }
                for (WriterGroupDataType _item: writerGroupDataType) {
                    this.writerGroupDataType.add(new WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writerGroupDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param writerGroupDataType
         *     Neuer Wert der Eigenschaft "writerGroupDataType".
         */
        public ListOfWriterGroupDataType.Builder<_B> withWriterGroupDataType(final Iterable<? extends WriterGroupDataType> writerGroupDataType) {
            if (this.writerGroupDataType!= null) {
                this.writerGroupDataType.clear();
            }
            return addWriterGroupDataType(writerGroupDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "writerGroupDataType" hinzu.
         * 
         * @param writerGroupDataType
         *     Werte, die zur Eigenschaft "writerGroupDataType" hinzugefügt werden.
         */
        public ListOfWriterGroupDataType.Builder<_B> addWriterGroupDataType(WriterGroupDataType... writerGroupDataType) {
            addWriterGroupDataType(Arrays.asList(writerGroupDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writerGroupDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param writerGroupDataType
         *     Neuer Wert der Eigenschaft "writerGroupDataType".
         */
        public ListOfWriterGroupDataType.Builder<_B> withWriterGroupDataType(WriterGroupDataType... writerGroupDataType) {
            withWriterGroupDataType(Arrays.asList(writerGroupDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "WriterGroupDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.WriterGroupDataType.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "WriterGroupDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.WriterGroupDataType.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public WriterGroupDataType.Builder<? extends ListOfWriterGroupDataType.Builder<_B>> addWriterGroupDataType() {
            if (this.writerGroupDataType == null) {
                this.writerGroupDataType = new ArrayList<WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>>>();
            }
            final WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>> writerGroupDataType_Builder = new WriterGroupDataType.Builder<ListOfWriterGroupDataType.Builder<_B>>(this, null, false);
            this.writerGroupDataType.add(writerGroupDataType_Builder);
            return writerGroupDataType_Builder;
        }

        @Override
        public ListOfWriterGroupDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfWriterGroupDataType());
            } else {
                return ((ListOfWriterGroupDataType) _storedValue);
            }
        }

        public ListOfWriterGroupDataType.Builder<_B> copyOf(final ListOfWriterGroupDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfWriterGroupDataType.Builder<_B> copyOf(final ListOfWriterGroupDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfWriterGroupDataType.Selector<ListOfWriterGroupDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfWriterGroupDataType.Select _root() {
            return new ListOfWriterGroupDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private WriterGroupDataType.Selector<TRoot, ListOfWriterGroupDataType.Selector<TRoot, TParent>> writerGroupDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.writerGroupDataType!= null) {
                products.put("writerGroupDataType", this.writerGroupDataType.init());
            }
            return products;
        }

        public WriterGroupDataType.Selector<TRoot, ListOfWriterGroupDataType.Selector<TRoot, TParent>> writerGroupDataType() {
            return ((this.writerGroupDataType == null)?this.writerGroupDataType = new WriterGroupDataType.Selector<TRoot, ListOfWriterGroupDataType.Selector<TRoot, TParent>>(this._root, this, "writerGroupDataType"):this.writerGroupDataType);
        }

    }

}
