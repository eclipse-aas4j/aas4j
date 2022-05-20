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
 * <p>Java-Klasse für ListOfIdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}IdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIdType", propOrder = {
    "idType"
})
public class ListOfIdType {

    @XmlElement(name = "IdType")
    @XmlSchemaType(name = "string")
    protected List<IdType> idType;

    /**
     * Gets the value of the idType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdType }
     * 
     * 
     */
    public List<IdType> getIdType() {
        if (idType == null) {
            idType = new ArrayList<IdType>();
        }
        return this.idType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfIdType.Builder<_B> _other) {
        if (this.idType == null) {
            _other.idType = null;
        } else {
            _other.idType = new ArrayList<Buildable>();
            for (IdType _item: this.idType) {
                _other.idType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfIdType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfIdType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfIdType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfIdType.Builder<Void> builder() {
        return new ListOfIdType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfIdType.Builder<_B> copyOf(final ListOfIdType _other) {
        final ListOfIdType.Builder<_B> _newBuilder = new ListOfIdType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfIdType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree idTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("idType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(idTypePropertyTree!= null):((idTypePropertyTree == null)||(!idTypePropertyTree.isLeaf())))) {
            if (this.idType == null) {
                _other.idType = null;
            } else {
                _other.idType = new ArrayList<Buildable>();
                for (IdType _item: this.idType) {
                    _other.idType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfIdType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfIdType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfIdType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfIdType.Builder<_B> copyOf(final ListOfIdType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfIdType.Builder<_B> _newBuilder = new ListOfIdType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfIdType.Builder<Void> copyExcept(final ListOfIdType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfIdType.Builder<Void> copyOnly(final ListOfIdType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfIdType _storedValue;
        private List<Buildable> idType;

        public Builder(final _B _parentBuilder, final ListOfIdType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.idType == null) {
                        this.idType = null;
                    } else {
                        this.idType = new ArrayList<Buildable>();
                        for (IdType _item: _other.idType) {
                            this.idType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfIdType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree idTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("idType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(idTypePropertyTree!= null):((idTypePropertyTree == null)||(!idTypePropertyTree.isLeaf())))) {
                        if (_other.idType == null) {
                            this.idType = null;
                        } else {
                            this.idType = new ArrayList<Buildable>();
                            for (IdType _item: _other.idType) {
                                this.idType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfIdType >_P init(final _P _product) {
            if (this.idType!= null) {
                final List<IdType> idType = new ArrayList<IdType>(this.idType.size());
                for (Buildable _item: this.idType) {
                    idType.add(((IdType) _item.build()));
                }
                _product.idType = idType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "idType" hinzu.
         * 
         * @param idType
         *     Werte, die zur Eigenschaft "idType" hinzugefügt werden.
         */
        public ListOfIdType.Builder<_B> addIdType(final Iterable<? extends IdType> idType) {
            if (idType!= null) {
                if (this.idType == null) {
                    this.idType = new ArrayList<Buildable>();
                }
                for (IdType _item: idType) {
                    this.idType.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "idType" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param idType
         *     Neuer Wert der Eigenschaft "idType".
         */
        public ListOfIdType.Builder<_B> withIdType(final Iterable<? extends IdType> idType) {
            if (this.idType!= null) {
                this.idType.clear();
            }
            return addIdType(idType);
        }

        /**
         * Fügt Werte zur Eigenschaft "idType" hinzu.
         * 
         * @param idType
         *     Werte, die zur Eigenschaft "idType" hinzugefügt werden.
         */
        public ListOfIdType.Builder<_B> addIdType(IdType... idType) {
            addIdType(Arrays.asList(idType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "idType" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param idType
         *     Neuer Wert der Eigenschaft "idType".
         */
        public ListOfIdType.Builder<_B> withIdType(IdType... idType) {
            withIdType(Arrays.asList(idType));
            return this;
        }

        @Override
        public ListOfIdType build() {
            if (_storedValue == null) {
                return this.init(new ListOfIdType());
            } else {
                return ((ListOfIdType) _storedValue);
            }
        }

        public ListOfIdType.Builder<_B> copyOf(final ListOfIdType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfIdType.Builder<_B> copyOf(final ListOfIdType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfIdType.Selector<ListOfIdType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfIdType.Select _root() {
            return new ListOfIdType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfIdType.Selector<TRoot, TParent>> idType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.idType!= null) {
                products.put("idType", this.idType.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfIdType.Selector<TRoot, TParent>> idType() {
            return ((this.idType == null)?this.idType = new com.kscs.util.jaxb.Selector<TRoot, ListOfIdType.Selector<TRoot, TParent>>(this._root, this, "idType"):this.idType);
        }

    }

}
