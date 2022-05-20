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
 * <p>Java-Klasse für ListOfIdentityCriteriaType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfIdentityCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentityCriteriaType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}IdentityCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIdentityCriteriaType", propOrder = {
    "identityCriteriaType"
})
public class ListOfIdentityCriteriaType {

    @XmlElement(name = "IdentityCriteriaType")
    @XmlSchemaType(name = "string")
    protected List<IdentityCriteriaType> identityCriteriaType;

    /**
     * Gets the value of the identityCriteriaType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityCriteriaType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityCriteriaType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityCriteriaType }
     * 
     * 
     */
    public List<IdentityCriteriaType> getIdentityCriteriaType() {
        if (identityCriteriaType == null) {
            identityCriteriaType = new ArrayList<IdentityCriteriaType>();
        }
        return this.identityCriteriaType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfIdentityCriteriaType.Builder<_B> _other) {
        if (this.identityCriteriaType == null) {
            _other.identityCriteriaType = null;
        } else {
            _other.identityCriteriaType = new ArrayList<Buildable>();
            for (IdentityCriteriaType _item: this.identityCriteriaType) {
                _other.identityCriteriaType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfIdentityCriteriaType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfIdentityCriteriaType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfIdentityCriteriaType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfIdentityCriteriaType.Builder<Void> builder() {
        return new ListOfIdentityCriteriaType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfIdentityCriteriaType.Builder<_B> copyOf(final ListOfIdentityCriteriaType _other) {
        final ListOfIdentityCriteriaType.Builder<_B> _newBuilder = new ListOfIdentityCriteriaType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfIdentityCriteriaType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree identityCriteriaTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("identityCriteriaType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(identityCriteriaTypePropertyTree!= null):((identityCriteriaTypePropertyTree == null)||(!identityCriteriaTypePropertyTree.isLeaf())))) {
            if (this.identityCriteriaType == null) {
                _other.identityCriteriaType = null;
            } else {
                _other.identityCriteriaType = new ArrayList<Buildable>();
                for (IdentityCriteriaType _item: this.identityCriteriaType) {
                    _other.identityCriteriaType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfIdentityCriteriaType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfIdentityCriteriaType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfIdentityCriteriaType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfIdentityCriteriaType.Builder<_B> copyOf(final ListOfIdentityCriteriaType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfIdentityCriteriaType.Builder<_B> _newBuilder = new ListOfIdentityCriteriaType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfIdentityCriteriaType.Builder<Void> copyExcept(final ListOfIdentityCriteriaType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfIdentityCriteriaType.Builder<Void> copyOnly(final ListOfIdentityCriteriaType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfIdentityCriteriaType _storedValue;
        private List<Buildable> identityCriteriaType;

        public Builder(final _B _parentBuilder, final ListOfIdentityCriteriaType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.identityCriteriaType == null) {
                        this.identityCriteriaType = null;
                    } else {
                        this.identityCriteriaType = new ArrayList<Buildable>();
                        for (IdentityCriteriaType _item: _other.identityCriteriaType) {
                            this.identityCriteriaType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfIdentityCriteriaType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree identityCriteriaTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("identityCriteriaType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(identityCriteriaTypePropertyTree!= null):((identityCriteriaTypePropertyTree == null)||(!identityCriteriaTypePropertyTree.isLeaf())))) {
                        if (_other.identityCriteriaType == null) {
                            this.identityCriteriaType = null;
                        } else {
                            this.identityCriteriaType = new ArrayList<Buildable>();
                            for (IdentityCriteriaType _item: _other.identityCriteriaType) {
                                this.identityCriteriaType.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfIdentityCriteriaType >_P init(final _P _product) {
            if (this.identityCriteriaType!= null) {
                final List<IdentityCriteriaType> identityCriteriaType = new ArrayList<IdentityCriteriaType>(this.identityCriteriaType.size());
                for (Buildable _item: this.identityCriteriaType) {
                    identityCriteriaType.add(((IdentityCriteriaType) _item.build()));
                }
                _product.identityCriteriaType = identityCriteriaType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "identityCriteriaType" hinzu.
         * 
         * @param identityCriteriaType
         *     Werte, die zur Eigenschaft "identityCriteriaType" hinzugefügt werden.
         */
        public ListOfIdentityCriteriaType.Builder<_B> addIdentityCriteriaType(final Iterable<? extends IdentityCriteriaType> identityCriteriaType) {
            if (identityCriteriaType!= null) {
                if (this.identityCriteriaType == null) {
                    this.identityCriteriaType = new ArrayList<Buildable>();
                }
                for (IdentityCriteriaType _item: identityCriteriaType) {
                    this.identityCriteriaType.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "identityCriteriaType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param identityCriteriaType
         *     Neuer Wert der Eigenschaft "identityCriteriaType".
         */
        public ListOfIdentityCriteriaType.Builder<_B> withIdentityCriteriaType(final Iterable<? extends IdentityCriteriaType> identityCriteriaType) {
            if (this.identityCriteriaType!= null) {
                this.identityCriteriaType.clear();
            }
            return addIdentityCriteriaType(identityCriteriaType);
        }

        /**
         * Fügt Werte zur Eigenschaft "identityCriteriaType" hinzu.
         * 
         * @param identityCriteriaType
         *     Werte, die zur Eigenschaft "identityCriteriaType" hinzugefügt werden.
         */
        public ListOfIdentityCriteriaType.Builder<_B> addIdentityCriteriaType(IdentityCriteriaType... identityCriteriaType) {
            addIdentityCriteriaType(Arrays.asList(identityCriteriaType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "identityCriteriaType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param identityCriteriaType
         *     Neuer Wert der Eigenschaft "identityCriteriaType".
         */
        public ListOfIdentityCriteriaType.Builder<_B> withIdentityCriteriaType(IdentityCriteriaType... identityCriteriaType) {
            withIdentityCriteriaType(Arrays.asList(identityCriteriaType));
            return this;
        }

        @Override
        public ListOfIdentityCriteriaType build() {
            if (_storedValue == null) {
                return this.init(new ListOfIdentityCriteriaType());
            } else {
                return ((ListOfIdentityCriteriaType) _storedValue);
            }
        }

        public ListOfIdentityCriteriaType.Builder<_B> copyOf(final ListOfIdentityCriteriaType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfIdentityCriteriaType.Builder<_B> copyOf(final ListOfIdentityCriteriaType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfIdentityCriteriaType.Selector<ListOfIdentityCriteriaType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfIdentityCriteriaType.Select _root() {
            return new ListOfIdentityCriteriaType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfIdentityCriteriaType.Selector<TRoot, TParent>> identityCriteriaType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.identityCriteriaType!= null) {
                products.put("identityCriteriaType", this.identityCriteriaType.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfIdentityCriteriaType.Selector<TRoot, TParent>> identityCriteriaType() {
            return ((this.identityCriteriaType == null)?this.identityCriteriaType = new com.kscs.util.jaxb.Selector<TRoot, ListOfIdentityCriteriaType.Selector<TRoot, TParent>>(this._root, this, "identityCriteriaType"):this.identityCriteriaType);
        }

    }

}
