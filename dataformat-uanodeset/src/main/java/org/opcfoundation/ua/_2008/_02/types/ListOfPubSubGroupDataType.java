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
 * <p>Java-Klasse für ListOfPubSubGroupDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPubSubGroupDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PubSubGroupDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PubSubGroupDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPubSubGroupDataType", propOrder = {
    "pubSubGroupDataType"
})
public class ListOfPubSubGroupDataType {

    @XmlElement(name = "PubSubGroupDataType", nillable = true)
    protected List<PubSubGroupDataType> pubSubGroupDataType;

    /**
     * Gets the value of the pubSubGroupDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubSubGroupDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubSubGroupDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PubSubGroupDataType }
     * 
     * 
     */
    public List<PubSubGroupDataType> getPubSubGroupDataType() {
        if (pubSubGroupDataType == null) {
            pubSubGroupDataType = new ArrayList<PubSubGroupDataType>();
        }
        return this.pubSubGroupDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPubSubGroupDataType.Builder<_B> _other) {
        if (this.pubSubGroupDataType == null) {
            _other.pubSubGroupDataType = null;
        } else {
            _other.pubSubGroupDataType = new ArrayList<PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>>>();
            for (PubSubGroupDataType _item: this.pubSubGroupDataType) {
                _other.pubSubGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfPubSubGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPubSubGroupDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPubSubGroupDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPubSubGroupDataType.Builder<Void> builder() {
        return new ListOfPubSubGroupDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPubSubGroupDataType.Builder<_B> copyOf(final ListOfPubSubGroupDataType _other) {
        final ListOfPubSubGroupDataType.Builder<_B> _newBuilder = new ListOfPubSubGroupDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPubSubGroupDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree pubSubGroupDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubGroupDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubGroupDataTypePropertyTree!= null):((pubSubGroupDataTypePropertyTree == null)||(!pubSubGroupDataTypePropertyTree.isLeaf())))) {
            if (this.pubSubGroupDataType == null) {
                _other.pubSubGroupDataType = null;
            } else {
                _other.pubSubGroupDataType = new ArrayList<PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>>>();
                for (PubSubGroupDataType _item: this.pubSubGroupDataType) {
                    _other.pubSubGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, pubSubGroupDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfPubSubGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPubSubGroupDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPubSubGroupDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPubSubGroupDataType.Builder<_B> copyOf(final ListOfPubSubGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPubSubGroupDataType.Builder<_B> _newBuilder = new ListOfPubSubGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPubSubGroupDataType.Builder<Void> copyExcept(final ListOfPubSubGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPubSubGroupDataType.Builder<Void> copyOnly(final ListOfPubSubGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPubSubGroupDataType _storedValue;
        private List<PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>>> pubSubGroupDataType;

        public Builder(final _B _parentBuilder, final ListOfPubSubGroupDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.pubSubGroupDataType == null) {
                        this.pubSubGroupDataType = null;
                    } else {
                        this.pubSubGroupDataType = new ArrayList<PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>>>();
                        for (PubSubGroupDataType _item: _other.pubSubGroupDataType) {
                            this.pubSubGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPubSubGroupDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree pubSubGroupDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubGroupDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubGroupDataTypePropertyTree!= null):((pubSubGroupDataTypePropertyTree == null)||(!pubSubGroupDataTypePropertyTree.isLeaf())))) {
                        if (_other.pubSubGroupDataType == null) {
                            this.pubSubGroupDataType = null;
                        } else {
                            this.pubSubGroupDataType = new ArrayList<PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>>>();
                            for (PubSubGroupDataType _item: _other.pubSubGroupDataType) {
                                this.pubSubGroupDataType.add(((_item == null)?null:_item.newCopyBuilder(this, pubSubGroupDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfPubSubGroupDataType >_P init(final _P _product) {
            if (this.pubSubGroupDataType!= null) {
                final List<PubSubGroupDataType> pubSubGroupDataType = new ArrayList<PubSubGroupDataType>(this.pubSubGroupDataType.size());
                for (PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>> _item: this.pubSubGroupDataType) {
                    pubSubGroupDataType.add(_item.build());
                }
                _product.pubSubGroupDataType = pubSubGroupDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubGroupDataType" hinzu.
         * 
         * @param pubSubGroupDataType
         *     Werte, die zur Eigenschaft "pubSubGroupDataType" hinzugefügt werden.
         */
        public ListOfPubSubGroupDataType.Builder<_B> addPubSubGroupDataType(final Iterable<? extends PubSubGroupDataType> pubSubGroupDataType) {
            if (pubSubGroupDataType!= null) {
                if (this.pubSubGroupDataType == null) {
                    this.pubSubGroupDataType = new ArrayList<PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>>>();
                }
                for (PubSubGroupDataType _item: pubSubGroupDataType) {
                    this.pubSubGroupDataType.add(new PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubGroupDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param pubSubGroupDataType
         *     Neuer Wert der Eigenschaft "pubSubGroupDataType".
         */
        public ListOfPubSubGroupDataType.Builder<_B> withPubSubGroupDataType(final Iterable<? extends PubSubGroupDataType> pubSubGroupDataType) {
            if (this.pubSubGroupDataType!= null) {
                this.pubSubGroupDataType.clear();
            }
            return addPubSubGroupDataType(pubSubGroupDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubGroupDataType" hinzu.
         * 
         * @param pubSubGroupDataType
         *     Werte, die zur Eigenschaft "pubSubGroupDataType" hinzugefügt werden.
         */
        public ListOfPubSubGroupDataType.Builder<_B> addPubSubGroupDataType(PubSubGroupDataType... pubSubGroupDataType) {
            addPubSubGroupDataType(Arrays.asList(pubSubGroupDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubGroupDataType" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param pubSubGroupDataType
         *     Neuer Wert der Eigenschaft "pubSubGroupDataType".
         */
        public ListOfPubSubGroupDataType.Builder<_B> withPubSubGroupDataType(PubSubGroupDataType... pubSubGroupDataType) {
            withPubSubGroupDataType(Arrays.asList(pubSubGroupDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "PubSubGroupDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.PubSubGroupDataType.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "PubSubGroupDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.PubSubGroupDataType.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public PubSubGroupDataType.Builder<? extends ListOfPubSubGroupDataType.Builder<_B>> addPubSubGroupDataType() {
            if (this.pubSubGroupDataType == null) {
                this.pubSubGroupDataType = new ArrayList<PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>>>();
            }
            final PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>> pubSubGroupDataType_Builder = new PubSubGroupDataType.Builder<ListOfPubSubGroupDataType.Builder<_B>>(this, null, false);
            this.pubSubGroupDataType.add(pubSubGroupDataType_Builder);
            return pubSubGroupDataType_Builder;
        }

        @Override
        public ListOfPubSubGroupDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfPubSubGroupDataType());
            } else {
                return ((ListOfPubSubGroupDataType) _storedValue);
            }
        }

        public ListOfPubSubGroupDataType.Builder<_B> copyOf(final ListOfPubSubGroupDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPubSubGroupDataType.Builder<_B> copyOf(final ListOfPubSubGroupDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPubSubGroupDataType.Selector<ListOfPubSubGroupDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPubSubGroupDataType.Select _root() {
            return new ListOfPubSubGroupDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private PubSubGroupDataType.Selector<TRoot, ListOfPubSubGroupDataType.Selector<TRoot, TParent>> pubSubGroupDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.pubSubGroupDataType!= null) {
                products.put("pubSubGroupDataType", this.pubSubGroupDataType.init());
            }
            return products;
        }

        public PubSubGroupDataType.Selector<TRoot, ListOfPubSubGroupDataType.Selector<TRoot, TParent>> pubSubGroupDataType() {
            return ((this.pubSubGroupDataType == null)?this.pubSubGroupDataType = new PubSubGroupDataType.Selector<TRoot, ListOfPubSubGroupDataType.Selector<TRoot, TParent>>(this._root, this, "pubSubGroupDataType"):this.pubSubGroupDataType);
        }

    }

}
