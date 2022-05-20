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
 * <p>Java-Klasse für ReaderGroupDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReaderGroupDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}PubSubGroupDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportSettings" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="MessageSettings" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="DataSetReaders" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDataSetReaderDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReaderGroupDataType", propOrder = {
    "transportSettings",
    "messageSettings",
    "dataSetReaders"
})
public class ReaderGroupDataType
    extends PubSubGroupDataType
{

    @XmlElementRef(name = "TransportSettings", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> transportSettings;
    @XmlElementRef(name = "MessageSettings", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> messageSettings;
    @XmlElementRef(name = "DataSetReaders", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDataSetReaderDataType> dataSetReaders;

    /**
     * Ruft den Wert der transportSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getTransportSettings() {
        return transportSettings;
    }

    /**
     * Legt den Wert der transportSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setTransportSettings(JAXBElement<ExtensionObject> value) {
        this.transportSettings = value;
    }

    /**
     * Ruft den Wert der messageSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getMessageSettings() {
        return messageSettings;
    }

    /**
     * Legt den Wert der messageSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setMessageSettings(JAXBElement<ExtensionObject> value) {
        this.messageSettings = value;
    }

    /**
     * Ruft den Wert der dataSetReaders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDataSetReaderDataType }{@code >}
     *     
     */
    public JAXBElement<ListOfDataSetReaderDataType> getDataSetReaders() {
        return dataSetReaders;
    }

    /**
     * Legt den Wert der dataSetReaders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDataSetReaderDataType }{@code >}
     *     
     */
    public void setDataSetReaders(JAXBElement<ListOfDataSetReaderDataType> value) {
        this.dataSetReaders = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ReaderGroupDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.transportSettings = this.transportSettings;
        _other.messageSettings = this.messageSettings;
        _other.dataSetReaders = this.dataSetReaders;
    }

    @Override
    public<_B >ReaderGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ReaderGroupDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ReaderGroupDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ReaderGroupDataType.Builder<Void> builder() {
        return new ReaderGroupDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ReaderGroupDataType.Builder<_B> copyOf(final PubSubGroupDataType _other) {
        final ReaderGroupDataType.Builder<_B> _newBuilder = new ReaderGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ReaderGroupDataType.Builder<_B> copyOf(final ReaderGroupDataType _other) {
        final ReaderGroupDataType.Builder<_B> _newBuilder = new ReaderGroupDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ReaderGroupDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
            _other.transportSettings = this.transportSettings;
        }
        final PropertyTree messageSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageSettings"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageSettingsPropertyTree!= null):((messageSettingsPropertyTree == null)||(!messageSettingsPropertyTree.isLeaf())))) {
            _other.messageSettings = this.messageSettings;
        }
        final PropertyTree dataSetReadersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaders"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReadersPropertyTree!= null):((dataSetReadersPropertyTree == null)||(!dataSetReadersPropertyTree.isLeaf())))) {
            _other.dataSetReaders = this.dataSetReaders;
        }
    }

    @Override
    public<_B >ReaderGroupDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ReaderGroupDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ReaderGroupDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ReaderGroupDataType.Builder<_B> copyOf(final PubSubGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReaderGroupDataType.Builder<_B> _newBuilder = new ReaderGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ReaderGroupDataType.Builder<_B> copyOf(final ReaderGroupDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReaderGroupDataType.Builder<_B> _newBuilder = new ReaderGroupDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ReaderGroupDataType.Builder<Void> copyExcept(final PubSubGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReaderGroupDataType.Builder<Void> copyExcept(final ReaderGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReaderGroupDataType.Builder<Void> copyOnly(final PubSubGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ReaderGroupDataType.Builder<Void> copyOnly(final ReaderGroupDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends PubSubGroupDataType.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ExtensionObject> transportSettings;
        private JAXBElement<ExtensionObject> messageSettings;
        private JAXBElement<ListOfDataSetReaderDataType> dataSetReaders;

        public Builder(final _B _parentBuilder, final ReaderGroupDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.transportSettings = _other.transportSettings;
                this.messageSettings = _other.messageSettings;
                this.dataSetReaders = _other.dataSetReaders;
            }
        }

        public Builder(final _B _parentBuilder, final ReaderGroupDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
                    this.transportSettings = _other.transportSettings;
                }
                final PropertyTree messageSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageSettings"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageSettingsPropertyTree!= null):((messageSettingsPropertyTree == null)||(!messageSettingsPropertyTree.isLeaf())))) {
                    this.messageSettings = _other.messageSettings;
                }
                final PropertyTree dataSetReadersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaders"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReadersPropertyTree!= null):((dataSetReadersPropertyTree == null)||(!dataSetReadersPropertyTree.isLeaf())))) {
                    this.dataSetReaders = _other.dataSetReaders;
                }
            }
        }

        protected<_P extends ReaderGroupDataType >_P init(final _P _product) {
            _product.transportSettings = this.transportSettings;
            _product.messageSettings = this.messageSettings;
            _product.dataSetReaders = this.dataSetReaders;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transportSettings" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transportSettings
         *     Neuer Wert der Eigenschaft "transportSettings".
         */
        public ReaderGroupDataType.Builder<_B> withTransportSettings(final JAXBElement<ExtensionObject> transportSettings) {
            this.transportSettings = transportSettings;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "messageSettings" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param messageSettings
         *     Neuer Wert der Eigenschaft "messageSettings".
         */
        public ReaderGroupDataType.Builder<_B> withMessageSettings(final JAXBElement<ExtensionObject> messageSettings) {
            this.messageSettings = messageSettings;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetReaders" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetReaders
         *     Neuer Wert der Eigenschaft "dataSetReaders".
         */
        public ReaderGroupDataType.Builder<_B> withDataSetReaders(final JAXBElement<ListOfDataSetReaderDataType> dataSetReaders) {
            this.dataSetReaders = dataSetReaders;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        @Override
        public ReaderGroupDataType.Builder<_B> withName(final JAXBElement<String> name) {
            super.withName(name);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enabled" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param enabled
         *     Neuer Wert der Eigenschaft "enabled".
         */
        @Override
        public ReaderGroupDataType.Builder<_B> withEnabled(final Boolean enabled) {
            super.withEnabled(enabled);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityMode
         *     Neuer Wert der Eigenschaft "securityMode".
         */
        @Override
        public ReaderGroupDataType.Builder<_B> withSecurityMode(final MessageSecurityMode securityMode) {
            super.withSecurityMode(securityMode);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityGroupId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityGroupId
         *     Neuer Wert der Eigenschaft "securityGroupId".
         */
        @Override
        public ReaderGroupDataType.Builder<_B> withSecurityGroupId(final JAXBElement<String> securityGroupId) {
            super.withSecurityGroupId(securityGroupId);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityKeyServices" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param securityKeyServices
         *     Neuer Wert der Eigenschaft "securityKeyServices".
         */
        @Override
        public ReaderGroupDataType.Builder<_B> withSecurityKeyServices(final JAXBElement<ListOfEndpointDescription> securityKeyServices) {
            super.withSecurityKeyServices(securityKeyServices);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxNetworkMessageSize" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxNetworkMessageSize
         *     Neuer Wert der Eigenschaft "maxNetworkMessageSize".
         */
        @Override
        public ReaderGroupDataType.Builder<_B> withMaxNetworkMessageSize(final Long maxNetworkMessageSize) {
            super.withMaxNetworkMessageSize(maxNetworkMessageSize);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "groupProperties" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param groupProperties
         *     Neuer Wert der Eigenschaft "groupProperties".
         */
        @Override
        public ReaderGroupDataType.Builder<_B> withGroupProperties(final JAXBElement<ListOfKeyValuePair> groupProperties) {
            super.withGroupProperties(groupProperties);
            return this;
        }

        @Override
        public ReaderGroupDataType build() {
            if (_storedValue == null) {
                return this.init(new ReaderGroupDataType());
            } else {
                return ((ReaderGroupDataType) _storedValue);
            }
        }

        public ReaderGroupDataType.Builder<_B> copyOf(final ReaderGroupDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ReaderGroupDataType.Builder<_B> copyOf(final ReaderGroupDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ReaderGroupDataType.Selector<ReaderGroupDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ReaderGroupDataType.Select _root() {
            return new ReaderGroupDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends PubSubGroupDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ReaderGroupDataType.Selector<TRoot, TParent>> transportSettings = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReaderGroupDataType.Selector<TRoot, TParent>> messageSettings = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReaderGroupDataType.Selector<TRoot, TParent>> dataSetReaders = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.transportSettings!= null) {
                products.put("transportSettings", this.transportSettings.init());
            }
            if (this.messageSettings!= null) {
                products.put("messageSettings", this.messageSettings.init());
            }
            if (this.dataSetReaders!= null) {
                products.put("dataSetReaders", this.dataSetReaders.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReaderGroupDataType.Selector<TRoot, TParent>> transportSettings() {
            return ((this.transportSettings == null)?this.transportSettings = new com.kscs.util.jaxb.Selector<TRoot, ReaderGroupDataType.Selector<TRoot, TParent>>(this._root, this, "transportSettings"):this.transportSettings);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReaderGroupDataType.Selector<TRoot, TParent>> messageSettings() {
            return ((this.messageSettings == null)?this.messageSettings = new com.kscs.util.jaxb.Selector<TRoot, ReaderGroupDataType.Selector<TRoot, TParent>>(this._root, this, "messageSettings"):this.messageSettings);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReaderGroupDataType.Selector<TRoot, TParent>> dataSetReaders() {
            return ((this.dataSetReaders == null)?this.dataSetReaders = new com.kscs.util.jaxb.Selector<TRoot, ReaderGroupDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetReaders"):this.dataSetReaders);
        }

    }

}
