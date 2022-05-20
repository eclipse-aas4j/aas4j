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
 * <p>Java-Klasse für ServerOnNetwork complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServerOnNetwork"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscoveryUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerCapabilities" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerOnNetwork", propOrder = {
    "recordId",
    "serverName",
    "discoveryUrl",
    "serverCapabilities"
})
public class ServerOnNetwork {

    @XmlElement(name = "RecordId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long recordId;
    @XmlElementRef(name = "ServerName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverName;
    @XmlElementRef(name = "DiscoveryUrl", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> discoveryUrl;
    @XmlElementRef(name = "ServerCapabilities", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> serverCapabilities;

    /**
     * Ruft den Wert der recordId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * Legt den Wert der recordId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordId(Long value) {
        this.recordId = value;
    }

    /**
     * Ruft den Wert der serverName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerName() {
        return serverName;
    }

    /**
     * Legt den Wert der serverName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerName(JAXBElement<String> value) {
        this.serverName = value;
    }

    /**
     * Ruft den Wert der discoveryUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscoveryUrl() {
        return discoveryUrl;
    }

    /**
     * Legt den Wert der discoveryUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscoveryUrl(JAXBElement<String> value) {
        this.discoveryUrl = value;
    }

    /**
     * Ruft den Wert der serverCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getServerCapabilities() {
        return serverCapabilities;
    }

    /**
     * Legt den Wert der serverCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setServerCapabilities(JAXBElement<ListOfString> value) {
        this.serverCapabilities = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ServerOnNetwork.Builder<_B> _other) {
        _other.recordId = this.recordId;
        _other.serverName = this.serverName;
        _other.discoveryUrl = this.discoveryUrl;
        _other.serverCapabilities = this.serverCapabilities;
    }

    public<_B >ServerOnNetwork.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ServerOnNetwork.Builder<_B>(_parentBuilder, this, true);
    }

    public ServerOnNetwork.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ServerOnNetwork.Builder<Void> builder() {
        return new ServerOnNetwork.Builder<Void>(null, null, false);
    }

    public static<_B >ServerOnNetwork.Builder<_B> copyOf(final ServerOnNetwork _other) {
        final ServerOnNetwork.Builder<_B> _newBuilder = new ServerOnNetwork.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ServerOnNetwork.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree recordIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("recordId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(recordIdPropertyTree!= null):((recordIdPropertyTree == null)||(!recordIdPropertyTree.isLeaf())))) {
            _other.recordId = this.recordId;
        }
        final PropertyTree serverNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNamePropertyTree!= null):((serverNamePropertyTree == null)||(!serverNamePropertyTree.isLeaf())))) {
            _other.serverName = this.serverName;
        }
        final PropertyTree discoveryUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryUrl"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryUrlPropertyTree!= null):((discoveryUrlPropertyTree == null)||(!discoveryUrlPropertyTree.isLeaf())))) {
            _other.discoveryUrl = this.discoveryUrl;
        }
        final PropertyTree serverCapabilitiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCapabilities"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCapabilitiesPropertyTree!= null):((serverCapabilitiesPropertyTree == null)||(!serverCapabilitiesPropertyTree.isLeaf())))) {
            _other.serverCapabilities = this.serverCapabilities;
        }
    }

    public<_B >ServerOnNetwork.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ServerOnNetwork.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ServerOnNetwork.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ServerOnNetwork.Builder<_B> copyOf(final ServerOnNetwork _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ServerOnNetwork.Builder<_B> _newBuilder = new ServerOnNetwork.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ServerOnNetwork.Builder<Void> copyExcept(final ServerOnNetwork _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ServerOnNetwork.Builder<Void> copyOnly(final ServerOnNetwork _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ServerOnNetwork _storedValue;
        private Long recordId;
        private JAXBElement<String> serverName;
        private JAXBElement<String> discoveryUrl;
        private JAXBElement<ListOfString> serverCapabilities;

        public Builder(final _B _parentBuilder, final ServerOnNetwork _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.recordId = _other.recordId;
                    this.serverName = _other.serverName;
                    this.discoveryUrl = _other.discoveryUrl;
                    this.serverCapabilities = _other.serverCapabilities;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ServerOnNetwork _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree recordIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("recordId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(recordIdPropertyTree!= null):((recordIdPropertyTree == null)||(!recordIdPropertyTree.isLeaf())))) {
                        this.recordId = _other.recordId;
                    }
                    final PropertyTree serverNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverNamePropertyTree!= null):((serverNamePropertyTree == null)||(!serverNamePropertyTree.isLeaf())))) {
                        this.serverName = _other.serverName;
                    }
                    final PropertyTree discoveryUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discoveryUrl"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discoveryUrlPropertyTree!= null):((discoveryUrlPropertyTree == null)||(!discoveryUrlPropertyTree.isLeaf())))) {
                        this.discoveryUrl = _other.discoveryUrl;
                    }
                    final PropertyTree serverCapabilitiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCapabilities"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCapabilitiesPropertyTree!= null):((serverCapabilitiesPropertyTree == null)||(!serverCapabilitiesPropertyTree.isLeaf())))) {
                        this.serverCapabilities = _other.serverCapabilities;
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

        protected<_P extends ServerOnNetwork >_P init(final _P _product) {
            _product.recordId = this.recordId;
            _product.serverName = this.serverName;
            _product.discoveryUrl = this.discoveryUrl;
            _product.serverCapabilities = this.serverCapabilities;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "recordId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param recordId
         *     Neuer Wert der Eigenschaft "recordId".
         */
        public ServerOnNetwork.Builder<_B> withRecordId(final Long recordId) {
            this.recordId = recordId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serverName
         *     Neuer Wert der Eigenschaft "serverName".
         */
        public ServerOnNetwork.Builder<_B> withServerName(final JAXBElement<String> serverName) {
            this.serverName = serverName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "discoveryUrl" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param discoveryUrl
         *     Neuer Wert der Eigenschaft "discoveryUrl".
         */
        public ServerOnNetwork.Builder<_B> withDiscoveryUrl(final JAXBElement<String> discoveryUrl) {
            this.discoveryUrl = discoveryUrl;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverCapabilities" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param serverCapabilities
         *     Neuer Wert der Eigenschaft "serverCapabilities".
         */
        public ServerOnNetwork.Builder<_B> withServerCapabilities(final JAXBElement<ListOfString> serverCapabilities) {
            this.serverCapabilities = serverCapabilities;
            return this;
        }

        @Override
        public ServerOnNetwork build() {
            if (_storedValue == null) {
                return this.init(new ServerOnNetwork());
            } else {
                return ((ServerOnNetwork) _storedValue);
            }
        }

        public ServerOnNetwork.Builder<_B> copyOf(final ServerOnNetwork _other) {
            _other.copyTo(this);
            return this;
        }

        public ServerOnNetwork.Builder<_B> copyOf(final ServerOnNetwork.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ServerOnNetwork.Selector<ServerOnNetwork.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ServerOnNetwork.Select _root() {
            return new ServerOnNetwork.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>> recordId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>> serverName = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>> discoveryUrl = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>> serverCapabilities = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.recordId!= null) {
                products.put("recordId", this.recordId.init());
            }
            if (this.serverName!= null) {
                products.put("serverName", this.serverName.init());
            }
            if (this.discoveryUrl!= null) {
                products.put("discoveryUrl", this.discoveryUrl.init());
            }
            if (this.serverCapabilities!= null) {
                products.put("serverCapabilities", this.serverCapabilities.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>> recordId() {
            return ((this.recordId == null)?this.recordId = new com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>>(this._root, this, "recordId"):this.recordId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>> serverName() {
            return ((this.serverName == null)?this.serverName = new com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>>(this._root, this, "serverName"):this.serverName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>> discoveryUrl() {
            return ((this.discoveryUrl == null)?this.discoveryUrl = new com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>>(this._root, this, "discoveryUrl"):this.discoveryUrl);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>> serverCapabilities() {
            return ((this.serverCapabilities == null)?this.serverCapabilities = new com.kscs.util.jaxb.Selector<TRoot, ServerOnNetwork.Selector<TRoot, TParent>>(this._root, this, "serverCapabilities"):this.serverCapabilities);
        }

    }

}
