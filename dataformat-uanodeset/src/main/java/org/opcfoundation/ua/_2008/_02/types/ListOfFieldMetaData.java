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
 * <p>Java-Klasse für ListOfFieldMetaData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfFieldMetaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldMetaData" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}FieldMetaData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfFieldMetaData", propOrder = {
    "fieldMetaData"
})
public class ListOfFieldMetaData {

    @XmlElement(name = "FieldMetaData", nillable = true)
    protected List<FieldMetaData> fieldMetaData;

    /**
     * Gets the value of the fieldMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldMetaData }
     * 
     * 
     */
    public List<FieldMetaData> getFieldMetaData() {
        if (fieldMetaData == null) {
            fieldMetaData = new ArrayList<FieldMetaData>();
        }
        return this.fieldMetaData;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfFieldMetaData.Builder<_B> _other) {
        if (this.fieldMetaData == null) {
            _other.fieldMetaData = null;
        } else {
            _other.fieldMetaData = new ArrayList<FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>>>();
            for (FieldMetaData _item: this.fieldMetaData) {
                _other.fieldMetaData.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfFieldMetaData.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfFieldMetaData.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfFieldMetaData.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfFieldMetaData.Builder<Void> builder() {
        return new ListOfFieldMetaData.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfFieldMetaData.Builder<_B> copyOf(final ListOfFieldMetaData _other) {
        final ListOfFieldMetaData.Builder<_B> _newBuilder = new ListOfFieldMetaData.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfFieldMetaData.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree fieldMetaDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fieldMetaData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldMetaDataPropertyTree!= null):((fieldMetaDataPropertyTree == null)||(!fieldMetaDataPropertyTree.isLeaf())))) {
            if (this.fieldMetaData == null) {
                _other.fieldMetaData = null;
            } else {
                _other.fieldMetaData = new ArrayList<FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>>>();
                for (FieldMetaData _item: this.fieldMetaData) {
                    _other.fieldMetaData.add(((_item == null)?null:_item.newCopyBuilder(_other, fieldMetaDataPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfFieldMetaData.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfFieldMetaData.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfFieldMetaData.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfFieldMetaData.Builder<_B> copyOf(final ListOfFieldMetaData _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfFieldMetaData.Builder<_B> _newBuilder = new ListOfFieldMetaData.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfFieldMetaData.Builder<Void> copyExcept(final ListOfFieldMetaData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfFieldMetaData.Builder<Void> copyOnly(final ListOfFieldMetaData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfFieldMetaData _storedValue;
        private List<FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>>> fieldMetaData;

        public Builder(final _B _parentBuilder, final ListOfFieldMetaData _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.fieldMetaData == null) {
                        this.fieldMetaData = null;
                    } else {
                        this.fieldMetaData = new ArrayList<FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>>>();
                        for (FieldMetaData _item: _other.fieldMetaData) {
                            this.fieldMetaData.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfFieldMetaData _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree fieldMetaDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fieldMetaData"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldMetaDataPropertyTree!= null):((fieldMetaDataPropertyTree == null)||(!fieldMetaDataPropertyTree.isLeaf())))) {
                        if (_other.fieldMetaData == null) {
                            this.fieldMetaData = null;
                        } else {
                            this.fieldMetaData = new ArrayList<FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>>>();
                            for (FieldMetaData _item: _other.fieldMetaData) {
                                this.fieldMetaData.add(((_item == null)?null:_item.newCopyBuilder(this, fieldMetaDataPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfFieldMetaData >_P init(final _P _product) {
            if (this.fieldMetaData!= null) {
                final List<FieldMetaData> fieldMetaData = new ArrayList<FieldMetaData>(this.fieldMetaData.size());
                for (FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>> _item: this.fieldMetaData) {
                    fieldMetaData.add(_item.build());
                }
                _product.fieldMetaData = fieldMetaData;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "fieldMetaData" hinzu.
         * 
         * @param fieldMetaData
         *     Werte, die zur Eigenschaft "fieldMetaData" hinzugefügt werden.
         */
        public ListOfFieldMetaData.Builder<_B> addFieldMetaData(final Iterable<? extends FieldMetaData> fieldMetaData) {
            if (fieldMetaData!= null) {
                if (this.fieldMetaData == null) {
                    this.fieldMetaData = new ArrayList<FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>>>();
                }
                for (FieldMetaData _item: fieldMetaData) {
                    this.fieldMetaData.add(new FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "fieldMetaData" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param fieldMetaData
         *     Neuer Wert der Eigenschaft "fieldMetaData".
         */
        public ListOfFieldMetaData.Builder<_B> withFieldMetaData(final Iterable<? extends FieldMetaData> fieldMetaData) {
            if (this.fieldMetaData!= null) {
                this.fieldMetaData.clear();
            }
            return addFieldMetaData(fieldMetaData);
        }

        /**
         * Fügt Werte zur Eigenschaft "fieldMetaData" hinzu.
         * 
         * @param fieldMetaData
         *     Werte, die zur Eigenschaft "fieldMetaData" hinzugefügt werden.
         */
        public ListOfFieldMetaData.Builder<_B> addFieldMetaData(FieldMetaData... fieldMetaData) {
            addFieldMetaData(Arrays.asList(fieldMetaData));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "fieldMetaData" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param fieldMetaData
         *     Neuer Wert der Eigenschaft "fieldMetaData".
         */
        public ListOfFieldMetaData.Builder<_B> withFieldMetaData(FieldMetaData... fieldMetaData) {
            withFieldMetaData(Arrays.asList(fieldMetaData));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "FieldMetaData".
         * Mit {@link org.opcfoundation.ua._2008._02.types.FieldMetaData.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "FieldMetaData".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.FieldMetaData.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public FieldMetaData.Builder<? extends ListOfFieldMetaData.Builder<_B>> addFieldMetaData() {
            if (this.fieldMetaData == null) {
                this.fieldMetaData = new ArrayList<FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>>>();
            }
            final FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>> fieldMetaData_Builder = new FieldMetaData.Builder<ListOfFieldMetaData.Builder<_B>>(this, null, false);
            this.fieldMetaData.add(fieldMetaData_Builder);
            return fieldMetaData_Builder;
        }

        @Override
        public ListOfFieldMetaData build() {
            if (_storedValue == null) {
                return this.init(new ListOfFieldMetaData());
            } else {
                return ((ListOfFieldMetaData) _storedValue);
            }
        }

        public ListOfFieldMetaData.Builder<_B> copyOf(final ListOfFieldMetaData _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfFieldMetaData.Builder<_B> copyOf(final ListOfFieldMetaData.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfFieldMetaData.Selector<ListOfFieldMetaData.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfFieldMetaData.Select _root() {
            return new ListOfFieldMetaData.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private FieldMetaData.Selector<TRoot, ListOfFieldMetaData.Selector<TRoot, TParent>> fieldMetaData = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.fieldMetaData!= null) {
                products.put("fieldMetaData", this.fieldMetaData.init());
            }
            return products;
        }

        public FieldMetaData.Selector<TRoot, ListOfFieldMetaData.Selector<TRoot, TParent>> fieldMetaData() {
            return ((this.fieldMetaData == null)?this.fieldMetaData = new FieldMetaData.Selector<TRoot, ListOfFieldMetaData.Selector<TRoot, TParent>>(this._root, this, "fieldMetaData"):this.fieldMetaData);
        }

    }

}
