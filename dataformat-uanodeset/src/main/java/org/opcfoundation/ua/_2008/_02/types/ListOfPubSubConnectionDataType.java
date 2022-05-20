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
 * <p>Java-Klasse für ListOfPubSubConnectionDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPubSubConnectionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PubSubConnectionDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PubSubConnectionDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPubSubConnectionDataType", propOrder = {
    "pubSubConnectionDataType"
})
public class ListOfPubSubConnectionDataType {

    @XmlElement(name = "PubSubConnectionDataType", nillable = true)
    protected List<PubSubConnectionDataType> pubSubConnectionDataType;

    /**
     * Gets the value of the pubSubConnectionDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubSubConnectionDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubSubConnectionDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PubSubConnectionDataType }
     * 
     * 
     */
    public List<PubSubConnectionDataType> getPubSubConnectionDataType() {
        if (pubSubConnectionDataType == null) {
            pubSubConnectionDataType = new ArrayList<PubSubConnectionDataType>();
        }
        return this.pubSubConnectionDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPubSubConnectionDataType.Builder<_B> _other) {
        if (this.pubSubConnectionDataType == null) {
            _other.pubSubConnectionDataType = null;
        } else {
            _other.pubSubConnectionDataType = new ArrayList<PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>>>();
            for (PubSubConnectionDataType _item: this.pubSubConnectionDataType) {
                _other.pubSubConnectionDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfPubSubConnectionDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPubSubConnectionDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPubSubConnectionDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPubSubConnectionDataType.Builder<Void> builder() {
        return new ListOfPubSubConnectionDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPubSubConnectionDataType.Builder<_B> copyOf(final ListOfPubSubConnectionDataType _other) {
        final ListOfPubSubConnectionDataType.Builder<_B> _newBuilder = new ListOfPubSubConnectionDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPubSubConnectionDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree pubSubConnectionDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubConnectionDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubConnectionDataTypePropertyTree!= null):((pubSubConnectionDataTypePropertyTree == null)||(!pubSubConnectionDataTypePropertyTree.isLeaf())))) {
            if (this.pubSubConnectionDataType == null) {
                _other.pubSubConnectionDataType = null;
            } else {
                _other.pubSubConnectionDataType = new ArrayList<PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>>>();
                for (PubSubConnectionDataType _item: this.pubSubConnectionDataType) {
                    _other.pubSubConnectionDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, pubSubConnectionDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfPubSubConnectionDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPubSubConnectionDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPubSubConnectionDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPubSubConnectionDataType.Builder<_B> copyOf(final ListOfPubSubConnectionDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPubSubConnectionDataType.Builder<_B> _newBuilder = new ListOfPubSubConnectionDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPubSubConnectionDataType.Builder<Void> copyExcept(final ListOfPubSubConnectionDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPubSubConnectionDataType.Builder<Void> copyOnly(final ListOfPubSubConnectionDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPubSubConnectionDataType _storedValue;
        private List<PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>>> pubSubConnectionDataType;

        public Builder(final _B _parentBuilder, final ListOfPubSubConnectionDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.pubSubConnectionDataType == null) {
                        this.pubSubConnectionDataType = null;
                    } else {
                        this.pubSubConnectionDataType = new ArrayList<PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>>>();
                        for (PubSubConnectionDataType _item: _other.pubSubConnectionDataType) {
                            this.pubSubConnectionDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPubSubConnectionDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree pubSubConnectionDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubConnectionDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubConnectionDataTypePropertyTree!= null):((pubSubConnectionDataTypePropertyTree == null)||(!pubSubConnectionDataTypePropertyTree.isLeaf())))) {
                        if (_other.pubSubConnectionDataType == null) {
                            this.pubSubConnectionDataType = null;
                        } else {
                            this.pubSubConnectionDataType = new ArrayList<PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>>>();
                            for (PubSubConnectionDataType _item: _other.pubSubConnectionDataType) {
                                this.pubSubConnectionDataType.add(((_item == null)?null:_item.newCopyBuilder(this, pubSubConnectionDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfPubSubConnectionDataType >_P init(final _P _product) {
            if (this.pubSubConnectionDataType!= null) {
                final List<PubSubConnectionDataType> pubSubConnectionDataType = new ArrayList<PubSubConnectionDataType>(this.pubSubConnectionDataType.size());
                for (PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>> _item: this.pubSubConnectionDataType) {
                    pubSubConnectionDataType.add(_item.build());
                }
                _product.pubSubConnectionDataType = pubSubConnectionDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubConnectionDataType" hinzu.
         * 
         * @param pubSubConnectionDataType
         *     Werte, die zur Eigenschaft "pubSubConnectionDataType" hinzugefügt werden.
         */
        public ListOfPubSubConnectionDataType.Builder<_B> addPubSubConnectionDataType(final Iterable<? extends PubSubConnectionDataType> pubSubConnectionDataType) {
            if (pubSubConnectionDataType!= null) {
                if (this.pubSubConnectionDataType == null) {
                    this.pubSubConnectionDataType = new ArrayList<PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>>>();
                }
                for (PubSubConnectionDataType _item: pubSubConnectionDataType) {
                    this.pubSubConnectionDataType.add(new PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubConnectionDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param pubSubConnectionDataType
         *     Neuer Wert der Eigenschaft "pubSubConnectionDataType".
         */
        public ListOfPubSubConnectionDataType.Builder<_B> withPubSubConnectionDataType(final Iterable<? extends PubSubConnectionDataType> pubSubConnectionDataType) {
            if (this.pubSubConnectionDataType!= null) {
                this.pubSubConnectionDataType.clear();
            }
            return addPubSubConnectionDataType(pubSubConnectionDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubConnectionDataType" hinzu.
         * 
         * @param pubSubConnectionDataType
         *     Werte, die zur Eigenschaft "pubSubConnectionDataType" hinzugefügt werden.
         */
        public ListOfPubSubConnectionDataType.Builder<_B> addPubSubConnectionDataType(PubSubConnectionDataType... pubSubConnectionDataType) {
            addPubSubConnectionDataType(Arrays.asList(pubSubConnectionDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubConnectionDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param pubSubConnectionDataType
         *     Neuer Wert der Eigenschaft "pubSubConnectionDataType".
         */
        public ListOfPubSubConnectionDataType.Builder<_B> withPubSubConnectionDataType(PubSubConnectionDataType... pubSubConnectionDataType) {
            withPubSubConnectionDataType(Arrays.asList(pubSubConnectionDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "PubSubConnectionDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "PubSubConnectionDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.PubSubConnectionDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public PubSubConnectionDataType.Builder<? extends ListOfPubSubConnectionDataType.Builder<_B>> addPubSubConnectionDataType() {
            if (this.pubSubConnectionDataType == null) {
                this.pubSubConnectionDataType = new ArrayList<PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>>>();
            }
            final PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>> pubSubConnectionDataType_Builder = new PubSubConnectionDataType.Builder<ListOfPubSubConnectionDataType.Builder<_B>>(this, null, false);
            this.pubSubConnectionDataType.add(pubSubConnectionDataType_Builder);
            return pubSubConnectionDataType_Builder;
        }

        @Override
        public ListOfPubSubConnectionDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfPubSubConnectionDataType());
            } else {
                return ((ListOfPubSubConnectionDataType) _storedValue);
            }
        }

        public ListOfPubSubConnectionDataType.Builder<_B> copyOf(final ListOfPubSubConnectionDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPubSubConnectionDataType.Builder<_B> copyOf(final ListOfPubSubConnectionDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPubSubConnectionDataType.Selector<ListOfPubSubConnectionDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPubSubConnectionDataType.Select _root() {
            return new ListOfPubSubConnectionDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private PubSubConnectionDataType.Selector<TRoot, ListOfPubSubConnectionDataType.Selector<TRoot, TParent>> pubSubConnectionDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.pubSubConnectionDataType!= null) {
                products.put("pubSubConnectionDataType", this.pubSubConnectionDataType.init());
            }
            return products;
        }

        public PubSubConnectionDataType.Selector<TRoot, ListOfPubSubConnectionDataType.Selector<TRoot, TParent>> pubSubConnectionDataType() {
            return ((this.pubSubConnectionDataType == null)?this.pubSubConnectionDataType = new PubSubConnectionDataType.Selector<TRoot, ListOfPubSubConnectionDataType.Selector<TRoot, TParent>>(this._root, this, "pubSubConnectionDataType"):this.pubSubConnectionDataType);
        }

    }

}
