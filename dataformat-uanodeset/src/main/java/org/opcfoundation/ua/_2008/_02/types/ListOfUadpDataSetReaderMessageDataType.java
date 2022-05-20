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
 * <p>Java-Klasse für ListOfUadpDataSetReaderMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUadpDataSetReaderMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UadpDataSetReaderMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UadpDataSetReaderMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUadpDataSetReaderMessageDataType", propOrder = {
    "uadpDataSetReaderMessageDataType"
})
public class ListOfUadpDataSetReaderMessageDataType {

    @XmlElement(name = "UadpDataSetReaderMessageDataType", nillable = true)
    protected List<UadpDataSetReaderMessageDataType> uadpDataSetReaderMessageDataType;

    /**
     * Gets the value of the uadpDataSetReaderMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uadpDataSetReaderMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUadpDataSetReaderMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UadpDataSetReaderMessageDataType }
     * 
     * 
     */
    public List<UadpDataSetReaderMessageDataType> getUadpDataSetReaderMessageDataType() {
        if (uadpDataSetReaderMessageDataType == null) {
            uadpDataSetReaderMessageDataType = new ArrayList<UadpDataSetReaderMessageDataType>();
        }
        return this.uadpDataSetReaderMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUadpDataSetReaderMessageDataType.Builder<_B> _other) {
        if (this.uadpDataSetReaderMessageDataType == null) {
            _other.uadpDataSetReaderMessageDataType = null;
        } else {
            _other.uadpDataSetReaderMessageDataType = new ArrayList<UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>>>();
            for (UadpDataSetReaderMessageDataType _item: this.uadpDataSetReaderMessageDataType) {
                _other.uadpDataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfUadpDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUadpDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUadpDataSetReaderMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUadpDataSetReaderMessageDataType.Builder<Void> builder() {
        return new ListOfUadpDataSetReaderMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUadpDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfUadpDataSetReaderMessageDataType _other) {
        final ListOfUadpDataSetReaderMessageDataType.Builder<_B> _newBuilder = new ListOfUadpDataSetReaderMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUadpDataSetReaderMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree uadpDataSetReaderMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpDataSetReaderMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpDataSetReaderMessageDataTypePropertyTree!= null):((uadpDataSetReaderMessageDataTypePropertyTree == null)||(!uadpDataSetReaderMessageDataTypePropertyTree.isLeaf())))) {
            if (this.uadpDataSetReaderMessageDataType == null) {
                _other.uadpDataSetReaderMessageDataType = null;
            } else {
                _other.uadpDataSetReaderMessageDataType = new ArrayList<UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>>>();
                for (UadpDataSetReaderMessageDataType _item: this.uadpDataSetReaderMessageDataType) {
                    _other.uadpDataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, uadpDataSetReaderMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfUadpDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUadpDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUadpDataSetReaderMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUadpDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfUadpDataSetReaderMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUadpDataSetReaderMessageDataType.Builder<_B> _newBuilder = new ListOfUadpDataSetReaderMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUadpDataSetReaderMessageDataType.Builder<Void> copyExcept(final ListOfUadpDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUadpDataSetReaderMessageDataType.Builder<Void> copyOnly(final ListOfUadpDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUadpDataSetReaderMessageDataType _storedValue;
        private List<UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>>> uadpDataSetReaderMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfUadpDataSetReaderMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.uadpDataSetReaderMessageDataType == null) {
                        this.uadpDataSetReaderMessageDataType = null;
                    } else {
                        this.uadpDataSetReaderMessageDataType = new ArrayList<UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>>>();
                        for (UadpDataSetReaderMessageDataType _item: _other.uadpDataSetReaderMessageDataType) {
                            this.uadpDataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUadpDataSetReaderMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree uadpDataSetReaderMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpDataSetReaderMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpDataSetReaderMessageDataTypePropertyTree!= null):((uadpDataSetReaderMessageDataTypePropertyTree == null)||(!uadpDataSetReaderMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.uadpDataSetReaderMessageDataType == null) {
                            this.uadpDataSetReaderMessageDataType = null;
                        } else {
                            this.uadpDataSetReaderMessageDataType = new ArrayList<UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>>>();
                            for (UadpDataSetReaderMessageDataType _item: _other.uadpDataSetReaderMessageDataType) {
                                this.uadpDataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, uadpDataSetReaderMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfUadpDataSetReaderMessageDataType >_P init(final _P _product) {
            if (this.uadpDataSetReaderMessageDataType!= null) {
                final List<UadpDataSetReaderMessageDataType> uadpDataSetReaderMessageDataType = new ArrayList<UadpDataSetReaderMessageDataType>(this.uadpDataSetReaderMessageDataType.size());
                for (UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>> _item: this.uadpDataSetReaderMessageDataType) {
                    uadpDataSetReaderMessageDataType.add(_item.build());
                }
                _product.uadpDataSetReaderMessageDataType = uadpDataSetReaderMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpDataSetReaderMessageDataType" hinzu.
         * 
         * @param uadpDataSetReaderMessageDataType
         *     Werte, die zur Eigenschaft "uadpDataSetReaderMessageDataType" hinzugefügt
         *     werden.
         */
        public ListOfUadpDataSetReaderMessageDataType.Builder<_B> addUadpDataSetReaderMessageDataType(final Iterable<? extends UadpDataSetReaderMessageDataType> uadpDataSetReaderMessageDataType) {
            if (uadpDataSetReaderMessageDataType!= null) {
                if (this.uadpDataSetReaderMessageDataType == null) {
                    this.uadpDataSetReaderMessageDataType = new ArrayList<UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>>>();
                }
                for (UadpDataSetReaderMessageDataType _item: uadpDataSetReaderMessageDataType) {
                    this.uadpDataSetReaderMessageDataType.add(new UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpDataSetReaderMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpDataSetReaderMessageDataType
         *     Neuer Wert der Eigenschaft "uadpDataSetReaderMessageDataType".
         */
        public ListOfUadpDataSetReaderMessageDataType.Builder<_B> withUadpDataSetReaderMessageDataType(final Iterable<? extends UadpDataSetReaderMessageDataType> uadpDataSetReaderMessageDataType) {
            if (this.uadpDataSetReaderMessageDataType!= null) {
                this.uadpDataSetReaderMessageDataType.clear();
            }
            return addUadpDataSetReaderMessageDataType(uadpDataSetReaderMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpDataSetReaderMessageDataType" hinzu.
         * 
         * @param uadpDataSetReaderMessageDataType
         *     Werte, die zur Eigenschaft "uadpDataSetReaderMessageDataType" hinzugefügt
         *     werden.
         */
        public ListOfUadpDataSetReaderMessageDataType.Builder<_B> addUadpDataSetReaderMessageDataType(UadpDataSetReaderMessageDataType... uadpDataSetReaderMessageDataType) {
            addUadpDataSetReaderMessageDataType(Arrays.asList(uadpDataSetReaderMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpDataSetReaderMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpDataSetReaderMessageDataType
         *     Neuer Wert der Eigenschaft "uadpDataSetReaderMessageDataType".
         */
        public ListOfUadpDataSetReaderMessageDataType.Builder<_B> withUadpDataSetReaderMessageDataType(UadpDataSetReaderMessageDataType... uadpDataSetReaderMessageDataType) {
            withUadpDataSetReaderMessageDataType(Arrays.asList(uadpDataSetReaderMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "UadpDataSetReaderMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "UadpDataSetReaderMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.UadpDataSetReaderMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public UadpDataSetReaderMessageDataType.Builder<? extends ListOfUadpDataSetReaderMessageDataType.Builder<_B>> addUadpDataSetReaderMessageDataType() {
            if (this.uadpDataSetReaderMessageDataType == null) {
                this.uadpDataSetReaderMessageDataType = new ArrayList<UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>>>();
            }
            final UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>> uadpDataSetReaderMessageDataType_Builder = new UadpDataSetReaderMessageDataType.Builder<ListOfUadpDataSetReaderMessageDataType.Builder<_B>>(this, null, false);
            this.uadpDataSetReaderMessageDataType.add(uadpDataSetReaderMessageDataType_Builder);
            return uadpDataSetReaderMessageDataType_Builder;
        }

        @Override
        public ListOfUadpDataSetReaderMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfUadpDataSetReaderMessageDataType());
            } else {
                return ((ListOfUadpDataSetReaderMessageDataType) _storedValue);
            }
        }

        public ListOfUadpDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfUadpDataSetReaderMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUadpDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfUadpDataSetReaderMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUadpDataSetReaderMessageDataType.Selector<ListOfUadpDataSetReaderMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUadpDataSetReaderMessageDataType.Select _root() {
            return new ListOfUadpDataSetReaderMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private UadpDataSetReaderMessageDataType.Selector<TRoot, ListOfUadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> uadpDataSetReaderMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.uadpDataSetReaderMessageDataType!= null) {
                products.put("uadpDataSetReaderMessageDataType", this.uadpDataSetReaderMessageDataType.init());
            }
            return products;
        }

        public UadpDataSetReaderMessageDataType.Selector<TRoot, ListOfUadpDataSetReaderMessageDataType.Selector<TRoot, TParent>> uadpDataSetReaderMessageDataType() {
            return ((this.uadpDataSetReaderMessageDataType == null)?this.uadpDataSetReaderMessageDataType = new UadpDataSetReaderMessageDataType.Selector<TRoot, ListOfUadpDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "uadpDataSetReaderMessageDataType"):this.uadpDataSetReaderMessageDataType);
        }

    }

}
