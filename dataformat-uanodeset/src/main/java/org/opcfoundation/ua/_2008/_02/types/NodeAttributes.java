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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für NodeAttributes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NodeAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecifiedAttributes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="WriteMask" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="UserWriteMask" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeAttributes", propOrder = {
    "specifiedAttributes",
    "displayName",
    "description",
    "writeMask",
    "userWriteMask"
})
@XmlSeeAlso({
    ObjectAttributes.class,
    VariableAttributes.class,
    MethodAttributes.class,
    ObjectTypeAttributes.class,
    VariableTypeAttributes.class,
    ReferenceTypeAttributes.class,
    DataTypeAttributes.class,
    ViewAttributes.class,
    GenericAttributes.class
})
public class NodeAttributes {

    @XmlElement(name = "SpecifiedAttributes")
    @XmlSchemaType(name = "unsignedInt")
    protected Long specifiedAttributes;
    @XmlElementRef(name = "DisplayName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> displayName;
    @XmlElementRef(name = "Description", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> description;
    @XmlElement(name = "WriteMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long writeMask;
    @XmlElement(name = "UserWriteMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long userWriteMask;

    /**
     * Ruft den Wert der specifiedAttributes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpecifiedAttributes() {
        return specifiedAttributes;
    }

    /**
     * Legt den Wert der specifiedAttributes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpecifiedAttributes(Long value) {
        this.specifiedAttributes = value;
    }

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public JAXBElement<LocalizedText> getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<LocalizedText> value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public JAXBElement<LocalizedText> getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public void setDescription(JAXBElement<LocalizedText> value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der writeMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWriteMask() {
        return writeMask;
    }

    /**
     * Legt den Wert der writeMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWriteMask(Long value) {
        this.writeMask = value;
    }

    /**
     * Ruft den Wert der userWriteMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserWriteMask() {
        return userWriteMask;
    }

    /**
     * Legt den Wert der userWriteMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserWriteMask(Long value) {
        this.userWriteMask = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final NodeAttributes.Builder<_B> _other) {
        _other.specifiedAttributes = this.specifiedAttributes;
        _other.displayName = this.displayName;
        _other.description = this.description;
        _other.writeMask = this.writeMask;
        _other.userWriteMask = this.userWriteMask;
    }

    public<_B >NodeAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new NodeAttributes.Builder<_B>(_parentBuilder, this, true);
    }

    public NodeAttributes.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static NodeAttributes.Builder<Void> builder() {
        return new NodeAttributes.Builder<Void>(null, null, false);
    }

    public static<_B >NodeAttributes.Builder<_B> copyOf(final NodeAttributes _other) {
        final NodeAttributes.Builder<_B> _newBuilder = new NodeAttributes.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final NodeAttributes.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree specifiedAttributesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specifiedAttributes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specifiedAttributesPropertyTree!= null):((specifiedAttributesPropertyTree == null)||(!specifiedAttributesPropertyTree.isLeaf())))) {
            _other.specifiedAttributes = this.specifiedAttributes;
        }
        final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
            _other.displayName = this.displayName;
        }
        final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
            _other.description = this.description;
        }
        final PropertyTree writeMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeMaskPropertyTree!= null):((writeMaskPropertyTree == null)||(!writeMaskPropertyTree.isLeaf())))) {
            _other.writeMask = this.writeMask;
        }
        final PropertyTree userWriteMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userWriteMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userWriteMaskPropertyTree!= null):((userWriteMaskPropertyTree == null)||(!userWriteMaskPropertyTree.isLeaf())))) {
            _other.userWriteMask = this.userWriteMask;
        }
    }

    public<_B >NodeAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new NodeAttributes.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public NodeAttributes.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >NodeAttributes.Builder<_B> copyOf(final NodeAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final NodeAttributes.Builder<_B> _newBuilder = new NodeAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static NodeAttributes.Builder<Void> copyExcept(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static NodeAttributes.Builder<Void> copyOnly(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final NodeAttributes _storedValue;
        private Long specifiedAttributes;
        private JAXBElement<LocalizedText> displayName;
        private JAXBElement<LocalizedText> description;
        private Long writeMask;
        private Long userWriteMask;

        public Builder(final _B _parentBuilder, final NodeAttributes _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.specifiedAttributes = _other.specifiedAttributes;
                    this.displayName = _other.displayName;
                    this.description = _other.description;
                    this.writeMask = _other.writeMask;
                    this.userWriteMask = _other.userWriteMask;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final NodeAttributes _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree specifiedAttributesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("specifiedAttributes"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(specifiedAttributesPropertyTree!= null):((specifiedAttributesPropertyTree == null)||(!specifiedAttributesPropertyTree.isLeaf())))) {
                        this.specifiedAttributes = _other.specifiedAttributes;
                    }
                    final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
                        this.displayName = _other.displayName;
                    }
                    final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
                        this.description = _other.description;
                    }
                    final PropertyTree writeMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeMaskPropertyTree!= null):((writeMaskPropertyTree == null)||(!writeMaskPropertyTree.isLeaf())))) {
                        this.writeMask = _other.writeMask;
                    }
                    final PropertyTree userWriteMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userWriteMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userWriteMaskPropertyTree!= null):((userWriteMaskPropertyTree == null)||(!userWriteMaskPropertyTree.isLeaf())))) {
                        this.userWriteMask = _other.userWriteMask;
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

        protected<_P extends NodeAttributes >_P init(final _P _product) {
            _product.specifiedAttributes = this.specifiedAttributes;
            _product.displayName = this.displayName;
            _product.description = this.description;
            _product.writeMask = this.writeMask;
            _product.userWriteMask = this.userWriteMask;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "specifiedAttributes" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param specifiedAttributes
         *     Neuer Wert der Eigenschaft "specifiedAttributes".
         */
        public NodeAttributes.Builder<_B> withSpecifiedAttributes(final Long specifiedAttributes) {
            this.specifiedAttributes = specifiedAttributes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "displayName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param displayName
         *     Neuer Wert der Eigenschaft "displayName".
         */
        public NodeAttributes.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "description" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param description
         *     Neuer Wert der Eigenschaft "description".
         */
        public NodeAttributes.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            this.description = description;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeMask" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param writeMask
         *     Neuer Wert der Eigenschaft "writeMask".
         */
        public NodeAttributes.Builder<_B> withWriteMask(final Long writeMask) {
            this.writeMask = writeMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userWriteMask" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userWriteMask
         *     Neuer Wert der Eigenschaft "userWriteMask".
         */
        public NodeAttributes.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            this.userWriteMask = userWriteMask;
            return this;
        }

        @Override
        public NodeAttributes build() {
            if (_storedValue == null) {
                return this.init(new NodeAttributes());
            } else {
                return ((NodeAttributes) _storedValue);
            }
        }

        public NodeAttributes.Builder<_B> copyOf(final NodeAttributes _other) {
            _other.copyTo(this);
            return this;
        }

        public NodeAttributes.Builder<_B> copyOf(final NodeAttributes.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends NodeAttributes.Selector<NodeAttributes.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static NodeAttributes.Select _root() {
            return new NodeAttributes.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> specifiedAttributes = null;
        private com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> displayName = null;
        private com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> description = null;
        private com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> writeMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> userWriteMask = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.specifiedAttributes!= null) {
                products.put("specifiedAttributes", this.specifiedAttributes.init());
            }
            if (this.displayName!= null) {
                products.put("displayName", this.displayName.init());
            }
            if (this.description!= null) {
                products.put("description", this.description.init());
            }
            if (this.writeMask!= null) {
                products.put("writeMask", this.writeMask.init());
            }
            if (this.userWriteMask!= null) {
                products.put("userWriteMask", this.userWriteMask.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> specifiedAttributes() {
            return ((this.specifiedAttributes == null)?this.specifiedAttributes = new com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>>(this._root, this, "specifiedAttributes"):this.specifiedAttributes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> displayName() {
            return ((this.displayName == null)?this.displayName = new com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>>(this._root, this, "displayName"):this.displayName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> description() {
            return ((this.description == null)?this.description = new com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>>(this._root, this, "description"):this.description);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> writeMask() {
            return ((this.writeMask == null)?this.writeMask = new com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>>(this._root, this, "writeMask"):this.writeMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>> userWriteMask() {
            return ((this.userWriteMask == null)?this.userWriteMask = new com.kscs.util.jaxb.Selector<TRoot, NodeAttributes.Selector<TRoot, TParent>>(this._root, this, "userWriteMask"):this.userWriteMask);
        }

    }

}
