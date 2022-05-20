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
 * <p>Java-Klasse für ListOfUadpNetworkMessageContentMask complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUadpNetworkMessageContentMask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UadpNetworkMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UadpNetworkMessageContentMask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUadpNetworkMessageContentMask", propOrder = {
    "uadpNetworkMessageContentMask"
})
public class ListOfUadpNetworkMessageContentMask {

    @XmlElement(name = "UadpNetworkMessageContentMask", type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> uadpNetworkMessageContentMask;

    /**
     * Gets the value of the uadpNetworkMessageContentMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uadpNetworkMessageContentMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUadpNetworkMessageContentMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getUadpNetworkMessageContentMask() {
        if (uadpNetworkMessageContentMask == null) {
            uadpNetworkMessageContentMask = new ArrayList<Long>();
        }
        return this.uadpNetworkMessageContentMask;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUadpNetworkMessageContentMask.Builder<_B> _other) {
        if (this.uadpNetworkMessageContentMask == null) {
            _other.uadpNetworkMessageContentMask = null;
        } else {
            _other.uadpNetworkMessageContentMask = new ArrayList<Buildable>();
            for (Long _item: this.uadpNetworkMessageContentMask) {
                _other.uadpNetworkMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfUadpNetworkMessageContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUadpNetworkMessageContentMask.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUadpNetworkMessageContentMask.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUadpNetworkMessageContentMask.Builder<Void> builder() {
        return new ListOfUadpNetworkMessageContentMask.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUadpNetworkMessageContentMask.Builder<_B> copyOf(final ListOfUadpNetworkMessageContentMask _other) {
        final ListOfUadpNetworkMessageContentMask.Builder<_B> _newBuilder = new ListOfUadpNetworkMessageContentMask.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUadpNetworkMessageContentMask.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree uadpNetworkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpNetworkMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpNetworkMessageContentMaskPropertyTree!= null):((uadpNetworkMessageContentMaskPropertyTree == null)||(!uadpNetworkMessageContentMaskPropertyTree.isLeaf())))) {
            if (this.uadpNetworkMessageContentMask == null) {
                _other.uadpNetworkMessageContentMask = null;
            } else {
                _other.uadpNetworkMessageContentMask = new ArrayList<Buildable>();
                for (Long _item: this.uadpNetworkMessageContentMask) {
                    _other.uadpNetworkMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfUadpNetworkMessageContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUadpNetworkMessageContentMask.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUadpNetworkMessageContentMask.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUadpNetworkMessageContentMask.Builder<_B> copyOf(final ListOfUadpNetworkMessageContentMask _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUadpNetworkMessageContentMask.Builder<_B> _newBuilder = new ListOfUadpNetworkMessageContentMask.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUadpNetworkMessageContentMask.Builder<Void> copyExcept(final ListOfUadpNetworkMessageContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUadpNetworkMessageContentMask.Builder<Void> copyOnly(final ListOfUadpNetworkMessageContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUadpNetworkMessageContentMask _storedValue;
        private List<Buildable> uadpNetworkMessageContentMask;

        public Builder(final _B _parentBuilder, final ListOfUadpNetworkMessageContentMask _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.uadpNetworkMessageContentMask == null) {
                        this.uadpNetworkMessageContentMask = null;
                    } else {
                        this.uadpNetworkMessageContentMask = new ArrayList<Buildable>();
                        for (Long _item: _other.uadpNetworkMessageContentMask) {
                            this.uadpNetworkMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUadpNetworkMessageContentMask _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree uadpNetworkMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpNetworkMessageContentMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpNetworkMessageContentMaskPropertyTree!= null):((uadpNetworkMessageContentMaskPropertyTree == null)||(!uadpNetworkMessageContentMaskPropertyTree.isLeaf())))) {
                        if (_other.uadpNetworkMessageContentMask == null) {
                            this.uadpNetworkMessageContentMask = null;
                        } else {
                            this.uadpNetworkMessageContentMask = new ArrayList<Buildable>();
                            for (Long _item: _other.uadpNetworkMessageContentMask) {
                                this.uadpNetworkMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfUadpNetworkMessageContentMask >_P init(final _P _product) {
            if (this.uadpNetworkMessageContentMask!= null) {
                final List<Long> uadpNetworkMessageContentMask = new ArrayList<Long>(this.uadpNetworkMessageContentMask.size());
                for (Buildable _item: this.uadpNetworkMessageContentMask) {
                    uadpNetworkMessageContentMask.add(((Long) _item.build()));
                }
                _product.uadpNetworkMessageContentMask = uadpNetworkMessageContentMask;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpNetworkMessageContentMask" hinzu.
         * 
         * @param uadpNetworkMessageContentMask
         *     Werte, die zur Eigenschaft "uadpNetworkMessageContentMask" hinzugefügt werden.
         */
        public ListOfUadpNetworkMessageContentMask.Builder<_B> addUadpNetworkMessageContentMask(final Iterable<? extends Long> uadpNetworkMessageContentMask) {
            if (uadpNetworkMessageContentMask!= null) {
                if (this.uadpNetworkMessageContentMask == null) {
                    this.uadpNetworkMessageContentMask = new ArrayList<Buildable>();
                }
                for (Long _item: uadpNetworkMessageContentMask) {
                    this.uadpNetworkMessageContentMask.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpNetworkMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpNetworkMessageContentMask
         *     Neuer Wert der Eigenschaft "uadpNetworkMessageContentMask".
         */
        public ListOfUadpNetworkMessageContentMask.Builder<_B> withUadpNetworkMessageContentMask(final Iterable<? extends Long> uadpNetworkMessageContentMask) {
            if (this.uadpNetworkMessageContentMask!= null) {
                this.uadpNetworkMessageContentMask.clear();
            }
            return addUadpNetworkMessageContentMask(uadpNetworkMessageContentMask);
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpNetworkMessageContentMask" hinzu.
         * 
         * @param uadpNetworkMessageContentMask
         *     Werte, die zur Eigenschaft "uadpNetworkMessageContentMask" hinzugefügt werden.
         */
        public ListOfUadpNetworkMessageContentMask.Builder<_B> addUadpNetworkMessageContentMask(Long... uadpNetworkMessageContentMask) {
            addUadpNetworkMessageContentMask(Arrays.asList(uadpNetworkMessageContentMask));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpNetworkMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpNetworkMessageContentMask
         *     Neuer Wert der Eigenschaft "uadpNetworkMessageContentMask".
         */
        public ListOfUadpNetworkMessageContentMask.Builder<_B> withUadpNetworkMessageContentMask(Long... uadpNetworkMessageContentMask) {
            withUadpNetworkMessageContentMask(Arrays.asList(uadpNetworkMessageContentMask));
            return this;
        }

        @Override
        public ListOfUadpNetworkMessageContentMask build() {
            if (_storedValue == null) {
                return this.init(new ListOfUadpNetworkMessageContentMask());
            } else {
                return ((ListOfUadpNetworkMessageContentMask) _storedValue);
            }
        }

        public ListOfUadpNetworkMessageContentMask.Builder<_B> copyOf(final ListOfUadpNetworkMessageContentMask _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUadpNetworkMessageContentMask.Builder<_B> copyOf(final ListOfUadpNetworkMessageContentMask.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUadpNetworkMessageContentMask.Selector<ListOfUadpNetworkMessageContentMask.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUadpNetworkMessageContentMask.Select _root() {
            return new ListOfUadpNetworkMessageContentMask.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfUadpNetworkMessageContentMask.Selector<TRoot, TParent>> uadpNetworkMessageContentMask = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.uadpNetworkMessageContentMask!= null) {
                products.put("uadpNetworkMessageContentMask", this.uadpNetworkMessageContentMask.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfUadpNetworkMessageContentMask.Selector<TRoot, TParent>> uadpNetworkMessageContentMask() {
            return ((this.uadpNetworkMessageContentMask == null)?this.uadpNetworkMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, ListOfUadpNetworkMessageContentMask.Selector<TRoot, TParent>>(this._root, this, "uadpNetworkMessageContentMask"):this.uadpNetworkMessageContentMask);
        }

    }

}
