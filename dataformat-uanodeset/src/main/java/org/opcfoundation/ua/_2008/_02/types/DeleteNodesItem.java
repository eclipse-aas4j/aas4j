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
 * <p>Java-Klasse für DeleteNodesItem complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteNodesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="DeleteTargetReferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteNodesItem", propOrder = {
    "nodeId",
    "deleteTargetReferences"
})
public class DeleteNodesItem {

    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> nodeId;
    @XmlElement(name = "DeleteTargetReferences")
    protected Boolean deleteTargetReferences;

    /**
     * Ruft den Wert der nodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getNodeId() {
        return nodeId;
    }

    /**
     * Legt den Wert der nodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setNodeId(JAXBElement<NodeId> value) {
        this.nodeId = value;
    }

    /**
     * Ruft den Wert der deleteTargetReferences-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteTargetReferences() {
        return deleteTargetReferences;
    }

    /**
     * Legt den Wert der deleteTargetReferences-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteTargetReferences(Boolean value) {
        this.deleteTargetReferences = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DeleteNodesItem.Builder<_B> _other) {
        _other.nodeId = this.nodeId;
        _other.deleteTargetReferences = this.deleteTargetReferences;
    }

    public<_B >DeleteNodesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DeleteNodesItem.Builder<_B>(_parentBuilder, this, true);
    }

    public DeleteNodesItem.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DeleteNodesItem.Builder<Void> builder() {
        return new DeleteNodesItem.Builder<Void>(null, null, false);
    }

    public static<_B >DeleteNodesItem.Builder<_B> copyOf(final DeleteNodesItem _other) {
        final DeleteNodesItem.Builder<_B> _newBuilder = new DeleteNodesItem.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DeleteNodesItem.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
        final PropertyTree deleteTargetReferencesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteTargetReferences"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteTargetReferencesPropertyTree!= null):((deleteTargetReferencesPropertyTree == null)||(!deleteTargetReferencesPropertyTree.isLeaf())))) {
            _other.deleteTargetReferences = this.deleteTargetReferences;
        }
    }

    public<_B >DeleteNodesItem.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DeleteNodesItem.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DeleteNodesItem.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DeleteNodesItem.Builder<_B> copyOf(final DeleteNodesItem _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DeleteNodesItem.Builder<_B> _newBuilder = new DeleteNodesItem.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DeleteNodesItem.Builder<Void> copyExcept(final DeleteNodesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DeleteNodesItem.Builder<Void> copyOnly(final DeleteNodesItem _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DeleteNodesItem _storedValue;
        private JAXBElement<NodeId> nodeId;
        private Boolean deleteTargetReferences;

        public Builder(final _B _parentBuilder, final DeleteNodesItem _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.nodeId = _other.nodeId;
                    this.deleteTargetReferences = _other.deleteTargetReferences;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DeleteNodesItem _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        this.nodeId = _other.nodeId;
                    }
                    final PropertyTree deleteTargetReferencesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteTargetReferences"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteTargetReferencesPropertyTree!= null):((deleteTargetReferencesPropertyTree == null)||(!deleteTargetReferencesPropertyTree.isLeaf())))) {
                        this.deleteTargetReferences = _other.deleteTargetReferences;
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

        protected<_P extends DeleteNodesItem >_P init(final _P _product) {
            _product.nodeId = this.nodeId;
            _product.deleteTargetReferences = this.deleteTargetReferences;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public DeleteNodesItem.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteTargetReferences" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param deleteTargetReferences
         *     Neuer Wert der Eigenschaft "deleteTargetReferences".
         */
        public DeleteNodesItem.Builder<_B> withDeleteTargetReferences(final Boolean deleteTargetReferences) {
            this.deleteTargetReferences = deleteTargetReferences;
            return this;
        }

        @Override
        public DeleteNodesItem build() {
            if (_storedValue == null) {
                return this.init(new DeleteNodesItem());
            } else {
                return ((DeleteNodesItem) _storedValue);
            }
        }

        public DeleteNodesItem.Builder<_B> copyOf(final DeleteNodesItem _other) {
            _other.copyTo(this);
            return this;
        }

        public DeleteNodesItem.Builder<_B> copyOf(final DeleteNodesItem.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DeleteNodesItem.Selector<DeleteNodesItem.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DeleteNodesItem.Select _root() {
            return new DeleteNodesItem.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DeleteNodesItem.Selector<TRoot, TParent>> nodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DeleteNodesItem.Selector<TRoot, TParent>> deleteTargetReferences = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.nodeId!= null) {
                products.put("nodeId", this.nodeId.init());
            }
            if (this.deleteTargetReferences!= null) {
                products.put("deleteTargetReferences", this.deleteTargetReferences.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteNodesItem.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, DeleteNodesItem.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteNodesItem.Selector<TRoot, TParent>> deleteTargetReferences() {
            return ((this.deleteTargetReferences == null)?this.deleteTargetReferences = new com.kscs.util.jaxb.Selector<TRoot, DeleteNodesItem.Selector<TRoot, TParent>>(this._root, this, "deleteTargetReferences"):this.deleteTargetReferences);
        }

    }

}
