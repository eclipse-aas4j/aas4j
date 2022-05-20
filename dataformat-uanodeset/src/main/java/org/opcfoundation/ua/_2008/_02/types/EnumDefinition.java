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
 * <p>Java-Klasse für EnumDefinition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnumDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fields" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfEnumField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumDefinition", propOrder = {
    "fields"
})
public class EnumDefinition
    extends DataTypeDefinition
{

    @XmlElementRef(name = "Fields", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfEnumField> fields;

    /**
     * Ruft den Wert der fields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfEnumField }{@code >}
     *     
     */
    public JAXBElement<ListOfEnumField> getFields() {
        return fields;
    }

    /**
     * Legt den Wert der fields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfEnumField }{@code >}
     *     
     */
    public void setFields(JAXBElement<ListOfEnumField> value) {
        this.fields = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EnumDefinition.Builder<_B> _other) {
        super.copyTo(_other);
        _other.fields = this.fields;
    }

    @Override
    public<_B >EnumDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EnumDefinition.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public EnumDefinition.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EnumDefinition.Builder<Void> builder() {
        return new EnumDefinition.Builder<Void>(null, null, false);
    }

    public static<_B >EnumDefinition.Builder<_B> copyOf(final DataTypeDefinition _other) {
        final EnumDefinition.Builder<_B> _newBuilder = new EnumDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >EnumDefinition.Builder<_B> copyOf(final EnumDefinition _other) {
        final EnumDefinition.Builder<_B> _newBuilder = new EnumDefinition.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EnumDefinition.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree fieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fields"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldsPropertyTree!= null):((fieldsPropertyTree == null)||(!fieldsPropertyTree.isLeaf())))) {
            _other.fields = this.fields;
        }
    }

    @Override
    public<_B >EnumDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EnumDefinition.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public EnumDefinition.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EnumDefinition.Builder<_B> copyOf(final DataTypeDefinition _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EnumDefinition.Builder<_B> _newBuilder = new EnumDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >EnumDefinition.Builder<_B> copyOf(final EnumDefinition _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EnumDefinition.Builder<_B> _newBuilder = new EnumDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EnumDefinition.Builder<Void> copyExcept(final DataTypeDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EnumDefinition.Builder<Void> copyExcept(final EnumDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EnumDefinition.Builder<Void> copyOnly(final DataTypeDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static EnumDefinition.Builder<Void> copyOnly(final EnumDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataTypeDefinition.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfEnumField> fields;

        public Builder(final _B _parentBuilder, final EnumDefinition _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.fields = _other.fields;
            }
        }

        public Builder(final _B _parentBuilder, final EnumDefinition _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree fieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fields"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fieldsPropertyTree!= null):((fieldsPropertyTree == null)||(!fieldsPropertyTree.isLeaf())))) {
                    this.fields = _other.fields;
                }
            }
        }

        protected<_P extends EnumDefinition >_P init(final _P _product) {
            _product.fields = this.fields;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "fields" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param fields
         *     Neuer Wert der Eigenschaft "fields".
         */
        public EnumDefinition.Builder<_B> withFields(final JAXBElement<ListOfEnumField> fields) {
            this.fields = fields;
            return this;
        }

        @Override
        public EnumDefinition build() {
            if (_storedValue == null) {
                return this.init(new EnumDefinition());
            } else {
                return ((EnumDefinition) _storedValue);
            }
        }

        public EnumDefinition.Builder<_B> copyOf(final EnumDefinition _other) {
            _other.copyTo(this);
            return this;
        }

        public EnumDefinition.Builder<_B> copyOf(final EnumDefinition.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EnumDefinition.Selector<EnumDefinition.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EnumDefinition.Select _root() {
            return new EnumDefinition.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataTypeDefinition.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EnumDefinition.Selector<TRoot, TParent>> fields = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.fields!= null) {
                products.put("fields", this.fields.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EnumDefinition.Selector<TRoot, TParent>> fields() {
            return ((this.fields == null)?this.fields = new com.kscs.util.jaxb.Selector<TRoot, EnumDefinition.Selector<TRoot, TParent>>(this._root, this, "fields"):this.fields);
        }

    }

}
