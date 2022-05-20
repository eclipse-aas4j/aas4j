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
 * <p>Java-Klasse für EUInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EUInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NamespaceUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "EUInformation", propOrder = {
    "namespaceUri",
    "unitId",
    "displayName",
    "description"
})
public class EUInformation {

    @XmlElementRef(name = "NamespaceUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> namespaceUri;
    @XmlElement(name = "UnitId")
    protected Integer unitId;
    @XmlElementRef(name = "DisplayName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> displayName;
    @XmlElementRef(name = "Description", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> description;

    /**
     * Ruft den Wert der namespaceUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNamespaceUri() {
        return namespaceUri;
    }

    /**
     * Legt den Wert der namespaceUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNamespaceUri(JAXBElement<String> value) {
        this.namespaceUri = value;
    }

    /**
     * Ruft den Wert der unitId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * Legt den Wert der unitId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitId(Integer value) {
        this.unitId = value;
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
    public<_B >void copyTo(final EUInformation.Builder<_B> _other) {
        _other.namespaceUri = this.namespaceUri;
        _other.unitId = this.unitId;
        _other.displayName = this.displayName;
        _other.description = this.description;
    }

    public<_B >EUInformation.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EUInformation.Builder<_B>(_parentBuilder, this, true);
    }

    public EUInformation.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EUInformation.Builder<Void> builder() {
        return new EUInformation.Builder<Void>(null, null, false);
    }

    public static<_B >EUInformation.Builder<_B> copyOf(final EUInformation _other) {
        final EUInformation.Builder<_B> _newBuilder = new EUInformation.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EUInformation.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namespaceUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceUriPropertyTree!= null):((namespaceUriPropertyTree == null)||(!namespaceUriPropertyTree.isLeaf())))) {
            _other.namespaceUri = this.namespaceUri;
        }
        final PropertyTree unitIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("unitId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unitIdPropertyTree!= null):((unitIdPropertyTree == null)||(!unitIdPropertyTree.isLeaf())))) {
            _other.unitId = this.unitId;
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

    public<_B >EUInformation.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EUInformation.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public EUInformation.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EUInformation.Builder<_B> copyOf(final EUInformation _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EUInformation.Builder<_B> _newBuilder = new EUInformation.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EUInformation.Builder<Void> copyExcept(final EUInformation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EUInformation.Builder<Void> copyOnly(final EUInformation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final EUInformation _storedValue;
        private JAXBElement<String> namespaceUri;
        private Integer unitId;
        private JAXBElement<LocalizedText> displayName;
        private JAXBElement<LocalizedText> description;

        public Builder(final _B _parentBuilder, final EUInformation _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.namespaceUri = _other.namespaceUri;
                    this.unitId = _other.unitId;
                    this.displayName = _other.displayName;
                    this.description = _other.description;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final EUInformation _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree namespaceUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceUriPropertyTree!= null):((namespaceUriPropertyTree == null)||(!namespaceUriPropertyTree.isLeaf())))) {
                        this.namespaceUri = _other.namespaceUri;
                    }
                    final PropertyTree unitIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("unitId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unitIdPropertyTree!= null):((unitIdPropertyTree == null)||(!unitIdPropertyTree.isLeaf())))) {
                        this.unitId = _other.unitId;
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

        protected<_P extends EUInformation >_P init(final _P _product) {
            _product.namespaceUri = this.namespaceUri;
            _product.unitId = this.unitId;
            _product.displayName = this.displayName;
            _product.description = this.description;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "namespaceUri" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param namespaceUri
         *     Neuer Wert der Eigenschaft "namespaceUri".
         */
        public EUInformation.Builder<_B> withNamespaceUri(final JAXBElement<String> namespaceUri) {
            this.namespaceUri = namespaceUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "unitId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param unitId
         *     Neuer Wert der Eigenschaft "unitId".
         */
        public EUInformation.Builder<_B> withUnitId(final Integer unitId) {
            this.unitId = unitId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "displayName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param displayName
         *     Neuer Wert der Eigenschaft "displayName".
         */
        public EUInformation.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
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
        public EUInformation.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            this.description = description;
            return this;
        }

        @Override
        public EUInformation build() {
            if (_storedValue == null) {
                return this.init(new EUInformation());
            } else {
                return ((EUInformation) _storedValue);
            }
        }

        public EUInformation.Builder<_B> copyOf(final EUInformation _other) {
            _other.copyTo(this);
            return this;
        }

        public EUInformation.Builder<_B> copyOf(final EUInformation.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EUInformation.Selector<EUInformation.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EUInformation.Select _root() {
            return new EUInformation.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>> namespaceUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>> unitId = null;
        private com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>> displayName = null;
        private com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>> description = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.namespaceUri!= null) {
                products.put("namespaceUri", this.namespaceUri.init());
            }
            if (this.unitId!= null) {
                products.put("unitId", this.unitId.init());
            }
            if (this.displayName!= null) {
                products.put("displayName", this.displayName.init());
            }
            if (this.description!= null) {
                products.put("description", this.description.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>> namespaceUri() {
            return ((this.namespaceUri == null)?this.namespaceUri = new com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>>(this._root, this, "namespaceUri"):this.namespaceUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>> unitId() {
            return ((this.unitId == null)?this.unitId = new com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>>(this._root, this, "unitId"):this.unitId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>> displayName() {
            return ((this.displayName == null)?this.displayName = new com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>>(this._root, this, "displayName"):this.displayName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>> description() {
            return ((this.description == null)?this.description = new com.kscs.util.jaxb.Selector<TRoot, EUInformation.Selector<TRoot, TParent>>(this._root, this, "description"):this.description);
        }

    }

}
