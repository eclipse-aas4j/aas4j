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
 * <p>Java-Klasse für SimpleTypeDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SimpleTypeDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeDescription"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
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
@XmlType(name = "SimpleTypeDescription", propOrder = {
    "baseDataType",
    "builtInType"
})
public class SimpleTypeDescription
    extends DataTypeDescription
{

    @XmlElementRef(name = "BaseDataType", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> baseDataType;
    @XmlElement(name = "BuiltInType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short builtInType;

    /**
     * Ruft den Wert der baseDataType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getBaseDataType() {
        return baseDataType;
    }

    /**
     * Legt den Wert der baseDataType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setBaseDataType(JAXBElement<NodeId> value) {
        this.baseDataType = value;
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
    public<_B >void copyTo(final SimpleTypeDescription.Builder<_B> _other) {
        super.copyTo(_other);
        _other.baseDataType = this.baseDataType;
        _other.builtInType = this.builtInType;
    }

    @Override
    public<_B >SimpleTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SimpleTypeDescription.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public SimpleTypeDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SimpleTypeDescription.Builder<Void> builder() {
        return new SimpleTypeDescription.Builder<Void>(null, null, false);
    }

    public static<_B >SimpleTypeDescription.Builder<_B> copyOf(final DataTypeDescription _other) {
        final SimpleTypeDescription.Builder<_B> _newBuilder = new SimpleTypeDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >SimpleTypeDescription.Builder<_B> copyOf(final SimpleTypeDescription _other) {
        final SimpleTypeDescription.Builder<_B> _newBuilder = new SimpleTypeDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SimpleTypeDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree baseDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("baseDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(baseDataTypePropertyTree!= null):((baseDataTypePropertyTree == null)||(!baseDataTypePropertyTree.isLeaf())))) {
            _other.baseDataType = this.baseDataType;
        }
        final PropertyTree builtInTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("builtInType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(builtInTypePropertyTree!= null):((builtInTypePropertyTree == null)||(!builtInTypePropertyTree.isLeaf())))) {
            _other.builtInType = this.builtInType;
        }
    }

    @Override
    public<_B >SimpleTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SimpleTypeDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public SimpleTypeDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SimpleTypeDescription.Builder<_B> copyOf(final DataTypeDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SimpleTypeDescription.Builder<_B> _newBuilder = new SimpleTypeDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >SimpleTypeDescription.Builder<_B> copyOf(final SimpleTypeDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SimpleTypeDescription.Builder<_B> _newBuilder = new SimpleTypeDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SimpleTypeDescription.Builder<Void> copyExcept(final DataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SimpleTypeDescription.Builder<Void> copyExcept(final SimpleTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SimpleTypeDescription.Builder<Void> copyOnly(final DataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static SimpleTypeDescription.Builder<Void> copyOnly(final SimpleTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataTypeDescription.Builder<_B>
        implements Buildable
    {

        private JAXBElement<NodeId> baseDataType;
        private Short builtInType;

        public Builder(final _B _parentBuilder, final SimpleTypeDescription _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.baseDataType = _other.baseDataType;
                this.builtInType = _other.builtInType;
            }
        }

        public Builder(final _B _parentBuilder, final SimpleTypeDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree baseDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("baseDataType"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(baseDataTypePropertyTree!= null):((baseDataTypePropertyTree == null)||(!baseDataTypePropertyTree.isLeaf())))) {
                    this.baseDataType = _other.baseDataType;
                }
                final PropertyTree builtInTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("builtInType"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(builtInTypePropertyTree!= null):((builtInTypePropertyTree == null)||(!builtInTypePropertyTree.isLeaf())))) {
                    this.builtInType = _other.builtInType;
                }
            }
        }

        protected<_P extends SimpleTypeDescription >_P init(final _P _product) {
            _product.baseDataType = this.baseDataType;
            _product.builtInType = this.builtInType;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "baseDataType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param baseDataType
         *     Neuer Wert der Eigenschaft "baseDataType".
         */
        public SimpleTypeDescription.Builder<_B> withBaseDataType(final JAXBElement<NodeId> baseDataType) {
            this.baseDataType = baseDataType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "builtInType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param builtInType
         *     Neuer Wert der Eigenschaft "builtInType".
         */
        public SimpleTypeDescription.Builder<_B> withBuiltInType(final Short builtInType) {
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
        public SimpleTypeDescription.Builder<_B> withDataTypeId(final JAXBElement<NodeId> dataTypeId) {
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
        public SimpleTypeDescription.Builder<_B> withName(final JAXBElement<QualifiedName> name) {
            super.withName(name);
            return this;
        }

        @Override
        public SimpleTypeDescription build() {
            if (_storedValue == null) {
                return this.init(new SimpleTypeDescription());
            } else {
                return ((SimpleTypeDescription) _storedValue);
            }
        }

        public SimpleTypeDescription.Builder<_B> copyOf(final SimpleTypeDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public SimpleTypeDescription.Builder<_B> copyOf(final SimpleTypeDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SimpleTypeDescription.Selector<SimpleTypeDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SimpleTypeDescription.Select _root() {
            return new SimpleTypeDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataTypeDescription.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SimpleTypeDescription.Selector<TRoot, TParent>> baseDataType = null;
        private com.kscs.util.jaxb.Selector<TRoot, SimpleTypeDescription.Selector<TRoot, TParent>> builtInType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.baseDataType!= null) {
                products.put("baseDataType", this.baseDataType.init());
            }
            if (this.builtInType!= null) {
                products.put("builtInType", this.builtInType.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SimpleTypeDescription.Selector<TRoot, TParent>> baseDataType() {
            return ((this.baseDataType == null)?this.baseDataType = new com.kscs.util.jaxb.Selector<TRoot, SimpleTypeDescription.Selector<TRoot, TParent>>(this._root, this, "baseDataType"):this.baseDataType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SimpleTypeDescription.Selector<TRoot, TParent>> builtInType() {
            return ((this.builtInType == null)?this.builtInType = new com.kscs.util.jaxb.Selector<TRoot, SimpleTypeDescription.Selector<TRoot, TParent>>(this._root, this, "builtInType"):this.builtInType);
        }

    }

}
