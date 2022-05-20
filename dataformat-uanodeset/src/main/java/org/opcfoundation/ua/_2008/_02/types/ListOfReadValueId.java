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
 * <p>Java-Klasse für ListOfReadValueId complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfReadValueId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadValueId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ReadValueId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfReadValueId", propOrder = {
    "readValueId"
})
public class ListOfReadValueId {

    @XmlElement(name = "ReadValueId", nillable = true)
    protected List<ReadValueId> readValueId;

    /**
     * Gets the value of the readValueId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readValueId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadValueId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadValueId }
     * 
     * 
     */
    public List<ReadValueId> getReadValueId() {
        if (readValueId == null) {
            readValueId = new ArrayList<ReadValueId>();
        }
        return this.readValueId;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfReadValueId.Builder<_B> _other) {
        if (this.readValueId == null) {
            _other.readValueId = null;
        } else {
            _other.readValueId = new ArrayList<ReadValueId.Builder<ListOfReadValueId.Builder<_B>>>();
            for (ReadValueId _item: this.readValueId) {
                _other.readValueId.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfReadValueId.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfReadValueId.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfReadValueId.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfReadValueId.Builder<Void> builder() {
        return new ListOfReadValueId.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfReadValueId.Builder<_B> copyOf(final ListOfReadValueId _other) {
        final ListOfReadValueId.Builder<_B> _newBuilder = new ListOfReadValueId.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfReadValueId.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree readValueIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readValueId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readValueIdPropertyTree!= null):((readValueIdPropertyTree == null)||(!readValueIdPropertyTree.isLeaf())))) {
            if (this.readValueId == null) {
                _other.readValueId = null;
            } else {
                _other.readValueId = new ArrayList<ReadValueId.Builder<ListOfReadValueId.Builder<_B>>>();
                for (ReadValueId _item: this.readValueId) {
                    _other.readValueId.add(((_item == null)?null:_item.newCopyBuilder(_other, readValueIdPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfReadValueId.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfReadValueId.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfReadValueId.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfReadValueId.Builder<_B> copyOf(final ListOfReadValueId _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfReadValueId.Builder<_B> _newBuilder = new ListOfReadValueId.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfReadValueId.Builder<Void> copyExcept(final ListOfReadValueId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfReadValueId.Builder<Void> copyOnly(final ListOfReadValueId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfReadValueId _storedValue;
        private List<ReadValueId.Builder<ListOfReadValueId.Builder<_B>>> readValueId;

        public Builder(final _B _parentBuilder, final ListOfReadValueId _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.readValueId == null) {
                        this.readValueId = null;
                    } else {
                        this.readValueId = new ArrayList<ReadValueId.Builder<ListOfReadValueId.Builder<_B>>>();
                        for (ReadValueId _item: _other.readValueId) {
                            this.readValueId.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfReadValueId _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree readValueIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readValueId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readValueIdPropertyTree!= null):((readValueIdPropertyTree == null)||(!readValueIdPropertyTree.isLeaf())))) {
                        if (_other.readValueId == null) {
                            this.readValueId = null;
                        } else {
                            this.readValueId = new ArrayList<ReadValueId.Builder<ListOfReadValueId.Builder<_B>>>();
                            for (ReadValueId _item: _other.readValueId) {
                                this.readValueId.add(((_item == null)?null:_item.newCopyBuilder(this, readValueIdPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfReadValueId >_P init(final _P _product) {
            if (this.readValueId!= null) {
                final List<ReadValueId> readValueId = new ArrayList<ReadValueId>(this.readValueId.size());
                for (ReadValueId.Builder<ListOfReadValueId.Builder<_B>> _item: this.readValueId) {
                    readValueId.add(_item.build());
                }
                _product.readValueId = readValueId;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "readValueId" hinzu.
         * 
         * @param readValueId
         *     Werte, die zur Eigenschaft "readValueId" hinzugefügt werden.
         */
        public ListOfReadValueId.Builder<_B> addReadValueId(final Iterable<? extends ReadValueId> readValueId) {
            if (readValueId!= null) {
                if (this.readValueId == null) {
                    this.readValueId = new ArrayList<ReadValueId.Builder<ListOfReadValueId.Builder<_B>>>();
                }
                for (ReadValueId _item: readValueId) {
                    this.readValueId.add(new ReadValueId.Builder<ListOfReadValueId.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readValueId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param readValueId
         *     Neuer Wert der Eigenschaft "readValueId".
         */
        public ListOfReadValueId.Builder<_B> withReadValueId(final Iterable<? extends ReadValueId> readValueId) {
            if (this.readValueId!= null) {
                this.readValueId.clear();
            }
            return addReadValueId(readValueId);
        }

        /**
         * Fügt Werte zur Eigenschaft "readValueId" hinzu.
         * 
         * @param readValueId
         *     Werte, die zur Eigenschaft "readValueId" hinzugefügt werden.
         */
        public ListOfReadValueId.Builder<_B> addReadValueId(ReadValueId... readValueId) {
            addReadValueId(Arrays.asList(readValueId));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readValueId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param readValueId
         *     Neuer Wert der Eigenschaft "readValueId".
         */
        public ListOfReadValueId.Builder<_B> withReadValueId(ReadValueId... readValueId) {
            withReadValueId(Arrays.asList(readValueId));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ReadValueId".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ReadValueId.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ReadValueId".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ReadValueId.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public ReadValueId.Builder<? extends ListOfReadValueId.Builder<_B>> addReadValueId() {
            if (this.readValueId == null) {
                this.readValueId = new ArrayList<ReadValueId.Builder<ListOfReadValueId.Builder<_B>>>();
            }
            final ReadValueId.Builder<ListOfReadValueId.Builder<_B>> readValueId_Builder = new ReadValueId.Builder<ListOfReadValueId.Builder<_B>>(this, null, false);
            this.readValueId.add(readValueId_Builder);
            return readValueId_Builder;
        }

        @Override
        public ListOfReadValueId build() {
            if (_storedValue == null) {
                return this.init(new ListOfReadValueId());
            } else {
                return ((ListOfReadValueId) _storedValue);
            }
        }

        public ListOfReadValueId.Builder<_B> copyOf(final ListOfReadValueId _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfReadValueId.Builder<_B> copyOf(final ListOfReadValueId.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfReadValueId.Selector<ListOfReadValueId.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfReadValueId.Select _root() {
            return new ListOfReadValueId.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ReadValueId.Selector<TRoot, ListOfReadValueId.Selector<TRoot, TParent>> readValueId = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.readValueId!= null) {
                products.put("readValueId", this.readValueId.init());
            }
            return products;
        }

        public ReadValueId.Selector<TRoot, ListOfReadValueId.Selector<TRoot, TParent>> readValueId() {
            return ((this.readValueId == null)?this.readValueId = new ReadValueId.Selector<TRoot, ListOfReadValueId.Selector<TRoot, TParent>>(this._root, this, "readValueId"):this.readValueId);
        }

    }

}
