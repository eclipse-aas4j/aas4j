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
 * <p>Java-Klasse für BrokerDataSetReaderTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BrokerDataSetReaderTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetReaderTransportDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationProfileUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryGuarantee" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrokerTransportQualityOfService" minOccurs="0"/&gt;
 *         &lt;element name="MetaDataQueueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokerDataSetReaderTransportDataType", propOrder = {
    "queueName",
    "resourceUri",
    "authenticationProfileUri",
    "requestedDeliveryGuarantee",
    "metaDataQueueName"
})
public class BrokerDataSetReaderTransportDataType
    extends DataSetReaderTransportDataType
{

    @XmlElementRef(name = "QueueName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queueName;
    @XmlElementRef(name = "ResourceUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceUri;
    @XmlElementRef(name = "AuthenticationProfileUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticationProfileUri;
    @XmlElement(name = "RequestedDeliveryGuarantee")
    @XmlSchemaType(name = "string")
    protected BrokerTransportQualityOfService requestedDeliveryGuarantee;
    @XmlElementRef(name = "MetaDataQueueName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> metaDataQueueName;

    /**
     * Ruft den Wert der queueName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueueName() {
        return queueName;
    }

    /**
     * Legt den Wert der queueName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueueName(JAXBElement<String> value) {
        this.queueName = value;
    }

    /**
     * Ruft den Wert der resourceUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceUri() {
        return resourceUri;
    }

    /**
     * Legt den Wert der resourceUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceUri(JAXBElement<String> value) {
        this.resourceUri = value;
    }

    /**
     * Ruft den Wert der authenticationProfileUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticationProfileUri() {
        return authenticationProfileUri;
    }

    /**
     * Legt den Wert der authenticationProfileUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticationProfileUri(JAXBElement<String> value) {
        this.authenticationProfileUri = value;
    }

    /**
     * Ruft den Wert der requestedDeliveryGuarantee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BrokerTransportQualityOfService }
     *     
     */
    public BrokerTransportQualityOfService getRequestedDeliveryGuarantee() {
        return requestedDeliveryGuarantee;
    }

    /**
     * Legt den Wert der requestedDeliveryGuarantee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerTransportQualityOfService }
     *     
     */
    public void setRequestedDeliveryGuarantee(BrokerTransportQualityOfService value) {
        this.requestedDeliveryGuarantee = value;
    }

    /**
     * Ruft den Wert der metaDataQueueName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMetaDataQueueName() {
        return metaDataQueueName;
    }

    /**
     * Legt den Wert der metaDataQueueName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMetaDataQueueName(JAXBElement<String> value) {
        this.metaDataQueueName = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final BrokerDataSetReaderTransportDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.queueName = this.queueName;
        _other.resourceUri = this.resourceUri;
        _other.authenticationProfileUri = this.authenticationProfileUri;
        _other.requestedDeliveryGuarantee = this.requestedDeliveryGuarantee;
        _other.metaDataQueueName = this.metaDataQueueName;
    }

    @Override
    public<_B >BrokerDataSetReaderTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new BrokerDataSetReaderTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public BrokerDataSetReaderTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static BrokerDataSetReaderTransportDataType.Builder<Void> builder() {
        return new BrokerDataSetReaderTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >BrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final DataSetReaderTransportDataType _other) {
        final BrokerDataSetReaderTransportDataType.Builder<_B> _newBuilder = new BrokerDataSetReaderTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >BrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final BrokerDataSetReaderTransportDataType _other) {
        final BrokerDataSetReaderTransportDataType.Builder<_B> _newBuilder = new BrokerDataSetReaderTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final BrokerDataSetReaderTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree queueNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queueName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queueNamePropertyTree!= null):((queueNamePropertyTree == null)||(!queueNamePropertyTree.isLeaf())))) {
            _other.queueName = this.queueName;
        }
        final PropertyTree resourceUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("resourceUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resourceUriPropertyTree!= null):((resourceUriPropertyTree == null)||(!resourceUriPropertyTree.isLeaf())))) {
            _other.resourceUri = this.resourceUri;
        }
        final PropertyTree authenticationProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationProfileUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationProfileUriPropertyTree!= null):((authenticationProfileUriPropertyTree == null)||(!authenticationProfileUriPropertyTree.isLeaf())))) {
            _other.authenticationProfileUri = this.authenticationProfileUri;
        }
        final PropertyTree requestedDeliveryGuaranteePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedDeliveryGuarantee"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedDeliveryGuaranteePropertyTree!= null):((requestedDeliveryGuaranteePropertyTree == null)||(!requestedDeliveryGuaranteePropertyTree.isLeaf())))) {
            _other.requestedDeliveryGuarantee = this.requestedDeliveryGuarantee;
        }
        final PropertyTree metaDataQueueNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("metaDataQueueName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(metaDataQueueNamePropertyTree!= null):((metaDataQueueNamePropertyTree == null)||(!metaDataQueueNamePropertyTree.isLeaf())))) {
            _other.metaDataQueueName = this.metaDataQueueName;
        }
    }

    @Override
    public<_B >BrokerDataSetReaderTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new BrokerDataSetReaderTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public BrokerDataSetReaderTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >BrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final DataSetReaderTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BrokerDataSetReaderTransportDataType.Builder<_B> _newBuilder = new BrokerDataSetReaderTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >BrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final BrokerDataSetReaderTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BrokerDataSetReaderTransportDataType.Builder<_B> _newBuilder = new BrokerDataSetReaderTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static BrokerDataSetReaderTransportDataType.Builder<Void> copyExcept(final DataSetReaderTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BrokerDataSetReaderTransportDataType.Builder<Void> copyExcept(final BrokerDataSetReaderTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BrokerDataSetReaderTransportDataType.Builder<Void> copyOnly(final DataSetReaderTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static BrokerDataSetReaderTransportDataType.Builder<Void> copyOnly(final BrokerDataSetReaderTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataSetReaderTransportDataType.Builder<_B>
        implements Buildable
    {

        private JAXBElement<String> queueName;
        private JAXBElement<String> resourceUri;
        private JAXBElement<String> authenticationProfileUri;
        private BrokerTransportQualityOfService requestedDeliveryGuarantee;
        private JAXBElement<String> metaDataQueueName;

        public Builder(final _B _parentBuilder, final BrokerDataSetReaderTransportDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.queueName = _other.queueName;
                this.resourceUri = _other.resourceUri;
                this.authenticationProfileUri = _other.authenticationProfileUri;
                this.requestedDeliveryGuarantee = _other.requestedDeliveryGuarantee;
                this.metaDataQueueName = _other.metaDataQueueName;
            }
        }

        public Builder(final _B _parentBuilder, final BrokerDataSetReaderTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree queueNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queueName"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queueNamePropertyTree!= null):((queueNamePropertyTree == null)||(!queueNamePropertyTree.isLeaf())))) {
                    this.queueName = _other.queueName;
                }
                final PropertyTree resourceUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("resourceUri"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resourceUriPropertyTree!= null):((resourceUriPropertyTree == null)||(!resourceUriPropertyTree.isLeaf())))) {
                    this.resourceUri = _other.resourceUri;
                }
                final PropertyTree authenticationProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationProfileUri"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationProfileUriPropertyTree!= null):((authenticationProfileUriPropertyTree == null)||(!authenticationProfileUriPropertyTree.isLeaf())))) {
                    this.authenticationProfileUri = _other.authenticationProfileUri;
                }
                final PropertyTree requestedDeliveryGuaranteePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestedDeliveryGuarantee"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestedDeliveryGuaranteePropertyTree!= null):((requestedDeliveryGuaranteePropertyTree == null)||(!requestedDeliveryGuaranteePropertyTree.isLeaf())))) {
                    this.requestedDeliveryGuarantee = _other.requestedDeliveryGuarantee;
                }
                final PropertyTree metaDataQueueNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("metaDataQueueName"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(metaDataQueueNamePropertyTree!= null):((metaDataQueueNamePropertyTree == null)||(!metaDataQueueNamePropertyTree.isLeaf())))) {
                    this.metaDataQueueName = _other.metaDataQueueName;
                }
            }
        }

        protected<_P extends BrokerDataSetReaderTransportDataType >_P init(final _P _product) {
            _product.queueName = this.queueName;
            _product.resourceUri = this.resourceUri;
            _product.authenticationProfileUri = this.authenticationProfileUri;
            _product.requestedDeliveryGuarantee = this.requestedDeliveryGuarantee;
            _product.metaDataQueueName = this.metaDataQueueName;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "queueName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param queueName
         *     Neuer Wert der Eigenschaft "queueName".
         */
        public BrokerDataSetReaderTransportDataType.Builder<_B> withQueueName(final JAXBElement<String> queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "resourceUri" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param resourceUri
         *     Neuer Wert der Eigenschaft "resourceUri".
         */
        public BrokerDataSetReaderTransportDataType.Builder<_B> withResourceUri(final JAXBElement<String> resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "authenticationProfileUri" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param authenticationProfileUri
         *     Neuer Wert der Eigenschaft "authenticationProfileUri".
         */
        public BrokerDataSetReaderTransportDataType.Builder<_B> withAuthenticationProfileUri(final JAXBElement<String> authenticationProfileUri) {
            this.authenticationProfileUri = authenticationProfileUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestedDeliveryGuarantee" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param requestedDeliveryGuarantee
         *     Neuer Wert der Eigenschaft "requestedDeliveryGuarantee".
         */
        public BrokerDataSetReaderTransportDataType.Builder<_B> withRequestedDeliveryGuarantee(final BrokerTransportQualityOfService requestedDeliveryGuarantee) {
            this.requestedDeliveryGuarantee = requestedDeliveryGuarantee;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "metaDataQueueName" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param metaDataQueueName
         *     Neuer Wert der Eigenschaft "metaDataQueueName".
         */
        public BrokerDataSetReaderTransportDataType.Builder<_B> withMetaDataQueueName(final JAXBElement<String> metaDataQueueName) {
            this.metaDataQueueName = metaDataQueueName;
            return this;
        }

        @Override
        public BrokerDataSetReaderTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new BrokerDataSetReaderTransportDataType());
            } else {
                return ((BrokerDataSetReaderTransportDataType) _storedValue);
            }
        }

        public BrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final BrokerDataSetReaderTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public BrokerDataSetReaderTransportDataType.Builder<_B> copyOf(final BrokerDataSetReaderTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends BrokerDataSetReaderTransportDataType.Selector<BrokerDataSetReaderTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static BrokerDataSetReaderTransportDataType.Select _root() {
            return new BrokerDataSetReaderTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataSetReaderTransportDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> queueName = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> resourceUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> authenticationProfileUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> requestedDeliveryGuarantee = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> metaDataQueueName = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.queueName!= null) {
                products.put("queueName", this.queueName.init());
            }
            if (this.resourceUri!= null) {
                products.put("resourceUri", this.resourceUri.init());
            }
            if (this.authenticationProfileUri!= null) {
                products.put("authenticationProfileUri", this.authenticationProfileUri.init());
            }
            if (this.requestedDeliveryGuarantee!= null) {
                products.put("requestedDeliveryGuarantee", this.requestedDeliveryGuarantee.init());
            }
            if (this.metaDataQueueName!= null) {
                products.put("metaDataQueueName", this.metaDataQueueName.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> queueName() {
            return ((this.queueName == null)?this.queueName = new com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>>(this._root, this, "queueName"):this.queueName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> resourceUri() {
            return ((this.resourceUri == null)?this.resourceUri = new com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>>(this._root, this, "resourceUri"):this.resourceUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> authenticationProfileUri() {
            return ((this.authenticationProfileUri == null)?this.authenticationProfileUri = new com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>>(this._root, this, "authenticationProfileUri"):this.authenticationProfileUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> requestedDeliveryGuarantee() {
            return ((this.requestedDeliveryGuarantee == null)?this.requestedDeliveryGuarantee = new com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>>(this._root, this, "requestedDeliveryGuarantee"):this.requestedDeliveryGuarantee);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>> metaDataQueueName() {
            return ((this.metaDataQueueName == null)?this.metaDataQueueName = new com.kscs.util.jaxb.Selector<TRoot, BrokerDataSetReaderTransportDataType.Selector<TRoot, TParent>>(this._root, this, "metaDataQueueName"):this.metaDataQueueName);
        }

    }

}
