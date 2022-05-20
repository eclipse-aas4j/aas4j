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
 * <p>Java-Klasse für ListOfSubscriptionAcknowledgement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSubscriptionAcknowledgement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionAcknowledgement" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SubscriptionAcknowledgement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSubscriptionAcknowledgement", propOrder = {
    "subscriptionAcknowledgement"
})
public class ListOfSubscriptionAcknowledgement {

    @XmlElement(name = "SubscriptionAcknowledgement", nillable = true)
    protected List<SubscriptionAcknowledgement> subscriptionAcknowledgement;

    /**
     * Gets the value of the subscriptionAcknowledgement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionAcknowledgement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionAcknowledgement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionAcknowledgement }
     * 
     * 
     */
    public List<SubscriptionAcknowledgement> getSubscriptionAcknowledgement() {
        if (subscriptionAcknowledgement == null) {
            subscriptionAcknowledgement = new ArrayList<SubscriptionAcknowledgement>();
        }
        return this.subscriptionAcknowledgement;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSubscriptionAcknowledgement.Builder<_B> _other) {
        if (this.subscriptionAcknowledgement == null) {
            _other.subscriptionAcknowledgement = null;
        } else {
            _other.subscriptionAcknowledgement = new ArrayList<SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>>>();
            for (SubscriptionAcknowledgement _item: this.subscriptionAcknowledgement) {
                _other.subscriptionAcknowledgement.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSubscriptionAcknowledgement.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSubscriptionAcknowledgement.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSubscriptionAcknowledgement.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSubscriptionAcknowledgement.Builder<Void> builder() {
        return new ListOfSubscriptionAcknowledgement.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSubscriptionAcknowledgement.Builder<_B> copyOf(final ListOfSubscriptionAcknowledgement _other) {
        final ListOfSubscriptionAcknowledgement.Builder<_B> _newBuilder = new ListOfSubscriptionAcknowledgement.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSubscriptionAcknowledgement.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree subscriptionAcknowledgementPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionAcknowledgement"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionAcknowledgementPropertyTree!= null):((subscriptionAcknowledgementPropertyTree == null)||(!subscriptionAcknowledgementPropertyTree.isLeaf())))) {
            if (this.subscriptionAcknowledgement == null) {
                _other.subscriptionAcknowledgement = null;
            } else {
                _other.subscriptionAcknowledgement = new ArrayList<SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>>>();
                for (SubscriptionAcknowledgement _item: this.subscriptionAcknowledgement) {
                    _other.subscriptionAcknowledgement.add(((_item == null)?null:_item.newCopyBuilder(_other, subscriptionAcknowledgementPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSubscriptionAcknowledgement.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSubscriptionAcknowledgement.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSubscriptionAcknowledgement.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSubscriptionAcknowledgement.Builder<_B> copyOf(final ListOfSubscriptionAcknowledgement _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSubscriptionAcknowledgement.Builder<_B> _newBuilder = new ListOfSubscriptionAcknowledgement.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSubscriptionAcknowledgement.Builder<Void> copyExcept(final ListOfSubscriptionAcknowledgement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSubscriptionAcknowledgement.Builder<Void> copyOnly(final ListOfSubscriptionAcknowledgement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSubscriptionAcknowledgement _storedValue;
        private List<SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>>> subscriptionAcknowledgement;

        public Builder(final _B _parentBuilder, final ListOfSubscriptionAcknowledgement _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.subscriptionAcknowledgement == null) {
                        this.subscriptionAcknowledgement = null;
                    } else {
                        this.subscriptionAcknowledgement = new ArrayList<SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>>>();
                        for (SubscriptionAcknowledgement _item: _other.subscriptionAcknowledgement) {
                            this.subscriptionAcknowledgement.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSubscriptionAcknowledgement _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree subscriptionAcknowledgementPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionAcknowledgement"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionAcknowledgementPropertyTree!= null):((subscriptionAcknowledgementPropertyTree == null)||(!subscriptionAcknowledgementPropertyTree.isLeaf())))) {
                        if (_other.subscriptionAcknowledgement == null) {
                            this.subscriptionAcknowledgement = null;
                        } else {
                            this.subscriptionAcknowledgement = new ArrayList<SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>>>();
                            for (SubscriptionAcknowledgement _item: _other.subscriptionAcknowledgement) {
                                this.subscriptionAcknowledgement.add(((_item == null)?null:_item.newCopyBuilder(this, subscriptionAcknowledgementPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSubscriptionAcknowledgement >_P init(final _P _product) {
            if (this.subscriptionAcknowledgement!= null) {
                final List<SubscriptionAcknowledgement> subscriptionAcknowledgement = new ArrayList<SubscriptionAcknowledgement>(this.subscriptionAcknowledgement.size());
                for (SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>> _item: this.subscriptionAcknowledgement) {
                    subscriptionAcknowledgement.add(_item.build());
                }
                _product.subscriptionAcknowledgement = subscriptionAcknowledgement;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "subscriptionAcknowledgement" hinzu.
         * 
         * @param subscriptionAcknowledgement
         *     Werte, die zur Eigenschaft "subscriptionAcknowledgement" hinzugefügt werden.
         */
        public ListOfSubscriptionAcknowledgement.Builder<_B> addSubscriptionAcknowledgement(final Iterable<? extends SubscriptionAcknowledgement> subscriptionAcknowledgement) {
            if (subscriptionAcknowledgement!= null) {
                if (this.subscriptionAcknowledgement == null) {
                    this.subscriptionAcknowledgement = new ArrayList<SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>>>();
                }
                for (SubscriptionAcknowledgement _item: subscriptionAcknowledgement) {
                    this.subscriptionAcknowledgement.add(new SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionAcknowledgement" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param subscriptionAcknowledgement
         *     Neuer Wert der Eigenschaft "subscriptionAcknowledgement".
         */
        public ListOfSubscriptionAcknowledgement.Builder<_B> withSubscriptionAcknowledgement(final Iterable<? extends SubscriptionAcknowledgement> subscriptionAcknowledgement) {
            if (this.subscriptionAcknowledgement!= null) {
                this.subscriptionAcknowledgement.clear();
            }
            return addSubscriptionAcknowledgement(subscriptionAcknowledgement);
        }

        /**
         * Fügt Werte zur Eigenschaft "subscriptionAcknowledgement" hinzu.
         * 
         * @param subscriptionAcknowledgement
         *     Werte, die zur Eigenschaft "subscriptionAcknowledgement" hinzugefügt werden.
         */
        public ListOfSubscriptionAcknowledgement.Builder<_B> addSubscriptionAcknowledgement(SubscriptionAcknowledgement... subscriptionAcknowledgement) {
            addSubscriptionAcknowledgement(Arrays.asList(subscriptionAcknowledgement));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionAcknowledgement" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param subscriptionAcknowledgement
         *     Neuer Wert der Eigenschaft "subscriptionAcknowledgement".
         */
        public ListOfSubscriptionAcknowledgement.Builder<_B> withSubscriptionAcknowledgement(SubscriptionAcknowledgement... subscriptionAcknowledgement) {
            withSubscriptionAcknowledgement(Arrays.asList(subscriptionAcknowledgement));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SubscriptionAcknowledgement".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SubscriptionAcknowledgement.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SubscriptionAcknowledgement".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SubscriptionAcknowledgement.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public SubscriptionAcknowledgement.Builder<? extends ListOfSubscriptionAcknowledgement.Builder<_B>> addSubscriptionAcknowledgement() {
            if (this.subscriptionAcknowledgement == null) {
                this.subscriptionAcknowledgement = new ArrayList<SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>>>();
            }
            final SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>> subscriptionAcknowledgement_Builder = new SubscriptionAcknowledgement.Builder<ListOfSubscriptionAcknowledgement.Builder<_B>>(this, null, false);
            this.subscriptionAcknowledgement.add(subscriptionAcknowledgement_Builder);
            return subscriptionAcknowledgement_Builder;
        }

        @Override
        public ListOfSubscriptionAcknowledgement build() {
            if (_storedValue == null) {
                return this.init(new ListOfSubscriptionAcknowledgement());
            } else {
                return ((ListOfSubscriptionAcknowledgement) _storedValue);
            }
        }

        public ListOfSubscriptionAcknowledgement.Builder<_B> copyOf(final ListOfSubscriptionAcknowledgement _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSubscriptionAcknowledgement.Builder<_B> copyOf(final ListOfSubscriptionAcknowledgement.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSubscriptionAcknowledgement.Selector<ListOfSubscriptionAcknowledgement.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSubscriptionAcknowledgement.Select _root() {
            return new ListOfSubscriptionAcknowledgement.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SubscriptionAcknowledgement.Selector<TRoot, ListOfSubscriptionAcknowledgement.Selector<TRoot, TParent>> subscriptionAcknowledgement = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.subscriptionAcknowledgement!= null) {
                products.put("subscriptionAcknowledgement", this.subscriptionAcknowledgement.init());
            }
            return products;
        }

        public SubscriptionAcknowledgement.Selector<TRoot, ListOfSubscriptionAcknowledgement.Selector<TRoot, TParent>> subscriptionAcknowledgement() {
            return ((this.subscriptionAcknowledgement == null)?this.subscriptionAcknowledgement = new SubscriptionAcknowledgement.Selector<TRoot, ListOfSubscriptionAcknowledgement.Selector<TRoot, TParent>>(this._root, this, "subscriptionAcknowledgement"):this.subscriptionAcknowledgement);
        }

    }

}
