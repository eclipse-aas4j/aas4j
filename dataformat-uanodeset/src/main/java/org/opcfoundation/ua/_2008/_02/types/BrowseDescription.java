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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für BrowseDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BrowseDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="BrowseDirection" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BrowseDirection" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceTypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="IncludeSubtypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NodeClassMask" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ResultMask" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowseDescription", propOrder = {
    "nodeId",
    "browseDirection",
    "referenceTypeId",
    "includeSubtypes",
    "nodeClassMask",
    "resultMask"
})
public class BrowseDescription {

    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> nodeId;
    @XmlElement(name = "BrowseDirection")
    @XmlSchemaType(name = "string")
    protected BrowseDirection browseDirection;
    @XmlElementRef(name = "ReferenceTypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> referenceTypeId;
    @XmlElement(name = "IncludeSubtypes")
    protected Boolean includeSubtypes;
    @XmlElement(name = "NodeClassMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long nodeClassMask;
    @XmlElement(name = "ResultMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long resultMask;

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
     * Ruft den Wert der browseDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BrowseDirection }
     *     
     */
    public BrowseDirection getBrowseDirection() {
        return browseDirection;
    }

    /**
     * Legt den Wert der browseDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowseDirection }
     *     
     */
    public void setBrowseDirection(BrowseDirection value) {
        this.browseDirection = value;
    }

    /**
     * Ruft den Wert der referenceTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getReferenceTypeId() {
        return referenceTypeId;
    }

    /**
     * Legt den Wert der referenceTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setReferenceTypeId(JAXBElement<NodeId> value) {
        this.referenceTypeId = value;
    }

    /**
     * Ruft den Wert der includeSubtypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubtypes() {
        return includeSubtypes;
    }

    /**
     * Legt den Wert der includeSubtypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubtypes(Boolean value) {
        this.includeSubtypes = value;
    }

    /**
     * Ruft den Wert der nodeClassMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNodeClassMask() {
        return nodeClassMask;
    }

    /**
     * Legt den Wert der nodeClassMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNodeClassMask(Long value) {
        this.nodeClassMask = value;
    }

    /**
     * Ruft den Wert der resultMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResultMask() {
        return resultMask;
    }

    /**
     * Legt den Wert der resultMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResultMask(Long value) {
        this.resultMask = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final BrowseDescription.Builder<_B> _other) {
        _other.nodeId = this.nodeId;
        _other.browseDirection = this.browseDirection;
        _other.referenceTypeId = this.referenceTypeId;
        _other.includeSubtypes = this.includeSubtypes;
        _other.nodeClassMask = this.nodeClassMask;
        _other.resultMask = this.resultMask;
    }

    public<_B >BrowseDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new BrowseDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public BrowseDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static BrowseDescription.Builder<Void> builder() {
        return new BrowseDescription.Builder<Void>(null, null, false);
    }

    public static<_B >BrowseDescription.Builder<_B> copyOf(final BrowseDescription _other) {
        final BrowseDescription.Builder<_B> _newBuilder = new BrowseDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final BrowseDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
        final PropertyTree browseDirectionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseDirection"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseDirectionPropertyTree!= null):((browseDirectionPropertyTree == null)||(!browseDirectionPropertyTree.isLeaf())))) {
            _other.browseDirection = this.browseDirection;
        }
        final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
            _other.referenceTypeId = this.referenceTypeId;
        }
        final PropertyTree includeSubtypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("includeSubtypes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(includeSubtypesPropertyTree!= null):((includeSubtypesPropertyTree == null)||(!includeSubtypesPropertyTree.isLeaf())))) {
            _other.includeSubtypes = this.includeSubtypes;
        }
        final PropertyTree nodeClassMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeClassMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeClassMaskPropertyTree!= null):((nodeClassMaskPropertyTree == null)||(!nodeClassMaskPropertyTree.isLeaf())))) {
            _other.nodeClassMask = this.nodeClassMask;
        }
        final PropertyTree resultMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("resultMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resultMaskPropertyTree!= null):((resultMaskPropertyTree == null)||(!resultMaskPropertyTree.isLeaf())))) {
            _other.resultMask = this.resultMask;
        }
    }

    public<_B >BrowseDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new BrowseDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public BrowseDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >BrowseDescription.Builder<_B> copyOf(final BrowseDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BrowseDescription.Builder<_B> _newBuilder = new BrowseDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static BrowseDescription.Builder<Void> copyExcept(final BrowseDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BrowseDescription.Builder<Void> copyOnly(final BrowseDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final BrowseDescription _storedValue;
        private JAXBElement<NodeId> nodeId;
        private BrowseDirection browseDirection;
        private JAXBElement<NodeId> referenceTypeId;
        private Boolean includeSubtypes;
        private Long nodeClassMask;
        private Long resultMask;

        public Builder(final _B _parentBuilder, final BrowseDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.nodeId = _other.nodeId;
                    this.browseDirection = _other.browseDirection;
                    this.referenceTypeId = _other.referenceTypeId;
                    this.includeSubtypes = _other.includeSubtypes;
                    this.nodeClassMask = _other.nodeClassMask;
                    this.resultMask = _other.resultMask;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final BrowseDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        this.nodeId = _other.nodeId;
                    }
                    final PropertyTree browseDirectionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseDirection"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseDirectionPropertyTree!= null):((browseDirectionPropertyTree == null)||(!browseDirectionPropertyTree.isLeaf())))) {
                        this.browseDirection = _other.browseDirection;
                    }
                    final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
                        this.referenceTypeId = _other.referenceTypeId;
                    }
                    final PropertyTree includeSubtypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("includeSubtypes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(includeSubtypesPropertyTree!= null):((includeSubtypesPropertyTree == null)||(!includeSubtypesPropertyTree.isLeaf())))) {
                        this.includeSubtypes = _other.includeSubtypes;
                    }
                    final PropertyTree nodeClassMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeClassMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeClassMaskPropertyTree!= null):((nodeClassMaskPropertyTree == null)||(!nodeClassMaskPropertyTree.isLeaf())))) {
                        this.nodeClassMask = _other.nodeClassMask;
                    }
                    final PropertyTree resultMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("resultMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(resultMaskPropertyTree!= null):((resultMaskPropertyTree == null)||(!resultMaskPropertyTree.isLeaf())))) {
                        this.resultMask = _other.resultMask;
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

        protected<_P extends BrowseDescription >_P init(final _P _product) {
            _product.nodeId = this.nodeId;
            _product.browseDirection = this.browseDirection;
            _product.referenceTypeId = this.referenceTypeId;
            _product.includeSubtypes = this.includeSubtypes;
            _product.nodeClassMask = this.nodeClassMask;
            _product.resultMask = this.resultMask;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public BrowseDescription.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseDirection" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param browseDirection
         *     Neuer Wert der Eigenschaft "browseDirection".
         */
        public BrowseDescription.Builder<_B> withBrowseDirection(final BrowseDirection browseDirection) {
            this.browseDirection = browseDirection;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceTypeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referenceTypeId
         *     Neuer Wert der Eigenschaft "referenceTypeId".
         */
        public BrowseDescription.Builder<_B> withReferenceTypeId(final JAXBElement<NodeId> referenceTypeId) {
            this.referenceTypeId = referenceTypeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "includeSubtypes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param includeSubtypes
         *     Neuer Wert der Eigenschaft "includeSubtypes".
         */
        public BrowseDescription.Builder<_B> withIncludeSubtypes(final Boolean includeSubtypes) {
            this.includeSubtypes = includeSubtypes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeClassMask" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param nodeClassMask
         *     Neuer Wert der Eigenschaft "nodeClassMask".
         */
        public BrowseDescription.Builder<_B> withNodeClassMask(final Long nodeClassMask) {
            this.nodeClassMask = nodeClassMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "resultMask" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param resultMask
         *     Neuer Wert der Eigenschaft "resultMask".
         */
        public BrowseDescription.Builder<_B> withResultMask(final Long resultMask) {
            this.resultMask = resultMask;
            return this;
        }

        @Override
        public BrowseDescription build() {
            if (_storedValue == null) {
                return this.init(new BrowseDescription());
            } else {
                return ((BrowseDescription) _storedValue);
            }
        }

        public BrowseDescription.Builder<_B> copyOf(final BrowseDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public BrowseDescription.Builder<_B> copyOf(final BrowseDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends BrowseDescription.Selector<BrowseDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static BrowseDescription.Select _root() {
            return new BrowseDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> nodeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> browseDirection = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> referenceTypeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> includeSubtypes = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> nodeClassMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> resultMask = null;

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
            if (this.browseDirection!= null) {
                products.put("browseDirection", this.browseDirection.init());
            }
            if (this.referenceTypeId!= null) {
                products.put("referenceTypeId", this.referenceTypeId.init());
            }
            if (this.includeSubtypes!= null) {
                products.put("includeSubtypes", this.includeSubtypes.init());
            }
            if (this.nodeClassMask!= null) {
                products.put("nodeClassMask", this.nodeClassMask.init());
            }
            if (this.resultMask!= null) {
                products.put("resultMask", this.resultMask.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> browseDirection() {
            return ((this.browseDirection == null)?this.browseDirection = new com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>>(this._root, this, "browseDirection"):this.browseDirection);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> referenceTypeId() {
            return ((this.referenceTypeId == null)?this.referenceTypeId = new com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>>(this._root, this, "referenceTypeId"):this.referenceTypeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> includeSubtypes() {
            return ((this.includeSubtypes == null)?this.includeSubtypes = new com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>>(this._root, this, "includeSubtypes"):this.includeSubtypes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> nodeClassMask() {
            return ((this.nodeClassMask == null)?this.nodeClassMask = new com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>>(this._root, this, "nodeClassMask"):this.nodeClassMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>> resultMask() {
            return ((this.resultMask == null)?this.resultMask = new com.kscs.util.jaxb.Selector<TRoot, BrowseDescription.Selector<TRoot, TParent>>(this._root, this, "resultMask"):this.resultMask);
        }

    }

}
