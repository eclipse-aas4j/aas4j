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
 * <p>Java-Klasse für MonitoredItemCreateRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MonitoredItemCreateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemToMonitor" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ReadValueId" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringMode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoringMode" minOccurs="0"/&gt;
 *         &lt;element name="RequestedParameters" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoringParameters" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredItemCreateRequest", propOrder = {
    "itemToMonitor",
    "monitoringMode",
    "requestedParameters"
})
public class MonitoredItemCreateRequest {

    @XmlElementRef(name = "ItemToMonitor", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ReadValueId> itemToMonitor;
    @XmlElement(name = "MonitoringMode")
    @XmlSchemaType(name = "string")
    protected MonitoringMode monitoringMode;
    @XmlElementRef(name = "RequestedParameters", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MonitoringParameters> requestedParameters;

    /**
     * Ruft den Wert der itemToMonitor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReadValueId }{@code >}
     *     
     */
    public JAXBElement<ReadValueId> getItemToMonitor() {
        return itemToMonitor;
    }

    /**
     * Legt den Wert der itemToMonitor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReadValueId }{@code >}
     *     
     */
    public void setItemToMonitor(JAXBElement<ReadValueId> value) {
        this.itemToMonitor = value;
    }

    /**
     * Ruft den Wert der monitoringMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringMode }
     *     
     */
    public MonitoringMode getMonitoringMode() {
        return monitoringMode;
    }

    /**
     * Legt den Wert der monitoringMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringMode }
     *     
     */
    public void setMonitoringMode(MonitoringMode value) {
        this.monitoringMode = value;
    }

    /**
     * Ruft den Wert der requestedParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonitoringParameters }{@code >}
     *     
     */
    public JAXBElement<MonitoringParameters> getRequestedParameters() {
        return requestedParameters;
    }

    /**
     * Legt den Wert der requestedParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonitoringParameters }{@code >}
     *     
     */
    public void setRequestedParameters(JAXBElement<MonitoringParameters> value) {
        this.requestedParameters = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final MonitoredItemCreateRequest.Builder<_B> _other) {
        _other.itemToMonitor = this.itemToMonitor;
        _other.monitoringMode = this.monitoringMode;
        _other.requestedParameters = this.requestedParameters;
    }

    public<_B >MonitoredItemCreateRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new MonitoredItemCreateRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public MonitoredItemCreateRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static MonitoredItemCreateRequest.Builder<Void> builder() {
        return new MonitoredItemCreateRequest.Builder<Void>(null, null, false);
    }

    public static<_B >MonitoredItemCreateRequest.Builder<_B> copyOf(final MonitoredItemCreateRequest _other) {
        final MonitoredItemCreateRequest.Builder<_B> _newBuilder = new MonitoredItemCreateRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final MonitoredItemCreateRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree itemToMonitorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("itemToMonitor"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(itemToMonitorPropertyTree!= null):((itemToMonitorPropertyTree == null)||(!itemToMonitorPropertyTree.isLeaf())))) {
            _other.itemToMonitor = this.itemToMonitor;
        }
        final PropertyTree monitoringModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoringMode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoringModePropertyTree!= null):((monitoringModePropertyTree == null)||(!monitoringModePropertyTree.isLeaf())))) {
            _other.monitoringMode = this.monitoringMode;
        }
        final PropertyTree requestedParametersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedParameters"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedParametersPropertyTree!= null):((requestedParametersPropertyTree == null)||(!requestedParametersPropertyTree.isLeaf())))) {
            _other.requestedParameters = this.requestedParameters;
        }
    }

    public<_B >MonitoredItemCreateRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new MonitoredItemCreateRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public MonitoredItemCreateRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >MonitoredItemCreateRequest.Builder<_B> copyOf(final MonitoredItemCreateRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MonitoredItemCreateRequest.Builder<_B> _newBuilder = new MonitoredItemCreateRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static MonitoredItemCreateRequest.Builder<Void> copyExcept(final MonitoredItemCreateRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MonitoredItemCreateRequest.Builder<Void> copyOnly(final MonitoredItemCreateRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final MonitoredItemCreateRequest _storedValue;
        private JAXBElement<ReadValueId> itemToMonitor;
        private MonitoringMode monitoringMode;
        private JAXBElement<MonitoringParameters> requestedParameters;

        public Builder(final _B _parentBuilder, final MonitoredItemCreateRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.itemToMonitor = _other.itemToMonitor;
                    this.monitoringMode = _other.monitoringMode;
                    this.requestedParameters = _other.requestedParameters;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final MonitoredItemCreateRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree itemToMonitorPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("itemToMonitor"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(itemToMonitorPropertyTree!= null):((itemToMonitorPropertyTree == null)||(!itemToMonitorPropertyTree.isLeaf())))) {
                        this.itemToMonitor = _other.itemToMonitor;
                    }
                    final PropertyTree monitoringModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoringMode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoringModePropertyTree!= null):((monitoringModePropertyTree == null)||(!monitoringModePropertyTree.isLeaf())))) {
                        this.monitoringMode = _other.monitoringMode;
                    }
                    final PropertyTree requestedParametersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedParameters"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedParametersPropertyTree!= null):((requestedParametersPropertyTree == null)||(!requestedParametersPropertyTree.isLeaf())))) {
                        this.requestedParameters = _other.requestedParameters;
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

        protected<_P extends MonitoredItemCreateRequest >_P init(final _P _product) {
            _product.itemToMonitor = this.itemToMonitor;
            _product.monitoringMode = this.monitoringMode;
            _product.requestedParameters = this.requestedParameters;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "itemToMonitor" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param itemToMonitor
         *     Neuer Wert der Eigenschaft "itemToMonitor".
         */
        public MonitoredItemCreateRequest.Builder<_B> withItemToMonitor(final JAXBElement<ReadValueId> itemToMonitor) {
            this.itemToMonitor = itemToMonitor;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoringMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param monitoringMode
         *     Neuer Wert der Eigenschaft "monitoringMode".
         */
        public MonitoredItemCreateRequest.Builder<_B> withMonitoringMode(final MonitoringMode monitoringMode) {
            this.monitoringMode = monitoringMode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedParameters" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param requestedParameters
         *     Neuer Wert der Eigenschaft "requestedParameters".
         */
        public MonitoredItemCreateRequest.Builder<_B> withRequestedParameters(final JAXBElement<MonitoringParameters> requestedParameters) {
            this.requestedParameters = requestedParameters;
            return this;
        }

        @Override
        public MonitoredItemCreateRequest build() {
            if (_storedValue == null) {
                return this.init(new MonitoredItemCreateRequest());
            } else {
                return ((MonitoredItemCreateRequest) _storedValue);
            }
        }

        public MonitoredItemCreateRequest.Builder<_B> copyOf(final MonitoredItemCreateRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public MonitoredItemCreateRequest.Builder<_B> copyOf(final MonitoredItemCreateRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends MonitoredItemCreateRequest.Selector<MonitoredItemCreateRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static MonitoredItemCreateRequest.Select _root() {
            return new MonitoredItemCreateRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateRequest.Selector<TRoot, TParent>> itemToMonitor = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateRequest.Selector<TRoot, TParent>> monitoringMode = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateRequest.Selector<TRoot, TParent>> requestedParameters = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.itemToMonitor!= null) {
                products.put("itemToMonitor", this.itemToMonitor.init());
            }
            if (this.monitoringMode!= null) {
                products.put("monitoringMode", this.monitoringMode.init());
            }
            if (this.requestedParameters!= null) {
                products.put("requestedParameters", this.requestedParameters.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateRequest.Selector<TRoot, TParent>> itemToMonitor() {
            return ((this.itemToMonitor == null)?this.itemToMonitor = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateRequest.Selector<TRoot, TParent>>(this._root, this, "itemToMonitor"):this.itemToMonitor);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateRequest.Selector<TRoot, TParent>> monitoringMode() {
            return ((this.monitoringMode == null)?this.monitoringMode = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateRequest.Selector<TRoot, TParent>>(this._root, this, "monitoringMode"):this.monitoringMode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateRequest.Selector<TRoot, TParent>> requestedParameters() {
            return ((this.requestedParameters == null)?this.requestedParameters = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemCreateRequest.Selector<TRoot, TParent>>(this._root, this, "requestedParameters"):this.requestedParameters);
        }

    }

}
