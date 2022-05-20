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
 * <p>Java-Klasse für ListOfPubSubDiagnosticsCounterClassification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPubSubDiagnosticsCounterClassification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PubSubDiagnosticsCounterClassification" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PubSubDiagnosticsCounterClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPubSubDiagnosticsCounterClassification", propOrder = {
    "pubSubDiagnosticsCounterClassification"
})
public class ListOfPubSubDiagnosticsCounterClassification {

    @XmlElement(name = "PubSubDiagnosticsCounterClassification")
    @XmlSchemaType(name = "string")
    protected List<PubSubDiagnosticsCounterClassification> pubSubDiagnosticsCounterClassification;

    /**
     * Gets the value of the pubSubDiagnosticsCounterClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubSubDiagnosticsCounterClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubSubDiagnosticsCounterClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PubSubDiagnosticsCounterClassification }
     * 
     * 
     */
    public List<PubSubDiagnosticsCounterClassification> getPubSubDiagnosticsCounterClassification() {
        if (pubSubDiagnosticsCounterClassification == null) {
            pubSubDiagnosticsCounterClassification = new ArrayList<PubSubDiagnosticsCounterClassification>();
        }
        return this.pubSubDiagnosticsCounterClassification;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPubSubDiagnosticsCounterClassification.Builder<_B> _other) {
        if (this.pubSubDiagnosticsCounterClassification == null) {
            _other.pubSubDiagnosticsCounterClassification = null;
        } else {
            _other.pubSubDiagnosticsCounterClassification = new ArrayList<Buildable>();
            for (PubSubDiagnosticsCounterClassification _item: this.pubSubDiagnosticsCounterClassification) {
                _other.pubSubDiagnosticsCounterClassification.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
            }
        }
    }

    public<_B >ListOfPubSubDiagnosticsCounterClassification.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPubSubDiagnosticsCounterClassification.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPubSubDiagnosticsCounterClassification.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPubSubDiagnosticsCounterClassification.Builder<Void> builder() {
        return new ListOfPubSubDiagnosticsCounterClassification.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPubSubDiagnosticsCounterClassification.Builder<_B> copyOf(final ListOfPubSubDiagnosticsCounterClassification _other) {
        final ListOfPubSubDiagnosticsCounterClassification.Builder<_B> _newBuilder = new ListOfPubSubDiagnosticsCounterClassification.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPubSubDiagnosticsCounterClassification.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree pubSubDiagnosticsCounterClassificationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubDiagnosticsCounterClassification"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubDiagnosticsCounterClassificationPropertyTree!= null):((pubSubDiagnosticsCounterClassificationPropertyTree == null)||(!pubSubDiagnosticsCounterClassificationPropertyTree.isLeaf())))) {
            if (this.pubSubDiagnosticsCounterClassification == null) {
                _other.pubSubDiagnosticsCounterClassification = null;
            } else {
                _other.pubSubDiagnosticsCounterClassification = new ArrayList<Buildable>();
                for (PubSubDiagnosticsCounterClassification _item: this.pubSubDiagnosticsCounterClassification) {
                    _other.pubSubDiagnosticsCounterClassification.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                }
            }
        }
    }

