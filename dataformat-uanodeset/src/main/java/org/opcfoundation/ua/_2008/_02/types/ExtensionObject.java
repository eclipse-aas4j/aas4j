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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import org.w3c.dom.Element;


/**
 * <p>Java-Klasse für ExtensionObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExtensionObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="Body" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionObject", propOrder = {
    "typeId",
    "body"
})
public class ExtensionObject {

    @XmlElementRef(name = "TypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> typeId;
    @XmlElementRef(name = "Body", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject.Body> body;

    /**
     * Ruft den Wert der typeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getTypeId() {
        return typeId;
    }

    /**
     * Legt den Wert der typeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setTypeId(JAXBElement<NodeId> value) {
        this.typeId = value;
    }

    /**
     * Ruft den Wert der body-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject.Body }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject.Body> getBody() {
        return body;
    }

    /**
     * Legt den Wert der body-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject.Body }{@code >}
     *     
     */
    public void setBody(JAXBElement<ExtensionObject.Body> value) {
        this.body = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ExtensionObject.Builder<_B> _other) {
        _other.typeId = this.typeId;
        _other.body = this.body;
    }

    public<_B >ExtensionObject.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ExtensionObject.Builder<_B>(_parentBuilder, this, true);
    }

    public ExtensionObject.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ExtensionObject.Builder<Void> builder() {
        return new ExtensionObject.Builder<Void>(null, null, false);
    }

    public static<_B >ExtensionObject.Builder<_B> copyOf(final ExtensionObject _other) {
        final ExtensionObject.Builder<_B> _newBuilder = new ExtensionObject.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ExtensionObject.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree typeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeIdPropertyTree!= null):((typeIdPropertyTree == null)||(!typeIdPropertyTree.isLeaf())))) {
            _other.typeId = this.typeId;
        }
        final PropertyTree bodyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(bodyPropertyTree!= null):((bodyPropertyTree == null)||(!bodyPropertyTree.isLeaf())))) {
            _other.body = this.body;
        }
    }

    public<_B >ExtensionObject.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ExtensionObject.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ExtensionObject.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ExtensionObject.Builder<_B> copyOf(final ExtensionObject _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ExtensionObject.Builder<_B> _newBuilder = new ExtensionObject.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ExtensionObject.Builder<Void> copyExcept(final ExtensionObject _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ExtensionObject.Builder<Void> copyOnly(final ExtensionObject _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Body {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Ruft den Wert der any-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Legt den Wert der any-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        /**
         * Copies all state of this object to a builder. This method is used by the {@link
         * #copyOf} method and should not be called directly by client code.
         * 
         * @param _other
         *     A builder instance to which the state of this object will be copied.
         */
        public<_B >void copyTo(final ExtensionObject.Body.Builder<_B> _other) {
        }

        public<_B >ExtensionObject.Body.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
            return new ExtensionObject.Body.Builder<_B>(_parentBuilder, this, true);
        }

        public ExtensionObject.Body.Builder<Void> newCopyBuilder() {
            return newCopyBuilder(null);
        }

        public static ExtensionObject.Body.Builder<Void> builder() {
            return new ExtensionObject.Body.Builder<Void>(null, null, false);
        }

        public static<_B >ExtensionObject.Body.Builder<_B> copyOf(final ExtensionObject.Body _other) {
            final ExtensionObject.Body.Builder<_B> _newBuilder = new ExtensionObject.Body.Builder<_B>(null, null, false);
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
        public<_B >void copyTo(final ExtensionObject.Body.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        }

        public<_B >ExtensionObject.Body.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            return new ExtensionObject.Body.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
        }

        public ExtensionObject.Body.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
        }

        public static<_B >ExtensionObject.Body.Builder<_B> copyOf(final ExtensionObject.Body _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            final ExtensionObject.Body.Builder<_B> _newBuilder = new ExtensionObject.Body.Builder<_B>(null, null, false);
            _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
            return _newBuilder;
        }

        public static ExtensionObject.Body.Builder<Void> copyExcept(final ExtensionObject.Body _other, final PropertyTree _propertyTree) {
            return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
        }

        public static ExtensionObject.Body.Builder<Void> copyOnly(final ExtensionObject.Body _other, final PropertyTree _propertyTree) {
            return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
        }

        public static class Builder<_B >implements Buildable
        {

            protected final _B _parentBuilder;
            protected final ExtensionObject.Body _storedValue;
            private Object any;

            public Builder(final _B _parentBuilder, final ExtensionObject.Body _other, final boolean _copy) {
                this._parentBuilder = _parentBuilder;
                if (_other!= null) {
                    if (_copy) {
                        _storedValue = null;
                    } else {
                        _storedValue = _other;
                    }
                } else {
                    _storedValue = null;
                }
            }

            public Builder(final _B _parentBuilder, final ExtensionObject.Body _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
                this._parentBuilder = _parentBuilder;
                if (_other!= null) {
                    if (_copy) {
                        _storedValue = null;
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

            protected<_P extends ExtensionObject.Body >_P init(final _P _product) {
                _product.any = this.any;
                return _product;
            }

            /**
             * Setzt den neuen Wert der Eigenschaft "any" (Vorher zugewiesener Wert wird
             * ersetzt)
             * 
             * @param any
             *     Neuer Wert der Eigenschaft "any".
             */
            public ExtensionObject.Body.Builder<_B> withAny(final Object any) {
                this.any = any;
                return this;
            }

            @Override
            public ExtensionObject.Body build() {
                if (_storedValue == null) {
                    return this.init(new ExtensionObject.Body());
                } else {
                    return ((ExtensionObject.Body) _storedValue);
                }
            }

            public ExtensionObject.Body.Builder<_B> copyOf(final ExtensionObject.Body _other) {
                _other.copyTo(this);
                return this;
            }

            public ExtensionObject.Body.Builder<_B> copyOf(final ExtensionObject.Body.Builder _other) {
                return copyOf(_other.build());
            }

        }

        public static class Select
            extends ExtensionObject.Body.Selector<ExtensionObject.Body.Select, Void>
        {


            Select() {
                super(null, null, null);
            }

            public static ExtensionObject.Body.Select _root() {
                return new ExtensionObject.Body.Select();
            }

        }

        public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
            extends com.kscs.util.jaxb.Selector<TRoot, TParent>
        {

            private com.kscs.util.jaxb.Selector<TRoot, ExtensionObject.Body.Selector<TRoot, TParent>> any = null;

            public Selector(final TRoot root, final TParent parent, final String propertyName) {
                super(root, parent, propertyName);
            }

            @Override
            public Map<String, PropertyTree> buildChildren() {
                final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
                products.putAll(super.buildChildren());
                if (this.any!= null) {
                    products.put("any", this.any.init());
                }
                return products;
            }

            public com.kscs.util.jaxb.Selector<TRoot, ExtensionObject.Body.Selector<TRoot, TParent>> any() {
                return ((this.any == null)?this.any = new com.kscs.util.jaxb.Selector<TRoot, ExtensionObject.Body.Selector<TRoot, TParent>>(this._root, this, "any"):this.any);
            }

        }

    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ExtensionObject _storedValue;
        private JAXBElement<NodeId> typeId;
        private JAXBElement<ExtensionObject.Body> body;

        public Builder(final _B _parentBuilder, final ExtensionObject _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.typeId = _other.typeId;
                    this.body = _other.body;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ExtensionObject _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree typeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeIdPropertyTree!= null):((typeIdPropertyTree == null)||(!typeIdPropertyTree.isLeaf())))) {
                        this.typeId = _other.typeId;
                    }
                    final PropertyTree bodyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(bodyPropertyTree!= null):((bodyPropertyTree == null)||(!bodyPropertyTree.isLeaf())))) {
                        this.body = _other.body;
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

        protected<_P extends ExtensionObject >_P init(final _P _product) {
            _product.typeId = this.typeId;
            _product.body = this.body;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "typeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param typeId
         *     Neuer Wert der Eigenschaft "typeId".
         */
        public ExtensionObject.Builder<_B> withTypeId(final JAXBElement<NodeId> typeId) {
            this.typeId = typeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "body" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param body
         *     Neuer Wert der Eigenschaft "body".
         */
        public ExtensionObject.Builder<_B> withBody(final JAXBElement<ExtensionObject.Body> body) {
            this.body = body;
            return this;
        }

        @Override
        public ExtensionObject build() {
            if (_storedValue == null) {
                return this.init(new ExtensionObject());
            } else {
                return ((ExtensionObject) _storedValue);
            }
        }

        public ExtensionObject.Builder<_B> copyOf(final ExtensionObject _other) {
            _other.copyTo(this);
            return this;
        }

        public ExtensionObject.Builder<_B> copyOf(final ExtensionObject.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ExtensionObject.Selector<ExtensionObject.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ExtensionObject.Select _root() {
            return new ExtensionObject.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ExtensionObject.Selector<TRoot, TParent>> typeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ExtensionObject.Selector<TRoot, TParent>> body = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.typeId!= null) {
                products.put("typeId", this.typeId.init());
            }
            if (this.body!= null) {
                products.put("body", this.body.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ExtensionObject.Selector<TRoot, TParent>> typeId() {
            return ((this.typeId == null)?this.typeId = new com.kscs.util.jaxb.Selector<TRoot, ExtensionObject.Selector<TRoot, TParent>>(this._root, this, "typeId"):this.typeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ExtensionObject.Selector<TRoot, TParent>> body() {
            return ((this.body == null)?this.body = new com.kscs.util.jaxb.Selector<TRoot, ExtensionObject.Selector<TRoot, TParent>>(this._root, this, "body"):this.body);
        }

    }

}
