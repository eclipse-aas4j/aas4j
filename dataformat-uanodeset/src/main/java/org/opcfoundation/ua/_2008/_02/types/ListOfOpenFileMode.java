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
 * <p>Java-Klasse für ListOfOpenFileMode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfOpenFileMode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OpenFileMode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}OpenFileMode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOpenFileMode", propOrder = {
    "openFileMode"
})
public class ListOfOpenFileMode {

    @XmlElement(name = "OpenFileMode")
    @XmlSchemaType(name = "string")
    protected List<OpenFileMode> openFileMode;

    /**
     * Gets the value of the openFileMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openFileMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenFileMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenFileMode }
     * 
     * 
     */
    public List<OpenFileMode> getOpenFileMode() {
        if (openFileMode == null) {
            openFileMode = new ArrayList<OpenFileMode>();
        }
        return this.openFileMode;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfOpenFileMode.Builder<_B> _other) {
        if (this.openFileMode == null) {
            _other.openFileMode = null;
        } else {
            _other.openFileMode = new ArrayList<Buildable>();
            for (OpenFileMode _item: this.openFileMode) {
                _other.openFileMode.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfOpenFileMode.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfOpenFileMode.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfOpenFileMode.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfOpenFileMode.Builder<Void> builder() {
        return new ListOfOpenFileMode.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfOpenFileMode.Builder<_B> copyOf(final ListOfOpenFileMode _other) {
        final ListOfOpenFileMode.Builder<_B> _newBuilder = new ListOfOpenFileMode.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfOpenFileMode.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree openFileModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("openFileMode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(openFileModePropertyTree!= null):((openFileModePropertyTree == null)||(!openFileModePropertyTree.isLeaf())))) {
            if (this.openFileMode == null) {
                _other.openFileMode = null;
            } else {
                _other.openFileMode = new ArrayList<Buildable>();
                for (OpenFileMode _item: this.openFileMode) {
                    _other.openFileMode.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfOpenFileMode.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfOpenFileMode.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfOpenFileMode.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfOpenFileMode.Builder<_B> copyOf(final ListOfOpenFileMode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfOpenFileMode.Builder<_B> _newBuilder = new ListOfOpenFileMode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfOpenFileMode.Builder<Void> copyExcept(final ListOfOpenFileMode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfOpenFileMode.Builder<Void> copyOnly(final ListOfOpenFileMode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfOpenFileMode _storedValue;
        private List<Buildable> openFileMode;

        public Builder(final _B _parentBuilder, final ListOfOpenFileMode _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.openFileMode == null) {
                        this.openFileMode = null;
                    } else {
                        this.openFileMode = new ArrayList<Buildable>();
                        for (OpenFileMode _item: _other.openFileMode) {
                            this.openFileMode.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfOpenFileMode _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree openFileModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("openFileMode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(openFileModePropertyTree!= null):((openFileModePropertyTree == null)||(!openFileModePropertyTree.isLeaf())))) {
                        if (_other.openFileMode == null) {
                            this.openFileMode = null;
                        } else {
                            this.openFileMode = new ArrayList<Buildable>();
                            for (OpenFileMode _item: _other.openFileMode) {
                                this.openFileMode.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfOpenFileMode >_P init(final _P _product) {
            if (this.openFileMode!= null) {
                final List<OpenFileMode> openFileMode = new ArrayList<OpenFileMode>(this.openFileMode.size());
                for (Buildable _item: this.openFileMode) {
                    openFileMode.add(((OpenFileMode) _item.build()));
                }
                _product.openFileMode = openFileMode;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "openFileMode" hinzu.
         * 
         * @param openFileMode
         *     Werte, die zur Eigenschaft "openFileMode" hinzugefügt werden.
         */
        public ListOfOpenFileMode.Builder<_B> addOpenFileMode(final Iterable<? extends OpenFileMode> openFileMode) {
            if (openFileMode!= null) {
                if (this.openFileMode == null) {
                    this.openFileMode = new ArrayList<Buildable>();
                }
                for (OpenFileMode _item: openFileMode) {
                    this.openFileMode.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "openFileMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param openFileMode
         *     Neuer Wert der Eigenschaft "openFileMode".
         */
        public ListOfOpenFileMode.Builder<_B> withOpenFileMode(final Iterable<? extends OpenFileMode> openFileMode) {
            if (this.openFileMode!= null) {
                this.openFileMode.clear();
            }
            return addOpenFileMode(openFileMode);
        }

        /**
         * Fügt Werte zur Eigenschaft "openFileMode" hinzu.
         * 
         * @param openFileMode
         *     Werte, die zur Eigenschaft "openFileMode" hinzugefügt werden.
         */
        public ListOfOpenFileMode.Builder<_B> addOpenFileMode(OpenFileMode... openFileMode) {
            addOpenFileMode(Arrays.asList(openFileMode));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "openFileMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param openFileMode
         *     Neuer Wert der Eigenschaft "openFileMode".
         */
        public ListOfOpenFileMode.Builder<_B> withOpenFileMode(OpenFileMode... openFileMode) {
            withOpenFileMode(Arrays.asList(openFileMode));
            return this;
        }

        @Override
        public ListOfOpenFileMode build() {
            if (_storedValue == null) {
                return this.init(new ListOfOpenFileMode());
            } else {
                return ((ListOfOpenFileMode) _storedValue);
            }
        }

        public ListOfOpenFileMode.Builder<_B> copyOf(final ListOfOpenFileMode _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfOpenFileMode.Builder<_B> copyOf(final ListOfOpenFileMode.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfOpenFileMode.Selector<ListOfOpenFileMode.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfOpenFileMode.Select _root() {
            return new ListOfOpenFileMode.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfOpenFileMode.Selector<TRoot, TParent>> openFileMode = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.openFileMode!= null) {
                products.put("openFileMode", this.openFileMode.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfOpenFileMode.Selector<TRoot, TParent>> openFileMode() {
            return ((this.openFileMode == null)?this.openFileMode = new com.kscs.util.jaxb.Selector<TRoot, ListOfOpenFileMode.Selector<TRoot, TParent>>(this._root, this, "openFileMode"):this.openFileMode);
        }

    }

}
