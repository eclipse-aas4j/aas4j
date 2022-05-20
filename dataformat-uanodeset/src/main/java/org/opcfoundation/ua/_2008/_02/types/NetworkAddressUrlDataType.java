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
 * <p>Java-Klasse für NetworkAddressUrlDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkAddressUrlDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NetworkAddressDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkAddressUrlDataType", propOrder = {
    "url"
})
public class NetworkAddressUrlDataType
    extends NetworkAddressDataType
{

    @XmlElementRef(name = "Url", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl(JAXBElement<String> value) {
        this.url = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final NetworkAddressUrlDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.url = this.url;
    }

    @Override
    public<_B >NetworkAddressUrlDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new NetworkAddressUrlDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public NetworkAddressUrlDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static NetworkAddressUrlDataType.Builder<Void> builder() {
        return new NetworkAddressUrlDataType.Builder<Void>(null, null, false);
    }

    public static<_B >NetworkAddressUrlDataType.Builder<_B> copyOf(final NetworkAddressDataType _other) {
        final NetworkAddressUrlDataType.Builder<_B> _newBuilder = new NetworkAddressUrlDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >NetworkAddressUrlDataType.Builder<_B> copyOf(final NetworkAddressUrlDataType _other) {
        final NetworkAddressUrlDataType.Builder<_B> _newBuilder = new NetworkAddressUrlDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final NetworkAddressUrlDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree urlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("url"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(urlPropertyTree!= null):((urlPropertyTree == null)||(!urlPropertyTree.isLeaf())))) {
            _other.url = this.url;
        }
    }

    @Override
    public<_B >NetworkAddressUrlDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new NetworkAddressUrlDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public NetworkAddressUrlDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >NetworkAddressUrlDataType.Builder<_B> copyOf(final NetworkAddressDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final NetworkAddressUrlDataType.Builder<_B> _newBuilder = new NetworkAddressUrlDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >NetworkAddressUrlDataType.Builder<_B> copyOf(final NetworkAddressUrlDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final NetworkAddressUrlDataType.Builder<_B> _newBuilder = new NetworkAddressUrlDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static NetworkAddressUrlDataType.Builder<Void> copyExcept(final NetworkAddressDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static NetworkAddressUrlDataType.Builder<Void> copyExcept(final NetworkAddressUrlDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static NetworkAddressUrlDataType.Builder<Void> copyOnly(final NetworkAddressDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static NetworkAddressUrlDataType.Builder<Void> copyOnly(final NetworkAddressUrlDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NetworkAddressDataType.Builder<_B>
        implements Buildable
    {

        private JAXBElement<String> url;

        public Builder(final _B _parentBuilder, final NetworkAddressUrlDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.url = _other.url;
            }
        }

        public Builder(final _B _parentBuilder, final NetworkAddressUrlDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree urlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("url"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(urlPropertyTree!= null):((urlPropertyTree == null)||(!urlPropertyTree.isLeaf())))) {
                    this.url = _other.url;
                }
            }
        }

        protected<_P extends NetworkAddressUrlDataType >_P init(final _P _product) {
            _product.url = this.url;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "url" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param url
         *     Neuer Wert der Eigenschaft "url".
         */
        public NetworkAddressUrlDataType.Builder<_B> withUrl(final JAXBElement<String> url) {
            this.url = url;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "networkInterface" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param networkInterface
         *     Neuer Wert der Eigenschaft "networkInterface".
         */
        @Override
        public NetworkAddressUrlDataType.Builder<_B> withNetworkInterface(final JAXBElement<String> networkInterface) {
            super.withNetworkInterface(networkInterface);
            return this;
        }

        @Override
        public NetworkAddressUrlDataType build() {
            if (_storedValue == null) {
                return this.init(new NetworkAddressUrlDataType());
            } else {
                return ((NetworkAddressUrlDataType) _storedValue);
            }
        }

        public NetworkAddressUrlDataType.Builder<_B> copyOf(final NetworkAddressUrlDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public NetworkAddressUrlDataType.Builder<_B> copyOf(final NetworkAddressUrlDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends NetworkAddressUrlDataType.Selector<NetworkAddressUrlDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static NetworkAddressUrlDataType.Select _root() {
            return new NetworkAddressUrlDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NetworkAddressDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, NetworkAddressUrlDataType.Selector<TRoot, TParent>> url = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.url!= null) {
                products.put("url", this.url.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, NetworkAddressUrlDataType.Selector<TRoot, TParent>> url() {
            return ((this.url == null)?this.url = new com.kscs.util.jaxb.Selector<TRoot, NetworkAddressUrlDataType.Selector<TRoot, TParent>>(this._root, this, "url"):this.url);
        }

    }

}
