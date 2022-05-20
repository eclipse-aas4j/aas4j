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
 * <p>Java-Klasse für AxisInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AxisInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EngineeringUnits" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EUInformation" minOccurs="0"/&gt;
 *         &lt;element name="EURange" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Range" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *         &lt;element name="AxisScaleType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}AxisScaleEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="AxisSteps" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDouble" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxisInformation", propOrder = {
    "engineeringUnits",
    "euRange",
    "title",
    "axisScaleType",
    "axisSteps"
})
public class AxisInformation {

    @XmlElementRef(name = "EngineeringUnits", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EUInformation> engineeringUnits;
    @XmlElementRef(name = "EURange", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Range> euRange;
    @XmlElementRef(name = "Title", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> title;
    @XmlElement(name = "AxisScaleType")
    @XmlSchemaType(name = "string")
    protected AxisScaleEnumeration axisScaleType;
    @XmlElementRef(name = "AxisSteps", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDouble> axisSteps;

    /**
     * Ruft den Wert der engineeringUnits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EUInformation }{@code >}
     *     
     */
    public JAXBElement<EUInformation> getEngineeringUnits() {
        return engineeringUnits;
    }

    /**
     * Legt den Wert der engineeringUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EUInformation }{@code >}
     *     
     */
    public void setEngineeringUnits(JAXBElement<EUInformation> value) {
        this.engineeringUnits = value;
    }

    /**
     * Ruft den Wert der euRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Range }{@code >}
     *     
     */
    public JAXBElement<Range> getEURange() {
        return euRange;
    }

    /**
     * Legt den Wert der euRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Range }{@code >}
     *     
     */
    public void setEURange(JAXBElement<Range> value) {
        this.euRange = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public JAXBElement<LocalizedText> getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public void setTitle(JAXBElement<LocalizedText> value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der axisScaleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AxisScaleEnumeration }
     *     
     */
    public AxisScaleEnumeration getAxisScaleType() {
        return axisScaleType;
    }

    /**
     * Legt den Wert der axisScaleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisScaleEnumeration }
     *     
     */
    public void setAxisScaleType(AxisScaleEnumeration value) {
        this.axisScaleType = value;
    }

    /**
     * Ruft den Wert der axisSteps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDouble }{@code >}
     *     
     */
    public JAXBElement<ListOfDouble> getAxisSteps() {
        return axisSteps;
    }

    /**
     * Legt den Wert der axisSteps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDouble }{@code >}
     *     
     */
    public void setAxisSteps(JAXBElement<ListOfDouble> value) {
        this.axisSteps = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final AxisInformation.Builder<_B> _other) {
        _other.engineeringUnits = this.engineeringUnits;
        _other.euRange = this.euRange;
        _other.title = this.title;
        _other.axisScaleType = this.axisScaleType;
        _other.axisSteps = this.axisSteps;
    }

    public<_B >AxisInformation.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AxisInformation.Builder<_B>(_parentBuilder, this, true);
    }

    public AxisInformation.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AxisInformation.Builder<Void> builder() {
        return new AxisInformation.Builder<Void>(null, null, false);
    }

    public static<_B >AxisInformation.Builder<_B> copyOf(final AxisInformation _other) {
        final AxisInformation.Builder<_B> _newBuilder = new AxisInformation.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AxisInformation.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree engineeringUnitsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("engineeringUnits"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(engineeringUnitsPropertyTree!= null):((engineeringUnitsPropertyTree == null)||(!engineeringUnitsPropertyTree.isLeaf())))) {
            _other.engineeringUnits = this.engineeringUnits;
        }
        final PropertyTree euRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("euRange"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(euRangePropertyTree!= null):((euRangePropertyTree == null)||(!euRangePropertyTree.isLeaf())))) {
            _other.euRange = this.euRange;
        }
        final PropertyTree titlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("title"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(titlePropertyTree!= null):((titlePropertyTree == null)||(!titlePropertyTree.isLeaf())))) {
            _other.title = this.title;
        }
        final PropertyTree axisScaleTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("axisScaleType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(axisScaleTypePropertyTree!= null):((axisScaleTypePropertyTree == null)||(!axisScaleTypePropertyTree.isLeaf())))) {
            _other.axisScaleType = this.axisScaleType;
        }
        final PropertyTree axisStepsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("axisSteps"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(axisStepsPropertyTree!= null):((axisStepsPropertyTree == null)||(!axisStepsPropertyTree.isLeaf())))) {
            _other.axisSteps = this.axisSteps;
        }
    }

