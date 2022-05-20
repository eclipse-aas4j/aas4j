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
 * <p>Java-Klasse für HistoryData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataValues" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDataValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryData", propOrder = {
    "dataValues"
})
@XmlSeeAlso({
    HistoryModifiedData.class
})
public class HistoryData {

    @XmlElementRef(name = "DataValues", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDataValue> dataValues;

    /**
     * Ruft den Wert der dataValues-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDataValue }{@code >}
     *     
     */
    public JAXBElement<ListOfDataValue> getDataValues() {
        return dataValues;
    }

    /**
     * Legt den Wert der dataValues-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDataValue }{@code >}
     *     
     */
    public void setDataValues(JAXBElement<ListOfDataValue> value) {
        this.dataValues = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HistoryData.Builder<_B> _other) {
        _other.dataValues = this.dataValues;
    }

    public<_B >HistoryData.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryData.Builder<_B>(_parentBuilder, this, true);
    }

    public HistoryData.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryData.Builder<Void> builder() {
        return new HistoryData.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryData.Builder<_B> copyOf(final HistoryData _other) {
        final HistoryData.Builder<_B> _newBuilder = new HistoryData.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryData.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree dataValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataValues"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataValuesPropertyTree!= null):((dataValuesPropertyTree == null)||(!dataValuesPropertyTree.isLeaf())))) {
            _other.dataValues = this.dataValues;
        }
    }

    public<_B >HistoryData.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryData.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HistoryData.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryData.Builder<_B> copyOf(final HistoryData _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryData.Builder<_B> _newBuilder = new HistoryData.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryData.Builder<Void> copyExcept(final HistoryData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryData.Builder<Void> copyOnly(final HistoryData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final HistoryData _storedValue;
        private JAXBElement<ListOfDataValue> dataValues;

        public Builder(final _B _parentBuilder, final HistoryData _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.dataValues = _other.dataValues;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryData _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree dataValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataValues"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataValuesPropertyTree!= null):((dataValuesPropertyTree == null)||(!dataValuesPropertyTree.isLeaf())))) {
                        this.dataValues = _other.dataValues;
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

        protected<_P extends HistoryData >_P init(final _P _product) {
            _product.dataValues = this.dataValues;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataValues" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dataValues
         *     Neuer Wert der Eigenschaft "dataValues".
         */
        public HistoryData.Builder<_B> withDataValues(final JAXBElement<ListOfDataValue> dataValues) {
            this.dataValues = dataValues;
            return this;
        }

        @Override
        public HistoryData build() {
            if (_storedValue == null) {
                return this.init(new HistoryData());
            } else {
                return ((HistoryData) _storedValue);
            }
        }

        public HistoryData.Builder<_B> copyOf(final HistoryData _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryData.Builder<_B> copyOf(final HistoryData.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryData.Selector<HistoryData.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryData.Select _root() {
            return new HistoryData.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, HistoryData.Selector<TRoot, TParent>> dataValues = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.dataValues!= null) {
                products.put("dataValues", this.dataValues.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryData.Selector<TRoot, TParent>> dataValues() {
            return ((this.dataValues == null)?this.dataValues = new com.kscs.util.jaxb.Selector<TRoot, HistoryData.Selector<TRoot, TParent>>(this._root, this, "dataValues"):this.dataValues);
        }

    }

}
