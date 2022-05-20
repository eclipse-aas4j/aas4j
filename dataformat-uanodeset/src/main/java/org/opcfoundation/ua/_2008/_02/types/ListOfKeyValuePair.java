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
 * <p>Java-Klasse für ListOfKeyValuePair complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfKeyValuePair"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValuePair" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfKeyValuePair", propOrder = {
    "keyValuePair"
})
public class ListOfKeyValuePair {

    @XmlElement(name = "KeyValuePair", nillable = true)
    protected List<KeyValuePair> keyValuePair;

    /**
     * Gets the value of the keyValuePair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePair }
     * 
     * 
     */
    public List<KeyValuePair> getKeyValuePair() {
        if (keyValuePair == null) {
            keyValuePair = new ArrayList<KeyValuePair>();
        }
        return this.keyValuePair;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfKeyValuePair.Builder<_B> _other) {
        if (this.keyValuePair == null) {
            _other.keyValuePair = null;
        } else {
            _other.keyValuePair = new ArrayList<KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>>>();
            for (KeyValuePair _item: this.keyValuePair) {
                _other.keyValuePair.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfKeyValuePair.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfKeyValuePair.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfKeyValuePair.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfKeyValuePair.Builder<Void> builder() {
        return new ListOfKeyValuePair.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfKeyValuePair.Builder<_B> copyOf(final ListOfKeyValuePair _other) {
        final ListOfKeyValuePair.Builder<_B> _newBuilder = new ListOfKeyValuePair.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfKeyValuePair.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree keyValuePairPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("keyValuePair"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keyValuePairPropertyTree!= null):((keyValuePairPropertyTree == null)||(!keyValuePairPropertyTree.isLeaf())))) {
            if (this.keyValuePair == null) {
                _other.keyValuePair = null;
            } else {
                _other.keyValuePair = new ArrayList<KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>>>();
                for (KeyValuePair _item: this.keyValuePair) {
                    _other.keyValuePair.add(((_item == null)?null:_item.newCopyBuilder(_other, keyValuePairPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfKeyValuePair.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfKeyValuePair.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfKeyValuePair.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfKeyValuePair.Builder<_B> copyOf(final ListOfKeyValuePair _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfKeyValuePair.Builder<_B> _newBuilder = new ListOfKeyValuePair.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfKeyValuePair.Builder<Void> copyExcept(final ListOfKeyValuePair _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfKeyValuePair.Builder<Void> copyOnly(final ListOfKeyValuePair _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfKeyValuePair _storedValue;
        private List<KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>>> keyValuePair;

        public Builder(final _B _parentBuilder, final ListOfKeyValuePair _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.keyValuePair == null) {
                        this.keyValuePair = null;
                    } else {
                        this.keyValuePair = new ArrayList<KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>>>();
                        for (KeyValuePair _item: _other.keyValuePair) {
                            this.keyValuePair.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfKeyValuePair _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree keyValuePairPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("keyValuePair"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keyValuePairPropertyTree!= null):((keyValuePairPropertyTree == null)||(!keyValuePairPropertyTree.isLeaf())))) {
                        if (_other.keyValuePair == null) {
                            this.keyValuePair = null;
                        } else {
                            this.keyValuePair = new ArrayList<KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>>>();
                            for (KeyValuePair _item: _other.keyValuePair) {
                                this.keyValuePair.add(((_item == null)?null:_item.newCopyBuilder(this, keyValuePairPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfKeyValuePair >_P init(final _P _product) {
            if (this.keyValuePair!= null) {
                final List<KeyValuePair> keyValuePair = new ArrayList<KeyValuePair>(this.keyValuePair.size());
                for (KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>> _item: this.keyValuePair) {
                    keyValuePair.add(_item.build());
                }
                _product.keyValuePair = keyValuePair;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "keyValuePair" hinzu.
         * 
         * @param keyValuePair
         *     Werte, die zur Eigenschaft "keyValuePair" hinzugefügt werden.
         */
        public ListOfKeyValuePair.Builder<_B> addKeyValuePair(final Iterable<? extends KeyValuePair> keyValuePair) {
            if (keyValuePair!= null) {
                if (this.keyValuePair == null) {
                    this.keyValuePair = new ArrayList<KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>>>();
                }
                for (KeyValuePair _item: keyValuePair) {
                    this.keyValuePair.add(new KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "keyValuePair" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param keyValuePair
         *     Neuer Wert der Eigenschaft "keyValuePair".
         */
        public ListOfKeyValuePair.Builder<_B> withKeyValuePair(final Iterable<? extends KeyValuePair> keyValuePair) {
            if (this.keyValuePair!= null) {
                this.keyValuePair.clear();
            }
            return addKeyValuePair(keyValuePair);
        }

        /**
         * Fügt Werte zur Eigenschaft "keyValuePair" hinzu.
         * 
         * @param keyValuePair
         *     Werte, die zur Eigenschaft "keyValuePair" hinzugefügt werden.
         */
        public ListOfKeyValuePair.Builder<_B> addKeyValuePair(KeyValuePair... keyValuePair) {
            addKeyValuePair(Arrays.asList(keyValuePair));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "keyValuePair" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param keyValuePair
         *     Neuer Wert der Eigenschaft "keyValuePair".
         */
        public ListOfKeyValuePair.Builder<_B> withKeyValuePair(KeyValuePair... keyValuePair) {
            withKeyValuePair(Arrays.asList(keyValuePair));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "KeyValuePair".
         * Mit {@link org.opcfoundation.ua._2008._02.types.KeyValuePair.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "KeyValuePair".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.KeyValuePair.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public KeyValuePair.Builder<? extends ListOfKeyValuePair.Builder<_B>> addKeyValuePair() {
            if (this.keyValuePair == null) {
                this.keyValuePair = new ArrayList<KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>>>();
            }
            final KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>> keyValuePair_Builder = new KeyValuePair.Builder<ListOfKeyValuePair.Builder<_B>>(this, null, false);
            this.keyValuePair.add(keyValuePair_Builder);
            return keyValuePair_Builder;
        }

        @Override
        public ListOfKeyValuePair build() {
            if (_storedValue == null) {
                return this.init(new ListOfKeyValuePair());
            } else {
                return ((ListOfKeyValuePair) _storedValue);
            }
        }

        public ListOfKeyValuePair.Builder<_B> copyOf(final ListOfKeyValuePair _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfKeyValuePair.Builder<_B> copyOf(final ListOfKeyValuePair.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfKeyValuePair.Selector<ListOfKeyValuePair.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfKeyValuePair.Select _root() {
            return new ListOfKeyValuePair.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private KeyValuePair.Selector<TRoot, ListOfKeyValuePair.Selector<TRoot, TParent>> keyValuePair = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.keyValuePair!= null) {
                products.put("keyValuePair", this.keyValuePair.init());
            }
            return products;
        }

        public KeyValuePair.Selector<TRoot, ListOfKeyValuePair.Selector<TRoot, TParent>> keyValuePair() {
            return ((this.keyValuePair == null)?this.keyValuePair = new KeyValuePair.Selector<TRoot, ListOfKeyValuePair.Selector<TRoot, TParent>>(this._root, this, "keyValuePair"):this.keyValuePair);
        }

    }

}
