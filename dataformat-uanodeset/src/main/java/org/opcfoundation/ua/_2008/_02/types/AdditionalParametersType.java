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
 * <p>Java-Klasse für AdditionalParametersType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AdditionalParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfKeyValuePair" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalParametersType", propOrder = {
    "parameters"
})
public class AdditionalParametersType {

    @XmlElementRef(name = "Parameters", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfKeyValuePair> parameters;

    /**
     * Ruft den Wert der parameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public JAXBElement<ListOfKeyValuePair> getParameters() {
        return parameters;
    }

    /**
     * Legt den Wert der parameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public void setParameters(JAXBElement<ListOfKeyValuePair> value) {
        this.parameters = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final AdditionalParametersType.Builder<_B> _other) {
        _other.parameters = this.parameters;
    }

    public<_B >AdditionalParametersType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new AdditionalParametersType.Builder<_B>(_parentBuilder, this, true);
    }

    public AdditionalParametersType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static AdditionalParametersType.Builder<Void> builder() {
        return new AdditionalParametersType.Builder<Void>(null, null, false);
    }

    public static<_B >AdditionalParametersType.Builder<_B> copyOf(final AdditionalParametersType _other) {
        final AdditionalParametersType.Builder<_B> _newBuilder = new AdditionalParametersType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final AdditionalParametersType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree parametersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parameters"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parametersPropertyTree!= null):((parametersPropertyTree == null)||(!parametersPropertyTree.isLeaf())))) {
            _other.parameters = this.parameters;
        }
    }

    public<_B >AdditionalParametersType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new AdditionalParametersType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public AdditionalParametersType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >AdditionalParametersType.Builder<_B> copyOf(final AdditionalParametersType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final AdditionalParametersType.Builder<_B> _newBuilder = new AdditionalParametersType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static AdditionalParametersType.Builder<Void> copyExcept(final AdditionalParametersType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static AdditionalParametersType.Builder<Void> copyOnly(final AdditionalParametersType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final AdditionalParametersType _storedValue;
        private JAXBElement<ListOfKeyValuePair> parameters;

        public Builder(final _B _parentBuilder, final AdditionalParametersType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.parameters = _other.parameters;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final AdditionalParametersType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree parametersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("parameters"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(parametersPropertyTree!= null):((parametersPropertyTree == null)||(!parametersPropertyTree.isLeaf())))) {
                        this.parameters = _other.parameters;
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

        protected<_P extends AdditionalParametersType >_P init(final _P _product) {
            _product.parameters = this.parameters;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "parameters" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param parameters
         *     Neuer Wert der Eigenschaft "parameters".
         */
        public AdditionalParametersType.Builder<_B> withParameters(final JAXBElement<ListOfKeyValuePair> parameters) {
            this.parameters = parameters;
            return this;
        }

        @Override
        public AdditionalParametersType build() {
            if (_storedValue == null) {
                return this.init(new AdditionalParametersType());
            } else {
                return ((AdditionalParametersType) _storedValue);
            }
        }

        public AdditionalParametersType.Builder<_B> copyOf(final AdditionalParametersType _other) {
            _other.copyTo(this);
            return this;
        }

        public AdditionalParametersType.Builder<_B> copyOf(final AdditionalParametersType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends AdditionalParametersType.Selector<AdditionalParametersType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static AdditionalParametersType.Select _root() {
            return new AdditionalParametersType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, AdditionalParametersType.Selector<TRoot, TParent>> parameters = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.parameters!= null) {
                products.put("parameters", this.parameters.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, AdditionalParametersType.Selector<TRoot, TParent>> parameters() {
            return ((this.parameters == null)?this.parameters = new com.kscs.util.jaxb.Selector<TRoot, AdditionalParametersType.Selector<TRoot, TParent>>(this._root, this, "parameters"):this.parameters);
        }

    }

}
