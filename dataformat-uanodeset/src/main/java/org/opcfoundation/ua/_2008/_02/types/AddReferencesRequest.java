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
 * <p>Java-Klasse für AddReferencesRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddReferencesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="ReferencesToAdd" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfAddReferencesItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddReferencesRequest", propOrder = {
    "requestHeader",
    "referencesToAdd"
})
public class AddReferencesRequest {

    @XmlElementRef(name = "RequestHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "ReferencesToAdd", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfAddReferencesItem> referencesToAdd;

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
     * Ruft den Wert der referencesToAdd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfAddReferencesItem }{@code >}
     *     
     */
    public JAXBElement<ListOfAddReferencesItem> getReferencesToAdd() {
        return referencesToAdd;
    }

    /**
     * Legt den Wert der referencesToAdd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfAddReferencesItem }{@code >}
     *     
     */
    public void setReferencesToAdd(JAXBElement<ListOfAddReferencesItem> value) {
        this.referencesToAdd = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final AddReferencesRequest.Builder<_B> _other) {
        _other.requestHeader = this.requestHeader;
        _other.referencesToAdd = this.referencesToAdd;
    }

    public<_B >AddReferencesRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AddReferencesRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public AddReferencesRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AddReferencesRequest.Builder<Void> builder() {
        return new AddReferencesRequest.Builder<Void>(null, null, false);
    }

    public static<_B >AddReferencesRequest.Builder<_B> copyOf(final AddReferencesRequest _other) {
        final AddReferencesRequest.Builder<_B> _newBuilder = new AddReferencesRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AddReferencesRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
            _other.requestHeader = this.requestHeader;
        }
        final PropertyTree referencesToAddPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referencesToAdd"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referencesToAddPropertyTree!= null):((referencesToAddPropertyTree == null)||(!referencesToAddPropertyTree.isLeaf())))) {
            _other.referencesToAdd = this.referencesToAdd;
        }
    }

    public<_B >AddReferencesRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AddReferencesRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public AddReferencesRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AddReferencesRequest.Builder<_B> copyOf(final AddReferencesRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AddReferencesRequest.Builder<_B> _newBuilder = new AddReferencesRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AddReferencesRequest.Builder<Void> copyExcept(final AddReferencesRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AddReferencesRequest.Builder<Void> copyOnly(final AddReferencesRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final AddReferencesRequest _storedValue;
        private JAXBElement<RequestHeader> requestHeader;
        private JAXBElement<ListOfAddReferencesItem> referencesToAdd;

        public Builder(final _B _parentBuilder, final AddReferencesRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.requestHeader = _other.requestHeader;
                    this.referencesToAdd = _other.referencesToAdd;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final AddReferencesRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree requestHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("requestHeader"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(requestHeaderPropertyTree!= null):((requestHeaderPropertyTree == null)||(!requestHeaderPropertyTree.isLeaf())))) {
                        this.requestHeader = _other.requestHeader;
                    }
                    final PropertyTree referencesToAddPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referencesToAdd"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referencesToAddPropertyTree!= null):((referencesToAddPropertyTree == null)||(!referencesToAddPropertyTree.isLeaf())))) {
                        this.referencesToAdd = _other.referencesToAdd;
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

        protected<_P extends AddReferencesRequest >_P init(final _P _product) {
            _product.requestHeader = this.requestHeader;
            _product.referencesToAdd = this.referencesToAdd;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "requestHeader" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param requestHeader
         *     Neuer Wert der Eigenschaft "requestHeader".
         */
        public AddReferencesRequest.Builder<_B> withRequestHeader(final JAXBElement<RequestHeader> requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referencesToAdd" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referencesToAdd
         *     Neuer Wert der Eigenschaft "referencesToAdd".
         */
        public AddReferencesRequest.Builder<_B> withReferencesToAdd(final JAXBElement<ListOfAddReferencesItem> referencesToAdd) {
            this.referencesToAdd = referencesToAdd;
            return this;
        }

        @Override
        public AddReferencesRequest build() {
            if (_storedValue == null) {
                return this.init(new AddReferencesRequest());
            } else {
                return ((AddReferencesRequest) _storedValue);
            }
        }

        public AddReferencesRequest.Builder<_B> copyOf(final AddReferencesRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public AddReferencesRequest.Builder<_B> copyOf(final AddReferencesRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AddReferencesRequest.Selector<AddReferencesRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AddReferencesRequest.Select _root() {
            return new AddReferencesRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AddReferencesRequest.Selector<TRoot, TParent>> requestHeader = null;
        private com.kscs.util.jaxb.Selector<TRoot, AddReferencesRequest.Selector<TRoot, TParent>> referencesToAdd = null;

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
            if (this.referencesToAdd!= null) {
                products.put("referencesToAdd", this.referencesToAdd.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddReferencesRequest.Selector<TRoot, TParent>> requestHeader() {
            return ((this.requestHeader == null)?this.requestHeader = new com.kscs.util.jaxb.Selector<TRoot, AddReferencesRequest.Selector<TRoot, TParent>>(this._root, this, "requestHeader"):this.requestHeader);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AddReferencesRequest.Selector<TRoot, TParent>> referencesToAdd() {
            return ((this.referencesToAdd == null)?this.referencesToAdd = new com.kscs.util.jaxb.Selector<TRoot, AddReferencesRequest.Selector<TRoot, TParent>>(this._root, this, "referencesToAdd"):this.referencesToAdd);
        }

    }

}
