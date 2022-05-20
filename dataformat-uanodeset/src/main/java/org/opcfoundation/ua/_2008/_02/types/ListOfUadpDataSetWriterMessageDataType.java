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
 * <p>Java-Klasse für ListOfUadpDataSetWriterMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUadpDataSetWriterMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UadpDataSetWriterMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UadpDataSetWriterMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUadpDataSetWriterMessageDataType", propOrder = {
    "uadpDataSetWriterMessageDataType"
})
public class ListOfUadpDataSetWriterMessageDataType {

    @XmlElement(name = "UadpDataSetWriterMessageDataType", nillable = true)
    protected List<UadpDataSetWriterMessageDataType> uadpDataSetWriterMessageDataType;

    /**
     * Gets the value of the uadpDataSetWriterMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uadpDataSetWriterMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUadpDataSetWriterMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UadpDataSetWriterMessageDataType }
     * 
     * 
     */
    public List<UadpDataSetWriterMessageDataType> getUadpDataSetWriterMessageDataType() {
        if (uadpDataSetWriterMessageDataType == null) {
            uadpDataSetWriterMessageDataType = new ArrayList<UadpDataSetWriterMessageDataType>();
        }
        return this.uadpDataSetWriterMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUadpDataSetWriterMessageDataType.Builder<_B> _other) {
        if (this.uadpDataSetWriterMessageDataType == null) {
            _other.uadpDataSetWriterMessageDataType = null;
        } else {
            _other.uadpDataSetWriterMessageDataType = new ArrayList<UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>>>();
            for (UadpDataSetWriterMessageDataType _item: this.uadpDataSetWriterMessageDataType) {
                _other.uadpDataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfUadpDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUadpDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUadpDataSetWriterMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUadpDataSetWriterMessageDataType.Builder<Void> builder() {
        return new ListOfUadpDataSetWriterMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUadpDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfUadpDataSetWriterMessageDataType _other) {
        final ListOfUadpDataSetWriterMessageDataType.Builder<_B> _newBuilder = new ListOfUadpDataSetWriterMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUadpDataSetWriterMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree uadpDataSetWriterMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpDataSetWriterMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpDataSetWriterMessageDataTypePropertyTree!= null):((uadpDataSetWriterMessageDataTypePropertyTree == null)||(!uadpDataSetWriterMessageDataTypePropertyTree.isLeaf())))) {
            if (this.uadpDataSetWriterMessageDataType == null) {
                _other.uadpDataSetWriterMessageDataType = null;
            } else {
                _other.uadpDataSetWriterMessageDataType = new ArrayList<UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>>>();
                for (UadpDataSetWriterMessageDataType _item: this.uadpDataSetWriterMessageDataType) {
                    _other.uadpDataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, uadpDataSetWriterMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfUadpDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUadpDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUadpDataSetWriterMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUadpDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfUadpDataSetWriterMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUadpDataSetWriterMessageDataType.Builder<_B> _newBuilder = new ListOfUadpDataSetWriterMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUadpDataSetWriterMessageDataType.Builder<Void> copyExcept(final ListOfUadpDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUadpDataSetWriterMessageDataType.Builder<Void> copyOnly(final ListOfUadpDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUadpDataSetWriterMessageDataType _storedValue;
        private List<UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>>> uadpDataSetWriterMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfUadpDataSetWriterMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.uadpDataSetWriterMessageDataType == null) {
                        this.uadpDataSetWriterMessageDataType = null;
                    } else {
                        this.uadpDataSetWriterMessageDataType = new ArrayList<UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>>>();
                        for (UadpDataSetWriterMessageDataType _item: _other.uadpDataSetWriterMessageDataType) {
                            this.uadpDataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUadpDataSetWriterMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree uadpDataSetWriterMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpDataSetWriterMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpDataSetWriterMessageDataTypePropertyTree!= null):((uadpDataSetWriterMessageDataTypePropertyTree == null)||(!uadpDataSetWriterMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.uadpDataSetWriterMessageDataType == null) {
                            this.uadpDataSetWriterMessageDataType = null;
                        } else {
                            this.uadpDataSetWriterMessageDataType = new ArrayList<UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>>>();
                            for (UadpDataSetWriterMessageDataType _item: _other.uadpDataSetWriterMessageDataType) {
                                this.uadpDataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, uadpDataSetWriterMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfUadpDataSetWriterMessageDataType >_P init(final _P _product) {
            if (this.uadpDataSetWriterMessageDataType!= null) {
                final List<UadpDataSetWriterMessageDataType> uadpDataSetWriterMessageDataType = new ArrayList<UadpDataSetWriterMessageDataType>(this.uadpDataSetWriterMessageDataType.size());
                for (UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>> _item: this.uadpDataSetWriterMessageDataType) {
                    uadpDataSetWriterMessageDataType.add(_item.build());
                }
                _product.uadpDataSetWriterMessageDataType = uadpDataSetWriterMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpDataSetWriterMessageDataType" hinzu.
         * 
         * @param uadpDataSetWriterMessageDataType
         *     Werte, die zur Eigenschaft "uadpDataSetWriterMessageDataType" hinzugefügt
         *     werden.
         */
        public ListOfUadpDataSetWriterMessageDataType.Builder<_B> addUadpDataSetWriterMessageDataType(final Iterable<? extends UadpDataSetWriterMessageDataType> uadpDataSetWriterMessageDataType) {
            if (uadpDataSetWriterMessageDataType!= null) {
                if (this.uadpDataSetWriterMessageDataType == null) {
                    this.uadpDataSetWriterMessageDataType = new ArrayList<UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>>>();
                }
                for (UadpDataSetWriterMessageDataType _item: uadpDataSetWriterMessageDataType) {
                    this.uadpDataSetWriterMessageDataType.add(new UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpDataSetWriterMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpDataSetWriterMessageDataType
         *     Neuer Wert der Eigenschaft "uadpDataSetWriterMessageDataType".
         */
        public ListOfUadpDataSetWriterMessageDataType.Builder<_B> withUadpDataSetWriterMessageDataType(final Iterable<? extends UadpDataSetWriterMessageDataType> uadpDataSetWriterMessageDataType) {
            if (this.uadpDataSetWriterMessageDataType!= null) {
                this.uadpDataSetWriterMessageDataType.clear();
            }
            return addUadpDataSetWriterMessageDataType(uadpDataSetWriterMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpDataSetWriterMessageDataType" hinzu.
         * 
         * @param uadpDataSetWriterMessageDataType
         *     Werte, die zur Eigenschaft "uadpDataSetWriterMessageDataType" hinzugefügt
         *     werden.
         */
        public ListOfUadpDataSetWriterMessageDataType.Builder<_B> addUadpDataSetWriterMessageDataType(UadpDataSetWriterMessageDataType... uadpDataSetWriterMessageDataType) {
            addUadpDataSetWriterMessageDataType(Arrays.asList(uadpDataSetWriterMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpDataSetWriterMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpDataSetWriterMessageDataType
         *     Neuer Wert der Eigenschaft "uadpDataSetWriterMessageDataType".
         */
        public ListOfUadpDataSetWriterMessageDataType.Builder<_B> withUadpDataSetWriterMessageDataType(UadpDataSetWriterMessageDataType... uadpDataSetWriterMessageDataType) {
            withUadpDataSetWriterMessageDataType(Arrays.asList(uadpDataSetWriterMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "UadpDataSetWriterMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "UadpDataSetWriterMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.UadpDataSetWriterMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public UadpDataSetWriterMessageDataType.Builder<? extends ListOfUadpDataSetWriterMessageDataType.Builder<_B>> addUadpDataSetWriterMessageDataType() {
            if (this.uadpDataSetWriterMessageDataType == null) {
                this.uadpDataSetWriterMessageDataType = new ArrayList<UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>>>();
            }
            final UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>> uadpDataSetWriterMessageDataType_Builder = new UadpDataSetWriterMessageDataType.Builder<ListOfUadpDataSetWriterMessageDataType.Builder<_B>>(this, null, false);
            this.uadpDataSetWriterMessageDataType.add(uadpDataSetWriterMessageDataType_Builder);
            return uadpDataSetWriterMessageDataType_Builder;
        }

        @Override
        public ListOfUadpDataSetWriterMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfUadpDataSetWriterMessageDataType());
            } else {
                return ((ListOfUadpDataSetWriterMessageDataType) _storedValue);
            }
        }

        public ListOfUadpDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfUadpDataSetWriterMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUadpDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfUadpDataSetWriterMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUadpDataSetWriterMessageDataType.Selector<ListOfUadpDataSetWriterMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUadpDataSetWriterMessageDataType.Select _root() {
            return new ListOfUadpDataSetWriterMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private UadpDataSetWriterMessageDataType.Selector<TRoot, ListOfUadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> uadpDataSetWriterMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.uadpDataSetWriterMessageDataType!= null) {
                products.put("uadpDataSetWriterMessageDataType", this.uadpDataSetWriterMessageDataType.init());
            }
            return products;
        }

        public UadpDataSetWriterMessageDataType.Selector<TRoot, ListOfUadpDataSetWriterMessageDataType.Selector<TRoot, TParent>> uadpDataSetWriterMessageDataType() {
            return ((this.uadpDataSetWriterMessageDataType == null)?this.uadpDataSetWriterMessageDataType = new UadpDataSetWriterMessageDataType.Selector<TRoot, ListOfUadpDataSetWriterMessageDataType.Selector<TRoot, TParent>>(this._root, this, "uadpDataSetWriterMessageDataType"):this.uadpDataSetWriterMessageDataType);
        }

    }

}
