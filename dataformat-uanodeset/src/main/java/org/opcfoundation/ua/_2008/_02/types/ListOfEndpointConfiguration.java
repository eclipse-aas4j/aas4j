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
 * <p>Java-Klasse für ListOfEndpointConfiguration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfEndpointConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndpointConfiguration" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EndpointConfiguration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfEndpointConfiguration", propOrder = {
    "endpointConfiguration"
})
public class ListOfEndpointConfiguration {

    @XmlElement(name = "EndpointConfiguration", nillable = true)
    protected List<EndpointConfiguration> endpointConfiguration;

    /**
     * Gets the value of the endpointConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointConfiguration }
     * 
     * 
     */
    public List<EndpointConfiguration> getEndpointConfiguration() {
        if (endpointConfiguration == null) {
            endpointConfiguration = new ArrayList<EndpointConfiguration>();
        }
        return this.endpointConfiguration;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfEndpointConfiguration.Builder<_B> _other) {
        if (this.endpointConfiguration == null) {
            _other.endpointConfiguration = null;
        } else {
            _other.endpointConfiguration = new ArrayList<EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>>>();
            for (EndpointConfiguration _item: this.endpointConfiguration) {
                _other.endpointConfiguration.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfEndpointConfiguration.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfEndpointConfiguration.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfEndpointConfiguration.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfEndpointConfiguration.Builder<Void> builder() {
        return new ListOfEndpointConfiguration.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfEndpointConfiguration.Builder<_B> copyOf(final ListOfEndpointConfiguration _other) {
        final ListOfEndpointConfiguration.Builder<_B> _newBuilder = new ListOfEndpointConfiguration.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfEndpointConfiguration.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree endpointConfigurationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointConfiguration"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointConfigurationPropertyTree!= null):((endpointConfigurationPropertyTree == null)||(!endpointConfigurationPropertyTree.isLeaf())))) {
            if (this.endpointConfiguration == null) {
                _other.endpointConfiguration = null;
            } else {
                _other.endpointConfiguration = new ArrayList<EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>>>();
                for (EndpointConfiguration _item: this.endpointConfiguration) {
                    _other.endpointConfiguration.add(((_item == null)?null:_item.newCopyBuilder(_other, endpointConfigurationPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfEndpointConfiguration.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfEndpointConfiguration.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfEndpointConfiguration.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfEndpointConfiguration.Builder<_B> copyOf(final ListOfEndpointConfiguration _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfEndpointConfiguration.Builder<_B> _newBuilder = new ListOfEndpointConfiguration.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfEndpointConfiguration.Builder<Void> copyExcept(final ListOfEndpointConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfEndpointConfiguration.Builder<Void> copyOnly(final ListOfEndpointConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfEndpointConfiguration _storedValue;
        private List<EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>>> endpointConfiguration;

        public Builder(final _B _parentBuilder, final ListOfEndpointConfiguration _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.endpointConfiguration == null) {
                        this.endpointConfiguration = null;
                    } else {
                        this.endpointConfiguration = new ArrayList<EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>>>();
                        for (EndpointConfiguration _item: _other.endpointConfiguration) {
                            this.endpointConfiguration.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfEndpointConfiguration _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree endpointConfigurationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointConfiguration"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointConfigurationPropertyTree!= null):((endpointConfigurationPropertyTree == null)||(!endpointConfigurationPropertyTree.isLeaf())))) {
                        if (_other.endpointConfiguration == null) {
                            this.endpointConfiguration = null;
                        } else {
                            this.endpointConfiguration = new ArrayList<EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>>>();
                            for (EndpointConfiguration _item: _other.endpointConfiguration) {
                                this.endpointConfiguration.add(((_item == null)?null:_item.newCopyBuilder(this, endpointConfigurationPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfEndpointConfiguration >_P init(final _P _product) {
            if (this.endpointConfiguration!= null) {
                final List<EndpointConfiguration> endpointConfiguration = new ArrayList<EndpointConfiguration>(this.endpointConfiguration.size());
                for (EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>> _item: this.endpointConfiguration) {
                    endpointConfiguration.add(_item.build());
                }
                _product.endpointConfiguration = endpointConfiguration;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "endpointConfiguration" hinzu.
         * 
         * @param endpointConfiguration
         *     Werte, die zur Eigenschaft "endpointConfiguration" hinzugefügt werden.
         */
        public ListOfEndpointConfiguration.Builder<_B> addEndpointConfiguration(final Iterable<? extends EndpointConfiguration> endpointConfiguration) {
            if (endpointConfiguration!= null) {
                if (this.endpointConfiguration == null) {
                    this.endpointConfiguration = new ArrayList<EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>>>();
                }
                for (EndpointConfiguration _item: endpointConfiguration) {
                    this.endpointConfiguration.add(new EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointConfiguration" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param endpointConfiguration
         *     Neuer Wert der Eigenschaft "endpointConfiguration".
         */
        public ListOfEndpointConfiguration.Builder<_B> withEndpointConfiguration(final Iterable<? extends EndpointConfiguration> endpointConfiguration) {
            if (this.endpointConfiguration!= null) {
                this.endpointConfiguration.clear();
            }
            return addEndpointConfiguration(endpointConfiguration);
        }

        /**
         * Fügt Werte zur Eigenschaft "endpointConfiguration" hinzu.
         * 
         * @param endpointConfiguration
         *     Werte, die zur Eigenschaft "endpointConfiguration" hinzugefügt werden.
         */
        public ListOfEndpointConfiguration.Builder<_B> addEndpointConfiguration(EndpointConfiguration... endpointConfiguration) {
            addEndpointConfiguration(Arrays.asList(endpointConfiguration));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointConfiguration" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param endpointConfiguration
         *     Neuer Wert der Eigenschaft "endpointConfiguration".
         */
        public ListOfEndpointConfiguration.Builder<_B> withEndpointConfiguration(EndpointConfiguration... endpointConfiguration) {
            withEndpointConfiguration(Arrays.asList(endpointConfiguration));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "EndpointConfiguration".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.EndpointConfiguration.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "EndpointConfiguration".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.EndpointConfiguration.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public EndpointConfiguration.Builder<? extends ListOfEndpointConfiguration.Builder<_B>> addEndpointConfiguration() {
            if (this.endpointConfiguration == null) {
                this.endpointConfiguration = new ArrayList<EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>>>();
            }
            final EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>> endpointConfiguration_Builder = new EndpointConfiguration.Builder<ListOfEndpointConfiguration.Builder<_B>>(this, null, false);
            this.endpointConfiguration.add(endpointConfiguration_Builder);
            return endpointConfiguration_Builder;
        }

        @Override
        public ListOfEndpointConfiguration build() {
            if (_storedValue == null) {
                return this.init(new ListOfEndpointConfiguration());
            } else {
                return ((ListOfEndpointConfiguration) _storedValue);
            }
        }

        public ListOfEndpointConfiguration.Builder<_B> copyOf(final ListOfEndpointConfiguration _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfEndpointConfiguration.Builder<_B> copyOf(final ListOfEndpointConfiguration.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfEndpointConfiguration.Selector<ListOfEndpointConfiguration.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfEndpointConfiguration.Select _root() {
            return new ListOfEndpointConfiguration.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private EndpointConfiguration.Selector<TRoot, ListOfEndpointConfiguration.Selector<TRoot, TParent>> endpointConfiguration = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.endpointConfiguration!= null) {
                products.put("endpointConfiguration", this.endpointConfiguration.init());
            }
            return products;
        }

        public EndpointConfiguration.Selector<TRoot, ListOfEndpointConfiguration.Selector<TRoot, TParent>> endpointConfiguration() {
            return ((this.endpointConfiguration == null)?this.endpointConfiguration = new EndpointConfiguration.Selector<TRoot, ListOfEndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "endpointConfiguration"):this.endpointConfiguration);
        }

    }

}