    public<_B >AxisInformation.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AxisInformation.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public AxisInformation.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AxisInformation.Builder<_B> copyOf(final AxisInformation _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AxisInformation.Builder<_B> _newBuilder = new AxisInformation.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AxisInformation.Builder<Void> copyExcept(final AxisInformation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AxisInformation.Builder<Void> copyOnly(final AxisInformation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final AxisInformation _storedValue;
        private JAXBElement<EUInformation> engineeringUnits;
        private JAXBElement<Range> euRange;
        private JAXBElement<LocalizedText> title;
        private AxisScaleEnumeration axisScaleType;
        private JAXBElement<ListOfDouble> axisSteps;

        public Builder(final _B _parentBuilder, final AxisInformation _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.engineeringUnits = _other.engineeringUnits;
                    this.euRange = _other.euRange;
                    this.title = _other.title;
                    this.axisScaleType = _other.axisScaleType;
                    this.axisSteps = _other.axisSteps;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final AxisInformation _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree engineeringUnitsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("engineeringUnits"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(engineeringUnitsPropertyTree!= null):((engineeringUnitsPropertyTree == null)||(!engineeringUnitsPropertyTree.isLeaf())))) {
                        this.engineeringUnits = _other.engineeringUnits;
                    }
                    final PropertyTree euRangePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("euRange"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(euRangePropertyTree!= null):((euRangePropertyTree == null)||(!euRangePropertyTree.isLeaf())))) {
                        this.euRange = _other.euRange;
                    }
                    final PropertyTree titlePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("title"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(titlePropertyTree!= null):((titlePropertyTree == null)||(!titlePropertyTree.isLeaf())))) {
                        this.title = _other.title;
                    }
                    final PropertyTree axisScaleTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("axisScaleType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(axisScaleTypePropertyTree!= null):((axisScaleTypePropertyTree == null)||(!axisScaleTypePropertyTree.isLeaf())))) {
                        this.axisScaleType = _other.axisScaleType;
                    }
                    final PropertyTree axisStepsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("axisSteps"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(axisStepsPropertyTree!= null):((axisStepsPropertyTree == null)||(!axisStepsPropertyTree.isLeaf())))) {
                        this.axisSteps = _other.axisSteps;
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

        protected<_P extends AxisInformation >_P init(final _P _product) {
            _product.engineeringUnits = this.engineeringUnits;
            _product.euRange = this.euRange;
            _product.title = this.title;
            _product.axisScaleType = this.axisScaleType;
            _product.axisSteps = this.axisSteps;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "engineeringUnits" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param engineeringUnits
         *     Neuer Wert der Eigenschaft "engineeringUnits".
         */
        public AxisInformation.Builder<_B> withEngineeringUnits(final JAXBElement<EUInformation> engineeringUnits) {
            this.engineeringUnits = engineeringUnits;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "euRange" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param euRange
         *     Neuer Wert der Eigenschaft "euRange".
         */
        public AxisInformation.Builder<_B> withEURange(final JAXBElement<Range> euRange) {
            this.euRange = euRange;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "title" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param title
         *     Neuer Wert der Eigenschaft "title".
         */
        public AxisInformation.Builder<_B> withTitle(final JAXBElement<LocalizedText> title) {
            this.title = title;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "axisScaleType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param axisScaleType
         *     Neuer Wert der Eigenschaft "axisScaleType".
         */
        public AxisInformation.Builder<_B> withAxisScaleType(final AxisScaleEnumeration axisScaleType) {
            this.axisScaleType = axisScaleType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "axisSteps" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param axisSteps
         *     Neuer Wert der Eigenschaft "axisSteps".
         */
        public AxisInformation.Builder<_B> withAxisSteps(final JAXBElement<ListOfDouble> axisSteps) {
            this.axisSteps = axisSteps;
            return this;
        }

        @Override
        public AxisInformation build() {
            if (_storedValue == null) {
                return this.init(new AxisInformation());
            } else {
                return ((AxisInformation) _storedValue);
            }
        }

        public AxisInformation.Builder<_B> copyOf(final AxisInformation _other) {
            _other.copyTo(this);
            return this;
        }

        public AxisInformation.Builder<_B> copyOf(final AxisInformation.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AxisInformation.Selector<AxisInformation.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AxisInformation.Select _root() {
            return new AxisInformation.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> engineeringUnits = null;
        private com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> euRange = null;
        private com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> title = null;
        private com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> axisScaleType = null;
        private com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> axisSteps = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.engineeringUnits!= null) {
                products.put("engineeringUnits", this.engineeringUnits.init());
            }
            if (this.euRange!= null) {
                products.put("euRange", this.euRange.init());
            }
            if (this.title!= null) {
                products.put("title", this.title.init());
            }
            if (this.axisScaleType!= null) {
                products.put("axisScaleType", this.axisScaleType.init());
            }
            if (this.axisSteps!= null) {
                products.put("axisSteps", this.axisSteps.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> engineeringUnits() {
            return ((this.engineeringUnits == null)?this.engineeringUnits = new com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>>(this._root, this, "engineeringUnits"):this.engineeringUnits);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> euRange() {
            return ((this.euRange == null)?this.euRange = new com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>>(this._root, this, "euRange"):this.euRange);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> title() {
            return ((this.title == null)?this.title = new com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>>(this._root, this, "title"):this.title);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> axisScaleType() {
            return ((this.axisScaleType == null)?this.axisScaleType = new com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>>(this._root, this, "axisScaleType"):this.axisScaleType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>> axisSteps() {
            return ((this.axisSteps == null)?this.axisSteps = new com.kscs.util.jaxb.Selector<TRoot, AxisInformation.Selector<TRoot, TParent>>(this._root, this, "axisSteps"):this.axisSteps);
        }

    }

}
