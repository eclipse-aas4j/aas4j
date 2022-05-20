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
 * <p>Java-Klasse für StructureDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StructureDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeDescription"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StructureDefinition" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StructureDefinition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructureDescription", propOrder = {
    "structureDefinition"
})
public class StructureDescription
    extends DataTypeDescription
{

    @XmlElementRef(name = "StructureDefinition", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<StructureDefinition> structureDefinition;

    /**
     * Ruft den Wert der structureDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StructureDefinition }{@code >}
     *     
     */
    public JAXBElement<StructureDefinition> getStructureDefinition() {
        return structureDefinition;
    }

    /**
     * Legt den Wert der structureDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StructureDefinition }{@code >}
     *     
     */
    public void setStructureDefinition(JAXBElement<StructureDefinition> value) {
        this.structureDefinition = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final StructureDescription.Builder<_B> _other) {
        super.copyTo(_other);
        _other.structureDefinition = this.structureDefinition;
    }

    @Override
    public<_B >StructureDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new StructureDescription.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public StructureDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static StructureDescription.Builder<Void> builder() {
        return new StructureDescription.Builder<Void>(null, null, false);
    }

    public static<_B >StructureDescription.Builder<_B> copyOf(final DataTypeDescription _other) {
        final StructureDescription.Builder<_B> _newBuilder = new StructureDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >StructureDescription.Builder<_B> copyOf(final StructureDescription _other) {
        final StructureDescription.Builder<_B> _newBuilder = new StructureDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final StructureDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree structureDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureDefinition"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureDefinitionPropertyTree!= null):((structureDefinitionPropertyTree == null)||(!structureDefinitionPropertyTree.isLeaf())))) {
            _other.structureDefinition = this.structureDefinition;
        }
    }

    @Override
    public<_B >StructureDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new StructureDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public StructureDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >StructureDescription.Builder<_B> copyOf(final DataTypeDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final StructureDescription.Builder<_B> _newBuilder = new StructureDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >StructureDescription.Builder<_B> copyOf(final StructureDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final StructureDescription.Builder<_B> _newBuilder = new StructureDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static StructureDescription.Builder<Void> copyExcept(final DataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static StructureDescription.Builder<Void> copyExcept(final StructureDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static StructureDescription.Builder<Void> copyOnly(final DataTypeDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static StructureDescription.Builder<Void> copyOnly(final StructureDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataTypeDescription.Builder<_B>
        implements Buildable
    {

        private JAXBElement<StructureDefinition> structureDefinition;

        public Builder(final _B _parentBuilder, final StructureDescription _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.structureDefinition = _other.structureDefinition;
            }
        }

        public Builder(final _B _parentBuilder, final StructureDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree structureDefinitionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("structureDefinition"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(structureDefinitionPropertyTree!= null):((structureDefinitionPropertyTree == null)||(!structureDefinitionPropertyTree.isLeaf())))) {
                    this.structureDefinition = _other.structureDefinition;
                }
            }
        }

        protected<_P extends StructureDescription >_P init(final _P _product) {
            _product.structureDefinition = this.structureDefinition;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureDefinition" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param structureDefinition
         *     Neuer Wert der Eigenschaft "structureDefinition".
         */
        public StructureDescription.Builder<_B> withStructureDefinition(final JAXBElement<StructureDefinition> structureDefinition) {
            this.structureDefinition = structureDefinition;
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
        public StructureDescription.Builder<_B> withDataTypeId(final JAXBElement<NodeId> dataTypeId) {
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
        public StructureDescription.Builder<_B> withName(final JAXBElement<QualifiedName> name) {
            super.withName(name);
            return this;
        }

        @Override
        public StructureDescription build() {
            if (_storedValue == null) {
                return this.init(new StructureDescription());
            } else {
                return ((StructureDescription) _storedValue);
            }
        }

        public StructureDescription.Builder<_B> copyOf(final StructureDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public StructureDescription.Builder<_B> copyOf(final StructureDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends StructureDescription.Selector<StructureDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static StructureDescription.Select _root() {
            return new StructureDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataTypeDescription.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, StructureDescription.Selector<TRoot, TParent>> structureDefinition = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.structureDefinition!= null) {
                products.put("structureDefinition", this.structureDefinition.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, StructureDescription.Selector<TRoot, TParent>> structureDefinition() {
            return ((this.structureDefinition == null)?this.structureDefinition = new com.kscs.util.jaxb.Selector<TRoot, StructureDescription.Selector<TRoot, TParent>>(this._root, this, "structureDefinition"):this.structureDefinition);
        }

    }

}
