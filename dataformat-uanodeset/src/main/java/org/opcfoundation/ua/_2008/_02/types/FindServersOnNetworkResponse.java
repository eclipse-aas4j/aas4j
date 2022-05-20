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
import javax.xml.datatype.XMLGregorianCalendar;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für FindServersOnNetworkResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindServersOnNetworkResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="LastCounterResetTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Servers" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfServerOnNetwork" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindServersOnNetworkResponse", propOrder = {
    "responseHeader",
    "lastCounterResetTime",
    "servers"
})
public class FindServersOnNetworkResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElement(name = "LastCounterResetTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCounterResetTime;
    @XmlElementRef(name = "Servers", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfServerOnNetwork> servers;

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
     * Ruft den Wert der lastCounterResetTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCounterResetTime() {
        return lastCounterResetTime;
    }

    /**
     * Legt den Wert der lastCounterResetTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCounterResetTime(XMLGregorianCalendar value) {
        this.lastCounterResetTime = value;
    }

    /**
     * Ruft den Wert der servers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfServerOnNetwork }{@code >}
     *     
     */
    public JAXBElement<ListOfServerOnNetwork> getServers() {
        return servers;
    }

    /**
     * Legt den Wert der servers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfServerOnNetwork }{@code >}
     *     
     */
    public void setServers(JAXBElement<ListOfServerOnNetwork> value) {
        this.servers = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final FindServersOnNetworkResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.lastCounterResetTime = ((this.lastCounterResetTime == null)?null:((XMLGregorianCalendar) this.lastCounterResetTime.clone()));
        _other.servers = this.servers;
    }

    public<_B >FindServersOnNetworkResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new FindServersOnNetworkResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public FindServersOnNetworkResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static FindServersOnNetworkResponse.Builder<Void> builder() {
        return new FindServersOnNetworkResponse.Builder<Void>(null, null, false);
    }

    public static<_B >FindServersOnNetworkResponse.Builder<_B> copyOf(final FindServersOnNetworkResponse _other) {
        final FindServersOnNetworkResponse.Builder<_B> _newBuilder = new FindServersOnNetworkResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final FindServersOnNetworkResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree lastCounterResetTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastCounterResetTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastCounterResetTimePropertyTree!= null):((lastCounterResetTimePropertyTree == null)||(!lastCounterResetTimePropertyTree.isLeaf())))) {
            _other.lastCounterResetTime = ((this.lastCounterResetTime == null)?null:((XMLGregorianCalendar) this.lastCounterResetTime.clone()));
        }
        final PropertyTree serversPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("servers"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serversPropertyTree!= null):((serversPropertyTree == null)||(!serversPropertyTree.isLeaf())))) {
            _other.servers = this.servers;
        }
    }

    public<_B >FindServersOnNetworkResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new FindServersOnNetworkResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public FindServersOnNetworkResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >FindServersOnNetworkResponse.Builder<_B> copyOf(final FindServersOnNetworkResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final FindServersOnNetworkResponse.Builder<_B> _newBuilder = new FindServersOnNetworkResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static FindServersOnNetworkResponse.Builder<Void> copyExcept(final FindServersOnNetworkResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static FindServersOnNetworkResponse.Builder<Void> copyOnly(final FindServersOnNetworkResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final FindServersOnNetworkResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private XMLGregorianCalendar lastCounterResetTime;
        private JAXBElement<ListOfServerOnNetwork> servers;

        public Builder(final _B _parentBuilder, final FindServersOnNetworkResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.lastCounterResetTime = ((_other.lastCounterResetTime == null)?null:((XMLGregorianCalendar) _other.lastCounterResetTime.clone()));
                    this.servers = _other.servers;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final FindServersOnNetworkResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree lastCounterResetTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastCounterResetTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastCounterResetTimePropertyTree!= null):((lastCounterResetTimePropertyTree == null)||(!lastCounterResetTimePropertyTree.isLeaf())))) {
                        this.lastCounterResetTime = ((_other.lastCounterResetTime == null)?null:((XMLGregorianCalendar) _other.lastCounterResetTime.clone()));
                    }
                    final PropertyTree serversPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("servers"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serversPropertyTree!= null):((serversPropertyTree == null)||(!serversPropertyTree.isLeaf())))) {
                        this.servers = _other.servers;
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

        protected<_P extends FindServersOnNetworkResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.lastCounterResetTime = this.lastCounterResetTime;
            _product.servers = this.servers;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public FindServersOnNetworkResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastCounterResetTime" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param lastCounterResetTime
         *     Neuer Wert der Eigenschaft "lastCounterResetTime".
         */
        public FindServersOnNetworkResponse.Builder<_B> withLastCounterResetTime(final XMLGregorianCalendar lastCounterResetTime) {
            this.lastCounterResetTime = lastCounterResetTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "servers" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param servers
         *     Neuer Wert der Eigenschaft "servers".
         */
        public FindServersOnNetworkResponse.Builder<_B> withServers(final JAXBElement<ListOfServerOnNetwork> servers) {
            this.servers = servers;
            return this;
        }

        @Override
        public FindServersOnNetworkResponse build() {
            if (_storedValue == null) {
                return this.init(new FindServersOnNetworkResponse());
            } else {
                return ((FindServersOnNetworkResponse) _storedValue);
            }
        }

        public FindServersOnNetworkResponse.Builder<_B> copyOf(final FindServersOnNetworkResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public FindServersOnNetworkResponse.Builder<_B> copyOf(final FindServersOnNetworkResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends FindServersOnNetworkResponse.Selector<FindServersOnNetworkResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static FindServersOnNetworkResponse.Select _root() {
            return new FindServersOnNetworkResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkResponse.Selector<TRoot, TParent>> lastCounterResetTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkResponse.Selector<TRoot, TParent>> servers = null;

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
            if (this.lastCounterResetTime!= null) {
                products.put("lastCounterResetTime", this.lastCounterResetTime.init());
            }
            if (this.servers!= null) {
                products.put("servers", this.servers.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkResponse.Selector<TRoot, TParent>> lastCounterResetTime() {
            return ((this.lastCounterResetTime == null)?this.lastCounterResetTime = new com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkResponse.Selector<TRoot, TParent>>(this._root, this, "lastCounterResetTime"):this.lastCounterResetTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkResponse.Selector<TRoot, TParent>> servers() {
            return ((this.servers == null)?this.servers = new com.kscs.util.jaxb.Selector<TRoot, FindServersOnNetworkResponse.Selector<TRoot, TParent>>(this._root, this, "servers"):this.servers);
        }

    }

}
