//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für PubSubConfigurationDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PubSubConfigurationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublishedDataSets" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfPublishedDataSetDataType" minOccurs="0"/&gt;
 *         &lt;element name="Connections" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfPubSubConnectionDataType" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PubSubConfigurationDataType", propOrder = {
    "publishedDataSets",
    "connections",
    "enabled"
})
public class PubSubConfigurationDataType {

    @XmlElementRef(name = "PublishedDataSets", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfPublishedDataSetDataType> publishedDataSets;
    @XmlElementRef(name = "Connections", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfPubSubConnectionDataType> connections;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;

    /**
     * Ruft den Wert der publishedDataSets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfPublishedDataSetDataType }{@code >}
     *     
     */
    public JAXBElement<ListOfPublishedDataSetDataType> getPublishedDataSets() {
        return publishedDataSets;
    }

    /**
     * Legt den Wert der publishedDataSets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfPublishedDataSetDataType }{@code >}
     *     
     */
    public void setPublishedDataSets(JAXBElement<ListOfPublishedDataSetDataType> value) {
        this.publishedDataSets = value;
    }

    /**
     * Ruft den Wert der connections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfPubSubConnectionDataType }{@code >}
     *     
     */
    public JAXBElement<ListOfPubSubConnectionDataType> getConnections() {
        return connections;
    }

    /**
     * Legt den Wert der connections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfPubSubConnectionDataType }{@code >}
     *     
     */
    public void setConnections(JAXBElement<ListOfPubSubConnectionDataType> value) {
        this.connections = value;
    }

    /**
     * Ruft den Wert der enabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Legt den Wert der enabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PubSubConfigurationDataType.Builder<_B> _other) {
        _other.publishedDataSets = this.publishedDataSets;
        _other.connections = this.connections;
        _other.enabled = this.enabled;
    }

    public<_B >PubSubConfigurationDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PubSubConfigurationDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public PubSubConfigurationDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PubSubConfigurationDataType.Builder<Void> builder() {
        return new PubSubConfigurationDataType.Builder<Void>(null, null, false);
    }

    public static<_B >PubSubConfigurationDataType.Builder<_B> copyOf(final PubSubConfigurationDataType _other) {
        final PubSubConfigurationDataType.Builder<_B> _newBuilder = new PubSubConfigurationDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final PubSubConfigurationDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree publishedDataSetsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedDataSets"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataSetsPropertyTree!= null):((publishedDataSetsPropertyTree == null)||(!publishedDataSetsPropertyTree.isLeaf())))) {
            _other.publishedDataSets = this.publishedDataSets;
        }
        final PropertyTree connectionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("connections"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(connectionsPropertyTree!= null):((connectionsPropertyTree == null)||(!connectionsPropertyTree.isLeaf())))) {
            _other.connections = this.connections;
        }
        final PropertyTree enabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enabled"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enabledPropertyTree!= null):((enabledPropertyTree == null)||(!enabledPropertyTree.isLeaf())))) {
            _other.enabled = this.enabled;
        }
    }

    public<_B >PubSubConfigurationDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PubSubConfigurationDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public PubSubConfigurationDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PubSubConfigurationDataType.Builder<_B> copyOf(final PubSubConfigurationDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PubSubConfigurationDataType.Builder<_B> _newBuilder = new PubSubConfigurationDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PubSubConfigurationDataType.Builder<Void> copyExcept(final PubSubConfigurationDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PubSubConfigurationDataType.Builder<Void> copyOnly(final PubSubConfigurationDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final PubSubConfigurationDataType _storedValue;
        private JAXBElement<ListOfPublishedDataSetDataType> publishedDataSets;
        private JAXBElement<ListOfPubSubConnectionDataType> connections;
        private Boolean enabled;

        public Builder(final _B _parentBuilder, final PubSubConfigurationDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.publishedDataSets = _other.publishedDataSets;
                    this.connections = _other.connections;
                    this.enabled = _other.enabled;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final PubSubConfigurationDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree publishedDataSetsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedDataSets"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataSetsPropertyTree!= null):((publishedDataSetsPropertyTree == null)||(!publishedDataSetsPropertyTree.isLeaf())))) {
                        this.publishedDataSets = _other.publishedDataSets;
                    }
                    final PropertyTree connectionsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("connections"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(connectionsPropertyTree!= null):((connectionsPropertyTree == null)||(!connectionsPropertyTree.isLeaf())))) {
                        this.connections = _other.connections;
                    }
                    final PropertyTree enabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enabled"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enabledPropertyTree!= null):((enabledPropertyTree == null)||(!enabledPropertyTree.isLeaf())))) {
                        this.enabled = _other.enabled;
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

        protected<_P extends PubSubConfigurationDataType >_P init(final _P _product) {
            _product.publishedDataSets = this.publishedDataSets;
            _product.connections = this.connections;
            _product.enabled = this.enabled;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedDataSets" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishedDataSets
         *     Neuer Wert der Eigenschaft "publishedDataSets".
         */
        public PubSubConfigurationDataType.Builder<_B> withPublishedDataSets(final JAXBElement<ListOfPublishedDataSetDataType> publishedDataSets) {
            this.publishedDataSets = publishedDataSets;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "connections" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param connections
         *     Neuer Wert der Eigenschaft "connections".
         */
        public PubSubConfigurationDataType.Builder<_B> withConnections(final JAXBElement<ListOfPubSubConnectionDataType> connections) {
            this.connections = connections;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enabled" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param enabled
         *     Neuer Wert der Eigenschaft "enabled".
         */
        public PubSubConfigurationDataType.Builder<_B> withEnabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        @Override
        public PubSubConfigurationDataType build() {
            if (_storedValue == null) {
                return this.init(new PubSubConfigurationDataType());
            } else {
                return ((PubSubConfigurationDataType) _storedValue);
            }
        }

        public PubSubConfigurationDataType.Builder<_B> copyOf(final PubSubConfigurationDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public PubSubConfigurationDataType.Builder<_B> copyOf(final PubSubConfigurationDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends PubSubConfigurationDataType.Selector<PubSubConfigurationDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PubSubConfigurationDataType.Select _root() {
            return new PubSubConfigurationDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PubSubConfigurationDataType.Selector<TRoot, TParent>> publishedDataSets = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubConfigurationDataType.Selector<TRoot, TParent>> connections = null;
        private com.kscs.util.jaxb.Selector<TRoot, PubSubConfigurationDataType.Selector<TRoot, TParent>> enabled = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.publishedDataSets!= null) {
                products.put("publishedDataSets", this.publishedDataSets.init());
            }
            if (this.connections!= null) {
                products.put("connections", this.connections.init());
            }
            if (this.enabled!= null) {
                products.put("enabled", this.enabled.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConfigurationDataType.Selector<TRoot, TParent>> publishedDataSets() {
            return ((this.publishedDataSets == null)?this.publishedDataSets = new com.kscs.util.jaxb.Selector<TRoot, PubSubConfigurationDataType.Selector<TRoot, TParent>>(this._root, this, "publishedDataSets"):this.publishedDataSets);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConfigurationDataType.Selector<TRoot, TParent>> connections() {
            return ((this.connections == null)?this.connections = new com.kscs.util.jaxb.Selector<TRoot, PubSubConfigurationDataType.Selector<TRoot, TParent>>(this._root, this, "connections"):this.connections);
        }

        public com.kscs.util.jaxb.Selector<TRoot, PubSubConfigurationDataType.Selector<TRoot, TParent>> enabled() {
            return ((this.enabled == null)?this.enabled = new com.kscs.util.jaxb.Selector<TRoot, PubSubConfigurationDataType.Selector<TRoot, TParent>>(this._root, this, "enabled"):this.enabled);
        }

    }

}
