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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfDataSetFieldContentMask complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataSetFieldContentMask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetFieldContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetFieldContentMask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataSetFieldContentMask", propOrder = {
    "dataSetFieldContentMask"
})
public class ListOfDataSetFieldContentMask {

    @XmlElement(name = "DataSetFieldContentMask", type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> dataSetFieldContentMask;

    /**
     * Gets the value of the dataSetFieldContentMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetFieldContentMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetFieldContentMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDataSetFieldContentMask() {
        if (dataSetFieldContentMask == null) {
            dataSetFieldContentMask = new ArrayList<Long>();
        }
        return this.dataSetFieldContentMask;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDataSetFieldContentMask.Builder<_B> _other) {
        if (this.dataSetFieldContentMask == null) {
            _other.dataSetFieldContentMask = null;
        } else {
            _other.dataSetFieldContentMask = new ArrayList<Buildable>();
            for (Long _item: this.dataSetFieldContentMask) {
                _other.dataSetFieldContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfDataSetFieldContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDataSetFieldContentMask.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDataSetFieldContentMask.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDataSetFieldContentMask.Builder<Void> builder() {
        return new ListOfDataSetFieldContentMask.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDataSetFieldContentMask.Builder<_B> copyOf(final ListOfDataSetFieldContentMask _other) {
        final ListOfDataSetFieldContentMask.Builder<_B> _newBuilder = new ListOfDataSetFieldContentMask.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDataSetFieldContentMask.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataSetFieldContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFieldContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFieldContentMaskPropertyTree!= null):((dataSetFieldContentMaskPropertyTree == null)||(!dataSetFieldContentMaskPropertyTree.isLeaf())))) {
            if (this.dataSetFieldContentMask == null) {
                _other.dataSetFieldContentMask = null;
            } else {
                _other.dataSetFieldContentMask = new ArrayList<Buildable>();
                for (Long _item: this.dataSetFieldContentMask) {
                    _other.dataSetFieldContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfDataSetFieldContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDataSetFieldContentMask.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDataSetFieldContentMask.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDataSetFieldContentMask.Builder<_B> copyOf(final ListOfDataSetFieldContentMask _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDataSetFieldContentMask.Builder<_B> _newBuilder = new ListOfDataSetFieldContentMask.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDataSetFieldContentMask.Builder<Void> copyExcept(final ListOfDataSetFieldContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDataSetFieldContentMask.Builder<Void> copyOnly(final ListOfDataSetFieldContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDataSetFieldContentMask _storedValue;
        private List<Buildable> dataSetFieldContentMask;

        public Builder(final _B _parentBuilder, final ListOfDataSetFieldContentMask _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.dataSetFieldContentMask == null) {
                        this.dataSetFieldContentMask = null;
                    } else {
                        this.dataSetFieldContentMask = new ArrayList<Buildable>();
                        for (Long _item: _other.dataSetFieldContentMask) {
                            this.dataSetFieldContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDataSetFieldContentMask _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataSetFieldContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFieldContentMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFieldContentMaskPropertyTree!= null):((dataSetFieldContentMaskPropertyTree == null)||(!dataSetFieldContentMaskPropertyTree.isLeaf())))) {
                        if (_other.dataSetFieldContentMask == null) {
                            this.dataSetFieldContentMask = null;
                        } else {
                            this.dataSetFieldContentMask = new ArrayList<Buildable>();
                            for (Long _item: _other.dataSetFieldContentMask) {
                                this.dataSetFieldContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfDataSetFieldContentMask >_P init(final _P _product) {
            if (this.dataSetFieldContentMask!= null) {
                final List<Long> dataSetFieldContentMask = new ArrayList<Long>(this.dataSetFieldContentMask.size());
                for (Buildable _item: this.dataSetFieldContentMask) {
                    dataSetFieldContentMask.add(((Long) _item.build()));
                }
                _product.dataSetFieldContentMask = dataSetFieldContentMask;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetFieldContentMask" hinzu.
         * 
         * @param dataSetFieldContentMask
         *     Werte, die zur Eigenschaft "dataSetFieldContentMask" hinzugefügt werden.
         */
        public ListOfDataSetFieldContentMask.Builder<_B> addDataSetFieldContentMask(final Iterable<? extends Long> dataSetFieldContentMask) {
            if (dataSetFieldContentMask!= null) {
                if (this.dataSetFieldContentMask == null) {
                    this.dataSetFieldContentMask = new ArrayList<Buildable>();
                }
                for (Long _item: dataSetFieldContentMask) {
                    this.dataSetFieldContentMask.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetFieldContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetFieldContentMask
         *     Neuer Wert der Eigenschaft "dataSetFieldContentMask".
         */
        public ListOfDataSetFieldContentMask.Builder<_B> withDataSetFieldContentMask(final Iterable<? extends Long> dataSetFieldContentMask) {
            if (this.dataSetFieldContentMask!= null) {
                this.dataSetFieldContentMask.clear();
            }
            return addDataSetFieldContentMask(dataSetFieldContentMask);
        }

        /**
         * Fügt Werte zur Eigenschaft "dataSetFieldContentMask" hinzu.
         * 
         * @param dataSetFieldContentMask
         *     Werte, die zur Eigenschaft "dataSetFieldContentMask" hinzugefügt werden.
         */
        public ListOfDataSetFieldContentMask.Builder<_B> addDataSetFieldContentMask(Long... dataSetFieldContentMask) {
            addDataSetFieldContentMask(Arrays.asList(dataSetFieldContentMask));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetFieldContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetFieldContentMask
         *     Neuer Wert der Eigenschaft "dataSetFieldContentMask".
         */
        public ListOfDataSetFieldContentMask.Builder<_B> withDataSetFieldContentMask(Long... dataSetFieldContentMask) {
            withDataSetFieldContentMask(Arrays.asList(dataSetFieldContentMask));
            return this;
        }

        @Override
        public ListOfDataSetFieldContentMask build() {
            if (_storedValue == null) {
                return this.init(new ListOfDataSetFieldContentMask());
            } else {
                return ((ListOfDataSetFieldContentMask) _storedValue);
            }
        }

        public ListOfDataSetFieldContentMask.Builder<_B> copyOf(final ListOfDataSetFieldContentMask _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDataSetFieldContentMask.Builder<_B> copyOf(final ListOfDataSetFieldContentMask.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDataSetFieldContentMask.Selector<ListOfDataSetFieldContentMask.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDataSetFieldContentMask.Select _root() {
            return new ListOfDataSetFieldContentMask.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfDataSetFieldContentMask.Selector<TRoot, TParent>> dataSetFieldContentMask = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataSetFieldContentMask!= null) {
                products.put("dataSetFieldContentMask", this.dataSetFieldContentMask.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfDataSetFieldContentMask.Selector<TRoot, TParent>> dataSetFieldContentMask() {
            return ((this.dataSetFieldContentMask == null)?this.dataSetFieldContentMask = new com.kscs.util.jaxb.Selector<TRoot, ListOfDataSetFieldContentMask.Selector<TRoot, TParent>>(this._root, this, "dataSetFieldContentMask"):this.dataSetFieldContentMask);
        }

    }

}
