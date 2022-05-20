//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für EndpointConfiguration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EndpointConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UseBinaryEncoding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxStringLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxByteStringLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxArrayLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxMessageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxBufferSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChannelLifetime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SecurityTokenLifetime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointConfiguration", propOrder = {
    "operationTimeout",
    "useBinaryEncoding",
    "maxStringLength",
    "maxByteStringLength",
    "maxArrayLength",
    "maxMessageSize",
    "maxBufferSize",
    "channelLifetime",
    "securityTokenLifetime"
})
public class EndpointConfiguration {

    @XmlElement(name = "OperationTimeout")
    protected Integer operationTimeout;
    @XmlElement(name = "UseBinaryEncoding")
    protected Boolean useBinaryEncoding;
    @XmlElement(name = "MaxStringLength")
    protected Integer maxStringLength;
    @XmlElement(name = "MaxByteStringLength")
    protected Integer maxByteStringLength;
    @XmlElement(name = "MaxArrayLength")
    protected Integer maxArrayLength;
    @XmlElement(name = "MaxMessageSize")
    protected Integer maxMessageSize;
    @XmlElement(name = "MaxBufferSize")
    protected Integer maxBufferSize;
    @XmlElement(name = "ChannelLifetime")
    protected Integer channelLifetime;
    @XmlElement(name = "SecurityTokenLifetime")
    protected Integer securityTokenLifetime;

