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
 * <p>Java-Klasse für UpdateDataDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateDataDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryUpdateDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PerformInsertReplace" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PerformUpdateType" minOccurs="0"/&gt;
 *         &lt;element name="UpdateValues" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDataValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDataDetails", propOrder = {
    "performInsertReplace",
    "updateValues"
})
public class UpdateDataDetails
    extends HistoryUpdateDetails
{

    @XmlElement(name = "PerformInsertReplace")
    @XmlSchemaType(name = "string")
    protected PerformUpdateType performInsertReplace;
    @XmlElementRef(name = "UpdateValues", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDataValue> updateValues;

    /**
     * Ruft den Wert der performInsertReplace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PerformUpdateType }
     *     
     */
    public PerformUpdateType getPerformInsertReplace() {
        return performInsertReplace;
    }

    /**
     * Legt den Wert der performInsertReplace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformUpdateType }
     *     
     */
    public void setPerformInsertReplace(PerformUpdateType value) {
        this.performInsertReplace = value;
    }

    /**
     * Ruft den Wert der updateValues-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDataValue }{@code >}
     *     
     */
    public JAXBElement<ListOfDataValue> getUpdateValues() {
        return updateValues;
    }

    /**
     * Legt den Wert der updateValues-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDataValue }{@code >}
     *     
     */
    public void setUpdateValues(JAXBElement<ListOfDataValue> value) {
        this.updateValues = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UpdateDataDetails.Builder<_B> _other) {
        super.copyTo(_other);
        _other.performInsertReplace = this.performInsertReplace;
        _other.updateValues = this.updateValues;
    }

    @Override
    public<_B >UpdateDataDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UpdateDataDetails.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public UpdateDataDetails.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UpdateDataDetails.Builder<Void> builder() {
        return new UpdateDataDetails.Builder<Void>(null, null, false);
    }

    public static<_B >UpdateDataDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other) {
        final UpdateDataDetails.Builder<_B> _newBuilder = new UpdateDataDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >UpdateDataDetails.Builder<_B> copyOf(final UpdateDataDetails _other) {
        final UpdateDataDetails.Builder<_B> _newBuilder = new UpdateDataDetails.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UpdateDataDetails.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree performInsertReplacePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("performInsertReplace"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(performInsertReplacePropertyTree!= null):((performInsertReplacePropertyTree == null)||(!performInsertReplacePropertyTree.isLeaf())))) {
            _other.performInsertReplace = this.performInsertReplace;
        }
        final PropertyTree updateValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("updateValues"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(updateValuesPropertyTree!= null):((updateValuesPropertyTree == null)||(!updateValuesPropertyTree.isLeaf())))) {
            _other.updateValues = this.updateValues;
        }
    }

    @Override
    public<_B >UpdateDataDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UpdateDataDetails.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public UpdateDataDetails.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UpdateDataDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UpdateDataDetails.Builder<_B> _newBuilder = new UpdateDataDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >UpdateDataDetails.Builder<_B> copyOf(final UpdateDataDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UpdateDataDetails.Builder<_B> _newBuilder = new UpdateDataDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UpdateDataDetails.Builder<Void> copyExcept(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UpdateDataDetails.Builder<Void> copyExcept(final UpdateDataDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UpdateDataDetails.Builder<Void> copyOnly(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static UpdateDataDetails.Builder<Void> copyOnly(final UpdateDataDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends HistoryUpdateDetails.Builder<_B>
        implements Buildable
    {

        private PerformUpdateType performInsertReplace;
        private JAXBElement<ListOfDataValue> updateValues;

        public Builder(final _B _parentBuilder, final UpdateDataDetails _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.performInsertReplace = _other.performInsertReplace;
                this.updateValues = _other.updateValues;
            }
        }

        public Builder(final _B _parentBuilder, final UpdateDataDetails _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree performInsertReplacePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("performInsertReplace"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(performInsertReplacePropertyTree!= null):((performInsertReplacePropertyTree == null)||(!performInsertReplacePropertyTree.isLeaf())))) {
                    this.performInsertReplace = _other.performInsertReplace;
                }
                final PropertyTree updateValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("updateValues"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(updateValuesPropertyTree!= null):((updateValuesPropertyTree == null)||(!updateValuesPropertyTree.isLeaf())))) {
                    this.updateValues = _other.updateValues;
                }
            }
        }

        protected<_P extends UpdateDataDetails >_P init(final _P _product) {
            _product.performInsertReplace = this.performInsertReplace;
            _product.updateValues = this.updateValues;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "performInsertReplace" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param performInsertReplace
         *     Neuer Wert der Eigenschaft "performInsertReplace".
         */
        public UpdateDataDetails.Builder<_B> withPerformInsertReplace(final PerformUpdateType performInsertReplace) {
            this.performInsertReplace = performInsertReplace;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "updateValues" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param updateValues
         *     Neuer Wert der Eigenschaft "updateValues".
         */
        public UpdateDataDetails.Builder<_B> withUpdateValues(final JAXBElement<ListOfDataValue> updateValues) {
            this.updateValues = updateValues;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        @Override
        public UpdateDataDetails.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            super.withNodeId(nodeId);
            return this;
        }

        @Override
        public UpdateDataDetails build() {
            if (_storedValue == null) {
                return this.init(new UpdateDataDetails());
            } else {
                return ((UpdateDataDetails) _storedValue);
            }
        }

        public UpdateDataDetails.Builder<_B> copyOf(final UpdateDataDetails _other) {
            _other.copyTo(this);
            return this;
        }

        public UpdateDataDetails.Builder<_B> copyOf(final UpdateDataDetails.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UpdateDataDetails.Selector<UpdateDataDetails.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UpdateDataDetails.Select _root() {
            return new UpdateDataDetails.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends HistoryUpdateDetails.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UpdateDataDetails.Selector<TRoot, TParent>> performInsertReplace = null;
        private com.kscs.util.jaxb.Selector<TRoot, UpdateDataDetails.Selector<TRoot, TParent>> updateValues = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.performInsertReplace!= null) {
                products.put("performInsertReplace", this.performInsertReplace.init());
            }
            if (this.updateValues!= null) {
                products.put("updateValues", this.updateValues.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UpdateDataDetails.Selector<TRoot, TParent>> performInsertReplace() {
            return ((this.performInsertReplace == null)?this.performInsertReplace = new com.kscs.util.jaxb.Selector<TRoot, UpdateDataDetails.Selector<TRoot, TParent>>(this._root, this, "performInsertReplace"):this.performInsertReplace);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UpdateDataDetails.Selector<TRoot, TParent>> updateValues() {
            return ((this.updateValues == null)?this.updateValues = new com.kscs.util.jaxb.Selector<TRoot, UpdateDataDetails.Selector<TRoot, TParent>>(this._root, this, "updateValues"):this.updateValues);
        }

    }

}
