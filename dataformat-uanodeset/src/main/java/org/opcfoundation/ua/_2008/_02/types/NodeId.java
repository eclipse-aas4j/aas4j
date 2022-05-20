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
 * <p>Java-Klasse für NodeId complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NodeId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeId", propOrder = {
    "identifier"
})
public class NodeId {

    @XmlElementRef(name = "Identifier", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;

    /**
     * Ruft den Wert der identifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Legt den Wert der identifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final NodeId.Builder<_B> _other) {
        _other.identifier = this.identifier;
    }

    public<_B >NodeId.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new NodeId.Builder<_B>(_parentBuilder, this, true);
    }

    public NodeId.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static NodeId.Builder<Void> builder() {
        return new NodeId.Builder<Void>(null, null, false);
    }

    public static<_B >NodeId.Builder<_B> copyOf(final NodeId _other) {
        final NodeId.Builder<_B> _newBuilder = new NodeId.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final NodeId.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree identifierPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("identifier"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(identifierPropertyTree!= null):((identifierPropertyTree == null)||(!identifierPropertyTree.isLeaf())))) {
            _other.identifier = this.identifier;
        }
    }

    public<_B >NodeId.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new NodeId.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public NodeId.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >NodeId.Builder<_B> copyOf(final NodeId _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final NodeId.Builder<_B> _newBuilder = new NodeId.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static NodeId.Builder<Void> copyExcept(final NodeId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static NodeId.Builder<Void> copyOnly(final NodeId _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final NodeId _storedValue;
        private JAXBElement<String> identifier;

        public Builder(final _B _parentBuilder, final NodeId _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.identifier = _other.identifier;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final NodeId _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree identifierPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("identifier"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(identifierPropertyTree!= null):((identifierPropertyTree == null)||(!identifierPropertyTree.isLeaf())))) {
                        this.identifier = _other.identifier;
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

        protected<_P extends NodeId >_P init(final _P _product) {
            _product.identifier = this.identifier;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "identifier" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param identifier
         *     Neuer Wert der Eigenschaft "identifier".
         */
        public NodeId.Builder<_B> withIdentifier(final JAXBElement<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        @Override
        public NodeId build() {
            if (_storedValue == null) {
                return this.init(new NodeId());
            } else {
                return ((NodeId) _storedValue);
            }
        }

        public NodeId.Builder<_B> copyOf(final NodeId _other) {
            _other.copyTo(this);
            return this;
        }

        public NodeId.Builder<_B> copyOf(final NodeId.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends NodeId.Selector<NodeId.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static NodeId.Select _root() {
            return new NodeId.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, NodeId.Selector<TRoot, TParent>> identifier = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.identifier!= null) {
                products.put("identifier", this.identifier.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeId.Selector<TRoot, TParent>> identifier() {
            return ((this.identifier == null)?this.identifier = new com.kscs.util.jaxb.Selector<TRoot, NodeId.Selector<TRoot, TParent>>(this._root, this, "identifier"):this.identifier);
        }

    }

}
