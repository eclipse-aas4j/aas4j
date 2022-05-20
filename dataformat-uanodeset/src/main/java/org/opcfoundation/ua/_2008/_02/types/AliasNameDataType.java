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
 * <p>Java-Klasse für AliasNameDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AliasNameDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AliasName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QualifiedName" minOccurs="0"/&gt;
 *         &lt;element name="ReferencedNodes" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfExpandedNodeId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasNameDataType", propOrder = {
    "aliasName",
    "referencedNodes"
})
public class AliasNameDataType {

    @XmlElementRef(name = "AliasName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<QualifiedName> aliasName;
    @XmlElementRef(name = "ReferencedNodes", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfExpandedNodeId> referencedNodes;

    /**
     * Ruft den Wert der aliasName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public JAXBElement<QualifiedName> getAliasName() {
        return aliasName;
    }

    /**
     * Legt den Wert der aliasName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public void setAliasName(JAXBElement<QualifiedName> value) {
        this.aliasName = value;
    }

    /**
     * Ruft den Wert der referencedNodes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ListOfExpandedNodeId> getReferencedNodes() {
        return referencedNodes;
    }

    /**
     * Legt den Wert der referencedNodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfExpandedNodeId }{@code >}
     *     
     */
    public void setReferencedNodes(JAXBElement<ListOfExpandedNodeId> value) {
        this.referencedNodes = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final AliasNameDataType.Builder<_B> _other) {
        _other.aliasName = this.aliasName;
        _other.referencedNodes = this.referencedNodes;
    }

    public<_B >AliasNameDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AliasNameDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public AliasNameDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AliasNameDataType.Builder<Void> builder() {
        return new AliasNameDataType.Builder<Void>(null, null, false);
    }

    public static<_B >AliasNameDataType.Builder<_B> copyOf(final AliasNameDataType _other) {
        final AliasNameDataType.Builder<_B> _newBuilder = new AliasNameDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AliasNameDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree aliasNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("aliasName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aliasNamePropertyTree!= null):((aliasNamePropertyTree == null)||(!aliasNamePropertyTree.isLeaf())))) {
            _other.aliasName = this.aliasName;
        }
        final PropertyTree referencedNodesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referencedNodes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referencedNodesPropertyTree!= null):((referencedNodesPropertyTree == null)||(!referencedNodesPropertyTree.isLeaf())))) {
            _other.referencedNodes = this.referencedNodes;
        }
    }

    public<_B >AliasNameDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AliasNameDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public AliasNameDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AliasNameDataType.Builder<_B> copyOf(final AliasNameDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AliasNameDataType.Builder<_B> _newBuilder = new AliasNameDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AliasNameDataType.Builder<Void> copyExcept(final AliasNameDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AliasNameDataType.Builder<Void> copyOnly(final AliasNameDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final AliasNameDataType _storedValue;
        private JAXBElement<QualifiedName> aliasName;
        private JAXBElement<ListOfExpandedNodeId> referencedNodes;

        public Builder(final _B _parentBuilder, final AliasNameDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.aliasName = _other.aliasName;
                    this.referencedNodes = _other.referencedNodes;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final AliasNameDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree aliasNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("aliasName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(aliasNamePropertyTree!= null):((aliasNamePropertyTree == null)||(!aliasNamePropertyTree.isLeaf())))) {
                        this.aliasName = _other.aliasName;
                    }
                    final PropertyTree referencedNodesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referencedNodes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referencedNodesPropertyTree!= null):((referencedNodesPropertyTree == null)||(!referencedNodesPropertyTree.isLeaf())))) {
                        this.referencedNodes = _other.referencedNodes;
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

        protected<_P extends AliasNameDataType >_P init(final _P _product) {
            _product.aliasName = this.aliasName;
            _product.referencedNodes = this.referencedNodes;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "aliasName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param aliasName
         *     Neuer Wert der Eigenschaft "aliasName".
         */
        public AliasNameDataType.Builder<_B> withAliasName(final JAXBElement<QualifiedName> aliasName) {
            this.aliasName = aliasName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referencedNodes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referencedNodes
         *     Neuer Wert der Eigenschaft "referencedNodes".
         */
        public AliasNameDataType.Builder<_B> withReferencedNodes(final JAXBElement<ListOfExpandedNodeId> referencedNodes) {
            this.referencedNodes = referencedNodes;
            return this;
        }

        @Override
        public AliasNameDataType build() {
            if (_storedValue == null) {
                return this.init(new AliasNameDataType());
            } else {
                return ((AliasNameDataType) _storedValue);
            }
        }

        public AliasNameDataType.Builder<_B> copyOf(final AliasNameDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public AliasNameDataType.Builder<_B> copyOf(final AliasNameDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AliasNameDataType.Selector<AliasNameDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AliasNameDataType.Select _root() {
            return new AliasNameDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AliasNameDataType.Selector<TRoot, TParent>> aliasName = null;
        private com.kscs.util.jaxb.Selector<TRoot, AliasNameDataType.Selector<TRoot, TParent>> referencedNodes = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.aliasName!= null) {
                products.put("aliasName", this.aliasName.init());
            }
            if (this.referencedNodes!= null) {
                products.put("referencedNodes", this.referencedNodes.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, AliasNameDataType.Selector<TRoot, TParent>> aliasName() {
            return ((this.aliasName == null)?this.aliasName = new com.kscs.util.jaxb.Selector<TRoot, AliasNameDataType.Selector<TRoot, TParent>>(this._root, this, "aliasName"):this.aliasName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AliasNameDataType.Selector<TRoot, TParent>> referencedNodes() {
            return ((this.referencedNodes == null)?this.referencedNodes = new com.kscs.util.jaxb.Selector<TRoot, AliasNameDataType.Selector<TRoot, TParent>>(this._root, this, "referencedNodes"):this.referencedNodes);
        }

    }

}
