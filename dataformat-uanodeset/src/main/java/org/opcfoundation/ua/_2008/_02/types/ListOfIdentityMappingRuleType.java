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
 * <p>Java-Klasse für ListOfIdentityMappingRuleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfIdentityMappingRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentityMappingRuleType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}IdentityMappingRuleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIdentityMappingRuleType", propOrder = {
    "identityMappingRuleType"
})
public class ListOfIdentityMappingRuleType {

    @XmlElement(name = "IdentityMappingRuleType", nillable = true)
    protected List<IdentityMappingRuleType> identityMappingRuleType;

    /**
     * Gets the value of the identityMappingRuleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityMappingRuleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityMappingRuleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityMappingRuleType }
     * 
     * 
     */
    public List<IdentityMappingRuleType> getIdentityMappingRuleType() {
        if (identityMappingRuleType == null) {
            identityMappingRuleType = new ArrayList<IdentityMappingRuleType>();
        }
        return this.identityMappingRuleType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfIdentityMappingRuleType.Builder<_B> _other) {
        if (this.identityMappingRuleType == null) {
            _other.identityMappingRuleType = null;
        } else {
            _other.identityMappingRuleType = new ArrayList<IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>>>();
            for (IdentityMappingRuleType _item: this.identityMappingRuleType) {
                _other.identityMappingRuleType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfIdentityMappingRuleType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfIdentityMappingRuleType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfIdentityMappingRuleType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfIdentityMappingRuleType.Builder<Void> builder() {
        return new ListOfIdentityMappingRuleType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfIdentityMappingRuleType.Builder<_B> copyOf(final ListOfIdentityMappingRuleType _other) {
        final ListOfIdentityMappingRuleType.Builder<_B> _newBuilder = new ListOfIdentityMappingRuleType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfIdentityMappingRuleType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree identityMappingRuleTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("identityMappingRuleType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(identityMappingRuleTypePropertyTree!= null):((identityMappingRuleTypePropertyTree == null)||(!identityMappingRuleTypePropertyTree.isLeaf())))) {
            if (this.identityMappingRuleType == null) {
                _other.identityMappingRuleType = null;
            } else {
                _other.identityMappingRuleType = new ArrayList<IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>>>();
                for (IdentityMappingRuleType _item: this.identityMappingRuleType) {
                    _other.identityMappingRuleType.add(((_item == null)?null:_item.newCopyBuilder(_other, identityMappingRuleTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfIdentityMappingRuleType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfIdentityMappingRuleType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfIdentityMappingRuleType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfIdentityMappingRuleType.Builder<_B> copyOf(final ListOfIdentityMappingRuleType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfIdentityMappingRuleType.Builder<_B> _newBuilder = new ListOfIdentityMappingRuleType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfIdentityMappingRuleType.Builder<Void> copyExcept(final ListOfIdentityMappingRuleType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfIdentityMappingRuleType.Builder<Void> copyOnly(final ListOfIdentityMappingRuleType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfIdentityMappingRuleType _storedValue;
        private List<IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>>> identityMappingRuleType;

        public Builder(final _B _parentBuilder, final ListOfIdentityMappingRuleType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.identityMappingRuleType == null) {
                        this.identityMappingRuleType = null;
                    } else {
                        this.identityMappingRuleType = new ArrayList<IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>>>();
                        for (IdentityMappingRuleType _item: _other.identityMappingRuleType) {
                            this.identityMappingRuleType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfIdentityMappingRuleType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree identityMappingRuleTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("identityMappingRuleType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(identityMappingRuleTypePropertyTree!= null):((identityMappingRuleTypePropertyTree == null)||(!identityMappingRuleTypePropertyTree.isLeaf())))) {
                        if (_other.identityMappingRuleType == null) {
                            this.identityMappingRuleType = null;
                        } else {
                            this.identityMappingRuleType = new ArrayList<IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>>>();
                            for (IdentityMappingRuleType _item: _other.identityMappingRuleType) {
                                this.identityMappingRuleType.add(((_item == null)?null:_item.newCopyBuilder(this, identityMappingRuleTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfIdentityMappingRuleType >_P init(final _P _product) {
            if (this.identityMappingRuleType!= null) {
                final List<IdentityMappingRuleType> identityMappingRuleType = new ArrayList<IdentityMappingRuleType>(this.identityMappingRuleType.size());
                for (IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>> _item: this.identityMappingRuleType) {
                    identityMappingRuleType.add(_item.build());
                }
                _product.identityMappingRuleType = identityMappingRuleType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "identityMappingRuleType" hinzu.
         * 
         * @param identityMappingRuleType
         *     Werte, die zur Eigenschaft "identityMappingRuleType" hinzugefügt werden.
         */
        public ListOfIdentityMappingRuleType.Builder<_B> addIdentityMappingRuleType(final Iterable<? extends IdentityMappingRuleType> identityMappingRuleType) {
            if (identityMappingRuleType!= null) {
                if (this.identityMappingRuleType == null) {
                    this.identityMappingRuleType = new ArrayList<IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>>>();
                }
                for (IdentityMappingRuleType _item: identityMappingRuleType) {
                    this.identityMappingRuleType.add(new IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "identityMappingRuleType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param identityMappingRuleType
         *     Neuer Wert der Eigenschaft "identityMappingRuleType".
         */
        public ListOfIdentityMappingRuleType.Builder<_B> withIdentityMappingRuleType(final Iterable<? extends IdentityMappingRuleType> identityMappingRuleType) {
            if (this.identityMappingRuleType!= null) {
                this.identityMappingRuleType.clear();
            }
            return addIdentityMappingRuleType(identityMappingRuleType);
        }

        /**
         * Fügt Werte zur Eigenschaft "identityMappingRuleType" hinzu.
         * 
         * @param identityMappingRuleType
         *     Werte, die zur Eigenschaft "identityMappingRuleType" hinzugefügt werden.
         */
        public ListOfIdentityMappingRuleType.Builder<_B> addIdentityMappingRuleType(IdentityMappingRuleType... identityMappingRuleType) {
            addIdentityMappingRuleType(Arrays.asList(identityMappingRuleType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "identityMappingRuleType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param identityMappingRuleType
         *     Neuer Wert der Eigenschaft "identityMappingRuleType".
         */
        public ListOfIdentityMappingRuleType.Builder<_B> withIdentityMappingRuleType(IdentityMappingRuleType... identityMappingRuleType) {
            withIdentityMappingRuleType(Arrays.asList(identityMappingRuleType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "IdentityMappingRuleType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "IdentityMappingRuleType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.IdentityMappingRuleType.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public IdentityMappingRuleType.Builder<? extends ListOfIdentityMappingRuleType.Builder<_B>> addIdentityMappingRuleType() {
            if (this.identityMappingRuleType == null) {
                this.identityMappingRuleType = new ArrayList<IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>>>();
            }
            final IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>> identityMappingRuleType_Builder = new IdentityMappingRuleType.Builder<ListOfIdentityMappingRuleType.Builder<_B>>(this, null, false);
            this.identityMappingRuleType.add(identityMappingRuleType_Builder);
            return identityMappingRuleType_Builder;
        }

        @Override
        public ListOfIdentityMappingRuleType build() {
            if (_storedValue == null) {
                return this.init(new ListOfIdentityMappingRuleType());
            } else {
                return ((ListOfIdentityMappingRuleType) _storedValue);
            }
        }

        public ListOfIdentityMappingRuleType.Builder<_B> copyOf(final ListOfIdentityMappingRuleType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfIdentityMappingRuleType.Builder<_B> copyOf(final ListOfIdentityMappingRuleType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfIdentityMappingRuleType.Selector<ListOfIdentityMappingRuleType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfIdentityMappingRuleType.Select _root() {
            return new ListOfIdentityMappingRuleType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private IdentityMappingRuleType.Selector<TRoot, ListOfIdentityMappingRuleType.Selector<TRoot, TParent>> identityMappingRuleType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.identityMappingRuleType!= null) {
                products.put("identityMappingRuleType", this.identityMappingRuleType.init());
            }
            return products;
        }

        public IdentityMappingRuleType.Selector<TRoot, ListOfIdentityMappingRuleType.Selector<TRoot, TParent>> identityMappingRuleType() {
            return ((this.identityMappingRuleType == null)?this.identityMappingRuleType = new IdentityMappingRuleType.Selector<TRoot, ListOfIdentityMappingRuleType.Selector<TRoot, TParent>>(this._root, this, "identityMappingRuleType"):this.identityMappingRuleType);
        }

    }

}
