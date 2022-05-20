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
 * <p>Java-Klasse für BrowseNextRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BrowseNextRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseContinuationPoints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContinuationPoints" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfByteString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowseNextRequest", propOrder = {
    "requestHeader",
    "releaseContinuationPoints",
    "continuationPoints"
})
public class BrowseNextRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElement(name = "ReleaseContinuationPoints")
    protected Boolean releaseContinuationPoints;
    @XmlElementRef(name = "ContinuationPoints", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfByteString> continuationPoints;

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
     * Ruft den Wert der releaseContinuationPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReleaseContinuationPoints() {
        return releaseContinuationPoints;
    }

    /**
     * Legt den Wert der releaseContinuationPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReleaseContinuationPoints(Boolean value) {
        this.releaseContinuationPoints = value;
    }

    /**
     * Ruft den Wert der continuationPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public JAXBElement<ListOfByteString> getContinuationPoints() {
        return continuationPoints;
    }

    /**
     * Legt den Wert der continuationPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public void setContinuationPoints(JAXBElement<ListOfByteString> value) {
        this.continuationPoints = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final BrowseNextRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.releaseContinuationPoints = this.releaseContinuationPoints;
        _other.continuationPoints = this.continuationPoints;
    }

    public<_B >BrowseNextRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new BrowseNextRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public BrowseNextRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static BrowseNextRequest.Builder<Void> builder() {
        return new BrowseNextRequest.Builder<Void>(null, null, false);
    }

    public static<_B >BrowseNextRequest.Builder<_B> copyOf(final BrowseNextRequest _other) {
        final BrowseNextRequest.Builder<_B> _newBuilder = new BrowseNextRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final BrowseNextRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree releaseContinuationPointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("releaseContinuationPoints"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(releaseContinuationPointsPropertyTree!= null):((releaseContinuationPointsPropertyTree == null)||(!releaseContinuationPointsPropertyTree.isLeaf())))) {
            _other.releaseContinuationPoints = this.releaseContinuationPoints;
        }
        final PropertyTree continuationPointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoints"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointsPropertyTree!= null):((continuationPointsPropertyTree == null)||(!continuationPointsPropertyTree.isLeaf())))) {
            _other.continuationPoints = this.continuationPoints;
        }
    }

    public<_B >BrowseNextRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new BrowseNextRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public BrowseNextRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >BrowseNextRequest.Builder<_B> copyOf(final BrowseNextRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BrowseNextRequest.Builder<_B> _newBuilder = new BrowseNextRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static BrowseNextRequest.Builder<Void> copyExcept(final BrowseNextRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BrowseNextRequest.Builder<Void> copyOnly(final BrowseNextRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final BrowseNextRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private Boolean releaseContinuationPoints;
        private JAXBElement<ListOfByteString> continuationPoints;

        public Builder(final _B _parentBuilder, final BrowseNextRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.releaseContinuationPoints = _other.releaseContinuationPoints;
                    this.continuationPoints = _other.continuationPoints;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final BrowseNextRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree releaseContinuationPointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("releaseContinuationPoints"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(releaseContinuationPointsPropertyTree!= null):((releaseContinuationPointsPropertyTree == null)||(!releaseContinuationPointsPropertyTree.isLeaf())))) {
                        this.releaseContinuationPoints = _other.releaseContinuationPoints;
                    }
                    final PropertyTree continuationPointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoints"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointsPropertyTree!= null):((continuationPointsPropertyTree == null)||(!continuationPointsPropertyTree.isLeaf())))) {
                        this.continuationPoints = _other.continuationPoints;
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

        protected<_P extends BrowseNextRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.releaseContinuationPoints = this.releaseContinuationPoints;
            _product.continuationPoints = this.continuationPoints;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public BrowseNextRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "releaseContinuationPoints" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param releaseContinuationPoints
         *     Neuer Wert der Eigenschaft "releaseContinuationPoints".
         */
        public BrowseNextRequest.Builder<_B> withReleaseContinuationPoints(final Boolean releaseContinuationPoints) {
            this.releaseContinuationPoints = releaseContinuationPoints;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "continuationPoints" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param continuationPoints
         *     Neuer Wert der Eigenschaft "continuationPoints".
         */
        public BrowseNextRequest.Builder<_B> withContinuationPoints(final JAXBElement<ListOfByteString> continuationPoints) {
            this.continuationPoints = continuationPoints;
            return this;
        }

        @Override
        public BrowseNextRequest build() {
            if (_storedValue == null) {
                return this.init(new BrowseNextRequest());
            } else {
                return ((BrowseNextRequest) _storedValue);
            }
        }

        public BrowseNextRequest.Builder<_B> copyOf(final BrowseNextRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public BrowseNextRequest.Builder<_B> copyOf(final BrowseNextRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends BrowseNextRequest.Selector<BrowseNextRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static BrowseNextRequest.Select _root() {
            return new BrowseNextRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, BrowseNextRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseNextRequest.Selector<TRoot, TParent>> releaseContinuationPoints = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseNextRequest.Selector<TRoot, TParent>> continuationPoints = null;

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
            if (this.releaseContinuationPoints!= null) {
                products.put("releaseContinuationPoints", this.releaseContinuationPoints.init());
            }
            if (this.continuationPoints!= null) {
                products.put("continuationPoints", this.continuationPoints.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseNextRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, BrowseNextRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseNextRequest.Selector<TRoot, TParent>> releaseContinuationPoints() {
            return ((this.releaseContinuationPoints == null)?this.releaseContinuationPoints = new com.kscs.util.jaxb.Selector<TRoot, BrowseNextRequest.Selector<TRoot, TParent>>(this._root, this, "releaseContinuationPoints"):this.releaseContinuationPoints);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseNextRequest.Selector<TRoot, TParent>> continuationPoints() {
            return ((this.continuationPoints == null)?this.continuationPoints = new com.kscs.util.jaxb.Selector<TRoot, BrowseNextRequest.Selector<TRoot, TParent>>(this._root, this, "continuationPoints"):this.continuationPoints);
        }

    }

}
