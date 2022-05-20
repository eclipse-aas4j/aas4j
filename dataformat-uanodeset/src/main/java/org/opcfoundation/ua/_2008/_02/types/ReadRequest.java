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
 * <p>Java-Klasse für ReadRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReadRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TimestampsToReturn" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}TimestampsToReturn" minOccurs="0"/&gt;
 *         &lt;element name="NodesToRead" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfReadValueId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadRequest", propOrder = {
    "requestHeader",
    "maxAge",
    "timestampsToReturn",
    "nodesToRead"
})
public class ReadRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "MaxAge")
    protected Double maxAge;
    @XmlElement(name = "TimestampsToReturn")
    @XmlSchemaType(name = "string")
    protected TimestampsToReturn timestampsToReturn;
    @XmlElementRef(name = "NodesToRead", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfReadValueId> nodesToRead;

    /**
     * Ruft den Wert der requestHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public JAXBElement<RequestHeader> getRequestHeader() {
        return requestHeader;
    }

    /**
     * Legt den Wert der requestHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public void setRequestHeader(JAXBElement<RequestHeader> value) {
        this.requestHeader = value;
    }

    /**
     * Ruft den Wert der maxAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxAge() {
        return maxAge;
    }

    /**
     * Legt den Wert der maxAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxAge(Double value) {
        this.maxAge = value;
    }

    /**
     * Ruft den Wert der timestampsToReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimestampsToReturn }
     *     
     */
    public TimestampsToReturn getTimestampsToReturn() {
        return timestampsToReturn;
    }

    /**
     * Legt den Wert der timestampsToReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampsToReturn }
     *     
     */
    public void setTimestampsToReturn(TimestampsToReturn value) {
        this.timestampsToReturn = value;
    }

    /**
     * Ruft den Wert der nodesToRead-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfReadValueId }{@code >}
     *     
     */
    public JAXBElement<ListOfReadValueId> getNodesToRead() {
        return nodesToRead;
    }

    /**
     * Legt den Wert der nodesToRead-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfReadValueId }{@code >}
     *     
     */
    public void setNodesToRead(JAXBElement<ListOfReadValueId> value) {
        this.nodesToRead = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ReadRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.maxAge = this.maxAge;
        _other.timestampsToReturn = this.timestampsToReturn;
        _other.nodesToRead = this.nodesToRead;
    }

    public<_B >ReadRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ReadRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public ReadRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ReadRequest.Builder<Void> builder() {
        return new ReadRequest.Builder<Void>(null, null, false);
    }

    public static<_B >ReadRequest.Builder<_B> copyOf(final ReadRequest _other) {
        final ReadRequest.Builder<_B> _newBuilder = new ReadRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ReadRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree maxAgePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxAge"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxAgePropertyTree!= null):((maxAgePropertyTree == null)||(!maxAgePropertyTree.isLeaf())))) {
            _other.maxAge = this.maxAge;
        }
        final PropertyTree timestampsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestampsToReturn"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampsToReturnPropertyTree!= null):((timestampsToReturnPropertyTree == null)||(!timestampsToReturnPropertyTree.isLeaf())))) {
            _other.timestampsToReturn = this.timestampsToReturn;
        }
        final PropertyTree nodesToReadPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToRead"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToReadPropertyTree!= null):((nodesToReadPropertyTree == null)||(!nodesToReadPropertyTree.isLeaf())))) {
            _other.nodesToRead = this.nodesToRead;
        }
    }

    public<_B >ReadRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ReadRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ReadRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ReadRequest.Builder<_B> copyOf(final ReadRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReadRequest.Builder<_B> _newBuilder = new ReadRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ReadRequest.Builder<Void> copyExcept(final ReadRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReadRequest.Builder<Void> copyOnly(final ReadRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ReadRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Double maxAge;
        private TimestampsToReturn timestampsToReturn;
        private JAXBElement<ListOfReadValueId> nodesToRead;

        public Builder(final _B _parentBuilder, final ReadRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.maxAge = _other.maxAge;
                    this.timestampsToReturn = _other.timestampsToReturn;
                    this.nodesToRead = _other.nodesToRead;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ReadRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree maxAgePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxAge"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxAgePropertyTree!= null):((maxAgePropertyTree == null)||(!maxAgePropertyTree.isLeaf())))) {
                        this.maxAge = _other.maxAge;
                    }
                    final PropertyTree timestampsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestampsToReturn"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampsToReturnPropertyTree!= null):((timestampsToReturnPropertyTree == null)||(!timestampsToReturnPropertyTree.isLeaf())))) {
                        this.timestampsToReturn = _other.timestampsToReturn;
                    }
                    final PropertyTree nodesToReadPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToRead"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToReadPropertyTree!= null):((nodesToReadPropertyTree == null)||(!nodesToReadPropertyTree.isLeaf())))) {
                        this.nodesToRead = _other.nodesToRead;
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

        protected<_P extends ReadRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.maxAge = this.maxAge;
            _product.timestampsToReturn = this.timestampsToReturn;
            _product.nodesToRead = this.nodesToRead;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public ReadRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxAge" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param maxAge
         *     Neuer Wert der Eigenschaft "maxAge".
         */
        public ReadRequest.Builder<_B> withMaxAge(final Double maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "timestampsToReturn" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param timestampsToReturn
         *     Neuer Wert der Eigenschaft "timestampsToReturn".
         */
        public ReadRequest.Builder<_B> withTimestampsToReturn(final TimestampsToReturn timestampsToReturn) {
            this.timestampsToReturn = timestampsToReturn;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodesToRead" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param nodesToRead
         *     Neuer Wert der Eigenschaft "nodesToRead".
         */
        public ReadRequest.Builder<_B> withNodesToRead(final JAXBElement<ListOfReadValueId> nodesToRead) {
            this.nodesToRead = nodesToRead;
            return this;
        }

        @Override
        public ReadRequest build() {
            if (_storedValue == null) {
                return this.init(new ReadRequest());
            } else {
                return ((ReadRequest) _storedValue);
            }
        }

        public ReadRequest.Builder<_B> copyOf(final ReadRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public ReadRequest.Builder<_B> copyOf(final ReadRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ReadRequest.Selector<ReadRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ReadRequest.Select _root() {
            return new ReadRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>> maxAge = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>> timestampsToReturn = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>> nodesToRead = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.requestHeader!= null) {
                products.put("requestHeader", this.requestHeader.init());
            }
            if (this.maxAge!= null) {
                products.put("maxAge", this.maxAge.init());
            }
            if (this.timestampsToReturn!= null) {
                products.put("timestampsToReturn", this.timestampsToReturn.init());
            }
            if (this.nodesToRead!= null) {
                products.put("nodesToRead", this.nodesToRead.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>> maxAge() {
            return ((this.maxAge == null)?this.maxAge = new com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>>(this._root, this, "maxAge"):this.maxAge);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>> timestampsToReturn() {
            return ((this.timestampsToReturn == null)?this.timestampsToReturn = new com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>>(this._root, this, "timestampsToReturn"):this.timestampsToReturn);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>> nodesToRead() {
            return ((this.nodesToRead == null)?this.nodesToRead = new com.kscs.util.jaxb.Selector<TRoot, ReadRequest.Selector<TRoot, TParent>>(this._root, this, "nodesToRead"):this.nodesToRead);
        }

    }

}
