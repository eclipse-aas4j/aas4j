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
 * <p>Java-Klasse für ListOfOverrideValueHandling complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfOverrideValueHandling"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OverrideValueHandling" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}OverrideValueHandling" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOverrideValueHandling", propOrder = {
    "overrideValueHandling"
})
public class ListOfOverrideValueHandling {

    @XmlElement(name = "OverrideValueHandling")
    @XmlSchemaType(name = "string")
    protected List<OverrideValueHandling> overrideValueHandling;

    /**
     * Gets the value of the overrideValueHandling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overrideValueHandling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverrideValueHandling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverrideValueHandling }
     * 
     * 
     */
    public List<OverrideValueHandling> getOverrideValueHandling() {
        if (overrideValueHandling == null) {
            overrideValueHandling = new ArrayList<OverrideValueHandling>();
        }
        return this.overrideValueHandling;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfOverrideValueHandling.Builder<_B> _other) {
        if (this.overrideValueHandling == null) {
            _other.overrideValueHandling = null;
        } else {
            _other.overrideValueHandling = new ArrayList<Buildable>();
            for (OverrideValueHandling _item: this.overrideValueHandling) {
                _other.overrideValueHandling.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfOverrideValueHandling.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfOverrideValueHandling.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfOverrideValueHandling.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfOverrideValueHandling.Builder<Void> builder() {
        return new ListOfOverrideValueHandling.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfOverrideValueHandling.Builder<_B> copyOf(final ListOfOverrideValueHandling _other) {
        final ListOfOverrideValueHandling.Builder<_B> _newBuilder = new ListOfOverrideValueHandling.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfOverrideValueHandling.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree overrideValueHandlingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("overrideValueHandling"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(overrideValueHandlingPropertyTree!= null):((overrideValueHandlingPropertyTree == null)||(!overrideValueHandlingPropertyTree.isLeaf())))) {
            if (this.overrideValueHandling == null) {
                _other.overrideValueHandling = null;
            } else {
                _other.overrideValueHandling = new ArrayList<Buildable>();
                for (OverrideValueHandling _item: this.overrideValueHandling) {
                    _other.overrideValueHandling.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfOverrideValueHandling.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfOverrideValueHandling.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfOverrideValueHandling.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfOverrideValueHandling.Builder<_B> copyOf(final ListOfOverrideValueHandling _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfOverrideValueHandling.Builder<_B> _newBuilder = new ListOfOverrideValueHandling.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfOverrideValueHandling.Builder<Void> copyExcept(final ListOfOverrideValueHandling _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfOverrideValueHandling.Builder<Void> copyOnly(final ListOfOverrideValueHandling _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfOverrideValueHandling _storedValue;
        private List<Buildable> overrideValueHandling;

        public Builder(final _B _parentBuilder, final ListOfOverrideValueHandling _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.overrideValueHandling == null) {
                        this.overrideValueHandling = null;
                    } else {
                        this.overrideValueHandling = new ArrayList<Buildable>();
                        for (OverrideValueHandling _item: _other.overrideValueHandling) {
                            this.overrideValueHandling.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfOverrideValueHandling _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree overrideValueHandlingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("overrideValueHandling"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(overrideValueHandlingPropertyTree!= null):((overrideValueHandlingPropertyTree == null)||(!overrideValueHandlingPropertyTree.isLeaf())))) {
                        if (_other.overrideValueHandling == null) {
                            this.overrideValueHandling = null;
                        } else {
                            this.overrideValueHandling = new ArrayList<Buildable>();
                            for (OverrideValueHandling _item: _other.overrideValueHandling) {
                                this.overrideValueHandling.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfOverrideValueHandling >_P init(final _P _product) {
            if (this.overrideValueHandling!= null) {
                final List<OverrideValueHandling> overrideValueHandling = new ArrayList<OverrideValueHandling>(this.overrideValueHandling.size());
                for (Buildable _item: this.overrideValueHandling) {
                    overrideValueHandling.add(((OverrideValueHandling) _item.build()));
                }
                _product.overrideValueHandling = overrideValueHandling;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "overrideValueHandling" hinzu.
         * 
         * @param overrideValueHandling
         *     Werte, die zur Eigenschaft "overrideValueHandling" hinzugefügt werden.
         */
        public ListOfOverrideValueHandling.Builder<_B> addOverrideValueHandling(final Iterable<? extends OverrideValueHandling> overrideValueHandling) {
            if (overrideValueHandling!= null) {
                if (this.overrideValueHandling == null) {
                    this.overrideValueHandling = new ArrayList<Buildable>();
                }
                for (OverrideValueHandling _item: overrideValueHandling) {
                    this.overrideValueHandling.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "overrideValueHandling" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param overrideValueHandling
         *     Neuer Wert der Eigenschaft "overrideValueHandling".
         */
        public ListOfOverrideValueHandling.Builder<_B> withOverrideValueHandling(final Iterable<? extends OverrideValueHandling> overrideValueHandling) {
            if (this.overrideValueHandling!= null) {
                this.overrideValueHandling.clear();
            }
            return addOverrideValueHandling(overrideValueHandling);
        }

        /**
         * Fügt Werte zur Eigenschaft "overrideValueHandling" hinzu.
         * 
         * @param overrideValueHandling
         *     Werte, die zur Eigenschaft "overrideValueHandling" hinzugefügt werden.
         */
        public ListOfOverrideValueHandling.Builder<_B> addOverrideValueHandling(OverrideValueHandling... overrideValueHandling) {
            addOverrideValueHandling(Arrays.asList(overrideValueHandling));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "overrideValueHandling" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param overrideValueHandling
         *     Neuer Wert der Eigenschaft "overrideValueHandling".
         */
        public ListOfOverrideValueHandling.Builder<_B> withOverrideValueHandling(OverrideValueHandling... overrideValueHandling) {
            withOverrideValueHandling(Arrays.asList(overrideValueHandling));
            return this;
        }

        @Override
        public ListOfOverrideValueHandling build() {
            if (_storedValue == null) {
                return this.init(new ListOfOverrideValueHandling());
            } else {
                return ((ListOfOverrideValueHandling) _storedValue);
            }
        }

        public ListOfOverrideValueHandling.Builder<_B> copyOf(final ListOfOverrideValueHandling _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfOverrideValueHandling.Builder<_B> copyOf(final ListOfOverrideValueHandling.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfOverrideValueHandling.Selector<ListOfOverrideValueHandling.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfOverrideValueHandling.Select _root() {
            return new ListOfOverrideValueHandling.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfOverrideValueHandling.Selector<TRoot, TParent>> overrideValueHandling = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.overrideValueHandling!= null) {
                products.put("overrideValueHandling", this.overrideValueHandling.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfOverrideValueHandling.Selector<TRoot, TParent>> overrideValueHandling() {
            return ((this.overrideValueHandling == null)?this.overrideValueHandling = new com.kscs.util.jaxb.Selector<TRoot, ListOfOverrideValueHandling.Selector<TRoot, TParent>>(this._root, this, "overrideValueHandling"):this.overrideValueHandling);
        }

    }

}
