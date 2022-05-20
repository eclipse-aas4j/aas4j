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
 * <p>Java-Klasse für ListOfFieldTargetDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfFieldTargetDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldTargetDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}FieldTargetDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfFieldTargetDataType", propOrder = {
    "fieldTargetDataType"
})
public class ListOfFieldTargetDataType {

    @XmlElement(name = "FieldTargetDataType", nillable = true)
    protected List<FieldTargetDataType> fieldTargetDataType;

    /**
     * Gets the value of the fieldTargetDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldTargetDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldTargetDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldTargetDataType }
     * 
     * 
     */
    public List<FieldTargetDataType> getFieldTargetDataType() {
        if (fieldTargetDataType == null) {
            fieldTargetDataType = new ArrayList<FieldTargetDataType>();
        }
        return this.fieldTargetDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfFieldTargetDataType.Builder<_B> _other) {
        if (this.fieldTargetDataType == null) {
            _other.fieldTargetDataType = null;
        } else {
            _other.fieldTargetDataType = new ArrayList<FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>>>();
            for (FieldTargetDataType _item: this.fieldTargetDataType) {
                _other.fieldTargetDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfFieldTargetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfFieldTargetDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfFieldTargetDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfFieldTargetDataType.Builder<Void> builder() {
        return new ListOfFieldTargetDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfFieldTargetDataType.Builder<_B> copyOf(final ListOfFieldTargetDataType _other) {
        final ListOfFieldTargetDataType.Builder<_B> _newBuilder = new ListOfFieldTargetDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfFieldTargetDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree fieldTargetDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fieldTargetDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldTargetDataTypePropertyTree!= null):((fieldTargetDataTypePropertyTree == null)||(!fieldTargetDataTypePropertyTree.isLeaf())))) {
            if (this.fieldTargetDataType == null) {
                _other.fieldTargetDataType = null;
            } else {
                _other.fieldTargetDataType = new ArrayList<FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>>>();
                for (FieldTargetDataType _item: this.fieldTargetDataType) {
                    _other.fieldTargetDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, fieldTargetDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfFieldTargetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfFieldTargetDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfFieldTargetDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfFieldTargetDataType.Builder<_B> copyOf(final ListOfFieldTargetDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfFieldTargetDataType.Builder<_B> _newBuilder = new ListOfFieldTargetDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfFieldTargetDataType.Builder<Void> copyExcept(final ListOfFieldTargetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfFieldTargetDataType.Builder<Void> copyOnly(final ListOfFieldTargetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfFieldTargetDataType _storedValue;
        private List<FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>>> fieldTargetDataType;

        public Builder(final _B _parentBuilder, final ListOfFieldTargetDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.fieldTargetDataType == null) {
                        this.fieldTargetDataType = null;
                    } else {
                        this.fieldTargetDataType = new ArrayList<FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>>>();
                        for (FieldTargetDataType _item: _other.fieldTargetDataType) {
                            this.fieldTargetDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfFieldTargetDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree fieldTargetDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fieldTargetDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldTargetDataTypePropertyTree!= null):((fieldTargetDataTypePropertyTree == null)||(!fieldTargetDataTypePropertyTree.isLeaf())))) {
                        if (_other.fieldTargetDataType == null) {
                            this.fieldTargetDataType = null;
                        } else {
                            this.fieldTargetDataType = new ArrayList<FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>>>();
                            for (FieldTargetDataType _item: _other.fieldTargetDataType) {
                                this.fieldTargetDataType.add(((_item == null)?null:_item.newCopyBuilder(this, fieldTargetDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfFieldTargetDataType >_P init(final _P _product) {
            if (this.fieldTargetDataType!= null) {
                final List<FieldTargetDataType> fieldTargetDataType = new ArrayList<FieldTargetDataType>(this.fieldTargetDataType.size());
                for (FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>> _item: this.fieldTargetDataType) {
                    fieldTargetDataType.add(_item.build());
                }
                _product.fieldTargetDataType = fieldTargetDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "fieldTargetDataType" hinzu.
         * 
         * @param fieldTargetDataType
         *     Werte, die zur Eigenschaft "fieldTargetDataType" hinzugefügt werden.
         */
        public ListOfFieldTargetDataType.Builder<_B> addFieldTargetDataType(final Iterable<? extends FieldTargetDataType> fieldTargetDataType) {
            if (fieldTargetDataType!= null) {
                if (this.fieldTargetDataType == null) {
                    this.fieldTargetDataType = new ArrayList<FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>>>();
                }
                for (FieldTargetDataType _item: fieldTargetDataType) {
                    this.fieldTargetDataType.add(new FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "fieldTargetDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param fieldTargetDataType
         *     Neuer Wert der Eigenschaft "fieldTargetDataType".
         */
        public ListOfFieldTargetDataType.Builder<_B> withFieldTargetDataType(final Iterable<? extends FieldTargetDataType> fieldTargetDataType) {
            if (this.fieldTargetDataType!= null) {
                this.fieldTargetDataType.clear();
            }
            return addFieldTargetDataType(fieldTargetDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "fieldTargetDataType" hinzu.
         * 
         * @param fieldTargetDataType
         *     Werte, die zur Eigenschaft "fieldTargetDataType" hinzugefügt werden.
         */
        public ListOfFieldTargetDataType.Builder<_B> addFieldTargetDataType(FieldTargetDataType... fieldTargetDataType) {
            addFieldTargetDataType(Arrays.asList(fieldTargetDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "fieldTargetDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param fieldTargetDataType
         *     Neuer Wert der Eigenschaft "fieldTargetDataType".
         */
        public ListOfFieldTargetDataType.Builder<_B> withFieldTargetDataType(FieldTargetDataType... fieldTargetDataType) {
            withFieldTargetDataType(Arrays.asList(fieldTargetDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "FieldTargetDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.FieldTargetDataType.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "FieldTargetDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.FieldTargetDataType.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public FieldTargetDataType.Builder<? extends ListOfFieldTargetDataType.Builder<_B>> addFieldTargetDataType() {
            if (this.fieldTargetDataType == null) {
                this.fieldTargetDataType = new ArrayList<FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>>>();
            }
            final FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>> fieldTargetDataType_Builder = new FieldTargetDataType.Builder<ListOfFieldTargetDataType.Builder<_B>>(this, null, false);
            this.fieldTargetDataType.add(fieldTargetDataType_Builder);
            return fieldTargetDataType_Builder;
        }

        @Override
        public ListOfFieldTargetDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfFieldTargetDataType());
            } else {
                return ((ListOfFieldTargetDataType) _storedValue);
            }
        }

        public ListOfFieldTargetDataType.Builder<_B> copyOf(final ListOfFieldTargetDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfFieldTargetDataType.Builder<_B> copyOf(final ListOfFieldTargetDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfFieldTargetDataType.Selector<ListOfFieldTargetDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfFieldTargetDataType.Select _root() {
            return new ListOfFieldTargetDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private FieldTargetDataType.Selector<TRoot, ListOfFieldTargetDataType.Selector<TRoot, TParent>> fieldTargetDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.fieldTargetDataType!= null) {
                products.put("fieldTargetDataType", this.fieldTargetDataType.init());
            }
            return products;
        }

        public FieldTargetDataType.Selector<TRoot, ListOfFieldTargetDataType.Selector<TRoot, TParent>> fieldTargetDataType() {
            return ((this.fieldTargetDataType == null)?this.fieldTargetDataType = new FieldTargetDataType.Selector<TRoot, ListOfFieldTargetDataType.Selector<TRoot, TParent>>(this._root, this, "fieldTargetDataType"):this.fieldTargetDataType);
        }

    }

}
