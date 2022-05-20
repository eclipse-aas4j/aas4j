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
 * <p>Java-Klasse für HistoryReadResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryReadResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="ContinuationPoint" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="HistoryData" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryReadResult", propOrder = {
    "statusCode",
    "continuationPoint",
    "historyData"
})
public class HistoryReadResult {

    @XmlElement(name = "StatusCode")
    protected StatusCode statusCode;
    @XmlElementRef(name = "ContinuationPoint", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> continuationPoint;
    @XmlElementRef(name = "HistoryData", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> historyData;

    /**
     * Ruft den Wert der statusCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Legt den Wert der statusCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatusCode(StatusCode value) {
        this.statusCode = value;
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
     * Ruft den Wert der historyData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getHistoryData() {
        return historyData;
    }

    /**
     * Legt den Wert der historyData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setHistoryData(JAXBElement<ExtensionObject> value) {
        this.historyData = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HistoryReadResult.Builder<_B> _other) {
        _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other));
        _other.continuationPoint = this.continuationPoint;
        _other.historyData = this.historyData;
    }

    public<_B >HistoryReadResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryReadResult.Builder<_B>(_parentBuilder, this, true);
    }

    public HistoryReadResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryReadResult.Builder<Void> builder() {
        return new HistoryReadResult.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryReadResult.Builder<_B> copyOf(final HistoryReadResult _other) {
        final HistoryReadResult.Builder<_B> _newBuilder = new HistoryReadResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryReadResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
            _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other, statusCodePropertyTree, _propertyTreeUse));
        }
        final PropertyTree continuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoint"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointPropertyTree!= null):((continuationPointPropertyTree == null)||(!continuationPointPropertyTree.isLeaf())))) {
            _other.continuationPoint = this.continuationPoint;
        }
        final PropertyTree historyDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyDataPropertyTree!= null):((historyDataPropertyTree == null)||(!historyDataPropertyTree.isLeaf())))) {
            _other.historyData = this.historyData;
        }
    }

    public<_B >HistoryReadResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryReadResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HistoryReadResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryReadResult.Builder<_B> copyOf(final HistoryReadResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryReadResult.Builder<_B> _newBuilder = new HistoryReadResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryReadResult.Builder<Void> copyExcept(final HistoryReadResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryReadResult.Builder<Void> copyOnly(final HistoryReadResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final HistoryReadResult _storedValue;
        private StatusCode.Builder<HistoryReadResult.Builder<_B>> statusCode;
        private JAXBElement<byte[]> continuationPoint;
        private JAXBElement<ExtensionObject> historyData;

        public Builder(final _B _parentBuilder, final HistoryReadResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this));
                    this.continuationPoint = _other.continuationPoint;
                    this.historyData = _other.historyData;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryReadResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
                        this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this, statusCodePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree continuationPointPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("continuationPoint"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(continuationPointPropertyTree!= null):((continuationPointPropertyTree == null)||(!continuationPointPropertyTree.isLeaf())))) {
                        this.continuationPoint = _other.continuationPoint;
                    }
                    final PropertyTree historyDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyData"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyDataPropertyTree!= null):((historyDataPropertyTree == null)||(!historyDataPropertyTree.isLeaf())))) {
                        this.historyData = _other.historyData;
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

        protected<_P extends HistoryReadResult >_P init(final _P _product) {
            _product.statusCode = ((this.statusCode == null)?null:this.statusCode.build());
            _product.continuationPoint = this.continuationPoint;
            _product.historyData = this.historyData;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public HistoryReadResult.Builder<_B> withStatusCode(final StatusCode statusCode) {
            this.statusCode = ((statusCode == null)?null:new StatusCode.Builder<HistoryReadResult.Builder<_B>>(this, statusCode, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "statusCode".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "statusCode".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public StatusCode.Builder<? extends HistoryReadResult.Builder<_B>> withStatusCode() {
            if (this.statusCode!= null) {
                return this.statusCode;
            }
            return this.statusCode = new StatusCode.Builder<HistoryReadResult.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "continuationPoint" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param continuationPoint
         *     Neuer Wert der Eigenschaft "continuationPoint".
         */
        public HistoryReadResult.Builder<_B> withContinuationPoint(final JAXBElement<byte[]> continuationPoint) {
            this.continuationPoint = continuationPoint;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyData" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param historyData
         *     Neuer Wert der Eigenschaft "historyData".
         */
        public HistoryReadResult.Builder<_B> withHistoryData(final JAXBElement<ExtensionObject> historyData) {
            this.historyData = historyData;
            return this;
        }

        @Override
        public HistoryReadResult build() {
            if (_storedValue == null) {
                return this.init(new HistoryReadResult());
            } else {
                return ((HistoryReadResult) _storedValue);
            }
        }

        public HistoryReadResult.Builder<_B> copyOf(final HistoryReadResult _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryReadResult.Builder<_B> copyOf(final HistoryReadResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryReadResult.Selector<HistoryReadResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryReadResult.Select _root() {
            return new HistoryReadResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StatusCode.Selector<TRoot, HistoryReadResult.Selector<TRoot, TParent>> statusCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadResult.Selector<TRoot, TParent>> continuationPoint = null;
        private com.kscs.util.jaxb.Selector<TRoot, HistoryReadResult.Selector<TRoot, TParent>> historyData = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.statusCode!= null) {
                products.put("statusCode", this.statusCode.init());
            }
            if (this.continuationPoint!= null) {
                products.put("continuationPoint", this.continuationPoint.init());
            }
            if (this.historyData!= null) {
                products.put("historyData", this.historyData.init());
            }
            return products;
        }

        public StatusCode.Selector<TRoot, HistoryReadResult.Selector<TRoot, TParent>> statusCode() {
            return ((this.statusCode == null)?this.statusCode = new StatusCode.Selector<TRoot, HistoryReadResult.Selector<TRoot, TParent>>(this._root, this, "statusCode"):this.statusCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadResult.Selector<TRoot, TParent>> continuationPoint() {
            return ((this.continuationPoint == null)?this.continuationPoint = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadResult.Selector<TRoot, TParent>>(this._root, this, "continuationPoint"):this.continuationPoint);
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryReadResult.Selector<TRoot, TParent>> historyData() {
            return ((this.historyData == null)?this.historyData = new com.kscs.util.jaxb.Selector<TRoot, HistoryReadResult.Selector<TRoot, TParent>>(this._root, this, "historyData"):this.historyData);
        }

    }

}
