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
 * <p>Java-Klasse für EnumDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnumDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeDescription"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnumDefinition" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}EnumDefinition" minOccurs="0"/&gt;
 *         &lt;element name="BuiltInType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumDescription", propOrder = {
    "enumDefinition",
    "builtInType"
})
public class EnumDescription
    extends DataTypeDescription
{

    @XmlElementRef(name = "EnumDefinition", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<EnumDefinition> enumDefinition;
    @XmlElement(name = "BuiltInType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short builtInType;

    /**
     * Ruft den Wert der enumDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnumDefinition }{@code >}
     *     
     */
    public JAXBElement<EnumDefinition> getEnumDefinition() {
        return enumDefinition;
    }

    /**
     * Legt den Wert der enumDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnumDefinition }{@code >}
     *     
     */
    public void setEnumDefinition(JAXBElement<EnumDefinition> value) {
        this.enumDefinition = value;
    }

    /**
     * Ruft den Wert der builtInType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBuiltInType() {
        return builtInType;
    }

    /**
     * Legt den Wert der builtInType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBuiltInType(Short value) {
        this.builtInType = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EnumDescription.Builder<_B> _other) {
        super.copyTo(_other);
        _other.enumDefinition = this.enumDefinition;
        _other.builtInType = this.builtInType;
    }

    @Override
    public<_B >EnumDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EnumDescription.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public EnumDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EnumDescription.Builder<Void> builder() {
        return new EnumDescription.Builder<Void>(null, null, false);
    }

    public static<_B >EnumDescription.Builder<_B> copyOf(final DataTypeDescription _other) {
        final EnumDescription.Builder<_B> _newBuilder = new EnumDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >EnumDescription.Builder<_B> copyOf(final EnumDescription _other) {
        final EnumDescription.Builder<_B> _newBuilder = new EnumDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EnumDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree enumDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumDefinition"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumDefinitionPropertyTree!= null):((enumDefinitionPropertyTree == null)||(!enumDefinitionPropertyTree.isLeaf())))) {
            _other.enumDefinition = this.enumDefinition;
        }
        final PropertyTree builtInTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("builtInType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(builtInTypePropertyTree!= null):((builtInTypePropertyTree == null)||(!builtInTypePropertyTree.isLeaf())))) {
            _other.builtInType = this.builtInType;
        }
    }

    @Override
    public<_B >EnumDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EnumDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public EnumDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EnumDescription.Builder<_B> copyOf(final DataTypeDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EnumDescription.Builder<_B> _newBuilder = new EnumDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >EnumDescription.Builder<_B> copyOf(final EnumDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EnumDescription.Builder<_B> _newBuilder = new EnumDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EnumDescription.Builder<Void> copyExcept(final DataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EnumDescription.Builder<Void> copyExcept(final EnumDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EnumDescription.Builder<Void> copyOnly(final DataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static EnumDescription.Builder<Void> copyOnly(final EnumDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataTypeDescription.Builder<_B>
        implements Buildable
    {

        private JAXBElement<EnumDefinition> enumDefinition;
        private Short builtInType;

        public Builder(final _B _parentBuilder, final EnumDescription _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.enumDefinition = _other.enumDefinition;
                this.builtInType = _other.builtInType;
            }
        }

        public Builder(final _B _parentBuilder, final EnumDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree enumDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enumDefinition"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enumDefinitionPropertyTree!= null):((enumDefinitionPropertyTree == null)||(!enumDefinitionPropertyTree.isLeaf())))) {
                    this.enumDefinition = _other.enumDefinition;
                }
                final PropertyTree builtInTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("builtInType"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(builtInTypePropertyTree!= null):((builtInTypePropertyTree == null)||(!builtInTypePropertyTree.isLeaf())))) {
                    this.builtInType = _other.builtInType;
                }
            }
        }

        protected<_P extends EnumDescription >_P init(final _P _product) {
            _product.enumDefinition = this.enumDefinition;
            _product.builtInType = this.builtInType;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumDefinition" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumDefinition
         *     Neuer Wert der Eigenschaft "enumDefinition".
         */
        public EnumDescription.Builder<_B> withEnumDefinition(final JAXBElement<EnumDefinition> enumDefinition) {
            this.enumDefinition = enumDefinition;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "builtInType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param builtInType
         *     Neuer Wert der Eigenschaft "builtInType".
         */
        public EnumDescription.Builder<_B> withBuiltInType(final Short builtInType) {
            this.builtInType = builtInType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataTypeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dataTypeId
         *     Neuer Wert der Eigenschaft "dataTypeId".
         */
        @Override
        public EnumDescription.Builder<_B> withDataTypeId(final JAXBElement<NodeId> dataTypeId) {
            super.withDataTypeId(dataTypeId);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        @Override
        public EnumDescription.Builder<_B> withName(final JAXBElement<QualifiedName> name) {
            super.withName(name);
            return this;
        }

        @Override
        public EnumDescription build() {
            if (_storedValue == null) {
                return this.init(new EnumDescription());
            } else {
                return ((EnumDescription) _storedValue);
            }
        }

        public EnumDescription.Builder<_B> copyOf(final EnumDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public EnumDescription.Builder<_B> copyOf(final EnumDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EnumDescription.Selector<EnumDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EnumDescription.Select _root() {
            return new EnumDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataTypeDescription.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EnumDescription.Selector<TRoot, TParent>> enumDefinition = null;
        private com.kscs.util.jaxb.Selector<TRoot, EnumDescription.Selector<TRoot, TParent>> builtInType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.enumDefinition!= null) {
                products.put("enumDefinition", this.enumDefinition.init());
            }
            if (this.builtInType!= null) {
                products.put("builtInType", this.builtInType.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EnumDescription.Selector<TRoot, TParent>> enumDefinition() {
            return ((this.enumDefinition == null)?this.enumDefinition = new com.kscs.util.jaxb.Selector<TRoot, EnumDescription.Selector<TRoot, TParent>>(this._root, this, "enumDefinition"):this.enumDefinition);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EnumDescription.Selector<TRoot, TParent>> builtInType() {
            return ((this.builtInType == null)?this.builtInType = new com.kscs.util.jaxb.Selector<TRoot, EnumDescription.Selector<TRoot, TParent>>(this._root, this, "builtInType"):this.builtInType);
        }

    }

}