    public<_B >ListOfPubSubDiagnosticsCounterClassification.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPubSubDiagnosticsCounterClassification.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPubSubDiagnosticsCounterClassification.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPubSubDiagnosticsCounterClassification.Builder<_B> copyOf(final ListOfPubSubDiagnosticsCounterClassification _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPubSubDiagnosticsCounterClassification.Builder<_B> _newBuilder = new ListOfPubSubDiagnosticsCounterClassification.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPubSubDiagnosticsCounterClassification.Builder<Void> copyExcept(final ListOfPubSubDiagnosticsCounterClassification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPubSubDiagnosticsCounterClassification.Builder<Void> copyOnly(final ListOfPubSubDiagnosticsCounterClassification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPubSubDiagnosticsCounterClassification _storedValue;
        private List<Buildable> pubSubDiagnosticsCounterClassification;

        public Builder(final _B _parentBuilder, final ListOfPubSubDiagnosticsCounterClassification _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.pubSubDiagnosticsCounterClassification == null) {
                        this.pubSubDiagnosticsCounterClassification = null;
                    } else {
                        this.pubSubDiagnosticsCounterClassification = new ArrayList<Buildable>();
                        for (PubSubDiagnosticsCounterClassification _item: _other.pubSubDiagnosticsCounterClassification) {
                            this.pubSubDiagnosticsCounterClassification.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPubSubDiagnosticsCounterClassification _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree pubSubDiagnosticsCounterClassificationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("pubSubDiagnosticsCounterClassification"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(pubSubDiagnosticsCounterClassificationPropertyTree!= null):((pubSubDiagnosticsCounterClassificationPropertyTree == null)||(!pubSubDiagnosticsCounterClassificationPropertyTree.isLeaf())))) {
                        if (_other.pubSubDiagnosticsCounterClassification == null) {
                            this.pubSubDiagnosticsCounterClassification = null;
                        } else {
                            this.pubSubDiagnosticsCounterClassification = new ArrayList<Buildable>();
                            for (PubSubDiagnosticsCounterClassification _item: _other.pubSubDiagnosticsCounterClassification) {
                                this.pubSubDiagnosticsCounterClassification.add(((_item == null)?null:new Buildable.PrimitiveBuildable(_item)));
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

        protected<_P extends ListOfPubSubDiagnosticsCounterClassification >_P init(final _P _product) {
            if (this.pubSubDiagnosticsCounterClassification!= null) {
                final List<PubSubDiagnosticsCounterClassification> pubSubDiagnosticsCounterClassification = new ArrayList<PubSubDiagnosticsCounterClassification>(this.pubSubDiagnosticsCounterClassification.size());
                for (Buildable _item: this.pubSubDiagnosticsCounterClassification) {
                    pubSubDiagnosticsCounterClassification.add(((PubSubDiagnosticsCounterClassification) _item.build()));
                }
                _product.pubSubDiagnosticsCounterClassification = pubSubDiagnosticsCounterClassification;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubDiagnosticsCounterClassification" hinzu.
         * 
         * @param pubSubDiagnosticsCounterClassification
         *     Werte, die zur Eigenschaft "pubSubDiagnosticsCounterClassification" hinzugefügt
         *     werden.
         */
        public ListOfPubSubDiagnosticsCounterClassification.Builder<_B> addPubSubDiagnosticsCounterClassification(final Iterable<? extends PubSubDiagnosticsCounterClassification> pubSubDiagnosticsCounterClassification) {
            if (pubSubDiagnosticsCounterClassification!= null) {
                if (this.pubSubDiagnosticsCounterClassification == null) {
                    this.pubSubDiagnosticsCounterClassification = new ArrayList<Buildable>();
                }
                for (PubSubDiagnosticsCounterClassification _item: pubSubDiagnosticsCounterClassification) {
                    this.pubSubDiagnosticsCounterClassification.add(new Buildable.PrimitiveBuildable(_item));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubDiagnosticsCounterClassification"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param pubSubDiagnosticsCounterClassification
         *     Neuer Wert der Eigenschaft "pubSubDiagnosticsCounterClassification".
         */
        public ListOfPubSubDiagnosticsCounterClassification.Builder<_B> withPubSubDiagnosticsCounterClassification(final Iterable<? extends PubSubDiagnosticsCounterClassification> pubSubDiagnosticsCounterClassification) {
            if (this.pubSubDiagnosticsCounterClassification!= null) {
                this.pubSubDiagnosticsCounterClassification.clear();
            }
            return addPubSubDiagnosticsCounterClassification(pubSubDiagnosticsCounterClassification);
        }

        /**
         * Fügt Werte zur Eigenschaft "pubSubDiagnosticsCounterClassification" hinzu.
         * 
         * @param pubSubDiagnosticsCounterClassification
         *     Werte, die zur Eigenschaft "pubSubDiagnosticsCounterClassification" hinzugefügt
         *     werden.
         */
        public ListOfPubSubDiagnosticsCounterClassification.Builder<_B> addPubSubDiagnosticsCounterClassification(PubSubDiagnosticsCounterClassification... pubSubDiagnosticsCounterClassification) {
            addPubSubDiagnosticsCounterClassification(Arrays.asList(pubSubDiagnosticsCounterClassification));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "pubSubDiagnosticsCounterClassification"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param pubSubDiagnosticsCounterClassification
         *     Neuer Wert der Eigenschaft "pubSubDiagnosticsCounterClassification".
         */
        public ListOfPubSubDiagnosticsCounterClassification.Builder<_B> withPubSubDiagnosticsCounterClassification(PubSubDiagnosticsCounterClassification... pubSubDiagnosticsCounterClassification) {
            withPubSubDiagnosticsCounterClassification(Arrays.asList(pubSubDiagnosticsCounterClassification));
            return this;
        }

        @Override
        public ListOfPubSubDiagnosticsCounterClassification build() {
            if (_storedValue == null) {
                return this.init(new ListOfPubSubDiagnosticsCounterClassification());
            } else {
                return ((ListOfPubSubDiagnosticsCounterClassification) _storedValue);
            }
        }

        public ListOfPubSubDiagnosticsCounterClassification.Builder<_B> copyOf(final ListOfPubSubDiagnosticsCounterClassification _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPubSubDiagnosticsCounterClassification.Builder<_B> copyOf(final ListOfPubSubDiagnosticsCounterClassification.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPubSubDiagnosticsCounterClassification.Selector<ListOfPubSubDiagnosticsCounterClassification.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPubSubDiagnosticsCounterClassification.Select _root() {
            return new ListOfPubSubDiagnosticsCounterClassification.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ListOfPubSubDiagnosticsCounterClassification.Selector<TRoot, TParent>> pubSubDiagnosticsCounterClassification = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.pubSubDiagnosticsCounterClassification!= null) {
                products.put("pubSubDiagnosticsCounterClassification", this.pubSubDiagnosticsCounterClassification.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ListOfPubSubDiagnosticsCounterClassification.Selector<TRoot, TParent>> pubSubDiagnosticsCounterClassification() {
            return ((this.pubSubDiagnosticsCounterClassification == null)?this.pubSubDiagnosticsCounterClassification = new com.kscs.util.jaxb.Selector<TRoot, ListOfPubSubDiagnosticsCounterClassification.Selector<TRoot, TParent>>(this._root, this, "pubSubDiagnosticsCounterClassification"):this.pubSubDiagnosticsCounterClassification);
        }

    }

}
