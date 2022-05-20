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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für EnumValueType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnumValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DisplayName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumValueType", propOrder = {
    "value",
    "displayName",
    "description"
})
@XmlSeeAlso({
    EnumField.class
})
public class EnumValueType {

    @XmlElement(name = "Value")
    protected Long value;
    @XmlElementRef(name = "DisplayName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> displayName;
    @XmlElementRef(name = "Description", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> description;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValue(Long value) {
        this.value = value;
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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EnumValueType.Builder<_B> _other) {
        _other.value = this.value;
        _other.displayName = this.displayName;
        _other.description = this.description;
    }

    public<_B >EnumValueType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EnumValueType.Builder<_B>(_parentBuilder, this, true);
    }

    public EnumValueType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EnumValueType.Builder<Void> builder() {
        return new EnumValueType.Builder<Void>(null, null, false);
    }

    public static<_B >EnumValueType.Builder<_B> copyOf(final EnumValueType _other) {
        final EnumValueType.Builder<_B> _newBuilder = new EnumValueType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EnumValueType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = this.value;
        }
        final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
            _other.displayName = this.displayName;
        }
        final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
            _other.description = this.description;
        }
    }

    public<_B >EnumValueType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EnumValueType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public EnumValueType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EnumValueType.Builder<_B> copyOf(final EnumValueType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EnumValueType.Builder<_B> _newBuilder = new EnumValueType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EnumValueType.Builder<Void> copyExcept(final EnumValueType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EnumValueType.Builder<Void> copyOnly(final EnumValueType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final EnumValueType _storedValue;
        private Long value;
        private JAXBElement<LocalizedText> displayName;
        private JAXBElement<LocalizedText> description;

        public Builder(final _B _parentBuilder, final EnumValueType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.value = _other.value;
                    this.displayName = _other.displayName;
                    this.description = _other.description;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final EnumValueType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
                        this.value = _other.value;
                    }
                    final PropertyTree displayNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("displayName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(displayNamePropertyTree!= null):((displayNamePropertyTree == null)||(!displayNamePropertyTree.isLeaf())))) {
                        this.displayName = _other.displayName;
                    }
                    final PropertyTree descriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("description"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(descriptionPropertyTree!= null):((descriptionPropertyTree == null)||(!descriptionPropertyTree.isLeaf())))) {
                        this.description = _other.description;
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

        protected<_P extends EnumValueType >_P init(final _P _product) {
            _product.value = this.value;
            _product.displayName = this.displayName;
            _product.description = this.description;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public EnumValueType.Builder<_B> withValue(final Long value) {
            this.value = value;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "displayName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param displayName
         *     Neuer Wert der Eigenschaft "displayName".
         */
        public EnumValueType.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
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
        public EnumValueType.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            this.description = description;
            return this;
        }

        @Override
        public EnumValueType build() {
            if (_storedValue == null) {
                return this.init(new EnumValueType());
            } else {
                return ((EnumValueType) _storedValue);
            }
        }

        public EnumValueType.Builder<_B> copyOf(final EnumValueType _other) {
            _other.copyTo(this);
            return this;
        }

        public EnumValueType.Builder<_B> copyOf(final EnumValueType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EnumValueType.Selector<EnumValueType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EnumValueType.Select _root() {
            return new EnumValueType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EnumValueType.Selector<TRoot, TParent>> value = null;
        private com.kscs.util.jaxb.Selector<TRoot, EnumValueType.Selector<TRoot, TParent>> displayName = null;
        private com.kscs.util.jaxb.Selector<TRoot, EnumValueType.Selector<TRoot, TParent>> description = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.value!= null) {
                products.put("value", this.value.init());
            }
            if (this.displayName!= null) {
                products.put("displayName", this.displayName.init());
            }
            if (this.description!= null) {
                products.put("description", this.description.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EnumValueType.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new com.kscs.util.jaxb.Selector<TRoot, EnumValueType.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EnumValueType.Selector<TRoot, TParent>> displayName() {
            return ((this.displayName == null)?this.displayName = new com.kscs.util.jaxb.Selector<TRoot, EnumValueType.Selector<TRoot, TParent>>(this._root, this, "displayName"):this.displayName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EnumValueType.Selector<TRoot, TParent>> description() {
            return ((this.description == null)?this.description = new com.kscs.util.jaxb.Selector<TRoot, EnumValueType.Selector<TRoot, TParent>>(this._root, this, "description"):this.description);
        }

    }

}
