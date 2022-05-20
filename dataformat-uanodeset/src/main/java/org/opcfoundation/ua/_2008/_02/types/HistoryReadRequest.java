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
 * <p>Java-Klasse für HistoryReadRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryReadRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="HistoryReadDetails" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="TimestampsToReturn" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}TimestampsToReturn" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseContinuationPoints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NodesToRead" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfHistoryReadValueId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryReadRequest", propOrder = {
    "requestHeader",
    "historyReadDetails",
    "timestampsToReturn",
    "releaseContinuationPoints",
    "nodesToRead"
})
public class HistoryReadRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "HistoryReadDetails", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> historyReadDetails;
    @XmlElement(name = "TimestampsToReturn")
    @XmlSchemaType(name = "string")
    protected TimestampsToReturn timestampsToReturn;
    @XmlElement(name = "ReleaseContinuationPoints")
    protected Boolean releaseContinuationPoints;
    @XmlElementRef(name = "NodesToRead", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfHistoryReadValueId> nodesToRead;

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
     * Ruft den Wert der historyReadDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getHistoryReadDetails() {
        return historyReadDetails;
    }

    /**
     * Legt den Wert der historyReadDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setHistoryReadDetails(JAXBElement<ExtensionObject> value) {
        this.historyReadDetails = value;
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
     * Ruft den Wert der nodesToRead-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfHistoryReadValueId }{@code >}
     *     
     */
    public JAXBElement<ListOfHistoryReadValueId> getNodesToRead() {
        return nodesToRead;
    }

    /**
     * Legt den Wert der nodesToRead-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfHistoryReadValueId }{@code >}
     *     
     */
    public void setNodesToRead(JAXBElement<ListOfHistoryReadValueId> value) {
        this.nodesToRead = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HistoryReadRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.historyReadDetails = this.historyReadDetails;
        _other.timestampsToReturn = this.timestampsToReturn;
        _other.releaseContinuationPoints = this.releaseContinuationPoints;
        _other.nodesToRead = this.nodesToRead;
    }

    public<_B >HistoryReadRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryReadRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public HistoryReadRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryReadRequest.Builder<Void> builder() {
        return new HistoryReadRequest.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryReadRequest.Builder<_B> copyOf(final HistoryReadRequest _other) {
        final HistoryReadRequest.Builder<_B> _newBuilder = new HistoryReadRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryReadRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree historyReadDetailsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyReadDetails"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyReadDetailsPropertyTree!= null):((historyReadDetailsPropertyTree == null)||(!historyReadDetailsPropertyTree.isLeaf())))) {
            _other.historyReadDetails = this.historyReadDetails;
        }
        final PropertyTree timestampsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestampsToReturn"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampsToReturnPropertyTree!= null):((timestampsToReturnPropertyTree == null)||(!timestampsToReturnPropertyTree.isLeaf())))) {
            _other.timestampsToReturn = this.timestampsToReturn;
        }
        final PropertyTree releaseContinuationPointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("releaseContinuationPoints"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(releaseContinuationPointsPropertyTree!= null):((releaseContinuationPointsPropertyTree == null)||(!releaseContinuationPointsPropertyTree.isLeaf())))) {
            _other.releaseContinuationPoints = this.releaseContinuationPoints;
        }
        final PropertyTree nodesToReadPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodesToRead"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodesToReadPropertyTree!= null):((nodesToReadPropertyTree == null)||(!nodesToReadPropertyTree.isLeaf())))) {
            _other.nodesToRead = this.nodesToRead;
        }
    }

    public<_B >HistoryReadRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryReadRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HistoryReadRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryReadRequest.Builder<_B> copyOf(final HistoryReadRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryReadRequest.Builder<_B> _newBuilder = new HistoryReadRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryReadRequest.Builder<Void> copyExcept(final HistoryReadRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryReadRequest.Builder<Void> copyOnly(final HistoryReadRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final HistoryReadRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ExtensionObject> historyReadDetails;
        private TimestampsToReturn timestampsToReturn;
        private Boolean releaseContinuationPoints;
        private JAXBElement<ListOfHistoryReadValueId> nodesToRead;

        public Builder(final _B _parentBuilder, final HistoryReadRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.historyReadDetails = _other.historyReadDetails;
                    this.timestampsToReturn = _other.timestampsToReturn;
                    this.releaseContinuationPoints = _other.releaseContinuationPoints;
                    this.nodesToRead = _other.nodesToRead;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryReadRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree historyReadDetailsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyReadDetails"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyReadDetailsPropertyTree!= null):((historyReadDetailsPropertyTree == null)||(!historyReadDetailsPropertyTree.isLeaf())))) {
                        this.historyReadDetails = _other.historyReadDetails;
                    }
                    final PropertyTree timestampsToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestampsToReturn"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampsToReturnPropertyTree!= null):((timestampsToReturnPropertyTree == null)||(!timestampsToReturnPropertyTree.isLeaf())))) {
                        this.timestampsToReturn = _other.timestampsToReturn;
                    }
                    final PropertyTree releaseContinuationPointsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("releaseContinuationPoints"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(releaseContinuationPointsPropertyTree!= null):((releaseContinuationPointsPropertyTree == null)||(!releaseContinuationPointsPropertyTree.isLeaf())))) {
                        this.releaseContinuationPoints = _other.releaseContinuationPoints;
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

        protected<_P extends HistoryReadRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.historyReadDetails = this.historyReadDetails;
            _product.timestampsToReturn = this.timestampsToReturn;
            _product.releaseContinuationPoints = this.releaseContinuationPoints;
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
        public HistoryReadRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyReadDetails" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param historyReadDetails
         *     Neuer Wert der Eigenschaft "historyReadDetails".
         */
        public HistoryReadRequest.Builder<_B> withHistoryReadDetails(final JAXBElement<ExtensionObject> historyReadDetails) {
            this.historyReadDetails = historyReadDetails;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "timestampsToReturn" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param timestampsToReturn
         *     Neuer Wert der Eigenschaft "timestampsToReturn".
         */
        public HistoryReadRequest.Builder<_B> withTimestampsToReturn(final TimestampsToReturn timestampsToReturn) {
            this.timestampsToReturn = timestampsToReturn;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "releaseContinuationPoints" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param releaseContinuationPoints
         *     Neuer Wert der Eigenschaft "releaseContinuationPoints".
         */
        public HistoryReadRequest.Builder<_B> withReleaseContinuationPoints(final Boolean releaseContinuationPoints) {
            this.releaseContinuationPoints = releaseContinuationPoints;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodesToRead" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param nodesToRead
         *     Neuer Wert der Eigenschaft "nodesToRead".
         */
        public HistoryReadRequest.Builder<_B> withNodesToRead(final JAXBElement<ListOfHistoryReadValueId> nodesToRead) {
            this.nodesToRead = nodesToRead;
            return this;
        }

        @Override
        public HistoryReadRequest build() {
            if (_storedValue == null) {
                return this.init(new HistoryReadRequest());
            } else {
                return ((HistoryReadRequest) _storedValue);
            }
        }

        public HistoryReadRequest.Builder<_B> copyOf(final HistoryReadRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryReadRequest.Builder<_B> copyOf(final HistoryReadRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryReadRequest.Selector<HistoryReadRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryReadRequest.Select _root() {
            return new HistoryReadRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> historyReadDetails = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> timestampsToReturn = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> releaseContinuationPoints = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> nodesToRead = null;

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
            if (this.historyReadDetails!= null) {
                products.put("historyReadDetails", this.historyReadDetails.init());
            }
            if (this.timestampsToReturn!= null) {
                products.put("timestampsToReturn", this.timestampsToReturn.init());
            }
            if (this.releaseContinuationPoints!= null) {
                products.put("releaseContinuationPoints", this.releaseContinuationPoints.init());
            }
            if (this.nodesToRead!= null) {
                products.put("nodesToRead", this.nodesToRead.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> historyReadDetails() {
            return ((this.historyReadDetails == null)?this.historyReadDetails = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>>(this._root, this, "historyReadDetails"):this.historyReadDetails);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> timestampsToReturn() {
            return ((this.timestampsToReturn == null)?this.timestampsToReturn = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>>(this._root, this, "timestampsToReturn"):this.timestampsToReturn);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> releaseContinuationPoints() {
            return ((this.releaseContinuationPoints == null)?this.releaseContinuationPoints = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>>(this._root, this, "releaseContinuationPoints"):this.releaseContinuationPoints);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>> nodesToRead() {
            return ((this.nodesToRead == null)?this.nodesToRead = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadRequest.Selector<TRoot, TParent>>(this._root, this, "nodesToRead"):this.nodesToRead);
        }

    }

}
