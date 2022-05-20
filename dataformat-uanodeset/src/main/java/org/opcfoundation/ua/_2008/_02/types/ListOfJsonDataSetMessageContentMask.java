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
 * <p>Java-Klasse für ListOfJsonDataSetMessageContentMask complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfJsonDataSetMessageContentMask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JsonDataSetMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}JsonDataSetMessageContentMask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfJsonDataSetMessageContentMask", propOrder = {
    "jsonDataSetMessageContentMask"
})
public class ListOfJsonDataSetMessageContentMask {

    @XmlElement(name = "JsonDataSetMessageContentMask", type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> jsonDataSetMessageContentMask;

    /**
     * Gets the value of the jsonDataSetMessageContentMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jsonDataSetMessageContentMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJsonDataSetMessageContentMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getJsonDataSetMessageContentMask() {
        if (jsonDataSetMessageContentMask == null) {
            jsonDataSetMessageContentMask = new ArrayList<Long>();
        }
        return this.jsonDataSetMessageContentMask;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfJsonDataSetMessageContentMask.Builder<_B> _other) {
        if (this.jsonDataSetMessageContentMask == null) {
            _other.jsonDataSetMessageContentMask = null;
        } else {
            _other.jsonDataSetMessageContentMask = new ArrayList<Buildable>();
            for (Long _item: this.jsonDataSetMessageContentMask) {
                _other.jsonDataSetMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfJsonDataSetMessageContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfJsonDataSetMessageContentMask.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfJsonDataSetMessageContentMask.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfJsonDataSetMessageContentMask.Builder<Void> builder() {
        return new ListOfJsonDataSetMessageContentMask.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfJsonDataSetMessageContentMask.Builder<_B> copyOf(final ListOfJsonDataSetMessageContentMask _other) {
        final ListOfJsonDataSetMessageContentMask.Builder<_B> _newBuilder = new ListOfJsonDataSetMessageContentMask.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfJsonDataSetMessageContentMask.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree jsonDataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonDataSetMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonDataSetMessageContentMaskPropertyTree!= null):((jsonDataSetMessageContentMaskPropertyTree == null)||(!jsonDataSetMessageContentMaskPropertyTree.isLeaf())))) {
            if (this.jsonDataSetMessageContentMask == null) {
                _other.jsonDataSetMessageContentMask = null;
            } else {
                _other.jsonDataSetMessageContentMask = new ArrayList<Buildable>();
                for (Long _item: this.jsonDataSetMessageContentMask) {
                    _other.jsonDataSetMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfJsonDataSetMessageContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfJsonDataSetMessageContentMask.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfJsonDataSetMessageContentMask.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfJsonDataSetMessageContentMask.Builder<_B> copyOf(final ListOfJsonDataSetMessageContentMask _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfJsonDataSetMessageContentMask.Builder<_B> _newBuilder = new ListOfJsonDataSetMessageContentMask.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfJsonDataSetMessageContentMask.Builder<Void> copyExcept(final ListOfJsonDataSetMessageContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfJsonDataSetMessageContentMask.Builder<Void> copyOnly(final ListOfJsonDataSetMessageContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfJsonDataSetMessageContentMask _storedValue;
        private List<Buildable> jsonDataSetMessageContentMask;

        public Builder(final _B _parentBuilder, final ListOfJsonDataSetMessageContentMask _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.jsonDataSetMessageContentMask == null) {
                        this.jsonDataSetMessageContentMask = null;
                    } else {
                        this.jsonDataSetMessageContentMask = new ArrayList<Buildable>();
                        for (Long _item: _other.jsonDataSetMessageContentMask) {
                            this.jsonDataSetMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfJsonDataSetMessageContentMask _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree jsonDataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonDataSetMessageContentMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonDataSetMessageContentMaskPropertyTree!= null):((jsonDataSetMessageContentMaskPropertyTree == null)||(!jsonDataSetMessageContentMaskPropertyTree.isLeaf())))) {
                        if (_other.jsonDataSetMessageContentMask == null) {
                            this.jsonDataSetMessageContentMask = null;
                        } else {
                            this.jsonDataSetMessageContentMask = new ArrayList<Buildable>();
                            for (Long _item: _other.jsonDataSetMessageContentMask) {
                                this.jsonDataSetMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfJsonDataSetMessageContentMask >_P init(final _P _product) {
            if (this.jsonDataSetMessageContentMask!= null) {
                final List<Long> jsonDataSetMessageContentMask = new ArrayList<Long>(this.jsonDataSetMessageContentMask.size());
                for (Buildable _item: this.jsonDataSetMessageContentMask) {
                    jsonDataSetMessageContentMask.add(((Long) _item.build()));
                }
                _product.jsonDataSetMessageContentMask = jsonDataSetMessageContentMask;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonDataSetMessageContentMask" hinzu.
         * 
         * @param jsonDataSetMessageContentMask
         *     Werte, die zur Eigenschaft "jsonDataSetMessageContentMask" hinzugefügt werden.
         */
        public ListOfJsonDataSetMessageContentMask.Builder<_B> addJsonDataSetMessageContentMask(final Iterable<? extends Long> jsonDataSetMessageContentMask) {
            if (jsonDataSetMessageContentMask!= null) {
                if (this.jsonDataSetMessageContentMask == null) {
                    this.jsonDataSetMessageContentMask = new ArrayList<Buildable>();
                }
                for (Long _item: jsonDataSetMessageContentMask) {
                    this.jsonDataSetMessageContentMask.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonDataSetMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonDataSetMessageContentMask
         *     Neuer Wert der Eigenschaft "jsonDataSetMessageContentMask".
         */
        public ListOfJsonDataSetMessageContentMask.Builder<_B> withJsonDataSetMessageContentMask(final Iterable<? extends Long> jsonDataSetMessageContentMask) {
            if (this.jsonDataSetMessageContentMask!= null) {
                this.jsonDataSetMessageContentMask.clear();
            }
            return addJsonDataSetMessageContentMask(jsonDataSetMessageContentMask);
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonDataSetMessageContentMask" hinzu.
         * 
         * @param jsonDataSetMessageContentMask
         *     Werte, die zur Eigenschaft "jsonDataSetMessageContentMask" hinzugefügt werden.
         */
        public ListOfJsonDataSetMessageContentMask.Builder<_B> addJsonDataSetMessageContentMask(Long... jsonDataSetMessageContentMask) {
            addJsonDataSetMessageContentMask(Arrays.asList(jsonDataSetMessageContentMask));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonDataSetMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonDataSetMessageContentMask
         *     Neuer Wert der Eigenschaft "jsonDataSetMessageContentMask".
         */
        public ListOfJsonDataSetMessageContentMask.Builder<_B> withJsonDataSetMessageContentMask(Long... jsonDataSetMessageContentMask) {
            withJsonDataSetMessageContentMask(Arrays.asList(jsonDataSetMessageContentMask));
            return this;
        }

        @Override
        public ListOfJsonDataSetMessageContentMask build() {
            if (_storedValue == null) {
                return this.init(new ListOfJsonDataSetMessageContentMask());
            } else {
                return ((ListOfJsonDataSetMessageContentMask) _storedValue);
            }
        }

        public ListOfJsonDataSetMessageContentMask.Builder<_B> copyOf(final ListOfJsonDataSetMessageContentMask _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfJsonDataSetMessageContentMask.Builder<_B> copyOf(final ListOfJsonDataSetMessageContentMask.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfJsonDataSetMessageContentMask.Selector<ListOfJsonDataSetMessageContentMask.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfJsonDataSetMessageContentMask.Select _root() {
            return new ListOfJsonDataSetMessageContentMask.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfJsonDataSetMessageContentMask.Selector<TRoot, TParent>> jsonDataSetMessageContentMask = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.jsonDataSetMessageContentMask!= null) {
                products.put("jsonDataSetMessageContentMask", this.jsonDataSetMessageContentMask.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfJsonDataSetMessageContentMask.Selector<TRoot, TParent>> jsonDataSetMessageContentMask() {
            return ((this.jsonDataSetMessageContentMask == null)?this.jsonDataSetMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, ListOfJsonDataSetMessageContentMask.Selector<TRoot, TParent>>(this._root, this, "jsonDataSetMessageContentMask"):this.jsonDataSetMessageContentMask);
        }

    }

}
