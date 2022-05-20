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
 * <p>Java-Klasse für ListOfEndpointUrlListDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfEndpointUrlListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndpointUrlListDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EndpointUrlListDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfEndpointUrlListDataType", propOrder = {
    "endpointUrlListDataType"
})
public class ListOfEndpointUrlListDataType {

    @XmlElement(name = "EndpointUrlListDataType", nillable = true)
    protected List<EndpointUrlListDataType> endpointUrlListDataType;

    /**
     * Gets the value of the endpointUrlListDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointUrlListDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointUrlListDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointUrlListDataType }
     * 
     * 
     */
    public List<EndpointUrlListDataType> getEndpointUrlListDataType() {
        if (endpointUrlListDataType == null) {
            endpointUrlListDataType = new ArrayList<EndpointUrlListDataType>();
        }
        return this.endpointUrlListDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfEndpointUrlListDataType.Builder<_B> _other) {
        if (this.endpointUrlListDataType == null) {
            _other.endpointUrlListDataType = null;
        } else {
            _other.endpointUrlListDataType = new ArrayList<EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>>>();
            for (EndpointUrlListDataType _item: this.endpointUrlListDataType) {
                _other.endpointUrlListDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfEndpointUrlListDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfEndpointUrlListDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfEndpointUrlListDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfEndpointUrlListDataType.Builder<Void> builder() {
        return new ListOfEndpointUrlListDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfEndpointUrlListDataType.Builder<_B> copyOf(final ListOfEndpointUrlListDataType _other) {
        final ListOfEndpointUrlListDataType.Builder<_B> _newBuilder = new ListOfEndpointUrlListDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfEndpointUrlListDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree endpointUrlListDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrlListDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlListDataTypePropertyTree!= null):((endpointUrlListDataTypePropertyTree == null)||(!endpointUrlListDataTypePropertyTree.isLeaf())))) {
            if (this.endpointUrlListDataType == null) {
                _other.endpointUrlListDataType = null;
            } else {
                _other.endpointUrlListDataType = new ArrayList<EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>>>();
                for (EndpointUrlListDataType _item: this.endpointUrlListDataType) {
                    _other.endpointUrlListDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, endpointUrlListDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfEndpointUrlListDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfEndpointUrlListDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfEndpointUrlListDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfEndpointUrlListDataType.Builder<_B> copyOf(final ListOfEndpointUrlListDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfEndpointUrlListDataType.Builder<_B> _newBuilder = new ListOfEndpointUrlListDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfEndpointUrlListDataType.Builder<Void> copyExcept(final ListOfEndpointUrlListDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfEndpointUrlListDataType.Builder<Void> copyOnly(final ListOfEndpointUrlListDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfEndpointUrlListDataType _storedValue;
        private List<EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>>> endpointUrlListDataType;

        public Builder(final _B _parentBuilder, final ListOfEndpointUrlListDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.endpointUrlListDataType == null) {
                        this.endpointUrlListDataType = null;
                    } else {
                        this.endpointUrlListDataType = new ArrayList<EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>>>();
                        for (EndpointUrlListDataType _item: _other.endpointUrlListDataType) {
                            this.endpointUrlListDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfEndpointUrlListDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree endpointUrlListDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrlListDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlListDataTypePropertyTree!= null):((endpointUrlListDataTypePropertyTree == null)||(!endpointUrlListDataTypePropertyTree.isLeaf())))) {
                        if (_other.endpointUrlListDataType == null) {
                            this.endpointUrlListDataType = null;
                        } else {
                            this.endpointUrlListDataType = new ArrayList<EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>>>();
                            for (EndpointUrlListDataType _item: _other.endpointUrlListDataType) {
                                this.endpointUrlListDataType.add(((_item == null)?null:_item.newCopyBuilder(this, endpointUrlListDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfEndpointUrlListDataType >_P init(final _P _product) {
            if (this.endpointUrlListDataType!= null) {
                final List<EndpointUrlListDataType> endpointUrlListDataType = new ArrayList<EndpointUrlListDataType>(this.endpointUrlListDataType.size());
                for (EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>> _item: this.endpointUrlListDataType) {
                    endpointUrlListDataType.add(_item.build());
                }
                _product.endpointUrlListDataType = endpointUrlListDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "endpointUrlListDataType" hinzu.
         * 
         * @param endpointUrlListDataType
         *     Werte, die zur Eigenschaft "endpointUrlListDataType" hinzugefügt werden.
         */
        public ListOfEndpointUrlListDataType.Builder<_B> addEndpointUrlListDataType(final Iterable<? extends EndpointUrlListDataType> endpointUrlListDataType) {
            if (endpointUrlListDataType!= null) {
                if (this.endpointUrlListDataType == null) {
                    this.endpointUrlListDataType = new ArrayList<EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>>>();
                }
                for (EndpointUrlListDataType _item: endpointUrlListDataType) {
                    this.endpointUrlListDataType.add(new EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointUrlListDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param endpointUrlListDataType
         *     Neuer Wert der Eigenschaft "endpointUrlListDataType".
         */
        public ListOfEndpointUrlListDataType.Builder<_B> withEndpointUrlListDataType(final Iterable<? extends EndpointUrlListDataType> endpointUrlListDataType) {
            if (this.endpointUrlListDataType!= null) {
                this.endpointUrlListDataType.clear();
            }
            return addEndpointUrlListDataType(endpointUrlListDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "endpointUrlListDataType" hinzu.
         * 
         * @param endpointUrlListDataType
         *     Werte, die zur Eigenschaft "endpointUrlListDataType" hinzugefügt werden.
         */
        public ListOfEndpointUrlListDataType.Builder<_B> addEndpointUrlListDataType(EndpointUrlListDataType... endpointUrlListDataType) {
            addEndpointUrlListDataType(Arrays.asList(endpointUrlListDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointUrlListDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param endpointUrlListDataType
         *     Neuer Wert der Eigenschaft "endpointUrlListDataType".
         */
        public ListOfEndpointUrlListDataType.Builder<_B> withEndpointUrlListDataType(EndpointUrlListDataType... endpointUrlListDataType) {
            withEndpointUrlListDataType(Arrays.asList(endpointUrlListDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "EndpointUrlListDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "EndpointUrlListDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.EndpointUrlListDataType.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public EndpointUrlListDataType.Builder<? extends ListOfEndpointUrlListDataType.Builder<_B>> addEndpointUrlListDataType() {
            if (this.endpointUrlListDataType == null) {
                this.endpointUrlListDataType = new ArrayList<EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>>>();
            }
            final EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>> endpointUrlListDataType_Builder = new EndpointUrlListDataType.Builder<ListOfEndpointUrlListDataType.Builder<_B>>(this, null, false);
            this.endpointUrlListDataType.add(endpointUrlListDataType_Builder);
            return endpointUrlListDataType_Builder;
        }

        @Override
        public ListOfEndpointUrlListDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfEndpointUrlListDataType());
            } else {
                return ((ListOfEndpointUrlListDataType) _storedValue);
            }
        }

        public ListOfEndpointUrlListDataType.Builder<_B> copyOf(final ListOfEndpointUrlListDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfEndpointUrlListDataType.Builder<_B> copyOf(final ListOfEndpointUrlListDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfEndpointUrlListDataType.Selector<ListOfEndpointUrlListDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfEndpointUrlListDataType.Select _root() {
            return new ListOfEndpointUrlListDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private EndpointUrlListDataType.Selector<TRoot, ListOfEndpointUrlListDataType.Selector<TRoot, TParent>> endpointUrlListDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.endpointUrlListDataType!= null) {
                products.put("endpointUrlListDataType", this.endpointUrlListDataType.init());
            }
            return products;
        }

        public EndpointUrlListDataType.Selector<TRoot, ListOfEndpointUrlListDataType.Selector<TRoot, TParent>> endpointUrlListDataType() {
            return ((this.endpointUrlListDataType == null)?this.endpointUrlListDataType = new EndpointUrlListDataType.Selector<TRoot, ListOfEndpointUrlListDataType.Selector<TRoot, TParent>>(this._root, this, "endpointUrlListDataType"):this.endpointUrlListDataType);
        }

    }

}
