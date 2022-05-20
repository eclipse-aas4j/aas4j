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
 * <p>Java-Klasse für PublishedDataItemsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublishedDataItemsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}PublishedDataSetSourceDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublishedData" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfPublishedVariableDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishedDataItemsDataType", propOrder = {
    "publishedData"
})
public class PublishedDataItemsDataType
    extends PublishedDataSetSourceDataType
{

    @XmlElementRef(name = "PublishedData", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfPublishedVariableDataType> publishedData;

    /**
     * Ruft den Wert der publishedData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfPublishedVariableDataType }{@code >}
     *     
     */
    public JAXBElement<ListOfPublishedVariableDataType> getPublishedData() {
        return publishedData;
    }

    /**
     * Legt den Wert der publishedData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfPublishedVariableDataType }{@code >}
     *     
     */
    public void setPublishedData(JAXBElement<ListOfPublishedVariableDataType> value) {
        this.publishedData = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final PublishedDataItemsDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.publishedData = this.publishedData;
    }

    @Override
    public<_B >PublishedDataItemsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new PublishedDataItemsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public PublishedDataItemsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static PublishedDataItemsDataType.Builder<Void> builder() {
        return new PublishedDataItemsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >PublishedDataItemsDataType.Builder<_B> copyOf(final PublishedDataSetSourceDataType _other) {
        final PublishedDataItemsDataType.Builder<_B> _newBuilder = new PublishedDataItemsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >PublishedDataItemsDataType.Builder<_B> copyOf(final PublishedDataItemsDataType _other) {
        final PublishedDataItemsDataType.Builder<_B> _newBuilder = new PublishedDataItemsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final PublishedDataItemsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree publishedDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataPropertyTree!= null):((publishedDataPropertyTree == null)||(!publishedDataPropertyTree.isLeaf())))) {
            _other.publishedData = this.publishedData;
        }
    }

    @Override
    public<_B >PublishedDataItemsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new PublishedDataItemsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public PublishedDataItemsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >PublishedDataItemsDataType.Builder<_B> copyOf(final PublishedDataSetSourceDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PublishedDataItemsDataType.Builder<_B> _newBuilder = new PublishedDataItemsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >PublishedDataItemsDataType.Builder<_B> copyOf(final PublishedDataItemsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PublishedDataItemsDataType.Builder<_B> _newBuilder = new PublishedDataItemsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static PublishedDataItemsDataType.Builder<Void> copyExcept(final PublishedDataSetSourceDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PublishedDataItemsDataType.Builder<Void> copyExcept(final PublishedDataItemsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static PublishedDataItemsDataType.Builder<Void> copyOnly(final PublishedDataSetSourceDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static PublishedDataItemsDataType.Builder<Void> copyOnly(final PublishedDataItemsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends PublishedDataSetSourceDataType.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfPublishedVariableDataType> publishedData;

        public Builder(final _B _parentBuilder, final PublishedDataItemsDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.publishedData = _other.publishedData;
            }
        }

        public Builder(final _B _parentBuilder, final PublishedDataItemsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree publishedDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedData"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataPropertyTree!= null):((publishedDataPropertyTree == null)||(!publishedDataPropertyTree.isLeaf())))) {
                    this.publishedData = _other.publishedData;
                }
            }
        }

        protected<_P extends PublishedDataItemsDataType >_P init(final _P _product) {
            _product.publishedData = this.publishedData;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedData" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param publishedData
         *     Neuer Wert der Eigenschaft "publishedData".
         */
        public PublishedDataItemsDataType.Builder<_B> withPublishedData(final JAXBElement<ListOfPublishedVariableDataType> publishedData) {
            this.publishedData = publishedData;
            return this;
        }

        @Override
        public PublishedDataItemsDataType build() {
            if (_storedValue == null) {
                return this.init(new PublishedDataItemsDataType());
            } else {
                return ((PublishedDataItemsDataType) _storedValue);
            }
        }

        public PublishedDataItemsDataType.Builder<_B> copyOf(final PublishedDataItemsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public PublishedDataItemsDataType.Builder<_B> copyOf(final PublishedDataItemsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends PublishedDataItemsDataType.Selector<PublishedDataItemsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static PublishedDataItemsDataType.Select _root() {
            return new PublishedDataItemsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends PublishedDataSetSourceDataType.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, PublishedDataItemsDataType.Selector<TRoot, TParent>> publishedData = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.publishedData!= null) {
                products.put("publishedData", this.publishedData.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, PublishedDataItemsDataType.Selector<TRoot, TParent>> publishedData() {
            return ((this.publishedData == null)?this.publishedData = new com.kscs.util.jaxb.Selector<TRoot, PublishedDataItemsDataType.Selector<TRoot, TParent>>(this._root, this, "publishedData"):this.publishedData);
        }

    }

}
