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
 * <p>Java-Klasse für ListOfModificationInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfModificationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModificationInfo" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ModificationInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfModificationInfo", propOrder = {
    "modificationInfo"
})
public class ListOfModificationInfo {

    @XmlElement(name = "ModificationInfo", nillable = true)
    protected List<ModificationInfo> modificationInfo;

    /**
     * Gets the value of the modificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationInfo }
     * 
     * 
     */
    public List<ModificationInfo> getModificationInfo() {
        if (modificationInfo == null) {
            modificationInfo = new ArrayList<ModificationInfo>();
        }
        return this.modificationInfo;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfModificationInfo.Builder<_B> _other) {
        if (this.modificationInfo == null) {
            _other.modificationInfo = null;
        } else {
            _other.modificationInfo = new ArrayList<ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>>>();
            for (ModificationInfo _item: this.modificationInfo) {
                _other.modificationInfo.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfModificationInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfModificationInfo.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfModificationInfo.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfModificationInfo.Builder<Void> builder() {
        return new ListOfModificationInfo.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfModificationInfo.Builder<_B> copyOf(final ListOfModificationInfo _other) {
        final ListOfModificationInfo.Builder<_B> _newBuilder = new ListOfModificationInfo.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfModificationInfo.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree modificationInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modificationInfo"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modificationInfoPropertyTree!= null):((modificationInfoPropertyTree == null)||(!modificationInfoPropertyTree.isLeaf())))) {
            if (this.modificationInfo == null) {
                _other.modificationInfo = null;
            } else {
                _other.modificationInfo = new ArrayList<ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>>>();
                for (ModificationInfo _item: this.modificationInfo) {
                    _other.modificationInfo.add(((_item == null)?null:_item.newCopyBuilder(_other, modificationInfoPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfModificationInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfModificationInfo.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfModificationInfo.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfModificationInfo.Builder<_B> copyOf(final ListOfModificationInfo _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfModificationInfo.Builder<_B> _newBuilder = new ListOfModificationInfo.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfModificationInfo.Builder<Void> copyExcept(final ListOfModificationInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfModificationInfo.Builder<Void> copyOnly(final ListOfModificationInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfModificationInfo _storedValue;
        private List<ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>>> modificationInfo;

        public Builder(final _B _parentBuilder, final ListOfModificationInfo _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.modificationInfo == null) {
                        this.modificationInfo = null;
                    } else {
                        this.modificationInfo = new ArrayList<ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>>>();
                        for (ModificationInfo _item: _other.modificationInfo) {
                            this.modificationInfo.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfModificationInfo _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree modificationInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modificationInfo"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modificationInfoPropertyTree!= null):((modificationInfoPropertyTree == null)||(!modificationInfoPropertyTree.isLeaf())))) {
                        if (_other.modificationInfo == null) {
                            this.modificationInfo = null;
                        } else {
                            this.modificationInfo = new ArrayList<ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>>>();
                            for (ModificationInfo _item: _other.modificationInfo) {
                                this.modificationInfo.add(((_item == null)?null:_item.newCopyBuilder(this, modificationInfoPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfModificationInfo >_P init(final _P _product) {
            if (this.modificationInfo!= null) {
                final List<ModificationInfo> modificationInfo = new ArrayList<ModificationInfo>(this.modificationInfo.size());
                for (ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>> _item: this.modificationInfo) {
                    modificationInfo.add(_item.build());
                }
                _product.modificationInfo = modificationInfo;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "modificationInfo" hinzu.
         * 
         * @param modificationInfo
         *     Werte, die zur Eigenschaft "modificationInfo" hinzugefügt werden.
         */
        public ListOfModificationInfo.Builder<_B> addModificationInfo(final Iterable<? extends ModificationInfo> modificationInfo) {
            if (modificationInfo!= null) {
                if (this.modificationInfo == null) {
                    this.modificationInfo = new ArrayList<ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>>>();
                }
                for (ModificationInfo _item: modificationInfo) {
                    this.modificationInfo.add(new ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "modificationInfo" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param modificationInfo
         *     Neuer Wert der Eigenschaft "modificationInfo".
         */
        public ListOfModificationInfo.Builder<_B> withModificationInfo(final Iterable<? extends ModificationInfo> modificationInfo) {
            if (this.modificationInfo!= null) {
                this.modificationInfo.clear();
            }
            return addModificationInfo(modificationInfo);
        }

        /**
         * Fügt Werte zur Eigenschaft "modificationInfo" hinzu.
         * 
         * @param modificationInfo
         *     Werte, die zur Eigenschaft "modificationInfo" hinzugefügt werden.
         */
        public ListOfModificationInfo.Builder<_B> addModificationInfo(ModificationInfo... modificationInfo) {
            addModificationInfo(Arrays.asList(modificationInfo));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "modificationInfo" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param modificationInfo
         *     Neuer Wert der Eigenschaft "modificationInfo".
         */
        public ListOfModificationInfo.Builder<_B> withModificationInfo(ModificationInfo... modificationInfo) {
            withModificationInfo(Arrays.asList(modificationInfo));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ModificationInfo".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ModificationInfo.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ModificationInfo".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ModificationInfo.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ModificationInfo.Builder<? extends ListOfModificationInfo.Builder<_B>> addModificationInfo() {
            if (this.modificationInfo == null) {
                this.modificationInfo = new ArrayList<ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>>>();
            }
            final ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>> modificationInfo_Builder = new ModificationInfo.Builder<ListOfModificationInfo.Builder<_B>>(this, null, false);
            this.modificationInfo.add(modificationInfo_Builder);
            return modificationInfo_Builder;
        }

        @Override
        public ListOfModificationInfo build() {
            if (_storedValue == null) {
                return this.init(new ListOfModificationInfo());
            } else {
                return ((ListOfModificationInfo) _storedValue);
            }
        }

        public ListOfModificationInfo.Builder<_B> copyOf(final ListOfModificationInfo _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfModificationInfo.Builder<_B> copyOf(final ListOfModificationInfo.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfModificationInfo.Selector<ListOfModificationInfo.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfModificationInfo.Select _root() {
            return new ListOfModificationInfo.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ModificationInfo.Selector<TRoot, ListOfModificationInfo.Selector<TRoot, TParent>> modificationInfo = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.modificationInfo!= null) {
                products.put("modificationInfo", this.modificationInfo.init());
            }
            return products;
        }

        public ModificationInfo.Selector<TRoot, ListOfModificationInfo.Selector<TRoot, TParent>> modificationInfo() {
            return ((this.modificationInfo == null)?this.modificationInfo = new ModificationInfo.Selector<TRoot, ListOfModificationInfo.Selector<TRoot, TParent>>(this._root, this, "modificationInfo"):this.modificationInfo);
        }

    }

}
