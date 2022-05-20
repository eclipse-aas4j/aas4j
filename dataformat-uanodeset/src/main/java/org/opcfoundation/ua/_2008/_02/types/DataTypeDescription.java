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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für DataTypeDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataTypeDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataTypeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QualifiedName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTypeDescription", propOrder = {
    "dataTypeId",
    "name"
})
@XmlSeeAlso({
    StructureDescription.class,
    EnumDescription.class,
    SimpleTypeDescription.class
})
public class DataTypeDescription {

    @XmlElementRef(name = "DataTypeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> dataTypeId;
    @XmlElementRef(name = "Name", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<QualifiedName> name;

    /**
     * Ruft den Wert der dataTypeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getDataTypeId() {
        return dataTypeId;
    }

    /**
     * Legt den Wert der dataTypeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setDataTypeId(JAXBElement<NodeId> value) {
        this.dataTypeId = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public JAXBElement<QualifiedName> getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QualifiedName }{@code >}
     *     
     */
    public void setName(JAXBElement<QualifiedName> value) {
        this.name = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataTypeDescription.Builder<_B> _other) {
        _other.dataTypeId = this.dataTypeId;
        _other.name = this.name;
    }

    public<_B >DataTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataTypeDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public DataTypeDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataTypeDescription.Builder<Void> builder() {
        return new DataTypeDescription.Builder<Void>(null, null, false);
    }

    public static<_B >DataTypeDescription.Builder<_B> copyOf(final DataTypeDescription _other) {
        final DataTypeDescription.Builder<_B> _newBuilder = new DataTypeDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataTypeDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeIdPropertyTree!= null):((dataTypeIdPropertyTree == null)||(!dataTypeIdPropertyTree.isLeaf())))) {
            _other.dataTypeId = this.dataTypeId;
        }
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
    }

    public<_B >DataTypeDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataTypeDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DataTypeDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataTypeDescription.Builder<_B> copyOf(final DataTypeDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataTypeDescription.Builder<_B> _newBuilder = new DataTypeDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataTypeDescription.Builder<Void> copyExcept(final DataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataTypeDescription.Builder<Void> copyOnly(final DataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DataTypeDescription _storedValue;
        private JAXBElement<NodeId> dataTypeId;
        private JAXBElement<QualifiedName> name;

        public Builder(final _B _parentBuilder, final DataTypeDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.dataTypeId = _other.dataTypeId;
                    this.name = _other.name;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DataTypeDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataTypeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataTypeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataTypeIdPropertyTree!= null):((dataTypeIdPropertyTree == null)||(!dataTypeIdPropertyTree.isLeaf())))) {
                        this.dataTypeId = _other.dataTypeId;
                    }
                    final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                        this.name = _other.name;
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

        protected<_P extends DataTypeDescription >_P init(final _P _product) {
            _product.dataTypeId = this.dataTypeId;
            _product.name = this.name;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataTypeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dataTypeId
         *     Neuer Wert der Eigenschaft "dataTypeId".
         */
        public DataTypeDescription.Builder<_B> withDataTypeId(final JAXBElement<NodeId> dataTypeId) {
            this.dataTypeId = dataTypeId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        public DataTypeDescription.Builder<_B> withName(final JAXBElement<QualifiedName> name) {
            this.name = name;
            return this;
        }

        @Override
        public DataTypeDescription build() {
            if (_storedValue == null) {
                return this.init(new DataTypeDescription());
            } else {
                return ((DataTypeDescription) _storedValue);
            }
        }

        public DataTypeDescription.Builder<_B> copyOf(final DataTypeDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public DataTypeDescription.Builder<_B> copyOf(final DataTypeDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataTypeDescription.Selector<DataTypeDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataTypeDescription.Select _root() {
            return new DataTypeDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DataTypeDescription.Selector<TRoot, TParent>> dataTypeId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataTypeDescription.Selector<TRoot, TParent>> name = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataTypeId!= null) {
                products.put("dataTypeId", this.dataTypeId.init());
            }
            if (this.name!= null) {
                products.put("name", this.name.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataTypeDescription.Selector<TRoot, TParent>> dataTypeId() {
            return ((this.dataTypeId == null)?this.dataTypeId = new com.kscs.util.jaxb.Selector<TRoot, DataTypeDescription.Selector<TRoot, TParent>>(this._root, this, "dataTypeId"):this.dataTypeId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataTypeDescription.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, DataTypeDescription.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

    }

}
