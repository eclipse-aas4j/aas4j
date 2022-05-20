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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für MonitoringParameters complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MonitoringParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientHandle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="SamplingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Filter" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="QueueSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DiscardOldest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringParameters", propOrder = {
    "clientHandle",
    "samplingInterval",
    "filter",
    "queueSize",
    "discardOldest"
})
public class MonitoringParameters {

    @XmlElement(name = "ClientHandle")
    @XmlSchemaType(name = "unsignedInt")
    protected Long clientHandle;
    @XmlElement(name = "SamplingInterval")
    protected Double samplingInterval;
    @XmlElementRef(name = "Filter", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> filter;
    @XmlElement(name = "QueueSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long queueSize;
    @XmlElement(name = "DiscardOldest")
    protected Boolean discardOldest;

    /**
     * Ruft den Wert der clientHandle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientHandle() {
        return clientHandle;
    }

    /**
     * Legt den Wert der clientHandle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientHandle(Long value) {
        this.clientHandle = value;
    }

    /**
     * Ruft den Wert der samplingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSamplingInterval() {
        return samplingInterval;
    }

    /**
     * Legt den Wert der samplingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSamplingInterval(Double value) {
        this.samplingInterval = value;
    }

    /**
     * Ruft den Wert der filter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getFilter() {
        return filter;
    }

    /**
     * Legt den Wert der filter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setFilter(JAXBElement<ExtensionObject> value) {
        this.filter = value;
    }

    /**
     * Ruft den Wert der queueSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQueueSize() {
        return queueSize;
    }

    /**
     * Legt den Wert der queueSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQueueSize(Long value) {
        this.queueSize = value;
    }

    /**
     * Ruft den Wert der discardOldest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscardOldest() {
        return discardOldest;
    }

    /**
     * Legt den Wert der discardOldest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscardOldest(Boolean value) {
        this.discardOldest = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final MonitoringParameters.Builder<_B> _other) {
        _other.clientHandle = this.clientHandle;
        _other.samplingInterval = this.samplingInterval;
        _other.filter = this.filter;
        _other.queueSize = this.queueSize;
        _other.discardOldest = this.discardOldest;
    }

    public<_B >MonitoringParameters.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new MonitoringParameters.Builder<_B>(_parentBuilder, this, true);
    }

    public MonitoringParameters.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static MonitoringParameters.Builder<Void> builder() {
        return new MonitoringParameters.Builder<Void>(null, null, false);
    }

    public static<_B >MonitoringParameters.Builder<_B> copyOf(final MonitoringParameters _other) {
        final MonitoringParameters.Builder<_B> _newBuilder = new MonitoringParameters.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final MonitoringParameters.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree clientHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientHandle"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientHandlePropertyTree!= null):((clientHandlePropertyTree == null)||(!clientHandlePropertyTree.isLeaf())))) {
            _other.clientHandle = this.clientHandle;
        }
        final PropertyTree samplingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingIntervalPropertyTree!= null):((samplingIntervalPropertyTree == null)||(!samplingIntervalPropertyTree.isLeaf())))) {
            _other.samplingInterval = this.samplingInterval;
        }
        final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
            _other.filter = this.filter;
        }
        final PropertyTree queueSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queueSize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queueSizePropertyTree!= null):((queueSizePropertyTree == null)||(!queueSizePropertyTree.isLeaf())))) {
            _other.queueSize = this.queueSize;
        }
        final PropertyTree discardOldestPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discardOldest"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discardOldestPropertyTree!= null):((discardOldestPropertyTree == null)||(!discardOldestPropertyTree.isLeaf())))) {
            _other.discardOldest = this.discardOldest;
        }
    }

    public<_B >MonitoringParameters.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new MonitoringParameters.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public MonitoringParameters.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >MonitoringParameters.Builder<_B> copyOf(final MonitoringParameters _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MonitoringParameters.Builder<_B> _newBuilder = new MonitoringParameters.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static MonitoringParameters.Builder<Void> copyExcept(final MonitoringParameters _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MonitoringParameters.Builder<Void> copyOnly(final MonitoringParameters _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final MonitoringParameters _storedValue;
        private Long clientHandle;
        private Double samplingInterval;
        private JAXBElement<ExtensionObject> filter;
        private Long queueSize;
        private Boolean discardOldest;

        public Builder(final _B _parentBuilder, final MonitoringParameters _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.clientHandle = _other.clientHandle;
                    this.samplingInterval = _other.samplingInterval;
                    this.filter = _other.filter;
                    this.queueSize = _other.queueSize;
                    this.discardOldest = _other.discardOldest;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final MonitoringParameters _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree clientHandlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientHandle"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientHandlePropertyTree!= null):((clientHandlePropertyTree == null)||(!clientHandlePropertyTree.isLeaf())))) {
                        this.clientHandle = _other.clientHandle;
                    }
                    final PropertyTree samplingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingInterval"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingIntervalPropertyTree!= null):((samplingIntervalPropertyTree == null)||(!samplingIntervalPropertyTree.isLeaf())))) {
                        this.samplingInterval = _other.samplingInterval;
                    }
                    final PropertyTree filterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filter"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterPropertyTree!= null):((filterPropertyTree == null)||(!filterPropertyTree.isLeaf())))) {
                        this.filter = _other.filter;
                    }
                    final PropertyTree queueSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queueSize"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queueSizePropertyTree!= null):((queueSizePropertyTree == null)||(!queueSizePropertyTree.isLeaf())))) {
                        this.queueSize = _other.queueSize;
                    }
                    final PropertyTree discardOldestPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discardOldest"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discardOldestPropertyTree!= null):((discardOldestPropertyTree == null)||(!discardOldestPropertyTree.isLeaf())))) {
                        this.discardOldest = _other.discardOldest;
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

        protected<_P extends MonitoringParameters >_P init(final _P _product) {
            _product.clientHandle = this.clientHandle;
            _product.samplingInterval = this.samplingInterval;
            _product.filter = this.filter;
            _product.queueSize = this.queueSize;
            _product.discardOldest = this.discardOldest;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientHandle" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param clientHandle
         *     Neuer Wert der Eigenschaft "clientHandle".
         */
        public MonitoringParameters.Builder<_B> withClientHandle(final Long clientHandle) {
            this.clientHandle = clientHandle;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "samplingInterval" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param samplingInterval
         *     Neuer Wert der Eigenschaft "samplingInterval".
         */
        public MonitoringParameters.Builder<_B> withSamplingInterval(final Double samplingInterval) {
            this.samplingInterval = samplingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "filter" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param filter
         *     Neuer Wert der Eigenschaft "filter".
         */
        public MonitoringParameters.Builder<_B> withFilter(final JAXBElement<ExtensionObject> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "queueSize" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param queueSize
         *     Neuer Wert der Eigenschaft "queueSize".
         */
        public MonitoringParameters.Builder<_B> withQueueSize(final Long queueSize) {
            this.queueSize = queueSize;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "discardOldest" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param discardOldest
         *     Neuer Wert der Eigenschaft "discardOldest".
         */
        public MonitoringParameters.Builder<_B> withDiscardOldest(final Boolean discardOldest) {
            this.discardOldest = discardOldest;
            return this;
        }

        @Override
        public MonitoringParameters build() {
            if (_storedValue == null) {
                return this.init(new MonitoringParameters());
            } else {
                return ((MonitoringParameters) _storedValue);
            }
        }

        public MonitoringParameters.Builder<_B> copyOf(final MonitoringParameters _other) {
            _other.copyTo(this);
            return this;
        }

        public MonitoringParameters.Builder<_B> copyOf(final MonitoringParameters.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends MonitoringParameters.Selector<MonitoringParameters.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static MonitoringParameters.Select _root() {
            return new MonitoringParameters.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> clientHandle = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> samplingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> filter = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> queueSize = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> discardOldest = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.clientHandle!= null) {
                products.put("clientHandle", this.clientHandle.init());
            }
            if (this.samplingInterval!= null) {
                products.put("samplingInterval", this.samplingInterval.init());
            }
            if (this.filter!= null) {
                products.put("filter", this.filter.init());
            }
            if (this.queueSize!= null) {
                products.put("queueSize", this.queueSize.init());
            }
            if (this.discardOldest!= null) {
                products.put("discardOldest", this.discardOldest.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> clientHandle() {
            return ((this.clientHandle == null)?this.clientHandle = new com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>>(this._root, this, "clientHandle"):this.clientHandle);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> samplingInterval() {
            return ((this.samplingInterval == null)?this.samplingInterval = new com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>>(this._root, this, "samplingInterval"):this.samplingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> filter() {
            return ((this.filter == null)?this.filter = new com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>>(this._root, this, "filter"):this.filter);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> queueSize() {
            return ((this.queueSize == null)?this.queueSize = new com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>>(this._root, this, "queueSize"):this.queueSize);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>> discardOldest() {
            return ((this.discardOldest == null)?this.discardOldest = new com.kscs.util.jaxb.Selector<TRoot, MonitoringParameters.Selector<TRoot, TParent>>(this._root, this, "discardOldest"):this.discardOldest);
        }

    }

}
