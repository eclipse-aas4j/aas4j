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
 * <p>Java-Klasse für ListOfPubSubConfigurationDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPubSubConfigurationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PubSubConfigurationDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PubSubConfigurationDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPubSubConfigurationDataType", propOrder = {
    "pubSubConfigurationDataType"
})
public class ListOfPubSubConfigurationDataType {

    @XmlElement(name = "PubSubConfigurationDataType", nillable = true)
    protected List<PubSubConfigurationDataType> pubSubConfigurationDataType;

    /**
     * Gets the value of the pubSubConfigurationDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubSubConfigurationDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubSubConfigurationDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PubSubConfigurationDataType }
     * 
     * 
     */
    public List<PubSubConfigurationDataType> getPubSubConfigurationDataType() {
        if (pubSubConfigurationDataType == null) {
            pubSubConfigurationDataType = new ArrayList<PubSubConfigurationDataType>();
        }
        return this.pubSubConfigurationDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPubSubConfigurationDataType.Builder<_B> _other) {
        if (this.pubSubConfigurationDataType == null) {
            _other.pubSubConfigurationDataType = null;
        } else {
            _other.pubSubConfigurationDataType = new ArrayList<PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>>>();
            for (PubSubConfigurationDataType _item: this.pubSubConfigurationDataType) {
                _other.pubSubConfigurationDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfPubSubConfigurationDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPubSubConfigurationDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPubSubConfigurationDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPubSubConfigurationDataType.Builder<Void> builder() {
        return new ListOfPubSubConfigurationDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPubSubConfigurationDataType.Builder<_B> copyOf(final ListOfPubSubConfigurationDataType _other) {
        final ListOfPubSubConfigurationDataType.Builder<_B> _newBuilder = new ListOfPubSubConfigurationDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPubSubConfigurationDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree pubSubConfigurationDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubConfigurationDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubConfigurationDataTypePropertyTree!= null):((pubSubConfigurationDataTypePropertyTree == null)||(!pubSubConfigurationDataTypePropertyTree.isLeaf())))) {
            if (this.pubSubConfigurationDataType == null) {
                _other.pubSubConfigurationDataType = null;
            } else {
                _other.pubSubConfigurationDataType = new ArrayList<PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>>>();
                for (PubSubConfigurationDataType _item: this.pubSubConfigurationDataType) {
                    _other.pubSubConfigurationDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, pubSubConfigurationDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfPubSubConfigurationDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPubSubConfigurationDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPubSubConfigurationDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPubSubConfigurationDataType.Builder<_B> copyOf(final ListOfPubSubConfigurationDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPubSubConfigurationDataType.Builder<_B> _newBuilder = new ListOfPubSubConfigurationDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPubSubConfigurationDataType.Builder<Void> copyExcept(final ListOfPubSubConfigurationDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPubSubConfigurationDataType.Builder<Void> copyOnly(final ListOfPubSubConfigurationDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPubSubConfigurationDataType _storedValue;
        private List<PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>>> pubSubConfigurationDataType;

        public Builder(final _B _parentBuilder, final ListOfPubSubConfigurationDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.pubSubConfigurationDataType == null) {
                        this.pubSubConfigurationDataType = null;
                    } else {
                        this.pubSubConfigurationDataType = new ArrayList<PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>>>();
                        for (PubSubConfigurationDataType _item: _other.pubSubConfigurationDataType) {
                            this.pubSubConfigurationDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPubSubConfigurationDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree pubSubConfigurationDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubConfigurationDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubConfigurationDataTypePropertyTree!= null):((pubSubConfigurationDataTypePropertyTree == null)||(!pubSubConfigurationDataTypePropertyTree.isLeaf())))) {
                        if (_other.pubSubConfigurationDataType == null) {
                            this.pubSubConfigurationDataType = null;
                        } else {
                            this.pubSubConfigurationDataType = new ArrayList<PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>>>();
                            for (PubSubConfigurationDataType _item: _other.pubSubConfigurationDataType) {
                                this.pubSubConfigurationDataType.add(((_item == null)?null:_item.newCopyBuilder(this, pubSubConfigurationDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfPubSubConfigurationDataType >_P init(final _P _product) {
            if (this.pubSubConfigurationDataType!= null) {
                final List<PubSubConfigurationDataType> pubSubConfigurationDataType = new ArrayList<PubSubConfigurationDataType>(this.pubSubConfigurationDataType.size());
                for (PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>> _item: this.pubSubConfigurationDataType) {
                    pubSubConfigurationDataType.add(_item.build());
                }
                _product.pubSubConfigurationDataType = pubSubConfigurationDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubConfigurationDataType" hinzu.
         * 
         * @param pubSubConfigurationDataType
         *     Werte, die zur Eigenschaft "pubSubConfigurationDataType" hinzugefügt werden.
         */
        public ListOfPubSubConfigurationDataType.Builder<_B> addPubSubConfigurationDataType(final Iterable<? extends PubSubConfigurationDataType> pubSubConfigurationDataType) {
            if (pubSubConfigurationDataType!= null) {
                if (this.pubSubConfigurationDataType == null) {
                    this.pubSubConfigurationDataType = new ArrayList<PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>>>();
                }
                for (PubSubConfigurationDataType _item: pubSubConfigurationDataType) {
                    this.pubSubConfigurationDataType.add(new PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubConfigurationDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param pubSubConfigurationDataType
         *     Neuer Wert der Eigenschaft "pubSubConfigurationDataType".
         */
        public ListOfPubSubConfigurationDataType.Builder<_B> withPubSubConfigurationDataType(final Iterable<? extends PubSubConfigurationDataType> pubSubConfigurationDataType) {
            if (this.pubSubConfigurationDataType!= null) {
                this.pubSubConfigurationDataType.clear();
            }
            return addPubSubConfigurationDataType(pubSubConfigurationDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubConfigurationDataType" hinzu.
         * 
         * @param pubSubConfigurationDataType
         *     Werte, die zur Eigenschaft "pubSubConfigurationDataType" hinzugefügt werden.
         */
        public ListOfPubSubConfigurationDataType.Builder<_B> addPubSubConfigurationDataType(PubSubConfigurationDataType... pubSubConfigurationDataType) {
            addPubSubConfigurationDataType(Arrays.asList(pubSubConfigurationDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubConfigurationDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param pubSubConfigurationDataType
         *     Neuer Wert der Eigenschaft "pubSubConfigurationDataType".
         */
        public ListOfPubSubConfigurationDataType.Builder<_B> withPubSubConfigurationDataType(PubSubConfigurationDataType... pubSubConfigurationDataType) {
            withPubSubConfigurationDataType(Arrays.asList(pubSubConfigurationDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "PubSubConfigurationDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "PubSubConfigurationDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.PubSubConfigurationDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public PubSubConfigurationDataType.Builder<? extends ListOfPubSubConfigurationDataType.Builder<_B>> addPubSubConfigurationDataType() {
            if (this.pubSubConfigurationDataType == null) {
                this.pubSubConfigurationDataType = new ArrayList<PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>>>();
            }
            final PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>> pubSubConfigurationDataType_Builder = new PubSubConfigurationDataType.Builder<ListOfPubSubConfigurationDataType.Builder<_B>>(this, null, false);
            this.pubSubConfigurationDataType.add(pubSubConfigurationDataType_Builder);
            return pubSubConfigurationDataType_Builder;
        }

        @Override
        public ListOfPubSubConfigurationDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfPubSubConfigurationDataType());
            } else {
                return ((ListOfPubSubConfigurationDataType) _storedValue);
            }
        }

        public ListOfPubSubConfigurationDataType.Builder<_B> copyOf(final ListOfPubSubConfigurationDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPubSubConfigurationDataType.Builder<_B> copyOf(final ListOfPubSubConfigurationDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPubSubConfigurationDataType.Selector<ListOfPubSubConfigurationDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPubSubConfigurationDataType.Select _root() {
            return new ListOfPubSubConfigurationDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private PubSubConfigurationDataType.Selector<TRoot, ListOfPubSubConfigurationDataType.Selector<TRoot, TParent>> pubSubConfigurationDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.pubSubConfigurationDataType!= null) {
                products.put("pubSubConfigurationDataType", this.pubSubConfigurationDataType.init());
            }
            return products;
        }

        public PubSubConfigurationDataType.Selector<TRoot, ListOfPubSubConfigurationDataType.Selector<TRoot, TParent>> pubSubConfigurationDataType() {
            return ((this.pubSubConfigurationDataType == null)?this.pubSubConfigurationDataType = new PubSubConfigurationDataType.Selector<TRoot, ListOfPubSubConfigurationDataType.Selector<TRoot, TParent>>(this._root, this, "pubSubConfigurationDataType"):this.pubSubConfigurationDataType);
        }

    }

}
