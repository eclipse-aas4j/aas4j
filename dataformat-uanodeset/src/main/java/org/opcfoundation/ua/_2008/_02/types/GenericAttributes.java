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
 * <p>Java-Klasse für GenericAttributes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GenericAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeAttributes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttributeValues" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfGenericAttributeValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericAttributes", propOrder = {
    "attributeValues"
})
public class GenericAttributes
    extends NodeAttributes
{

    @XmlElementRef(name = "AttributeValues", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfGenericAttributeValue> attributeValues;

    /**
     * Ruft den Wert der attributeValues-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfGenericAttributeValue }{@code >}
     *     
     */
    public JAXBElement<ListOfGenericAttributeValue> getAttributeValues() {
        return attributeValues;
    }

    /**
     * Legt den Wert der attributeValues-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfGenericAttributeValue }{@code >}
     *     
     */
    public void setAttributeValues(JAXBElement<ListOfGenericAttributeValue> value) {
        this.attributeValues = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final GenericAttributes.Builder<_B> _other) {
        super.copyTo(_other);
        _other.attributeValues = this.attributeValues;
    }

    @Override
    public<_B >GenericAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new GenericAttributes.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public GenericAttributes.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static GenericAttributes.Builder<Void> builder() {
        return new GenericAttributes.Builder<Void>(null, null, false);
    }

    public static<_B >GenericAttributes.Builder<_B> copyOf(final NodeAttributes _other) {
        final GenericAttributes.Builder<_B> _newBuilder = new GenericAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >GenericAttributes.Builder<_B> copyOf(final GenericAttributes _other) {
        final GenericAttributes.Builder<_B> _newBuilder = new GenericAttributes.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final GenericAttributes.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree attributeValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeValues"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeValuesPropertyTree!= null):((attributeValuesPropertyTree == null)||(!attributeValuesPropertyTree.isLeaf())))) {
            _other.attributeValues = this.attributeValues;
        }
    }

    @Override
    public<_B >GenericAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new GenericAttributes.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public GenericAttributes.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >GenericAttributes.Builder<_B> copyOf(final NodeAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final GenericAttributes.Builder<_B> _newBuilder = new GenericAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >GenericAttributes.Builder<_B> copyOf(final GenericAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final GenericAttributes.Builder<_B> _newBuilder = new GenericAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static GenericAttributes.Builder<Void> copyExcept(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static GenericAttributes.Builder<Void> copyExcept(final GenericAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static GenericAttributes.Builder<Void> copyOnly(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static GenericAttributes.Builder<Void> copyOnly(final GenericAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NodeAttributes.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfGenericAttributeValue> attributeValues;

        public Builder(final _B _parentBuilder, final GenericAttributes _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.attributeValues = _other.attributeValues;
            }
        }

        public Builder(final _B _parentBuilder, final GenericAttributes _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree attributeValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("attributeValues"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(attributeValuesPropertyTree!= null):((attributeValuesPropertyTree == null)||(!attributeValuesPropertyTree.isLeaf())))) {
                    this.attributeValues = _other.attributeValues;
                }
            }
        }

        protected<_P extends GenericAttributes >_P init(final _P _product) {
            _product.attributeValues = this.attributeValues;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "attributeValues" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param attributeValues
         *     Neuer Wert der Eigenschaft "attributeValues".
         */
        public GenericAttributes.Builder<_B> withAttributeValues(final JAXBElement<ListOfGenericAttributeValue> attributeValues) {
            this.attributeValues = attributeValues;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "specifiedAttributes" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param specifiedAttributes
         *     Neuer Wert der Eigenschaft "specifiedAttributes".
         */
        @Override
        public GenericAttributes.Builder<_B> withSpecifiedAttributes(final Long specifiedAttributes) {
            super.withSpecifiedAttributes(specifiedAttributes);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "displayName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param displayName
         *     Neuer Wert der Eigenschaft "displayName".
         */
        @Override
        public GenericAttributes.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
            super.withDisplayName(displayName);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "description" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param description
         *     Neuer Wert der Eigenschaft "description".
         */
        @Override
        public GenericAttributes.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            super.withDescription(description);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeMask" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param writeMask
         *     Neuer Wert der Eigenschaft "writeMask".
         */
        @Override
        public GenericAttributes.Builder<_B> withWriteMask(final Long writeMask) {
            super.withWriteMask(writeMask);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userWriteMask" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userWriteMask
         *     Neuer Wert der Eigenschaft "userWriteMask".
         */
        @Override
        public GenericAttributes.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            super.withUserWriteMask(userWriteMask);
            return this;
        }

        @Override
        public GenericAttributes build() {
            if (_storedValue == null) {
                return this.init(new GenericAttributes());
            } else {
                return ((GenericAttributes) _storedValue);
            }
        }

        public GenericAttributes.Builder<_B> copyOf(final GenericAttributes _other) {
            _other.copyTo(this);
            return this;
        }

        public GenericAttributes.Builder<_B> copyOf(final GenericAttributes.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends GenericAttributes.Selector<GenericAttributes.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static GenericAttributes.Select _root() {
            return new GenericAttributes.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NodeAttributes.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, GenericAttributes.Selector<TRoot, TParent>> attributeValues = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.attributeValues!= null) {
                products.put("attributeValues", this.attributeValues.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, GenericAttributes.Selector<TRoot, TParent>> attributeValues() {
            return ((this.attributeValues == null)?this.attributeValues = new com.kscs.util.jaxb.Selector<TRoot, GenericAttributes.Selector<TRoot, TParent>>(this._root, this, "attributeValues"):this.attributeValues);
        }

    }

}
