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
 * <p>Java-Klasse für ListOfUadpDataSetMessageContentMask complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUadpDataSetMessageContentMask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UadpDataSetMessageContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UadpDataSetMessageContentMask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUadpDataSetMessageContentMask", propOrder = {
    "uadpDataSetMessageContentMask"
})
public class ListOfUadpDataSetMessageContentMask {

    @XmlElement(name = "UadpDataSetMessageContentMask", type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> uadpDataSetMessageContentMask;

    /**
     * Gets the value of the uadpDataSetMessageContentMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uadpDataSetMessageContentMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUadpDataSetMessageContentMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getUadpDataSetMessageContentMask() {
        if (uadpDataSetMessageContentMask == null) {
            uadpDataSetMessageContentMask = new ArrayList<Long>();
        }
        return this.uadpDataSetMessageContentMask;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUadpDataSetMessageContentMask.Builder<_B> _other) {
        if (this.uadpDataSetMessageContentMask == null) {
            _other.uadpDataSetMessageContentMask = null;
        } else {
            _other.uadpDataSetMessageContentMask = new ArrayList<Buildable>();
            for (Long _item: this.uadpDataSetMessageContentMask) {
                _other.uadpDataSetMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfUadpDataSetMessageContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUadpDataSetMessageContentMask.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUadpDataSetMessageContentMask.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUadpDataSetMessageContentMask.Builder<Void> builder() {
        return new ListOfUadpDataSetMessageContentMask.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUadpDataSetMessageContentMask.Builder<_B> copyOf(final ListOfUadpDataSetMessageContentMask _other) {
        final ListOfUadpDataSetMessageContentMask.Builder<_B> _newBuilder = new ListOfUadpDataSetMessageContentMask.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUadpDataSetMessageContentMask.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree uadpDataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpDataSetMessageContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpDataSetMessageContentMaskPropertyTree!= null):((uadpDataSetMessageContentMaskPropertyTree == null)||(!uadpDataSetMessageContentMaskPropertyTree.isLeaf())))) {
            if (this.uadpDataSetMessageContentMask == null) {
                _other.uadpDataSetMessageContentMask = null;
            } else {
                _other.uadpDataSetMessageContentMask = new ArrayList<Buildable>();
                for (Long _item: this.uadpDataSetMessageContentMask) {
                    _other.uadpDataSetMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfUadpDataSetMessageContentMask.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUadpDataSetMessageContentMask.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUadpDataSetMessageContentMask.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUadpDataSetMessageContentMask.Builder<_B> copyOf(final ListOfUadpDataSetMessageContentMask _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUadpDataSetMessageContentMask.Builder<_B> _newBuilder = new ListOfUadpDataSetMessageContentMask.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUadpDataSetMessageContentMask.Builder<Void> copyExcept(final ListOfUadpDataSetMessageContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUadpDataSetMessageContentMask.Builder<Void> copyOnly(final ListOfUadpDataSetMessageContentMask _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUadpDataSetMessageContentMask _storedValue;
        private List<Buildable> uadpDataSetMessageContentMask;

        public Builder(final _B _parentBuilder, final ListOfUadpDataSetMessageContentMask _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.uadpDataSetMessageContentMask == null) {
                        this.uadpDataSetMessageContentMask = null;
                    } else {
                        this.uadpDataSetMessageContentMask = new ArrayList<Buildable>();
                        for (Long _item: _other.uadpDataSetMessageContentMask) {
                            this.uadpDataSetMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUadpDataSetMessageContentMask _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree uadpDataSetMessageContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpDataSetMessageContentMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpDataSetMessageContentMaskPropertyTree!= null):((uadpDataSetMessageContentMaskPropertyTree == null)||(!uadpDataSetMessageContentMaskPropertyTree.isLeaf())))) {
                        if (_other.uadpDataSetMessageContentMask == null) {
                            this.uadpDataSetMessageContentMask = null;
                        } else {
                            this.uadpDataSetMessageContentMask = new ArrayList<Buildable>();
                            for (Long _item: _other.uadpDataSetMessageContentMask) {
                                this.uadpDataSetMessageContentMask.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfUadpDataSetMessageContentMask >_P init(final _P _product) {
            if (this.uadpDataSetMessageContentMask!= null) {
                final List<Long> uadpDataSetMessageContentMask = new ArrayList<Long>(this.uadpDataSetMessageContentMask.size());
                for (Buildable _item: this.uadpDataSetMessageContentMask) {
                    uadpDataSetMessageContentMask.add(((Long) _item.build()));
                }
                _product.uadpDataSetMessageContentMask = uadpDataSetMessageContentMask;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpDataSetMessageContentMask" hinzu.
         * 
         * @param uadpDataSetMessageContentMask
         *     Werte, die zur Eigenschaft "uadpDataSetMessageContentMask" hinzugefügt werden.
         */
        public ListOfUadpDataSetMessageContentMask.Builder<_B> addUadpDataSetMessageContentMask(final Iterable<? extends Long> uadpDataSetMessageContentMask) {
            if (uadpDataSetMessageContentMask!= null) {
                if (this.uadpDataSetMessageContentMask == null) {
                    this.uadpDataSetMessageContentMask = new ArrayList<Buildable>();
                }
                for (Long _item: uadpDataSetMessageContentMask) {
                    this.uadpDataSetMessageContentMask.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpDataSetMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpDataSetMessageContentMask
         *     Neuer Wert der Eigenschaft "uadpDataSetMessageContentMask".
         */
        public ListOfUadpDataSetMessageContentMask.Builder<_B> withUadpDataSetMessageContentMask(final Iterable<? extends Long> uadpDataSetMessageContentMask) {
            if (this.uadpDataSetMessageContentMask!= null) {
                this.uadpDataSetMessageContentMask.clear();
            }
            return addUadpDataSetMessageContentMask(uadpDataSetMessageContentMask);
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpDataSetMessageContentMask" hinzu.
         * 
         * @param uadpDataSetMessageContentMask
         *     Werte, die zur Eigenschaft "uadpDataSetMessageContentMask" hinzugefügt werden.
         */
        public ListOfUadpDataSetMessageContentMask.Builder<_B> addUadpDataSetMessageContentMask(Long... uadpDataSetMessageContentMask) {
            addUadpDataSetMessageContentMask(Arrays.asList(uadpDataSetMessageContentMask));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpDataSetMessageContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpDataSetMessageContentMask
         *     Neuer Wert der Eigenschaft "uadpDataSetMessageContentMask".
         */
        public ListOfUadpDataSetMessageContentMask.Builder<_B> withUadpDataSetMessageContentMask(Long... uadpDataSetMessageContentMask) {
            withUadpDataSetMessageContentMask(Arrays.asList(uadpDataSetMessageContentMask));
            return this;
        }

        @Override
        public ListOfUadpDataSetMessageContentMask build() {
            if (_storedValue == null) {
                return this.init(new ListOfUadpDataSetMessageContentMask());
            } else {
                return ((ListOfUadpDataSetMessageContentMask) _storedValue);
            }
        }

        public ListOfUadpDataSetMessageContentMask.Builder<_B> copyOf(final ListOfUadpDataSetMessageContentMask _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUadpDataSetMessageContentMask.Builder<_B> copyOf(final ListOfUadpDataSetMessageContentMask.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUadpDataSetMessageContentMask.Selector<ListOfUadpDataSetMessageContentMask.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUadpDataSetMessageContentMask.Select _root() {
            return new ListOfUadpDataSetMessageContentMask.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfUadpDataSetMessageContentMask.Selector<TRoot, TParent>> uadpDataSetMessageContentMask = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.uadpDataSetMessageContentMask!= null) {
                products.put("uadpDataSetMessageContentMask", this.uadpDataSetMessageContentMask.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfUadpDataSetMessageContentMask.Selector<TRoot, TParent>> uadpDataSetMessageContentMask() {
            return ((this.uadpDataSetMessageContentMask == null)?this.uadpDataSetMessageContentMask = new com.kscs.util.jaxb.Selector<TRoot, ListOfUadpDataSetMessageContentMask.Selector<TRoot, TParent>>(this._root, this, "uadpDataSetMessageContentMask"):this.uadpDataSetMessageContentMask);
        }

    }

}
