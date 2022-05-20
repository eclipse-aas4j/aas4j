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
 * <p>Java-Klasse für ListOfSamplingIntervalDiagnosticsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSamplingIntervalDiagnosticsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SamplingIntervalDiagnosticsDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SamplingIntervalDiagnosticsDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSamplingIntervalDiagnosticsDataType", propOrder = {
    "samplingIntervalDiagnosticsDataType"
})
public class ListOfSamplingIntervalDiagnosticsDataType {

    @XmlElement(name = "SamplingIntervalDiagnosticsDataType", nillable = true)
    protected List<SamplingIntervalDiagnosticsDataType> samplingIntervalDiagnosticsDataType;

    /**
     * Gets the value of the samplingIntervalDiagnosticsDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samplingIntervalDiagnosticsDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamplingIntervalDiagnosticsDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SamplingIntervalDiagnosticsDataType }
     * 
     * 
     */
    public List<SamplingIntervalDiagnosticsDataType> getSamplingIntervalDiagnosticsDataType() {
        if (samplingIntervalDiagnosticsDataType == null) {
            samplingIntervalDiagnosticsDataType = new ArrayList<SamplingIntervalDiagnosticsDataType>();
        }
        return this.samplingIntervalDiagnosticsDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> _other) {
        if (this.samplingIntervalDiagnosticsDataType == null) {
            _other.samplingIntervalDiagnosticsDataType = null;
        } else {
            _other.samplingIntervalDiagnosticsDataType = new ArrayList<SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>>>();
            for (SamplingIntervalDiagnosticsDataType _item: this.samplingIntervalDiagnosticsDataType) {
                _other.samplingIntervalDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSamplingIntervalDiagnosticsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSamplingIntervalDiagnosticsDataType.Builder<Void> builder() {
        return new ListOfSamplingIntervalDiagnosticsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> copyOf(final ListOfSamplingIntervalDiagnosticsDataType _other) {
        final ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> _newBuilder = new ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree samplingIntervalDiagnosticsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingIntervalDiagnosticsDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingIntervalDiagnosticsDataTypePropertyTree!= null):((samplingIntervalDiagnosticsDataTypePropertyTree == null)||(!samplingIntervalDiagnosticsDataTypePropertyTree.isLeaf())))) {
            if (this.samplingIntervalDiagnosticsDataType == null) {
                _other.samplingIntervalDiagnosticsDataType = null;
            } else {
                _other.samplingIntervalDiagnosticsDataType = new ArrayList<SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>>>();
                for (SamplingIntervalDiagnosticsDataType _item: this.samplingIntervalDiagnosticsDataType) {
                    _other.samplingIntervalDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, samplingIntervalDiagnosticsDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSamplingIntervalDiagnosticsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> copyOf(final ListOfSamplingIntervalDiagnosticsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> _newBuilder = new ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSamplingIntervalDiagnosticsDataType.Builder<Void> copyExcept(final ListOfSamplingIntervalDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSamplingIntervalDiagnosticsDataType.Builder<Void> copyOnly(final ListOfSamplingIntervalDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSamplingIntervalDiagnosticsDataType _storedValue;
        private List<SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>>> samplingIntervalDiagnosticsDataType;

        public Builder(final _B _parentBuilder, final ListOfSamplingIntervalDiagnosticsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.samplingIntervalDiagnosticsDataType == null) {
                        this.samplingIntervalDiagnosticsDataType = null;
                    } else {
                        this.samplingIntervalDiagnosticsDataType = new ArrayList<SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>>>();
                        for (SamplingIntervalDiagnosticsDataType _item: _other.samplingIntervalDiagnosticsDataType) {
                            this.samplingIntervalDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSamplingIntervalDiagnosticsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree samplingIntervalDiagnosticsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingIntervalDiagnosticsDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingIntervalDiagnosticsDataTypePropertyTree!= null):((samplingIntervalDiagnosticsDataTypePropertyTree == null)||(!samplingIntervalDiagnosticsDataTypePropertyTree.isLeaf())))) {
                        if (_other.samplingIntervalDiagnosticsDataType == null) {
                            this.samplingIntervalDiagnosticsDataType = null;
                        } else {
                            this.samplingIntervalDiagnosticsDataType = new ArrayList<SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>>>();
                            for (SamplingIntervalDiagnosticsDataType _item: _other.samplingIntervalDiagnosticsDataType) {
                                this.samplingIntervalDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(this, samplingIntervalDiagnosticsDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSamplingIntervalDiagnosticsDataType >_P init(final _P _product) {
            if (this.samplingIntervalDiagnosticsDataType!= null) {
                final List<SamplingIntervalDiagnosticsDataType> samplingIntervalDiagnosticsDataType = new ArrayList<SamplingIntervalDiagnosticsDataType>(this.samplingIntervalDiagnosticsDataType.size());
                for (SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>> _item: this.samplingIntervalDiagnosticsDataType) {
                    samplingIntervalDiagnosticsDataType.add(_item.build());
                }
                _product.samplingIntervalDiagnosticsDataType = samplingIntervalDiagnosticsDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "samplingIntervalDiagnosticsDataType" hinzu.
         * 
         * @param samplingIntervalDiagnosticsDataType
         *     Werte, die zur Eigenschaft "samplingIntervalDiagnosticsDataType" hinzugefügt
         *     werden.
         */
        public ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> addSamplingIntervalDiagnosticsDataType(final Iterable<? extends SamplingIntervalDiagnosticsDataType> samplingIntervalDiagnosticsDataType) {
            if (samplingIntervalDiagnosticsDataType!= null) {
                if (this.samplingIntervalDiagnosticsDataType == null) {
                    this.samplingIntervalDiagnosticsDataType = new ArrayList<SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>>>();
                }
                for (SamplingIntervalDiagnosticsDataType _item: samplingIntervalDiagnosticsDataType) {
                    this.samplingIntervalDiagnosticsDataType.add(new SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "samplingIntervalDiagnosticsDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param samplingIntervalDiagnosticsDataType
         *     Neuer Wert der Eigenschaft "samplingIntervalDiagnosticsDataType".
         */
        public ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> withSamplingIntervalDiagnosticsDataType(final Iterable<? extends SamplingIntervalDiagnosticsDataType> samplingIntervalDiagnosticsDataType) {
            if (this.samplingIntervalDiagnosticsDataType!= null) {
                this.samplingIntervalDiagnosticsDataType.clear();
            }
            return addSamplingIntervalDiagnosticsDataType(samplingIntervalDiagnosticsDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "samplingIntervalDiagnosticsDataType" hinzu.
         * 
         * @param samplingIntervalDiagnosticsDataType
         *     Werte, die zur Eigenschaft "samplingIntervalDiagnosticsDataType" hinzugefügt
         *     werden.
         */
        public ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> addSamplingIntervalDiagnosticsDataType(SamplingIntervalDiagnosticsDataType... samplingIntervalDiagnosticsDataType) {
            addSamplingIntervalDiagnosticsDataType(Arrays.asList(samplingIntervalDiagnosticsDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "samplingIntervalDiagnosticsDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param samplingIntervalDiagnosticsDataType
         *     Neuer Wert der Eigenschaft "samplingIntervalDiagnosticsDataType".
         */
        public ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> withSamplingIntervalDiagnosticsDataType(SamplingIntervalDiagnosticsDataType... samplingIntervalDiagnosticsDataType) {
            withSamplingIntervalDiagnosticsDataType(Arrays.asList(samplingIntervalDiagnosticsDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SamplingIntervalDiagnosticsDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SamplingIntervalDiagnosticsDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SamplingIntervalDiagnosticsDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public SamplingIntervalDiagnosticsDataType.Builder<? extends ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>> addSamplingIntervalDiagnosticsDataType() {
            if (this.samplingIntervalDiagnosticsDataType == null) {
                this.samplingIntervalDiagnosticsDataType = new ArrayList<SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>>>();
            }
            final SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>> samplingIntervalDiagnosticsDataType_Builder = new SamplingIntervalDiagnosticsDataType.Builder<ListOfSamplingIntervalDiagnosticsDataType.Builder<_B>>(this, null, false);
            this.samplingIntervalDiagnosticsDataType.add(samplingIntervalDiagnosticsDataType_Builder);
            return samplingIntervalDiagnosticsDataType_Builder;
        }

        @Override
        public ListOfSamplingIntervalDiagnosticsDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfSamplingIntervalDiagnosticsDataType());
            } else {
                return ((ListOfSamplingIntervalDiagnosticsDataType) _storedValue);
            }
        }

        public ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> copyOf(final ListOfSamplingIntervalDiagnosticsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSamplingIntervalDiagnosticsDataType.Builder<_B> copyOf(final ListOfSamplingIntervalDiagnosticsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSamplingIntervalDiagnosticsDataType.Selector<ListOfSamplingIntervalDiagnosticsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSamplingIntervalDiagnosticsDataType.Select _root() {
            return new ListOfSamplingIntervalDiagnosticsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SamplingIntervalDiagnosticsDataType.Selector<TRoot, ListOfSamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> samplingIntervalDiagnosticsDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.samplingIntervalDiagnosticsDataType!= null) {
                products.put("samplingIntervalDiagnosticsDataType", this.samplingIntervalDiagnosticsDataType.init());
            }
            return products;
        }

        public SamplingIntervalDiagnosticsDataType.Selector<TRoot, ListOfSamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> samplingIntervalDiagnosticsDataType() {
            return ((this.samplingIntervalDiagnosticsDataType == null)?this.samplingIntervalDiagnosticsDataType = new SamplingIntervalDiagnosticsDataType.Selector<TRoot, ListOfSamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "samplingIntervalDiagnosticsDataType"):this.samplingIntervalDiagnosticsDataType);
        }

    }

}
