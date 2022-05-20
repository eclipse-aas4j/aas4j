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
 * <p>Java-Klasse für MonitoredItemCreateResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MonitoredItemCreateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="MonitoredItemId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RevisedSamplingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RevisedQueueSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="FilterResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredItemCreateResult", propOrder = {
    "statusCode",
    "monitoredItemId",
    "revisedSamplingInterval",
    "revisedQueueSize",
    "filterResult"
})
public class MonitoredItemCreateResult {

    @XmlElement(name = "StatusCode")
    protected StatusCode statusCode;
    @XmlElement(name = "MonitoredItemId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long monitoredItemId;
    @XmlElement(name = "RevisedSamplingInterval")
    protected Double revisedSamplingInterval;
    @XmlElement(name = "RevisedQueueSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long revisedQueueSize;
    @XmlElementRef(name = "FilterResult", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> filterResult;

    /**
     * Ruft den Wert der statusCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Legt den Wert der statusCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatusCode(StatusCode value) {
        this.statusCode = value;
    }

    /**
     * Ruft den Wert der monitoredItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonitoredItemId() {
        return monitoredItemId;
    }

    /**
     * Legt den Wert der monitoredItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonitoredItemId(Long value) {
        this.monitoredItemId = value;
    }

    /**
     * Ruft den Wert der revisedSamplingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRevisedSamplingInterval() {
        return revisedSamplingInterval;
    }

    /**
     * Legt den Wert der revisedSamplingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRevisedSamplingInterval(Double value) {
        this.revisedSamplingInterval = value;
    }

    /**
     * Ruft den Wert der revisedQueueSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevisedQueueSize() {
        return revisedQueueSize;
    }

    /**
     * Legt den Wert der revisedQueueSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevisedQueueSize(Long value) {
        this.revisedQueueSize = value;
    }

    /**
     * Ruft den Wert der filterResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getFilterResult() {
        return filterResult;
    }

    /**
     * Legt den Wert der filterResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setFilterResult(JAXBElement<ExtensionObject> value) {
        this.filterResult = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final MonitoredItemCreateResult.Builder<_B> _other) {
        _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other));
        _other.monitoredItemId = this.monitoredItemId;
        _other.revisedSamplingInterval = this.revisedSamplingInterval;
        _other.revisedQueueSize = this.revisedQueueSize;
        _other.filterResult = this.filterResult;
    }

    public<_B >MonitoredItemCreateResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new MonitoredItemCreateResult.Builder<_B>(_parentBuilder, this, true);
    }

    public MonitoredItemCreateResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static MonitoredItemCreateResult.Builder<Void> builder() {
        return new MonitoredItemCreateResult.Builder<Void>(null, null, false);
    }

    public static<_B >MonitoredItemCreateResult.Builder<_B> copyOf(final MonitoredItemCreateResult _other) {
        final MonitoredItemCreateResult.Builder<_B> _newBuilder = new MonitoredItemCreateResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final MonitoredItemCreateResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
            _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other, statusCodePropertyTree, _propertyTreeUse));
        }
        final PropertyTree monitoredItemIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemIdPropertyTree!= null):((monitoredItemIdPropertyTree == null)||(!monitoredItemIdPropertyTree.isLeaf())))) {
            _other.monitoredItemId = this.monitoredItemId;
        }
        final PropertyTree revisedSamplingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedSamplingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedSamplingIntervalPropertyTree!= null):((revisedSamplingIntervalPropertyTree == null)||(!revisedSamplingIntervalPropertyTree.isLeaf())))) {
            _other.revisedSamplingInterval = this.revisedSamplingInterval;
        }
        final PropertyTree revisedQueueSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedQueueSize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedQueueSizePropertyTree!= null):((revisedQueueSizePropertyTree == null)||(!revisedQueueSizePropertyTree.isLeaf())))) {
            _other.revisedQueueSize = this.revisedQueueSize;
        }
        final PropertyTree filterResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filterResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterResultPropertyTree!= null):((filterResultPropertyTree == null)||(!filterResultPropertyTree.isLeaf())))) {
            _other.filterResult = this.filterResult;
        }
    }

    public<_B >MonitoredItemCreateResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new MonitoredItemCreateResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public MonitoredItemCreateResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >MonitoredItemCreateResult.Builder<_B> copyOf(final MonitoredItemCreateResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MonitoredItemCreateResult.Builder<_B> _newBuilder = new MonitoredItemCreateResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static MonitoredItemCreateResult.Builder<Void> copyExcept(final MonitoredItemCreateResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MonitoredItemCreateResult.Builder<Void> copyOnly(final MonitoredItemCreateResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final MonitoredItemCreateResult _storedValue;
        private StatusCode.Builder<MonitoredItemCreateResult.Builder<_B>> statusCode;
        private Long monitoredItemId;
        private Double revisedSamplingInterval;
        private Long revisedQueueSize;
        private JAXBElement<ExtensionObject> filterResult;

        public Builder(final _B _parentBuilder, final MonitoredItemCreateResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this));
                    this.monitoredItemId = _other.monitoredItemId;
                    this.revisedSamplingInterval = _other.revisedSamplingInterval;
                    this.revisedQueueSize = _other.revisedQueueSize;
                    this.filterResult = _other.filterResult;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final MonitoredItemCreateResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
                        this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this, statusCodePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree monitoredItemIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemIdPropertyTree!= null):((monitoredItemIdPropertyTree == null)||(!monitoredItemIdPropertyTree.isLeaf())))) {
                        this.monitoredItemId = _other.monitoredItemId;
                    }
                    final PropertyTree revisedSamplingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedSamplingInterval"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedSamplingIntervalPropertyTree!= null):((revisedSamplingIntervalPropertyTree == null)||(!revisedSamplingIntervalPropertyTree.isLeaf())))) {
                        this.revisedSamplingInterval = _other.revisedSamplingInterval;
                    }
                    final PropertyTree revisedQueueSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedQueueSize"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedQueueSizePropertyTree!= null):((revisedQueueSizePropertyTree == null)||(!revisedQueueSizePropertyTree.isLeaf())))) {
                        this.revisedQueueSize = _other.revisedQueueSize;
                    }
                    final PropertyTree filterResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("filterResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(filterResultPropertyTree!= null):((filterResultPropertyTree == null)||(!filterResultPropertyTree.isLeaf())))) {
                        this.filterResult = _other.filterResult;
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

        protected<_P extends MonitoredItemCreateResult >_P init(final _P _product) {
            _product.statusCode = ((this.statusCode == null)?null:this.statusCode.build());
            _product.monitoredItemId = this.monitoredItemId;
            _product.revisedSamplingInterval = this.revisedSamplingInterval;
            _product.revisedQueueSize = this.revisedQueueSize;
            _product.filterResult = this.filterResult;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public MonitoredItemCreateResult.Builder<_B> withStatusCode(final StatusCode statusCode) {
            this.statusCode = ((statusCode == null)?null:new StatusCode.Builder<MonitoredItemCreateResult.Builder<_B>>(this, statusCode, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "statusCode".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "statusCode".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public StatusCode.Builder<? extends MonitoredItemCreateResult.Builder<_B>> withStatusCode() {
            if (this.statusCode!= null) {
                return this.statusCode;
            }
            return this.statusCode = new StatusCode.Builder<MonitoredItemCreateResult.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param monitoredItemId
         *     Neuer Wert der Eigenschaft "monitoredItemId".
         */
        public MonitoredItemCreateResult.Builder<_B> withMonitoredItemId(final Long monitoredItemId) {
            this.monitoredItemId = monitoredItemId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedSamplingInterval" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param revisedSamplingInterval
         *     Neuer Wert der Eigenschaft "revisedSamplingInterval".
         */
        public MonitoredItemCreateResult.Builder<_B> withRevisedSamplingInterval(final Double revisedSamplingInterval) {
            this.revisedSamplingInterval = revisedSamplingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedQueueSize" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param revisedQueueSize
         *     Neuer Wert der Eigenschaft "revisedQueueSize".
         */
        public MonitoredItemCreateResult.Builder<_B> withRevisedQueueSize(final Long revisedQueueSize) {
            this.revisedQueueSize = revisedQueueSize;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "filterResult" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param filterResult
         *     Neuer Wert der Eigenschaft "filterResult".
         */
        public MonitoredItemCreateResult.Builder<_B> withFilterResult(final JAXBElement<ExtensionObject> filterResult) {
            this.filterResult = filterResult;
            return this;
        }

        @Override
        public MonitoredItemCreateResult build() {
            if (_storedValue == null) {
                return this.init(new MonitoredItemCreateResult());
            } else {
                return ((MonitoredItemCreateResult) _storedValue);
            }
        }

        public MonitoredItemCreateResult.Builder<_B> copyOf(final MonitoredItemCreateResult _other) {
            _other.copyTo(this);
            return this;
        }

        public MonitoredItemCreateResult.Builder<_B> copyOf(final MonitoredItemCreateResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends MonitoredItemCreateResult.Selector<MonitoredItemCreateResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static MonitoredItemCreateResult.Select _root() {
            return new MonitoredItemCreateResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StatusCode.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> statusCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> monitoredItemId = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> revisedSamplingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> revisedQueueSize = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> filterResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.statusCode!= null) {
                products.put("statusCode", this.statusCode.init());
            }
            if (this.monitoredItemId!= null) {
                products.put("monitoredItemId", this.monitoredItemId.init());
            }
            if (this.revisedSamplingInterval!= null) {
                products.put("revisedSamplingInterval", this.revisedSamplingInterval.init());
            }
            if (this.revisedQueueSize!= null) {
                products.put("revisedQueueSize", this.revisedQueueSize.init());
            }
            if (this.filterResult!= null) {
                products.put("filterResult", this.filterResult.init());
            }
            return products;
        }

        public StatusCode.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> statusCode() {
            return ((this.statusCode == null)?this.statusCode = new StatusCode.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>>(this._root, this, "statusCode"):this.statusCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> monitoredItemId() {
            return ((this.monitoredItemId == null)?this.monitoredItemId = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>>(this._root, this, "monitoredItemId"):this.monitoredItemId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> revisedSamplingInterval() {
            return ((this.revisedSamplingInterval == null)?this.revisedSamplingInterval = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>>(this._root, this, "revisedSamplingInterval"):this.revisedSamplingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> revisedQueueSize() {
            return ((this.revisedQueueSize == null)?this.revisedQueueSize = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>>(this._root, this, "revisedQueueSize"):this.revisedQueueSize);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>> filterResult() {
            return ((this.filterResult == null)?this.filterResult = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateResult.Selector<TRoot, TParent>>(this._root, this, "filterResult"):this.filterResult);
        }

    }

}
