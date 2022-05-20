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
 * <p>Java-Klasse für DatagramConnectionTransportDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DatagramConnectionTransportDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}ConnectionTransportDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscoveryAddress" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatagramConnectionTransportDataType", propOrder = {
    "discoveryAddress"
})
public class DatagramConnectionTransportDataType
    extends ConnectionTransportDataType
{

    @XmlElementRef(name = "DiscoveryAddress", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> discoveryAddress;

    /**
     * Ruft den Wert der discoveryAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getDiscoveryAddress() {
        return discoveryAddress;
    }

    /**
     * Legt den Wert der discoveryAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setDiscoveryAddress(JAXBElement<ExtensionObject> value) {
        this.discoveryAddress = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DatagramConnectionTransportDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.discoveryAddress = this.discoveryAddress;
    }

    @Override
    public<_B >DatagramConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DatagramConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public DatagramConnectionTransportDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DatagramConnectionTransportDataType.Builder<Void> builder() {
        return new DatagramConnectionTransportDataType.Builder<Void>(null, null, false);
    }

    public static<_B >DatagramConnectionTransportDataType.Builder<_B> copyOf(final ConnectionTransportDataType _other) {
        final DatagramConnectionTransportDataType.Builder<_B> _newBuilder = new DatagramConnectionTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DatagramConnectionTransportDataType.Builder<_B> copyOf(final DatagramConnectionTransportDataType _other) {
        final DatagramConnectionTransportDataType.Builder<_B> _newBuilder = new DatagramConnectionTransportDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DatagramConnectionTransportDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree discoveryAddressPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryAddress"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryAddressPropertyTree!= null):((discoveryAddressPropertyTree == null)||(!discoveryAddressPropertyTree.isLeaf())))) {
            _other.discoveryAddress = this.discoveryAddress;
        }
    }

    @Override
    public<_B >DatagramConnectionTransportDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DatagramConnectionTransportDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public DatagramConnectionTransportDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DatagramConnectionTransportDataType.Builder<_B> copyOf(final ConnectionTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DatagramConnectionTransportDataType.Builder<_B> _newBuilder = new DatagramConnectionTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DatagramConnectionTransportDataType.Builder<_B> copyOf(final DatagramConnectionTransportDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DatagramConnectionTransportDataType.Builder<_B> _newBuilder = new DatagramConnectionTransportDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DatagramConnectionTransportDataType.Builder<Void> copyExcept(final ConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DatagramConnectionTransportDataType.Builder<Void> copyExcept(final DatagramConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DatagramConnectionTransportDataType.Builder<Void> copyOnly(final ConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DatagramConnectionTransportDataType.Builder<Void> copyOnly(final DatagramConnectionTransportDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends ConnectionTransportDataType.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ExtensionObject> discoveryAddress;

        public Builder(final _B _parentBuilder, final DatagramConnectionTransportDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.discoveryAddress = _other.discoveryAddress;
            }
        }

        public Builder(final _B _parentBuilder, final DatagramConnectionTransportDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree discoveryAddressPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryAddress"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryAddressPropertyTree!= null):((discoveryAddressPropertyTree == null)||(!discoveryAddressPropertyTree.isLeaf())))) {
                    this.discoveryAddress = _other.discoveryAddress;
                }
            }
        }

        protected<_P extends DatagramConnectionTransportDataType >_P init(final _P _product) {
            _product.discoveryAddress = this.discoveryAddress;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "discoveryAddress" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param discoveryAddress
         *     Neuer Wert der Eigenschaft "discoveryAddress".
         */
        public DatagramConnectionTransportDataType.Builder<_B> withDiscoveryAddress(final JAXBElement<ExtensionObject> discoveryAddress) {
            this.discoveryAddress = discoveryAddress;
            return this;
        }

        @Override
        public DatagramConnectionTransportDataType build() {
            if (_storedValue == null) {
                return this.init(new DatagramConnectionTransportDataType());
            } else {
                return ((DatagramConnectionTransportDataType) _storedValue);
            }
        }

        public DatagramConnectionTransportDataType.Builder<_B> copyOf(final DatagramConnectionTransportDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public DatagramConnectionTransportDataType.Builder<_B> copyOf(final DatagramConnectionTransportDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DatagramConnectionTransportDataType.Selector<DatagramConnectionTransportDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DatagramConnectionTransportDataType.Select _root() {
            return new DatagramConnectionTransportDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends ConnectionTransportDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DatagramConnectionTransportDataType.Selector<TRoot, TParent>> discoveryAddress = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.discoveryAddress!= null) {
                products.put("discoveryAddress", this.discoveryAddress.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DatagramConnectionTransportDataType.Selector<TRoot, TParent>> discoveryAddress() {
            return ((this.discoveryAddress == null)?this.discoveryAddress = new com.kscs.util.jaxb.Selector<TRoot, DatagramConnectionTransportDataType.Selector<TRoot, TParent>>(this._root, this, "discoveryAddress"):this.discoveryAddress);
        }

    }

}
