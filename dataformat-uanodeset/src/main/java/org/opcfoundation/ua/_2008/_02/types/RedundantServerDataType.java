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
 * <p>Java-Klasse für RedundantServerDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RedundantServerDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ServerState" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServerState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedundantServerDataType", propOrder = {
    "serverId",
    "serviceLevel",
    "serverState"
})
public class RedundantServerDataType {

    @XmlElementRef(name = "ServerId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverId;
    @XmlElement(name = "ServiceLevel")
    @XmlSchemaType(name = "unsignedByte")
    protected Short serviceLevel;
    @XmlElement(name = "ServerState")
    @XmlSchemaType(name = "string")
    protected ServerState serverState;

    /**
     * Ruft den Wert der serverId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerId() {
        return serverId;
    }

    /**
     * Legt den Wert der serverId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerId(JAXBElement<String> value) {
        this.serverId = value;
    }

    /**
     * Ruft den Wert der serviceLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Legt den Wert der serviceLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setServiceLevel(Short value) {
        this.serviceLevel = value;
    }

    /**
     * Ruft den Wert der serverState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServerState }
     *     
     */
    public ServerState getServerState() {
        return serverState;
    }

    /**
     * Legt den Wert der serverState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerState }
     *     
     */
    public void setServerState(ServerState value) {
        this.serverState = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RedundantServerDataType.Builder<_B> _other) {
        _other.serverId = this.serverId;
        _other.serviceLevel = this.serviceLevel;
        _other.serverState = this.serverState;
    }

    public<_B >RedundantServerDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RedundantServerDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public RedundantServerDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RedundantServerDataType.Builder<Void> builder() {
        return new RedundantServerDataType.Builder<Void>(null, null, false);
    }

    public static<_B >RedundantServerDataType.Builder<_B> copyOf(final RedundantServerDataType _other) {
        final RedundantServerDataType.Builder<_B> _newBuilder = new RedundantServerDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RedundantServerDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree serverIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverIdPropertyTree!= null):((serverIdPropertyTree == null)||(!serverIdPropertyTree.isLeaf())))) {
            _other.serverId = this.serverId;
        }
        final PropertyTree serviceLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serviceLevel"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serviceLevelPropertyTree!= null):((serviceLevelPropertyTree == null)||(!serviceLevelPropertyTree.isLeaf())))) {
            _other.serviceLevel = this.serviceLevel;
        }
        final PropertyTree serverStatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverState"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverStatePropertyTree!= null):((serverStatePropertyTree == null)||(!serverStatePropertyTree.isLeaf())))) {
            _other.serverState = this.serverState;
        }
    }

    public<_B >RedundantServerDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RedundantServerDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RedundantServerDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RedundantServerDataType.Builder<_B> copyOf(final RedundantServerDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RedundantServerDataType.Builder<_B> _newBuilder = new RedundantServerDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RedundantServerDataType.Builder<Void> copyExcept(final RedundantServerDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RedundantServerDataType.Builder<Void> copyOnly(final RedundantServerDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RedundantServerDataType _storedValue;
        private JAXBElement<String> serverId;
        private Short serviceLevel;
        private ServerState serverState;

        public Builder(final _B _parentBuilder, final RedundantServerDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.serverId = _other.serverId;
                    this.serviceLevel = _other.serviceLevel;
                    this.serverState = _other.serverState;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RedundantServerDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree serverIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverIdPropertyTree!= null):((serverIdPropertyTree == null)||(!serverIdPropertyTree.isLeaf())))) {
                        this.serverId = _other.serverId;
                    }
                    final PropertyTree serviceLevelPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serviceLevel"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serviceLevelPropertyTree!= null):((serviceLevelPropertyTree == null)||(!serviceLevelPropertyTree.isLeaf())))) {
                        this.serviceLevel = _other.serviceLevel;
                    }
                    final PropertyTree serverStatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverState"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverStatePropertyTree!= null):((serverStatePropertyTree == null)||(!serverStatePropertyTree.isLeaf())))) {
                        this.serverState = _other.serverState;
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

        protected<_P extends RedundantServerDataType >_P init(final _P _product) {
            _product.serverId = this.serverId;
            _product.serviceLevel = this.serviceLevel;
            _product.serverState = this.serverState;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serverId
         *     Neuer Wert der Eigenschaft "serverId".
         */
        public RedundantServerDataType.Builder<_B> withServerId(final JAXBElement<String> serverId) {
            this.serverId = serverId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serviceLevel" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serviceLevel
         *     Neuer Wert der Eigenschaft "serviceLevel".
         */
        public RedundantServerDataType.Builder<_B> withServiceLevel(final Short serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverState" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverState
         *     Neuer Wert der Eigenschaft "serverState".
         */
        public RedundantServerDataType.Builder<_B> withServerState(final ServerState serverState) {
            this.serverState = serverState;
            return this;
        }

        @Override
        public RedundantServerDataType build() {
            if (_storedValue == null) {
                return this.init(new RedundantServerDataType());
            } else {
                return ((RedundantServerDataType) _storedValue);
            }
        }

        public RedundantServerDataType.Builder<_B> copyOf(final RedundantServerDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public RedundantServerDataType.Builder<_B> copyOf(final RedundantServerDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RedundantServerDataType.Selector<RedundantServerDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RedundantServerDataType.Select _root() {
            return new RedundantServerDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RedundantServerDataType.Selector<TRoot, TParent>> serverId = null;
        private com.kscs.util.jaxb.Selector<TRoot, RedundantServerDataType.Selector<TRoot, TParent>> serviceLevel = null;
        private com.kscs.util.jaxb.Selector<TRoot, RedundantServerDataType.Selector<TRoot, TParent>> serverState = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.serverId!= null) {
                products.put("serverId", this.serverId.init());
            }
            if (this.serviceLevel!= null) {
                products.put("serviceLevel", this.serviceLevel.init());
            }
            if (this.serverState!= null) {
                products.put("serverState", this.serverState.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RedundantServerDataType.Selector<TRoot, TParent>> serverId() {
            return ((this.serverId == null)?this.serverId = new com.kscs.util.jaxb.Selector<TRoot, RedundantServerDataType.Selector<TRoot, TParent>>(this._root, this, "serverId"):this.serverId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RedundantServerDataType.Selector<TRoot, TParent>> serviceLevel() {
            return ((this.serviceLevel == null)?this.serviceLevel = new com.kscs.util.jaxb.Selector<TRoot, RedundantServerDataType.Selector<TRoot, TParent>>(this._root, this, "serviceLevel"):this.serviceLevel);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RedundantServerDataType.Selector<TRoot, TParent>> serverState() {
            return ((this.serverState == null)?this.serverState = new com.kscs.util.jaxb.Selector<TRoot, RedundantServerDataType.Selector<TRoot, TParent>>(this._root, this, "serverState"):this.serverState);
        }

    }

}
