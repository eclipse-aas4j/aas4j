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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für BrokerConnectionTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BrokerConnectionTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}ConnectionTransportDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationProfileUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokerConnectionTransportDataType", propOrder = {
    "resourceUri",
    "authenticationProfileUri"
})
public class BrokerConnectionTransportDataType
    extends ConnectionTransportDataType
{

    @XmlElementRef(name = "ResourceUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceUri;
    @XmlElementRef(name = "AuthenticationProfileUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticationProfileUri;

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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final BrokerConnectionTransportDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.resourceUri = this.resourceUri;
        _other.authenticationProfileUri = this.authenticationProfileUri;
    }

    @Override
    public<_B >BrokerConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new BrokerConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public BrokerConnectionTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static BrokerConnectionTransportDataType.Builder<Void> builder() {
        return new BrokerConnectionTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >BrokerConnectionTransportDataType.Builder<_B> copyOf(final ConnectionTransportDataType _other) {
        final BrokerConnectionTransportDataType.Builder<_B> _newBuilder = new BrokerConnectionTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >BrokerConnectionTransportDataType.Builder<_B> copyOf(final BrokerConnectionTransportDataType _other) {
        final BrokerConnectionTransportDataType.Builder<_B> _newBuilder = new BrokerConnectionTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final BrokerConnectionTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree resourceUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("resourceUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resourceUriPropertyTree!= null):((resourceUriPropertyTree == null)||(!resourceUriPropertyTree.isLeaf())))) {
            _other.resourceUri = this.resourceUri;
        }
        final PropertyTree authenticationProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationProfileUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationProfileUriPropertyTree!= null):((authenticationProfileUriPropertyTree == null)||(!authenticationProfileUriPropertyTree.isLeaf())))) {
            _other.authenticationProfileUri = this.authenticationProfileUri;
        }
    }

    @Override
    public<_B >BrokerConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new BrokerConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public BrokerConnectionTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >BrokerConnectionTransportDataType.Builder<_B> copyOf(final ConnectionTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BrokerConnectionTransportDataType.Builder<_B> _newBuilder = new BrokerConnectionTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >BrokerConnectionTransportDataType.Builder<_B> copyOf(final BrokerConnectionTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BrokerConnectionTransportDataType.Builder<_B> _newBuilder = new BrokerConnectionTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static BrokerConnectionTransportDataType.Builder<Void> copyExcept(final ConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BrokerConnectionTransportDataType.Builder<Void> copyExcept(final BrokerConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BrokerConnectionTransportDataType.Builder<Void> copyOnly(final ConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static BrokerConnectionTransportDataType.Builder<Void> copyOnly(final BrokerConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends ConnectionTransportDataType.Builder<_B>
        implements Buildable
    {

        private JAXBElement<String> resourceUri;
        private JAXBElement<String> authenticationProfileUri;

        public Builder(final _B _parentBuilder, final BrokerConnectionTransportDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.resourceUri = _other.resourceUri;
                this.authenticationProfileUri = _other.authenticationProfileUri;
            }
        }

        public Builder(final _B _parentBuilder, final BrokerConnectionTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree resourceUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("resourceUri"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resourceUriPropertyTree!= null):((resourceUriPropertyTree == null)||(!resourceUriPropertyTree.isLeaf())))) {
                    this.resourceUri = _other.resourceUri;
                }
                final PropertyTree authenticationProfileUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("authenticationProfileUri"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(authenticationProfileUriPropertyTree!= null):((authenticationProfileUriPropertyTree == null)||(!authenticationProfileUriPropertyTree.isLeaf())))) {
                    this.authenticationProfileUri = _other.authenticationProfileUri;
                }
            }
        }

        protected<_P extends BrokerConnectionTransportDataType >_P init(final _P _product) {
            _product.resourceUri = this.resourceUri;
            _product.authenticationProfileUri = this.authenticationProfileUri;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "resourceUri" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param resourceUri
         *     Neuer Wert der Eigenschaft "resourceUri".
         */
        public BrokerConnectionTransportDataType.Builder<_B> withResourceUri(final JAXBElement<String> resourceUri) {
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
        public BrokerConnectionTransportDataType.Builder<_B> withAuthenticationProfileUri(final JAXBElement<String> authenticationProfileUri) {
            this.authenticationProfileUri = authenticationProfileUri;
            return this;
        }

        @Override
        public BrokerConnectionTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new BrokerConnectionTransportDataType());
            } else {
                return ((BrokerConnectionTransportDataType) _storedValue);
            }
        }

        public BrokerConnectionTransportDataType.Builder<_B> copyOf(final BrokerConnectionTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public BrokerConnectionTransportDataType.Builder<_B> copyOf(final BrokerConnectionTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends BrokerConnectionTransportDataType.Selector<BrokerConnectionTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static BrokerConnectionTransportDataType.Select _root() {
            return new BrokerConnectionTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends ConnectionTransportDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, BrokerConnectionTransportDataType.Selector<TRoot, TParent>> resourceUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrokerConnectionTransportDataType.Selector<TRoot, TParent>> authenticationProfileUri = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.resourceUri!= null) {
                products.put("resourceUri", this.resourceUri.init());
            }
            if (this.authenticationProfileUri!= null) {
                products.put("authenticationProfileUri", this.authenticationProfileUri.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrokerConnectionTransportDataType.Selector<TRoot, TParent>> resourceUri() {
            return ((this.resourceUri == null)?this.resourceUri = new com.kscs.util.jaxb.Selector<TRoot, BrokerConnectionTransportDataType.Selector<TRoot, TParent>>(this._root, this, "resourceUri"):this.resourceUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrokerConnectionTransportDataType.Selector<TRoot, TParent>> authenticationProfileUri() {
            return ((this.authenticationProfileUri == null)?this.authenticationProfileUri = new com.kscs.util.jaxb.Selector<TRoot, BrokerConnectionTransportDataType.Selector<TRoot, TParent>>(this._root, this, "authenticationProfileUri"):this.authenticationProfileUri);
        }

    }

}
