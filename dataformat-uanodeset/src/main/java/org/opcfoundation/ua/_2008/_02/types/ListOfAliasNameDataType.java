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
 * <p>Java-Klasse für ListOfAliasNameDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfAliasNameDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AliasNameDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}AliasNameDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAliasNameDataType", propOrder = {
    "aliasNameDataType"
})
public class ListOfAliasNameDataType {

    @XmlElement(name = "AliasNameDataType", nillable = true)
    protected List<AliasNameDataType> aliasNameDataType;

    /**
     * Gets the value of the aliasNameDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliasNameDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliasNameDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasNameDataType }
     * 
     * 
     */
    public List<AliasNameDataType> getAliasNameDataType() {
        if (aliasNameDataType == null) {
            aliasNameDataType = new ArrayList<AliasNameDataType>();
        }
        return this.aliasNameDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfAliasNameDataType.Builder<_B> _other) {
        if (this.aliasNameDataType == null) {
            _other.aliasNameDataType = null;
        } else {
            _other.aliasNameDataType = new ArrayList<AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>>>();
            for (AliasNameDataType _item: this.aliasNameDataType) {
                _other.aliasNameDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfAliasNameDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfAliasNameDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfAliasNameDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfAliasNameDataType.Builder<Void> builder() {
        return new ListOfAliasNameDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfAliasNameDataType.Builder<_B> copyOf(final ListOfAliasNameDataType _other) {
        final ListOfAliasNameDataType.Builder<_B> _newBuilder = new ListOfAliasNameDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfAliasNameDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree aliasNameDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("aliasNameDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aliasNameDataTypePropertyTree!= null):((aliasNameDataTypePropertyTree == null)||(!aliasNameDataTypePropertyTree.isLeaf())))) {
            if (this.aliasNameDataType == null) {
                _other.aliasNameDataType = null;
            } else {
                _other.aliasNameDataType = new ArrayList<AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>>>();
                for (AliasNameDataType _item: this.aliasNameDataType) {
                    _other.aliasNameDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, aliasNameDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfAliasNameDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfAliasNameDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfAliasNameDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfAliasNameDataType.Builder<_B> copyOf(final ListOfAliasNameDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfAliasNameDataType.Builder<_B> _newBuilder = new ListOfAliasNameDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfAliasNameDataType.Builder<Void> copyExcept(final ListOfAliasNameDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfAliasNameDataType.Builder<Void> copyOnly(final ListOfAliasNameDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfAliasNameDataType _storedValue;
        private List<AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>>> aliasNameDataType;

        public Builder(final _B _parentBuilder, final ListOfAliasNameDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.aliasNameDataType == null) {
                        this.aliasNameDataType = null;
                    } else {
                        this.aliasNameDataType = new ArrayList<AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>>>();
                        for (AliasNameDataType _item: _other.aliasNameDataType) {
                            this.aliasNameDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfAliasNameDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree aliasNameDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("aliasNameDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aliasNameDataTypePropertyTree!= null):((aliasNameDataTypePropertyTree == null)||(!aliasNameDataTypePropertyTree.isLeaf())))) {
                        if (_other.aliasNameDataType == null) {
                            this.aliasNameDataType = null;
                        } else {
                            this.aliasNameDataType = new ArrayList<AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>>>();
                            for (AliasNameDataType _item: _other.aliasNameDataType) {
                                this.aliasNameDataType.add(((_item == null)?null:_item.newCopyBuilder(this, aliasNameDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfAliasNameDataType >_P init(final _P _product) {
            if (this.aliasNameDataType!= null) {
                final List<AliasNameDataType> aliasNameDataType = new ArrayList<AliasNameDataType>(this.aliasNameDataType.size());
                for (AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>> _item: this.aliasNameDataType) {
                    aliasNameDataType.add(_item.build());
                }
                _product.aliasNameDataType = aliasNameDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "aliasNameDataType" hinzu.
         * 
         * @param aliasNameDataType
         *     Werte, die zur Eigenschaft "aliasNameDataType" hinzugefügt werden.
         */
        public ListOfAliasNameDataType.Builder<_B> addAliasNameDataType(final Iterable<? extends AliasNameDataType> aliasNameDataType) {
            if (aliasNameDataType!= null) {
                if (this.aliasNameDataType == null) {
                    this.aliasNameDataType = new ArrayList<AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>>>();
                }
                for (AliasNameDataType _item: aliasNameDataType) {
                    this.aliasNameDataType.add(new AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "aliasNameDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param aliasNameDataType
         *     Neuer Wert der Eigenschaft "aliasNameDataType".
         */
        public ListOfAliasNameDataType.Builder<_B> withAliasNameDataType(final Iterable<? extends AliasNameDataType> aliasNameDataType) {
            if (this.aliasNameDataType!= null) {
                this.aliasNameDataType.clear();
            }
            return addAliasNameDataType(aliasNameDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "aliasNameDataType" hinzu.
         * 
         * @param aliasNameDataType
         *     Werte, die zur Eigenschaft "aliasNameDataType" hinzugefügt werden.
         */
        public ListOfAliasNameDataType.Builder<_B> addAliasNameDataType(AliasNameDataType... aliasNameDataType) {
            addAliasNameDataType(Arrays.asList(aliasNameDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "aliasNameDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param aliasNameDataType
         *     Neuer Wert der Eigenschaft "aliasNameDataType".
         */
        public ListOfAliasNameDataType.Builder<_B> withAliasNameDataType(AliasNameDataType... aliasNameDataType) {
            withAliasNameDataType(Arrays.asList(aliasNameDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "AliasNameDataType".
         * Mit {@link org.opcfoundation.ua._2008._02.types.AliasNameDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "AliasNameDataType".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.AliasNameDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public AliasNameDataType.Builder<? extends ListOfAliasNameDataType.Builder<_B>> addAliasNameDataType() {
            if (this.aliasNameDataType == null) {
                this.aliasNameDataType = new ArrayList<AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>>>();
            }
            final AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>> aliasNameDataType_Builder = new AliasNameDataType.Builder<ListOfAliasNameDataType.Builder<_B>>(this, null, false);
            this.aliasNameDataType.add(aliasNameDataType_Builder);
            return aliasNameDataType_Builder;
        }

        @Override
        public ListOfAliasNameDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfAliasNameDataType());
            } else {
                return ((ListOfAliasNameDataType) _storedValue);
            }
        }

        public ListOfAliasNameDataType.Builder<_B> copyOf(final ListOfAliasNameDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfAliasNameDataType.Builder<_B> copyOf(final ListOfAliasNameDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfAliasNameDataType.Selector<ListOfAliasNameDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfAliasNameDataType.Select _root() {
            return new ListOfAliasNameDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private AliasNameDataType.Selector<TRoot, ListOfAliasNameDataType.Selector<TRoot, TParent>> aliasNameDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.aliasNameDataType!= null) {
                products.put("aliasNameDataType", this.aliasNameDataType.init());
            }
            return products;
        }

        public AliasNameDataType.Selector<TRoot, ListOfAliasNameDataType.Selector<TRoot, TParent>> aliasNameDataType() {
            return ((this.aliasNameDataType == null)?this.aliasNameDataType = new AliasNameDataType.Selector<TRoot, ListOfAliasNameDataType.Selector<TRoot, TParent>>(this._root, this, "aliasNameDataType"):this.aliasNameDataType);
        }

    }

}
