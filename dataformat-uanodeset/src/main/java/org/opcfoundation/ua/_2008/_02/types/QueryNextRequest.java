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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für QueryNextRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QueryNextRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseContinuationPoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContinuationPoint" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryNextRequest", propOrder = {
    "requestHeader",
    "releaseContinuationPoint",
    "continuationPoint"
})
public class QueryNextRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "ReleaseContinuationPoint")
    protected Boolean releaseContinuationPoint;
    @XmlElementRef(name = "ContinuationPoint", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> continuationPoint;

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
     * Ruft den Wert der releaseContinuationPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReleaseContinuationPoint() {
        return releaseContinuationPoint;
    }

    /**
     * Legt den Wert der releaseContinuationPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReleaseContinuationPoint(Boolean value) {
        this.releaseContinuationPoint = value;
    }

    /**
     * Ruft den Wert der continuationPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getContinuationPoint() {
        return continuationPoint;
    }

    /**
     * Legt den Wert der continuationPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setContinuationPoint(JAXBElement<byte[]> value) {
        this.continuationPoint = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final QueryNextRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.releaseContinuationPoint = this.releaseContinuationPoint;
        _other.continuationPoint = this.continuationPoint;
    }

    public<_B >QueryNextRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new QueryNextRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public QueryNextRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static QueryNextRequest.Builder<Void> builder() {
        return new QueryNextRequest.Builder<Void>(null, null, false);
    }

    public static<_B >QueryNextRequest.Builder<_B> copyOf(final QueryNextRequest _other) {
        final QueryNextRequest.Builder<_B> _newBuilder = new QueryNextRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final QueryNextRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree releaseContinuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("releaseContinuationPoint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(releaseContinuationPointPropertyTree!= null):((releaseContinuationPointPropertyTree == null)||(!releaseContinuationPointPropertyTree.isLeaf())))) {
            _other.releaseContinuationPoint = this.releaseContinuationPoint;
        }
        final PropertyTree continuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointPropertyTree!= null):((continuationPointPropertyTree == null)||(!continuationPointPropertyTree.isLeaf())))) {
            _other.continuationPoint = this.continuationPoint;
        }
    }

    public<_B >QueryNextRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new QueryNextRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public QueryNextRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >QueryNextRequest.Builder<_B> copyOf(final QueryNextRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final QueryNextRequest.Builder<_B> _newBuilder = new QueryNextRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static QueryNextRequest.Builder<Void> copyExcept(final QueryNextRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static QueryNextRequest.Builder<Void> copyOnly(final QueryNextRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final QueryNextRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Boolean releaseContinuationPoint;
        private JAXBElement<byte[]> continuationPoint;

        public Builder(final _B _parentBuilder, final QueryNextRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.releaseContinuationPoint = _other.releaseContinuationPoint;
                    this.continuationPoint = _other.continuationPoint;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final QueryNextRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree releaseContinuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("releaseContinuationPoint"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(releaseContinuationPointPropertyTree!= null):((releaseContinuationPointPropertyTree == null)||(!releaseContinuationPointPropertyTree.isLeaf())))) {
                        this.releaseContinuationPoint = _other.releaseContinuationPoint;
                    }
                    final PropertyTree continuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoint"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointPropertyTree!= null):((continuationPointPropertyTree == null)||(!continuationPointPropertyTree.isLeaf())))) {
                        this.continuationPoint = _other.continuationPoint;
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

        protected<_P extends QueryNextRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.releaseContinuationPoint = this.releaseContinuationPoint;
            _product.continuationPoint = this.continuationPoint;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public QueryNextRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "releaseContinuationPoint" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param releaseContinuationPoint
         *     Neuer Wert der Eigenschaft "releaseContinuationPoint".
         */
        public QueryNextRequest.Builder<_B> withReleaseContinuationPoint(final Boolean releaseContinuationPoint) {
            this.releaseContinuationPoint = releaseContinuationPoint;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "continuationPoint" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param continuationPoint
         *     Neuer Wert der Eigenschaft "continuationPoint".
         */
        public QueryNextRequest.Builder<_B> withContinuationPoint(final JAXBElement<byte[]> continuationPoint) {
            this.continuationPoint = continuationPoint;
            return this;
        }

        @Override
        public QueryNextRequest build() {
            if (_storedValue == null) {
                return this.init(new QueryNextRequest());
            } else {
                return ((QueryNextRequest) _storedValue);
            }
        }

        public QueryNextRequest.Builder<_B> copyOf(final QueryNextRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public QueryNextRequest.Builder<_B> copyOf(final QueryNextRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends QueryNextRequest.Selector<QueryNextRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static QueryNextRequest.Select _root() {
            return new QueryNextRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, QueryNextRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryNextRequest.Selector<TRoot, TParent>> releaseContinuationPoint = null;
        private com.kscs.util.jaxb.Selector<TRoot, QueryNextRequest.Selector<TRoot, TParent>> continuationPoint = null;

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
            if (this.releaseContinuationPoint!= null) {
                products.put("releaseContinuationPoint", this.releaseContinuationPoint.init());
            }
            if (this.continuationPoint!= null) {
                products.put("continuationPoint", this.continuationPoint.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryNextRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, QueryNextRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryNextRequest.Selector<TRoot, TParent>> releaseContinuationPoint() {
            return ((this.releaseContinuationPoint == null)?this.releaseContinuationPoint = new com.kscs.util.jaxb.Selector<TRoot, QueryNextRequest.Selector<TRoot, TParent>>(this._root, this, "releaseContinuationPoint"):this.releaseContinuationPoint);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QueryNextRequest.Selector<TRoot, TParent>> continuationPoint() {
            return ((this.continuationPoint == null)?this.continuationPoint = new com.kscs.util.jaxb.Selector<TRoot, QueryNextRequest.Selector<TRoot, TParent>>(this._root, this, "continuationPoint"):this.continuationPoint);
        }

    }

}
