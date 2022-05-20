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
 * <p>Java-Klasse für SetTriggeringResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetTriggeringResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ResponseHeader" minOccurs="0"/&gt;
 *         &lt;element name="AddResults" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="AddDiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *         &lt;element name="RemoveResults" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="RemoveDiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTriggeringResponse", propOrder = {
    "responseHeader",
    "addResults",
    "addDiagnosticInfos",
    "removeResults",
    "removeDiagnosticInfos"
})
public class SetTriggeringResponse {

    @XmlElementRef(name = "ResponseHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseHeader> responseHeader;
    @XmlElementRef(name = "AddResults", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStatusCode> addResults;
    @XmlElementRef(name = "AddDiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> addDiagnosticInfos;
    @XmlElementRef(name = "RemoveResults", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStatusCode> removeResults;
    @XmlElementRef(name = "RemoveDiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> removeDiagnosticInfos;

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
     * Ruft den Wert der addResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public JAXBElement<ListOfStatusCode> getAddResults() {
        return addResults;
    }

    /**
     * Legt den Wert der addResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public void setAddResults(JAXBElement<ListOfStatusCode> value) {
        this.addResults = value;
    }

    /**
     * Ruft den Wert der addDiagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getAddDiagnosticInfos() {
        return addDiagnosticInfos;
    }

    /**
     * Legt den Wert der addDiagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setAddDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.addDiagnosticInfos = value;
    }

    /**
     * Ruft den Wert der removeResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public JAXBElement<ListOfStatusCode> getRemoveResults() {
        return removeResults;
    }

    /**
     * Legt den Wert der removeResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public void setRemoveResults(JAXBElement<ListOfStatusCode> value) {
        this.removeResults = value;
    }

    /**
     * Ruft den Wert der removeDiagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getRemoveDiagnosticInfos() {
        return removeDiagnosticInfos;
    }

    /**
     * Legt den Wert der removeDiagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setRemoveDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.removeDiagnosticInfos = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SetTriggeringResponse.Builder<_B> _other) {
        _other.responseHeader = this.responseHeader;
        _other.addResults = this.addResults;
        _other.addDiagnosticInfos = this.addDiagnosticInfos;
        _other.removeResults = this.removeResults;
        _other.removeDiagnosticInfos = this.removeDiagnosticInfos;
    }

    public<_B >SetTriggeringResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SetTriggeringResponse.Builder<_B>(_parentBuilder, this, true);
    }

    public SetTriggeringResponse.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SetTriggeringResponse.Builder<Void> builder() {
        return new SetTriggeringResponse.Builder<Void>(null, null, false);
    }

    public static<_B >SetTriggeringResponse.Builder<_B> copyOf(final SetTriggeringResponse _other) {
        final SetTriggeringResponse.Builder<_B> _newBuilder = new SetTriggeringResponse.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SetTriggeringResponse.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
            _other.responseHeader = this.responseHeader;
        }
        final PropertyTree addResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addResults"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addResultsPropertyTree!= null):((addResultsPropertyTree == null)||(!addResultsPropertyTree.isLeaf())))) {
            _other.addResults = this.addResults;
        }
        final PropertyTree addDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addDiagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addDiagnosticInfosPropertyTree!= null):((addDiagnosticInfosPropertyTree == null)||(!addDiagnosticInfosPropertyTree.isLeaf())))) {
            _other.addDiagnosticInfos = this.addDiagnosticInfos;
        }
        final PropertyTree removeResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("removeResults"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(removeResultsPropertyTree!= null):((removeResultsPropertyTree == null)||(!removeResultsPropertyTree.isLeaf())))) {
            _other.removeResults = this.removeResults;
        }
        final PropertyTree removeDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("removeDiagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(removeDiagnosticInfosPropertyTree!= null):((removeDiagnosticInfosPropertyTree == null)||(!removeDiagnosticInfosPropertyTree.isLeaf())))) {
            _other.removeDiagnosticInfos = this.removeDiagnosticInfos;
        }
    }

    public<_B >SetTriggeringResponse.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SetTriggeringResponse.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SetTriggeringResponse.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SetTriggeringResponse.Builder<_B> copyOf(final SetTriggeringResponse _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SetTriggeringResponse.Builder<_B> _newBuilder = new SetTriggeringResponse.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SetTriggeringResponse.Builder<Void> copyExcept(final SetTriggeringResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SetTriggeringResponse.Builder<Void> copyOnly(final SetTriggeringResponse _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SetTriggeringResponse _storedValue;
        private JAXBElement<ResponseHeader> responseHeader;
        private JAXBElement<ListOfStatusCode> addResults;
        private JAXBElement<ListOfDiagnosticInfo> addDiagnosticInfos;
        private JAXBElement<ListOfStatusCode> removeResults;
        private JAXBElement<ListOfDiagnosticInfo> removeDiagnosticInfos;

        public Builder(final _B _parentBuilder, final SetTriggeringResponse _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.responseHeader = _other.responseHeader;
                    this.addResults = _other.addResults;
                    this.addDiagnosticInfos = _other.addDiagnosticInfos;
                    this.removeResults = _other.removeResults;
                    this.removeDiagnosticInfos = _other.removeDiagnosticInfos;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SetTriggeringResponse _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree responseHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("responseHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(responseHeaderPropertyTree!= null):((responseHeaderPropertyTree == null)||(!responseHeaderPropertyTree.isLeaf())))) {
                        this.responseHeader = _other.responseHeader;
                    }
                    final PropertyTree addResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addResults"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addResultsPropertyTree!= null):((addResultsPropertyTree == null)||(!addResultsPropertyTree.isLeaf())))) {
                        this.addResults = _other.addResults;
                    }
                    final PropertyTree addDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addDiagnosticInfos"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addDiagnosticInfosPropertyTree!= null):((addDiagnosticInfosPropertyTree == null)||(!addDiagnosticInfosPropertyTree.isLeaf())))) {
                        this.addDiagnosticInfos = _other.addDiagnosticInfos;
                    }
                    final PropertyTree removeResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("removeResults"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(removeResultsPropertyTree!= null):((removeResultsPropertyTree == null)||(!removeResultsPropertyTree.isLeaf())))) {
                        this.removeResults = _other.removeResults;
                    }
                    final PropertyTree removeDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("removeDiagnosticInfos"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(removeDiagnosticInfosPropertyTree!= null):((removeDiagnosticInfosPropertyTree == null)||(!removeDiagnosticInfosPropertyTree.isLeaf())))) {
                        this.removeDiagnosticInfos = _other.removeDiagnosticInfos;
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

        protected<_P extends SetTriggeringResponse >_P init(final _P _product) {
            _product.responseHeader = this.responseHeader;
            _product.addResults = this.addResults;
            _product.addDiagnosticInfos = this.addDiagnosticInfos;
            _product.removeResults = this.removeResults;
            _product.removeDiagnosticInfos = this.removeDiagnosticInfos;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "responseHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param responseHeader
         *     Neuer Wert der Eigenschaft "responseHeader".
         */
        public SetTriggeringResponse.Builder<_B> withResponseHeader(final JAXBElement<ResponseHeader> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addResults" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param addResults
         *     Neuer Wert der Eigenschaft "addResults".
         */
        public SetTriggeringResponse.Builder<_B> withAddResults(final JAXBElement<ListOfStatusCode> addResults) {
            this.addResults = addResults;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addDiagnosticInfos" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param addDiagnosticInfos
         *     Neuer Wert der Eigenschaft "addDiagnosticInfos".
         */
        public SetTriggeringResponse.Builder<_B> withAddDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> addDiagnosticInfos) {
            this.addDiagnosticInfos = addDiagnosticInfos;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "removeResults" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param removeResults
         *     Neuer Wert der Eigenschaft "removeResults".
         */
        public SetTriggeringResponse.Builder<_B> withRemoveResults(final JAXBElement<ListOfStatusCode> removeResults) {
            this.removeResults = removeResults;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "removeDiagnosticInfos" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param removeDiagnosticInfos
         *     Neuer Wert der Eigenschaft "removeDiagnosticInfos".
         */
        public SetTriggeringResponse.Builder<_B> withRemoveDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> removeDiagnosticInfos) {
            this.removeDiagnosticInfos = removeDiagnosticInfos;
            return this;
        }

        @Override
        public SetTriggeringResponse build() {
            if (_storedValue == null) {
                return this.init(new SetTriggeringResponse());
            } else {
                return ((SetTriggeringResponse) _storedValue);
            }
        }

        public SetTriggeringResponse.Builder<_B> copyOf(final SetTriggeringResponse _other) {
            _other.copyTo(this);
            return this;
        }

        public SetTriggeringResponse.Builder<_B> copyOf(final SetTriggeringResponse.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SetTriggeringResponse.Selector<SetTriggeringResponse.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SetTriggeringResponse.Select _root() {
            return new SetTriggeringResponse.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> responseHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> addResults = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> addDiagnosticInfos = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> removeResults = null;
        private com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> removeDiagnosticInfos = null;

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
            if (this.addResults!= null) {
                products.put("addResults", this.addResults.init());
            }
            if (this.addDiagnosticInfos!= null) {
                products.put("addDiagnosticInfos", this.addDiagnosticInfos.init());
            }
            if (this.removeResults!= null) {
                products.put("removeResults", this.removeResults.init());
            }
            if (this.removeDiagnosticInfos!= null) {
                products.put("removeDiagnosticInfos", this.removeDiagnosticInfos.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> responseHeader() {
            return ((this.responseHeader == null)?this.responseHeader = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>>(this._root, this, "responseHeader"):this.responseHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> addResults() {
            return ((this.addResults == null)?this.addResults = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>>(this._root, this, "addResults"):this.addResults);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> addDiagnosticInfos() {
            return ((this.addDiagnosticInfos == null)?this.addDiagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>>(this._root, this, "addDiagnosticInfos"):this.addDiagnosticInfos);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> removeResults() {
            return ((this.removeResults == null)?this.removeResults = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>>(this._root, this, "removeResults"):this.removeResults);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>> removeDiagnosticInfos() {
            return ((this.removeDiagnosticInfos == null)?this.removeDiagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, SetTriggeringResponse.Selector<TRoot, TParent>>(this._root, this, "removeDiagnosticInfos"):this.removeDiagnosticInfos);
        }

    }

}
