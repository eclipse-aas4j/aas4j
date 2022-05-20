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
 * <p>Java-Klasse für ListOfUABinaryFileDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUABinaryFileDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UABinaryFileDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UABinaryFileDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUABinaryFileDataType", propOrder = {
    "uaBinaryFileDataType"
})
public class ListOfUABinaryFileDataType {

    @XmlElement(name = "UABinaryFileDataType", nillable = true)
    protected List<UABinaryFileDataType> uaBinaryFileDataType;

    /**
     * Gets the value of the uaBinaryFileDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uaBinaryFileDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUABinaryFileDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UABinaryFileDataType }
     * 
     * 
     */
    public List<UABinaryFileDataType> getUABinaryFileDataType() {
        if (uaBinaryFileDataType == null) {
            uaBinaryFileDataType = new ArrayList<UABinaryFileDataType>();
        }
        return this.uaBinaryFileDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUABinaryFileDataType.Builder<_B> _other) {
        if (this.uaBinaryFileDataType == null) {
            _other.uaBinaryFileDataType = null;
        } else {
            _other.uaBinaryFileDataType = new ArrayList<UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>>>();
            for (UABinaryFileDataType _item: this.uaBinaryFileDataType) {
                _other.uaBinaryFileDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfUABinaryFileDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUABinaryFileDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUABinaryFileDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUABinaryFileDataType.Builder<Void> builder() {
        return new ListOfUABinaryFileDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUABinaryFileDataType.Builder<_B> copyOf(final ListOfUABinaryFileDataType _other) {
        final ListOfUABinaryFileDataType.Builder<_B> _newBuilder = new ListOfUABinaryFileDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUABinaryFileDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree uaBinaryFileDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uaBinaryFileDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uaBinaryFileDataTypePropertyTree!= null):((uaBinaryFileDataTypePropertyTree == null)||(!uaBinaryFileDataTypePropertyTree.isLeaf())))) {
            if (this.uaBinaryFileDataType == null) {
                _other.uaBinaryFileDataType = null;
            } else {
                _other.uaBinaryFileDataType = new ArrayList<UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>>>();
                for (UABinaryFileDataType _item: this.uaBinaryFileDataType) {
                    _other.uaBinaryFileDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, uaBinaryFileDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfUABinaryFileDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUABinaryFileDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUABinaryFileDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUABinaryFileDataType.Builder<_B> copyOf(final ListOfUABinaryFileDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUABinaryFileDataType.Builder<_B> _newBuilder = new ListOfUABinaryFileDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUABinaryFileDataType.Builder<Void> copyExcept(final ListOfUABinaryFileDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUABinaryFileDataType.Builder<Void> copyOnly(final ListOfUABinaryFileDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUABinaryFileDataType _storedValue;
        private List<UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>>> uaBinaryFileDataType;

        public Builder(final _B _parentBuilder, final ListOfUABinaryFileDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.uaBinaryFileDataType == null) {
                        this.uaBinaryFileDataType = null;
                    } else {
                        this.uaBinaryFileDataType = new ArrayList<UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>>>();
                        for (UABinaryFileDataType _item: _other.uaBinaryFileDataType) {
                            this.uaBinaryFileDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUABinaryFileDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree uaBinaryFileDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uaBinaryFileDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uaBinaryFileDataTypePropertyTree!= null):((uaBinaryFileDataTypePropertyTree == null)||(!uaBinaryFileDataTypePropertyTree.isLeaf())))) {
                        if (_other.uaBinaryFileDataType == null) {
                            this.uaBinaryFileDataType = null;
                        } else {
                            this.uaBinaryFileDataType = new ArrayList<UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>>>();
                            for (UABinaryFileDataType _item: _other.uaBinaryFileDataType) {
                                this.uaBinaryFileDataType.add(((_item == null)?null:_item.newCopyBuilder(this, uaBinaryFileDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfUABinaryFileDataType >_P init(final _P _product) {
            if (this.uaBinaryFileDataType!= null) {
                final List<UABinaryFileDataType> uaBinaryFileDataType = new ArrayList<UABinaryFileDataType>(this.uaBinaryFileDataType.size());
                for (UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>> _item: this.uaBinaryFileDataType) {
                    uaBinaryFileDataType.add(_item.build());
                }
                _product.uaBinaryFileDataType = uaBinaryFileDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "uaBinaryFileDataType" hinzu.
         * 
         * @param uaBinaryFileDataType
         *     Werte, die zur Eigenschaft "uaBinaryFileDataType" hinzugefügt werden.
         */
        public ListOfUABinaryFileDataType.Builder<_B> addUABinaryFileDataType(final Iterable<? extends UABinaryFileDataType> uaBinaryFileDataType) {
            if (uaBinaryFileDataType!= null) {
                if (this.uaBinaryFileDataType == null) {
                    this.uaBinaryFileDataType = new ArrayList<UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>>>();
                }
                for (UABinaryFileDataType _item: uaBinaryFileDataType) {
                    this.uaBinaryFileDataType.add(new UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uaBinaryFileDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param uaBinaryFileDataType
         *     Neuer Wert der Eigenschaft "uaBinaryFileDataType".
         */
        public ListOfUABinaryFileDataType.Builder<_B> withUABinaryFileDataType(final Iterable<? extends UABinaryFileDataType> uaBinaryFileDataType) {
            if (this.uaBinaryFileDataType!= null) {
                this.uaBinaryFileDataType.clear();
            }
            return addUABinaryFileDataType(uaBinaryFileDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "uaBinaryFileDataType" hinzu.
         * 
         * @param uaBinaryFileDataType
         *     Werte, die zur Eigenschaft "uaBinaryFileDataType" hinzugefügt werden.
         */
        public ListOfUABinaryFileDataType.Builder<_B> addUABinaryFileDataType(UABinaryFileDataType... uaBinaryFileDataType) {
            addUABinaryFileDataType(Arrays.asList(uaBinaryFileDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uaBinaryFileDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param uaBinaryFileDataType
         *     Neuer Wert der Eigenschaft "uaBinaryFileDataType".
         */
        public ListOfUABinaryFileDataType.Builder<_B> withUABinaryFileDataType(UABinaryFileDataType... uaBinaryFileDataType) {
            withUABinaryFileDataType(Arrays.asList(uaBinaryFileDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "UABinaryFileDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.UABinaryFileDataType.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "UABinaryFileDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.UABinaryFileDataType.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public UABinaryFileDataType.Builder<? extends ListOfUABinaryFileDataType.Builder<_B>> addUABinaryFileDataType() {
            if (this.uaBinaryFileDataType == null) {
                this.uaBinaryFileDataType = new ArrayList<UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>>>();
            }
            final UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>> uaBinaryFileDataType_Builder = new UABinaryFileDataType.Builder<ListOfUABinaryFileDataType.Builder<_B>>(this, null, false);
            this.uaBinaryFileDataType.add(uaBinaryFileDataType_Builder);
            return uaBinaryFileDataType_Builder;
        }

        @Override
        public ListOfUABinaryFileDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfUABinaryFileDataType());
            } else {
                return ((ListOfUABinaryFileDataType) _storedValue);
            }
        }

        public ListOfUABinaryFileDataType.Builder<_B> copyOf(final ListOfUABinaryFileDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUABinaryFileDataType.Builder<_B> copyOf(final ListOfUABinaryFileDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUABinaryFileDataType.Selector<ListOfUABinaryFileDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUABinaryFileDataType.Select _root() {
            return new ListOfUABinaryFileDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private UABinaryFileDataType.Selector<TRoot, ListOfUABinaryFileDataType.Selector<TRoot, TParent>> uaBinaryFileDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.uaBinaryFileDataType!= null) {
                products.put("uaBinaryFileDataType", this.uaBinaryFileDataType.init());
            }
            return products;
        }

        public UABinaryFileDataType.Selector<TRoot, ListOfUABinaryFileDataType.Selector<TRoot, TParent>> uaBinaryFileDataType() {
            return ((this.uaBinaryFileDataType == null)?this.uaBinaryFileDataType = new UABinaryFileDataType.Selector<TRoot, ListOfUABinaryFileDataType.Selector<TRoot, TParent>>(this._root, this, "uaBinaryFileDataType"):this.uaBinaryFileDataType);
        }

    }

}
