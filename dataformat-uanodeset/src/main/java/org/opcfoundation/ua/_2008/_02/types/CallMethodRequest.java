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
 * <p>Java-Klasse für CallMethodRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallMethodRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="MethodId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="InputArguments" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfVariant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallMethodRequest", propOrder = {
    "objectId",
    "methodId",
    "inputArguments"
})
public class CallMethodRequest {

    @XmlElementRef(name = "ObjectId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> objectId;
    @XmlElementRef(name = "MethodId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> methodId;
    @XmlElementRef(name = "InputArguments", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfVariant> inputArguments;

    /**
     * Ruft den Wert der objectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getObjectId() {
        return objectId;
    }

    /**
     * Legt den Wert der objectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setObjectId(JAXBElement<NodeId> value) {
        this.objectId = value;
    }

    /**
     * Ruft den Wert der methodId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getMethodId() {
        return methodId;
    }

    /**
     * Legt den Wert der methodId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setMethodId(JAXBElement<NodeId> value) {
        this.methodId = value;
    }

    /**
     * Ruft den Wert der inputArguments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public JAXBElement<ListOfVariant> getInputArguments() {
        return inputArguments;
    }

    /**
     * Legt den Wert der inputArguments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public void setInputArguments(JAXBElement<ListOfVariant> value) {
        this.inputArguments = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final CallMethodRequest.Builder<_B> _other) {
        _other.objectId = this.objectId;
        _other.methodId = this.methodId;
        _other.inputArguments = this.inputArguments;
    }

    public<_B >CallMethodRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new CallMethodRequest.Builder<_B>(_parentBuilder, this, true);
    }

    public CallMethodRequest.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static CallMethodRequest.Builder<Void> builder() {
        return new CallMethodRequest.Builder<Void>(null, null, false);
    }

    public static<_B >CallMethodRequest.Builder<_B> copyOf(final CallMethodRequest _other) {
        final CallMethodRequest.Builder<_B> _newBuilder = new CallMethodRequest.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final CallMethodRequest.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree objectIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objectId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objectIdPropertyTree!= null):((objectIdPropertyTree == null)||(!objectIdPropertyTree.isLeaf())))) {
            _other.objectId = this.objectId;
        }
        final PropertyTree methodIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("methodId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(methodIdPropertyTree!= null):((methodIdPropertyTree == null)||(!methodIdPropertyTree.isLeaf())))) {
            _other.methodId = this.methodId;
        }
        final PropertyTree inputArgumentsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inputArguments"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inputArgumentsPropertyTree!= null):((inputArgumentsPropertyTree == null)||(!inputArgumentsPropertyTree.isLeaf())))) {
            _other.inputArguments = this.inputArguments;
        }
    }

    public<_B >CallMethodRequest.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new CallMethodRequest.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public CallMethodRequest.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >CallMethodRequest.Builder<_B> copyOf(final CallMethodRequest _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final CallMethodRequest.Builder<_B> _newBuilder = new CallMethodRequest.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static CallMethodRequest.Builder<Void> copyExcept(final CallMethodRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static CallMethodRequest.Builder<Void> copyOnly(final CallMethodRequest _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final CallMethodRequest _storedValue;
        private JAXBElement<NodeId> objectId;
        private JAXBElement<NodeId> methodId;
        private JAXBElement<ListOfVariant> inputArguments;

        public Builder(final _B _parentBuilder, final CallMethodRequest _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.objectId = _other.objectId;
                    this.methodId = _other.methodId;
                    this.inputArguments = _other.inputArguments;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final CallMethodRequest _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree objectIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("objectId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(objectIdPropertyTree!= null):((objectIdPropertyTree == null)||(!objectIdPropertyTree.isLeaf())))) {
                        this.objectId = _other.objectId;
                    }
                    final PropertyTree methodIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("methodId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(methodIdPropertyTree!= null):((methodIdPropertyTree == null)||(!methodIdPropertyTree.isLeaf())))) {
                        this.methodId = _other.methodId;
                    }
                    final PropertyTree inputArgumentsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("inputArguments"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(inputArgumentsPropertyTree!= null):((inputArgumentsPropertyTree == null)||(!inputArgumentsPropertyTree.isLeaf())))) {
                        this.inputArguments = _other.inputArguments;
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

        protected<_P extends CallMethodRequest >_P init(final _P _product) {
            _product.objectId = this.objectId;
            _product.methodId = this.methodId;
            _product.inputArguments = this.inputArguments;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "objectId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param objectId
         *     Neuer Wert der Eigenschaft "objectId".
         */
        public CallMethodRequest.Builder<_B> withObjectId(final JAXBElement<NodeId> objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "methodId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param methodId
         *     Neuer Wert der Eigenschaft "methodId".
         */
        public CallMethodRequest.Builder<_B> withMethodId(final JAXBElement<NodeId> methodId) {
            this.methodId = methodId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "inputArguments" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param inputArguments
         *     Neuer Wert der Eigenschaft "inputArguments".
         */
        public CallMethodRequest.Builder<_B> withInputArguments(final JAXBElement<ListOfVariant> inputArguments) {
            this.inputArguments = inputArguments;
            return this;
        }

        @Override
        public CallMethodRequest build() {
            if (_storedValue == null) {
                return this.init(new CallMethodRequest());
            } else {
                return ((CallMethodRequest) _storedValue);
            }
        }

        public CallMethodRequest.Builder<_B> copyOf(final CallMethodRequest _other) {
            _other.copyTo(this);
            return this;
        }

        public CallMethodRequest.Builder<_B> copyOf(final CallMethodRequest.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends CallMethodRequest.Selector<CallMethodRequest.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static CallMethodRequest.Select _root() {
            return new CallMethodRequest.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, CallMethodRequest.Selector<TRoot, TParent>> objectId = null;
        private com.kscs.util.jaxb.Selector<TRoot, CallMethodRequest.Selector<TRoot, TParent>> methodId = null;
        private com.kscs.util.jaxb.Selector<TRoot, CallMethodRequest.Selector<TRoot, TParent>> inputArguments = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.objectId!= null) {
                products.put("objectId", this.objectId.init());
            }
            if (this.methodId!= null) {
                products.put("methodId", this.methodId.init());
            }
            if (this.inputArguments!= null) {
                products.put("inputArguments", this.inputArguments.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, CallMethodRequest.Selector<TRoot, TParent>> objectId() {
            return ((this.objectId == null)?this.objectId = new com.kscs.util.jaxb.Selector<TRoot, CallMethodRequest.Selector<TRoot, TParent>>(this._root, this, "objectId"):this.objectId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CallMethodRequest.Selector<TRoot, TParent>> methodId() {
            return ((this.methodId == null)?this.methodId = new com.kscs.util.jaxb.Selector<TRoot, CallMethodRequest.Selector<TRoot, TParent>>(this._root, this, "methodId"):this.methodId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, CallMethodRequest.Selector<TRoot, TParent>> inputArguments() {
            return ((this.inputArguments == null)?this.inputArguments = new com.kscs.util.jaxb.Selector<TRoot, CallMethodRequest.Selector<TRoot, TParent>>(this._root, this, "inputArguments"):this.inputArguments);
        }

    }

}
