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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfPubSubState complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPubSubState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PubSubState" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PubSubState" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPubSubState", propOrder = {
    "pubSubState"
})
public class ListOfPubSubState {

    @XmlElement(name = "PubSubState")
    @XmlSchemaType(name = "string")
    protected List<PubSubState> pubSubState;

    /**
     * Gets the value of the pubSubState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubSubState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubSubState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PubSubState }
     * 
     * 
     */
    public List<PubSubState> getPubSubState() {
        if (pubSubState == null) {
            pubSubState = new ArrayList<PubSubState>();
        }
        return this.pubSubState;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPubSubState.Builder<_B> _other) {
        if (this.pubSubState == null) {
            _other.pubSubState = null;
        } else {
            _other.pubSubState = new ArrayList<Buildable>();
            for (PubSubState _item: this.pubSubState) {
                _other.pubSubState.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfPubSubState.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPubSubState.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPubSubState.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPubSubState.Builder<Void> builder() {
        return new ListOfPubSubState.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPubSubState.Builder<_B> copyOf(final ListOfPubSubState _other) {
        final ListOfPubSubState.Builder<_B> _newBuilder = new ListOfPubSubState.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPubSubState.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree pubSubStatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubState"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubStatePropertyTree!= null):((pubSubStatePropertyTree == null)||(!pubSubStatePropertyTree.isLeaf())))) {
            if (this.pubSubState == null) {
                _other.pubSubState = null;
            } else {
                _other.pubSubState = new ArrayList<Buildable>();
                for (PubSubState _item: this.pubSubState) {
                    _other.pubSubState.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfPubSubState.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPubSubState.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPubSubState.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPubSubState.Builder<_B> copyOf(final ListOfPubSubState _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPubSubState.Builder<_B> _newBuilder = new ListOfPubSubState.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPubSubState.Builder<Void> copyExcept(final ListOfPubSubState _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPubSubState.Builder<Void> copyOnly(final ListOfPubSubState _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPubSubState _storedValue;
        private List<Buildable> pubSubState;

        public Builder(final _B _parentBuilder, final ListOfPubSubState _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.pubSubState == null) {
                        this.pubSubState = null;
                    } else {
                        this.pubSubState = new ArrayList<Buildable>();
                        for (PubSubState _item: _other.pubSubState) {
                            this.pubSubState.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPubSubState _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree pubSubStatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubState"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubStatePropertyTree!= null):((pubSubStatePropertyTree == null)||(!pubSubStatePropertyTree.isLeaf())))) {
                        if (_other.pubSubState == null) {
                            this.pubSubState = null;
                        } else {
                            this.pubSubState = new ArrayList<Buildable>();
                            for (PubSubState _item: _other.pubSubState) {
                                this.pubSubState.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfPubSubState >_P init(final _P _product) {
            if (this.pubSubState!= null) {
                final List<PubSubState> pubSubState = new ArrayList<PubSubState>(this.pubSubState.size());
                for (Buildable _item: this.pubSubState) {
                    pubSubState.add(((PubSubState) _item.build()));
                }
                _product.pubSubState = pubSubState;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubState" hinzu.
         * 
         * @param pubSubState
         *     Werte, die zur Eigenschaft "pubSubState" hinzugefügt werden.
         */
        public ListOfPubSubState.Builder<_B> addPubSubState(final Iterable<? extends PubSubState> pubSubState) {
            if (pubSubState!= null) {
                if (this.pubSubState == null) {
                    this.pubSubState = new ArrayList<Buildable>();
                }
                for (PubSubState _item: pubSubState) {
                    this.pubSubState.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubState" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param pubSubState
         *     Neuer Wert der Eigenschaft "pubSubState".
         */
        public ListOfPubSubState.Builder<_B> withPubSubState(final Iterable<? extends PubSubState> pubSubState) {
            if (this.pubSubState!= null) {
                this.pubSubState.clear();
            }
            return addPubSubState(pubSubState);
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubState" hinzu.
         * 
         * @param pubSubState
         *     Werte, die zur Eigenschaft "pubSubState" hinzugefügt werden.
         */
        public ListOfPubSubState.Builder<_B> addPubSubState(PubSubState... pubSubState) {
            addPubSubState(Arrays.asList(pubSubState));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubState" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param pubSubState
         *     Neuer Wert der Eigenschaft "pubSubState".
         */
        public ListOfPubSubState.Builder<_B> withPubSubState(PubSubState... pubSubState) {
            withPubSubState(Arrays.asList(pubSubState));
            return this;
        }

        @Override
        public ListOfPubSubState build() {
            if (_storedValue == null) {
                return this.init(new ListOfPubSubState());
            } else {
                return ((ListOfPubSubState) _storedValue);
            }
        }

        public ListOfPubSubState.Builder<_B> copyOf(final ListOfPubSubState _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPubSubState.Builder<_B> copyOf(final ListOfPubSubState.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPubSubState.Selector<ListOfPubSubState.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPubSubState.Select _root() {
            return new ListOfPubSubState.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfPubSubState.Selector<TRoot, TParent>> pubSubState = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.pubSubState!= null) {
                products.put("pubSubState", this.pubSubState.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfPubSubState.Selector<TRoot, TParent>> pubSubState() {
            return ((this.pubSubState == null)?this.pubSubState = new com.kscs.util.jaxb.Selector<TRoot, ListOfPubSubState.Selector<TRoot, TParent>>(this._root, this, "pubSubState"):this.pubSubState);
        }

    }

}
