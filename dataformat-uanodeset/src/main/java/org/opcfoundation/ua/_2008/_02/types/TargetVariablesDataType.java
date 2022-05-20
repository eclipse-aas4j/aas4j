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
 * <p>Java-Klasse für TargetVariablesDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TargetVariablesDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}SubscribedDataSetDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetVariables" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfFieldTargetDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetVariablesDataType", propOrder = {
    "targetVariables"
})
public class TargetVariablesDataType
    extends SubscribedDataSetDataType
{

    @XmlElementRef(name = "TargetVariables", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfFieldTargetDataType> targetVariables;

    /**
     * Ruft den Wert der targetVariables-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfFieldTargetDataType }{@code >}
     *     
     */
    public JAXBElement<ListOfFieldTargetDataType> getTargetVariables() {
        return targetVariables;
    }

    /**
     * Legt den Wert der targetVariables-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfFieldTargetDataType }{@code >}
     *     
     */
    public void setTargetVariables(JAXBElement<ListOfFieldTargetDataType> value) {
        this.targetVariables = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final TargetVariablesDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.targetVariables = this.targetVariables;
    }

    @Override
    public<_B >TargetVariablesDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new TargetVariablesDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public TargetVariablesDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static TargetVariablesDataType.Builder<Void> builder() {
        return new TargetVariablesDataType.Builder<Void>(null, null, false);
    }

    public static<_B >TargetVariablesDataType.Builder<_B> copyOf(final SubscribedDataSetDataType _other) {
        final TargetVariablesDataType.Builder<_B> _newBuilder = new TargetVariablesDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >TargetVariablesDataType.Builder<_B> copyOf(final TargetVariablesDataType _other) {
        final TargetVariablesDataType.Builder<_B> _newBuilder = new TargetVariablesDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final TargetVariablesDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree targetVariablesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetVariables"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetVariablesPropertyTree!= null):((targetVariablesPropertyTree == null)||(!targetVariablesPropertyTree.isLeaf())))) {
            _other.targetVariables = this.targetVariables;
        }
    }

    @Override
    public<_B >TargetVariablesDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new TargetVariablesDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public TargetVariablesDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >TargetVariablesDataType.Builder<_B> copyOf(final SubscribedDataSetDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TargetVariablesDataType.Builder<_B> _newBuilder = new TargetVariablesDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >TargetVariablesDataType.Builder<_B> copyOf(final TargetVariablesDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TargetVariablesDataType.Builder<_B> _newBuilder = new TargetVariablesDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static TargetVariablesDataType.Builder<Void> copyExcept(final SubscribedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static TargetVariablesDataType.Builder<Void> copyExcept(final TargetVariablesDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static TargetVariablesDataType.Builder<Void> copyOnly(final SubscribedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static TargetVariablesDataType.Builder<Void> copyOnly(final TargetVariablesDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends SubscribedDataSetDataType.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfFieldTargetDataType> targetVariables;

        public Builder(final _B _parentBuilder, final TargetVariablesDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.targetVariables = _other.targetVariables;
            }
        }

        public Builder(final _B _parentBuilder, final TargetVariablesDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree targetVariablesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetVariables"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetVariablesPropertyTree!= null):((targetVariablesPropertyTree == null)||(!targetVariablesPropertyTree.isLeaf())))) {
                    this.targetVariables = _other.targetVariables;
                }
            }
        }

        protected<_P extends TargetVariablesDataType >_P init(final _P _product) {
            _product.targetVariables = this.targetVariables;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetVariables" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param targetVariables
         *     Neuer Wert der Eigenschaft "targetVariables".
         */
        public TargetVariablesDataType.Builder<_B> withTargetVariables(final JAXBElement<ListOfFieldTargetDataType> targetVariables) {
            this.targetVariables = targetVariables;
            return this;
        }

        @Override
        public TargetVariablesDataType build() {
            if (_storedValue == null) {
                return this.init(new TargetVariablesDataType());
            } else {
                return ((TargetVariablesDataType) _storedValue);
            }
        }

        public TargetVariablesDataType.Builder<_B> copyOf(final TargetVariablesDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public TargetVariablesDataType.Builder<_B> copyOf(final TargetVariablesDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends TargetVariablesDataType.Selector<TargetVariablesDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static TargetVariablesDataType.Select _root() {
            return new TargetVariablesDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends SubscribedDataSetDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, TargetVariablesDataType.Selector<TRoot, TParent>> targetVariables = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.targetVariables!= null) {
                products.put("targetVariables", this.targetVariables.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, TargetVariablesDataType.Selector<TRoot, TParent>> targetVariables() {
            return ((this.targetVariables == null)?this.targetVariables = new com.kscs.util.jaxb.Selector<TRoot, TargetVariablesDataType.Selector<TRoot, TParent>>(this._root, this, "targetVariables"):this.targetVariables);
        }

    }

}
