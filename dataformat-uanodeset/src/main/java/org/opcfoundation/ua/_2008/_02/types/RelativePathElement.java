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
 * <p>Java-Klasse für RelativePathElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RelativePathElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceTypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="IsInverse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeSubtypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QualifiedName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativePathElement", propOrder = {
    "referenceTypeId",
    "isInverse",
    "includeSubtypes",
    "targetName"
})
public class RelativePathElement {

    @XmlElementRef(name = "ReferenceTypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> referenceTypeId;
    @XmlElement(name = "IsInverse")
    protected Boolean isInverse;
    @XmlElement(name = "IncludeSubtypes")
    protected Boolean includeSubtypes;
    @XmlElementRef(name = "TargetName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<QualifiedName> targetName;

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
     * Ruft den Wert der isInverse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInverse() {
        return isInverse;
    }

    /**
     * Legt den Wert der isInverse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInverse(Boolean value) {
        this.isInverse = value;
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
     * Ruft den Wert der targetName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public JAXBElement<QualifiedName> getTargetName() {
        return targetName;
    }

    /**
     * Legt den Wert der targetName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public void setTargetName(JAXBElement<QualifiedName> value) {
        this.targetName = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final RelativePathElement.Builder<_B> _other) {
        _other.referenceTypeId = this.referenceTypeId;
        _other.isInverse = this.isInverse;
        _other.includeSubtypes = this.includeSubtypes;
        _other.targetName = this.targetName;
    }

    public<_B >RelativePathElement.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new RelativePathElement.Builder<_B>(_parentBuilder, this, true);
    }

    public RelativePathElement.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static RelativePathElement.Builder<Void> builder() {
        return new RelativePathElement.Builder<Void>(null, null, false);
    }

    public static<_B >RelativePathElement.Builder<_B> copyOf(final RelativePathElement _other) {
        final RelativePathElement.Builder<_B> _newBuilder = new RelativePathElement.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final RelativePathElement.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
            _other.referenceTypeId = this.referenceTypeId;
        }
        final PropertyTree isInversePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isInverse"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isInversePropertyTree!= null):((isInversePropertyTree == null)||(!isInversePropertyTree.isLeaf())))) {
            _other.isInverse = this.isInverse;
        }
        final PropertyTree includeSubtypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("includeSubtypes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(includeSubtypesPropertyTree!= null):((includeSubtypesPropertyTree == null)||(!includeSubtypesPropertyTree.isLeaf())))) {
            _other.includeSubtypes = this.includeSubtypes;
        }
        final PropertyTree targetNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNamePropertyTree!= null):((targetNamePropertyTree == null)||(!targetNamePropertyTree.isLeaf())))) {
            _other.targetName = this.targetName;
        }
    }

    public<_B >RelativePathElement.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new RelativePathElement.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public RelativePathElement.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >RelativePathElement.Builder<_B> copyOf(final RelativePathElement _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final RelativePathElement.Builder<_B> _newBuilder = new RelativePathElement.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static RelativePathElement.Builder<Void> copyExcept(final RelativePathElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static RelativePathElement.Builder<Void> copyOnly(final RelativePathElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final RelativePathElement _storedValue;
        private JAXBElement<NodeId> referenceTypeId;
        private Boolean isInverse;
        private Boolean includeSubtypes;
        private JAXBElement<QualifiedName> targetName;

        public Builder(final _B _parentBuilder, final RelativePathElement _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.referenceTypeId = _other.referenceTypeId;
                    this.isInverse = _other.isInverse;
                    this.includeSubtypes = _other.includeSubtypes;
                    this.targetName = _other.targetName;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final RelativePathElement _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree referenceTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("referenceTypeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(referenceTypeIdPropertyTree!= null):((referenceTypeIdPropertyTree == null)||(!referenceTypeIdPropertyTree.isLeaf())))) {
                        this.referenceTypeId = _other.referenceTypeId;
                    }
                    final PropertyTree isInversePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isInverse"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isInversePropertyTree!= null):((isInversePropertyTree == null)||(!isInversePropertyTree.isLeaf())))) {
                        this.isInverse = _other.isInverse;
                    }
                    final PropertyTree includeSubtypesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("includeSubtypes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(includeSubtypesPropertyTree!= null):((includeSubtypesPropertyTree == null)||(!includeSubtypesPropertyTree.isLeaf())))) {
                        this.includeSubtypes = _other.includeSubtypes;
                    }
                    final PropertyTree targetNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetNamePropertyTree!= null):((targetNamePropertyTree == null)||(!targetNamePropertyTree.isLeaf())))) {
                        this.targetName = _other.targetName;
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

        protected<_P extends RelativePathElement >_P init(final _P _product) {
            _product.referenceTypeId = this.referenceTypeId;
            _product.isInverse = this.isInverse;
            _product.includeSubtypes = this.includeSubtypes;
            _product.targetName = this.targetName;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "referenceTypeId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param referenceTypeId
         *     Neuer Wert der Eigenschaft "referenceTypeId".
         */
        public RelativePathElement.Builder<_B> withReferenceTypeId(final JAXBElement<NodeId> referenceTypeId) {
            this.referenceTypeId = referenceTypeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isInverse" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param isInverse
         *     Neuer Wert der Eigenschaft "isInverse".
         */
        public RelativePathElement.Builder<_B> withIsInverse(final Boolean isInverse) {
            this.isInverse = isInverse;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "includeSubtypes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param includeSubtypes
         *     Neuer Wert der Eigenschaft "includeSubtypes".
         */
        public RelativePathElement.Builder<_B> withIncludeSubtypes(final Boolean includeSubtypes) {
            this.includeSubtypes = includeSubtypes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param targetName
         *     Neuer Wert der Eigenschaft "targetName".
         */
        public RelativePathElement.Builder<_B> withTargetName(final JAXBElement<QualifiedName> targetName) {
            this.targetName = targetName;
            return this;
        }

        @Override
        public RelativePathElement build() {
            if (_storedValue == null) {
                return this.init(new RelativePathElement());
            } else {
                return ((RelativePathElement) _storedValue);
            }
        }

        public RelativePathElement.Builder<_B> copyOf(final RelativePathElement _other) {
            _other.copyTo(this);
            return this;
        }

        public RelativePathElement.Builder<_B> copyOf(final RelativePathElement.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends RelativePathElement.Selector<RelativePathElement.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static RelativePathElement.Select _root() {
            return new RelativePathElement.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>> referenceTypeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>> isInverse = null;
        private com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>> includeSubtypes = null;
        private com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>> targetName = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.referenceTypeId!= null) {
                products.put("referenceTypeId", this.referenceTypeId.init());
            }
            if (this.isInverse!= null) {
                products.put("isInverse", this.isInverse.init());
            }
            if (this.includeSubtypes!= null) {
                products.put("includeSubtypes", this.includeSubtypes.init());
            }
            if (this.targetName!= null) {
                products.put("targetName", this.targetName.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>> referenceTypeId() {
            return ((this.referenceTypeId == null)?this.referenceTypeId = new com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>>(this._root, this, "referenceTypeId"):this.referenceTypeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>> isInverse() {
            return ((this.isInverse == null)?this.isInverse = new com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>>(this._root, this, "isInverse"):this.isInverse);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>> includeSubtypes() {
            return ((this.includeSubtypes == null)?this.includeSubtypes = new com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>>(this._root, this, "includeSubtypes"):this.includeSubtypes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>> targetName() {
            return ((this.targetName == null)?this.targetName = new com.kscs.util.jaxb.Selector<TRoot, RelativePathElement.Selector<TRoot, TParent>>(this._root, this, "targetName"):this.targetName);
        }

    }

}
