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
 * <p>Java-Klasse für ListOfConfigurationVersionDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfConfigurationVersionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigurationVersionDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ConfigurationVersionDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfConfigurationVersionDataType", propOrder = {
    "configurationVersionDataType"
})
public class ListOfConfigurationVersionDataType {

    @XmlElement(name = "ConfigurationVersionDataType", nillable = true)
    protected List<ConfigurationVersionDataType> configurationVersionDataType;

    /**
     * Gets the value of the configurationVersionDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurationVersionDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurationVersionDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationVersionDataType }
     * 
     * 
     */
    public List<ConfigurationVersionDataType> getConfigurationVersionDataType() {
        if (configurationVersionDataType == null) {
            configurationVersionDataType = new ArrayList<ConfigurationVersionDataType>();
        }
        return this.configurationVersionDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfConfigurationVersionDataType.Builder<_B> _other) {
        if (this.configurationVersionDataType == null) {
            _other.configurationVersionDataType = null;
        } else {
            _other.configurationVersionDataType = new ArrayList<ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>>>();
            for (ConfigurationVersionDataType _item: this.configurationVersionDataType) {
                _other.configurationVersionDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfConfigurationVersionDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfConfigurationVersionDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfConfigurationVersionDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfConfigurationVersionDataType.Builder<Void> builder() {
        return new ListOfConfigurationVersionDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfConfigurationVersionDataType.Builder<_B> copyOf(final ListOfConfigurationVersionDataType _other) {
        final ListOfConfigurationVersionDataType.Builder<_B> _newBuilder = new ListOfConfigurationVersionDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfConfigurationVersionDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree configurationVersionDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("configurationVersionDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(configurationVersionDataTypePropertyTree!= null):((configurationVersionDataTypePropertyTree == null)||(!configurationVersionDataTypePropertyTree.isLeaf())))) {
            if (this.configurationVersionDataType == null) {
                _other.configurationVersionDataType = null;
            } else {
                _other.configurationVersionDataType = new ArrayList<ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>>>();
                for (ConfigurationVersionDataType _item: this.configurationVersionDataType) {
                    _other.configurationVersionDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, configurationVersionDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfConfigurationVersionDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfConfigurationVersionDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfConfigurationVersionDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfConfigurationVersionDataType.Builder<_B> copyOf(final ListOfConfigurationVersionDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfConfigurationVersionDataType.Builder<_B> _newBuilder = new ListOfConfigurationVersionDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfConfigurationVersionDataType.Builder<Void> copyExcept(final ListOfConfigurationVersionDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfConfigurationVersionDataType.Builder<Void> copyOnly(final ListOfConfigurationVersionDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfConfigurationVersionDataType _storedValue;
        private List<ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>>> configurationVersionDataType;

        public Builder(final _B _parentBuilder, final ListOfConfigurationVersionDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.configurationVersionDataType == null) {
                        this.configurationVersionDataType = null;
                    } else {
                        this.configurationVersionDataType = new ArrayList<ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>>>();
                        for (ConfigurationVersionDataType _item: _other.configurationVersionDataType) {
                            this.configurationVersionDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfConfigurationVersionDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree configurationVersionDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("configurationVersionDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(configurationVersionDataTypePropertyTree!= null):((configurationVersionDataTypePropertyTree == null)||(!configurationVersionDataTypePropertyTree.isLeaf())))) {
                        if (_other.configurationVersionDataType == null) {
                            this.configurationVersionDataType = null;
                        } else {
                            this.configurationVersionDataType = new ArrayList<ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>>>();
                            for (ConfigurationVersionDataType _item: _other.configurationVersionDataType) {
                                this.configurationVersionDataType.add(((_item == null)?null:_item.newCopyBuilder(this, configurationVersionDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfConfigurationVersionDataType >_P init(final _P _product) {
            if (this.configurationVersionDataType!= null) {
                final List<ConfigurationVersionDataType> configurationVersionDataType = new ArrayList<ConfigurationVersionDataType>(this.configurationVersionDataType.size());
                for (ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>> _item: this.configurationVersionDataType) {
                    configurationVersionDataType.add(_item.build());
                }
                _product.configurationVersionDataType = configurationVersionDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "configurationVersionDataType" hinzu.
         * 
         * @param configurationVersionDataType
         *     Werte, die zur Eigenschaft "configurationVersionDataType" hinzugefügt werden.
         */
        public ListOfConfigurationVersionDataType.Builder<_B> addConfigurationVersionDataType(final Iterable<? extends ConfigurationVersionDataType> configurationVersionDataType) {
            if (configurationVersionDataType!= null) {
                if (this.configurationVersionDataType == null) {
                    this.configurationVersionDataType = new ArrayList<ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>>>();
                }
                for (ConfigurationVersionDataType _item: configurationVersionDataType) {
                    this.configurationVersionDataType.add(new ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "configurationVersionDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param configurationVersionDataType
         *     Neuer Wert der Eigenschaft "configurationVersionDataType".
         */
        public ListOfConfigurationVersionDataType.Builder<_B> withConfigurationVersionDataType(final Iterable<? extends ConfigurationVersionDataType> configurationVersionDataType) {
            if (this.configurationVersionDataType!= null) {
                this.configurationVersionDataType.clear();
            }
            return addConfigurationVersionDataType(configurationVersionDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "configurationVersionDataType" hinzu.
         * 
         * @param configurationVersionDataType
         *     Werte, die zur Eigenschaft "configurationVersionDataType" hinzugefügt werden.
         */
        public ListOfConfigurationVersionDataType.Builder<_B> addConfigurationVersionDataType(ConfigurationVersionDataType... configurationVersionDataType) {
            addConfigurationVersionDataType(Arrays.asList(configurationVersionDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "configurationVersionDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param configurationVersionDataType
         *     Neuer Wert der Eigenschaft "configurationVersionDataType".
         */
        public ListOfConfigurationVersionDataType.Builder<_B> withConfigurationVersionDataType(ConfigurationVersionDataType... configurationVersionDataType) {
            withConfigurationVersionDataType(Arrays.asList(configurationVersionDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ConfigurationVersionDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ConfigurationVersionDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ConfigurationVersionDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ConfigurationVersionDataType.Builder<? extends ListOfConfigurationVersionDataType.Builder<_B>> addConfigurationVersionDataType() {
            if (this.configurationVersionDataType == null) {
                this.configurationVersionDataType = new ArrayList<ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>>>();
            }
            final ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>> configurationVersionDataType_Builder = new ConfigurationVersionDataType.Builder<ListOfConfigurationVersionDataType.Builder<_B>>(this, null, false);
            this.configurationVersionDataType.add(configurationVersionDataType_Builder);
            return configurationVersionDataType_Builder;
        }

        @Override
        public ListOfConfigurationVersionDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfConfigurationVersionDataType());
            } else {
                return ((ListOfConfigurationVersionDataType) _storedValue);
            }
        }

        public ListOfConfigurationVersionDataType.Builder<_B> copyOf(final ListOfConfigurationVersionDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfConfigurationVersionDataType.Builder<_B> copyOf(final ListOfConfigurationVersionDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfConfigurationVersionDataType.Selector<ListOfConfigurationVersionDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfConfigurationVersionDataType.Select _root() {
            return new ListOfConfigurationVersionDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ConfigurationVersionDataType.Selector<TRoot, ListOfConfigurationVersionDataType.Selector<TRoot, TParent>> configurationVersionDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.configurationVersionDataType!= null) {
                products.put("configurationVersionDataType", this.configurationVersionDataType.init());
            }
            return products;
        }

        public ConfigurationVersionDataType.Selector<TRoot, ListOfConfigurationVersionDataType.Selector<TRoot, TParent>> configurationVersionDataType() {
            return ((this.configurationVersionDataType == null)?this.configurationVersionDataType = new ConfigurationVersionDataType.Selector<TRoot, ListOfConfigurationVersionDataType.Selector<TRoot, TParent>>(this._root, this, "configurationVersionDataType"):this.configurationVersionDataType);
        }

    }

}
