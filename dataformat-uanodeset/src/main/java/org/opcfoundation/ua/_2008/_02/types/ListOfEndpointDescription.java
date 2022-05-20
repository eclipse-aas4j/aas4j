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
 * <p>Java-Klasse für ListOfEndpointDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfEndpointDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndpointDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EndpointDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfEndpointDescription", propOrder = {
    "endpointDescription"
})
public class ListOfEndpointDescription {

    @XmlElement(name = "EndpointDescription", nillable = true)
    protected List<EndpointDescription> endpointDescription;

    /**
     * Gets the value of the endpointDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointDescription }
     * 
     * 
     */
    public List<EndpointDescription> getEndpointDescription() {
        if (endpointDescription == null) {
            endpointDescription = new ArrayList<EndpointDescription>();
        }
        return this.endpointDescription;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfEndpointDescription.Builder<_B> _other) {
        if (this.endpointDescription == null) {
            _other.endpointDescription = null;
        } else {
            _other.endpointDescription = new ArrayList<EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>>>();
            for (EndpointDescription _item: this.endpointDescription) {
                _other.endpointDescription.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfEndpointDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfEndpointDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfEndpointDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfEndpointDescription.Builder<Void> builder() {
        return new ListOfEndpointDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfEndpointDescription.Builder<_B> copyOf(final ListOfEndpointDescription _other) {
        final ListOfEndpointDescription.Builder<_B> _newBuilder = new ListOfEndpointDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfEndpointDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree endpointDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointDescriptionPropertyTree!= null):((endpointDescriptionPropertyTree == null)||(!endpointDescriptionPropertyTree.isLeaf())))) {
            if (this.endpointDescription == null) {
                _other.endpointDescription = null;
            } else {
                _other.endpointDescription = new ArrayList<EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>>>();
                for (EndpointDescription _item: this.endpointDescription) {
                    _other.endpointDescription.add(((_item == null)?null:_item.newCopyBuilder(_other, endpointDescriptionPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfEndpointDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfEndpointDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfEndpointDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfEndpointDescription.Builder<_B> copyOf(final ListOfEndpointDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfEndpointDescription.Builder<_B> _newBuilder = new ListOfEndpointDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfEndpointDescription.Builder<Void> copyExcept(final ListOfEndpointDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfEndpointDescription.Builder<Void> copyOnly(final ListOfEndpointDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfEndpointDescription _storedValue;
        private List<EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>>> endpointDescription;

        public Builder(final _B _parentBuilder, final ListOfEndpointDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.endpointDescription == null) {
                        this.endpointDescription = null;
                    } else {
                        this.endpointDescription = new ArrayList<EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>>>();
                        for (EndpointDescription _item: _other.endpointDescription) {
                            this.endpointDescription.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfEndpointDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree endpointDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointDescriptionPropertyTree!= null):((endpointDescriptionPropertyTree == null)||(!endpointDescriptionPropertyTree.isLeaf())))) {
                        if (_other.endpointDescription == null) {
                            this.endpointDescription = null;
                        } else {
                            this.endpointDescription = new ArrayList<EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>>>();
                            for (EndpointDescription _item: _other.endpointDescription) {
                                this.endpointDescription.add(((_item == null)?null:_item.newCopyBuilder(this, endpointDescriptionPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfEndpointDescription >_P init(final _P _product) {
            if (this.endpointDescription!= null) {
                final List<EndpointDescription> endpointDescription = new ArrayList<EndpointDescription>(this.endpointDescription.size());
                for (EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>> _item: this.endpointDescription) {
                    endpointDescription.add(_item.build());
                }
                _product.endpointDescription = endpointDescription;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "endpointDescription" hinzu.
         * 
         * @param endpointDescription
         *     Werte, die zur Eigenschaft "endpointDescription" hinzugefügt werden.
         */
        public ListOfEndpointDescription.Builder<_B> addEndpointDescription(final Iterable<? extends EndpointDescription> endpointDescription) {
            if (endpointDescription!= null) {
                if (this.endpointDescription == null) {
                    this.endpointDescription = new ArrayList<EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>>>();
                }
                for (EndpointDescription _item: endpointDescription) {
                    this.endpointDescription.add(new EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param endpointDescription
         *     Neuer Wert der Eigenschaft "endpointDescription".
         */
        public ListOfEndpointDescription.Builder<_B> withEndpointDescription(final Iterable<? extends EndpointDescription> endpointDescription) {
            if (this.endpointDescription!= null) {
                this.endpointDescription.clear();
            }
            return addEndpointDescription(endpointDescription);
        }

        /**
         * Fügt Werte zur Eigenschaft "endpointDescription" hinzu.
         * 
         * @param endpointDescription
         *     Werte, die zur Eigenschaft "endpointDescription" hinzugefügt werden.
         */
        public ListOfEndpointDescription.Builder<_B> addEndpointDescription(EndpointDescription... endpointDescription) {
            addEndpointDescription(Arrays.asList(endpointDescription));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param endpointDescription
         *     Neuer Wert der Eigenschaft "endpointDescription".
         */
        public ListOfEndpointDescription.Builder<_B> withEndpointDescription(EndpointDescription... endpointDescription) {
            withEndpointDescription(Arrays.asList(endpointDescription));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "EndpointDescription".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.EndpointDescription.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "EndpointDescription".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.EndpointDescription.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public EndpointDescription.Builder<? extends ListOfEndpointDescription.Builder<_B>> addEndpointDescription() {
            if (this.endpointDescription == null) {
                this.endpointDescription = new ArrayList<EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>>>();
            }
            final EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>> endpointDescription_Builder = new EndpointDescription.Builder<ListOfEndpointDescription.Builder<_B>>(this, null, false);
            this.endpointDescription.add(endpointDescription_Builder);
            return endpointDescription_Builder;
        }

        @Override
        public ListOfEndpointDescription build() {
            if (_storedValue == null) {
                return this.init(new ListOfEndpointDescription());
            } else {
                return ((ListOfEndpointDescription) _storedValue);
            }
        }

        public ListOfEndpointDescription.Builder<_B> copyOf(final ListOfEndpointDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfEndpointDescription.Builder<_B> copyOf(final ListOfEndpointDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfEndpointDescription.Selector<ListOfEndpointDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfEndpointDescription.Select _root() {
            return new ListOfEndpointDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private EndpointDescription.Selector<TRoot, ListOfEndpointDescription.Selector<TRoot, TParent>> endpointDescription = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.endpointDescription!= null) {
                products.put("endpointDescription", this.endpointDescription.init());
            }
            return products;
        }

        public EndpointDescription.Selector<TRoot, ListOfEndpointDescription.Selector<TRoot, TParent>> endpointDescription() {
            return ((this.endpointDescription == null)?this.endpointDescription = new EndpointDescription.Selector<TRoot, ListOfEndpointDescription.Selector<TRoot, TParent>>(this._root, this, "endpointDescription"):this.endpointDescription);
        }

    }

}
