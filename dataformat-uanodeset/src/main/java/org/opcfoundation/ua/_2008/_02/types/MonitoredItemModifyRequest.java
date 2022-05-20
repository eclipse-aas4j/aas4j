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
 * <p>Java-Klasse für MonitoredItemModifyRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MonitoredItemModifyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitoredItemId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
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
@XmlType(name = "MonitoredItemModifyRequest", propOrder = {
    "monitoredItemId",
    "requestedParameters"
})
public class MonitoredItemModifyRequest {

    @XmlElement(name = "MonitoredItemId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long monitoredItemId;
    @XmlElementRef(name = "RequestedParameters", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MonitoringParameters> requestedParameters;

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
    public<_B >void copyTo(final MonitoredItemModifyRequest.Builder<_B> _other) {
        _other.monitoredItemId = this.monitoredItemId;
        _other.requestedParameters = this.requestedParameters;
    }

    public<_B >MonitoredItemModifyRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new MonitoredItemModifyRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public MonitoredItemModifyRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static MonitoredItemModifyRequest.Builder<Void> builder() {
        return new MonitoredItemModifyRequest.Builder<Void>(null, null, false);
    }

    public static<_B >MonitoredItemModifyRequest.Builder<_B> copyOf(final MonitoredItemModifyRequest _other) {
        final MonitoredItemModifyRequest.Builder<_B> _newBuilder = new MonitoredItemModifyRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final MonitoredItemModifyRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree monitoredItemIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemIdPropertyTree!= null):((monitoredItemIdPropertyTree == null)||(!monitoredItemIdPropertyTree.isLeaf())))) {
            _other.monitoredItemId = this.monitoredItemId;
        }
        final PropertyTree requestedParametersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedParameters"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedParametersPropertyTree!= null):((requestedParametersPropertyTree == null)||(!requestedParametersPropertyTree.isLeaf())))) {
            _other.requestedParameters = this.requestedParameters;
        }
    }

    public<_B >MonitoredItemModifyRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new MonitoredItemModifyRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public MonitoredItemModifyRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >MonitoredItemModifyRequest.Builder<_B> copyOf(final MonitoredItemModifyRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MonitoredItemModifyRequest.Builder<_B> _newBuilder = new MonitoredItemModifyRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static MonitoredItemModifyRequest.Builder<Void> copyExcept(final MonitoredItemModifyRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MonitoredItemModifyRequest.Builder<Void> copyOnly(final MonitoredItemModifyRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final MonitoredItemModifyRequest _storedValue;
        private Long monitoredItemId;
        private JAXBElement<MonitoringParameters> requestedParameters;

        public Builder(final _B _parentBuilder, final MonitoredItemModifyRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.monitoredItemId = _other.monitoredItemId;
                    this.requestedParameters = _other.requestedParameters;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final MonitoredItemModifyRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree monitoredItemIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemIdPropertyTree!= null):((monitoredItemIdPropertyTree == null)||(!monitoredItemIdPropertyTree.isLeaf())))) {
                        this.monitoredItemId = _other.monitoredItemId;
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

        protected<_P extends MonitoredItemModifyRequest >_P init(final _P _product) {
            _product.monitoredItemId = this.monitoredItemId;
            _product.requestedParameters = this.requestedParameters;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param monitoredItemId
         *     Neuer Wert der Eigenschaft "monitoredItemId".
         */
        public MonitoredItemModifyRequest.Builder<_B> withMonitoredItemId(final Long monitoredItemId) {
            this.monitoredItemId = monitoredItemId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedParameters" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param requestedParameters
         *     Neuer Wert der Eigenschaft "requestedParameters".
         */
        public MonitoredItemModifyRequest.Builder<_B> withRequestedParameters(final JAXBElement<MonitoringParameters> requestedParameters) {
            this.requestedParameters = requestedParameters;
            return this;
        }

        @Override
        public MonitoredItemModifyRequest build() {
            if (_storedValue == null) {
                return this.init(new MonitoredItemModifyRequest());
            } else {
                return ((MonitoredItemModifyRequest) _storedValue);
            }
        }

        public MonitoredItemModifyRequest.Builder<_B> copyOf(final MonitoredItemModifyRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public MonitoredItemModifyRequest.Builder<_B> copyOf(final MonitoredItemModifyRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends MonitoredItemModifyRequest.Selector<MonitoredItemModifyRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static MonitoredItemModifyRequest.Select _root() {
            return new MonitoredItemModifyRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemModifyRequest.Selector<TRoot, TParent>> monitoredItemId = null;
        private com.kscs.util.jaxb.Selector<TRoot, MonitoredItemModifyRequest.Selector<TRoot, TParent>> requestedParameters = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.monitoredItemId!= null) {
                products.put("monitoredItemId", this.monitoredItemId.init());
            }
            if (this.requestedParameters!= null) {
                products.put("requestedParameters", this.requestedParameters.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemModifyRequest.Selector<TRoot, TParent>> monitoredItemId() {
            return ((this.monitoredItemId == null)?this.monitoredItemId = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemModifyRequest.Selector<TRoot, TParent>>(this._root, this, "monitoredItemId"):this.monitoredItemId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MonitoredItemModifyRequest.Selector<TRoot, TParent>> requestedParameters() {
            return ((this.requestedParameters == null)?this.requestedParameters = new com.kscs.util.jaxb.Selector<TRoot, MonitoredItemModifyRequest.Selector<TRoot, TParent>>(this._root, this, "requestedParameters"):this.requestedParameters);
        }

    }

}
