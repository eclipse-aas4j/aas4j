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
 * <p>Java-Klasse für NodeTypeDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NodeTypeDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeDefinitionNode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *         &lt;element name="IncludeSubTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataToReturn" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfQueryDataDescription" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeTypeDescription", propOrder = {
    "typeDefinitionNode",
    "includeSubTypes",
    "dataToReturn"
})
public class NodeTypeDescription {

    @XmlElementRef(name = "TypeDefinitionNode", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> typeDefinitionNode;
    @XmlElement(name = "IncludeSubTypes")
    protected Boolean includeSubTypes;
    @XmlElementRef(name = "DataToReturn", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfQueryDataDescription> dataToReturn;

    /**
     * Ruft den Wert der typeDefinitionNode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ExpandedNodeId> getTypeDefinitionNode() {
        return typeDefinitionNode;
    }

    /**
     * Legt den Wert der typeDefinitionNode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public void setTypeDefinitionNode(JAXBElement<ExpandedNodeId> value) {
        this.typeDefinitionNode = value;
    }

    /**
     * Ruft den Wert der includeSubTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubTypes() {
        return includeSubTypes;
    }

    /**
     * Legt den Wert der includeSubTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubTypes(Boolean value) {
        this.includeSubTypes = value;
    }

    /**
     * Ruft den Wert der dataToReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfQueryDataDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfQueryDataDescription> getDataToReturn() {
        return dataToReturn;
    }

    /**
     * Legt den Wert der dataToReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfQueryDataDescription }{@code >}
     *     
     */
    public void setDataToReturn(JAXBElement<ListOfQueryDataDescription> value) {
        this.dataToReturn = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final NodeTypeDescription.Builder<_B> _other) {
        _other.typeDefinitionNode = this.typeDefinitionNode;
        _other.includeSubTypes = this.includeSubTypes;
        _other.dataToReturn = this.dataToReturn;
    }

    public<_B >NodeTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new NodeTypeDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public NodeTypeDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static NodeTypeDescription.Builder<Void> builder() {
        return new NodeTypeDescription.Builder<Void>(null, null, false);
    }

    public static<_B >NodeTypeDescription.Builder<_B> copyOf(final NodeTypeDescription _other) {
        final NodeTypeDescription.Builder<_B> _newBuilder = new NodeTypeDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final NodeTypeDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree typeDefinitionNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeDefinitionNode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeDefinitionNodePropertyTree!= null):((typeDefinitionNodePropertyTree == null)||(!typeDefinitionNodePropertyTree.isLeaf())))) {
            _other.typeDefinitionNode = this.typeDefinitionNode;
        }
        final PropertyTree includeSubTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("includeSubTypes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(includeSubTypesPropertyTree!= null):((includeSubTypesPropertyTree == null)||(!includeSubTypesPropertyTree.isLeaf())))) {
            _other.includeSubTypes = this.includeSubTypes;
        }
        final PropertyTree dataToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataToReturn"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataToReturnPropertyTree!= null):((dataToReturnPropertyTree == null)||(!dataToReturnPropertyTree.isLeaf())))) {
            _other.dataToReturn = this.dataToReturn;
        }
    }

    public<_B >NodeTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new NodeTypeDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public NodeTypeDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >NodeTypeDescription.Builder<_B> copyOf(final NodeTypeDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final NodeTypeDescription.Builder<_B> _newBuilder = new NodeTypeDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static NodeTypeDescription.Builder<Void> copyExcept(final NodeTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static NodeTypeDescription.Builder<Void> copyOnly(final NodeTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final NodeTypeDescription _storedValue;
        private JAXBElement<ExpandedNodeId> typeDefinitionNode;
        private Boolean includeSubTypes;
        private JAXBElement<ListOfQueryDataDescription> dataToReturn;

        public Builder(final _B _parentBuilder, final NodeTypeDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.typeDefinitionNode = _other.typeDefinitionNode;
                    this.includeSubTypes = _other.includeSubTypes;
                    this.dataToReturn = _other.dataToReturn;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final NodeTypeDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree typeDefinitionNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("typeDefinitionNode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(typeDefinitionNodePropertyTree!= null):((typeDefinitionNodePropertyTree == null)||(!typeDefinitionNodePropertyTree.isLeaf())))) {
                        this.typeDefinitionNode = _other.typeDefinitionNode;
                    }
                    final PropertyTree includeSubTypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("includeSubTypes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(includeSubTypesPropertyTree!= null):((includeSubTypesPropertyTree == null)||(!includeSubTypesPropertyTree.isLeaf())))) {
                        this.includeSubTypes = _other.includeSubTypes;
                    }
                    final PropertyTree dataToReturnPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataToReturn"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataToReturnPropertyTree!= null):((dataToReturnPropertyTree == null)||(!dataToReturnPropertyTree.isLeaf())))) {
                        this.dataToReturn = _other.dataToReturn;
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

        protected<_P extends NodeTypeDescription >_P init(final _P _product) {
            _product.typeDefinitionNode = this.typeDefinitionNode;
            _product.includeSubTypes = this.includeSubTypes;
            _product.dataToReturn = this.dataToReturn;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "typeDefinitionNode" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param typeDefinitionNode
         *     Neuer Wert der Eigenschaft "typeDefinitionNode".
         */
        public NodeTypeDescription.Builder<_B> withTypeDefinitionNode(final JAXBElement<ExpandedNodeId> typeDefinitionNode) {
            this.typeDefinitionNode = typeDefinitionNode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "includeSubTypes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param includeSubTypes
         *     Neuer Wert der Eigenschaft "includeSubTypes".
         */
        public NodeTypeDescription.Builder<_B> withIncludeSubTypes(final Boolean includeSubTypes) {
            this.includeSubTypes = includeSubTypes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataToReturn" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataToReturn
         *     Neuer Wert der Eigenschaft "dataToReturn".
         */
        public NodeTypeDescription.Builder<_B> withDataToReturn(final JAXBElement<ListOfQueryDataDescription> dataToReturn) {
            this.dataToReturn = dataToReturn;
            return this;
        }

        @Override
        public NodeTypeDescription build() {
            if (_storedValue == null) {
                return this.init(new NodeTypeDescription());
            } else {
                return ((NodeTypeDescription) _storedValue);
            }
        }

        public NodeTypeDescription.Builder<_B> copyOf(final NodeTypeDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public NodeTypeDescription.Builder<_B> copyOf(final NodeTypeDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends NodeTypeDescription.Selector<NodeTypeDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static NodeTypeDescription.Select _root() {
            return new NodeTypeDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, NodeTypeDescription.Selector<TRoot, TParent>> typeDefinitionNode = null;
        private com.kscs.util.jaxb.Selector<TRoot, NodeTypeDescription.Selector<TRoot, TParent>> includeSubTypes = null;
        private com.kscs.util.jaxb.Selector<TRoot, NodeTypeDescription.Selector<TRoot, TParent>> dataToReturn = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.typeDefinitionNode!= null) {
                products.put("typeDefinitionNode", this.typeDefinitionNode.init());
            }
            if (this.includeSubTypes!= null) {
                products.put("includeSubTypes", this.includeSubTypes.init());
            }
            if (this.dataToReturn!= null) {
                products.put("dataToReturn", this.dataToReturn.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeTypeDescription.Selector<TRoot, TParent>> typeDefinitionNode() {
            return ((this.typeDefinitionNode == null)?this.typeDefinitionNode = new com.kscs.util.jaxb.Selector<TRoot, NodeTypeDescription.Selector<TRoot, TParent>>(this._root, this, "typeDefinitionNode"):this.typeDefinitionNode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeTypeDescription.Selector<TRoot, TParent>> includeSubTypes() {
            return ((this.includeSubTypes == null)?this.includeSubTypes = new com.kscs.util.jaxb.Selector<TRoot, NodeTypeDescription.Selector<TRoot, TParent>>(this._root, this, "includeSubTypes"):this.includeSubTypes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeTypeDescription.Selector<TRoot, TParent>> dataToReturn() {
            return ((this.dataToReturn == null)?this.dataToReturn = new com.kscs.util.jaxb.Selector<TRoot, NodeTypeDescription.Selector<TRoot, TParent>>(this._root, this, "dataToReturn"):this.dataToReturn);
        }

    }

}
