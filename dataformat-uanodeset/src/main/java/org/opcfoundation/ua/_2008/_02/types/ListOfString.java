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
 * <p>Java-Klasse für ListOfString complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="String" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfString", propOrder = {
    "string"
})
public class ListOfString {

    @XmlElement(name = "String")
    protected List<String> string;

    /**
     * Gets the value of the string property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the string property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getString() {
        if (string == null) {
            string = new ArrayList<String>();
        }
        return this.string;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfString.Builder<_B> _other) {
        if (this.string == null) {
            _other.string = null;
        } else {
            _other.string = new ArrayList<Buildable>();
            for (String _item: this.string) {
                _other.string.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfString.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfString.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfString.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfString.Builder<Void> builder() {
        return new ListOfString.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfString.Builder<_B> copyOf(final ListOfString _other) {
        final ListOfString.Builder<_B> _newBuilder = new ListOfString.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfString.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree stringPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("string"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(stringPropertyTree!= null):((stringPropertyTree == null)||(!stringPropertyTree.isLeaf())))) {
            if (this.string == null) {
                _other.string = null;
            } else {
                _other.string = new ArrayList<Buildable>();
                for (String _item: this.string) {
                    _other.string.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfString.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfString.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfString.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfString.Builder<_B> copyOf(final ListOfString _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfString.Builder<_B> _newBuilder = new ListOfString.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfString.Builder<Void> copyExcept(final ListOfString _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfString.Builder<Void> copyOnly(final ListOfString _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfString _storedValue;
        private List<Buildable> string;

        public Builder(final _B _parentBuilder, final ListOfString _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.string == null) {
                        this.string = null;
                    } else {
                        this.string = new ArrayList<Buildable>();
                        for (String _item: _other.string) {
                            this.string.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfString _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree stringPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("string"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(stringPropertyTree!= null):((stringPropertyTree == null)||(!stringPropertyTree.isLeaf())))) {
                        if (_other.string == null) {
                            this.string = null;
                        } else {
                            this.string = new ArrayList<Buildable>();
                            for (String _item: _other.string) {
                                this.string.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfString >_P init(final _P _product) {
            if (this.string!= null) {
                final List<String> string = new ArrayList<String>(this.string.size());
                for (Buildable _item: this.string) {
                    string.add(((String) _item.build()));
                }
                _product.string = string;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "string" hinzu.
         * 
         * @param string
         *     Werte, die zur Eigenschaft "string" hinzugefügt werden.
         */
        public ListOfString.Builder<_B> addString(final Iterable<? extends String> string) {
            if (string!= null) {
                if (this.string == null) {
                    this.string = new ArrayList<Buildable>();
                }
                for (String _item: string) {
                    this.string.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "string" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param string
         *     Neuer Wert der Eigenschaft "string".
         */
        public ListOfString.Builder<_B> withString(final Iterable<? extends String> string) {
            if (this.string!= null) {
                this.string.clear();
            }
            return addString(string);
        }

        /**
         * Fügt Werte zur Eigenschaft "string" hinzu.
         * 
         * @param string
         *     Werte, die zur Eigenschaft "string" hinzugefügt werden.
         */
        public ListOfString.Builder<_B> addString(String... string) {
            addString(Arrays.asList(string));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "string" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param string
         *     Neuer Wert der Eigenschaft "string".
         */
        public ListOfString.Builder<_B> withString(String... string) {
            withString(Arrays.asList(string));
            return this;
        }

        @Override
        public ListOfString build() {
            if (_storedValue == null) {
                return this.init(new ListOfString());
            } else {
                return ((ListOfString) _storedValue);
            }
        }

        public ListOfString.Builder<_B> copyOf(final ListOfString _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfString.Builder<_B> copyOf(final ListOfString.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfString.Selector<ListOfString.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfString.Select _root() {
            return new ListOfString.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfString.Selector<TRoot, TParent>> string = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.string!= null) {
                products.put("string", this.string.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfString.Selector<TRoot, TParent>> string() {
            return ((this.string == null)?this.string = new com.kscs.util.jaxb.Selector<TRoot, ListOfString.Selector<TRoot, TParent>>(this._root, this, "string"):this.string);
        }

    }

}
