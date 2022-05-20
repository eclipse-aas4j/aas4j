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
 * <p>Java-Klasse für ListOfJsonNetworkMessageContentMask complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfJsonNetworkMessageContentMask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JsonNetworkMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}JsonNetworkMessageContentMask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfJsonNetworkMessageContentMask", propOrder = {
    "jsonNetworkMessageContentMask"
})
public class ListOfJsonNetworkMessageContentMask {

    @XmlElement(name = "JsonNetworkMessageContentMask", type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> jsonNetworkMessageContentMask;

    /**
     * Gets the value of the jsonNetworkMessageContentMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jsonNetworkMessageContentMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJsonNetworkMessageContentMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getJsonNetworkMessageContentMask() {
        if (jsonNetworkMessageContentMask == null) {
            jsonNetworkMessageContentMask = new ArrayList<Long>();
        }
        return this.jsonNetworkMessageContentMask;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfJsonNetworkMessageContentMask.Builder<_B> _other) {
        if (this.jsonNetworkMessageContentMask == null) {
            _other.jsonNetworkMessageContentMask = null;
        } else {
            _other.jsonNetworkMessageContentMask = new ArrayList<Buildable>();
            for (Long _item: this.jsonNetworkMessageContentMask) {
                _other.jsonNetworkMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfJsonNetworkMessageContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfJsonNetworkMessageContentMask.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfJsonNetworkMessageContentMask.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfJsonNetworkMessageContentMask.Builder<Void> builder() {
        return new ListOfJsonNetworkMessageContentMask.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfJsonNetworkMessageContentMask.Builder<_B> copyOf(final ListOfJsonNetworkMessageContentMask _other) {
        final ListOfJsonNetworkMessageContentMask.Builder<_B> _newBuilder = new ListOfJsonNetworkMessageContentMask.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfJsonNetworkMessageContentMask.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree jsonNetworkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonNetworkMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonNetworkMessageContentMaskPropertyTree!= null):((jsonNetworkMessageContentMaskPropertyTree == null)||(!jsonNetworkMessageContentMaskPropertyTree.isLeaf())))) {
            if (this.jsonNetworkMessageContentMask == null) {
                _other.jsonNetworkMessageContentMask = null;
            } else {
                _other.jsonNetworkMessageContentMask = new ArrayList<Buildable>();
                for (Long _item: this.jsonNetworkMessageContentMask) {
                    _other.jsonNetworkMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfJsonNetworkMessageContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfJsonNetworkMessageContentMask.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfJsonNetworkMessageContentMask.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfJsonNetworkMessageContentMask.Builder<_B> copyOf(final ListOfJsonNetworkMessageContentMask _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfJsonNetworkMessageContentMask.Builder<_B> _newBuilder = new ListOfJsonNetworkMessageContentMask.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfJsonNetworkMessageContentMask.Builder<Void> copyExcept(final ListOfJsonNetworkMessageContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfJsonNetworkMessageContentMask.Builder<Void> copyOnly(final ListOfJsonNetworkMessageContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfJsonNetworkMessageContentMask _storedValue;
        private List<Buildable> jsonNetworkMessageContentMask;

        public Builder(final _B _parentBuilder, final ListOfJsonNetworkMessageContentMask _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.jsonNetworkMessageContentMask == null) {
                        this.jsonNetworkMessageContentMask = null;
                    } else {
                        this.jsonNetworkMessageContentMask = new ArrayList<Buildable>();
                        for (Long _item: _other.jsonNetworkMessageContentMask) {
                            this.jsonNetworkMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfJsonNetworkMessageContentMask _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree jsonNetworkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonNetworkMessageContentMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonNetworkMessageContentMaskPropertyTree!= null):((jsonNetworkMessageContentMaskPropertyTree == null)||(!jsonNetworkMessageContentMaskPropertyTree.isLeaf())))) {
                        if (_other.jsonNetworkMessageContentMask == null) {
                            this.jsonNetworkMessageContentMask = null;
                        } else {
                            this.jsonNetworkMessageContentMask = new ArrayList<Buildable>();
                            for (Long _item: _other.jsonNetworkMessageContentMask) {
                                this.jsonNetworkMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfJsonNetworkMessageContentMask >_P init(final _P _product) {
            if (this.jsonNetworkMessageContentMask!= null) {
                final List<Long> jsonNetworkMessageContentMask = new ArrayList<Long>(this.jsonNetworkMessageContentMask.size());
                for (Buildable _item: this.jsonNetworkMessageContentMask) {
                    jsonNetworkMessageContentMask.add(((Long) _item.build()));
                }
                _product.jsonNetworkMessageContentMask = jsonNetworkMessageContentMask;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonNetworkMessageContentMask" hinzu.
         * 
         * @param jsonNetworkMessageContentMask
         *     Werte, die zur Eigenschaft "jsonNetworkMessageContentMask" hinzugefügt werden.
         */
        public ListOfJsonNetworkMessageContentMask.Builder<_B> addJsonNetworkMessageContentMask(final Iterable<? extends Long> jsonNetworkMessageContentMask) {
            if (jsonNetworkMessageContentMask!= null) {
                if (this.jsonNetworkMessageContentMask == null) {
                    this.jsonNetworkMessageContentMask = new ArrayList<Buildable>();
                }
                for (Long _item: jsonNetworkMessageContentMask) {
                    this.jsonNetworkMessageContentMask.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonNetworkMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonNetworkMessageContentMask
         *     Neuer Wert der Eigenschaft "jsonNetworkMessageContentMask".
         */
        public ListOfJsonNetworkMessageContentMask.Builder<_B> withJsonNetworkMessageContentMask(final Iterable<? extends Long> jsonNetworkMessageContentMask) {
            if (this.jsonNetworkMessageContentMask!= null) {
                this.jsonNetworkMessageContentMask.clear();
            }
            return addJsonNetworkMessageContentMask(jsonNetworkMessageContentMask);
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonNetworkMessageContentMask" hinzu.
         * 
         * @param jsonNetworkMessageContentMask
         *     Werte, die zur Eigenschaft "jsonNetworkMessageContentMask" hinzugefügt werden.
         */
        public ListOfJsonNetworkMessageContentMask.Builder<_B> addJsonNetworkMessageContentMask(Long... jsonNetworkMessageContentMask) {
            addJsonNetworkMessageContentMask(Arrays.asList(jsonNetworkMessageContentMask));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonNetworkMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonNetworkMessageContentMask
         *     Neuer Wert der Eigenschaft "jsonNetworkMessageContentMask".
         */
        public ListOfJsonNetworkMessageContentMask.Builder<_B> withJsonNetworkMessageContentMask(Long... jsonNetworkMessageContentMask) {
            withJsonNetworkMessageContentMask(Arrays.asList(jsonNetworkMessageContentMask));
            return this;
        }

        @Override
        public ListOfJsonNetworkMessageContentMask build() {
            if (_storedValue == null) {
                return this.init(new ListOfJsonNetworkMessageContentMask());
            } else {
                return ((ListOfJsonNetworkMessageContentMask) _storedValue);
            }
        }

        public ListOfJsonNetworkMessageContentMask.Builder<_B> copyOf(final ListOfJsonNetworkMessageContentMask _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfJsonNetworkMessageContentMask.Builder<_B> copyOf(final ListOfJsonNetworkMessageContentMask.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfJsonNetworkMessageContentMask.Selector<ListOfJsonNetworkMessageContentMask.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfJsonNetworkMessageContentMask.Select _root() {
            return new ListOfJsonNetworkMessageContentMask.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfJsonNetworkMessageContentMask.Selector<TRoot, TParent>> jsonNetworkMessageContentMask = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.jsonNetworkMessageContentMask!= null) {
                products.put("jsonNetworkMessageContentMask", this.jsonNetworkMessageContentMask.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfJsonNetworkMessageContentMask.Selector<TRoot, TParent>> jsonNetworkMessageContentMask() {
            return ((this.jsonNetworkMessageContentMask == null)?this.jsonNetworkMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, ListOfJsonNetworkMessageContentMask.Selector<TRoot, TParent>>(this._root, this, "jsonNetworkMessageContentMask"):this.jsonNetworkMessageContentMask);
        }

    }

}
