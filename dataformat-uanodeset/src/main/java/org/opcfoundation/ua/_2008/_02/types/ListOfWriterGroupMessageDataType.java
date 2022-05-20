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
 * <p>Java-Klasse für ListOfWriterGroupMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfWriterGroupMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WriterGroupMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}WriterGroupMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfWriterGroupMessageDataType", propOrder = {
    "writerGroupMessageDataType"
})
public class ListOfWriterGroupMessageDataType {

    @XmlElement(name = "WriterGroupMessageDataType", nillable = true)
    protected List<WriterGroupMessageDataType> writerGroupMessageDataType;

    /**
     * Gets the value of the writerGroupMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the writerGroupMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWriterGroupMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WriterGroupMessageDataType }
     * 
     * 
     */
    public List<WriterGroupMessageDataType> getWriterGroupMessageDataType() {
        if (writerGroupMessageDataType == null) {
            writerGroupMessageDataType = new ArrayList<WriterGroupMessageDataType>();
        }
        return this.writerGroupMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfWriterGroupMessageDataType.Builder<_B> _other) {
        if (this.writerGroupMessageDataType == null) {
            _other.writerGroupMessageDataType = null;
        } else {
            _other.writerGroupMessageDataType = new ArrayList<WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>>>();
            for (WriterGroupMessageDataType _item: this.writerGroupMessageDataType) {
                _other.writerGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfWriterGroupMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfWriterGroupMessageDataType.Builder<Void> builder() {
        return new ListOfWriterGroupMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfWriterGroupMessageDataType _other) {
        final ListOfWriterGroupMessageDataType.Builder<_B> _newBuilder = new ListOfWriterGroupMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfWriterGroupMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree writerGroupMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupMessageDataTypePropertyTree!= null):((writerGroupMessageDataTypePropertyTree == null)||(!writerGroupMessageDataTypePropertyTree.isLeaf())))) {
            if (this.writerGroupMessageDataType == null) {
                _other.writerGroupMessageDataType = null;
            } else {
                _other.writerGroupMessageDataType = new ArrayList<WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>>>();
                for (WriterGroupMessageDataType _item: this.writerGroupMessageDataType) {
                    _other.writerGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, writerGroupMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfWriterGroupMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfWriterGroupMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfWriterGroupMessageDataType.Builder<_B> _newBuilder = new ListOfWriterGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfWriterGroupMessageDataType.Builder<Void> copyExcept(final ListOfWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfWriterGroupMessageDataType.Builder<Void> copyOnly(final ListOfWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfWriterGroupMessageDataType _storedValue;
        private List<WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>>> writerGroupMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfWriterGroupMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.writerGroupMessageDataType == null) {
                        this.writerGroupMessageDataType = null;
                    } else {
                        this.writerGroupMessageDataType = new ArrayList<WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>>>();
                        for (WriterGroupMessageDataType _item: _other.writerGroupMessageDataType) {
                            this.writerGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfWriterGroupMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree writerGroupMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupMessageDataTypePropertyTree!= null):((writerGroupMessageDataTypePropertyTree == null)||(!writerGroupMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.writerGroupMessageDataType == null) {
                            this.writerGroupMessageDataType = null;
                        } else {
                            this.writerGroupMessageDataType = new ArrayList<WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>>>();
                            for (WriterGroupMessageDataType _item: _other.writerGroupMessageDataType) {
                                this.writerGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, writerGroupMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfWriterGroupMessageDataType >_P init(final _P _product) {
            if (this.writerGroupMessageDataType!= null) {
                final List<WriterGroupMessageDataType> writerGroupMessageDataType = new ArrayList<WriterGroupMessageDataType>(this.writerGroupMessageDataType.size());
                for (WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>> _item: this.writerGroupMessageDataType) {
                    writerGroupMessageDataType.add(_item.build());
                }
                _product.writerGroupMessageDataType = writerGroupMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "writerGroupMessageDataType" hinzu.
         * 
         * @param writerGroupMessageDataType
         *     Werte, die zur Eigenschaft "writerGroupMessageDataType" hinzugefügt werden.
         */
        public ListOfWriterGroupMessageDataType.Builder<_B> addWriterGroupMessageDataType(final Iterable<? extends WriterGroupMessageDataType> writerGroupMessageDataType) {
            if (writerGroupMessageDataType!= null) {
                if (this.writerGroupMessageDataType == null) {
                    this.writerGroupMessageDataType = new ArrayList<WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>>>();
                }
                for (WriterGroupMessageDataType _item: writerGroupMessageDataType) {
                    this.writerGroupMessageDataType.add(new WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writerGroupMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param writerGroupMessageDataType
         *     Neuer Wert der Eigenschaft "writerGroupMessageDataType".
         */
        public ListOfWriterGroupMessageDataType.Builder<_B> withWriterGroupMessageDataType(final Iterable<? extends WriterGroupMessageDataType> writerGroupMessageDataType) {
            if (this.writerGroupMessageDataType!= null) {
                this.writerGroupMessageDataType.clear();
            }
            return addWriterGroupMessageDataType(writerGroupMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "writerGroupMessageDataType" hinzu.
         * 
         * @param writerGroupMessageDataType
         *     Werte, die zur Eigenschaft "writerGroupMessageDataType" hinzugefügt werden.
         */
        public ListOfWriterGroupMessageDataType.Builder<_B> addWriterGroupMessageDataType(WriterGroupMessageDataType... writerGroupMessageDataType) {
            addWriterGroupMessageDataType(Arrays.asList(writerGroupMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writerGroupMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param writerGroupMessageDataType
         *     Neuer Wert der Eigenschaft "writerGroupMessageDataType".
         */
        public ListOfWriterGroupMessageDataType.Builder<_B> withWriterGroupMessageDataType(WriterGroupMessageDataType... writerGroupMessageDataType) {
            withWriterGroupMessageDataType(Arrays.asList(writerGroupMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "WriterGroupMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.WriterGroupMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "WriterGroupMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.WriterGroupMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public WriterGroupMessageDataType.Builder<? extends ListOfWriterGroupMessageDataType.Builder<_B>> addWriterGroupMessageDataType() {
            if (this.writerGroupMessageDataType == null) {
                this.writerGroupMessageDataType = new ArrayList<WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>>>();
            }
            final WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>> writerGroupMessageDataType_Builder = new WriterGroupMessageDataType.Builder<ListOfWriterGroupMessageDataType.Builder<_B>>(this, null, false);
            this.writerGroupMessageDataType.add(writerGroupMessageDataType_Builder);
            return writerGroupMessageDataType_Builder;
        }

        @Override
        public ListOfWriterGroupMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfWriterGroupMessageDataType());
            } else {
                return ((ListOfWriterGroupMessageDataType) _storedValue);
            }
        }

        public ListOfWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfWriterGroupMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfWriterGroupMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfWriterGroupMessageDataType.Selector<ListOfWriterGroupMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfWriterGroupMessageDataType.Select _root() {
            return new ListOfWriterGroupMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private WriterGroupMessageDataType.Selector<TRoot, ListOfWriterGroupMessageDataType.Selector<TRoot, TParent>> writerGroupMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.writerGroupMessageDataType!= null) {
                products.put("writerGroupMessageDataType", this.writerGroupMessageDataType.init());
            }
            return products;
        }

        public WriterGroupMessageDataType.Selector<TRoot, ListOfWriterGroupMessageDataType.Selector<TRoot, TParent>> writerGroupMessageDataType() {
            return ((this.writerGroupMessageDataType == null)?this.writerGroupMessageDataType = new WriterGroupMessageDataType.Selector<TRoot, ListOfWriterGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "writerGroupMessageDataType"):this.writerGroupMessageDataType);
        }

    }

}
