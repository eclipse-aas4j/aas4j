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
 * <p>Java-Klasse für BrowsePath complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BrowsePath"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartingNode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="RelativePath" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}RelativePath" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowsePath", propOrder = {
    "startingNode",
    "relativePath"
})
public class BrowsePath {

    @XmlElementRef(name = "StartingNode", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> startingNode;
    @XmlElementRef(name = "RelativePath", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<RelativePath> relativePath;

    /**
     * Ruft den Wert der startingNode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getStartingNode() {
        return startingNode;
    }

    /**
     * Legt den Wert der startingNode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setStartingNode(JAXBElement<NodeId> value) {
        this.startingNode = value;
    }

    /**
     * Ruft den Wert der relativePath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelativePath }{@code >}
     *     
     */
    public JAXBElement<RelativePath> getRelativePath() {
        return relativePath;
    }

    /**
     * Legt den Wert der relativePath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelativePath }{@code >}
     *     
     */
    public void setRelativePath(JAXBElement<RelativePath> value) {
        this.relativePath = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final BrowsePath.Builder<_B> _other) {
        _other.startingNode = this.startingNode;
        _other.relativePath = this.relativePath;
    }

    public<_B >BrowsePath.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new BrowsePath.Builder<_B>(_parentBuilder, this, true);
    }

    public BrowsePath.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static BrowsePath.Builder<Void> builder() {
        return new BrowsePath.Builder<Void>(null, null, false);
    }

    public static<_B >BrowsePath.Builder<_B> copyOf(final BrowsePath _other) {
        final BrowsePath.Builder<_B> _newBuilder = new BrowsePath.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final BrowsePath.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree startingNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startingNode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startingNodePropertyTree!= null):((startingNodePropertyTree == null)||(!startingNodePropertyTree.isLeaf())))) {
            _other.startingNode = this.startingNode;
        }
        final PropertyTree relativePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("relativePath"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(relativePathPropertyTree!= null):((relativePathPropertyTree == null)||(!relativePathPropertyTree.isLeaf())))) {
            _other.relativePath = this.relativePath;
        }
    }

    public<_B >BrowsePath.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new BrowsePath.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public BrowsePath.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >BrowsePath.Builder<_B> copyOf(final BrowsePath _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BrowsePath.Builder<_B> _newBuilder = new BrowsePath.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static BrowsePath.Builder<Void> copyExcept(final BrowsePath _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BrowsePath.Builder<Void> copyOnly(final BrowsePath _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final BrowsePath _storedValue;
        private JAXBElement<NodeId> startingNode;
        private JAXBElement<RelativePath> relativePath;

        public Builder(final _B _parentBuilder, final BrowsePath _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.startingNode = _other.startingNode;
                    this.relativePath = _other.relativePath;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final BrowsePath _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree startingNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startingNode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startingNodePropertyTree!= null):((startingNodePropertyTree == null)||(!startingNodePropertyTree.isLeaf())))) {
                        this.startingNode = _other.startingNode;
                    }
                    final PropertyTree relativePathPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("relativePath"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(relativePathPropertyTree!= null):((relativePathPropertyTree == null)||(!relativePathPropertyTree.isLeaf())))) {
                        this.relativePath = _other.relativePath;
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

        protected<_P extends BrowsePath >_P init(final _P _product) {
            _product.startingNode = this.startingNode;
            _product.relativePath = this.relativePath;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "startingNode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param startingNode
         *     Neuer Wert der Eigenschaft "startingNode".
         */
        public BrowsePath.Builder<_B> withStartingNode(final JAXBElement<NodeId> startingNode) {
            this.startingNode = startingNode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "relativePath" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param relativePath
         *     Neuer Wert der Eigenschaft "relativePath".
         */
        public BrowsePath.Builder<_B> withRelativePath(final JAXBElement<RelativePath> relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        @Override
        public BrowsePath build() {
            if (_storedValue == null) {
                return this.init(new BrowsePath());
            } else {
                return ((BrowsePath) _storedValue);
            }
        }

        public BrowsePath.Builder<_B> copyOf(final BrowsePath _other) {
            _other.copyTo(this);
            return this;
        }

        public BrowsePath.Builder<_B> copyOf(final BrowsePath.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends BrowsePath.Selector<BrowsePath.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static BrowsePath.Select _root() {
            return new BrowsePath.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, BrowsePath.Selector<TRoot, TParent>> startingNode = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowsePath.Selector<TRoot, TParent>> relativePath = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.startingNode!= null) {
                products.put("startingNode", this.startingNode.init());
            }
            if (this.relativePath!= null) {
                products.put("relativePath", this.relativePath.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowsePath.Selector<TRoot, TParent>> startingNode() {
            return ((this.startingNode == null)?this.startingNode = new com.kscs.util.jaxb.Selector<TRoot, BrowsePath.Selector<TRoot, TParent>>(this._root, this, "startingNode"):this.startingNode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowsePath.Selector<TRoot, TParent>> relativePath() {
            return ((this.relativePath == null)?this.relativePath = new com.kscs.util.jaxb.Selector<TRoot, BrowsePath.Selector<TRoot, TParent>>(this._root, this, "relativePath"):this.relativePath);
        }

    }

}