    /**
     * Ruft den Wert der operationTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationTimeout() {
        return operationTimeout;
    }

    /**
     * Legt den Wert der operationTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationTimeout(Integer value) {
        this.operationTimeout = value;
    }

    /**
     * Ruft den Wert der useBinaryEncoding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBinaryEncoding() {
        return useBinaryEncoding;
    }

    /**
     * Legt den Wert der useBinaryEncoding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBinaryEncoding(Boolean value) {
        this.useBinaryEncoding = value;
    }

    /**
     * Ruft den Wert der maxStringLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStringLength() {
        return maxStringLength;
    }

    /**
     * Legt den Wert der maxStringLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStringLength(Integer value) {
        this.maxStringLength = value;
    }

    /**
     * Ruft den Wert der maxByteStringLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxByteStringLength() {
        return maxByteStringLength;
    }

    /**
     * Legt den Wert der maxByteStringLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxByteStringLength(Integer value) {
        this.maxByteStringLength = value;
    }

    /**
     * Ruft den Wert der maxArrayLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxArrayLength() {
        return maxArrayLength;
    }

    /**
     * Legt den Wert der maxArrayLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxArrayLength(Integer value) {
        this.maxArrayLength = value;
    }

    /**
     * Ruft den Wert der maxMessageSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMessageSize() {
        return maxMessageSize;
    }

    /**
     * Legt den Wert der maxMessageSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMessageSize(Integer value) {
        this.maxMessageSize = value;
    }

    /**
     * Ruft den Wert der maxBufferSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxBufferSize() {
        return maxBufferSize;
    }

    /**
     * Legt den Wert der maxBufferSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxBufferSize(Integer value) {
        this.maxBufferSize = value;
    }

    /**
     * Ruft den Wert der channelLifetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelLifetime() {
        return channelLifetime;
    }

    /**
     * Legt den Wert der channelLifetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelLifetime(Integer value) {
        this.channelLifetime = value;
    }

    /**
     * Ruft den Wert der securityTokenLifetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecurityTokenLifetime() {
        return securityTokenLifetime;
    }

    /**
     * Legt den Wert der securityTokenLifetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecurityTokenLifetime(Integer value) {
        this.securityTokenLifetime = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EndpointConfiguration.Builder<_B> _other) {
        _other.operationTimeout = this.operationTimeout;
        _other.useBinaryEncoding = this.useBinaryEncoding;
        _other.maxStringLength = this.maxStringLength;
        _other.maxByteStringLength = this.maxByteStringLength;
        _other.maxArrayLength = this.maxArrayLength;
        _other.maxMessageSize = this.maxMessageSize;
        _other.maxBufferSize = this.maxBufferSize;
        _other.channelLifetime = this.channelLifetime;
        _other.securityTokenLifetime = this.securityTokenLifetime;
    }

    public<_B >EndpointConfiguration.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EndpointConfiguration.Builder<_B>(_parentBuilder, this, true);
    }

    public EndpointConfiguration.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EndpointConfiguration.Builder<Void> builder() {
        return new EndpointConfiguration.Builder<Void>(null, null, false);
    }

    public static<_B >EndpointConfiguration.Builder<_B> copyOf(final EndpointConfiguration _other) {
        final EndpointConfiguration.Builder<_B> _newBuilder = new EndpointConfiguration.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EndpointConfiguration.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree operationTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("operationTimeout"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(operationTimeoutPropertyTree!= null):((operationTimeoutPropertyTree == null)||(!operationTimeoutPropertyTree.isLeaf())))) {
            _other.operationTimeout = this.operationTimeout;
        }
        final PropertyTree useBinaryEncodingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("useBinaryEncoding"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(useBinaryEncodingPropertyTree!= null):((useBinaryEncodingPropertyTree == null)||(!useBinaryEncodingPropertyTree.isLeaf())))) {
            _other.useBinaryEncoding = this.useBinaryEncoding;
        }
        final PropertyTree maxStringLengthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxStringLength"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxStringLengthPropertyTree!= null):((maxStringLengthPropertyTree == null)||(!maxStringLengthPropertyTree.isLeaf())))) {
            _other.maxStringLength = this.maxStringLength;
        }
        final PropertyTree maxByteStringLengthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxByteStringLength"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxByteStringLengthPropertyTree!= null):((maxByteStringLengthPropertyTree == null)||(!maxByteStringLengthPropertyTree.isLeaf())))) {
            _other.maxByteStringLength = this.maxByteStringLength;
        }
        final PropertyTree maxArrayLengthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxArrayLength"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxArrayLengthPropertyTree!= null):((maxArrayLengthPropertyTree == null)||(!maxArrayLengthPropertyTree.isLeaf())))) {
            _other.maxArrayLength = this.maxArrayLength;
        }
        final PropertyTree maxMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxMessageSize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxMessageSizePropertyTree!= null):((maxMessageSizePropertyTree == null)||(!maxMessageSizePropertyTree.isLeaf())))) {
            _other.maxMessageSize = this.maxMessageSize;
        }
        final PropertyTree maxBufferSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxBufferSize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxBufferSizePropertyTree!= null):((maxBufferSizePropertyTree == null)||(!maxBufferSizePropertyTree.isLeaf())))) {
            _other.maxBufferSize = this.maxBufferSize;
        }
        final PropertyTree channelLifetimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("channelLifetime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(channelLifetimePropertyTree!= null):((channelLifetimePropertyTree == null)||(!channelLifetimePropertyTree.isLeaf())))) {
            _other.channelLifetime = this.channelLifetime;
        }
        final PropertyTree securityTokenLifetimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityTokenLifetime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityTokenLifetimePropertyTree!= null):((securityTokenLifetimePropertyTree == null)||(!securityTokenLifetimePropertyTree.isLeaf())))) {
            _other.securityTokenLifetime = this.securityTokenLifetime;
        }
    }

    public<_B >EndpointConfiguration.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EndpointConfiguration.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public EndpointConfiguration.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EndpointConfiguration.Builder<_B> copyOf(final EndpointConfiguration _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EndpointConfiguration.Builder<_B> _newBuilder = new EndpointConfiguration.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EndpointConfiguration.Builder<Void> copyExcept(final EndpointConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EndpointConfiguration.Builder<Void> copyOnly(final EndpointConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final EndpointConfiguration _storedValue;
        private Integer operationTimeout;
        private Boolean useBinaryEncoding;
        private Integer maxStringLength;
        private Integer maxByteStringLength;
        private Integer maxArrayLength;
        private Integer maxMessageSize;
        private Integer maxBufferSize;
        private Integer channelLifetime;
        private Integer securityTokenLifetime;

        public Builder(final _B _parentBuilder, final EndpointConfiguration _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.operationTimeout = _other.operationTimeout;
                    this.useBinaryEncoding = _other.useBinaryEncoding;
                    this.maxStringLength = _other.maxStringLength;
                    this.maxByteStringLength = _other.maxByteStringLength;
                    this.maxArrayLength = _other.maxArrayLength;
                    this.maxMessageSize = _other.maxMessageSize;
                    this.maxBufferSize = _other.maxBufferSize;
                    this.channelLifetime = _other.channelLifetime;
                    this.securityTokenLifetime = _other.securityTokenLifetime;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final EndpointConfiguration _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree operationTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("operationTimeout"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(operationTimeoutPropertyTree!= null):((operationTimeoutPropertyTree == null)||(!operationTimeoutPropertyTree.isLeaf())))) {
                        this.operationTimeout = _other.operationTimeout;
                    }
                    final PropertyTree useBinaryEncodingPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("useBinaryEncoding"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(useBinaryEncodingPropertyTree!= null):((useBinaryEncodingPropertyTree == null)||(!useBinaryEncodingPropertyTree.isLeaf())))) {
                        this.useBinaryEncoding = _other.useBinaryEncoding;
                    }
                    final PropertyTree maxStringLengthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxStringLength"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxStringLengthPropertyTree!= null):((maxStringLengthPropertyTree == null)||(!maxStringLengthPropertyTree.isLeaf())))) {
                        this.maxStringLength = _other.maxStringLength;
                    }
                    final PropertyTree maxByteStringLengthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxByteStringLength"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxByteStringLengthPropertyTree!= null):((maxByteStringLengthPropertyTree == null)||(!maxByteStringLengthPropertyTree.isLeaf())))) {
                        this.maxByteStringLength = _other.maxByteStringLength;
                    }
                    final PropertyTree maxArrayLengthPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxArrayLength"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxArrayLengthPropertyTree!= null):((maxArrayLengthPropertyTree == null)||(!maxArrayLengthPropertyTree.isLeaf())))) {
                        this.maxArrayLength = _other.maxArrayLength;
                    }
                    final PropertyTree maxMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxMessageSize"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxMessageSizePropertyTree!= null):((maxMessageSizePropertyTree == null)||(!maxMessageSizePropertyTree.isLeaf())))) {
                        this.maxMessageSize = _other.maxMessageSize;
                    }
                    final PropertyTree maxBufferSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxBufferSize"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxBufferSizePropertyTree!= null):((maxBufferSizePropertyTree == null)||(!maxBufferSizePropertyTree.isLeaf())))) {
                        this.maxBufferSize = _other.maxBufferSize;
                    }
                    final PropertyTree channelLifetimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("channelLifetime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(channelLifetimePropertyTree!= null):((channelLifetimePropertyTree == null)||(!channelLifetimePropertyTree.isLeaf())))) {
                        this.channelLifetime = _other.channelLifetime;
                    }
                    final PropertyTree securityTokenLifetimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityTokenLifetime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityTokenLifetimePropertyTree!= null):((securityTokenLifetimePropertyTree == null)||(!securityTokenLifetimePropertyTree.isLeaf())))) {
                        this.securityTokenLifetime = _other.securityTokenLifetime;
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

        protected<_P extends EndpointConfiguration >_P init(final _P _product) {
            _product.operationTimeout = this.operationTimeout;
            _product.useBinaryEncoding = this.useBinaryEncoding;
            _product.maxStringLength = this.maxStringLength;
            _product.maxByteStringLength = this.maxByteStringLength;
            _product.maxArrayLength = this.maxArrayLength;
            _product.maxMessageSize = this.maxMessageSize;
            _product.maxBufferSize = this.maxBufferSize;
            _product.channelLifetime = this.channelLifetime;
            _product.securityTokenLifetime = this.securityTokenLifetime;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "operationTimeout" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param operationTimeout
         *     Neuer Wert der Eigenschaft "operationTimeout".
         */
        public EndpointConfiguration.Builder<_B> withOperationTimeout(final Integer operationTimeout) {
            this.operationTimeout = operationTimeout;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "useBinaryEncoding" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param useBinaryEncoding
         *     Neuer Wert der Eigenschaft "useBinaryEncoding".
         */
        public EndpointConfiguration.Builder<_B> withUseBinaryEncoding(final Boolean useBinaryEncoding) {
            this.useBinaryEncoding = useBinaryEncoding;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxStringLength" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param maxStringLength
         *     Neuer Wert der Eigenschaft "maxStringLength".
         */
        public EndpointConfiguration.Builder<_B> withMaxStringLength(final Integer maxStringLength) {
            this.maxStringLength = maxStringLength;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxByteStringLength" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param maxByteStringLength
         *     Neuer Wert der Eigenschaft "maxByteStringLength".
         */
        public EndpointConfiguration.Builder<_B> withMaxByteStringLength(final Integer maxByteStringLength) {
            this.maxByteStringLength = maxByteStringLength;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxArrayLength" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param maxArrayLength
         *     Neuer Wert der Eigenschaft "maxArrayLength".
         */
        public EndpointConfiguration.Builder<_B> withMaxArrayLength(final Integer maxArrayLength) {
            this.maxArrayLength = maxArrayLength;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxMessageSize" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param maxMessageSize
         *     Neuer Wert der Eigenschaft "maxMessageSize".
         */
        public EndpointConfiguration.Builder<_B> withMaxMessageSize(final Integer maxMessageSize) {
            this.maxMessageSize = maxMessageSize;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxBufferSize" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param maxBufferSize
         *     Neuer Wert der Eigenschaft "maxBufferSize".
         */
        public EndpointConfiguration.Builder<_B> withMaxBufferSize(final Integer maxBufferSize) {
            this.maxBufferSize = maxBufferSize;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "channelLifetime" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param channelLifetime
         *     Neuer Wert der Eigenschaft "channelLifetime".
         */
        public EndpointConfiguration.Builder<_B> withChannelLifetime(final Integer channelLifetime) {
            this.channelLifetime = channelLifetime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityTokenLifetime" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param securityTokenLifetime
         *     Neuer Wert der Eigenschaft "securityTokenLifetime".
         */
        public EndpointConfiguration.Builder<_B> withSecurityTokenLifetime(final Integer securityTokenLifetime) {
            this.securityTokenLifetime = securityTokenLifetime;
            return this;
        }

        @Override
        public EndpointConfiguration build() {
            if (_storedValue == null) {
                return this.init(new EndpointConfiguration());
            } else {
                return ((EndpointConfiguration) _storedValue);
            }
        }

        public EndpointConfiguration.Builder<_B> copyOf(final EndpointConfiguration _other) {
            _other.copyTo(this);
            return this;
        }

        public EndpointConfiguration.Builder<_B> copyOf(final EndpointConfiguration.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EndpointConfiguration.Selector<EndpointConfiguration.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EndpointConfiguration.Select _root() {
            return new EndpointConfiguration.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> operationTimeout = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> useBinaryEncoding = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxStringLength = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxByteStringLength = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxArrayLength = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxMessageSize = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxBufferSize = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> channelLifetime = null;
        private com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> securityTokenLifetime = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.operationTimeout!= null) {
                products.put("operationTimeout", this.operationTimeout.init());
            }
            if (this.useBinaryEncoding!= null) {
                products.put("useBinaryEncoding", this.useBinaryEncoding.init());
            }
            if (this.maxStringLength!= null) {
                products.put("maxStringLength", this.maxStringLength.init());
            }
            if (this.maxByteStringLength!= null) {
                products.put("maxByteStringLength", this.maxByteStringLength.init());
            }
            if (this.maxArrayLength!= null) {
                products.put("maxArrayLength", this.maxArrayLength.init());
            }
            if (this.maxMessageSize!= null) {
                products.put("maxMessageSize", this.maxMessageSize.init());
            }
            if (this.maxBufferSize!= null) {
                products.put("maxBufferSize", this.maxBufferSize.init());
            }
            if (this.channelLifetime!= null) {
                products.put("channelLifetime", this.channelLifetime.init());
            }
            if (this.securityTokenLifetime!= null) {
                products.put("securityTokenLifetime", this.securityTokenLifetime.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> operationTimeout() {
            return ((this.operationTimeout == null)?this.operationTimeout = new com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "operationTimeout"):this.operationTimeout);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> useBinaryEncoding() {
            return ((this.useBinaryEncoding == null)?this.useBinaryEncoding = new com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "useBinaryEncoding"):this.useBinaryEncoding);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxStringLength() {
            return ((this.maxStringLength == null)?this.maxStringLength = new com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "maxStringLength"):this.maxStringLength);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxByteStringLength() {
            return ((this.maxByteStringLength == null)?this.maxByteStringLength = new com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "maxByteStringLength"):this.maxByteStringLength);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxArrayLength() {
            return ((this.maxArrayLength == null)?this.maxArrayLength = new com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "maxArrayLength"):this.maxArrayLength);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxMessageSize() {
            return ((this.maxMessageSize == null)?this.maxMessageSize = new com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "maxMessageSize"):this.maxMessageSize);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> maxBufferSize() {
            return ((this.maxBufferSize == null)?this.maxBufferSize = new com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "maxBufferSize"):this.maxBufferSize);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> channelLifetime() {
            return ((this.channelLifetime == null)?this.channelLifetime = new com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "channelLifetime"):this.channelLifetime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>> securityTokenLifetime() {
            return ((this.securityTokenLifetime == null)?this.securityTokenLifetime = new com.kscs.util.jaxb.Selector<TRoot, EndpointConfiguration.Selector<TRoot, TParent>>(this._root, this, "securityTokenLifetime"):this.securityTokenLifetime);
        }

    }

}
