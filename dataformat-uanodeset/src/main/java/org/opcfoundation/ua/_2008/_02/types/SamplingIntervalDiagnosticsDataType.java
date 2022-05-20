//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für SamplingIntervalDiagnosticsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SamplingIntervalDiagnosticsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SamplingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MonitoredItemCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MaxMonitoredItemCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DisabledMonitoredItemCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamplingIntervalDiagnosticsDataType", propOrder = {
    "samplingInterval",
    "monitoredItemCount",
    "maxMonitoredItemCount",
    "disabledMonitoredItemCount"
})
public class SamplingIntervalDiagnosticsDataType {

    @XmlElement(name = "SamplingInterval")
    protected Double samplingInterval;
    @XmlElement(name = "MonitoredItemCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long monitoredItemCount;
    @XmlElement(name = "MaxMonitoredItemCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxMonitoredItemCount;
    @XmlElement(name = "DisabledMonitoredItemCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long disabledMonitoredItemCount;

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
     * Ruft den Wert der monitoredItemCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonitoredItemCount() {
        return monitoredItemCount;
    }

    /**
     * Legt den Wert der monitoredItemCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonitoredItemCount(Long value) {
        this.monitoredItemCount = value;
    }

    /**
     * Ruft den Wert der maxMonitoredItemCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxMonitoredItemCount() {
        return maxMonitoredItemCount;
    }

    /**
     * Legt den Wert der maxMonitoredItemCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxMonitoredItemCount(Long value) {
        this.maxMonitoredItemCount = value;
    }

    /**
     * Ruft den Wert der disabledMonitoredItemCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisabledMonitoredItemCount() {
        return disabledMonitoredItemCount;
    }

    /**
     * Legt den Wert der disabledMonitoredItemCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisabledMonitoredItemCount(Long value) {
        this.disabledMonitoredItemCount = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SamplingIntervalDiagnosticsDataType.Builder<_B> _other) {
        _other.samplingInterval = this.samplingInterval;
        _other.monitoredItemCount = this.monitoredItemCount;
        _other.maxMonitoredItemCount = this.maxMonitoredItemCount;
        _other.disabledMonitoredItemCount = this.disabledMonitoredItemCount;
    }

    public<_B >SamplingIntervalDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SamplingIntervalDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public SamplingIntervalDiagnosticsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SamplingIntervalDiagnosticsDataType.Builder<Void> builder() {
        return new SamplingIntervalDiagnosticsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >SamplingIntervalDiagnosticsDataType.Builder<_B> copyOf(final SamplingIntervalDiagnosticsDataType _other) {
        final SamplingIntervalDiagnosticsDataType.Builder<_B> _newBuilder = new SamplingIntervalDiagnosticsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SamplingIntervalDiagnosticsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree samplingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingIntervalPropertyTree!= null):((samplingIntervalPropertyTree == null)||(!samplingIntervalPropertyTree.isLeaf())))) {
            _other.samplingInterval = this.samplingInterval;
        }
        final PropertyTree monitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemCountPropertyTree!= null):((monitoredItemCountPropertyTree == null)||(!monitoredItemCountPropertyTree.isLeaf())))) {
            _other.monitoredItemCount = this.monitoredItemCount;
        }
        final PropertyTree maxMonitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxMonitoredItemCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxMonitoredItemCountPropertyTree!= null):((maxMonitoredItemCountPropertyTree == null)||(!maxMonitoredItemCountPropertyTree.isLeaf())))) {
            _other.maxMonitoredItemCount = this.maxMonitoredItemCount;
        }
        final PropertyTree disabledMonitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("disabledMonitoredItemCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(disabledMonitoredItemCountPropertyTree!= null):((disabledMonitoredItemCountPropertyTree == null)||(!disabledMonitoredItemCountPropertyTree.isLeaf())))) {
            _other.disabledMonitoredItemCount = this.disabledMonitoredItemCount;
        }
    }

    public<_B >SamplingIntervalDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SamplingIntervalDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SamplingIntervalDiagnosticsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SamplingIntervalDiagnosticsDataType.Builder<_B> copyOf(final SamplingIntervalDiagnosticsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SamplingIntervalDiagnosticsDataType.Builder<_B> _newBuilder = new SamplingIntervalDiagnosticsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SamplingIntervalDiagnosticsDataType.Builder<Void> copyExcept(final SamplingIntervalDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SamplingIntervalDiagnosticsDataType.Builder<Void> copyOnly(final SamplingIntervalDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SamplingIntervalDiagnosticsDataType _storedValue;
        private Double samplingInterval;
        private Long monitoredItemCount;
        private Long maxMonitoredItemCount;
        private Long disabledMonitoredItemCount;

        public Builder(final _B _parentBuilder, final SamplingIntervalDiagnosticsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.samplingInterval = _other.samplingInterval;
                    this.monitoredItemCount = _other.monitoredItemCount;
                    this.maxMonitoredItemCount = _other.maxMonitoredItemCount;
                    this.disabledMonitoredItemCount = _other.disabledMonitoredItemCount;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SamplingIntervalDiagnosticsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree samplingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("samplingInterval"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(samplingIntervalPropertyTree!= null):((samplingIntervalPropertyTree == null)||(!samplingIntervalPropertyTree.isLeaf())))) {
                        this.samplingInterval = _other.samplingInterval;
                    }
                    final PropertyTree monitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemCountPropertyTree!= null):((monitoredItemCountPropertyTree == null)||(!monitoredItemCountPropertyTree.isLeaf())))) {
                        this.monitoredItemCount = _other.monitoredItemCount;
                    }
                    final PropertyTree maxMonitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxMonitoredItemCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxMonitoredItemCountPropertyTree!= null):((maxMonitoredItemCountPropertyTree == null)||(!maxMonitoredItemCountPropertyTree.isLeaf())))) {
                        this.maxMonitoredItemCount = _other.maxMonitoredItemCount;
                    }
                    final PropertyTree disabledMonitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("disabledMonitoredItemCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(disabledMonitoredItemCountPropertyTree!= null):((disabledMonitoredItemCountPropertyTree == null)||(!disabledMonitoredItemCountPropertyTree.isLeaf())))) {
                        this.disabledMonitoredItemCount = _other.disabledMonitoredItemCount;
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

        protected<_P extends SamplingIntervalDiagnosticsDataType >_P init(final _P _product) {
            _product.samplingInterval = this.samplingInterval;
            _product.monitoredItemCount = this.monitoredItemCount;
            _product.maxMonitoredItemCount = this.maxMonitoredItemCount;
            _product.disabledMonitoredItemCount = this.disabledMonitoredItemCount;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "samplingInterval" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param samplingInterval
         *     Neuer Wert der Eigenschaft "samplingInterval".
         */
        public SamplingIntervalDiagnosticsDataType.Builder<_B> withSamplingInterval(final Double samplingInterval) {
            this.samplingInterval = samplingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param monitoredItemCount
         *     Neuer Wert der Eigenschaft "monitoredItemCount".
         */
        public SamplingIntervalDiagnosticsDataType.Builder<_B> withMonitoredItemCount(final Long monitoredItemCount) {
            this.monitoredItemCount = monitoredItemCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxMonitoredItemCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxMonitoredItemCount
         *     Neuer Wert der Eigenschaft "maxMonitoredItemCount".
         */
        public SamplingIntervalDiagnosticsDataType.Builder<_B> withMaxMonitoredItemCount(final Long maxMonitoredItemCount) {
            this.maxMonitoredItemCount = maxMonitoredItemCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "disabledMonitoredItemCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param disabledMonitoredItemCount
         *     Neuer Wert der Eigenschaft "disabledMonitoredItemCount".
         */
        public SamplingIntervalDiagnosticsDataType.Builder<_B> withDisabledMonitoredItemCount(final Long disabledMonitoredItemCount) {
            this.disabledMonitoredItemCount = disabledMonitoredItemCount;
            return this;
        }

        @Override
        public SamplingIntervalDiagnosticsDataType build() {
            if (_storedValue == null) {
                return this.init(new SamplingIntervalDiagnosticsDataType());
            } else {
                return ((SamplingIntervalDiagnosticsDataType) _storedValue);
            }
        }

        public SamplingIntervalDiagnosticsDataType.Builder<_B> copyOf(final SamplingIntervalDiagnosticsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public SamplingIntervalDiagnosticsDataType.Builder<_B> copyOf(final SamplingIntervalDiagnosticsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SamplingIntervalDiagnosticsDataType.Selector<SamplingIntervalDiagnosticsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SamplingIntervalDiagnosticsDataType.Select _root() {
            return new SamplingIntervalDiagnosticsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> samplingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> monitoredItemCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> maxMonitoredItemCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> disabledMonitoredItemCount = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.samplingInterval!= null) {
                products.put("samplingInterval", this.samplingInterval.init());
            }
            if (this.monitoredItemCount!= null) {
                products.put("monitoredItemCount", this.monitoredItemCount.init());
            }
            if (this.maxMonitoredItemCount!= null) {
                products.put("maxMonitoredItemCount", this.maxMonitoredItemCount.init());
            }
            if (this.disabledMonitoredItemCount!= null) {
                products.put("disabledMonitoredItemCount", this.disabledMonitoredItemCount.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> samplingInterval() {
            return ((this.samplingInterval == null)?this.samplingInterval = new com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "samplingInterval"):this.samplingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> monitoredItemCount() {
            return ((this.monitoredItemCount == null)?this.monitoredItemCount = new com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "monitoredItemCount"):this.monitoredItemCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> maxMonitoredItemCount() {
            return ((this.maxMonitoredItemCount == null)?this.maxMonitoredItemCount = new com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "maxMonitoredItemCount"):this.maxMonitoredItemCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>> disabledMonitoredItemCount() {
            return ((this.disabledMonitoredItemCount == null)?this.disabledMonitoredItemCount = new com.kscs.util.jaxb.Selector<TRoot, SamplingIntervalDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "disabledMonitoredItemCount"):this.disabledMonitoredItemCount);
        }

    }

}
