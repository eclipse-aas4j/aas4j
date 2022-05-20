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
 * <p>Java-Klasse für ListOfRedundantServerDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfRedundantServerDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RedundantServerDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RedundantServerDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfRedundantServerDataType", propOrder = {
    "redundantServerDataType"
})
public class ListOfRedundantServerDataType {

    @XmlElement(name = "RedundantServerDataType", nillable = true)
    protected List<RedundantServerDataType> redundantServerDataType;

    /**
     * Gets the value of the redundantServerDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redundantServerDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedundantServerDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedundantServerDataType }
     * 
     * 
     */
    public List<RedundantServerDataType> getRedundantServerDataType() {
        if (redundantServerDataType == null) {
            redundantServerDataType = new ArrayList<RedundantServerDataType>();
        }
        return this.redundantServerDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfRedundantServerDataType.Builder<_B> _other) {
        if (this.redundantServerDataType == null) {
            _other.redundantServerDataType = null;
        } else {
            _other.redundantServerDataType = new ArrayList<RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>>>();
            for (RedundantServerDataType _item: this.redundantServerDataType) {
                _other.redundantServerDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfRedundantServerDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfRedundantServerDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfRedundantServerDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfRedundantServerDataType.Builder<Void> builder() {
        return new ListOfRedundantServerDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfRedundantServerDataType.Builder<_B> copyOf(final ListOfRedundantServerDataType _other) {
        final ListOfRedundantServerDataType.Builder<_B> _newBuilder = new ListOfRedundantServerDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfRedundantServerDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree redundantServerDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("redundantServerDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(redundantServerDataTypePropertyTree!= null):((redundantServerDataTypePropertyTree == null)||(!redundantServerDataTypePropertyTree.isLeaf())))) {
            if (this.redundantServerDataType == null) {
                _other.redundantServerDataType = null;
            } else {
                _other.redundantServerDataType = new ArrayList<RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>>>();
                for (RedundantServerDataType _item: this.redundantServerDataType) {
                    _other.redundantServerDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, redundantServerDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfRedundantServerDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfRedundantServerDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfRedundantServerDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfRedundantServerDataType.Builder<_B> copyOf(final ListOfRedundantServerDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfRedundantServerDataType.Builder<_B> _newBuilder = new ListOfRedundantServerDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfRedundantServerDataType.Builder<Void> copyExcept(final ListOfRedundantServerDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfRedundantServerDataType.Builder<Void> copyOnly(final ListOfRedundantServerDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfRedundantServerDataType _storedValue;
        private List<RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>>> redundantServerDataType;

        public Builder(final _B _parentBuilder, final ListOfRedundantServerDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.redundantServerDataType == null) {
                        this.redundantServerDataType = null;
                    } else {
                        this.redundantServerDataType = new ArrayList<RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>>>();
                        for (RedundantServerDataType _item: _other.redundantServerDataType) {
                            this.redundantServerDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfRedundantServerDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree redundantServerDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("redundantServerDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(redundantServerDataTypePropertyTree!= null):((redundantServerDataTypePropertyTree == null)||(!redundantServerDataTypePropertyTree.isLeaf())))) {
                        if (_other.redundantServerDataType == null) {
                            this.redundantServerDataType = null;
                        } else {
                            this.redundantServerDataType = new ArrayList<RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>>>();
                            for (RedundantServerDataType _item: _other.redundantServerDataType) {
                                this.redundantServerDataType.add(((_item == null)?null:_item.newCopyBuilder(this, redundantServerDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfRedundantServerDataType >_P init(final _P _product) {
            if (this.redundantServerDataType!= null) {
                final List<RedundantServerDataType> redundantServerDataType = new ArrayList<RedundantServerDataType>(this.redundantServerDataType.size());
                for (RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>> _item: this.redundantServerDataType) {
                    redundantServerDataType.add(_item.build());
                }
                _product.redundantServerDataType = redundantServerDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "redundantServerDataType" hinzu.
         * 
         * @param redundantServerDataType
         *     Werte, die zur Eigenschaft "redundantServerDataType" hinzugefügt werden.
         */
        public ListOfRedundantServerDataType.Builder<_B> addRedundantServerDataType(final Iterable<? extends RedundantServerDataType> redundantServerDataType) {
            if (redundantServerDataType!= null) {
                if (this.redundantServerDataType == null) {
                    this.redundantServerDataType = new ArrayList<RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>>>();
                }
                for (RedundantServerDataType _item: redundantServerDataType) {
                    this.redundantServerDataType.add(new RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "redundantServerDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param redundantServerDataType
         *     Neuer Wert der Eigenschaft "redundantServerDataType".
         */
        public ListOfRedundantServerDataType.Builder<_B> withRedundantServerDataType(final Iterable<? extends RedundantServerDataType> redundantServerDataType) {
            if (this.redundantServerDataType!= null) {
                this.redundantServerDataType.clear();
            }
            return addRedundantServerDataType(redundantServerDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "redundantServerDataType" hinzu.
         * 
         * @param redundantServerDataType
         *     Werte, die zur Eigenschaft "redundantServerDataType" hinzugefügt werden.
         */
        public ListOfRedundantServerDataType.Builder<_B> addRedundantServerDataType(RedundantServerDataType... redundantServerDataType) {
            addRedundantServerDataType(Arrays.asList(redundantServerDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "redundantServerDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param redundantServerDataType
         *     Neuer Wert der Eigenschaft "redundantServerDataType".
         */
        public ListOfRedundantServerDataType.Builder<_B> withRedundantServerDataType(RedundantServerDataType... redundantServerDataType) {
            withRedundantServerDataType(Arrays.asList(redundantServerDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "RedundantServerDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.RedundantServerDataType.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "RedundantServerDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.RedundantServerDataType.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public RedundantServerDataType.Builder<? extends ListOfRedundantServerDataType.Builder<_B>> addRedundantServerDataType() {
            if (this.redundantServerDataType == null) {
                this.redundantServerDataType = new ArrayList<RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>>>();
            }
            final RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>> redundantServerDataType_Builder = new RedundantServerDataType.Builder<ListOfRedundantServerDataType.Builder<_B>>(this, null, false);
            this.redundantServerDataType.add(redundantServerDataType_Builder);
            return redundantServerDataType_Builder;
        }

        @Override
        public ListOfRedundantServerDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfRedundantServerDataType());
            } else {
                return ((ListOfRedundantServerDataType) _storedValue);
            }
        }

        public ListOfRedundantServerDataType.Builder<_B> copyOf(final ListOfRedundantServerDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfRedundantServerDataType.Builder<_B> copyOf(final ListOfRedundantServerDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfRedundantServerDataType.Selector<ListOfRedundantServerDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfRedundantServerDataType.Select _root() {
            return new ListOfRedundantServerDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private RedundantServerDataType.Selector<TRoot, ListOfRedundantServerDataType.Selector<TRoot, TParent>> redundantServerDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.redundantServerDataType!= null) {
                products.put("redundantServerDataType", this.redundantServerDataType.init());
            }
            return products;
        }

        public RedundantServerDataType.Selector<TRoot, ListOfRedundantServerDataType.Selector<TRoot, TParent>> redundantServerDataType() {
            return ((this.redundantServerDataType == null)?this.redundantServerDataType = new RedundantServerDataType.Selector<TRoot, ListOfRedundantServerDataType.Selector<TRoot, TParent>>(this._root, this, "redundantServerDataType"):this.redundantServerDataType);
        }

    }

}
