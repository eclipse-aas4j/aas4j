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
 * <p>Java-Klasse für ListOfUadpWriterGroupMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUadpWriterGroupMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UadpWriterGroupMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UadpWriterGroupMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUadpWriterGroupMessageDataType", propOrder = {
    "uadpWriterGroupMessageDataType"
})
public class ListOfUadpWriterGroupMessageDataType {

    @XmlElement(name = "UadpWriterGroupMessageDataType", nillable = true)
    protected List<UadpWriterGroupMessageDataType> uadpWriterGroupMessageDataType;

    /**
     * Gets the value of the uadpWriterGroupMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uadpWriterGroupMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUadpWriterGroupMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UadpWriterGroupMessageDataType }
     * 
     * 
     */
    public List<UadpWriterGroupMessageDataType> getUadpWriterGroupMessageDataType() {
        if (uadpWriterGroupMessageDataType == null) {
            uadpWriterGroupMessageDataType = new ArrayList<UadpWriterGroupMessageDataType>();
        }
        return this.uadpWriterGroupMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUadpWriterGroupMessageDataType.Builder<_B> _other) {
        if (this.uadpWriterGroupMessageDataType == null) {
            _other.uadpWriterGroupMessageDataType = null;
        } else {
            _other.uadpWriterGroupMessageDataType = new ArrayList<UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>>>();
            for (UadpWriterGroupMessageDataType _item: this.uadpWriterGroupMessageDataType) {
                _other.uadpWriterGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfUadpWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUadpWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUadpWriterGroupMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUadpWriterGroupMessageDataType.Builder<Void> builder() {
        return new ListOfUadpWriterGroupMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUadpWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfUadpWriterGroupMessageDataType _other) {
        final ListOfUadpWriterGroupMessageDataType.Builder<_B> _newBuilder = new ListOfUadpWriterGroupMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUadpWriterGroupMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree uadpWriterGroupMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpWriterGroupMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpWriterGroupMessageDataTypePropertyTree!= null):((uadpWriterGroupMessageDataTypePropertyTree == null)||(!uadpWriterGroupMessageDataTypePropertyTree.isLeaf())))) {
            if (this.uadpWriterGroupMessageDataType == null) {
                _other.uadpWriterGroupMessageDataType = null;
            } else {
                _other.uadpWriterGroupMessageDataType = new ArrayList<UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>>>();
                for (UadpWriterGroupMessageDataType _item: this.uadpWriterGroupMessageDataType) {
                    _other.uadpWriterGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, uadpWriterGroupMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfUadpWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUadpWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUadpWriterGroupMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUadpWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfUadpWriterGroupMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUadpWriterGroupMessageDataType.Builder<_B> _newBuilder = new ListOfUadpWriterGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUadpWriterGroupMessageDataType.Builder<Void> copyExcept(final ListOfUadpWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUadpWriterGroupMessageDataType.Builder<Void> copyOnly(final ListOfUadpWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUadpWriterGroupMessageDataType _storedValue;
        private List<UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>>> uadpWriterGroupMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfUadpWriterGroupMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.uadpWriterGroupMessageDataType == null) {
                        this.uadpWriterGroupMessageDataType = null;
                    } else {
                        this.uadpWriterGroupMessageDataType = new ArrayList<UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>>>();
                        for (UadpWriterGroupMessageDataType _item: _other.uadpWriterGroupMessageDataType) {
                            this.uadpWriterGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUadpWriterGroupMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree uadpWriterGroupMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("uadpWriterGroupMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(uadpWriterGroupMessageDataTypePropertyTree!= null):((uadpWriterGroupMessageDataTypePropertyTree == null)||(!uadpWriterGroupMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.uadpWriterGroupMessageDataType == null) {
                            this.uadpWriterGroupMessageDataType = null;
                        } else {
                            this.uadpWriterGroupMessageDataType = new ArrayList<UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>>>();
                            for (UadpWriterGroupMessageDataType _item: _other.uadpWriterGroupMessageDataType) {
                                this.uadpWriterGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, uadpWriterGroupMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfUadpWriterGroupMessageDataType >_P init(final _P _product) {
            if (this.uadpWriterGroupMessageDataType!= null) {
                final List<UadpWriterGroupMessageDataType> uadpWriterGroupMessageDataType = new ArrayList<UadpWriterGroupMessageDataType>(this.uadpWriterGroupMessageDataType.size());
                for (UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>> _item: this.uadpWriterGroupMessageDataType) {
                    uadpWriterGroupMessageDataType.add(_item.build());
                }
                _product.uadpWriterGroupMessageDataType = uadpWriterGroupMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpWriterGroupMessageDataType" hinzu.
         * 
         * @param uadpWriterGroupMessageDataType
         *     Werte, die zur Eigenschaft "uadpWriterGroupMessageDataType" hinzugefügt werden.
         */
        public ListOfUadpWriterGroupMessageDataType.Builder<_B> addUadpWriterGroupMessageDataType(final Iterable<? extends UadpWriterGroupMessageDataType> uadpWriterGroupMessageDataType) {
            if (uadpWriterGroupMessageDataType!= null) {
                if (this.uadpWriterGroupMessageDataType == null) {
                    this.uadpWriterGroupMessageDataType = new ArrayList<UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>>>();
                }
                for (UadpWriterGroupMessageDataType _item: uadpWriterGroupMessageDataType) {
                    this.uadpWriterGroupMessageDataType.add(new UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpWriterGroupMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpWriterGroupMessageDataType
         *     Neuer Wert der Eigenschaft "uadpWriterGroupMessageDataType".
         */
        public ListOfUadpWriterGroupMessageDataType.Builder<_B> withUadpWriterGroupMessageDataType(final Iterable<? extends UadpWriterGroupMessageDataType> uadpWriterGroupMessageDataType) {
            if (this.uadpWriterGroupMessageDataType!= null) {
                this.uadpWriterGroupMessageDataType.clear();
            }
            return addUadpWriterGroupMessageDataType(uadpWriterGroupMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "uadpWriterGroupMessageDataType" hinzu.
         * 
         * @param uadpWriterGroupMessageDataType
         *     Werte, die zur Eigenschaft "uadpWriterGroupMessageDataType" hinzugefügt werden.
         */
        public ListOfUadpWriterGroupMessageDataType.Builder<_B> addUadpWriterGroupMessageDataType(UadpWriterGroupMessageDataType... uadpWriterGroupMessageDataType) {
            addUadpWriterGroupMessageDataType(Arrays.asList(uadpWriterGroupMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "uadpWriterGroupMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param uadpWriterGroupMessageDataType
         *     Neuer Wert der Eigenschaft "uadpWriterGroupMessageDataType".
         */
        public ListOfUadpWriterGroupMessageDataType.Builder<_B> withUadpWriterGroupMessageDataType(UadpWriterGroupMessageDataType... uadpWriterGroupMessageDataType) {
            withUadpWriterGroupMessageDataType(Arrays.asList(uadpWriterGroupMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "UadpWriterGroupMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "UadpWriterGroupMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.UadpWriterGroupMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public UadpWriterGroupMessageDataType.Builder<? extends ListOfUadpWriterGroupMessageDataType.Builder<_B>> addUadpWriterGroupMessageDataType() {
            if (this.uadpWriterGroupMessageDataType == null) {
                this.uadpWriterGroupMessageDataType = new ArrayList<UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>>>();
            }
            final UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>> uadpWriterGroupMessageDataType_Builder = new UadpWriterGroupMessageDataType.Builder<ListOfUadpWriterGroupMessageDataType.Builder<_B>>(this, null, false);
            this.uadpWriterGroupMessageDataType.add(uadpWriterGroupMessageDataType_Builder);
            return uadpWriterGroupMessageDataType_Builder;
        }

        @Override
        public ListOfUadpWriterGroupMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfUadpWriterGroupMessageDataType());
            } else {
                return ((ListOfUadpWriterGroupMessageDataType) _storedValue);
            }
        }

        public ListOfUadpWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfUadpWriterGroupMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUadpWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfUadpWriterGroupMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUadpWriterGroupMessageDataType.Selector<ListOfUadpWriterGroupMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUadpWriterGroupMessageDataType.Select _root() {
            return new ListOfUadpWriterGroupMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private UadpWriterGroupMessageDataType.Selector<TRoot, ListOfUadpWriterGroupMessageDataType.Selector<TRoot, TParent>> uadpWriterGroupMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.uadpWriterGroupMessageDataType!= null) {
                products.put("uadpWriterGroupMessageDataType", this.uadpWriterGroupMessageDataType.init());
            }
            return products;
        }

        public UadpWriterGroupMessageDataType.Selector<TRoot, ListOfUadpWriterGroupMessageDataType.Selector<TRoot, TParent>> uadpWriterGroupMessageDataType() {
            return ((this.uadpWriterGroupMessageDataType == null)?this.uadpWriterGroupMessageDataType = new UadpWriterGroupMessageDataType.Selector<TRoot, ListOfUadpWriterGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "uadpWriterGroupMessageDataType"):this.uadpWriterGroupMessageDataType);
        }

    }

}
