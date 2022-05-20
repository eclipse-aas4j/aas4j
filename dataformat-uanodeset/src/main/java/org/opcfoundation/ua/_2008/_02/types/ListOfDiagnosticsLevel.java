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
 * <p>Java-Klasse für ListOfDiagnosticsLevel complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDiagnosticsLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiagnosticsLevel" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DiagnosticsLevel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDiagnosticsLevel", propOrder = {
    "diagnosticsLevel"
})
public class ListOfDiagnosticsLevel {

    @XmlElement(name = "DiagnosticsLevel")
    @XmlSchemaType(name = "string")
    protected List<DiagnosticsLevel> diagnosticsLevel;

    /**
     * Gets the value of the diagnosticsLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticsLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticsLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticsLevel }
     * 
     * 
     */
    public List<DiagnosticsLevel> getDiagnosticsLevel() {
        if (diagnosticsLevel == null) {
            diagnosticsLevel = new ArrayList<DiagnosticsLevel>();
        }
        return this.diagnosticsLevel;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDiagnosticsLevel.Builder<_B> _other) {
        if (this.diagnosticsLevel == null) {
            _other.diagnosticsLevel = null;
        } else {
            _other.diagnosticsLevel = new ArrayList<Buildable>();
            for (DiagnosticsLevel _item: this.diagnosticsLevel) {
                _other.diagnosticsLevel.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfDiagnosticsLevel.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDiagnosticsLevel.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDiagnosticsLevel.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDiagnosticsLevel.Builder<Void> builder() {
        return new ListOfDiagnosticsLevel.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDiagnosticsLevel.Builder<_B> copyOf(final ListOfDiagnosticsLevel _other) {
        final ListOfDiagnosticsLevel.Builder<_B> _newBuilder = new ListOfDiagnosticsLevel.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDiagnosticsLevel.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree diagnosticsLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticsLevel"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticsLevelPropertyTree!= null):((diagnosticsLevelPropertyTree == null)||(!diagnosticsLevelPropertyTree.isLeaf())))) {
            if (this.diagnosticsLevel == null) {
                _other.diagnosticsLevel = null;
            } else {
                _other.diagnosticsLevel = new ArrayList<Buildable>();
                for (DiagnosticsLevel _item: this.diagnosticsLevel) {
                    _other.diagnosticsLevel.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfDiagnosticsLevel.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDiagnosticsLevel.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDiagnosticsLevel.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDiagnosticsLevel.Builder<_B> copyOf(final ListOfDiagnosticsLevel _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDiagnosticsLevel.Builder<_B> _newBuilder = new ListOfDiagnosticsLevel.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDiagnosticsLevel.Builder<Void> copyExcept(final ListOfDiagnosticsLevel _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDiagnosticsLevel.Builder<Void> copyOnly(final ListOfDiagnosticsLevel _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDiagnosticsLevel _storedValue;
        private List<Buildable> diagnosticsLevel;

        public Builder(final _B _parentBuilder, final ListOfDiagnosticsLevel _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.diagnosticsLevel == null) {
                        this.diagnosticsLevel = null;
                    } else {
                        this.diagnosticsLevel = new ArrayList<Buildable>();
                        for (DiagnosticsLevel _item: _other.diagnosticsLevel) {
                            this.diagnosticsLevel.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDiagnosticsLevel _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree diagnosticsLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticsLevel"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticsLevelPropertyTree!= null):((diagnosticsLevelPropertyTree == null)||(!diagnosticsLevelPropertyTree.isLeaf())))) {
                        if (_other.diagnosticsLevel == null) {
                            this.diagnosticsLevel = null;
                        } else {
                            this.diagnosticsLevel = new ArrayList<Buildable>();
                            for (DiagnosticsLevel _item: _other.diagnosticsLevel) {
                                this.diagnosticsLevel.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfDiagnosticsLevel >_P init(final _P _product) {
            if (this.diagnosticsLevel!= null) {
                final List<DiagnosticsLevel> diagnosticsLevel = new ArrayList<DiagnosticsLevel>(this.diagnosticsLevel.size());
                for (Buildable _item: this.diagnosticsLevel) {
                    diagnosticsLevel.add(((DiagnosticsLevel) _item.build()));
                }
                _product.diagnosticsLevel = diagnosticsLevel;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "diagnosticsLevel" hinzu.
         * 
         * @param diagnosticsLevel
         *     Werte, die zur Eigenschaft "diagnosticsLevel" hinzugefügt werden.
         */
        public ListOfDiagnosticsLevel.Builder<_B> addDiagnosticsLevel(final Iterable<? extends DiagnosticsLevel> diagnosticsLevel) {
            if (diagnosticsLevel!= null) {
                if (this.diagnosticsLevel == null) {
                    this.diagnosticsLevel = new ArrayList<Buildable>();
                }
                for (DiagnosticsLevel _item: diagnosticsLevel) {
                    this.diagnosticsLevel.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticsLevel" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param diagnosticsLevel
         *     Neuer Wert der Eigenschaft "diagnosticsLevel".
         */
        public ListOfDiagnosticsLevel.Builder<_B> withDiagnosticsLevel(final Iterable<? extends DiagnosticsLevel> diagnosticsLevel) {
            if (this.diagnosticsLevel!= null) {
                this.diagnosticsLevel.clear();
            }
            return addDiagnosticsLevel(diagnosticsLevel);
        }

        /**
         * Fügt Werte zur Eigenschaft "diagnosticsLevel" hinzu.
         * 
         * @param diagnosticsLevel
         *     Werte, die zur Eigenschaft "diagnosticsLevel" hinzugefügt werden.
         */
        public ListOfDiagnosticsLevel.Builder<_B> addDiagnosticsLevel(DiagnosticsLevel... diagnosticsLevel) {
            addDiagnosticsLevel(Arrays.asList(diagnosticsLevel));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticsLevel" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param diagnosticsLevel
         *     Neuer Wert der Eigenschaft "diagnosticsLevel".
         */
        public ListOfDiagnosticsLevel.Builder<_B> withDiagnosticsLevel(DiagnosticsLevel... diagnosticsLevel) {
            withDiagnosticsLevel(Arrays.asList(diagnosticsLevel));
            return this;
        }

        @Override
        public ListOfDiagnosticsLevel build() {
            if (_storedValue == null) {
                return this.init(new ListOfDiagnosticsLevel());
            } else {
                return ((ListOfDiagnosticsLevel) _storedValue);
            }
        }

        public ListOfDiagnosticsLevel.Builder<_B> copyOf(final ListOfDiagnosticsLevel _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDiagnosticsLevel.Builder<_B> copyOf(final ListOfDiagnosticsLevel.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDiagnosticsLevel.Selector<ListOfDiagnosticsLevel.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDiagnosticsLevel.Select _root() {
            return new ListOfDiagnosticsLevel.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfDiagnosticsLevel.Selector<TRoot, TParent>> diagnosticsLevel = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.diagnosticsLevel!= null) {
                products.put("diagnosticsLevel", this.diagnosticsLevel.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfDiagnosticsLevel.Selector<TRoot, TParent>> diagnosticsLevel() {
            return ((this.diagnosticsLevel == null)?this.diagnosticsLevel = new com.kscs.util.jaxb.Selector<TRoot, ListOfDiagnosticsLevel.Selector<TRoot, TParent>>(this._root, this, "diagnosticsLevel"):this.diagnosticsLevel);
        }

    }

}
