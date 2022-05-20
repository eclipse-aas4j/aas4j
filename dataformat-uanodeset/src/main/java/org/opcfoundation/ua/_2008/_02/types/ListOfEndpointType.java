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
 * <p>Java-Klasse für ListOfEndpointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfEndpointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndpointType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EndpointType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfEndpointType", propOrder = {
    "endpointType"
})
public class ListOfEndpointType {

    @XmlElement(name = "EndpointType", nillable = true)
    protected List<EndpointType> endpointType;

    /**
     * Gets the value of the endpointType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointType }
     * 
     * 
     */
    public List<EndpointType> getEndpointType() {
        if (endpointType == null) {
            endpointType = new ArrayList<EndpointType>();
        }
        return this.endpointType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfEndpointType.Builder<_B> _other) {
        if (this.endpointType == null) {
            _other.endpointType = null;
        } else {
            _other.endpointType = new ArrayList<EndpointType.Builder<ListOfEndpointType.Builder<_B>>>();
            for (EndpointType _item: this.endpointType) {
                _other.endpointType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfEndpointType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfEndpointType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfEndpointType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfEndpointType.Builder<Void> builder() {
        return new ListOfEndpointType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfEndpointType.Builder<_B> copyOf(final ListOfEndpointType _other) {
        final ListOfEndpointType.Builder<_B> _newBuilder = new ListOfEndpointType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfEndpointType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree endpointTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointTypePropertyTree!= null):((endpointTypePropertyTree == null)||(!endpointTypePropertyTree.isLeaf())))) {
            if (this.endpointType == null) {
                _other.endpointType = null;
            } else {
                _other.endpointType = new ArrayList<EndpointType.Builder<ListOfEndpointType.Builder<_B>>>();
                for (EndpointType _item: this.endpointType) {
                    _other.endpointType.add(((_item == null)?null:_item.newCopyBuilder(_other, endpointTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfEndpointType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfEndpointType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfEndpointType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfEndpointType.Builder<_B> copyOf(final ListOfEndpointType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfEndpointType.Builder<_B> _newBuilder = new ListOfEndpointType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfEndpointType.Builder<Void> copyExcept(final ListOfEndpointType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfEndpointType.Builder<Void> copyOnly(final ListOfEndpointType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfEndpointType _storedValue;
        private List<EndpointType.Builder<ListOfEndpointType.Builder<_B>>> endpointType;

        public Builder(final _B _parentBuilder, final ListOfEndpointType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.endpointType == null) {
                        this.endpointType = null;
                    } else {
                        this.endpointType = new ArrayList<EndpointType.Builder<ListOfEndpointType.Builder<_B>>>();
                        for (EndpointType _item: _other.endpointType) {
                            this.endpointType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfEndpointType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree endpointTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointTypePropertyTree!= null):((endpointTypePropertyTree == null)||(!endpointTypePropertyTree.isLeaf())))) {
                        if (_other.endpointType == null) {
                            this.endpointType = null;
                        } else {
                            this.endpointType = new ArrayList<EndpointType.Builder<ListOfEndpointType.Builder<_B>>>();
                            for (EndpointType _item: _other.endpointType) {
                                this.endpointType.add(((_item == null)?null:_item.newCopyBuilder(this, endpointTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfEndpointType >_P init(final _P _product) {
            if (this.endpointType!= null) {
                final List<EndpointType> endpointType = new ArrayList<EndpointType>(this.endpointType.size());
                for (EndpointType.Builder<ListOfEndpointType.Builder<_B>> _item: this.endpointType) {
                    endpointType.add(_item.build());
                }
                _product.endpointType = endpointType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "endpointType" hinzu.
         * 
         * @param endpointType
         *     Werte, die zur Eigenschaft "endpointType" hinzugefügt werden.
         */
        public ListOfEndpointType.Builder<_B> addEndpointType(final Iterable<? extends EndpointType> endpointType) {
            if (endpointType!= null) {
                if (this.endpointType == null) {
                    this.endpointType = new ArrayList<EndpointType.Builder<ListOfEndpointType.Builder<_B>>>();
                }
                for (EndpointType _item: endpointType) {
                    this.endpointType.add(new EndpointType.Builder<ListOfEndpointType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param endpointType
         *     Neuer Wert der Eigenschaft "endpointType".
         */
        public ListOfEndpointType.Builder<_B> withEndpointType(final Iterable<? extends EndpointType> endpointType) {
            if (this.endpointType!= null) {
                this.endpointType.clear();
            }
            return addEndpointType(endpointType);
        }

        /**
         * Fügt Werte zur Eigenschaft "endpointType" hinzu.
         * 
         * @param endpointType
         *     Werte, die zur Eigenschaft "endpointType" hinzugefügt werden.
         */
        public ListOfEndpointType.Builder<_B> addEndpointType(EndpointType... endpointType) {
            addEndpointType(Arrays.asList(endpointType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param endpointType
         *     Neuer Wert der Eigenschaft "endpointType".
         */
        public ListOfEndpointType.Builder<_B> withEndpointType(EndpointType... endpointType) {
            withEndpointType(Arrays.asList(endpointType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "EndpointType".
         * Mit {@link org.opcfoundation.ua._2008._02.types.EndpointType.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "EndpointType".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.EndpointType.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public EndpointType.Builder<? extends ListOfEndpointType.Builder<_B>> addEndpointType() {
            if (this.endpointType == null) {
                this.endpointType = new ArrayList<EndpointType.Builder<ListOfEndpointType.Builder<_B>>>();
            }
            final EndpointType.Builder<ListOfEndpointType.Builder<_B>> endpointType_Builder = new EndpointType.Builder<ListOfEndpointType.Builder<_B>>(this, null, false);
            this.endpointType.add(endpointType_Builder);
            return endpointType_Builder;
        }

        @Override
        public ListOfEndpointType build() {
            if (_storedValue == null) {
                return this.init(new ListOfEndpointType());
            } else {
                return ((ListOfEndpointType) _storedValue);
            }
        }

        public ListOfEndpointType.Builder<_B> copyOf(final ListOfEndpointType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfEndpointType.Builder<_B> copyOf(final ListOfEndpointType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfEndpointType.Selector<ListOfEndpointType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfEndpointType.Select _root() {
            return new ListOfEndpointType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private EndpointType.Selector<TRoot, ListOfEndpointType.Selector<TRoot, TParent>> endpointType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.endpointType!= null) {
                products.put("endpointType", this.endpointType.init());
            }
            return products;
        }

        public EndpointType.Selector<TRoot, ListOfEndpointType.Selector<TRoot, TParent>> endpointType() {
            return ((this.endpointType == null)?this.endpointType = new EndpointType.Selector<TRoot, ListOfEndpointType.Selector<TRoot, TParent>>(this._root, this, "endpointType"):this.endpointType);
        }

    }

}
