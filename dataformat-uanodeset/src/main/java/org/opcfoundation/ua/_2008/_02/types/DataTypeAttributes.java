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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für DataTypeAttributes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataTypeAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeAttributes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTypeAttributes", propOrder = {
    "isAbstract"
})
public class DataTypeAttributes
    extends NodeAttributes
{

    @XmlElement(name = "IsAbstract")
    protected Boolean isAbstract;

    /**
     * Ruft den Wert der isAbstract-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * Legt den Wert der isAbstract-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAbstract(Boolean value) {
        this.isAbstract = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataTypeAttributes.Builder<_B> _other) {
        super.copyTo(_other);
        _other.isAbstract = this.isAbstract;
    }

    @Override
    public<_B >DataTypeAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataTypeAttributes.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public DataTypeAttributes.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataTypeAttributes.Builder<Void> builder() {
        return new DataTypeAttributes.Builder<Void>(null, null, false);
    }

    public static<_B >DataTypeAttributes.Builder<_B> copyOf(final NodeAttributes _other) {
        final DataTypeAttributes.Builder<_B> _newBuilder = new DataTypeAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DataTypeAttributes.Builder<_B> copyOf(final DataTypeAttributes _other) {
        final DataTypeAttributes.Builder<_B> _newBuilder = new DataTypeAttributes.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataTypeAttributes.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree isAbstractPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isAbstract"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isAbstractPropertyTree!= null):((isAbstractPropertyTree == null)||(!isAbstractPropertyTree.isLeaf())))) {
            _other.isAbstract = this.isAbstract;
        }
    }

    @Override
    public<_B >DataTypeAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataTypeAttributes.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public DataTypeAttributes.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataTypeAttributes.Builder<_B> copyOf(final NodeAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataTypeAttributes.Builder<_B> _newBuilder = new DataTypeAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DataTypeAttributes.Builder<_B> copyOf(final DataTypeAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataTypeAttributes.Builder<_B> _newBuilder = new DataTypeAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataTypeAttributes.Builder<Void> copyExcept(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataTypeAttributes.Builder<Void> copyExcept(final DataTypeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataTypeAttributes.Builder<Void> copyOnly(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DataTypeAttributes.Builder<Void> copyOnly(final DataTypeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NodeAttributes.Builder<_B>
        implements Buildable
    {

        private Boolean isAbstract;

        public Builder(final _B _parentBuilder, final DataTypeAttributes _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.isAbstract = _other.isAbstract;
            }
        }

        public Builder(final _B _parentBuilder, final DataTypeAttributes _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree isAbstractPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isAbstract"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isAbstractPropertyTree!= null):((isAbstractPropertyTree == null)||(!isAbstractPropertyTree.isLeaf())))) {
                    this.isAbstract = _other.isAbstract;
                }
            }
        }

        protected<_P extends DataTypeAttributes >_P init(final _P _product) {
            _product.isAbstract = this.isAbstract;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isAbstract" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param isAbstract
         *     Neuer Wert der Eigenschaft "isAbstract".
         */
        public DataTypeAttributes.Builder<_B> withIsAbstract(final Boolean isAbstract) {
            this.isAbstract = isAbstract;
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
        public DataTypeAttributes.Builder<_B> withSpecifiedAttributes(final Long specifiedAttributes) {
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
        public DataTypeAttributes.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
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
        public DataTypeAttributes.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
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
        public DataTypeAttributes.Builder<_B> withWriteMask(final Long writeMask) {
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
        public DataTypeAttributes.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            super.withUserWriteMask(userWriteMask);
            return this;
        }

        @Override
        public DataTypeAttributes build() {
            if (_storedValue == null) {
                return this.init(new DataTypeAttributes());
            } else {
                return ((DataTypeAttributes) _storedValue);
            }
        }

        public DataTypeAttributes.Builder<_B> copyOf(final DataTypeAttributes _other) {
            _other.copyTo(this);
            return this;
        }

        public DataTypeAttributes.Builder<_B> copyOf(final DataTypeAttributes.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataTypeAttributes.Selector<DataTypeAttributes.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataTypeAttributes.Select _root() {
            return new DataTypeAttributes.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NodeAttributes.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DataTypeAttributes.Selector<TRoot, TParent>> isAbstract = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.isAbstract!= null) {
                products.put("isAbstract", this.isAbstract.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataTypeAttributes.Selector<TRoot, TParent>> isAbstract() {
            return ((this.isAbstract == null)?this.isAbstract = new com.kscs.util.jaxb.Selector<TRoot, DataTypeAttributes.Selector<TRoot, TParent>>(this._root, this, "isAbstract"):this.isAbstract);
        }

    }

}
