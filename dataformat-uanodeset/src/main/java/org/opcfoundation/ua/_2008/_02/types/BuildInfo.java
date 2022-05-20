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
import javax.xml.datatype.XMLGregorianCalendar;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für BuildInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BuildInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildInfo", propOrder = {
    "productUri",
    "manufacturerName",
    "productName",
    "softwareVersion",
    "buildNumber",
    "buildDate"
})
public class BuildInfo {

    @XmlElementRef(name = "ProductUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productUri;
    @XmlElementRef(name = "ManufacturerName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufacturerName;
    @XmlElementRef(name = "ProductName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productName;
    @XmlElementRef(name = "SoftwareVersion", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> softwareVersion;
    @XmlElementRef(name = "BuildNumber", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildNumber;
    @XmlElement(name = "BuildDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar buildDate;

    /**
     * Ruft den Wert der productUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductUri() {
        return productUri;
    }

    /**
     * Legt den Wert der productUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductUri(JAXBElement<String> value) {
        this.productUri = value;
    }

    /**
     * Ruft den Wert der manufacturerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Legt den Wert der manufacturerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturerName(JAXBElement<String> value) {
        this.manufacturerName = value;
    }

    /**
     * Ruft den Wert der productName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductName() {
        return productName;
    }

    /**
     * Legt den Wert der productName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductName(JAXBElement<String> value) {
        this.productName = value;
    }

    /**
     * Ruft den Wert der softwareVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Legt den Wert der softwareVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSoftwareVersion(JAXBElement<String> value) {
        this.softwareVersion = value;
    }

    /**
     * Ruft den Wert der buildNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildNumber() {
        return buildNumber;
    }

    /**
     * Legt den Wert der buildNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildNumber(JAXBElement<String> value) {
        this.buildNumber = value;
    }

    /**
     * Ruft den Wert der buildDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuildDate() {
        return buildDate;
    }

    /**
     * Legt den Wert der buildDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuildDate(XMLGregorianCalendar value) {
        this.buildDate = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final BuildInfo.Builder<_B> _other) {
        _other.productUri = this.productUri;
        _other.manufacturerName = this.manufacturerName;
        _other.productName = this.productName;
        _other.softwareVersion = this.softwareVersion;
        _other.buildNumber = this.buildNumber;
        _other.buildDate = ((this.buildDate == null)?null:((XMLGregorianCalendar) this.buildDate.clone()));
    }

    public<_B >BuildInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new BuildInfo.Builder<_B>(_parentBuilder, this, true);
    }

    public BuildInfo.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static BuildInfo.Builder<Void> builder() {
        return new BuildInfo.Builder<Void>(null, null, false);
    }

    public static<_B >BuildInfo.Builder<_B> copyOf(final BuildInfo _other) {
        final BuildInfo.Builder<_B> _newBuilder = new BuildInfo.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final BuildInfo.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree productUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("productUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(productUriPropertyTree!= null):((productUriPropertyTree == null)||(!productUriPropertyTree.isLeaf())))) {
            _other.productUri = this.productUri;
        }
        final PropertyTree manufacturerNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("manufacturerName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(manufacturerNamePropertyTree!= null):((manufacturerNamePropertyTree == null)||(!manufacturerNamePropertyTree.isLeaf())))) {
            _other.manufacturerName = this.manufacturerName;
        }
        final PropertyTree productNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("productName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(productNamePropertyTree!= null):((productNamePropertyTree == null)||(!productNamePropertyTree.isLeaf())))) {
            _other.productName = this.productName;
        }
        final PropertyTree softwareVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("softwareVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(softwareVersionPropertyTree!= null):((softwareVersionPropertyTree == null)||(!softwareVersionPropertyTree.isLeaf())))) {
            _other.softwareVersion = this.softwareVersion;
        }
        final PropertyTree buildNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("buildNumber"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(buildNumberPropertyTree!= null):((buildNumberPropertyTree == null)||(!buildNumberPropertyTree.isLeaf())))) {
            _other.buildNumber = this.buildNumber;
        }
        final PropertyTree buildDatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("buildDate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(buildDatePropertyTree!= null):((buildDatePropertyTree == null)||(!buildDatePropertyTree.isLeaf())))) {
            _other.buildDate = ((this.buildDate == null)?null:((XMLGregorianCalendar) this.buildDate.clone()));
        }
    }

    public<_B >BuildInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new BuildInfo.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public BuildInfo.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >BuildInfo.Builder<_B> copyOf(final BuildInfo _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BuildInfo.Builder<_B> _newBuilder = new BuildInfo.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static BuildInfo.Builder<Void> copyExcept(final BuildInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BuildInfo.Builder<Void> copyOnly(final BuildInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final BuildInfo _storedValue;
        private JAXBElement<String> productUri;
        private JAXBElement<String> manufacturerName;
        private JAXBElement<String> productName;
        private JAXBElement<String> softwareVersion;
        private JAXBElement<String> buildNumber;
        private XMLGregorianCalendar buildDate;

        public Builder(final _B _parentBuilder, final BuildInfo _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.productUri = _other.productUri;
                    this.manufacturerName = _other.manufacturerName;
                    this.productName = _other.productName;
                    this.softwareVersion = _other.softwareVersion;
                    this.buildNumber = _other.buildNumber;
                    this.buildDate = ((_other.buildDate == null)?null:((XMLGregorianCalendar) _other.buildDate.clone()));
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final BuildInfo _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree productUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("productUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(productUriPropertyTree!= null):((productUriPropertyTree == null)||(!productUriPropertyTree.isLeaf())))) {
                        this.productUri = _other.productUri;
                    }
                    final PropertyTree manufacturerNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("manufacturerName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(manufacturerNamePropertyTree!= null):((manufacturerNamePropertyTree == null)||(!manufacturerNamePropertyTree.isLeaf())))) {
                        this.manufacturerName = _other.manufacturerName;
                    }
                    final PropertyTree productNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("productName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(productNamePropertyTree!= null):((productNamePropertyTree == null)||(!productNamePropertyTree.isLeaf())))) {
                        this.productName = _other.productName;
                    }
                    final PropertyTree softwareVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("softwareVersion"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(softwareVersionPropertyTree!= null):((softwareVersionPropertyTree == null)||(!softwareVersionPropertyTree.isLeaf())))) {
                        this.softwareVersion = _other.softwareVersion;
                    }
                    final PropertyTree buildNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("buildNumber"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(buildNumberPropertyTree!= null):((buildNumberPropertyTree == null)||(!buildNumberPropertyTree.isLeaf())))) {
                        this.buildNumber = _other.buildNumber;
                    }
                    final PropertyTree buildDatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("buildDate"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(buildDatePropertyTree!= null):((buildDatePropertyTree == null)||(!buildDatePropertyTree.isLeaf())))) {
                        this.buildDate = ((_other.buildDate == null)?null:((XMLGregorianCalendar) _other.buildDate.clone()));
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

        protected<_P extends BuildInfo >_P init(final _P _product) {
            _product.productUri = this.productUri;
            _product.manufacturerName = this.manufacturerName;
            _product.productName = this.productName;
            _product.softwareVersion = this.softwareVersion;
            _product.buildNumber = this.buildNumber;
            _product.buildDate = this.buildDate;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "productUri" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param productUri
         *     Neuer Wert der Eigenschaft "productUri".
         */
        public BuildInfo.Builder<_B> withProductUri(final JAXBElement<String> productUri) {
            this.productUri = productUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "manufacturerName" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param manufacturerName
         *     Neuer Wert der Eigenschaft "manufacturerName".
         */
        public BuildInfo.Builder<_B> withManufacturerName(final JAXBElement<String> manufacturerName) {
            this.manufacturerName = manufacturerName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "productName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param productName
         *     Neuer Wert der Eigenschaft "productName".
         */
        public BuildInfo.Builder<_B> withProductName(final JAXBElement<String> productName) {
            this.productName = productName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "softwareVersion" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param softwareVersion
         *     Neuer Wert der Eigenschaft "softwareVersion".
         */
        public BuildInfo.Builder<_B> withSoftwareVersion(final JAXBElement<String> softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "buildNumber" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param buildNumber
         *     Neuer Wert der Eigenschaft "buildNumber".
         */
        public BuildInfo.Builder<_B> withBuildNumber(final JAXBElement<String> buildNumber) {
            this.buildNumber = buildNumber;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "buildDate" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param buildDate
         *     Neuer Wert der Eigenschaft "buildDate".
         */
        public BuildInfo.Builder<_B> withBuildDate(final XMLGregorianCalendar buildDate) {
            this.buildDate = buildDate;
            return this;
        }

        @Override
        public BuildInfo build() {
            if (_storedValue == null) {
                return this.init(new BuildInfo());
            } else {
                return ((BuildInfo) _storedValue);
            }
        }

        public BuildInfo.Builder<_B> copyOf(final BuildInfo _other) {
            _other.copyTo(this);
            return this;
        }

        public BuildInfo.Builder<_B> copyOf(final BuildInfo.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends BuildInfo.Selector<BuildInfo.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static BuildInfo.Select _root() {
            return new BuildInfo.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> productUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> manufacturerName = null;
        private com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> productName = null;
        private com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> softwareVersion = null;
        private com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> buildNumber = null;
        private com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> buildDate = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.productUri!= null) {
                products.put("productUri", this.productUri.init());
            }
            if (this.manufacturerName!= null) {
                products.put("manufacturerName", this.manufacturerName.init());
            }
            if (this.productName!= null) {
                products.put("productName", this.productName.init());
            }
            if (this.softwareVersion!= null) {
                products.put("softwareVersion", this.softwareVersion.init());
            }
            if (this.buildNumber!= null) {
                products.put("buildNumber", this.buildNumber.init());
            }
            if (this.buildDate!= null) {
                products.put("buildDate", this.buildDate.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> productUri() {
            return ((this.productUri == null)?this.productUri = new com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>>(this._root, this, "productUri"):this.productUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> manufacturerName() {
            return ((this.manufacturerName == null)?this.manufacturerName = new com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>>(this._root, this, "manufacturerName"):this.manufacturerName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> productName() {
            return ((this.productName == null)?this.productName = new com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>>(this._root, this, "productName"):this.productName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> softwareVersion() {
            return ((this.softwareVersion == null)?this.softwareVersion = new com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>>(this._root, this, "softwareVersion"):this.softwareVersion);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> buildNumber() {
            return ((this.buildNumber == null)?this.buildNumber = new com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>>(this._root, this, "buildNumber"):this.buildNumber);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>> buildDate() {
            return ((this.buildDate == null)?this.buildDate = new com.kscs.util.jaxb.Selector<TRoot, BuildInfo.Selector<TRoot, TParent>>(this._root, this, "buildDate"):this.buildDate);
        }

    }

}
