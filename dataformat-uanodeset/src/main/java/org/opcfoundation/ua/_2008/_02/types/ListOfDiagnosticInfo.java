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
 * <p>Java-Klasse für ListOfDiagnosticInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfDiagnosticInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiagnosticInfo" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DiagnosticInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDiagnosticInfo", propOrder = {
    "diagnosticInfo"
})
public class ListOfDiagnosticInfo {

    @XmlElement(name = "DiagnosticInfo", nillable = true)
    protected List<DiagnosticInfo> diagnosticInfo;

    /**
     * Gets the value of the diagnosticInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticInfo }
     * 
     * 
     */
    public List<DiagnosticInfo> getDiagnosticInfo() {
        if (diagnosticInfo == null) {
            diagnosticInfo = new ArrayList<DiagnosticInfo>();
        }
        return this.diagnosticInfo;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfDiagnosticInfo.Builder<_B> _other) {
        if (this.diagnosticInfo == null) {
            _other.diagnosticInfo = null;
        } else {
            _other.diagnosticInfo = new ArrayList<DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>>>();
            for (DiagnosticInfo _item: this.diagnosticInfo) {
                _other.diagnosticInfo.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfDiagnosticInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfDiagnosticInfo.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfDiagnosticInfo.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfDiagnosticInfo.Builder<Void> builder() {
        return new ListOfDiagnosticInfo.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfDiagnosticInfo.Builder<_B> copyOf(final ListOfDiagnosticInfo _other) {
        final ListOfDiagnosticInfo.Builder<_B> _newBuilder = new ListOfDiagnosticInfo.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfDiagnosticInfo.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree diagnosticInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfo"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfoPropertyTree!= null):((diagnosticInfoPropertyTree == null)||(!diagnosticInfoPropertyTree.isLeaf())))) {
            if (this.diagnosticInfo == null) {
                _other.diagnosticInfo = null;
            } else {
                _other.diagnosticInfo = new ArrayList<DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>>>();
                for (DiagnosticInfo _item: this.diagnosticInfo) {
                    _other.diagnosticInfo.add(((_item == null)?null:_item.newCopyBuilder(_other, diagnosticInfoPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfDiagnosticInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfDiagnosticInfo.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfDiagnosticInfo.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfDiagnosticInfo.Builder<_B> copyOf(final ListOfDiagnosticInfo _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfDiagnosticInfo.Builder<_B> _newBuilder = new ListOfDiagnosticInfo.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfDiagnosticInfo.Builder<Void> copyExcept(final ListOfDiagnosticInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfDiagnosticInfo.Builder<Void> copyOnly(final ListOfDiagnosticInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfDiagnosticInfo _storedValue;
        private List<DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>>> diagnosticInfo;

        public Builder(final _B _parentBuilder, final ListOfDiagnosticInfo _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.diagnosticInfo == null) {
                        this.diagnosticInfo = null;
                    } else {
                        this.diagnosticInfo = new ArrayList<DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>>>();
                        for (DiagnosticInfo _item: _other.diagnosticInfo) {
                            this.diagnosticInfo.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfDiagnosticInfo _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree diagnosticInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfo"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfoPropertyTree!= null):((diagnosticInfoPropertyTree == null)||(!diagnosticInfoPropertyTree.isLeaf())))) {
                        if (_other.diagnosticInfo == null) {
                            this.diagnosticInfo = null;
                        } else {
                            this.diagnosticInfo = new ArrayList<DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>>>();
                            for (DiagnosticInfo _item: _other.diagnosticInfo) {
                                this.diagnosticInfo.add(((_item == null)?null:_item.newCopyBuilder(this, diagnosticInfoPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfDiagnosticInfo >_P init(final _P _product) {
            if (this.diagnosticInfo!= null) {
                final List<DiagnosticInfo> diagnosticInfo = new ArrayList<DiagnosticInfo>(this.diagnosticInfo.size());
                for (DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>> _item: this.diagnosticInfo) {
                    diagnosticInfo.add(_item.build());
                }
                _product.diagnosticInfo = diagnosticInfo;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "diagnosticInfo" hinzu.
         * 
         * @param diagnosticInfo
         *     Werte, die zur Eigenschaft "diagnosticInfo" hinzugefügt werden.
         */
        public ListOfDiagnosticInfo.Builder<_B> addDiagnosticInfo(final Iterable<? extends DiagnosticInfo> diagnosticInfo) {
            if (diagnosticInfo!= null) {
                if (this.diagnosticInfo == null) {
                    this.diagnosticInfo = new ArrayList<DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>>>();
                }
                for (DiagnosticInfo _item: diagnosticInfo) {
                    this.diagnosticInfo.add(new DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticInfo" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param diagnosticInfo
         *     Neuer Wert der Eigenschaft "diagnosticInfo".
         */
        public ListOfDiagnosticInfo.Builder<_B> withDiagnosticInfo(final Iterable<? extends DiagnosticInfo> diagnosticInfo) {
            if (this.diagnosticInfo!= null) {
                this.diagnosticInfo.clear();
            }
            return addDiagnosticInfo(diagnosticInfo);
        }

        /**
         * Fügt Werte zur Eigenschaft "diagnosticInfo" hinzu.
         * 
         * @param diagnosticInfo
         *     Werte, die zur Eigenschaft "diagnosticInfo" hinzugefügt werden.
         */
        public ListOfDiagnosticInfo.Builder<_B> addDiagnosticInfo(DiagnosticInfo... diagnosticInfo) {
            addDiagnosticInfo(Arrays.asList(diagnosticInfo));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticInfo" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param diagnosticInfo
         *     Neuer Wert der Eigenschaft "diagnosticInfo".
         */
        public ListOfDiagnosticInfo.Builder<_B> withDiagnosticInfo(DiagnosticInfo... diagnosticInfo) {
            withDiagnosticInfo(Arrays.asList(diagnosticInfo));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "DiagnosticInfo".
         * Mit {@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "DiagnosticInfo".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.DiagnosticInfo.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public DiagnosticInfo.Builder<? extends ListOfDiagnosticInfo.Builder<_B>> addDiagnosticInfo() {
            if (this.diagnosticInfo == null) {
                this.diagnosticInfo = new ArrayList<DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>>>();
            }
            final DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>> diagnosticInfo_Builder = new DiagnosticInfo.Builder<ListOfDiagnosticInfo.Builder<_B>>(this, null, false);
            this.diagnosticInfo.add(diagnosticInfo_Builder);
            return diagnosticInfo_Builder;
        }

        @Override
        public ListOfDiagnosticInfo build() {
            if (_storedValue == null) {
                return this.init(new ListOfDiagnosticInfo());
            } else {
                return ((ListOfDiagnosticInfo) _storedValue);
            }
        }

        public ListOfDiagnosticInfo.Builder<_B> copyOf(final ListOfDiagnosticInfo _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfDiagnosticInfo.Builder<_B> copyOf(final ListOfDiagnosticInfo.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfDiagnosticInfo.Selector<ListOfDiagnosticInfo.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfDiagnosticInfo.Select _root() {
            return new ListOfDiagnosticInfo.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private DiagnosticInfo.Selector<TRoot, ListOfDiagnosticInfo.Selector<TRoot, TParent>> diagnosticInfo = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.diagnosticInfo!= null) {
                products.put("diagnosticInfo", this.diagnosticInfo.init());
            }
            return products;
        }

        public DiagnosticInfo.Selector<TRoot, ListOfDiagnosticInfo.Selector<TRoot, TParent>> diagnosticInfo() {
            return ((this.diagnosticInfo == null)?this.diagnosticInfo = new DiagnosticInfo.Selector<TRoot, ListOfDiagnosticInfo.Selector<TRoot, TParent>>(this._root, this, "diagnosticInfo"):this.diagnosticInfo);
        }

    }

}
