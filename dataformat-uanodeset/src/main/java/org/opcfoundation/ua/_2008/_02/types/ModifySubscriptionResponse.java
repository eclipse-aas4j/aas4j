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
 * <p>Java-Klasse für ModifySubscriptionResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModifySubscriptionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="RevisedPublishingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RevisedLifetimeCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RevisedMaxKeepAliveCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifySubscriptionResponse", propOrder = {
    "responseHeader",
    "revisedPublishingInterval",
    "revisedLifetimeCount",
    "revisedMaxKeepAliveCount"
})
public class ModifySubscriptionResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElement(name = "RevisedPublishingInterval")
    protected Double revisedPublishingInterval;
    @XmlElement(name = "RevisedLifetimeCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long revisedLifetimeCount;
    @XmlElement(name = "RevisedMaxKeepAliveCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long revisedMaxKeepAliveCount;

    /**
     * Ruft den Wert der responseHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}
     *     
     */
    public JAXBElement<ResponseHeader> getResponseHeader() {
        return responseHeader;
    }

    /**
     * Legt den Wert der responseHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}
     *     
     */
    public void setResponseHeader(JAXBElement<ResponseHeader> value) {
        this.responseHeader = value;
    }

    /**
     * Ruft den Wert der revisedPublishingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRevisedPublishingInterval() {
        return revisedPublishingInterval;
    }

    /**
     * Legt den Wert der revisedPublishingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRevisedPublishingInterval(Double value) {
        this.revisedPublishingInterval = value;
    }

    /**
     * Ruft den Wert der revisedLifetimeCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevisedLifetimeCount() {
        return revisedLifetimeCount;
    }

    /**
     * Legt den Wert der revisedLifetimeCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevisedLifetimeCount(Long value) {
        this.revisedLifetimeCount = value;
    }

    /**
     * Ruft den Wert der revisedMaxKeepAliveCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevisedMaxKeepAliveCount() {
        return revisedMaxKeepAliveCount;
    }

    /**
     * Legt den Wert der revisedMaxKeepAliveCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevisedMaxKeepAliveCount(Long value) {
        this.revisedMaxKeepAliveCount = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ModifySubscriptionResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.revisedPublishingInterval = this.revisedPublishingInterval;
        _other.revisedLifetimeCount = this.revisedLifetimeCount;
        _other.revisedMaxKeepAliveCount = this.revisedMaxKeepAliveCount;
    }

    public<_B >ModifySubscriptionResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ModifySubscriptionResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public ModifySubscriptionResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ModifySubscriptionResponse.Builder<Void> builder() {
        return new ModifySubscriptionResponse.Builder<Void>(null, null, false);
    }

    public static<_B >ModifySubscriptionResponse.Builder<_B> copyOf(final ModifySubscriptionResponse _other) {
        final ModifySubscriptionResponse.Builder<_B> _newBuilder = new ModifySubscriptionResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ModifySubscriptionResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree revisedPublishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedPublishingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedPublishingIntervalPropertyTree!= null):((revisedPublishingIntervalPropertyTree == null)||(!revisedPublishingIntervalPropertyTree.isLeaf())))) {
            _other.revisedPublishingInterval = this.revisedPublishingInterval;
        }
        final PropertyTree revisedLifetimeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedLifetimeCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedLifetimeCountPropertyTree!= null):((revisedLifetimeCountPropertyTree == null)||(!revisedLifetimeCountPropertyTree.isLeaf())))) {
            _other.revisedLifetimeCount = this.revisedLifetimeCount;
        }
        final PropertyTree revisedMaxKeepAliveCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedMaxKeepAliveCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedMaxKeepAliveCountPropertyTree!= null):((revisedMaxKeepAliveCountPropertyTree == null)||(!revisedMaxKeepAliveCountPropertyTree.isLeaf())))) {
            _other.revisedMaxKeepAliveCount = this.revisedMaxKeepAliveCount;
        }
    }

    public<_B >ModifySubscriptionResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ModifySubscriptionResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ModifySubscriptionResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ModifySubscriptionResponse.Builder<_B> copyOf(final ModifySubscriptionResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ModifySubscriptionResponse.Builder<_B> _newBuilder = new ModifySubscriptionResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ModifySubscriptionResponse.Builder<Void> copyExcept(final ModifySubscriptionResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ModifySubscriptionResponse.Builder<Void> copyOnly(final ModifySubscriptionResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ModifySubscriptionResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private Double revisedPublishingInterval;
        private Long revisedLifetimeCount;
        private Long revisedMaxKeepAliveCount;

        public Builder(final _B _parentBuilder, final ModifySubscriptionResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.revisedPublishingInterval = _other.revisedPublishingInterval;
                    this.revisedLifetimeCount = _other.revisedLifetimeCount;
                    this.revisedMaxKeepAliveCount = _other.revisedMaxKeepAliveCount;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ModifySubscriptionResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree revisedPublishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedPublishingInterval"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedPublishingIntervalPropertyTree!= null):((revisedPublishingIntervalPropertyTree == null)||(!revisedPublishingIntervalPropertyTree.isLeaf())))) {
                        this.revisedPublishingInterval = _other.revisedPublishingInterval;
                    }
                    final PropertyTree revisedLifetimeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedLifetimeCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedLifetimeCountPropertyTree!= null):((revisedLifetimeCountPropertyTree == null)||(!revisedLifetimeCountPropertyTree.isLeaf())))) {
                        this.revisedLifetimeCount = _other.revisedLifetimeCount;
                    }
                    final PropertyTree revisedMaxKeepAliveCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedMaxKeepAliveCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedMaxKeepAliveCountPropertyTree!= null):((revisedMaxKeepAliveCountPropertyTree == null)||(!revisedMaxKeepAliveCountPropertyTree.isLeaf())))) {
                        this.revisedMaxKeepAliveCount = _other.revisedMaxKeepAliveCount;
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

        protected<_P extends ModifySubscriptionResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.revisedPublishingInterval = this.revisedPublishingInterval;
            _product.revisedLifetimeCount = this.revisedLifetimeCount;
            _product.revisedMaxKeepAliveCount = this.revisedMaxKeepAliveCount;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public ModifySubscriptionResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedPublishingInterval" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param revisedPublishingInterval
         *     Neuer Wert der Eigenschaft "revisedPublishingInterval".
         */
        public ModifySubscriptionResponse.Builder<_B> withRevisedPublishingInterval(final Double revisedPublishingInterval) {
            this.revisedPublishingInterval = revisedPublishingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedLifetimeCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param revisedLifetimeCount
         *     Neuer Wert der Eigenschaft "revisedLifetimeCount".
         */
        public ModifySubscriptionResponse.Builder<_B> withRevisedLifetimeCount(final Long revisedLifetimeCount) {
            this.revisedLifetimeCount = revisedLifetimeCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedMaxKeepAliveCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param revisedMaxKeepAliveCount
         *     Neuer Wert der Eigenschaft "revisedMaxKeepAliveCount".
         */
        public ModifySubscriptionResponse.Builder<_B> withRevisedMaxKeepAliveCount(final Long revisedMaxKeepAliveCount) {
            this.revisedMaxKeepAliveCount = revisedMaxKeepAliveCount;
            return this;
        }

        @Override
        public ModifySubscriptionResponse build() {
            if (_storedValue == null) {
                return this.init(new ModifySubscriptionResponse());
            } else {
                return ((ModifySubscriptionResponse) _storedValue);
            }
        }

        public ModifySubscriptionResponse.Builder<_B> copyOf(final ModifySubscriptionResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public ModifySubscriptionResponse.Builder<_B> copyOf(final ModifySubscriptionResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ModifySubscriptionResponse.Selector<ModifySubscriptionResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ModifySubscriptionResponse.Select _root() {
            return new ModifySubscriptionResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>> revisedPublishingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>> revisedLifetimeCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>> revisedMaxKeepAliveCount = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.responseHeader!= null) {
                products.put("responseHeader", this.responseHeader.init());
            }
            if (this.revisedPublishingInterval!= null) {
                products.put("revisedPublishingInterval", this.revisedPublishingInterval.init());
            }
            if (this.revisedLifetimeCount!= null) {
                products.put("revisedLifetimeCount", this.revisedLifetimeCount.init());
            }
            if (this.revisedMaxKeepAliveCount!= null) {
                products.put("revisedMaxKeepAliveCount", this.revisedMaxKeepAliveCount.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>> revisedPublishingInterval() {
            return ((this.revisedPublishingInterval == null)?this.revisedPublishingInterval = new com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>>(this._root, this, "revisedPublishingInterval"):this.revisedPublishingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>> revisedLifetimeCount() {
            return ((this.revisedLifetimeCount == null)?this.revisedLifetimeCount = new com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>>(this._root, this, "revisedLifetimeCount"):this.revisedLifetimeCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>> revisedMaxKeepAliveCount() {
            return ((this.revisedMaxKeepAliveCount == null)?this.revisedMaxKeepAliveCount = new com.kscs.util.jaxb.Selector<TRoot, ModifySubscriptionResponse.Selector<TRoot, TParent>>(this._root, this, "revisedMaxKeepAliveCount"):this.revisedMaxKeepAliveCount);
        }

    }

}
